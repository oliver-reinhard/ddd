package com.mimacom.ddd.dm.dom.ui.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor;
import com.mimacom.ddd.dm.dom.DomComplexObject;
import com.mimacom.ddd.dm.dom.DomDetail;
import com.mimacom.ddd.dm.dom.DomEntity;
import com.mimacom.ddd.dm.dom.DomField;
import com.mimacom.ddd.dm.dom.DomModel;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import com.mimacom.ddd.dm.dom.DomObject;
import com.mimacom.ddd.dm.dom.DomSnapshot;
import com.mimacom.ddd.dm.dom.DomUtil;
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer;
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
  @Extension
  private DomUtil _domUtil;
  
  @Inject
  @Extension
  private DomTypeComputer _domTypeComputer;
  
  @Inject
  private ISerializer serializer;
  
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
    _builder.append("\t");
    _builder.append("arrowThickness 0.5");
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
      return Boolean.valueOf(((it.getValue() instanceof DomDetail) || ((it.getValue() instanceof DmxListExpression) && (this._domTypeComputer.typeFor(it.getValue()) instanceof DmxComplexTypeDescriptor))));
    };
    final Iterable<DomField> allContainments = IterableExtensions.<DomField>filter(EcoreUtil2.<DomField>eAllOfType(s, DomField.class), _function_1);
    final Function1<DomField, Boolean> _function_2 = (DomField it) -> {
      return Boolean.valueOf(((it.getValue() instanceof DmxContextReference) && (this._domTypeComputer.typeFor(it.getValue()) instanceof DomComplexObject)));
    };
    final Iterable<DomField> allReferences = IterableExtensions.<DomField>filter(EcoreUtil2.<DomField>eAllOfType(s, DomField.class), _function_2);
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
      for(final DomField ref : allContainments) {
        String _generateContainment = this.generateContainment(ref, ref.getValue());
        _builder.append(_generateContainment);
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
    _builder.append("\t");
    {
      EList<DomField> _fields = o.getFields();
      for(final DomField f : _fields) {
        {
          DFeature _ref = f.getRef();
          boolean _tripleNotEquals = (_ref != null);
          if (_tripleNotEquals) {
            Object _generateField = this.generateField(f, f.getValue());
            _builder.append(_generateField, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateContainment(final DomField f, final DomDetail detail) {
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
  
  protected String _generateContainment(final DomField f, final DmxListExpression expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DExpression> _elements = expr.getElements();
      for(final DExpression detail : _elements) {
        EObject _eContainer = f.eContainer();
        String _id = this.id(((DomComplexObject) _eContainer));
        _builder.append(_id);
        _builder.append(" --> ");
        String _id_1 = this.id(((DomComplexObject) detail));
        _builder.append(_id_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateReference(final DomField f, final DmxContextReference ref) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = f.eContainer();
    String _id = this.id(((DomComplexObject) _eContainer));
    _builder.append(_id);
    _builder.append(" --> ");
    DNamedElement _target = ref.getTarget();
    String _id_1 = this.id(((DomComplexObject) _target));
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
    final String instanceName = this.name(o.eContainer());
    return (((("\"" + instanceName) + " : ") + className) + "\"");
  }
  
  public String name(final EObject o) {
    String _switchResult = null;
    boolean _matched = false;
    if (o instanceof DomNamedComplexObject) {
      _matched=true;
      _switchResult = ((DomNamedComplexObject)o).getName();
    }
    if (!_matched) {
      if (o instanceof DomField) {
        _matched=true;
        String _xifexpression = null;
        DFeature _ref = ((DomField)o).getRef();
        boolean _tripleNotEquals = (_ref != null);
        if (_tripleNotEquals) {
          _xifexpression = ((DomField)o).getRef().getName();
        } else {
          _xifexpression = "";
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (o instanceof DmxListExpression) {
        _matched=true;
        _switchResult = this.name(((DmxListExpression)o).eContainer());
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  protected String _generateField(final DomField f, final DomDetail detail) {
    return null;
  }
  
  protected String _generateField(final DomField f, final DmxListExpression expr) {
    String _xifexpression = null;
    AbstractDmxTypeDescriptor<?> _typeFor = this._domTypeComputer.typeFor(expr);
    boolean _not = (!(_typeFor instanceof DmxComplexTypeDescriptor));
    if (_not) {
      _xifexpression = this.generateFieldImpl(f, expr);
    }
    return _xifexpression;
  }
  
  protected String _generateField(final DomField f, final DExpression value) {
    return this.generateFieldImpl(f, value);
  }
  
  public String generateFieldImpl(final DomField f, final DExpression value) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = f.getRef().getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _fieldValueExpression = this.fieldValueExpression(f);
    _builder.append(_fieldValueExpression);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
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
    return Integer.toString(o.hashCode());
  }
  
  public String generateContainment(final DomField f, final DExpression detail) {
    if (detail instanceof DomDetail) {
      return _generateContainment(f, (DomDetail)detail);
    } else if (detail instanceof DmxListExpression) {
      return _generateContainment(f, (DmxListExpression)detail);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f, detail).toString());
    }
  }
  
  public String generateField(final DomField f, final DExpression detail) {
    if (detail instanceof DomDetail) {
      return _generateField(f, (DomDetail)detail);
    } else if (detail instanceof DmxListExpression) {
      return _generateField(f, (DmxListExpression)detail);
    } else if (detail != null) {
      return _generateField(f, detail);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f, detail).toString());
    }
  }
}
