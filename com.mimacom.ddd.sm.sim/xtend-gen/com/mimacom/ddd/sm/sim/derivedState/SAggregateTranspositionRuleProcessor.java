package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.ITransposableElement;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.derivedState.SFeatureTranspositionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeTranspositionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SAggregateTranspositionRuleProcessor {
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  @Inject
  @Extension
  private STypeTranspositionRuleProcessor _sTypeTranspositionRuleProcessor;
  
  @Inject
  @Extension
  private SFeatureTranspositionRuleProcessor _sFeatureTranspositionRuleProcessor;
  
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
    if ((dAggregate instanceof TAggregateTransposition)) {
      final TAggregateTransposition definition = ((TAggregateTransposition)dAggregate);
      final TTranspositionRule rule = definition.getTranspositionRule();
      if ((rule instanceof TGrabAggregateRule)) {
        ITransposableElement source = ((TGrabAggregateRule)rule).getSource();
        if ((source instanceof DAggregate)) {
          SInformationModelKind _kind_1 = model.getKind();
          boolean _equals_1 = Objects.equal(_kind_1, SInformationModelKind.CORE);
          if (_equals_1) {
            String _xifexpression_1 = null;
            String _renameTo = ((TGrabAggregateRule)rule).getRenameTo();
            boolean _tripleNotEquals = (_renameTo != null);
            if (_tripleNotEquals) {
              _xifexpression_1 = ((TGrabAggregateRule)rule).getRenameTo();
            } else {
              _xifexpression_1 = ((DAggregate)source).getName();
            }
            final String name = _xifexpression_1;
            syntheticTypesContainer = this._syntheticModelElementsFactory.addSyntheticAggregate(model, name, definition);
          }
          this._sTypeTranspositionRuleProcessor.addImplicitSyntheticTypes(syntheticTypesContainer, definition, ((DAggregate)source), syntheticComplexTypesAcceptor);
        }
      }
    }
    this._sTypeTranspositionRuleProcessor.addSyntheticTypes(syntheticTypesContainer, dAggregate, syntheticComplexTypesAcceptor);
    this._sTypeTranspositionRuleProcessor.addSyntheticTypesAsCopy(syntheticTypesContainer, dAggregate, syntheticComplexTypesAcceptor);
  }
  
  public void processAggregateQueries(final DAggregate dAggregate, final SInformationModel model) {
    if ((dAggregate instanceof TAggregateTransposition)) {
      final TAggregateTransposition definition = ((TAggregateTransposition)dAggregate);
      final TTranspositionRule rule = definition.getTranspositionRule();
      final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
        return Boolean.valueOf((it.isSynthetic() && Objects.equal(it.getTransposedBy(), dAggregate)));
      };
      final Iterable<DAggregate> syntheticAggregates = IterableExtensions.<DAggregate>filter(model.getAggregates(), _function);
      int _size = IterableExtensions.size(syntheticAggregates);
      boolean _equals = (_size == 1);
      if (_equals) {
        final DAggregate syntheticAggregate = IterableExtensions.<DAggregate>head(syntheticAggregates);
        SInformationModelKind _kind = model.getKind();
        boolean _equals_1 = Objects.equal(_kind, SInformationModelKind.CORE);
        if (_equals_1) {
          ITransposableElement _source = rule.getSource();
          final SyntheticFeatureContainerDescriptor desc = new SyntheticFeatureContainerDescriptor(syntheticAggregate, definition, ((IFeatureContainer) _source));
          this._sFeatureTranspositionRuleProcessor.addSyntheticFeatures(desc);
        }
      }
    }
  }
}
