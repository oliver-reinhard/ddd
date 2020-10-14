package com.mimacom.ddd.sm.sim.ui.builder

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.transpose.TransposeAwareResource
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import com.mimacom.ddd.sm.sim.SystemInformationModel

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
		public val Set<QualifiedName> importedModels
		public var boolean visited = false

		new(URI uri, DNamespace namespace, String modelName) {
			this.uri = uri
			this.namespace = namespace
			this.name = QualifiedName.create(namespace.name.split("\\.")).append(modelName)
			importedModels = Sets.newHashSet
		}

		def void addDependencyTo(QualifiedName model) {
			importedModels.add(model)
		}
	}

	val ResourceSet resourceSet
	val Iterable<URI> simURIs
	val Map<QualifiedName, SimModelDescriptor> simModelMap = Maps.newHashMap
	var List<URI> topologicallySortedURIs

	/**
	 * @param simURIs each URI must represent an SInformationModel and the resourceSet must be 
	 *                able to load the corresponding resource. URIs not representing an SInformationModel are ignored.
	 */
	new(ResourceSet resourceSet, Iterable<URI> simURIs) {
		this.resourceSet = resourceSet
		this.simURIs = simURIs
	}

	/**
	 * @throws IllegalStateException if a resource cannot be loaded from one of the given simURIs
	 */
	def Iterable<URI> orderByDependencies() {
		if (topologicallySortedURIs === null) {
			buildModelMap() // throws IllegalStateException
			for (descriptor : simModelMap.values) {
				descriptor.addDependenciesFromImports()
			}

			topologicallySortedURIs = Lists.newArrayList
			for (descriptor : simModelMap.values) {
				descriptor.topologicalSort()
			}
		}
		return topologicallySortedURIs
	}

	/**
	 * @throws IllegalStateException if a resource cannot be loaded from one of the given simURIs
	 */
	protected def void buildModelMap() {
		// Build a map of descriptors for all SIM models:
		for (uri : simURIs) {
			val resource = resourceSet.getResource(uri, true)
			if (resource === null) {
				throw new IllegalStateException("Cannot load resource: " + uri)
			}
			val namespace = if (resource instanceof TransposeAwareResource) {
					resource.peekContents.head // access resource contents without computing the derived state
				} else {
					resource.contents.head
				}
			if (namespace instanceof DNamespace) {
				val model = namespace.model
				if (model instanceof SystemInformationModel) {
					val modelDescriptor = new SimModelDescriptor(uri, namespace, model.name)
					simModelMap.put(modelDescriptor.name, modelDescriptor)
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
	protected def void addDependenciesFromImports(SimModelDescriptor modelDescriptor) {
		for (import_ : modelDescriptor.namespace.imports) {
			// Strip wildcard / last segment:
			val fullImportQN = QualifiedName.create(import_.importedNamespace.split("\\."))
			if (fullImportQN.segmentCount > 0) {
				val candidateSimQN = fullImportQN.skipLast(1)
				// For an import to be in scope, the target SIM must be in this resource set, i.e. in the model map:
				if (simModelMap.containsKey(candidateSimQN)) {
					modelDescriptor.addDependencyTo(candidateSimQN)
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
