package com.mimacom.ddd.pub.pub

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BaseFactory
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.dmx.RichTextUtil

class PubTableUtil {

	@Inject extension RichTextUtil

	static val BASE = BaseFactory.eINSTANCE
	static val PUB = PubFactory.eINSTANCE

	def Table createTableWithHeader(String... columnTitles) {
		if (columnTitles.length == 0) {
			throw new IllegalArgumentException("lables.length = 0")
		}
		val Table t = PUB.createTable
		t.columns = columnTitles.length
		val row = t.addSimpleRow(columnTitles)
		row.isHeading = true
		return t
	}

	def TableRow addSimpleRow(Table t, String... cellTexts) {
		if (cellTexts.length == 0) {
			throw new IllegalArgumentException("cellTexts.length = 0")
		}
		if (cellTexts.length != t.columns) {
			throw new IllegalArgumentException(
				"cellTexts.length (" + cellTexts.length + " does not match number of tables columns (" + t.columns +
					")")
		}
		val row = PUB.createTableRow
		t.rows.add(row)
		for (text : cellTexts) {
			row.addSimpleCell(text)
		}
		return row
	}

	def TableRow addRowWithReference(Table t, String[] cellTexts, Reference lastColumn) {
		if (cellTexts.length == 0) {
			throw new IllegalArgumentException("cellTexts.length = 0")
		}
		if (cellTexts.length != t.columns - 1) {
			throw new IllegalArgumentException(
				"cellTexts.length (" + cellTexts.length + " does not match number of tables columns (" +
					(t.columns - 1) + ")")
		}
		val row = PUB.createTableRow
		t.rows.add(row)
		for (text : cellTexts) {
			row.addSimpleCell(text)
		}
		// Reference:
		addReference(row, lastColumn)
		return row
	}

	def TableRow addDescriptionRow(Table t, String[] cellTexts, DRichText description, String... moreCells) {
		val len = cellTexts.length + moreCells.length
		if (len != t.columns - 1) {
			throw new IllegalArgumentException(
				"length (number of provided cells (" + (len + 1) + ") does not match number of tables columns (" +
					t.columns + ")")
		}
		val row = PUB.createTableRow
		t.rows.add(row)
		for (text : cellTexts) {
			row.addSimpleCell(text)
		}
		row.addRichTextCell(description)
		for (text : moreCells) {
			row.addSimpleCell(text)
		}
		return row
	}

	def TableCell addSimpleCell(TableRow row, String text) {
		val cell = PUB.createTableCell
		row.cells.add(cell)
		val para = PUB.createUnformattedParagraph
		cell.contents.add(para)
		para.text = if (text !== null) text else ""
		return cell
	}

	/**
	 * Adds a new cell to the given {@link TableRow}.<p>
	 * Depending on whether the {@link DRichText} element has an {@code eContainer}, 
	 * a {@link RichTextReferencingParagraph} with a reference (instead of a containment) is created
	 * in order to avoid the problems related to assigning a new {@code eContainer} and thus removing
	 * the element from its old {@code eContainer}.
	 */
	def TableCell addRichTextCell(TableRow row, DRichText text) {
		if (empty(text)) {
			return row.addSimpleCell("")
		}
		val cell = PUB.createTableCell
		row.cells.add(cell)
		if (text.eContainer === null) {
			val para = PUB.createRichTextParagraph
			cell.contents.add(para)
			para.text = text // containment
		} else {
			val para = PUB.createRichTextReferencingParagraph
			cell.contents.add(para)
			para.text = text // reference
		}
		return cell
	}

	def TableCell addReference(TableRow row, Reference ref) {
		val cell = PUB.createTableCell
		row.cells.add(cell)
		val para = PUB.createRichTextParagraph
		cell.contents.add(para)
		para.text = BASE.createDRichText
		para.text.segments.add(ref)
		return cell
	}
}
