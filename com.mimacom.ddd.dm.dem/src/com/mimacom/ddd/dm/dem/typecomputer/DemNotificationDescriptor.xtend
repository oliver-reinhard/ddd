package com.mimacom.ddd.dm.dem.typecomputer

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import java.util.Objects
import com.mimacom.ddd.dm.dem.DemNotification

class DemNotificationDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DemNotification notification
	
	new(DemNotification notification, boolean collection) {
		super(DmxBaseType.NOTIFICATION, null, collection)
		this.notification = notification
	}
	
	override equals(Object other) {
		super.equals(other) && (notification === null || notification.equals((other as DemNotificationDescriptor).notification))
	}

	override int hashCode() {
		return Objects.hash(baseType, type, collection, notification);
	}
	
	override getNavigableMembers() {
		if (notification.getMessage !== null) {
			return Lists.newArrayList(notification.getMessage)
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