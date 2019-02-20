package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.DRootType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SDeductionRule
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SDomainProxy
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SFuseRule
import com.mimacom.ddd.sm.sim.SGrabAggregateRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SLiteral
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SQueryParameter
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SimUtil
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SimDerivedStateComputer implements IDerivedStateComputer {
	
	@Inject extension SimUtil
	@Inject extension SimSyntheticModelElementsUtil
	
	@Inject TransformationContext context
	
	
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
		val sTypesWithRule = model.types.filter[nature == DEDUCTION_RULE]?.toList  // cannot sort iterable 
		if (sTypesWithRule !== null) {
			Collections.sort(sTypesWithRule, new SimSTypeSorter)
			val complexSyntheticTypes = Lists.newArrayList
			for (type : sTypesWithRule) { 
				val rule = type.deductionRule
				val source = rule.source
				if (source instanceof DType) {
					val syntheticType = type.processTypeWithRule(rule, context) 
					if (syntheticType instanceof SComplexType) {
						complexSyntheticTypes.add(new SyntheticComplexTypeDescriptor(syntheticType, type as SComplexType, source as DComplexType))
					}
				}
			}
			for (desc : complexSyntheticTypes) {
				desc.addSyntheticFeatures(context)
			}
		}
		
		for (domainWithRule : model.domainProxies) {
			// TODO
		}
		
		val modelList = Lists.newArrayList(model.aggregates) // cannot add to list while iterating it
		for (aggregate : modelList) {
			model.processAggregate(aggregate, null, context)
		}
	}
	
	def  void processAggregate(SInformationModel model, SAggregate sAggregate, SDomainProxy elementWithRule, TransformationContext context) {
		var current = sAggregate
		val complexSyntheticTypes = Lists.newArrayList
		if (sAggregate.deductionRule instanceof SGrabAggregateRule) {
			var source = sAggregate.deductionRule.source
			if (source instanceof DRootType) { // aggregates don't have a name and cannot be linked to
				source = source.eContainer
			}
			if (source instanceof DAggregate) {
				current = model.addSyntheticAggregate(source, sAggregate, context)
				current.addImplicitSyntheticTypes(sAggregate, source, complexSyntheticTypes, context) // adds types but not features of complex types
			}
		} 
			
		current.addSyntheticTypes(complexSyntheticTypes, context)
		
		for (desc : complexSyntheticTypes) {
			desc.addSyntheticFeatures(context)
		}
	}
	
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
		Collections.sort(sTypesWithRule, new SimSTypeSorter)
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
	
	
	def dispatch SComplexType processTypeWithRule(SComplexType typeWithRule, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DComplexType) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = addSyntheticType(typeWithRule.eContainer, name , source, typeWithRule, context) as SComplexType
			// do not add features yet (they may refer to types that might not exist yet)
			return syntheticType
		}
		return null
	}
	
	def dispatch SComplexType processTypeWithRule(SComplexType typeWithRule, SMorphRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch SComplexType processTypeWithRule(SComplexType typeWithRule, SFuseRule rule, TransformationContext context) {
		// TODO need to enhance scope provider
	}
	
	def dispatch SType processTypeWithRule(SType typeWithRule, SDeductionRule rule, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
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
		val sLiteralsWithRule = sEnumWithRule.literals.filter[nature == DEDUCTION_RULE]
		val sLiteralsWithRuleList = sLiteralsWithRule.toList  // cannot change iterable while iterating => create new list
		for (sLiteral : sLiteralsWithRuleList) {
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
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature featureWithRule, SGrabRule rule, TransformationContext context) {
		grabFeature(container, featureWithRule, rule, context)
	}
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature featureWithRule, SMorphRule rule, TransformationContext context) {
		val syntheticFeature = grabFeature(container, featureWithRule, rule, context)
		if (syntheticFeature !== null) {
			if (rule.retypeTo !== null) {
				syntheticFeature.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticFeature.multiplicity = rule.remultiplyTo
			}
		}
	}
	
	def  dispatch void processFeatureWithRule(SComplexType container, SFeature featureWithRule, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SComplexType
	}
	
	def  SFeature grabFeature(SComplexType container, SFeature featureWithRule, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DFeature) {
			val syntheticFeature = container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, featureWithRule, context)
			
			if (featureWithRule instanceof SQuery) {
				val syntheticQuery = syntheticFeature as SQuery
				val sParametersWithRule = featureWithRule.parameters.filter[nature == DEDUCTION_RULE]
				if (! sParametersWithRule.exists[deductionRule instanceof SGrabRule]) {
					// there are not explicit grabs, so implicitly grab all features without a rule:
					val implicitlyGrabbedDParameters = Lists.newArrayList((source as DQuery).parameters)
					val dParametersAffectedByRule = sParametersWithRule.filter[deductionRule.source instanceof DQueryParameter].map[deductionRule.source as DQueryParameter]
					implicitlyGrabbedDParameters.removeAll(dParametersAffectedByRule)
					// create synthetic SFeatures for implicit features:
					for (dParameter : implicitlyGrabbedDParameters) {
						syntheticQuery.addSyntheticQueryParameter(dParameter.name, dParameter, null, context)
					}
				}
				
				val sParametersWithRuleList = sParametersWithRule.toList  // cannot change iterable while iterating
				for (sParameter : sParametersWithRuleList) {
					syntheticQuery.processQueryParameterWithRule(sParameter, sParameter.deductionRule, context)
				}
			}
			return syntheticFeature
		}
		return null
	}
	
	def void addSyntheticFeatures(SyntheticComplexTypeDescriptor desc, TransformationContext context) {
		var Iterable<SFeature> sFeaturesWithRule = Lists.newArrayList
		if (desc.typeWithRule !== null) {
			sFeaturesWithRule = desc.typeWithRule.features.filter[nature == DEDUCTION_RULE]
		}
		if (! sFeaturesWithRule.exists[deductionRule instanceof SGrabRule]) {
			// there are no explicit grabs, so implicitly grab all features without a rule:
			val implicitlyGrabbedDFeatures = Lists.newArrayList(desc.source.allFeatures)
			val dFeaturesAffectedByRule = sFeaturesWithRule.filter[deductionRule.source instanceof DFeature].map[deductionRule.source as DFeature]
			implicitlyGrabbedDFeatures.removeAll(dFeaturesAffectedByRule)
			// create synthetic SFeatures for implicit features:
			for (dFeature : implicitlyGrabbedDFeatures) {
				desc.syntheticType.addSyntheticFeature(dFeature.name, dFeature, null, context)
			}
		}
		
		val sFeaturesWithRuleList = sFeaturesWithRule.toList  // cannot change iterable while iterating => create new list
		for (sFeature : sFeaturesWithRuleList) {
			desc.syntheticType.processFeatureWithRule( sFeature, sFeature.deductionRule, context)
		}
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
			val syntheticParameter = container.addSyntheticQueryParameter(if (rule.renameTo !== null) rule.renameTo else source.name, source, sParameter, context)
			return syntheticParameter
		}
	}
	
	def  dispatch void processQueryParameterWithRule(SQuery container, SQueryParameter sParameter, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SQuery)
	}
	
}