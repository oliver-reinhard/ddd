package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import org.apache.log4j.Logger

class DemEventHeaderTableRenderer extends AbstractDemEventTableRenderer {

	static final Logger LOGGER = Logger.getLogger(DemEventHeaderTableRenderer);

	@Inject extension TypesUtil
	@Inject extension PubTableUtil

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val e = root as DemDomainEvent
		val t = createTableWithHeader("Element", "Name", "Type", "Description")
		t.addDescriptionRow(#["Event", e.name, ""], e.description)
		t.renderContext(e)
		t.renderTriggers(e)
		t.renderNotifications(e)
		return t
	}
	
	protected def void renderContext(Table t, DemDomainEvent e) {
		var first = true
		for (c : e.context) {
			if (first) {
				val row = t.addDescriptionRow(#["Context", c.name, c.describeType], c.description)
				row.cells.head.height = e.context.length
				first = false
			} else {
				t.addDescriptionRow(#[PubTableUtil::IGNORE_TABLE_CELL, c.name, c.describeType], c.description)
			}
		}
	}
	
	protected def void renderTriggers(Table t, DemDomainEvent e) {
		var first = true
		for (trigger : e.triggers) {
			if (first) {
				val row = t.addDescriptionRow(#["Triggers", trigger.name, ""], trigger.description)
				row.cells.head.height = e.triggers.length
				first = false
			} else {
				t.addDescriptionRow(#[PubTableUtil::IGNORE_TABLE_CELL, trigger.name, trigger.describeType], trigger.description)
			}
		}
	}
	
	protected def void renderNotifications(Table t, DemDomainEvent e) {
		var first = true
		for (n : e.notifications) {
			if (first) {
				val row = t.addDescriptionRow(#["Notifications", n.name, n.message.describeType], n.description)
				row.cells.head.height = e.notifications.length
				first = false
			} else {
				t.addDescriptionRow(#[PubTableUtil::IGNORE_TABLE_CELL, n.name, n.describeType], n.description)
			}
		}
	}
}
