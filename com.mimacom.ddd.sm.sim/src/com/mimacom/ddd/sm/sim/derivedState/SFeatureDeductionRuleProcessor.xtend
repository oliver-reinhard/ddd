package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SQueryParameter
import com.mimacom.ddd.sm.sim.SimUtil

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SFeatureDeductionRuleProcessor  {
	
	@Inject extension SimUtil
	@Inject extension SyntheticModelElementsFactory
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature featureWithRule, SGrabRule rule, TransformationContext context) {
		grabFeature(container, featureWithRule, rule, context)
	}
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature featureWithRule, SMorphRule rule, TransformationContext context) {
		val syntheticFeature = grabFeature(container, featureWithRule, rule, context)
		if (syntheticFeature !== null) {
			if (rule.retypeTo !== null) {
				syntheticFeature.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature featureWithRule, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SComplexType
	}
	
	def  SFeature grabFeature(SComplexType container, SFeature featureWithRule, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, featureWithRule, context)
			
			if (featureWithRule instanceof SQuery) {
				val syntheticQuery = syntheticFeature as SQuery
				val sParametersWithRule = featureWithRule.parameters.filter[nature == DEDUCTION_RULE]
				if (! sParametersWithRule.exists[deductionRule instanceof SGrabRule]) {
					// there are not explicit grabs, so implicitly grab all features without a rule:
					val implicitlyGrabbedDParameters = Lists.newArrayList((source as DQuery).parameters)
					val dParametersAffectedByRule = sParametersWithRule.filter[deductionRule.source instanceof DQueryParameter].map[deductionRule.source as DQueryParameter]
					implicitlyGrabbedDParameters.removeAll(dParametersAffectedByRule)
					// create synthetic SFeatures for implicit features:
					for (dParameter : implicitlyGrabbedDParameters) {
						syntheticQuery.addSyntheticQueryParameter(dParameter.name, dParameter, null, context)
					}
				}
				
				val sParametersWithRuleList = sParametersWithRule.toList  // cannot change iterable while iterating
				for (sParameter : sParametersWithRuleList) {
					syntheticQuery.processQueryParameterWithRule(sParameter, sParameter.deductionRule, context)
				}
			}
			return syntheticFeature
		}
		return null
	}
	
	def void addSyntheticFeatures(SyntheticComplexTypeDescriptor desc, TransformationContext context) {
		var Iterable<SFeature> sFeaturesWithRule = Lists.newArrayList
		var Iterable<SFeature> sFeaturesGenuine = Lists.newArrayList
		if (desc.typeWithRule !== null) {
			sFeaturesWithRule = desc.typeWithRule.features.filter[nature == DEDUCTION_RULE]
			sFeaturesGenuine = desc.typeWithRule.features.filter[nature == GENUINE]
		}
		if (! sFeaturesWithRule.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab all features without a rule:
			val implicitlyGrabbedDFeatures = Lists.newArrayList(desc.source.allFeatures)
			val dFeaturesAffectedByRule = sFeaturesWithRule.filter[deductionRule.source instanceof DFeature].map[deductionRule.source as DFeature]
			implicitlyGrabbedDFeatures.removeAll(dFeaturesAffectedByRule)
			// create synthetic SFeatures for implicit features:
			for (dFeature : implicitlyGrabbedDFeatures) {
				desc.syntheticType.addSyntheticFeature(dFeature.name, dFeature, null, context)
			}
		}
		
		// add explicit features (added via rule):
		val sFeaturesWithRuleList = sFeaturesWithRule.toList  // cannot change iterable while iterating => create new list
		for (sFeature : sFeaturesWithRuleList) {
			desc.syntheticType.processFeatureWithRule( sFeature, sFeature.deductionRule, context)
		}
		
		// add explicit features (without rule):
		for (sFeature : sFeaturesGenuine) {
				desc.syntheticType.addSyntheticFeatureAsCopy(sFeature, context)
		}
	}
	
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SGrabRule rule, TransformationContext context) {
		grabQueryParameter(container, sParameter, rule, context)
	}
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SMorphRule rule, TransformationContext context) {
		val syntheticParameter = grabQueryParameter(container, sParameter, rule, context)
		if (syntheticParameter !== null) {
			if (rule.retypeTo !== null) {
				syntheticParameter.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticParameter.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  SQueryParameter grabQueryParameter(SQuery container, SQueryParameter sParameter, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DQueryParameter) {
			val syntheticParameter = container.addSyntheticQueryParameter(if (rule.renameTo !== null) rule.renameTo else source.name, source, sParameter, context)
			return syntheticParameter
		}
	}
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SQuery)
	}
	
}