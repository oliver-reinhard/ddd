package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DmxEnumerationDescriptor extends AbstractDmxTypeDescriptor<DEnumeration> {
  public DmxEnumerationDescriptor(final DEnumeration enumeration, final boolean collection) {
    super(DmxBaseType.ENUM, enumeration, collection);
  }
  
  @Override
  public List<DNavigableMember> getNavigableMembers() {
    EList<DLiteral> _literals = this.type.getLiterals();
    return ((List<DNavigableMember>) ((Object) _literals));
  }
}
