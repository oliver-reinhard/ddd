package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.dem.DemCaseConjunction
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import org.apache.log4j.Logger
import com.mimacom.ddd.dm.base.DNamedPredicate

class DemEventPostconditionsTableRenderer extends AbstractDemEventTableRenderer {

	static final Logger LOGGER = Logger.getLogger(DemEventPostconditionsTableRenderer);

	@Inject extension PubTableUtil

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val e = root as DemDomainEvent
		val t = createTableWithHeader("Outcome", "", "Selector/Predicate", "Description")
		for (post : e.postconditionsDNF) {
			t.postcondition(post)
		}
		return t
	}
	
	protected def dispatch void postcondition(Table t, DNamedPredicate pred) {
		t.addDescriptionRow(#[pred.name, "", pred.predicate.serialize], pred.description)
	}
	
	protected def dispatch void postcondition(Table t, DemCaseConjunction conj) {
		t.addDescriptionRow(#[conj.name, "WHEN", conj.otherwise ? "OTHERWISE" : conj.selector.serialize], conj.description)
		var first = true
		for (pred : conj.predicates) {
			if (first) {
				val row = t.addDescriptionRow(#["", pred.name, pred.predicate.serialize], pred.description)
				row.cells.head.height = conj.predicates.length
				first = false
			} else {
				t.addDescriptionRow(#[PubTableUtil::IGNORE_TABLE_CELL, pred.name, pred.predicate.serialize], pred.description)
			}
		}
	}
}
