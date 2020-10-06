package com.mimacom.ddd.pub.pub

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BaseFactory
import com.mimacom.ddd.dm.base.base.DRichText
import com.mimacom.ddd.dm.base.richText.RichTextUtil

class PubTableUtil {

	@Inject extension RichTextUtil

	static val BASE = BaseFactory.eINSTANCE
	static val PUB = PubFactory.eINSTANCE

	public static val IGNORE_TABLE_CELL = "**IGNORE**"

	interface AddCell {
		def void addCell(TableRow row, Object text)
	}

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

	protected def TableRow addRowImpl(Table t, AddCell lambda, Object... cellTexts) {
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
			if (! IGNORE_TABLE_CELL.equals(text)) {
				lambda.addCell(row, text)
			}
		}
		return row
	}

	def TableRow addSimpleRow(Table t, String... cellTexts) {
		t.addRowImpl([row, text|row.addSimpleCell(text as String)], cellTexts)
	}

	def TableRow addStyledTextRow(Table t, String... styledCells) {
		t.addRowImpl([row, text|row.addStyledTextCell(text as String)], styledCells)
	}

	def TableRow addRichTextRow(Table t, DRichText[] cellTexts) {
		t.addRowImpl([row, text|row.addRichTextCell(text as DRichText)], cellTexts)
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
			if (! IGNORE_TABLE_CELL.equals(text)) {
				row.addSimpleCell(text)
			}
		}
		// Reference:
		addReference(row, lastColumn)
		return row
	}

	protected def TableRow addRowWithDescriptionImpl(Table t, AddCell lambda, String[] cellTexts, DRichText description,
		String... moreCells) {
		val len = cellTexts.length + moreCells.length
		if (len != t.columns - 1) {
			throw new IllegalArgumentException(
				"length (number of provided cells (" + (len + 1) + ") does not match number of tables columns (" +
					t.columns + ")")
		}
		val row = PUB.createTableRow
		t.rows.add(row)
		for (text : cellTexts) {
			if (! IGNORE_TABLE_CELL.equals(text)) {
				lambda.addCell(row, text)
			}
		}
		row.addRichTextCell(description)
		for (text : moreCells) {
			lambda.addCell(row, text)
		}
		return row
	}

	def TableRow addRowWithDescription(Table t, String[] cellTexts, DRichText description, String... moreCells) {
		t.addRowWithDescriptionImpl([row, text|row.addSimpleCell(text as String)], cellTexts, description, moreCells)
	}

	def TableRow addStyledTextRowWithDescription(Table t, String[] styledCells, DRichText description,
		String... moreFormattedCells) {
		t.addRowWithDescriptionImpl([row, text|row.addStyledTextCell(text as String)], styledCells, description, moreFormattedCells)
	}

	def TableCell addSimpleCell(TableRow row, String text) {
		val cell = PUB.createTableCell
		row.cells.add(cell)
		val para = PUB.createUnformattedParagraph
		cell.contents.add(para)
		para.text = if (text !== null) text else ""
		return cell
	}

	def TableCell addStyledTextCell(TableRow row, String styledText) {
		val cell = PUB.createTableCell
		row.cells.add(cell)
		val para = PUB.createRichTextParagraph
		cell.contents.add(para)
		para.text = BASE.createDRichText
		val textSegment = BASE.createDTextSegment
		textSegment.value = if (styledText !== null) styledText else ""
		para.text.segments.add(textSegment)
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
		if (isEmpty(text)) {
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
