package com.mimacom.ddd.pub.pub.generator;

import com.google.common.base.Objects;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.GridLines;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.generator.NestedContentBlockGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * PREQUISITE: this class requires <code>\\usepackage{multirow}</code> (with single backslash (thanks, unicode …)) in the LaTeX preamble.
 * 
 * See https://en.wikibooks.org/wiki/LaTeX/Tables for an excellent tutorial on multirow.
 */
@SuppressWarnings("all")
public class PubLaTeXTableGenerator {
  private static final String SENTINEL_STRING = "SENTINEL";
  
  private static final String H_ALIGN = "l";
  
  private final Table table;
  
  private final String BAR;
  
  private final NestedContentBlockGenerator nestedContentBlockGenereator;
  
  private final int rows;
  
  private final String[][] cellContentsByRow;
  
  private final boolean drawHorizontalGridlines;
  
  private boolean[][] horizontalGridlines;
  
  public PubLaTeXTableGenerator(final Table t, final NestedContentBlockGenerator g) {
    this.table = t;
    this.rows = this.table.getRows().size();
    this.BAR = this.verticalGridline(this.table);
    this.nestedContentBlockGenereator = g;
    this.cellContentsByRow = new String[this.rows][this.table.getColumns()];
    this.drawHorizontalGridlines = (Objects.equal(t.getGridlines(), GridLines.HORIZONTAL) || Objects.equal(t.getGridlines(), GridLines.BOTH));
    boolean[][] _xifexpression = null;
    if (this.drawHorizontalGridlines) {
      _xifexpression = new boolean[this.rows][t.getColumns()];
    } else {
      _xifexpression = null;
    }
    this.horizontalGridlines = _xifexpression;
  }
  
