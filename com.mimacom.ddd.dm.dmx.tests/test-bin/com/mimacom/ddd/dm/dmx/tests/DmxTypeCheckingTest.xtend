/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests

import com.google.inject.Inject
import com.google.inject.Provider
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.dmx.DmxNamespace
import com.mimacom.ddd.dm.dmx.DmxTest
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.Assert.*

@ExtendWith(InjectionExtension)
@InjectWith(DmxInjectorProvider)
class DmxTypeCheckingTest {
	@Inject extension ParseHelper<DmxNamespace> dmxParseHelper
	@Inject Provider<ResourceSet> resourceSetProvider
	@Inject extension DmxTypeComputer
	
	@Test
	def void testLiterals() {
		val tests = parse('''
			namespace A
			test T00 { true }
			test T01 { false }
			test T02 { 0 }
			test T03 { 22 }
			test T04 { -1 }
			test T05 { 3.1415 }
			test T06 { 3141.526E-3 }
			test T07 { "String" }
			test T08 { undefined }
		''')
		assertNoValidationErrors(tests.head)
		
		val e00 = tests.get(0).expr
		assertType(e00, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e01 = tests.get(1).expr
		assertType(e01, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e02 = tests.get(2).expr
		assertType(e02, DmxTypeDescriptorProvider::NUMBER)
		
		val e03 = tests.get(3).expr
		assertType(e03, DmxTypeDescriptorProvider::NUMBER)
		
		val e04 = tests.get(4).expr
		assertType(e04, DmxTypeDescriptorProvider::NUMBER)
		
		val e05 = tests.get(5).expr
		assertType(e05, DmxTypeDescriptorProvider::NUMBER)
		
		val e06 = tests.get(6).expr
		assertType(e06, DmxTypeDescriptorProvider::NUMBER)
		
		val e07 = tests.get(6).expr
		assertType(e07, DmxTypeDescriptorProvider::TEXT)
		
		val e08 = tests.get(8).expr
		assertType(e08, DmxTypeDescriptorProvider::UNDEFINED_TYPE)
	}
	
	@Test
	def void testEquality() {
		val tests = parse('''
			namespace A
			test T00 context a : Natural, b : Natural { a = b }
			test T01 context a : Natural, b : Natural { a != b }
			test T02 context a : Natural, b : Natural { a <> b }
			test T03 context a : Natural, b : Text { a = b }  // ERROR: NATURAL vs. TEXT
		''')
		
		val e00 = tests.get(0).expr
		assertType(e00, DmxTypeDescriptorProvider::BOOLEAN)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertType(e01, DmxTypeDescriptorProvider::BOOLEAN)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertType(e02, DmxTypeDescriptorProvider::BOOLEAN)
		assertNoValidationErrors(e02)
		
		val e03 = tests.get(3).expr
		assertType(e03, DmxTypeDescriptorProvider::BOOLEAN)
		assertValidationError(e03)
	}
	
	@Test
	def void testBooleanOperators() {
		val tests = parse('''
			namespace A
			test T00 context a : Boolean, b : Boolean { a AND b }
			test T01 context a : Boolean, b : Boolean { a OR b }
			test T02 context a : Boolean, b : Boolean { a XOR b }
		''')
		assertNoValidationErrors(tests.head)
		
		val e00 = tests.get(0).expr
		assertType(e00, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e01 = tests.get(1).expr
		assertType(e01, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e02 = tests.get(2).expr
		assertType(e02, DmxTypeDescriptorProvider::BOOLEAN)
	}
	
	@Test
	def void testRelationalOperators() {
		val tests = parse('''
			namespace A
			test T00 context a : Natural, b : Natural { a > b }
			test T01 context a : Natural, b : Natural { a > b }
			test T02 context a : Natural, b : Natural { a >= b }
			test T03 context a : Natural, b : Natural { a ≥ b }
			test T04 context a : Natural, b : Natural { a < b }
			test T05 context a : Natural, b : Natural { a <= b }
			test T06 context a : Natural, b : Natural { a ≤ b }
		''')
		assertNoValidationErrors(tests.head)
		
		val e00 = tests.get(0).expr
		assertType(e00, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e01 = tests.get(1).expr
		assertType(e01, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e02 = tests.get(2).expr
		assertType(e02, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e03 = tests.get(3).expr
		assertType(e03, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e04 = tests.get(4).expr
		assertType(e04, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e05 = tests.get(5).expr
		assertType(e05, DmxTypeDescriptorProvider::BOOLEAN)
		
		val e06 = tests.get(6).expr
		assertType(e06, DmxTypeDescriptorProvider::BOOLEAN)
		
		
	}
	
	
	def boolean assertTestWithContextType(int id, CharSequence input, AbstractDmxTypeDescriptor<?> expectedType) {
		("test T" + id + " " + input).assertType(expectedType)
	}
	
	def boolean assertType(CharSequence input, AbstractDmxTypeDescriptor<?> expectedType) {
		input.parse.last.expr.assertType(expectedType)
	}
	
	def boolean assertType(DExpression expr, AbstractDmxTypeDescriptor<?> expectedType) {
		expectedType.isCompatibleWith(expr.typeFor)
	}
	
	def EList<DmxTest> parse(CharSequence input) {
		val resourceSet = resourceSetProvider.get
		// Provide SystemTypes:
		val systemTypes = dmxParseHelper.parse('''
		namespace dm.types
		archetype Boolean 	is BOOLEAN
		archetype Natural 	is NUMBER	
		archetype Text		is TEXT
		''', resourceSet)
		Assertions.assertNotNull(systemTypes)
		val stErrors = systemTypes.eResource.errors
		Assertions.assertTrue(stErrors.isEmpty, '''Parse errors in systemTypes: «stErrors.join(", ")»''')
		
		val result = dmxParseHelper.parse(input, resourceSet)
		assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Parse errors: «errors.join("; ")»''')
		return result.tests
	}
	
	def assertNoValidationErrors(EObject obj) {
//		val result = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(obj)).children
		val result = Diagnostician.INSTANCE.validate(obj).children
		Assertions.assertTrue(result.isEmpty, '''Validation errors: «result.join("; ")»''')
	}
	
	def assertValidationError(EObject obj) {
		val result = Diagnostician.INSTANCE.validate(obj).children
		assertEquals(1, result.size)
	}
}
