package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxBaseTypeDescriptor extends AbstractDmxTypeDescriptor<DPrimitive> {
  public DmxBaseTypeDescriptor(final DmxBaseType baseType, final boolean collection) {
    super(baseType, null, collection);
  }
}
