package com.mimacom.ddd.pub.pub.derivedState;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.BaseFactory;
import com.mimacom.ddd.dm.base.base.DTextSegment;
import com.mimacom.ddd.pub.proto.derivedState.PubProtoDerivedStateComputer;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.ProvidedDiagramType;
import com.mimacom.ddd.pub.pub.ProvidedTableType;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.Symbol;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry;
import com.mimacom.ddd.pub.pub.tableProvider.TableRendererProxy;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Singleton
@SuppressWarnings("all")
public class PubDerivedStateComputer implements IDerivedStateComputer {
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Inject
  private TableProviderRegistry tableProviderRegistry;
  
  @Inject
  private DiagramProviderRegistry diagramProviderRegistry;
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final PubModel model = ((PubModel) _head);
      this.installTitleSymbol(model);
      this.installTableRenderers(model);
      this.installFigureRenderers(model);
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final PubModel model = ((PubModel) _head);
    if ((model != null)) {
      this.removeTitleSymbol(model);
      model.getProvidedTableTypes().clear();
      model.getProvidedDiagramTypes().clear();
    }
  }
  
  protected void installTitleSymbol(final PubModel model) {
    final Document doc = model.getDocument();
    if (((doc != null) && IterableExtensions.isEmpty(IterableExtensions.<Symbol>filter(doc.getSymbols(), ((Function1<Symbol, Boolean>) (Symbol it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME));
    }))))) {
      final Symbol titleSymbol = PubDerivedStateComputer.PUB.createSymbol();
      titleSymbol.setName(PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME);
      titleSymbol.setValue(PubDerivedStateComputer.BASE.createDRichText());
      final DTextSegment seg = PubDerivedStateComputer.BASE.createDTextSegment();
      seg.setValue(doc.getTitle());
      titleSymbol.getValue().getSegments().add(seg);
      doc.getSymbols().add(titleSymbol);
    }
  }
  
  protected void removeTitleSymbol(final PubModel model) {
    final Document doc = model.getDocument();
    if ((doc != null)) {
      final Function1<Symbol, Boolean> _function = (Symbol it) -> {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME));
      };
      final Symbol titleSymbol = IterableExtensions.<Symbol>head(IterableExtensions.<Symbol>filter(doc.getSymbols(), _function));
      if ((titleSymbol != null)) {
        doc.getSymbols().remove(titleSymbol);
      }
    }
  }
  
  protected void installTableRenderers(final PubModel model) {
    if (((model != null) && model.getProvidedTableTypes().isEmpty())) {
      final TableRendererProxy[] renderers = this.tableProviderRegistry.getAllTableRenderers();
      for (final TableRendererProxy r : renderers) {
        {
          final ProvidedTableType tr = PubDerivedStateComputer.PUB.createProvidedTableType();
          tr.setName(r.id);
          tr.setTableTypeName(r.tableName);
          model.getProvidedTableTypes().add(tr);
        }
      }
    }
  }
  
  protected void installFigureRenderers(final PubModel model) {
    if (((model != null) && model.getProvidedDiagramTypes().isEmpty())) {
      final Function1<DiagramRendererProxy, String> _function = (DiagramRendererProxy it) -> {
        return it.diagramTypeID;
      };
      final Set<String> diagramTypeIDs = IterableExtensions.<String>toSet(ListExtensions.<DiagramRendererProxy, String>map(((List<DiagramRendererProxy>)Conversions.doWrapArray(this.diagramProviderRegistry.getAllDiagramRenderers())), _function));
      for (final String id : diagramTypeIDs) {
        {
          final ProvidedDiagramType fr = PubDerivedStateComputer.PUB.createProvidedDiagramType();
          fr.setName(id);
          fr.setDiagramTypeName(this.diagramProviderRegistry.getDiagramTypeName(id));
          model.getProvidedDiagramTypes().add(fr);
        }
      }
    }
  }
}
