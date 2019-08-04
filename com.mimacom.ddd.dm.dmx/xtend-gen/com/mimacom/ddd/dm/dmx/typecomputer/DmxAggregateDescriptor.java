package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DmxAggregateDescriptor extends AbstractDmxTypeDescriptor<DType> {
  protected final DAggregate aggregate;
  
  public DmxAggregateDescriptor(final DAggregate aggregate) {
    super(DmxBaseType.AGGREGATE, null, Boolean.valueOf(false));
    this.aggregate = aggregate;
  }
  
  @Override
  public List<DNavigableMember> getNavigableMembers() {
    EList<DQuery> _staticQueries = this.aggregate.getStaticQueries();
    boolean _tripleNotEquals = (_staticQueries != null);
    if (_tripleNotEquals) {
      return Lists.<DNavigableMember>newArrayList(this.aggregate.getStaticQueries());
    }
    return super.getNavigableMembers();
  }
  
  public DAggregate aggregate() {
    return this.aggregate;
  }
  
  @Override
  protected String typeName() {
    return this.aggregate.getName();
  }
}
