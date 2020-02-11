package com.mimacom.ddd.pub.pub.tableProvider

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.validation.PubTableValidator
import org.apache.log4j.Logger
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.ISafeRunnable
import org.eclipse.core.runtime.SafeRunner
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.ValidationMessageAcceptor

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

	new(String id, String tableName, Class<? extends IDiagramRoot> tableRootClass, String tableTypeID,
		IConfigurationElement configElement) {
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
					val table = getRenderer.render(root)
					
					val errorAcceptor = new TableValidationMessageAcceptor
					val tableValidator = new PubTableValidator(errorAcceptor)
					tableValidator.validate(table)
					if (errorAcceptor.error) {
						throw new InvalidTableStructureException
					}
					result.add(table); // result must be final
				} else {
					LOGGER.info("Renderer " + id + " has nothing to render")
				}
			}
		};
		SafeRunner.run(runnable);
		return ! result.empty ? result.head : PUB.createTable
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
	
	private static class InvalidTableStructureException extends Exception {
		new() {
			super("See error log for details")
		}
	}

	private static class TableValidationMessageAcceptor implements ValidationMessageAcceptor {

		public var error = false

		override acceptError(String message, EObject object, EStructuralFeature feature, int index, String code,
			String... issueData) {
			LOGGER.error(message + ": " + object + ", feature: " + feature + ", index: " + index)
			error = true
		}

		override acceptError(String message, EObject object, int offset, int length, String code, String... issueData) {
			throw new UnsupportedOperationException
		}

		override acceptInfo(String message, EObject object, EStructuralFeature feature, int index, String code,
			String... issueData) {
		}

		override acceptInfo(String message, EObject object, int offset, int length, String code, String... issueData) {
		}

		override acceptWarning(String message, EObject object, EStructuralFeature feature, int index, String code,
			String... issueData) {
			LOGGER.warn(message + ": " + object + ", feature: " + feature + ", index: " + index)
		}

		override acceptWarning(String message, EObject object, int offset, int length, String code,
			String... issueData) { 
			throw new UnsupportedOperationException
		}
	}
}
