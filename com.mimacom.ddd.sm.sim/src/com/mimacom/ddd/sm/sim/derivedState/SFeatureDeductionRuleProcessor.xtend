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
	
	def  dispatch void processFeatureDeduction(IFeatureContainer container, SFeatureDeduction deductionDefinition, SGrabRule rule /*dispatch*/) {
		grabFeature(container, deductionDefinition, rule)
	}
	
	def  dispatch void processFeatureDeduction(IFeatureContainer container, SFeatureDeduction deductionDefinition, SMorphRule rule /*dispatch*/) {
		val syntheticFeature = grabFeature(container, deductionDefinition, rule)
		if (syntheticFeature !== null) {
			if (rule.retypeTo !== null) {
				syntheticFeature.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  dispatch void processFeatureDeduction(IFeatureContainer container, SFeatureDeduction deductionDefinition, SDitchRule rule /*dispatch*/) {
		// do nothing (has been taken care of by DComplexType
	}
	
	def  DFeature grabFeature(IFeatureContainer container, SFeatureDeduction deductionDefinition, SRenameRule rule) {
		val source = rule.source
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, deductionDefinition)
			
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
						syntheticQuery.addSyntheticQueryParameter(sourceParameter.name, sourceParameter, createImplicitElementCopyDeduction(deductionDefinition, sourceParameter))
					}
				}
				
				val parameterDeductionDefinitionsList = parameterDeductionDefinitions.toList  // cannot change iterable while iterating
				for (definition : parameterDeductionDefinitionsList) {
					syntheticQuery.processQueryParameterDeduction(definition, definition.deductionRule)
				}
		
				// add explicit parameters (= parameters added without rule):
				for (param : explicitParameters) {
					syntheticQuery.addSyntheticQueryParameterAsCopy(param)
				}
			}
			return syntheticFeature
		}
		return null
	}
	
	def void addSyntheticFeatures(SyntheticFeatureContainerDescriptor desc) {
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
				desc.syntheticType.addSyntheticFeature(sourceFeature.name, sourceFeature, createImplicitElementCopyDeduction(desc.deductionDefinition, sourceFeature))
			}
		}
		
		// add explicit features (added via rule):
		val featureDeductionDefinitionsList = featureDeductionDefinitions.toList  // cannot change iterable while iterating => create new list
		for (definition : featureDeductionDefinitionsList) {
			desc.syntheticType.processFeatureDeduction(definition, definition.deductionRule)
		}
		
		// add explicit features (= features added without rule):
		for (feature : explicitFeatures) {
				desc.syntheticType.addSyntheticFeatureAsCopy(feature)
		}
	}
	
	
	def  dispatch void processQueryParameterDeduction(DQuery container, SQueryParameterDeduction deductionDefinition, SGrabRule rule) {
		grabQueryParameter(container, deductionDefinition, rule)
	}
	
	def  dispatch void processQueryParameterDeduction(DQuery container, SQueryParameterDeduction deductionDefinition, SMorphRule rule) {
		val syntheticParameter = grabQueryParameter(container, deductionDefinition, rule)
		if (syntheticParameter !== null) {
			if (rule.retypeTo !== null) {
				syntheticParameter.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticParameter.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  DQueryParameter grabQueryParameter(DQuery container, SQueryParameterDeduction deductionDefinition, SRenameRule rule) {
		val source = rule.source
		if (source instanceof DQueryParameter) {
			val syntheticParameter = container.addSyntheticQueryParameter(if (rule.renameTo !== null) rule.renameTo else source.name, source, deductionDefinition)
			return syntheticParameter
		}
	}
	
	def  dispatch void processQueryParameterDeduction(SQueryDeduction container, SQueryParameterDeduction deductionDefinition, SDitchRule rule) {
		// do nothing (has been taken care of by SQuery)
	}
	
}