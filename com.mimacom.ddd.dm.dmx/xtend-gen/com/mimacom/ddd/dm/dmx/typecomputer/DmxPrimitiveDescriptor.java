package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxPrimitiveDescriptor extends AbstractDmxTypeDescriptor<DPrimitive> {
  public DmxPrimitiveDescriptor(final DPrimitive type, final boolean collection) {
    super(((DmxArchetype) type.getRedefines()).getBaseType(), type, Boolean.valueOf(collection));
  }
}
