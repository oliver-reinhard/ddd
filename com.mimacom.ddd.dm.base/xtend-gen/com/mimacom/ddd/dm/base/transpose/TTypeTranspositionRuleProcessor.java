package com.mimacom.ddd.dm.base.transpose;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.ITransposableElement;
import com.mimacom.ddd.dm.base.base.ITransposition;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.TImplicitTransposition;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.dm.base.transpose.SyntheticModelElementsFactory;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDitchRule;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TFuseRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TRenameRule;
import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TypeSorter;
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
public class TTypeTranspositionRuleProcessor {
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  private static final String UNDEFINED = "UNDEFINED";
  
  protected void addImplicitSyntheticTypes(final ITypeContainer container, final TAggregateTransposition recipe, final DAggregate source, final List<SyntheticFeatureContainerDescriptor> acceptor) {
    final Iterable<ITransposition> typeRecipes = Iterables.<ITransposition>filter(recipe.getTypes(), ITransposition.class);
    final Function1<ITransposition, Boolean> _function = (ITransposition it) -> {
      TTranspositionRule _transpositionRule = it.getTranspositionRule();
      return Boolean.valueOf((_transpositionRule instanceof TGrabRule));
    };
    boolean _exists = IterableExtensions.<ITransposition>exists(typeRecipes, _function);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DType> implicitlyGrabbedSourceTypes = Lists.<DType>newArrayList(source.getTypes());
      final Function1<ITransposition, Boolean> _function_1 = (ITransposition it) -> {
        ITransposableElement _source = it.getTranspositionRule().getSource();
        return Boolean.valueOf((_source instanceof DType));
      };
      final Function1<ITransposition, DType> _function_2 = (ITransposition it) -> {
        ITransposableElement _source = it.getTranspositionRule().getSource();
        return ((DType) _source);
      };
      final Iterable<DType> sourceTypesAffectedByRule = IterableExtensions.<ITransposition, DType>map(IterableExtensions.<ITransposition>filter(typeRecipes, _function_1), _function_2);
      CollectionExtensions.<DType>removeAll(implicitlyGrabbedSourceTypes, sourceTypesAffectedByRule);
      for (final DType sourceType : implicitlyGrabbedSourceTypes) {
        {
          final TImplicitTransposition implicitTypeRecipes = this._syntheticModelElementsFactory.createImplicitTranspositionAsCopy(recipe, sourceType);
          final DType syntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, sourceType.getName(), sourceType, implicitTypeRecipes);
          if ((syntheticType instanceof DEnumeration)) {
            this.addImplicitSyntheticLiterals(((DEnumeration)syntheticType), ((DEnumeration) sourceType), implicitTypeRecipes);
          } else {
            if ((syntheticType instanceof DComplexType)) {
              SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((IFeatureContainer)syntheticType), implicitTypeRecipes, ((DComplexType) sourceType));
              acceptor.add(_syntheticFeatureContainerDescriptor);
            }
          }
        }
      }
    }
  }
  
  /**
   * Add synthetic types for which there is an explicit STypeDeduction rule in the aggregate:
   */
  protected void addSyntheticTypes(final ITypeContainer container, final DAggregate origin, final List<SyntheticFeatureContainerDescriptor> acceptor) {
    final List<TTypeTransposition> typeRecipes = IterableExtensions.<TTypeTransposition>toList(Iterables.<TTypeTransposition>filter(origin.getTypes(), TTypeTransposition.class));
    TypeSorter _typeSorter = new TypeSorter();
    Collections.<TTypeTransposition>sort(typeRecipes, _typeSorter);
    for (final TTypeTransposition r : typeRecipes) {
      {
        final TTranspositionRule rule = r.getTranspositionRule();
        final ITransposableElement source = rule.getSource();
        if ((source instanceof DType)) {
          final DType syntheticType = this.transposeType(container, r, rule);
          if ((syntheticType instanceof DComplexType)) {
            SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((IFeatureContainer)syntheticType), ((TComplexTypeTransposition) r), ((DComplexType) source));
            acceptor.add(_syntheticFeatureContainerDescriptor);
          }
        }
      }
    }
  }
  
  /**
   * Add synthetic types for which there is an explicit definition (but not a rule) in the aggregate:
   */
  protected void addSyntheticTypesAsCopy(final ITypeContainer container, final DAggregate origin, final List<SyntheticFeatureContainerDescriptor> acceptor) {
    final Function1<DType, Boolean> _function = (DType it) -> {
      return Boolean.valueOf((!(it instanceof TTypeTransposition)));
    };
    final List<DType> typeRecipes = IterableExtensions.<DType>toList(IterableExtensions.<DType>filter(origin.getTypes(), _function));
    for (final DType original : typeRecipes) {
      {
        final DType syntheticType = this._syntheticModelElementsFactory.addSyntheticTypeAsCopy(container, original);
        if ((syntheticType instanceof DComplexType)) {
          SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((IFeatureContainer)syntheticType), null, ((DComplexType) original));
          acceptor.add(_syntheticFeatureContainerDescriptor);
        }
      }
    }
  }
  
  protected DPrimitive _transposeType(final ITypeContainer container, final TPrimitiveTransposition recipe, final TGrabRule rule) {
    final ITransposableElement source = rule.getSource();
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
      DType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, name, ((DType)source), recipe);
      final DPrimitive syntheticType = ((DPrimitive) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  protected DEnumeration _transposeType(final ITypeContainer container, final TEnumerationTransposition recipe, final TGrabRule rule) {
    final ITransposableElement source = rule.getSource();
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
      DType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, name, ((DType)source), recipe);
      final DEnumeration syntheticEnum = ((DEnumeration) _addSyntheticType);
      this.addImplicitSyntheticLiterals(syntheticEnum, ((DEnumeration)source), recipe);
      this.addSyntheticLiterals(syntheticEnum, recipe);
      return syntheticEnum;
    }
    return null;
  }
  
  protected DComplexType _transposeType(final ITypeContainer container, final TComplexTypeTransposition recipe, final TGrabRule rule) {
    return this.grabComplexType(container, recipe, rule);
  }
  
  protected DComplexType _transposeType(final ITypeContainer container, final TComplexTypeTransposition recipe, final TMorphRule rule) {
    final DComplexType syntheticType = this.grabComplexType(container, recipe, rule);
    this.extendsComplexType(syntheticType, rule);
    return syntheticType;
  }
  
  protected DComplexType _transposeType(final ITypeContainer container, final TComplexTypeTransposition recipe, final TFuseRule rule) {
    final DComplexType syntheticType = this.grabComplexType(container, recipe, rule);
    this.extendsComplexType(syntheticType, rule);
    return syntheticType;
  }
  
  protected DComplexType _transposeType(final EObject container, final TTypeTransposition recipe, final TDitchRule rule) {
    return null;
  }
  
  protected DType _transposeType(final EObject container, final TTypeTransposition recipe, final TTranspositionRule rule) {
    throw new UnsupportedOperationException();
  }
  
  public DComplexType grabComplexType(final ITypeContainer container, final TComplexTypeTransposition recipe, final TRenameRule rule) {
    final ITransposableElement source = rule.getSource();
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
      DType _addSyntheticType = this._syntheticModelElementsFactory.addSyntheticType(container, name, ((DType)source), recipe);
      final DComplexType syntheticType = ((DComplexType) _addSyntheticType);
      return syntheticType;
    }
    return null;
  }
  
  public void extendsComplexType(final DComplexType syntheticType, final TStructureChangingRule rule) {
    if (((rule.getExtendFrom() instanceof DComplexType) && Objects.equal(syntheticType.getClass(), rule.getExtendFrom().getClass()))) {
      DType _extendFrom = rule.getExtendFrom();
      syntheticType.setSuperType(((DComplexType) _extendFrom));
    }
  }
  
  public void addImplicitSyntheticLiterals(final DEnumeration syntheticEnum, final DEnumeration source, final ITransposition recipe) {
    Iterable<TLiteralTransposition> literalRecipes = Lists.<TLiteralTransposition>newArrayList();
    if ((recipe instanceof TEnumerationTransposition)) {
      literalRecipes = Iterables.<TLiteralTransposition>filter(((TEnumerationTransposition)recipe).getLiterals(), TLiteralTransposition.class);
    }
    final Function1<TLiteralTransposition, Boolean> _function = (TLiteralTransposition it) -> {
      TTranspositionRule _transpositionRule = it.getTranspositionRule();
      return Boolean.valueOf((_transpositionRule instanceof TGrabRule));
    };
    boolean _exists = IterableExtensions.<TLiteralTransposition>exists(literalRecipes, _function);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DLiteral> implicitlyGrabbedSourceLiterals = Lists.<DLiteral>newArrayList(source.getLiterals());
      final Function1<TLiteralTransposition, Boolean> _function_1 = (TLiteralTransposition it) -> {
        ITransposableElement _source = it.getTranspositionRule().getSource();
        return Boolean.valueOf((_source instanceof DLiteral));
      };
      final Function1<TLiteralTransposition, DLiteral> _function_2 = (TLiteralTransposition it) -> {
        ITransposableElement _source = it.getTranspositionRule().getSource();
        return ((DLiteral) _source);
      };
      final Iterable<DLiteral> sourceLiteralsAffectedByRule = IterableExtensions.<TLiteralTransposition, DLiteral>map(IterableExtensions.<TLiteralTransposition>filter(literalRecipes, _function_1), _function_2);
      CollectionExtensions.<DLiteral>removeAll(implicitlyGrabbedSourceLiterals, sourceLiteralsAffectedByRule);
      for (final DLiteral sourceLiteral : implicitlyGrabbedSourceLiterals) {
        this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, sourceLiteral.getName(), sourceLiteral, this._syntheticModelElementsFactory.createImplicitTranspositionAsCopy(recipe, sourceLiteral));
      }
    }
  }
  
  public void addSyntheticLiterals(final DEnumeration syntheticEnum, final TEnumerationTransposition recipe) {
    final List<TLiteralTransposition> literalRecipes = IterableExtensions.<TLiteralTransposition>toList(Iterables.<TLiteralTransposition>filter(recipe.getLiterals(), TLiteralTransposition.class));
    for (final TLiteralTransposition definition : literalRecipes) {
      {
        final TTranspositionRule rule = definition.getTranspositionRule();
        if ((rule instanceof TGrabRule)) {
          String _xifexpression = null;
          String _renameTo = ((TGrabRule)rule).getRenameTo();
          boolean _tripleNotEquals = (_renameTo != null);
          if (_tripleNotEquals) {
            _xifexpression = ((TGrabRule)rule).getRenameTo();
          } else {
            String _xifexpression_1 = null;
            DNamedElement _namedSource = ((TGrabRule)rule).getNamedSource();
            boolean _tripleNotEquals_1 = (_namedSource != null);
            if (_tripleNotEquals_1) {
              _xifexpression_1 = ((TGrabRule)rule).getNamedSource().getName();
            } else {
              _xifexpression_1 = TTypeTranspositionRuleProcessor.UNDEFINED;
            }
            _xifexpression = _xifexpression_1;
          }
          final String literalName = _xifexpression;
          ITransposableElement _source = ((TGrabRule)rule).getSource();
          this._syntheticModelElementsFactory.addSyntheticLiteral(syntheticEnum, literalName, ((DLiteral) _source), definition);
        }
      }
    }
    final Function1<DLiteral, Boolean> _function = (DLiteral it) -> {
      return Boolean.valueOf((!((it instanceof TLiteralTransposition) || it.isSynthetic())));
    };
    final Iterable<DLiteral> genuineLiterals = IterableExtensions.<DLiteral>filter(recipe.getLiterals(), _function);
    for (final DLiteral literal : genuineLiterals) {
      this._syntheticModelElementsFactory.addSyntheticLiteralAsCopy(syntheticEnum, literal.getName(), literal);
    }
  }
  
  public DType transposeType(final EObject container, final TTypeTransposition recipe, final TTranspositionRule rule) {
    if (container instanceof ITypeContainer
         && recipe instanceof TEnumerationTransposition
         && rule instanceof TGrabRule) {
      return _transposeType((ITypeContainer)container, (TEnumerationTransposition)recipe, (TGrabRule)rule);
    } else if (container instanceof ITypeContainer
         && recipe instanceof TPrimitiveTransposition
         && rule instanceof TGrabRule) {
      return _transposeType((ITypeContainer)container, (TPrimitiveTransposition)recipe, (TGrabRule)rule);
    } else if (container instanceof ITypeContainer
         && recipe instanceof TComplexTypeTransposition
         && rule instanceof TFuseRule) {
      return _transposeType((ITypeContainer)container, (TComplexTypeTransposition)recipe, (TFuseRule)rule);
    } else if (container instanceof ITypeContainer
         && recipe instanceof TComplexTypeTransposition
         && rule instanceof TMorphRule) {
      return _transposeType((ITypeContainer)container, (TComplexTypeTransposition)recipe, (TMorphRule)rule);
    } else if (container instanceof ITypeContainer
         && recipe instanceof TComplexTypeTransposition
         && rule instanceof TGrabRule) {
      return _transposeType((ITypeContainer)container, (TComplexTypeTransposition)recipe, (TGrabRule)rule);
    } else if (container != null
         && recipe != null
         && rule instanceof TDitchRule) {
      return _transposeType(container, recipe, (TDitchRule)rule);
    } else if (container != null
         && recipe != null
         && rule != null) {
      return _transposeType(container, recipe, rule);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, recipe, rule).toString());
    }
  }
}
