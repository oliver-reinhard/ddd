/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.api.Disabled
import com.mimacom.ddd.dm.base.DInformationModel

@ExtendWith(InjectionExtension)
@InjectWith(EsmInjectorProvider)
@Disabled
class EsmParsingTest {
	@Inject
	ParseHelper<DInformationModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
