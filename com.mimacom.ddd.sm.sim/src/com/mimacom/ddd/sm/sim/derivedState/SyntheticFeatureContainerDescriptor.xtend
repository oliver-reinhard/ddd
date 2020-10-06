package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.base.ITransposition

class SyntheticFeatureContainerDescriptor {
		
		public val IFeatureContainer syntheticType
		/* Is null if the synthetic container is a COPY of the source */
		public val ITransposition deductionDefinition
		public val IFeatureContainer source
		
		new(IFeatureContainer syntheticType, ITransposition deductionDefinition, IFeatureContainer source) {
			this.syntheticType = syntheticType
			this.deductionDefinition = deductionDefinition
			this.source = source
		}
	}