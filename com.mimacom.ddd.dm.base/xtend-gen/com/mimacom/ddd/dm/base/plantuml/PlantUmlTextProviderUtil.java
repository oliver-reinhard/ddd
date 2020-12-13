package com.mimacom.ddd.dm.base.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DInformationModel;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.DNoteColor;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.plantuml.RichTextToPlantUmlNoteTextRenderer;
import com.mimacom.ddd.util.plantuml.Color;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PlantUmlTextProviderUtil {
  @Inject
  @Extension
  private TypesUtil _typesUtil;
  
  @Inject
  private RichTextToPlantUmlNoteTextRenderer notesTextRenderer;
  
  public static final Color WHITE_NOTE = new Color(255, 255, 255);
  
  public static final Color RED_NOTE = new Color(227, 177, 170);
  
  public static final Color ORANGE_NOTE = new Color(252, 223, 194);
  
  public static final Color YELLOW_NOTE = new Color(252, 239, 194);
  
  public static final Color GREEN_NOTE = new Color(188, 214, 190);
  
  public static final Color BLUE_NOTE = new Color(188, 208, 214);
  
  public static final Color PINK_NOTE = new Color(230, 216, 227);
  
  public static final Color GREY_NOTE = new Color(230, 230, 230);
  
  private int noteID = 0;
  
  public String aggregateQN(final EObject obj) {
    final DAggregate a = this._typesUtil.aggregate(obj);
    String _xifexpression = null;
    if ((a != null)) {
      _xifexpression = a.getName();
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String aggregateQueriesClassName(final DAggregate a) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = a.getName();
    _builder.append(_name);
    _builder.append(".");
    String _name_1 = a.getName();
    _builder.append(_name_1);
    return _builder.toString();
  }
  
  public String typeQN(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    String _aggregateQN = this.aggregateQN(t);
    _builder.append(_aggregateQN);
    _builder.append(".");
    String _name = t.getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  public String featureQN(final DFeature f) {
    final DComplexType t = this._typesUtil.containingType(f);
    if ((t != null)) {
      StringConcatenation _builder = new StringConcatenation();
      String _typeQN = this.typeQN(t);
      _builder.append(_typeQN);
      _builder.append("::");
      String _name = f.getName();
      _builder.append(_name);
      return _builder.toString();
    }
    final DAggregate a = this._typesUtil.aggregate(f);
    if ((a != null)) {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _aggregateQueriesClassName = this.aggregateQueriesClassName(a);
      _builder_1.append(_aggregateQueriesClassName);
      _builder_1.append("::");
      String _name_1 = f.getName();
      _builder_1.append(_name_1);
      return _builder_1.toString();
    }
    return f.getName();
  }
  
  public String literalQN(final DLiteral lit) {
    final EObject t = lit.eContainer();
    String _xifexpression = null;
    if ((t instanceof DEnumeration)) {
      StringConcatenation _builder = new StringConcatenation();
      String _typeQN = this.typeQN(((DType)t));
      _builder.append(_typeQN);
      _builder.append("::");
      String _name = lit.getName();
      _builder.append(_name);
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = lit.getName();
    }
    return _xifexpression;
  }
  
  public String associationTargetQN(final DType source, final DType target) {
    String _modelName = this._typesUtil.modelName(source);
    String _modelName_1 = this._typesUtil.modelName(target);
    boolean _equals = Objects.equal(_modelName, _modelName_1);
    if (_equals) {
      String _aggregateName = this._typesUtil.aggregateName(source);
      String _aggregateName_1 = this._typesUtil.aggregateName(target);
      boolean _equals_1 = Objects.equal(_aggregateName, _aggregateName_1);
      if (_equals_1) {
        return this.typeQN(target);
      }
      return this.aggregateQN(target);
    }
    return this._typesUtil.modelName(target);
  }
  
  protected CharSequence _generateNotes(final DInformationModel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = m.getNotes();
      for(final DNote n : _notes) {
        int _plusPlus = this.noteID++;
        CharSequence _generateNoteForStructuralElement = this.generateNoteForStructuralElement(n, _plusPlus, null);
        _builder.append(_generateNoteForStructuralElement);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateNotes(final DAggregate a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = a.getNotes();
      for(final DNote n : _notes) {
        int _plusPlus = this.noteID++;
        CharSequence _generateNoteForStructuralElement = this.generateNoteForStructuralElement(n, _plusPlus, this.aggregateQN(a));
        _builder.append(_generateNoteForStructuralElement);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateNotes(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = t.getNotes();
      for(final DNote n : _notes) {
        int _plusPlus = this.noteID++;
        CharSequence _generateNoteForStructuralElement = this.generateNoteForStructuralElement(n, _plusPlus, this.typeQN(t));
        _builder.append(_generateNoteForStructuralElement);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateNotes(final DFeature a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = a.getNotes();
      for(final DNote n : _notes) {
        {
          boolean _renderAsLink = this.renderAsLink(a);
          if (_renderAsLink) {
            _builder.append("note bottom on link ");
            String _noteColor = this.noteColor(n);
            _builder.append(_noteColor);
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            CharSequence _generateNoteText = this.generateNoteText(n);
            _builder.append(_generateNoteText, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("end note");
            _builder.newLine();
          } else {
            CharSequence _generateUmlFeatureNote = this.generateUmlFeatureNote(n, this.featureQN(a));
            _builder.append(_generateUmlFeatureNote);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateNotes(final DLiteral lit) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = lit.getNotes();
      for(final DNote n : _notes) {
        CharSequence _generateUmlFeatureNote = this.generateUmlFeatureNote(n, this.literalQN(lit));
        _builder.append(_generateUmlFeatureNote);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public boolean renderAsLink(final DFeature f) {
    return ((f instanceof DAssociation) || ((f instanceof DAttribute) && (f.getType() instanceof DDetailType)));
  }
  
  protected CharSequence generateNoteForStructuralElement(final DNote n, final int id, final String targetQN) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note as Note");
    _builder.append(id);
    _builder.append(" ");
    String _noteColor = this.noteColor(n);
    _builder.append(_noteColor);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateNoteText = this.generateNoteText(n);
    _builder.append(_generateNoteText, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("end note");
    _builder.newLine();
    {
      if ((targetQN != null)) {
        _builder.append("Note");
        _builder.append(id);
        _builder.append(" .. ");
        _builder.append(targetQN);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence generateUmlFeatureNote(final DNote n, final String targetQN) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note right of ");
    _builder.append(targetQN);
    _builder.append(" ");
    String _noteColor = this.noteColor(n);
    _builder.append(_noteColor);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _generateNoteText = this.generateNoteText(n);
    _builder.append(_generateNoteText, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("end note");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence generateNoteText(final DNote n) {
    return this.notesTextRenderer.render(n.getText());
  }
  
  protected String noteColor(final DNote n) {
    String _xblockexpression = null;
    {
      if ((n == null)) {
        return "";
      }
      String _switchResult = null;
      DNoteColor _color = n.getColor();
      if (_color != null) {
        switch (_color) {
          case DEFAULT:
            _switchResult = "";
            break;
          case WHITE:
            _switchResult = this.noteColorWhite().toString();
            break;
          case RED:
            _switchResult = this.noteColorRed().toString();
            break;
          case ORANGE:
            _switchResult = this.noteColorOrange().toString();
            break;
          case YELLOW:
            _switchResult = this.noteColorYellow().toString();
            break;
          case GREEN:
            _switchResult = this.noteColorGreen().toString();
            break;
          case BLUE:
            _switchResult = this.noteColorBlue().toString();
            break;
          case PINK:
            _switchResult = this.noteColorPink().toString();
            break;
          case GREY:
            _switchResult = this.noteColorGrey().toString();
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected Color noteColorWhite() {
    return PlantUmlTextProviderUtil.WHITE_NOTE;
  }
  
  protected Color noteColorRed() {
    return PlantUmlTextProviderUtil.RED_NOTE;
  }
  
  protected Color noteColorOrange() {
    return PlantUmlTextProviderUtil.ORANGE_NOTE;
  }
  
  protected Color noteColorYellow() {
    return PlantUmlTextProviderUtil.YELLOW_NOTE;
  }
  
  protected Color noteColorGreen() {
    return PlantUmlTextProviderUtil.GREEN_NOTE;
  }
  
  protected Color noteColorBlue() {
    return PlantUmlTextProviderUtil.BLUE_NOTE;
  }
  
  protected Color noteColorPink() {
    return PlantUmlTextProviderUtil.PINK_NOTE;
  }
  
  protected Color noteColorGrey() {
    return PlantUmlTextProviderUtil.GREY_NOTE;
  }
  
  protected Color defaultNoteColor() {
    return PlantUmlTextProviderUtil.YELLOW_NOTE;
  }
  
  public CharSequence generateNotes(final EObject a) {
    if (a instanceof DAggregate) {
      return _generateNotes((DAggregate)a);
    } else if (a instanceof DFeature) {
      return _generateNotes((DFeature)a);
    } else if (a instanceof DInformationModel) {
      return _generateNotes((DInformationModel)a);
    } else if (a instanceof DLiteral) {
      return _generateNotes((DLiteral)a);
    } else if (a instanceof DType) {
      return _generateNotes((DType)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
