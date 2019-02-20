package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRootType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SDomainProxy;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.derivedState.SimSTypeSorter;
import com.mimacom.ddd.sm.sim.derivedState.SimSyntheticModelElementsUtil;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticComplexTypeDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SimDerivedStateComputer implements IDerivedStateComputer {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Inject
  @Extension
  private SimSyntheticModelElementsUtil _simSyntheticModelElementsUtil;
  
  @Inject
  private TransformationContext context;
  
  private static final String UNDEFINED = "UNDEFINED";
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      this.context.init(resource);
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final SInformationModel model = ((SInformationModel) _head);
      this.processInformationModel(model, this.context);
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    final Function1<SDeducibleElement, Boolean> _function = (SDeducibleElement it) -> {
      return Boolean.valueOf(it.isSynthetic());
    };
    final Iterator<SDeducibleElement> syntheticElements = IteratorExtensions.<SDeducibleElement>filter(Iterators.<SDeducibleElement>filter(resource.getAllContents(), SDeducibleElement.class), _function);
    final ArrayList<SDeducibleElement> list = Lists.<SDeducibleElement>newArrayList();
    while (syntheticElements.hasNext()) {
      list.add(syntheticElements.next());
    }
    for (final SDeducibleElement e : list) {
      EcoreUtil.remove(e);
    }
  }
  
  public void processInformationModel(final SInformationModel model, final TransformationContext context) {
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    Iterable<SType> _filter = IterableExtensions.<SType>filter(model.getTypes(), _function);
    List<SType> _list = null;
    if (_filter!=null) {
      _list=IterableExtensions.<SType>toList(_filter);
    }
    final List<SType> sTypesWithRule = _list;
    if ((sTypesWithRule != null)) {
      SimSTypeSorter _simSTypeSorter = new SimSTypeSorter();
      Collections.<SType>sort(sTypesWithRule, _simSTypeSorter);
      final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
      for (final SType type : sTypesWithRule) {
        {
          final SDeductionRule rule = type.getDeductionRule();
          final EObject source = rule.getSource();
          if ((source instanceof DType)) {
            final SType syntheticType = this.processTypeWithRule(type, rule, context);
            if ((syntheticType instanceof SComplexType)) {
              SyntheticComplexTypeDescriptor _syntheticComplexTypeDescriptor = new SyntheticComplexTypeDescriptor(((SComplexType)syntheticType), ((SComplexType) type), ((DComplexType) source));
              complexSyntheticTypes.add(_syntheticComplexTypeDescriptor);
            }
          }
        }
      }
      for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypes) {
        this.addSyntheticFeatures(desc, context);
      }
    }
    EList<SDomainProxy> _domainProxies = model.getDomainProxies();
    for (final SDomainProxy domainWithRule : _domainProxies) {
    }
    final ArrayList<SAggregate> modelList = Lists.<SAggregate>newArrayList(model.getAggregates());
    for (final SAggregate aggregate : modelList) {
      this.processAggregate(model, aggregate, null, context);
    }
  }
  
  public void processAggregate(final SInformationModel model, final SAggregate sAggregate, final SDomainProxy elementWithRule, final TransformationContext context) {
    SAggregate current = sAggregate;
    final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
    SDeductionRule _deductionRule = sAggregate.getDeductionRule();
    if ((_deductionRule instanceof SGrabAggregateRule)) {
      EObject source = sAggregate.getDeductionRule().getSource();
      if ((source instanceof DRootType)) {
        source = ((DRootType)source).eContainer();
      }
      if ((source instanceof DAggregate)) {
        current = this._simSyntheticModelElementsUtil.addSyntheticAggregate(model, ((DAggregate)source), sAggregate, context);
        this.addImplicitSyntheticTypes(current, sAggregate, ((DAggregate)source), complexSyntheticTypes, context);
      }
    }
    this.addSyntheticTypes(current, complexSyntheticTypes, context);
    for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypes) {
      this.addSyntheticFeatures(desc, context);
    }
  }
  
  protected void addImplicitSyntheticTypes(final SAggregate container, final SAggregate aggregateWithRule, final DAggregate source, final List<SyntheticComplexTypeDescriptor> acceptor, final TransformationContext context) {
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final Iterable<SType> sTypesWithRule = IterableExtensions.<SType>filter(aggregateWithRule.getTypes(), _function);
    final Function1<SType, Boolean> _function_1 = (SType it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SType>exists(sTypesWithRule, _function_1);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DType> implicitlyGrabbedDTypes = Lists.<DType>newArrayList(source.getTypes());
      final Function1<SType, Boolean> _function_2 = (SType it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DType));
      };
      final Function1<SType, DType> _function_3 = (SType it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return ((DType) _source);
      };
      final Iterable<DType> dTypesAffectedByRule = IterableExtensions.<SType, DType>map(IterableExtensions.<SType>filter(sTypesWithRule, _function_2), _function_3);
      CollectionExtensions.<DType>removeAll(implicitlyGrabbedDTypes, dTypesAffectedByRule);
      for (final DType dType : implicitlyGrabbedDTypes) {
        {
          final SType syntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(container, dType.getName(), dType, null, context);
          if ((syntheticType instanceof SEnumeration)) {
            this.addImplicitSyntheticLiterals(((SEnumeration)syntheticType), ((DEnumeration) dType), null);
          } else {
            if ((syntheticType instanceof SComplexType)) {
              SyntheticComplexTypeDescriptor _syntheticComplexTypeDescriptor = new SyntheticComplexTypeDescriptor(((SComplexType)syntheticType), ((DComplexType) dType));
              acceptor.add(_syntheticComplexTypeDescriptor);
            }
          }
        }
      }
    }
  }
  
  protected void addSyntheticTypes(final SAggregate container, final List<SyntheticComplexTypeDescriptor> acceptor, final TransformationContext context) {
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final List<SType> sTypesWithRule = IterableExtensions.<SType>toList(IterableExtensions.<SType>filter(container.getTypes(), _function));
    SimSTypeSorter _simSTypeSorter = new SimSTypeSorter();
    Collections.<SType>sort(sTypesWithRule, _simSTypeSorter);
    for (final SType sType : sTypesWithRule) {
      {
        final SDeductionRule rule = sType.getDeductionRule();
        final EObject source = rule.getSource();
        if ((source instanceof DType)) {
          final SType syntheticType = this.processTypeWithRule(sType, sType.getDeductionRule(), context);
          if ((syntheticType instanceof SComplexType)) {
            SyntheticComplexTypeDescriptor _syntheticComplexTypeDescriptor = new SyntheticComplexTypeDescriptor(((SComplexType)syntheticType), ((SComplexType) sType), ((DComplexType) source));
            acceptor.add(_syntheticComplexTypeDescriptor);
          }
        }
      }
    }
  }
  
  protected SPrimitive _processTypeWithRule(final SPrimitive typeWithRule, final SGrabRule rule, final TransformationContext context) {
    final EObject source = rule.getSource();
    if ((source instanceof DPrimitive)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DPrimitive)source).getName();
      }
      final String name = _xifexpression;
      SType _addSyntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(typeWithRule.eContainer(), name, ((DType)source), typeWithRule, context);
      final SPrimitive syntheticType = ((SPrimitive) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  protected SEnumeration _processTypeWithRule(final SEnumeration typeWithRule, final SGrabRule rule, final TransformationContext context) {
    final EObject source = rule.getSource();
    if ((source instanceof DEnumeration)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DEnumeration)source).getName();
      }
      final String name = _xifexpression;
      SType _addSyntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(typeWithRule.eContainer(), name, ((DType)source), typeWithRule, context);
      final SEnumeration syntheticEnum = ((SEnumeration) _addSyntheticType);
      this.addImplicitSyntheticLiterals(syntheticEnum, ((DEnumeration)source), typeWithRule);
      this.addSyntheticLiterals(syntheticEnum, typeWithRule);
      return syntheticEnum;
    }
    return null;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType typeWithRule, final SGrabRule rule, final TransformationContext context) {
    final EObject source = rule.getSource();
    if ((source instanceof DComplexType)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DComplexType)source).getName();
      }
      final String name = _xifexpression;
      SType _addSyntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(typeWithRule.eContainer(), name, ((DType)source), typeWithRule, context);
      final SComplexType syntheticType = ((SComplexType) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType typeWithRule, final SMorphRule rule, final TransformationContext context) {
    return null;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType typeWithRule, final SFuseRule rule, final TransformationContext context) {
    return null;
  }
  
  protected SType _processTypeWithRule(final SType typeWithRule, final SDeductionRule rule, final TransformationContext context) {
    throw new UnsupportedOperationException();
  }
  
  public void addImplicitSyntheticLiterals(final SEnumeration syntheticEnum, final DEnumeration source, final SEnumeration sEnumWithRule) {
    Iterable<SLiteral> sLiteralsWithRule = Lists.<SLiteral>newArrayList();
    if ((sEnumWithRule != null)) {
      final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      sLiteralsWithRule = IterableExtensions.<SLiteral>filter(sEnumWithRule.getLiterals(), _function);
    }
    final Function1<SLiteral, Boolean> _function_1 = (SLiteral it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SLiteral>exists(sLiteralsWithRule, _function_1);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DLiteral> implicitlyGrabbedDLiterals = Lists.<DLiteral>newArrayList(source.getLiterals());
      final Function1<SLiteral, Boolean> _function_2 = (SLiteral it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DLiteral));
      };
      final Function1<SLiteral, DLiteral> _function_3 = (SLiteral it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return ((DLiteral) _source);
      };
      final Iterable<DLiteral> dLiteralsAffectedByRule = IterableExtensions.<SLiteral, DLiteral>map(IterableExtensions.<SLiteral>filter(sLiteralsWithRule, _function_2), _function_3);
      CollectionExtensions.<DLiteral>removeAll(implicitlyGrabbedDLiterals, dLiteralsAffectedByRule);
      for (final DLiteral dLiteral : implicitlyGrabbedDLiterals) {
        this._simSyntheticModelElementsUtil.addSyntheticLiteral(syntheticEnum, dLiteral.getName());
      }
    }
  }
  
  public void addSyntheticLiterals(final SEnumeration syntheticEnum, final SEnumeration sEnumWithRule) {
    final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final Iterable<SLiteral> sLiteralsWithRule = IterableExtensions.<SLiteral>filter(sEnumWithRule.getLiterals(), _function);
    final List<SLiteral> sLiteralsWithRuleList = IterableExtensions.<SLiteral>toList(sLiteralsWithRule);
    for (final SLiteral sLiteral : sLiteralsWithRuleList) {
      {
        final SDeductionRule literalRule = sLiteral.getDeductionRule();
        if ((literalRule instanceof SGrabRule)) {
          String _xifexpression = null;
          String _renameTo = ((SGrabRule)literalRule).getRenameTo();
          boolean _tripleNotEquals = (_renameTo != null);
          if (_tripleNotEquals) {
            _xifexpression = ((SGrabRule)literalRule).getRenameTo();
          } else {
            String _xifexpression_1 = null;
            DNamedElement _namedSource = ((SGrabRule)literalRule).getNamedSource();
            boolean _tripleNotEquals_1 = (_namedSource != null);
            if (_tripleNotEquals_1) {
              _xifexpression_1 = ((SGrabRule)literalRule).getNamedSource().getName();
            } else {
              _xifexpression_1 = SimDerivedStateComputer.UNDEFINED;
            }
            _xifexpression = _xifexpression_1;
          }
          final String literalName = _xifexpression;
          this._simSyntheticModelElementsUtil.addSyntheticLiteral(syntheticEnum, literalName);
        }
      }
    }
  }
  
  protected void _processFeatureWithRule(final SComplexType container, final SFeature featureWithRule, final SGrabRule rule, final TransformationContext context) {
    this.grabFeature(container, featureWithRule, rule, context);
  }
  
  protected void _processFeatureWithRule(final SComplexType container, final SFeature featureWithRule, final SMorphRule rule, final TransformationContext context) {
    final SFeature syntheticFeature = this.grabFeature(container, featureWithRule, rule, context);
    if ((syntheticFeature != null)) {
      SType _retypeTo = rule.getRetypeTo();
      boolean _tripleNotEquals = (_retypeTo != null);
      if (_tripleNotEquals) {
        syntheticFeature.setType(rule.getRetypeTo());
      }
      SMultiplicity _remultiplyTo = rule.getRemultiplyTo();
      boolean _tripleNotEquals_1 = (_remultiplyTo != null);
      if (_tripleNotEquals_1) {
        syntheticFeature.setMultiplicity(rule.getRemultiplyTo());
      }
    }
  }
  
  protected void _processFeatureWithRule(final SComplexType container, final SFeature featureWithRule, final SDitchRule rule, final TransformationContext context) {
  }
  
  public SFeature grabFeature(final SComplexType container, final SFeature featureWithRule, final SGrabRule rule, final TransformationContext context) {
    final EObject source = rule.getSource();
    if ((source instanceof DFeature)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DFeature)source).getName();
      }
      final SFeature syntheticFeature = this._simSyntheticModelElementsUtil.addSyntheticFeature(container, _xifexpression, ((DFeature)source), featureWithRule, context);
      if ((featureWithRule instanceof SQuery)) {
        final SQuery syntheticQuery = ((SQuery) syntheticFeature);
        final Function1<SQueryParameter, Boolean> _function = (SQueryParameter it) -> {
          SElementNature _nature = it.getNature();
          return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
        };
        final Iterable<SQueryParameter> sParametersWithRule = IterableExtensions.<SQueryParameter>filter(((SQuery)featureWithRule).getParameters(), _function);
        final Function1<SQueryParameter, Boolean> _function_1 = (SQueryParameter it) -> {
          SDeductionRule _deductionRule = it.getDeductionRule();
          return Boolean.valueOf((_deductionRule instanceof SGrabRule));
        };
        boolean _exists = IterableExtensions.<SQueryParameter>exists(sParametersWithRule, _function_1);
        boolean _not = (!_exists);
        if (_not) {
          final ArrayList<DQueryParameter> implicitlyGrabbedDParameters = Lists.<DQueryParameter>newArrayList(((DQuery) source).getParameters());
          final Function1<SQueryParameter, Boolean> _function_2 = (SQueryParameter it) -> {
            EObject _source = it.getDeductionRule().getSource();
            return Boolean.valueOf((_source instanceof DQueryParameter));
          };
          final Function1<SQueryParameter, DQueryParameter> _function_3 = (SQueryParameter it) -> {
            EObject _source = it.getDeductionRule().getSource();
            return ((DQueryParameter) _source);
          };
          final Iterable<DQueryParameter> dParametersAffectedByRule = IterableExtensions.<SQueryParameter, DQueryParameter>map(IterableExtensions.<SQueryParameter>filter(sParametersWithRule, _function_2), _function_3);
          CollectionExtensions.<DQueryParameter>removeAll(implicitlyGrabbedDParameters, dParametersAffectedByRule);
          for (final DQueryParameter dParameter : implicitlyGrabbedDParameters) {
            this._simSyntheticModelElementsUtil.addSyntheticQueryParameter(syntheticQuery, dParameter.getName(), dParameter, null, context);
          }
        }
        final List<SQueryParameter> sParametersWithRuleList = IterableExtensions.<SQueryParameter>toList(sParametersWithRule);
        for (final SQueryParameter sParameter : sParametersWithRuleList) {
          this.processQueryParameterWithRule(syntheticQuery, sParameter, sParameter.getDeductionRule(), context);
        }
      }
      return syntheticFeature;
    }
    return null;
  }
  
  public void addSyntheticFeatures(final SyntheticComplexTypeDescriptor desc, final TransformationContext context) {
    Iterable<SFeature> sFeaturesWithRule = Lists.<SFeature>newArrayList();
    if ((desc.typeWithRule != null)) {
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      sFeaturesWithRule = IterableExtensions.<SFeature>filter(desc.typeWithRule.getFeatures(), _function);
    }
    final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SFeature>exists(sFeaturesWithRule, _function_1);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DFeature> implicitlyGrabbedDFeatures = Lists.<DFeature>newArrayList(this._simUtil.allFeatures(desc.source));
      final Function1<SFeature, Boolean> _function_2 = (SFeature it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DFeature));
      };
      final Function1<SFeature, DFeature> _function_3 = (SFeature it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return ((DFeature) _source);
      };
      final Iterable<DFeature> dFeaturesAffectedByRule = IterableExtensions.<SFeature, DFeature>map(IterableExtensions.<SFeature>filter(sFeaturesWithRule, _function_2), _function_3);
      CollectionExtensions.<DFeature>removeAll(implicitlyGrabbedDFeatures, dFeaturesAffectedByRule);
      for (final DFeature dFeature : implicitlyGrabbedDFeatures) {
        this._simSyntheticModelElementsUtil.addSyntheticFeature(desc.syntheticType, dFeature.getName(), dFeature, null, context);
      }
    }
    final List<SFeature> sFeaturesWithRuleList = IterableExtensions.<SFeature>toList(sFeaturesWithRule);
    for (final SFeature sFeature : sFeaturesWithRuleList) {
      this.processFeatureWithRule(desc.syntheticType, sFeature, sFeature.getDeductionRule(), context);
    }
  }
  
  protected void _processQueryParameterWithRule(final SQuery container, final SQueryParameter sParameter, final SGrabRule rule, final TransformationContext context) {
    this.grabQueryParameter(container, sParameter, rule, context);
  }
  
  protected void _processQueryParameterWithRule(final SQuery container, final SQueryParameter sParameter, final SMorphRule rule, final TransformationContext context) {
    final SQueryParameter syntheticParameter = this.grabQueryParameter(container, sParameter, rule, context);
    if ((syntheticParameter != null)) {
      SType _retypeTo = rule.getRetypeTo();
      boolean _tripleNotEquals = (_retypeTo != null);
      if (_tripleNotEquals) {
        syntheticParameter.setType(rule.getRetypeTo());
      }
      SMultiplicity _remultiplyTo = rule.getRemultiplyTo();
      boolean _tripleNotEquals_1 = (_remultiplyTo != null);
      if (_tripleNotEquals_1) {
        syntheticParameter.setMultiplicity(rule.getRemultiplyTo());
      }
    }
  }
  
  public SQueryParameter grabQueryParameter(final SQuery container, final SQueryParameter sParameter, final SGrabRule rule, final TransformationContext context) {
    final EObject source = rule.getSource();
    if ((source instanceof DQueryParameter)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DQueryParameter)source).getName();
      }
      final SQueryParameter syntheticParameter = this._simSyntheticModelElementsUtil.addSyntheticQueryParameter(container, _xifexpression, ((DQueryParameter)source), sParameter, context);
      return syntheticParameter;
    }
    return null;
  }
  
  protected void _processQueryParameterWithRule(final SQuery container, final SQueryParameter sParameter, final SDitchRule rule, final TransformationContext context) {
  }
  
  public SType processTypeWithRule(final SType typeWithRule, final SDeductionRule rule, final TransformationContext context) {
    if (typeWithRule instanceof SEnumeration
         && rule instanceof SGrabRule) {
      return _processTypeWithRule((SEnumeration)typeWithRule, (SGrabRule)rule, context);
    } else if (typeWithRule instanceof SPrimitive
         && rule instanceof SGrabRule) {
      return _processTypeWithRule((SPrimitive)typeWithRule, (SGrabRule)rule, context);
    } else if (typeWithRule instanceof SComplexType
         && rule instanceof SFuseRule) {
      return _processTypeWithRule((SComplexType)typeWithRule, (SFuseRule)rule, context);
    } else if (typeWithRule instanceof SComplexType
         && rule instanceof SMorphRule) {
      return _processTypeWithRule((SComplexType)typeWithRule, (SMorphRule)rule, context);
    } else if (typeWithRule instanceof SComplexType
         && rule instanceof SGrabRule) {
      return _processTypeWithRule((SComplexType)typeWithRule, (SGrabRule)rule, context);
    } else if (typeWithRule != null
         && rule != null) {
      return _processTypeWithRule(typeWithRule, rule, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(typeWithRule, rule, context).toString());
    }
  }
  
  public void processFeatureWithRule(final SComplexType container, final SFeature featureWithRule, final SDeductionRule rule, final TransformationContext context) {
    if (rule instanceof SMorphRule) {
      _processFeatureWithRule(container, featureWithRule, (SMorphRule)rule, context);
      return;
    } else if (rule instanceof SDitchRule) {
      _processFeatureWithRule(container, featureWithRule, (SDitchRule)rule, context);
      return;
    } else if (rule instanceof SGrabRule) {
      _processFeatureWithRule(container, featureWithRule, (SGrabRule)rule, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, featureWithRule, rule, context).toString());
    }
  }
  
  public void processQueryParameterWithRule(final SQuery container, final SQueryParameter sParameter, final SDeductionRule rule, final TransformationContext context) {
    if (rule instanceof SMorphRule) {
      _processQueryParameterWithRule(container, sParameter, (SMorphRule)rule, context);
      return;
    } else if (rule instanceof SDitchRule) {
      _processQueryParameterWithRule(container, sParameter, (SDitchRule)rule, context);
      return;
    } else if (rule instanceof SGrabRule) {
      _processQueryParameterWithRule(container, sParameter, (SGrabRule)rule, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, sParameter, rule, context).toString());
    }
  }
}
