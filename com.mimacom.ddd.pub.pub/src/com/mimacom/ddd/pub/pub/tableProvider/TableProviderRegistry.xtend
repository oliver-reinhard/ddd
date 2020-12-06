package com.mimacom.ddd.pub.pub.tableProvider

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.core.runtime.ContributorFactoryOSGi
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.InvalidRegistryObjectException
import org.eclipse.core.runtime.Platform

import static com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistryUtil.*

import static extension com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistryUtil.identify

@Singleton
class TableProviderRegistry {

	static final Logger LOGGER = Logger.getLogger(TableProviderRegistry);

	var List<TableRendererProxy> cachedRenderers
	var Map<String, String> cachedDiagramTypes

	private def loadExtensions() {
		cachedDiagramTypes = Maps.newHashMap
		for (ext : Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID).filter [
			name == ELEMENT_TABLE_TYPE
		]) {
			LOGGER.info(ext.identify + ": extension loaded")

			try {
				val id = ext.loadAttributeAndLogException(ATTR_TABLE_TYPE_ID)
				val name = ext.loadAttributeAndLogException(ATTR_TABLE_TYPE_NAME)
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
				val tableName = ext.loadAttributeAndLogException(ATTR_RENDERER_TABLE_NAME)
				val tableTypeID = ext.loadAttributeAndLogException(ATTR_RENDERER_TABLE_TYPE_ID)
				val tableRootClassName = ext.loadAttributeAndLogException(ATTR_RENDERER_TABLE_ROOT_CLASS)

				try {
					val tableRootClass = ext.loadDiagramRootClass(tableRootClassName) // throws ClassNotFoundException
					LOGGER.info("table root class loaded: " + tableRootClass.name)

					cachedRenderers.add(
						new TableRendererProxy(id, tableName, tableRootClass, tableTypeID, ext))

				
				} catch (ClassNotFoundException ex) {
					LOGGER.error(ext.identify(ATTR_RENDERER_TABLE_ROOT_CLASS) + ": Class not found: " +
						tableRootClassName)
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

	def TableRendererProxy[] getAllTableRenderers() {
		if (cachedRenderers === null) {
			loadExtensions()
		}
		return cachedRenderers
	}

	def TableRendererProxy getTableRenderer(String id) {
		val candidates = getAllTableRenderers.filter[it.id == id]
		return candidates.head  // returns null if collection is empty
	}

	def Iterable<TableRendererProxy> getTableRenderers(Class<? extends IDiagramRoot> tableRootClass) {
		val candidates = getAllTableRenderers.filter [
			it.tableRootClass.isAssignableFrom(tableRootClass)
		]
		return candidates
	}

	def TableRendererProxy getTableRenderer(Class<? extends IDiagramRoot> tableRootClass, String tableTypeID) {
		val candidates = getAllTableRenderers.filter [
			it.tableRootClass.isAssignableFrom(tableRootClass) && it.tableTypeID.equals(tableTypeID)
		]
		return candidates.head  // returns null if collection is empty
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
		String tableRootClassName) throws ClassNotFoundException {
		val bundle = ContributorFactoryOSGi.resolve(el.contributor)
		val clazz = bundle.loadClass(tableRootClassName) as Class<? extends IDiagramRoot>
		return clazz
	}
}
