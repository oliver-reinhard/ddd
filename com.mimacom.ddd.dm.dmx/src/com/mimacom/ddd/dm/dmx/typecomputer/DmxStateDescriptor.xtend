package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.base.DEntityType

class DmxStateDescriptor extends AbstractDmxTypeDescriptor<DEntityType> {
	
	new(DState state) {
		super(DmxBaseType.STATE, state.eContainer as DEntityType,  false)
		if (state === null) {
			throw new NullPointerException("state")
		}
	}
	
	override boolean canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		return isCompatibleWith(other)
	}

	override boolean isCompatibleWith(AbstractDmxTypeDescriptor<?> other) {
		other instanceof DmxStateDescriptor && type !== null && type.equals(other.type)
	}
	
	override protected typeName() {
		super.typeName() + "State"
	}
	
}