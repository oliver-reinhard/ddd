package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.ITransposableElement;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TransposeFactory;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.derivedState.SAggregateTranspositionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.SFeatureTranspositionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeTranspositionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.TypeSorter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SimDerivedStateComputer implements IDerivedStateComputer {
  @Inject
  @Extension
  private SAggregateTranspositionRuleProcessor _sAggregateTranspositionRuleProcessor;
  
  @Inject
  @Extension
  private STypeTranspositionRuleProcessor _sTypeTranspositionRuleProcessor;
  
  @Inject
  @Extension
  private SFeatureTranspositionRuleProcessor _sFeatureTranspositionRuleProcessor;
  
  private static final TransposeFactory TRANSPOSE = TransposeFactory.eINSTANCE;
  
  private static final Logger LOGGER = Logger.getLogger(SimDerivedStateComputer.class);
  
  private boolean derivedStateInstalled = false;
  
  public SimDerivedStateComputer() {
    SimDerivedStateComputer.LOGGER.setLevel(Level.DEBUG);
    SimDerivedStateComputer.LOGGER.debug("Created");
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    boolean _hasSyntaxErrors = resource.getParseResult().hasSyntaxErrors();
    boolean _not = (!_hasSyntaxErrors);
    if (_not) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final DNamespace namespace = ((DNamespace) _head);
      DModel _model = namespace.getModel();
      final SInformationModel model = ((SInformationModel) _model);
      if ((model != null)) {
        if ((preLinkingPhase && (model.getKind() != SInformationModelKind.BASE))) {
          URI _uRI = resource.getURI();
          String _plus = ("Derive pre-linking state SKIPPED for " + _uRI);
          SimDerivedStateComputer.LOGGER.debug(_plus);
        } else {
          this.derivedStateInstalled = true;
          URI _uRI_1 = resource.getURI();
          String _plus_1 = ("Derive state for " + _uRI_1);
          SimDerivedStateComputer.LOGGER.debug(_plus_1);
          model.setIndexingHelper(SimDerivedStateComputer.TRANSPOSE.createTTypeMapping());
          this.process(model);
          URI _uRI_2 = resource.getURI();
          String _plus_2 = ("Derive state END for " + _uRI_2);
          SimDerivedStateComputer.LOGGER.debug(_plus_2);
        }
      }
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    if (this.derivedStateInstalled) {
      try {
        URI _uRI = null;
        if (resource!=null) {
          _uRI=resource.getURI();
        }
        String _plus = ("Discard state for " + _uRI);
        SimDerivedStateComputer.LOGGER.debug(_plus);
        EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
        final DNamespace namespace = ((DNamespace) _head);
        DModel _model = namespace.getModel();
        final SInformationModel model = ((SInformationModel) _model);
        if ((model != null)) {
          model.setIndexingHelper(null);
        }
        final Function1<ITransposableElement, Boolean> _function = (ITransposableElement it) -> {
          return Boolean.valueOf(it.isSynthetic());
        };
        final Iterator<ITransposableElement> syntheticElements = IteratorExtensions.<ITransposableElement>filter(Iterators.<ITransposableElement>filter(resource.getAllContents(), ITransposableElement.class), _function);
        final ArrayList<ITransposableElement> list = Lists.<ITransposableElement>newArrayList();
        while (syntheticElements.hasNext()) {
          list.add(syntheticElements.next());
        }
        for (final ITransposableElement e : list) {
          EcoreUtil.remove(e);
        }
      } finally {
        this.derivedStateInstalled = false;
      }
    }
  }
  
  public void process(final SInformationModel model) {
    Iterable<TTypeTransposition> _filter = Iterables.<TTypeTransposition>filter(model.getTypes(), TTypeTransposition.class);
    List<TTypeTransposition> _list = null;
    if (_filter!=null) {
      _list=IterableExtensions.<TTypeTransposition>toList(_filter);
    }
    final List<TTypeTransposition> typeDeductionDefinitions = _list;
    boolean _isEmpty = typeDeductionDefinitions.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TypeSorter _typeSorter = new TypeSorter();
      Collections.<TTypeTransposition>sort(typeDeductionDefinitions, _typeSorter);
      final ArrayList<SyntheticFeatureContainerDescriptor> complexSyntheticTypes = Lists.<SyntheticFeatureContainerDescriptor>newArrayList();
      for (final TTypeTransposition definition : typeDeductionDefinitions) {
        {
          final TTranspositionRule rule = definition.getTranspositionRule();
          final ITransposableElement source = rule.getSource();
          if ((source instanceof DType)) {
            final DType syntheticType = this._sTypeTranspositionRuleProcessor.processTypeDeduction(model, definition, rule);
            if ((definition instanceof TComplexTypeTransposition)) {
              SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((DComplexType) syntheticType), definition, 
                ((DComplexType) source));
              complexSyntheticTypes.add(_syntheticFeatureContainerDescriptor);
            }
          }
        }
      }
      for (final SyntheticFeatureContainerDescriptor desc : complexSyntheticTypes) {
        this._sFeatureTranspositionRuleProcessor.addSyntheticFeatures(desc);
      }
    }
    final ArrayList<DAggregate> originalAggregates = Lists.<DAggregate>newArrayList(model.getAggregates());
    final ArrayList<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor = Lists.<SyntheticFeatureContainerDescriptor>newArrayList();
    for (final DAggregate aggregate : originalAggregates) {
      this._sAggregateTranspositionRuleProcessor.processAggregateTypes(aggregate, model, syntheticComplexTypesAcceptor);
    }
    for (final SyntheticFeatureContainerDescriptor syntheticComplexTypesDescriptor : syntheticComplexTypesAcceptor) {
      this._sFeatureTranspositionRuleProcessor.addSyntheticFeatures(syntheticComplexTypesDescriptor);
    }
    for (final DAggregate aggregate_1 : originalAggregates) {
      this._sAggregateTranspositionRuleProcessor.processAggregateQueries(aggregate_1, model);
    }
  }
}
