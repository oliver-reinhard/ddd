package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.ITransposition
import com.mimacom.ddd.dm.base.base.ITypeContainer
import com.mimacom.ddd.dm.base.base.TTranspositionRule
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TDitchRule
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
import com.mimacom.ddd.dm.base.transpose.TFuseRule
import com.mimacom.ddd.dm.base.transpose.TGrabRule
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition
import com.mimacom.ddd.dm.base.transpose.TMorphRule
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
import com.mimacom.ddd.dm.base.transpose.TRenameRule
import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject

class STypeTranspositionRuleProcessor  {
	
	@Inject extension SyntheticModelElementsFactory
	
	static val UNDEFINED = "UNDEFINED"
	
	protected def void addImplicitSyntheticTypes(ITypeContainer container, TAggregateTransposition deductionDefinition, DAggregate source, List<SyntheticFeatureContainerDescriptor> acceptor) {
		val typeDeductionDefinitions = deductionDefinition.types.filter(ITransposition)
		if (! typeDeductionDefinitions.exists[getTranspositionRule instanceof TGrabRule]) {
			// there are no explicit grabs, so implicitly grab ALL TYPES WITHOUT an EXPLICIT RULE:
			val implicitlyGrabbedSourceTypes = Lists.newArrayList(source.types)
			val sourceTypesAffectedByRule = typeDeductionDefinitions.filter[getTranspositionRule.getSource instanceof DType].map[getTranspositionRule.getSource as DType]
			implicitlyGrabbedSourceTypes.removeAll(sourceTypesAffectedByRule)
			
			// create synthetic STypes for implicit types (but not their features yet because they may depend on the mappings of those types ):
			for (sourceType : implicitlyGrabbedSourceTypes) {
				val implicitTypeDeduction = createImplicitElementCopyDeduction(deductionDefinition, sourceType)
				val syntheticType = container.addSyntheticType(sourceType.name, sourceType, implicitTypeDeduction)
				if (syntheticType instanceof DEnumeration) {
					syntheticType.addImplicitSyntheticLiterals(sourceType as DEnumeration, implicitTypeDeduction)
				} else if (syntheticType instanceof DComplexType) {
					acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, implicitTypeDeduction, sourceType as DComplexType))
				}
			}
		}
	}
	
	/*
	 * Add synthetic types for which there is an explicit STypeDeduction rule in the aggregate:
	 */
	protected def void addSyntheticTypes(ITypeContainer container, DAggregate origin, List<SyntheticFeatureContainerDescriptor> acceptor) {
		val typeDeductionDefinitions = origin.types.filter(TTypeTransposition).toList // cannot sort iterable 
		Collections.sort(typeDeductionDefinitions, new TypeSorter)
		for (definition : typeDeductionDefinitions) {
			val rule = definition.getTranspositionRule
			val source = rule.getSource
			if (source instanceof DType) {
				val syntheticType = container.processTypeDeduction(definition, rule)
				if (syntheticType instanceof DComplexType) {
					acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, definition as TComplexTypeTransposition, source as DComplexType))
				}
			}
		}
	}
	
	/*
	 * Add synthetic types for which there is an explicit definition (but not a rule) in the aggregate:
	 */
	protected def void addSyntheticTypesAsCopy(ITypeContainer container, DAggregate origin, List<SyntheticFeatureContainerDescriptor> acceptor) {
		val typeDefinitions = origin.types.filter[!(it instanceof TTypeTransposition)].toList // cannot sort iterable 
//		Collections.sort(typeDefinitions, new TypeSorter)
		for (original : typeDefinitions) {
			val syntheticType = container.addSyntheticTypeAsCopy(original)
			if (syntheticType instanceof DComplexType) {
				acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, null, original as DComplexType))
			}
		}
	}
	
	def dispatch DPrimitive processTypeDeduction(ITypeContainer container, TPrimitiveTransposition deductionDefinition, TGrabRule rule /*dispatch*/) {
		val source = rule.getSource
		if (source instanceof DPrimitive) {
			val name = if (rule.getRenameTo !== null) rule.getRenameTo else source.name
			val syntheticType = container.addSyntheticType(name, source, deductionDefinition) as DPrimitive
			return syntheticType
		}
		return null
	}
	
	def dispatch DEnumeration processTypeDeduction(ITypeContainer container, TEnumerationTransposition deductionDefinition, TGrabRule rule /*dispatch*/) {
		val source = rule.getSource
		if (source instanceof DEnumeration) {
			val name = if (rule.getRenameTo !== null) rule.getRenameTo else source.name
			val syntheticEnum = container.addSyntheticType(name , source, deductionDefinition) as DEnumeration
			syntheticEnum.addImplicitSyntheticLiterals(source, deductionDefinition)
			syntheticEnum.addSyntheticLiterals(deductionDefinition)
			return syntheticEnum
		}
		return null
	}
	
	def dispatch DComplexType processTypeDeduction(ITypeContainer container, TComplexTypeTransposition deductionDefinition, TGrabRule rule /*dispatch*/) {
		return grabComplexType(container, deductionDefinition, rule)
	}
	
	def dispatch DComplexType processTypeDeduction(ITypeContainer container, TComplexTypeTransposition deductionDefinition, TMorphRule rule /*dispatch*/) {
		val syntheticType = grabComplexType(container, deductionDefinition, rule)
		extendsComplexType(syntheticType, rule)
		return syntheticType
	}
	
	def dispatch DComplexType processTypeDeduction(ITypeContainer container, TComplexTypeTransposition deductionDefinition, TFuseRule rule /*dispatch*/) {
		val syntheticType = grabComplexType(container, deductionDefinition, rule)
		extendsComplexType(syntheticType, rule)
		// TODO 1. enhance scope provider to enable feature transformations (rules)
		// TODO 2. add respective features of all source types to fused type
		return syntheticType
	}
	
	def dispatch DComplexType processTypeDeduction(EObject container, TTypeTransposition deductionDefinition, TDitchRule rule /*dispatch*/) {
		// do nothing
	}
	
	def dispatch DType processTypeDeduction(EObject container, TTypeTransposition deductionDefinition, TTranspositionRule rule /*dispatch*/) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	def  DComplexType grabComplexType(ITypeContainer container, TComplexTypeTransposition deductionDefinition, TRenameRule rule) {
		val source = rule.getSource
		if (source instanceof DComplexType) {
			val name = if (rule.getRenameTo !== null) rule.getRenameTo else source.name
			val syntheticType = container.addSyntheticType(name , source, deductionDefinition) as DComplexType
			// do not add features yet (they may refer to types that might not exist yet => added by containers of this type later)
			return syntheticType
		}
		return null
	}
	
	def void extendsComplexType(DComplexType syntheticType, TStructureChangingRule rule) {
		if (rule.getExtendFrom instanceof DComplexType && syntheticType.class == rule.getExtendFrom.class ) {
			syntheticType.superType = rule.getExtendFrom as DComplexType
		}
	}
	
	def void addImplicitSyntheticLiterals(DEnumeration syntheticEnum, DEnumeration source, ITransposition deductionDefinition) {
		var Iterable<TLiteralTransposition> literalDeductionDefinitions = Lists.newArrayList
		if (deductionDefinition instanceof TEnumerationTransposition) {
			literalDeductionDefinitions = deductionDefinition.literals.filter(TLiteralTransposition)
		}

		if (! literalDeductionDefinitions.exists[getTranspositionRule instanceof TGrabRule]) {
			// there are no explicit grabs, so implicitly grab all literals without a rule:
			val implicitlyGrabbedSourceLiterals = Lists.newArrayList(source.literals)
			val sourceLiteralsAffectedByRule = literalDeductionDefinitions.filter[getTranspositionRule.getSource instanceof DLiteral].map[getTranspositionRule.getSource as DLiteral]
			implicitlyGrabbedSourceLiterals.removeAll(sourceLiteralsAffectedByRule)
			// create synthetic SLiterals for implicit literals:
			for (sourceLiteral : implicitlyGrabbedSourceLiterals) {
				syntheticEnum.addSyntheticLiteral(sourceLiteral.name, sourceLiteral, createImplicitElementCopyDeduction(deductionDefinition, sourceLiteral))
			}
		}
	}
	
	def void addSyntheticLiterals(DEnumeration syntheticEnum, TEnumerationTransposition deductionDefinition) {
		val literalDeductionDefinitions = deductionDefinition.literals.filter(TLiteralTransposition).toList  // cannot change iterable while iterating => create new list
		for (definition : literalDeductionDefinitions) {
			val rule = definition.getTranspositionRule
			if (rule instanceof TGrabRule) {
				val literalName = if (rule.getRenameTo !== null) rule.getRenameTo
					else if (rule.namedSource !== null) rule.namedSource.name
					else UNDEFINED
				// add explicit grab:
				syntheticEnum.addSyntheticLiteral(literalName, rule.getSource as DLiteral, definition)
			}
		}
		
		// add explicit literals (without rule):
		val genuineLiterals = deductionDefinition.literals.filter[! (it instanceof TLiteralTransposition || it.isSynthetic)]
		for (literal : genuineLiterals) {
				syntheticEnum.addSyntheticLiteralAsCopy(literal.name, literal)
		}
	}
}