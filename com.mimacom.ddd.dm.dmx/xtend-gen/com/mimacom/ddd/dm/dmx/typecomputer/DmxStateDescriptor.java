package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxStateDescriptor extends AbstractDmxTypeDescriptor<DEntityType> {
  public DmxStateDescriptor(final DState state, final boolean collection) {
    super(DmxBaseType.STATE, ((DEntityType) state.eContainer()), collection);
    if ((state == null)) {
      throw new NullPointerException("state");
    }
  }
  
  @Override
  public boolean canAssignTo(final AbstractDmxTypeDescriptor<?> other) {
    return this.isCompatibleWith(other);
  }
  
  @Override
  public boolean isCompatibleWith(final AbstractDmxTypeDescriptor<?> other) {
    return ((((other instanceof DmxStateDescriptor) && (this.type != null)) && this.type.equals(other.type)) && (this.collection == other.collection));
  }
  
  @Override
  protected String typeName() {
    String _typeName = super.typeName();
    return (_typeName + "State");
  }
}
