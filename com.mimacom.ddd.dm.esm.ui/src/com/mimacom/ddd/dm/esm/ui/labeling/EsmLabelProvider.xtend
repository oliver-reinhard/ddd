/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.ui.labeling

import com.google.inject.Inject
import com.mimacom.ddd.dm.dmx.ui.labeling.DmxLabelProvider
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class EsmLabelProvider extends DmxLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
