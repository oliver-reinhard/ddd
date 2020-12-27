package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamRectangle extends CommonCompositeSkinparam {
	
	@Inject SkinparamPackage skinparamPackage
	
	override protected scopeName() {
		"rectangle"
	}
	
	override baseSkinparam() {
		skinparamPackage
	}
	
}
