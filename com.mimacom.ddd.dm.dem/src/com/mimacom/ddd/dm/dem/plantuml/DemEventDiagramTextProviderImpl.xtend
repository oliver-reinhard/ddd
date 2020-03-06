package com.mimacom.ddd.dm.dem.plantuml

import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider

class DemEventDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemDomainEvent> {
	
	override canProvide(DemDomainEvent event) {
		event !== null && ! (event.triggers.empty)
	}
	
	override String diagramText(DemDomainEvent event) {
       val result = '''
		@startuml
		(«event.name») as (event)
 		«FOR t : event.triggers»
			actor «t.name»
 		«ENDFOR»
 		«FOR n : event.notifications.filter[getNotified!==null]»
			actor «n.getNotified.name»
 		«ENDFOR»
 		«FOR t : event.triggers»
 			«t.name» --> (event) : triggers
 		«ENDFOR»
 		«FOR n : event.notifications.filter[getNotified!==null]»
 			«n.getNotified.name» <-- (event) : «n.name»
 		«ENDFOR»
		@enduml
       '''
       return result
	}

}