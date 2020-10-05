package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.derivedState.SFeatureDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SAggregateDeductionRuleProcessor {
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  @Inject
  @Extension
  private STypeDeductionRuleProcessor _sTypeDeductionRuleProcessor;
  
  @Inject
  @Extension
  private SFeatureDeductionRuleProcessor _sFeatureDeductionRuleProcessor;
  
  public void processAggregateTypes(final DAggregate dAggregate, final SInformationModel model, final List<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor) {
    EObject _xifexpression = null;
    SInformationModelKind _kind = model.getKind();
    boolean _equals = Objects.equal(_kind, SInformationModelKind.CORE);
    if (_equals) {
      _xifexpression = dAggregate;
    } else {
      _xifexpression = model;
    }
    ITypeContainer syntheticTypesContainer = ((ITypeContainer)_xifexpression);
    if ((dAggregate instanceof SAggregateDeduction)) {
      final SAggregateDeduction definition = ((SAggregateDeduction)dAggregate);
      final DDeductionRule rule = definition.getDeductionRule();
      if ((rule instanceof SGrabAggregateRule)) {
        IDeducibleElement source = ((SGrabAggregateRule)rule).getSource();
        if ((source instanceof DAggregate)) {
          SInformationModelKind _kind_1 = model.getKind();
          boolean _equals_1 = Objects.equal(_kind_1, SInformationModelKind.CORE);
          if (_equals_1) {
            String _xifexpression_1 = null;
            String _renameTo = ((SGrabAggregateRule)rule).getRenameTo();
            boolean _tripleNotEquals = (_renameTo != null);
            if (_tripleNotEquals) {
              _xifexpression_1 = ((SGrabAggregateRule)rule).getRenameTo();
            } else {
              _xifexpression_1 = ((DAggregate)source).getName();
            }
            final String name = _xifexpression_1;
            syntheticTypesContainer = this._syntheticModelElementsFactory.addSyntheticAggregate(model, name, definition);
          }
          this._sTypeDeductionRuleProcessor.addImplicitSyntheticTypes(syntheticTypesContainer, definition, ((DAggregate)source), syntheticComplexTypesAcceptor);
        }
      }
    }
    this._sTypeDeductionRuleProcessor.addSyntheticTypes(syntheticTypesContainer, dAggregate, syntheticComplexTypesAcceptor);
    this._sTypeDeductionRuleProcessor.addSyntheticTypesAsCopy(syntheticTypesContainer, dAggregate, syntheticComplexTypesAcceptor);
  }
  
  public void processAggregateQueries(final DAggregate dAggregate, final SInformationModel model) {
    if ((dAggregate instanceof SAggregateDeduction)) {
      final SAggregateDeduction definition = ((SAggregateDeduction)dAggregate);
      final DDeductionRule rule = definition.getDeductionRule();
      final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
        return Boolean.valueOf((it.isSynthetic() && Objects.equal(it.getDeducedFrom(), dAggregate)));
      };
      final Iterable<DAggregate> syntheticAggregates = IterableExtensions.<DAggregate>filter(model.getAggregates(), _function);
      int _size = IterableExtensions.size(syntheticAggregates);
      boolean _equals = (_size == 1);
      if (_equals) {
        final DAggregate syntheticAggregate = IterableExtensions.<DAggregate>head(syntheticAggregates);
        SInformationModelKind _kind = model.getKind();
        boolean _equals_1 = Objects.equal(_kind, SInformationModelKind.CORE);
        if (_equals_1) {
          IDeducibleElement _source = rule.getSource();
          final SyntheticFeatureContainerDescriptor desc = new SyntheticFeatureContainerDescriptor(syntheticAggregate, definition, ((IFeatureContainer) _source));
          this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(desc);
        }
      }
    }
  }
}
