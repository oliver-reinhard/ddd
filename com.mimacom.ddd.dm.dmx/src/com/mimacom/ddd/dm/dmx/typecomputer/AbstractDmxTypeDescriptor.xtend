package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

abstract class AbstractDmxTypeDescriptor<T extends DType> {

	protected val DmxBaseType baseType
	protected val T type
	protected val boolean collection

	new(DmxBaseType baseType, T type, Boolean collection) {
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

	def boolean collection() {
		collection
	}

	def boolean canAssignTo(AbstractDmxTypeDescriptor<?> other) {
		type !== null && type.equals(other.type) && collection == other.collection
	}

	def boolean isCompatibleWith(AbstractDmxTypeDescriptor<?> other) {
		baseType !== null && baseType.equals(other.baseType) && collection == other.collection
	}

	def List<DNavigableMember> getNavigableMembers() {
		Collections.EMPTY_LIST
	}

	def List<DmxFilter> getSupportedIterators(EObject context, DmxIndex index) {
		Collections.EMPTY_LIST
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
		getNavigableMembersScope(nonNullOuter)
	}

	def IScope getNavigableMembersAndIteratorsScope(EObject context, DmxIndex index) {
		return getNavigableMembersAndIteratorsScope(context, index, null)
	}

	override toString() {
		val StringBuilder sb = new StringBuilder('[')
		sb.append(this.class.simpleName)
		sb.append(']')
		val name = typeName
		if (name !== null) {
			sb.append(" : ")
			sb.append(name)
			if (collection) sb.append('*')
		}
		sb.toString
	}

	protected def String typeName() {
		if (type !== null) type.name else null
	}
}
