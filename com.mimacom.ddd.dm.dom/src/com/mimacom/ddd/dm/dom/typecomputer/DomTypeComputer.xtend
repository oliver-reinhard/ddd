package com.mimacom.ddd.dm.dom.typecomputer

import com.google.inject.Singleton
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import com.mimacom.ddd.dm.dom.DomNamedComplexObject

@Singleton
class DomTypeComputer extends DmxTypeComputer {

	override AbstractDmxTypeDescriptor<?> typeForContextReferenceSwitch(DmxContextReference expr) {
		val target = expr.target
		if (target instanceof DomNamedComplexObject) {
			if (target.object !== null) {
				return typeFor(target.object)
			}
		}
		return super.typeForContextReferenceSwitch(expr)
	}
}
