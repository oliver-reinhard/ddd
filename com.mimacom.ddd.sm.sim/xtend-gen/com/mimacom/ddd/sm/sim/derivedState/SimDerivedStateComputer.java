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
    final List<SType> sTypesWithExplicitRule = _list;
    if ((sTypesWithExplicitRule != null)) {
      SimSTypeSorter _simSTypeSorter = new SimSTypeSorter();
      Collections.<SType>sort(sTypesWithExplicitRule, _simSTypeSorter);
      final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
      for (final SType type : sTypesWithExplicitRule) {
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
    final ArrayList<SAggregate> modelList = Lists.<SAggregate>newArrayList(model.getAggregates());
    for (final SAggregate aggregate : modelList) {
      this.processAggregate(aggregate, context);
    }
  }
  
  public void processAggregate(final SAggregate sAggregate, final TransformationContext context) {
    SAggregate current = sAggregate;
    final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
    SDeductionRule _deductionRule = sAggregate.getDeductionRule();
    if ((_deductionRule instanceof SGrabAggregateRule)) {
      EObject source = sAggregate.getDeductionRule().getSource();
      if ((source instanceof DRootType)) {
        source = ((DRootType)source).eContainer();
      }
      if ((source instanceof DAggregate)) {
        EObject _eContainer = sAggregate.eContainer();
        final SInformationModel model = ((SInformationModel) _eContainer);
        current = this._simSyntheticModelElementsUtil.addSyntheticAggregate(model, ((DAggregate)source), sAggregate, context);
        this.addImplicitSyntheticTypes(current, sAggregate, ((DAggregate)source), complexSyntheticTypes, context);
      }
    }
    this.addExplicitSyntheticTypes(current, complexSyntheticTypes, context);
    for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypes) {
      this.addSyntheticFeatures(desc, context);
    }
  }
  
  protected void addImplicitSyntheticTypes(final SAggregate container, final SAggregate sAggregateWithExplicitRule, final DAggregate source, final List<SyntheticComplexTypeDescriptor> acceptor, final TransformationContext context) {
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final Iterable<SType> sTypesWithExplicitRule = IterableExtensions.<SType>filter(sAggregateWithExplicitRule.getTypes(), _function);
    final Function1<SType, Boolean> _function_1 = (SType it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SType>exists(sTypesWithExplicitRule, _function_1);
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
      final Iterable<DType> dTypesAffectedByRule = IterableExtensions.<SType, DType>map(IterableExtensions.<SType>filter(sTypesWithExplicitRule, _function_2), _function_3);
      CollectionExtensions.<DType>removeAll(implicitlyGrabbedDTypes, dTypesAffectedByRule);
      for (final DType dType : implicitlyGrabbedDTypes) {
        {
          final SType syntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(container, dType.getName(), dType, sAggregateWithExplicitRule, context);
          if ((syntheticType instanceof SComplexType)) {
            SyntheticComplexTypeDescriptor _syntheticComplexTypeDescriptor = new SyntheticComplexTypeDescriptor(((SComplexType)syntheticType), ((DComplexType) dType));
            acceptor.add(_syntheticComplexTypeDescriptor);
          }
        }
      }
    }
  }
  
  protected void addExplicitSyntheticTypes(final SAggregate container, final List<SyntheticComplexTypeDescriptor> acceptor, final TransformationContext context) {
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final List<SType> sTypesWithExplicitRule = IterableExtensions.<SType>toList(IterableExtensions.<SType>filter(container.getTypes(), _function));
    SimSTypeSorter _simSTypeSorter = new SimSTypeSorter();
    Collections.<SType>sort(sTypesWithExplicitRule, _simSTypeSorter);
    for (final SType sType : sTypesWithExplicitRule) {
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
  
  protected SPrimitive _processTypeWithRule(final SPrimitive sType, final SGrabRule rule, final TransformationContext context) {
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
      SType _addSyntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(sType.eContainer(), name, ((DType)source), sType, context);
      final SPrimitive syntheticType = ((SPrimitive) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  protected SEnumeration _processTypeWithRule(final SEnumeration sEnum, final SGrabRule rule, final TransformationContext context) {
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
      SType _addSyntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(sEnum.eContainer(), name, ((DType)source), sEnum, context);
      final SEnumeration syntheticEnum = ((SEnumeration) _addSyntheticType);
      this.addImplicitSyntheticLiterals(syntheticEnum, ((DEnumeration)source), sEnum);
      this.addExplicitSyntheticLiterals(syntheticEnum, sEnum);
      return syntheticEnum;
    }
    return null;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType sType, final SGrabRule rule, final TransformationContext context) {
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
      SType _addSyntheticType = this._simSyntheticModelElementsUtil.addSyntheticType(sType.eContainer(), name, ((DType)source), sType, context);
      final SComplexType syntheticType = ((SComplexType) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType type, final SMorphRule rule, final TransformationContext context) {
    return null;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType type, final SFuseRule rule, final TransformationContext context) {
    return null;
  }
  
  protected SType _processTypeWithRule(final SType type, final SDeductionRule rule, final TransformationContext context) {
    throw new UnsupportedOperationException();
  }
  
  public void addImplicitSyntheticLiterals(final SEnumeration syntheticEnum, final DEnumeration source, final SEnumeration sEnumWithExplicitRule) {
    final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final Iterable<SLiteral> sLiteralsWithExplicitRule = IterableExtensions.<SLiteral>filter(sEnumWithExplicitRule.getLiterals(), _function);
    final Function1<SLiteral, Boolean> _function_1 = (SLiteral it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SLiteral>exists(sLiteralsWithExplicitRule, _function_1);
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
      final Iterable<DLiteral> dLiteralsAffectedByRule = IterableExtensions.<SLiteral, DLiteral>map(IterableExtensions.<SLiteral>filter(sLiteralsWithExplicitRule, _function_2), _function_3);
      CollectionExtensions.<DLiteral>removeAll(implicitlyGrabbedDLiterals, dLiteralsAffectedByRule);
      for (final DLiteral dLiteral : implicitlyGrabbedDLiterals) {
        this._simSyntheticModelElementsUtil.addSyntheticLiteral(syntheticEnum, dLiteral.getName());
      }
    }
  }
  
  public void addExplicitSyntheticLiterals(final SEnumeration syntheticEnum, final SEnumeration sEnumWithExplicitRule) {
    final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final Iterable<SLiteral> sLiteralsWithExplicitRule = IterableExtensions.<SLiteral>filter(sEnumWithExplicitRule.getLiterals(), _function);
    final List<SLiteral> sLiteralsWithExplicitRuleList = IterableExtensions.<SLiteral>toList(sLiteralsWithExplicitRule);
    for (final SLiteral sLiteral : sLiteralsWithExplicitRuleList) {
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
  
  protected void _processFeatureWithRule(final SComplexType container, final SFeature sFeature, final SGrabRule rule, final TransformationContext context) {
    this.grabFeature(container, sFeature, rule, context);
  }
  
  protected void _processFeatureWithRule(final SComplexType container, final SFeature sFeature, final SMorphRule rule, final TransformationContext context) {
    final SFeature syntheticFeature = this.grabFeature(container, sFeature, rule, context);
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
  
  protected void _processFeatureWithRule(final SComplexType container, final SFeature sFeature, final SDitchRule rule, final TransformationContext context) {
  }
  
  public SFeature grabFeature(final SComplexType container, final SFeature sFeature, final SGrabRule rule, final TransformationContext context) {
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
      final SFeature syntheticFeature = this._simSyntheticModelElementsUtil.addSyntheticFeature(container, _xifexpression, ((DFeature)source), sFeature, context);
      if ((sFeature instanceof SQuery)) {
        final SQuery syntheticQuery = ((SQuery) syntheticFeature);
        final Function1<SQueryParameter, Boolean> _function = (SQueryParameter it) -> {
          SElementNature _nature = it.getNature();
          return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
        };
        final Iterable<SQueryParameter> sParametersWithExplicitRule = IterableExtensions.<SQueryParameter>filter(((SQuery)sFeature).getParameters(), _function);
        final Function1<SQueryParameter, Boolean> _function_1 = (SQueryParameter it) -> {
          SDeductionRule _deductionRule = it.getDeductionRule();
          return Boolean.valueOf((_deductionRule instanceof SGrabRule));
        };
        boolean _exists = IterableExtensions.<SQueryParameter>exists(sParametersWithExplicitRule, _function_1);
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
          final Iterable<DQueryParameter> dParametersAffectedByRule = IterableExtensions.<SQueryParameter, DQueryParameter>map(IterableExtensions.<SQueryParameter>filter(sParametersWithExplicitRule, _function_2), _function_3);
          CollectionExtensions.<DQueryParameter>removeAll(implicitlyGrabbedDParameters, dParametersAffectedByRule);
          for (final DQueryParameter dParameter : implicitlyGrabbedDParameters) {
            this._simSyntheticModelElementsUtil.addSyntheticQueryParameter(syntheticQuery, dParameter.getName(), dParameter, sFeature, context);
          }
        }
        final List<SQueryParameter> sParametersWithExplicitRuleList = IterableExtensions.<SQueryParameter>toList(sParametersWithExplicitRule);
        for (final SQueryParameter sParameter : sParametersWithExplicitRuleList) {
          this.processQueryParameterWithRule(syntheticQuery, sParameter, sParameter.getDeductionRule(), context);
        }
      }
      return syntheticFeature;
    }
    return null;
  }
  
  public void addSyntheticFeatures(final SyntheticComplexTypeDescriptor desc, final TransformationContext context) {
    Iterable<SFeature> sFeaturesWithExplicitRule = Lists.<SFeature>newArrayList();
    if ((desc.typeWithExplicitRule != null)) {
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      sFeaturesWithExplicitRule = IterableExtensions.<SFeature>filter(desc.typeWithExplicitRule.getFeatures(), _function);
    }
    final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SFeature>exists(sFeaturesWithExplicitRule, _function_1);
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
      final Iterable<DFeature> dFeaturesAffectedByRule = IterableExtensions.<SFeature, DFeature>map(IterableExtensions.<SFeature>filter(sFeaturesWithExplicitRule, _function_2), _function_3);
      CollectionExtensions.<DFeature>removeAll(implicitlyGrabbedDFeatures, dFeaturesAffectedByRule);
      for (final DFeature dFeature : implicitlyGrabbedDFeatures) {
        this._simSyntheticModelElementsUtil.addSyntheticFeature(desc.syntheticType, dFeature.getName(), dFeature, desc.typeWithExplicitRule, context);
      }
    }
    final List<SFeature> sFeaturesWithExplicitRuleList = IterableExtensions.<SFeature>toList(sFeaturesWithExplicitRule);
    for (final SFeature sFeature : sFeaturesWithExplicitRuleList) {
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
  
  public SType processTypeWithRule(final SType sEnum, final SDeductionRule rule, final TransformationContext context) {
    if (sEnum instanceof SEnumeration
         && rule instanceof SGrabRule) {
      return _processTypeWithRule((SEnumeration)sEnum, (SGrabRule)rule, context);
    } else if (sEnum instanceof SPrimitive
         && rule instanceof SGrabRule) {
      return _processTypeWithRule((SPrimitive)sEnum, (SGrabRule)rule, context);
    } else if (sEnum instanceof SComplexType
         && rule instanceof SFuseRule) {
      return _processTypeWithRule((SComplexType)sEnum, (SFuseRule)rule, context);
    } else if (sEnum instanceof SComplexType
         && rule instanceof SMorphRule) {
      return _processTypeWithRule((SComplexType)sEnum, (SMorphRule)rule, context);
    } else if (sEnum instanceof SComplexType
         && rule instanceof SGrabRule) {
      return _processTypeWithRule((SComplexType)sEnum, (SGrabRule)rule, context);
    } else if (sEnum != null
         && rule != null) {
      return _processTypeWithRule(sEnum, rule, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sEnum, rule, context).toString());
    }
  }
  
  public void processFeatureWithRule(final SComplexType container, final SFeature sFeature, final SDeductionRule rule, final TransformationContext context) {
    if (rule instanceof SMorphRule) {
      _processFeatureWithRule(container, sFeature, (SMorphRule)rule, context);
      return;
    } else if (rule instanceof SDitchRule) {
      _processFeatureWithRule(container, sFeature, (SDitchRule)rule, context);
      return;
    } else if (rule instanceof SGrabRule) {
      _processFeatureWithRule(container, sFeature, (SGrabRule)rule, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, sFeature, rule, context).toString());
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
