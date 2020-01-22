package com.mimacom.ddd.pub.pub;

import com.google.common.collect.Iterables;
<<<<<<< HEAD
import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.pub.proto.ProtoAbbreviations;
import com.mimacom.ddd.pub.proto.ProtoAbstract;
import com.mimacom.ddd.pub.proto.ProtoAppendix;
import com.mimacom.ddd.pub.proto.ProtoBibliography;
import com.mimacom.ddd.pub.proto.ProtoChangeHistory;
import com.mimacom.ddd.pub.proto.ProtoChapter;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoEpilogue;
import com.mimacom.ddd.pub.proto.ProtoGlossary;
import com.mimacom.ddd.pub.proto.ProtoIndex;
import com.mimacom.ddd.pub.proto.ProtoListOfFigures;
import com.mimacom.ddd.pub.proto.ProtoListOfTables;
import com.mimacom.ddd.pub.proto.ProtoPart;
import com.mimacom.ddd.pub.proto.ProtoPreface;
import com.mimacom.ddd.pub.proto.ProtoPublicationBody;
import com.mimacom.ddd.pub.proto.ProtoSection;
import com.mimacom.ddd.pub.proto.ProtoSubsection;
import com.mimacom.ddd.pub.proto.ProtoSubsubsection;
import com.mimacom.ddd.pub.proto.ProtoTOC;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Abstract;
import com.mimacom.ddd.pub.pub.Appendix;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Epilogue;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.Paragraph;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.Preface;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PubUtil {
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public boolean empty(final DRichText text) {
    return text.getSegments().isEmpty();
  }
  
  /**
   * Returns the prototype segment corresponding to the given segment.
   * 
   * @return null if no corresponding prototype segment was found, or the first one if several prototype segments match
   */
  public ProtoDocumentSegment prototype(final DocumentSegment segment) {
    Class<? extends ProtoDocumentSegment> _switchResult = null;
    boolean _matched = false;
    if (segment instanceof Abstract) {
      _matched=true;
      _switchResult = ProtoAbstract.class;
    }
    if (!_matched) {
      if (segment instanceof Preface) {
        _matched=true;
        _switchResult = ProtoPreface.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Epilogue) {
        _matched=true;
        _switchResult = ProtoEpilogue.class;
      }
    }
    if (!_matched) {
      if (segment instanceof PublicationBody) {
        _matched=true;
        _switchResult = ProtoPublicationBody.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ChangeHistory) {
        _matched=true;
        _switchResult = ProtoChangeHistory.class;
      }
    }
    if (!_matched) {
      if (segment instanceof TOC) {
        _matched=true;
        _switchResult = ProtoTOC.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Abbreviations) {
        _matched=true;
        _switchResult = ProtoAbbreviations.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ListOfTables) {
        _matched=true;
        _switchResult = ProtoListOfTables.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ListOfFigures) {
        _matched=true;
        _switchResult = ProtoListOfFigures.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Bibliography) {
        _matched=true;
        _switchResult = ProtoBibliography.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Glossary) {
        _matched=true;
        _switchResult = ProtoGlossary.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Index) {
        _matched=true;
        _switchResult = ProtoIndex.class;
      }
    }
    if (!_matched) {
      String _string = segment.getClass().toString();
      throw new IllegalArgumentException(_string);
    }
    final Class<? extends ProtoDocumentSegment> prototypeType = _switchResult;
    final PublicationClass pubClass = segment.getParent().getPublicationClass();
    final Iterable<? extends ProtoDocumentSegment> result = Iterables.filter(pubClass.getSegments(), prototypeType);
    boolean _isEmpty = IterableExtensions.isEmpty(result);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.head(result);
  }
  
  public ProtoDivision prototype(final Division div) {
    Class<? extends ProtoDivision> _switchResult = null;
    boolean _matched = false;
    if (div instanceof Appendix) {
      _matched=true;
      _switchResult = ProtoAppendix.class;
    }
    if (!_matched) {
      if (div instanceof Part) {
        _matched=true;
        _switchResult = ProtoPart.class;
      }
    }
    if (!_matched) {
      if (div instanceof Chapter) {
        _matched=true;
        _switchResult = ProtoChapter.class;
      }
    }
    if (!_matched) {
      if (div instanceof Section) {
        _matched=true;
        _switchResult = ProtoSection.class;
      }
    }
    if (!_matched) {
      if (div instanceof Subsection) {
        _matched=true;
        _switchResult = ProtoSubsection.class;
      }
    }
    if (!_matched) {
      if (div instanceof Subsubsection) {
        _matched=true;
        _switchResult = ProtoSubsubsection.class;
      }
    }
    if (!_matched) {
      String _string = div.getClass().toString();
      throw new IllegalArgumentException(_string);
    }
    final Class<? extends ProtoDivision> prototypeType = _switchResult;
    final PublicationClass pubClass = div.getDocument().getPublicationClass();
    final Iterable<? extends ProtoDivision> result = Iterables.filter(pubClass.getDivisions(), prototypeType);
    boolean _isEmpty = IterableExtensions.isEmpty(result);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.head(result);
  }
  
  public Table createTableWithHeader(final String[] labels) {
    int _length = labels.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    final Table t = PubUtil.PUB.createTable();
    t.setColumns(labels.length);
    final TableRow row = this.addSimpleRow(t, labels);
    row.setIsHeading(true);
    return t;
  }
  
  public TableRow addSimpleRow(final Table t, final String[] labels) {
    int _length = labels.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    int _length_1 = labels.length;
    int _columns = t.getColumns();
    boolean _notEquals = (_length_1 != _columns);
    if (_notEquals) {
      int _length_2 = labels.length;
      String _plus = ("lables.length (" + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + " does not match number of tables columns (");
      int _columns_1 = t.getColumns();
      String _plus_2 = (_plus_1 + Integer.valueOf(_columns_1));
      String _plus_3 = (_plus_2 + ")");
      throw new IllegalArgumentException(_plus_3);
    }
    final TableRow row = PubUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final String label : labels) {
      {
        final TableCell cell = PubUtil.PUB.createTableCell();
        row.getCells().add(cell);
        final UnformattedParagraph para = PubUtil.PUB.createUnformattedParagraph();
        cell.getContents().add(para);
        String _xifexpression = null;
        if ((label != null)) {
          _xifexpression = label;
        } else {
          _xifexpression = "";
        }
        para.setText(_xifexpression);
      }
    }
    return row;
  }
  
  public TableRow addRowWithReference(final Table t, final String[] labels, final Reference ref) {
    int _length = labels.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    int _length_1 = labels.length;
    int _columns = t.getColumns();
    int _minus = (_columns - 1);
    boolean _notEquals = (_length_1 != _minus);
    if (_notEquals) {
      int _length_2 = labels.length;
      String _plus = ("lables.length (" + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + " does not match number of tables columns (");
      int _columns_1 = t.getColumns();
      String _plus_2 = (_plus_1 + Integer.valueOf(_columns_1));
      String _plus_3 = (_plus_2 + ")");
      throw new IllegalArgumentException(_plus_3);
    }
    final TableRow row = PubUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final String label : labels) {
      {
        final TableCell cell = PubUtil.PUB.createTableCell();
        row.getCells().add(cell);
        final UnformattedParagraph para = PubUtil.PUB.createUnformattedParagraph();
        cell.getContents().add(para);
        String _xifexpression = null;
        if ((label != null)) {
          _xifexpression = label;
        } else {
          _xifexpression = "";
        }
        para.setText(_xifexpression);
      }
    }
    final TableCell cell = PubUtil.PUB.createTableCell();
    row.getCells().add(cell);
    final Paragraph para = PubUtil.PUB.createParagraph();
    cell.getContents().add(para);
    para.setText(PubUtil.BASE.createDRichText());
    para.getText().getSegments().add(ref);
    return row;
