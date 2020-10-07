package com.mimacom.ddd.dm.base.transpose

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.base.ITypeContainer
import java.util.List

class TAggregateTranspositionRuleProcessor {

	@Inject extension SyntheticModelElementsFactory
	@Inject extension TTypeTranspositionRuleProcessor
	@Inject extension TFeatureTranspositionRuleProcessor

	def void transposeAggregateTypes(DAggregate aggregate, TInformationModel model, 
		List<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor) {
		var ITypeContainer syntheticTypesContainer = if (model.allowsIdentityTypes) aggregate else model

		if (aggregate instanceof TAggregateTransposition) {
			val recipe = aggregate
			val rule = recipe.getTranspositionRule
			if (rule instanceof TGrabAggregateRule) {
				var source = rule.getSource
				if (source instanceof DAggregate) {
					if (model.allowsIdentityTypes) {
						val name = rule.getRenameTo !== null ? rule.getRenameTo : source.name
						syntheticTypesContainer = model.addSyntheticAggregate(name, recipe)
					}
					// Add types (but not features!) of complex types:
					syntheticTypesContainer.addImplicitSyntheticTypes(recipe, source, syntheticComplexTypesAcceptor)
				}
			}
		}

		// add explicit types (added via rule):
		syntheticTypesContainer.addSyntheticTypes(aggregate, syntheticComplexTypesAcceptor)
		
		// add explicit types (= types added without rule):
		syntheticTypesContainer.addSyntheticTypesAsCopy(aggregate, syntheticComplexTypesAcceptor)
	}

	def void transposeAggregateQueries(DAggregate aggregate, TInformationModel model) {
		if (aggregate instanceof TAggregateTransposition) {
			val recipe = aggregate
			val rule = recipe.getTranspositionRule
			
			val syntheticAggregates = model.aggregates.filter[isSynthetic && getTransposedBy == aggregate]
			if (syntheticAggregates.size == 1) {
				val syntheticAggregate = syntheticAggregates.head
				
				// Process queries grabbed from domain :
				if (model.allowsIdentityTypes) {
					val desc = new SyntheticFeatureContainerDescriptor(syntheticAggregate, recipe, rule.getSource as IFeatureContainer)
					desc.addSyntheticFeatures // = queries
				}
			}
		}
	}
}
