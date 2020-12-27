package com.mimacom.ddd.sm.sim.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.plantuml.TypeDiagramTextProviderData
import com.mimacom.ddd.dm.base.transpose.ITransposition
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
import com.mimacom.ddd.sm.sim.SimUtil
import com.mimacom.ddd.sm.sim.SystemInformationModel
import java.util.ArrayList
import org.eclipse.xtext.EcoreUtil2
import com.mimacom.ddd.dm.base.plantuml.AbstractTypeDiagramTextProviderImpl

class SimTypeDiagramTextProviderImpl extends AbstractTypeDiagramTextProviderImpl<SystemInformationModel> {

	@Inject extension SimUtil

	override canProvide(SystemInformationModel model) {
		model !== null && !(model.types.filter[!(it instanceof ITransposition)].empty && model.aggregates.filter [
			!(it instanceof ITransposition)
		].empty)
	}

	override TypeDiagramTextProviderData getData(SystemInformationModel model) {
		val TypeDiagramTextProviderData data = new TypeDiagramTextProviderData()
		data.allAggregates = EcoreUtil2.eAllOfType(model, DAggregate).filter[!(it instanceof TAggregateTransposition)]
		data.allAssociations = EcoreUtil2.eAllOfType(model, DAssociation).filter[!(it instanceof TAssociationTransposition)]
		data.allReferencedModels = data.allAssociations.filter[targetType.modelName != model.name].map[targetType.modelName].toSet
		data.allAggregatesReferencedWithinModel = new ArrayList<DAggregate>
		val allComplexAttributes = EcoreUtil2.eAllOfType(model, DAttribute).filter [
			!(it instanceof TAttributeTransposition) && !(eContainer instanceof TComplexTypeTransposition)
		].toSet
		data.allDetailAttributes = allComplexAttributes.filter[getType instanceof DDetailType]
		data.allSubtypes = EcoreUtil2.eAllOfType(model, DComplexType).filter[superType !== null]
		return data
	}
}
