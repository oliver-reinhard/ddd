package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamObject extends SkinparamClass {
	
	@Inject SkinparamClass skinparamClass 
	
	override protected scopeName() {
		"object"
	}
	
	override attributeFontSize() {
		skinparamClass.attributeFontSize
	}
	
	override baseSkinparam() {
		skinparamClass
	}
	
}
