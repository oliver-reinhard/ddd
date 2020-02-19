package com.mimacom.ddd.pub.pub.validation

import com.mimacom.ddd.pub.pub.PubPackage
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TableRow
import com.mimacom.ddd.pub.pub.TitledTable
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.ValidationMessageAcceptor

class PubTableValidator {

	static val PUB = PubPackage.eINSTANCE

	val ValidationMessageAcceptor acceptor

	new(ValidationMessageAcceptor acceptor) {
		this.acceptor = acceptor
	}

	def validate(Table t) {
		t.checkTableHasRows
		val int[] rowWidths = newIntArrayOfSize(t.rows.size)
		var i = 0
		for (row : t.rows) {
			row.checkTableRowHasCells
			row.checkCellSizes(rowWidths, i++)
		}
	}

	protected def checkTableHasRows(Table t) {
		if (t.columns <= 0) {
			error("Table must have 1 or more columns.", t, PUB.table_Columns, 0)
			return
		}
		if (t.rows.empty) {
			if (t.eContainer instanceof TitledTable) {
				warning("Table has no rows.", t.eContainer, PUB.titledBlock_Title, 0)
			} else {
				// this warning will be propagated to the table's container because a table doesn't have a name:
				warning("Table has no rows.", t, PUB.table_Rows, 0)
			}
		}
	}

	protected def checkTableRowHasCells(TableRow row) {
		if (row.cells.empty) {
			warning("Table row has no cells.", row, PUB.tableRow_Cells, -1)
		}
	}

	protected def checkCellSizes(TableRow row, int[] rowWidths, int index) {
		var error = false
		for (var i = 0; i < row.cells.length; i++) {
			val cell = row.cells.get(i)
			if (cell.width <= 0 || cell.height <= 0) {
				error("Cell height and width must be 1 or more.", row, PUB.tableRow_Cells, i)
				error = true
			}
			if (index + cell.height > rowWidths.length) {
				error("Cell height causes cell to exceeds the declared number of table rows.", row, PUB.tableRow_Cells,
					i)
				error = true
			}
		}
		if (error) {
			return
		}
		val tableWidth = row.table.columns
		for (var i = 0; i < row.cells.length; i++) {
			val cell = row.cells.get(i)
			// record the cell width in the rows that it spans:
			for (var j = index; j < index + cell.height; j++) {
				rowWidths.set(j, rowWidths.get(j) + cell.width)
			}
			if (rowWidths.get(index) > tableWidth) {
				error("Cell causes row width to exceed declared number of table columns.", row, PUB.tableRow_Cells, i)
				return
			}
		}
		if (rowWidths.get(index) < tableWidth) {
			error("The cells of this row span less than the declared number of table columns.", row, PUB.tableRow_Cells,
				row.cells.length - 1)
		}
	}

	protected def error(String msg, EObject obj, EStructuralFeature feature, int index) {
		acceptor.acceptError(msg, obj, feature, index, null)
	}

	protected def warning(String msg, EObject obj, EStructuralFeature feature, int index) {
		acceptor.acceptWarning(msg, obj, feature, index, null)
	}
}
