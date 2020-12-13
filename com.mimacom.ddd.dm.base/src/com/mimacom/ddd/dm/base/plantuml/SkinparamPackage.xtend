package com.mimacom.ddd.dm.base.plantuml

import com.mimacom.ddd.util.plantuml.Color

class SkinparamPackage {
	
	protected val DEFAUlT_BORDER_COLOR = new Color(40, 40, 40)
	protected val DEFAUlT_BACKGROUND_COLOR = new Color(255, 255, 255)  // white
	protected val DEFAUlT_FONT_COLOR = DEFAUlT_BORDER_COLOR
	
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

	protected def void render(StringBuilder sb) {
		val res = '''
			BackgroundColor «backgroundColor»
			BorderColor «borderColor»
			BorderThickness «borderThickness»
			FontColor «fontColor»
			FontSize «fontSize»
		'''
		sb.append(res)
	}
	
	override toString() {
		val StringBuilder sb = new StringBuilder("skinparam package {\n")
		sb.render
		sb.append("\n}")
		return sb.toString
	}
}