package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamArrow extends CommonCompositeSkinparam {
	
	@Inject SkinparamGlobal skinparamGlobal 
	
	override protected scopeName() {
		"arrow"
	}
	
	override baseSkinparam() {
		skinparamGlobal
	}
	
	override shapeBackgroundColor() {
		throw new IllegalAccessException("Not applicable to arrows")
	}
	
	override lineThickness() {
		0.5f
	}
	
	override protected scopeBody() {
		'''
			Color «lineColor»
			Thickness «lineThickness»
			FontColor «fontColor»
			FontSize «fontSize»
			FontStyle «fontStyle»
		'''
	}
	
}
