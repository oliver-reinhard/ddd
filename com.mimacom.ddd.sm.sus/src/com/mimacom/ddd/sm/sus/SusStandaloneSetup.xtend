/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SusStandaloneSetup extends SusStandaloneSetupGenerated {

	def static void doSetup() {
		new SusStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}