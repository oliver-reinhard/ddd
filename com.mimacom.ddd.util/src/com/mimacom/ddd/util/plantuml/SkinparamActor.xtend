package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamActor extends CommonCompositeSkinparam {
	
	@Inject SkinparamUseCase skinparamUseCase 
	
	override protected scopeName() {
		"actor"
	}
	
	override baseSkinparam() {
		skinparamUseCase
	}
	
	override int fontSize() {
		baseSkinparam.fontSize + 2
	}
	
	override String fontStyle() {
		"bold"  // normal | plain | italic | bold
	}
}
