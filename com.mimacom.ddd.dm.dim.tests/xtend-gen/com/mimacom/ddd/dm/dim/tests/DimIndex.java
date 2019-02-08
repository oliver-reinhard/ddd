package com.mimacom.ddd.dm.dim.tests;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

@SuppressWarnings("all")
public class DimIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      _xblockexpression = index.getResourceDescription(o.eResource().getURI());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjects();
  }
  
  public Iterable<IEObjectDescription> getExportedClassesEObjectDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjectsByType(BasePackage.eINSTANCE.getDComplexType());
  }
}
