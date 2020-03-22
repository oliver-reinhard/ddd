package com.mimacom.ddd.dm.dem.plantuml

import com.google.common.collect.Maps
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider
import java.util.List

class DemEventsOverviewDiagramTextProviderImpl extends AbstractDemDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemEventsOverviewModel> {

	override canProvide(DemEventsOverviewModel model) {
		val events = model.computeEvents
		model !== null && ! (events.empty)
	}
	
	def List<DemDomainEvent> computeEvents(DemEventsOverviewModel model) {
		model.include
	}

	override String diagramText(DemEventsOverviewModel model) {
		val events = model.computeEvents
		val actors = Maps.newHashMap
		for(event : events) {
			event.collectActors(actors)
		}
		val result = '''
			@startuml
			«actors.values.allActorsText»
			«FOR event : events»
			
			«event.eventText»
				«event.allFlowsText»
			«ENDFOR»
			@enduml
		     '''
		return result
	}
}
