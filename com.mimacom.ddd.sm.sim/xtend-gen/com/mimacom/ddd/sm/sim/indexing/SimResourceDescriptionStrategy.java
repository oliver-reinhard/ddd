package com.mimacom.ddd.sm.sim.indexing;

import com.google.inject.Singleton;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class SimResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  /**
   * Prevents indexing of deduction rules and of information models with attribute deduced = true
   */
  @Override
  public boolean createEObjectDescriptions(final EObject obj, final IAcceptor<IEObjectDescription> acceptor) {
    if ((obj instanceof SDeducibleElement)) {
      SDeductionRule _deductionRule = ((SDeducibleElement)obj).getDeductionRule();
      boolean _tripleNotEquals = (_deductionRule != null);
      if (_tripleNotEquals) {
        return false;
      }
    }
    Resource _eResource = obj.eResource();
    boolean _tripleNotEquals_1 = (_eResource != null);
    if (_tripleNotEquals_1) {
      final EObject model = IterableExtensions.<EObject>head(obj.eResource().getContents());
      if ((model instanceof SInformationModel)) {
        boolean _isDeduced = ((SInformationModel)model).isDeduced();
        if (_isDeduced) {
          return false;
        }
      }
    }
    return super.createEObjectDescriptions(obj, acceptor);
  }
}
