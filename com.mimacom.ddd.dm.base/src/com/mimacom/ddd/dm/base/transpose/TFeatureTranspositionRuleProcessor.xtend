package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.IFeatureContainer

class TFeatureTranspositionRuleProcessor {

	@Inject extension TypesUtil
	@Inject extension TSyntheticModelElementsFactory

	def dispatch void transposeFeature(IFeatureContainer container, TFeatureTransposition recipe, TGrabRule rule /*dispatch*/ ) {
		grabFeature(container, recipe, rule)
	}

	def dispatch void transposeFeature(IFeatureContainer container, TFeatureTransposition recipe, TMorphRule rule /*dispatch*/ ) {
		val syntheticFeature = grabFeature(container, recipe, rule)
		if (syntheticFeature !== null) {
			if (rule.getRetypeTo !== null) {
				syntheticFeature.type = rule.getRetypeTo
			}
			if (rule.getRemultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.getRemultiplyTo
			}
		}
	}

	def dispatch void transposeFeature(IFeatureContainer container, TFeatureTransposition recipe, TDitchRule rule /*dispatch*/ ) {
		// do nothing (has been taken care of by DComplexType
	}

	def DFeature grabFeature(IFeatureContainer container, TFeatureTransposition recipe, TRenameRule rule) {
		val source = rule.source
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, recipe)

			if (recipe instanceof TQueryTransposition) {
				val syntheticQuery = syntheticFeature as DQuery
				val parameterRecipes = recipe.parameters.filter(TQueryParameterTransposition)
				var explicitParameters = recipe.parameters.filter [
					! (it instanceof TQueryParameterTransposition || it instanceof ISyntheticElement)
				]
				if (! parameterRecipes.exists[rule instanceof TGrabRule]) {
					// there are no explicit grabs, so implicitly grab ALL SOURCE PARAMETERS for which there is NO EXPLICIT Transposition:
					val implicitlyGrabbedSourceParameters = Lists.newArrayList((source as DQuery).parameters.filter[it instanceof ITransposableElement])
					val sourceParametersWithTransposition = parameterRecipes.map[rule.source].filter (DQueryParameter)
					implicitlyGrabbedSourceParameters.removeAll(sourceParametersWithTransposition)
					// create synthetic SFeatures for implicit features:
					for (sourceParameter : implicitlyGrabbedSourceParameters) {
						syntheticQuery.addSyntheticQueryParameter(sourceParameter.name, sourceParameter,
							createImplicitTranspositionAsCopy(recipe, sourceParameter as ITransposableElement))
					}
				}

				val parameterRecipesList = parameterRecipes.toList // cannot change iterable while iterating
				for (r : parameterRecipesList) {
					syntheticQuery.transposeQueryParameter(r, r.rule)
				}

				// add explicit parameters (= parameters added without rule):
				for (p : explicitParameters) {
					syntheticQuery.addSyntheticQueryParameterAsCopy(p)
				}
			}
			return syntheticFeature
		}
		return null
	}

	def void addSyntheticFeatures(TSyntheticFeatureContainerDescriptor desc) {
		var Iterable<TFeatureTransposition> featureRecipes = Lists.newArrayList
		var Iterable<DFeature> explicitFeatures = Lists.newArrayList

		if (desc.recipe === null) {
			// the synthetic container is a COPY of the source:
			explicitFeatures = desc.source.features
		} else {
			if (desc.recipe instanceof IFeatureContainer) {
				val featureContainer = desc.recipe as IFeatureContainer
				featureRecipes = featureContainer.features.filter(TFeatureTransposition)
				explicitFeatures = featureContainer.features.filter [
					! (it instanceof TFeatureTransposition || it instanceof ISyntheticElement)
				]
			}
			if (! featureRecipes.exists[rule instanceof TGrabRule]) {
				// there are no explicit grabs, so implicitly grab ALL SOURCE FEATURES for which there is NO EXPLICIT Transposition:
				val implicitlyGrabbedSourceFeatures = Lists.newArrayList(desc.source.allFeatures.filter[it instanceof ITransposableElement])
				val sourceFeaturesWithTransposition = featureRecipes.map[rule.source].filter (DFeature)
				implicitlyGrabbedSourceFeatures.removeAll(sourceFeaturesWithTransposition)
				// create synthetic DFeatures for implicit features:
				for (sourceFeature : implicitlyGrabbedSourceFeatures) {
					desc.syntheticType.addSyntheticFeature(sourceFeature.name, sourceFeature,
						createImplicitTranspositionAsCopy(desc.recipe, sourceFeature as ITransposableElement))
				}
			}

			// add explicit features (added via rule):
			val featureRecipesList = featureRecipes.toList // cannot change iterable while iterating => create new list
			for (r : featureRecipesList) {
				desc.syntheticType.transposeFeature(r, r.rule)
			}
		}

		// add explicit features (= features added without rule):
		for (f : explicitFeatures) {
			desc.syntheticType.addSyntheticFeatureAsCopy(f)
		}
	}

	def dispatch void transposeQueryParameter(DQuery container, TQueryParameterTransposition recipe, TGrabRule rule) {
		grabQueryParameter(container, recipe, rule)
	}

	def dispatch void transposeQueryParameter(DQuery container, TQueryParameterTransposition recipe, TMorphRule rule) {
		val syntheticParameter = grabQueryParameter(container, recipe, rule)
		if (syntheticParameter !== null) {
			if (rule.getRetypeTo !== null) {
				syntheticParameter.type = rule.getRetypeTo
			}
			if (rule.getRemultiplyTo !== null) {
				syntheticParameter.multiplicity = rule.getRemultiplyTo
			}
		}
	}

	def dispatch void transposeQueryParameter(DQuery container, TQueryParameterTransposition recipe, TDitchRule rule) {
		// do nothing (has been taken care of)
	}

	def DQueryParameter grabQueryParameter(DQuery container, TQueryParameterTransposition recipe, TRenameRule rule) {
		val source = rule.source
		if (source instanceof DQueryParameter) {
			val syntheticParameter = container.addSyntheticQueryParameter(if (rule.getRenameTo !== null) rule.getRenameTo else source.name, source,
				recipe)
			return syntheticParameter
		}
	}

}
