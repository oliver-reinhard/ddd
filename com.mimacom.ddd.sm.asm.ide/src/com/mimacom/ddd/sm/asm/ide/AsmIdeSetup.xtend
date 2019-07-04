/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.ide

import com.google.inject.Guice
import com.mimacom.ddd.sm.asm.AsmRuntimeModule
import com.mimacom.ddd.sm.asm.AsmStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AsmIdeSetup extends AsmStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AsmRuntimeModule, new AsmIdeModule))
	}
	
}
