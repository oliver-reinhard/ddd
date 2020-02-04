package com.mimacom.ddd.pub.pub.diagramProvider

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DModel
import com.mimacom.ddd.dm.base.IDiagramRoot
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.apache.log4j.Logger
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.ISafeRunnable
import org.eclipse.core.runtime.SafeRunner

import static com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil.*

import static extension com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil.identify

class DiagramRendererProxy {


	static final Logger LOGGER = Logger.getLogger(DiagramRendererProxy);
	
	public val Class<? extends DModel> modelClass
	public val String id
	public val String diagramName
	public val String diagramTypeID
	public val DiagramFileFormat format
	
	val IConfigurationElement configElement
	var IDiagramRenderer renderer = null

	new(String id, String diagramName, Class<? extends DModel> modelClass, String diagramTypeID, IConfigurationElement configElement, DiagramFileFormat format) {
		this.id = id
		this.diagramName = diagramName
		this.modelClass = modelClass
		this.diagramTypeID = diagramTypeID
		this.configElement = configElement
		this.format = format
	}

	def InputStream render(IDiagramRoot root) {
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
					result.add(new ByteArrayInputStream(#[])) // empty array
				}
			}
		};
		SafeRunner.run(runnable);
		return result.head
	}

	private def IDiagramRenderer getRenderer() {
		if (renderer === null) {
			try {
				renderer = configElement.createExecutableExtension(ATTR_RENDERER_CLASS) as IDiagramRenderer
			} catch (Exception ex) {
				LOGGER.error(configElement.identify(ATTR_RENDERER_CLASS), ex)
				throw ex
			}
		}
		return renderer
	}
}
