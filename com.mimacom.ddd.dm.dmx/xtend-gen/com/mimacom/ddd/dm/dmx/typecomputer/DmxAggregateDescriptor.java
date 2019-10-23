package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DmxAggregateDescriptor extends AbstractDmxTypeDescriptor<DType> {
  private final DAggregate aggregate;
  
  public DmxAggregateDescriptor(final DAggregate aggregate, final boolean collection) {
    super(DmxBaseType.AGGREGATE, null, collection);
    this.aggregate = aggregate;
  }
  
  public DAggregate aggregate() {
    return this.aggregate;
  }
  
  @Override
  public boolean equals(final Object other) {
    boolean _equals = super.equals(other);
    if (_equals) {
      final DmxAggregateDescriptor obj = ((DmxAggregateDescriptor) other);
      return (((this.aggregate == null) && (obj.aggregate == null)) || this.aggregate.equals(obj.aggregate));
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.baseType, this.type, Boolean.valueOf(this.collection), this.aggregate);
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
  
  @Override
  protected String typeName() {
    return this.aggregate.getName();
  }
}
