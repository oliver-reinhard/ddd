package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SDeductionRule
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SFuseRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SNamedElementDeductionRule
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SimFactory
import com.mimacom.ddd.sm.sim.SimUtil
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext.UnsupportedDomainTypeException
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SimDerivedStateComputer implements IDerivedStateComputer {
	
	@Inject extension SimUtil
	
	static Logger LOGGER = Logger.getLogger(SimDerivedStateComputer);
	static val smsFactory = SimFactory.eINSTANCE
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!preLinkingPhase) {
			// make sure we start with fresh type maps:
			val context = new TransformationContext(resource)
			
			val candidates = resource.allContents.filter(SType).filter[nature == DEDUCTION_RULE]
			while (candidates.hasNext) {
				var type = candidates.next
					type.processType(type.deductionRule, context)
			}
		}
	}
	
	def dispatch void processType(SEnumeration sEnum, SGrabRule rule, TransformationContext context) {
		val dEnum = rule.source as DEnumeration
		sEnum.name = if (rule.renameTo !== null) rule.renameTo else dEnum.name
		
		val implicitlyGrabbedLiteralsCandidates = Lists.newArrayList
		if (sEnum.literals.empty || sEnum.literals.exists[deductionRule instanceof SDitchRule]) {
			implicitlyGrabbedLiteralsCandidates.addAll(dEnum.literals)
			for (sLiteral : sEnum.literals.filter[deductionRule instanceof SDitchRule]) {
				implicitlyGrabbedLiteralsCandidates.remove((sLiteral.deductionRule as SNamedElementDeductionRule).source)
			}
		} else {
			for (sLiteral : sEnum.literals.filter[nature == DEDUCTION_RULE]) {
				// remove literals from list for which there is an explicit rule:
				implicitlyGrabbedLiteralsCandidates.remove((sLiteral.deductionRule as SNamedElementDeductionRule).source)
				val literalRule = sLiteral.deductionRule
				if (literalRule instanceof SGrabRule) {
					// add explicit grab:
					sEnum.addSyntheticLiteral(if (literalRule.renameTo !== null) literalRule.renameTo else literalRule.source.name)
				}
			}
		}
		// create synthetic SLiterals
		for (dLiteral : implicitlyGrabbedLiteralsCandidates) {
			sEnum.addSyntheticLiteral(dLiteral.name)
		}
	}
	
	def void addSyntheticLiteral(SEnumeration sEnum, String name) {
		val sLiteral = smsFactory.createSLiteral
		sLiteral.name = name
		sLiteral.synthetic = true
		sEnum.literals.add(sLiteral)
	}
	
	
	def dispatch void processType(SComplexType sType, SGrabRule rule, TransformationContext context) {
		val dType = rule.source
		sType.name = if (rule.renameTo !== null) rule.renameTo else dType.name
		
		val implicitlyGrabbedFeaturesCandidates = Lists.newArrayList
		if (sType.features.empty || sType.features.exists[deductionRule instanceof SDitchRule]) {
			val source =  (sType.deductionRule as SNamedElementDeductionRule).source
			implicitlyGrabbedFeaturesCandidates.addAll((source as DComplexType).allFeatures)
			for (sFeature : sType.features.filter[deductionRule instanceof SDitchRule]) {
				implicitlyGrabbedFeaturesCandidates.remove((sFeature.deductionRule as SNamedElementDeductionRule).source)
			}
		} else {
			for (sFeature : sType.features.filter[nature == DEDUCTION_RULE]) {
				// remove features from list for which there is an explicit rule:
				implicitlyGrabbedFeaturesCandidates.remove((sFeature.deductionRule as SNamedElementDeductionRule).source)
				// process features with explicit rules:
				processFeature(sFeature, sFeature.deductionRule, context)
			}
		}
		
		for (dFeature : implicitlyGrabbedFeaturesCandidates) {
			try {
				addSyntheticFeature(sType, dFeature.name, dFeature, context)
			} catch (UnsupportedDomainTypeException ex) {
				LOGGER.error(dFeature, ex)
			}
		}
	}
	
	def dispatch void processType(SComplexType type, SMorphRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch void processType(SComplexType type, SFuseRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch void processType(SType type, SDeductionRule rule, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	def SFeature addSyntheticFeature(SComplexType sType, String name, DFeature dFeature, TransformationContext context) throws UnsupportedDomainTypeException {
			val sFeature = switch dFeature {
				DAttribute: smsFactory.createSAttribute
				DQuery: smsFactory.createSQuery
				DAssociation: smsFactory.createSAssociation
			}
			sFeature.name = dFeature.name
			val dFeatureType = dFeature.type
			if (dFeatureType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			sFeature.type = context.getSType(dFeatureType)
			if (dFeature.multiplicity !== null) {
				sFeature.multiplicity = smsFactory.createSMultiplicity
				sFeature.multiplicity.minOccurs = dFeature.multiplicity.minOccurs
				sFeature.multiplicity.maxOccurs = dFeature.multiplicity.maxOccurs
			}
			sFeature.synthetic = true
			sType.features.add(sFeature)
			return sFeature
	}
	
	def dispatch SFeature processFeature(SFeature sFeature, SGrabRule rule, TransformationContext context) {
		val sComplexType = sFeature.eContainer as SComplexType
		val dFeature = rule.source as DFeature
		try {
			return sComplexType.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else dFeature.name, dFeature, context)
		} catch (UnsupportedDomainTypeException ex) {
			LOGGER.error(dFeature, ex)
			return null
		}
	}
	
	def dispatch SFeature processFeature(SFeature sFeature, SMorphRule rule, TransformationContext context) {
		val syntheticFeature = processFeature(sFeature, rule as SGrabRule, context)
		if (rule.retypeTo !== null) {
			syntheticFeature.type = rule.retypeTo
		}
		if (rule.remultiplyTo !== null) {
			syntheticFeature.multiplicity = smsFactory.createSMultiplicity
			syntheticFeature.multiplicity.minOccurs = rule.remultiplyTo.minOccurs
			syntheticFeature.multiplicity.maxOccurs = rule.remultiplyTo.maxOccurs
		}
		return syntheticFeature
	}
	
	def dispatch SFeature processFeature(SFeature sFeature, SDitchRule rule, TransformationContext context) {
		// do nothing: has been taken care of by complex type
	}
	
	def dispatch SFeature processFeature(SFeature sFeature, SDeductionRule rule, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	override discardDerivedState(DerivedStateAwareResource resource) {
			// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
			val syntheticElements = resource.allContents.filter(SDeducibleElement).filter[synthetic !== null && synthetic]
			val list = Lists.newArrayList
			while(syntheticElements.hasNext) list.add(syntheticElements.next)
			for(e : list) {
				EcoreUtil.remove(e)
			}
	}
}