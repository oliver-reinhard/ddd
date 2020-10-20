package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.base.DType
import java.util.Collections
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class TransposeAwareDerivedStateComputer implements IDerivedStateComputer {

	@Inject extension TAggregateTranspositionRuleProcessor
	@Inject extension TTypeTranspositionRuleProcessor
	@Inject extension TFeatureTranspositionRuleProcessor

	static val LOGGER = Logger.getLogger(TransposeAwareDerivedStateComputer);
	static val TRANSPOSE = TransposeFactory.eINSTANCE

	var derivedStateInstalled = false

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created")
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! resource.parseResult.hasSyntaxErrors) {
			val namespace = resource.allContents.head as DNamespace
			val model = namespace.model as TInformationModel
			if (model !== null) {
				doInstallDerivedState(resource, model)
			}
		}
	}
	
	protected def void doInstallDerivedState(DerivedStateAwareResource resource, TInformationModel model) {
		derivedStateInstalled = true
		LOGGER.debug("Derive state for " + resource.URI)
		model.indexingHelper = TRANSPOSE.createTTypeMapping
		model.transpose
		LOGGER.debug("Derive state END for " + resource.URI)
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		if (derivedStateInstalled) {
			try {
				LOGGER.debug("Discard state for " + resource?.URI)
				val namespace = resource.allContents.head as DNamespace
				val model = namespace.model as TInformationModel
				if (model !== null) {
					model.indexingHelper = null
				}
				resource.removeAllSyntheticElements

			} finally {
				derivedStateInstalled = false
			}
		}
	}

	protected def void removeAllSyntheticElements(DerivedStateAwareResource resource) {
		// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
		val syntheticElements = resource.allContents.filter(ISyntheticElement)
		val list = Lists.newArrayList
		while (syntheticElements.hasNext)
			list.add(syntheticElements.next)
		for (e : list) {
			EcoreUtil.remove(e)
		}
	}

	def void transpose(TInformationModel model) {
		// First: process the types defined by the model:
		val typeRecipes = model.types.filter(TTypeTransposition)?.toList // cannot sort Iterable 
		if (! typeRecipes.empty) {
			Collections.sort(typeRecipes, new TypeSorter)
			val complexSyntheticTypes = Lists.newArrayList
			for (r : typeRecipes) {
				val rule = r.getRule
				val source = rule.getSource
				if (source instanceof DType) {
					val syntheticType = model.transposeType(r, rule)
					if (r instanceof TComplexTypeTransposition) {
						complexSyntheticTypes.add(
							new SyntheticFeatureContainerDescriptor(syntheticType as DComplexType, r,
								source as DComplexType))
					}
				}
			}
			for (desc : complexSyntheticTypes) {
				desc.addSyntheticFeatures
			}
		}

		// Second: process aggregates and their elements:
		val originalAggregates = Lists.newArrayList(model.aggregates) // cannot add to list while iterating it
		val syntheticComplexTypesAcceptor = Lists.newArrayList
		for (aggregate : originalAggregates) {
			aggregate.transposeAggregateTypes(model, syntheticComplexTypesAcceptor)
		}

		// Third: add the features to the new synthetic types:
		for (syntheticComplexTypesDescriptor : syntheticComplexTypesAcceptor) {
			syntheticComplexTypesDescriptor.addSyntheticFeatures
		}

		// Fourth: explicit queries (= queries added without rule):
		for (aggregate : originalAggregates) {
			aggregate.transposeAggregateQueries(model)
		}
	}
}
