/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DRootType
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SAssociation
import com.mimacom.ddd.sm.sim.SAttribute
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SCondition
import com.mimacom.ddd.sm.sim.SDetailType
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SDomain
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SLiteral
import com.mimacom.ddd.sm.sim.SMultiplicity
import com.mimacom.ddd.sm.sim.SNamedElement
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SQueryParameter
import com.mimacom.ddd.sm.sim.SRootType
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SValueType
import com.mimacom.ddd.sm.sim.SimPackage
import com.mimacom.ddd.sm.sim.SimUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

import static com.mimacom.ddd.sm.sim.SElementNature.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimValidator extends AbstractSimValidator {
	
	@Inject extension SimUtil
	
	@Check
	def checkAggregateHasSingleRoot(SAggregate a) {
		val roots = a.types.filter(SRootType)
		if(roots.size > 1) {
			for (t : roots) {
				error('Aggregate can only declare a single root or relationship', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
		}
	}

// Types: restrictions on features and supertypes

	@Check
	def checkCyclicTypeHierarchy(SComplexType t) {
		if(t.typeHierarchy.contains(t)) {
			error('Type is part of a supertype cycle', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def checkSupertype(SComplexType t) {
		if(t.superType !== null) {
			if(t.superType.eClass !== t.eClass) {
				error('Supertype is not compatible', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
			val tDomain = EcoreUtil2.getContainerOfType(t, SDomain)
			val superTypeDomain = EcoreUtil2.getContainerOfType(t.superType, SDomain)
			if(superTypeDomain !== tDomain) {
				error('Supertype must be in same domain', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkNoFeatureOverrides(SComplexType t) {
		val inherited = t.inheritedFeatureNames
		for (f : t.features) {
			if(inherited.contains(f.name)) {
				error('Feature cannot override inherited feature with same name', f, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkCorrespondingDRootType(SRootType t) {
		if (t.nature == DEDUCTION_RULE) {
			if (t.deductionRule.source !== null && ! (t.deductionRule.source instanceof DRootType)) {
					error("Deduced RootType rule must have a domain-model RootType as its source", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDDetailType(SDetailType t) {
		if (t.nature == DEDUCTION_RULE) {
			if (t.deductionRule.source !== null && ! (t.deductionRule.source instanceof DDetailType)) {
					error("Deduced DetailType rule must have a domain-model DetailType as its source", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}
	
	@Check
	def void checkDeducedFeaturesCombination(SComplexType type) {
		if (type.nature == DEDUCTION_RULE) {
			if (type.deductionRule instanceof SGrabRule) {
				val hasDitchElements= type.features.exists[deductionRule instanceof SDitchRule]
				val hasGrabElements= type.features.exists[deductionRule instanceof SGrabRule]
				if ( hasDitchElements && hasGrabElements) {
					error("Cannot use both grab rule and ditch rules together.", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
				}
			}
		} 
	}
	
	@Check
	def void checkHasDeducedContainer(SFeature feature) {
		if (feature.nature == DEDUCTION_RULE) {
			val container = feature.eContainer as SComplexType
			if (container.nature != DEDUCTION_RULE) {
				error("Features can only have deduction rule if the containing type also has a deduction rule.", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDAttributeType(SAttribute a) {
		if (a.nature == DEDUCTION_RULE) {
			if (a.deductionRule.source !== null && ! (a.deductionRule.source instanceof DAttribute)) {
					error("Deduced attribute rule must have a domain-model attribute as its source", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDQueryType(SQuery q) {
		if (q.nature == DEDUCTION_RULE) {
			if (q.deductionRule.source !== null && ! (q.deductionRule.source instanceof DQuery)) {
					error("Deduced query rule must have a domain-model attribute as its source", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDAssociationType(SAssociation a) {
		if (a.nature == DEDUCTION_RULE) {
			if (a.deductionRule.source !== null && ! (a.deductionRule.source instanceof DAssociation)) {
					error("Deduced association rule must have a domain-model attribute as its source", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}
	
	@Check
	def void checkHasDeducedEnumeration(SLiteral literal) {
		if (literal.nature == DEDUCTION_RULE) {
			val container = literal.eContainer as SEnumeration
			if (container.nature != DEDUCTION_RULE) {
				error("Literals can only have deduction rule if the containing enumeration also has a deduction rule.", SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}
	
	@Check
	def checkEnumerationHasLiterals(SEnumeration e) {
		if(e.literals.size == 0) {
			warning('Enumeration does not declare literals', e,SimPackage.Literals.SNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def checkAttributeIsValueType(SAttribute a) {
		if(! (a.type instanceof SValueType)) {
			error('Refererenced type is not a ValueType', a,SimPackage.Literals.SFEATURE__TYPE)
		}
	}

	@Check
	def checkAssocitionToRootType(SAssociation a) {
		if(! (a.type instanceof SRootType)) {
			error('Refererenced type is not a RootType', a,SimPackage.Literals.SFEATURE__TYPE)
		}
	}

	@Check
	def checkAssociationMultiplicities(SMultiplicity m) {
		if(m.maxOccurs == 0) {
			error('Maximum targets cannot be 0', m,SimPackage.Literals.SMULTIPLICITY__MAX_OCCURS)
		}
	}

// // Parameters: restrictions on their types
	@Check
	def checkParameterIsValueType(SQueryParameter p) {
		if(p.type instanceof SValueType && ! (p.type == p.eContainer)) {
			error('Refererenced type is not a ValueType nor the query\'s own container', p,SimPackage.Literals.SQUERY_PARAMETER__TYPE)
		}
	}
	

	// // Naming: Elements whose names should start with a CAPITAL
	def void checkNameStartsWithCapital(SNamedElement ne) {
		val name = ne.name
		if(name !== null && name.length > 0 && !Character::isUpperCase(name.charAt(0))) {
			warning("Name should start with a capital", ne, SimPackage.Literals.SNAMED_ELEMENT__NAME)
		}
	}

//	@Check
//	def void checkTypeNameStartsWithCapital(SDomain d) {
//		if (DEFAULT_IMPORT_TYPES == d.name || DEFAULT_IMPORT_FUNCTIONS == d.name) {
//			return
//		}
//		checkNameStartsWithCapital(d)
//	}

	@Check
	def void checkTypeNameStartsWithCapital(SType t) {
		checkNameStartsWithCapital(t)
	}

	@Check
	def void checkTypeNameStartsWithCapital(SCondition c) {
		checkNameStartsWithCapital(c)
	}

// // Naming: Elements whose names should start with a LOWERCASE
	def void checkNameStartsWithLowercase(SNamedElement ne) {
		val first = ne.getName().charAt(0)
		val char underscore = '_'
		if(!Character::isLowerCase(first) && first !== underscore) {
			warning("Name should start with a lowercase or underscore", SimPackage.Literals.SNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(SFeature f) {
		checkNameStartsWithLowercase(f)
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(SQueryParameter p) {
		checkNameStartsWithLowercase(p)
	}

// // Naming: Elements whose names should be ALL UPPERCASE
	@Check def void checkLiteralIsUppercase(SLiteral literal) {
		if(! literal.name.equals(literal.name.toUpperCase)) {
			warning("Name should be all upercase", SimPackage.Literals.SNAMED_ELEMENT__NAME)
		}
	}
	
	
	// - only 1 SPrimitive can realize a given DPrimitive
	
}
