package com.mimacom.ddd.pub.pub.generator

class CodeListingFormatter {

	public static val TAB_SIZE = 2

	/**
	 * Outdents the listing's lines by the leading indentation common to each line.
	 */
	def String outdent(String listing) {
		outdent(listing, TAB_SIZE)
	}
	
	def String outdent(String listing, int tabSize) {
		val lines = listing.split('\n')
		var minIndent = Integer.MAX_VALUE
		val b = new StringBuilder
		for (line : lines) {
			val indentCount = line.indentationSize(tabSize)
			minIndent = Math.min(minIndent, indentCount)
		}
		for (line : lines) {
			b.appendOutdentedLine(line, minIndent, tabSize)
		}
		b.toString
	}

	protected def int indentationSize(String line, int tabSize) {
		val chars = line.toCharArray
		var length = 0
		var i = 0
		while (i < chars.length) {
			val c = chars.get(i)
			if (c == '\t') {
				length += tabSize
			} else if (c == ' ') {
				length++
			} else {
				return length
			}
			i++
		}
		return length
	}

	protected def void appendOutdentedLine(StringBuilder b, String line, int tabSize, int outdentSize) {
		val chars = line.toCharArray
		var outdentedSize = 0
		var i = 0
		while (i < chars.length) {
			val c = chars.get(i)
			if (c == '\t') {
				 if (outdentedSize < outdentSize) {
					outdentedSize += tabSize
				} else {
					for(var j=0; j<tabSize; j++) {
						b.append(' ')
					}
				}
			} else if (c == ' ') {
				 if (outdentedSize < outdentSize) {
					outdentedSize++
				} else {
					b.append(' ')
				}
			} else {
				b.append(chars, i, chars.length - i)
				b.append('\n')
				return
			}
			i++
		}
		b.append('\n')
	}
}
