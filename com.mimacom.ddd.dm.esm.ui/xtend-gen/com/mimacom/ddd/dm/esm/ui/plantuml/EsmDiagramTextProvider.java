package com.mimacom.ddd.dm.esm.ui.plantuml;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.base.DStateEvent;
import com.mimacom.ddd.dm.esm.EsmCompositeState;
import com.mimacom.ddd.dm.esm.EsmConcurrentState;
import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmStateKind;
import com.mimacom.ddd.dm.esm.EsmSubStateModel;
import com.mimacom.ddd.dm.esm.EsmTransition;
import com.mimacom.ddd.dm.esm.IEsmState;
import com.mimacom.ddd.dm.esm.IEsmStateModel;
import com.mimacom.ddd.dm.esm.ui.internal.EsmActivator;
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
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EsmDiagramTextProvider extends AbstractDiagramTextProvider {
  @Inject
  private ISerializer serializer;
  
  private static final String NAME_UNDEFINED = "NO_NAME";
  
  private static final String STATE_INITIAL_FINAL = "[*]";
  
  private static final int MAX_EXPR_LENGTH = 30;
  
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
    final DNamespace ns = document.<DNamespace>readOnly(_function);
    DModel _model = null;
    if (ns!=null) {
      _model=ns.getModel();
    }
    final EsmEntityStateModel stateModel = ((EsmEntityStateModel) _model);
    if (((ns == null) || (stateModel == null))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No state model to show.\" as N1");
      return _builder.toString();
    }
    final String result = this.genStateModel(stateModel);
    return result;
  }
  
  public String genStateModel(final IEsmStateModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\' Additional, synthetic transitions: Initial state --> state:");
    _builder.newLine();
    {
      final Function1<IEsmState, Boolean> _function = (IEsmState s) -> {
        return Boolean.valueOf(((Objects.equal(s.getKind(), EsmStateKind.INITIAL) && (s.getState() != null)) && (!s.getState().eIsProxy())));
      };
      Iterable<IEsmState> _filter = IterableExtensions.<IEsmState>filter(model.getStates(), _function);
      for(final IEsmState s : _filter) {
        _builder.append(EsmDiagramTextProvider.STATE_INITIAL_FINAL);
        _builder.append(" -");
        String _lowerCase = model.getDirection().getLiteral().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append("-> ");
        String _stateName = this.stateName(s);
        _builder.append(_stateName);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\' Regular transitions:");
    _builder.newLine();
    {
      EList<EsmTransition> _transitions = model.getTransitions();
      for(final EsmTransition t : _transitions) {
        String _stateName_1 = this.stateName(t.getFrom());
        _builder.append(_stateName_1);
        _builder.append(" -");
        String _lowerCase_1 = t.getDirection().getLiteral().toLowerCase();
        _builder.append(_lowerCase_1);
        _builder.append("-> ");
        String _stateName_2 = this.stateName(t.getTo());
        _builder.append(_stateName_2);
        _builder.append(":");
        String _eventName = this.eventName(t.getEvent());
        _builder.append(_eventName);
        String _guardExpression = this.guardExpression(t);
        _builder.append(_guardExpression);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\' Additional, synthetic transitions: state --> final state:");
    _builder.newLine();
    {
      final Function1<IEsmState, Boolean> _function_1 = (IEsmState s_1) -> {
        return Boolean.valueOf(((Objects.equal(s_1.getKind(), EsmStateKind.FINAL) && (s_1.getState() != null)) && (!s_1.getState().eIsProxy())));
      };
      Iterable<IEsmState> _filter_1 = IterableExtensions.<IEsmState>filter(model.getStates(), _function_1);
      for(final IEsmState s_1 : _filter_1) {
        String _stateName_3 = this.stateName(s_1);
        _builder.append(_stateName_3);
        _builder.append(" -");
        String _lowerCase_2 = model.getDirection().getLiteral().toLowerCase();
        _builder.append(_lowerCase_2);
        _builder.append("-> ");
        _builder.append(EsmDiagramTextProvider.STATE_INITIAL_FINAL);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<EsmCompositeState> _filter_2 = Iterables.<EsmCompositeState>filter(model.getStates(), EsmCompositeState.class);
      for(final EsmCompositeState composite : _filter_2) {
        _builder.append("\' Composite state");
        _builder.newLine();
        _builder.append("state ");
        String _stateName_4 = this.stateName(composite.getState());
        _builder.append(_stateName_4);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _genStateModel = this.genStateModel(composite);
        _builder.append(_genStateModel, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      Iterable<EsmConcurrentState> _filter_3 = Iterables.<EsmConcurrentState>filter(model.getStates(), EsmConcurrentState.class);
      for(final EsmConcurrentState concurrent : _filter_3) {
        _builder.append("\' Concurrent state");
        _builder.newLine();
        _builder.append("state ");
        String _stateName_5 = this.stateName(concurrent.getState());
        _builder.append(_stateName_5);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          EList<EsmSubStateModel> _subStates = concurrent.getSubStates();
          boolean _hasElements = false;
          for(final EsmSubStateModel subState : _subStates) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("\n--", "\t");
            }
            _builder.append("\t");
            String _genStateModel_1 = this.genStateModel(subState);
            _builder.append(_genStateModel_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  protected String stateName(final DState state) {
    if (((state == null) || state.eIsProxy())) {
      return EsmDiagramTextProvider.NAME_UNDEFINED;
    }
    return state.getName();
  }
  
  protected String guardExpression(final EsmTransition t) {
    try {
      DExpression _guard = t.getGuard();
      boolean _tripleNotEquals = (_guard != null);
      if (_tripleNotEquals) {
        String expr = this.serializer.serialize(t.getGuard());
        expr = expr.replaceAll("^ |[\t\n\r]", "").replaceAll("[ ]+", " ");
        int _length = expr.length();
        boolean _greaterThan = (_length > EsmDiagramTextProvider.MAX_EXPR_LENGTH);
        if (_greaterThan) {
          String _substring = expr.substring(0, EsmDiagramTextProvider.MAX_EXPR_LENGTH);
          String _plus = (_substring + "...");
          expr = _plus;
        }
        return ((" [" + expr) + "]");
      }
    } catch (final Throwable _t) {
      if (_t instanceof RuntimeException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return "";
  }
  
  protected String eventName(final DStateEvent event) {
    if (((event == null) || event.eIsProxy())) {
      return EsmDiagramTextProvider.NAME_UNDEFINED;
    }
    return event.getName().toLowerCase();
  }
  
  protected String stateName(final IEsmState state) {
    DState _state = state.getState();
    boolean _tripleEquals = (_state == null);
    if (_tripleEquals) {
      return EsmDiagramTextProvider.NAME_UNDEFINED;
    }
    return state.getState().getName();
  }
}
