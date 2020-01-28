package com.mimacom.ddd.dm.dmx.indexing

import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class DmxResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	override boolean createEObjectDescriptions(EObject obj, IAcceptor<IEObjectDescription> acceptor) {
//		if (obj instanceof DNamespace) {
//			// Don't index
//			return false
//		}
		return super.createEObjectDescriptions(obj, acceptor);
	}
}
