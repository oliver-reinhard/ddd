package com.mimacom.ddd.dm.base.plantuml

import com.mimacom.ddd.util.plantuml.Color
import org.eclipse.emf.ecore.EClass

class Spot {
	
	public val EClass eClass
	public val Color color
	public val char letter
	
	new(EClass eClass, Color color, char letter) {
		this.eClass = eClass
		this.color = color
		this.letter = letter
	}
	
	override toString() {
		val sb = new StringBuilder
		sb.append("<< (")
		sb.append(letter)
		sb.append(",")
		sb.append(color.toString)
		sb.append(") >>")
		return sb.toString
	}
}