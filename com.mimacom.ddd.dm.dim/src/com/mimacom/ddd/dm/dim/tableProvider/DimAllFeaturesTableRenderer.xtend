package com.mimacom.ddd.dm.dim.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.dm.dim.DimUtil
import com.mimacom.ddd.dm.dim.DomainInformationModel
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer
import org.apache.log4j.Logger
import org.eclipse.xtext.EcoreUtil2

class DimAllFeaturesTableRenderer implements ITableRenderer {

	static final Logger LOGGER = Logger.getLogger(DimAllFeaturesTableRenderer);

	@Inject extension DimUtil
	@Inject extension PubTableUtil

	override canRender(IDiagramRoot root) {
		if (root instanceof DomainInformationModel || root instanceof DAggregate) {
			val allFeatures = EcoreUtil2.eAllOfType(root, DFeature)
			return ! allFeatures.empty
		}
		return false
	}

	override Table render(IDiagramRoot root) {
		LOGGER.info(" for " + root)
		val t = createTableWithHeader("Type", "Feature Name", "Feature Type", "Description")
		if (root instanceof DomainInformationModel || root instanceof DAggregate) {
			val allTypes = EcoreUtil2.eAllOfType(root, DComplexType)
			for (type : allTypes) {
				val typeLabel = type.label
				var first = true
				for (f : type.features) {
					t.addRowWithDescription(#[first ? typeLabel : "", f.name, f.type.name + " " + f.multiplicityText],
						f.description)
					first = false
				}
			}
		}
		return t
	}
}
