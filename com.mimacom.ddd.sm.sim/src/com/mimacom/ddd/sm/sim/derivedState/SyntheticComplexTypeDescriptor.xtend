package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.sm.sim.SComplexType

class SyntheticComplexTypeDescriptor {
		
		public val SComplexType syntheticType
		public val SComplexType typeWithRule
		public val DComplexType source
		
		new(SComplexType syntheticType, SComplexType typeWithRule, DComplexType source) {
			this.syntheticType = syntheticType
			this.typeWithRule = typeWithRule
			this.source = source
		}
		
		new(SComplexType syntheticType, DComplexType source) {
			this(syntheticType, null, source)
		}
	}