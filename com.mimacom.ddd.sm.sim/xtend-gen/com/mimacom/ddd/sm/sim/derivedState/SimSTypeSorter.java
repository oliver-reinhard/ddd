package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SType;
import java.util.Comparator;

@SuppressWarnings("all")
public class SimSTypeSorter implements Comparator<SType> {
  @Override
  public int compare(final SType t1, final SType t2) {
    final int s1 = this.score(t1);
    final int s2 = this.score(t2);
    if (((s1 == 3) && (s2 == 3))) {
      final SPrimitive p1 = ((SPrimitive) t1);
      final SPrimitive p2 = ((SPrimitive) t2);
      SPrimitive _redefines = p2.getRedefines();
      boolean _equals = Objects.equal(p1, _redefines);
      if (_equals) {
        return (-1);
      }
      SPrimitive _redefines_1 = p1.getRedefines();
      boolean _equals_1 = Objects.equal(_redefines_1, p2);
      if (_equals_1) {
        return 1;
      }
    }
    return (s2 - s1);
  }
  
  public int score(final SType t) {
    if ((t instanceof SPrimitive)) {
      boolean _isArchetype = ((SPrimitive)t).isArchetype();
      if (_isArchetype) {
        return 4;
      }
      return 3;
    } else {
      if ((t instanceof SEnumeration)) {
        return 2;
      }
    }
    return 1;
  }
}
