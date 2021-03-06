/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.ide

import com.google.inject.Guice
import com.mimacom.ddd.sm.sim.SimRuntimeModule
import com.mimacom.ddd.sm.sim.SimStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SimIdeSetup extends SimStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SimRuntimeModule, new SimIdeModule))
	}
	
}
