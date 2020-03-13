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

class GeneratorTypesHelper {

	/*
	 * Types
	 */
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DType type) {
		if (type.name === null) builder.typeRef(Object)
		builder.typeRef(type.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DComplexType complexType) {
		if (complexType.name === null) builder.typeRef(Object)
		builder.typeRef(complexType.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DAttribute attribute) {
		builder.toType(attribute.type)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DPrimitive primitive) {
		if (primitive.redefines !== null) {
			return builder.toType(primitive.redefines)
		}
		if (primitive.deducedFrom?.deductionRule !== null) {
			return builder.toType(primitive.deducedFrom.deductionRule)
		}
		return builder.typeRef(Object) // fallback
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DDeductionRule deductionRule) {
		builder.toType(deductionRule.source)
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
				throw new IllegalArgumentException("unsupported archetype: " + archetype.name)
		}
	}
}