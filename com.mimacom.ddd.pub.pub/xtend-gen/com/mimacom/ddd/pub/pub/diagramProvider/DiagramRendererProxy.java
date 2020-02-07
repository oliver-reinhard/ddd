package com.mimacom.ddd.pub.pub.diagramProvider;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistryUtil;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DiagramRendererProxy {
  private static final Logger LOGGER = Logger.getLogger(DiagramRendererProxy.class);
  
  public final Class<? extends IDiagramRoot> diagramRootClass;
  
  public final String id;
  
  public final String diagramName;
  
  public final String diagramTypeID;
  
  public final DiagramFileFormat format;
  
  private final IConfigurationElement configElement;
  
  private IDiagramRenderer renderer = null;
  
  public DiagramRendererProxy(final String id, final String diagramName, final Class<? extends IDiagramRoot> diagramRootClass, final String diagramTypeID, final IConfigurationElement configElement, final DiagramFileFormat format) {
    this.id = id;
    this.diagramName = diagramName;
    this.diagramRootClass = diagramRootClass;
    this.diagramTypeID = diagramTypeID;
    this.configElement = configElement;
    this.format = format;
  }
  
  public InputStream render(final IDiagramRoot root) {
    final ArrayList<InputStream> result = Lists.<InputStream>newArrayList();
    final ISafeRunnable runnable = new ISafeRunnable() {
      @Override
      public void handleException(final Throwable ex) {
        String _identify = DiagramProviderRegistryUtil.identify(DiagramRendererProxy.this.configElement);
        String _plus = (_identify + ": rendering failed");
        DiagramRendererProxy.LOGGER.error(_plus, ex);
      }
      
      @Override
      public void run() throws Exception {
        boolean _canRender = DiagramRendererProxy.this.getRenderer().canRender(root);
        if (_canRender) {
          result.add(DiagramRendererProxy.this.getRenderer().render(root));
        } else {
          DiagramRendererProxy.LOGGER.info((("Renderer " + DiagramRendererProxy.this.id) + " has nothing to render"));
          ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(new byte[] {});
          result.add(_byteArrayInputStream);
        }
      }
    };
    SafeRunner.run(runnable);
    return IterableExtensions.<InputStream>head(result);
  }
  
  public boolean canRender(final IDiagramRoot root) {
    try {
      return this.getRenderer().canRender(root);
    } catch (final Throwable _t) {
      if (_t instanceof Throwable) {
        final Throwable t = (Throwable)_t;
        DiagramRendererProxy.LOGGER.error(t);
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private IDiagramRenderer getRenderer() {
    try {
      if ((this.renderer == null)) {
        try {
          Object _createExecutableExtension = this.configElement.createExecutableExtension(DiagramProviderRegistryUtil.ATTR_RENDERER_CLASS);
          this.renderer = ((IDiagramRenderer) _createExecutableExtension);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            DiagramRendererProxy.LOGGER.error(DiagramProviderRegistryUtil.identify(this.configElement, DiagramProviderRegistryUtil.ATTR_RENDERER_CLASS), ex);
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
