package com.mimacom.ddd.sm.sim.derivedState;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.sm.sim.SComplexType;

@SuppressWarnings("all")
public class SyntheticComplexTypeDescriptor {
  public final SComplexType syntheticType;
  
  public final SComplexType typeWithExplicitRule;
  
  public final DComplexType source;
  
  public SyntheticComplexTypeDescriptor(final SComplexType syntheticType, final SComplexType typeWithExplicitRule, final DComplexType source) {
    this.syntheticType = syntheticType;
    this.typeWithExplicitRule = typeWithExplicitRule;
    this.source = source;
  }
  
  public SyntheticComplexTypeDescriptor(final SComplexType syntheticType, final DComplexType source) {
    this(syntheticType, null, source);
  }
}
