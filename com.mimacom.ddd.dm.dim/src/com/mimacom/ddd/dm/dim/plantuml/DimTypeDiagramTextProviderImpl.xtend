package com.mimacom.ddd.dm.dim.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DNote
import com.mimacom.ddd.dm.base.plantuml.TypeDiagramTextProviderData
import com.mimacom.ddd.dm.dim.DimUtil
import com.mimacom.ddd.dm.dim.DomainInformationModel
import org.eclipse.xtext.EcoreUtil2
import com.mimacom.ddd.dm.base.plantuml.AbstractTypeDiagramTextProviderImpl

class DimTypeDiagramTextProviderImpl extends AbstractTypeDiagramTextProviderImpl<DomainInformationModel> {

	@Inject extension DimUtil

	override canProvide(DomainInformationModel model) {
		model !== null && ! (model.types.empty && model.aggregates.empty)
	}

	override TypeDiagramTextProviderData getData(DomainInformationModel model) {
		val TypeDiagramTextProviderData data = new TypeDiagramTextProviderData()
		data.allAggregates = EcoreUtil2.eAllOfType(model, DAggregate)
		data.allAssociations = EcoreUtil2.eAllOfType(model, DAssociation).filter[getType instanceof DEntityType]
		data.allEntitiesReferencedWithinModel = data.allAssociations.filter [
			targetType.eContainer != eContainer.eContainer && targetType.modelName == model.name
		].map[targetType].toSet
		data.allAggregatesReferencedWithinModel = data.allEntitiesReferencedWithinModel.map[eContainer as DAggregate].toSet
		data.allEntitiesReferencedOutsideModel = data.allAssociations.filter [
			targetType.eContainer != eContainer.eContainer && targetType.modelName != model.name
		].map[targetType].toSet
		data.allReferencedModels = data.allEntitiesReferencedOutsideModel.map[modelName].toSet
		data.allDetailAttributes = EcoreUtil2.eAllOfType(model, DAttribute).filter[getType instanceof DDetailType]
		data.allSubtypes = EcoreUtil2.eAllOfType(model, DComplexType).filter[superType !== null]
		data.allNotes = EcoreUtil2.eAllOfType(model, DNote)
		return data
	}
}
