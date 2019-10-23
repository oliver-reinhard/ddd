package com.mimacom.ddd.dm.dom.typecomputer

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider
import com.mimacom.ddd.dm.dom.DomDetail
import com.mimacom.ddd.dm.dom.DomField

import static com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider.*
import com.mimacom.ddd.dm.dom.DomNamedComplexObject

@Singleton
class DomTypeComputer extends DmxTypeComputer {

	@Inject extension DmxTypeDescriptorProvider

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DomDetail expr) {
		if (expr.ref === null) return UNDEFINED
		return getTypeDescriptor(expr.ref, false)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DomField expr) {
		if (expr.ref === null || expr.ref.type === null) return UNDEFINED
		return getTypeDescriptor(expr.ref.type, expr.ref.collection)
	}
	
	override AbstractDmxTypeDescriptor<?> typeForSwitch(DmxContextReference expr) {
		val target = expr.target
		if (target instanceof DomNamedComplexObject) {
			return typeFor(target.object)
		} 
		return super.typeForSwitch(expr)
	}
}
