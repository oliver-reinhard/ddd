package com.mimacom.ddd.dm.dem.ui.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.dem.DemActorModel;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel;
import com.mimacom.ddd.dm.dem.plantuml.DemActorsOverviewDiagramTextProviderImpl;
import com.mimacom.ddd.dm.dem.plantuml.DemEventDiagramTextProviderImpl;
import com.mimacom.ddd.dm.dem.plantuml.DemEventsOverviewDiagramTextProviderImpl;
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator;
import java.util.Arrays;
import java.util.Map;
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DemDiagramTextProvider extends AbstractDiagramTextProvider {
  @Inject
  private DemEventDiagramTextProviderImpl eventDiagramProvider;
  
  @Inject
  private DemActorsOverviewDiagramTextProviderImpl actorsOverviewDiagramProvider;
  
  @Inject
  private DemEventsOverviewDiagramTextProviderImpl eventsOverviewDiagramProvider;
  
  public DemDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && 
      ((XtextEditor) editorPart).getLanguageName().equals(DemActivator.COM_MIMACOM_DDD_DM_DEM_DEM));
  }
  
  @Override
  public boolean supportsSelection(final ISelection sel) {
    return false;
  }
  
  @Override
  protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection sel, final Map<String, Object> obj) {
    String _xblockexpression = null;
    {
      IDocument _document = ((XtextEditor) editorPart).getDocumentProvider().getDocument(editorInput);
      final XtextDocument document = ((XtextDocument) _document);
      final IUnitOfWork<DNamespace, XtextResource> _function = (XtextResource it) -> {
        DNamespace _xifexpression = null;
        EObject _head = IterableExtensions.<EObject>head(it.getContents());
        if ((_head instanceof DNamespace)) {
          EObject _head_1 = IterableExtensions.<EObject>head(it.getContents());
          _xifexpression = ((DNamespace) _head_1);
        } else {
          _xifexpression = null;
        }
        return _xifexpression;
      };
      final DNamespace namespace = document.<DNamespace>readOnly(_function);
      String _xifexpression = null;
      DModel _model = namespace.getModel();
      boolean _tripleNotEquals = (_model != null);
      if (_tripleNotEquals) {
        _xifexpression = this.diagram(namespace.getModel());
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("note \"Nothing show.\" as N1");
        _xifexpression = _builder.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String _diagram(final DemDomainEvent model) {
    boolean _canProvide = this.eventDiagramProvider.canProvide(model);
    if (_canProvide) {
      return this.eventDiagramProvider.diagramText(model);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note \"No domain event to show.\" as N1");
    return _builder.toString();
  }
  
  protected String _diagram(final DemActorModel model) {
    boolean _canProvide = this.actorsOverviewDiagramProvider.canProvide(model);
    if (_canProvide) {
      return this.actorsOverviewDiagramProvider.diagramText(model);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note \"No actors to show.\" as N1");
    return _builder.toString();
  }
  
  protected String _diagram(final DemEventsOverviewModel model) {
    boolean _canProvide = this.eventsOverviewDiagramProvider.canProvide(model);
    if (_canProvide) {
      return this.eventsOverviewDiagramProvider.diagramText(model);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note \"No events to show.\" as N1");
    return _builder.toString();
  }
  
  public String diagram(final DModel model) {
    if (model instanceof DemActorModel) {
      return _diagram((DemActorModel)model);
    } else if (model instanceof DemDomainEvent) {
      return _diagram((DemDomainEvent)model);
    } else if (model instanceof DemEventsOverviewModel) {
      return _diagram((DemEventsOverviewModel)model);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model).toString());
    }
  }
}
