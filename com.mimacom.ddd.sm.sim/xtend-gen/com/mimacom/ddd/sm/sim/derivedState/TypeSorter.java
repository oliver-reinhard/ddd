package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import java.util.Comparator;

/**
 * Sorts DTypes in this order:
 * 1 – Archetypes
 * 2 – Primitives
 * 3 – Enumerations
 * 4 – ComplexTypes
 */
@SuppressWarnings("all")
public class TypeSorter implements Comparator<STypeDeduction> {
  @Override
  public int compare(final STypeDeduction t1, final STypeDeduction t2) {
    final int s1 = this.score(t1);
    final int s2 = this.score(t2);
    if (((s1 == 3) && (s2 == 3))) {
      final DPrimitive p1 = ((DPrimitive) t1);
      final DPrimitive p2 = ((DPrimitive) t2);
      DPrimitive _redefines = p2.getRedefines();
      boolean _equals = Objects.equal(p1, _redefines);
      if (_equals) {
        return (-1);
      }
      DPrimitive _redefines_1 = p1.getRedefines();
      boolean _equals_1 = Objects.equal(_redefines_1, p2);
      if (_equals_1) {
        return 1;
      }
    }
    return (s2 - s1);
  }
  
  public int score(final STypeDeduction t) {
    if ((t instanceof SPrimitiveDeduction)) {
      boolean _isArchetype = ((SPrimitiveDeduction)t).isArchetype();
      if (_isArchetype) {
        return 4;
      }
      return 3;
    } else {
      if ((t instanceof SEnumerationDeduction)) {
        return 2;
      }
    }
    return 1;
  }
}
