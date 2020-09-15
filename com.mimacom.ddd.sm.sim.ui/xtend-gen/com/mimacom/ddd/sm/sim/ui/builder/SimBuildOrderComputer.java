package com.mimacom.ddd.sm.sim.ui.builder;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SimPackage;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.clustering.CurrentDescriptions;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * In the context of a ClusteringBuilderState, takes a set of SIM information models (as URIs),
 * analysis their mutual dependencies via imported namespaces and orders them accordingly
 * to enable building and linking those models in one pass.
 * 
 * This implementation is not thread-safe.
 */
@SuppressWarnings("all")
public class SimBuildOrderComputer {
  public static class SimModelDescriptor {
    public final URI uri;
    
    public final DNamespace namespace;
    
    public final QualifiedName name;
    
    public final List<QualifiedName> importedModels;
    
    public boolean visited = false;
    
    public SimModelDescriptor(final URI uri, final DNamespace namespace, final String modelName) {
      this.uri = uri;
      this.namespace = namespace;
      this.name = QualifiedName.create(namespace.getName().split("\\.")).append(modelName);
      this.importedModels = Lists.<QualifiedName>newArrayList();
    }
    
    public void addDependencyTo(final QualifiedName model) {
      this.importedModels.add(model);
    }
  }
  
  private final ResourceSet resourceSet;
  
  private final CurrentDescriptions index;
  
  private final Map<QualifiedName, SimBuildOrderComputer.SimModelDescriptor> simModelMap = Maps.<QualifiedName, SimBuildOrderComputer.SimModelDescriptor>newHashMap();
  
  private final List<URI> topologicallySortedURIs = Lists.<URI>newArrayList();
  
  public SimBuildOrderComputer(final ResourceSet resourceSet, final CurrentDescriptions index) {
    this.resourceSet = resourceSet;
    this.index = index;
  }
  
  /**
   * @param simURIs each URI must represent an SInformationModel and the resourceSet must be
   *                able to load the corresponding resource.
   * @throws IllegalStateException
   */
  public Iterable<URI> orderByDependencies(final Iterable<URI> simURIs) {
    this.simModelMap.clear();
    for (final URI uri : simURIs) {
      {
        final Resource resource = this.resourceSet.getResource(uri, true);
        if ((resource == null)) {
          throw new IllegalStateException(("Cannot load resource: " + uri));
        }
        final EObject namespace = IterableExtensions.<EObject>head(resource.getContents());
        if ((namespace instanceof DNamespace)) {
          final DModel model = ((DNamespace)namespace).getModel();
          if ((model instanceof SInformationModel)) {
            String _name = ((SInformationModel)model).getName();
            final SimBuildOrderComputer.SimModelDescriptor descriptor = new SimBuildOrderComputer.SimModelDescriptor(uri, ((DNamespace)namespace), _name);
            this.simModelMap.put(descriptor.name, descriptor);
          } else {
            throw new IllegalStateException(("Resource is not a SIM information model: " + uri));
          }
        }
      }
    }
    Collection<SimBuildOrderComputer.SimModelDescriptor> _values = this.simModelMap.values();
    for (final SimBuildOrderComputer.SimModelDescriptor descriptor : _values) {
      this.computeAndAddDependencies(descriptor);
    }
    this.topologicallySortedURIs.clear();
    Collection<SimBuildOrderComputer.SimModelDescriptor> _values_1 = this.simModelMap.values();
    for (final SimBuildOrderComputer.SimModelDescriptor descriptor_1 : _values_1) {
      this.topologicalSort(descriptor_1);
    }
    return this.topologicallySortedURIs;
  }
  
  protected void computeAndAddDependencies(final SimBuildOrderComputer.SimModelDescriptor descriptor) {
    EList<DImport> _imports = descriptor.namespace.getImports();
    for (final DImport import_ : _imports) {
      {
        final String importedNamespaceStr = import_.getImportedNamespace().replaceAll("\\.\\*", "");
        final QualifiedName importedNamespaceQN = QualifiedName.create(importedNamespaceStr.split("\\."));
        boolean _containsKey = this.simModelMap.containsKey(importedNamespaceQN);
        if (_containsKey) {
          final Iterable<IEObjectDescription> importedSimModels = this.index.getExportedObjects(SimPackage.eINSTANCE.getSInformationModel(), importedNamespaceQN, false);
          boolean _isEmpty = IterableExtensions.isEmpty(importedSimModels);
          boolean _not = (!_isEmpty);
          if (_not) {
            descriptor.addDependencyTo(importedNamespaceQN);
          }
        }
      }
    }
  }
  
  protected void topologicalSort(final SimBuildOrderComputer.SimModelDescriptor current) {
    if (current.visited) {
      return;
    }
    current.visited = true;
    for (final QualifiedName name : current.importedModels) {
      {
        final SimBuildOrderComputer.SimModelDescriptor model = this.simModelMap.get(name);
        if ((model != null)) {
          this.topologicalSort(model);
        }
      }
    }
    this.topologicallySortedURIs.add(current.uri);
  }
}
