package com.mimacom.ddd.dm.dme.ui.plantuml;

import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.dme.ui.internal.DmeActivator;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DmeDiagramTextProvider extends AbstractDiagramTextProvider {
  public void DmeDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(DmeActivator.COM_MIMACOM_DDD_DM_DME_DME));
  }
  
  @Override
  public boolean supportsSelection(final ISelection sel) {
    return false;
  }
  
  @Override
  protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection sel, final Map<String, Object> obj) {
    IDocument _document = ((XtextEditor) editorPart).getDocumentProvider().getDocument(editorInput);
    final XtextDocument document = ((XtextDocument) _document);
    final IUnitOfWork<DModel, XtextResource> _function = (XtextResource it) -> {
      DModel _xifexpression = null;
      EObject _head = IterableExtensions.<EObject>head(it.getContents());
      if ((_head instanceof DModel)) {
        EObject _head_1 = IterableExtensions.<EObject>head(it.getContents());
        _xifexpression = ((DModel) _head_1);
      } else {
        _xifexpression = null;
      }
      return _xifexpression;
    };
    final DModel model = document.<DModel>readOnly(_function);
    DDomain _domain = null;
    if (model!=null) {
      _domain=model.getDomain();
    }
    EList<DDomainEvent> _events = null;
    if (_domain!=null) {
      _events=_domain.getEvents();
    }
    final EList<DDomainEvent> events = _events;
    if (((model == null) || events.isEmpty())) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No domain events to show.\" as N1");
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      for(final DDomainEvent e : events) {
        _builder_1.append("(");
        String _name = e.getName();
        _builder_1.append(_name);
        _builder_1.append(") as (event)");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("actor ");
        String _name_1 = e.getTrigger().getName();
        _builder_1.append(_name_1);
        _builder_1.newLineIfNotEmpty();
        {
          EList<DNotification> _notifications = e.getNotifications();
          for(final DNotification n : _notifications) {
            _builder_1.append("actor ");
            String _name_2 = n.getNotified().getName();
            _builder_1.append(_name_2);
            _builder_1.newLineIfNotEmpty();
          }
        }
        String _name_3 = e.getTrigger().getName();
        _builder_1.append(_name_3);
        _builder_1.append(" --> (event) : triggers");
        _builder_1.newLineIfNotEmpty();
        {
          EList<DNotification> _notifications_1 = e.getNotifications();
          for(final DNotification n_1 : _notifications_1) {
            String _name_4 = n_1.getNotified().getName();
            _builder_1.append(_name_4);
            _builder_1.append(" <-- (event) : ");
            String _name_5 = n_1.getName();
            _builder_1.append(_name_5);
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    final String result = _builder_1.toString();
    return result;
  }
}
