package com.mimacom.ddd.pub.pub;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.BaseFactory;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DTextSegment;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.RichTextParagraph;
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubTableUtil {
  public interface AddCell {
    public abstract void addCell(final TableRow row, final Object text);
  }
  
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public static final String IGNORE_TABLE_CELL = "**IGNORE**";
  
  public Table createTableWithHeader(final String... columnTitles) {
    int _length = columnTitles.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("lables.length = 0");
    }
    final Table t = PubTableUtil.PUB.createTable();
    t.setColumns(columnTitles.length);
    final TableRow row = this.addPlainTextRow(t, columnTitles);
    row.setIsHeading(true);
    return t;
  }
  
  protected TableRow addRowImpl(final Table t, final PubTableUtil.AddCell lambda, final Object... cellTexts) {
    int _length = cellTexts.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("cellTexts.length = 0");
    }
    int _length_1 = cellTexts.length;
    int _columns = t.getColumns();
    boolean _notEquals = (_length_1 != _columns);
    if (_notEquals) {
      int _length_2 = cellTexts.length;
      String _plus = ("cellTexts.length (" + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + " does not match number of tables columns (");
      int _columns_1 = t.getColumns();
      String _plus_2 = (_plus_1 + Integer.valueOf(_columns_1));
      String _plus_3 = (_plus_2 + 
        ")");
      throw new IllegalArgumentException(_plus_3);
    }
    final TableRow row = PubTableUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final Object text : cellTexts) {
      boolean _equals_1 = PubTableUtil.IGNORE_TABLE_CELL.equals(text);
      boolean _not = (!_equals_1);
      if (_not) {
        lambda.addCell(row, text);
      }
    }
    return row;
  }
  
  public TableRow addPlainTextRow(final Table t, final String... cellTexts) {
    final PubTableUtil.AddCell _function = (TableRow row, Object text) -> {
      this.addPlainTextCell(row, ((String) text));
    };
    return this.addRowImpl(t, _function, cellTexts);
  }
  
  public TableRow addStyledTextRow(final Table t, final String... styledCellTexts) {
    final PubTableUtil.AddCell _function = (TableRow row, Object text) -> {
      this.addStyledTextCell(row, ((String) text));
    };
    return this.addRowImpl(t, _function, styledCellTexts);
  }
  
  public TableRow addRichTextRow(final Table t, final DRichText[] cellTexts) {
    final PubTableUtil.AddCell _function = (TableRow row, Object text) -> {
      this.addRichTextCell(row, ((DRichText) text));
    };
    return this.addRowImpl(t, _function, cellTexts);
  }
  
  public TableRow addRowWithReference(final Table t, final String[] cellTexts, final Reference lastColumn) {
    int _length = cellTexts.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      throw new IllegalArgumentException("cellTexts.length = 0");
    }
    int _length_1 = cellTexts.length;
    int _columns = t.getColumns();
    int _minus = (_columns - 1);
    boolean _notEquals = (_length_1 != _minus);
    if (_notEquals) {
      int _length_2 = cellTexts.length;
      String _plus = ("cellTexts.length (" + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + " does not match number of tables columns (");
      int _columns_1 = t.getColumns();
      int _minus_1 = (_columns_1 - 1);
      String _plus_2 = (_plus_1 + Integer.valueOf(_minus_1));
      String _plus_3 = (_plus_2 + ")");
      throw new IllegalArgumentException(_plus_3);
    }
    final TableRow row = PubTableUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final String text : cellTexts) {
      boolean _equals_1 = PubTableUtil.IGNORE_TABLE_CELL.equals(text);
      boolean _not = (!_equals_1);
      if (_not) {
        this.addPlainTextCell(row, text);
      }
    }
    this.addReference(row, lastColumn);
    return row;
  }
  
  protected TableRow addRowWithDescriptionImpl(final Table t, final PubTableUtil.AddCell lambda, final String[] cellTexts, final DRichText description, final String... moreCells) {
    int _length = cellTexts.length;
    int _length_1 = moreCells.length;
    final int len = (_length + _length_1);
    int _columns = t.getColumns();
    int _minus = (_columns - 1);
    boolean _notEquals = (len != _minus);
    if (_notEquals) {
      int _columns_1 = t.getColumns();
      String _plus = ((("length (number of provided cells (" + Integer.valueOf((len + 1))) + ") does not match number of tables columns (") + Integer.valueOf(_columns_1));
      String _plus_1 = (_plus + ")");
      throw new IllegalArgumentException(_plus_1);
    }
    final TableRow row = PubTableUtil.PUB.createTableRow();
    t.getRows().add(row);
    for (final String text : cellTexts) {
      boolean _equals = PubTableUtil.IGNORE_TABLE_CELL.equals(text);
      boolean _not = (!_equals);
      if (_not) {
        lambda.addCell(row, text);
      }
    }
    this.addRichTextCell(row, description);
    for (final String text_1 : moreCells) {
      lambda.addCell(row, text_1);
    }
    return row;
  }
  
  public TableRow addRowWithDescription(final Table t, final String[] cellTexts, final DRichText description, final String... moreCells) {
    final PubTableUtil.AddCell _function = (TableRow row, Object text) -> {
      this.addPlainTextCell(row, ((String) text));
    };
    return this.addRowWithDescriptionImpl(t, _function, cellTexts, description, moreCells);
  }
  
  public TableRow addStyledTextRowWithDescription(final Table t, final String[] styledCellTexts, final DRichText description, final String... moreFormattedCells) {
    final PubTableUtil.AddCell _function = (TableRow row, Object text) -> {
      this.addStyledTextCell(row, ((String) text));
    };
    return this.addRowWithDescriptionImpl(t, _function, styledCellTexts, description, moreFormattedCells);
  }
  
  public TableCell addPlainTextCell(final TableRow row, final String text) {
    final TableCell cell = PubTableUtil.PUB.createTableCell();
    row.getCells().add(cell);
    final UnformattedParagraph para = PubTableUtil.PUB.createUnformattedParagraph();
    cell.getContents().add(para);
    String _xifexpression = null;
    if ((text != null)) {
      _xifexpression = text;
    } else {
      _xifexpression = "";
    }
    para.setText(_xifexpression);
    return cell;
  }
  
  public TableCell addStyledTextCell(final TableRow row, final String styledText) {
    final TableCell cell = PubTableUtil.PUB.createTableCell();
    row.getCells().add(cell);
    final RichTextParagraph para = PubTableUtil.PUB.createRichTextParagraph();
    cell.getContents().add(para);
    para.setText(PubTableUtil.BASE.createDRichText());
    final DTextSegment textSegment = PubTableUtil.BASE.createDTextSegment();
    String _xifexpression = null;
    if ((styledText != null)) {
      _xifexpression = styledText;
    } else {
      _xifexpression = "";
    }
    textSegment.setValue(_xifexpression);
    para.getText().getSegments().add(textSegment);
    return cell;
  }
  
  /**
   * Adds a new cell to the given {@link TableRow}.<p>
   * Depending on whether the {@link DRichText} element has an {@code eContainer},
   * a {@link RichTextReferencingParagraph} with a reference (instead of a containment) is created
   * in order to avoid the problems related to assigning a new {@code eContainer} and thus removing
   * the element from its old {@code eContainer}.
   */
  public TableCell addRichTextCell(final TableRow row, final DRichText text) {
    boolean _isEmpty = this._richTextUtil.isEmpty(text);
    if (_isEmpty) {
      return this.addPlainTextCell(row, "");
    }
    final TableCell cell = PubTableUtil.PUB.createTableCell();
    row.getCells().add(cell);
    EObject _eContainer = text.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      final RichTextParagraph para = PubTableUtil.PUB.createRichTextParagraph();
      cell.getContents().add(para);
      para.setText(text);
    } else {
      final RichTextReferencingParagraph para_1 = PubTableUtil.PUB.createRichTextReferencingParagraph();
      cell.getContents().add(para_1);
      para_1.setText(text);
    }
    return cell;
  }
  
  public TableCell addReference(final TableRow row, final Reference ref) {
    final TableCell cell = PubTableUtil.PUB.createTableCell();
    row.getCells().add(cell);
    final RichTextParagraph para = PubTableUtil.PUB.createRichTextParagraph();
    cell.getContents().add(para);
    para.setText(PubTableUtil.BASE.createDRichText());
    para.getText().getSegments().add(ref);
    return cell;
  }
}
