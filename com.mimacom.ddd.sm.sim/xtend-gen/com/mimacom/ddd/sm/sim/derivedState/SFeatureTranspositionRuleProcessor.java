package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.ITransposableElement;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TDitchRule;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TRenameRule;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SFeatureTranspositionRuleProcessor {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  protected void _processFeatureDeduction(final IFeatureContainer container, final TFeatureTransposition deductionDefinition, final TGrabRule rule) {
    this.grabFeature(container, deductionDefinition, rule);
  }
  
  protected void _processFeatureDeduction(final IFeatureContainer container, final TFeatureTransposition deductionDefinition, final TMorphRule rule) {
    final DFeature syntheticFeature = this.grabFeature(container, deductionDefinition, rule);
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
  
  protected void _processFeatureDeduction(final IFeatureContainer container, final TFeatureTransposition deductionDefinition, final TDitchRule rule) {
  }
  
  public DFeature grabFeature(final IFeatureContainer container, final TFeatureTransposition deductionDefinition, final TRenameRule rule) {
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
      final DFeature syntheticFeature = this._syntheticModelElementsFactory.addSyntheticFeature(container, _xifexpression, ((DFeature)source), deductionDefinition);
      if ((deductionDefinition instanceof TQueryTransposition)) {
        final DQuery syntheticQuery = ((DQuery) syntheticFeature);
        final Iterable<TQueryParameterTransposition> parameterDeductionDefinitions = Iterables.<TQueryParameterTransposition>filter(((TQueryTransposition)deductionDefinition).getParameters(), TQueryParameterTransposition.class);
        final Function1<DQueryParameter, Boolean> _function = (DQueryParameter it) -> {
          return Boolean.valueOf((!((it instanceof TQueryParameterTransposition) || it.isSynthetic())));
        };
        Iterable<DQueryParameter> explicitParameters = IterableExtensions.<DQueryParameter>filter(((TQueryTransposition)deductionDefinition).getParameters(), _function);
        final Function1<TQueryParameterTransposition, Boolean> _function_1 = (TQueryParameterTransposition it) -> {
          return Boolean.valueOf((deductionDefinition instanceof TGrabRule));
        };
        boolean _exists = IterableExtensions.<TQueryParameterTransposition>exists(parameterDeductionDefinitions, _function_1);
        boolean _not = (!_exists);
        if (_not) {
          final ArrayList<DQueryParameter> implicitlyGrabbedSourceParameters = Lists.<DQueryParameter>newArrayList(((DQuery) source).getParameters());
          final Function1<TQueryParameterTransposition, Boolean> _function_2 = (TQueryParameterTransposition it) -> {
            ITransposableElement _source = it.getTranspositionRule().getSource();
            return Boolean.valueOf((_source instanceof DQueryParameter));
          };
          final Function1<TQueryParameterTransposition, DQueryParameter> _function_3 = (TQueryParameterTransposition it) -> {
            ITransposableElement _source = it.getTranspositionRule().getSource();
            return ((DQueryParameter) _source);
          };
          final Iterable<DQueryParameter> sourceParametersAffectedByRule = IterableExtensions.<TQueryParameterTransposition, DQueryParameter>map(IterableExtensions.<TQueryParameterTransposition>filter(parameterDeductionDefinitions, _function_2), _function_3);
          CollectionExtensions.<DQueryParameter>removeAll(implicitlyGrabbedSourceParameters, sourceParametersAffectedByRule);
          for (final DQueryParameter sourceParameter : implicitlyGrabbedSourceParameters) {
            this._syntheticModelElementsFactory.addSyntheticQueryParameter(syntheticQuery, sourceParameter.getName(), sourceParameter, 
              this._syntheticModelElementsFactory.createImplicitElementCopyDeduction(deductionDefinition, sourceParameter));
          }
        }
        final List<TQueryParameterTransposition> parameterDeductionDefinitionsList = IterableExtensions.<TQueryParameterTransposition>toList(parameterDeductionDefinitions);
        for (final TQueryParameterTransposition definition : parameterDeductionDefinitionsList) {
          this.processQueryParameterDeduction(syntheticQuery, definition, definition.getTranspositionRule());
        }
        for (final DQueryParameter param : explicitParameters) {
          this._syntheticModelElementsFactory.addSyntheticQueryParameterAsCopy(syntheticQuery, param);
        }
      }
      return syntheticFeature;
    }
    return null;
  }
  
  public void addSyntheticFeatures(final SyntheticFeatureContainerDescriptor desc) {
    Iterable<TFeatureTransposition> featureDeductionDefinitions = Lists.<TFeatureTransposition>newArrayList();
    Iterable<DFeature> explicitFeatures = Lists.<DFeature>newArrayList();
    if ((desc.deductionDefinition == null)) {
      explicitFeatures = desc.source.getFeatures();
    } else {
      if ((desc.deductionDefinition instanceof IFeatureContainer)) {
        final IFeatureContainer featureContainer = ((IFeatureContainer) desc.deductionDefinition);
        featureDeductionDefinitions = Iterables.<TFeatureTransposition>filter(featureContainer.getFeatures(), TFeatureTransposition.class);
        final Function1<DFeature, Boolean> _function = (DFeature it) -> {
          return Boolean.valueOf((!((it instanceof TFeatureTransposition) || it.isSynthetic())));
        };
        explicitFeatures = IterableExtensions.<DFeature>filter(featureContainer.getFeatures(), _function);
      }
      final Function1<TFeatureTransposition, Boolean> _function_1 = (TFeatureTransposition it) -> {
        TTranspositionRule _transpositionRule = it.getTranspositionRule();
        return Boolean.valueOf((_transpositionRule instanceof TGrabRule));
      };
      boolean _exists = IterableExtensions.<TFeatureTransposition>exists(featureDeductionDefinitions, _function_1);
      boolean _not = (!_exists);
      if (_not) {
        final ArrayList<DFeature> implicitlyGrabbedSourceFeatures = Lists.<DFeature>newArrayList(this._simUtil.allFeatures(desc.source));
        final Function1<TFeatureTransposition, Boolean> _function_2 = (TFeatureTransposition it) -> {
          ITransposableElement _source = it.getTranspositionRule().getSource();
          return Boolean.valueOf((_source instanceof DFeature));
        };
        final Function1<TFeatureTransposition, DFeature> _function_3 = (TFeatureTransposition it) -> {
          ITransposableElement _source = it.getTranspositionRule().getSource();
          return ((DFeature) _source);
        };
        final Iterable<DFeature> sourceFeaturesAffectedByRule = IterableExtensions.<TFeatureTransposition, DFeature>map(IterableExtensions.<TFeatureTransposition>filter(featureDeductionDefinitions, _function_2), _function_3);
        CollectionExtensions.<DFeature>removeAll(implicitlyGrabbedSourceFeatures, sourceFeaturesAffectedByRule);
        for (final DFeature sourceFeature : implicitlyGrabbedSourceFeatures) {
          this._syntheticModelElementsFactory.addSyntheticFeature(desc.syntheticType, sourceFeature.getName(), sourceFeature, 
            this._syntheticModelElementsFactory.createImplicitElementCopyDeduction(desc.deductionDefinition, sourceFeature));
        }
      }
      final List<TFeatureTransposition> featureDeductionDefinitionsList = IterableExtensions.<TFeatureTransposition>toList(featureDeductionDefinitions);
      for (final TFeatureTransposition definition : featureDeductionDefinitionsList) {
        this.processFeatureDeduction(desc.syntheticType, definition, definition.getTranspositionRule());
      }
    }
    for (final DFeature feature : explicitFeatures) {
      this._syntheticModelElementsFactory.addSyntheticFeatureAsCopy(desc.syntheticType, feature);
    }
  }
  
  protected void _processQueryParameterDeduction(final DQuery container, final TQueryParameterTransposition deductionDefinition, final TGrabRule rule) {
    this.grabQueryParameter(container, deductionDefinition, rule);
  }
  
  protected void _processQueryParameterDeduction(final DQuery container, final TQueryParameterTransposition deductionDefinition, final TMorphRule rule) {
    final DQueryParameter syntheticParameter = this.grabQueryParameter(container, deductionDefinition, rule);
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
  
  public DQueryParameter grabQueryParameter(final DQuery container, final TQueryParameterTransposition deductionDefinition, final TRenameRule rule) {
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
      final DQueryParameter syntheticParameter = this._syntheticModelElementsFactory.addSyntheticQueryParameter(container, _xifexpression, ((DQueryParameter)source), deductionDefinition);
      return syntheticParameter;
    }
    return null;
  }
  
  protected void _processQueryParameterDeduction(final TQueryTransposition container, final TQueryParameterTransposition deductionDefinition, final TDitchRule rule) {
  }
  
  public void processFeatureDeduction(final IFeatureContainer container, final TFeatureTransposition deductionDefinition, final TTranspositionRule rule) {
    if (rule instanceof TMorphRule) {
      _processFeatureDeduction(container, deductionDefinition, (TMorphRule)rule);
      return;
    } else if (rule instanceof TGrabRule) {
      _processFeatureDeduction(container, deductionDefinition, (TGrabRule)rule);
      return;
    } else if (rule instanceof TDitchRule) {
      _processFeatureDeduction(container, deductionDefinition, (TDitchRule)rule);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, deductionDefinition, rule).toString());
    }
  }
  
  public void processQueryParameterDeduction(final DQuery container, final TQueryParameterTransposition deductionDefinition, final TTranspositionRule rule) {
    if (container instanceof TQueryTransposition
         && rule instanceof TDitchRule) {
      _processQueryParameterDeduction((TQueryTransposition)container, deductionDefinition, (TDitchRule)rule);
      return;
    } else if (container != null
         && rule instanceof TMorphRule) {
      _processQueryParameterDeduction(container, deductionDefinition, (TMorphRule)rule);
      return;
    } else if (container != null
         && rule instanceof TGrabRule) {
      _processQueryParameterDeduction(container, deductionDefinition, (TGrabRule)rule);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, deductionDefinition, rule).toString());
    }
  }
}
