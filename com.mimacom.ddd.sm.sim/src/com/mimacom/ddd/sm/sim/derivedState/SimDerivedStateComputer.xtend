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
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DRelationship
import com.mimacom.ddd.dm.base.DRootType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SDeductionRule
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SDomain
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SFuseRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SimFactory
import com.mimacom.ddd.sm.sim.SimUtil
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext.UnsupportedDomainTypeException
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SimDerivedStateComputer implements IDerivedStateComputer {
	
	@Inject extension SimUtil
	
	static Logger LOGGER = Logger.getLogger(SimDerivedStateComputer);
	static val smsFactory = SimFactory.eINSTANCE
	static val UNDEFINED = "UNDEFINED"
	
	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!preLinkingPhase) {
			// make sure we start with fresh type maps:
			val context = new TransformationContext(resource)
			
			val domain = resource.allContents.head as SDomain
			processDomain(domain, context)
		}
	}
	
	def  void processDomain(SDomain domain, TransformationContext context) {
		val typesToDeduce = domain.types.filter[nature == DEDUCTION_RULE]
		for (type : typesToDeduce.toList) {  // cannot change iterable while iterating
			type.processType(type.deductionRule, context) 
		}
		
		val domainList = Lists.newArrayList(domain.aggregates) // cannot add to list while iterating it
		for (aggregate : domainList) {
			aggregate.processAggregate(context)
		}
	}
	
	def  void processAggregate(SAggregate aggregate, TransformationContext context) {
		var current = aggregate
		if (aggregate.deductionRule !== null) {
			val source = aggregate.deductionRule
			if (source instanceof DAggregate) {
				current = addSyntheticAggregate(aggregate.eContainer as SDomain, source, context)
				
				for (type : source.types) {
					// TODO create types and their members
				}
			}
		} 
		val typesToDeduce = current.types.filter[nature == DEDUCTION_RULE]
		for (type : typesToDeduce.toList) { // cannot change iterable while iterating
			type.processType(type.deductionRule, context)
		}
	}
	
	def SAggregate addSyntheticAggregate(SDomain container, DAggregate source, TransformationContext context) throws UnsupportedDomainTypeException {
		val sAggregate = smsFactory.createSAggregate
		sAggregate.synthetic = true
		container.aggregates.add(sAggregate)
		return sAggregate
	}
	
	def dispatch void processType(SEnumeration sEnum, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DEnumeration) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticEnum = addSyntheticEnumeration(sEnum.eContainer as SAggregate, name , source, context)
			
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
	
	def SEnumeration addSyntheticEnumeration(EObject container, String name, DEnumeration source, TransformationContext context) throws UnsupportedDomainTypeException {
		val sType = smsFactory.createSEnumeration
		sType.name = name
		sType.synthetic = true
		switch container {
			SAggregate : container.types.add(sType)
			SDomain : container.types.add(sType)
		}
		return sType
	}
	
	def void addSyntheticLiteral(SEnumeration container, String name) {
		val sLiteral = smsFactory.createSLiteral
		sLiteral.name = name
		sLiteral.synthetic = true
		container.literals.add(sLiteral)
	}
	
	
	def dispatch void processType(SComplexType sType, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DComplexType) {
			val name = if (rule.renameTo !== null) rule.renameTo else source.name
			val syntheticType = addSyntheticComplexType(sType.eContainer as SAggregate, name , source, context)
			
			val sFeaturesWithExplicitRule = sType.features.filter[nature == DEDUCTION_RULE]
			
			if (! sFeaturesWithExplicitRule.exists[deductionRule instanceof SGrabRule]) {
				// there are not explicit grabs, so implicitly grab all features without a rule:
				val implicitlyGrabbedDFeatures = Lists.newArrayList(source.allFeatures)
				val dFeaturesAffectedByRule = sFeaturesWithExplicitRule.filter[deductionRule.source instanceof DFeature].map[deductionRule.source as DFeature]
				implicitlyGrabbedDFeatures.removeAll(dFeaturesAffectedByRule)
				// create synthetic SFeatures for implicit features:
				for (dFeature : implicitlyGrabbedDFeatures) {
					try {
						syntheticType.addSyntheticFeature(dFeature.name, dFeature, context)
					} catch (UnsupportedDomainTypeException ex) {
						LOGGER.error(dFeature, ex)
					}
				}
			}
			
			val sFeaturesWithExplicitRuleList = sFeaturesWithExplicitRule.toList  // cannot change iterable while iterating
			for (sFeature : sFeaturesWithExplicitRuleList) {
				val featureRule = sFeature.deductionRule
				switch  featureRule {
					SDitchRule: ditchFeature(syntheticType, sFeature, featureRule, context)
					SMorphRule: morphFeature(syntheticType, sFeature, featureRule, context)
					SGrabRule: grabFeature(syntheticType, sFeature, featureRule, context)
				}
			}
		}
	}
	
	def SComplexType addSyntheticComplexType(EObject container, String name, DComplexType source, TransformationContext context) throws UnsupportedDomainTypeException {
		val sType = switch source {
			DRootType: smsFactory.createSRootType
			DRelationship: smsFactory.createSRootType
			DDetailType: smsFactory.createSDetailType
		}
		sType.name = name
		sType.abstract = source.abstract
		sType.synthetic = true
		switch container {
			SAggregate : container.types.add(sType)
			SDomain : container.types.add(sType)
		}
		return sType
	}
	
	def dispatch void processType(SComplexType type, SMorphRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch void processType(SComplexType type, SFuseRule rule, TransformationContext context) {
		// TODO
	}
	
	def dispatch void processType(SType type, SDeductionRule rule, TransformationContext context) {
		throw new UnsupportedOperationException() // catch-all => should not occur
	}
	
	def SFeature addSyntheticFeature(SComplexType container, String name, DFeature source, TransformationContext context) throws UnsupportedDomainTypeException {
			val sFeature = switch source {
				DAttribute: smsFactory.createSAttribute
				DQuery: smsFactory.createSQuery
				DAssociation: smsFactory.createSAssociation
			}
			sFeature.name = name
			val dFeatureType = source.type
			if (dFeatureType === null) {  // the domain model is (temporarily incomplete => don't add sFeature now
				return null 
			}
			sFeature.type = context.getSType(dFeatureType)
			if (source.multiplicity !== null) {
				sFeature.multiplicity = smsFactory.createSMultiplicity
				sFeature.multiplicity.minOccurs = source.multiplicity.minOccurs
				sFeature.multiplicity.maxOccurs = source.multiplicity.maxOccurs
			}
			sFeature.synthetic = true
			container.features.add(sFeature)
			return sFeature
	}
	
	def  SFeature grabFeature(SComplexType container, SFeature sFeature, SGrabRule rule, TransformationContext context) {
		val source = rule.source
		if (source instanceof DFeature) {
			try {
				return container.addSyntheticFeature(if (rule.renameTo !== null) rule.renameTo else source.name, source, context)
			} catch (UnsupportedDomainTypeException ex) {
				LOGGER.error(source, ex)
			}
		}
		return null
	}
	
	def  SFeature morphFeature(SComplexType container, SFeature sFeature, SMorphRule rule, TransformationContext context) {
		val syntheticFeature = grabFeature(container, sFeature, rule, context)
		if (syntheticFeature !== null) {
			if (rule.retypeTo !== null) {
				syntheticFeature.type = rule.retypeTo
			}
			if (rule.remultiplyTo !== null) {
				syntheticFeature.multiplicity = smsFactory.createSMultiplicity
				syntheticFeature.multiplicity.minOccurs = rule.remultiplyTo.minOccurs
				syntheticFeature.multiplicity.maxOccurs = rule.remultiplyTo.maxOccurs
			}
		}
		return syntheticFeature
	}

	
	def  SFeature ditchFeature(SComplexType container, SFeature sFeature, SDitchRule rule, TransformationContext context) {
		// do nothing (has been taken care of by SComplexType
	}
	
	override discardDerivedState(DerivedStateAwareResource resource) {
			// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
			val syntheticElements = resource.allContents.filter(SDeducibleElement).filter[synthetic !== null && synthetic]
			val list = Lists.newArrayList
			while(syntheticElements.hasNext) list.add(syntheticElements.next)
			for(e : list) {
				EcoreUtil.remove(e)
			}
	}
}