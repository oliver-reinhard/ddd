package com.mimacom.ddd.dm.dem.diagramProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.plantuml.DemEventDiagramTextProviderImpl
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat
import java.io.InputStream
import org.apache.log4j.Logger

class DemEventDiagramRenderer implements IDiagramRenderer {
	
	static final Logger LOGGER = Logger.getLogger(DemEventDiagramRenderer);
	
	@Inject DemEventDiagramTextProviderImpl actualProvider
	@Inject PlantUmlDiagramRendererUtil plantUmlDiagramRenderer
	
	val PlantUmlFileFormat outputFormat
	
	new (PlantUmlFileFormat outputFormat) {
		this.outputFormat = outputFormat
	}
	
	override canRender(IDiagramRoot root) {
		return root instanceof DemDomainEvent && actualProvider.canProvide(root as DemDomainEvent)
	}
	
	override InputStream render(IDiagramRoot root) {
		LOGGER.info(DemEventDiagramRenderer.getName() + " for " + root)
		
		var plantUmlText = actualProvider.diagramText(root as DemDomainEvent)
		if (plantUmlText === null) {
			plantUmlText = ""
		}
		return plantUmlDiagramRenderer.render(plantUmlText, outputFormat)
	}
}
