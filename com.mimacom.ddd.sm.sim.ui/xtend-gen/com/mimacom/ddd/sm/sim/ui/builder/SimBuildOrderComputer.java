package com.mimacom.ddd.sm.sim.ui.builder;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.transpose.TransposeAwareResource;
import com.mimacom.ddd.sm.sim.SInformationModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
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
    
    public final Set<QualifiedName> importedModels;
    
    public boolean visited = false;
    
    public SimModelDescriptor(final URI uri, final DNamespace namespace, final String modelName) {
      this.uri = uri;
      this.namespace = namespace;
      this.name = QualifiedName.create(namespace.getName().split("\\.")).append(modelName);
      this.importedModels = Sets.<QualifiedName>newHashSet();
    }
    
    public void addDependencyTo(final QualifiedName model) {
      this.importedModels.add(model);
    }
  }
  
  private final ResourceSet resourceSet;
  
  private final Iterable<URI> simURIs;
  
  private final Map<QualifiedName, SimBuildOrderComputer.SimModelDescriptor> simModelMap = Maps.<QualifiedName, SimBuildOrderComputer.SimModelDescriptor>newHashMap();
  
  private List<URI> topologicallySortedURIs;
  
  /**
   * @param simURIs each URI must represent an SInformationModel and the resourceSet must be
   *                able to load the corresponding resource. URIs not representing an SInformationModel are ignored.
   */
  public SimBuildOrderComputer(final ResourceSet resourceSet, final Iterable<URI> simURIs) {
    this.resourceSet = resourceSet;
    this.simURIs = simURIs;
  }
  
  /**
   * @throws IllegalStateException if a resource cannot be loaded from one of the given simURIs
   */
  public Iterable<URI> orderByDependencies() {
    if ((this.topologicallySortedURIs == null)) {
      this.buildModelMap();
      Collection<SimBuildOrderComputer.SimModelDescriptor> _values = this.simModelMap.values();
      for (final SimBuildOrderComputer.SimModelDescriptor descriptor : _values) {
        this.addDependenciesFromImports(descriptor);
      }
      this.topologicallySortedURIs = Lists.<URI>newArrayList();
      Collection<SimBuildOrderComputer.SimModelDescriptor> _values_1 = this.simModelMap.values();
      for (final SimBuildOrderComputer.SimModelDescriptor descriptor_1 : _values_1) {
        this.topologicalSort(descriptor_1);
      }
    }
    return this.topologicallySortedURIs;
  }
  
  /**
   * @throws IllegalStateException if a resource cannot be loaded from one of the given simURIs
   */
  protected void buildModelMap() {
    for (final URI uri : this.simURIs) {
      {
        final Resource resource = this.resourceSet.getResource(uri, true);
        if ((resource == null)) {
          throw new IllegalStateException(("Cannot load resource: " + uri));
        }
        EObject _xifexpression = null;
        if ((resource instanceof TransposeAwareResource)) {
          _xifexpression = IterableExtensions.<EObject>head(((TransposeAwareResource)resource).peekContents());
        } else {
          _xifexpression = IterableExtensions.<EObject>head(resource.getContents());
        }
        final EObject namespace = _xifexpression;
        if ((namespace instanceof DNamespace)) {
          final DModel model = ((DNamespace)namespace).getModel();
          if ((model instanceof SInformationModel)) {
            String _name = ((SInformationModel)model).getName();
            final SimBuildOrderComputer.SimModelDescriptor modelDescriptor = new SimBuildOrderComputer.SimModelDescriptor(uri, ((DNamespace)namespace), _name);
            this.simModelMap.put(modelDescriptor.name, modelDescriptor);
          }
        }
      }
    }
  }
  
  /**
   * Imports of a SIM are either of the form "a.b.M.*" or "a.b.M.E" where "M" is a model and "E" is a type
   * or another imported element. We are interested in the "a.b.M" model dependency, so we collect those
   * by stripping the last segment of the URL.
   * Then we validate "a.b.M" against the models models in the given resource set.
   */
  protected void addDependenciesFromImports(final SimBuildOrderComputer.SimModelDescriptor modelDescriptor) {
    EList<DImport> _imports = modelDescriptor.namespace.getImports();
    for (final DImport import_ : _imports) {
      {
        final QualifiedName fullImportQN = QualifiedName.create(import_.getImportedNamespace().split("\\."));
        int _segmentCount = fullImportQN.getSegmentCount();
        boolean _greaterThan = (_segmentCount > 0);
        if (_greaterThan) {
          final QualifiedName candidateSimQN = fullImportQN.skipLast(1);
          boolean _containsKey = this.simModelMap.containsKey(candidateSimQN);
          if (_containsKey) {
            modelDescriptor.addDependencyTo(candidateSimQN);
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
