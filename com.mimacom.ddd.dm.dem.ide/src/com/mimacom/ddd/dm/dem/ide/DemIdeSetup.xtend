/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.ide

import com.google.inject.Guice
import com.mimacom.ddd.dm.dem.DemRuntimeModule
import com.mimacom.ddd.dm.dem.DemStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DemIdeSetup extends DemStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DemRuntimeModule, new DemIdeModule))
	}
	
}
