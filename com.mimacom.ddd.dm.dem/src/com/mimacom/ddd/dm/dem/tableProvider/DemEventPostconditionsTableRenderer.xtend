package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DNamedPredicate
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.base.styledText.StyledTextUtil
import com.mimacom.ddd.dm.dem.DemCaseConjunction
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.generator.CodeListingFormatter
import org.apache.log4j.Logger

import static com.mimacom.ddd.pub.pub.PubTableUtil.IGNORE_TABLE_CELL

class DemEventPostconditionsTableRenderer extends AbstractDemEventTableRenderer {

	static final Logger LOGGER = Logger.getLogger(DemEventPostconditionsTableRenderer);

	@Inject extension StyledTextUtil
	@Inject extension PubTableUtil
	@Inject extension CodeListingFormatter

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val e = root as DemDomainEvent
		val t = createTableWithHeader("Outcome", "Postcondition", "Selector/Predicate")
		for (post : e.postconditionsDNF) {
			t.postcondition(post)
		}
		return t
	}

	protected def dispatch void postcondition(Table t, DNamedPredicate pred) {
		t.addRowWithDescription(#[pred.name, "", pred.predicate.sourceCode], pred.description)
	}

	protected def dispatch void postcondition(Table t, DemCaseConjunction conj) {
		var selectorSourceCode = conj.selector.sourceCode
		selectorSourceCode = selectorSourceCode.trimBlankLines
		t.addStyledTextRow(#[conj.name, conj.otherwise ? "OTHERWISE" : "WHEN", selectorSourceCode.monospace])
		var firstPredicate = true
		for (pred : conj.predicates) {
			val firstColValue = firstPredicate ? "" : IGNORE_TABLE_CELL
			var predSourceCode = pred.predicate.sourceCode
			predSourceCode = predSourceCode.trimBlankLines
			val predRow = t.addStyledTextRow(#[firstColValue, pred.name, predSourceCode.monospace])
			if (firstPredicate) {
				predRow.cells.head.height = conj.predicates.length
				firstPredicate = false
			}
		}
	}
}
