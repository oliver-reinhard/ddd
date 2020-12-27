package com.mimacom.ddd.dm.dom.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.plantuml.PlantUmlTextProviderUtil;
import com.mimacom.ddd.dm.base.plantuml.Spot;
import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxDetail;
import com.mimacom.ddd.dm.dmx.DmxEntity;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor;
import com.mimacom.ddd.dm.dom.DomModel;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import com.mimacom.ddd.dm.dom.DomSnapshot;
import com.mimacom.ddd.dm.dom.DomUtil;
import com.mimacom.ddd.dm.dom.evaluator.DomExpressionEvaluator;
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer;
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider;
import com.mimacom.ddd.util.plantuml.SkinparamArrow;
import com.mimacom.ddd.util.plantuml.SkinparamClass;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;
import com.mimacom.ddd.util.plantuml.SkinparamNote;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DomObjectDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DomModel> {
  @Inject
  @Extension
  private DomUtil _domUtil;
  
  @Inject
  @Extension
  private DomTypeComputer _domTypeComputer;
  
  @Inject
  @Extension
  private DomExpressionEvaluator _domExpressionEvaluator;
  
  @Inject
  @Extension
  private PlantUmlTextProviderUtil _plantUmlTextProviderUtil;
  
  private static final int MAX_EXPR_LENGTH = 30;
  
  @Inject
  private ISerializer serializer;
  
  @Inject
  private SkinparamGlobal skinparamGlobal;
  
  @Inject
  private SkinparamClass skinparamClass;
  
  @Inject
  private SkinparamArrow skinparamArrow;
  
  @Inject
  private SkinparamNote skinparamNote;
  
  @Override
  public boolean canProvide(final DomModel model) {
    return ((model != null) && (!model.getSnapshots().isEmpty()));
  }
  
  @Override
  public String diagramText(final DomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateSkinParameters = this.generateSkinParameters();
    _builder.append(_generateSkinParameters);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<DomSnapshot> _snapshots = model.getSnapshots();
      for(final DomSnapshot s : _snapshots) {
        String _generateSnapshot = this.generateSnapshot(s);
        _builder.append(_generateSnapshot);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@enduml");
    _builder.newLine();
    return _builder.toString();
  }
  
  public CharSequence generateSkinParameters() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.skinparamGlobal);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamClass);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamArrow);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamNote);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generateSnapshot(final DomSnapshot s) {
    final List<DmxComplexObject> allComplexObjects = EcoreUtil2.<DmxComplexObject>eAllOfType(s, DmxComplexObject.class);
    final Function1<DmxField, Boolean> _function = (DmxField it) -> {
      return Boolean.valueOf(this.renderAsLink(it));
    };
    final Iterable<DmxField> allLinks = IterableExtensions.<DmxField>filter(EcoreUtil2.<DmxField>eAllOfType(s, DmxField.class), _function);
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
    _builder.append("\t");
    {
      for(final DmxComplexObject obj : allComplexObjects) {
        String _generate = this.generate(obj);
        _builder.append(_generate, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      for(final DmxField link : allLinks) {
        String _generateLink = this.generateLink(link, this._domExpressionEvaluator.valueFor(link.getValue()));
        _builder.append(_generateLink, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    CharSequence _generateNotesWithIds = this._plantUmlTextProviderUtil.generateNotesWithIds(s, s.getName());
    _builder.append(_generateNotesWithIds);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
  
  public String generate(final DmxComplexObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _title = this.title(o);
    _builder.append(_title);
    _builder.append(" as ");
    String _id = this.id(o);
    _builder.append(_id);
    _builder.append(" ");
    Object _spot = this.getSpot(o);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      final Function1<DmxField, Boolean> _function = (DmxField it) -> {
        boolean _renderAsLink = this.renderAsLink(it);
        return Boolean.valueOf((!_renderAsLink));
      };
      Iterable<DmxField> _filter = IterableExtensions.<DmxField>filter(o.getFields(), _function);
      for(final DmxField f : _filter) {
        _builder.append("\t");
        String _generateField = this.generateField(f, f.getValue());
        _builder.append(_generateField, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    CharSequence _generateNotes = this.generateNotes(o);
    _builder.append(_generateNotes);
    _builder.newLineIfNotEmpty();
    {
      final Function1<DmxField, Boolean> _function_1 = (DmxField it) -> {
        boolean _renderAsLink = this.renderAsLink(it);
        return Boolean.valueOf((!_renderAsLink));
      };
      Iterable<DmxField> _filter_1 = IterableExtensions.<DmxField>filter(o.getFields(), _function_1);
      for(final DmxField f_1 : _filter_1) {
        CharSequence _generateNotes_1 = this.generateNotes(f_1);
        _builder.append(_generateNotes_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder.toString();
  }
  
  public String title(final DmxComplexObject o) {
    String _xifexpression = null;
    DComplexType _type = o.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      _xifexpression = o.getType().getName();
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
      if (o instanceof DmxField) {
        _matched=true;
        String _xifexpression = null;
        DFeature _feature = ((DmxField)o).getFeature();
        boolean _tripleNotEquals = (_feature != null);
        if (_tripleNotEquals) {
          _xifexpression = ((DmxField)o).getFeature().getName();
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
  
  protected String _generateField(final DmxField f, final DmxListExpression expr) {
    String _xifexpression = null;
    AbstractDmxTypeDescriptor<?> _typeFor = this._domTypeComputer.typeFor(expr);
    boolean _not = (!(_typeFor instanceof DmxComplexTypeDescriptor));
    if (_not) {
      _xifexpression = this.generateFieldImpl(f, expr);
    }
    return _xifexpression;
  }
  
  protected String _generateField(final DmxField f, final DExpression value) {
    return this.generateFieldImpl(f, value);
  }
  
  public String generateFieldImpl(final DmxField f, final DExpression value) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = f.getFeature().getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _fieldValueExpression = this.fieldValueExpression(f);
    _builder.append(_fieldValueExpression);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateLink(final DmxField f, final DmxEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = f.eContainer();
    String _id = this.id(((DmxComplexObject) _eContainer));
    _builder.append(_id);
    _builder.append(" --> ");
    String _id_1 = this.id(entity);
    _builder.append(_id_1);
    _builder.newLineIfNotEmpty();
    CharSequence _generateLinkNotes = this._plantUmlTextProviderUtil.generateLinkNotes(f);
    _builder.append(_generateLinkNotes);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateLink(final DmxField f, final DmxDetail detail) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = f.eContainer();
    String _id = this.id(((DmxComplexObject) _eContainer));
    _builder.append(_id);
    _builder.append(" --> ");
    String _id_1 = this.id(detail);
    _builder.append(_id_1);
    _builder.newLineIfNotEmpty();
    CharSequence _generateLinkNotes = this._plantUmlTextProviderUtil.generateLinkNotes(f);
    _builder.append(_generateLinkNotes);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateLink(final DmxField f, final List<?> list) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Object obj : list) {
        String _generateLink = this.generateLink(f, obj);
        _builder.append(_generateLink);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public Object getSpot(final EObject obj) {
    Spot _switchResult = null;
    boolean _matched = false;
    if (obj instanceof DmxEntity) {
      _matched=true;
      Spot _xifexpression = null;
      boolean _root = this._domUtil.root(((DmxComplexObject)obj));
      if (_root) {
        _xifexpression = PlantUmlTextProviderUtil.ROOT_ENTITY_SPOT;
      } else {
        _xifexpression = PlantUmlTextProviderUtil.ENTITY_SPOT;
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (obj instanceof DmxDetail) {
        _matched=true;
        _switchResult = PlantUmlTextProviderUtil.DETAIL_SPOT;
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    final Spot spot = _switchResult;
    Object _xifexpression = null;
    if ((spot != null)) {
      _xifexpression = spot;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected String fieldValueExpression(final DmxField f) {
    try {
      DExpression _value = f.getValue();
      boolean _tripleNotEquals = (_value != null);
      if (_tripleNotEquals) {
        String expr = this.serializer.serialize(f.getValue());
        expr = expr.replaceAll("^ |[\t\n\r]", "").replaceAll("[ ]+", " ");
        int _length = expr.length();
        boolean _greaterThan = (_length > DomObjectDiagramTextProviderImpl.MAX_EXPR_LENGTH);
        if (_greaterThan) {
          String _substring = expr.substring(0, DomObjectDiagramTextProviderImpl.MAX_EXPR_LENGTH);
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
  
  protected String id(final DmxComplexObject o) {
    int _hashCode = o.hashCode();
    return ("Obj" + Integer.valueOf(_hashCode));
  }
  
  public boolean renderAsLink(final DmxField f) {
    final DFeature feature = f.getFeature();
    return ((feature != null) && ((feature instanceof DAssociation) || ((feature instanceof DAttribute) && ((DAttribute) feature).isDetail())));
  }
  
  protected CharSequence generateNotes(final DmxComplexObject obj) {
    final DomNamedComplexObject namedComplexObject = EcoreUtil2.<DomNamedComplexObject>getContainerOfType(obj, DomNamedComplexObject.class);
    if ((namedComplexObject != null)) {
      return this._plantUmlTextProviderUtil.generateNotesWithIds(namedComplexObject, this.id(obj));
    }
    return "";
  }
  
  protected CharSequence generateNotes(final DmxField f) {
    final DmxComplexObject complexObject = EcoreUtil2.<DmxComplexObject>getContainerOfType(f, DmxComplexObject.class);
    if ((complexObject != null)) {
      StringConcatenation _builder = new StringConcatenation();
      String _id = this.id(complexObject);
      _builder.append(_id);
      _builder.append("::");
      String _name = f.getName();
      _builder.append(_name);
      return this._plantUmlTextProviderUtil.generateNotesOnRight(f, _builder.toString());
    }
    return "";
  }
  
  public String generateField(final DmxField f, final DExpression expr) {
    if (expr instanceof DmxListExpression) {
      return _generateField(f, (DmxListExpression)expr);
    } else if (expr != null) {
      return _generateField(f, expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f, expr).toString());
    }
  }
  
  public String generateLink(final DmxField f, final Object detail) {
    if (detail instanceof DmxDetail) {
      return _generateLink(f, (DmxDetail)detail);
    } else if (detail instanceof DmxEntity) {
      return _generateLink(f, (DmxEntity)detail);
    } else if (detail instanceof List) {
      return _generateLink(f, (List<?>)detail);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f, detail).toString());
    }
  }
}
