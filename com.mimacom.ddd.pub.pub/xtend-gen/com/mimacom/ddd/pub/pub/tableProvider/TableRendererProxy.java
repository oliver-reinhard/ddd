package com.mimacom.ddd.pub.pub.tableProvider;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistryUtil;
import com.mimacom.ddd.pub.pub.validation.PubTableValidator;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TableRendererProxy {
  private static class InvalidTableStructureException extends Exception {
    public InvalidTableStructureException() {
      super("See error log for details");
    }
  }
  
  private static class TableValidationMessageAcceptor implements ValidationMessageAcceptor {
    public boolean error = false;
    
    @Override
    public void acceptError(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
      TableRendererProxy.LOGGER.error(((((((message + ": ") + object) + ", feature: ") + feature) + ", index: ") + Integer.valueOf(index)));
      this.error = true;
    }
    
    @Override
    public void acceptError(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
      throw new UnsupportedOperationException();
    }
    
    @Override
    public void acceptInfo(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
    }
    
    @Override
    public void acceptInfo(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
    }
    
    @Override
    public void acceptWarning(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
      TableRendererProxy.LOGGER.warn(((((((message + ": ") + object) + ", feature: ") + feature) + ", index: ") + Integer.valueOf(index)));
    }
    
    @Override
    public void acceptWarning(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
      throw new UnsupportedOperationException();
    }
  }
  
  private static final Logger LOGGER = Logger.getLogger(TableRendererProxy.class);
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public final Class<? extends IDiagramRoot> tableRootClass;
  
  public final String id;
  
  public final String tableName;
  
  public final String tableTypeID;
  
  private final IConfigurationElement configElement;
  
  private ITableRenderer renderer = null;
  
  public TableRendererProxy(final String id, final String tableName, final Class<? extends IDiagramRoot> tableRootClass, final String tableTypeID, final IConfigurationElement configElement) {
    this.id = id;
    this.tableName = tableName;
    this.tableRootClass = tableRootClass;
    this.tableTypeID = tableTypeID;
    this.configElement = configElement;
  }
  
  public Table render(final IDiagramRoot root) {
    final ArrayList<Table> result = Lists.<Table>newArrayList();
    final ISafeRunnable runnable = new ISafeRunnable() {
      @Override
      public void handleException(final Throwable ex) {
        String _identify = TableProviderRegistryUtil.identify(TableRendererProxy.this.configElement);
        String _plus = (_identify + ": rendering failed");
        TableRendererProxy.LOGGER.error(_plus, ex);
      }
      
      @Override
      public void run() throws Exception {
        boolean _canRender = TableRendererProxy.this.getRenderer().canRender(root);
        if (_canRender) {
          final Table table = TableRendererProxy.this.getRenderer().render(root);
          final TableRendererProxy.TableValidationMessageAcceptor errorAcceptor = new TableRendererProxy.TableValidationMessageAcceptor();
          final PubTableValidator tableValidator = new PubTableValidator(errorAcceptor);
          tableValidator.validate(table);
          if (errorAcceptor.error) {
            throw new TableRendererProxy.InvalidTableStructureException();
          }
          result.add(table);
        } else {
          TableRendererProxy.LOGGER.info((("Renderer " + TableRendererProxy.this.id) + " has nothing to render"));
        }
      }
    };
    SafeRunner.run(runnable);
    Table _xifexpression = null;
    boolean _isEmpty = result.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      _xifexpression = IterableExtensions.<Table>head(result);
    } else {
      _xifexpression = TableRendererProxy.PUB.createTable();
    }
    return _xifexpression;
  }
  
  public boolean canRender(final IDiagramRoot root) {
    try {
      return this.getRenderer().canRender(root);
    } catch (final Throwable _t) {
      if (_t instanceof Throwable) {
        final Throwable t = (Throwable)_t;
        TableRendererProxy.LOGGER.error(t);
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private ITableRenderer getRenderer() {
    try {
      if ((this.renderer == null)) {
        try {
          Object _createExecutableExtension = this.configElement.createExecutableExtension(TableProviderRegistryUtil.ATTR_RENDERER_CLASS);
          this.renderer = ((ITableRenderer) _createExecutableExtension);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            TableRendererProxy.LOGGER.error(TableProviderRegistryUtil.identify(this.configElement, TableProviderRegistryUtil.ATTR_RENDERER_CLASS), ex);
            throw ex;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      return this.renderer;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
