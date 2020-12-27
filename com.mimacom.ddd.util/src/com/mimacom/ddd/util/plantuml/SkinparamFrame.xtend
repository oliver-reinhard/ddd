package com.mimacom.ddd.util.plantuml

import com.google.inject.Inject

class SkinparamFrame extends CommonCompositeSkinparam {

	@Inject SkinparamPackage skinparamPackage

	override protected scopeName() {
		"frame"
	}

	override baseSkinparam() {
		skinparamPackage
	}

	override toString() {
		// super.toString()
		//
		// There seems to be a bug in SOME VERSIONS of PlantUML: the thickness of Frames does not honour the global setting AND has to be set for the Package
		//
		// WARNING: The following workaround may have unwanted side effects !!
		//
		super.toString() + "\nskinparam PackageBorderThickness " + lineThickness  // TODO Check if this is still necessary
	}

}
