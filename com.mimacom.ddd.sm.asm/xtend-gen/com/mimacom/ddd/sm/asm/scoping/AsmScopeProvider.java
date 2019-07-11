/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.scoping;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DServiceParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.asm.SServiceInterface;
import com.mimacom.ddd.sm.asm.SServiceOperation;
import com.mimacom.ddd.sm.asm.scoping.AbstractAsmScopeProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class AsmScopeProvider extends AbstractAsmScopeProvider {
  private static final BasePackage epackage = BasePackage.eINSTANCE;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      if ((context instanceof DServiceParameter)) {
        EReference _dTypedMember_Type = AsmScopeProvider.epackage.getDTypedMember_Type();
        boolean _equals = Objects.equal(reference, _dTypedMember_Type);
        if (_equals) {
          final SServiceInterface service = EcoreUtil2.<SServiceInterface>getContainerOfType(context, SServiceInterface.class);
          return Scopes.scopeFor(EcoreUtil2.<DType>eAllOfType(service.getInterface(), DType.class));
        }
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  @Override
  protected IScope getExpressionContainerMemberSwitch(final EObject container, final IScope outerScope) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (container instanceof SServiceOperation) {
      _matched=true;
      _switchResult = Scopes.scopeFor(((SServiceOperation)container).getParameters(), this.getExpressionContainerMemberScope(container, outerScope));
    }
    if (!_matched) {
      if (container instanceof SServiceInterface) {
        _matched=true;
        _switchResult = Scopes.scopeFor(EcoreUtil2.<DType>eAllOfType(((SServiceInterface)container).getCore(), DType.class), outerScope);
      }
    }
    if (!_matched) {
      _switchResult = super.getExpressionContainerMemberSwitch(container, outerScope);
    }
    return _switchResult;
  }
}
