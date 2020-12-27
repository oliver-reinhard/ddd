package com.mimacom.ddd.dm.div.plantuml

import com.mimacom.ddd.util.plantuml.SkinparamPackage
import com.mimacom.ddd.util.plantuml.Color

class DivSkinparamPackage extends SkinparamPackage {
	
	protected static val DEFAUlT_PACKAGE_COLOR = new Color(232,	162, 58)  // orange
	
	override lineColor() {
		DEFAUlT_PACKAGE_COLOR
	}
	
	override fontColor() {
		lineColor
	}
	
}