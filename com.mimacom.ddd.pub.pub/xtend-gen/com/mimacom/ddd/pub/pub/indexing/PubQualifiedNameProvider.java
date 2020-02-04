package com.mimacom.ddd.pub.pub.indexing;

import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class PubQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  private static final Logger LOGGER = Logger.getLogger(PubQualifiedNameProvider.class);
  
  @Override
  public QualifiedName computeFullyQualifiedName(final EObject obj) {
    QualifiedName _switchResult = null;
    boolean _matched = false;
    if (obj instanceof Component) {
      _matched=true;
      _switchResult = super.computeFullyQualifiedName(obj);
    }
    if (!_matched) {
      if (obj instanceof ReferenceTarget) {
        _matched=true;
        _switchResult = this.componentWideObject(((ReferenceTarget)obj));
      }
    }
    if (!_matched) {
      return super.computeFullyQualifiedName(obj);
    }
    final QualifiedName qualifiedName = _switchResult;
    boolean _isInfoEnabled = PubQualifiedNameProvider.LOGGER.isInfoEnabled();
    if (_isInfoEnabled) {
      String _string = null;
      if (qualifiedName!=null) {
        _string=qualifiedName.toString("|");
      }
      String _plus = (_string + " - ");
      String _plus_1 = (_plus + obj);
      PubQualifiedNameProvider.LOGGER.info(_plus_1);
    }
    return qualifiedName;
  }
  
  /**
   * Qualified name of objects implementing ReferenceTarget = {Component.name, obj.name} instead of fully qualified by containment hierarchy.
   */
  protected QualifiedName componentWideObject(final ReferenceTarget obj) {
    if (((obj.getName() != null) && (obj.getName().length() > 0))) {
      final Component compo = EcoreUtil2.<Component>getContainerOfType(obj, Component.class);
      if ((compo != null)) {
        final QualifiedName compoQN = this.getOrComputeFullyQualifiedName(compo);
        return compoQN.append(obj.getName());
      }
    }
    return super.computeFullyQualifiedName(obj);
  }
}
