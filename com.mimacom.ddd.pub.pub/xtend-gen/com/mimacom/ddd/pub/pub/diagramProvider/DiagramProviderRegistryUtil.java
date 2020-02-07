package com.mimacom.ddd.pub.pub.diagramProvider;

import org.eclipse.core.runtime.IConfigurationElement;

@SuppressWarnings("all")
public class DiagramProviderRegistryUtil {
  public static final String EXTENSION_POINT_ID = "com.mimacom.ddd.pub.pub.diagramProvider";
  
  public static final String ELEMENT_RENDERER = "renderer";
  
  public static final String ATTR_RENDERER_ID = "id";
  
  public static final String ATTR_RENDERER_DIAGRAM_NAME = "diagramName";
  
  public static final String ATTR_RENDERER_DIAGRAM_ROOT_CLASS = "diagramRootClass";
  
  public static final String ATTR_RENDERER_DIAGRAM_TYPE_ID = "diagramType";
  
  public static final String ATTR_RENDERER_CLASS = "rendererClass";
  
  public static final String ATTR_RENDERER_OUTPUT_FILE_FORMAT = "outputFileFormat";
  
  public static final String ELEMENT_DIAGRAM_TYPE = "renderer";
  
  public static final String ATTR_DIAGRAM_TYPE_ID = "id";
  
  public static final String ATTR_DIAGRAM_TYPE_NAME = "name";
  
  public static String identify(final IConfigurationElement el, final String attribute) {
    final StringBuilder b = new StringBuilder();
    b.append("Extension ");
    b.append(DiagramProviderRegistryUtil.EXTENSION_POINT_ID);
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
    return DiagramProviderRegistryUtil.identify(el, null);
  }
}
