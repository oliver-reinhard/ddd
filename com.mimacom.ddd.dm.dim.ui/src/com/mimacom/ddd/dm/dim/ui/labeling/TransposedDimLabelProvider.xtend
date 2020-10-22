/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.ui.labeling

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DNamedPredicate
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import com.mimacom.ddd.dm.dim.DimUtil
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class TransposedDimLabelProvider extends DimLabelProvider {

	@Inject extension DimUtil
	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	def String label(DAggregate a) {
		return "Aggregate " + a.name
	}
	
	override text(DAggregate a) {
		if (a instanceof TAggregateTransposition) {
			return ">" + a.rule.label
		}
		return a.label
	}
	
	override text(DType t) {
		if (t instanceof TTypeTransposition) {
			return ">" + t.rule.label
		}
		return t.label
	}
	
	def text(DLiteral literal) {
		if (literal instanceof TLiteralTransposition) {
			return ">" + literal.rule.label
		}
		return literal.name
	}
	
	override text(DFeature f) {
		if (f instanceof TFeatureTransposition) {
			return ">" + f.rule.label
		}
		return f.label
	}
	
	override text(DQueryParameter p) {
		if (p instanceof TQueryParameterTransposition) {
			return ">" + p.rule.label
		}
		return p.label
	}
	
	override text(DNamedPredicate c) {
		return c.label
	}
}