=======
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.pub.proto.ProtoAbbreviations;
import com.mimacom.ddd.pub.proto.ProtoAbstract;
import com.mimacom.ddd.pub.proto.ProtoAppendix;
import com.mimacom.ddd.pub.proto.ProtoBibliography;
import com.mimacom.ddd.pub.proto.ProtoChangeHistory;
import com.mimacom.ddd.pub.proto.ProtoChapter;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoEpilogue;
import com.mimacom.ddd.pub.proto.ProtoGlossary;
import com.mimacom.ddd.pub.proto.ProtoIndex;
import com.mimacom.ddd.pub.proto.ProtoListOfFigures;
import com.mimacom.ddd.pub.proto.ProtoListOfTables;
import com.mimacom.ddd.pub.proto.ProtoPart;
import com.mimacom.ddd.pub.proto.ProtoPreface;
import com.mimacom.ddd.pub.proto.ProtoPublicationBody;
import com.mimacom.ddd.pub.proto.ProtoSection;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.proto.ProtoSubsection;
import com.mimacom.ddd.pub.proto.ProtoSubsubsection;
import com.mimacom.ddd.pub.proto.ProtoTOC;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Abstract;
import com.mimacom.ddd.pub.pub.Appendix;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Epilogue;
import com.mimacom.ddd.pub.pub.Figure;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.Paragraph;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.Preface;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import com.mimacom.ddd.pub.pub.generator.PubElementNames;
import com.mimacom.ddd.pub.pub.impl.PublicationConstants;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PubUtil {
  @Inject
  @Extension
  private PubElementNames _pubElementNames;
  
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public boolean empty(final DRichText text) {
    return text.getSegments().isEmpty();
  }
  
  /**
   * Returns the prototype segment corresponding to the given segment.
   * 
   * @return null if no corresponding prototype segment was found, or the first one if several prototype segments match
   */
  public ProtoDocumentSegment prototype(final DocumentSegment segment) {
    Class<? extends ProtoDocumentSegment> _switchResult = null;
    boolean _matched = false;
    if (segment instanceof Abstract) {
      _matched=true;
      _switchResult = ProtoAbstract.class;
    }
    if (!_matched) {
      if (segment instanceof Preface) {
        _matched=true;
        _switchResult = ProtoPreface.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Epilogue) {
        _matched=true;
        _switchResult = ProtoEpilogue.class;
      }
    }
    if (!_matched) {
      if (segment instanceof PublicationBody) {
        _matched=true;
        _switchResult = ProtoPublicationBody.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ChangeHistory) {
        _matched=true;
        _switchResult = ProtoChangeHistory.class;
      }
    }
    if (!_matched) {
      if (segment instanceof TOC) {
        _matched=true;
        _switchResult = ProtoTOC.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Abbreviations) {
        _matched=true;
        _switchResult = ProtoAbbreviations.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ListOfTables) {
        _matched=true;
        _switchResult = ProtoListOfTables.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ListOfFigures) {
        _matched=true;
        _switchResult = ProtoListOfFigures.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Bibliography) {
        _matched=true;
        _switchResult = ProtoBibliography.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Glossary) {
        _matched=true;
        _switchResult = ProtoGlossary.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Index) {
        _matched=true;
        _switchResult = ProtoIndex.class;
      }
    }
    if (!_matched) {
      String _string = segment.getClass().toString();
      throw new IllegalArgumentException(_string);
    }
    final Class<? extends ProtoDocumentSegment> prototypeType = _switchResult;
    final PublicationClass pubClass = segment.getParent().getPublicationClass();
    final Iterable<? extends ProtoDocumentSegment> result = Iterables.filter(pubClass.getSegments(), prototypeType);
    boolean _isEmpty = IterableExtensions.isEmpty(result);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.head(result);
  }
  
  public ProtoDivision prototype(final Division div) {
    Class<? extends ProtoDivision> _switchResult = null;
    boolean _matched = false;
    if (div instanceof Appendix) {
      _matched=true;
      _switchResult = ProtoAppendix.class;
    }
    if (!_matched) {
      if (div instanceof Part) {
        _matched=true;
        _switchResult = ProtoPart.class;
      }
    }
    if (!_matched) {
      if (div instanceof Chapter) {
        _matched=true;
        _switchResult = ProtoChapter.class;
      }
    }
    if (!_matched) {
      if (div instanceof Section) {
        _matched=true;
        _switchResult = ProtoSection.class;
      }
    }
    if (!_matched) {
      if (div instanceof Subsection) {
        _matched=true;
        _switchResult = ProtoSubsection.class;
      }
    }
    if (!_matched) {
      if (div instanceof Subsubsection) {
        _matched=true;
        _switchResult = ProtoSubsubsection.class;
      }
    }
    if (!_matched) {
      String _string = div.getClass().toString();
      throw new IllegalArgumentException(_string);
    }
    final Class<? extends ProtoDivision> prototypeType = _switchResult;
    final PublicationClass pubClass = div.getDocument().getPublicationClass();
    final Iterable<? extends ProtoDivision> result = Iterables.filter(pubClass.getDivisions(), prototypeType);
    boolean _isEmpty = IterableExtensions.isEmpty(result);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.head(result);
  }
  
  public String labelAndNumber(final Division div) {
    String _switchResult = null;
    boolean _matched = false;
    if (div instanceof Part) {
      _matched=true;
      String _displayName = this._pubElementNames.displayName(div);
      String _plus = (_displayName + " ");
      String _formattedSingleNumber = this.formattedSingleNumber(div);
      _switchResult = (_plus + _formattedSingleNumber);
    }
    if (!_matched) {
      _switchResult = this.tieredNumber(div);
    }
    return _switchResult;
  }
  
  public String labelAndNumber(final TitledBlock b) {
    String _displayName = this._pubElementNames.displayName(b);
    String _plus = (_displayName + " ");
    String _tieredNumber = this.tieredNumber(b);
    return (_plus + _tieredNumber);
  }
  
  protected String _tieredNumber(final Division div) {
    if ((div instanceof Part)) {
      return this.formattedSingleNumber(div);
    } else {
      if ((div instanceof Chapter)) {
        String _formattedSingleNumber = this.formattedSingleNumber(div);
        return (_formattedSingleNumber + ".");
      }
    }
    final String parentNumber = this.tieredNumber(div.getParent());
    int _length = parentNumber.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      final String formatted = this.formattedSingleNumber(div);
      int _length_1 = formatted.length();
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        boolean _endsWith = parentNumber.endsWith(".");
        if (_endsWith) {
          String _formattedSingleNumber_1 = this.formattedSingleNumber(div);
          return (parentNumber + _formattedSingleNumber_1);
        } else {
          String _formattedSingleNumber_2 = this.formattedSingleNumber(div);
          return ((parentNumber + ".") + _formattedSingleNumber_2);
        }
      }
    }
    return "";
  }
  
  protected String _tieredNumber(final TitledBlock b) {
    EObject parent = b.eContainer();
    while (((parent != null) && (!(parent instanceof Chapter)))) {
      parent = parent.eContainer();
    }
    if ((parent instanceof Chapter)) {
      final String parentNumber = this.formattedSingleNumber(((Division)parent));
      int _length = parentNumber.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        int _sequenceNumberInChapter = b.getSequenceNumberInChapter();
        boolean _notEquals = (_sequenceNumberInChapter != 
          PublicationConstants.TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER_IN_CHAPTER);
        if (_notEquals) {
          int _sequenceNumberInChapter_1 = b.getSequenceNumberInChapter();
          int _plus = (_sequenceNumberInChapter_1 + 1);
          String _string = Integer.toString(_plus);
          return ((parentNumber + ".") + _string);
        }
      }
    }
    int _sequenceNumber = b.getSequenceNumber();
    boolean _notEquals_1 = (_sequenceNumber != PublicationConstants.TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER);
    if (_notEquals_1) {
      int _sequenceNumber_1 = b.getSequenceNumber();
      int _plus_1 = (_sequenceNumber_1 + 1);
      return Integer.toString(_plus_1);
    }
    return "";
  }
  
  protected String _tieredNumber(final NumberedElement e) {
    String _name = e.getClass().getName();
    String _plus = ("Unsupported object type: " + _name);
    throw new IllegalArgumentException(_plus);
  }
  
  public String formattedSingleNumber(final Division div) {
    final int seq = div.getSequenceNumber();
    if ((seq != (-1))) {
      final int start = this.startNumber(div);
      int _xifexpression = (int) 0;
      if ((start != (-1))) {
        _xifexpression = (seq + start);
      } else {
        _xifexpression = seq;
      }
      final int n = _xifexpression;
      final ProtoDivision prototype = this.prototype(div);
      ProtoSequenceNumberStyle _xifexpression_1 = null;
      if ((prototype != null)) {
        _xifexpression_1 = prototype.getNumberingStyle();
      } else {
        _xifexpression_1 = ProtoSequenceNumberStyle.ARABIC;
      }
      final ProtoSequenceNumberStyle numberingStyle = _xifexpression_1;
      final String formatted = this.formatNumbering(numberingStyle, n);
      return formatted;
    }
    return "";
  }
  
  public String formattedSingleNumber(final ListItem item) {
    int _sequenceNumber = item.getSequenceNumber();
    final int n = (_sequenceNumber + 1);
    final String formatted = this.formatNumbering(item.getList().getNumberingStyle(), n);
    return formatted;
  }
  
  protected String formatNumbering(final ProtoSequenceNumberStyle numberingStyle, final int n) {
    String _switchResult = null;
    if (numberingStyle != null) {
      switch (numberingStyle) {
        case ARABIC:
          _switchResult = Integer.valueOf(n).toString();
          break;
        case CAPITAL_LETTER:
          _switchResult = this.toLetter(n);
          break;
        case SMALL_LETTER:
          _switchResult = this.toLetter(n).toLowerCase();
          break;
        case CAPITAL_ROMAN:
          _switchResult = this.toRoman(n);
          break;
        case SMALL_ROMAN:
          _switchResult = this.toRoman(n).toLowerCase();
          break;
        case NONE:
          _switchResult = "";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected int startNumber(final Division div) {
    final EObject parent = div.eContainer();
    if ((parent instanceof PublicationBody)) {
      boolean _isEmpty = ((PublicationBody)parent).getDivisions().isEmpty();
      if (_isEmpty) {
        return (-1);
      }
      return IterableExtensions.<Division>head(((PublicationBody)parent).getDivisions()).getStartNumberingAt();
    } else {
      if ((parent instanceof Division)) {
        boolean _isEmpty_1 = ((Division)parent).getSubdivisions().isEmpty();
        if (_isEmpty_1) {
          return (-1);
        }
        return IterableExtensions.<Division>head(((Division)parent).getSubdivisions()).getStartNumberingAt();
      }
    }
    return (-1);
  }
  
  public String toRoman(final int value) {
    if ((value <= 0)) {
      return "--";
    }
    final StringBuilder b = new StringBuilder();
    final int x = (value % 100);
    final int _switchValue = (x / 10);
    switch (_switchValue) {
      case 1:
        b.append("X");
        break;
      case 2:
        b.append("XX");
        break;
      case 3:
        b.append("XXX");
        break;
      case 4:
        b.append("XL");
        break;
      case 5:
        b.append("L");
        break;
      case 6:
        b.append("LX");
        break;
      case 7:
        b.append("LXX");
        break;
      case 8:
        b.append("LXXX");
        break;
      case 9:
        b.append("XC");
        break;
      default:
        break;
    }
    final int _switchValue_1 = (x % 10);
    switch (_switchValue_1) {
      case 1:
        b.append("I");
        break;
      case 2:
        b.append("II");
        break;
      case 3:
        b.append("III");
        break;
      case 4:
        b.append("IL");
        break;
      case 5:
        b.append("V");
        break;
      case 6:
        b.append("VI");
        break;
      case 7:
        b.append("VII");
        break;
      case 8:
        b.append("VIII");
        break;
      case 9:
        b.append("IX");
        break;
      default:
        break;
    }
    return b.toString();
  }
  
  public String toLetter(final int value) {
    if ((value <= 0)) {
      return "--";
    }
    final StringBuilder b = new StringBuilder();
    final int LETTERS = 26;
    final char a = 'A';
    final int x = ((value - 1) % ((LETTERS + 1) * LETTERS));
    if ((x >= LETTERS)) {
      final int n = ((((int) a) + (x / LETTERS)) - 1);
      b.append(((char) n));
    }
    final int n_1 = (((int) a) + (x % LETTERS));
    b.append(((char) n_1));
    return b.toString();
  }
  
  public List<Division> gatherAllDivisionsInSequence(final Component compo) {
    final List<Division> acceptor = Lists.<Division>newArrayList();
    final Iterable<PublicationBody> bodySegment = Iterables.<PublicationBody>filter(compo.getSegments(), PublicationBody.class);
    boolean _isEmpty = IterableExtensions.isEmpty(bodySegment);
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Division> _divisions = IterableExtensions.<PublicationBody>head(bodySegment).getDivisions();
      for (final Division div : _divisions) {
        this.gatherAllDivisionsImpl(div, acceptor);
      }
    }
    return acceptor;
  }
  
  protected void gatherAllDivisionsImpl(final Division div, final List<Division> acceptor) {
    Division _include = div.getInclude();
    boolean _tripleNotEquals = (_include != null);
    if (_tripleNotEquals) {
      this.gatherAllDivisionsImpl(div.getInclude(), acceptor);
    } else {
      acceptor.add(div);
      EList<Division> _subdivisions = div.getSubdivisions();
      for (final Division subdiv : _subdivisions) {
        this.gatherAllDivisionsImpl(subdiv, acceptor);
      }
    }
  }
  
  public List<Table> gatherAllTablesInSequenceAndSetSequenceNumbers(final Component compo) {
    final List<Table> acceptor = Lists.<Table>newArrayList();
    this.<Table>gatherAllElementsInSequenceAndSetSequenceNumbers(compo, Table.class, acceptor);
    return acceptor;
  }
  
  public List<Figure> gatherAllFiguresInSequenceAndSetSequenceNumbers(final Component compo) {
    final List<Figure> acceptor = Lists.<Figure>newArrayList();
    this.<Figure>gatherAllElementsInSequenceAndSetSequenceNumbers(compo, Figure.class, acceptor);
    return acceptor;
  }
  
  protected <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(final Component compo, final Class<T> clazz, final List<T> acceptor) {
    final Iterable<PublicationBody> bodySegment = Iterables.<PublicationBody>filter(compo.getSegments(), PublicationBody.class);
    boolean _isEmpty = IterableExtensions.isEmpty(bodySegment);
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Division> _divisions = IterableExtensions.<PublicationBody>head(bodySegment).getDivisions();
      for (final Division div : _divisions) {
        this.<T>gatherAllElementsInSequenceAndSetSequenceNumbers(div, clazz, acceptor, null);
      }
    }
  }
  
  protected <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(final Division div, final Class<T> clazz, final List<T> globalAcceptor, final List<T> acceptorInChapter) {
    Division _include = div.getInclude();
    boolean _tripleNotEquals = (_include != null);
    if (_tripleNotEquals) {
      this.<T>gatherAllElementsInSequenceAndSetSequenceNumbers(div.getInclude(), clazz, globalAcceptor, acceptorInChapter);
    } else {
      List<T> _xifexpression = null;
      if ((div instanceof Chapter)) {
        _xifexpression = Lists.<T>newArrayList();
      } else {
        _xifexpression = acceptorInChapter;
      }
      final List<T> localAcceptor = _xifexpression;
      EList<ContentBlock> _contents = div.getContents();
      for (final ContentBlock block : _contents) {
        {
          final List<T> allInContents = EcoreUtil2.<T>eAllOfType(block, clazz);
          for (final T element : allInContents) {
            {
              element.setSequenceNumber(globalAcceptor.size());
              globalAcceptor.add(element);
              if ((localAcceptor != null)) {
                element.setSequenceNumberInChapter(localAcceptor.size());
                localAcceptor.add(element);
              }
            }
          }
        }
      }
      EList<Division> _subdivisions = div.getSubdivisions();
      for (final Division subdiv : _subdivisions) {
        this.<T>gatherAllElementsInSequenceAndSetSequenceNumbers(subdiv, clazz, globalAcceptor, localAcceptor);
      }
    }
  }
  
  public Table createTableWithHeader(final String[] labels) {
    int _length = labels.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    final Table t = PubUtil.PUB.createTable();
    t.setColumns(labels.length);
    final TableRow row = this.addSimpleRow(t, labels);
    row.setIsHeading(true);
    return t;
  }
  
  public TableRow addSimpleRow(final Table t, final String[] labels) {
    int _length = labels.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    int _length_1 = labels.length;
    int _columns = t.getColumns();
    boolean _notEquals = (_length_1 != _columns);
    if (_notEquals) {
      int _length_2 = labels.length;
      String _plus = ("lables.length (" + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + " does not match number of tables columns (");
      int _columns_1 = t.getColumns();
      String _plus_2 = (_plus_1 + Integer.valueOf(_columns_1));
      String _plus_3 = (_plus_2 + ")");
      throw new IllegalArgumentException(_plus_3);
    }
    final TableRow row = PubUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final String label : labels) {
      {
        final TableCell cell = PubUtil.PUB.createTableCell();
        row.getCells().add(cell);
        final UnformattedParagraph para = PubUtil.PUB.createUnformattedParagraph();
        cell.getContents().add(para);
        String _xifexpression = null;
        if ((label != null)) {
          _xifexpression = label;
        } else {
          _xifexpression = "";
        }
        para.setText(_xifexpression);
      }
    }
    return row;
  }
  
  public TableRow addRowWithReference(final Table t, final String[] labels, final Reference ref) {
    int _length = labels.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    int _length_1 = labels.length;
    int _columns = t.getColumns();
    int _minus = (_columns - 1);
    boolean _notEquals = (_length_1 != _minus);
    if (_notEquals) {
      int _length_2 = labels.length;
      String _plus = ("lables.length (" + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + " does not match number of tables columns (");
      int _columns_1 = t.getColumns();
      String _plus_2 = (_plus_1 + Integer.valueOf(_columns_1));
      String _plus_3 = (_plus_2 + ")");
      throw new IllegalArgumentException(_plus_3);
    }
    final TableRow row = PubUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final String label : labels) {
      {
        final TableCell cell = PubUtil.PUB.createTableCell();
        row.getCells().add(cell);
        final UnformattedParagraph para = PubUtil.PUB.createUnformattedParagraph();
        cell.getContents().add(para);
        String _xifexpression = null;
        if ((label != null)) {
          _xifexpression = label;
        } else {
          _xifexpression = "";
        }
        para.setText(_xifexpression);
      }
    }
    final TableCell cell = PubUtil.PUB.createTableCell();
    row.getCells().add(cell);
    final Paragraph para = PubUtil.PUB.createParagraph();
    cell.getContents().add(para);
    para.setText(PubUtil.BASE.createDRichText());
    para.getText().getSegments().add(ref);
    return row;
  }
  
  public String tieredNumber(final NumberedElement div) {
    if (div instanceof Division) {
      return _tieredNumber((Division)div);
    } else if (div instanceof TitledBlock) {
      return _tieredNumber((TitledBlock)div);
    } else if (div != null) {
      return _tieredNumber(div);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(div).toString());
    }
>>>>>>> refs/remotes/origin/master
  }
}
