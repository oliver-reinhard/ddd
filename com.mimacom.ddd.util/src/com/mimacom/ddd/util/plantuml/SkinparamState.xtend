package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamState extends CommonCompositeSkinparam {
	
	@Inject SkinparamGlobal skinparamGlobal 
	
	override protected scopeName() {
		"state"
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
	
	def int attributeFontSize() {
		fontSize
	}
	
	override protected scopeBody() {
		'''
		«super.scopeBody»
		AttributeFontSize «attributeFontSize»
		'''
	}
	
}
