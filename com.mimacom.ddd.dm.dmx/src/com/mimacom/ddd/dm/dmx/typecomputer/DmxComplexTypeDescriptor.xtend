package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxUtil
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex
import java.util.List
import org.eclipse.emf.ecore.EObject

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
	
	override List<DmxFilter> getSupportedIterators(EObject context, DmxIndex index) {
		return index.supportedFilters(context, baseType, collection)
	}
	
	override canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		super.canAssignTo(other) || type !== null && util.typeHierarchy(type).contains(other.type) // TODO  would prefer to use via injector
	}
}