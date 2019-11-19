package com.mimacom.ddd.dm.dom.typecomputer;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;

@Singleton
@SuppressWarnings("all")
public class DomTypeComputer extends DmxTypeComputer {
  @Override
  public AbstractDmxTypeDescriptor<?> typeForContextReferenceSwitch(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DomNamedComplexObject)) {
      DmxComplexObject _object = ((DomNamedComplexObject)target).getObject();
      boolean _tripleNotEquals = (_object != null);
      if (_tripleNotEquals) {
        return this.typeFor(((DomNamedComplexObject)target).getObject());
      }
    }
    return super.typeForContextReferenceSwitch(expr);
  }
}
