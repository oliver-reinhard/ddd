package com.mimacom.ddd.sm.sim.derivedState

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.IFeatureContainer
import com.mimacom.ddd.dm.base.ITypeContainer
import com.mimacom.ddd.sm.sim.SAggregateDeduction
import com.mimacom.ddd.sm.sim.SGrabAggregateRule
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import java.util.List

class SAggregateDeductionRuleProcessor {

	@Inject extension SyntheticModelElementsFactory
	@Inject extension STypeDeductionRuleProcessor
	@Inject extension SFeatureDeductionRuleProcessor

	def void processAggregateTypes(DAggregate dAggregate, SInformationModel model, 
		List<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor, TransformationContext context) {
		var ITypeContainer syntheticTypesContainer = if (model.kind == SInformationModelKind.CORE) dAggregate else model

		if (dAggregate instanceof SAggregateDeduction) {
			val definition = dAggregate
			val rule = definition.deductionRule
			if (rule instanceof SGrabAggregateRule) {
				var source = rule.source
				if (source instanceof DAggregate) {
					if (model.kind == SInformationModelKind.CORE) {
						val name = rule.renameTo !== null ? rule.renameTo : source.name
						syntheticTypesContainer = model.addSyntheticAggregate(name, definition, context)
					}
					// Add types but not features of complex types:
					syntheticTypesContainer.addImplicitSyntheticTypes(definition, source, syntheticComplexTypesAcceptor, context)
				}
			}
		}

		syntheticTypesContainer.addSyntheticTypes(dAggregate, syntheticComplexTypesAcceptor, context)
	}

	def void processAggregateQueries(DAggregate dAggregate, SInformationModel model, TransformationContext context) {
		if (dAggregate instanceof SAggregateDeduction) {
			val definition = dAggregate
			val rule = definition.deductionRule
			
			val syntheticAggregates = model.aggregates.filter[synthetic && deducedFrom == dAggregate]
			if (syntheticAggregates.size == 1) {
				val syntheticAggregate = syntheticAggregates.head
				
				// Process queries grabbed from domain aggregate:
				if (model.kind == SInformationModelKind.CORE) {
					val desc = new SyntheticFeatureContainerDescriptor(syntheticAggregate, definition, rule.source as IFeatureContainer)
					desc.addSyntheticFeatures(context) // = queries
				}
			}
		}
	}
}
