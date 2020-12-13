package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.util.plantuml.Color

class SkinparamNote {
	
	@Inject extension PlantUmlTextProviderUtil
	
	protected val DEFAUlT_BORDER_COLOR = new Color(163, 163, 163)
	
	def Color backgroundColor() {
		defaultNoteColor
	}
	
	def Color borderColor() {
		DEFAUlT_BORDER_COLOR
	}
	
	def float borderThickness() {
		0.5f
	}
	
	def int fontSize() {
		return 9
	}

	protected def void render(StringBuilder sb) {
		val res = '''
			BackgroundColor «backgroundColor»
			BorderColor «borderColor»
			BorderThickness «borderThickness»
			FontSize «fontSize»
		'''
		sb.append(res)
	}
	
	override toString() {
		val StringBuilder sb = new StringBuilder("skinparam note {\n")
		sb.render
		sb.append("\n}")
		return sb.toString
	}
}