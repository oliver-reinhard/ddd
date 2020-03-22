package com.mimacom.ddd.dm.dem.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.dem.DemActor
import com.mimacom.ddd.dm.dem.DemDomainEvent
import java.util.Collection
import java.util.Map
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

abstract class AbstractDemDiagramTextProviderImpl {
	
	@Inject QualifiedNameProvider qualifiedNameProvider

	def void collectActors(DemDomainEvent event, Map<QualifiedName, DemActor> acceptor) {
		for (actor : event.triggers) {
			acceptor.put(qualifiedNameProvider.getFullyQualifiedName(actor), actor)
		}
		for (notification : event.notifications.filter[getNotified !== null]) {
			val actor = notification.getNotified
			acceptor.put(qualifiedNameProvider.getFullyQualifiedName(actor), actor)
		}
	}
	
	def String eventText(DemDomainEvent event) '''
		usecase («event.name»)
	'''
	
	def String allActorsText(Collection<DemActor> actors) '''
		«FOR actor : actors»
			actor :«actor.name»:
		«ENDFOR»
	'''
	
	def String allFlowsText(DemDomainEvent event) '''
 		«FOR actor : event.triggers»
 			«actor.name» --> («event.name») : triggers
 		«ENDFOR»
 		«FOR n : event.notifications.filter[getNotified!==null]»
 			«n.getNotified.name» <-- («event.name») : «n.name»
 		«ENDFOR»
	'''
}