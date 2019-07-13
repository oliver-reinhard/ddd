package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeducibleElement
import com.mimacom.ddd.sm.sim.SAggregateDeduction
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction
import com.mimacom.ddd.sm.sim.SGrabAggregateRule
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.STypeDeduction
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

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
			val syntheticElements = resource.allContents.filter(IDeducibleElement).filter[synthetic]
			val list = Lists.newArrayList
			while(syntheticElements.hasNext) list.add(syntheticElements.next)
			for(e : list) {
				EcoreUtil.remove(e)
			}
	}
	
	def  void processInformationModel(SInformationModel model, TransformationContext context) {
		val typeDeductionDefinitions = model.types.filter(STypeDeduction)?.toList  // cannot sort iterable 
		if (typeDeductionDefinitions !== null) {
			Collections.sort(typeDeductionDefinitions, new TypeSorter)
			val complexSyntheticTypes = Lists.newArrayList
			for (definition : typeDeductionDefinitions) { 
				val rule = definition.deductionRule
				val source = rule.source
				if (source instanceof DType) {
					val syntheticType = model.processTypeDeduction(definition, rule, context) 
					if (definition instanceof SComplexTypeDeduction) {
						complexSyntheticTypes.add(new SyntheticComplexTypeDescriptor(syntheticType as DComplexType, definition, source as DComplexType))
					}
				}
			}
			for (desc : complexSyntheticTypes) {
				desc.addSyntheticFeatures(context)
			}
		}
		
		for (domainDeduction : model.domainProxies) {
			//
			// TODO
			//
		}
		
		val modelList = Lists.newArrayList(model.aggregates) // cannot add to list while iterating it
		for (aggregate : modelList) {
			model.processAggregate(aggregate, context)
		}
	}
	
	def  void processAggregate(SInformationModel model, DAggregate dAggregate, TransformationContext context) {
		var current = dAggregate
		val complexSyntheticTypesAcceptor = Lists.newArrayList
		if (current instanceof SAggregateDeduction) {
			val deductionDefinition = current
			if (deductionDefinition.deductionRule instanceof SGrabAggregateRule) {
				var source = deductionDefinition.deductionRule.source as EObject
				if (source instanceof DEntityType) { // aggregates don't have a name and cannot be linked to => source = root
					source = source.eContainer // => should be a DAggregate
				}
				if (source instanceof DAggregate) {
					current = model.addSyntheticAggregate(deductionDefinition, context)
					current.addImplicitSyntheticTypes(deductionDefinition, source, complexSyntheticTypesAcceptor, context) // adds types but not features of complex types
				}
			}
		}
			
		current.addSyntheticTypes(dAggregate, complexSyntheticTypesAcceptor, context)
		
		// Now add the features to the new synthetic types:
		for (desc : complexSyntheticTypesAcceptor) {
			desc.addSyntheticFeatures(context)
		}
	}
}