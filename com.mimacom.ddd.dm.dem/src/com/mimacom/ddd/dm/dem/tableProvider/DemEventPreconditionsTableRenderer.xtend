package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.base.styledText.StyledTextUtil
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import org.apache.log4j.Logger

class DemEventPreconditionsTableRenderer extends AbstractDemEventTableRenderer {

	static final Logger LOGGER = Logger.getLogger(DemEventPreconditionsTableRenderer);

	@Inject extension StyledTextUtil
	@Inject extension PubTableUtil

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val e = root as DemDomainEvent
		val t = createTableWithHeader("Precondition", "Predicate")
		for (pre : e.preconditionsCNF) {
			var sourceCode = pre.predicate.sourceCode
			t.addStyledTextRow(#[pre.name, sourceCode.monospace])
		}
		return t
	}
}
