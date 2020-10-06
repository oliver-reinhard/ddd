package com.mimacom.ddd.sm.sim.derivedState;

import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.ITransposition;

@SuppressWarnings("all")
public class SyntheticFeatureContainerDescriptor {
  public final IFeatureContainer syntheticType;
  
  /**
   * Is null if the synthetic container is a COPY of the source
   */
  public final ITransposition deductionDefinition;
  
  public final IFeatureContainer source;
  
  public SyntheticFeatureContainerDescriptor(final IFeatureContainer syntheticType, final ITransposition deductionDefinition, final IFeatureContainer source) {
    this.syntheticType = syntheticType;
    this.deductionDefinition = deductionDefinition;
    this.source = source;
  }
}
