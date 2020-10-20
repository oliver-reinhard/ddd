/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.formatting2

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.dim.DomainInformationModel
import com.mimacom.ddd.dm.dim.services.DimGrammarAccess
import com.mimacom.ddd.dm.dmx.formatting2.DmxFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument

class DimFormatter extends DmxFormatter {

	@Inject extension DimGrammarAccess

	def dispatch void format(DomainInformationModel model, extension IFormattableDocument document) {
		val open = model.regionFor.keyword(domainInformationModelAccess.leftCurlyBracketKeyword_5)
		val close = model.regionFor.keyword(domainInformationModelAccess.rightCurlyBracketKeyword_7)
		open.append[newLines = 2]
		interior(open, close)[indent]
		close.append[newLines = 2]

		for (type : model.types) {
			type.format
			type.append[newLines = 2]
		}
		for (aggregate : model.aggregates) {
			aggregate.format
			aggregate.append[newLines = (aggregate === model.aggregates.last ? 1 : 2)]
		}
	}

	def dispatch void format(DAggregate aggregate, extension IFormattableDocument document) {
		val open = aggregate.regionFor.keyword(dimAggregateAccess.leftCurlyBracketKeyword_4)
		val close = aggregate.regionFor.keyword(dimAggregateAccess.rightCurlyBracketKeyword_7)
		open.append[newLines = 2]
		interior(open, close)[indent]

		for (query : aggregate.features) {
			query.format
			query.append[newLines = 2]
		}

		for (type : aggregate.types) {
			type.format
			type.append[newLines = (type === aggregate.types.last ? 1 : 2)]
		}
	}

	def dispatch void format(DEnumeration en, extension IFormattableDocument document) {
		if (en.literals.size > 3) {
			val open = en.regionFor.keyword(dimEnumerationAccess.leftCurlyBracketKeyword_5)
			val close = en.regionFor.keyword(dimEnumerationAccess.rightCurlyBracketKeyword_8)
			open.append[newLine]
			interior(open, close)[indent]

			for (literal : en.literals) {
				literal.regionFor.assignment(dimLiteralAccess.nameAssignment_1).surround[noSpace]
			}
			for (comma : en.regionFor.keywords(dimEnumerationAccess.commaKeyword_6_1_0)) {
				comma.append[newLine]
			}
			en.literals.last.append[newLine]
		}
	}

	def dispatch void format(DComplexType type, extension IFormattableDocument document) {
		val open = type.regionFor.keyword(dimEntityTypeAccess.leftCurlyBracketKeyword_5)
		val close = type.regionFor.keyword(dimEntityTypeAccess.rightCurlyBracketKeyword_8)
		open.append[newLine]
		interior(open, close)[indent]

		for (feature : type.features) {
			feature.append[newLine]
		}

		for (constraint : type.constraints) {
			constraint.append[newLine]
		}
	}

	def dispatch void format(DType type, extension IFormattableDocument document) {
	}
}
