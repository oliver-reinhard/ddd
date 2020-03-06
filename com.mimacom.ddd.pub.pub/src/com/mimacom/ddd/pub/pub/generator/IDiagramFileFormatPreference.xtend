package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat
import java.util.List

interface IDiagramFileFormatPreference {
	
	def List<DiagramFileFormat> raster()
	def List<DiagramFileFormat> vector()
}