package com.mimacom.ddd.dm.dmx.indexing;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DNamespace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

@Singleton
@SuppressWarnings("all")
public class DmxResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  @Override
  public boolean createEObjectDescriptions(final EObject obj, final IAcceptor<IEObjectDescription> acceptor) {
    if ((obj instanceof DNamespace)) {
      return true;
    }
    return super.createEObjectDescriptions(obj, acceptor);
  }
}
