package com.mimacom.ddd.im.generator.jvmmodel

import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDeductionRule
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxArchetype
import java.math.BigDecimal
import java.math.BigInteger
import java.time.Duration
import java.time.ZonedDateTime
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import com.mimacom.ddd.im.generator.generator.TypeMapping

class GeneratorTypesHelper {

	/*
	 * Types
	 */
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Iterable<TypeMapping> mappings, DType type) {
		if (type.name === null) builder.typeRef(Object)
		builder.typeRef(type.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Iterable<TypeMapping> mappings, DComplexType complexType) {
		if (complexType.name === null) builder.typeRef(Object)
		builder.typeRef(complexType.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Iterable<TypeMapping> mappings, DAttribute attribute) {
		builder.toType(mappings, attribute.type)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Iterable<TypeMapping> mappings, DPrimitive primitive) {
		if (primitive.redefines !== null) {
			return builder.toType(mappings, primitive.redefines)
		}
		if (primitive.deducedFrom?.deductionRule !== null) {
			return builder.toType(mappings, primitive.deducedFrom.deductionRule)
		}
		return builder.typeRef(Object) // fallback
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Iterable<TypeMapping> mappings, DDeductionRule deductionRule) {
		builder.toType(mappings, deductionRule.source)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Iterable<TypeMapping> mappings, DmxArchetype archetype) {
		val mappingsForType = mappings.filter[type.name == archetype.name].toList
		if (!mappingsForType.empty) {
			// assume there is at most one such mapping (implement validation!)
			return builder.typeRef(mappingsForType.head.javaType) 
		}
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
				throw new IllegalArgumentException("unsupported archetype: " + archetype.name)
		}
	}
}