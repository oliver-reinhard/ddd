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
import com.mimacom.ddd.dm.base.base.ITransposableElement
import com.mimacom.ddd.dm.base.base.ITransposition
import com.mimacom.ddd.dm.base.base.ITypeContainer
import com.mimacom.ddd.dm.base.base.TImplicitTransposition
import com.mimacom.ddd.dm.base.base.TTranspositionRule
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class SyntheticModelElementsFactory {

	static val BASE = BaseFactory.eINSTANCE
	static val TRANSPOSE = TransposeFactory.eINSTANCE

	@Inject extension TypeMappingUtil

	def DAggregate addSyntheticAggregate(TInformationModel container, String name, ITransposition recipe) {
		val syntheticAggregate = BASE.createDAggregate
		syntheticAggregate.name = name
		syntheticAggregate.synthetic = true
		syntheticAggregate.transposedBy = recipe
		container.aggregates.add(syntheticAggregate)
		return syntheticAggregate
	}

	def dispatch DPrimitive addSyntheticType(ITypeContainer container, String name, DPrimitive source /*dispatch*/ ,
		ITransposition recipe) {
		val syntheticPrimitive = BASE.createDPrimitive
		syntheticPrimitive.initSyntheticType(container, name, source, recipe)
		syntheticPrimitive.redefines = source.redefines
		return syntheticPrimitive
	}

	def dispatch DEnumeration addSyntheticType(ITypeContainer container, String name, DEnumeration source /*dispatch*/ ,
		ITransposition recipe) {
		val syntheticEnumeration = BASE.createDEnumeration
		syntheticEnumeration.initSyntheticType(container, name, source, recipe)
		return syntheticEnumeration
	}

	def dispatch DComplexType addSyntheticType(ITypeContainer container, String name, DComplexType source /*dispatch*/ ,
		ITransposition recipe) {
		val allowsIdentityTypes = EcoreUtil2.getContainerOfType(container, TInformationModel).allowsIdentityTypes
		val syntheticComplexType = if (!allowsIdentityTypes || recipe.getTranspositionRule.makeDetailType(source)) {
				BASE.createDDetailType
			} else {
				BASE.createDEntityType
			}
		syntheticComplexType.initSyntheticType(container, name, source, recipe)
		syntheticComplexType.abstract = recipe.getTranspositionRule.makeAbstract(source)
		if (syntheticComplexType instanceof DEntityType) {
			syntheticComplexType.root = recipe.getTranspositionRule.makeRoot(source)
		}
		container.types.add(syntheticComplexType)
		return syntheticComplexType
	}

	def dispatch DPrimitive addSyntheticTypeAsCopy(ITypeContainer container, DPrimitive original /*dispatch*/ ) {
		val syntheticPrimitive = BASE.createDPrimitive
		syntheticPrimitive.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		return syntheticPrimitive
	}

	def dispatch DEnumeration addSyntheticTypeAsCopy(ITypeContainer container, DEnumeration original /*dispatch*/ ) {
		val syntheticEnumeration = BASE.createDEnumeration
		syntheticEnumeration.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		for (literal : original.literals) {
			syntheticEnumeration.addSyntheticLiteralAsCopy(literal.name, literal)
		}
		return syntheticEnumeration
	}

	def dispatch DEntityType addSyntheticTypeAsCopy(ITypeContainer container, DEntityType original /*dispatch*/ ) {
		val syntheticEntity = BASE.createDEntityType
		syntheticEntity.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		syntheticEntity.abstract = original.abstract
		syntheticEntity.superType = original.superType
		syntheticEntity.root = original.root
		syntheticEntity.nature = original.nature
		// Do not add features yet!
		return syntheticEntity
	}

	def dispatch DDetailType addSyntheticTypeAsCopy(ITypeContainer container, DDetailType original /*dispatch*/ ) {
		val syntheticEntity = BASE.createDDetailType
		syntheticEntity.initSyntheticType(container, original.name, original, null /* NOTE: null */ )
		syntheticEntity.abstract = original.abstract
		syntheticEntity.superType = original.superType
		// Do not add features yet!
		return syntheticEntity
	}

	protected def void initSyntheticType(DType syntheticType, ITypeContainer container, String name, DType original,
		ITransposition recipe) {
		syntheticType.name = name
		syntheticType.aliases.addAll(original.aliases)
		syntheticType.synthetic = true
		syntheticType.transposedBy = recipe
		container.types.add(syntheticType)
	}

	def DFeature addSyntheticFeature(IFeatureContainer container, String name, DFeature source, ITransposition recipe) {
		val sourceFeatureType = source.getType
		if (sourceFeatureType === null) { // the domain model is (temporarily incomplete => don't add synthetic feature now)
			return null
		}
		val featureTypeProxy = getTransposedTypeProxy(recipe, sourceFeatureType) // may be null
		// Now create the actual feature with correct type:
		val syntheticFeature = switch source {
			DQuery: {
				BASE.createDQuery
			}
			DAttribute | DAssociation: {
				// We need the actual type of the feature in order to distinguish between associations and attributes:
				var featureType = container.findLocalTypeMappingFor(source.type)
				if (featureType === null) {
					// There is no local type mapping -> find external type mappings.
					// Create temporary feature and resolve type proxy:
					val tempFeature = BASE.createDAttribute
					container.features.add(tempFeature)
					tempFeature.type = featureTypeProxy // may be null
					// FORCE proxy resolution by accessing the type field:
					featureType = tempFeature.type
					container.features.remove(tempFeature)
				//
				}
				if (featureType instanceof IIdentityType || featureType === null && source instanceof DAssociation)
					BASE.createDAssociation
				else
					BASE.createDAttribute
			}
		}
		syntheticFeature.name = name
		syntheticFeature.aliases.addAll(source.aliases)
		syntheticFeature.type = featureTypeProxy // may be null -> there is a validation catching this case
		syntheticFeature.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticFeature.synthetic = true
		syntheticFeature.transposedBy = recipe
		container.features.add(syntheticFeature)
		return syntheticFeature
	}

	def DFeature addSyntheticFeatureAsCopy(IFeatureContainer container, DFeature source) {
		val syntheticFeature = switch source {
			DAttribute: BASE.createDAttribute
			DQuery: BASE.createDQuery
			DAssociation: BASE.createDAssociation
		}
		container.features.add(syntheticFeature)
		syntheticFeature.initSyntheticFeatureAsCopy(source)
		return syntheticFeature
	}

	def DFeature addSyntheticQueryAsCopy(DAggregate container, DQuery source) {
		val syntheticFeature = BASE.createDQuery
		container.features.add(syntheticFeature)
		syntheticFeature.initSyntheticFeatureAsCopy(source)
		return syntheticFeature
	}

	private def void initSyntheticFeatureAsCopy(DFeature syntheticFeature, DFeature source) {
		syntheticFeature.name = source.name
		syntheticFeature.aliases.addAll(source.aliases)
		syntheticFeature.type = source.getType
		syntheticFeature.multiplicity = source.getMultiplicity
		syntheticFeature.synthetic = true
		syntheticFeature.transposedBy = null /* NOTE: null */
		if (source instanceof DQuery) {
			for (p : source.parameters) {
				(syntheticFeature as DQuery).addSyntheticQueryParameterAsCopy(p)
			}
		}
	}

	def DQueryParameter addSyntheticQueryParameter(DQuery container, String name, DQueryParameter source,
		ITransposition recipe) {
		val sourceParameterType = source.getType
		if (sourceParameterType === null) { // the domain model is (temporarily incomplete => don't add sFeature now
			return null
		}
		val syntheticParameter = BASE.createDQueryParameter
		syntheticParameter.name = name
		syntheticParameter.type = getTransposedTypeProxy(recipe, sourceParameterType)
		syntheticParameter.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticParameter.synthetic = true
		syntheticParameter.transposedBy = recipe
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def DQueryParameter addSyntheticQueryParameterAsCopy(DQuery container, DQueryParameter source) {
		val syntheticParameter = BASE.createDQueryParameter
		syntheticParameter.name = source.name
		syntheticParameter.type = source.getType
		syntheticParameter.multiplicity = source.getMultiplicity
		syntheticParameter.synthetic = true
		syntheticParameter.transposedBy = null /* NOTE: null */
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def void addSyntheticLiteral(DEnumeration container, String name, DLiteral source, ITransposition recipe) {
		val syntheticLiteral = BASE.createDLiteral
		syntheticLiteral.name = name
		syntheticLiteral.aliases.addAll(source.aliases)
		syntheticLiteral.synthetic = true
		syntheticLiteral.transposedBy = recipe
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
		val types = context.eResource.allContents.filter(DType).filter[! (it instanceof ITransposition)]
		val candidates = types.filter[transposedBy?.transpositionRule?.getSource === source]
		return candidates.head
	}

	def TImplicitTransposition createImplicitTranspositionAsCopy(ITransposition originalRecipe,
		ITransposableElement source) {
		val implicitDeduction = BASE.createTImplicitTransposition
		originalRecipe.impliedTranspositions.add(implicitDeduction)
		implicitDeduction.originalDeductionDefinition = originalRecipe
		val grabRule = TRANSPOSE.createTGrabRule
		grabRule.source = source
		implicitDeduction.transpositionRule = grabRule // add to container
		return implicitDeduction
	}
}
