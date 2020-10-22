package com.mimacom.ddd.dm.base.transpose;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.TAggregateTranspositionRuleProcessor;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTranspositionRuleProcessor;
import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TSyntheticFeatureContainerDescriptor;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TTypeTranspositionRuleProcessor;
import com.mimacom.ddd.dm.base.transpose.TransposeFactory;
import com.mimacom.ddd.dm.base.transpose.TypeSorter;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class TransposeAwareDerivedStateComputer implements IDerivedStateComputer {
  @Inject
  @Extension
  private TAggregateTranspositionRuleProcessor _tAggregateTranspositionRuleProcessor;
  
  @Inject
  @Extension
  private TTypeTranspositionRuleProcessor _tTypeTranspositionRuleProcessor;
  
  @Inject
  @Extension
  private TFeatureTranspositionRuleProcessor _tFeatureTranspositionRuleProcessor;
  
  private static final Logger LOGGER = Logger.getLogger(TransposeAwareDerivedStateComputer.class);
  
  private static final TransposeFactory TRANSPOSE = TransposeFactory.eINSTANCE;
  
  private boolean derivedStateInstalled = false;
  
  public TransposeAwareDerivedStateComputer() {
    TransposeAwareDerivedStateComputer.LOGGER.setLevel(Level.DEBUG);
    TransposeAwareDerivedStateComputer.LOGGER.debug("Created");
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    boolean _hasSyntaxErrors = resource.getParseResult().hasSyntaxErrors();
    boolean _not = (!_hasSyntaxErrors);
    if (_not) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final DNamespace namespace = ((DNamespace) _head);
      DModel _model = namespace.getModel();
      final TInformationModel model = ((TInformationModel) _model);
      if ((model != null)) {
        this.doInstallDerivedState(resource, model);
      }
    }
  }
  
  protected void doInstallDerivedState(final DerivedStateAwareResource resource, final TInformationModel model) {
    this.derivedStateInstalled = true;
    URI _uRI = resource.getURI();
    String _plus = ("Derive state for " + _uRI);
    TransposeAwareDerivedStateComputer.LOGGER.debug(_plus);
    model.setIndexingHelper(TransposeAwareDerivedStateComputer.TRANSPOSE.createTTypeMapping());
    this.transpose(model);
    URI _uRI_1 = resource.getURI();
    String _plus_1 = ("Derive state END for " + _uRI_1);
    TransposeAwareDerivedStateComputer.LOGGER.debug(_plus_1);
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
        TransposeAwareDerivedStateComputer.LOGGER.debug(_plus);
        EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
        final DNamespace namespace = ((DNamespace) _head);
        DModel _model = namespace.getModel();
        final TInformationModel model = ((TInformationModel) _model);
        if ((model != null)) {
          model.setIndexingHelper(null);
        }
        this.removeAllSyntheticElements(resource);
      } finally {
        this.derivedStateInstalled = false;
      }
    }
  }
  
  protected void removeAllSyntheticElements(final DerivedStateAwareResource resource) {
    final Iterator<ISyntheticElement> syntheticElements = Iterators.<ISyntheticElement>filter(resource.getAllContents(), ISyntheticElement.class);
    final ArrayList<ISyntheticElement> list = Lists.<ISyntheticElement>newArrayList();
    while (syntheticElements.hasNext()) {
      list.add(syntheticElements.next());
    }
    for (final ISyntheticElement e : list) {
      EcoreUtil.remove(e);
    }
  }
  
  public void transpose(final TInformationModel model) {
    Iterable<TTypeTransposition> _filter = Iterables.<TTypeTransposition>filter(model.getTypes(), TTypeTransposition.class);
    List<TTypeTransposition> _list = null;
    if (_filter!=null) {
      _list=IterableExtensions.<TTypeTransposition>toList(_filter);
    }
    final List<TTypeTransposition> typeRecipes = _list;
    boolean _isEmpty = typeRecipes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TypeSorter _typeSorter = new TypeSorter();
      Collections.<TTypeTransposition>sort(typeRecipes, _typeSorter);
      final ArrayList<TSyntheticFeatureContainerDescriptor> complexSyntheticTypes = Lists.<TSyntheticFeatureContainerDescriptor>newArrayList();
      for (final TTypeTransposition r : typeRecipes) {
        {
          final TTranspositionRule rule = r.getRule();
          final ITransposableElement source = rule.getSource();
          if ((source instanceof DType)) {
            final DType syntheticType = this._tTypeTranspositionRuleProcessor.transposeType(model, r, rule);
            if ((r instanceof TComplexTypeTransposition)) {
              TSyntheticFeatureContainerDescriptor _tSyntheticFeatureContainerDescriptor = new TSyntheticFeatureContainerDescriptor(((DComplexType) syntheticType), r, 
                ((DComplexType) source));
              complexSyntheticTypes.add(_tSyntheticFeatureContainerDescriptor);
            }
          }
        }
      }
      for (final TSyntheticFeatureContainerDescriptor desc : complexSyntheticTypes) {
        this._tFeatureTranspositionRuleProcessor.addSyntheticFeatures(desc);
      }
    }
    final ArrayList<DAggregate> originalAggregates = Lists.<DAggregate>newArrayList(model.getAggregates());
    final ArrayList<TSyntheticFeatureContainerDescriptor> syntheticComplexTypesAcceptor = Lists.<TSyntheticFeatureContainerDescriptor>newArrayList();
    for (final DAggregate aggregate : originalAggregates) {
      this._tAggregateTranspositionRuleProcessor.transposeAggregateTypes(aggregate, model, syntheticComplexTypesAcceptor);
    }
    for (final TSyntheticFeatureContainerDescriptor syntheticComplexTypesDescriptor : syntheticComplexTypesAcceptor) {
      this._tFeatureTranspositionRuleProcessor.addSyntheticFeatures(syntheticComplexTypesDescriptor);
    }
    for (final DAggregate aggregate_1 : originalAggregates) {
      this._tAggregateTranspositionRuleProcessor.transposeAggregateQueries(aggregate_1, model);
    }
  }
}
