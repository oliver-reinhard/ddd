package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DNotification
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxNotificationDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DNotification notification
	
	new(DNotification notification) {
		super(DmxBaseType.NOTIFICATION, null, false)
		this.notification = notification
	}
	
	override getNavigableMembers() {
		if (notification.message !== null) {
			return Lists.newArrayList(notification.message)
		}
		return super.navigableMembers
	}
	
	def notification() {
		notification
	}
	
	override protected typeName() {
		notification.name
	}
}