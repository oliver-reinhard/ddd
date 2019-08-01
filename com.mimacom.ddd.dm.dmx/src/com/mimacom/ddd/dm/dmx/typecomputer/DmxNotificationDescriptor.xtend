package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DNotification
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxNotificationDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DNotification notification
	
	new(DNotification notification) {
		super(DmxBaseType.NOTIFICATION, null, false)
		this.notification = notification
	}
	
	def notification() {
		notification
	}
	
	override protected typeName() {
		notification.name
	}
}