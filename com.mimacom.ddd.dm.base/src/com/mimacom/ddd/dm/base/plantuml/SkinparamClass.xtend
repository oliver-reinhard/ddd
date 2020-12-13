package com.mimacom.ddd.dm.base.plantuml

import com.mimacom.ddd.util.plantuml.Color

class SkinparamClass {
	
	protected val DEFAUlT_BORDER_COLOR = new Color(255, 255, 255) // white
	protected val DEFAUlT_BACKGROUND_COLOR = new Color(240, 240, 240)
	protected val DEFAUlT_FONT_COLOR = new Color(40, 40, 40)
	
	def Color backgroundColor() {
		DEFAUlT_BACKGROUND_COLOR
	}
	
	def Color borderColor() {
		DEFAUlT_BORDER_COLOR
	}
	
	def float borderThickness() {
		1.0f
	}
	
	def Color fontColor() {
		DEFAUlT_FONT_COLOR
	}
	
	def int fontSize() {
		11
	}
	
	def String fontStyle() {
		"bold"  // normal | plain | italic | bold
	}
	
	def int attributeFontSize() {
		fontSize
	}
	
	def String hideEmptyMembers() {
		"hide empty members"
	}

	protected def void render(StringBuilder sb) {
		val res = '''
			BackgroundColor «backgroundColor»
			BorderColor «borderColor»
			BorderThickness «borderThickness»
			FontColor «fontColor»
			FontSize «fontSize»
			FontStyle «fontStyle»
			AttributeFontSize «attributeFontSize»
		'''
		sb.append(res)
	}
	
	override toString() {
		val StringBuilder sb = new StringBuilder("skinparam class {\n")
		sb.render
		sb.append("}\n")
		sb.append(hideEmptyMembers)
		sb.append("\n")
		return sb.toString
	}
}