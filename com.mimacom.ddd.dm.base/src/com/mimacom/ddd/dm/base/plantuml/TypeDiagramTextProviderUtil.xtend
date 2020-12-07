package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DType

class TypeDiagramTextProviderUtil {

	@Inject extension TypesUtil
	
//	static val SYNTHETIC = SyntheticFactory.eINSTANCE

	def typeName(DType t) '''«if (t.eContainer instanceof DAggregate) t.aggregateName».«t.name»'''

	def targetName(DType source, DType target) {
		if (source.modelName == target.modelName) {
			if (source.aggregateName == target.aggregateName) {
				return target.typeName
			}
			return target.aggregateName
		}
		return target.modelName
	}

//	def boolean hasStateFeature(DComplexType t) {
//		if (t instanceof DEntityType) {
//			return ! t.states.empty
//		}
//		return false
//	}
//	
//	def statesFeatureName(DComplexType t) {
//		return t.name + "State"
//	}
//
//	def DEnumeration statesEnumeration(DComplexType t) {
//		if (t instanceof DEntityType) {
//			val states = SYNTHETIC.createTSyntheticEnumeration
//			states.name = t.statesFeatureName
//			for(s : t.states) {
//				val literal = SYNTHETIC.createTSyntheticLiteral
//				literal.name = s.name
//				states.literals.add(literal)
//			}
//			return states
//		}
//		return null
//	}
}
