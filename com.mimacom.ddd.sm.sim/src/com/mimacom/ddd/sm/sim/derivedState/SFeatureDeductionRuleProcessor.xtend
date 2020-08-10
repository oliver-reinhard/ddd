package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.IFeatureContainer
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SFeatureDeduction
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SQueryDeduction
import com.mimacom.ddd.sm.sim.SQueryParameterDeduction
import com.mimacom.ddd.sm.sim.SRenameRule
import com.mimacom.ddd.sm.sim.SimUtil

class SFeatureDeductionRuleProcessor  {
	
	@Inject extension SimUtil
	@Inject extension SyntheticModelElementsFactory
	
	def  dispatch void processFeatureDeduction(IFeatureContainer container, SFeatureDeduction deductionDefinition, SGrabRule rule /*dispatch*/, TransformationContext context) {
		grabFeature(container, deductionDefinition, rule, context)
	}
	
	def  dispatch void processFeatureDeduction(IFeatureContainer container, SFeatureDeduction deductionDefinition, SMorphRule rule /*dispatch*/, TransformationContext context) {
		val syntheticFeature = grabFeature(container, deductionDefinition, rule, context)
		if (syntheticFeature !== null) {
			if (rule.retypeTo !== null) {
				syntheticFeature.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  dispatch void processFeatureDeduction(IFeatureContainer container, SFeatureDeduction deductionDefinition, SDitchRule rule /*dispatch*/, TransformationContext context) {
		// do nothing (has been taken care of by DComplexType
	}
	
	def  DFeature grabFeature(IFeatureContainer container, SFeatureDeduction deductionDefinition, SRenameRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, deductionDefinition, context)
			
			if (deductionDefinition instanceof SQueryDeduction) {
				val syntheticQuery = syntheticFeature as DQuery
				val parameterDeductionDefinitions = deductionDefinition.parameters.filter(SQueryParameterDeduction)
				var explicitParameters = deductionDefinition.parameters.filter[! (it instanceof SQueryParameterDeduction || it.synthetic)]
				if (! parameterDeductionDefinitions.exists[deductionDefinition instanceof SGrabRule]) {
					// there are not explicit grabs, so implicitly grab all features without a rule:
					val implicitlyGrabbedSourceParameters = Lists.newArrayList((source as DQuery).parameters)
					val sourceParametersAffectedByRule = parameterDeductionDefinitions.filter[deductionRule.source instanceof DQueryParameter].map[deductionRule.source as DQueryParameter]
					implicitlyGrabbedSourceParameters.removeAll(sourceParametersAffectedByRule)
					// create synthetic SFeatures for implicit features:
					for (sourceParameter : implicitlyGrabbedSourceParameters) {
						syntheticQuery.addSyntheticQueryParameter(sourceParameter.name, sourceParameter, createImplicitElementCopyDeduction(deductionDefinition, sourceParameter), context)
					}
				}
				
				val parameterDeductionDefinitionsList = parameterDeductionDefinitions.toList  // cannot change iterable while iterating
				for (definition : parameterDeductionDefinitionsList) {
					syntheticQuery.processQueryParameterDeduction(definition, definition.deductionRule, context)
				}
		
				// add explicit parameters (= parameters added without rule):
				for (param : explicitParameters) {
					syntheticQuery.addSyntheticQueryParameterAsCopy(param, context)
				}
			}
			return syntheticFeature
		}
		return null
	}
	
	def void addSyntheticFeatures(SyntheticFeatureContainerDescriptor desc, TransformationContext context) {
		var Iterable<SFeatureDeduction> featureDeductionDefinitions = Lists.newArrayList
		var Iterable<DFeature> explicitFeatures = Lists.newArrayList
		
		if (desc.deductionDefinition instanceof IFeatureContainer) {
			val featureContainer =  desc.deductionDefinition as IFeatureContainer
			featureDeductionDefinitions =featureContainer.features.filter(SFeatureDeduction)
			explicitFeatures = featureContainer.features.filter[! (it instanceof SFeatureDeduction || it.synthetic)]
		}
		if (! featureDeductionDefinitions.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab all features without a rule:
			val implicitlyGrabbedSourceFeatures = Lists.newArrayList(desc.source.allFeatures)
			val sourceFeaturesAffectedByRule = featureDeductionDefinitions.filter[deductionRule.source instanceof DFeature].map[deductionRule.source as DFeature]
			implicitlyGrabbedSourceFeatures.removeAll(sourceFeaturesAffectedByRule)
			// create synthetic DFeatures for implicit features:
			for (sourceFeature : implicitlyGrabbedSourceFeatures) {
				desc.syntheticType.addSyntheticFeature(sourceFeature.name, sourceFeature, createImplicitElementCopyDeduction(desc.deductionDefinition, sourceFeature), context)
			}
		}
		
		// add explicit features (added via rule):
		val featureDeductionDefinitionsList = featureDeductionDefinitions.toList  // cannot change iterable while iterating => create new list
		for (definition : featureDeductionDefinitionsList) {
			desc.syntheticType.processFeatureDeduction(definition, definition.deductionRule, context)
		}
		
		// add explicit features (= features added without rule):
		for (feature : explicitFeatures) {
				desc.syntheticType.addSyntheticFeatureAsCopy(feature, context)
		}
	}
	
	
	def  dispatch void processQueryParameterDeduction(DQuery container, SQueryParameterDeduction deductionDefinition, SGrabRule rule, TransformationContext context) {
		grabQueryParameter(container, deductionDefinition, rule, context)
	}
	
	def  dispatch void processQueryParameterDeduction(DQuery container, SQueryParameterDeduction deductionDefinition, SMorphRule rule, TransformationContext context) {
		val syntheticParameter = grabQueryParameter(container, deductionDefinition, rule, context)
		if (syntheticParameter !== null) {
			if (rule.retypeTo !== null) {
				syntheticParameter.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticParameter.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  DQueryParameter grabQueryParameter(DQuery container, SQueryParameterDeduction deductionDefinition, SRenameRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DQueryParameter) {
			val syntheticParameter = container.addSyntheticQueryParameter(if (rule.renameTo !== null) rule.renameTo else source.name, source, deductionDefinition, context)
			return syntheticParameter
		}
	}
	
	def  dispatch void processQueryParameterDeduction(SQueryDeduction container, SQueryParameterDeduction deductionDefinition, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SQuery)
	}
	
}