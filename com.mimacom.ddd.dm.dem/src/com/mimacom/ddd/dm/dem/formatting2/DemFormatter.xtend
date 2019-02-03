/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.formatting2

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DCondition
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DDomainEvent
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess
import java.util.List
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class DemFormatter extends  AbstractFormatter2  { // DmxFormatter {
	
	@Inject extension DemGrammarAccess
	
	static val bpackage = BasePackage.eINSTANCE

	def dispatch void format(DDomain domain, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		domain.description.format
		domain.regionFor.assignment(DDomainAccess.nameAssignment_1).append[newLines = 2]
		
		for (i : domain.imports) {
			i.append[newLine]
		}
//		domain.imports.last.append[newLines = 2]
		
		for (event : domain.events) {
			event.format
		}
		
		for (dActor : domain.actors) {
			dActor.format
		}
	}
	
	def dispatch void format(DDomainEvent event, extension IFormattableDocument document) {
		val open = event.regionFor.keyword(DDomainEventAccess.leftCurlyBracketKeyword_3)
		val close = event.regionFor.keyword(DDomainEventAccess.rightCurlyBracketKeyword_12)
		open.append[newLines = 2]
		interior(open, close) [indent]
		
		// Context
		event.regionFor.keyword(DDomainEventAccess.contextKeyword_4).append[newLine]
		for (context : event.context) {
			context.regionFor.keyword(DContextAccess.colonKeyword_1).surround[oneSpace]
			context.surround[indent]
			context.append[if (context == event.context.last) newLines=2 else newLine]
		}
		
		// Trigger
		event.regionFor.keyword(DDomainEventAccess.triggeredKeyword_6).prepend[newLines=2]
 		event.regionFor.assignment(DDomainEventAccess.triggerAssignment_8).append[newLines = 2]
		
		// Notifications
		event.regionFor.keyword(DDomainEventAccess.notificationsKeyword_9_0).append[newLine]
		for (n : event.notifications) {
			n.regionFor.keyword(DNotificationAccess.colonKeyword_1).surround[oneSpace]
			n.surround[indent]
			n.append[if (n == event.notifications.last) newLines=2 else newLine]
		}
		
		// Before conditions
		event.regionFor.keyword(DDomainEventAccess.conditionsKeyword_10_1).append[newLine]
		format(event.before, document)
		
		// Before conditions
		event.regionFor.keyword(DDomainEventAccess.conditionsKeyword_11_1).append[newLine]
		format(event.after, document)
	}
	
	def dispatch void format(List<DCondition> conditions, extension IFormattableDocument document) {
		for (c : conditions) {
			c.surround[indent]
			val colon = c.regionFor.keyword(DConditionAccess.colonKeyword_1)
			colon.prepend[noSpace]
			colon.append[newLine]
			c.condition.surround[indent]
			c.append[newLines=2]
		}
	}
	
	def dispatch void format(DContext context, extension IFormattableDocument document) {
	}
}