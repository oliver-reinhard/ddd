package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.transpose.TDitchRule
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TGrabRule
import com.mimacom.ddd.dm.base.transpose.TMorphRule
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition
import com.mimacom.ddd.dm.base.transpose.TRenameRule
import com.mimacom.ddd.sm.sim.SimUtil

class SFeatureTranspositionRuleProcessor {

	@Inject extension SimUtil
	@Inject extension SyntheticModelElementsFactory

	def dispatch void processFeatureDeduction(IFeatureContainer container, TFeatureTransposition deductionDefinition,
		TGrabRule rule /*dispatch*/ ) {
		grabFeature(container, deductionDefinition, rule)
	}

	def dispatch void processFeatureDeduction(IFeatureContainer container, TFeatureTransposition deductionDefinition,
		TMorphRule rule /*dispatch*/ ) {
		val syntheticFeature = grabFeature(container, deductionDefinition, rule)
		if (syntheticFeature !== null) {
			if (rule.getRetypeTo !== null) {
				syntheticFeature.type = rule.getRetypeTo
			}
			if (rule.getRemultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.getRemultiplyTo
			}
		}
	}

	def dispatch void processFeatureDeduction(IFeatureContainer container, TFeatureTransposition deductionDefinition,
		TDitchRule rule /*dispatch*/ ) {
		// do nothing (has been taken care of by DComplexType
	}

	def DFeature grabFeature(IFeatureContainer container, TFeatureTransposition deductionDefinition, TRenameRule rule) {
		val source = rule.getSource
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(
				if (rule.getRenameTo !== null) rule.getRenameTo else source.name, source, deductionDefinition)

			if (deductionDefinition instanceof TQueryTransposition) {
				val syntheticQuery = syntheticFeature as DQuery
				val parameterDeductionDefinitions = deductionDefinition.parameters.filter(TQueryParameterTransposition)
				var explicitParameters = deductionDefinition.parameters.filter [
					! (it instanceof TQueryParameterTransposition || it.isSynthetic)
				]
				if (! parameterDeductionDefinitions.exists[deductionDefinition instanceof TGrabRule]) {
					// there are not explicit grabs, so implicitly grab all features without a rule:
					val implicitlyGrabbedSourceParameters = Lists.newArrayList((source as DQuery).parameters)
					val sourceParametersAffectedByRule = parameterDeductionDefinitions.filter [
						getTranspositionRule.getSource instanceof DQueryParameter
					].map[getTranspositionRule.getSource as DQueryParameter]
					implicitlyGrabbedSourceParameters.removeAll(sourceParametersAffectedByRule)
					// create synthetic SFeatures for implicit features:
					for (sourceParameter : implicitlyGrabbedSourceParameters) {
						syntheticQuery.addSyntheticQueryParameter(sourceParameter.name, sourceParameter,
							createImplicitElementCopyDeduction(deductionDefinition, sourceParameter))
					}
				}

				val parameterDeductionDefinitionsList = parameterDeductionDefinitions.toList // cannot change iterable while iterating
				for (definition : parameterDeductionDefinitionsList) {
					syntheticQuery.processQueryParameterDeduction(definition, definition.getTranspositionRule)
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
		var Iterable<TFeatureTransposition> featureDeductionDefinitions = Lists.newArrayList
		var Iterable<DFeature> explicitFeatures = Lists.newArrayList

		if (desc.deductionDefinition === null) {
			// the synthetic container is a COPY of the source:
			explicitFeatures = desc.source.features
		} else {
			if (desc.deductionDefinition instanceof IFeatureContainer) {
				val featureContainer = desc.deductionDefinition as IFeatureContainer
				featureDeductionDefinitions = featureContainer.features.filter(TFeatureTransposition)
				explicitFeatures = featureContainer.features.filter[! (it instanceof TFeatureTransposition || it.isSynthetic)]
			}
			if (! featureDeductionDefinitions.exists[getTranspositionRule instanceof TGrabRule]) {
				// there are no explicit grabs, so implicitly grab all features without a rule:
				val implicitlyGrabbedSourceFeatures = Lists.newArrayList(desc.source.allFeatures)
				val sourceFeaturesAffectedByRule = featureDeductionDefinitions.filter [
					getTranspositionRule.getSource instanceof DFeature
				].map[getTranspositionRule.getSource as DFeature]
				implicitlyGrabbedSourceFeatures.removeAll(sourceFeaturesAffectedByRule)
				// create synthetic DFeatures for implicit features:
				for (sourceFeature : implicitlyGrabbedSourceFeatures) {
					desc.syntheticType.addSyntheticFeature(sourceFeature.name, sourceFeature,
						createImplicitElementCopyDeduction(desc.deductionDefinition, sourceFeature))
				}
			}

			// add explicit features (added via rule):
			val featureDeductionDefinitionsList = featureDeductionDefinitions.toList // cannot change iterable while iterating => create new list
			for (definition : featureDeductionDefinitionsList) {
				desc.syntheticType.processFeatureDeduction(definition, definition.getTranspositionRule)
			}
		}

		// add explicit features (= features added without rule):
		for (feature : explicitFeatures) {
			desc.syntheticType.addSyntheticFeatureAsCopy(feature)
		}
	}

	def dispatch void processQueryParameterDeduction(DQuery container, TQueryParameterTransposition deductionDefinition,
		TGrabRule rule) {
		grabQueryParameter(container, deductionDefinition, rule)
	}

	def dispatch void processQueryParameterDeduction(DQuery container, TQueryParameterTransposition deductionDefinition,
		TMorphRule rule) {
		val syntheticParameter = grabQueryParameter(container, deductionDefinition, rule)
		if (syntheticParameter !== null) {
			if (rule.getRetypeTo !== null) {
				syntheticParameter.type = rule.getRetypeTo
			}
			if (rule.getRemultiplyTo !== null) {
				syntheticParameter.multiplicity = rule.getRemultiplyTo
			}
		}
	}

	def DQueryParameter grabQueryParameter(DQuery container, TQueryParameterTransposition deductionDefinition,
		TRenameRule rule) {
		val source = rule.getSource
		if (source instanceof DQueryParameter) {
			val syntheticParameter = container.addSyntheticQueryParameter(
				if (rule.getRenameTo !== null) rule.getRenameTo else source.name, source, deductionDefinition)
			return syntheticParameter
		}
	}

	def dispatch void processQueryParameterDeduction(TQueryTransposition container,
		TQueryParameterTransposition deductionDefinition, TDitchRule rule) {
		// do nothing (has been taken care of by SQuery)
	}

}
