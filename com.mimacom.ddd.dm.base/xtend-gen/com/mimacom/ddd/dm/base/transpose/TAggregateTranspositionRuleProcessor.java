package com.mimacom.ddd.dm.base.transpose;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate;
import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.dm.base.transpose.SyntheticModelElementsFactory;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTranspositionRuleProcessor;
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TTypeTranspositionRuleProcessor;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TAggregateTranspositionRuleProcessor {
  @Inject
  @Extension
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  @Inject
  @Extension
  private TTypeTranspositionRuleProcessor _tTypeTranspositionRuleProcessor;
  
  @Inject
  @Extension
  private TFeatureTranspositionRuleProcessor _tFeatureTranspositionRuleProcessor;
  
  public void transposeAggregateTypes(final DAggregate aggregate, final TInformationModel model, final List<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor) {
    EObject _xifexpression = null;
    boolean _allowsIdentityTypes = model.allowsIdentityTypes();
    if (_allowsIdentityTypes) {
      _xifexpression = aggregate;
    } else {
      _xifexpression = model;
    }
    ITypeContainer syntheticTypesContainer = ((ITypeContainer)_xifexpression);
    if ((aggregate instanceof TAggregateTransposition)) {
      final TAggregateTransposition recipe = ((TAggregateTransposition)aggregate);
      final TTranspositionRule rule = recipe.getRule();
      if ((rule instanceof TGrabAggregateRule)) {
        ITransposableElement source = ((TGrabAggregateRule)rule).getSource();
        if ((source instanceof DAggregate)) {
          boolean _allowsIdentityTypes_1 = model.allowsIdentityTypes();
          if (_allowsIdentityTypes_1) {
            String _xifexpression_1 = null;
            String _renameTo = ((TGrabAggregateRule)rule).getRenameTo();
            boolean _tripleNotEquals = (_renameTo != null);
            if (_tripleNotEquals) {
              _xifexpression_1 = ((TGrabAggregateRule)rule).getRenameTo();
            } else {
              _xifexpression_1 = ((DAggregate)source).getName();
            }
            final String name = _xifexpression_1;
            syntheticTypesContainer = this._syntheticModelElementsFactory.addSyntheticAggregate(model, name, recipe);
          }
          this._tTypeTranspositionRuleProcessor.addImplicitSyntheticTypes(syntheticTypesContainer, recipe, ((DAggregate)source), syntheticComplexTypesAcceptor);
        }
      }
    }
    this._tTypeTranspositionRuleProcessor.addSyntheticTypes(syntheticTypesContainer, aggregate, syntheticComplexTypesAcceptor);
    this._tTypeTranspositionRuleProcessor.addSyntheticTypesAsCopy(syntheticTypesContainer, aggregate, syntheticComplexTypesAcceptor);
  }
  
  public void transposeAggregateQueries(final DAggregate aggregate, final TInformationModel model) {
    if ((aggregate instanceof TAggregateTransposition)) {
      final TAggregateTransposition recipe = ((TAggregateTransposition)aggregate);
      final TTranspositionRule rule = recipe.getRule();
      final Function1<TSyntheticAggregate, Boolean> _function = (TSyntheticAggregate it) -> {
        return Boolean.valueOf(Objects.equal(recipe, aggregate));
      };
      final Iterable<TSyntheticAggregate> syntheticAggregates = IterableExtensions.<TSyntheticAggregate>filter(Iterables.<TSyntheticAggregate>filter(model.getAggregates(), TSyntheticAggregate.class), _function);
      int _size = IterableExtensions.size(syntheticAggregates);
      boolean _equals = (_size == 1);
      if (_equals) {
        final TSyntheticAggregate syntheticAggregate = IterableExtensions.<TSyntheticAggregate>head(syntheticAggregates);
        boolean _allowsIdentityTypes = model.allowsIdentityTypes();
        if (_allowsIdentityTypes) {
          ITransposableElement _source = rule.getSource();
          final SyntheticFeatureContainerDescriptor desc = new SyntheticFeatureContainerDescriptor(syntheticAggregate, recipe, ((IFeatureContainer) _source));
          this._tFeatureTranspositionRuleProcessor.addSyntheticFeatures(desc);
        }
      }
    }
  }
}
