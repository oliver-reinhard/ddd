/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx

import com.google.inject.Injector
import com.mimacom.ddd.dm.dmx.DmxPackage
import org.eclipse.emf.ecore.EPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DmxStandaloneSetup extends DmxStandaloneSetupGenerated {

	def static void doSetup() {
		new DmxStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(DmxPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(DmxPackage.eNS_URI, DmxPackage.eINSTANCE);
		} // consider registering the subpackages as well
		super.register(injector)
	}
}
