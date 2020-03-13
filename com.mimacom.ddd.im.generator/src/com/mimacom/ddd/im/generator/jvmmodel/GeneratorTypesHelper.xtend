package com.mimacom.ddd.im.generator.jvmmodel

import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDeductionRule
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEntityType
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
	
	def dispatch foo(DType type) {
		null
	}

	def dispatch foo(DEntityType type) {
		null
	}
	
	def dispatch foo(DDetailType type) {
		null
	}
		

	/*
	 * Types
	 */
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, Object catchAll) {
		System.err.println("catch all rule")
		builder.typeRef(Object)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DType type) {
		builder.typeRef(type.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DComplexType complexType) {
		builder.typeRef(complexType.name)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DAttribute attribute) {
		builder.toType(attribute.type)
	}
	
	def dispatch JvmTypeReference toType(JvmTypeReferenceBuilder builder, DPrimitive primitive) {
		if (primitive.redefines !== null) {
			return builder.toType(primitive.redefines)
		}
		return builder.toType(primitive.deducedFrom?.deductionRule)
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