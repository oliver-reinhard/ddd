package com.mimacom.ddd.pub.pub.scoping;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.pub.pub.FigureRenderer;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.TableRenderer;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry;
import com.mimacom.ddd.pub.pub.tableProvider.TableRendererProxy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@Singleton
@SuppressWarnings("all")
public class ExtensionPointsScopeElementsDerivedStateComputer implements IDerivedStateComputer {
  private static final PubFactory FACTORY = PubFactory.eINSTANCE;
  
  @Inject
  private TableProviderRegistry tableProviderRegistry;
  
  @Inject
  private DiagramProviderRegistry diagramProviderRegistry;
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final PubModel model = ((PubModel) _head);
      this.installTableRenderers(model);
      this.installFigureRenderers(model);
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final PubModel model = ((PubModel) _head);
    if ((model != null)) {
      model.getTableRenderers().clear();
      model.getFigureRenderers().clear();
    }
  }
  
  protected void installTableRenderers(final PubModel model) {
    if (((model != null) && model.getTableRenderers().isEmpty())) {
      final TableRendererProxy[] renderers = this.tableProviderRegistry.getAllTableRenderers();
      for (final TableRendererProxy r : renderers) {
        {
          final TableRenderer tr = ExtensionPointsScopeElementsDerivedStateComputer.FACTORY.createTableRenderer();
          tr.setName(r.id);
          tr.setTableName(r.tableName);
          model.getTableRenderers().add(tr);
        }
      }
    }
  }
  
  protected void installFigureRenderers(final PubModel model) {
    if (((model != null) && model.getFigureRenderers().isEmpty())) {
      final DiagramRendererProxy[] renderers = this.diagramProviderRegistry.getAllDiagramRenderers();
      for (final DiagramRendererProxy r : renderers) {
        {
          final FigureRenderer fr = ExtensionPointsScopeElementsDerivedStateComputer.FACTORY.createFigureRenderer();
          fr.setName(r.id);
          fr.setDiagramName(r.diagramName);
          model.getFigureRenderers().add(fr);
        }
      }
    }
  }
}
