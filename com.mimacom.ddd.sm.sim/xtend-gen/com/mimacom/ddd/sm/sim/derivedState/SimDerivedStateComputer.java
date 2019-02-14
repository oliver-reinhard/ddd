package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DRelationship;
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
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.ArrayList;
import java.util.Arrays;
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
  private TransformationContext context;
  
  private static final SimFactory simFactory = SimFactory.eINSTANCE;
  
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
    final Iterable<SType> typesToDeduce = IterableExtensions.<SType>filter(model.getTypes(), _function);
    List<SType> _list = null;
    if (typesToDeduce!=null) {
      _list=IterableExtensions.<SType>toList(typesToDeduce);
    }
    for (final SType type : _list) {
      this.processType(type, type.getDeductionRule(), context);
    }
    final ArrayList<SAggregate> modelList = Lists.<SAggregate>newArrayList(model.getAggregates());
    for (final SAggregate aggregate : modelList) {
      this.processAggregate(aggregate, context);
    }
  }
  
  public void processAggregate(final SAggregate aggregate, final TransformationContext context) {
    SAggregate current = aggregate;
    SDeductionRule _deductionRule = aggregate.getDeductionRule();
    boolean _tripleNotEquals = (_deductionRule != null);
    if (_tripleNotEquals) {
      final SDeductionRule source = aggregate.getDeductionRule();
      if ((source instanceof DAggregate)) {
        EObject _eContainer = aggregate.eContainer();
        current = this.addSyntheticAggregate(((SInformationModel) _eContainer), ((DAggregate)source), context);
        EList<DType> _types = ((DAggregate)source).getTypes();
        for (final DType type : _types) {
        }
      }
    }
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final Iterable<SType> typesToDeduce = IterableExtensions.<SType>filter(current.getTypes(), _function);
    List<SType> _list = IterableExtensions.<SType>toList(typesToDeduce);
    for (final SType type_1 : _list) {
      this.processType(type_1, type_1.getDeductionRule(), context);
    }
  }
  
  protected void _processType(final SPrimitive sType, final SGrabRule rule, final TransformationContext context) {
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
      this.addSyntheticPrimitive(sType.eContainer(), name, ((DPrimitive)source), context);
    }
  }
  
  protected void _processType(final SEnumeration sEnum, final SGrabRule rule, final TransformationContext context) {
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
      final SEnumeration syntheticEnum = this.addSyntheticEnumeration(sEnum.eContainer(), name, ((DEnumeration)source), context);
      final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      final Iterable<SLiteral> sLiteralsWithExplicitRule = IterableExtensions.<SLiteral>filter(sEnum.getLiterals(), _function);
      final Function1<SLiteral, Boolean> _function_1 = (SLiteral it) -> {
        SDeductionRule _deductionRule = it.getDeductionRule();
        return Boolean.valueOf((_deductionRule instanceof SGrabRule));
      };
      boolean _exists = IterableExtensions.<SLiteral>exists(sLiteralsWithExplicitRule, _function_1);
      boolean _not = (!_exists);
      if (_not) {
        final ArrayList<DLiteral> implicitlyGrabbedDLiterals = Lists.<DLiteral>newArrayList(((DEnumeration)source).getLiterals());
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
          this.addSyntheticLiteral(syntheticEnum, dLiteral.getName());
        }
      }
      final List<SLiteral> sLiteralsWithExplicitRuleList = IterableExtensions.<SLiteral>toList(sLiteralsWithExplicitRule);
      for (final SLiteral sLiteral : sLiteralsWithExplicitRuleList) {
        {
          final SDeductionRule literalRule = sLiteral.getDeductionRule();
          if ((literalRule instanceof SGrabRule)) {
            String _xifexpression_1 = null;
            String _renameTo_1 = ((SGrabRule)literalRule).getRenameTo();
            boolean _tripleNotEquals_1 = (_renameTo_1 != null);
            if (_tripleNotEquals_1) {
              _xifexpression_1 = ((SGrabRule)literalRule).getRenameTo();
            } else {
              String _xifexpression_2 = null;
              DNamedElement _namedSource = ((SGrabRule)literalRule).getNamedSource();
              boolean _tripleNotEquals_2 = (_namedSource != null);
              if (_tripleNotEquals_2) {
                _xifexpression_2 = ((SGrabRule)literalRule).getNamedSource().getName();
              } else {
                _xifexpression_2 = SimDerivedStateComputer.UNDEFINED;
              }
              _xifexpression_1 = _xifexpression_2;
            }
            final String literalName = _xifexpression_1;
            this.addSyntheticLiteral(syntheticEnum, literalName);
          }
        }
      }
    }
  }
  
  protected void _processType(final SComplexType sType, final SGrabRule rule, final TransformationContext context) {
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
      final SComplexType syntheticType = this.addSyntheticComplexType(sType.eContainer(), name, ((DComplexType)source), context);
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      final Iterable<SFeature> sFeaturesWithExplicitRule = IterableExtensions.<SFeature>filter(sType.getFeatures(), _function);
      final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
        SDeductionRule _deductionRule = it.getDeductionRule();
        return Boolean.valueOf((_deductionRule instanceof SGrabRule));
      };
      boolean _exists = IterableExtensions.<SFeature>exists(sFeaturesWithExplicitRule, _function_1);
      boolean _not = (!_exists);
      if (_not) {
        final ArrayList<DFeature> implicitlyGrabbedDFeatures = Lists.<DFeature>newArrayList(this._simUtil.allFeatures(((DComplexType)source)));
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
          this.addSyntheticFeature(syntheticType, dFeature.getName(), dFeature, context);
        }
      }
      final List<SFeature> sFeaturesWithExplicitRuleList = IterableExtensions.<SFeature>toList(sFeaturesWithExplicitRule);
      for (final SFeature sFeature : sFeaturesWithExplicitRuleList) {
        {
          final SDeductionRule featureRule = sFeature.getDeductionRule();
          boolean _matched = false;
          if (featureRule instanceof SDitchRule) {
            _matched=true;
            this.ditchFeature(syntheticType, sFeature, ((SDitchRule)featureRule), context);
          }
          if (!_matched) {
            if (featureRule instanceof SMorphRule) {
              _matched=true;
              this.morphFeature(syntheticType, sFeature, ((SMorphRule)featureRule), context);
            }
          }
          if (!_matched) {
            if (featureRule instanceof SGrabRule) {
              _matched=true;
              this.grabFeature(syntheticType, sFeature, ((SGrabRule)featureRule), context);
            }
          }
        }
      }
    }
  }
  
  protected void _processType(final SComplexType type, final SMorphRule rule, final TransformationContext context) {
  }
  
  protected void _processType(final SComplexType type, final SFuseRule rule, final TransformationContext context) {
  }
  
  protected void _processType(final SType type, final SDeductionRule rule, final TransformationContext context) {
    throw new UnsupportedOperationException();
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
      return this.addSyntheticFeature(container, _xifexpression, ((DFeature)source), context);
    }
    return null;
  }
  
  public SFeature morphFeature(final SComplexType container, final SFeature sFeature, final SMorphRule rule, final TransformationContext context) {
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
        syntheticFeature.setMultiplicity(SimDerivedStateComputer.simFactory.createSMultiplicity());
        SMultiplicity _multiplicity = syntheticFeature.getMultiplicity();
        _multiplicity.setMinOccurs(rule.getRemultiplyTo().getMinOccurs());
        SMultiplicity _multiplicity_1 = syntheticFeature.getMultiplicity();
        _multiplicity_1.setMaxOccurs(rule.getRemultiplyTo().getMaxOccurs());
      }
    }
    return syntheticFeature;
  }
  
  public SFeature ditchFeature(final SComplexType container, final SFeature sFeature, final SDitchRule rule, final TransformationContext context) {
    return null;
  }
  
  public SAggregate addSyntheticAggregate(final SInformationModel container, final DAggregate source, final TransformationContext context) {
    final SAggregate sAggregate = SimDerivedStateComputer.simFactory.createSAggregate();
    sAggregate.setSynthetic(true);
    sAggregate.setDeductionRule(SimDerivedStateComputer.simFactory.createSGrabAggregateRule());
    SDeductionRule _deductionRule = sAggregate.getDeductionRule();
    _deductionRule.setSource(source);
    container.getAggregates().add(sAggregate);
    return sAggregate;
  }
  
  public SPrimitive addSyntheticPrimitive(final EObject container, final String name, final DPrimitive source, final TransformationContext context) {
    final SPrimitive sType = SimDerivedStateComputer.simFactory.createSPrimitive();
    this.initSyntheticType(sType, name, source, container);
    return sType;
  }
  
  public SEnumeration addSyntheticEnumeration(final EObject container, final String name, final DEnumeration source, final TransformationContext context) {
    final SEnumeration sType = SimDerivedStateComputer.simFactory.createSEnumeration();
    this.initSyntheticType(sType, name, source, container);
    return sType;
  }
  
  public SComplexType addSyntheticComplexType(final EObject container, final String name, final DComplexType source, final TransformationContext context) {
    SComplexType _switchResult = null;
    boolean _matched = false;
    if (source instanceof DRootType) {
      _matched=true;
      _switchResult = SimDerivedStateComputer.simFactory.createSRootType();
    }
    if (!_matched) {
      if (source instanceof DRelationship) {
        _matched=true;
        _switchResult = SimDerivedStateComputer.simFactory.createSRootType();
      }
    }
    if (!_matched) {
      if (source instanceof DDetailType) {
        _matched=true;
        _switchResult = SimDerivedStateComputer.simFactory.createSDetailType();
      }
    }
    final SComplexType sType = _switchResult;
    this.initSyntheticType(sType, name, source, container);
    sType.setAbstract(source.isAbstract());
    boolean _matched_1 = false;
    if (container instanceof SAggregate) {
      _matched_1=true;
      ((SAggregate)container).getTypes().add(sType);
    }
    if (!_matched_1) {
      if (container instanceof SInformationModel) {
        _matched_1=true;
        ((SInformationModel)container).getTypes().add(sType);
      }
    }
    return sType;
  }
  
  public SFeature addSyntheticFeature(final SComplexType container, final String name, final DFeature source, final TransformationContext context) {
    SFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute) {
      _matched=true;
      _switchResult = SimDerivedStateComputer.simFactory.createSAttribute();
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SimDerivedStateComputer.simFactory.createSQuery();
      }
    }
    if (!_matched) {
      if (source instanceof DAssociation) {
        _matched=true;
        _switchResult = SimDerivedStateComputer.simFactory.createSAssociation();
      }
    }
    final SFeature sFeature = _switchResult;
    sFeature.setName(name);
    final DType dFeatureType = source.getType();
    if ((dFeatureType == null)) {
      return null;
    }
    sFeature.setType(context.getSType(dFeatureType));
    DMultiplicity _multiplicity = source.getMultiplicity();
    boolean _tripleNotEquals = (_multiplicity != null);
    if (_tripleNotEquals) {
      sFeature.setMultiplicity(SimDerivedStateComputer.simFactory.createSMultiplicity());
      SMultiplicity _multiplicity_1 = sFeature.getMultiplicity();
      _multiplicity_1.setMinOccurs(source.getMultiplicity().getMinOccurs());
      SMultiplicity _multiplicity_2 = sFeature.getMultiplicity();
      _multiplicity_2.setMaxOccurs(source.getMultiplicity().getMaxOccurs());
    }
    sFeature.setSynthetic(true);
    container.getFeatures().add(sFeature);
    return sFeature;
  }
  
  protected void initSyntheticType(final SType t, final String name, final DNamedElement source, final EObject container) {
    t.setName(name);
    t.setSynthetic(true);
    t.setDeductionRule(SimDerivedStateComputer.simFactory.createSGrabRule());
    SDeductionRule _deductionRule = t.getDeductionRule();
    _deductionRule.setSource(source);
    boolean _matched = false;
    if (container instanceof SAggregate) {
      _matched=true;
      ((SAggregate)container).getTypes().add(t);
    }
    if (!_matched) {
      if (container instanceof SInformationModel) {
        _matched=true;
        ((SInformationModel)container).getTypes().add(t);
      }
    }
  }
  
  public void addSyntheticLiteral(final SEnumeration container, final String name) {
    final SLiteral sLiteral = SimDerivedStateComputer.simFactory.createSLiteral();
    sLiteral.setName(name);
    sLiteral.setSynthetic(true);
    container.getLiterals().add(sLiteral);
  }
  
  public void processType(final SType sEnum, final SDeductionRule rule, final TransformationContext context) {
    if (sEnum instanceof SEnumeration
         && rule instanceof SGrabRule) {
      _processType((SEnumeration)sEnum, (SGrabRule)rule, context);
      return;
    } else if (sEnum instanceof SPrimitive
         && rule instanceof SGrabRule) {
      _processType((SPrimitive)sEnum, (SGrabRule)rule, context);
      return;
    } else if (sEnum instanceof SComplexType
         && rule instanceof SFuseRule) {
      _processType((SComplexType)sEnum, (SFuseRule)rule, context);
      return;
    } else if (sEnum instanceof SComplexType
         && rule instanceof SMorphRule) {
      _processType((SComplexType)sEnum, (SMorphRule)rule, context);
      return;
    } else if (sEnum instanceof SComplexType
         && rule instanceof SGrabRule) {
      _processType((SComplexType)sEnum, (SGrabRule)rule, context);
      return;
    } else if (sEnum != null
         && rule != null) {
      _processType(sEnum, rule, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sEnum, rule, context).toString());
    }
  }
}
