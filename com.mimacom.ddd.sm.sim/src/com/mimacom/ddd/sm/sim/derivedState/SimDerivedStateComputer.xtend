package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeducibleElement
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import com.mimacom.ddd.sm.sim.STypeDeduction
import com.mimacom.ddd.sm.sim.SimFactory
import java.util.Collections
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class SimDerivedStateComputer implements IDerivedStateComputer {

	@Inject extension SAggregateDeductionRuleProcessor
	@Inject extension STypeDeductionRuleProcessor
	@Inject extension SFeatureDeductionRuleProcessor

	static val SIM = SimFactory.eINSTANCE
	static val LOGGER = Logger.getLogger(SimDerivedStateComputer);

	var derivedStateInstalled = false

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created")
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! resource.parseResult.hasSyntaxErrors) {
			val namespace = resource.allContents.head as DNamespace
			val model = namespace.model as SInformationModel
			if (model !== null) {
				if (preLinkingPhase && model.kind !== SInformationModelKind.BASE) {
					LOGGER.debug("Derive pre-linking state SKIPPED for " + resource.URI)
				} else {
					derivedStateInstalled = true
					LOGGER.debug("Derive state for " + resource.URI)
					model.indexingHelper = SIM.createSTypeMapping
					model.process
					LOGGER.debug("Derive state END for " + resource.URI)
				}
			}
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		if (derivedStateInstalled) {
			try {
				LOGGER.debug("Discard state for "+ resource?.URI)
				val namespace = resource.allContents.head as DNamespace
				val model = namespace.model as SInformationModel
				if (model !== null) {
					model.indexingHelper = null
				}
				// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
				val syntheticElements = resource.allContents.filter(IDeducibleElement).filter[synthetic]
				val list = Lists.newArrayList
				while (syntheticElements.hasNext)
					list.add(syntheticElements.next)
				for (e : list) {
					EcoreUtil.remove(e)
				}

			} finally {
				derivedStateInstalled = false
			}
		}
	}
	
	def void process(SInformationModel model) {
		// First: process the types defined by the model:
		val typeDeductionDefinitions = model.types.filter(STypeDeduction)?.toList // cannot sort Iterable 
		if (! typeDeductionDefinitions.empty) {
			Collections.sort(typeDeductionDefinitions, new TypeSorter)
			val complexSyntheticTypes = Lists.newArrayList
			for (definition : typeDeductionDefinitions) {
				val rule = definition.deductionRule
				val source = rule.source
				if (source instanceof DType) {
					val syntheticType = model.processTypeDeduction(definition, rule)
					if (definition instanceof SComplexTypeDeduction) {
						complexSyntheticTypes.add(
							new SyntheticFeatureContainerDescriptor(syntheticType as DComplexType, definition,
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
			aggregate.processAggregateTypes(model, syntheticComplexTypesAcceptor)
		}

		// Third: add the features to the new synthetic types:
		for (syntheticComplexTypesDescriptor : syntheticComplexTypesAcceptor) {
			syntheticComplexTypesDescriptor.addSyntheticFeatures
		}

		// Fourth: explicit queries (= queries added without rule):
		for (aggregate : originalAggregates) {
			aggregate.processAggregateQueries(model)
		}
	}
}
