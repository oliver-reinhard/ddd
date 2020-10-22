package com.mimacom.ddd.dm.base.transpose

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory
import com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature

class TSyntheticModelElementsFactoryWithTypeMapping extends TSyntheticModelElementsFactory {

	static val SYNTHETIC = SyntheticFactory.eINSTANCE

	@Inject extension TTypeMappingUtil

	protected override TSyntheticFeature getTypedSyntheticFeature(IFeatureContainer container, DFeature source, ITransposition recipe) {
		val featureTypeProxy = getTransposedTypeProxy(recipe, source.getType) // may be null
		// Now determine the correct type for the actual feature:
		var DType featureType = null
		if (source instanceof DAttribute || source instanceof DAssociation) {
			// We need the actual type of the feature in order to distinguish between associations and attributes:
			featureType = container.findLocalTypeMappingFor(source.type)
			if (featureType === null) {
				// There is no local type mapping -> find external type mappings.
				// Create temporary feature and resolve type proxy:
				val tempFeature = SYNTHETIC.createTSyntheticAttribute
				container.features.add(tempFeature)
				try {
					tempFeature.type = featureTypeProxy // may be null
					// FORCE proxy resolution by accessing the type field:
					featureType = tempFeature.type
				} finally {
					container.features.remove(tempFeature)
				}
			}
		}
		val syntheticFeature = createSyntheticFeature(source, featureType)
		syntheticFeature.type = featureTypeProxy // may be null -> there is a validation catching this case
		return syntheticFeature
	}

	protected override DType getSyntheticQueryParameterType(DQuery container, ITransposition recipe, DType sourceParameterType) {
		return getTransposedTypeProxy(recipe, sourceParameterType)
	}

}
