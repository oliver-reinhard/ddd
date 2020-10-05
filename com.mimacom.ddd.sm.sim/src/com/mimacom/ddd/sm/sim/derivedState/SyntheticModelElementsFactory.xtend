package com.mimacom.ddd.sm.sim.derivedState

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BaseFactory
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDeductionRule
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DImplicitDeduction
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DMultiplicity
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeducibleElement
import com.mimacom.ddd.dm.base.IDeductionDefinition
import com.mimacom.ddd.dm.base.IFeatureContainer
import com.mimacom.ddd.dm.base.IIdentityType
import com.mimacom.ddd.dm.base.ITypeContainer
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SStructureChangingRule
import com.mimacom.ddd.sm.sim.STristate
import com.mimacom.ddd.sm.sim.SimFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class SyntheticModelElementsFactory {

	static val BASE = BaseFactory.eINSTANCE
	static val SIM = SimFactory.eINSTANCE

	@Inject extension TypeMappingUtil

	def DAggregate addSyntheticAggregate(SInformationModel container, String name,
		IDeductionDefinition deductionDefinition) {
		val syntheticAggregate = BASE.createDAggregate
		syntheticAggregate.name = name
		syntheticAggregate.synthetic = true
		syntheticAggregate.deducedFrom = deductionDefinition
		container.aggregates.add(syntheticAggregate)
		return syntheticAggregate
	}

	def dispatch DPrimitive addSyntheticType(ITypeContainer container, String name, DPrimitive source /*dispatch*/ ,
		IDeductionDefinition deductionDefinition) {
		val syntheticPrimitive = BASE.createDPrimitive
		syntheticPrimitive.initSyntheticType(container, name, source, deductionDefinition)
		syntheticPrimitive.redefines = source.redefines
		return syntheticPrimitive
	}

	def dispatch DEnumeration addSyntheticType(ITypeContainer container, String name, DEnumeration source /*dispatch*/ ,
		IDeductionDefinition deductionDefinition) {
		val syntheticEnumeration = BASE.createDEnumeration
		syntheticEnumeration.initSyntheticType(container, name, source, deductionDefinition)
		return syntheticEnumeration
	}

	def dispatch DComplexType addSyntheticType(ITypeContainer container, String name, DComplexType source /*dispatch*/ ,
		IDeductionDefinition deductionDefinition) {
		val isCoreModel = EcoreUtil2.getContainerOfType(container, SInformationModel).kind == SInformationModelKind.CORE
		val syntheticComplexType = if (!isCoreModel || deductionDefinition.deductionRule.makeDetailType(source)) {
				BASE.createDDetailType
			} else {
				BASE.createDEntityType
			}
		syntheticComplexType.initSyntheticType(container, name, source, deductionDefinition)
		syntheticComplexType.abstract = deductionDefinition.deductionRule.makeAbstract(source)
		if (syntheticComplexType instanceof DEntityType) {
			syntheticComplexType.root = deductionDefinition.deductionRule.makeRoot(source)
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
		IDeductionDefinition deductionDefinition) {
		syntheticType.name = name
		syntheticType.aliases.addAll(original.aliases)
		syntheticType.synthetic = true
		syntheticType.deducedFrom = deductionDefinition
		container.types.add(syntheticType)
	}

	def DFeature addSyntheticFeature(IFeatureContainer container, String name, DFeature source,
		IDeductionDefinition deductionDefinition) {
		val sourceFeatureType = source.getType
		if (sourceFeatureType === null) { // the domain model is (temporarily incomplete => don't add synthetic feature now)
			return null
		}
		val featureTypeProxy = getSystemTypeProxy(deductionDefinition, sourceFeatureType) // may be null
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
		syntheticFeature.deducedFrom = deductionDefinition
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
		syntheticFeature.deducedFrom = null /* NOTE: null */
		if (source instanceof DQuery) {
			for (p : source.parameters) {
				(syntheticFeature as DQuery).addSyntheticQueryParameterAsCopy(p)
			}
		}
	}

	def DQueryParameter addSyntheticQueryParameter(DQuery container, String name, DQueryParameter source,
		IDeductionDefinition deductionDefinition) {
		val sourceParameterType = source.getType
		if (sourceParameterType === null) { // the domain model is (temporarily incomplete => don't add sFeature now
			return null
		}
		val syntheticParameter = BASE.createDQueryParameter
		syntheticParameter.name = name
		syntheticParameter.type = getSystemTypeProxy(deductionDefinition, sourceParameterType)
		syntheticParameter.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticParameter.synthetic = true
		syntheticParameter.deducedFrom = deductionDefinition
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def DQueryParameter addSyntheticQueryParameterAsCopy(DQuery container, DQueryParameter source) {
		val syntheticParameter = BASE.createDQueryParameter
		syntheticParameter.name = source.name
		syntheticParameter.type = source.getType
		syntheticParameter.multiplicity = source.getMultiplicity
		syntheticParameter.synthetic = true
		syntheticParameter.deducedFrom = null /* NOTE: null */
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def void addSyntheticLiteral(DEnumeration container, String name, DLiteral source,
		IDeductionDefinition deductionDefinition) {
		val syntheticLiteral = BASE.createDLiteral
		syntheticLiteral.name = name
		syntheticLiteral.aliases.addAll(source.aliases)
		syntheticLiteral.synthetic = true
		syntheticLiteral.deducedFrom = deductionDefinition
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

	protected def dispatch boolean makeAbstract(SStructureChangingRule r, DComplexType source) {
		if (r.abstract == STristate.DONT_CARE) return source.abstract
		return r.abstract == STristate.TRUE
	}

	protected def dispatch boolean makeAbstract(DDeductionRule r, DComplexType source) {
		return source.abstract
	}

	protected def dispatch boolean makeRoot(SStructureChangingRule r, DComplexType source) {
		if (r.rootEntity == STristate.DONT_CARE) {
			return source instanceof DEntityType && (source as DEntityType).isRoot
		}
		return r.rootEntity == STristate.TRUE
	}

	protected def dispatch boolean makeRoot(DDeductionRule r, DComplexType source) {
		return source instanceof DEntityType && (source as DEntityType).isRoot
	}

	protected def dispatch boolean makeDetailType(SMorphRule r, DComplexType source) {
		if (r.detail == STristate.DONT_CARE) return source instanceof DDetailType
		return r.detail == STristate.TRUE
	}

	protected def dispatch boolean makeDetailType(DDeductionRule r, DComplexType source) {
		return source instanceof DDetailType
	}

	protected def DType findLocalTypeMappingFor(EObject context, DType source) {
		val types = context.eResource.allContents.filter(DType).filter[! (it instanceof IDeductionDefinition)]
		val candidates = types.filter[deducedFrom?.deductionRule?.source === source]
		return candidates.head
	}

	def DImplicitDeduction createImplicitElementCopyDeduction(IDeductionDefinition originalDeductionDefinition,
		IDeducibleElement source) {
		val implicitDeduction = BASE.createDImplicitDeduction
		originalDeductionDefinition.impliedDeductions.add(implicitDeduction)
		implicitDeduction.originalDeductionDefinition = originalDeductionDefinition
		val grabRule = SIM.createSGrabRule
		grabRule.source = source
		implicitDeduction.deductionRule = grabRule // add to container
		return implicitDeduction
	}
}
