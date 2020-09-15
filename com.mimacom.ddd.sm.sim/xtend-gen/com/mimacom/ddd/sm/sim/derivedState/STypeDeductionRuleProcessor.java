package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DImplicitDeduction;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SLiteralDeduction;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction;
import com.mimacom.ddd.sm.sim.SRenameRule;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import com.mimacom.ddd.sm.sim.derivedState.TypeSorter;
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
  
  protected void addImplicitSyntheticTypes(final ITypeContainer container, final SAggregateDeduction deductionDefinition, final DAggregate source, final List<SyntheticFeatureContainerDescriptor> acceptor) {
    final Iterable<IDeductionDefinition> typeDeductionDefinitions = Iterables.<IDeductionDefinition>filter(deductionDefinition.getTypes(), IDeductionDefinition.class);
    final Function1<IDeductionDefinition, Boolean> _function = (IDeductionDefinition it) -> {
      DDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<IDeductionDefinition>exists(typeDeductionDefinitions, _function);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DType> implicitlyGrabbedSourceTypes = Lists.<DType>newArrayList(source.getTypes());
      final Function1<IDeductionDefinition, Boolean> _function_1 = (IDeductionDefinition it) -> {
        IDeducibleElement _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DType));
      };
      final Function1<IDeductionDefinition, DType> _function_2 = (IDeductionDefinition it) -> {
        IDeducibleElement _source = it.getDeductionRule().getSource();
        return ((DType) _source);
      };
      final Iterable<DType> sourceTypesAffectedByRule = IterableExtensions.<IDeductionDefinition, DType>map(IterableExtensions.<IDeductionDefinition>filter(typeDeductionDefinitions, _function_1), _function_2);
      CollectionExtensions.<DType>removeAll(implicitlyGrabbedSourceTypes, sourceTypesAffectedByRule);
      for (final DType sourceType : implicitlyGrabbedSourceTypes) {
        {
          final DImplicitDeduction implicitTypeDeduction = this._syntheticModelElementsFactory.createImplicitElementCopyDeduction(deductionDefinition, sourceType);
          final DType syntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, sourceType.getName(), sourceType, implicitTypeDeduction);
          if ((syntheticType instanceof DEnumeration)) {
            this.addImplicitSyntheticLiterals(((DEnumeration)syntheticType), ((DEnumeration) sourceType), implicitTypeDeduction);
          } else {
            if ((syntheticType instanceof DComplexType)) {
              SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((IFeatureContainer)syntheticType), implicitTypeDeduction, ((DComplexType) sourceType));
              acceptor.add(_syntheticFeatureContainerDescriptor);
            }
          }
        }
      }
    }
  }
  
  protected void addSyntheticTypes(final ITypeContainer container, final DAggregate origin, final List<SyntheticFeatureContainerDescriptor> acceptor) {
    final List<STypeDeduction> typeDeductionDefinitions = IterableExtensions.<STypeDeduction>toList(Iterables.<STypeDeduction>filter(origin.getTypes(), STypeDeduction.class));
    TypeSorter _typeSorter = new TypeSorter();
    Collections.<STypeDeduction>sort(typeDeductionDefinitions, _typeSorter);
    for (final STypeDeduction definition : typeDeductionDefinitions) {
      {
        final DDeductionRule rule = definition.getDeductionRule();
        final IDeducibleElement source = rule.getSource();
        if ((source instanceof DType)) {
          final DType syntheticType = this.processTypeDeduction(container, definition, rule);
          if ((syntheticType instanceof DComplexType)) {
            SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((IFeatureContainer)syntheticType), ((SComplexTypeDeduction) definition), ((DComplexType) source));
            acceptor.add(_syntheticFeatureContainerDescriptor);
          }
        }
      }
    }
  }
  
  protected DPrimitive _processTypeDeduction(final ITypeContainer container, final SPrimitiveDeduction deductionDefinition, final SGrabRule rule) {
    final IDeducibleElement source = rule.getSource();
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
      DType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, name, ((DType)source), deductionDefinition);
      final DPrimitive syntheticType = ((DPrimitive) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  protected DEnumeration _processTypeDeduction(final ITypeContainer container, final SEnumerationDeduction deductionDefinition, final SGrabRule rule) {
    final IDeducibleElement source = rule.getSource();
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
      DType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, name, ((DType)source), deductionDefinition);
      final DEnumeration syntheticEnum = ((DEnumeration) _addSyntheticType);
      this.addImplicitSyntheticLiterals(syntheticEnum, ((DEnumeration)source), deductionDefinition);
      this.addSyntheticLiterals(syntheticEnum, deductionDefinition);
      return syntheticEnum;
    }
    return null;
  }
  
  protected DComplexType _processTypeDeduction(final ITypeContainer container, final SComplexTypeDeduction deductionDefinition, final SGrabRule rule) {
    return this.grabComplexType(container, deductionDefinition, rule);
  }
  
  protected DComplexType _processTypeDeduction(final ITypeContainer container, final SComplexTypeDeduction deductionDefinition, final SMorphRule rule) {
    final DComplexType syntheticType = this.grabComplexType(container, deductionDefinition, rule);
    this.extendsComplexType(syntheticType, rule);
    return syntheticType;
  }
  
  protected DComplexType _processTypeDeduction(final ITypeContainer container, final SComplexTypeDeduction deductionDefinition, final SFuseRule rule) {
    final DComplexType syntheticType = this.grabComplexType(container, deductionDefinition, rule);
    this.extendsComplexType(syntheticType, rule);
    return syntheticType;
  }
  
  protected DComplexType _processTypeDeduction(final EObject container, final STypeDeduction deductionDefinition, final SDitchRule rule) {
    return null;
  }
  
  protected DType _processTypeDeduction(final EObject container, final STypeDeduction deductionDefinition, final DDeductionRule rule) {
    throw new UnsupportedOperationException();
  }
  
  public DComplexType grabComplexType(final ITypeContainer container, final SComplexTypeDeduction deductionDefinition, final SRenameRule rule) {
    final IDeducibleElement source = rule.getSource();
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
      DType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, name, ((DType)source), deductionDefinition);
      final DComplexType syntheticType = ((DComplexType) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  public void extendsComplexType(final DComplexType syntheticType, final SStructureChangingRule rule) {
    if (((rule.getExtendFrom() instanceof DComplexType) && Objects.equal(syntheticType.getClass(), rule.getExtendFrom().getClass()))) {
      DType _extendFrom = rule.getExtendFrom();
      syntheticType.setSuperType(((DComplexType) _extendFrom));
    }
  }
  
  public void addImplicitSyntheticLiterals(final DEnumeration syntheticEnum, final DEnumeration source, final IDeductionDefinition deductionDefinition) {
    Iterable<SLiteralDeduction> literalDeductionDefinitions = Lists.<SLiteralDeduction>newArrayList();
    if ((deductionDefinition instanceof SEnumerationDeduction)) {
      literalDeductionDefinitions = Iterables.<SLiteralDeduction>filter(((SEnumerationDeduction)deductionDefinition).getLiterals(), SLiteralDeduction.class);
    }
    final Function1<SLiteralDeduction, Boolean> _function = (SLiteralDeduction it) -> {
      DDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SLiteralDeduction>exists(literalDeductionDefinitions, _function);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DLiteral> implicitlyGrabbedSourceLiterals = Lists.<DLiteral>newArrayList(source.getLiterals());
      final Function1<SLiteralDeduction, Boolean> _function_1 = (SLiteralDeduction it) -> {
        IDeducibleElement _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DLiteral));
      };
      final Function1<SLiteralDeduction, DLiteral> _function_2 = (SLiteralDeduction it) -> {
        IDeducibleElement _source = it.getDeductionRule().getSource();
        return ((DLiteral) _source);
      };
      final Iterable<DLiteral> sourceLiteralsAffectedByRule = IterableExtensions.<SLiteralDeduction, DLiteral>map(IterableExtensions.<SLiteralDeduction>filter(literalDeductionDefinitions, _function_1), _function_2);
      CollectionExtensions.<DLiteral>removeAll(implicitlyGrabbedSourceLiterals, sourceLiteralsAffectedByRule);
      for (final DLiteral sourceLiteral : implicitlyGrabbedSourceLiterals) {
        this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, sourceLiteral.getName(), this._syntheticModelElementsFactory.createImplicitElementCopyDeduction(deductionDefinition, sourceLiteral));
      }
    }
  }
  
  public void addSyntheticLiterals(final DEnumeration syntheticEnum, final SEnumerationDeduction deductionDefinition) {
    final List<SLiteralDeduction> literalDeductionDefinitions = IterableExtensions.<SLiteralDeduction>toList(Iterables.<SLiteralDeduction>filter(deductionDefinition.getLiterals(), SLiteralDeduction.class));
    for (final SLiteralDeduction definition : literalDeductionDefinitions) {
      {
        final DDeductionRule rule = definition.getDeductionRule();
        if ((rule instanceof SGrabRule)) {
          String _xifexpression = null;
          String _renameTo = ((SGrabRule)rule).getRenameTo();
          boolean _tripleNotEquals = (_renameTo != null);
          if (_tripleNotEquals) {
            _xifexpression = ((SGrabRule)rule).getRenameTo();
          } else {
            String _xifexpression_1 = null;
            DNamedElement _namedSource = ((SGrabRule)rule).getNamedSource();
            boolean _tripleNotEquals_1 = (_namedSource != null);
            if (_tripleNotEquals_1) {
              _xifexpression_1 = ((SGrabRule)rule).getNamedSource().getName();
            } else {
              _xifexpression_1 = STypeDeductionRuleProcessor.UNDEFINED;
            }
            _xifexpression = _xifexpression_1;
          }
          final String literalName = _xifexpression;
          this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, literalName, definition);
        }
      }
    }
    final Function1<DLiteral, Boolean> _function = (DLiteral it) -> {
      return Boolean.valueOf((!((it instanceof SLiteralDeduction) || it.isSynthetic())));
    };
    final Iterable<DLiteral> genuineLiterals = IterableExtensions.<DLiteral>filter(deductionDefinition.getLiterals(), _function);
    for (final DLiteral literal : genuineLiterals) {
      this._syntheticModelElementsFactory.addSyntheticLiteralAsCopy(syntheticEnum, literal.getName());
    }
  }
  
  public DType processTypeDeduction(final EObject container, final STypeDeduction deductionDefinition, final DDeductionRule rule) {
    if (container instanceof ITypeContainer
         && deductionDefinition instanceof SEnumerationDeduction
         && rule instanceof SGrabRule) {
      return _processTypeDeduction((ITypeContainer)container, (SEnumerationDeduction)deductionDefinition, (SGrabRule)rule);
    } else if (container instanceof ITypeContainer
         && deductionDefinition instanceof SPrimitiveDeduction
         && rule instanceof SGrabRule) {
      return _processTypeDeduction((ITypeContainer)container, (SPrimitiveDeduction)deductionDefinition, (SGrabRule)rule);
    } else if (container instanceof ITypeContainer
         && deductionDefinition instanceof SComplexTypeDeduction
         && rule instanceof SFuseRule) {
      return _processTypeDeduction((ITypeContainer)container, (SComplexTypeDeduction)deductionDefinition, (SFuseRule)rule);
    } else if (container instanceof ITypeContainer
         && deductionDefinition instanceof SComplexTypeDeduction
         && rule instanceof SMorphRule) {
      return _processTypeDeduction((ITypeContainer)container, (SComplexTypeDeduction)deductionDefinition, (SMorphRule)rule);
    } else if (container instanceof ITypeContainer
         && deductionDefinition instanceof SComplexTypeDeduction
         && rule instanceof SGrabRule) {
      return _processTypeDeduction((ITypeContainer)container, (SComplexTypeDeduction)deductionDefinition, (SGrabRule)rule);
    } else if (container != null
         && deductionDefinition != null
         && rule instanceof SDitchRule) {
      return _processTypeDeduction(container, deductionDefinition, (SDitchRule)rule);
    } else if (container != null
         && deductionDefinition != null
         && rule != null) {
      return _processTypeDeduction(container, deductionDefinition, rule);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, deductionDefinition, rule).toString());
    }
  }
}
