/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SusStandaloneSetup extends SusStandaloneSetupGenerated {

	def static void doSetup() {
		new SusStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(SusPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(SusPackage.eNS_URI, SusPackage.eINSTANCE);
		} 
		super.register(injector)
	}
}
