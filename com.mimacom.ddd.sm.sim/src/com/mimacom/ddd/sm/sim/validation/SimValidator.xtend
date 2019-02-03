/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation

import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SimPackage
import org.eclipse.xtext.validation.Check

import static com.mimacom.ddd.sm.sim.SElementNature.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimValidator extends AbstractSimValidator {
	
	@Check
	def checkDeducedFeatures(SComplexType type) {
		if (type.nature == DEDUCTION_RULE) {
			if (type.deductionRule instanceof SGrabRule) {
				val hasDitchElements= type.features.exists[nature == DEDUCTION_RULE && deductionRule instanceof SDitchRule]
				val hasOtherElements= type.features.exists[nature == DEDUCTION_RULE && ! (deductionRule instanceof SDitchRule)]
				if ( hasDitchElements && hasOtherElements) {
					error("Cannot declare \"ditch\" rule with other kinds of rules", SimPackage.Literals.SNAMED_ELEMENT__NAME)
				}
			}
		}
	}
	
	// - only 1 SPrimitive can realize a given DPrimitive
	
	// - Complex types must map to same metatype (root -> root, etc.)
	
	// - check feature types (DetailType => value, etc.)
	
}