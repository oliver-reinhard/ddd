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
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticComplexType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticDetailType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticType;
import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TImplicitTransposition;
import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
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
  
  private static final SyntheticFactory SYNTHETIC = SyntheticFactory.eINSTANCE;
  
  @Inject
  @Extension
  private TypeMappingUtil _typeMappingUtil;
  
  public TSyntheticAggregate addSyntheticAggregate(final TInformationModel container, final String name, final ITransposition recipe) {
    final TSyntheticAggregate syntheticAggregate = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticAggregate();
    syntheticAggregate.setName(name);
    syntheticAggregate.setRecipe(recipe);
    container.getAggregates().add(syntheticAggregate);
    return syntheticAggregate;
  }
  
  protected TSyntheticPrimitive _addSyntheticType(final ITypeContainer container, final String name, final DPrimitive source, final ITransposition recipe) {
    final TSyntheticPrimitive syntheticPrimitive = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticPrimitive();
    this.initSyntheticType(syntheticPrimitive, container, name, source, recipe);
    syntheticPrimitive.setRedefines(source.getRedefines());
    return syntheticPrimitive;
  }
  
  protected TSyntheticEnumeration _addSyntheticType(final ITypeContainer container, final String name, final DEnumeration source, final ITransposition recipe) {
    final TSyntheticEnumeration syntheticEnumeration = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticEnumeration();
    this.initSyntheticType(syntheticEnumeration, container, name, source, recipe);
    return syntheticEnumeration;
  }
  
  protected TSyntheticComplexType _addSyntheticType(final ITypeContainer container, final String name, final DComplexType source, final ITransposition recipe) {
    final boolean allowsIdentityTypes = EcoreUtil2.<TInformationModel>getContainerOfType(container, TInformationModel.class).allowsIdentityTypes();
    TSyntheticComplexType _xifexpression = null;
    if (((!allowsIdentityTypes) || this.makeDetailType(recipe.getRule(), source))) {
      _xifexpression = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticDetailType();
    } else {
      _xifexpression = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticEntityType();
    }
    final TSyntheticComplexType syntheticComplexType = _xifexpression;
    this.initSyntheticType(syntheticComplexType, container, name, source, recipe);
    syntheticComplexType.setAbstract(this.makeAbstract(recipe.getRule(), source));
    if ((syntheticComplexType instanceof DEntityType)) {
      ((DEntityType)syntheticComplexType).setRoot(this.makeRoot(recipe.getRule(), source));
    }
    container.getTypes().add(syntheticComplexType);
    return syntheticComplexType;
  }
  
  protected TSyntheticPrimitive _addSyntheticTypeAsCopy(final ITypeContainer container, final DPrimitive original) {
    final TSyntheticPrimitive syntheticPrimitive = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticPrimitive();
    this.initSyntheticType(syntheticPrimitive, container, original.getName(), original, null);
    return syntheticPrimitive;
  }
  
  protected TSyntheticEnumeration _addSyntheticTypeAsCopy(final ITypeContainer container, final DEnumeration original) {
    final TSyntheticEnumeration syntheticEnumeration = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticEnumeration();
    this.initSyntheticType(syntheticEnumeration, container, original.getName(), original, null);
    EList<DLiteral> _literals = original.getLiterals();
    for (final DLiteral literal : _literals) {
      this.addSyntheticLiteralAsCopy(syntheticEnumeration, literal.getName(), literal);
    }
    return syntheticEnumeration;
  }
  
  protected TSyntheticEntityType _addSyntheticTypeAsCopy(final ITypeContainer container, final DEntityType original) {
    final TSyntheticEntityType syntheticEntity = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticEntityType();
    this.initSyntheticType(syntheticEntity, container, original.getName(), original, null);
    syntheticEntity.setAbstract(original.isAbstract());
    syntheticEntity.setSuperType(original.getSuperType());
    syntheticEntity.setRoot(original.isRoot());
    syntheticEntity.setNature(original.getNature());
    return syntheticEntity;
  }
  
  protected TSyntheticDetailType _addSyntheticTypeAsCopy(final ITypeContainer container, final DDetailType original) {
    final TSyntheticDetailType syntheticEntity = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticDetailType();
    this.initSyntheticType(syntheticEntity, container, original.getName(), original, null);
    syntheticEntity.setAbstract(original.isAbstract());
    syntheticEntity.setSuperType(original.getSuperType());
    return syntheticEntity;
  }
  
  protected void initSyntheticType(final TSyntheticType syntheticType, final ITypeContainer container, final String name, final DType original, final ITransposition recipe) {
    syntheticType.setName(name);
    syntheticType.getAliases().addAll(original.getAliases());
    syntheticType.setRecipe(recipe);
    container.getTypes().add(syntheticType);
  }
  
  public TSyntheticFeature addSyntheticFeature(final IFeatureContainer container, final String name, final DFeature source, final ITransposition recipe) {
    final DType sourceFeatureType = source.getType();
    if ((sourceFeatureType == null)) {
      return null;
    }
    final DType featureTypeProxy = this._typeMappingUtil.getTransposedTypeProxy(recipe, sourceFeatureType);
    TSyntheticFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DQuery) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticQuery();
    }
    if (!_matched) {
      if (source instanceof DAttribute || source instanceof DAssociation) {
        _matched=true;
        TSyntheticFeature _xblockexpression = null;
        {
          DType featureType = this.findLocalTypeMappingFor(container, source.getType());
          if ((featureType == null)) {
            final TSyntheticAttribute tempFeature = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticAttribute();
            container.getFeatures().add(tempFeature);
            tempFeature.setType(featureTypeProxy);
            featureType = tempFeature.getType();
            container.getFeatures().remove(tempFeature);
          }
          TSyntheticFeature _xifexpression = null;
          if (((featureType instanceof IIdentityType) || ((featureType == null) && (source instanceof DAssociation)))) {
            _xifexpression = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticAssociation();
          } else {
            _xifexpression = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticAttribute();
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    final TSyntheticFeature syntheticFeature = _switchResult;
    syntheticFeature.setName(name);
    syntheticFeature.getAliases().addAll(source.getAliases());
    syntheticFeature.setType(featureTypeProxy);
    syntheticFeature.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticFeature.setRecipe(recipe);
    container.getFeatures().add(syntheticFeature);
    return syntheticFeature;
  }
  
  public TSyntheticFeature addSyntheticFeatureAsCopy(final IFeatureContainer container, final DFeature source) {
    TSyntheticFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticAttribute();
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticQuery();
      }
    }
    if (!_matched) {
      if (source instanceof DAssociation) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticAssociation();
      }
    }
    final TSyntheticFeature syntheticFeature = _switchResult;
    container.getFeatures().add(syntheticFeature);
    this.initSyntheticFeatureAsCopy(syntheticFeature, source);
    return syntheticFeature;
  }
  
  public TSyntheticFeature addSyntheticQueryAsCopy(final DAggregate container, final DQuery source) {
    final TSyntheticQuery syntheticFeature = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticQuery();
    container.getFeatures().add(syntheticFeature);
    this.initSyntheticFeatureAsCopy(syntheticFeature, source);
    return syntheticFeature;
  }
  
  private void initSyntheticFeatureAsCopy(final TSyntheticFeature syntheticFeature, final DFeature source) {
    syntheticFeature.setName(source.getName());
    syntheticFeature.getAliases().addAll(source.getAliases());
    syntheticFeature.setType(source.getType());
    syntheticFeature.setMultiplicity(source.getMultiplicity());
    syntheticFeature.setRecipe(null);
    if ((source instanceof DQuery)) {
      EList<DQueryParameter> _parameters = ((DQuery)source).getParameters();
      for (final DQueryParameter p : _parameters) {
        this.addSyntheticQueryParameterAsCopy(((DQuery) syntheticFeature), p);
      }
    }
  }
  
  public TSyntheticQueryParameter addSyntheticQueryParameter(final DQuery container, final String name, final DQueryParameter source, final ITransposition recipe) {
    final DType sourceParameterType = source.getType();
    if ((sourceParameterType == null)) {
      return null;
    }
    final TSyntheticQueryParameter syntheticParameter = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticQueryParameter();
    syntheticParameter.setName(name);
    syntheticParameter.setType(this._typeMappingUtil.getTransposedTypeProxy(recipe, sourceParameterType));
    syntheticParameter.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticParameter.setRecipe(recipe);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public TSyntheticQueryParameter addSyntheticQueryParameterAsCopy(final DQuery container, final DQueryParameter source) {
    final TSyntheticQueryParameter syntheticParameter = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticQueryParameter();
    syntheticParameter.setName(source.getName());
    syntheticParameter.setType(source.getType());
    syntheticParameter.setMultiplicity(source.getMultiplicity());
    syntheticParameter.setRecipe(null);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public void addSyntheticLiteral(final DEnumeration container, final String name, final DLiteral source, final ITransposition recipe) {
    final TSyntheticLiteral syntheticLiteral = SyntheticModelElementsFactory.SYNTHETIC.createTSyntheticLiteral();
    syntheticLiteral.setName(name);
    syntheticLiteral.getAliases().addAll(source.getAliases());
    syntheticLiteral.setRecipe(recipe);
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
    final Iterator<TSyntheticType> types = Iterators.<TSyntheticType>filter(context.eResource().getAllContents(), TSyntheticType.class);
    final Function1<TSyntheticType, Boolean> _function = (TSyntheticType it) -> {
      ITransposition _recipe = it.getRecipe();
      TTranspositionRule _rule = null;
      if (_recipe!=null) {
        _rule=_recipe.getRule();
      }
      ITransposableElement _source = null;
      if (_rule!=null) {
        _source=_rule.getSource();
      }
      return Boolean.valueOf((_source == source));
    };
    final Iterator<TSyntheticType> candidates = IteratorExtensions.<TSyntheticType>filter(types, _function);
    return IteratorExtensions.<TSyntheticType>head(candidates);
  }
  
  public TImplicitTransposition createImplicitTranspositionAsCopy(final ITransposition originalRecipe, final ITransposableElement source) {
    final TImplicitTransposition implicitTransposition = SyntheticModelElementsFactory.TRANSPOSE.createTImplicitTransposition();
    originalRecipe.getImpliedTranspositions().add(implicitTransposition);
    implicitTransposition.setOriginalTransposition(originalRecipe);
    final TGrabRule grabRule = SyntheticModelElementsFactory.TRANSPOSE.createTGrabRule();
    grabRule.setSource(source);
    implicitTransposition.setRule(grabRule);
    return implicitTransposition;
  }
  
  public TSyntheticType addSyntheticType(final ITypeContainer container, final String name, final DType source, final ITransposition recipe) {
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
  
  public TSyntheticType addSyntheticTypeAsCopy(final ITypeContainer container, final DType original) {
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
