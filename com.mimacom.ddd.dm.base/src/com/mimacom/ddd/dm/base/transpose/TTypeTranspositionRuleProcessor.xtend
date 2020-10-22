package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.ITypeContainer
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject

class TTypeTranspositionRuleProcessor {

	@Inject extension TSyntheticModelElementsFactory

	static val UNDEFINED = "UNDEFINED"

	protected def void addImplicitSyntheticTypes(ITypeContainer container, TAggregateTransposition recipe, DAggregate source,
		List<TSyntheticFeatureContainerDescriptor> acceptor) {
		val typeRecipes = recipe.types.filter(TTypeTransposition)
		if (! typeRecipes.exists[rule instanceof TGrabRule]) {
			// there are no explicit grabs, so implicitly grab ALL SOURCE TYPES for which there is NO EXPLICIT Transposition:
			val implicitlyGrabbedSourceTypes = Lists.newArrayList(source.types.filter[it instanceof ITransposableElement])
			val sourceTypesWithTransposition = typeRecipes.map[rule.source].filter(DType)
			implicitlyGrabbedSourceTypes.removeAll(sourceTypesWithTransposition)

			// create synthetic types for implicit types (but not their features yet because they may depend on the mappings of those types ):
			for (sourceType : implicitlyGrabbedSourceTypes) {
				val implicitTypeTransposition = createImplicitTranspositionAsCopy(recipe, sourceType as ITransposableElement)
				val syntheticType = container.addSyntheticType(sourceType.name, sourceType, implicitTypeTransposition)
				if (syntheticType instanceof DEnumeration) {
					syntheticType.addImplicitSyntheticLiterals(sourceType as DEnumeration, implicitTypeTransposition)
				} else if (syntheticType instanceof DComplexType) {
					acceptor.add(new TSyntheticFeatureContainerDescriptor(syntheticType, implicitTypeTransposition, sourceType as DComplexType))
				}
			}
		}
	}

	/*
	 * Add synthetic types for which there is an explicit STypeDeduction rule in the aggregate:
	 */
	protected def void addSyntheticTypes(ITypeContainer container, DAggregate origin, List<TSyntheticFeatureContainerDescriptor> acceptor) {
		val typeRecipes = origin.types.filter(TTypeTransposition).toList // cannot sort Iterable 
		Collections.sort(typeRecipes, new TypeSorter)
		for (r : typeRecipes) {
			val rule = r.rule
			val source = rule.source
			if (source instanceof DType) {
				val syntheticType = container.transposeType(r, rule)
				if (syntheticType instanceof DComplexType) {
					acceptor.add(new TSyntheticFeatureContainerDescriptor(syntheticType, r as TComplexTypeTransposition, source as DComplexType))
				}
			}
		}
	}

	/*
	 * Add synthetic types for which there is an explicit definition (but not a rule) in the aggregate:
	 */
	protected def void addSyntheticTypesAsCopy(ITypeContainer container, DAggregate origin, List<TSyntheticFeatureContainerDescriptor> acceptor) {
		val originalTypes = origin.types.filter[(it instanceof ITransposableElement)].toList // cannot sort Iterable 
//		Collections.sort(typeDefinitions, new TypeSorter)
		for (original : originalTypes) {
			val syntheticType = container.addSyntheticTypeAsCopy(original)
			if (syntheticType instanceof DComplexType) {
				acceptor.add(new TSyntheticFeatureContainerDescriptor(syntheticType, null, original as DComplexType))
			}
		}
	}

	def dispatch DPrimitive transposeType(ITypeContainer container, TPrimitiveTransposition recipe, TGrabRule rule /*dispatch*/ ) {
		val source = rule.source
		if (source instanceof DPrimitive) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = container.addSyntheticType(name, source, recipe) as DPrimitive
			return syntheticType
		}
		return null
	}

	def dispatch DEnumeration transposeType(ITypeContainer container, TEnumerationTransposition recipe, TGrabRule rule /*dispatch*/ ) {
		val source = rule.source
		if (source instanceof DEnumeration) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticEnum = container.addSyntheticType(name, source, recipe) as DEnumeration
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

	def DComplexType grabComplexType(ITypeContainer container, TComplexTypeTransposition recipe, TRenameRule rule) {
		val source = rule.source
		if (source instanceof DComplexType) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = container.addSyntheticType(name, source, recipe) as DComplexType
			// do not add features yet (they may refer to types that might not exist yet => added by containers of this type later)
			return syntheticType
		}
		return null
	}

	def void extendsComplexType(DComplexType syntheticType, TStructureChangingRule rule) {
		if (rule.extendFrom instanceof DComplexType && syntheticType.class == rule.extendFrom.class) {
			syntheticType.superType = rule.extendFrom as DComplexType
		}
	}

	def void addImplicitSyntheticLiterals(DEnumeration syntheticEnum, DEnumeration source, ITransposition recipe) {
		var Iterable<TLiteralTransposition> literalRecipes = Lists.newArrayList
		if (recipe instanceof TEnumerationTransposition) {
			literalRecipes = recipe.literals.filter(TLiteralTransposition)
		}

		if (! literalRecipes.exists[rule instanceof TGrabRule]) {
			// there are no explicit grabs, so implicitly grab ALL SOURCE LITERALS for which there is NO EXPLICIT Transposition:
			val implicitlyGrabbedSourceLiterals = Lists.newArrayList(source.literals.filter[it instanceof ITransposableElement])
			val sourceLiteralsWithTransposition = literalRecipes.map[rule.source].filter(DLiteral)
			implicitlyGrabbedSourceLiterals.removeAll(sourceLiteralsWithTransposition)
			// create synthetic literals for implicit literals:
			for (sourceLiteral : implicitlyGrabbedSourceLiterals) {
				val implicitTypeTransposition = createImplicitTranspositionAsCopy(recipe, sourceLiteral as ITransposableElement)
				syntheticEnum.addSyntheticLiteral(sourceLiteral.name, sourceLiteral, implicitTypeTransposition)
			}
		}
	}

	def void addSyntheticLiterals(DEnumeration syntheticEnum, TEnumerationTransposition recipe) {
		val literalRecipes = recipe.literals.filter(TLiteralTransposition).toList // cannot change Iterable while iterating => create new list
		for (definition : literalRecipes) {
			val rule = definition.rule
			if (rule instanceof TGrabRule) {
				val literalName = if (rule.renameTo !== null)
						rule.renameTo
					else if (rule.namedSource !== null) rule.namedSource.name else UNDEFINED
				// add explicit grab:
				syntheticEnum.addSyntheticLiteral(literalName, rule.source as DLiteral, definition)
			}
		}

		// add explicit literals (without rule):
		val genuineLiterals = recipe.literals.filter [
			! (it instanceof TLiteralTransposition || it instanceof ISyntheticElement)
		]
		for (literal : genuineLiterals) {
			syntheticEnum.addSyntheticLiteralAsCopy(literal.name, literal)
		}
	}
}
