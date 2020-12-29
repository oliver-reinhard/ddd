package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.List;

@SuppressWarnings("all")
public class DmxComplexTypeDescriptor extends AbstractDmxTypeDescriptor<DComplexType> {
  private DmxUtil util;
  
  public DmxComplexTypeDescriptor(final DComplexType type, final boolean collection, final DmxUtil util) {
    super(DmxBaseType.COMPLEX, type, collection);
    if ((type == null)) {
      throw new NullPointerException("type");
    }
    this.util = util;
  }
  
  @Override
  public boolean isCompatibleWith(final AbstractDmxTypeDescriptor<?> other) {
    return this.canAssignTo(other);
  }
  
  /**
   * Returns its own as well as all inherited features
   */
  @Override
  public List<DNavigableMember> getNavigableMembers() {
    List<DFeature> allFeatures = this.util.allFeatures(this.type);
    return ((List<DNavigableMember>) ((Object) allFeatures));
  }
  
  /**
   * Check whether "other := this" is acceptable.
   */
  @Override
  public boolean canAssignTo(final AbstractDmxTypeDescriptor<?> other) {
    return (super.canAssignTo(other) || ((other != null) && this.util.typeHierarchy(this.type).contains(other.type)));
  }
}
