package com.mimacom.ddd.sm.sim.derivedState;

import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.transpose.TransposeAwareDerivedStateComputer;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SimDerivedStateComputer extends TransposeAwareDerivedStateComputer {
  private static final Logger LOGGER = Logger.getLogger(SimDerivedStateComputer.class);
  
  public SimDerivedStateComputer() {
    SimDerivedStateComputer.LOGGER.setLevel(Level.DEBUG);
    SimDerivedStateComputer.LOGGER.debug("Created");
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    boolean _hasSyntaxErrors = resource.getParseResult().hasSyntaxErrors();
    boolean _not = (!_hasSyntaxErrors);
    if (_not) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final DNamespace namespace = ((DNamespace) _head);
      DModel _model = namespace.getModel();
      final SInformationModel model = ((SInformationModel) _model);
      if ((model != null)) {
        if ((preLinkingPhase && (model.getKind() != SInformationModelKind.BASE))) {
          URI _uRI = resource.getURI();
          String _plus = ("Derive pre-linking state SKIPPED for " + _uRI);
          SimDerivedStateComputer.LOGGER.debug(_plus);
        } else {
          this.doInstallDerivedState(resource, model);
        }
      }
    }
  }
}
