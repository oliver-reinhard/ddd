/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.scoping

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDomainEvent
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFunction
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DService
import com.mimacom.ddd.dm.base.INavigableMemberContainer
import com.mimacom.ddd.dm.dmx.DAssignment
import com.mimacom.ddd.dm.dmx.DContextReference
import com.mimacom.ddd.dm.dmx.DFunctionCall
import com.mimacom.ddd.dm.dmx.DNavigableMemberReference
import com.mimacom.ddd.dm.dmx.DSelfExpression
import com.mimacom.ddd.dm.dmx.DmxPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping for expressions and {@link DComplexType} feature inheritance.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class DmxScopeProvider extends AbstractDmxScopeProvider {

	static val BASE = BasePackage.eINSTANCE
	static val DMX = DmxPackage.eINSTANCE

	override IScope getScope(EObject context, EReference reference) {

		if (reference == DMX.DContextReference_Target) {
			val outer = getDefaultScopeForType(context, BASE.IPrimaryNavigationTarget)
			val scope = getPrecedingNavigableMembersScope(context, outer)
			return scope

		} else if (reference == DMX.DNavigableMemberReference_Member) {
			if (context instanceof DNavigableMemberReference) {
				if (context.isExplicitOperationCall) {
					getDefaultScopeForType(context, BASE.DFunction)
				} else {
					return getNavigableMemberReferencesScope(context.getMemberContainerReference)
				}
			}

		} else if (reference == DMX.DAssignment_Member) {
			if (context instanceof DAssignment) {
				return getAssignmentMemberScope(context, reference)
			}
		}

		return super.getScope(context, reference)
	}
	
	/*
	 * Obtains the default scope for the given reference, then narrows the result down to the given type.
	 */
	def IScope getDefaultScopeForType(EObject context, EClass type) {
		val reference = EcoreFactory.eINSTANCE.createEReference
		// Default scoping only uses the EType field of the reference:
		reference.EType = type
		val scope = super.getScope(context, reference)
		return scope
	}

	protected def IScope getNavigableMemberReferencesScope(EObject memberContainerReference) {
	// NOTE: memberContainerReference is the predecessor in a NAVIGATION, i.e. the object that OWNS the member that shall be
	// nagivated in this step, NOT the eContainer that owns the expression!
	
		if (memberContainerReference instanceof DContextReference) {
			val memberContainer = memberContainerReference.target
			val targetType = switch memberContainer {
				DEnumeration: memberContainer // memberContainer.type is always null !
				DNavigableMember: memberContainer.getType 
				INavigableMemberContainer: memberContainer
				default: null
			}
			return switch targetType {
				DEnumeration: Scopes.scopeFor(targetType.literals) // type is null
				DComplexType: getOwnAndInheritedFeaturesScope(targetType)
				DQuery: Scopes.scopeFor(targetType.parameters)
				DService: Scopes.scopeFor(targetType.parameters)
				DDomainEvent: getDomainEventNavigableMemberScope(targetType, IScope.NULLSCOPE)
				default: IScope.NULLSCOPE
			}

		} else if (memberContainerReference instanceof DSelfExpression) {
			
			return getPrecedingNavigableMembersScope(memberContainerReference, IScope.NULLSCOPE)

		} else if (memberContainerReference instanceof DNavigableMemberReference) {
			val member = memberContainerReference.getMember
			if (member instanceof DNavigableMember) {
				val type = member.getType
				if (type instanceof DComplexType) {
					return getOwnAndInheritedFeaturesScope(type)
				}
			}

		} else if (memberContainerReference instanceof DFunctionCall) {
			val function = memberContainerReference.function
			if (function instanceof DFunction) {
				val type = function.getType
				if (type instanceof DComplexType) {
					return getOwnAndInheritedFeaturesScope(type)
				}
			}
		}
		return IScope.NULLSCOPE
	}

	protected def IScope getAssignmentMemberScope(DAssignment assignment, EReference reference) {
		val memberContainer = assignment.memberContainer  // member container NOT eContainer
		if (memberContainer !== null) {
			// expression starts with "self", with a type name, etc.
			return getNavigableMemberReferencesScope(memberContainer)
		} else {
			// provide members found via the parent member container closest to the expression, i.e. provide the parameters of a DQuery
			val outerScope = getDefaultScopeForType(assignment, BASE.IPrimaryNavigationTarget)
			return getPrecedingNavigableMembersScope(assignment, outerScope)
		}
	}
	
	/* Returns all DTypedMember elements of the given navigation member element. */
	final protected def IScope getPrecedingNavigableMembersScope(EObject member, IScope outerScope) {
		val preceding = EcoreUtil2.getContainerOfType(member.eContainer, INavigableMemberContainer)
		if (preceding === null) return outerScope
		getNavigableMembersScope(preceding, outerScope)
	}
	
	/**
	 * Overriders must ensure, that each type used as a discriminator in the switch statement implements  @INavigableMemberContainer, 
	 * otherwise this method will never be invoked.<p>
	 * Also, the elements included in the scope must implement @DNavigableMember.
	 */
	protected def IScope getNavigableMembersScope(INavigableMemberContainer container, IScope outerScope) {
		val scope = switch container {
			DEnumeration: Scopes.scopeFor(container.literals, outerScope)
			DComplexType: getOwnAndInheritedFeaturesScope(container, outerScope)
			DQuery: Scopes.scopeFor(container.parameters, getPrecedingNavigableMembersScope(container, outerScope)) // recursion
			DService: Scopes.scopeFor(container.parameters, outerScope)
			DDomainEvent: getDomainEventNavigableMemberScope(container, outerScope)
			default: getPrecedingNavigableMembersScope(container, outerScope) // recursion
		}
		return scope
	}

	protected def IScope getOwnAndInheritedFeaturesScope(DComplexType type) {
		getOwnAndInheritedFeaturesScope(type, IScope.NULLSCOPE)
	}

	protected def IScope getOwnAndInheritedFeaturesScope(DComplexType type, IScope outerScope) {
		if (type.superType !== null) {
			return Scopes.scopeFor(type.features, getOwnAndInheritedFeaturesScope(type.superType, outerScope)) // recursion
		} else {
			return Scopes.scopeFor(type.features, outerScope)
		}
	}

	protected def IScope getDomainEventNavigableMemberScope(DDomainEvent event, IScope outerScope) {
		val list = Lists.newArrayList()
		list.addAll(event.context)
		
		if (event.trigger !== null) {
			list.add(event.trigger)
		}
		list.addAll(event.notifications)
		return Scopes.scopeFor(list, outerScope)
	}
}
