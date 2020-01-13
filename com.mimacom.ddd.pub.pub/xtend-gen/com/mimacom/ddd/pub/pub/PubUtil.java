package com.mimacom.ddd.pub.pub;

import com.google.common.collect.Iterables;
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
  }
}
