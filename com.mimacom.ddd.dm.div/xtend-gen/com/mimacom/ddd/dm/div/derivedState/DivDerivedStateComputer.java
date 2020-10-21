package com.mimacom.ddd.dm.div.derivedState;

import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.transpose.TransposeAwareDerivedStateComputer;
import com.mimacom.ddd.dm.div.DomainInformationView;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class DivDerivedStateComputer extends TransposeAwareDerivedStateComputer {
  private static final Logger LOGGER = Logger.getLogger(DivDerivedStateComputer.class);
  
  public DivDerivedStateComputer() {
    DivDerivedStateComputer.LOGGER.setLevel(Level.DEBUG);
    DivDerivedStateComputer.LOGGER.debug("Created");
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    boolean _hasSyntaxErrors = resource.getParseResult().hasSyntaxErrors();
    boolean _not = (!_hasSyntaxErrors);
    if (_not) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final DNamespace namespace = ((DNamespace) _head);
      DModel _model = namespace.getModel();
      final DomainInformationView model = ((DomainInformationView) _model);
      if ((model != null)) {
        this.doInstallDerivedState(resource, model);
      }
    }
  }
}
