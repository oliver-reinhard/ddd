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
        DPrimitive _redefines = type.getRedefines();
        DmxBaseType _baseType = null;
        if (((DmxArchetype) _redefines)!=null) {
          _baseType=((DmxArchetype) _redefines).getBaseType();
        }
        return _baseType;
      }
    }.apply(), type, Boolean.valueOf(collection));
  }
}
