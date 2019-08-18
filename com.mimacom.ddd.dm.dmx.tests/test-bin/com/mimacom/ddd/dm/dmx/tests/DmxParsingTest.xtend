/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DNamedElement
import com.mimacom.ddd.dm.dmx.DmxNamespace
import com.mimacom.ddd.dm.dmx.DmxUtil
import com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl
import com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl
import com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl
import com.mimacom.ddd.dm.dmx.impl.DmxContextReferenceImpl
import com.mimacom.ddd.dm.dmx.impl.DmxDecimalLiteralImpl
import com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl
import com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl
import com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl
import com.mimacom.ddd.dm.dmx.impl.DmxNaturalLiteralImpl
import com.mimacom.ddd.dm.dmx.impl.DmxRaiseExpressionImpl
import com.mimacom.ddd.dm.dmx.impl.DmxStringLiteralImpl
import com.mimacom.ddd.dm.dmx.impl.DmxUndefinedLiteralImpl
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.Assert.*

@ExtendWith(InjectionExtension)
@InjectWith(DmxInjectorProvider)
class DmxParsingTest {
	@Inject extension ParseHelper<DmxNamespace> parseHelper
	@Inject extension DmxUtil
	
	@Test
	def void testLiterals() {
		val result = parseHelper.parse('''
			test T0 { true }
			test T1 { "Domain Model" }
			test T2 { 2 }
			test T3 { 314.159E-2 }
			test T4 { nil }
			test T5 { NIL }
		''')
		assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Literal errors: «errors.join("; ")»''')
		val tests = result.tests
		
		val e0 = tests.get(0).expr
		assertEquals(DmxBooleanLiteralImpl, e0.class)
		assertEquals(true, (e0 as DmxBooleanLiteralImpl).value)
		val e1 = tests.get(1).expr
		assertEquals(DmxStringLiteralImpl, e1.class)
		assertEquals("Domain Model", (e1 as DmxStringLiteralImpl).value)
		val e2 = tests.get(2).expr
		assertEquals(e2.class, DmxNaturalLiteralImpl)
		assertEquals(2, (e2 as DmxNaturalLiteralImpl).value)
		val e3 = tests.get(3).expr
		assertEquals(e3.class, DmxDecimalLiteralImpl)
		assertEquals("314.159E-2", (e3 as DmxDecimalLiteralImpl).value)
		val e4 = tests.get(4).expr
		assertEquals(DmxUndefinedLiteralImpl, e4.class)
		val e5 = tests.get(5).expr
		assertEquals(DmxUndefinedLiteralImpl, e5.class)
	}
	
	@Test
	def void testPrimaries() {
		val result = parseHelper.parse('''
			test T0 { self }
			test T1 { return }
			test T2 { return 2 }
			test T3 { raise "Expression" }
			test T4 { (4) }
			
			test T5 { f() }
			test T6 { f(6) }
			test T7 { new X }
			test T8 { new X(9) }
			test T9 { A }
		''')
		assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Primaries errors: «errors.join("; ")»''')
		val tests = result.tests
		
		val e3 = tests.get(3).expr
		assertEquals(DmxRaiseExpressionImpl, e3.class)
		assertEquals(DmxStringLiteralImpl, (e3 as DmxRaiseExpressionImpl).expression.class)
		val e4 = tests.get(4).expr
		assertEquals(DmxNaturalLiteralImpl, e4.class)
		assertEquals(4, (e4 as DmxNaturalLiteralImpl).value)
		
