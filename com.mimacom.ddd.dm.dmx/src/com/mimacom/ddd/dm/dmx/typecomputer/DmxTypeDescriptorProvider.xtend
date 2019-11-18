package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DNotification
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.dmx.DmxArchetype
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor
import com.mimacom.ddd.dm.dmx.DmxUtil
import java.util.List
import org.eclipse.emf.ecore.EObject

@Singleton
class DmxTypeDescriptorProvider {
	
	@Inject extension DmxUtil util
	
	public static val VOID = new DmxVoidDescriptor
	public static val UNDEFINED_TYPE = new DmxUndefinedDescriptor(false)
	public static val UNDEFINED_TYPE_COLLECTION = new DmxUndefinedDescriptor(true)
	public static val AMBIGUOUS_TYPE = new DmxAmbiguousDescriptor
	public static val BOOLEAN = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, false)
	public static val BOOLEAN_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, true)
	public static val NUMBER = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, false)
	public static val NUMBER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, true)
	public static val TEXT = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, false)
	public static val TEXT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, true)
	public static val IDENTIFIER = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, false)
	public static val IDENTIFIER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, true)
	public static val TIMEPOINT = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, false)
	public static val TIMEPOINT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, true)
	

	def AbstractDmxTypeDescriptor<?> getTypeDescriptor(Object obj, boolean collection) {
		if (obj instanceof EObject && (obj as EObject).eIsProxy) {
//			throw new IllegalStateException("Unresolved EObject (system type?): " + obj)
			return DmxTypeDescriptorProvider.UNDEFINED_TYPE
		}
		switch obj {
			DmxBaseType: getBaseTypeDescriptor(obj, collection)
			DmxArchetype: new DmxPrimitiveDescriptor(obj, collection)
			DPrimitive: new DmxPrimitiveDescriptor(obj, collection)
			DEnumeration: new DmxEnumerationDescriptor(obj, collection)
			DComplexType: new DmxComplexTypeDescriptor(obj, collection, util)
			DState: new DmxStateDescriptor(obj, collection)
			DAggregate: new DmxAggregateDescriptor(obj, collection)
			DNotification: new DmxNotificationDescriptor(obj, collection)
			default: DmxTypeDescriptorProvider.UNDEFINED_TYPE
		}
	}
	
	def AbstractDmxTypeDescriptor<?> toFromCollection(AbstractDmxTypeDescriptor<?> obj, boolean collection) {
		 if (obj.collection == collection) {
			return obj
		} else if (obj instanceof DmxBaseTypeDescriptor) {
			return getTypeDescriptor(obj.baseType, collection)
		}
		val desc = obj.clone
		desc.collection = collection
		return desc
	}
	
	def List<AbstractDmxTypeDescriptor<?>> getTypeDescriptors(DmxFilterTypeDescriptor desc) {
		val result = Lists.newArrayList
		if (desc.multiTyped) {
			for(d : desc.multiple.members) {
				result.add(getBaseTypeDescriptor(d, desc.collection))
			}
		} else {
			result.add(getBaseTypeDescriptor(desc.single, desc.collection))
		}
		return result
	}

	private def AbstractDmxTypeDescriptor<?> getBaseTypeDescriptor(DmxBaseType t, boolean collection) {
		switch t {
			case DmxBaseType::VOID: VOID
			case DmxBaseType::BOOLEAN: if (collection) BOOLEAN_COLLECTION else BOOLEAN
			case DmxBaseType::NUMBER: if (collection) NUMBER_COLLECTION else NUMBER
			case DmxBaseType::TEXT: if (collection) TEXT_COLLECTION else TEXT
			case DmxBaseType::IDENTIFIER: if (collection) IDENTIFIER_COLLECTION else IDENTIFIER
			case DmxBaseType::TIMEPOINT: if (collection) TIMEPOINT_COLLECTION else TIMEPOINT
			case DmxBaseType::STATE:  throw new IllegalArgumentException("State type descriptors must be created based on a DState object")
			default: throw new IllegalArgumentException(t.toString)
		}
	}
}