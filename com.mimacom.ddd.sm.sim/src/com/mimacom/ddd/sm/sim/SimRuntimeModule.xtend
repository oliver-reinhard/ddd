/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim

import com.mimacom.ddd.sm.sim.derivedState.SimDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.IResourceDescription

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SimRuntimeModule extends AbstractSimRuntimeModule {

	override bindXtextResource() {
		DerivedStateAwareResource
	}
	
	def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		SimDerivedStateComputer
	}
	
	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		DerivedStateAwareResourceDescriptionManager
	}
}
