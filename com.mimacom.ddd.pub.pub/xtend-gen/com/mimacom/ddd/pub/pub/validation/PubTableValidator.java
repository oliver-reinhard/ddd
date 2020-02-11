package com.mimacom.ddd.pub.pub.validation;

import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.TitledTable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class PubTableValidator {
  private static final PubPackage PUB = PubPackage.eINSTANCE;
  
  private final ValidationMessageAcceptor acceptor;
  
  public PubTableValidator(final ValidationMessageAcceptor acceptor) {
    this.acceptor = acceptor;
  }
  
  public void validate(final Table t) {
    this.checkTableHasRows(t);
    EList<TableRow> _rows = t.getRows();
    for (final TableRow row : _rows) {
      {
        this.checkTableRowHasCells(row);
        this.checkCellSizes(row);
      }
    }
  }
  
  protected void checkTableHasRows(final Table t) {
    int _columns = t.getColumns();
    boolean _lessEqualsThan = (_columns <= 0);
    if (_lessEqualsThan) {
      this.error("Table must have 1 or more columns.", t, PubTableValidator.PUB.getTable_Columns(), 0);
      return;
    }
    boolean _isEmpty = t.getRows().isEmpty();
    if (_isEmpty) {
      EObject _eContainer = t.eContainer();
      if ((_eContainer instanceof TitledTable)) {
        this.warning("Table has no rows.", t.eContainer(), PubTableValidator.PUB.getTitledBlock_Title(), 0);
      } else {
        this.warning("Table has no rows.", t, PubTableValidator.PUB.getTable_Rows(), 0);
      }
    }
  }
  
  protected void checkTableRowHasCells(final TableRow row) {
    boolean _isEmpty = row.getCells().isEmpty();
    if (_isEmpty) {
      this.warning("Table row has no cells.", row, PubTableValidator.PUB.getTableRow_Cells(), (-1));
    }
  }
  
  protected void checkCellSizes(final TableRow row) {
    int _height = row.getHeight();
    boolean _lessEqualsThan = (_height <= 0);
    if (_lessEqualsThan) {
      this.error("Row height must be 1 or more.", row, PubTableValidator.PUB.getTableRow_Height(), 0);
      return;
    }
    boolean error = false;
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length); i++) {
      {
        final TableCell cell = row.getCells().get(i);
        if (((cell.getWidth() <= 0) || (cell.getHeight() <= 0))) {
          this.error("Cell height and width must be 1 or more.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
          error = true;
        }
        int _height_1 = cell.getHeight();
        int _height_2 = row.getHeight();
        boolean _greaterThan = (_height_1 > _height_2);
        if (_greaterThan) {
          this.error("Cell height exceeds row height.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
          error = true;
        }
      }
    }
    if (error) {
      return;
    }
    final int tableWidth = row.getTable().getColumns();
    int width = 0;
    int height = 0;
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length); i++) {
      {
        final TableCell cell = row.getCells().get(i);
        if ((height == 0)) {
          int _width = cell.getWidth();
          int _plus = (width + _width);
          width = _plus;
          if ((width > tableWidth)) {
            this.error("Cell causes row width to exceed declared number of table columns.", row, 
              PubTableValidator.PUB.getTableRow_Cells(), i);
            error = true;
          }
        } else {
          if ((i > 0)) {
            final TableCell prevCell = row.getCells().get((i - 1));
            int _width_1 = cell.getWidth();
            int _width_2 = prevCell.getWidth();
            boolean _notEquals = (_width_1 != _width_2);
            if (_notEquals) {
              this.error("Cell width does not match width of cell above.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
              error = true;
            }
          }
        }
        int _height_1 = cell.getHeight();
        int _plus_1 = (height + _height_1);
        height = _plus_1;
        int _height_2 = row.getHeight();
        boolean _greaterThan = (height > _height_2);
        if (_greaterThan) {
          this.error("Cell causes row height to exceed declared row height.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
          error = true;
        } else {
          int _height_3 = row.getHeight();
          boolean _equals = (height == _height_3);
          if (_equals) {
            height = 0;
          }
        }
        if (error) {
          return;
        }
      }
    }
    if ((width < tableWidth)) {
      EReference _tableRow_Cells = PubTableValidator.PUB.getTableRow_Cells();
      int _length = ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length;
      int _minus = (_length - 1);
      this.error("The cells of this row span less than the declared number of table columns.", row, _tableRow_Cells, _minus);
    }
    if (((height > 0) && (height < row.getHeight()))) {
      EReference _tableRow_Cells_1 = PubTableValidator.PUB.getTableRow_Cells();
      int _length_1 = ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length;
      int _minus_1 = (_length_1 - 1);
      this.error("The cells of this row span less than the declared row height.", row, _tableRow_Cells_1, _minus_1);
    }
  }
  
  protected void error(final String msg, final EObject obj, final EStructuralFeature feature, final int index) {
    this.acceptor.acceptError(msg, obj, feature, index, null);
  }
  
  protected void warning(final String msg, final EObject obj, final EStructuralFeature feature, final int index) {
    this.acceptor.acceptWarning(msg, obj, feature, index, null);
  }
}
