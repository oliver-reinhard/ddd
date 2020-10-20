package com.mimacom.ddd.dm.base.transpose

import com.mimacom.ddd.dm.base.base.IFeatureContainer

class SyntheticFeatureContainerDescriptor {
		
		public val IFeatureContainer syntheticType
		/* Is null if the synthetic container is a COPY of the source */
		public val ITransposition recipe
		public val IFeatureContainer source
		
		new(IFeatureContainer syntheticType, ITransposition recipe, IFeatureContainer source) {
			this.syntheticType = syntheticType
			this.recipe = recipe
			this.source = source
		}
	}
