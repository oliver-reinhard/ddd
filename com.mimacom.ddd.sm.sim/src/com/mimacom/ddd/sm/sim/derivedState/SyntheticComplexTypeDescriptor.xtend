package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.sm.sim.SComplexType

class SyntheticComplexTypeDescriptor {
		
		public val SComplexType syntheticType
		public val SComplexType typeWithExplicitRule
		public val DComplexType source
		
		new(SComplexType syntheticType, SComplexType typeWithExplicitRule, DComplexType source) {
			this.syntheticType = syntheticType
			this.typeWithExplicitRule = typeWithExplicitRule
			this.source = source
		}
		
		new(SComplexType syntheticType, DComplexType source) {
			this(syntheticType, null, source)
		}
	}