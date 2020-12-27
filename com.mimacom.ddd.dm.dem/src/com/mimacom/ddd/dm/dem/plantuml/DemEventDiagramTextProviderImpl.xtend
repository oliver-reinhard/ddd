package com.mimacom.ddd.dm.dem.plantuml

import com.google.common.collect.Maps
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider

class DemEventDiagramTextProviderImpl extends AbstractDemDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemDomainEvent> {
	
	override canProvide(DemDomainEvent event) {
		event !== null && ! (event.triggers.empty)
	}
	
	override String diagramText(DemDomainEvent event) {
		val actors = Maps.newHashMap
		event.collectActors(actors)
		val result = '''
			@startuml
			
			«generateSkinParameters»
			
			«event.eventText»
			«actors.values.allActorsText»
			«event.allFlowsText»
			
			@enduml
		'''
       return result
	}
}