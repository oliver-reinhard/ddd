package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;

@SuppressWarnings("all")
public class DmxNotificationDescriptor extends AbstractDmxTypeDescriptor<DType> {
  protected final DNotification notification;
  
  public DmxNotificationDescriptor(final DNotification notification) {
    super(DmxBaseType.NOTIFICATION, null, Boolean.valueOf(false));
    this.notification = notification;
  }
  
  public DNotification notification() {
    return this.notification;
  }
  
  @Override
  protected String typeName() {
    return this.notification.getName();
  }
}
