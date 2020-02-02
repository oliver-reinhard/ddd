package com.mimacom.ddd.pub.pub.diagramProvider;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DiagramProviderRegistry {
  @Inject
  @Extension
  private DiagramProviderRegistryUtil UTIL;
  
  private static final Logger LOGGER = Logger.getLogger(DiagramProviderRegistry.class);
  
  private List<DiagramRendererProxy> cachedRenderers;
  
  private Map<String, String> cachedDiagramTypes;
  
  private void loadExtensions() {
    this.cachedDiagramTypes = Maps.<String, String>newHashMap();
    final Function1<IConfigurationElement, Boolean> _function = (IConfigurationElement it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, DiagramProviderRegistryUtil.ELEMENT_DIAGRAM_TYPE));
    };
    Iterable<IConfigurationElement> _filter = IterableExtensions.<IConfigurationElement>filter(((Iterable<IConfigurationElement>)Conversions.doWrapArray(Platform.getExtensionRegistry().getConfigurationElementsFor(DiagramProviderRegistryUtil.EXTENSION_POINT_ID))), _function);
    for (final IConfigurationElement ext : _filter) {
      {
        String _identify = this.UTIL.identify(ext);
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
        String _identify = this.UTIL.identify(ext_1);
        String _plus = (_identify + ": extension loaded");
        DiagramProviderRegistry.LOGGER.info(_plus);
        try {
          final String id = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_ID);
          final String diagramName = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_DIAGRAM_NAME);
          final String diagramTypeID = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_DIAGRAM_TYPE_ID);
          final String modelClassName = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_MODEL_CLASS);
          final String outputFileFormatName = this.loadAttributeAndLogException(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_OUTPUT_FILE_FORMAT);
          try {
            Class<?> _forName = Class.forName(modelClassName);
            final Class<? extends DModel> modelClass = ((Class<? extends DModel>) _forName);
            String _name = modelClass.getName();
            String _plus_1 = ("renderer model class loaded: " + _name);
            DiagramProviderRegistry.LOGGER.info(_plus_1);
            final DiagramFileFormat outputFileFormat = DiagramFileFormat.valueOf(outputFileFormatName.toUpperCase());
            DiagramRendererProxy _diagramRendererProxy = new DiagramRendererProxy(id, diagramName, modelClass, diagramTypeID, ext_1, outputFileFormat);
            this.cachedRenderers.add(_diagramRendererProxy);
          } catch (final Throwable _t) {
            if (_t instanceof IllegalArgumentException) {
              String _identify_1 = this.UTIL.identify(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_OUTPUT_FILE_FORMAT);
              String _plus_2 = (_identify_1 + ": unsupported format");
              DiagramProviderRegistry.LOGGER.error(_plus_2);
            } else if (_t instanceof ClassNotFoundException) {
              String _identify_2 = this.UTIL.identify(ext_1, DiagramProviderRegistryUtil.ATTR_RENDERER_MODEL_CLASS);
              String _plus_3 = (_identify_2 + ": class not found: ");
              String _plus_4 = (_plus_3 + modelClassName);
              DiagramProviderRegistry.LOGGER.error(_plus_4);
            } else if (_t instanceof Throwable) {
              final Throwable ex_2 = (Throwable)_t;
              DiagramProviderRegistry.LOGGER.error(this.UTIL.identify(ext_1), ex_2);
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
  
  public DiagramRendererProxy[] getDiagramProviders() {
    if ((this.cachedRenderers == null)) {
      this.loadExtensions();
    }
    return ((DiagramRendererProxy[])Conversions.unwrapArray(this.cachedRenderers, DiagramRendererProxy.class));
  }
  
  public DiagramRendererProxy getDiagramProvider(final Class<? extends DModel> modelClass, final DiagramFileFormat format) {
    final Function1<DiagramRendererProxy, Boolean> _function = (DiagramRendererProxy it) -> {
      return Boolean.valueOf((it.modelClass.isAssignableFrom(modelClass) && Objects.equal(it.format, format)));
    };
    final Iterable<DiagramRendererProxy> candidates = IterableExtensions.<DiagramRendererProxy>filter(((Iterable<DiagramRendererProxy>)Conversions.doWrapArray(this.getDiagramProviders())), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(candidates);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.<DiagramRendererProxy>head(candidates);
  }
  
  public DiagramRendererProxy getDiagramProvider(final Class<? extends DModel> modelClass, final String diagramTypeID, final DiagramFileFormat format) {
    final Function1<DiagramRendererProxy, Boolean> _function = (DiagramRendererProxy it) -> {
      return Boolean.valueOf(((it.modelClass.isAssignableFrom(modelClass) && it.diagramTypeID.equals(diagramTypeID)) && Objects.equal(it.format, format)));
    };
    final Iterable<DiagramRendererProxy> candidates = IterableExtensions.<DiagramRendererProxy>filter(((Iterable<DiagramRendererProxy>)Conversions.doWrapArray(this.getDiagramProviders())), _function);
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
        String _identify = this.UTIL.identify(el, attributeName);
        String _plus = (_identify + ": unknown attribute");
        DiagramProviderRegistry.LOGGER.error(_plus);
        throw ex;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
