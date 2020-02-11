package com.mimacom.ddd.pub.pub.tableProvider

import org.eclipse.core.runtime.IConfigurationElement

class TableProviderRegistryUtil {

	public static val EXTENSION_POINT_ID = "com.mimacom.ddd.pub.pub.tableProvider"
	
	public static val ELEMENT_RENDERER = "renderer"
	public static val ATTR_RENDERER_ID = "id"
	public static val ATTR_RENDERER_TABLE_NAME = "tableName"
	public static val ATTR_RENDERER_TABLE_ROOT_CLASS = "tableRootClass"
	public static val ATTR_RENDERER_TABLE_TYPE_ID = "tableType"
	public static val ATTR_RENDERER_CLASS = "rendererClass"
	
	public static val ELEMENT_TABLE_TYPE = "tableType"
	public static val ATTR_TABLE_TYPE_ID = "id"
	public static val ATTR_TABLE_TYPE_NAME = "name"

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
