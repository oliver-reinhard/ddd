/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.ui.labeling

import com.google.inject.Inject
import com.mimacom.ddd.dm.dmx.DmxField
import com.mimacom.ddd.dm.dom.DomDetail
import com.mimacom.ddd.dm.dom.DomEntity
import com.mimacom.ddd.dm.dom.DomNamedComplexObject
import com.mimacom.ddd.dm.dom.DomUtil
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class DomLabelProvider extends DefaultEObjectLabelProvider {

	@Inject extension DomUtil
	
	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(DomNamedComplexObject o) {
		return o.label
	}
	
	def text(DmxField f) {
		return f.label
	}
	
	def text(DomEntity e) {
		return"Entity " + e.type?.name
	}
	
	def text(DomDetail d) {
		return"Detail " + d.type?.name
	}
	
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
