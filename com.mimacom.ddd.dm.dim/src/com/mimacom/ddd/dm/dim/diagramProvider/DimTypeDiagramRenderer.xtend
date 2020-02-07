package com.mimacom.ddd.dm.dim.diagramProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DInformationModel
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.dim.plantuml.DimTypeDiagramTextProviderImpl
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat
import java.io.InputStream
import org.apache.log4j.Logger

class DimTypeDiagramRenderer implements IDiagramRenderer {
	
	static final Logger LOGGER = Logger.getLogger(DimTypeDiagramRenderer);
	
	@Inject DimTypeDiagramTextProviderImpl actualProvider
	@Inject PlantUmlDiagramRendererUtil plantUmlDiagramRenderer
	
	val PlantUmlFileFormat outputFormat
	
	new (PlantUmlFileFormat outputFormat) {
		this.outputFormat = outputFormat
	}
	
	override canRender(IDiagramRoot root) {
		return root instanceof DInformationModel && actualProvider.canProvide(root as DInformationModel)
	}
	
	override InputStream render(IDiagramRoot root) {
		LOGGER.info(DimTypeDiagramRenderer.getName() + " for " + root)
		
		var plantUmlText = actualProvider.diagramText(root as DInformationModel)
		if (plantUmlText === null) {
			plantUmlText = ""
		}
		return plantUmlDiagramRenderer.render(plantUmlText, outputFormat)
	}
}
