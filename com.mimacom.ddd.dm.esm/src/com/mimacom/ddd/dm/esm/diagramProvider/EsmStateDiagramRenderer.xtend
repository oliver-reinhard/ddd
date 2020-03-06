package com.mimacom.ddd.dm.esm.diagramProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.esm.EsmEntityStateModel
import com.mimacom.ddd.dm.esm.plantuml.EsmStateDiagramTextProviderImpl
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat
import java.io.InputStream
import org.apache.log4j.Logger

class EsmStateDiagramRenderer implements IDiagramRenderer {
	
	static final Logger LOGGER = Logger.getLogger(EsmStateDiagramRenderer);
	
	@Inject EsmStateDiagramTextProviderImpl actualProvider
	@Inject PlantUmlDiagramRendererUtil plantUmlDiagramRenderer
	
	val PlantUmlFileFormat outputFormat
	
	new (PlantUmlFileFormat outputFormat) {
		this.outputFormat = outputFormat
	}
	
	override canRender(IDiagramRoot root) {
		return root instanceof EsmEntityStateModel && actualProvider.canProvide(root as EsmEntityStateModel)
	}
	
	override InputStream render(IDiagramRoot root) {
		LOGGER.info(EsmStateDiagramRenderer.getName() + " for " + root)
		
		var plantUmlText = actualProvider.diagramText(root as EsmEntityStateModel)
		if (plantUmlText === null) {
			plantUmlText = ""
		}
		return plantUmlDiagramRenderer.render(plantUmlText, outputFormat)
	}
}
