package com.mimacom.ddd.sm.sim.derivedState;

import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IFeatureContainer;

@SuppressWarnings("all")
public class SyntheticFeatureContainerDescriptor {
  public final IFeatureContainer syntheticType;
  
  public final IDeductionDefinition deductionDefinition;
  
  public final IFeatureContainer source;
  
  public SyntheticFeatureContainerDescriptor(final IFeatureContainer syntheticType, final IDeductionDefinition deductionDefinition, final IFeatureContainer source) {
    this.syntheticType = syntheticType;
    this.deductionDefinition = deductionDefinition;
    this.source = source;
  }
  
  public SyntheticFeatureContainerDescriptor(final IFeatureContainer syntheticType, final IFeatureContainer source) {
    this(syntheticType, null, source);
  }
}
