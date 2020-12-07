package com.mimacom.ddd.dm.div.diagramProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.dm.dim.DomainInformationModel
import com.mimacom.ddd.dm.div.DomainInformationView
import com.mimacom.ddd.dm.div.plantuml.DivTypeDiagramTextProviderImpl
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat
import java.io.InputStream
import org.apache.log4j.Logger

class DivTypeDiagramRenderer implements IDiagramRenderer {
	
	static final Logger LOGGER = Logger.getLogger(DivTypeDiagramRenderer);
	
	@Inject DivTypeDiagramTextProviderImpl actualProvider
	@Inject PlantUmlDiagramRendererUtil plantUmlDiagramRenderer
	
	val PlantUmlFileFormat outputFormat
	
	new (PlantUmlFileFormat outputFormat) {
		this.outputFormat = outputFormat
	}
	
	override canRender(IDiagramRoot root) {
		return root instanceof DomainInformationModel && actualProvider.canProvide(root as DomainInformationView)
	}
	
	override InputStream render(IDiagramRoot root) {
		LOGGER.info(DivTypeDiagramRenderer.getName() + " for " + root)
		
		var plantUmlText = actualProvider.diagramText(root as DomainInformationView)
		if (plantUmlText === null) {
			plantUmlText = ""
		}
		return plantUmlDiagramRenderer.render(plantUmlText, outputFormat)
	}
}
