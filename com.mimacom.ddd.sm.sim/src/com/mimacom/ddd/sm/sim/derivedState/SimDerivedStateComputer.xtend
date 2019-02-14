package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DMultiplicity
import com.mimacom.ddd.dm.base.DNamedElement
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.DRelationship
import com.mimacom.ddd.dm.base.DRootType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SDeductionRule
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SFuseRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SMultiplicity
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SQueryParameter
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SimFactory
import com.mimacom.ddd.sm.sim.SimUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SimDerivedStateComputer implements IDerivedStateComputer {
	
	@Inject extension SimUtil
	@Inject TransformationContext context
	
	static val simFactory = SimFactory.eINSTANCE
	static val UNDEFINED = "UNDEFINED"
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!preLinkingPhase) {
			
			context.init(resource)
			val model = resource.allContents.head as SInformationModel
			processInformationModel(model, context)
		}
	}
	
	override discardDerivedState(DerivedStateAwareResource resource) {
			// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
			val syntheticElements = resource.allContents.filter(SDeducibleElement).filter[synthetic]
			val list = Lists.newArrayList
			while(syntheticElements.hasNext) list.add(syntheticElements.next)
			for(e : list) {
				EcoreUtil.remove(e)
			}
	}
	
	def  void processInformationModel(SInformationModel model, TransformationContext context) {
		val typesToDeduce = model.types.filter[nature == DEDUCTION_RULE]
		for (type : typesToDeduce?.toList) {  // cannot change iterable while iterating
			type.processTypeWithRule(type.deductionRule, context) 
		}
		
		val modelList = Lists.newArrayList(model.aggregates) // cannot add to list while iterating it
		for (aggregate : modelList) {
			aggregate.processAggregateWithRule(context)
		}
	}
	
	def  void processAggregateWithRule(SAggregate aggregate, TransformationContext context) {
		var current = aggregate
		if (aggregate.deductionRule !== null) {
			val source = aggregate.deductionRule
			if (source instanceof DAggregate) {
				current = addSyntheticAggregate(aggregate.eContainer as SInformationModel, source, context)
				
				for (type : source.types) {
					// TODO create types and their members
				}
			}
		} 
		val typesToDeduce = current.types.filter[nature == DEDUCTION_RULE]
		for (type : typesToDeduce.toList) { // cannot change iterable while iterating
			type.processTypeWithRule(type.deductionRule, context)
		}
	}
	
	def dispatch void processTypeWithRule(SPrimitive sType, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DPrimitive) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			addSyntheticPrimitive(sType.eContainer, name, source, context)
		}
	}
	
	def dispatch void processTypeWithRule(SEnumeration sEnum, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DEnumeration) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticEnum = addSyntheticEnumeration(sEnum.eContainer, name , source, context)
			
			val sLiteralsWithExplicitRule = sEnum.literals.filter[nature == DEDUCTION_RULE]
			if (! sLiteralsWithExplicitRule.exists[deductionRule instanceof SGrabRule]) {
				// there are not explicit grabs, so implicitly grab all literals without a rule:
				val implicitlyGrabbedDLiterals = Lists.newArrayList(source.literals)
				val dLiteralsAffectedByRule = sLiteralsWithExplicitRule.filter[deductionRule.source instanceof DLiteral].map[deductionRule.source as DLiteral]
				implicitlyGrabbedDLiterals.removeAll(dLiteralsAffectedByRule)
				// create synthetic SLiterals for implicit literals:
				for (dLiteral : implicitlyGrabbedDLiterals) {
					syntheticEnum.addSyntheticLiteral(dLiteral.name)
				}
			}
			
			val sLiteralsWithExplicitRuleList = sLiteralsWithExplicitRule.toList  // cannot change iterable while iterating
			for (sLiteral : sLiteralsWithExplicitRuleList) {
				val literalRule = sLiteral.deductionRule
				if (literalRule instanceof SGrabRule) {
					val literalName = if (literalRule.renameTo !== null) literalRule.renameTo
						else if (literalRule.namedSource !== null) literalRule.namedSource.name
						else UNDEFINED
					// add explicit grab:
					syntheticEnum.addSyntheticLiteral(literalName)
				}
			}	
		}
	}
	
	
	def dispatch void processTypeWithRule(SComplexType sType, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DComplexType) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = addSyntheticComplexType(sType.eContainer, name , source, context)
			
			val sFeaturesWithExplicitRule = sType.features.filter[nature == DEDUCTION_RULE]
			
			if (! sFeaturesWithExplicitRule.exists[deductionRule instanceof SGrabRule]) {
				// there are not explicit grabs, so implicitly grab all features without a rule:
				val implicitlyGrabbedDFeatures = Lists.newArrayList(source.allFeatures)
				val dFeaturesAffectedByRule = sFeaturesWithExplicitRule.filter[deductionRule.source instanceof DFeature].map[deductionRule.source as DFeature]
				implicitlyGrabbedDFeatures.removeAll(dFeaturesAffectedByRule)
				// create synthetic SFeatures for implicit features:
				for (dFeature : implicitlyGrabbedDFeatures) {
					syntheticType.addSyntheticFeature(dFeature.name, dFeature, context)
				}
			}
			
			val sFeaturesWithExplicitRuleList = sFeaturesWithExplicitRule.toList  // cannot change iterable while iterating
			for (sFeature : sFeaturesWithExplicitRuleList) {
				syntheticType.processFeatureWithRule( sFeature, sFeature.deductionRule, context)
			}
		}
	}
	
	def dispatch void processTypeWithRule(SComplexType type, SMorphRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch void processTypeWithRule(SComplexType type, SFuseRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch void processTypeWithRule(SType type, SDeductionRule rule, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature sFeature, SGrabRule rule, TransformationContext context) {
		grabFeature(container, sFeature, rule, context)
	}
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature sFeature, SMorphRule rule, TransformationContext context) {
		val syntheticFeature = grabFeature(container, sFeature, rule, context)
		if (syntheticFeature !== null) {
			if (rule.retypeTo !== null) {
				syntheticFeature.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.remultiplyTo
			}
		}
	}

	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature sFeature, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SComplexType
	}
	
	def  SFeature grabFeature(SComplexType container, SFeature sFeature, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, context)
			
			if (sFeature instanceof SQuery) {
				val syntheticQuery = syntheticFeature as SQuery
			
				val sParametersWithExplicitRule = sFeature.parameters.filter[nature == DEDUCTION_RULE]
				
				if (! sParametersWithExplicitRule.exists[deductionRule instanceof SGrabRule]) {
					// there are not explicit grabs, so implicitly grab all features without a rule:
					val implicitlyGrabbedDParameters = Lists.newArrayList((source as DQuery).parameters)
					val dParametersAffectedByRule = sParametersWithExplicitRule.filter[deductionRule.source instanceof DQueryParameter].map[deductionRule.source as DQueryParameter]
					implicitlyGrabbedDParameters.removeAll(dParametersAffectedByRule)
					// create synthetic SFeatures for implicit features:
					for (dParameter : implicitlyGrabbedDParameters) {
						syntheticQuery.addSyntheticQueryParameter(dParameter.name, dParameter, context)
					}
				}
				
				val sParametersWithExplicitRuleList = sParametersWithExplicitRule.toList  // cannot change iterable while iterating
				for (sParameter : sParametersWithExplicitRuleList) {
					syntheticQuery.processQueryParameterWithRule(sParameter, sParameter.deductionRule, context)
				}
			}
			return syntheticFeature
		}
		return null
	}
	
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SGrabRule rule, TransformationContext context) {
		grabQueryParameter(container, sParameter, rule, context)
	}
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SMorphRule rule, TransformationContext context) {
		val syntheticParameter = grabQueryParameter(container, sParameter, rule, context)
		if (syntheticParameter !== null) {
			if (rule.retypeTo !== null) {
				syntheticParameter.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticParameter.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  SQueryParameter grabQueryParameter(SQuery container, SQueryParameter sParameter, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DQueryParameter) {
			val syntheticParameter = container.addSyntheticQueryParameter(if (rule.renameTo !== null) rule.renameTo else source.name, source, context)
			return syntheticParameter
		}
	}
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SQuery
	}
	
	def SAggregate addSyntheticAggregate(SInformationModel container, DAggregate source, TransformationContext context)  {
		val sAggregate = simFactory.createSAggregate
		sAggregate.synthetic = true
		sAggregate.deductionRule = simFactory.createSGrabAggregateRule
		sAggregate.deductionRule.source = source
		container.aggregates.add(sAggregate)
		return sAggregate
	}
	
	def SPrimitive addSyntheticPrimitive(EObject container, String name, DPrimitive source, TransformationContext context)  {
		val sType = simFactory.createSPrimitive
		sType.initSyntheticType(name, source, container)
		return sType
	}
	
	def SEnumeration addSyntheticEnumeration(EObject container, String name, DEnumeration source, TransformationContext context)  {
		val sType = simFactory.createSEnumeration
		sType.initSyntheticType(name, source, container)
		return sType
	}
	
	def SComplexType addSyntheticComplexType(EObject container, String name, DComplexType source, TransformationContext context)  {
		val sType = switch source {
			DRootType: simFactory.createSRootType
			DRelationship: simFactory.createSRootType
			DDetailType: simFactory.createSDetailType
		}
		sType.initSyntheticType(name, source, container)
		sType.abstract = source.abstract
		switch container {
			SAggregate : container.types.add(sType)
			SInformationModel : container.types.add(sType)
		}
		return sType
	}
	
	protected def void initSyntheticType(SType t, String name, DNamedElement source, EObject container) {
		t.name = name
		t.synthetic = true
		t.deductionRule = simFactory.createSGrabRule
		t.deductionRule.source = source
		switch container {
			SAggregate : container.types.add(t)
			SInformationModel : container.types.add(t)
		}
	}
	
	def SFeature addSyntheticFeature(SComplexType container, String name, DFeature source, TransformationContext context)  {
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
			sFeature.type = context.getSType(dFeatureType)
			sFeature.multiplicity = grabMultiplicity(source.multiplicity)
			sFeature.synthetic = true
			container.features.add(sFeature)
			return sFeature
	}
	
	def SQueryParameter addSyntheticQueryParameter(SQuery container, String name, DQueryParameter source, TransformationContext context)  {
			val sParameter = simFactory.createSQueryParameter
			sParameter.name = name
			val dParameterType = source.type
			if (dParameterType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			sParameter.type = context.getSType(dParameterType)
			sParameter.multiplicity = grabMultiplicity(source.multiplicity)
			sParameter.synthetic = true
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