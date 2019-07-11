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
import com.mimacom.ddd.dm.base.DIdentityType
import com.mimacom.ddd.dm.base.DMultiplicity
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.DRelationship
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeducibleElement
import com.mimacom.ddd.dm.base.IDeductionDefinition
import com.mimacom.ddd.sm.sim.SImplicitElementDeduction
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SStructureChangingRule
import com.mimacom.ddd.sm.sim.STristate
import com.mimacom.ddd.sm.sim.SimFactory
import org.eclipse.emf.ecore.EObject

class SyntheticModelElementsFactory {
	
	static val baseFactory = BaseFactory.eINSTANCE
	static val simFactory = SimFactory.eINSTANCE
	
	def DAggregate addSyntheticAggregate(SInformationModel container, IDeductionDefinition deductionDefinition, TransformationContext context)  {
		val syntheticAggregate = baseFactory.createDAggregate
		syntheticAggregate.deducedFrom = deductionDefinition
		container.aggregates.add(syntheticAggregate)
		return syntheticAggregate
	}
	
	def dispatch DPrimitive addSyntheticType(EObject container, String name, DPrimitive source /*dispatch*/, IDeductionDefinition deductionDefinition, TransformationContext context)  {
		val syntheticPrimitive = baseFactory.createDPrimitive
		syntheticPrimitive.initSyntheticType(container, name, source, deductionDefinition, context)
		syntheticPrimitive.redefines = source.redefines
		return syntheticPrimitive
	}
	
	def dispatch DEnumeration addSyntheticType(EObject container, String name, DEnumeration source /*dispatch*/, IDeductionDefinition deductionDefinition,  TransformationContext context)  {
		val syntheticEnumeration = baseFactory.createDEnumeration
		syntheticEnumeration.initSyntheticType(container, name, source, deductionDefinition, context)
		return syntheticEnumeration
	}
	
	def dispatch DComplexType addSyntheticType(EObject container, String name, DComplexType source /*dispatch*/, IDeductionDefinition deductionDefinition, TransformationContext context)  {
		val syntheticComplexType = switch source {
			DEntityType: baseFactory.createDEntityType
			DRelationship: baseFactory.createDEntityType
			DDetailType: baseFactory.createDDetailType
		}
		syntheticComplexType.initSyntheticType(container, name, source, deductionDefinition, context)
		syntheticComplexType.abstract = deductionDefinition.deductionRule.makeAbstract(source)
		if (syntheticComplexType instanceof DEntityType) {
			syntheticComplexType.root = deductionDefinition.deductionRule.makeRoot (source as DIdentityType)
		}
		switch container {
			DAggregate : container.types.add(syntheticComplexType)
			SInformationModel : container.types.add(syntheticComplexType)
		}
		return syntheticComplexType
	}
	
	protected def void initSyntheticType(DType syntheticType, EObject container, String name, DType source, IDeductionDefinition deductionDefinition, TransformationContext context) {
		syntheticType.name = name
		syntheticType.synthetic = true
		syntheticType.deducedFrom = deductionDefinition
		switch container {
			DAggregate : container.types.add(syntheticType)
			SInformationModel : container.types.add(syntheticType)
		}
		context.putSystemType(source, syntheticType)
	}
	
//	protected def SSyntheticDeductionRule createSyntheticDeductionRuleOrNull(EObject source, IDeductionDefinition deductionDefinition) {
//		if (source === null || deductionDefinition === null) {
//			return null
//		}
//		val rule = simFactory.createSSyntheticDeductionRule
//		rule.source = source
//		rule.deductionDefinition = deductionDefinition
//		return rule
//	}
	
	def DFeature addSyntheticFeature(DComplexType container, String name, DFeature source, IDeductionDefinition deductionDefinition, TransformationContext context)  {
			val sourceFeatureType = source.type
			if (sourceFeatureType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			val syntheticFeature = switch source {
				DAttribute: baseFactory.createDAttribute
				DQuery: baseFactory.createDQuery
				DAssociation: baseFactory.createDAssociation
			}
			syntheticFeature.name = name
			syntheticFeature.type = context.getSystemType(sourceFeatureType) // may be null
			syntheticFeature.multiplicity = grabMultiplicity(source.multiplicity)
			syntheticFeature.synthetic = true
			syntheticFeature.deducedFrom = deductionDefinition
			container.features.add(syntheticFeature)
			return syntheticFeature
	}
	
	def DFeature addSyntheticFeatureAsCopy(DComplexType container, DFeature source, TransformationContext context)  {
			val syntheticFeature = switch source {
				DAttribute: baseFactory.createDAttribute
				DQuery: baseFactory.createDQuery
				DAssociation: baseFactory.createDAssociation
			}
			syntheticFeature.name = source.name
			syntheticFeature.type = source.type
			syntheticFeature.multiplicity = source.multiplicity
			syntheticFeature.synthetic = true
			syntheticFeature.deducedFrom = null  /* NOTE null */
			container.features.add(syntheticFeature)
			if (source instanceof DQuery) {
				for (p : source.parameters) {
					(syntheticFeature as DQuery).addSyntheticQueryParameterAsCopy(p, context)
				}
			}
			return syntheticFeature
	}
	
	def DQueryParameter addSyntheticQueryParameter(DQuery container, String name, DQueryParameter source, IDeductionDefinition deductionDefinition,TransformationContext context)  {
			val sourceParameterType = source.type
			if (sourceParameterType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			val syntheticParameter = baseFactory.createDQueryParameter
			syntheticParameter.name = name
			syntheticParameter.type = context.getSystemType(sourceParameterType)
			syntheticParameter.multiplicity = grabMultiplicity(source.multiplicity)
			syntheticParameter.synthetic = true
			syntheticParameter.deducedFrom = deductionDefinition
			container.parameters.add(syntheticParameter)
			return syntheticParameter
	}
	
	def DQueryParameter addSyntheticQueryParameterAsCopy(DQuery container, DQueryParameter source, TransformationContext context)  {
			val syntheticParameter = baseFactory.createDQueryParameter
			syntheticParameter.name = source.name
			syntheticParameter.type = source.type
			syntheticParameter.multiplicity = source.multiplicity
			syntheticParameter.synthetic = true
			syntheticParameter.deducedFrom = null  /* NOTE null */
			container.parameters.add(syntheticParameter)
			return syntheticParameter
	}
	
	def void addSyntheticLiteral(DEnumeration container, String name) {
		val syntheticLiteral = baseFactory.createDLiteral
		syntheticLiteral.name = name
		syntheticLiteral.synthetic = true
		container.literals.add(syntheticLiteral)
	}
	
	protected def DMultiplicity grabMultiplicity(DMultiplicity source) {
		var DMultiplicity result = null
		if (source !== null) {
			result = baseFactory.createDMultiplicity
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
	
	protected def dispatch boolean makeRoot(SStructureChangingRule r, DIdentityType source) {
		if (r.rootEntity == STristate.DONT_CARE) return source.root
		return r.rootEntity == STristate.TRUE
	}
	
	protected def dispatch boolean makeRoot(DDeductionRule r, DIdentityType source) {
		return source.root
	}
	
	
	def SImplicitElementDeduction createImplicitElementCopyDeduction(IDeductionDefinition originalDeductionDefinition, IDeducibleElement source) {
		val grabRule = simFactory.createSGrabRule
		grabRule.source = source
		val implicitDeduction = simFactory.createSImplicitElementDeduction
		implicitDeduction.originalDeductionDefinition = originalDeductionDefinition
		implicitDeduction.deductionRule = grabRule
		return implicitDeduction
	}
}