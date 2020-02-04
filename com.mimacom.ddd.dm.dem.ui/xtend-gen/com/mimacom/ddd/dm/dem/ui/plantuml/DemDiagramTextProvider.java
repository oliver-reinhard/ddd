package com.mimacom.ddd.dm.dem.ui.plantuml;

import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator;
import java.util.Map;
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DemDiagramTextProvider extends AbstractDiagramTextProvider {
  public DemDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(DemActivator.COM_MIMACOM_DDD_DM_DEM_DEM));
  }
  
  @Override
  public boolean supportsSelection(final ISelection sel) {
    return false;
  }
  
  @Override
  protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection sel, final Map<String, Object> obj) {
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
    DModel _model = namespace.getModel();
    final DemDomainEvent event = ((DemDomainEvent) _model);
    if ((event == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No domain event to show.\" as N1");
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("@startuml");
    _builder_1.newLine();
    _builder_1.append("(");
    String _name = event.getName();
    _builder_1.append(_name);
    _builder_1.append(") as (event)");
    _builder_1.newLineIfNotEmpty();
    {
      EList<DemActor> _triggers = event.getTriggers();
      for(final DemActor t : _triggers) {
        _builder_1.append(" \t\t");
        _builder_1.append("actor ");
        String _name_1 = t.getName();
        _builder_1.append(_name_1, " \t\t");
        _builder_1.newLineIfNotEmpty();
      }
    }
    {
      final Function1<DemNotification, Boolean> _function_1 = (DemNotification it) -> {
        DemActor _notified = it.getNotified();
        return Boolean.valueOf((_notified != null));
      };
      Iterable<DemNotification> _filter = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function_1);
      for(final DemNotification n : _filter) {
        _builder_1.append(" \t\t");
        _builder_1.append("actor ");
        String _name_2 = n.getNotified().getName();
        _builder_1.append(_name_2, " \t\t");
        _builder_1.newLineIfNotEmpty();
      }
    }
    {
      EList<DemActor> _triggers_1 = event.getTriggers();
      for(final DemActor t_1 : _triggers_1) {
        _builder_1.append(" \t\t");
        String _name_3 = t_1.getName();
        _builder_1.append(_name_3, " \t\t");
        _builder_1.append(" --> (event) : triggers");
        _builder_1.newLineIfNotEmpty();
      }
    }
    {
      final Function1<DemNotification, Boolean> _function_2 = (DemNotification it) -> {
        DemActor _notified = it.getNotified();
        return Boolean.valueOf((_notified != null));
      };
      Iterable<DemNotification> _filter_1 = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function_2);
      for(final DemNotification n_1 : _filter_1) {
        _builder_1.append(" \t\t");
        String _name_4 = n_1.getNotified().getName();
        _builder_1.append(_name_4, " \t\t");
        _builder_1.append(" <-- (event) : ");
        String _name_5 = n_1.getName();
        _builder_1.append(_name_5, " \t\t");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("@enduml");
    _builder_1.newLine();
    final String result = _builder_1.toString();
    return result;
  }
}
