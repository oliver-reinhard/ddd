package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat

class PubHtmlDiagramFileFormatPreference implements IDiagramFileFormatPreference {
		
		override raster() {
			#[DiagramFileFormat.PNG]
		}
		
		override vector() {
			#[DiagramFileFormat.SVG, DiagramFileFormat.EPS]
		}
}