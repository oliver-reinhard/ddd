package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TableCell

import static com.mimacom.ddd.pub.pub.GridLines.*

/*
 * PREQUISITE: this class requires <code>\\usepackage{multirow}</code> (with single backslash (thanks, unicode …)) in the LaTeX preamble.
 * 
 * See https://en.wikibooks.org/wiki/LaTeX/Tables for an excellent tutorial on multirow.
 */
class PubLaTeXTableGenerator {

	static val SENTINEL_STRING = "SENTINEL"
	static val H_ALIGN = 'l' // left

	val Table table
	val String BAR
	val NestedContentBlockGenerator nestedContentBlockGenereator
	val int rows
	val String[][] cellContentsByRow
	val boolean drawHorizontalGridlines
	var boolean[][] horizontalGridlines

	new(Table t, NestedContentBlockGenerator g) {
		table = t
		rows = table.rows.size
		BAR = table.verticalGridline
		nestedContentBlockGenereator = g
		cellContentsByRow = newArrayOfSize(rows, table.columns)
		drawHorizontalGridlines = t.gridlines == HORIZONTAL || t.gridlines == BOTH
		horizontalGridlines = drawHorizontalGridlines ? newBooleanArrayOfSize(rows, t.columns) : null
	}

	def CharSequence render() {
		buildGeneratorModel()
		var rowIndex = 0
		'''
			\begin{tabular} { «table.columnFormat» }««« % width: «t.widthPercent»%"
			
			«IF drawHorizontalGridlines»\hline«ENDIF»
			«FOR row : cellContentsByRow»
				«FOR cell : row»«IF cell !== SENTINEL_STRING»«IF cell !== row.head» & «ENDIF»«cell»«ENDIF»«ENDFOR» \\«IF drawHorizontalGridlines» «horizontalGridlines.get(rowIndex++).horizontalGridline()»«ENDIF»
				«ENDFOR»
			\end{tabular}
		'''
	}

	protected def void buildGeneratorModel() {
		for (var r = 0; r < rows; r++) {
			val row = table.rows.get(r)

			// find first output cell that has no content yet:
			var columnIndex = 0
			while (cellContentsByRow.get(r).get(columnIndex) !== null) {
				columnIndex++
			}

			for (var c = 0; c < row.cells.size; c++) {
				val cell = row.cells.get(c)

				if (cell.width == 1 && cell.height == 1) {
					// now row span or column span
					cellContentsByRow.get(r).set(columnIndex, cell.renderCell)
					if (drawHorizontalGridlines) {
						horizontalGridlines.get(r).set(columnIndex, true)
					}
					columnIndex++

				} else {
					// first row, first cell:
					val multirowFirst = '''\multicolumn{«cell.width»} {«BAR»«H_ALIGN»«BAR»} {\multirow{«cell.height»}{*}{«cell.renderCell»}}'''
					cellContentsByRow.get(r).set(columnIndex, multirowFirst)
					// "occupy" other cells in row with a SENTINEL marker:
					for (var i = columnIndex + 1; i < columnIndex + cell.width; i++) {
						cellContentsByRow.get(r).set(i, SENTINEL_STRING)
					}

					// other rows, first cell in row with a SENTINEL marker:
					for (var j = r + 1; j < r + cell.height; j++) {
						val multirowOther = '''\multicolumn{«cell.width»} {«BAR»«H_ALIGN»«BAR»} {}'''
						cellContentsByRow.get(j).set(columnIndex, multirowOther)
						// "occupy" other cells:
						for (var i = columnIndex + 1; i < columnIndex + cell.width; i++) {
							cellContentsByRow.get(j).set(i, SENTINEL_STRING)
						}
					}
					if (drawHorizontalGridlines) {
						for (var i = columnIndex; i < columnIndex + cell.width; i++) {
							horizontalGridlines.get(r + cell.height - 1).set(i, true)
						}
					}
					columnIndex += cell.width
				}
			}
		}
	}

	protected def String renderCell(TableCell cell) {
		val StringBuilder b = new StringBuilder()
		var hasLineBreaks = cell.contents.size > 1
		for(block : cell.contents) {
			val renderedBlock = (nestedContentBlockGenereator.generate(block) as String).replaceAll("[ \t\n\f\r]+", " ")
			hasLineBreaks = hasLineBreaks || renderedBlock.contains("\\\\")
			b.append(renderedBlock)
		}
		var result = b.toString
		if(hasLineBreaks) {
			// TODO: apparently, parbox can only contain a single LaTeX paragraph, minipage could help (see https://en.wikibooks.org/wiki/LaTeX/Boxes)
			result = '''\parbox{\textwidth}{\smallskip{}«result»\smallskip{}}'''
		}
		if(cell.row.isIsHeading) {
			result = '''\textbf{«result»}'''
		}
		return result
	}

	protected def String columnFormat(Table t) {
		val BAR = table.verticalGridline // can be an empty String
		val StringBuilder b = new StringBuilder()
		b.append(BAR)
		for (var i = 0; i < t.columns; i++) {
			b.append(H_ALIGN) // align left
			b.append(BAR)
		}
		b.toString
	}

	protected def String verticalGridline(Table t) {
		t.gridlines == VERTICAL || t.gridlines == BOTH ? "|" : ""
	}

	protected def String horizontalGridline(boolean[] gridlines) {
		var drawHline = true
		for (var i = 0; i < gridlines.length; i++) {
			drawHline = drawHline && gridlines.get(i)
		}
		if (drawHline) {
			return "\\hline"
		}
		val StringBuilder b = new StringBuilder
		var start = 0
		while (start < gridlines.length) {
			while (start < gridlines.length && ! gridlines.get(start)) {
				start++
			}
			if (start < gridlines.length) {
				var end = start
				while (end < gridlines.length && gridlines.get(end)) {
					end++
				}
				if (start < end) {
					b.append("\\cline{")
					b.append(start + 1) // numbering starts at 1
					b.append("-")
					b.append(end)
					b.append("} ")
				}
				start = end
			}
		}
		return b.toString
	}
}
