package com.mimacom.ddd.sm.sim.plantuml

import com.mimacom.ddd.util.plantuml.SkinparamClass

class SimSkinparamClass extends SkinparamClass {

	override lineColor() {
		SimSkinparamPackage::DEFAUlT_PACKAGE_COLOR
	}

	override fontColor() {
		lineColor
	}
}
