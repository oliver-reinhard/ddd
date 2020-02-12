package com.mimacom.ddd.sm.sim.generator.dto

import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.dmx.DmxArchetype

class EntityDtoGenerator {
    static val JAVA_KEYWORDS = #{
	    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
	    "abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
		"synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw",
		"byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch",
		"extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long",
		"strictfp", "volatile", "const", "float", "native", "super", "while",
		// other
		"Boolean", "String"
	} 

	def CharSequence generateBody(DEntityType entity, String fqnClassName) {
		val classNameSegments = fqnClassName.split('\\.')
		val packageDeclaration = classNameSegments.empty ? '' : '''
		
		// TODO: generate Imports? E.g. BigDecimal, List
		
		package «classNameSegments.take(classNameSegments.length-1).join('.')»;
		
		'''
		
		'''
		«packageDeclaration»
		public class «classNameSegments.get(classNameSegments.length-1)» {
			// TODO: not yet implemented
			«FOR f : entity.features»
				private «f.inferJavaType» «f.name.toJavaFieldName»;
			«ENDFOR»
		}
		'''
	}
	
	/* FIXME: this really doesn't belong here (define a Java type inferrer?) */
	def private inferJavaType(DFeature feature) {
		if (feature instanceof DAttribute) {
			val attribute = feature as DAttribute
			if (attribute.type instanceof DmxArchetype) {
				val archetype = attribute.type as DmxArchetype
				val baseType = archetype.baseType
				return switch (baseType) {
					case IDENTIFIER, case TEXT: 'String'
					case BOOLEAN: 'Boolean'
					case NUMBER:  'java.math.BigDecimal'
					case TIMEPOINT:  'java.time.LocalDateTime'
					default: throw new IllegalArgumentException("Unsupported base type: " + baseType)
				}
			}
		}
		'''Object /* «feature.type» */'''
	}
	
	def private String toJavaFieldName(String toConvert) {
		val toConvertFirstLower = toConvert.toFirstLower
		return JAVA_KEYWORDS.contains(toConvertFirstLower) ? '_' + toConvertFirstLower : toConvertFirstLower
	}
}