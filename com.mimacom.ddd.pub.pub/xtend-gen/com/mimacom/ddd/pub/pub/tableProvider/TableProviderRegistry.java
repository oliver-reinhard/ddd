package com.mimacom.ddd.pub.pub.tableProvider;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistryUtil;
import com.mimacom.ddd.pub.pub.tableProvider.TableRendererProxy;
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
public class TableProviderRegistry {
  private static final Logger LOGGER = Logger.getLogger(TableProviderRegistry.class);
  
  private List<TableRendererProxy> cachedRenderers;
  
  private Map<String, String> cachedDiagramTypes;
  
  private void loadExtensions() {
    this.cachedDiagramTypes = Maps.<String, String>newHashMap();
    final Function1<IConfigurationElement, Boolean> _function = (IConfigurationElement it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, TableProviderRegistryUtil.ELEMENT_TABLE_TYPE));
    };
    Iterable<IConfigurationElement> _filter = IterableExtensions.<IConfigurationElement>filter(((Iterable<IConfigurationElement>)Conversions.doWrapArray(Platform.getExtensionRegistry().getConfigurationElementsFor(TableProviderRegistryUtil.EXTENSION_POINT_ID))), _function);
    for (final IConfigurationElement ext : _filter) {
      {
        String _identify = TableProviderRegistryUtil.identify(ext);
        String _plus = (_identify + ": extension loaded");
        TableProviderRegistry.LOGGER.info(_plus);
        try {
          final String id = this.loadAttributeAndLogException(ext, TableProviderRegistryUtil.ATTR_TABLE_TYPE_ID);
          final String name = this.loadAttributeAndLogException(ext, TableProviderRegistryUtil.ATTR_TABLE_TYPE_NAME);
          this.cachedDiagramTypes.put(id, name);
        } catch (final Throwable _t) {
          if (_t instanceof InvalidRegistryObjectException) {
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
    this.cachedRenderers = Lists.<TableRendererProxy>newArrayList();
    final Function1<IConfigurationElement, Boolean> _function_1 = (IConfigurationElement it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, TableProviderRegistryUtil.ELEMENT_RENDERER));
    };
    Iterable<IConfigurationElement> _filter_1 = IterableExtensions.<IConfigurationElement>filter(((Iterable<IConfigurationElement>)Conversions.doWrapArray(Platform.getExtensionRegistry().getConfigurationElementsFor(TableProviderRegistryUtil.EXTENSION_POINT_ID))), _function_1);
    for (final IConfigurationElement ext_1 : _filter_1) {
      {
        String _identify = TableProviderRegistryUtil.identify(ext_1);
        String _plus = (_identify + ": extension loaded");
        TableProviderRegistry.LOGGER.info(_plus);
        try {
          final String id = this.loadAttributeAndLogException(ext_1, TableProviderRegistryUtil.ATTR_RENDERER_ID);
          final String tableName = this.loadAttributeAndLogException(ext_1, TableProviderRegistryUtil.ATTR_RENDERER_TABLE_NAME);
          final String tableTypeID = this.loadAttributeAndLogException(ext_1, TableProviderRegistryUtil.ATTR_RENDERER_TABLE_TYPE_ID);
          final String tableRootClassName = this.loadAttributeAndLogException(ext_1, TableProviderRegistryUtil.ATTR_RENDERER_TABLE_ROOT_CLASS);
          try {
            final Class<? extends IDiagramRoot> tableRootClass = this.loadDiagramRootClass(ext_1, tableRootClassName);
            String _name = tableRootClass.getName();
            String _plus_1 = ("table root class loaded: " + _name);
            TableProviderRegistry.LOGGER.info(_plus_1);
            TableRendererProxy _tableRendererProxy = new TableRendererProxy(id, tableName, tableRootClass, tableTypeID, ext_1);
            this.cachedRenderers.add(_tableRendererProxy);
          } catch (final Throwable _t) {
            if (_t instanceof ClassNotFoundException) {
              String _identify_1 = TableProviderRegistryUtil.identify(ext_1, TableProviderRegistryUtil.ATTR_RENDERER_TABLE_ROOT_CLASS);
              String _plus_2 = (_identify_1 + ": Class not found: ");
              String _plus_3 = (_plus_2 + tableRootClassName);
              TableProviderRegistry.LOGGER.error(_plus_3);
            } else if (_t instanceof Throwable) {
              final Throwable ex_1 = (Throwable)_t;
              TableProviderRegistry.LOGGER.error(TableProviderRegistryUtil.identify(ext_1), ex_1);
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
  
  public TableRendererProxy[] getAllTableRenderers() {
    if ((this.cachedRenderers == null)) {
      this.loadExtensions();
    }
    return ((TableRendererProxy[])Conversions.unwrapArray(this.cachedRenderers, TableRendererProxy.class));
  }
  
  public TableRendererProxy getTableRenderer(final String id) {
    final Function1<TableRendererProxy, Boolean> _function = (TableRendererProxy it) -> {
      return Boolean.valueOf(Objects.equal(it.id, id));
    };
    final Iterable<TableRendererProxy> candidates = IterableExtensions.<TableRendererProxy>filter(((Iterable<TableRendererProxy>)Conversions.doWrapArray(this.getAllTableRenderers())), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(candidates);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.<TableRendererProxy>head(candidates);
  }
  
  public Iterable<TableRendererProxy> getTableRenderers(final Class<? extends IDiagramRoot> tableRootClass) {
    final Function1<TableRendererProxy, Boolean> _function = (TableRendererProxy it) -> {
      return Boolean.valueOf(it.tableRootClass.isAssignableFrom(tableRootClass));
    };
    final Iterable<TableRendererProxy> candidates = IterableExtensions.<TableRendererProxy>filter(((Iterable<TableRendererProxy>)Conversions.doWrapArray(this.getAllTableRenderers())), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(candidates);
    if (_isEmpty) {
      return null;
    }
    return candidates;
  }
  
  public TableRendererProxy getTableRenderer(final Class<? extends IDiagramRoot> tableRootClass, final String tableTypeID) {
    final Function1<TableRendererProxy, Boolean> _function = (TableRendererProxy it) -> {
      return Boolean.valueOf((it.tableRootClass.isAssignableFrom(tableRootClass) && it.tableTypeID.equals(tableTypeID)));
    };
    final Iterable<TableRendererProxy> candidates = IterableExtensions.<TableRendererProxy>filter(((Iterable<TableRendererProxy>)Conversions.doWrapArray(this.getAllTableRenderers())), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(candidates);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.<TableRendererProxy>head(candidates);
  }
  
  private String loadAttributeAndLogException(final IConfigurationElement el, final String attributeName) {
    try {
      return el.getAttribute(attributeName);
    } catch (final Throwable _t) {
      if (_t instanceof InvalidRegistryObjectException) {
        final InvalidRegistryObjectException ex = (InvalidRegistryObjectException)_t;
        String _identify = TableProviderRegistryUtil.identify(el, attributeName);
        String _plus = (_identify + ": unknown attribute");
        TableProviderRegistry.LOGGER.error(_plus);
        throw ex;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private Class<? extends IDiagramRoot> loadDiagramRootClass(final IConfigurationElement el, final String tableRootClassName) throws ClassNotFoundException {
    final Bundle bundle = ContributorFactoryOSGi.resolve(el.getContributor());
    Class<?> _loadClass = bundle.loadClass(tableRootClassName);
    final Class<? extends IDiagramRoot> clazz = ((Class<? extends IDiagramRoot>) _loadClass);
    return clazz;
  }
}
