/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests

import com.google.inject.Inject
import com.google.inject.Provider
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.dim.DimStandaloneSetup
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
import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DmxInjectorProvider)
class DmxTypeCheckingTest {
	
	@Inject ParseHelper<DmxNamespace> dmxParseHelper
	@Inject Provider<ResourceSet> resourceSetProvider
	@Inject extension DmxTypeComputer
	final ParseHelper<DDomain> dimParseHelper
	
	new() {
		val dimInjector = new DimStandaloneSetup().createInjectorAndDoEMFRegistration()
		dimParseHelper = dimInjector.getInstance(ParseHelper)
	}
	
	def EList<DmxTest> parse(CharSequence input) {
		val resourceSet = resourceSetProvider.get
		
		// Provide SystemTypes:
		val systemTypes = dmxParseHelper.parse('''
			namespace dm.types
			archetype Boolean		is BOOLEAN
			archetype Natural 		is NUMBER	
			archetype Text				is TEXT
			archetype Timepoint	is TIMEPOINT
			''', resourceSet)
		assertNotNull(systemTypes)
		val stErrors = systemTypes.eResource.errors
		assertTrue(stErrors.isEmpty, '''Parse errors in system types: «stErrors.join(", ")»''')
		
		// Provide custom types:
		val customTypes = dimParseHelper.parse('''
			domain D
			primitive P1 redefines Natural
			enumeration E1 { L1, L2 }
			detail A {
				a0 : Text
				a1 : Natural?
				a2 : Natural
				a3 : E1
				a4 : Natural*
				a5 : Timepoint
				a6 : Boolean
				a7 : A
				detail b1 : B
				detail b2 : B+
				q0(): Natural
				q1(p:P1) : Natural
				q2(left:P1, right:P1) : Natural
				q3() : B
			}
			detail B {
				b1 : Natural
				q5(p:P1) : Natural
			}
		''', resourceSet)
		assertNotNull(customTypes)
		val ctErrors = systemTypes.eResource.errors
		assertTrue(ctErrors.isEmpty, '''Parse errors in custom types: «ctErrors.join(", ")»''')
		
		// Parse actual expression
		val result = dmxParseHelper.parse(input, resourceSet)
		assertNotNull(result)
		val errors = result.eResource.errors
		assertTrue(errors.isEmpty, '''Parse errors: «errors.join("; ")»''')
		return result.tests
	}
	
