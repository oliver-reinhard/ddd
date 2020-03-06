package com.mimacom.ddd.im.generator.jvmmodel

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxArchetype
import java.math.BigDecimal
import java.math.BigInteger
import java.time.Duration
import java.time.ZonedDateTime
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class GeneratorTypesHelper {
	
	@Inject extension JvmTypesBuilder

	/*
	 * Types
	 */
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DType type) {
		builder.typeRef(type.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DComplexType complexType) {
		builder.typeRef(complexType.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DmxArchetype archetype) {
		switch (archetype.name) {
			case 'ID',
			case 'Name',
			case 'ShortText',
			case 'Text': 
				builder.typeRef(String)
			case 'Boolean': 
				builder.typeRef(Boolean)
			case 'Natural',
			case 'Natural0',
			case 'Integer': 
				builder.typeRef(BigInteger)
			case 'Real': 
				builder.typeRef(BigDecimal)
			case 'Timepoint': 
				builder.typeRef(ZonedDateTime)
			case 'Duration': 
				builder.typeRef(Duration)
			default:
				throw new IllegalArgumentException("archetype " + archetype.name + " not supported")
		}
	}
	
	/*
	 * Parameters
	 */
	
	def dispatch JvmFormalParameter toParameter(JvmTypeReferenceBuilder builder, DType type) {
		toParameter(type, type.name, builder.typeRef(Object))
	}
	
	def dispatch JvmFormalParameter toParameter(JvmTypeReferenceBuilder builder, DEntityType entityType) {
		toParameter(entityType, entityType.name, toType(builder, entityType))
	}
	
	def dispatch JvmFormalParameter toParameter(JvmTypeReferenceBuilder builder, DmxArchetype archetype) {
		val ref = switch (archetype.name) {
			case 'ID',
			case 'Name',
			case 'ShortText',
			case 'Text': 
				builder.typeRef(String)
			case 'Boolean': 
				builder.typeRef(Boolean)
			default: builder.typeRef(Object)

		}
		toParameter(archetype, archetype.name, ref)
	}
}