package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxUtil
import java.util.List

class DmxComplexTypeDescriptor extends AbstractDmxTypeDescriptor<DComplexType> {
	
//	 @Inject extension DmxUtil  // TODO cannot get this to work => use functions statically
	DmxUtil util
	
	new(DComplexType type, boolean collection, DmxUtil util) {
		super(DmxBaseType.COMPLEX, type,  collection)
		this.util = util
	}
	
	/**
	 * Returns its own as well as all inherited features
	 */
	override getNavigableMembers() {
		val allFeatures = util.allFeatures(type) //(type)  // TODO  would prefer to use via injector
		(allFeatures as Object) as List<DNavigableMember>
	}
	
	override canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		super.canAssignTo(other) || type !== null && util.typeHierarchy(type).contains(other.type) // TODO  would prefer to use via injector
	}
}