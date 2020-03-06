package com.mimacom.ddd.dm.esm.ui.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.plantuml.EsmStateDiagramTextProviderImpl;
import com.mimacom.ddd.dm.esm.ui.internal.EsmActivator;
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
public class EsmDiagramTextProvider extends AbstractDiagramTextProvider {
  @Inject
  private EsmStateDiagramTextProviderImpl actualProvider;
  
  public EsmDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(EsmActivator.COM_MIMACOM_DDD_DM_ESM_ESM));
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
    EsmEntityStateModel _xifexpression = null;
    DModel _model = namespace.getModel();
    if ((_model instanceof EsmEntityStateModel)) {
      DModel _model_1 = namespace.getModel();
      _xifexpression = ((EsmEntityStateModel) _model_1);
    } else {
      _xifexpression = null;
    }
    final EsmEntityStateModel model = _xifexpression;
    boolean _canProvide = this.actualProvider.canProvide(model);
    if (_canProvide) {
      return this.actualProvider.diagramText(model);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note \"No state model to show.\" as N1");
    return _builder.toString();
  }
}
