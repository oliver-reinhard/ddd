package com.mimacom.ddd.dm.dom.evaluator

import com.google.inject.Singleton
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.evaluator.DmxExpressionEvaluator
import com.mimacom.ddd.dm.dom.DomNamedComplexObject

@Singleton
class DomExpressionEvaluator extends DmxExpressionEvaluator {

//	@Inject extension DmxTypeDescriptorProvider
//	@Inject extension DmxTypeComputer
//	@Inject extension DmxUtil util

	/* Non-dispatching; use to override */
	override Object valueForContextReferenceSwitch(DmxContextReference expr) {
		val target = expr.target

		if (target instanceof DomNamedComplexObject) {
			return target.object
		}
		
		return super.valueForContextReferenceSwitch(expr)
	}
}
