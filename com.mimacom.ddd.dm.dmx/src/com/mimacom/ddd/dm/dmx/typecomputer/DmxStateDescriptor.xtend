package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DState
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxStateDescriptor extends AbstractDmxTypeDescriptor<DEntityType> {
	
	new(DState state, boolean collection) {
		super(DmxBaseType.STATE, state?.eContainer as DEntityType,  collection)
		if (state === null) {
			throw new NullPointerException("state")
		}
	}
	
	override boolean canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		return isCompatibleWith(other)
	}

	override boolean isCompatibleWith(AbstractDmxTypeDescriptor<?> other) {
		other instanceof DmxStateDescriptor && type !== null && type.equals(other.type) && collection == other.collection
	}
	
	override protected typeName() {
		super.typeName() + "State"
	}
	
}