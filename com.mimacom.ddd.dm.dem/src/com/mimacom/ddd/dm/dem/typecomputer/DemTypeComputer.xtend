package com.mimacom.ddd.dm.dem.typecomputer

import com.google.inject.Inject
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import com.mimacom.ddd.dm.dem.DemNotification

class DemTypeComputer extends DmxTypeComputer {
	
	@Inject extension DemTypeDescriptorProvider
	
	override AbstractDmxTypeDescriptor<?> typeForContextReferenceSwitch(DmxContextReference expr) {
		val target = expr.target

		if (target instanceof DemNotification) {
			return getTypeDescriptor(target, false)
		}
		return super.typeForContextReferenceSwitch(expr)
	}
}