package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.IDeductionDefinition
import com.mimacom.ddd.dm.base.IFeatureContainer

class SyntheticFeatureContainerDescriptor {
		
		public val IFeatureContainer syntheticType
		public val IDeductionDefinition deductionDefinition
		public val IFeatureContainer source
		
		new(IFeatureContainer syntheticType, IDeductionDefinition deductionDefinition, IFeatureContainer source) {
			this.syntheticType = syntheticType
			this.deductionDefinition = deductionDefinition
			this.source = source
		}
		
		new(IFeatureContainer syntheticType, IFeatureContainer source) {
			this(syntheticType, null, source)
		}
	}