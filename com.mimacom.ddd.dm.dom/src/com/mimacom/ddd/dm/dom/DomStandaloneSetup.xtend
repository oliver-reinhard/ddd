/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomStandaloneSetup extends DomStandaloneSetupGenerated {

	def static void doSetup() {
		new DomStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
