/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.scoping

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DDomainEvent
import com.mimacom.ddd.dm.base.DExistingApplication
import com.mimacom.ddd.dm.base.DFunction
import com.mimacom.ddd.dm.base.DModel
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DService
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.DTypedMember
import com.mimacom.ddd.dm.base.IIdentityType
import com.mimacom.ddd.dm.dmx.DAssignment
import com.mimacom.ddd.dm.dmx.DContextReference
import com.mimacom.ddd.dm.dmx.DFunctionCall
import com.mimacom.ddd.dm.dmx.DSelfExpression
import com.mimacom.ddd.dm.dmx.DTypedMemberReference
import com.mimacom.ddd.dm.dmx.DmxPackage
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope

/**
 * This class contains custom scoping for expressions and {@link DComplexType} feature inheritance.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class DmxScopeProvider extends AbstractDmxScopeProvider {

	val epackage = DmxPackage.eINSTANCE

	override IScope getScope(EObject context, EReference reference) {

		if (reference == epackage.DContextReference_ContextElement) {
			val outer = getPrimaryNavigationTargetScope(context, reference)
			return getExpressionContainerMemberScope(context, outer)

		} else if (reference == epackage.DTypedMemberReference_Member) {
			if (context instanceof DTypedMemberReference) {
				return getMemberReferenceScope(context.memberContainer)
			}

		} else if (reference == epackage.DAssignment_Member) {
			if (context instanceof DAssignment) {
				return getAssignmentMemberScope(context, reference)
			}

		} else if (reference == epackage.DFunctionCall_Function && context instanceof DFunction) {
			return getFunctionReferenceScope(context as DFunction)

		} else if (reference == epackage.DConstructorCall_Constructor) {
			// instantiable types => RootType, Relationship
			return getContainerTypesOfTypeScope(context, reference, IIdentityType, false)

		} else if (reference == epackage.DInstanceOfExpression_Type || reference == epackage.DCastExpression_Type) {
			return getContainerTypesOfTypeScope(context, reference, DType, false)

		}

		return super.getScope(context, reference)
	}

	protected def IScope getPrimaryNavigationTargetScope(EObject context, EReference reference) {
		val model = context.eResource.contents.head as DModel
		val modelChildren = new ArrayList<EObject>()
		modelChildren.addAll(model.globalTypes)
		val domain = model.domain
		if (domain === null) {
			return Scopes.scopeFor(modelChildren)
		}
		modelChildren.addAll(domain)
		
		var  outerScope = Scopes.scopeFor(modelChildren)
		val importedDomainScope = getImportedObjectsOfTypeScope(domain, reference, EObject)
		
		outerScope = new SimpleScope(outerScope, importedDomainScope.allElements)

		val domainChildren = Lists.newArrayList()
		domainChildren.addAll(domain.types)
		domainChildren.addAll(domain.actors)
		domainChildren.addAll(domain.events)
		domainChildren.addAll(domain.applications)
		
		outerScope = Scopes.scopeFor(domainChildren, outerScope)

		for (a : domain.applications) {
			// add a new scope for every application (nested scopes are lists, not trees)
			outerScope = Scopes.scopeFor(a.services, outerScope)
		}
		return outerScope
	}

	protected def IScope getMemberReferenceScope(EObject memberContainer) {
	// NOTE: memberContainer is the predecessor in a NAVIGATION, i.e. the object that OWNS the member that shall be
	// nagivated in this step, NOT the eContainer that owns the expression!
	
		if (memberContainer instanceof DContextReference) {
			val context = memberContainer.contextElement
			if (context instanceof DTypedMember) {
				val type = context.type
				return switch type {
					DComplexType: getInheritedFeaturesScope(type)
					DQuery: Scopes.scopeFor(type.parameters)
					DService: Scopes.scopeFor(type.parameters)
					DDomainEvent: getDomainEventMemberScope(type, IScope.NULLSCOPE)
					default: IScope.NULLSCOPE
				}
			}

		} else if (memberContainer instanceof DSelfExpression) {
			return getExpressionContainerMemberScope(memberContainer, IScope.NULLSCOPE)

		} else if (memberContainer instanceof DTypedMemberReference) {
			val member = memberContainer.member
			if (member instanceof DTypedMember) {
				val type = member.type
				if (type instanceof DComplexType) {
					return getInheritedFeaturesScope(type)
				}
			}

		} else if (memberContainer instanceof DFunctionCall) {
			val function = memberContainer.function
			if (function instanceof DFunction) {
				val type = function.type
				if (type instanceof DComplexType) {
					return getInheritedFeaturesScope(type)
				}
			}
		}
		return IScope.NULLSCOPE
	}

	protected def IScope getAssignmentMemberScope(DAssignment assignment, EReference reference) {
		val memberContainer = assignment.memberContainer  // member container NOT eContainer
		if (memberContainer !== null) {
			// expression starts with "self", with a type name, etc.
			return getMemberReferenceScope(memberContainer)
		} else {
			// provide members found via the parent member container closest to the expression, i.e. provide the parameters of a DQuery
			val outerScope = getPrimaryNavigationTargetScope(assignment, reference)
			return getExpressionContainerMemberScope(assignment, outerScope)
		}
	}
	
	// CANDIDATE: getMember
	protected def IScope getExpressionContainerMemberScope(EObject context, IScope outerScope) {
		var container = context.eContainer
		return switch container {
			DComplexType: getInheritedFeaturesScope(container, outerScope)
			DQuery: Scopes.scopeFor(container.parameters, getExpressionContainerMemberScope(container, outerScope))
			DService: Scopes.scopeFor(container.parameters, outerScope)
			DDomainEvent: getDomainEventMemberScope(container, outerScope)
			case null: IScope.NULLSCOPE
			default: getExpressionContainerMemberScope(container, outerScope) // recursion
		}
	}

	protected def IScope getInheritedFeaturesScope(DComplexType type) {
		getInheritedFeaturesScope(type, IScope.NULLSCOPE)
	}

	protected def IScope getInheritedFeaturesScope(DComplexType type, IScope outerScope) {
		if (type.superType !== null) {
			return Scopes.scopeFor(type.features, getInheritedFeaturesScope(type.superType, outerScope)) // recursion
		} else {
			return Scopes.scopeFor(type.features, outerScope)
		}
	}

	protected def IScope getDomainEventMemberScope(DDomainEvent event, IScope outerScope) {
		val list = Lists.newArrayList()
		list.addAll(event.context)
		
		if (event.trigger !== null) {
			list.add(event.trigger)
		}
		list.addAll(event.notifications)
		return Scopes.scopeFor(list, outerScope)
	}

	protected def IScope getFunctionReferenceScope(DFunction context) {
		return Scopes.scopeFor((context.eResource.contents.head as DModel).globalFunctions) // TODO review
	}

	protected def <T extends EObject> IScope getContainerTypesOfTypeScope(EObject context, EReference reference, Class<T> type, boolean includeImported) {
		val container = context.eContainer
		return switch container {
			case null: IScope.NULLSCOPE
			DAggregate: Scopes.scopeFor(EcoreUtil2.typeSelect(container.types, type), getContainerTypesOfTypeScope(container, reference, type, includeImported)) // recursion
			DDomain: Scopes.scopeFor(EcoreUtil2.typeSelect(container.types, type), if (includeImported) getImportedObjectsOfTypeScope(container, reference, type) else IScope.NULLSCOPE)
			DExistingApplication: Scopes.scopeFor(EcoreUtil2.typeSelect(container.types, type), 	getContainerTypesOfTypeScope(container, reference, type, includeImported)) // recursion
			//DModel: Scopes.scopeFor(EcoreUtil2.typeSelect(container.globalTypes, type), if (includeImported) getImportedObjectsOfTypeScope(container, reference, type) else IScope.NULLSCOPE)
			default: getContainerTypesOfTypeScope(container, reference, type, includeImported) // recursion => skip and move up the hiearchy
		}
	}

	protected def IScope getImportedObjectsOfTypeScope(EObject context, EReference reference, Class<? extends EObject> type) {
		// TODO: does not filter by type !
		super.getScope(context, reference)
	}
}
