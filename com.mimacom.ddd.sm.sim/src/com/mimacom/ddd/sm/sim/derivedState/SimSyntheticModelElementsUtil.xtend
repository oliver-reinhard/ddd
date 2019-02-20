package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DMultiplicity
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.DRelationship
import com.mimacom.ddd.dm.base.DRootType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SMultiplicity
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SQueryParameter
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SimFactory
import org.eclipse.emf.ecore.EObject

class SimSyntheticModelElementsUtil {
	
	static val simFactory = SimFactory.eINSTANCE
	
	def SAggregate addSyntheticAggregate(SInformationModel container, DAggregate source, SDeducibleElement elementWithRule, TransformationContext context)  {
		val sAggregate = simFactory.createSAggregate
		sAggregate.synthetic = true
		sAggregate.deductionRule = createSyntheticDeductionRuleOrNull(source, elementWithRule)
		container.aggregates.add(sAggregate)
		return sAggregate
	}
	
	def dispatch SPrimitive addSyntheticType(EObject container, String name, DPrimitive source, SDeducibleElement elementWithRule, TransformationContext context)  {
		val sType = simFactory.createSPrimitive
		sType.initSyntheticType(container, name, source, elementWithRule, context)
		return sType
	}
	
	def dispatch SEnumeration addSyntheticType(EObject container, String name, DEnumeration source, SDeducibleElement elementWithRule,  TransformationContext context)  {
		val sType = simFactory.createSEnumeration
		sType.initSyntheticType(container, name, source, elementWithRule, context)
		return sType
	}
	
	def dispatch SComplexType addSyntheticType(EObject container, String name, DComplexType source, SDeducibleElement elementWithRule, TransformationContext context)  {
		val sType = switch source {
			DRootType: simFactory.createSRootType
			DRelationship: simFactory.createSRootType
			DDetailType: simFactory.createSDetailType
		}
		sType.initSyntheticType(container, name, source, elementWithRule, context)
		sType.abstract = source.abstract
		switch container {
			SAggregate : container.types.add(sType)
			SInformationModel : container.types.add(sType)
		}
		return sType
	}
	
	protected def void initSyntheticType(SType t, EObject container, String name, DType source, SDeducibleElement elementWithRule, TransformationContext context) {
		t.name = name
		t.synthetic = true
		t.deductionRule= createSyntheticDeductionRuleOrNull(source, elementWithRule)
		switch container {
			SAggregate : container.types.add(t)
			SInformationModel : container.types.add(t)
		}
		context.putSType(source, t)
	}
	
	protected def SSyntheticDeductionRule createSyntheticDeductionRuleOrNull(EObject source, SDeducibleElement elementWithRule) {
		if (source === null || elementWithRule === null) {
			return null
		}
		val rule = simFactory.createSSyntheticDeductionRule
		rule.source = source
		rule.elementWithRule = elementWithRule
		return rule
	}
	
	def SFeature addSyntheticFeature(SComplexType container, String name, DFeature source, SDeducibleElement elementWithRule, TransformationContext context)  {
			val sFeature = switch source {
				DAttribute: simFactory.createSAttribute
				DQuery: simFactory.createSQuery
				DAssociation: simFactory.createSAssociation
			}
			sFeature.name = name
			val dFeatureType = source.type
			if (dFeatureType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			sFeature.type = context.getSType(dFeatureType) // may be null
			sFeature.multiplicity = grabMultiplicity(source.multiplicity)
			sFeature.synthetic = true
			sFeature.deductionRule = createSyntheticDeductionRuleOrNull(source, elementWithRule)
			container.features.add(sFeature)
			return sFeature
	}
	
	def SQueryParameter addSyntheticQueryParameter(SQuery container, String name, DQueryParameter source, SDeducibleElement elementWithRule,TransformationContext context)  {
			val sParameter = simFactory.createSQueryParameter
			sParameter.name = name
			val dParameterType = source.type
			if (dParameterType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			sParameter.type = context.getSType(dParameterType)
			sParameter.multiplicity = grabMultiplicity(source.multiplicity)
			sParameter.synthetic = true
			sParameter.deductionRule = createSyntheticDeductionRuleOrNull(source, elementWithRule)
			container.parameters.add(sParameter)
			return sParameter
	}
	
	def void addSyntheticLiteral(SEnumeration container, String name) {
		val sLiteral = simFactory.createSLiteral
		sLiteral.name = name
		sLiteral.synthetic = true
		container.literals.add(sLiteral)
	}
	
	def SMultiplicity grabMultiplicity(DMultiplicity source) {
		var SMultiplicity result = null
		if (source !== null) {
			result = simFactory.createSMultiplicity
			result.minOccurs = source.minOccurs
			result.maxOccurs = source.maxOccurs
		}
		return result
	}
}