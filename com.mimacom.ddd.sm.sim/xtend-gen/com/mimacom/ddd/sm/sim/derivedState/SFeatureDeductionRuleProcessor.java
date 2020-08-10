package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SFeatureDeduction;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SQueryDeduction;
import com.mimacom.ddd.sm.sim.SQueryParameterDeduction;
import com.mimacom.ddd.sm.sim.SRenameRule;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SFeatureDeductionRuleProcessor {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  protected void _processFeatureDeduction(final IFeatureContainer container, final SFeatureDeduction deductionDefinition, final SGrabRule rule, final TransformationContext context) {
    this.grabFeature(container, deductionDefinition, rule, context);
  }
  
  protected void _processFeatureDeduction(final IFeatureContainer container, final SFeatureDeduction deductionDefinition, final SMorphRule rule, final TransformationContext context) {
    final DFeature syntheticFeature = this.grabFeature(container, deductionDefinition, rule, context);
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
  
  protected void _processFeatureDeduction(final IFeatureContainer container, final SFeatureDeduction deductionDefinition, final SDitchRule rule, final TransformationContext context) {
  }
  
  public DFeature grabFeature(final IFeatureContainer container, final SFeatureDeduction deductionDefinition, final SRenameRule rule, final TransformationContext context) {
    final IDeducibleElement source = rule.getSource();
    if ((source instanceof DFeature)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DFeature)source).getName();
      }
      final DFeature syntheticFeature = this._syntheticModelElementsFactory.addSyntheticFeature(container, _xifexpression, ((DFeature)source), deductionDefinition, context);
      if ((deductionDefinition instanceof SQueryDeduction)) {
        final DQuery syntheticQuery = ((DQuery) syntheticFeature);
        final Iterable<SQueryParameterDeduction> parameterDeductionDefinitions = Iterables.<SQueryParameterDeduction>filter(((SQueryDeduction)deductionDefinition).getParameters(), SQueryParameterDeduction.class);
        final Function1<DQueryParameter, Boolean> _function = (DQueryParameter it) -> {
          return Boolean.valueOf((!((it instanceof SQueryParameterDeduction) || it.isSynthetic())));
        };
        Iterable<DQueryParameter> explicitParameters = IterableExtensions.<DQueryParameter>filter(((SQueryDeduction)deductionDefinition).getParameters(), _function);
        final Function1<SQueryParameterDeduction, Boolean> _function_1 = (SQueryParameterDeduction it) -> {
          return Boolean.valueOf((deductionDefinition instanceof SGrabRule));
        };
        boolean _exists = IterableExtensions.<SQueryParameterDeduction>exists(parameterDeductionDefinitions, _function_1);
        boolean _not = (!_exists);
        if (_not) {
          final ArrayList<DQueryParameter> implicitlyGrabbedSourceParameters = Lists.<DQueryParameter>newArrayList(((DQuery) source).getParameters());
          final Function1<SQueryParameterDeduction, Boolean> _function_2 = (SQueryParameterDeduction it) -> {
            IDeducibleElement _source = it.getDeductionRule().getSource();
            return Boolean.valueOf((_source instanceof DQueryParameter));
          };
          final Function1<SQueryParameterDeduction, DQueryParameter> _function_3 = (SQueryParameterDeduction it) -> {
            IDeducibleElement _source = it.getDeductionRule().getSource();
            return ((DQueryParameter) _source);
          };
          final Iterable<DQueryParameter> sourceParametersAffectedByRule = IterableExtensions.<SQueryParameterDeduction, DQueryParameter>map(IterableExtensions.<SQueryParameterDeduction>filter(parameterDeductionDefinitions, _function_2), _function_3);
          CollectionExtensions.<DQueryParameter>removeAll(implicitlyGrabbedSourceParameters, sourceParametersAffectedByRule);
          for (final DQueryParameter sourceParameter : implicitlyGrabbedSourceParameters) {
            this._syntheticModelElementsFactory.addSyntheticQueryParameter(syntheticQuery, sourceParameter.getName(), sourceParameter, this._syntheticModelElementsFactory.createImplicitElementCopyDeduction(deductionDefinition, sourceParameter), context);
          }
        }
        final List<SQueryParameterDeduction> parameterDeductionDefinitionsList = IterableExtensions.<SQueryParameterDeduction>toList(parameterDeductionDefinitions);
        for (final SQueryParameterDeduction definition : parameterDeductionDefinitionsList) {
          this.processQueryParameterDeduction(syntheticQuery, definition, definition.getDeductionRule(), context);
        }
        for (final DQueryParameter param : explicitParameters) {
          this._syntheticModelElementsFactory.addSyntheticQueryParameterAsCopy(syntheticQuery, param, context);
        }
      }
      return syntheticFeature;
    }
    return null;
  }
  
  public void addSyntheticFeatures(final SyntheticFeatureContainerDescriptor desc, final TransformationContext context) {
    Iterable<SFeatureDeduction> featureDeductionDefinitions = Lists.<SFeatureDeduction>newArrayList();
    Iterable<DFeature> explicitFeatures = Lists.<DFeature>newArrayList();
    if ((desc.deductionDefinition instanceof IFeatureContainer)) {
      final IFeatureContainer featureContainer = ((IFeatureContainer) desc.deductionDefinition);
      featureDeductionDefinitions = Iterables.<SFeatureDeduction>filter(featureContainer.getFeatures(), SFeatureDeduction.class);
      final Function1<DFeature, Boolean> _function = (DFeature it) -> {
        return Boolean.valueOf((!((it instanceof SFeatureDeduction) || it.isSynthetic())));
      };
      explicitFeatures = IterableExtensions.<DFeature>filter(featureContainer.getFeatures(), _function);
    }
    final Function1<SFeatureDeduction, Boolean> _function_1 = (SFeatureDeduction it) -> {
      DDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SFeatureDeduction>exists(featureDeductionDefinitions, _function_1);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DFeature> implicitlyGrabbedSourceFeatures = Lists.<DFeature>newArrayList(this._simUtil.allFeatures(desc.source));
      final Function1<SFeatureDeduction, Boolean> _function_2 = (SFeatureDeduction it) -> {
        IDeducibleElement _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DFeature));
      };
      final Function1<SFeatureDeduction, DFeature> _function_3 = (SFeatureDeduction it) -> {
        IDeducibleElement _source = it.getDeductionRule().getSource();
        return ((DFeature) _source);
      };
      final Iterable<DFeature> sourceFeaturesAffectedByRule = IterableExtensions.<SFeatureDeduction, DFeature>map(IterableExtensions.<SFeatureDeduction>filter(featureDeductionDefinitions, _function_2), _function_3);
      CollectionExtensions.<DFeature>removeAll(implicitlyGrabbedSourceFeatures, sourceFeaturesAffectedByRule);
      for (final DFeature sourceFeature : implicitlyGrabbedSourceFeatures) {
        this._syntheticModelElementsFactory.addSyntheticFeature(desc.syntheticType, sourceFeature.getName(), sourceFeature, this._syntheticModelElementsFactory.createImplicitElementCopyDeduction(desc.deductionDefinition, sourceFeature), context);
      }
    }
    final List<SFeatureDeduction> featureDeductionDefinitionsList = IterableExtensions.<SFeatureDeduction>toList(featureDeductionDefinitions);
    for (final SFeatureDeduction definition : featureDeductionDefinitionsList) {
      this.processFeatureDeduction(desc.syntheticType, definition, definition.getDeductionRule(), context);
    }
    for (final DFeature feature : explicitFeatures) {
      this._syntheticModelElementsFactory.addSyntheticFeatureAsCopy(desc.syntheticType, feature, context);
    }
  }
  
  protected void _processQueryParameterDeduction(final DQuery container, final SQueryParameterDeduction deductionDefinition, final SGrabRule rule, final TransformationContext context) {
    this.grabQueryParameter(container, deductionDefinition, rule, context);
  }
  
  protected void _processQueryParameterDeduction(final DQuery container, final SQueryParameterDeduction deductionDefinition, final SMorphRule rule, final TransformationContext context) {
    final DQueryParameter syntheticParameter = this.grabQueryParameter(container, deductionDefinition, rule, context);
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
  
  public DQueryParameter grabQueryParameter(final DQuery container, final SQueryParameterDeduction deductionDefinition, final SRenameRule rule, final TransformationContext context) {
    final IDeducibleElement source = rule.getSource();
    if ((source instanceof DQueryParameter)) {
      String _xifexpression = null;
      String _renameTo = rule.getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        _xifexpression = rule.getRenameTo();
      } else {
        _xifexpression = ((DQueryParameter)source).getName();
      }
      final DQueryParameter syntheticParameter = this._syntheticModelElementsFactory.addSyntheticQueryParameter(container, _xifexpression, ((DQueryParameter)source), deductionDefinition, context);
      return syntheticParameter;
    }
    return null;
  }
  
  protected void _processQueryParameterDeduction(final SQueryDeduction container, final SQueryParameterDeduction deductionDefinition, final SDitchRule rule, final TransformationContext context) {
  }
  
  public void processFeatureDeduction(final IFeatureContainer container, final SFeatureDeduction deductionDefinition, final DDeductionRule rule, final TransformationContext context) {
    if (rule instanceof SMorphRule) {
      _processFeatureDeduction(container, deductionDefinition, (SMorphRule)rule, context);
      return;
    } else if (rule instanceof SGrabRule) {
      _processFeatureDeduction(container, deductionDefinition, (SGrabRule)rule, context);
      return;
    } else if (rule instanceof SDitchRule) {
      _processFeatureDeduction(container, deductionDefinition, (SDitchRule)rule, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, deductionDefinition, rule, context).toString());
    }
  }
  
  public void processQueryParameterDeduction(final DQuery container, final SQueryParameterDeduction deductionDefinition, final DDeductionRule rule, final TransformationContext context) {
    if (container instanceof SQueryDeduction
         && rule instanceof SDitchRule) {
      _processQueryParameterDeduction((SQueryDeduction)container, deductionDefinition, (SDitchRule)rule, context);
      return;
    } else if (container != null
         && rule instanceof SMorphRule) {
      _processQueryParameterDeduction(container, deductionDefinition, (SMorphRule)rule, context);
      return;
    } else if (container != null
         && rule instanceof SGrabRule) {
      _processQueryParameterDeduction(container, deductionDefinition, (SGrabRule)rule, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, deductionDefinition, rule, context).toString());
    }
  }
}
