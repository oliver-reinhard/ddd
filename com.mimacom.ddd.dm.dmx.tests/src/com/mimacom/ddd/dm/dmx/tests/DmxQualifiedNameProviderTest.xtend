package com.mimacom.ddd.dm.dmx.tests

import com.mimacom.ddd.dm.base.BaseFactory
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider
import java.util.Arrays
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

class DmxQualifiedNameProviderTest {
	
	val BASE = BaseFactory.eINSTANCE
	val DFLT_QN_PROVIDER = new IQualifiedNameConverter.DefaultImpl()
	val DMX_QN_PROVIDER = new DmxQualifiedNameProvider
	
	@Test
	def void testWithNamespace() {
		val namespace = BASE.createDNamespace
		namespace.name = "a.b"
		
		val model = BASE.createDInformationModel
		model.name = "model"
		namespace.model = model
		
		val primitive1 = BASE.createDPrimitive
		primitive1.name = "primitive1"
		model.types.add(primitive1)
		
		val aggregate = BASE.createDAggregate
		aggregate.name = "aggr"
		model.aggregates.add(aggregate)
		
		val root = BASE.createDEntityType
		root.root = true
		root.name = "root"
		aggregate.types.add(root)
		val attr1 = BASE.createDAttribute
		attr1.name = "attr1"
		root.features.add(attr1)
		val query1 = BASE.createDQuery
		query1.name = "query1"
		root.features.add(query1)
		val queryParam1 = BASE.createDQueryParameter
		queryParam1.name = "queryParam1"
		query1.parameters.add(queryParam1)
		
		val entity = BASE.createDEntityType
		entity.name = "entity"
		aggregate.types.add(entity)
		val attr2 = BASE.createDAttribute
		attr2.name = "attr2"
		entity.features.add(attr2)
		entity.features.add(attr2)
		val query2 = BASE.createDQuery
		query2.name = "query1"
		entity.features.add(query2)
		val queryParam2 = BASE.createDQueryParameter
		queryParam2.name = "queryParam1"
		query2.parameters.add(queryParam2)
		
		val primitive2 = BASE.createDPrimitive
		primitive2.name = "primitive2"
		aggregate.types.add(primitive2)
		
		val enumeration = BASE.createDEnumeration
		enumeration.name = "enumeration"
		aggregate.types.add(enumeration)
		val literal = BASE.createDLiteral
		literal.name = "literal"
		enumeration.literals.add(literal)
		
		assertQualifiedName(namespace.name, namespace)
		assertQualifiedName(namespace.name + "." + model.name, model)
		assertQualifiedName(namespace.name + "." + primitive1.name, primitive1)
		assertQualifiedName(namespace.name + "." + aggregate.name, aggregate)
		assertQualifiedName(namespace.name + "." + root.name, root)
		assertQualifiedName(namespace.name + "." + root.name + "." + attr1.name, attr1)
		assertQualifiedName(namespace.name + "." + root.name + "." + query1.name, query1)
		assertQualifiedName(namespace.name + "." + root.name + "." + query1.name + "." + queryParam1.name, queryParam1)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + entity.name, entity)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + entity.name + "." + attr2.name, attr2)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + entity.name + "." + query2.name, query2)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + entity.name + "." + query2.name + "." + queryParam2.name, queryParam2)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + primitive2.name, primitive2)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + enumeration.name, enumeration)
		assertQualifiedName(namespace.name + "." + aggregate.name + "." + enumeration.name + "." + literal.name, literal)
		
	}
	
	private def void assertQualifiedName(String expected, EObject obj) {
		val expectedQN = DFLT_QN_PROVIDER.toQualifiedName(expected)
		val dmxQN = DMX_QN_PROVIDER.getFullyQualifiedName(obj)
		if (! Arrays.equals(expectedQN.segments, dmxQN.segments)) {
			fail("expected: <" + expectedQN.toString("|") + "> but was <" + dmxQN.toString("|") + ">")
		}
		
	}
}