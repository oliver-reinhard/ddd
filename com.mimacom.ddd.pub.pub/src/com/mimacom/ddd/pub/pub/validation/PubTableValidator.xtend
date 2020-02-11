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
		for (row : t.rows) {
			row.checkTableRowHasCells
			row.checkCellSizes
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

	protected def checkCellSizes(TableRow row) {
		if (row.height <= 0) {
			error("Row height must be 1 or more.", row, PUB.tableRow_Height, 0)
			return
		}
		var error = false
		for (var i = 0; i < row.cells.length; i++) {
			val cell = row.cells.get(i)
			if (cell.width <= 0 || cell.height <= 0) {
				error("Cell height and width must be 1 or more.", row, PUB.tableRow_Cells, i)
				error = true
			}
			if (cell.height > row.height) {
				error("Cell height exceeds row height.", row, PUB.tableRow_Cells, i)
				error = true
			}
		}
		if (error) {
			return
		}
		val tableWidth = row.table.columns
		var width = 0
		var height = 0
		for (var i = 0; i < row.cells.length; i++) {
			val cell = row.cells.get(i)
			if (height == 0) {
				// this is a cell in the top line of the row
				width = width + cell.width
				if (width > tableWidth) {
					error("Cell causes row width to exceed declared number of table columns.", row,
						PUB.tableRow_Cells, i)
					error = true
				}
			} else if (i > 0) {
				val prevCell = row.cells.get(i - 1)
				if (cell.width != prevCell.width) {
					error("Cell width does not match width of cell above.", row, PUB.tableRow_Cells, i)
					error = true
				}
			}
			height = height + cell.height
			if (height > row.height) {
				error("Cell causes row height to exceed declared row height.", row, PUB.tableRow_Cells,
					i)
				error = true
			} else if (height == row.height) {
				height = 0
			}
			if (error) {
				return
			}
		}
		if (width < tableWidth) {
			error("The cells of this row span less than the declared number of table columns.", row,
				PUB.tableRow_Cells, row.cells.length - 1)
		}
		if (height > 0 && height < row.height) {
			error("The cells of this row span less than the declared row height.", row,
				PUB.tableRow_Cells, row.cells.length - 1)
		}
	}
	
	protected def error(String msg, EObject obj, EStructuralFeature feature, int index) {
		acceptor.acceptError(msg, obj, feature, index, null)
	}
	
	protected def warning(String msg, EObject obj, EStructuralFeature feature, int index) {
		acceptor.acceptWarning(msg, obj, feature, index, null)
	}
}
