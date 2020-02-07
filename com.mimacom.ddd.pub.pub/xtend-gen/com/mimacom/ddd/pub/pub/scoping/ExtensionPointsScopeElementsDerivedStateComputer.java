package com.mimacom.ddd.pub.pub.scoping;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.pub.pub.FigureRenderer;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
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
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final PubModel model = ((PubModel) _head);
      if (((model != null) && model.getFigureRenderers().isEmpty())) {
        final DiagramRendererProxy[] providers = this.registry.getDiagramProviders();
        for (final DiagramRendererProxy p : providers) {
          {
            final FigureRenderer fr = ExtensionPointsScopeElementsDerivedStateComputer.FACTORY.createFigureRenderer();
            fr.setName(p.id);
            fr.setDiagramName(p.diagramName);
            model.getFigureRenderers().add(fr);
          }
        }
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
}
