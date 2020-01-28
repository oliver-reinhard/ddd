package com.mimacom.ddd.dm.dem.typecomputer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.typecomputer.DemTypeDescriptorProvider;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DemTypeComputer extends DmxTypeComputer {
  @Inject
  @Extension
  private DemTypeDescriptorProvider _demTypeDescriptorProvider;
  
  @Override
  public AbstractDmxTypeDescriptor<?> typeForContextReferenceSwitch(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DemNotification)) {
      return this._demTypeDescriptorProvider.getTypeDescriptor(target, false);
    }
    return super.typeForContextReferenceSwitch(expr);
  }
}
