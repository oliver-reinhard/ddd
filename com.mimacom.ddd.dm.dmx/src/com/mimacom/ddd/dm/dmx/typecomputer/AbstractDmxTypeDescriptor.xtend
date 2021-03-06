package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DNavigableMember
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex
import java.util.Collections
import java.util.List
import java.util.Objects
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

abstract class AbstractDmxTypeDescriptor<T extends DType> implements Cloneable {

	protected val DmxBaseType baseType
	protected val T type
	protected var boolean collection

	new(DmxBaseType baseType, T type /* can be null */, boolean collection) {
		if (baseType === null) throw new NullPointerException("baseType")
		this.baseType = baseType
		this.type = type
		this.collection = collection 
	}

	def DmxBaseType baseType() {
		baseType
	}

	def T type() {
		type
	}

	def boolean isCollection() {
		collection
	}

	override equals(Object other) {
		if (other === this) return true
		if (other === null || other.class !== this.class) return false
		val obj = other as AbstractDmxTypeDescriptor<?>
		return baseType === obj.baseType && (type === null && obj.type === null || type.equals(obj.type)) && collection == obj.collection
	}

	override int hashCode() {
		return Objects.hash(baseType, type, collection);
	}

	/**
	 * Used to adjust value for special cases.
	 */
	def boolean setCollection(boolean value) {
		collection = value
	}

	/* Check whether "other := this" is acceptable. */
	def boolean canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		type !== null && other !== null && type.equals(other.type) && collection == other.collection
	}

	def boolean isCompatibleWith(AbstractDmxTypeDescriptor<?> other) {
		other !== null && baseType.equals(other.baseType) && collection == other.collection
	}

	def List<DNavigableMember> getNavigableMembers() {
		Collections.EMPTY_LIST
	}

	def List<DmxFilter> getSupportedIterators(EObject context, DmxIndex index) {
		return index.supportedFilters(context, baseType, collection)
	}

	def IScope getNavigableMembersScope(IScope outer) {
		val nonNullOuter = if (outer !== null) outer else IScope.NULLSCOPE
		val members = getNavigableMembers()
		if (members === Collections.EMPTY_LIST) {
			return nonNullOuter
		} else {
			Scopes.scopeFor(members, nonNullOuter)
		}
	}

	def IScope getNavigableMembersScope() {
		getNavigableMembersScope(null)
	}

	def IScope getNavigableMembersAndIteratorsScope(EObject context, DmxIndex index, IScope outer) {
		var nonNullOuter = if (outer !== null) outer else IScope.NULLSCOPE
		val iterators = getSupportedIterators(context, index)
		if (iterators !== Collections.EMPTY_LIST) {
			nonNullOuter = Scopes.scopeFor(iterators, nonNullOuter)
		}
		return getNavigableMembersScope(nonNullOuter)
	}

	def IScope getNavigableMembersAndIteratorsScope(EObject context, DmxIndex index) {
		return getNavigableMembersAndIteratorsScope(context, index, null)
	}

	def displayName() {
		val StringBuilder sb = new StringBuilder
		if (collection) sb.append('collection of ')
		if (typeName !== null) {
			sb.append(typeName)
		} else {
			sb.append(baseType.literal)
		}
		sb.toString
	}

	override toString() {
		val StringBuilder sb = new StringBuilder('[')
		sb.append(this.class.simpleName)
		sb.append('] : ')
		val name = typeName
		if (name !== null) {
			sb.append(name)
			if (collection) sb.append('*')
			sb.append(" is ")
		}
		sb.append(baseType.literal)
		if (collection) sb.append('*')
		sb.toString
	}

	protected def String typeName() {
		if (type !== null) type.name else null
	}

	override AbstractDmxTypeDescriptor<?> clone() {
		return super.clone() as AbstractDmxTypeDescriptor<?>;
	}
}
