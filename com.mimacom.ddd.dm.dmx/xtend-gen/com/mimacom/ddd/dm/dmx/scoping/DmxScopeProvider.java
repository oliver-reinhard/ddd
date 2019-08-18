/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex;
import com.mimacom.ddd.dm.dmx.scoping.AbstractDmxScopeProvider;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom scoping for expressions and {@link DComplexType} feature inheritance.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class DmxScopeProvider extends AbstractDmxScopeProvider {
  @Inject
  @Extension
  private DmxUtil _dmxUtil;
  
  @Inject
  @Extension
  private DmxTypeComputer _dmxTypeComputer;
  
  @Inject
  private DmxIndex index;
  
  private static final BasePackage BASE = BasePackage.eINSTANCE;
  
  private static final DmxPackage DMX = DmxPackage.eINSTANCE;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    EReference _dmxContextReference_Target = DmxScopeProvider.DMX.getDmxContextReference_Target();
    boolean _equals = Objects.equal(reference, _dmxContextReference_Target);
    if (_equals) {
      final IScope outer = this.getDefaultScopeForType(context, DmxScopeProvider.BASE.getIStaticReferenceTarget());
      final IScope scope = this.getEContainersNavigableMembersScopes(context, outer);
      return scope;
    } else {
      EReference _dmxMemberNavigation_Member = DmxScopeProvider.DMX.getDmxMemberNavigation_Member();
      boolean _equals_1 = Objects.equal(reference, _dmxMemberNavigation_Member);
      if (_equals_1) {
        if ((context instanceof DmxMemberNavigation)) {
          final DExpression preceding = ((DmxMemberNavigation)context).getPrecedingNavigationSegment();
          final AbstractDmxTypeDescriptor<?> typeDescriptor = this._dmxTypeComputer.typeFor(preceding);
          final IScope scope_1 = typeDescriptor.getNavigableMembersAndIteratorsScope(context, this.index);
          return scope_1;
        }
      } else {
        EReference _dmxAssignment_AssignToMember = DmxScopeProvider.DMX.getDmxAssignment_AssignToMember();
        boolean _equals_2 = Objects.equal(reference, _dmxAssignment_AssignToMember);
        if (_equals_2) {
          if ((context instanceof DmxAssignment)) {
            final DExpression preceding_1 = ((DmxAssignment)context).getPrecedingNavigationSegment();
            final AbstractDmxTypeDescriptor<?> typeDescriptor_1 = this._dmxTypeComputer.typeFor(preceding_1);
            final IScope scope_2 = typeDescriptor_1.getNavigableMembersScope();
            return scope_2;
          } else {
            if ((context instanceof DmxMemberNavigation)) {
              final DExpression preceding_2 = ((DmxMemberNavigation)context).getPrecedingNavigationSegment();
              final AbstractDmxTypeDescriptor<?> typeDescriptor_2 = this._dmxTypeComputer.typeFor(preceding_2);
              final IScope scope_3 = typeDescriptor_2.getNavigableMembersScope();
              return scope_3;
            }
          }
        } else {
          EReference _dmxStaticReference_Target = DmxScopeProvider.DMX.getDmxStaticReference_Target();
          boolean _equals_3 = Objects.equal(reference, _dmxStaticReference_Target);
          if (_equals_3) {
            final IScope scope_4 = this.getDefaultScopeForType(context, DmxScopeProvider.BASE.getIStaticReferenceTarget());
            return scope_4;
          } else {
            EReference _dmxStaticReference_Member = DmxScopeProvider.DMX.getDmxStaticReference_Member();
            boolean _equals_4 = Objects.equal(reference, _dmxStaticReference_Member);
            if (_equals_4) {
              if ((context instanceof DmxStaticReference)) {
                final IStaticReferenceTarget target = ((DmxStaticReference)context).getTarget();
                if ((target instanceof INavigableMemberContainer)) {
                  final IScope scope_5 = this.getEContainerNavigableMembersScopeSwitch(((INavigableMemberContainer)target), IScope.NULLSCOPE);
                  return scope_5;
                }
              }
            } else {
              EReference _dmxFunctionCall_Function = DmxScopeProvider.DMX.getDmxFunctionCall_Function();
              boolean _equals_5 = Objects.equal(reference, _dmxFunctionCall_Function);
              if (_equals_5) {
                final List<DmxFilter> allFilters = this.index.allVisibleFilters(context);
                final IScope scope_6 = Scopes.scopeFor(allFilters, super.getScope(context, reference));
                return scope_6;
              }
            }
          }
        }
      }
    }
    return super.getScope(context, reference);
  }
  
  /**
   * Obtains the default scope for the given reference, then narrows the result down to the given type.
   */
  public IScope getDefaultScopeForType(final EObject context, final EClass type) {
    final EReference reference = EcoreFactory.eINSTANCE.createEReference();
    reference.setEType(type);
    final IScope scope = super.getScope(context, reference);
    return scope;
  }
  
  /**
   * Returns all DNavigableMember elements of the given navigation member element along the MODEL eContainer hierarchy.
   */
  protected final IScope getEContainersNavigableMembersScopes(final EObject context, final IScope outerScope) {
    IScope scope = outerScope;
    EObject container = context.eContainer();
    if ((container == null)) {
      return scope;
    } else {
      if ((container instanceof INavigableMemberContainer)) {
        scope = this.getEContainerNavigableMembersScopeSwitch(((INavigableMemberContainer)container), outerScope);
      } else {
        if ((container instanceof DmxCallArguments)) {
          boolean _contains = ((DmxCallArguments)container).getArguments().contains(context);
          if (_contains) {
            container = ((DmxCallArguments)container).eContainer();
            if ((container instanceof DmxMemberNavigation)) {
              final AbstractDmxTypeDescriptor<?> typeDescriptor = this._dmxTypeComputer.typeFor(((DmxMemberNavigation)container).getPrecedingNavigationSegment());
              scope = typeDescriptor.getNavigableMembersScope(outerScope);
            }
          }
        }
      }
    }
    return this.getEContainersNavigableMembersScopes(container, scope);
  }
  
  /**
   * Overriders must ensure, that each type used as a discriminator in the switch statement implements  @INavigableMemberContainer,
   * otherwise this method will never be invoked.<p>
   * Also, the elements included in the scope must implement @DNavigableMember.
   */
  protected IScope getEContainerNavigableMembersScopeSwitch(final INavigableMemberContainer container, final IScope outerScope) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (container instanceof DEnumeration) {
      _matched=true;
      _switchResult = Scopes.scopeFor(((DEnumeration)container).getLiterals(), outerScope);
    }
    if (!_matched) {
      if (container instanceof DComplexType) {
        _matched=true;
        _switchResult = Scopes.scopeFor(this._dmxUtil.allFeatures(((DComplexType)container)), outerScope);
      }
    }
    if (!_matched) {
      if (container instanceof DQuery) {
        _matched=true;
        _switchResult = Scopes.scopeFor(((DQuery)container).getParameters(), outerScope);
      }
    }
    if (!_matched) {
      if (container instanceof DAggregate) {
        _matched=true;
        _switchResult = Scopes.scopeFor(((DAggregate)container).getStaticQueries(), outerScope);
      }
    }
    if (!_matched) {
      if (container instanceof DDomainEvent) {
        _matched=true;
        _switchResult = this.getDomainEventNavigableMemberScope(((DDomainEvent)container), outerScope);
      }
    }
    if (!_matched) {
      if (container instanceof DmxPredicateWithCorrelationVariable) {
        _matched=true;
        _switchResult = Scopes.scopeFor(Lists.<DmxCorrelationVariable>newArrayList(((DmxPredicateWithCorrelationVariable)container).getCorrelationVariable()), outerScope);
      }
    }
    if (!_matched) {
      if (container instanceof DmxTest) {
        _matched=true;
        _switchResult = Scopes.scopeFor(((DmxTest)container).getContext(), outerScope);
      }
    }
    if (!_matched) {
      _switchResult = outerScope;
    }
    final IScope scope = _switchResult;
    return scope;
  }
  
  protected IScope getDomainEventNavigableMemberScope(final DDomainEvent event, final IScope outerScope) {
    final ArrayList<DNamedElement> list = Lists.<DNamedElement>newArrayList();
    list.addAll(event.getContext());
    DActor _trigger = event.getTrigger();
    boolean _tripleNotEquals = (_trigger != null);
    if (_tripleNotEquals) {
      list.add(event.getTrigger());
    }
    list.addAll(event.getNotifications());
    return Scopes.scopeFor(list, outerScope);
  }
}
