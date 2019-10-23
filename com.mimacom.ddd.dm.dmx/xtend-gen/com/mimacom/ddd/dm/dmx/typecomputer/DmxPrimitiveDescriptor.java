package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class DmxPrimitiveDescriptor extends AbstractDmxTypeDescriptor<DPrimitive> {
  public DmxPrimitiveDescriptor(final DPrimitive type, final boolean collection) {
    super(new Function0<DmxBaseType>() {
      public DmxBaseType apply() {
        DmxBaseType _xifexpression = null;
        DPrimitive _redefines = type.getRedefines();
        boolean _tripleEquals = (_redefines == null);
        if (_tripleEquals) {
          _xifexpression = DmxBaseType.VOID;
        } else {
          DPrimitive _redefines_1 = type.getRedefines();
          _xifexpression = ((DmxArchetype) _redefines_1).getBaseType();
        }
        return _xifexpression;
      }
    }.apply(), type, collection);
  }
  
  public DmxPrimitiveDescriptor(final DmxArchetype type, final boolean collection) {
    super(type.getBaseType(), type, collection);
  }
}
