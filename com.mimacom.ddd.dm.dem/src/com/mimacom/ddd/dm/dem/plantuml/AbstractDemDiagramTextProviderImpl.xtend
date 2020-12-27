package com.mimacom.ddd.dm.dem.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.plantuml.PlantUmlTextProviderUtil
import com.mimacom.ddd.dm.dem.DemActor
import com.mimacom.ddd.dm.dem.DemCaseConjunction
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.util.plantuml.SkinparamActor
import com.mimacom.ddd.util.plantuml.SkinparamArrow
import com.mimacom.ddd.util.plantuml.SkinparamGlobal
import com.mimacom.ddd.util.plantuml.SkinparamNote
import com.mimacom.ddd.util.plantuml.SkinparamUseCase
import java.util.Collection
import java.util.Map
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

abstract class AbstractDemDiagramTextProviderImpl {
	
	@Inject extension PlantUmlTextProviderUtil
	
	@Inject QualifiedNameProvider qualifiedNameProvider
	
	@Inject SkinparamGlobal skinparamGlobal
	@Inject SkinparamUseCase skinparamUseCase
	@Inject SkinparamActor skinparamActor
	@Inject SkinparamArrow skinparamArrow
	@Inject SkinparamNote skinparamNote
	
	def generateSkinParameters() '''
		«skinparamGlobal»
		
		«skinparamUseCase»
		
		«skinparamActor»
		
		«skinparamArrow»
		
		«skinparamNote»
	'''

	def void collectActors(DemDomainEvent event, Map<QualifiedName, DemActor> acceptor) {
		for (trigger : event.triggers.filter[actor !== null]) {
			acceptor.put(qualifiedNameProvider.getFullyQualifiedName(trigger.actor), trigger.actor)
		}
		for (notification : event.notifications.filter[getNotified !== null]) {
			val actor = notification.getNotified
			acceptor.put(qualifiedNameProvider.getFullyQualifiedName(actor), actor)
		}
	}
	
	def String eventText(DemDomainEvent event) '''
		usecase «event.name» as "<b><size:«skinparamUseCase.fontSize+2»>«event.name»</size></b>
		«IF ! event.preconditionsCNF.empty»
			
			.. Preconditions ..
			
			«FOR pre : event.preconditionsCNF»
				* «pre.name»
			«ENDFOR»
		«ENDIF»
		«IF ! event.postconditionsDNF.empty»
			
			.. Postconditions ..
			«FOR post : event.postconditionsDNF»
				«IF post instanceof DemCaseConjunction»
					
					<b>Case «post.name»</b>:
					«FOR pred : post.predicates»
						* «pred.name»
					«ENDFOR»
				«ELSE»
					«IF post === event.postconditionsDNF.head»
					
					«ENDIF»
					* «post.name»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		"
		«event.generateNotesWithIds(event.name)»
	'''
	
	def String allActorsText(Collection<DemActor> actors) '''
		«FOR actor : actors»
			actor :«actor.name»:
			«actor.generateNotesWithIds(actor.name)»
		«ENDFOR»
	'''
	
	def String allFlowsText(DemDomainEvent event) '''
 		«FOR trigger : event.triggers.filter[actor !== null]»
 			«trigger.actor.name» --> («event.name») : triggers
 			«trigger.generateLinkNotes»
 		«ENDFOR»
 		«FOR notification : event.notifications.filter[getNotified!==null]»
 			«notification.getNotified.name» <-- («event.name») : «notification.name»
 			«notification.generateLinkNotes»
 		«ENDFOR»
	'''
}