package com.mimacom.ddd.sm.sim.plantuml

import com.mimacom.ddd.util.plantuml.SkinparamPackage
import com.mimacom.ddd.util.plantuml.Color

class SimSkinparamPackage extends SkinparamPackage {

	public static val DEFAUlT_PACKAGE_COLOR = new Color(22, 38, 195) // navy blue

	override lineColor() {
		DEFAUlT_PACKAGE_COLOR
	}

	override fontColor() {
		lineColor
	}
}
