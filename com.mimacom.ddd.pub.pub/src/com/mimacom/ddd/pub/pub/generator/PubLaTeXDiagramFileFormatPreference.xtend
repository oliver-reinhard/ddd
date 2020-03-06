package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat

class PubLaTeXDiagramFileFormatPreference implements IDiagramFileFormatPreference {
	
	override raster() {
		#[DiagramFileFormat.PNG]
	}

	override vector() {
		#[DiagramFileFormat.EPS]
	}
}
