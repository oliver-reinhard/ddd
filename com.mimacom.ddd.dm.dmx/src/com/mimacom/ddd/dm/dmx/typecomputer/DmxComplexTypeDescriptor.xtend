package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DNavigableMember
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxUtil
import java.util.List

class DmxComplexTypeDescriptor extends AbstractDmxTypeDescriptor<DComplexType> {
	
//	 @Inject extension DmxUtil  // TODO cannot get this to work => use functions statically 
//		==> DO NOT CREATE TYPE DESCRIPTORS WITH NEW IN DmxTypeDescriptorProvider
	DmxUtil util
	
	new(DComplexType type, boolean collection, DmxUtil util) {
		super(DmxBaseType.COMPLEX, type,  collection)
		if (type === null) throw new NullPointerException("type")
		this.util = util
	}

	override boolean isCompatibleWith(AbstractDmxTypeDescriptor<?> other) {
		return canAssignTo(other)
	}
	
	/**
	 * Returns its own as well as all inherited features
	 */
	override getNavigableMembers() {
		var allFeatures = util.allFeatures(type)  // TODO  would prefer to use via injector
		return (allFeatures as Object) as List<DNavigableMember>
	}
	
	/* Check whether "other := this" is acceptable. */
	override canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		super.canAssignTo(other) || other !== null && util.typeHierarchy(type).contains(other.type) // TODO  would prefer to use via injector
	}
}