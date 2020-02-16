package com.mimacom.ddd.dm.dmx.scoping;

import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DInformationModel;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DType;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class DmxQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  private static final Logger LOGGER = Logger.getLogger(DmxQualifiedNameProvider.class);
  
  @Override
  public QualifiedName computeFullyQualifiedName(final EObject obj) {
    QualifiedName _switchResult = null;
    boolean _matched = false;
    if (obj instanceof DNamespace) {
      _matched=true;
      _switchResult = super.computeFullyQualifiedName(obj);
    }
    if (!_matched) {
      if (obj instanceof DType) {
        EObject _eContainer = ((DType)obj).eContainer();
        if ((_eContainer instanceof DInformationModel)) {
          _matched=true;
          _switchResult = this.namespaceWideObject(((DNamedElement)obj));
        }
      }
    }
    if (!_matched) {
      if (obj instanceof DAggregate) {
        _matched=true;
        _switchResult = this.namespaceWideObject(((DNamedElement)obj));
      }
    }
    if (!_matched) {
      if (obj instanceof DEntityType) {
        boolean _isRoot = ((DEntityType)obj).isRoot();
        if (_isRoot) {
          _matched=true;
          _switchResult = this.namespaceWideObject(((DNamedElement)obj));
        }
      }
    }
    if (!_matched) {
      _switchResult = super.computeFullyQualifiedName(obj);
    }
    final QualifiedName qualifiedName = _switchResult;
    boolean _isDebugEnabled = DmxQualifiedNameProvider.LOGGER.isDebugEnabled();
    if (_isDebugEnabled) {
      String _string = null;
      if (qualifiedName!=null) {
        _string=qualifiedName.toString("|");
      }
      String _plus = (_string + " - ");
      String _plus_1 = (_plus + obj);
      DmxQualifiedNameProvider.LOGGER.debug(_plus_1);
    }
    return qualifiedName;
  }
  
  /**
   * Object's QN = {DNamespace.name, obj.name} --> omit DInformationModel.name from qualified name!
   */
  protected QualifiedName namespaceWideObject(final DNamedElement obj) {
    String _name = obj.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      final DNamespace namespace = EcoreUtil2.<DNamespace>getContainerOfType(obj, DNamespace.class);
      if ((namespace != null)) {
        final QualifiedName nsQN = this.getOrComputeFullyQualifiedName(namespace);
        return nsQN.append(obj.getName());
      }
    }
    return super.computeFullyQualifiedName(obj);
  }
}
