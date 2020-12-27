package com.mimacom.ddd.util.plantuml

import com.mimacom.ddd.util.plantuml.Color
import com.google.inject.Singleton

@Singleton
class SkinparamGlobal extends CommonCompositeSkinparam {
	
	protected static val DEFAUlT_BACKGROUND_COLOR = new Color(255, 255, 255)  // white
	protected static val DEFAUlT_LINE_COLOR = new Color(40, 40, 40)
	protected static val DEFAUlT_FONT_COLOR = DEFAUlT_LINE_COLOR
	

	def boolean hideEmptyMembers() {
		true
	}
	
	def String fontName() {
		"Helvetica"
	}
	
	def String monospacedFontName() {
		"Courier New"
	}
	
	def boolean shadowing() {
		false
	}
	
	/*
	 * This — and only this method — may return Color.TRANSPARENT.
	 */
	def Color canvasBackgroundColor() {
		DEFAUlT_BACKGROUND_COLOR
	}
	
	/*
	 * Use guillemet for stereotypes
	 */ 
	def boolean guillemet() {
		true
	}
	
	override baseSkinparam() {
		null
	}
	
	override Color shapeBackgroundColor() {
		DEFAUlT_BACKGROUND_COLOR
	}
	
	// Note a PlantUML-Parameter — used for as the default for scoped skinparams
	override Color lineColor() {
		DEFAUlT_LINE_COLOR
	}
	
	override float lineThickness() {
		1.0f
	}
	
	override Color fontColor() {
		DEFAUlT_FONT_COLOR
	}
	
	override int fontSize() {
		return 14
	}
	
	override fontStyle() {
		"normal" // normal | plain | italic | bold
	}
	
	override protected scopeName() {
		"default"
	}
	
	override toString() '''
		skinparam ArrowColor «lineColor»
		skinparam BackgroundColor «canvasBackgroundColor»
		skinparam BorderThickness «lineThickness»
		skinparam Shadowing «shadowing»
		skinparam Guillemet «guillemet»
		«IF hideEmptyMembers»hide empty members«ENDIF»
		
		skinparam «scopeName» {
			FontName «fontName»
			MonospacedFontName «monospacedFontName»
			FontColor «fontColor»
			FontSize «fontSize»
		}
	'''
}
