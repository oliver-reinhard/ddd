package com.mimacom.ddd.pub.pub.tableProvider;

import org.eclipse.core.runtime.IConfigurationElement;

@SuppressWarnings("all")
public class TableProviderRegistryUtil {
  public static final String EXTENSION_POINT_ID = "com.mimacom.ddd.pub.pub.tableProvider";
  
  public static final String ELEMENT_RENDERER = "renderer";
  
  public static final String ATTR_RENDERER_ID = "id";
  
  public static final String ATTR_RENDERER_TABLE_NAME = "tableName";
  
  public static final String ATTR_RENDERER_TABLE_ROOT_CLASS = "tableRootClass";
  
  public static final String ATTR_RENDERER_TABLE_TYPE_ID = "tableType";
  
  public static final String ATTR_RENDERER_CLASS = "rendererClass";
  
  public static final String ELEMENT_TABLE_TYPE = "renderer";
  
  public static final String ATTR_TABLE_TYPE_ID = "id";
  
  public static final String ATTR_TABLE_TYPE_NAME = "name";
  
  public static String identify(final IConfigurationElement el, final String attribute) {
    final StringBuilder b = new StringBuilder();
    b.append("Extension ");
    b.append(TableProviderRegistryUtil.EXTENSION_POINT_ID);
    b.append("[");
    b.append(el.getName());
    b.append("] by bundle ");
    b.append(el.getNamespaceIdentifier());
    if ((attribute != null)) {
      b.append(": attribute \'");
      b.append(attribute);
      b.append("\'");
    }
    return b.toString();
  }
  
  public static String identify(final IConfigurationElement el) {
    return TableProviderRegistryUtil.identify(el, null);
  }
}
