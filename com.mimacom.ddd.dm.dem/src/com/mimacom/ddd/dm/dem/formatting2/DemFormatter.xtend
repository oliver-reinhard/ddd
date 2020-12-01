/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.formatting2

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DContext
import com.mimacom.ddd.dm.base.base.DNamedElement
import com.mimacom.ddd.dm.base.base.DNamedPredicate
import com.mimacom.ddd.dm.dem.DemCaseConjunction
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess
import com.mimacom.ddd.dm.dmx.formatting2.DmxFormatter
import java.util.List
import org.eclipse.xtext.formatting2.IFormattableDocument

class DemFormatter extends  DmxFormatter {
	
	@Inject extension DemGrammarAccess
	
	def dispatch void format(DemDomainEvent event, extension IFormattableDocument document) {
		val open = event.regionFor.keyword(demDomainEventAccess.leftCurlyBracketKeyword_6)
		val close = event.regionFor.keyword(demDomainEventAccess.rightCurlyBracketKeyword_13)
		open.append[newLines = 2]
		interior(open, close) [indent]
		
		// Context
		event.regionFor.keyword(demDomainEventAccess.contextKeyword_7).append[newLine]
		for (context : event.context) {
			context.regionFor.keyword(DContextAccess.colonKeyword_2).surround[oneSpace]
			context.surround[indent]
			context.append[if (context == event.context.last) newLines=2 else newLine]
		}
		
		// Triggers
		event.regionFor.keyword(demDomainEventAccess.triggeredKeyword_9_0).prepend[newLines=2]
		event.regionFor.keyword(demDomainEventAccess.byKeyword_9_1).append[newLine]
		for (t : event.triggers) {
			t.regionFor.assignment(demDomainEventAccess.triggersAssignment_9_2).surround[oneSpace]
			t.surround[indent]
			t.append[if (t == event.triggers.last) newLines=2 else newLine]
		}
		
		// Notifications
		event.regionFor.keyword(demDomainEventAccess.notificationsKeyword_10_0).append[newLine]
		for (n : event.notifications) {
			n.regionFor.keyword(demNotificationAccess.colonKeyword_2).surround[oneSpace]
			n.surround[indent]
			n.append[if (n == event.notifications.last) newLines=2 else newLine]
		}
		
		// Preconditions
		event.regionFor.keyword(demDomainEventAccess.preconditionsKeyword_11_0).append[newLine]
		format(event.preconditionsCNF, document)
		
		// Postconditions
		event.regionFor.keyword(demDomainEventAccess.postconditionsKeyword_12_0).append[newLine]
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
			if (p.description !== null) {
				p.description.surround[indent].append[newLine]
			}
			p.getPredicate.surround[indent]
	}
	
	def dispatch void format(DemCaseConjunction c, extension IFormattableDocument document) {
			if (c.description !== null) {
				c.description.surround[indent].append[newLine]
			}
			if (! c.isOtherwise) {
				val when = c.regionFor.keyword(demCaseConjunctionAccess.whenKeyword_4_0_0)
				when.prepend[newLine]
			} else {
				val otherwise = c.regionFor.keyword(demCaseConjunctionAccess.otherwiseOtherwiseKeyword_4_1_0)
				otherwise.prepend[newLine]
			}
			val colon = c.regionFor.keyword(demCaseConjunctionAccess.colonKeyword_5)
			colon.prepend[noSpace]
			colon.append[newLines=2]
			format(c.predicates, document)
	}
	
	def dispatch void format(DContext context, extension IFormattableDocument document) {
	}
}
