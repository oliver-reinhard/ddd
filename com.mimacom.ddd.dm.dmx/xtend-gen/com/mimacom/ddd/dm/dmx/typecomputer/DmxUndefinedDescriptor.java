package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxUndefinedDescriptor extends AbstractDmxTypeDescriptor<DType> {
  public DmxUndefinedDescriptor() {
    super(DmxBaseType.UNDEFINED, null, Boolean.valueOf(false));
  }
}
