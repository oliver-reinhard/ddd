package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DImplicitDeduction;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.derivedState.TypeMappingUtil;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SyntheticModelElementsFactory {
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  private static final SimFactory SIM = SimFactory.eINSTANCE;
  
  @Inject
  @Extension
  private TypeMappingUtil _typeMappingUtil;
  
  public DAggregate addSyntheticAggregate(final SInformationModel container, final String name, final IDeductionDefinition deductionDefinition) {
    final DAggregate syntheticAggregate = SyntheticModelElementsFactory.BASE.createDAggregate();
    syntheticAggregate.setName(name);
    syntheticAggregate.setSynthetic(true);
    syntheticAggregate.setDeducedFrom(deductionDefinition);
    container.getAggregates().add(syntheticAggregate);
    return syntheticAggregate;
  }
  
  protected DPrimitive _addSyntheticType(final ITypeContainer container, final String name, final DPrimitive source, final IDeductionDefinition deductionDefinition) {
    final DPrimitive syntheticPrimitive = SyntheticModelElementsFactory.BASE.createDPrimitive();
    this.initSyntheticType(syntheticPrimitive, container, name, source, deductionDefinition);
    syntheticPrimitive.setRedefines(source.getRedefines());
    return syntheticPrimitive;
  }
  
  protected DEnumeration _addSyntheticType(final ITypeContainer container, final String name, final DEnumeration source, final IDeductionDefinition deductionDefinition) {
    final DEnumeration syntheticEnumeration = SyntheticModelElementsFactory.BASE.createDEnumeration();
    this.initSyntheticType(syntheticEnumeration, container, name, source, deductionDefinition);
    return syntheticEnumeration;
  }
  
  protected DComplexType _addSyntheticType(final ITypeContainer container, final String name, final DComplexType source, final IDeductionDefinition deductionDefinition) {
    SInformationModelKind _kind = EcoreUtil2.<SInformationModel>getContainerOfType(container, SInformationModel.class).getKind();
    final boolean isCoreModel = Objects.equal(_kind, SInformationModelKind.CORE);
    DComplexType _xifexpression = null;
    if (((!isCoreModel) || this.makeDetailType(deductionDefinition.getDeductionRule(), source))) {
      _xifexpression = SyntheticModelElementsFactory.BASE.createDDetailType();
    } else {
      _xifexpression = SyntheticModelElementsFactory.BASE.createDEntityType();
    }
    final DComplexType syntheticComplexType = _xifexpression;
    this.initSyntheticType(syntheticComplexType, container, name, source, deductionDefinition);
    syntheticComplexType.setAbstract(this.makeAbstract(deductionDefinition.getDeductionRule(), source));
    if ((syntheticComplexType instanceof DEntityType)) {
      ((DEntityType)syntheticComplexType).setRoot(this.makeRoot(deductionDefinition.getDeductionRule(), source));
    }
    container.getTypes().add(syntheticComplexType);
    return syntheticComplexType;
  }
  
  protected DPrimitive _addSyntheticTypeAsCopy(final ITypeContainer container, final DPrimitive original) {
    final DPrimitive syntheticPrimitive = SyntheticModelElementsFactory.BASE.createDPrimitive();
    this.initSyntheticType(syntheticPrimitive, container, original.getName(), original, null);
    return syntheticPrimitive;
  }
  
  protected DEnumeration _addSyntheticTypeAsCopy(final ITypeContainer container, final DEnumeration original) {
    final DEnumeration syntheticEnumeration = SyntheticModelElementsFactory.BASE.createDEnumeration();
    this.initSyntheticType(syntheticEnumeration, container, original.getName(), original, null);
    EList<DLiteral> _literals = original.getLiterals();
    for (final DLiteral literal : _literals) {
      this.addSyntheticLiteralAsCopy(syntheticEnumeration, literal.getName(), literal);
    }
    return syntheticEnumeration;
  }
  
  protected DEntityType _addSyntheticTypeAsCopy(final ITypeContainer container, final DEntityType original) {
    final DEntityType syntheticEntity = SyntheticModelElementsFactory.BASE.createDEntityType();
    this.initSyntheticType(syntheticEntity, container, original.getName(), original, null);
    syntheticEntity.setAbstract(original.isAbstract());
    syntheticEntity.setSuperType(original.getSuperType());
    syntheticEntity.setRoot(original.isRoot());
    syntheticEntity.setNature(original.getNature());
    return syntheticEntity;
  }
  
  protected DDetailType _addSyntheticTypeAsCopy(final ITypeContainer container, final DDetailType original) {
    final DDetailType syntheticEntity = SyntheticModelElementsFactory.BASE.createDDetailType();
    this.initSyntheticType(syntheticEntity, container, original.getName(), original, null);
    syntheticEntity.setAbstract(original.isAbstract());
    syntheticEntity.setSuperType(original.getSuperType());
    return syntheticEntity;
  }
  
  protected void initSyntheticType(final DType syntheticType, final ITypeContainer container, final String name, final DType original, final IDeductionDefinition deductionDefinition) {
    syntheticType.setName(name);
    syntheticType.getAliases().addAll(original.getAliases());
    syntheticType.setSynthetic(true);
    syntheticType.setDeducedFrom(deductionDefinition);
    container.getTypes().add(syntheticType);
  }
  
  public DFeature addSyntheticFeature(final IFeatureContainer container, final String name, final DFeature source, final IDeductionDefinition deductionDefinition) {
    final DType sourceFeatureType = source.getType();
    if ((sourceFeatureType == null)) {
      return null;
    }
    final DType featureTypeProxy = this._typeMappingUtil.getSystemTypeProxy(deductionDefinition, sourceFeatureType);
    DFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DQuery) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.BASE.createDQuery();
    }
    if (!_matched) {
      if (source instanceof DAttribute || source instanceof DAssociation) {
        _matched=true;
        DFeature _xblockexpression = null;
        {
          DType featureType = this.findLocalTypeMappingFor(container, source.getType());
          if ((featureType == null)) {
            final DAttribute tempFeature = SyntheticModelElementsFactory.BASE.createDAttribute();
            container.getFeatures().add(tempFeature);
            tempFeature.setType(featureTypeProxy);
            featureType = tempFeature.getType();
            container.getFeatures().remove(tempFeature);
          }
          DFeature _xifexpression = null;
          if (((featureType instanceof IIdentityType) || ((featureType == null) && (source instanceof DAssociation)))) {
            _xifexpression = SyntheticModelElementsFactory.BASE.createDAssociation();
          } else {
            _xifexpression = SyntheticModelElementsFactory.BASE.createDAttribute();
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    final DFeature syntheticFeature = _switchResult;
    syntheticFeature.setName(name);
    syntheticFeature.getAliases().addAll(source.getAliases());
    syntheticFeature.setType(featureTypeProxy);
    syntheticFeature.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticFeature.setSynthetic(true);
    syntheticFeature.setDeducedFrom(deductionDefinition);
    container.getFeatures().add(syntheticFeature);
    return syntheticFeature;
  }
  
  public DFeature addSyntheticFeatureAsCopy(final IFeatureContainer container, final DFeature source) {
    DFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.BASE.createDAttribute();
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.BASE.createDQuery();
      }
    }
    if (!_matched) {
      if (source instanceof DAssociation) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.BASE.createDAssociation();
      }
    }
    final DFeature syntheticFeature = _switchResult;
    container.getFeatures().add(syntheticFeature);
    this.initSyntheticFeatureAsCopy(syntheticFeature, source);
    return syntheticFeature;
  }
  
  public DFeature addSyntheticQueryAsCopy(final DAggregate container, final DQuery source) {
    final DQuery syntheticFeature = SyntheticModelElementsFactory.BASE.createDQuery();
    container.getFeatures().add(syntheticFeature);
    this.initSyntheticFeatureAsCopy(syntheticFeature, source);
    return syntheticFeature;
  }
  
  private void initSyntheticFeatureAsCopy(final DFeature syntheticFeature, final DFeature source) {
    syntheticFeature.setName(source.getName());
    syntheticFeature.getAliases().addAll(source.getAliases());
    syntheticFeature.setType(source.getType());
    syntheticFeature.setMultiplicity(source.getMultiplicity());
    syntheticFeature.setSynthetic(true);
    syntheticFeature.setDeducedFrom(null);
    if ((source instanceof DQuery)) {
      EList<DQueryParameter> _parameters = ((DQuery)source).getParameters();
      for (final DQueryParameter p : _parameters) {
        this.addSyntheticQueryParameterAsCopy(((DQuery) syntheticFeature), p);
      }
    }
  }
  
  public DQueryParameter addSyntheticQueryParameter(final DQuery container, final String name, final DQueryParameter source, final IDeductionDefinition deductionDefinition) {
    final DType sourceParameterType = source.getType();
    if ((sourceParameterType == null)) {
      return null;
    }
    final DQueryParameter syntheticParameter = SyntheticModelElementsFactory.BASE.createDQueryParameter();
    syntheticParameter.setName(name);
    syntheticParameter.setType(this._typeMappingUtil.getSystemTypeProxy(deductionDefinition, sourceParameterType));
    syntheticParameter.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticParameter.setSynthetic(true);
    syntheticParameter.setDeducedFrom(deductionDefinition);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public DQueryParameter addSyntheticQueryParameterAsCopy(final DQuery container, final DQueryParameter source) {
    final DQueryParameter syntheticParameter = SyntheticModelElementsFactory.BASE.createDQueryParameter();
    syntheticParameter.setName(source.getName());
    syntheticParameter.setType(source.getType());
    syntheticParameter.setMultiplicity(source.getMultiplicity());
    syntheticParameter.setSynthetic(true);
    syntheticParameter.setDeducedFrom(null);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public void addSyntheticLiteral(final DEnumeration container, final String name, final DLiteral source, final IDeductionDefinition deductionDefinition) {
    final DLiteral syntheticLiteral = SyntheticModelElementsFactory.BASE.createDLiteral();
    syntheticLiteral.setName(name);
    syntheticLiteral.getAliases().addAll(source.getAliases());
    syntheticLiteral.setSynthetic(true);
    syntheticLiteral.setDeducedFrom(deductionDefinition);
    container.getLiterals().add(syntheticLiteral);
  }
  
  public void addSyntheticLiteralAsCopy(final DEnumeration container, final String name, final DLiteral original) {
    this.addSyntheticLiteral(container, name, original, null);
  }
  
  protected DMultiplicity grabMultiplicity(final DMultiplicity source) {
    DMultiplicity result = null;
    if ((source != null)) {
      result = SyntheticModelElementsFactory.BASE.createDMultiplicity();
      result.setMinOccurs(source.getMinOccurs());
      result.setMaxOccurs(source.getMaxOccurs());
    }
    return result;
  }
  
  protected boolean _makeAbstract(final SStructureChangingRule r, final DComplexType source) {
    STristate _abstract = r.getAbstract();
    boolean _equals = Objects.equal(_abstract, STristate.DONT_CARE);
    if (_equals) {
      return source.isAbstract();
    }
    STristate _abstract_1 = r.getAbstract();
    return Objects.equal(_abstract_1, STristate.TRUE);
  }
  
  protected boolean _makeAbstract(final DDeductionRule r, final DComplexType source) {
    return source.isAbstract();
  }
  
  protected boolean _makeRoot(final SStructureChangingRule r, final DComplexType source) {
    STristate _rootEntity = r.getRootEntity();
    boolean _equals = Objects.equal(_rootEntity, STristate.DONT_CARE);
    if (_equals) {
      return ((source instanceof DEntityType) && ((DEntityType) source).isRoot());
    }
    STristate _rootEntity_1 = r.getRootEntity();
    return Objects.equal(_rootEntity_1, STristate.TRUE);
  }
  
  protected boolean _makeRoot(final DDeductionRule r, final DComplexType source) {
    return ((source instanceof DEntityType) && ((DEntityType) source).isRoot());
  }
  
  protected boolean _makeDetailType(final SMorphRule r, final DComplexType source) {
    STristate _detail = r.getDetail();
    boolean _equals = Objects.equal(_detail, STristate.DONT_CARE);
    if (_equals) {
      return (source instanceof DDetailType);
    }
    STristate _detail_1 = r.getDetail();
    return Objects.equal(_detail_1, STristate.TRUE);
  }
  
  protected boolean _makeDetailType(final DDeductionRule r, final DComplexType source) {
    return (source instanceof DDetailType);
  }
  
  protected DType findLocalTypeMappingFor(final EObject context, final DType source) {
    final Function1<DType, Boolean> _function = (DType it) -> {
      return Boolean.valueOf((!(it instanceof IDeductionDefinition)));
    };
    final Iterator<DType> types = IteratorExtensions.<DType>filter(Iterators.<DType>filter(context.eResource().getAllContents(), DType.class), _function);
    final Function1<DType, Boolean> _function_1 = (DType it) -> {
      IDeductionDefinition _deducedFrom = it.getDeducedFrom();
      DDeductionRule _deductionRule = null;
      if (_deducedFrom!=null) {
        _deductionRule=_deducedFrom.getDeductionRule();
      }
      IDeducibleElement _source = null;
      if (_deductionRule!=null) {
        _source=_deductionRule.getSource();
      }
      return Boolean.valueOf((_source == source));
    };
    final Iterator<DType> candidates = IteratorExtensions.<DType>filter(types, _function_1);
    return IteratorExtensions.<DType>head(candidates);
  }
  
  public DImplicitDeduction createImplicitElementCopyDeduction(final IDeductionDefinition originalDeductionDefinition, final IDeducibleElement source) {
    final DImplicitDeduction implicitDeduction = SyntheticModelElementsFactory.BASE.createDImplicitDeduction();
    originalDeductionDefinition.getImpliedDeductions().add(implicitDeduction);
    implicitDeduction.setOriginalDeductionDefinition(originalDeductionDefinition);
    final SGrabRule grabRule = SyntheticModelElementsFactory.SIM.createSGrabRule();
    grabRule.setSource(source);
    implicitDeduction.setDeductionRule(grabRule);
    return implicitDeduction;
  }
  
  public DType addSyntheticType(final ITypeContainer container, final String name, final DType source, final IDeductionDefinition deductionDefinition) {
    if (source instanceof DEnumeration) {
      return _addSyntheticType(container, name, (DEnumeration)source, deductionDefinition);
    } else if (source instanceof DPrimitive) {
      return _addSyntheticType(container, name, (DPrimitive)source, deductionDefinition);
    } else if (source instanceof DComplexType) {
      return _addSyntheticType(container, name, (DComplexType)source, deductionDefinition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, name, source, deductionDefinition).toString());
    }
  }
  
  public DType addSyntheticTypeAsCopy(final ITypeContainer container, final DType original) {
    if (original instanceof DDetailType) {
      return _addSyntheticTypeAsCopy(container, (DDetailType)original);
    } else if (original instanceof DEntityType) {
      return _addSyntheticTypeAsCopy(container, (DEntityType)original);
    } else if (original instanceof DEnumeration) {
      return _addSyntheticTypeAsCopy(container, (DEnumeration)original);
    } else if (original instanceof DPrimitive) {
      return _addSyntheticTypeAsCopy(container, (DPrimitive)original);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, original).toString());
    }
  }
  
  protected boolean makeAbstract(final DDeductionRule r, final DComplexType source) {
    if (r instanceof SStructureChangingRule) {
      return _makeAbstract((SStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeAbstract(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeRoot(final DDeductionRule r, final DComplexType source) {
    if (r instanceof SStructureChangingRule) {
      return _makeRoot((SStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeRoot(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeDetailType(final DDeductionRule r, final DComplexType source) {
    if (r instanceof SMorphRule) {
      return _makeDetailType((SMorphRule)r, source);
    } else if (r != null) {
      return _makeDetailType(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
}
