package com.mimacom.ddd.dm.dmx.indexing;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFunction;
import com.mimacom.ddd.dm.dmx.DmxFunctionParameter;
import com.mimacom.ddd.dm.dmx.DmxIterator;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Singleton
@SuppressWarnings("all")
public class DmxIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  private static final DmxPackage DMX = DmxPackage.eINSTANCE;
  
  public IResourceDescription getResourceDescription(final EObject context) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(context.eResource());
      _xblockexpression = index.getResourceDescription(context.eResource().getURI());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject context) {
    return this.getResourceDescription(context).getExportedObjects();
  }
  
  public List<IContainer> getVisibleContainers(final EObject context) {
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
   * Returns also the visible objects of the resource containing context
   */
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject context, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(context), _function));
  }
  
  public List<DmxFilter> allVisibleFilters(final EObject context) {
    final Iterable<IEObjectDescription> functionDescriptions = this.getVisibleEObjectDescriptions(context, DmxIndex.DMX.getDmxFilter());
    final ArrayList<DmxFilter> result = Lists.<DmxFilter>newArrayList();
    for (final IEObjectDescription desc : functionDescriptions) {
      {
        EObject filter = desc.getEObjectOrProxy();
        boolean _eIsProxy = filter.eIsProxy();
        if (_eIsProxy) {
          filter = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
        }
        if ((filter instanceof DmxFilter)) {
          result.add(((DmxFilter)filter));
        }
      }
    }
    return result;
  }
  
  public List<DmxFilter> supportedFilters(final EObject context, final DmxBaseType baseType, final boolean collection) {
    if (collection) {
      return this.collectionFilters(context, baseType);
    } else {
      return this.singleObjectFunctions(context, baseType);
    }
  }
  
  private List<DmxFilter> singleObjectFunctions(final EObject context, final DmxBaseType baseType) {
    final Iterable<IEObjectDescription> functionDescriptions = this.getVisibleEObjectDescriptions(context, DmxIndex.DMX.getDmxFunction());
    final ArrayList<DmxFilter> result = Lists.<DmxFilter>newArrayList();
    for (final IEObjectDescription desc : functionDescriptions) {
      {
        EObject func = desc.getEObjectOrProxy();
        boolean _eIsProxy = func.eIsProxy();
        if (_eIsProxy) {
          func = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
        }
        if ((func instanceof DmxFunction)) {
          int _size = ((DmxFunction)func).getParameters().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            final DmxFunctionParameter param = ((DmxFunction)func).getParameters().get(0);
            if ((Objects.equal(param.getBaseType(), baseType) && (!param.isBaseTypeCollection()))) {
              result.add(((DmxFunction)func));
            }
          }
        }
      }
    }
    return result;
  }
  
  private List<DmxFilter> collectionFilters(final EObject context, final DmxBaseType baseType) {
    final Iterable<IEObjectDescription> functionDescriptions = this.getVisibleEObjectDescriptions(context, DmxIndex.DMX.getDmxIterator());
    final ArrayList<DmxFilter> result = Lists.<DmxFilter>newArrayList();
    for (final IEObjectDescription desc : functionDescriptions) {
      {
        EObject iterator = desc.getEObjectOrProxy();
        boolean _eIsProxy = iterator.eIsProxy();
        if (_eIsProxy) {
          iterator = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
        }
        if ((iterator instanceof DmxIterator)) {
          result.add(((DmxIterator)iterator));
        }
      }
    }
    return result;
  }
}
