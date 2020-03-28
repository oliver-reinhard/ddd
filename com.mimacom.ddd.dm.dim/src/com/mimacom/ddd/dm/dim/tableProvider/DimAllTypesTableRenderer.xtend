package com.mimacom.ddd.dm.dim.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DInformationModel
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.dim.DimUtil
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer
import org.apache.log4j.Logger
import org.eclipse.xtext.EcoreUtil2

class DimAllTypesTableRenderer implements ITableRenderer {

	static final Logger LOGGER = Logger.getLogger(DimAllTypesTableRenderer);

	@Inject extension DimUtil
	@Inject extension PubTableUtil

	override canRender(IDiagramRoot root) {
		if (root instanceof DInformationModel || root instanceof DAggregate) {
			val allTypes = EcoreUtil2.eAllOfType(root, DType)
			return ! allTypes.empty
		}
		return false
	}

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val t = createTableWithHeader("Type", "Description")
		if (root instanceof DInformationModel || root instanceof DAggregate) {
			val allTypes = EcoreUtil2.eAllOfType(root, DType)
			for (type : allTypes) {
				t.describe(type)
			}
		}
		return t
	}

	protected def dispatch void describe(Table t, DPrimitive p) {
		t.addRowWithDescription(#[p.label + " redefines " + p.redefines.name], p.description)
	}

	protected def dispatch void describe(Table t, DType type) {
		t.addRowWithDescription(#[type.label], type.description)
	}
}
