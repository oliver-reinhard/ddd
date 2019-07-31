package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxServiceDescriptor extends AbstractDmxTypeDescriptor<DType> {
  protected final DService service;
  
  public DmxServiceDescriptor(final DService service) {
    super(DmxBaseType.SERVICE, null, Boolean.valueOf(false));
    this.service = service;
  }
  
  public DService service() {
    return this.service;
  }
  
  @Override
  protected String typeName() {
    return this.service.getName();
  }
}
