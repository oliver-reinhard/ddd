package com.mimacom.ddd.dm.base.transpose;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TSyntheticModelElementsFactory;
import com.mimacom.ddd.dm.base.transpose.TTypeMappingUtil;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TSyntheticModelElementsFactoryWithTypeMapping extends TSyntheticModelElementsFactory {
  private static final SyntheticFactory SYNTHETIC = SyntheticFactory.eINSTANCE;
  
  @Inject
  @Extension
  private TTypeMappingUtil _tTypeMappingUtil;
  
  @Override
  protected TSyntheticFeature getTypedSyntheticFeature(final IFeatureContainer container, final DFeature source, final ITransposition recipe) {
    final DType featureTypeProxy = this._tTypeMappingUtil.getTransposedTypeProxy(recipe, source.getType());
    DType featureType = null;
    if (((source instanceof DAttribute) || (source instanceof DAssociation))) {
      featureType = this.findLocalTypeMappingFor(container, source.getType());
      if ((featureType == null)) {
        final TSyntheticAttribute tempFeature = TSyntheticModelElementsFactoryWithTypeMapping.SYNTHETIC.createTSyntheticAttribute();
        container.getFeatures().add(tempFeature);
        try {
          tempFeature.setType(featureTypeProxy);
          featureType = tempFeature.getType();
        } finally {
          container.getFeatures().remove(tempFeature);
        }
      }
    }
    final TSyntheticFeature syntheticFeature = this.createSyntheticFeature(source, featureType);
    syntheticFeature.setType(featureTypeProxy);
    return syntheticFeature;
  }
  
  @Override
  protected DType getSyntheticQueryParameterType(final DQuery container, final ITransposition recipe, final DType sourceParameterType) {
    return this._tTypeMappingUtil.getTransposedTypeProxy(recipe, sourceParameterType);
  }
}
