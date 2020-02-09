package com.mimacom.ddd.pub.pub.diagramProvider

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.IDiagramRoot
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.core.runtime.ContributorFactoryOSGi
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.InvalidRegistryObjectException
import org.eclipse.core.runtime.Platform

import static com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil.*

import static extension com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil.identify

@Singleton
class DiagramProviderRegistry {

	static final Logger LOGGER = Logger.getLogger(DiagramProviderRegistry);

	var List<DiagramRendererProxy> cachedRenderers
	var Map<String, String> cachedDiagramTypes

	private def loadExtensions() {
		cachedDiagramTypes = Maps.newHashMap
		for (ext : Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID).filter [
			name == ELEMENT_DIAGRAM_TYPE
		]) {
			LOGGER.info(ext.identify + ": extension loaded")

			try {
				val id = ext.loadAttributeAndLogException(ATTR_DIAGRAM_TYPE_ID)
				val name = ext.loadAttributeAndLogException(ATTR_DIAGRAM_TYPE_NAME)
				cachedDiagramTypes.put(id, name)

			} catch (InvalidRegistryObjectException ex) {
				// already handled by loadAttribute
			}
		}

		cachedRenderers = Lists.newArrayList
		for (ext : Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID).filter [
			name == ELEMENT_RENDERER
		]) {
			LOGGER.info(ext.identify + ": extension loaded")

			try {
				val id = ext.loadAttributeAndLogException(ATTR_RENDERER_ID)
				val diagramName = ext.loadAttributeAndLogException(ATTR_RENDERER_DIAGRAM_NAME)
				val diagramTypeID = ext.loadAttributeAndLogException(ATTR_RENDERER_DIAGRAM_TYPE_ID)
				val diagramRootClassName = ext.loadAttributeAndLogException(ATTR_RENDERER_DIAGRAM_ROOT_CLASS)
				val outputFileFormatName = ext.loadAttributeAndLogException(ATTR_RENDERER_OUTPUT_FILE_FORMAT)

				try {
					val diagramRootClass = ext.loadDiagramRootClass(diagramRootClassName) // throws ClassNotFoundException
					LOGGER.info("diagram root class loaded: " + diagramRootClass.name)
					val outputFileFormat = DiagramFileFormat.valueOf(outputFileFormatName.toUpperCase)

					cachedRenderers.add(
						new DiagramRendererProxy(id, diagramName, diagramRootClass, diagramTypeID, ext,
							outputFileFormat))

				} catch (IllegalArgumentException ex) {
					LOGGER.error(ext.identify(ATTR_RENDERER_OUTPUT_FILE_FORMAT) + ": Unsupported format: " +
						outputFileFormatName)
				} catch (ClassNotFoundException ex) {
					LOGGER.error(ext.identify(ATTR_RENDERER_DIAGRAM_ROOT_CLASS) + ": Class not found: " +
						diagramRootClassName)
				} catch (Throwable ex) {
					LOGGER.error(ext.identify, ex)
				}

			} catch (InvalidRegistryObjectException ex) {
				// already handled by loadAttribute
			}
		}
	}

	def String getDiagramTypeName(String id) {
		if (cachedDiagramTypes === null) {
			loadExtensions()
		}
		return cachedDiagramTypes.get(id)
	}

	def DiagramRendererProxy[] getAllDiagramRenderers() {
		if (cachedRenderers === null) {
			loadExtensions()
		}
		return cachedRenderers
	}

	def DiagramRendererProxy getDiagramRenderer(String id) {
		val candidates = allDiagramRenderers.filter[it.id == id]
		if (candidates.empty) {
			return null
		}
		return candidates.head
	}

	def Iterable<DiagramRendererProxy> getDiagramRenderers(Class<? extends IDiagramRoot> diagramRootClass) {
		val candidates = allDiagramRenderers.filter [
			it.diagramRootClass.isAssignableFrom(diagramRootClass)
		]
		if (candidates.empty) {
			return null
		}
		return candidates
	}

	def DiagramRendererProxy getDiagramRenderer(Class<? extends IDiagramRoot> diagramRootClass,
		DiagramFileFormat format) {
		val candidates = allDiagramRenderers.filter [
			it.diagramRootClass.isAssignableFrom(diagramRootClass) && it.format == format
		]
		if (candidates.empty) {
			return null
		}
		return candidates.head
	}

	def DiagramRendererProxy getDiagramRenderer(Class<? extends IDiagramRoot> diagramRootClass, String diagramTypeID,
		DiagramFileFormat format) {
		val candidates = allDiagramRenderers.filter [
			it.diagramRootClass.isAssignableFrom(diagramRootClass) && it.diagramTypeID.equals(diagramTypeID) &&
				it.format == format
		]
		if (candidates.empty) {
			return null
		}
		return candidates.head
	}

	private def String loadAttributeAndLogException(IConfigurationElement el, String attributeName) {
		try {
			return el.getAttribute(attributeName)
		} catch (InvalidRegistryObjectException ex) {
			LOGGER.error(el.identify(attributeName) + ": unknown attribute")
			throw ex
		}
	}

	private def Class<? extends IDiagramRoot> loadDiagramRootClass(IConfigurationElement el,
		String diagramRootClassName) throws ClassNotFoundException {
		val bundle = ContributorFactoryOSGi.resolve(el.contributor)
		val clazz = bundle.loadClass(diagramRootClassName) as Class<? extends IDiagramRoot>
		return clazz
	}
}
