package com.mimacom.ddd.dm.dmx.indexing;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DNamespace;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Singleton
@SuppressWarnings("all")
public class DmxResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  protected static final Logger LOGGER = Logger.getLogger(DmxResourceDescriptionStrategy.class);
  
  @Override
  public boolean createEObjectDescriptions(final EObject obj, final IAcceptor<IEObjectDescription> acceptor) {
    if ((obj instanceof DNamespace)) {
      return true;
    }
    boolean _isGreaterOrEqual = DmxResourceDescriptionStrategy.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      IQualifiedNameProvider _qualifiedNameProvider = this.getQualifiedNameProvider();
      boolean _tripleEquals = (_qualifiedNameProvider == null);
      if (_tripleEquals) {
        return false;
      }
      try {
        final QualifiedName qualifiedName = this.getQualifiedNameProvider().getFullyQualifiedName(obj);
        if ((qualifiedName != null)) {
          final IEObjectDescription desc = EObjectDescription.create(qualifiedName, obj);
          acceptor.accept(desc);
          String _path = obj.eResource().getURI().path();
          String _plus = ("OBJ " + _path);
          String _plus_1 = (_plus + " - ");
          String _plus_2 = (_plus_1 + qualifiedName);
          String _plus_3 = (_plus_2 + ": ");
          String _name = obj.eClass().getName();
          String _plus_4 = (_plus_3 + _name);
          DmxResourceDescriptionStrategy.LOGGER.debug(_plus_4);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exc = (Exception)_t;
          DmxResourceDescriptionStrategy.LOGGER.error(exc.getMessage(), exc);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return true;
    } else {
      return super.createEObjectDescriptions(obj, acceptor);
    }
  }
}
