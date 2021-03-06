package com.mimacom.ddd.dm.dim.ui.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.dm.dim.plantuml.DimTypeDiagramTextProviderImpl;
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator;
import java.util.List;
import java.util.Map;
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
public class DimTypeDiagramTextProvider extends AbstractDiagramTextProvider {
  @Inject
  private DimTypeDiagramTextProviderImpl actualProvider;
  
  public DimTypeDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM));
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
    DModel _model = null;
    if (namespace!=null) {
      _model=namespace.getModel();
    }
    final DModel model = _model;
    if ((model instanceof DomainInformationModel)) {
      final List<Diagnostic> validationErrors = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(model)).getChildren();
      boolean _isEmpty = validationErrors.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        return "note \"Information model has validation errors.\" as N1";
      }
      boolean _canProvide = this.actualProvider.canProvide(((DomainInformationModel)model));
      if (_canProvide) {
        return this.actualProvider.diagramText(((DomainInformationModel)model));
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note \"No structures to show.\" as N1");
    return _builder.toString();
  }
}
