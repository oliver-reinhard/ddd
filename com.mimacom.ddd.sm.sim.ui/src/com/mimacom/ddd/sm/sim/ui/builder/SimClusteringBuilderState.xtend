package com.mimacom.ddd.sm.sim.ui.builder

import com.google.common.collect.ImmutableList
import com.mimacom.ddd.dm.dim.ui.DimUiModule
import com.mimacom.ddd.dm.dmx.ui.DmxUiModule
import com.mimacom.ddd.sm.sim.ui.SimUiModule
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtext.builder.clustering.ClusteringBuilderState
import org.eclipse.xtext.builder.clustering.CurrentDescriptions
import org.eclipse.xtext.builder.impl.BuildData
import org.eclipse.xtext.resource.IResourceDescriptions

class SimClusteringBuilderState extends ClusteringBuilderState {
	
	static val LOGGER = Logger.getLogger(SimClusteringBuilderState);
	
	new() {
		LOGGER.level = Level.ERROR
	}

	override protected void writeNewResourceDescriptions(BuildData buildData, IResourceDescriptions oldState,
		CurrentDescriptions newState, IProgressMonitor monitor) {
		super.writeNewResourceDescriptions(buildData, oldState, newState, monitor)
		reorderURIQueueByDependencies(buildData, newState)
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
	protected def void reorderURIQueueByDependencies(BuildData buildData, CurrentDescriptions newState) {
		val queue = buildData.URIQueue
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("URI queue (unsorted): " + queue)
		}
		val queueCopy = ImmutableList.copyOf(queue)
		queue.clear

		queue.addAll(queueCopy.filter[DmxUiModule.FILE_EXTENSION == it.fileExtension])
		queue.addAll(queueCopy.filter[DimUiModule.FILE_EXTENSION == it.fileExtension])

		val simURIs = queueCopy.filter[SimUiModule.FILE_EXTENSION == it.fileExtension]
		val buildOrderComputer = new SimBuildOrderComputer(buildData.resourceSet, newState)
		queue.addAll(buildOrderComputer.orderByDependencies(simURIs))

		// add remaining elements:
		queue.addAll(queueCopy) // the existing elements of the queue will maintain their position
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("URI queue (sorted by dependencies): " + queue)
		}
	}
}
