package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.util.plantuml.AbstractSkinparam
import com.mimacom.ddd.util.plantuml.Color

class SkinparamNote extends AbstractSkinparam {
	
	@Inject protected SkinparamGlobal skinparamGlobal 
	
	protected static val DEFAUlT_NOTE_COLOR = new Color(255, 246, 196) // light yellow
	protected static val DEFAUlT_KEYWORD_COLOR = new Color(64, 94, 122) // warm, dim blue
	
	override protected scopeName() {
		"note"
	}
	
	def Color shapeBackgroundColor() {
		DEFAUlT_NOTE_COLOR
	}
	
	def Color borderColor() {
		skinparamGlobal.canvasBackgroundColor == Color.TRANSPARENT ? Color.WHITE : skinparamGlobal.canvasBackgroundColor
	}
	
	def float borderThickness() {
		1.0f
	}
	
	def Color fontColor() {
		Color.BLACK  // better readability on colored background than global default font color
	}
	
	def Color keywordFontColor() {
		DEFAUlT_KEYWORD_COLOR
	}
	
	def int fontSize() {
		skinparamGlobal.fontSize - 1
	}
	
	override protected scopeBody() {
		'''
			BackgroundColor «shapeBackgroundColor»
			BorderColor «borderColor»
			BorderThickness «borderThickness»
			FontColor «fontColor»
			FontSize «fontSize»
		'''
	}
}
