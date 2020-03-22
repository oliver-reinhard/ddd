package com.mimacom.ddd.dm.dem.plantuml

import com.mimacom.ddd.dm.dem.DemActorModel
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider

class DemActorsOverviewDiagramTextProviderImpl extends AbstractDemDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemActorModel> {
	
	override canProvide(DemActorModel model) {
		model !== null && ! (model.actors.empty)
	}
	
	override String diagramText(DemActorModel model) {
		val result = '''
			@startuml
			«model.actors.allActorsText»
			@enduml
		'''
       return result
	}

}