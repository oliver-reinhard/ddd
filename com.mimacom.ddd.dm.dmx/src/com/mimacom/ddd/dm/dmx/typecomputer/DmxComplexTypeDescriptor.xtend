package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxUtil
import java.util.List
import org.eclipse.emf.ecore.EObject
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex

class DmxComplexTypeDescriptor extends AbstractDmxTypeDescriptor<DComplexType> {
	
//	 @Inject extension DmxUtil  // TODO cannot get this to work => use functions statically
	DmxUtil util
	
	new(DComplexType type, boolean collection, DmxUtil util) {
		super(DmxBaseType.COMPLEX, type,  collection)
		if (type === null) {
			throw new NullPointerException("type")
		}
		this.util = util
	}
	
	/**
	 * Returns its own as well as all inherited features
	 */
	override getNavigableMembers() {
		var allFeatures = util.allFeatures(type)  // TODO  would prefer to use via injector
		if (type instanceof DEntityType) {
			if (! type.states.empty) {
				val allMembers = Lists.newArrayList((allFeatures as Object) as List<DNavigableMember>)
				allMembers.addAll(type.states)
				return allMembers
			}
		}
		return (allFeatures as Object) as List<DNavigableMember>
	}
	
	override getSupportedIterators(EObject context, DmxIndex index) {
		val iterators = super.getSupportedIterators(context, index)
		if (! (type instanceof DEntityType)) {
			return iterators.filter[name != util.ENTITY_TYPE_STATE_FILTER_NAME].toList
		}
		return iterators
	}
	
	override canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		super.canAssignTo(other) || other !== null && util.typeHierarchy(type).contains(other.type) // TODO  would prefer to use via injector
	}
}