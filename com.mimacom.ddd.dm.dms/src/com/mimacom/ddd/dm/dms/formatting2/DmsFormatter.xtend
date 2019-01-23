/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dms.formatting2

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.dms.services.DmsGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class DmsFormatter extends AbstractFormatter2  { // extends DmxFormatter {
	
	@Inject extension DmsGrammarAccess

	def dispatch void format(DDomain dDomain, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		dDomain.description.format
		for (dType : dDomain.types) {
			dType.format
		}
		for (dAggregate : dDomain.aggregates) {
			dAggregate.format
		}
		for (dExistingApplication : dDomain.applications) {
			dExistingApplication.format
		}
		for (dDomainEvent : dDomain.events) {
			dDomainEvent.format
		}
		for (dActor : dDomain.actors) {
			dActor.format
		}
	}
	
	// TODO: implement for DAggregate, DCondition, DPrimitive, DEnumeration, DLiteral, DComplexType, DAssociation, DAttribute, DQuery, DQueryParameter, DDomainEvent, DNotification, DContext, DHuman, DTime, DExistingApplication, DService, DServiceParameter, DException
}
