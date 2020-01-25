package com.mimacom.ddd.dm.dem.typecomputer

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dem.DNotification
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import java.util.Objects

class DmxNotificationDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DNotification notification
	
	new(DNotification notification, boolean collection) {
		super(DmxBaseType.NOTIFICATION, null, collection)
		this.notification = notification
	}
	
	override equals(Object other) {
		super.equals(other) && (notification === null || notification.equals((other as DmxNotificationDescriptor).notification))
	}

	override int hashCode() {
		return Objects.hash(baseType, type, collection, notification);
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