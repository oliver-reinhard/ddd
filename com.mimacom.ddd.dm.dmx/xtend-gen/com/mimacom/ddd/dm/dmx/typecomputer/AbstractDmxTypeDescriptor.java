package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

@SuppressWarnings("all")
public abstract class AbstractDmxTypeDescriptor<T extends DType> {
  protected final DmxBaseType baseType;
  
  protected final T type;
  
  protected final boolean collection;
  
  public AbstractDmxTypeDescriptor(final DmxBaseType baseType, final T type, final Boolean collection) {
    this.baseType = baseType;
    this.type = type;
    this.collection = (collection).booleanValue();
  }
  
  public DmxBaseType baseType() {
    return this.baseType;
  }
  
  public T type() {
    return this.type;
  }
  
  public boolean collection() {
    return this.collection;
  }
  
  public boolean canAssignTo(final AbstractDmxTypeDescriptor<?> other) {
    return (((this.type != null) && this.type.equals(other.type)) && (this.collection == other.collection));
  }
  
  public boolean isCompatibleWith(final AbstractDmxTypeDescriptor<?> other) {
    return (((this.baseType != null) && this.baseType.equals(other.baseType)) && (this.collection == other.collection));
  }
  
  public List<DNavigableMember> getNavigableMembers() {
    return Collections.EMPTY_LIST;
  }
  
  public List<DmxFilter> getSupportedIterators(final EObject context, final DmxIndex index) {
    return index.supportedFilters(context, this.baseType, this.collection);
  }
  
  public IScope getNavigableMembersScope(final IScope outer) {
    IScope _xblockexpression = null;
    {
      IScope _xifexpression = null;
      if ((outer != null)) {
        _xifexpression = outer;
      } else {
        _xifexpression = IScope.NULLSCOPE;
      }
      final IScope nonNullOuter = _xifexpression;
      final List<DNavigableMember> members = this.getNavigableMembers();
      IScope _xifexpression_1 = null;
      if ((members == Collections.EMPTY_LIST)) {
        return nonNullOuter;
      } else {
        _xifexpression_1 = Scopes.scopeFor(members, nonNullOuter);
      }
      _xblockexpression = _xifexpression_1;
    }
    return _xblockexpression;
  }
  
  public IScope getNavigableMembersScope() {
    return this.getNavigableMembersScope(null);
  }
  
  public IScope getNavigableMembersAndIteratorsScope(final EObject context, final DmxIndex index, final IScope outer) {
    IScope _xifexpression = null;
    if ((outer != null)) {
      _xifexpression = outer;
    } else {
      _xifexpression = IScope.NULLSCOPE;
    }
    IScope nonNullOuter = _xifexpression;
    final List<DmxFilter> iterators = this.getSupportedIterators(context, index);
    if ((iterators != Collections.EMPTY_LIST)) {
      nonNullOuter = Scopes.scopeFor(iterators, nonNullOuter);
    }
    return this.getNavigableMembersScope(nonNullOuter);
  }
  
  public IScope getNavigableMembersAndIteratorsScope(final EObject context, final DmxIndex index) {
    return this.getNavigableMembersAndIteratorsScope(context, index, null);
  }
  
  @Override
  public String toString() {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder("[");
      sb.append(this.getClass().getSimpleName());
      sb.append("]");
      final String name = this.typeName();
      if ((name != null)) {
        sb.append(" : ");
        sb.append(name);
        if (this.collection) {
          sb.append("*");
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  protected String typeName() {
    String _xifexpression = null;
    if ((this.type != null)) {
      _xifexpression = this.type.getName();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}
