package com.mimacom.ddd.dm.base.modelDeduction

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager

class TrueDerivedStateAwareResourceDescriptionManager extends DerivedStateAwareResourceDescriptionManager {
	
	override getResourceDescription(Resource resource) { 
		if (resource instanceof DerivedStateAwareResource) {
			if (!resource.isFullyInitialized) {
				resource.installDerivedState(true)
			}
		}
		super.getResourceDescription(resource)
	}
	
}