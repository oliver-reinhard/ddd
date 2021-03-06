package com.mimacom.ddd.sm.sim.diagramProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import com.mimacom.ddd.sm.sim.plantuml.SimTypeDiagramTextProviderImpl
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat
import java.io.InputStream
import org.apache.log4j.Logger
import com.mimacom.ddd.sm.sim.SystemInformationModel

class SimTypeDiagramRenderer implements IDiagramRenderer {
	
	static final Logger LOGGER = Logger.getLogger(SimTypeDiagramRenderer);
	
	@Inject SimTypeDiagramTextProviderImpl actualProvider
	@Inject PlantUmlDiagramRendererUtil plantUmlDiagramRenderer
	
	val PlantUmlFileFormat outputFormat
	
	new (PlantUmlFileFormat outputFormat) {
		this.outputFormat = outputFormat
	}
	
	override canRender(IDiagramRoot root) {
		return root instanceof SystemInformationModel && actualProvider.canProvide(root as SystemInformationModel)
	}
	
	override InputStream render(IDiagramRoot root) {
		LOGGER.info(SimTypeDiagramRenderer.getName() + " for " + root)
		
		var plantUmlText = actualProvider.diagramText(root as SystemInformationModel)
		if (plantUmlText === null) {
			plantUmlText = ""
		}
		return plantUmlDiagramRenderer.render(plantUmlText, outputFormat)
	}
}
