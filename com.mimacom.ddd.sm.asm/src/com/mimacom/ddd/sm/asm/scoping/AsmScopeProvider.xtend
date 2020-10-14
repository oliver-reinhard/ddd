/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.scoping

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer
import com.mimacom.ddd.dm.base.base.ITransposition
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.mimacom.ddd.sm.sim.SystemInformationModel
import com.mimacom.ddd.sm.asm.AsmServiceInterface
import com.mimacom.ddd.sm.asm.AsmServiceParameter

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AsmScopeProvider extends AbstractAsmScopeProvider {

	static val BASE = BasePackage.eINSTANCE

	override getScope(EObject context, EReference reference) {

		if (context instanceof AsmServiceParameter) {
			if (reference == BASE.DNavigableMember_Type) {
				val service = EcoreUtil2.getContainerOfType(context, AsmServiceInterface)
				return Scopes.scopeFor(EcoreUtil2.eAllOfType(service.getInterface, DType).filter[! (it instanceof ITransposition)], super.getScope(context, reference))
			}
		}
		super.getScope(context, reference)
	}

	protected override IScope getEContainerNavigableMembersScopeSwitch(INavigableMemberContainer container, IScope outerScope) {
		val scope = switch container {
			AsmServiceInterface: getServiceInterfaceCoreNavigableMembersScope(container.getCore, outerScope)
			default: super.getEContainerNavigableMembersScopeSwitch(container, outerScope)
		}
		return scope	
	}
	
	protected def IScope getServiceInterfaceCoreNavigableMembersScope(SystemInformationModel core, IScope outerScope) {
		val List<EObject> list = Lists.newArrayList
		//
		// TODO The types are not NavigableMembers !! They must not be made available via getEContainerNavigableMembersScopeSwitch.
		//
		list.addAll(EcoreUtil2.eAllOfType(core, DType).filter[! (it instanceof ITransposition)])
		Scopes.scopeFor(list, outerScope)
	}
}
