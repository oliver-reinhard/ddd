package com.mimacom.ddd.dm.base.modelDeduction;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IResourceDescription;

@SuppressWarnings("all")
public class TrueDerivedStateAwareResourceDescriptionManager extends DerivedStateAwareResourceDescriptionManager {
  @Override
  public IResourceDescription getResourceDescription(final Resource resource) {
    IResourceDescription _xblockexpression = null;
    {
      if ((resource instanceof DerivedStateAwareResource)) {
        boolean _isFullyInitialized = ((DerivedStateAwareResource)resource).isFullyInitialized();
        boolean _not = (!_isFullyInitialized);
        if (_not) {
          ((DerivedStateAwareResource)resource).installDerivedState(true);
        }
      }
      _xblockexpression = super.getResourceDescription(resource);
    }
    return _xblockexpression;
  }
}
