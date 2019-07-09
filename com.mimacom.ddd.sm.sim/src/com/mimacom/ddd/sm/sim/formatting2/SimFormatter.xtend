/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.formatting2

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DImport
import com.mimacom.ddd.sm.sim.SAggregateDeduction
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction
import com.mimacom.ddd.sm.sim.SEnumerationDeduction
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SMorphRule
import com.mimacom.ddd.sm.sim.STypeDeduction
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SimFormatter extends AbstractFormatter2 {
	
	@Inject extension SimGrammarAccess

	def dispatch void format(SInformationModel model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		model.regionFor.assignment(SInformationModelAccess.nameAssignment_3).append[newLines = 2]
		for (i : model.imports) {
			i.append[if (i == model.imports.last) newLines=2 else newLine]
		}
		model.imports.last.append[newLines = 2]
		
		for (type : model.types) {
			type.format
		}
		for (aggregate : model.aggregates) {
			aggregate.format
		}
	}
	
	def dispatch void format(DImport imp, extension IFormattableDocument document) {
		imp.append[newLine]
	}

	def dispatch void format(SMorphRule sMorphRule, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		sMorphRule.remultiplyTo.format
	}
	
	def dispatch void format(SAggregateDeduction aggregate, extension IFormattableDocument document) {
		val open = aggregate.regionFor.keyword(SAggregateDeductionAccess.leftCurlyBracketKeyword_5)
		val close = aggregate.regionFor.keyword(SAggregateDeductionAccess.rightCurlyBracketKeyword_7)
		open.append[newLines = 2]
		interior(open, close) [indent]
		
		for (type : aggregate.types) {
			type.format
		}
	}
	
	def dispatch void format(SEnumerationDeduction  en, extension IFormattableDocument document) {
		if (en.literals.size > 3) {
			val open = en.regionFor.keyword(SEnumerationDeductionAccess.leftCurlyBracketKeyword_3)
			val close = en.regionFor.keyword(SEnumerationDeductionAccess.rightCurlyBracketKeyword_6)
			open.append[newLine]
			interior(open, close) [indent]
			
			for( literal : en.literals) {
				literal.regionFor.assignment(SEnumerationDeductionAccess.literalsAssignment_4_0).surround[noSpace]
			}
			for( comma : en.regionFor.keywords(SEnumerationDeductionAccess.commaKeyword_4_1_0)) {
				comma.append[newLine]
			}
			en.literals.last.append[newLine]
		}
		en.append[newLines = 2]
	}
	
	def dispatch void format(SComplexTypeDeduction type, extension IFormattableDocument document) {
		val open = type.regionFor.keyword(SComplexTypeFeaturesAccess.leftCurlyBracketKeyword_0)
		val close = type.regionFor.keyword(SComplexTypeFeaturesAccess.rightCurlyBracketKeyword_2)
		open.append[newLine]
		interior(open, close) [indent]
		close.append[newLines = 2]
		
		val dType = type as DComplexType
		for (feature: dType.features) {
			feature.append[newLine]
		}
		
		for (constraint: dType.constraints) {
			constraint.append[newLine]
		}
	}
	
	def dispatch void format(STypeDeduction type, extension IFormattableDocument document) {
		type.append[newLines = 2]
	}
}
