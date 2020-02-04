package com.mimacom.ddd.sm.sim.diagramProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.dim.diagramProvider.DimTypeDiagramRendererPNG
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.plantuml.SimTypeDiagramTextProviderImpl
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat
import java.io.InputStream
import org.apache.log4j.Logger

class SimTypeDiagramRendererPNG implements IDiagramRenderer {
	
	@Inject SimTypeDiagramTextProviderImpl actualProvider
	@Inject PlantUmlDiagramRendererUtil plantUmlDiagramRenderer
	
	static final Logger LOGGER = Logger.getLogger(DimTypeDiagramRendererPNG);
	
	override canRender(IDiagramRoot root) {
		return root instanceof SInformationModel && actualProvider.canProvide(root as SInformationModel)
	}
	
	override InputStream render(IDiagramRoot root) {
		LOGGER.info(SimTypeDiagramRendererPNG.getName() + " for " + root)
		
		var plantUmlText = actualProvider.diagramText(root as SInformationModel)
		if (plantUmlText === null) {
			plantUmlText = ""
		}
		return plantUmlDiagramRenderer.render(plantUmlText, PlantUmlFileFormat.PNG)
	}
}
