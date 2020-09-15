package com.mimacom.ddd.dm.dmx.indexing

import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DNamespace
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class DmxResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	protected static val LOGGER = Logger.getLogger(DmxResourceDescriptionStrategy)
	
	override boolean createEObjectDescriptions(EObject obj, IAcceptor<IEObjectDescription> acceptor) {
		if (obj instanceof DNamespace) {
			// Don't index
			return true // = index children
		}
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			if (getQualifiedNameProvider() === null)
				return false;
			try {
				val qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(obj);
				if (qualifiedName !== null) {
					val desc = EObjectDescription.create(qualifiedName, obj)
					acceptor.accept(desc);
					LOGGER.debug("OBJ " + obj.eResource.URI.path + " - " + qualifiedName + ": " + obj.eClass.name)
				}
			} catch (Exception exc) {
				LOGGER.error(exc.getMessage(), exc);
			}
			return true;
		} else {
			return super.createEObjectDescriptions(obj, acceptor);
		}
	}
}
