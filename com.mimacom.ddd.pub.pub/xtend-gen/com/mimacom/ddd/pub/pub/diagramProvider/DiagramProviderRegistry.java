package com.mimacom.ddd.pub.pub.diagramProvider;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osgi.framework.Bundle;

@Singleton
@SuppressWarnings("all")
public class DiagramProviderRegistry {
  private static final Logger LOGGER = Logger.getLogger(DiagramProviderRegistry.class);
  
  private Map<String, String> cachedDiagramTypes;
  
  private List<DiagramRendererProxy> cachedRenderers;
  
  private void loadExtensions() {
    this.cachedDiagramTypes = Maps.<String, String>newHashMap();
    final Function1<IConfigurationElement, Boolean> _function = (IConfigurationElement it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, DiagramProviderRegistryUtil.ELEMENT_DIAGRAM_TYPE));
    };
    Iterable<IConfigurationElement> _filter = IterableExtensions.<IConfigurationElement>filter(((Iterable<IConfigurationElement>)Conversions.doWrapArray(Platform.getExtensionRegistry().getConfigurationElementsFor(DiagramProviderRegistryUtil.EXTENSION_POINT_ID))), _function);
    for (final IConfigurationElement ext : _filter) {
      {
        String _identify = DiagramProviderRegistryUtil.identify(ext);
        String _plus = (_identify + ": extension loaded");
        DiagramProviderRegistry.LOGGER.info(_plus);
        try {
          final String id = this.loadAttributeAndLogException(ext, DiagramProviderRegistryUtil.ATTR_DIAGRAM_TYPE_ID);
          final String name = this.loadAttributeAndLogException(ext, DiagramProviderRegistryUtil.ATTR_DIAGRAM_TYPE_NAME);
          this.cachedDiagramTypes.put(id, name);
        } catch (final Throwable _t) {
          if (_t instanceof InvalidRegistryObjectException) {
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
    this.cachedRenderers = Lists.<DiagramRendererProxy>newArrayList();
    final Function1<IConfigurationElement, Boolean> _function_1 = (IConfigurationElement it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, DiagramProviderRegistryUtil.ELEMENT_RENDERER));
    };
    Iterable<IConfigurationElement> _filter_1 = IterableExtensions.<IConfigurationElement>filter(((Iterable<IConfigurationElement>)Conversions.doWrapArray(Platform.getExtensionRegistry().getConfigurationElementsFor(DiagramProviderRegistryUtil.EXTENSION_POINT_ID))), _function_1);
    for (final IConfigurationElement ext_1 : _filter_1) {
      {
        String _identify = DiagramProviderRegistryUtil.identify(ext_1);
        String _plus = (_identify + ": extension loaded");
        DiagramProviderRegistry.LOGGER.info(_plus);
        try {
          final String id = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_ID);
          final String diagramName = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_DIAGRAM_NAME);
          final String diagramTypeID = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_DIAGRAM_TYPE_ID);
          final String diagramRootClassName = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_DIAGRAM_ROOT_CLASS);
          final String outputFileFormatName = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_OUTPUT_FILE_FORMAT);
          try {
            final Class<? extends IDiagramRoot> diagramRootClass = this.loadDiagramRootClass(ext_1, diagramRootClassName);
            String _name = diagramRootClass.getName();
            String _plus_1 = ("diagram root class loaded: " + _name);
            DiagramProviderRegistry.LOGGER.info(_plus_1);
            final DiagramFileFormat outputFileFormat = DiagramFileFormat.valueOf(outputFileFormatName.toUpperCase());
            DiagramRendererProxy _diagramRendererProxy = new DiagramRendererProxy(id, diagramName, diagramRootClass, diagramTypeID, ext_1, outputFileFormat);
            this.cachedRenderers.add(_diagramRendererProxy);
          } catch (final Throwable _t) {
            if (_t instanceof IllegalArgumentException) {
              String _identify_1 = DiagramProviderRegistryUtil.identify(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_OUTPUT_FILE_FORMAT);
              String _plus_2 = (_identify_1 + ": Unsupported format: ");
              String _plus_3 = (_plus_2 + outputFileFormatName);
              DiagramProviderRegistry.LOGGER.error(_plus_3);
            } else if (_t instanceof ClassNotFoundException) {
              String _identify_2 = DiagramProviderRegistryUtil.identify(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_DIAGRAM_ROOT_CLASS);
              String _plus_4 = (_identify_2 + ": Class not found: ");
              String _plus_5 = (_plus_4 + diagramRootClassName);
              DiagramProviderRegistry.LOGGER.error(_plus_5);
            } else if (_t instanceof Throwable) {
              final Throwable ex_2 = (Throwable)_t;
              DiagramProviderRegistry.LOGGER.error(DiagramProviderRegistryUtil.identify(ext_1), ex_2);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof InvalidRegistryObjectException) {
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
  
  public String getDiagramTypeName(final String id) {
    if ((this.cachedDiagramTypes == null)) {
      this.loadExtensions();
    }
    return this.cachedDiagramTypes.get(id);
  }
  
  public DiagramRendererProxy[] getAllDiagramRenderers() {
    if ((this.cachedRenderers == null)) {
      this.loadExtensions();
    }
    return ((DiagramRendererProxy[])Conversions.unwrapArray(this.cachedRenderers, DiagramRendererProxy.class));
  }
  
  public Iterable<DiagramRendererProxy> getDiagramRenderers(final Class<? extends IDiagramRoot> diagramRootClass) {
    final Function1<DiagramRendererProxy, Boolean> _function = (DiagramRendererProxy it) -> {
      return Boolean.valueOf(it.diagramRootClass.isAssignableFrom(diagramRootClass));
    };
    final Iterable<DiagramRendererProxy> candidates = IterableExtensions.<DiagramRendererProxy>filter(((Iterable<DiagramRendererProxy>)Conversions.doWrapArray(this.getAllDiagramRenderers())), _function);
    return candidates;
  }
  
  public DiagramRendererProxy getDiagramRenderer(final String id) {
    final Function1<DiagramRendererProxy, Boolean> _function = (DiagramRendererProxy it) -> {
      return Boolean.valueOf(Objects.equal(it.id, id));
    };
    final Iterable<DiagramRendererProxy> candidates = IterableExtensions.<DiagramRendererProxy>filter(((Iterable<DiagramRendererProxy>)Conversions.doWrapArray(this.getAllDiagramRenderers())), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(candidates);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.<DiagramRendererProxy>head(candidates);
  }
  
  public DiagramRendererProxy getDiagramRenderer(final Class<? extends IDiagramRoot> diagramRootClass, final String diagramTypeID, final DiagramFileFormat format) {
    final Function1<DiagramRendererProxy, Boolean> _function = (DiagramRendererProxy it) -> {
      return Boolean.valueOf(((it.diagramRootClass.isAssignableFrom(diagramRootClass) && it.diagramTypeID.equals(diagramTypeID)) && 
        Objects.equal(it.format, format)));
    };
    final Iterable<DiagramRendererProxy> candidates = IterableExtensions.<DiagramRendererProxy>filter(((Iterable<DiagramRendererProxy>)Conversions.doWrapArray(this.getAllDiagramRenderers())), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(candidates);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.<DiagramRendererProxy>head(candidates);
  }
  
  private String loadAttributeAndLogException(final IConfigurationElement el, final String attributeName) {
    try {
      return el.getAttribute(attributeName);
    } catch (final Throwable _t) {
      if (_t instanceof InvalidRegistryObjectException) {
        final InvalidRegistryObjectException ex = (InvalidRegistryObjectException)_t;
        String _identify = DiagramProviderRegistryUtil.identify(el, attributeName);
        String _plus = (_identify + ": unknown attribute");
        DiagramProviderRegistry.LOGGER.error(_plus);
        throw ex;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private Class<? extends IDiagramRoot> loadDiagramRootClass(final IConfigurationElement el, final String diagramRootClassName) throws ClassNotFoundException {
    final Bundle bundle = ContributorFactoryOSGi.resolve(el.getContributor());
    Class<?> _loadClass = bundle.loadClass(diagramRootClassName);
    final Class<? extends IDiagramRoot> clazz = ((Class<? extends IDiagramRoot>) _loadClass);
    return clazz;
  }
}
