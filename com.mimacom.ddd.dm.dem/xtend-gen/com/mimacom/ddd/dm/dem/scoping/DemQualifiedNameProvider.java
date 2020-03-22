package com.mimacom.ddd.dm.dem.scoping;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class DemQualifiedNameProvider extends DmxQualifiedNameProvider {
  private static final Logger LOGGER = Logger.getLogger(DemQualifiedNameProvider.class);
  
  @Override
  public QualifiedName computeFullyQualifiedName(final EObject obj) {
    QualifiedName _switchResult = null;
    boolean _matched = false;
    if (obj instanceof DemActor) {
      _matched=true;
      _switchResult = this.namespaceWideObject(((DNamedElement)obj));
    }
    if (!_matched) {
      _switchResult = super.computeFullyQualifiedName(obj);
    }
    final QualifiedName qualifiedName = _switchResult;
    boolean _isDebugEnabled = DemQualifiedNameProvider.LOGGER.isDebugEnabled();
    if (_isDebugEnabled) {
      String _string = null;
      if (qualifiedName!=null) {
        _string=qualifiedName.toString("|");
      }
      String _plus = (_string + " - ");
      String _plus_1 = (_plus + obj);
      DemQualifiedNameProvider.LOGGER.debug(_plus_1);
    }
    return qualifiedName;
  }
}
