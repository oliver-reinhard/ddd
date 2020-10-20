package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.transpose.ITransposition;

@SuppressWarnings("all")
public class SyntheticFeatureContainerDescriptor {
  public final IFeatureContainer syntheticType;
  
  /**
   * Is null if the synthetic container is a COPY of the source
   */
  public final ITransposition recipe;
  
  public final IFeatureContainer source;
  
  public SyntheticFeatureContainerDescriptor(final IFeatureContainer syntheticType, final ITransposition recipe, final IFeatureContainer source) {
    this.syntheticType = syntheticType;
    this.recipe = recipe;
    this.source = source;
  }
}
