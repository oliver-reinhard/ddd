package com.mimacom.ddd.sm.sim.derivedState

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
import com.mimacom.ddd.sm.sim.SImplicitElementDeduction
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SStructureChangingRule
import com.mimacom.ddd.sm.sim.STristate
import com.mimacom.ddd.sm.sim.SimFactory
import org.eclipse.xtext.EcoreUtil2

class SyntheticModelElementsFactory {

	static val BASE = BaseFactory.eINSTANCE
	static val simFactory = SimFactory.eINSTANCE

	def DAggregate addSyntheticAggregate(SInformationModel container, String name,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		val syntheticAggregate = BASE.createDAggregate
		syntheticAggregate.name = name
		syntheticAggregate.synthetic = true
		syntheticAggregate.deducedFrom = deductionDefinition
		container.aggregates.add(syntheticAggregate)
		return syntheticAggregate
	}

	def dispatch DPrimitive addSyntheticType(ITypeContainer container, String name, DPrimitive source /*dispatch*/ ,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		val syntheticPrimitive = BASE.createDPrimitive
		syntheticPrimitive.initSyntheticType(container, name, source, deductionDefinition, context)
		syntheticPrimitive.redefines = source.redefines
		return syntheticPrimitive
	}

	def dispatch DEnumeration addSyntheticType(ITypeContainer container, String name, DEnumeration source /*dispatch*/ ,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		val syntheticEnumeration = BASE.createDEnumeration
		syntheticEnumeration.initSyntheticType(container, name, source, deductionDefinition, context)
		return syntheticEnumeration
	}

	def dispatch DComplexType addSyntheticType(ITypeContainer container, String name, DComplexType source /*dispatch*/ ,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		val isCoreModel = EcoreUtil2.getContainerOfType(container, SInformationModel).kind == SInformationModelKind.CORE
		val syntheticComplexType = if (!isCoreModel || deductionDefinition.deductionRule.makeDetailType(source)) {
				BASE.createDDetailType
			} else {
				BASE.createDEntityType
			}
		syntheticComplexType.initSyntheticType(container, name, source, deductionDefinition, context)
		syntheticComplexType.abstract = deductionDefinition.deductionRule.makeAbstract(source)
		if (syntheticComplexType instanceof DEntityType) {
			syntheticComplexType.root = deductionDefinition.deductionRule.makeRoot(source)
		}
		container.types.add(syntheticComplexType)
		return syntheticComplexType
	}

	protected def void initSyntheticType(DType syntheticType, ITypeContainer container, String name, DType source,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		syntheticType.name = name
		syntheticType.synthetic = true
		syntheticType.deducedFrom = deductionDefinition
		container.types.add(syntheticType)
		context.putSystemType(source, syntheticType)
	}

	def DFeature addSyntheticFeature(IFeatureContainer container, String name, DFeature source,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		val sourceFeatureType = source.getType
		if (sourceFeatureType === null) { // the domain model is (temporarily incomplete => don't add sFeature now
			return null
		}
		val featureType = context.getSystemType(sourceFeatureType) // may be null
		val syntheticFeature = switch source {
			DAttribute | DAssociation: if (featureType instanceof IIdentityType ||
				featureType === null && source instanceof DAssociation) BASE.createDAssociation else BASE.
				createDAttribute
			DQuery: BASE.createDQuery
		}
		syntheticFeature.name = name
		syntheticFeature.type = featureType
		syntheticFeature.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticFeature.synthetic = true
		syntheticFeature.deducedFrom = deductionDefinition
		container.features.add(syntheticFeature)
		return syntheticFeature
	}

	def DFeature addSyntheticFeatureAsCopy(IFeatureContainer container, DFeature source, TransformationContext context) {
		val syntheticFeature = switch source {
			DAttribute: BASE.createDAttribute
			DQuery: BASE.createDQuery
			DAssociation: BASE.createDAssociation
		}
		container.features.add(syntheticFeature)
		syntheticFeature.initSyntheticFeatureAsCopy(source, context)
		return syntheticFeature
	}

	def DFeature addSyntheticQueryAsCopy(DAggregate container, DQuery source, TransformationContext context) {
		val syntheticFeature = BASE.createDQuery
		container.features.add(syntheticFeature)
		syntheticFeature.initSyntheticFeatureAsCopy(source, context)
		return syntheticFeature
	}
	
	private def void initSyntheticFeatureAsCopy(DFeature syntheticFeature, DFeature source, TransformationContext context) {
		syntheticFeature.name = source.name
		syntheticFeature.type = source.getType
		syntheticFeature.multiplicity = source.getMultiplicity
		syntheticFeature.synthetic = true
		syntheticFeature.deducedFrom = null /* NOTE: null */
		if (source instanceof DQuery) {
			for (p : source.parameters) {
				(syntheticFeature as DQuery).addSyntheticQueryParameterAsCopy(p, context)
			}
		}
	}

	def DQueryParameter addSyntheticQueryParameter(DQuery container, String name, DQueryParameter source,
		IDeductionDefinition deductionDefinition, TransformationContext context) {
		val sourceParameterType = source.getType
		if (sourceParameterType === null) { // the domain model is (temporarily incomplete => don't add sFeature now
			return null
		}
		val syntheticParameter = BASE.createDQueryParameter
		syntheticParameter.name = name
		syntheticParameter.type = context.getSystemType(sourceParameterType)
		syntheticParameter.multiplicity = grabMultiplicity(source.getMultiplicity)
		syntheticParameter.synthetic = true
		syntheticParameter.deducedFrom = deductionDefinition
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def DQueryParameter addSyntheticQueryParameterAsCopy(DQuery container, DQueryParameter source,
		TransformationContext context) {
		val syntheticParameter = BASE.createDQueryParameter
		syntheticParameter.name = source.name
		syntheticParameter.type = source.getType
		syntheticParameter.multiplicity = source.getMultiplicity
		syntheticParameter.synthetic = true
		syntheticParameter.deducedFrom = null /* NOTE null */
		container.parameters.add(syntheticParameter)
		return syntheticParameter
	}

	def void addSyntheticLiteral(DEnumeration container, String name) {
		val syntheticLiteral = BASE.createDLiteral
		syntheticLiteral.name = name
		syntheticLiteral.synthetic = true
		container.literals.add(syntheticLiteral)
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

	def SImplicitElementDeduction createImplicitElementCopyDeduction(IDeductionDefinition originalDeductionDefinition,
		IDeducibleElement source) {
		val grabRule = simFactory.createSGrabRule
		grabRule.source = source
		val implicitDeduction = simFactory.createSImplicitElementDeduction
		implicitDeduction.originalDeductionDefinition = originalDeductionDefinition
		implicitDeduction.deductionRule = grabRule
		return implicitDeduction
	}
}
