package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction

class SyntheticComplexTypeDescriptor {
		
		public val DComplexType syntheticType
		public val SComplexTypeDeduction deductionDefinition
		public val DComplexType source
		
		new(DComplexType syntheticType, SComplexTypeDeduction deductionDefinition, DComplexType source) {
			this.syntheticType = syntheticType
			this.deductionDefinition = deductionDefinition
			this.source = source
		}
		
		new(DComplexType syntheticType, DComplexType source) {
			this(syntheticType, null, source)
		}
	}