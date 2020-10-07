package com.mimacom.ddd.dm.base.transpose;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import java.util.Comparator;

/**
 * Sorts TTypeTransposition in this order:
 * 1 – Archetypes
 * 2 – Primitives
 * 3 – Enumerations
 * 4 – ComplexTypes
 */
@SuppressWarnings("all")
public class TypeSorter implements Comparator<TTypeTransposition> {
  @Override
  public int compare(final TTypeTransposition t1, final TTypeTransposition t2) {
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
  
  public int score(final TTypeTransposition t) {
    if ((t instanceof TPrimitiveTransposition)) {
      return 3;
    } else {
      if ((t instanceof TEnumerationTransposition)) {
        return 2;
      }
    }
    return 1;
  }
}
