/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation

import com.mimacom.ddd.dm.dim.validation.TransposedDimValidator
import java.util.List
import org.eclipse.emf.ecore.EPackage

/**
 * This class contains custom validation rules. 
 */
class SimValidator extends TransposedDimValidator {

	static val SimValidatorEPackages simValidatorEPackages = new SimValidatorEPackages()
	
	override List<EPackage> getEPackages() {
		// take advantage of generated code
		return simValidatorEPackages.EPackages
	}
}
