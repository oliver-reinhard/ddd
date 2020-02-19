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
    final int[] rowWidths = new int[t.getRows().size()];
    int i = 0;
    EList<TableRow> _rows = t.getRows();
    for (final TableRow row : _rows) {
      {
        this.checkTableRowHasCells(row);
        int _plusPlus = i++;
        this.checkCellSizes(row, rowWidths, _plusPlus);
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
  
  protected void checkCellSizes(final TableRow row, final int[] rowWidths, final int index) {
    boolean error = false;
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length); i++) {
      {
        final TableCell cell = row.getCells().get(i);
        if (((cell.getWidth() <= 0) || (cell.getHeight() <= 0))) {
          this.error("Cell height and width must be 1 or more.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
          error = true;
        }
        int _height = cell.getHeight();
        int _plus = (index + _height);
        int _length = rowWidths.length;
        boolean _greaterThan = (_plus > _length);
        if (_greaterThan) {
          this.error("Cell height causes cell to exceeds the declared number of table rows.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
          error = true;
        }
      }
    }
    if (error) {
      return;
    }
    final int tableWidth = row.getTable().getColumns();
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length); i++) {
      {
        final TableCell cell = row.getCells().get(i);
        for (int j = index; (j < (index + cell.getHeight())); j++) {
          int _get = rowWidths[j];
          int _width = cell.getWidth();
          int _plus = (_get + _width);
          rowWidths[j] = _plus;
        }
        int _get = rowWidths[index];
        boolean _greaterThan = (_get > tableWidth);
        if (_greaterThan) {
          this.error("Cell causes row width to exceed declared number of table columns.", row, PubTableValidator.PUB.getTableRow_Cells(), i);
          return;
        }
      }
    }
    int _get = rowWidths[index];
    boolean _lessThan = (_get < tableWidth);
    if (_lessThan) {
      EReference _tableRow_Cells = PubTableValidator.PUB.getTableRow_Cells();
      int _length = ((Object[])Conversions.unwrapArray(row.getCells(), Object.class)).length;
      int _minus = (_length - 1);
      this.error("The cells of this row span less than the declared number of table columns.", row, _tableRow_Cells, _minus);
    }
  }
  
  protected void error(final String msg, final EObject obj, final EStructuralFeature feature, final int index) {
    this.acceptor.acceptError(msg, obj, feature, index, null);
  }
  
  protected void warning(final String msg, final EObject obj, final EStructuralFeature feature, final int index) {
    this.acceptor.acceptWarning(msg, obj, feature, index, null);
  }
}
