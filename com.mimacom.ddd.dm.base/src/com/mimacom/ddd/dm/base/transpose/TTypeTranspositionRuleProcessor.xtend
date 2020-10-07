package com.mimacom.ddd.dm.base.transpose

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
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject

class TTypeTranspositionRuleProcessor  {
	
	@Inject extension SyntheticModelElementsFactory
	
	static val UNDEFINED = "UNDEFINED"
	
	protected def void addImplicitSyntheticTypes(ITypeContainer container, TAggregateTransposition recipe, DAggregate source, List<SyntheticFeatureContainerDescriptor> acceptor) {
		val typeRecipes = recipe.types.filter(ITransposition)
		if (! typeRecipes.exists[getTranspositionRule instanceof TGrabRule]) {
			// there are no explicit grabs, so implicitly grab ALL TYPES WITHOUT an EXPLICIT RULE:
			val implicitlyGrabbedSourceTypes = Lists.newArrayList(source.types)
			val sourceTypesAffectedByRule = typeRecipes.filter[getTranspositionRule.getSource instanceof DType].map[getTranspositionRule.getSource as DType]
			implicitlyGrabbedSourceTypes.removeAll(sourceTypesAffectedByRule)
			
			// create synthetic STypes for implicit types (but not their features yet because they may depend on the mappings of those types ):
			for (sourceType : implicitlyGrabbedSourceTypes) {
				val implicitTypeRecipes = createImplicitTranspositionAsCopy(recipe, sourceType)
				val syntheticType = container.addSyntheticType(sourceType.name, sourceType, implicitTypeRecipes)
				if (syntheticType instanceof DEnumeration) {
					syntheticType.addImplicitSyntheticLiterals(sourceType as DEnumeration, implicitTypeRecipes)
				} else if (syntheticType instanceof DComplexType) {
					acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, implicitTypeRecipes, sourceType as DComplexType))
				}
			}
		}
	}
	
	/*
	 * Add synthetic types for which there is an explicit STypeDeduction rule in the aggregate:
	 */
	protected def void addSyntheticTypes(ITypeContainer container, DAggregate origin, List<SyntheticFeatureContainerDescriptor> acceptor) {
		val typeRecipes = origin.types.filter(TTypeTransposition).toList // cannot sort iterable 
		Collections.sort(typeRecipes, new TypeSorter)
		for (r : typeRecipes) {
			val rule = r.getTranspositionRule
			val source = rule.getSource
			if (source instanceof DType) {
				val syntheticType = container.transposeType(r, rule)
				if (syntheticType instanceof DComplexType) {
					acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, r as TComplexTypeTransposition, source as DComplexType))
				}
			}
		}
	}
	
	/*
	 * Add synthetic types for which there is an explicit definition (but not a rule) in the aggregate:
	 */
	protected def void addSyntheticTypesAsCopy(ITypeContainer container, DAggregate origin, List<SyntheticFeatureContainerDescriptor> acceptor) {
		val typeRecipes = origin.types.filter[!(it instanceof TTypeTransposition)].toList // cannot sort iterable 
//		Collections.sort(typeDefinitions, new TypeSorter)
		for (original : typeRecipes) {
			val syntheticType = container.addSyntheticTypeAsCopy(original)
			if (syntheticType instanceof DComplexType) {
				acceptor.add(new SyntheticFeatureContainerDescriptor(syntheticType, null, original as DComplexType))
			}
		}
	}
	
	def dispatch DPrimitive transposeType(ITypeContainer container, TPrimitiveTransposition recipe, TGrabRule rule /*dispatch*/ ) {
		val source = rule.getSource
		if (source instanceof DPrimitive) {
			val name = if (rule.getRenameTo !== null) rule.getRenameTo else source.name
			val syntheticType = container.addSyntheticType(name, source, recipe) as DPrimitive
			return syntheticType
		}
		return null
	}
	
	def dispatch DEnumeration transposeType(ITypeContainer container, TEnumerationTransposition recipe, TGrabRule rule /*dispatch*/ ) {
		val source = rule.getSource
		if (source instanceof DEnumeration) {
			val name = if (rule.getRenameTo !== null) rule.getRenameTo else source.name
			val syntheticEnum = container.addSyntheticType(name , source, recipe) as DEnumeration
			syntheticEnum.addImplicitSyntheticLiterals(source, recipe)
			syntheticEnum.addSyntheticLiterals(recipe)
			return syntheticEnum
		}
		return null
	}
	
	def dispatch DComplexType transposeType(ITypeContainer container, TComplexTypeTransposition recipe, TGrabRule rule /*dispatch*/ ) {
		return grabComplexType(container, recipe, rule)
	}
	
	def dispatch DComplexType transposeType(ITypeContainer container, TComplexTypeTransposition recipe, TMorphRule rule /*dispatch*/ ) {
		val syntheticType = grabComplexType(container, recipe, rule)
		extendsComplexType(syntheticType, rule)
		return syntheticType
	}
	
	def dispatch DComplexType transposeType(ITypeContainer container, TComplexTypeTransposition recipe, TFuseRule rule /*dispatch*/ ) {
		val syntheticType = grabComplexType(container, recipe, rule)
		extendsComplexType(syntheticType, rule)
		// TODO 1. enhance scope provider to enable feature transformations (rules)
		// TODO 2. add respective features of all source types to fused type
		return syntheticType
	}
	
	def dispatch DComplexType transposeType(EObject container, TTypeTransposition recipe, TDitchRule rule /*dispatch*/ ) {
		// do nothing
	}
	
	def dispatch DType transposeType(EObject container, TTypeTransposition recipe, TTranspositionRule rule /*dispatch*/ ) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	def  DComplexType grabComplexType(ITypeContainer container, TComplexTypeTransposition recipe, TRenameRule rule) {
		val source = rule.getSource
		if (source instanceof DComplexType) {
			val name = if (rule.getRenameTo !== null) rule.getRenameTo else source.name
			val syntheticType = container.addSyntheticType(name , source, recipe) as DComplexType
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
	
	def void addImplicitSyntheticLiterals(DEnumeration syntheticEnum, DEnumeration source, ITransposition recipe) {
		var Iterable<TLiteralTransposition> literalRecipes = Lists.newArrayList
		if (recipe instanceof TEnumerationTransposition) {
			literalRecipes = recipe.literals.filter(TLiteralTransposition)
		}

		if (! literalRecipes.exists[getTranspositionRule instanceof TGrabRule]) {
			// there are no explicit grabs, so implicitly grab all literals without a rule:
			val implicitlyGrabbedSourceLiterals = Lists.newArrayList(source.literals)
			val sourceLiteralsAffectedByRule = literalRecipes.filter[getTranspositionRule.getSource instanceof DLiteral].map[getTranspositionRule.getSource as DLiteral]
			implicitlyGrabbedSourceLiterals.removeAll(sourceLiteralsAffectedByRule)
			// create synthetic SLiterals for implicit literals:
			for (sourceLiteral : implicitlyGrabbedSourceLiterals) {
				syntheticEnum.addSyntheticLiteral(sourceLiteral.name, sourceLiteral, createImplicitTranspositionAsCopy(recipe, sourceLiteral))
			}
		}
	}
	
	def void addSyntheticLiterals(DEnumeration syntheticEnum, TEnumerationTransposition recipe) {
		val literalRecipes = recipe.literals.filter(TLiteralTransposition).toList  // cannot change iterable while iterating => create new list
		for (definition : literalRecipes) {
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
		val genuineLiterals = recipe.literals.filter[! (it instanceof TLiteralTransposition || it.isSynthetic)]
		for (literal : genuineLiterals) {
				syntheticEnum.addSyntheticLiteralAsCopy(literal.name, literal)
		}
	}
}
