package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SNamedElementDeductionRule;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SimDerivedStateComputer implements IDerivedStateComputer {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  private static Logger LOGGER = Logger.getLogger(SimDerivedStateComputer.class);
  
  private static final SimFactory smsFactory = SimFactory.eINSTANCE;
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      final TransformationContext context = new TransformationContext(resource);
      final Function1<SType, Boolean> _function = (SType it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      final Iterator<SType> candidates = IteratorExtensions.<SType>filter(Iterators.<SType>filter(resource.getAllContents(), SType.class), _function);
      while (candidates.hasNext()) {
        {
          SType type = candidates.next();
          this.processType(type, type.getDeductionRule(), context);
        }
      }
    }
  }
  
  protected void _processType(final SEnumeration sEnum, final SGrabRule rule, final TransformationContext context) {
    DNamedElement _source = rule.getSource();
    final DEnumeration dEnum = ((DEnumeration) _source);
    String _xifexpression = null;
    String _renameTo = rule.getRenameTo();
    boolean _tripleNotEquals = (_renameTo != null);
    if (_tripleNotEquals) {
      _xifexpression = rule.getRenameTo();
    } else {
      _xifexpression = dEnum.getName();
    }
    sEnum.setName(_xifexpression);
    final ArrayList<DLiteral> implicitlyGrabbedLiteralsCandidates = Lists.<DLiteral>newArrayList();
    if ((sEnum.getLiterals().isEmpty() || IterableExtensions.<SLiteral>exists(sEnum.getLiterals(), ((Function1<SLiteral, Boolean>) (SLiteral it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SDitchRule));
    })))) {
      implicitlyGrabbedLiteralsCandidates.addAll(dEnum.getLiterals());
      final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
        SDeductionRule _deductionRule = it.getDeductionRule();
        return Boolean.valueOf((_deductionRule instanceof SDitchRule));
      };
      Iterable<SLiteral> _filter = IterableExtensions.<SLiteral>filter(sEnum.getLiterals(), _function);
      for (final SLiteral sLiteral : _filter) {
        SDeductionRule _deductionRule = sLiteral.getDeductionRule();
        implicitlyGrabbedLiteralsCandidates.remove(((SNamedElementDeductionRule) _deductionRule).getSource());
      }
    } else {
      final Function1<SLiteral, Boolean> _function_1 = (SLiteral it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      Iterable<SLiteral> _filter_1 = IterableExtensions.<SLiteral>filter(sEnum.getLiterals(), _function_1);
      for (final SLiteral sLiteral_1 : _filter_1) {
        {
          SDeductionRule _deductionRule_1 = sLiteral_1.getDeductionRule();
          implicitlyGrabbedLiteralsCandidates.remove(((SNamedElementDeductionRule) _deductionRule_1).getSource());
          final SDeductionRule literalRule = sLiteral_1.getDeductionRule();
          if ((literalRule instanceof SGrabRule)) {
            String _xifexpression_1 = null;
            String _renameTo_1 = ((SGrabRule)literalRule).getRenameTo();
            boolean _tripleNotEquals_1 = (_renameTo_1 != null);
            if (_tripleNotEquals_1) {
              _xifexpression_1 = ((SGrabRule)literalRule).getRenameTo();
            } else {
              _xifexpression_1 = ((SGrabRule)literalRule).getSource().getName();
            }
            this.addSyntheticLiteral(sEnum, _xifexpression_1);
          }
        }
      }
    }
    for (final DLiteral dLiteral : implicitlyGrabbedLiteralsCandidates) {
      this.addSyntheticLiteral(sEnum, dLiteral.getName());
    }
  }
  
  public void addSyntheticLiteral(final SEnumeration sEnum, final String name) {
    final SLiteral sLiteral = SimDerivedStateComputer.smsFactory.createSLiteral();
    sLiteral.setName(name);
    sLiteral.setSynthetic(Boolean.valueOf(true));
    sEnum.getLiterals().add(sLiteral);
  }
  
  protected void _processType(final SComplexType sType, final SGrabRule rule, final TransformationContext context) {
    final DNamedElement dType = rule.getSource();
    String _xifexpression = null;
    String _renameTo = rule.getRenameTo();
    boolean _tripleNotEquals = (_renameTo != null);
    if (_tripleNotEquals) {
      _xifexpression = rule.getRenameTo();
    } else {
      _xifexpression = dType.getName();
    }
    sType.setName(_xifexpression);
    final ArrayList<DFeature> implicitlyGrabbedFeaturesCandidates = Lists.<DFeature>newArrayList();
    if ((sType.getFeatures().isEmpty() || IterableExtensions.<SFeature>exists(sType.getFeatures(), ((Function1<SFeature, Boolean>) (SFeature it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SDitchRule));
    })))) {
      SDeductionRule _deductionRule = sType.getDeductionRule();
      final DNamedElement source = ((SNamedElementDeductionRule) _deductionRule).getSource();
      implicitlyGrabbedFeaturesCandidates.addAll(this._simUtil.allFeatures(((DComplexType) source)));
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SDeductionRule _deductionRule_1 = it.getDeductionRule();
        return Boolean.valueOf((_deductionRule_1 instanceof SDitchRule));
      };
      Iterable<SFeature> _filter = IterableExtensions.<SFeature>filter(sType.getFeatures(), _function);
      for (final SFeature sFeature : _filter) {
        SDeductionRule _deductionRule_1 = sFeature.getDeductionRule();
        implicitlyGrabbedFeaturesCandidates.remove(((SNamedElementDeductionRule) _deductionRule_1).getSource());
      }
    } else {
      final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      Iterable<SFeature> _filter_1 = IterableExtensions.<SFeature>filter(sType.getFeatures(), _function_1);
      for (final SFeature sFeature_1 : _filter_1) {
        {
          SDeductionRule _deductionRule_2 = sFeature_1.getDeductionRule();
          implicitlyGrabbedFeaturesCandidates.remove(((SNamedElementDeductionRule) _deductionRule_2).getSource());
          this.processFeature(sFeature_1, sFeature_1.getDeductionRule(), context);
        }
      }
    }
    for (final DFeature dFeature : implicitlyGrabbedFeaturesCandidates) {
      try {
        this.addSyntheticFeature(sType, dFeature.getName(), dFeature, context);
      } catch (final Throwable _t) {
        if (_t instanceof TransformationContext.UnsupportedDomainTypeException) {
          final TransformationContext.UnsupportedDomainTypeException ex = (TransformationContext.UnsupportedDomainTypeException)_t;
          SimDerivedStateComputer.LOGGER.error(dFeature, ex);
        } else {
          throw Exceptions.sneakyThrow(_t);
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
  
  public SFeature addSyntheticFeature(final SComplexType sType, final String name, final DFeature dFeature, final TransformationContext context) throws TransformationContext.UnsupportedDomainTypeException {
    SFeature _switchResult = null;
    boolean _matched = false;
    if (dFeature instanceof DAttribute) {
      _matched=true;
      _switchResult = SimDerivedStateComputer.smsFactory.createSAttribute();
    }
    if (!_matched) {
      if (dFeature instanceof DQuery) {
        _matched=true;
        _switchResult = SimDerivedStateComputer.smsFactory.createSQuery();
      }
    }
    if (!_matched) {
      if (dFeature instanceof DAssociation) {
        _matched=true;
        _switchResult = SimDerivedStateComputer.smsFactory.createSAssociation();
      }
    }
    final SFeature sFeature = _switchResult;
    sFeature.setName(dFeature.getName());
    final DType dFeatureType = dFeature.getType();
    if ((dFeatureType == null)) {
      return null;
    }
    sFeature.setType(context.getSType(dFeatureType));
    DMultiplicity _multiplicity = dFeature.getMultiplicity();
    boolean _tripleNotEquals = (_multiplicity != null);
    if (_tripleNotEquals) {
      sFeature.setMultiplicity(SimDerivedStateComputer.smsFactory.createSMultiplicity());
      SMultiplicity _multiplicity_1 = sFeature.getMultiplicity();
      _multiplicity_1.setMinOccurs(dFeature.getMultiplicity().getMinOccurs());
      SMultiplicity _multiplicity_2 = sFeature.getMultiplicity();
      _multiplicity_2.setMaxOccurs(dFeature.getMultiplicity().getMaxOccurs());
    }
    sFeature.setSynthetic(Boolean.valueOf(true));
    sType.getFeatures().add(sFeature);
    return sFeature;
  }
  
  protected SFeature _processFeature(final SFeature sFeature, final SGrabRule rule, final TransformationContext context) {
    EObject _eContainer = sFeature.eContainer();
    final SComplexType sComplexType = ((SComplexType) _eContainer);
    DNamedElement _source = rule.getSource();
    final DFeature dFeature = ((DFeature) _source);
    try {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = dFeature.getName();
      }
      return this.addSyntheticFeature(sComplexType, _xifexpression, dFeature, context);
    } catch (final Throwable _t) {
      if (_t instanceof TransformationContext.UnsupportedDomainTypeException) {
        final TransformationContext.UnsupportedDomainTypeException ex = (TransformationContext.UnsupportedDomainTypeException)_t;
        SimDerivedStateComputer.LOGGER.error(dFeature, ex);
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected SFeature _processFeature(final SFeature sFeature, final SMorphRule rule, final TransformationContext context) {
    final SFeature syntheticFeature = this.processFeature(sFeature, ((SGrabRule) rule), context);
    SType _retypeTo = rule.getRetypeTo();
    boolean _tripleNotEquals = (_retypeTo != null);
    if (_tripleNotEquals) {
      syntheticFeature.setType(rule.getRetypeTo());
    }
    SMultiplicity _remultiplyTo = rule.getRemultiplyTo();
    boolean _tripleNotEquals_1 = (_remultiplyTo != null);
    if (_tripleNotEquals_1) {
      syntheticFeature.setMultiplicity(SimDerivedStateComputer.smsFactory.createSMultiplicity());
      SMultiplicity _multiplicity = syntheticFeature.getMultiplicity();
      _multiplicity.setMinOccurs(rule.getRemultiplyTo().getMinOccurs());
      SMultiplicity _multiplicity_1 = syntheticFeature.getMultiplicity();
      _multiplicity_1.setMaxOccurs(rule.getRemultiplyTo().getMaxOccurs());
    }
    return syntheticFeature;
  }
  
  protected SFeature _processFeature(final SFeature sFeature, final SDitchRule rule, final TransformationContext context) {
    return null;
  }
  
  protected SFeature _processFeature(final SFeature sFeature, final SDeductionRule rule, final TransformationContext context) {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    final Function1<SDeducibleElement, Boolean> _function = (SDeducibleElement it) -> {
      return Boolean.valueOf(((it.getSynthetic() != null) && (it.getSynthetic()).booleanValue()));
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
  
  public void processType(final SType sEnum, final SDeductionRule rule, final TransformationContext context) {
    if (sEnum instanceof SEnumeration
         && rule instanceof SGrabRule) {
      _processType((SEnumeration)sEnum, (SGrabRule)rule, context);
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
  
  public SFeature processFeature(final SFeature sFeature, final SDeductionRule rule, final TransformationContext context) {
    if (rule instanceof SMorphRule) {
      return _processFeature(sFeature, (SMorphRule)rule, context);
    } else if (rule instanceof SDitchRule) {
      return _processFeature(sFeature, (SDitchRule)rule, context);
    } else if (rule instanceof SGrabRule) {
      return _processFeature(sFeature, (SGrabRule)rule, context);
    } else if (rule != null) {
      return _processFeature(sFeature, rule, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sFeature, rule, context).toString());
    }
  }
}
