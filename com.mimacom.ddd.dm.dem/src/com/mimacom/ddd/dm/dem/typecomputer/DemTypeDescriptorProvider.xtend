package com.mimacom.ddd.dm.dem.typecomputer

import com.mimacom.ddd.dm.dem.DemNotification
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider

class DemTypeDescriptorProvider extends DmxTypeDescriptorProvider {

	override AbstractDmxTypeDescriptor<?> typeDescriptorSwitch(Object obj, boolean collection) {
		if (obj instanceof DemNotification) {
			return new DemNotificationDescriptor(obj, collection)
		}
		return super.typeDescriptorSwitch(obj, collection)
	}
}
