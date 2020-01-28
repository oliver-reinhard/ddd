package com.mimacom.ddd.dm.dem.typecomputer;

import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.typecomputer.DemNotificationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;

@SuppressWarnings("all")
public class DemTypeDescriptorProvider extends DmxTypeDescriptorProvider {
  @Override
  public AbstractDmxTypeDescriptor<?> typeDescriptorSwitch(final Object obj, final boolean collection) {
    if ((obj instanceof DemNotification)) {
      return new DemNotificationDescriptor(((DemNotification)obj), collection);
    }
    return super.typeDescriptorSwitch(obj, collection);
  }
}
