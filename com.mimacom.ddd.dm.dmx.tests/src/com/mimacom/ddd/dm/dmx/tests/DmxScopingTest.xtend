/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.DInformationModel
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DmxInjectorProvider)
class DmxScopingTest {
	@Inject extension ParseHelper<DNamespace> parseHelper
	@Inject extension IScopeProvider
	
	val epackage = DmxPackage.eINSTANCE
		
	@Disabled
	def void testContextReferenceExpressionScope() {
		val XX = "«"
		val YY = "»"
		val namespace = parseHelper.parse('''
			domain D
			
			archetype GP {}
			detail GD {
				x : GP
				y : GP
			}
			
			detail A 
				«XX»
					c1 : [a > 0]
					c1 : [GP > 0]
					c2 : [b.x > 0]
					c2 : [GD.x > 0]
				«YY»
				{ 
				a : GP
				b : GD
				q1 (m : GP, n : GD) : GD returns m > 0
				q2 (r : GD) : GD returns r.x > 0
				constraint c1 : a > 0
				constraint c2 : b.x > 0
			}
		''')
		assertNotNull(namespace)
		val errors = namespace.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''ContextReference parsing errors: «errors.join("; ")»''')
		val model = namespace.model as DInformationModel
		assertNotNull(model)
		
		
		val detailA = model.types.get(2) as DDetailType
		val expectedScope1 = "a, b, q1, q2, GP, GD, A, D, D.GP, D.GD, D.A"
		val expectedScope2 = "x, y"
		
		{ // RIchText Expressions
			val c1a = detailA.description.segments.get(1) as DExpression
			c1a.checkExpression1(expectedScope1)
			val c1b = detailA.description.segments.get(3) as DExpression
			c1b.checkExpression1(expectedScope1)
			val c2a = detailA.description.segments.get(5) as DExpression
			c2a.checkExpression2(expectedScope2, expectedScope1)
			val c2b = detailA.description.segments.get(7) as DExpression
			c2b.checkExpression2(expectedScope2, expectedScope1)
		}
		
		{ // Query Expressions
			val expectedScope3 = "m, n, " + expectedScope1
			val q1 = (detailA.features.get(2) as DQuery).returns
			q1.checkExpression1(expectedScope3)
			val expectedScope4 = "r, " + expectedScope1
			val q2 = (detailA.features.get(3) as DQuery).returns
			q2.checkExpression2(expectedScope2, expectedScope4)
		}
		
		{ // Constraint Expressions
			val c1 = detailA.constraints.head.getPredicate
			c1.checkExpression1(expectedScope1)
			val c2 =detailA.constraints.get(1).getPredicate
			c2.checkExpression2(expectedScope2, expectedScope1)
		}
	}
	
	protected def checkExpression1(DExpression e, String expectedScopeStr) {
		assertTrue(e instanceof DmxBinaryOperation);
		val left = (e as DmxBinaryOperation).leftOperand
		assertTrue(left instanceof DmxContextReference)
		val ref = left as DmxContextReference
		ref => [assertScope(epackage.dmxContextReference_Target, expectedScopeStr)]
	}
	
	protected def checkExpression2(DExpression e, String expectedScopeStr1, String expectedScopeStr2) {
		assertTrue(e instanceof DmxBinaryOperation);
		val left = (e as DmxBinaryOperation).leftOperand
		assertTrue(left instanceof DmxMemberNavigation)
		val member = left as DmxMemberNavigation
		member => [assertScope(epackage.dmxMemberNavigation_Member,expectedScopeStr1)]
		assertTrue(member.precedingNavigationSegment instanceof DmxContextReference)
		val ref = member.precedingNavigationSegment as DmxContextReference
		ref => [assertScope(epackage.dmxContextReference_Target, expectedScopeStr2)]
	}
	
	@Disabled
	def void testSelfExpressionScope() {
		val XX = "«"
		val YY = "»"
		val namespace = parseHelper.parse('''
			domain D
			
			archetype GP {}
			detail GD {
				x : GP
				y : GP
			}
				
			detail A 
				«XX»
					c3 : [self.a > 0]
					c4 : [self.b.x > 0]
				«YY»
				{ 
				a : GP
				b : GD
				q1 (m : GP, n : GD) : GD returns self.m > 0
				q2 (r : GD) : GD returns self.r.x > 0
				constraint c3 : self.a > 0
				constraint c4 : self.b.x > 0
			}
		''')
		assertNotNull(namespace)
		val errors = namespace.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''"SELF" parsing errors: «errors.join("; ")»''')
		val model = namespace.model as DInformationModel
		assertNotNull(model)
		
		val detailA = model.types.get(2) as DDetailType
		val expectedScope1 = "a, b, q1, q2"
		val expectedScope2 = "x, y"
		
		{ // RIchText Expressions
			val c3 = detailA.description.segments.get(1) as DExpression
			c3.checkExpression3(expectedScope1)
			val c4 = detailA.description.segments.get(3) as DExpression
			c4.checkExpression4(expectedScope2, expectedScope1)
		}
		
		{ // Query Expressions
			val expectedScope3 = "m, n, " + expectedScope1
			val q1 = (detailA.features.get(2) as DQuery).returns
			q1.checkExpression3(expectedScope3)
			val expectedScope4 = "r, " + expectedScope1
			val q2 = (detailA.features.get(3) as DQuery).returns
			q2.checkExpression4(expectedScope2, expectedScope4)
		}
		
		{ // Constraint Expressions
			val c3 = detailA.constraints.head.getPredicate
			c3.checkExpression3(expectedScope1)
			val c4 =detailA.constraints.get(1).getPredicate
			c4.checkExpression4(expectedScope2, expectedScope1)
		}
	}
	
	protected def checkExpression3(DExpression e, String expectedScopeStr) {
		assertTrue(e instanceof DmxBinaryOperation);
		val left = (e as DmxBinaryOperation).leftOperand
		assertTrue(left instanceof DmxMemberNavigation)
		val member = left as DmxMemberNavigation
		member => [assertScope(epackage.dmxMemberNavigation_Member, expectedScopeStr)]
//		assertTrue(member.precedingNavigationSegment instanceof DmxSelfExpression)
	}
	
	protected def  checkExpression4(DExpression e, String expectedScopeStr1, String expectedScopeStr2) {
		assertTrue(e instanceof DmxBinaryOperation);
		val left = (e as DmxBinaryOperation).leftOperand
		assertTrue(left instanceof DmxMemberNavigation)
		val member1 = left as DmxMemberNavigation
		member1 => [assertScope(epackage.dmxMemberNavigation_Member, expectedScopeStr1)]
		assertTrue(member1.precedingNavigationSegment instanceof DmxMemberNavigation)
		val member2 = member1.precedingNavigationSegment as DmxMemberNavigation
		member2 => [assertScope(epackage.dmxMemberNavigation_Member, expectedScopeStr2)]
//		assertTrue(member2.precedingNavigationSegment instanceof DmxSelfExpression)
	}
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		val actualScope = context.getScope(reference)
		val actual = actualScope.allElements.map[name].join(", ")
		assertEquals(expected.toString, actual)
	}
}
