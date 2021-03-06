/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PubStandaloneSetup extends PubStandaloneSetupGenerated {

	def static void doSetup() {
		new PubStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(PubPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(PubPackage.eNS_URI, PubPackage.eINSTANCE);
		} 
		super.register(injector)
	}
}
