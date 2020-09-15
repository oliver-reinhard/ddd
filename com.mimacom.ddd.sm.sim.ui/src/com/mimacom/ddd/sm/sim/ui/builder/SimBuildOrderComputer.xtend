package com.mimacom.ddd.sm.sim.ui.builder

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SimPackage
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.builder.clustering.CurrentDescriptions
import org.eclipse.xtext.naming.QualifiedName

/**
 * In the context of a ClusteringBuilderState, takes a set of SIM information models (as URIs),
 * analysis their mutual dependencies via imported namespaces and orders them accordingly
 * to enable building and linking those models in one pass.
 * 
 * This implementation is not thread-safe.
 */
class SimBuildOrderComputer {

	static class SimModelDescriptor {
		public val URI uri
		public val DNamespace namespace
		public val QualifiedName name
		public val List<QualifiedName> importedModels
		public var boolean visited = false

		new(URI uri, DNamespace namespace, String modelName) {
			this.uri = uri
			this.namespace = namespace
			this.name = QualifiedName.create(namespace.name.split("\\.")).append(modelName)
			importedModels = Lists.newArrayList
		}

		def void addDependencyTo(QualifiedName model) {
			importedModels.add(model)
		}
	}

	val ResourceSet resourceSet
	val CurrentDescriptions index
	val Map<QualifiedName, SimModelDescriptor> simModelMap = Maps.newHashMap
	val List<URI> topologicallySortedURIs = Lists.newArrayList

	new(ResourceSet resourceSet, CurrentDescriptions index) {
		this.resourceSet = resourceSet
		this.index = index
	}

	/**
	 * @param simURIs each URI must represent an SInformationModel and the resourceSet must be 
	 *                able to load the corresponding resource.
	 * @throws IllegalStateException
	 */
	def Iterable<URI> orderByDependencies(Iterable<URI> simURIs) {
		simModelMap.clear

		// Build a map of descriptors for all SIM models:
		for (uri : simURIs) {
			val resource = resourceSet.getResource(uri, true)
			if (resource === null) {
				throw new IllegalStateException("Cannot load resource: " + uri)
			}
			val namespace = resource.contents.head
			if (namespace instanceof DNamespace) {
				val model = namespace.model
				if (model instanceof SInformationModel) {
					val descriptor = new SimModelDescriptor(uri, namespace, model.name)
					simModelMap.put(descriptor.name, descriptor)
				} else {
					throw new IllegalStateException("Resource is not a SIM information model: " + uri)
				}
			}
		}
		
		for (descriptor : simModelMap.values) {
			descriptor.computeAndAddDependencies()
		}

		topologicallySortedURIs.clear
		for (descriptor : simModelMap.values) {
			descriptor.topologicalSort()
		}
		return topologicallySortedURIs
	}

	protected def void computeAndAddDependencies(SimModelDescriptor descriptor) {
		for (import_ : descriptor.namespace.imports) {
			val importedNamespaceStr = import_.importedNamespace.replaceAll("\\.\\*", "") // remove trailing wildcard
			val importedNamespaceQN = QualifiedName.create(importedNamespaceStr.split("\\."))
			// For it to be in scope, the target SIM model must be in this batch, i.e. in the map:
			if (simModelMap.containsKey(importedNamespaceQN)) {
				// Validate the type of the imported namespace with Xtext index:
				val importedSimModels = index.getExportedObjects(SimPackage.eINSTANCE.SInformationModel,
					importedNamespaceQN, false)
				if (! importedSimModels.empty) {
					descriptor.addDependencyTo(importedNamespaceQN)
				}
			}
		}
	}

	protected def void topologicalSort(SimModelDescriptor current) {
		if (current.visited) return;
		current.visited = true
		for (name : current.importedModels) {
			val model = simModelMap.get(name)
			if (model !== null) {
				model.topologicalSort() // recursion
			}
		}
		topologicallySortedURIs.add(current.uri)
	}
}
