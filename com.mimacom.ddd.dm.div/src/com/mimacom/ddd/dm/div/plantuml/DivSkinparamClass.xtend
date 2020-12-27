package com.mimacom.ddd.dm.div.plantuml

import com.mimacom.ddd.util.plantuml.SkinparamClass

class DivSkinparamClass extends SkinparamClass {

	override lineColor() {
		DivSkinparamPackage::DEFAUlT_PACKAGE_COLOR
	}

	override fontColor() {
		lineColor
	}
}