		val e5 = tests.get(5).expr
		assertEquals(DmxFunctionCallImpl, e5.class)
		// actual value of 'e5.function' cross reference is a proxy that gets resolved upon access => Exception => use basicGetFunction
		assertTrue((e5 as DmxFunctionCallImpl).basicGetFunction.eIsProxy)
		assertEquals(DmxFilterImpl, (e5 as DmxFunctionCallImpl).basicGetFunction.class) 
		assertEquals(0, (e5 as DmxFunctionCallImpl).nullSafeCallArguments.size)
		val e6 = tests.get(6).expr
		assertEquals(DmxFilterImpl, (e6 as DmxFunctionCallImpl).basicGetFunction.class)
		assertEquals(1, (e6 as DmxFunctionCallImpl).nullSafeCallArguments.size)
		assertEquals(DmxNaturalLiteralImpl, (e6 as DmxFunctionCallImpl).nullSafeCallArguments.get(0).class)
		val e7 = tests.get(7).expr
		assertEquals(DmxConstructorCallImpl, e7.class)
		// actual value of 'e7.constructor' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue((e7 as DmxConstructorCallImpl).basicGetConstructor.eIsProxy)
		assertTrue((e7 as DmxConstructorCallImpl).basicGetConstructor instanceof DEntityType) 
		assertFalse((e7 as DmxConstructorCallImpl).explicitConstructorCall)
		val e8 = tests.get(8).expr
		assertEquals(DmxConstructorCallImpl, e8.class)
		assertTrue((e8 as DmxConstructorCallImpl).basicGetConstructor instanceof DEntityType) 
		assertTrue((e8 as DmxConstructorCallImpl).explicitConstructorCall)
		assertEquals(1, (e8 as DmxConstructorCallImpl).nullSafeCallArguments.size)
		assertEquals(DmxNaturalLiteralImpl, (e8 as DmxConstructorCallImpl).nullSafeCallArguments.get(0).class)
		val e9 = tests.get(9).expr
		assertEquals(DmxContextReferenceImpl, e9.class)
		// actual value of 'e9.contextElement' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue((e9 as DmxContextReferenceImpl).basicGetTarget.eIsProxy)
		assertTrue((e9 as DmxContextReferenceImpl).basicGetTarget instanceof DNamedElement)
		
	}
	
	@Test
	def void testMemberFeatureCalls() {
		val result = parseHelper.parse('''
			test T0 { self.a }
			test T1 { self.a.b }
			test T2 { A.b }
			test T3 { A.b.c }
		''')
		assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''MemberFeatureCalls errors: «errors.join(" } ")»''')
		val tests = result.tests
		
		val e0 = tests.get(0).expr
		// DMemberFeatureCall -- memberContainer --> DSelfExpression
		assertEquals(DmxMemberNavigationImpl, e0.class)
		// actual value of 'e0.member' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue((e0 as DmxMemberNavigationImpl).basicGetMember.eIsProxy)
//		assertEquals(DmxSelfExpressionImpl, (e0 as DmxMemberNavigationImpl).precedingNavigationSegment.class)
		
		val e1 = tests.get(1).expr
		// DMemberFeatureCall -- memberContainer --> DMemberFeatureCall -- memberContainer --> DSelfExpression
		assertEquals(DmxMemberNavigationImpl, e1.class)
		val e1_1 = e1 as DmxMemberNavigationImpl
		assertTrue(e1_1.basicGetMember.eIsProxy)
		assertEquals(DmxMemberNavigationImpl, e1_1.precedingNavigationSegment.class)
		val e1_2 = e1_1.precedingNavigationSegment as DmxMemberNavigationImpl
		assertTrue(e1_2.basicGetMember.eIsProxy)
//		assertEquals(DmxSelfExpressionImpl, e1_2.precedingNavigationSegment.class)
		
		val e2 = tests.get(2).expr
		// DMemberFeatureCall -- memberContainer --> DContextReference
		assertEquals(DmxMemberNavigationImpl, e2.class)
		val e2_1 = e2 as DmxMemberNavigationImpl
		// actual value of 'e2.member' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue((e2_1 as DmxMemberNavigationImpl).basicGetMember.eIsProxy)
		assertEquals(DmxContextReferenceImpl, e2_1.precedingNavigationSegment.class)
		val e2_2 = e2_1.precedingNavigationSegment as DmxContextReferenceImpl
		// actual value of 'e2.reference' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue(e2_2.basicGetTarget.eIsProxy)
		assertTrue(e2_2.basicGetTarget instanceof DNamedElement)
		
		val e3 = tests.get(3).expr
		// DMemberFeatureCall -- memberContainer --> DMemberFeatureCall -- memberContainer --> DContextReference
		assertEquals(DmxMemberNavigationImpl, e3.class)
		val e3_1 = e3 as DmxMemberNavigationImpl
		assertTrue(e3_1.basicGetMember.eIsProxy)
		assertEquals(DmxMemberNavigationImpl, e3_1.precedingNavigationSegment.class)
		val e3_2 = e3_1.precedingNavigationSegment as DmxMemberNavigationImpl
		assertTrue(e3_2.basicGetMember.eIsProxy)
		assertEquals(DmxContextReferenceImpl, e3_2.precedingNavigationSegment.class)
		val e3_3 = e3_2.precedingNavigationSegment as DmxContextReferenceImpl
		// actual value of 'e3_2.reference' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue(e3_3.basicGetTarget.eIsProxy)
		assertTrue(e3_3.basicGetTarget instanceof DNamedElement)
	}
	
	@Test
	def void testAssignment() {
		val result = parseHelper.parse('''
			test T0 { a := 0 }
			test T1 { self.a := 1 }
			test T2 { A.b := 2 }
			test T3 { A.b.c := 3 }
		''')
		assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Assignment errors: «errors.join("; ")»''')
		val tests = result.tests
		
		val e0 = tests.get(0).expr
		assertEquals(DmxAssignmentImpl, e0.class)
		// actual value of 'e0.member' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue((e0 as DmxAssignmentImpl).basicGetAssignToMember.eIsProxy)
		assertNull((e0 as DmxAssignmentImpl).precedingNavigationSegment)
		assertEquals(DmxNaturalLiteralImpl, (e0 as DmxAssignmentImpl).value.class)
		
		val e1 = tests.get(1).expr
		assertEquals(DmxAssignmentImpl, e1.class)
		assertTrue((e1 as DmxAssignmentImpl).basicGetAssignToMember.eIsProxy)
