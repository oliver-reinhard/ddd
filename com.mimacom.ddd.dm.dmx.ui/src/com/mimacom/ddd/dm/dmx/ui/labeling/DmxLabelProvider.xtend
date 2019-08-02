/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.ui.labeling

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
import com.mimacom.ddd.dm.dmx.DmxStringLiteral
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import com.mimacom.ddd.dm.base.DNamedElement

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class DmxLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	def text(DNamedElement e) {
		return e.simpleName + " " + e.name
	}

	def text(DExpression e) {
		return e.simpleName
	}

	def text(DmxBinaryOperation e) {
		return e.simpleName + " " + e.operator.getName
	}

	def text(DmxBooleanLiteral e) {
		return e.simpleName + " " + e.value
	}

	def text(DmxStringLiteral e) {
		return e.simpleName + " " + e.value
	}

	def text(DmxNaturalLiteral e) {
		return e.simpleName + " " + e.value
	}

	def text(DmxDecimalLiteral e) {
		return e.simpleName + " " + e.value
	}

	def text(DmxUndefinedLiteral e) {
		return e.simpleName
	}

	protected def simpleName(Object obj) {
		val name = obj.class.simpleName
		if (name.endsWith("Impl")) {
			return name.substring(0, name.length - 4)
		} else if (name.endsWith("ImplCustom")) {
			return name.substring(0, name.length - 10)
		}
		return name
	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