  public CharSequence render() {
    CharSequence _xblockexpression = null;
    {
      this.buildGeneratorModel();
      int rowIndex = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\begin{tabular} { ");
      String _columnFormat = this.columnFormat(this.table);
      _builder.append(_columnFormat);
      _builder.append(" }");
      _builder.append("\t\t\t");
      _builder.newLineIfNotEmpty();
      {
        if (this.drawHorizontalGridlines) {
          _builder.append("\\hline");
        }
      }
      _builder.newLineIfNotEmpty();
      {
        for(final String[] row : this.cellContentsByRow) {
          {
            for(final String cell : row) {
              {
                if ((cell != PubLaTeXTableGenerator.SENTINEL_STRING)) {
                  {
                    Object _head = IterableExtensions.<Object>head(((Iterable<Object>)Conversions.doWrapArray(row)));
                    boolean _tripleNotEquals = (cell != _head);
                    if (_tripleNotEquals) {
                      _builder.append(" & ");
                    }
                  }
                  _builder.append(cell);
                }
              }
            }
          }
          _builder.append(" \\\\");
          {
            if (this.drawHorizontalGridlines) {
              _builder.append(" ");
              int _plusPlus = rowIndex++;
              String _horizontalGridline = this.horizontalGridline(this.horizontalGridlines[_plusPlus]);
              _builder.append(_horizontalGridline);
            }
          }
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\\end{tabular}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected void buildGeneratorModel() {
    for (int r = 0; (r < this.rows); r++) {
      {
        final TableRow row = this.table.getRows().get(r);
        int columnIndex = 0;
        while (((this.cellContentsByRow[r])[columnIndex] != null)) {
          columnIndex++;
        }
        for (int c = 0; (c < row.getCells().size()); c++) {
          {
            final TableCell cell = row.getCells().get(c);
            if (((cell.getWidth() == 1) && (cell.getHeight() == 1))) {
              (this.cellContentsByRow[r])[columnIndex] = this.renderCell(cell);
              if (this.drawHorizontalGridlines) {
                (this.horizontalGridlines[r])[columnIndex] = true;
              }
              columnIndex++;
            } else {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\\multicolumn{");
              int _width = cell.getWidth();
              _builder.append(_width);
              _builder.append("} {");
              _builder.append(this.BAR);
              _builder.append(PubLaTeXTableGenerator.H_ALIGN);
              _builder.append(this.BAR);
              _builder.append("} {\\multirow{");
              int _height = cell.getHeight();
              _builder.append(_height);
              _builder.append("}{*}{");
              String _renderCell = this.renderCell(cell);
              _builder.append(_renderCell);
              _builder.append("}}");
              final String multirowFirst = _builder.toString();
              (this.cellContentsByRow[r])[columnIndex] = multirowFirst;
              for (int i = (columnIndex + 1); (i < (columnIndex + cell.getWidth())); i++) {
                (this.cellContentsByRow[r])[i] = PubLaTeXTableGenerator.SENTINEL_STRING;
              }
              for (int j = (r + 1); (j < (r + cell.getHeight())); j++) {
                {
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("\\multicolumn{");
                  int _width_1 = cell.getWidth();
                  _builder_1.append(_width_1);
                  _builder_1.append("} {");
                  _builder_1.append(this.BAR);
                  _builder_1.append(PubLaTeXTableGenerator.H_ALIGN);
                  _builder_1.append(this.BAR);
                  _builder_1.append("} {}");
                  final String multirowOther = _builder_1.toString();
                  (this.cellContentsByRow[j])[columnIndex] = multirowOther;
                  for (int i = (columnIndex + 1); (i < (columnIndex + cell.getWidth())); i++) {
                    (this.cellContentsByRow[j])[i] = PubLaTeXTableGenerator.SENTINEL_STRING;
                  }
                }
              }
              if (this.drawHorizontalGridlines) {
                for (int i = columnIndex; (i < (columnIndex + cell.getWidth())); i++) {
                  int _height_1 = cell.getHeight();
                  int _plus = (r + _height_1);
                  int _minus = (_plus - 1);
                  (this.horizontalGridlines[_minus])[i] = true;
                }
              }
              int _columnIndex = columnIndex;
              int _width_1 = cell.getWidth();
              columnIndex = (_columnIndex + _width_1);
            }
          }
        }
      }
    }
  }
  
  protected String renderCell(final TableCell cell) {
    final StringBuilder b = new StringBuilder();
    int _size = cell.getContents().size();
    boolean hasLineBreaks = (_size > 1);
    EList<ContentBlock> _contents = cell.getContents();
    for (final ContentBlock block : _contents) {
      {
        CharSequence _generate = this.nestedContentBlockGenereator.generate(block);
        final String renderedBlock = ((String) _generate).replaceAll("[ \t\n\f\r]+", " ");
        hasLineBreaks = (hasLineBreaks || renderedBlock.contains("\\\\"));
        b.append(renderedBlock);
      }
    }
    String result = b.toString();
    if (hasLineBreaks) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\parbox{\\textwidth}{\\smallskip{}");
      _builder.append(result);
      _builder.append("\\smallskip{}}");
      result = _builder.toString();
    }
    boolean _isIsHeading = cell.getRow().isIsHeading();
    if (_isIsHeading) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\\textbf{");
      _builder_1.append(result);
      _builder_1.append("}");
      result = _builder_1.toString();
    }
    return result;
  }
  
  protected String columnFormat(final Table t) {
    String _xblockexpression = null;
    {
      final String BAR = this.verticalGridline(this.table);
      final StringBuilder b = new StringBuilder();
      b.append(BAR);
      for (int i = 0; (i < t.getColumns()); i++) {
        {
          b.append(PubLaTeXTableGenerator.H_ALIGN);
          b.append(BAR);
        }
      }
      _xblockexpression = b.toString();
    }
    return _xblockexpression;
  }
  
  protected String verticalGridline(final Table t) {
    String _xifexpression = null;
    if ((Objects.equal(t.getGridlines(), GridLines.VERTICAL) || Objects.equal(t.getGridlines(), GridLines.BOTH))) {
      _xifexpression = "|";
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected String horizontalGridline(final boolean[] gridlines) {
    boolean drawHline = true;
    for (int i = 0; (i < gridlines.length); i++) {
      drawHline = (drawHline && gridlines[i]);
    }
    if (drawHline) {
      return "\\hline";
    }
    final StringBuilder b = new StringBuilder();
    int start = 0;
    while ((start < gridlines.length)) {
      {
        while (((start < gridlines.length) && (!gridlines[start]))) {
          start++;
        }
        int _length = gridlines.length;
        boolean _lessThan = (start < _length);
        if (_lessThan) {
          int end = start;
          while (((end < gridlines.length) && gridlines[end])) {
            end++;
          }
          if ((start < end)) {
            b.append("\\cline{");
            b.append((start + 1));
            b.append("-");
            b.append(end);
            b.append("} ");
          }
          start = end;
        }
      }
    }
    return b.toString();
  }
}
