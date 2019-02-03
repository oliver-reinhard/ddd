/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.ui.labeling

import com.google.inject.Inject
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SCondition
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SLiteral
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SimUtil
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class SimLabelProvider extends DefaultEObjectLabelProvider {

	@Inject extension SimUtil
	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	def text(SAggregate a) {
		return a.label
	}
	
	def text(SType t) {
		return t.label
	}
	
	def text(SFeature f) {
		if (f.deductionRule !== null) {
			return ">" + f.deductionRule.label
		}
		return f.label
	}
	
	def text(SCondition c) {
		return c.label
	}
	
	def text(SLiteral literal) {
		if (literal.deductionRule !== null) {
			return ">" + literal.deductionRule.label
		}
		return literal.name
	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}