//		assertEquals(DmxSelfExpressionImpl, (e1 as DmxAssignmentImpl).precedingNavigationSegment.class)
		assertEquals(DmxNaturalLiteralImpl, (e1 as DmxAssignmentImpl).value.class)
		
		val e2 = tests.get(2).expr
		assertEquals(DmxAssignmentImpl, e2.class)
		assertTrue((e2 as DmxAssignmentImpl).basicGetAssignToMember.eIsProxy)
		assertEquals(DmxContextReferenceImpl, (e2 as DmxAssignmentImpl).precedingNavigationSegment.class)
		assertEquals(DmxNaturalLiteralImpl, (e2 as DmxAssignmentImpl).value.class)
		
		val e3 = tests.get(3).expr
		// DMemberFeatureCall -- memberContainer --> DMemberFeatureCall -- memberContainer --> DContextReference
		assertEquals(DmxAssignmentImpl, e3.class)
		assertTrue((e3 as DmxAssignmentImpl).basicGetAssignToMember.eIsProxy)
		assertEquals(DmxMemberNavigationImpl, (e3 as DmxAssignmentImpl).precedingNavigationSegment.class)
		val e3_1 = (e3 as DmxAssignmentImpl).precedingNavigationSegment as DmxMemberNavigationImpl
		// actual value of 'e3.member' cross reference is a proxy that gets resolved upon access => Exception
		assertTrue(e3_1.basicGetMember.eIsProxy)
		assertEquals(DmxContextReferenceImpl, e3_1.precedingNavigationSegment.class)
		assertEquals(DmxNaturalLiteralImpl, (e3 as DmxAssignmentImpl).value.class)
		}
	
//	@Test
//	def void testQualifiedNameProvider() {
//		val result = parseHelper.parse('''
//		class A {attr a A; }
//		class B { attr a A; attr b A; }
//		''')
//		result.assertNotNull
//		// DmxDeclarativeQualifiedNameProvider.xtend returns simple names for DTestFeature:
//		result.assertExportedEObjectDescriptions("A, a, B, a, b")
//	}
//	
//	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
//		val actual = o.exportedEObjectDescriptions.map[qualifiedName].join(", ")
//		expected.toString.assertEquals(actual)
//	}
//	
//	@Test
//	def void testMemberFeatureCall() {
//		val result = parseHelper.parse('''
//				class A {}
//				class B { attr a A; attr b A; }
//				class X { attr y B; attr z B; }
//				expr B.a := B.b
//				expr X.y.a := X.z.b
//		''')
//		Assertions.assertNotNull(result)
//		val errors = result.eResource.errors
//		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
//	}
//	
//	@Test
//	def void testFunctionCall() {
//		val result = parseHelper.parse('''
//			class A {}
//			class B { attr a A; attr b A; }
//			class X { attr y B; attr z B; }
//			function fb returns B;
//			function fx returns X;
//			expr fb(4).a := fb(4).b
//			expr fx(4).y.a := fx(4).z.b
//		''')
//		Assertions.assertNotNull(result)
//		val errors = result.eResource.errors
//		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
//	}
}
