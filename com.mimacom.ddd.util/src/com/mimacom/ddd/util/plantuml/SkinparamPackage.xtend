package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamPackage extends CommonCompositeSkinparam {
	
	@Inject SkinparamGlobal skinparamGlobal 
	
	override protected scopeName() {
		"package"
	}
	
	override baseSkinparam() {
		skinparamGlobal
	}
	
	override int fontSize() {
		baseSkinparam.fontSize + 2
	}
	
	override String fontStyle() {
		"bold"  // normal | plain | italic | bold
	}
	
}
