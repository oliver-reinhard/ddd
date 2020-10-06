package com.mimacom.ddd.sm.sim.derivedState

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.base.ITypeContainer
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import java.util.List

class SAggregateTranspositionRuleProcessor {

	@Inject extension SyntheticModelElementsFactory
	@Inject extension STypeTranspositionRuleProcessor
	@Inject extension SFeatureTranspositionRuleProcessor

	def void processAggregateTypes(DAggregate dAggregate, SInformationModel model, 
		List<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor) {
		var ITypeContainer syntheticTypesContainer = if (model.kind == SInformationModelKind.CORE) dAggregate else model

		if (dAggregate instanceof TAggregateTransposition) {
			val definition = dAggregate
			val rule = definition.getTranspositionRule
			if (rule instanceof TGrabAggregateRule) {
				var source = rule.getSource
				if (source instanceof DAggregate) {
					if (model.kind == SInformationModelKind.CORE) {
						val name = rule.getRenameTo !== null ? rule.getRenameTo : source.name
						syntheticTypesContainer = model.addSyntheticAggregate(name, definition)
					}
					// Add types (but not features!) of complex types:
					syntheticTypesContainer.addImplicitSyntheticTypes(definition, source, syntheticComplexTypesAcceptor)
				}
			}
		}

		// add explicit types (added via rule):
		syntheticTypesContainer.addSyntheticTypes(dAggregate, syntheticComplexTypesAcceptor)
		
		// add explicit types (= types added without rule):
		syntheticTypesContainer.addSyntheticTypesAsCopy(dAggregate, syntheticComplexTypesAcceptor)
	}

	def void processAggregateQueries(DAggregate dAggregate, SInformationModel model) {
		if (dAggregate instanceof TAggregateTransposition) {
			val definition = dAggregate
			val rule = definition.getTranspositionRule
			
			val syntheticAggregates = model.aggregates.filter[isSynthetic && getTransposedBy == dAggregate]
			if (syntheticAggregates.size == 1) {
				val syntheticAggregate = syntheticAggregates.head
				
				// Process queries grabbed from domain aggregate:
				if (model.kind == SInformationModelKind.CORE) {
					val desc = new SyntheticFeatureContainerDescriptor(syntheticAggregate, definition, rule.getSource as IFeatureContainer)
					desc.addSyntheticFeatures // = queries
				}
			}
		}
	}
}
