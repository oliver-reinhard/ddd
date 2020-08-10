package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeducibleElement
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.STypeDeduction
import java.util.Collections
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class SimDerivedStateComputer implements IDerivedStateComputer {

	@Inject extension SAggregateDeductionRuleProcessor
	@Inject extension STypeDeductionRuleProcessor
	@Inject extension SFeatureDeductionRuleProcessor
	
	static final Logger LOGGER = Logger.getLogger(SimDerivedStateComputer);

	@Inject TransformationContext context

	var derivedStateInstalled = false
	
	new() {
//		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created")
	}
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!preLinkingPhase && ! resource.parseResult.hasSyntaxErrors) {
			val namespace = resource.allContents.head as DNamespace
			val model = namespace.model as SInformationModel
			if (model !== null) {
				LOGGER.debug("Init context for " + resource.URI + " (set: " + resource.resourceSet.hashCode + ")")
				context.init(model)
				LOGGER.debug("Derive model for " + resource.URI)
				derivedStateInstalled = true
				model.process
				LOGGER.debug("Derive model END for " + resource.URI)
			}
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		if (derivedStateInstalled) {
			try {
				LOGGER.debug("Discard context")
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
					val syntheticType = model.processTypeDeduction(definition, rule, context)
					if (definition instanceof SComplexTypeDeduction) {
						complexSyntheticTypes.add(
							new SyntheticFeatureContainerDescriptor(syntheticType as DComplexType, definition,
								source as DComplexType))
					}
				}
			}
			for (desc : complexSyntheticTypes) {
				desc.addSyntheticFeatures(context)
			}
		}

		// Second: process aggregates and their elements:
		val originalAggregates = Lists.newArrayList(model.aggregates) // cannot add to list while iterating it
		val syntheticComplexTypesAcceptor = Lists.newArrayList
		for (aggregate : originalAggregates) {
			aggregate.processAggregateTypes(model, syntheticComplexTypesAcceptor, context)
		}

		// Third: add the features to the new synthetic types:
		for (syntheticComplexTypesDescriptor : syntheticComplexTypesAcceptor) {
			syntheticComplexTypesDescriptor.addSyntheticFeatures(context)
		}

		// Fourth: explicit queries (= queries added without rule):
		for (aggregate : originalAggregates) {
			aggregate.processAggregateQueries(model, context)
		}

		// Fifth: process proxies:
		for (domainDeduction : model.domainProxies) {
			//
			// TODO
			//
		}
	}
}
