package com.mimacom.ddd.pub.pub.diagramProvider

import org.eclipse.core.runtime.IConfigurationElement

class DiagramProviderRegistryUtil {

	public static val EXTENSION_POINT_ID = "com.mimacom.ddd.pub.pub.diagramProvider"
	
	public static val ELEMENT_RENDERER = "renderer"
	public static val ATTR_RENDERER_ID = "id"
	public static val ATTR_RENDERER_DIAGRAM_NAME = "diagramName"
	public static val ATTR_RENDERER_DIAGRAM_ROOT_CLASS = "diagramRootClass"
	public static val ATTR_RENDERER_DIAGRAM_TYPE_ID = "diagramType"
	public static val ATTR_RENDERER_CLASS = "rendererClass"
	public static val ATTR_RENDERER_OUTPUT_FILE_FORMAT = "outputFileFormat"
	
	public static val ELEMENT_DIAGRAM_TYPE = "diagramType"
	public static val ATTR_DIAGRAM_TYPE_ID = "id"
	public static val ATTR_DIAGRAM_TYPE_NAME = "name"

	static def String identify(IConfigurationElement el, String attribute) {
		val b = new StringBuilder
		b.append("Extension ")
		b.append(EXTENSION_POINT_ID)
		b.append("[")
		b.append(el.name)
		b.append("] by bundle ")
		b.append(el.namespaceIdentifier)
		if (attribute !== null) {
			b.append(": attribute '")
			b.append(attribute)
			b.append("'")
		}
		return b.toString
	}
	
	
	static def String identify(IConfigurationElement el) {
		identify(el, null)
	}
}
