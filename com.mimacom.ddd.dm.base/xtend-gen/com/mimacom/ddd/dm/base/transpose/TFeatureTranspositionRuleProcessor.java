package com.mimacom.ddd.dm.base.transpose;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter;
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.TDitchRule;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TRenameRule;
import com.mimacom.ddd.dm.base.transpose.TSyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.dm.base.transpose.TSyntheticModelElementsFactory;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TFeatureTranspositionRuleProcessor {
  @Inject
  @Extension
  private TypesUtil _typesUtil;
  
  @Inject
  @Extension
  private TSyntheticModelElementsFactory _tSyntheticModelElementsFactory;
  
  protected void _transposeFeature(final IFeatureContainer container, final TFeatureTransposition recipe, final TGrabRule rule) {
    this.grabFeature(container, recipe, rule);
  }
  
  protected void _transposeFeature(final IFeatureContainer container, final TFeatureTransposition recipe, final TMorphRule rule) {
    final DFeature syntheticFeature = this.grabFeature(container, recipe, rule);
    if ((syntheticFeature != null)) {
      DType _retypeTo = rule.getRetypeTo();
      boolean _tripleNotEquals = (_retypeTo != null);
      if (_tripleNotEquals) {
        syntheticFeature.setType(rule.getRetypeTo());
      }
      DMultiplicity _remultiplyTo = rule.getRemultiplyTo();
      boolean _tripleNotEquals_1 = (_remultiplyTo != null);
      if (_tripleNotEquals_1) {
        syntheticFeature.setMultiplicity(rule.getRemultiplyTo());
      }
    }
  }
  
  protected void _transposeFeature(final IFeatureContainer container, final TFeatureTransposition recipe, final TDitchRule rule) {
  }
  
  public DFeature grabFeature(final IFeatureContainer container, final TFeatureTransposition recipe, final TRenameRule rule) {
    final ITransposableElement source = rule.getSource();
    if ((source instanceof DFeature)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DFeature)source).getName();
      }
      final TSyntheticFeature syntheticFeature = this._tSyntheticModelElementsFactory.addSyntheticFeature(container, _xifexpression, ((DFeature)source), recipe);
      if ((recipe instanceof TQueryTransposition)) {
        final DQuery syntheticQuery = ((DQuery) syntheticFeature);
        final Iterable<TQueryParameterTransposition> parameterRecipes = Iterables.<TQueryParameterTransposition>filter(((TQueryTransposition)recipe).getParameters(), TQueryParameterTransposition.class);
        final Function1<DQueryParameter, Boolean> _function = (DQueryParameter it) -> {
          return Boolean.valueOf((!((it instanceof TQueryParameterTransposition) || (it instanceof ISyntheticElement))));
        };
        Iterable<DQueryParameter> explicitParameters = IterableExtensions.<DQueryParameter>filter(((TQueryTransposition)recipe).getParameters(), _function);
        final Function1<TQueryParameterTransposition, Boolean> _function_1 = (TQueryParameterTransposition it) -> {
          return Boolean.valueOf((rule instanceof TGrabRule));
        };
        boolean _exists = IterableExtensions.<TQueryParameterTransposition>exists(parameterRecipes, _function_1);
        boolean _not = (!_exists);
        if (_not) {
          final Function1<DQueryParameter, Boolean> _function_2 = (DQueryParameter it) -> {
            return Boolean.valueOf((it instanceof ITransposableElement));
          };
          final ArrayList<DQueryParameter> implicitlyGrabbedSourceParameters = Lists.<DQueryParameter>newArrayList(IterableExtensions.<DQueryParameter>filter(((DQuery) source).getParameters(), _function_2));
          final Function1<TQueryParameterTransposition, ITransposableElement> _function_3 = (TQueryParameterTransposition it) -> {
            return rule.getSource();
          };
          final Iterable<DQueryParameter> sourceParametersWithTransposition = Iterables.<DQueryParameter>filter(IterableExtensions.<TQueryParameterTransposition, ITransposableElement>map(parameterRecipes, _function_3), DQueryParameter.class);
          CollectionExtensions.<DQueryParameter>removeAll(implicitlyGrabbedSourceParameters, sourceParametersWithTransposition);
          for (final DQueryParameter sourceParameter : implicitlyGrabbedSourceParameters) {
            this._tSyntheticModelElementsFactory.addSyntheticQueryParameter(syntheticQuery, sourceParameter.getName(), sourceParameter, 
              this._tSyntheticModelElementsFactory.createImplicitTranspositionAsCopy(recipe, ((ITransposableElement) sourceParameter)));
          }
        }
        final List<TQueryParameterTransposition> parameterRecipesList = IterableExtensions.<TQueryParameterTransposition>toList(parameterRecipes);
        for (final TQueryParameterTransposition r : parameterRecipesList) {
          this.transposeQueryParameter(syntheticQuery, r, r.getRule());
        }
        for (final DQueryParameter p : explicitParameters) {
          this._tSyntheticModelElementsFactory.addSyntheticQueryParameterAsCopy(syntheticQuery, p);
        }
      }
      return syntheticFeature;
    }
    return null;
  }
  
  public void addSyntheticFeatures(final TSyntheticFeatureContainerDescriptor desc) {
    Iterable<TFeatureTransposition> featureRecipes = Lists.<TFeatureTransposition>newArrayList();
    Iterable<DFeature> explicitFeatures = Lists.<DFeature>newArrayList();
    if ((desc.recipe == null)) {
      explicitFeatures = desc.source.getFeatures();
    } else {
      if ((desc.recipe instanceof IFeatureContainer)) {
        final IFeatureContainer featureContainer = ((IFeatureContainer) desc.recipe);
        featureRecipes = Iterables.<TFeatureTransposition>filter(featureContainer.getFeatures(), TFeatureTransposition.class);
        final Function1<DFeature, Boolean> _function = (DFeature it) -> {
          return Boolean.valueOf((!((it instanceof TFeatureTransposition) || (it instanceof ISyntheticElement))));
        };
        explicitFeatures = IterableExtensions.<DFeature>filter(featureContainer.getFeatures(), _function);
      }
      final Function1<TFeatureTransposition, Boolean> _function_1 = (TFeatureTransposition it) -> {
        TTranspositionRule _rule = it.getRule();
        return Boolean.valueOf((_rule instanceof TGrabRule));
      };
      boolean _exists = IterableExtensions.<TFeatureTransposition>exists(featureRecipes, _function_1);
      boolean _not = (!_exists);
      if (_not) {
        final Function1<DFeature, Boolean> _function_2 = (DFeature it) -> {
          return Boolean.valueOf((it instanceof ITransposableElement));
        };
        final ArrayList<DFeature> implicitlyGrabbedSourceFeatures = Lists.<DFeature>newArrayList(IterableExtensions.<DFeature>filter(this._typesUtil.allFeatures(desc.source), _function_2));
        final Function1<TFeatureTransposition, ITransposableElement> _function_3 = (TFeatureTransposition it) -> {
          return it.getRule().getSource();
        };
        final Iterable<DFeature> sourceFeaturesWithTransposition = Iterables.<DFeature>filter(IterableExtensions.<TFeatureTransposition, ITransposableElement>map(featureRecipes, _function_3), DFeature.class);
        CollectionExtensions.<DFeature>removeAll(implicitlyGrabbedSourceFeatures, sourceFeaturesWithTransposition);
        for (final DFeature sourceFeature : implicitlyGrabbedSourceFeatures) {
          this._tSyntheticModelElementsFactory.addSyntheticFeature(desc.syntheticType, sourceFeature.getName(), sourceFeature, 
            this._tSyntheticModelElementsFactory.createImplicitTranspositionAsCopy(desc.recipe, ((ITransposableElement) sourceFeature)));
        }
      }
      final List<TFeatureTransposition> featureRecipesList = IterableExtensions.<TFeatureTransposition>toList(featureRecipes);
      for (final TFeatureTransposition r : featureRecipesList) {
        this.transposeFeature(desc.syntheticType, r, r.getRule());
      }
    }
    for (final DFeature f : explicitFeatures) {
      this._tSyntheticModelElementsFactory.addSyntheticFeatureAsCopy(desc.syntheticType, f);
    }
  }
  
  protected void _transposeQueryParameter(final DQuery container, final TQueryParameterTransposition recipe, final TGrabRule rule) {
    this.grabQueryParameter(container, recipe, rule);
  }
  
  protected void _transposeQueryParameter(final DQuery container, final TQueryParameterTransposition recipe, final TMorphRule rule) {
    final DQueryParameter syntheticParameter = this.grabQueryParameter(container, recipe, rule);
    if ((syntheticParameter != null)) {
      DType _retypeTo = rule.getRetypeTo();
      boolean _tripleNotEquals = (_retypeTo != null);
      if (_tripleNotEquals) {
        syntheticParameter.setType(rule.getRetypeTo());
      }
      DMultiplicity _remultiplyTo = rule.getRemultiplyTo();
      boolean _tripleNotEquals_1 = (_remultiplyTo != null);
      if (_tripleNotEquals_1) {
        syntheticParameter.setMultiplicity(rule.getRemultiplyTo());
      }
    }
  }
  
  protected void _transposeQueryParameter(final DQuery container, final TQueryParameterTransposition recipe, final TDitchRule rule) {
  }
  
  public DQueryParameter grabQueryParameter(final DQuery container, final TQueryParameterTransposition recipe, final TRenameRule rule) {
    final ITransposableElement source = rule.getSource();
    if ((source instanceof DQueryParameter)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DQueryParameter)source).getName();
      }
      final TSyntheticQueryParameter syntheticParameter = this._tSyntheticModelElementsFactory.addSyntheticQueryParameter(container, _xifexpression, ((DQueryParameter)source), recipe);
      return syntheticParameter;
    }
    return null;
  }
  
  public void transposeFeature(final IFeatureContainer container, final TFeatureTransposition recipe, final TTranspositionRule rule) {
    if (rule instanceof TMorphRule) {
      _transposeFeature(container, recipe, (TMorphRule)rule);
      return;
    } else if (rule instanceof TGrabRule) {
      _transposeFeature(container, recipe, (TGrabRule)rule);
      return;
    } else if (rule instanceof TDitchRule) {
      _transposeFeature(container, recipe, (TDitchRule)rule);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, recipe, rule).toString());
    }
  }
  
  public void transposeQueryParameter(final DQuery container, final TQueryParameterTransposition recipe, final TTranspositionRule rule) {
    if (rule instanceof TMorphRule) {
      _transposeQueryParameter(container, recipe, (TMorphRule)rule);
      return;
    } else if (rule instanceof TGrabRule) {
      _transposeQueryParameter(container, recipe, (TGrabRule)rule);
      return;
    } else if (rule instanceof TDitchRule) {
      _transposeQueryParameter(container, recipe, (TDitchRule)rule);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, recipe, rule).toString());
    }
  }
}
