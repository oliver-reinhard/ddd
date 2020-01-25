/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.formatting2

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DNamedElement
import com.mimacom.ddd.dm.base.DNamedPredicate
import com.mimacom.ddd.dm.dem.DCaseConjunction
import com.mimacom.ddd.dm.dem.DDomainEvent
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess
import com.mimacom.ddd.dm.dmx.formatting2.DmxFormatter
import java.util.List
import org.eclipse.xtext.formatting2.IFormattableDocument

class DemFormatter extends  DmxFormatter {
	
	@Inject extension DemGrammarAccess


//	def dispatch void format(DDomainEvent domain, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		domain.description.format
//		domain.regionFor.assignment(DDomainEventAccess.nameAssignment_4).append[newLines = 2]
//		
//		for (i : domain.imports) {
//			i.append[if (i == domain.imports.last) newLines=2 else newLine]
//		}
//		
//		for (event : domain.events) {
//			event.format
//		}
//		
//		for (dActor : domain.actors) {
//			dActor.format
//		}
//	}
	
	def dispatch void format(DDomainEvent event, extension IFormattableDocument document) {
		val open = event.regionFor.keyword(DDomainEventAccess.leftCurlyBracketKeyword_7)
		val close = event.regionFor.keyword(DDomainEventAccess.rightCurlyBracketKeyword_14)
		open.append[newLines = 2]
		interior(open, close) [indent]
		
		// Context
		event.regionFor.keyword(DDomainEventAccess.contextKeyword_8).append[newLine]
		for (context : event.context) {
			context.regionFor.keyword(DContextAccess.colonKeyword_2).surround[oneSpace]
			context.surround[indent]
			context.append[if (context == event.context.last) newLines=2 else newLine]
		}
		
		// Trigger
		event.regionFor.keyword(DDomainEventAccess.triggeredKeyword_10_0).prepend[newLines=2]
		event.regionFor.keyword(DDomainEventAccess.byKeyword_10_1).append[newLine]
 		event.regionFor.assignment(DDomainEventAccess.triggerAssignment_10_2).surround[indent].append[newLines = 2]
		
		// Notifications
		event.regionFor.keyword(DDomainEventAccess.notificationsKeyword_11_0).append[newLine]
		for (n : event.notifications) {
			n.regionFor.keyword(DNotificationAccess.colonKeyword_2).surround[oneSpace]
			n.surround[indent]
			n.append[if (n == event.notifications.last) newLines=2 else newLine]
		}
		
		// Preconditions
		event.regionFor.keyword(DDomainEventAccess.preconditionsKeyword_12_0).append[newLine]
		format(event.preconditionsCNF, document)
		
		// Postconditions
		event.regionFor.keyword(DDomainEventAccess.postconditionsKeyword_13_0).append[newLine]
		format(event.postconditionsDNF, document)
	}
	
	def dispatch void format(List<DNamedElement> elements, extension IFormattableDocument document) {
		for (e : elements) {
			e.surround[indent]
			e.format(document)
			e.append[newLines=2]
		}
	}
	def dispatch void format(DNamedPredicate p, extension IFormattableDocument document) {
			val colon = p.regionFor.keyword(DNamedPredicateAccess.colonKeyword_2)
			colon.prepend[noSpace]
			colon.append[newLine]
			p.getPredicate.surround[indent]
	}
	
	def dispatch void format(DCaseConjunction c, extension IFormattableDocument document) {
			if (! c.otherwise) {
				val when = c.regionFor.keyword(DCaseConjunctionAccess.whenKeyword_3_0_0)
				when.prepend[newLine]
			} else {
				val otherwise = c.regionFor.keyword(DCaseConjunctionAccess.otherwiseOtherwiseKeyword_3_1_0)
				otherwise.prepend[newLine]
			}
			val colon = c.regionFor.keyword(DCaseConjunctionAccess.colonKeyword_4)
			colon.prepend[noSpace]
			colon.append[newLines=2]
			format(c.predicates, document)
	}
	
	def dispatch void format(DContext context, extension IFormattableDocument document) {
	}
}
