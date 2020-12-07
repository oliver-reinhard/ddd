package com.mimacom.ddd.dm.div.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.plantuml.TypeDiagramTextProviderData;
import com.mimacom.ddd.dm.base.plantuml.TypeDiagramTextProviderImpl;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition;
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.dm.div.DomainInformationView;
import java.util.ArrayList;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DivTypeDiagramTextProviderImpl extends TypeDiagramTextProviderImpl<DomainInformationView> {
  @Inject
  @Extension
  private DimUtil _dimUtil;
  
  @Override
  public boolean canProvide(final DomainInformationView model) {
    return ((model != null) && (!(IterableExtensions.isEmpty(IterableExtensions.<DType>filter(model.getTypes(), ((Function1<DType, Boolean>) (DType it) -> {
      return Boolean.valueOf((!(it instanceof ITransposition)));
    }))) && IterableExtensions.isEmpty(IterableExtensions.<DAggregate>filter(model.getAggregates(), ((Function1<DAggregate, Boolean>) (DAggregate it) -> {
      return Boolean.valueOf((!(it instanceof ITransposition)));
    }))))));
  }
  
  @Override
  public TypeDiagramTextProviderData getData(final DomainInformationView model) {
    final TypeDiagramTextProviderData data = new TypeDiagramTextProviderData();
    final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
      return Boolean.valueOf((!(it instanceof TAggregateTransposition)));
    };
    data.allAggregates = IterableExtensions.<DAggregate>filter(EcoreUtil2.<DAggregate>eAllOfType(model, DAggregate.class), _function);
    final Function1<DAssociation, Boolean> _function_1 = (DAssociation it) -> {
      return Boolean.valueOf((!(it instanceof TAssociationTransposition)));
    };
    data.allAssociations = IterableExtensions.<DAssociation>filter(EcoreUtil2.<DAssociation>eAllOfType(model, DAssociation.class), _function_1);
    final Function1<DAssociation, Boolean> _function_2 = (DAssociation it) -> {
      String _modelName = this._dimUtil.modelName(it.getTargetType());
      String _name = model.getName();
      return Boolean.valueOf((!Objects.equal(_modelName, _name)));
    };
    final Function1<DAssociation, String> _function_3 = (DAssociation it) -> {
      return this._dimUtil.modelName(it.getTargetType());
    };
    data.allReferencedModels = IterableExtensions.<String>toSet(IterableExtensions.<DAssociation, String>map(IterableExtensions.<DAssociation>filter(data.allAssociations, _function_2), _function_3));
    ArrayList<DAggregate> _arrayList = new ArrayList<DAggregate>();
    data.allAggregatesReferencedWithinModel = _arrayList;
    final Function1<DAttribute, Boolean> _function_4 = (DAttribute it) -> {
      return Boolean.valueOf(((!(it instanceof TAttributeTransposition)) && (!(it.eContainer() instanceof TComplexTypeTransposition))));
    };
    final Set<DAttribute> allComplexAttributes = IterableExtensions.<DAttribute>toSet(IterableExtensions.<DAttribute>filter(EcoreUtil2.<DAttribute>eAllOfType(model, DAttribute.class), _function_4));
    final Function1<DAttribute, Boolean> _function_5 = (DAttribute it) -> {
      DType _type = it.getType();
      return Boolean.valueOf((_type instanceof DDetailType));
    };
    data.allDetailAttributes = IterableExtensions.<DAttribute>filter(allComplexAttributes, _function_5);
    final Function1<DComplexType, Boolean> _function_6 = (DComplexType it) -> {
      DComplexType _superType = it.getSuperType();
      return Boolean.valueOf((_superType != null));
    };
    data.allSubtypes = IterableExtensions.<DComplexType>filter(EcoreUtil2.<DComplexType>eAllOfType(model, DComplexType.class), _function_6);
    return data;
  }
  
  @Override
  public CharSequence generateSkinParameters() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("skinparam package {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BorderColor FireBrick");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FontColor FireBrick");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
