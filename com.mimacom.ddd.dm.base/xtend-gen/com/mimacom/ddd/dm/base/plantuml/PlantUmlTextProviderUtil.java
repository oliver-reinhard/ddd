package com.mimacom.ddd.dm.base.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityNature;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.DNoteColor;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.INoteContainer;
import com.mimacom.ddd.dm.base.plantuml.RichTextToPlantUmlNoteTextRenderer;
import com.mimacom.ddd.dm.base.plantuml.Spot;
import com.mimacom.ddd.util.plantuml.Color;
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
  
  private static final BasePackage BASE = BasePackage.eINSTANCE;
  
  public static final Spot AGGREGATE_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDAggregate(), new Color(255, 204, 0), 'A');
  
  public static final Spot ENTITY_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDEntityType(), new Color(232, 158, 77), 'E');
  
  public static final Spot ROOT_ENTITY_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDEntityType(), new Color(209, 127, 121), 'R');
  
  public static final Spot RELATIONSHIP_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDEntityType(), new Color(140, 128, 186), 'R');
  
  public static final Spot DETAIL_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDDetailType(), new Color(222, 193, 113), 'D');
  
  public static final Spot PRIMITIVE_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDPrimitive(), new Color(198, 222, 169), 'p');
  
  public static final Spot ENUMERATION_SPOT = new Spot(PlantUmlTextProviderUtil.BASE.getDEnumeration(), new Color(161, 191, 124), 'e');
  
  public static final Color WHITE_NOTE = new Color(250, 249, 245);
  
  public static final Color RED_NOTE = new Color(227, 177, 170);
  
  public static final Color ORANGE_NOTE = new Color(252, 223, 194);
  
  public static final Color YELLOW_NOTE = new Color(252, 239, 194);
  
  public static final Color GREEN_NOTE = new Color(188, 214, 190);
  
  public static final Color BLUE_NOTE = new Color(188, 208, 214);
  
  public static final Color PINK_NOTE = new Color(230, 216, 227);
  
  public static final Color GREY_NOTE = new Color(230, 230, 230);
  
  /**
   * Sequential numbering of Notes:
   */
  private int noteID = 0;
  
  /**
   * Qualified names for references within PlantUML files
   */
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
  
  /**
   * Spots for type diagrams
   */
  public String spot(final DAggregate a) {
    String _xifexpression = null;
    if ((a != null)) {
      _xifexpression = PlantUmlTextProviderUtil.AGGREGATE_SPOT.toString();
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String spot(final DType t) {
    Spot _switchResult = null;
    boolean _matched = false;
    if (t instanceof DEntityType) {
      _matched=true;
      Spot _xifexpression = null;
      boolean _isRoot = ((DEntityType)t).isRoot();
      if (_isRoot) {
        _xifexpression = PlantUmlTextProviderUtil.ROOT_ENTITY_SPOT;
      } else {
        Spot _xifexpression_1 = null;
        DEntityNature _nature = ((DEntityType)t).getNature();
        boolean _equals = Objects.equal(_nature, DEntityNature.RELATIONSHIP);
        if (_equals) {
          _xifexpression_1 = PlantUmlTextProviderUtil.RELATIONSHIP_SPOT;
        } else {
          _xifexpression_1 = PlantUmlTextProviderUtil.ENTITY_SPOT;
        }
        _xifexpression = _xifexpression_1;
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (t instanceof DDetailType) {
        _matched=true;
        _switchResult = PlantUmlTextProviderUtil.DETAIL_SPOT;
      }
    }
    if (!_matched) {
      if (t instanceof DEnumeration) {
        _matched=true;
        _switchResult = PlantUmlTextProviderUtil.ENUMERATION_SPOT;
      }
    }
    if (!_matched) {
      if (t instanceof DPrimitive) {
        _matched=true;
        _switchResult = PlantUmlTextProviderUtil.PRIMITIVE_SPOT;
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    final Spot spot = _switchResult;
    String _xifexpression = null;
    if ((spot != null)) {
      _xifexpression = spot.toString();
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  /**
   * Generate notes on information structure.
   */
  public CharSequence generateNotes(final DModel m) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateNotesWithIds = this.generateNotesWithIds(m, null);
    _builder.append(_generateNotesWithIds);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateNotes(final DAggregate a) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateNotesWithIds = this.generateNotesWithIds(a, this.aggregateQN(a));
    _builder.append(_generateNotesWithIds);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateNotes(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateNotesWithIds = this.generateNotesWithIds(t, this.typeQN(t));
    _builder.append(_generateNotesWithIds);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateNotes(final DFeature f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _renderAsLink = this.renderAsLink(f);
      if (_renderAsLink) {
        CharSequence _generateLinkNotes = this.generateLinkNotes(f);
        _builder.append(_generateLinkNotes);
        _builder.newLineIfNotEmpty();
      } else {
        CharSequence _generateNotesOnRight = this.generateNotesOnRight(f, this.featureQN(f));
        _builder.append(_generateNotesOnRight);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateNotes(final DLiteral lit) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = lit.getNotes();
      for(final DNote n : _notes) {
        CharSequence _generateGenericNoteOnRight = this.generateGenericNoteOnRight(n, this.literalQN(lit));
        _builder.append(_generateGenericNoteOnRight);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * Generic Notes generators
   */
  public CharSequence generateNotesWithIds(final INoteContainer nc, final String targetQN) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = nc.getNotes();
      for(final DNote n : _notes) {
        int _plusPlus = this.noteID++;
        CharSequence _generateGenericNoteWithId = this.generateGenericNoteWithId(n, _plusPlus, targetQN);
        _builder.append(_generateGenericNoteWithId);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateNotesOnRight(final INoteContainer nc, final String targetQN) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = nc.getNotes();
      for(final DNote n : _notes) {
        CharSequence _generateGenericNoteOnRight = this.generateGenericNoteOnRight(n, targetQN);
        _builder.append(_generateGenericNoteOnRight);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateLinkNotes(final INoteContainer nc) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DNote> _notes = nc.getNotes();
      for(final DNote n : _notes) {
        CharSequence _generateLinkNote = this.generateLinkNote(n);
        _builder.append(_generateLinkNote);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public boolean renderAsLink(final DFeature f) {
    return ((f instanceof DAssociation) || ((f instanceof DAttribute) && (f.getType() instanceof DDetailType)));
  }
  
  /**
   * Note for PlantUML object known as 'targetQN' (can be empty --> unlinked note on canvas).
   */
  protected CharSequence generateGenericNoteWithId(final DNote n, final int id, final String targetQN) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note as Note");
    _builder.append(id);
    _builder.append(" ");
    String _noteColor = this.noteColor(n);
    _builder.append(_noteColor);
    _builder.newLineIfNotEmpty();
    String _generateNoteText = this.generateNoteText(n);
    _builder.append(_generateNoteText);
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
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Note for previously declared PlantUML object.
   */
  protected CharSequence generateGenericNoteOnRight(final DNote n, final String targetQN) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((n.eContainer() instanceof DFeature) && (!Objects.equal(this.noteColor(n), "")))) {
        _builder.append("\' PlantUML BUG: color ignored on class members");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("note right of ");
    _builder.append(targetQN);
    _builder.append(" ");
    String _noteColor = this.noteColor(n);
    _builder.append(_noteColor);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    String _generateNoteText = this.generateNoteText(n);
    _builder.append(_generateNoteText);
    _builder.newLineIfNotEmpty();
    _builder.append("end note");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Note for previously declared PlantUML object.
   */
  protected CharSequence generateLinkNote(final DNote n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("note bottom on link ");
    String _noteColor = this.noteColor(n);
    _builder.append(_noteColor);
    _builder.newLineIfNotEmpty();
    String _generateNoteText = this.generateNoteText(n);
    _builder.append(_generateNoteText);
    _builder.newLineIfNotEmpty();
    _builder.append("end note");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  protected String generateNoteText(final DNote n) {
    CharSequence _render = this.notesTextRenderer.render(n.getText());
    return this.removeIndent(((String) _render));
  }
  
  protected String removeIndent(final String text) {
    final String[] lines = text.split("\n[\\s]*");
    final StringBuilder sb = new StringBuilder();
    boolean first = true;
    for (final String line : lines) {
      {
        if ((!first)) {
          sb.append("\n");
        }
        sb.append(line);
        first = false;
      }
    }
    return sb.toString();
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
}
