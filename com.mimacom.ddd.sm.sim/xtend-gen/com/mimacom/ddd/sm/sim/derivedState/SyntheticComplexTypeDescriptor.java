package com.mimacom.ddd.sm.sim.derivedState;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;

@SuppressWarnings("all")
public class SyntheticComplexTypeDescriptor {
  public final DComplexType syntheticType;
  
  public final SComplexTypeDeduction deductionDefinition;
  
  public final DComplexType source;
  
  public SyntheticComplexTypeDescriptor(final DComplexType syntheticType, final SComplexTypeDeduction deductionDefinition, final DComplexType source) {
    this.syntheticType = syntheticType;
    this.deductionDefinition = deductionDefinition;
    this.source = source;
  }
  
  public SyntheticComplexTypeDescriptor(final DComplexType syntheticType, final DComplexType source) {
    this(syntheticType, null, source);
  }
}
