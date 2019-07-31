package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxActorDescriptor extends AbstractDmxTypeDescriptor<DType> {
  protected final DActor actor;
  
  public DmxActorDescriptor(final DActor actor) {
    super(DmxBaseType.ACTOR, null, Boolean.valueOf(false));
    this.actor = actor;
  }
  
  public DActor actor() {
    return this.actor;
  }
  
  @Override
  protected String typeName() {
    return this.actor.getName();
  }
}
