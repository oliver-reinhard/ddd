package com.mimacom.ddd.dm.dom.ui.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.dom.DomComplexObject;
import com.mimacom.ddd.dm.dom.DomDetail;
import com.mimacom.ddd.dm.dom.DomEntity;
import com.mimacom.ddd.dm.dom.DomField;
import com.mimacom.ddd.dm.dom.DomModel;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import com.mimacom.ddd.dm.dom.DomObject;
import com.mimacom.ddd.dm.dom.DomSnapshot;
import com.mimacom.ddd.dm.dom.DomUtil;
import com.mimacom.ddd.dm.dom.ui.internal.DomActivator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DomDiagramTextProvider extends AbstractDiagramTextProvider {
  @Inject
  private ISerializer serializer;
  
  @Inject
  @Extension
  private DomUtil _domUtil;
  
  private static final int MAX_EXPR_LENGTH = 30;
  
  public DomDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(DomActivator.COM_MIMACOM_DDD_DM_DOM_DOM));
  }
  
  @Override
  public boolean supportsSelection(final ISelection sel) {
    return false;
  }
  
  @Override
  protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection sel, final Map<String, Object> obj) {
    IDocument _document = ((XtextEditor) editorPart).getDocumentProvider().getDocument(editorInput);
    final XtextDocument document = ((XtextDocument) _document);
    final IUnitOfWork<DomModel, XtextResource> _function = (XtextResource it) -> {
      DomModel _xifexpression = null;
      EObject _head = IterableExtensions.<EObject>head(it.getContents());
      if ((_head instanceof DomModel)) {
        EObject _head_1 = IterableExtensions.<EObject>head(it.getContents());
        _xifexpression = ((DomModel) _head_1);
      } else {
        _xifexpression = null;
      }
      return _xifexpression;
    };
    final DomModel model = document.<DomModel>readOnly(_function);
    if (((model != null) && (!model.getSnapshots().isEmpty()))) {
      return this.snapshots(model);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No objects to show.\" as N1");
      return _builder.toString();
    }
  }
  
  public String snapshots(final DomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("hide empty members");
    _builder.newLine();
    _builder.newLine();
    _builder.append("skinparam backgroundColor transparent ");
    _builder.newLine();
    _builder.append("skinparam shadowing false");
    _builder.newLine();
    _builder.newLine();
    _builder.append("skinparam CircledCharacterFontName Arial");
    _builder.newLine();
    _builder.append("skinparam CircledCharacterFontSize 12");
    _builder.newLine();
    _builder.newLine();
    _builder.append("skinparam package {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fontName Arial");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderColor DimGrey");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderThickness 0.5");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("stereotypeFontName Arial");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("stereotypeFontSize 12");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("skinparam class {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fontName Arial");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fontStyle bold");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attributeFontName Arial");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attributeFontStyle normal");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("backgroundColor WhiteSmoke");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderThickness 0.5");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<DomSnapshot> _snapshots = model.getSnapshots();
      for(final DomSnapshot s : _snapshots) {
        String _generateSnapshot = this.generateSnapshot(s);
        _builder.append(_generateSnapshot);
        _builder.newLineIfNotEmpty();
      }
    }
    final String result = _builder.toString();
    return result;
  }
  
  public String generateSnapshot(final DomSnapshot s) {
    final Function1<DomObject, Boolean> _function = (DomObject it) -> {
      return Boolean.valueOf((!(it instanceof DomNamedComplexObject)));
    };
    final Iterable<DomObject> allNonComplexObjects = IterableExtensions.<DomObject>filter(EcoreUtil2.<DomObject>eAllOfType(s, DomObject.class), _function);
    final List<DomComplexObject> allComplexObjects = EcoreUtil2.<DomComplexObject>eAllOfType(s, DomComplexObject.class);
    final Function1<DomField, Boolean> _function_1 = (DomField it) -> {
      DExpression _value = it.getValue();
      return Boolean.valueOf((_value instanceof DomDetail));
    };
    final Iterable<DomField> allReferences = IterableExtensions.<DomField>filter(EcoreUtil2.<DomField>eAllOfType(s, DomField.class), _function_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\' snapshot ");
    String _name = s.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("frame ");
    String _name_1 = s.getName();
    _builder.append(_name_1);
    _builder.append(" <<Snapshot>> {");
    _builder.newLineIfNotEmpty();
    {
      for(final DomComplexObject obj : allComplexObjects) {
        String _generate = this.generate(obj);
        _builder.append(_generate);
      }
    }
    _builder.newLineIfNotEmpty();
    {
      for(final DomField obj_1 : allReferences) {
        DExpression _value = obj_1.getValue();
        String _generateReference = this.generateReference(obj_1, ((DomDetail) _value));
        _builder.append(_generateReference);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
  
  public String generate(final DomComplexObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _title = this.title(o);
    _builder.append(_title);
    _builder.append(" as ");
    String _id = this.id(o);
    _builder.append(_id);
    _builder.append(" ");
    String _spot = this.getSpot(o);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<DomField> _fields = o.getFields();
      for(final DomField f : _fields) {
        {
          DFeature _ref = f.getRef();
          boolean _tripleNotEquals = (_ref != null);
          if (_tripleNotEquals) {
            Object _generateField = this.generateField(f, f.getValue());
            _builder.append(_generateField);
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateReference(final DomField f, final DomDetail detail) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = f.eContainer();
    String _id = this.id(((DomComplexObject) _eContainer));
    _builder.append(_id);
    _builder.append(" --> ");
    String _id_1 = this.id(detail);
    _builder.append(_id_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String title(final DomComplexObject o) {
    String _xifexpression = null;
    DComplexType _ref = o.getRef();
    boolean _tripleNotEquals = (_ref != null);
    if (_tripleNotEquals) {
      _xifexpression = o.getRef().getName();
    } else {
      _xifexpression = "?";
    }
    final String className = _xifexpression;
    final EObject container = o.eContainer();
    String _switchResult = null;
    boolean _matched = false;
    if (container instanceof DomNamedComplexObject) {
      _matched=true;
      _switchResult = ((DomNamedComplexObject)container).getName();
    }
    if (!_matched) {
      if (container instanceof DomField) {
        _matched=true;
        String _xifexpression_1 = null;
        DFeature _ref_1 = ((DomField)container).getRef();
        boolean _tripleNotEquals_1 = (_ref_1 != null);
        if (_tripleNotEquals_1) {
          _xifexpression_1 = ((DomField)container).getRef().getName();
        } else {
          _xifexpression_1 = "";
        }
        _switchResult = _xifexpression_1;
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    final String instanceName = _switchResult;
    return (((("\"" + instanceName) + " : ") + className) + "\"");
  }
  
  protected CharSequence _generateField(final DomField f, final DomDetail detail) {
    return null;
  }
  
  protected CharSequence _generateField(final DomField f, final DExpression value) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = f.getRef().getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _fieldValueExpression = this.fieldValueExpression(f);
    _builder.append(_fieldValueExpression);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String getSpot(final EObject obj) {
    String _switchResult = null;
    boolean _matched = false;
    if (obj instanceof DomEntity) {
      _matched=true;
      String _xifexpression = null;
      boolean _root = this._domUtil.root(((DomComplexObject)obj));
      if (_root) {
        _xifexpression = "<< (R,#FB3333) >>";
      } else {
        _xifexpression = "<< (E,#F78100) >>";
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (obj instanceof DomDetail) {
        _matched=true;
        _switchResult = "<< (D,#FAE55F) >>";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  protected String fieldValueExpression(final DomField f) {
    try {
      DExpression _value = f.getValue();
      boolean _tripleNotEquals = (_value != null);
      if (_tripleNotEquals) {
        String expr = this.serializer.serialize(f.getValue());
        expr = expr.replaceAll("^ |[\t\n\r]", "").replaceAll("[ ]+", " ");
        int _length = expr.length();
        boolean _greaterThan = (_length > DomDiagramTextProvider.MAX_EXPR_LENGTH);
        if (_greaterThan) {
          String _substring = expr.substring(0, DomDiagramTextProvider.MAX_EXPR_LENGTH);
          String _plus = (_substring + "...");
          expr = _plus;
        }
        return expr;
      }
    } catch (final Throwable _t) {
      if (_t instanceof RuntimeException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return "";
  }
  
  public String id(final DomComplexObject o) {
    final StringBuilder b = new StringBuilder();
    EObject current = o;
    while (((current != null) && (!(current instanceof DomSnapshot)))) {
      {
        boolean _matched = false;
        if (current instanceof DomField) {
          _matched=true;
          DFeature _ref = ((DomField)current).getRef();
          boolean _tripleNotEquals = (_ref != null);
          if (_tripleNotEquals) {
            b.append(((DomField)current).getRef().getName());
            b.append("_");
          }
        }
        if (!_matched) {
          if (current instanceof DomObject) {
            _matched=true;
            String _name = ((DomObject)current).getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              b.append(((DomObject)current).getName());
              b.append("_");
            }
          }
        }
        if (!_matched) {
          b.append("");
        }
        current = current.eContainer();
      }
    }
    return b.toString();
  }
  
  public CharSequence generateField(final DomField f, final DExpression detail) {
    if (detail instanceof DomDetail) {
      return _generateField(f, (DomDetail)detail);
    } else if (detail != null) {
      return _generateField(f, detail);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f, detail).toString());
    }
  }
}
