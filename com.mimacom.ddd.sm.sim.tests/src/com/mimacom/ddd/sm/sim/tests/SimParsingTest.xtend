/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sim.tests

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.sm.sim.SystemInformationModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(SimInjectorProvider)
class SimParsingTest {
	@Inject
	ParseHelper<DNamespace> parseHelper
	
	@Test
	def void loadModel() {
		val smNS = parseHelper.parse('''
			system DM
			core information model SIM {
				add primitive DT redefines AT
				add enumeration En { L1, L2 }
			}
		''')
		assertNoParseErrors(smNS, "dm")
		val sim = smNS.model as SystemInformationModel
		assertNotNull(sim)
	}
	

	protected def assertNoParseErrors(DNamespace ns, String name) {
		assertNotNull(ns)
		val errors = ns.eResource.errors
		assertTrue(errors.isEmpty, '''Unexpected errors in «name» ': «errors.join(", ")»''')
	}
}
