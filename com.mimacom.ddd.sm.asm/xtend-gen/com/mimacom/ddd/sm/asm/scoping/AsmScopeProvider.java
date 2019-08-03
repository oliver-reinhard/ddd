/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DServiceParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.sm.asm.SServiceInterface;
import com.mimacom.ddd.sm.asm.SServiceOperation;
import com.mimacom.ddd.sm.asm.scoping.AbstractAsmScopeProvider;
import com.mimacom.ddd.sm.sim.SCoreQuery;
import com.mimacom.ddd.sm.sim.SInformationModel;
import java.util.List;
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
public class AsmScopeProvider extends AbstractAsmScopeProvider {
  private static final BasePackage BASE = BasePackage.eINSTANCE;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      if ((context instanceof DServiceParameter)) {
        EReference _dNavigableMember_Type = AsmScopeProvider.BASE.getDNavigableMember_Type();
        boolean _equals = Objects.equal(reference, _dNavigableMember_Type);
        if (_equals) {
          final SServiceInterface service = EcoreUtil2.<SServiceInterface>getContainerOfType(context, SServiceInterface.class);
          final Function1<DType, Boolean> _function = (DType it) -> {
            return Boolean.valueOf((!(it instanceof IDeductionDefinition)));
          };
          return Scopes.scopeFor(IterableExtensions.<DType>filter(EcoreUtil2.<DType>eAllOfType(service.getInterface(), DType.class), _function), super.getScope(context, reference));
        }
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  @Override
  protected IScope getEContainerNavigableMembersScopeSwitch(final INavigableMemberContainer container, final IScope outerScope) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (container instanceof SCoreQuery) {
      _matched=true;
      _switchResult = Scopes.scopeFor(((SCoreQuery)container).getParameters(), outerScope);
    }
    if (!_matched) {
      if (container instanceof SServiceOperation) {
        _matched=true;
        _switchResult = Scopes.scopeFor(((SServiceOperation)container).getParameters(), outerScope);
      }
    }
    if (!_matched) {
      if (container instanceof SServiceInterface) {
        _matched=true;
        _switchResult = this.getServiceInterfaceCoreNavigableMembersScope(((SServiceInterface)container).getCore(), outerScope);
      }
    }
    if (!_matched) {
      _switchResult = super.getEContainerNavigableMembersScopeSwitch(container, outerScope);
    }
    final IScope scope = _switchResult;
    return scope;
  }
  
  protected IScope getServiceInterfaceCoreNavigableMembersScope(final SInformationModel core, final IScope outerScope) {
    IScope _xblockexpression = null;
    {
      final List<EObject> list = Lists.<EObject>newArrayList();
      final Function1<DType, Boolean> _function = (DType it) -> {
        return Boolean.valueOf((!(it instanceof IDeductionDefinition)));
      };
      Iterables.<EObject>addAll(list, IterableExtensions.<DType>filter(EcoreUtil2.<DType>eAllOfType(core, DType.class), _function));
      list.addAll(core.getQueries());
      _xblockexpression = Scopes.scopeFor(list, outerScope);
    }
    return _xblockexpression;
  }
}
