package com.mimacom.ddd.dm.dim.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.plantuml.AbstractTypeDiagramTextProviderImpl;
import com.mimacom.ddd.dm.base.plantuml.TypeDiagramTextProviderData;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DimTypeDiagramTextProviderImpl extends AbstractTypeDiagramTextProviderImpl<DomainInformationModel> {
  @Inject
  @Extension
  private DimUtil _dimUtil;
  
  @Override
  public boolean canProvide(final DomainInformationModel model) {
    return ((model != null) && (!(model.getTypes().isEmpty() && model.getAggregates().isEmpty())));
  }
  
  @Override
  public TypeDiagramTextProviderData getData(final DomainInformationModel model) {
    final TypeDiagramTextProviderData data = new TypeDiagramTextProviderData();
    data.allAggregates = EcoreUtil2.<DAggregate>eAllOfType(model, DAggregate.class);
    final Function1<DAssociation, Boolean> _function = (DAssociation it) -> {
      DType _type = it.getType();
      return Boolean.valueOf((_type instanceof DEntityType));
    };
    data.allAssociations = IterableExtensions.<DAssociation>filter(EcoreUtil2.<DAssociation>eAllOfType(model, DAssociation.class), _function);
    final Function1<DAssociation, Boolean> _function_1 = (DAssociation it) -> {
      return Boolean.valueOf(((!Objects.equal(it.getTargetType().eContainer(), it.eContainer().eContainer())) && Objects.equal(this._dimUtil.modelName(it.getTargetType()), model.getName())));
    };
    final Function1<DAssociation, DEntityType> _function_2 = (DAssociation it) -> {
      return it.getTargetType();
    };
    data.allEntitiesReferencedWithinModel = IterableExtensions.<DEntityType>toSet(IterableExtensions.<DAssociation, DEntityType>map(IterableExtensions.<DAssociation>filter(data.allAssociations, _function_1), _function_2));
    final Function1<DEntityType, DAggregate> _function_3 = (DEntityType it) -> {
      EObject _eContainer = it.eContainer();
      return ((DAggregate) _eContainer);
    };
    data.allAggregatesReferencedWithinModel = IterableExtensions.<DAggregate>toSet(IterableExtensions.<DEntityType, DAggregate>map(data.allEntitiesReferencedWithinModel, _function_3));
    final Function1<DAssociation, Boolean> _function_4 = (DAssociation it) -> {
      return Boolean.valueOf(((!Objects.equal(it.getTargetType().eContainer(), it.eContainer().eContainer())) && (!Objects.equal(this._dimUtil.modelName(it.getTargetType()), model.getName()))));
    };
    final Function1<DAssociation, DEntityType> _function_5 = (DAssociation it) -> {
      return it.getTargetType();
    };
    data.allEntitiesReferencedOutsideModel = IterableExtensions.<DEntityType>toSet(IterableExtensions.<DAssociation, DEntityType>map(IterableExtensions.<DAssociation>filter(data.allAssociations, _function_4), _function_5));
    final Function1<DEntityType, String> _function_6 = (DEntityType it) -> {
      return this._dimUtil.modelName(it);
    };
    data.allReferencedModels = IterableExtensions.<String>toSet(IterableExtensions.<DEntityType, String>map(data.allEntitiesReferencedOutsideModel, _function_6));
    final Function1<DAttribute, Boolean> _function_7 = (DAttribute it) -> {
      DType _type = it.getType();
      return Boolean.valueOf((_type instanceof DDetailType));
    };
    data.allDetailAttributes = IterableExtensions.<DAttribute>filter(EcoreUtil2.<DAttribute>eAllOfType(model, DAttribute.class), _function_7);
    final Function1<DComplexType, Boolean> _function_8 = (DComplexType it) -> {
      DComplexType _superType = it.getSuperType();
      return Boolean.valueOf((_superType != null));
    };
    data.allSubtypes = IterableExtensions.<DComplexType>filter(EcoreUtil2.<DComplexType>eAllOfType(model, DComplexType.class), _function_8);
    data.allNotes = EcoreUtil2.<DNote>eAllOfType(model, DNote.class);
    return data;
  }
}
