package com.mimacom.ddd.sm.sms.derivedState

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.sm.sms.SComplexType
import com.mimacom.ddd.sm.sms.SDeducibleMemberElement
import com.mimacom.ddd.sm.sms.SDitchTransform
import com.mimacom.ddd.sm.sms.SFeature
import com.mimacom.ddd.sm.sms.SPrimitive
import com.mimacom.ddd.sm.sms.SSpoofTransform
import com.mimacom.ddd.sm.sms.STransform
import com.mimacom.ddd.sm.sms.SmsFactory
import com.mimacom.ddd.sm.sms.SmsUtil
import java.util.Map
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

import static com.mimacom.ddd.sm.sms.SElementNature.*
import org.eclipse.emf.ecore.util.EcoreUtil

class SmsDerivedStateComputer implements IDerivedStateComputer {
	
	@Inject extension SmsUtil
	
	static class UnsupportedDomainTypeException extends RuntimeException {
		new(DPrimitive type) {
			super("A system-model primitive type realizing the domain-model primitive type \"" + type.name + "\"  the has not been declared")
		}
	}
	
	static val smsFactory = SmsFactory.eINSTANCE
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!preLinkingPhase) {
			val Map<DPrimitive, SPrimitive> primitivesMap = buildTypeMap(resource)
			
			val candidates = resource.allContents.filter(SComplexType).filter[nature == DEDUCTION_RULE]
			while (candidates.hasNext) {
				var type = candidates.next
					type.process(type.deductionRule.transform, primitivesMap)
			}
		}
	}
	
	def Map<DPrimitive, SPrimitive> buildTypeMap(DerivedStateAwareResource resource) {
			val Map<DPrimitive, SPrimitive> typeMap = Maps.newHashMap()
			val contibutors = resource.allContents.filter(SPrimitive)
			while (contibutors.hasNext) {
				val p = contibutors.next
				if (p.realizes !== null) {
					typeMap.put(p.realizes, p)
				}
			}
			return typeMap
	}
	
	def dispatch void process(SComplexType type, SSpoofTransform transform, Map<DPrimitive, SPrimitive> primitivesMap) {
		type.name = type.deductionRule.source.name
		val dFeatures = Lists.newArrayList
		if (type.features.empty || type.features.exists[deductionRule?.transform instanceof SDitchTransform]) {
			dFeatures.addAll((type.deductionRule.source as DComplexType).allFeatures)
			for (sFeature : type.features.filter[deductionRule?.transform instanceof SDitchTransform]) {
				dFeatures.remove(sFeature.deductionRule.source)
			}
		} else {
			for (sFeature : type.features.filter[nature == DEDUCTION_RULE]) {
				dFeatures.remove(sFeature.deductionRule.source)
			}
		}
		for (dFeature : dFeatures) {
			var sFeature = switch dFeature {
				DAttribute: smsFactory.createSAttribute
				DQuery: smsFactory.createSQuery
				DAssociation: smsFactory.createSAssociation
			}
			sFeature.name = dFeature.name
			if (dFeature.type instanceof DPrimitive) {
				val sPrimitive = primitivesMap.get(dFeature.type)
				if (sPrimitive === null) {
					throw new UnsupportedDomainTypeException(dFeature.type as DPrimitive)
				}
				sFeature.type = sPrimitive
			}
			sFeature.synthetic = true
			type.features.add(sFeature)
		}
	}
	
	def dispatch void process(SComplexType type, SDitchTransform transform, Map<DPrimitive, SPrimitive> primitivesMap) {
		
	}
	
	def dispatch void process(SComplexType type, STransform transform, Map<DPrimitive, SPrimitive> primitivesMap) {
		// do nothing
	}
	
	override discardDerivedState(DerivedStateAwareResource resource) {
//			val syntheticElements = resource.allContents.filter(SDeducibleElement).filter[synthetic]
//		  TODO
			val syntheticElements = resource.allContents.filter(SDeducibleMemberElement).filter[synthetic !== null && synthetic]
			while(syntheticElements.hasNext) {
				val e = syntheticElements.next
				val container = e.eContainer
				switch e {
					SFeature: (container as SComplexType).features.remove(e)
				}
			}
//			// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
//			val syntheticElements = resource.allContents.filter(SDeducibleMemberElement).filter[synthetic !== null && synthetic]
//			val list = Lists.newArrayList
//			while(syntheticElements.hasNext) list.add(syntheticElements.next)
//			for(e : list) {
//				EcoreUtil.remove(e)
//			}
	}
}