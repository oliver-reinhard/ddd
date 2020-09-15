package com.mimacom.ddd.sm.sim.ui.builder;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mimacom.ddd.dm.dim.ui.DimUiModule;
import com.mimacom.ddd.dm.dmx.ui.DmxUiModule;
import com.mimacom.ddd.sm.sim.ui.SimUiModule;
import com.mimacom.ddd.sm.sim.ui.builder.SimBuildOrderComputer;
import java.util.Queue;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.clustering.ClusteringBuilderState;
import org.eclipse.xtext.builder.clustering.CurrentDescriptions;
import org.eclipse.xtext.builder.impl.BuildData;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimClusteringBuilderState extends ClusteringBuilderState {
  private static final Logger LOGGER = Logger.getLogger(SimClusteringBuilderState.class);
  
  public SimClusteringBuilderState() {
    SimClusteringBuilderState.LOGGER.setLevel(Level.ERROR);
  }
  
  @Override
  protected void writeNewResourceDescriptions(final BuildData buildData, final IResourceDescriptions oldState, final CurrentDescriptions newState, final IProgressMonitor monitor) {
    super.writeNewResourceDescriptions(buildData, oldState, newState, monitor);
    this.reorderURIQueueByDependencies(buildData, newState);
  }
  
  /**
   * Sort the resources by type:
   * 
   * 1. DMX
   * 2. DIM
   * 3. SIM (themselves sorted by their mutual dependencies owed to type-mappings implicitly used )
   * 4. All other types.
   * 
   * Achieve the sorting by reordering the URIQueue of the BuildData. The CurrentDescriptions are used
   * to validate that importedNamespaces are, in fact, SIM models.
   */
  protected void reorderURIQueueByDependencies(final BuildData buildData, final CurrentDescriptions newState) {
    final Queue<URI> queue = buildData.getURIQueue();
    boolean _isGreaterOrEqual = SimClusteringBuilderState.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      SimClusteringBuilderState.LOGGER.debug(("URI queue (unsorted): " + queue));
    }
    final ImmutableList<URI> queueCopy = ImmutableList.<URI>copyOf(queue);
    queue.clear();
    final Function1<URI, Boolean> _function = (URI it) -> {
      String _fileExtension = it.fileExtension();
      return Boolean.valueOf(Objects.equal(DmxUiModule.FILE_EXTENSION, _fileExtension));
    };
    Iterables.<URI>addAll(queue, IterableExtensions.<URI>filter(queueCopy, _function));
    final Function1<URI, Boolean> _function_1 = (URI it) -> {
      String _fileExtension = it.fileExtension();
      return Boolean.valueOf(Objects.equal(DimUiModule.FILE_EXTENSION, _fileExtension));
    };
    Iterables.<URI>addAll(queue, IterableExtensions.<URI>filter(queueCopy, _function_1));
    final Function1<URI, Boolean> _function_2 = (URI it) -> {
      String _fileExtension = it.fileExtension();
      return Boolean.valueOf(Objects.equal(SimUiModule.FILE_EXTENSION, _fileExtension));
    };
    final Iterable<URI> simURIs = IterableExtensions.<URI>filter(queueCopy, _function_2);
    ResourceSet _resourceSet = buildData.getResourceSet();
    final SimBuildOrderComputer buildOrderComputer = new SimBuildOrderComputer(_resourceSet, newState);
    Iterables.<URI>addAll(queue, buildOrderComputer.orderByDependencies(simURIs));
    queue.addAll(queueCopy);
    boolean _isGreaterOrEqual_1 = SimClusteringBuilderState.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual_1) {
      SimClusteringBuilderState.LOGGER.debug(("URI queue (sorted by dependencies): " + queue));
    }
  }
}
