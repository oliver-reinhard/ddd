package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DNamedPredicate
import com.mimacom.ddd.dm.base.base.DRichText
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.dm.base.richText.RichTextUtil
import com.mimacom.ddd.dm.base.styledText.StyledTextUtil
import com.mimacom.ddd.dm.dem.DemCaseConjunction
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import org.apache.log4j.Logger

import static com.mimacom.ddd.pub.pub.PubTableUtil.IGNORE_TABLE_CELL

class DemEventTableRenderer extends AbstractDemEventTableRenderer {

	static final Logger LOGGER = Logger.getLogger(DemEventTableRenderer);

	@Inject extension TypesUtil
	@Inject extension StyledTextUtil
	@Inject extension RichTextUtil
	@Inject extension PubTableUtil

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val e = root as DemDomainEvent
		val t = createTableWithHeader("Compartment", "Name", "Type/Predicate", "Description")
		t.addStyledTextRowWithDescription(#["Event".strong, e.name, ""], e.description)
		t.renderContext(e)
		t.renderTriggers(e)
		t.renderNotifications(e)
		t.renderPreconditions(e)
		t.renderPostconditions(e)
		return t
	}

	protected def void renderContext(Table t, DemDomainEvent e) {
		var firstRow = true
		for (c : e.context) {
			val firstColValue = firstRow ? "Context".strong : IGNORE_TABLE_CELL
			val row = t.addStyledTextRowWithDescription(#[firstColValue, c.name.keyword, c.describeType.escapeStyledText], c.description)
			if (firstRow) {
				row.cells.head.height = e.context.length
				firstRow = false
			}
		}
	}

	protected def void renderTriggers(Table t, DemDomainEvent e) {
		var firstRow = true
		for (trigger : e.triggers.filter[actor !== null]) {
			val firstColValue = firstRow ? "Triggers".strong : IGNORE_TABLE_CELL
			val row = t.addStyledTextRowWithDescription(#[firstColValue, trigger.actor.name, ""],	trigger.actor.description)
			if (firstRow) {
				row.cells.head.height = e.triggers.length
				firstRow = false
			}
		}
	}

	protected def void renderNotifications(Table t, DemDomainEvent e) {
		var firstRow = true
		for (n : e.notifications) {
			val firstColValue = firstRow ? "Notifications".strong : IGNORE_TABLE_CELL
			val row = t.addStyledTextRowWithDescription(#[firstColValue, n.name, n.message.describeType.escapeStyledText], n.description)
			if (firstRow) {
				row.cells.head.height = e.notifications.length
				firstRow = false
			}
		}
	}

	protected def void renderPreconditions(Table t, DemDomainEvent e) {
		var firstRow = true
		for (pre : e.preconditionsCNF) {
			val firstColValue = firstRow ? "Preconditions".strong : IGNORE_TABLE_CELL
			val row = t.addStyledTextRowWithDescription(#[firstColValue, pre.name, ""], pre.description.ensureNotEmpty)
			if (firstRow) {
				row.cells.head.height = e.notifications.length
				firstRow = false
			}
		}
	}

	protected def void renderPostconditions(Table t, DemDomainEvent e) {
		var tableLines = e.postconditionsDNF.length
		for (post : e.postconditionsDNF) {
			if (post instanceof DemCaseConjunction) {
				tableLines = tableLines + post.predicates.length
			}
		}
		var firstRow = true
		for (post : e.postconditionsDNF) {
			t.postcondition(post, firstRow, tableLines)
			firstRow = false
		}
	}

	protected def dispatch void postcondition(Table t, DNamedPredicate pred, boolean firstRow, int vspan) {
		val firstColValue = firstRow ? "Postconditions".strong : IGNORE_TABLE_CELL
		val row = t.addStyledTextRowWithDescription(#[firstColValue, pred.name, ""],
			pred.description.ensureNotEmpty)
		if (firstRow) {
			row.cells.head.height = vspan
		}
	}

	protected def dispatch void postcondition(Table t, DemCaseConjunction conj, boolean firstConjuction, int vspan) {
		val firstColValue = firstConjuction ? "Postconditions".strong : IGNORE_TABLE_CELL
		val row = t.addStyledTextRowWithDescription(
			#[firstColValue, conj.name, (conj.otherwise ? "OTHERWISE" : "WHEN").emphasis], conj.description.ensureNotEmpty)
		if (firstConjuction) {
			row.cells.head.height = vspan
		}

		var firstPredicate = true
		for (pred : conj.predicates) {
			val secondColValue = firstPredicate ? "" : IGNORE_TABLE_CELL
			val predRow = t.addRowWithDescription(#[IGNORE_TABLE_CELL, secondColValue, pred.name], pred.description.ensureNotEmpty)
			if (firstPredicate) {
				predRow.cells.head.height = conj.predicates.length
				firstPredicate = false
			}
		}
	}

	protected def DRichText ensureNotEmpty(DRichText text) {
		return text.empty ? "* * TO DO * *".toRichText : text
	}
}
