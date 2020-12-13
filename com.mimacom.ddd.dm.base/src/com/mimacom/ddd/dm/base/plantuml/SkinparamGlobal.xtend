package com.mimacom.ddd.dm.base.plantuml

import com.mimacom.ddd.util.plantuml.Color

class SkinparamGlobal {
	
	protected val DEFAUlT_ARROW_COLOR = new Color(40, 40, 40)
	protected val DEFAUlT_FONT_COLOR = DEFAUlT_ARROW_COLOR
	
	def Color arrowColor() {
		DEFAUlT_ARROW_COLOR
	}
	
	def float borderThickness() {
		1.0f
	}

	def boolean hideEmptyMembers() {
		true
	}
	
	def String fontName() {
		"Arial"
	}
	
	def String monospacedFontName() {
		"Courier"
	}
	
	def Color fontColor() {
		DEFAUlT_FONT_COLOR
	}
	
	def int fontSize() {
		return 9
	}
	
	def boolean shadowing() {
		false
	}
	
	// use guillemet for stereotypes
	def boolean guillemet() {
		true
	}

	protected def void render(StringBuilder sb) {
		val res = '''
			skinparam ArrowColor «arrowColor»
			skinparam BorderThickness «borderThickness»
			skinparam DefaultFontName «fontName»
			skinparam DefaultMonospacedFontName «monospacedFontName»
			skinparam DefaultFontColor «fontColor»
			skinparam FontSize «fontSize»
			skinparam Shadowing «shadowing»
			skinparam Guillemet «guillemet»
		'''
		sb.append(res)
	}
	
	override toString() {
		val StringBuilder sb = new StringBuilder()
		sb.render
		return sb.toString
	}
}