package com.mimacom.ddd.dm.base.transpose;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.BaseFactory;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.IIdentityType;
import com.mimacom.ddd.dm.base.base.ITransposableElement;
import com.mimacom.ddd.dm.base.base.ITransposition;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.TImplicitTransposition;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule;
import com.mimacom.ddd.dm.base.transpose.TTristate;
import com.mimacom.ddd.dm.base.transpose.TransposeFactory;
import com.mimacom.ddd.dm.base.transpose.TypeMappingUtil;
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
  
  private static final TransposeFactory TRANSPOSE = TransposeFactory.eINSTANCE;
  
  @Inject
  @Extension
  private TypeMappingUtil _typeMappingUtil;
  
  public DAggregate addSyntheticAggregate(final TInformationModel container, final String name, final ITransposition recipe) {
    final DAggregate syntheticAggregate = SyntheticModelElementsFactory.BASE.createDAggregate();
    syntheticAggregate.setName(name);
    syntheticAggregate.setSynthetic(true);
    syntheticAggregate.setTransposedBy(recipe);
    container.getAggregates().add(syntheticAggregate);
    return syntheticAggregate;
  }
  
  protected DPrimitive _addSyntheticType(final ITypeContainer container, final String name, final DPrimitive source, final ITransposition recipe) {
    final DPrimitive syntheticPrimitive = SyntheticModelElementsFactory.BASE.createDPrimitive();
    this.initSyntheticType(syntheticPrimitive, container, name, source, recipe);
    syntheticPrimitive.setRedefines(source.getRedefines());
    return syntheticPrimitive;
  }
  
  protected DEnumeration _addSyntheticType(final ITypeContainer container, final String name, final DEnumeration source, final ITransposition recipe) {
    final DEnumeration syntheticEnumeration = SyntheticModelElementsFactory.BASE.createDEnumeration();
    this.initSyntheticType(syntheticEnumeration, container, name, source, recipe);
    return syntheticEnumeration;
  }
  
  protected DComplexType _addSyntheticType(final ITypeContainer container, final String name, final DComplexType source, final ITransposition recipe) {
    final boolean allowsIdentityTypes = EcoreUtil2.<TInformationModel>getContainerOfType(container, TInformationModel.class).allowsIdentityTypes();
    DComplexType _xifexpression = null;
    if (((!allowsIdentityTypes) || this.makeDetailType(recipe.getTranspositionRule(), source))) {
      _xifexpression = SyntheticModelElementsFactory.BASE.createDDetailType();
    } else {
      _xifexpression = SyntheticModelElementsFactory.BASE.createDEntityType();
    }
    final DComplexType syntheticComplexType = _xifexpression;
    this.initSyntheticType(syntheticComplexType, container, name, source, recipe);
    syntheticComplexType.setAbstract(this.makeAbstract(recipe.getTranspositionRule(), source));
    if ((syntheticComplexType instanceof DEntityType)) {
      ((DEntityType)syntheticComplexType).setRoot(this.makeRoot(recipe.getTranspositionRule(), source));
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
  
  protected void initSyntheticType(final DType syntheticType, final ITypeContainer container, final String name, final DType original, final ITransposition recipe) {
    syntheticType.setName(name);
    syntheticType.getAliases().addAll(original.getAliases());
    syntheticType.setSynthetic(true);
    syntheticType.setTransposedBy(recipe);
    container.getTypes().add(syntheticType);
  }
  
  public DFeature addSyntheticFeature(final IFeatureContainer container, final String name, final DFeature source, final ITransposition recipe) {
    final DType sourceFeatureType = source.getType();
    if ((sourceFeatureType == null)) {
      return null;
    }
    final DType featureTypeProxy = this._typeMappingUtil.getTransposedTypeProxy(recipe, sourceFeatureType);
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
    syntheticFeature.setTransposedBy(recipe);
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
    syntheticFeature.setTransposedBy(null);
    if ((source instanceof DQuery)) {
      EList<DQueryParameter> _parameters = ((DQuery)source).getParameters();
      for (final DQueryParameter p : _parameters) {
        this.addSyntheticQueryParameterAsCopy(((DQuery) syntheticFeature), p);
      }
    }
  }
  
  public DQueryParameter addSyntheticQueryParameter(final DQuery container, final String name, final DQueryParameter source, final ITransposition recipe) {
    final DType sourceParameterType = source.getType();
    if ((sourceParameterType == null)) {
      return null;
    }
    final DQueryParameter syntheticParameter = SyntheticModelElementsFactory.BASE.createDQueryParameter();
    syntheticParameter.setName(name);
    syntheticParameter.setType(this._typeMappingUtil.getTransposedTypeProxy(recipe, sourceParameterType));
    syntheticParameter.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticParameter.setSynthetic(true);
    syntheticParameter.setTransposedBy(recipe);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public DQueryParameter addSyntheticQueryParameterAsCopy(final DQuery container, final DQueryParameter source) {
    final DQueryParameter syntheticParameter = SyntheticModelElementsFactory.BASE.createDQueryParameter();
    syntheticParameter.setName(source.getName());
    syntheticParameter.setType(source.getType());
    syntheticParameter.setMultiplicity(source.getMultiplicity());
    syntheticParameter.setSynthetic(true);
    syntheticParameter.setTransposedBy(null);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public void addSyntheticLiteral(final DEnumeration container, final String name, final DLiteral source, final ITransposition recipe) {
    final DLiteral syntheticLiteral = SyntheticModelElementsFactory.BASE.createDLiteral();
    syntheticLiteral.setName(name);
    syntheticLiteral.getAliases().addAll(source.getAliases());
    syntheticLiteral.setSynthetic(true);
    syntheticLiteral.setTransposedBy(recipe);
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
  
  protected boolean _makeAbstract(final TStructureChangingRule r, final DComplexType source) {
    TTristate _abstract = r.getAbstract();
    boolean _equals = Objects.equal(_abstract, TTristate.DONT_CARE);
    if (_equals) {
      return source.isAbstract();
    }
    TTristate _abstract_1 = r.getAbstract();
    return Objects.equal(_abstract_1, TTristate.TRUE);
  }
  
  protected boolean _makeAbstract(final TTranspositionRule r, final DComplexType source) {
    return source.isAbstract();
  }
  
  protected boolean _makeRoot(final TStructureChangingRule r, final DComplexType source) {
    TTristate _rootEntity = r.getRootEntity();
    boolean _equals = Objects.equal(_rootEntity, TTristate.DONT_CARE);
    if (_equals) {
      return ((source instanceof DEntityType) && ((DEntityType) source).isRoot());
    }
    TTristate _rootEntity_1 = r.getRootEntity();
    return Objects.equal(_rootEntity_1, TTristate.TRUE);
  }
  
  protected boolean _makeRoot(final TTranspositionRule r, final DComplexType source) {
    return ((source instanceof DEntityType) && ((DEntityType) source).isRoot());
  }
  
  protected boolean _makeDetailType(final TMorphRule r, final DComplexType source) {
    TTristate _detail = r.getDetail();
    boolean _equals = Objects.equal(_detail, TTristate.DONT_CARE);
    if (_equals) {
      return (source instanceof DDetailType);
    }
    TTristate _detail_1 = r.getDetail();
    return Objects.equal(_detail_1, TTristate.TRUE);
  }
  
  protected boolean _makeDetailType(final TTranspositionRule r, final DComplexType source) {
    return (source instanceof DDetailType);
  }
  
  protected DType findLocalTypeMappingFor(final EObject context, final DType source) {
    final Function1<DType, Boolean> _function = (DType it) -> {
      return Boolean.valueOf((!(it instanceof ITransposition)));
    };
    final Iterator<DType> types = IteratorExtensions.<DType>filter(Iterators.<DType>filter(context.eResource().getAllContents(), DType.class), _function);
    final Function1<DType, Boolean> _function_1 = (DType it) -> {
      ITransposition _transposedBy = it.getTransposedBy();
      TTranspositionRule _transpositionRule = null;
      if (_transposedBy!=null) {
        _transpositionRule=_transposedBy.getTranspositionRule();
      }
      ITransposableElement _source = null;
      if (_transpositionRule!=null) {
        _source=_transpositionRule.getSource();
      }
      return Boolean.valueOf((_source == source));
    };
    final Iterator<DType> candidates = IteratorExtensions.<DType>filter(types, _function_1);
    return IteratorExtensions.<DType>head(candidates);
  }
  
  public TImplicitTransposition createImplicitTranspositionAsCopy(final ITransposition originalRecipe, final ITransposableElement source) {
    final TImplicitTransposition implicitDeduction = SyntheticModelElementsFactory.BASE.createTImplicitTransposition();
    originalRecipe.getImpliedTranspositions().add(implicitDeduction);
    implicitDeduction.setOriginalDeductionDefinition(originalRecipe);
    final TGrabRule grabRule = SyntheticModelElementsFactory.TRANSPOSE.createTGrabRule();
    grabRule.setSource(source);
    implicitDeduction.setTranspositionRule(grabRule);
    return implicitDeduction;
  }
  
  public DType addSyntheticType(final ITypeContainer container, final String name, final DType source, final ITransposition recipe) {
    if (source instanceof DEnumeration) {
      return _addSyntheticType(container, name, (DEnumeration)source, recipe);
    } else if (source instanceof DPrimitive) {
      return _addSyntheticType(container, name, (DPrimitive)source, recipe);
    } else if (source instanceof DComplexType) {
      return _addSyntheticType(container, name, (DComplexType)source, recipe);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, name, source, recipe).toString());
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
  
  protected boolean makeAbstract(final TTranspositionRule r, final DComplexType source) {
    if (r instanceof TStructureChangingRule) {
      return _makeAbstract((TStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeAbstract(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeRoot(final TTranspositionRule r, final DComplexType source) {
    if (r instanceof TStructureChangingRule) {
      return _makeRoot((TStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeRoot(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeDetailType(final TTranspositionRule r, final DComplexType source) {
    if (r instanceof TMorphRule) {
      return _makeDetailType((TMorphRule)r, source);
    } else if (r != null) {
      return _makeDetailType(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
}
