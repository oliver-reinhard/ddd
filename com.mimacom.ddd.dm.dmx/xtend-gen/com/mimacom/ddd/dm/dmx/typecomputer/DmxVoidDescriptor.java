package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxVoidDescriptor extends AbstractDmxTypeDescriptor<DType> {
  public DmxVoidDescriptor() {
    super(DmxBaseType.VOID, null, Boolean.valueOf(false));
  }
}
