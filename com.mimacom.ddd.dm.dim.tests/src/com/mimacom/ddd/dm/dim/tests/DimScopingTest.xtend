/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.tests

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DDomain
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension org.junit.Assert.*

@ExtendWith(InjectionExtension)
@InjectWith(DimInjectorProvider)
class DimScopingTest {
	@Inject extension ParseHelper<DDomain> parseHelper
	@Inject extension IScopeProvider
	
	val epackage = BasePackage.eINSTANCE
	
	@Test
	def void testAttributeScope() {
		val domain = parseHelper.parse('''
			domain D
			
			archetype GP {}
			detail A {
				x : GP
				y : GP
			}
			
			aggregate {
				root R { }
			}
		''')
		assertNotNull(domain)
		val errors = domain.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Attribute type parsing errors: «errors.join("; ")»''')
		
		val detailA = domain.types.get(1) as DDetailType
		val attrX = detailA.features.head as DAttribute
		val ref = attrX.type
		ref => [assertScope(epackage.DTypedMember_Type, "GP, A, D.GP, D.A")]
		
	}
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		val actualScope = context.getScope(reference)
		val actual = actualScope.allElements.map[name].join(", ")
		expected.toString.assertEquals(actual)
	}
}