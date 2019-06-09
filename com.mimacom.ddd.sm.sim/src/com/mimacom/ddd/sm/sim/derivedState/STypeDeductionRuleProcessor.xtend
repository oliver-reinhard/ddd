package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeductionRule
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFuseRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SLiteral
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SType
import java.util.Collections
import java.util.List

import static com.mimacom.ddd.sm.sim.SElementNature.*
import com.mimacom.ddd.sm.sim.SStructureChangingRule

class STypeDeductionRuleProcessor  {
	
	@Inject extension SyntheticModelElementsFactory
	
	
	static val UNDEFINED = "UNDEFINED"
	
	protected def void addImplicitSyntheticTypes(SAggregate container, SAggregate aggregateWithRule, DAggregate source, List<SyntheticComplexTypeDescriptor> acceptor, TransformationContext context) {
		val sTypesWithRule = aggregateWithRule.types.filter[nature == DEDUCTION_RULE]
		if (! sTypesWithRule.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab all types without a rule:
			val implicitlyGrabbedDTypes = Lists.newArrayList(source.types)
			val dTypesAffectedByRule = sTypesWithRule.filter[deductionRule.source instanceof DType].map[deductionRule.source as DType]
			implicitlyGrabbedDTypes.removeAll(dTypesAffectedByRule)
			
			// create synthetic STypes for implicit types (but not their features yet because they may depend on the mappings of those types ):
			for (dType : implicitlyGrabbedDTypes) {
				val syntheticType = container.addSyntheticType(dType.name, dType, null, context)
				if (syntheticType instanceof SEnumeration) {
					syntheticType.addImplicitSyntheticLiterals(dType as DEnumeration, null)
				} else if (syntheticType instanceof SComplexType) {
					acceptor.add(new SyntheticComplexTypeDescriptor(syntheticType, dType as DComplexType))
				}
			}
		}
	}
	
	protected def void addSyntheticTypes(SAggregate container, List<SyntheticComplexTypeDescriptor> acceptor, TransformationContext context) {
		val sTypesWithRule = container.types.filter[nature == DEDUCTION_RULE].toList // cannot sort iterable 
		Collections.sort(sTypesWithRule, new STypeSorter)
		for (sType : sTypesWithRule) {
			val rule = sType.deductionRule
			val source = rule.source
			if (source instanceof DType) {
				val syntheticType = sType.processTypeWithRule(sType.deductionRule, context)
				if (syntheticType instanceof SComplexType) {
					acceptor.add(new SyntheticComplexTypeDescriptor(syntheticType, sType as SComplexType, source as DComplexType))
				}
			}
		}
	}
	
	def dispatch SPrimitive processTypeWithRule(SPrimitive typeWithRule, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DPrimitive) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = typeWithRule.eContainer.addSyntheticType(name, source, typeWithRule, context) as SPrimitive
			return syntheticType
		}
		return null
	}
	
	def dispatch SEnumeration processTypeWithRule(SEnumeration typeWithRule, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DEnumeration) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticEnum = typeWithRule.eContainer.addSyntheticType(name , source, typeWithRule, context) as SEnumeration
			syntheticEnum.addImplicitSyntheticLiterals(source, typeWithRule)
			syntheticEnum.addSyntheticLiterals(typeWithRule)
			return syntheticEnum
		}
		return null
	}
	
	def dispatch SType processTypeWithRule(SType typeWithRule, SDeductionRule rule, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	
	def dispatch SComplexType processTypeWithRule(SComplexType typeWithRule, SGrabRule rule, TransformationContext context) {
		return grabComplexType(typeWithRule, rule, context)
	}
	
	def dispatch SComplexType processTypeWithRule(SComplexType typeWithRule, SMorphRule rule, TransformationContext context) {
		val syntheticType = grabComplexType(typeWithRule, rule, context)
		extendsComplexType(syntheticType, rule, context)
		return syntheticType
	}
	
	def dispatch SComplexType processTypeWithRule(SComplexType typeWithRule, SFuseRule rule, TransformationContext context) {
		val syntheticType = grabComplexType(typeWithRule, rule, context)
		extendsComplexType(syntheticType, rule, context)
		// TODO 1. enhance scope provider to enable feature transformations (rules)
		// TODO 2. add respective features of all source types to fused type
		return syntheticType
	}
	
	def  SComplexType grabComplexType(SComplexType typeWithRule, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DComplexType) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = addSyntheticType(typeWithRule.eContainer, name , source, typeWithRule, context) as SComplexType
			// do not add features yet (they may refer to types that might not exist yet => added by containers of this type later)
			return syntheticType
		}
		return null
	}
	
	def void extendsComplexType(SComplexType typeWithRule, SStructureChangingRule rule, TransformationContext context) {
		if (rule.extendFrom instanceof SComplexType && typeWithRule.class == rule.extendFrom.class ) {
			typeWithRule.superType = rule.extendFrom as SComplexType
		}
	}
	
	def void addImplicitSyntheticLiterals(SEnumeration syntheticEnum, DEnumeration source, SEnumeration sEnumWithRule) {
		var Iterable<SLiteral> sLiteralsWithRule = Lists.newArrayList
		if (sEnumWithRule !== null) {
			sLiteralsWithRule = sEnumWithRule.literals.filter[nature == DEDUCTION_RULE]
		}

		if (! sLiteralsWithRule.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab all literals without a rule:
			val implicitlyGrabbedDLiterals = Lists.newArrayList(source.literals)
			val dLiteralsAffectedByRule = sLiteralsWithRule.filter[deductionRule.source instanceof DLiteral].map[deductionRule.source as DLiteral]
			implicitlyGrabbedDLiterals.removeAll(dLiteralsAffectedByRule)
			// create synthetic SLiterals for implicit literals:
			for (dLiteral : implicitlyGrabbedDLiterals) {
				syntheticEnum.addSyntheticLiteral(dLiteral.name)
			}
		}
	}
	
	def void addSyntheticLiterals(SEnumeration syntheticEnum, SEnumeration sEnumWithRule) {
		val sLiteralsWithRule = sEnumWithRule.literals.filter[nature == DEDUCTION_RULE].toList  // cannot change iterable while iterating => create new list
		for (sLiteral : sLiteralsWithRule) {
			val literalRule = sLiteral.deductionRule
			if (literalRule instanceof SGrabRule) {
				val literalName = if (literalRule.renameTo !== null) literalRule.renameTo
					else if (literalRule.namedSource !== null) literalRule.namedSource.name
					else UNDEFINED
				// add explicit grab:
				syntheticEnum.addSyntheticLiteral(literalName)
			}
		}
		
		// add explicit literals (without rule):
		val sLiteralsGenuine = sEnumWithRule.literals.filter[nature == GENUINE]
		for (sLiteral : sLiteralsGenuine) {
				syntheticEnum.addSyntheticLiteral(sLiteral.name)
		}
	}
	
}