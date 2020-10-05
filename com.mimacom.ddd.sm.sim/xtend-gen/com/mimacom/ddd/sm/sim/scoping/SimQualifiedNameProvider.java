package com.mimacom.ddd.sm.sim.scoping;

import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.sm.sim.SInformationModel;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class SimQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  private static final Logger LOGGER = Logger.getLogger(SimQualifiedNameProvider.class);
  
  @Override
  public QualifiedName computeFullyQualifiedName(final EObject obj) {
    QualifiedName _switchResult = null;
    boolean _matched = false;
    if (obj instanceof DNamespace) {
      _matched=true;
      _switchResult = super.computeFullyQualifiedName(obj);
    }
    if (!_matched) {
      if (obj instanceof DEntityType) {
        boolean _isRoot = ((DEntityType)obj).isRoot();
        if (_isRoot) {
          _matched=true;
          _switchResult = this.modelWideObject(((DNamedElement)obj));
        }
      }
    }
    if (!_matched) {
      _switchResult = super.computeFullyQualifiedName(obj);
    }
    final QualifiedName qualifiedName = _switchResult;
    boolean _isDebugEnabled = SimQualifiedNameProvider.LOGGER.isDebugEnabled();
    if (_isDebugEnabled) {
      String _string = null;
      if (qualifiedName!=null) {
        _string=qualifiedName.toString("|");
      }
      String _plus = (_string + " - ");
      String _plus_1 = (_plus + obj);
      SimQualifiedNameProvider.LOGGER.debug(_plus_1);
    }
    return qualifiedName;
  }
  
  /**
   * Object's QN = {SInformationModel.name, obj.name} --> omit DAggregate.name from qualified name!
   */
  protected QualifiedName modelWideObject(final DNamedElement obj) {
    String _name = obj.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      final SInformationModel model = EcoreUtil2.<SInformationModel>getContainerOfType(obj, SInformationModel.class);
      if ((model != null)) {
        final QualifiedName modelQN = this.getOrComputeFullyQualifiedName(model);
        return modelQN.append(obj.getName());
      }
    }
    return super.computeFullyQualifiedName(obj);
  }
}
