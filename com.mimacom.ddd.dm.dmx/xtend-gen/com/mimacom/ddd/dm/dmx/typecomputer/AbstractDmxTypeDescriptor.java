package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class AbstractDmxTypeDescriptor<T extends DType> implements Cloneable {
  protected final DmxBaseType baseType;
  
  protected final T type;
  
  protected boolean collection;
  
  public AbstractDmxTypeDescriptor(final DmxBaseType baseType, final T type, final boolean collection) {
    if ((baseType == null)) {
      throw new NullPointerException("baseType");
    }
    this.baseType = baseType;
    this.type = type;
    this.collection = collection;
  }
  
  public DmxBaseType baseType() {
    return this.baseType;
  }
  
  public T type() {
    return this.type;
  }
  
  public boolean isCollection() {
    return this.collection;
  }
  
  @Override
  public boolean equals(final Object other) {
    if (((other == null) || (other.getClass() != this.getClass()))) {
      return false;
    }
    final AbstractDmxTypeDescriptor<?> obj = ((AbstractDmxTypeDescriptor<?>) other);
    return (((this.baseType == obj.baseType) && (((this.type == null) && (obj.type == null)) || this.type.equals(obj.type))) && (this.collection == obj.collection));
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.baseType, this.type, Boolean.valueOf(this.collection));
  }
  
  /**
   * Used to adjust value for special cases.
   */
  public boolean setCollection(final boolean value) {
    return this.collection = value;
  }
  
  /**
   * Check whether "other := this" is acceptable.
   */
  public boolean canAssignTo(final AbstractDmxTypeDescriptor<?> other) {
    return ((((this.type != null) && (other != null)) && this.type.equals(other.type)) && (this.collection == other.collection));
  }
  
  public boolean isCompatibleWith(final AbstractDmxTypeDescriptor<?> other) {
    return (((other != null) && this.baseType.equals(other.baseType)) && (this.collection == other.collection));
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
  
  public String displayName() {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      if (this.collection) {
        sb.append("collection of ");
      }
      String _typeName = this.typeName();
      boolean _tripleNotEquals = (_typeName != null);
      if (_tripleNotEquals) {
        sb.append(this.typeName());
      } else {
        sb.append(this.baseType.getLiteral());
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String toString() {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder("[");
      sb.append(this.getClass().getSimpleName());
      sb.append("] : ");
      final String name = this.typeName();
      if ((name != null)) {
        sb.append(name);
        if (this.collection) {
          sb.append("*");
        }
        sb.append(" is ");
      }
      sb.append(this.baseType.getLiteral());
      if (this.collection) {
        sb.append("*");
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
  
  @Override
  public AbstractDmxTypeDescriptor<?> clone() {
    try {
      Object _clone = super.clone();
      return ((AbstractDmxTypeDescriptor<?>) _clone);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
