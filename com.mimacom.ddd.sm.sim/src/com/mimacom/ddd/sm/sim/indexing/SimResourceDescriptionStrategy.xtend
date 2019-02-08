package com.mimacom.ddd.sm.sim.indexing

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SInformationModel
import com.google.inject.Singleton

@Singleton
class SimResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	/*
	 * Prevents indexing of deduction rules and of information models with attribute deduced = true
	 */
	override boolean createEObjectDescriptions(EObject obj, IAcceptor<IEObjectDescription> acceptor) {
		if (obj instanceof SDeducibleElement) {
			if (obj.deductionRule !== null) {
				return false
			}
		}
		if (obj.eResource !== null) {
			val model = obj.eResource.contents.head
			if (model instanceof SInformationModel) {
				if (model.deduced) {
					return false
				}
			}
		}
		return super.createEObjectDescriptions(obj, acceptor);
	}
}