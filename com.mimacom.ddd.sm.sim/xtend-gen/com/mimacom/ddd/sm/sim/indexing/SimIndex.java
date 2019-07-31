package com.mimacom.ddd.sm.sim.indexing;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class SimIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  private final BasePackage BASE = BasePackage.eINSTANCE;
  
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
  
  public Iterable<IEObjectDescription> getExportedSystemModelTypeEObjectDescriptions(final EObject context) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      final IResourceDescription rd = this.getResourceDescription(context);
      if ((rd == null)) {
        return Collections.EMPTY_LIST;
      }
      _xblockexpression = rd.getExportedObjectsByType(this.BASE.getDType());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getVisibleSystemModelTypeDescriptions(final EObject context) {
    return this.getVisibleEObjectDescriptions(context, this.BASE.getDType());
  }
  
  public Map<QualifiedName, IEObjectDescription> getVisibleDomainTypeDescriptionsMap(final EObject context) {
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    return IterableExtensions.<QualifiedName, IEObjectDescription>toMap(this.getVisibleEObjectDescriptions(context, this.BASE.getDType()), _function);
  }
  
  public Iterable<IEObjectDescription> getVisibleExternalDeducedSystemModelTypes(final EObject context) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      String _userData = it.getUserData(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM);
      return Boolean.valueOf((_userData != null));
    };
    final Iterable<IEObjectDescription> allVisibleTypes = IterableExtensions.<IEObjectDescription>filter(this.getVisibleSystemModelTypeDescriptions(context), _function);
    final Function1<IEObjectDescription, Boolean> _function_1 = (IEObjectDescription it) -> {
      String _userData = it.getUserData(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM);
      return Boolean.valueOf((_userData != null));
    };
    final Iterable<IEObjectDescription> allExportedTypes = IterableExtensions.<IEObjectDescription>filter(this.getExportedSystemModelTypeEObjectDescriptions(context), _function_1);
    final Set<IEObjectDescription> difference = IterableExtensions.<IEObjectDescription>toSet(allVisibleTypes);
    difference.removeAll(IterableExtensions.<IEObjectDescription>toSet(allExportedTypes));
    return difference;
  }
}
