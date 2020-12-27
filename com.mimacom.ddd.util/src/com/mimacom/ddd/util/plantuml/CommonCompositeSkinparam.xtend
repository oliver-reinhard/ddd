package com.mimacom.ddd.util.plantuml

abstract class CommonCompositeSkinparam extends AbstractSkinparam {
	
	abstract def CommonCompositeSkinparam baseSkinparam()
	
	def Color shapeBackgroundColor() {
		baseSkinparam.shapeBackgroundColor
	}
	
	def Color lineColor() {
		baseSkinparam.lineColor
	}
	
	def float lineThickness() {
		baseSkinparam.lineThickness
	}
	
	def Color fontColor() {
		baseSkinparam.fontColor
	}
	
	def int fontSize() {
		baseSkinparam.fontSize
	}
	
	def String fontStyle() {
		baseSkinparam.fontStyle // normal | plain | italic | bold
	}
	
	override protected scopeBody() {
		'''
			BackgroundColor «shapeBackgroundColor»
			BorderColor «lineColor»
			BorderThickness «lineThickness»
			FontColor «fontColor»
			FontSize «fontSize»
			FontStyle «fontStyle»
		'''
	}
	
}
