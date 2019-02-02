/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms

import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import com.mimacom.ddd.sm.sms.derivedState.SmsDerivedStateComputer
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SmsRuntimeModule extends AbstractSmsRuntimeModule {
	
	override bindXtextResource() {
		DerivedStateAwareResource
	}
	
	def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		SmsDerivedStateComputer
	}
	
	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		DerivedStateAwareResourceDescriptionManager
	}
}