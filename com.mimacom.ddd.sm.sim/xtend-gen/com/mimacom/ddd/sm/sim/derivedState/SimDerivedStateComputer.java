package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.derivedState.SAggregateDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.SFeatureDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeDeductionRuleProcessor;
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
  private SAggregateDeductionRuleProcessor _sAggregateDeductionRuleProcessor;
  
  @Inject
  @Extension
  private STypeDeductionRuleProcessor _sTypeDeductionRuleProcessor;
  
  @Inject
  @Extension
  private SFeatureDeductionRuleProcessor _sFeatureDeductionRuleProcessor;
  
  private static final SimFactory SIM = SimFactory.eINSTANCE;
  
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
        String _xifexpression = null;
        if (preLinkingPhase) {
          _xifexpression = "pre-linking ";
        } else {
          _xifexpression = "";
        }
        String _plus = ("Derive " + _xifexpression);
        String _plus_1 = (_plus + "state for ");
        URI _uRI = resource.getURI();
        String _plus_2 = (_plus_1 + _uRI);
        SimDerivedStateComputer.LOGGER.debug(_plus_2);
        this.derivedStateInstalled = true;
        model.setIndexingHelper(SimDerivedStateComputer.SIM.createSTypeMapping());
        this.process(model);
        URI _uRI_1 = resource.getURI();
        String _plus_3 = ("Derive state END for " + _uRI_1);
        SimDerivedStateComputer.LOGGER.debug(_plus_3);
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
        final Function1<IDeducibleElement, Boolean> _function = (IDeducibleElement it) -> {
          return Boolean.valueOf(it.isSynthetic());
        };
        final Iterator<IDeducibleElement> syntheticElements = IteratorExtensions.<IDeducibleElement>filter(Iterators.<IDeducibleElement>filter(resource.getAllContents(), IDeducibleElement.class), _function);
        final ArrayList<IDeducibleElement> list = Lists.<IDeducibleElement>newArrayList();
        while (syntheticElements.hasNext()) {
          list.add(syntheticElements.next());
        }
        for (final IDeducibleElement e : list) {
          EcoreUtil.remove(e);
        }
      } finally {
        this.derivedStateInstalled = false;
      }
    }
  }
  
  public void process(final SInformationModel model) {
    Iterable<STypeDeduction> _filter = Iterables.<STypeDeduction>filter(model.getTypes(), STypeDeduction.class);
    List<STypeDeduction> _list = null;
    if (_filter!=null) {
      _list=IterableExtensions.<STypeDeduction>toList(_filter);
    }
    final List<STypeDeduction> typeDeductionDefinitions = _list;
    boolean _isEmpty = typeDeductionDefinitions.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TypeSorter _typeSorter = new TypeSorter();
      Collections.<STypeDeduction>sort(typeDeductionDefinitions, _typeSorter);
      final ArrayList<SyntheticFeatureContainerDescriptor> complexSyntheticTypes = Lists.<SyntheticFeatureContainerDescriptor>newArrayList();
      for (final STypeDeduction definition : typeDeductionDefinitions) {
        {
          final DDeductionRule rule = definition.getDeductionRule();
          final IDeducibleElement source = rule.getSource();
          if ((source instanceof DType)) {
            final DType syntheticType = this._sTypeDeductionRuleProcessor.processTypeDeduction(model, definition, rule);
            if ((definition instanceof SComplexTypeDeduction)) {
              SyntheticFeatureContainerDescriptor _syntheticFeatureContainerDescriptor = new SyntheticFeatureContainerDescriptor(((DComplexType) syntheticType), definition, 
                ((DComplexType) source));
              complexSyntheticTypes.add(_syntheticFeatureContainerDescriptor);
            }
          }
        }
      }
      for (final SyntheticFeatureContainerDescriptor desc : complexSyntheticTypes) {
        this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(desc);
      }
    }
    final ArrayList<DAggregate> originalAggregates = Lists.<DAggregate>newArrayList(model.getAggregates());
    final ArrayList<SyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor = Lists.<SyntheticFeatureContainerDescriptor>newArrayList();
    for (final DAggregate aggregate : originalAggregates) {
      this._sAggregateDeductionRuleProcessor.processAggregateTypes(aggregate, model, syntheticComplexTypesAcceptor);
    }
    for (final SyntheticFeatureContainerDescriptor syntheticComplexTypesDescriptor : syntheticComplexTypesAcceptor) {
      this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(syntheticComplexTypesDescriptor);
    }
    for (final DAggregate aggregate_1 : originalAggregates) {
      this._sAggregateDeductionRuleProcessor.processAggregateQueries(aggregate_1, model);
    }
  }
}
