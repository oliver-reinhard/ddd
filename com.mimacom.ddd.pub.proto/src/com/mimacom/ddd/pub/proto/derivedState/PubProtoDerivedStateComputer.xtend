package com.mimacom.ddd.pub.proto.derivedState

import com.google.inject.Singleton
import com.mimacom.ddd.pub.proto.ProtoFactory
import com.mimacom.ddd.pub.proto.PublicationClass
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

@Singleton
class PubProtoDerivedStateComputer implements IDerivedStateComputer {

	static val PROTO = ProtoFactory.eINSTANCE
	
	public static val TITLE_SYMBOL_NAME = "DOC_TITLE"

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! preLinkingPhase) {
			val model = resource.allContents.head as PublicationClass
			model.installTitleSymbol
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		val model = resource.allContents.head as PublicationClass
		if (model !== null) {
			model.removeTitleSymbol
		}
	}
	
	protected def void installTitleSymbol(PublicationClass model) {
		if (model.symbols.filter[it.name == TITLE_SYMBOL_NAME].empty) {
			val titleSymbol = PROTO.createProtoSymbol
			titleSymbol.name = TITLE_SYMBOL_NAME
			model.symbols.add(titleSymbol)
		}
	}
	
	protected def void removeTitleSymbol(PublicationClass model) {
		val titleSymbol = model.symbols.filter[it.name == TITLE_SYMBOL_NAME].head
		if (titleSymbol !== null) {
			model.symbols.remove(titleSymbol)
		}
	}
}
