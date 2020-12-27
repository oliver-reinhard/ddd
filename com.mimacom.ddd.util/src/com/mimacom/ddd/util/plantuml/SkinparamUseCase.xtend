package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamUseCase extends CommonCompositeSkinparam {
	
	@Inject SkinparamGlobal skinparamGlobal 
	
	override protected scopeName() {
		"usecase"
	}
	
	override baseSkinparam() {
		skinparamGlobal
	}
}
