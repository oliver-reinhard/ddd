package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDeductionRule
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeductionDefinition
import com.mimacom.ddd.dm.base.ITypeContainer
import com.mimacom.ddd.sm.sim.SAggregateDeduction
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SEnumerationDeduction
import com.mimacom.ddd.sm.sim.SFuseRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SLiteralDeduction
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction
import com.mimacom.ddd.sm.sim.SRenameRule
import com.mimacom.ddd.sm.sim.SStructureChangingRule
import com.mimacom.ddd.sm.sim.STypeDeduction
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject

class STypeDeductionRuleProcessor  {
	
	@Inject extension SyntheticModelElementsFactory
	
	static val UNDEFINED = "UNDEFINED"
	
	protected def void addImplicitSyntheticTypes(ITypeContainer container, SAggregateDeduction deductionDefinition, DAggregate source, List<SyntheticFeatureContainerDescriptor> acceptor, TransformationContext context) {
		val typeDeductionDefinitions = deductionDefinition.types.filter(IDeductionDefinition)
		if (! typeDeductionDefinitions.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab ALL TYPES WITHOUT an EXPLICIT RULE:
			val implicitlyGrabbedSourceTypes = Lists.newArrayList(source.types)
			val sourceTypesAffectedByRule = typeDeductionDefinitions.filter[deductionRule.source instanceof DType].map[deductionRule.source as DType]
			implicitlyGrabbedSourceTypes.removeAll(sourceTypesAffectedByRule)
			
			// create synthetic STypes for implicit types (but not their features yet because they may depend on the mappings of those types ):
			for (sourceType : implicitlyGrabbedSourceTypes) {
				val syntheticType = container.addSyntheticType(sourceType.name, sourceType, createImplicitElementCopyDeduction(deductionDefinition, sourceType), context)
				if (syntheticType instanceof DEnumeration) {
					syntheticType.addImplicitSyntheticLiterals(sourceType as DEnumeration, null)
				} else if (syntheticType instanceof DComplexType) {
					acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, sourceType as DComplexType))
				}
			}
		}
	}
	
	protected def void addSyntheticTypes(ITypeContainer container, DAggregate origin, List<SyntheticFeatureContainerDescriptor> acceptor, TransformationContext context) {
		val typeDeductionDefinitions = origin.types.filter(STypeDeduction).toList // cannot sort iterable 
		Collections.sort(typeDeductionDefinitions, new TypeSorter)
		for (definition : typeDeductionDefinitions) {
			val rule = definition.deductionRule
			val source = rule.source
			if (source instanceof DType) {
				val syntheticType = container.processTypeDeduction(definition, rule, context)
				if (syntheticType instanceof DComplexType) {
					acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, definition as SComplexTypeDeduction, source as DComplexType))
				}
			}
		}
	}
	
	def dispatch DPrimitive processTypeDeduction(ITypeContainer container, SPrimitiveDeduction deductionDefinition, SGrabRule rule /*dispatch*/, TransformationContext context) {
		val source = rule.source
		if (source instanceof DPrimitive) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = container.addSyntheticType(name, source, deductionDefinition, context) as DPrimitive
			return syntheticType
		}
		return null
	}
	
	def dispatch DEnumeration processTypeDeduction(ITypeContainer container, SEnumerationDeduction deductionDefinition, SGrabRule rule /*dispatch*/, TransformationContext context) {
		val source = rule.source
		if (source instanceof DEnumeration) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticEnum = container.addSyntheticType(name , source, deductionDefinition, context) as DEnumeration
			syntheticEnum.addImplicitSyntheticLiterals(source, deductionDefinition)
			syntheticEnum.addSyntheticLiterals(deductionDefinition)
			return syntheticEnum
		}
		return null
	}
	
	def dispatch DComplexType processTypeDeduction(ITypeContainer container, SComplexTypeDeduction deductionDefinition, SGrabRule rule /*dispatch*/, TransformationContext context) {
		return grabComplexType(container, deductionDefinition, rule, context)
	}
	
	def dispatch DComplexType processTypeDeduction(ITypeContainer container, SComplexTypeDeduction deductionDefinition, SMorphRule rule /*dispatch*/, TransformationContext context) {
		val syntheticType = grabComplexType(container, deductionDefinition, rule, context)
		extendsComplexType(syntheticType, rule, context)
		return syntheticType
	}
	
	def dispatch DComplexType processTypeDeduction(ITypeContainer container, SComplexTypeDeduction deductionDefinition, SFuseRule rule /*dispatch*/, TransformationContext context) {
		val syntheticType = grabComplexType(container, deductionDefinition, rule, context)
		extendsComplexType(syntheticType, rule, context)
		// TODO 1. enhance scope provider to enable feature transformations (rules)
		// TODO 2. add respective features of all source types to fused type
		return syntheticType
	}
	
	def dispatch DComplexType processTypeDeduction(EObject container, STypeDeduction deductionDefinition, SDitchRule rule /*dispatch*/, TransformationContext context) {
		// do nothing
	}
	
	def dispatch DType processTypeDeduction(EObject container, STypeDeduction deductionDefinition, DDeductionRule rule /*dispatch*/, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	def  DComplexType grabComplexType(ITypeContainer container, SComplexTypeDeduction deductionDefinition, SRenameRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DComplexType) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = container.addSyntheticType(name , source, deductionDefinition, context) as DComplexType
			// do not add features yet (they may refer to types that might not exist yet => added by containers of this type later)
			return syntheticType
		}
		return null
	}
	
	def void extendsComplexType(DComplexType syntheticType, SStructureChangingRule rule, TransformationContext context) {
		if (rule.extendFrom instanceof DComplexType && syntheticType.class == rule.extendFrom.class ) {
			syntheticType.superType = rule.extendFrom as DComplexType
		}
	}
	
	def void addImplicitSyntheticLiterals(DEnumeration syntheticEnum, DEnumeration source, SEnumerationDeduction deductionDefinition) {
		var Iterable<SLiteralDeduction> literalDeductionDefinitions = Lists.newArrayList
		if (deductionDefinition !== null) {
			literalDeductionDefinitions = deductionDefinition.literals.filter(SLiteralDeduction)
		}

		if (! literalDeductionDefinitions.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab all literals without a rule:
			val implicitlyGrabbedSourceLiterals = Lists.newArrayList(source.literals)
			val sourceLiteralsAffectedByRule = literalDeductionDefinitions.filter[deductionRule.source instanceof DLiteral].map[deductionRule.source as DLiteral]
			implicitlyGrabbedSourceLiterals.removeAll(sourceLiteralsAffectedByRule)
			// create synthetic SLiterals for implicit literals:
			for (sourceLiteral : implicitlyGrabbedSourceLiterals) {
				syntheticEnum.addSyntheticLiteral(sourceLiteral.name)
			}
		}
	}
	
	def void addSyntheticLiterals(DEnumeration syntheticEnum, SEnumerationDeduction deductionDefinition) {
		val literalDeductionDefinitions = deductionDefinition.literals.filter(SLiteralDeduction).toList  // cannot change iterable while iterating => create new list
		for (definition : literalDeductionDefinitions) {
			val rule = definition.deductionRule
			if (rule instanceof SGrabRule) {
				val literalName = if (rule.renameTo !== null) rule.renameTo
					else if (rule.namedSource !== null) rule.namedSource.name
					else UNDEFINED
				// add explicit grab:
				syntheticEnum.addSyntheticLiteral(literalName)
			}
		}
		
		// add explicit literals (without rule):
		val genuineLiterals = deductionDefinition.literals.filter[! (it instanceof SLiteralDeduction || it.synthetic)]
		for (literal : genuineLiterals) {
				syntheticEnum.addSyntheticLiteral(literal.name)
		}
	}
}