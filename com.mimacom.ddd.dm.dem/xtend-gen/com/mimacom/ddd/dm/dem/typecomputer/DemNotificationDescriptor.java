package com.mimacom.ddd.dm.dem.typecomputer;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.dem.DemMessage;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("all")
public class DemNotificationDescriptor extends AbstractDmxTypeDescriptor<DType> {
  protected final DemNotification notification;
  
  public DemNotificationDescriptor(final DemNotification notification, final boolean collection) {
    super(DmxBaseType.NOTIFICATION, null, collection);
    this.notification = notification;
  }
  
  @Override
  public boolean equals(final Object other) {
    return (super.equals(other) && ((this.notification == null) || this.notification.equals(((DemNotificationDescriptor) other).notification)));
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.baseType, this.type, Boolean.valueOf(this.collection), this.notification);
  }
  
  @Override
  public List<DNavigableMember> getNavigableMembers() {
    DemMessage _message = this.notification.getMessage();
    boolean _tripleNotEquals = (_message != null);
    if (_tripleNotEquals) {
      return Lists.<DNavigableMember>newArrayList(this.notification.getMessage());
    }
    return super.getNavigableMembers();
  }
  
  public DemNotification notification() {
    return this.notification;
  }
  
  @Override
  protected String typeName() {
    return this.notification.getName();
  }
}
