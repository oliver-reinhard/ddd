package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SDomainProxy
import com.mimacom.ddd.sm.sim.SGrabAggregateRule
import com.mimacom.ddd.sm.sim.SInformationModel
import java.util.Collections
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SimDerivedStateComputer implements IDerivedStateComputer {
	
	@Inject extension SyntheticModelElementsFactory
	@Inject extension STypeDeductionRuleProcessor
	@Inject extension SFeatureDeductionRuleProcessor
	
	@Inject TransformationContext context
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!preLinkingPhase) {
			context.init(resource)
			val model = resource.allContents.head as SInformationModel
			processInformationModel(model, context)
		}
	}
	
	override discardDerivedState(DerivedStateAwareResource resource) {
			// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
			val syntheticElements = resource.allContents.filter(SDeducibleElement).filter[synthetic]
			val list = Lists.newArrayList
			while(syntheticElements.hasNext) list.add(syntheticElements.next)
			for(e : list) {
				EcoreUtil.remove(e)
			}
	}
	
	def  void processInformationModel(SInformationModel model, TransformationContext context) {
		val sTypesWithRule = model.types.filter[nature == DEDUCTION_RULE]?.toList  // cannot sort iterable 
		if (sTypesWithRule !== null) {
			Collections.sort(sTypesWithRule, new STypeSorter)
			val complexSyntheticTypes = Lists.newArrayList
			for (type : sTypesWithRule) { 
				val rule = type.deductionRule
				val source = rule.source
				if (source instanceof DType) {
					val syntheticType = type.processTypeWithRule(rule, context) 
					if (syntheticType instanceof SComplexType) {
						complexSyntheticTypes.add(new SyntheticComplexTypeDescriptor(syntheticType, type as SComplexType, source as DComplexType))
					}
				}
			}
			for (desc : complexSyntheticTypes) {
				desc.addSyntheticFeatures(context)
			}
		}
		
		for (domainWithRule : model.domainProxies) {
			// TODO
		}
		
		val modelList = Lists.newArrayList(model.aggregates) // cannot add to list while iterating it
		for (aggregate : modelList) {
			model.processAggregate(aggregate, null, context)
		}
	}
	
	def  void processAggregate(SInformationModel model, SAggregate sAggregate, SDomainProxy elementWithRule, TransformationContext context) {
		var current = sAggregate
		val complexSyntheticTypes = Lists.newArrayList
		if (sAggregate.deductionRule instanceof SGrabAggregateRule) {
			var source = sAggregate.deductionRule.source
			if (source instanceof DEntityType) { // aggregates don't have a name and cannot be linked to
				source = source.eContainer
			}
			if (source instanceof DAggregate) {
				current = model.addSyntheticAggregate(source, sAggregate, context)
				current.addImplicitSyntheticTypes(sAggregate, source, complexSyntheticTypes, context) // adds types but not features of complex types
			}
		} 
			
		current.addSyntheticTypes(complexSyntheticTypes, context)
		
		for (desc : complexSyntheticTypes) {
			desc.addSyntheticFeatures(context)
		}
	}
	
}