package com.mimacom.ddd.util.plantuml

abstract class AbstractSkinparam {
	
	static val NEWLINE = '\n'
	
	/*
	 * Return "class", "package" etc.
	 */
	abstract protected def String scopeName()

	/*
	 * Return the actual skinparam body lines. Use "\n" for new line.
	 * No indenting required (applied automatically)
	 */
	abstract protected def String scopeBody()
	
	override toString() {
		val StringBuilder sb = new StringBuilder("skinparam ")
		sb.append(scopeName.toLowerCase)
		sb.append(" {")
		sb.newLine
		sb.indentAndAppend(scopeBody)
		sb.append("}")
		return sb.toString
	}
	
	protected def void indentAndAppend(StringBuilder sb, String body) {
		val lines = body.split(NEWLINE)
		for(line : lines) {
			sb.append("\t")
			sb.append(line.trim)
			sb.newLine
		}
	}
	
	protected def void newLine(StringBuilder sb) {
		sb.append(NEWLINE)
	}
}