	@Test
	def void testLiterals() {
		val tests = parse('''
			namespace N
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
		assertNoValidationErrors(tests.head.eContainer)
		
		val e00 = tests.get(0).expr
		assertBoolean(e00)
		
		val e01 = tests.get(1).expr
		assertBoolean(e01)
		
		val e02 = tests.get(2).expr
		assertNumber(e02)
		
		val e03 = tests.get(3).expr
		assertNumber(e03)
		
		val e04 = tests.get(4).expr
		assertNumber(e04)
		
		val e05 = tests.get(5).expr
		assertNumber(e05)
		
		val e06 = tests.get(6).expr
		assertNumber(e06)
		
		val e07 = tests.get(7).expr
		assertType(e07, DmxTypeDescriptorProvider::TEXT)
		
		val e08 = tests.get(8).expr
		assertType(e08, DmxTypeDescriptorProvider::UNDEFINED_TYPE)
	}
	
	@Test
	def void testArithmetics() {
		val tests = parse('''
			namespace N
			test T00 { 1 + 2 }
			test T01 { 1 - 2 }
			test T02 { 1 * 2 }
			test T03 { 1 / 2 }
			test T04 { 8 % 3 }
			test T05 { 2**4 }
			test T06 { "A" + "B" }
			test T07 { 1 + "A" }												// ERROR: Type mismatch
			test T08 context t : Timepoint { t + 155 } 				// add a number value
			test T09 context t : Timepoint { t - 155 } 				// subtract a number value
		''')
		
		val e00 = tests.get(0).expr
		assertNumber(e00)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertNumber(e01)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertNumber(e02)
		assertNoValidationErrors(e02)
		
		val e03 = tests.get(3).expr
		assertNumber(e03)
		assertNoValidationErrors(e03)
		
		val e04 = tests.get(4).expr
		assertNumber(e04)
		assertNoValidationErrors(e04)
		
		val e05 = tests.get(5).expr
		assertNumber(e05)
		assertNoValidationErrors(e05)
		
		val e06 = tests.get(6).expr
		assertType(e06, DmxTypeDescriptorProvider::TEXT)
		assertNoValidationErrors(e06)
		
		val e07 = tests.get(7).expr
		assertNumber(e07)
		assertHasValidationERRORS(e07)
		
		val e08 = tests.get(8).expr
		assertType(e08, DmxTypeDescriptorProvider::TIMEPOINT)
		assertNoValidationErrors(e08)
		
		val e09 = tests.get(9).expr
		assertType(e09, DmxTypeDescriptorProvider::TIMEPOINT)
		assertNoValidationErrors(e09)
		
		}
	
	@Test
	def void testTestContextValueType() {
		val tests = parse('''
		import D.*
		namespace N
		test T00 context a : Natural := 1 { a }
		test T01 context a : Natural := "a"  { a } 						// ERROR
		test T02 context a : A := detail A { a2 = 1 }  { a.a2 = 1 }
		test T03 context a : A := detail A { a2 = "a" }  { a.a2 = 1 } // ERROR
		test T04 context a : A+ := { detail A { a2 = 1 }}  { true }  // List
		''')
		
		val e00 = tests.get(0).expr
		assertNumber(e00)
		assertNoValidationErrors(e00.eContainer) // do not just validate the expression but the TestContext
		
		val e01 = tests.get(1).expr
		assertNumber(e01)
		assertHasValidationERRORS(e01.eContainer) // do not just validate the expression but the TestContext)
		
		val e02 = tests.get(2).expr
		assertBoolean(e02)
		assertNoValidationErrors(e02.eContainer) // do not just validate the expression but the TestContext)
		
		val e03 = tests.get(3).expr
		assertBoolean(e03)
		assertHasValidationERRORS(e03.eContainer) // do not just validate the expression but the TestContext)
		
		val e04 = tests.get(4).expr
		assertBoolean(e04)
		assertNoValidationErrors(e04.eContainer) // do not just validate the expression but the TestContext)
	}
	
	@Test
	def void testTimepoints() {
		val tests = parse('''
		import D.*
		namespace N
		test T00 context a : Timepoint, b : Timepoint { a = b }
		test T01 context a : A, b : Timepoint { a.a5 := b }  
		test T02 context a : A { a.a5 := "2019-05-15" }			// right-hand side parsed as date
		test T03 context a : A { a.a5 := "2019-05-15 10:48" }	// right-hand side parsed as date + time
		test T04 context a : A { a.a5 := "20190515" }				// ERROR: format
		test T05 context t : Timepoint { t <= "2019-05-15" }	
		test T06 context t : Timepoint { "20190515" < t }			// ERROR: timepoint on right-hand side not supported
		''')
		
		val e00 = tests.get(0).expr
		assertBoolean(e00)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertVoid(e01)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertVoid(e02)
		assertNoValidationErrors(e02)
		
		val e03 = tests.get(3).expr
		assertVoid(e03)
		assertNoValidationErrors(e03)
		
		val e04 = tests.get(4).expr
		assertVoid(e04)
		assertHasValidationERRORS(e04)
		
		val e05 = tests.get(5).expr
		assertBoolean(e05)
		assertNoValidationErrors(e05)
		
		val e06 = tests.get(6).expr
		assertBoolean(e06)
		assertHasValidationERRORS(e06)
		
		}
	
	@Test
	def void testLists() {
		val tests = parse('''
			import D.*
			namespace N
			test T00 {  {}  }  // empty collection
			test T01 { {1} }
			test T02 { {1,2} }
			test T03 { {1, "A"} } 								// ERROR: inconsistent types in collection
			test T04 context a : A { a.b2.b1 } 	 		// ERROR: navigation of collection (Validation error)
			test T05 { {1,2} = {} }
			test T06 { {1,2} = {1,2} }
		''')
		
		val e00 = tests.get(0).expr
		assertType(e00, DmxTypeDescriptorProvider::UNDEFINED_TYPE_COLLECTION)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertType(e01, DmxTypeDescriptorProvider::NUMBER_COLLECTION)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertType(e02, DmxTypeDescriptorProvider::NUMBER_COLLECTION)
		assertNoValidationErrors(e02)
		
		val e03 = tests.get(3).expr
		assertType(e03, DmxTypeDescriptorProvider::AMBIGUOUS_TYPE)
		assertHasValidationERRORS(e03)
		
		val e04 = tests.get(4).expr
		assertType(e04, DmxTypeDescriptorProvider::NUMBER)
		assertHasValidationERRORS(e04)
		
		val e05 = tests.get(5).expr
		assertBoolean(e05)
		assertNoValidationErrors(e05)
		
		val e06 = tests.get(6).expr
		assertBoolean(e06)
		assertNoValidationErrors(e06)
	}
	
	@Test
	def void testIn() {
		val tests = parse('''
		import D.*
		namespace N
		test T00 context a : A { a.a2 in {3,4} }
		test T01 context a : A { {3, "a"} }  				// ERROR: first element determines type
		test T02 context a : A { a.a4 = 3 }   			// ERROR: not a collection
		test T03 context a : A { a.a4 in {3,4} }  	// ERROR: cannot be a collection
		test T04 context a : A { a.a4 = {3, "A"} }	// ERROR: first element determines type
		''')
		
		val e00 = tests.get(0).expr
		assertBoolean(e00)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertHasValidationERRORS(e01)
		
		val e02 = tests.get(2).expr
		assertHasValidationERRORS(e02)
		
		val e03 = tests.get(3).expr
		assertHasValidationERRORS(e03)
		
		val e04 = tests.get(4).expr
		assertHasValidationERRORS(e04)
	}
	
	@Test
	def void testEquality() {
		val tests = parse('''
			import D.*
			namespace N
			test T00 context a : Natural, b : Natural { a = b }
			test T01 context a : Natural, b : Natural { a != b }
			test T02 context a : Natural, b : Natural { a <> b }
			test T03 context a : Natural, b : Text { a = b }  		// ERROR: Natural vs. Text
			test T04 context a : A, b : Natural { a.a2 = b }
			test T05 context a : A { a.a3 = E1.L2 }  					// Enumerations
			test T06 context a : A { a.q1(2) = 3 }
			test T07 context a : A { a.a4 = {} }
		''')
		
		val e00 = tests.get(0).expr
		assertBoolean(e00)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertBoolean(e01)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertBoolean(e02)
		assertNoValidationErrors(e02)
		
		val e03 = tests.get(3).expr
		assertBoolean(e03)
		assertHasValidationERRORS(e03)
		
		val e04 = tests.get(4).expr
		assertBoolean(e04)
		assertNoValidationErrors(e04)
		
		val e05 = tests.get(5).expr
		assertBoolean(e05)
		assertNoValidationErrors(e05)
		
		val e06 = tests.get(6).expr
		assertBoolean(e06)
		assertNoValidationErrors(e06)
		
		val e07 = tests.get(7).expr
		assertBoolean(e07)
		assertNoValidationErrors(e07)
	}
	
	@Test
	def void testRelationalOperators() {
		val tests = parse('''
			import D.*
			namespace N
			// "comparable" types:
			test T00 context a : Natural, b : Natural { a > b }
			test T01 context a : Text, b : Text { a > b }
			test T02 context a : Timepoint, b : Timepoint { a > b }
			
			test T03 context a : Natural, b : Natural { a >= b }
			test T04 context a : Natural, b : Natural { a ≥ b }
			test T05 context a : Natural, b : Natural { a < b }
			test T06 context a : Natural, b : Natural { a <= b }
			test T07 context a : Natural, b : Natural { a ≤ b }
			test T08 context a : A { a.a3 < E1.L2 }  		// ERROR: cannot compare enumerations with relational operators
			test T09 context a : A { a.a2 < a.a4 }   		// ERROR: cannot compare scalar with collection
		''')
		
		val e00 = tests.get(0).expr
		assertBoolean(e00)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertBoolean(e01)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertBoolean(e02)
		assertNoValidationErrors(e02)
		
		val e03 = tests.get(3).expr
		assertBoolean(e03)
		assertNoValidationErrors(e03)
		
		val e04 = tests.get(4).expr
		assertBoolean(e04)
		assertNoValidationErrors(e04)
		
		val e05 = tests.get(5).expr
		assertBoolean(e05)
		assertNoValidationErrors(e05)
		
		val e06 = tests.get(6).expr
		assertBoolean(e06)
		assertNoValidationErrors(e06)
		
		val e07 = tests.get(7).expr
		assertBoolean(e07)
		assertNoValidationErrors(e07)
		
		val e08 = tests.get(8).expr
		assertBoolean(e08)
		assertHasValidationERRORS(e08)
		
		val e09 = tests.get(9).expr
		assertBoolean(e09)
		assertHasValidationERRORS(e09)
	}
	
	@Test
	def void testBooleanOperators() {
		val tests = parse('''
			namespace N
			test T00 context a : Boolean, b : Boolean { a AND b }
			test T01 context a : Boolean, b : Boolean { a OR b }
			test T02 context a : Boolean, b : Boolean { a XOR b }
			test T03 context a : Boolean, b : Boolean { a => b }
			test T04 context a : Boolean { NOT a }
		''')
		assertNoValidationErrors(tests.head.eContainer)
		
		val e00 = tests.get(0).expr
		assertBoolean(e00)
		
		val e01 = tests.get(1).expr
		assertBoolean(e01)
		
		val e02 = tests.get(2).expr
		assertBoolean(e02)
		
		val e03 = tests.get(3).expr
		assertBoolean(e03)
		
		val e04 = tests.get(4).expr
		assertBoolean(e04)
	}
	
	@Test
	def void testAssignments() {
		val tests = parse('''
		import D.*
		namespace N
		test T00 context a : Natural { a := 1 }		// ERROR: can only assign to attributes
		test T01 context a : A { a.a1 := 1 }  
		test T02 context a : A { a.a1 := "A" }		// ERROR: wrong type
		test T03 context a : A { a.q0 := 3 } 			// ERROR: cannot assign to query
		test T04 context a : A { a.b1.b1 := 3 }
		test T05 context a : A { a.a1 := a.q0() } 
		test T06 context a : A { a.a4 := {} }
		test T07 context a : A { a.a4 := {3} }
		test T08 context a : A { a.a4 := {3,4} }
		test T09 context a : A { a.a4 := 3 }			// ERROR: cannot assign a scalar to a collection
		test T10 context a : A { a.a2 := {3,4} }		// ERROR: cannot assign a collection to a scalar
		''')
		
		val e00 = tests.get(0).expr
		assertVoid(e00)
		assertHasValidationERRORS(e00)
		
		val e01 = tests.get(1).expr
		assertVoid(e01)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertVoid(e02)
		assertHasValidationERRORS(e02)
		
		val e03 = tests.get(3).expr
		assertVoid(e03)
		assertHasValidationERRORS(e03)
		
		val e04 = tests.get(4).expr
		assertVoid(e04)
		assertNoValidationErrors(e04)
		
		val e05 = tests.get(5).expr
		assertVoid(e05)
		assertNoValidationErrors(e05)
		
		val e06 = tests.get(6).expr
		assertVoid(e06)
		assertNoValidationErrors(e06)
		
		val e07 = tests.get(7).expr
		assertVoid(e07)
		assertNoValidationErrors(e07)
		
		val e08 = tests.get(8).expr
		assertVoid(e08)
		assertNoValidationErrors(e08)
		
		val e09 = tests.get(9).expr
		assertVoid(e09)
		assertHasValidationERRORS(e09)
		
		val e10 = tests.get(10).expr
		assertVoid(e10)
		assertHasValidationERRORS(e10)
	}
	
	
	@Test
	def void testFunctionCalls() {
		val tests = parse('''
		import D.*
		namespace N
		test T00 context a : A { a.q0 } 
		test T01 context a : A { a.q0() } 
		test T02 context a : A { a.q0(1) } 				// ERROR: too many parameter values
		test T03 context a : A { a.q1() }  				// ERROR: missing parameter value
		test T04 context a : A { a.q1(1) } 
		test T05 context a : A { a.q1(1,2) } 			// ERROR: too many parameter values
		test T06 context a : A { a.q2(1) }  			// ERROR: missing parameter value
		test T07 context a : A { a.q2(1,2) } 
		test T08 context a : A { a.q2(1,2,3) }  		// ERROR: too many parameter values
		test T09 context a : A { a.q2(1,2) }
		test T10 context a : A { a.q2(1,"A") }		// ERROR: wrong type
		''')
		
		val e00 = tests.get(0).expr
		assertNumber(e00)
		assertNoValidationErrors(e00)
		
		val e01 = tests.get(1).expr
		assertNumber(e01)
		assertNoValidationErrors(e01)
		
		val e02 = tests.get(2).expr
		assertNumber(e02)
		assertHasValidationERRORS(e02)
		
		val e03 = tests.get(3).expr
		assertNumber(e03)
		assertHasValidationERRORS(e03)
		
		val e04 = tests.get(4).expr
		assertNumber(e04)
		assertNoValidationErrors(e04)
		
		val e05 = tests.get(5).expr
		assertNumber(e05)
		assertHasValidationERRORS(e05)
		
		val e06 = tests.get(6).expr
		assertNumber(e06)
		assertHasValidationERRORS(e06)
		
		val e07 = tests.get(7).expr
		assertNumber(e07)
		assertNoValidationErrors(e07)
		
		val e08 = tests.get(8).expr
		assertNumber(e08)
		assertHasValidationERRORS(e08)
		
		val e09 = tests.get(9).expr
		assertNumber(e09)
		assertNoValidationErrors(e09)
		
		val e10 = tests.get(10).expr
		assertNumber(e10)
		assertHasValidationERRORS(e10)
	}
	
	// ------------------------------
	
	def void assertType(DExpression expr, AbstractDmxTypeDescriptor<?> expectedType) {
		val type = expr.typeFor
		assertTrue((type).isCompatibleWith(expectedType), "Was: " + type.toString + ", expected: " + expectedType)
	}
	
	def void assertNumber(DExpression expr) {
		assertType(expr, DmxTypeDescriptorProvider::NUMBER)
	}
	
	def void assertBoolean(DExpression expr) {
		assertType(expr, DmxTypeDescriptorProvider::BOOLEAN)
	}
	
	def void assertVoid(DExpression expr) {
		assertType(expr, DmxTypeDescriptorProvider::VOID)
	}
	
	def assertNoValidationErrors(EObject obj) {
//		val result = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(obj)).children
		val result = Diagnostician.INSTANCE.validate(obj).children
		assertTrue(result.isEmpty, '''Validation errors: «result.join("; ")»''')
	}
	
	def assertHasValidationERRORS(EObject obj) {
		val result = Diagnostician.INSTANCE.validate(obj).children
		assertTrue(result.size >= 1, "No validation errors")
	}
}