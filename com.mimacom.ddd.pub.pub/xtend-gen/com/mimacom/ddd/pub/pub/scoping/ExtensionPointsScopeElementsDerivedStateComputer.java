package com.mimacom.ddd.pub.pub.scoping;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.pub.pub.FigureRenderer;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@Singleton
@SuppressWarnings("all")
public class ExtensionPointsScopeElementsDerivedStateComputer implements IDerivedStateComputer {
  private static final PubFactory FACTORY = PubFactory.eINSTANCE;
  
  @Inject
  private DiagramProviderRegistry registry;
  
  private List<FigureRenderer> figureRenderers = null;
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final PubModel model = ((PubModel) _head);
      if (((model != null) && model.getFigureRenderers().isEmpty())) {
        if (((this.figureRenderers == null) || ((!this.figureRenderers.isEmpty()) && this.figureRenderers.get(0).eIsProxy()))) {
          this.initFigureRenderers();
        }
        model.getFigureRenderers().addAll(this.figureRenderers);
      }
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final PubModel model = ((PubModel) _head);
    if ((model != null)) {
      model.getFigureRenderers().clear();
    }
  }
  
  protected void initFigureRenderers() {
    this.figureRenderers = Lists.<FigureRenderer>newArrayList();
    final DiagramRendererProxy[] providers = this.registry.getDiagramProviders();
    for (final DiagramRendererProxy p : providers) {
      {
        final FigureRenderer fr = ExtensionPointsScopeElementsDerivedStateComputer.FACTORY.createFigureRenderer();
        fr.setName(p.id);
        fr.setDiagramName(p.diagramName);
        this.figureRenderers.add(fr);
      }
    }
  }
}
