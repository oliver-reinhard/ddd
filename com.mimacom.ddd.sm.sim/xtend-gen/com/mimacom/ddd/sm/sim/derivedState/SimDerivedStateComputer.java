package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.INamespace;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SDomainDeduction;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.derivedState.SFeatureDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticComplexTypeDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import com.mimacom.ddd.sm.sim.derivedState.TypeSorter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
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
  private SyntheticModelElementsFactory _syntheticModelElementsFactory;
  
  @Inject
  @Extension
  private STypeDeductionRuleProcessor _sTypeDeductionRuleProcessor;
  
  @Inject
  @Extension
  private SFeatureDeductionRuleProcessor _sFeatureDeductionRuleProcessor;
  
  @Inject
  private TransformationContext context;
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      this.context.init(resource);
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final SInformationModel model = ((SInformationModel) _head);
      this.processInformationModel(model, this.context);
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
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
  }
  
  public void processInformationModel(final SInformationModel model, final TransformationContext context) {
    Iterable<STypeDeduction> _filter = Iterables.<STypeDeduction>filter(model.getTypes(), STypeDeduction.class);
    List<STypeDeduction> _list = null;
    if (_filter!=null) {
      _list=IterableExtensions.<STypeDeduction>toList(_filter);
    }
    final List<STypeDeduction> typeDeductionDefinitions = _list;
    if ((typeDeductionDefinitions != null)) {
      TypeSorter _typeSorter = new TypeSorter();
      Collections.<STypeDeduction>sort(typeDeductionDefinitions, _typeSorter);
      final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
      for (final STypeDeduction definition : typeDeductionDefinitions) {
        {
          final DDeductionRule rule = definition.getDeductionRule();
          final IDeducibleElement source = rule.getSource();
          if ((source instanceof DType)) {
            final DType syntheticType = this._sTypeDeductionRuleProcessor.processTypeDeduction(model, definition, rule, context);
            if ((definition instanceof SComplexTypeDeduction)) {
              SyntheticComplexTypeDescriptor _syntheticComplexTypeDescriptor = new SyntheticComplexTypeDescriptor(((DComplexType) syntheticType), ((SComplexTypeDeduction)definition), ((DComplexType) source));
              complexSyntheticTypes.add(_syntheticComplexTypeDescriptor);
            }
          }
        }
      }
      for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypes) {
        this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(desc, context);
      }
    }
    EList<SDomainDeduction> _domainProxies = model.getDomainProxies();
    for (final SDomainDeduction domainDeduction : _domainProxies) {
    }
    final ArrayList<DAggregate> modelList = Lists.<DAggregate>newArrayList(model.getAggregates());
    for (final DAggregate aggregate : modelList) {
      this.processAggregate(model, aggregate, context);
    }
  }
  
  public void processAggregate(final SInformationModel model, final DAggregate dAggregate, final TransformationContext context) {
    INamespace _xifexpression = null;
    SInformationModelKind _kind = model.getKind();
    boolean _equals = Objects.equal(_kind, SInformationModelKind.CORE);
    if (_equals) {
      _xifexpression = dAggregate;
    } else {
      _xifexpression = model;
    }
    ITypeContainer syntheticTypesContainer = ((ITypeContainer)_xifexpression);
    final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypesAcceptor = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
    if ((dAggregate instanceof SAggregateDeduction)) {
      final SAggregateDeduction deductionDefinition = ((SAggregateDeduction)dAggregate);
      DDeductionRule _deductionRule = deductionDefinition.getDeductionRule();
      if ((_deductionRule instanceof SGrabAggregateRule)) {
        IDeducibleElement _source = deductionDefinition.getDeductionRule().getSource();
        EObject source = ((EObject) _source);
        if ((source instanceof DEntityType)) {
          source = ((DEntityType)source).eContainer();
        }
        if ((source instanceof DAggregate)) {
          SInformationModelKind _kind_1 = model.getKind();
          boolean _equals_1 = Objects.equal(_kind_1, SInformationModelKind.CORE);
          if (_equals_1) {
            syntheticTypesContainer = this._syntheticModelElementsFactory.addSyntheticAggregate(model, deductionDefinition, context);
          }
          this._sTypeDeductionRuleProcessor.addImplicitSyntheticTypes(syntheticTypesContainer, deductionDefinition, ((DAggregate)source), complexSyntheticTypesAcceptor, context);
        }
      }
    }
    this._sTypeDeductionRuleProcessor.addSyntheticTypes(syntheticTypesContainer, dAggregate, complexSyntheticTypesAcceptor, context);
    for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypesAcceptor) {
      this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(desc, context);
    }
  }
}
