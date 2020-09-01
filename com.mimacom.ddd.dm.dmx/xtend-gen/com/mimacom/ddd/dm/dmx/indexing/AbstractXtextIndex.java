package com.mimacom.ddd.dm.dmx.indexing;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public abstract class AbstractXtextIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  /**
   * Returns the resource description of the context's containing eResource.
   * 
   * @param context used to derive the relevant eResource.
   */
  protected IResourceDescription getEResourceDescription(final EObject context) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(context.eResource());
      _xblockexpression = index.getResourceDescription(context.eResource().getURI());
    }
    return _xblockexpression;
  }
  
  /**
   * @param context used to derive the relevant eResource.
   */
  protected Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject context) {
    return this.getEResourceDescription(context).getExportedObjects();
  }
  
  /**
   * @param context used to derive the relevant eResource.
   */
  protected List<IContainer> getVisibleContainers(final EObject context) {
    List<IContainer> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(context.eResource());
      final IResourceDescription rd = index.getResourceDescription(context.eResource().getURI());
      if ((rd == null)) {
        return Collections.EMPTY_LIST;
      }
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  /**
   * Returns also the visible objects of the resource containing the 'context' object.
   * 
   * @param context used to derive the relevant eResource.
   */
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject context, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(context), _function));
  }
  
  /**
   * Returns also the visible objects of the resource containing the 'context' object.
   * 
   * @param context used to derive the relevant eResource.
   */
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject context, final EClass type, final QualifiedName name) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjects(type, name, false);
    };
    final Iterable<IEObjectDescription> result = Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(context), _function));
    return result;
  }
  
  /**
   * @param context used to derive the relevant eResource.
   */
  public <T extends Object> T resolveEObjectDescription(final EObject context, final IEObjectDescription desc, final Class<T> type) {
    EObject obj = desc.getEObjectOrProxy();
    boolean _eIsProxy = obj.eIsProxy();
    if (_eIsProxy) {
      obj = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
      if (((obj == null) || obj.eIsProxy())) {
        return null;
      }
    }
    boolean _isAssignableFrom = type.isAssignableFrom(obj.getClass());
    if (_isAssignableFrom) {
      return ((T) obj);
    }
    return null;
  }
}
