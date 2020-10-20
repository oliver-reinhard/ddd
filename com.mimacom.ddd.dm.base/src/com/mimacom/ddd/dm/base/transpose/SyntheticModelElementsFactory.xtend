package com.mimacom.ddd.dm.base.transpose

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BaseFactory
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DMultiplicity
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.base.IIdentityType
import com.mimacom.ddd.dm.base.base.ITypeContainer
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate
import com.mimacom.ddd.dm.base.synthetic.TSyntheticComplexType
import com.mimacom.ddd.dm.base.synthetic.TSyntheticDetailType
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration
import com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter
import com.mimacom.ddd.dm.base.synthetic.TSyntheticType
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class SyntheticModelElementsFactory {

	static val BASE = BaseFactory.eINSTANCE
	static val TRANSPOSE = TransposeFactory.eINSTANCE
	static val SYNTHETIC = SyntheticFactory.eINSTANCE

	@Inject extension TypeMappingUtil

	def TSyntheticAggregate addSyntheticAggregate(TInformationModel container, String name, ITransposition recipe) {
		val syntheticAggregate = SYNTHETIC.createTSyntheticAggregate
		syntheticAggregate.name = name
		syntheticAggregate.recipe = recipe
		container.aggregates.add(syntheticAggregate)
		return syntheticAggregate
	}

	def dispatch TSyntheticPrimitive addSyntheticType(ITypeContainer container, String name, DPrimitive source /*dispatch*/ ,
		ITransposition recipe) {
		val syntheticPrimitive = SYNTHETIC.createTSyntheticPrimitive
		syntheticPrimitive.initSyntheticType(container, name, source, recipe)
		syntheticPrimitive.redefines = source.redefines
		return syntheticPrimitive
	}

	def dispatch TSyntheticEnumeration addSyntheticType(ITypeContainer container, String name, DEnumeration source /*dispatch*/ ,
		ITransposition recipe) {
		val syntheticEnumeration = SYNTHETIC.createTSyntheticEnumeration
		syntheticEnumeration.initSyntheticType(container, name, source, recipe)
		return syntheticEnumeration
	}

	def dispatch TSyntheticComplexType addSyntheticType(ITypeContainer container, String name, DComplexType source /*dispatch*/ ,
		ITransposition recipe) {
		val allowsIdentityTypes = EcoreUtil2.getContainerOfType(container, TInformationModel).allowsIdentityTypes
		val syntheticComplexType = if (!allowsIdentityTypes || recipe.getRule.makeDetailType(source)) {
				SYNTHETIC.createTSyntheticDetailType
			} else {
				SYNTHETIC.createTSyntheticEntityType
			}
		syntheticComplexType.initSyntheticType(container, name, source, recipe)
		syntheticComplexType.abstract = recipe.getRule.makeAbstract(source)
		if (syntheticComplexType instanceof DEntityType) {
			syntheticComplexType.root = recipe.getRule.makeRoot(source)
		}
		container.types.add(syntheticComplexType)
		return syntheticComplexType
	}

	def dispatch TSyntheticPrimitive addSyntheticTypeAsCopy(ITypeContainer container, DPrimitive original /*dispatch*/ ) {
		val syntheticPrimitive = SYNTHETIC.createTSyntheticPrimitive
		syntheticPrimitive.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		return syntheticPrimitive
	}

	def dispatch TSyntheticEnumeration addSyntheticTypeAsCopy(ITypeContainer container, DEnumeration original /*dispatch*/ ) {
		val syntheticEnumeration = SYNTHETIC.createTSyntheticEnumeration
		syntheticEnumeration.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		for (literal : original.literals) {
			syntheticEnumeration.addSyntheticLiteralAsCopy(literal.name, literal)
		}
		return syntheticEnumeration
	}

	def dispatch TSyntheticEntityType addSyntheticTypeAsCopy(ITypeContainer container, DEntityType original /*dispatch*/ ) {
		val syntheticEntity = SYNTHETIC.createTSyntheticEntityType
		syntheticEntity.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		syntheticEntity.abstract = original.abstract
		syntheticEntity.superType = original.superType
		syntheticEntity.root = original.root
		syntheticEntity.nature = original.nature
		// Do not add features yet!
		return syntheticEntity
	}

	def dispatch TSyntheticDetailType addSyntheticTypeAsCopy(ITypeContainer container, DDetailType original /*dispatch*/ ) {
		val syntheticEntity = SYNTHETIC.createTSyntheticDetailType
		syntheticEntity.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		syntheticEntity.abstract = original.abstract
		syntheticEntity.superType = original.superType
		// Do not add features yet!
		return syntheticEntity
	}

	protected def void initSyntheticType(TSyntheticType syntheticType, ITypeContainer container, String name, DType original,
		ITransposition recipe) {
		syntheticType.name = name
		syntheticType.aliases.addAll(original.aliases)
		syntheticType.recipe = recipe
		container.types.add(syntheticType)
	}

	def TSyntheticFeature addSyntheticFeature(IFeatureContainer container, String name, DFeature source, ITransposition recipe) {
		val sourceFeatureType = source.getType
		if (sourceFeatureType === null) { // the domain model is (temporarily incomplete => don't add synthetic feature now)
			return null
		}
		val featureTypeProxy = getTransposedTypeProxy(recipe, sourceFeatureType) // may be null
		// Now create the actual feature with correct type:
		val syntheticFeature = switch source {
			DQuery: {
				SYNTHETIC.createTSyntheticQuery
			}
			DAttribute | DAssociation: {
				// We need the actual type of the feature in order to distinguish between associations and attributes:
				var featureType = container.findLocalTypeMappingFor(source.type)
				if (featureType === null) {
					// There is no local type mapping -> find external type mappings.
					// Create temporary feature and resolve type proxy:
					val tempFeature = SYNTHETIC.createTSyntheticAttribute
					container.features.add(tempFeature)
					tempFeature.type = featureTypeProxy // may be null
					// FORCE proxy resolution by accessing the type field:
					featureType = tempFeature.type
					container.features.remove(tempFeature)
				//
				}
				if (featureType instanceof IIdentityType || featureType === null && source instanceof DAssociation)
					SYNTHETIC.createTSyntheticAssociation
				else
					SYNTHETIC.createTSyntheticAttribute
			}
		}
		syntheticFeature.name = name
		syntheticFeature.aliases.addAll(source.aliases)
		syntheticFeature.type = featureTypeProxy // may be null -> there is a validation catching this case
		syntheticFeature.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticFeature.recipe = recipe
		container.features.add(syntheticFeature)
		return syntheticFeature
	}

	def TSyntheticFeature addSyntheticFeatureAsCopy(IFeatureContainer container, DFeature source) {
		val syntheticFeature = switch source {
			DAttribute: SYNTHETIC.createTSyntheticAttribute
			DQuery: SYNTHETIC.createTSyntheticQuery
			DAssociation: SYNTHETIC.createTSyntheticAssociation
		}
		container.features.add(syntheticFeature)
		syntheticFeature.initSyntheticFeatureAsCopy(source)
		return syntheticFeature
	}

	def TSyntheticFeature addSyntheticQueryAsCopy(DAggregate container, DQuery source) {
		val syntheticFeature = SYNTHETIC.createTSyntheticQuery
		container.features.add(syntheticFeature)
		syntheticFeature.initSyntheticFeatureAsCopy(source)
		return syntheticFeature
	}

	private def void initSyntheticFeatureAsCopy(TSyntheticFeature syntheticFeature, DFeature source) {
		syntheticFeature.name = source.name
		syntheticFeature.aliases.addAll(source.aliases)
		syntheticFeature.type = source.getType
		syntheticFeature.multiplicity = source.getMultiplicity
		syntheticFeature.recipe = null /* NOTE: null */
		if (source instanceof DQuery) {
			for (p : source.parameters) {
				(syntheticFeature as DQuery).addSyntheticQueryParameterAsCopy(p)
			}
		}
	}

	def TSyntheticQueryParameter addSyntheticQueryParameter(DQuery container, String name, DQueryParameter source,
		ITransposition recipe) {
		val sourceParameterType = source.getType
		if (sourceParameterType === null) { // the domain model is (temporarily incomplete => don't add sFeature now
			return null
		}
		val syntheticParameter = SYNTHETIC.createTSyntheticQueryParameter
		syntheticParameter.name = name
		syntheticParameter.type = getTransposedTypeProxy(recipe, sourceParameterType)
		syntheticParameter.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticParameter.recipe = recipe
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def TSyntheticQueryParameter addSyntheticQueryParameterAsCopy(DQuery container, DQueryParameter source) {
		val syntheticParameter = SYNTHETIC.createTSyntheticQueryParameter
		syntheticParameter.name = source.name
		syntheticParameter.type = source.getType
		syntheticParameter.multiplicity = source.getMultiplicity
		syntheticParameter.recipe = null /* NOTE: null */
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def void addSyntheticLiteral(DEnumeration container, String name, DLiteral source, ITransposition recipe) {
		val syntheticLiteral = SYNTHETIC.createTSyntheticLiteral
		syntheticLiteral.name = name
		syntheticLiteral.aliases.addAll(source.aliases)
		syntheticLiteral.recipe = recipe
		container.literals.add(syntheticLiteral)
	}

	def void addSyntheticLiteralAsCopy(DEnumeration container, String name, DLiteral original) {
		addSyntheticLiteral(container, name, original, null /* NOTE: null */ )
	}

	protected def DMultiplicity grabMultiplicity(DMultiplicity source) {
		var DMultiplicity result = null
		if (source !== null) {
			result = BASE.createDMultiplicity
			result.minOccurs = source.minOccurs
			result.maxOccurs = source.maxOccurs
		}
		return result
	}

	protected def dispatch boolean makeAbstract(TStructureChangingRule r, DComplexType source) {
		if (r.getAbstract == TTristate.DONT_CARE) return source.abstract
		return r.getAbstract == TTristate.TRUE
	}

	protected def dispatch boolean makeAbstract(TTranspositionRule r, DComplexType source) {
		return source.abstract
	}

	protected def dispatch boolean makeRoot(TStructureChangingRule r, DComplexType source) {
		if (r.getRootEntity == TTristate.DONT_CARE) {
			return source instanceof DEntityType && (source as DEntityType).isRoot
		}
		return r.getRootEntity == TTristate.TRUE
	}

	protected def dispatch boolean makeRoot(TTranspositionRule r, DComplexType source) {
		return source instanceof DEntityType && (source as DEntityType).isRoot
	}

	protected def dispatch boolean makeDetailType(TMorphRule r, DComplexType source) {
		if (r.getDetail == TTristate.DONT_CARE) return source instanceof DDetailType
		return r.getDetail == TTristate.TRUE
	}

	protected def dispatch boolean makeDetailType(TTranspositionRule r, DComplexType source) {
		return source instanceof DDetailType
	}

	protected def DType findLocalTypeMappingFor(EObject context, DType source) {
		val types = context.eResource.allContents.filter(TSyntheticType)
		val candidates = types.filter[recipe?.rule?.getSource === source]
		return candidates.head
	}

	def TImplicitTransposition createImplicitTranspositionAsCopy(ITransposition originalRecipe,
		ITransposableElement source) {
		val implicitTransposition = TRANSPOSE.createTImplicitTransposition
		originalRecipe.impliedTranspositions.add(implicitTransposition)
		implicitTransposition.originalTransposition = originalRecipe
		val grabRule = TRANSPOSE.createTGrabRule
		grabRule.source = source
		implicitTransposition.rule = grabRule // add to container
		return implicitTransposition
	}
}
