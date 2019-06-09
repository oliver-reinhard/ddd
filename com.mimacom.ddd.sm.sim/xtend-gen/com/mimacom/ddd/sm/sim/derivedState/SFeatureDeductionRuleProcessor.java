package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticComplexTypeDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
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
      final SFeature syntheticFeature = this._syntheticModelElementsFactory.addSyntheticFeature(container, _xifexpression, ((DFeature)source), featureWithRule, context);
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
            this._syntheticModelElementsFactory.addSyntheticQueryParameter(syntheticQuery, dParameter.getName(), dParameter, null, context);
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
    Iterable<SFeature> sFeaturesGenuine = Lists.<SFeature>newArrayList();
    if ((desc.typeWithRule != null)) {
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      sFeaturesWithRule = IterableExtensions.<SFeature>filter(desc.typeWithRule.getFeatures(), _function);
      final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.GENUINE));
      };
      sFeaturesGenuine = IterableExtensions.<SFeature>filter(desc.typeWithRule.getFeatures(), _function_1);
    }
    final Function1<SFeature, Boolean> _function_2 = (SFeature it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      return Boolean.valueOf((_deductionRule instanceof SGrabRule));
    };
    boolean _exists = IterableExtensions.<SFeature>exists(sFeaturesWithRule, _function_2);
    boolean _not = (!_exists);
    if (_not) {
      final ArrayList<DFeature> implicitlyGrabbedDFeatures = Lists.<DFeature>newArrayList(this._simUtil.allFeatures(desc.source));
      final Function1<SFeature, Boolean> _function_3 = (SFeature it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return Boolean.valueOf((_source instanceof DFeature));
      };
      final Function1<SFeature, DFeature> _function_4 = (SFeature it) -> {
        EObject _source = it.getDeductionRule().getSource();
        return ((DFeature) _source);
      };
      final Iterable<DFeature> dFeaturesAffectedByRule = IterableExtensions.<SFeature, DFeature>map(IterableExtensions.<SFeature>filter(sFeaturesWithRule, _function_3), _function_4);
      CollectionExtensions.<DFeature>removeAll(implicitlyGrabbedDFeatures, dFeaturesAffectedByRule);
      for (final DFeature dFeature : implicitlyGrabbedDFeatures) {
        this._syntheticModelElementsFactory.addSyntheticFeature(desc.syntheticType, dFeature.getName(), dFeature, null, context);
      }
    }
    final List<SFeature> sFeaturesWithRuleList = IterableExtensions.<SFeature>toList(sFeaturesWithRule);
    for (final SFeature sFeature : sFeaturesWithRuleList) {
      this.processFeatureWithRule(desc.syntheticType, sFeature, sFeature.getDeductionRule(), context);
    }
    for (final SFeature sFeature_1 : sFeaturesGenuine) {
      this._syntheticModelElementsFactory.addSyntheticFeatureAsCopy(desc.syntheticType, sFeature_1, context);
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
      final SQueryParameter syntheticParameter = this._syntheticModelElementsFactory.addSyntheticQueryParameter(container, _xifexpression, ((DQueryParameter)source), sParameter, context);
      return syntheticParameter;
    }
    return null;
  }
  
  protected void _processQueryParameterWithRule(final SQuery container, final SQueryParameter sParameter, final SDitchRule rule, final TransformationContext context) {
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
