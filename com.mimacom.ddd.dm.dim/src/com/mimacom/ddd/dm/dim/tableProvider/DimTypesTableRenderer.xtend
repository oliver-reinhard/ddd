package com.mimacom.ddd.dm.dim.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
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

class DimTypesTableRenderer implements ITableRenderer {

	static final Logger LOGGER = Logger.getLogger(DimTypesTableRenderer);

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
		val t = createTableWithHeader("Type", "Feature Name", "Primitive / Feature Type", "Description")
		if (root instanceof DInformationModel || root instanceof DAggregate) {
			val allTypes = EcoreUtil2.eAllOfType(root, DType)
			for (type : allTypes) {
				t.describe(type)
			}
		}
		return t
	}

	protected def dispatch void describe(Table t, DPrimitive p) {
		t.addDescriptionRow(#["Primitive " + p.name, "", "Redefines " + p.redefines.name], p.description)
	}

	protected def dispatch void describe(Table t, DEnumeration e) {
		t.addDescriptionRow(#["Enumeration " + e.name, "", ""], e.description)
	}

	protected def dispatch void describe(Table t, DDetailType d) {
		t.addDescriptionRow(#["Detail " + d.name, "", ""], d.description)
		for (f : d.features) {
			t.describe(f)
		}
	}

	protected def dispatch void describe(Table t, DEntityType e) {
		t.addDescriptionRow(#[(e.root ? "Root" : "") + "Entity " + e.name, "", ""], e.description)
		for (f : e.features) {
			t.describe(f)
		}
	}

	protected def dispatch void describe(Table t, DFeature f) {
		t.addDescriptionRow(#["", f.name, f.type.name + " " + f.multiplicityText], f.description)
	}
}
