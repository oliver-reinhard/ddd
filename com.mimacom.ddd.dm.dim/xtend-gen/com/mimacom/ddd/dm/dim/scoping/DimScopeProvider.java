/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.dim.scoping.AbstractDimScopeProvider;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class DimScopeProvider extends AbstractDimScopeProvider {
  private final BasePackage BASE = BasePackage.eINSTANCE;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    EReference _dNavigableMember_Type = this.BASE.getDNavigableMember_Type();
    boolean _equals = Objects.equal(reference, _dNavigableMember_Type);
    if (_equals) {
      return this.getNavigableMemberTypeScope(context, IScope.NULLSCOPE);
    } else {
      EReference _dComplexType_SuperType = this.BASE.getDComplexType_SuperType();
      boolean _equals_1 = Objects.equal(reference, _dComplexType_SuperType);
      if (_equals_1) {
        IScope _switchResult = null;
        boolean _matched = false;
        if (context instanceof DEntityType) {
          _matched=true;
          _switchResult = this.getIdentityTypeScope(((DEntityType)context), DEntityType.class);
        }
        if (!_matched) {
          if (context instanceof DDetailType) {
            _matched=true;
            _switchResult = this.getDefaultScopeOfType(context, this.BASE.getDDetailType());
          }
        }
        if (!_matched) {
          _switchResult = IScope.NULLSCOPE;
        }
        return _switchResult;
      }
    }
    return super.getScope(context, reference);
  }
  
  /**
   * Returns the scope for the 'type' property of DNavigableMembers.
   */
  public IScope getNavigableMemberTypeScope(final EObject context, final IScope outerScope) {
    EClass _switchResult = null;
    boolean _matched = false;
    if (context instanceof DAttribute) {
      _matched=true;
      EClass _xifexpression = null;
      boolean _isDetail = ((DAttribute)context).isDetail();
      if (_isDetail) {
        _xifexpression = this.BASE.getDDetailType();
      } else {
        _xifexpression = this.BASE.getIValueType();
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (context instanceof DQuery) {
        _matched=true;
        _switchResult = this.BASE.getDType();
      }
    }
    if (!_matched) {
      if (context instanceof DAssociation) {
        _matched=true;
        _switchResult = this.BASE.getDEntityType();
      }
    }
    if (!_matched) {
      if (context instanceof DQueryParameter) {
        _matched=true;
        _switchResult = this.BASE.getDType();
      }
    }
    if (!_matched) {
      _switchResult = this.BASE.getIValueType();
    }
    final EClass type = _switchResult;
    final IScope scope = this.getDefaultScopeOfType(context, type);
    return scope;
  }
  
  public IScope getIdentityTypeScope(final DEntityType context, final Class<?> type) {
    final ArrayList<DEntityType> list = Lists.<DEntityType>newArrayList();
    final ITypeContainer typeContainer = EcoreUtil2.<ITypeContainer>getContainerOfType(context, ITypeContainer.class);
    if ((typeContainer != null)) {
      EList<DType> _types = typeContainer.getTypes();
      for (final DType t : _types) {
        if ((t instanceof DEntityType)) {
          if (((!((DEntityType)t).isRoot()) && type.isAssignableFrom(((DEntityType)t).getClass()))) {
            list.add(((DEntityType)t));
          }
        }
      }
    }
    final IAggregateContainer domain = EcoreUtil2.<IAggregateContainer>getContainerOfType(context, IAggregateContainer.class);
    if ((domain != null)) {
      EList<DAggregate> _aggregates = domain.getAggregates();
      for (final DAggregate a : _aggregates) {
        {
          final Function1<DEntityType, Boolean> _function = (DEntityType it) -> {
            return Boolean.valueOf(((it != context) && type.isAssignableFrom(it.getClass())));
          };
          final Iterable<DEntityType> roots = IterableExtensions.<DEntityType>filter(a.getRoots(), _function);
          Iterables.<DEntityType>addAll(list, roots);
        }
      }
    }
    boolean _isEmpty = list.isEmpty();
    if (_isEmpty) {
      return IScope.NULLSCOPE;
    }
    return Scopes.scopeFor(list);
  }
}
