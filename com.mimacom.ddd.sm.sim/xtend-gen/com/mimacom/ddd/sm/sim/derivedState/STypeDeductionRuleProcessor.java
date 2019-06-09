package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.derivedState.STypeSorter;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticComplexTypeDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class STypeDeductionRuleProcessor {
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  private static final String UNDEFINED = "UNDEFINED";
  
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
          final SType syntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, dType.getName(), dType, null, context);
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
    STypeSorter _sTypeSorter = new STypeSorter();
    Collections.<SType>sort(sTypesWithRule, _sTypeSorter);
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
      SType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(typeWithRule.eContainer(), name, ((DType)source), typeWithRule, context);
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
      SType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(typeWithRule.eContainer(), name, ((DType)source), typeWithRule, context);
      final SEnumeration syntheticEnum = ((SEnumeration) _addSyntheticType);
      this.addImplicitSyntheticLiterals(syntheticEnum, ((DEnumeration)source), typeWithRule);
      this.addSyntheticLiterals(syntheticEnum, typeWithRule);
      return syntheticEnum;
    }
    return null;
  }
  
  protected SType _processTypeWithRule(final SType typeWithRule, final SDeductionRule rule, final TransformationContext context) {
    throw new UnsupportedOperationException();
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType typeWithRule, final SGrabRule rule, final TransformationContext context) {
    return this.grabComplexType(typeWithRule, rule, context);
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType typeWithRule, final SMorphRule rule, final TransformationContext context) {
    final SComplexType syntheticType = this.grabComplexType(typeWithRule, rule, context);
    this.extendsComplexType(syntheticType, rule, context);
    return syntheticType;
  }
  
  protected SComplexType _processTypeWithRule(final SComplexType typeWithRule, final SFuseRule rule, final TransformationContext context) {
    final SComplexType syntheticType = this.grabComplexType(typeWithRule, rule, context);
    this.extendsComplexType(syntheticType, rule, context);
    return syntheticType;
  }
  
  public SComplexType grabComplexType(final SComplexType typeWithRule, final SGrabRule rule, final TransformationContext context) {
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
      SType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(typeWithRule.eContainer(), name, ((DType)source), typeWithRule, context);
      final SComplexType syntheticType = ((SComplexType) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  public void extendsComplexType(final SComplexType typeWithRule, final SStructureChangingRule rule, final TransformationContext context) {
    if (((rule.getExtendFrom() instanceof SComplexType) && Objects.equal(typeWithRule.getClass(), rule.getExtendFrom().getClass()))) {
      SType _extendFrom = rule.getExtendFrom();
      typeWithRule.setSuperType(((SComplexType) _extendFrom));
    }
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
        this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, dLiteral.getName());
      }
    }
  }
  
  public void addSyntheticLiterals(final SEnumeration syntheticEnum, final SEnumeration sEnumWithRule) {
    final Function1<SLiteral, Boolean> _function = (SLiteral it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    final List<SLiteral> sLiteralsWithRule = IterableExtensions.<SLiteral>toList(IterableExtensions.<SLiteral>filter(sEnumWithRule.getLiterals(), _function));
    for (final SLiteral sLiteral : sLiteralsWithRule) {
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
              _xifexpression_1 = STypeDeductionRuleProcessor.UNDEFINED;
            }
            _xifexpression = _xifexpression_1;
          }
          final String literalName = _xifexpression;
          this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, literalName);
        }
      }
    }
    final Function1<SLiteral, Boolean> _function_1 = (SLiteral it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.GENUINE));
    };
    final Iterable<SLiteral> sLiteralsGenuine = IterableExtensions.<SLiteral>filter(sEnumWithRule.getLiterals(), _function_1);
    for (final SLiteral sLiteral_1 : sLiteralsGenuine) {
      this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, sLiteral_1.getName());
    }
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
}
