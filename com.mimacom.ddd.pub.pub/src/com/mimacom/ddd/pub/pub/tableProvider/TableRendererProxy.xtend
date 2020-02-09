package com.mimacom.ddd.pub.pub.tableProvider

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.Table
import org.apache.log4j.Logger
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.ISafeRunnable
import org.eclipse.core.runtime.SafeRunner

import static com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistryUtil.*

import static extension com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistryUtil.identify

class TableRendererProxy {

	static val Logger LOGGER = Logger.getLogger(TableRendererProxy);
	static val PUB = PubFactory.eINSTANCE
	
	public val Class<? extends IDiagramRoot> tableRootClass
	public val String id
	public val String tableName
	public val String tableTypeID
	
	val IConfigurationElement configElement
	var ITableRenderer renderer = null

	new(String id, String tableName, Class<? extends IDiagramRoot> tableRootClass, String tableTypeID, IConfigurationElement configElement) {
		this.id = id
		this.tableName = tableName
		this.tableRootClass = tableRootClass
		this.tableTypeID = tableTypeID
		this.configElement = configElement
	}

	def Table render(IDiagramRoot root) {
		val result = Lists.newArrayList
		val ISafeRunnable runnable = new ISafeRunnable() {

			override void handleException(Throwable ex) {
				LOGGER.error(configElement.identify + ": rendering failed", ex)
			}

			override void run() throws Exception {
				if (getRenderer.canRender(root)) { 
					result.add(getRenderer.render(root)); // result must be final
				} else {
					LOGGER.info("Renderer " + id + " has nothing to render")
					result.add(PUB.createTable) // empty array
				}
			}
		};
		SafeRunner.run(runnable);
		return result.head
	}
	

	def boolean canRender(IDiagramRoot root) {
		try {
			return getRenderer.canRender(root)
		} catch (Throwable t) {
			LOGGER.error(t)
			return false
		}
	}

	private def ITableRenderer getRenderer() {
		if (renderer === null) {
			try {
				renderer = configElement.createExecutableExtension(ATTR_RENDERER_CLASS) as ITableRenderer
			} catch (Exception ex) {
				LOGGER.error(configElement.identify(ATTR_RENDERER_CLASS), ex)
				throw ex
			}
		}
		return renderer
	}
}
