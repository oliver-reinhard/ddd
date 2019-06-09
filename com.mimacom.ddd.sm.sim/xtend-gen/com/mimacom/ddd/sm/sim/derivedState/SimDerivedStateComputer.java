package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SDomainProxy;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.derivedState.SFeatureDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeDeductionRuleProcessor;
import com.mimacom.ddd.sm.sim.derivedState.STypeSorter;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticComplexTypeDescriptor;
import com.mimacom.ddd.sm.sim.derivedState.SyntheticModelElementsFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
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
    final Function1<SDeducibleElement, Boolean> _function = (SDeducibleElement it) -> {
      return Boolean.valueOf(it.isSynthetic());
    };
    final Iterator<SDeducibleElement> syntheticElements = IteratorExtensions.<SDeducibleElement>filter(Iterators.<SDeducibleElement>filter(resource.getAllContents(), SDeducibleElement.class), _function);
    final ArrayList<SDeducibleElement> list = Lists.<SDeducibleElement>newArrayList();
    while (syntheticElements.hasNext()) {
      list.add(syntheticElements.next());
    }
    for (final SDeducibleElement e : list) {
      EcoreUtil.remove(e);
    }
  }
  
  public void processInformationModel(final SInformationModel model, final TransformationContext context) {
    final Function1<SType, Boolean> _function = (SType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
    };
    Iterable<SType> _filter = IterableExtensions.<SType>filter(model.getTypes(), _function);
    List<SType> _list = null;
    if (_filter!=null) {
      _list=IterableExtensions.<SType>toList(_filter);
    }
    final List<SType> sTypesWithRule = _list;
    if ((sTypesWithRule != null)) {
      STypeSorter _sTypeSorter = new STypeSorter();
      Collections.<SType>sort(sTypesWithRule, _sTypeSorter);
      final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
      for (final SType type : sTypesWithRule) {
        {
          final SDeductionRule rule = type.getDeductionRule();
          final EObject source = rule.getSource();
          if ((source instanceof DType)) {
            final SType syntheticType = this._sTypeDeductionRuleProcessor.processTypeWithRule(type, rule, context);
            if ((syntheticType instanceof SComplexType)) {
              SyntheticComplexTypeDescriptor _syntheticComplexTypeDescriptor = new SyntheticComplexTypeDescriptor(((SComplexType)syntheticType), ((SComplexType) type), ((DComplexType) source));
              complexSyntheticTypes.add(_syntheticComplexTypeDescriptor);
            }
          }
        }
      }
      for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypes) {
        this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(desc, context);
      }
    }
    EList<SDomainProxy> _domainProxies = model.getDomainProxies();
    for (final SDomainProxy domainWithRule : _domainProxies) {
    }
    final ArrayList<SAggregate> modelList = Lists.<SAggregate>newArrayList(model.getAggregates());
    for (final SAggregate aggregate : modelList) {
      this.processAggregate(model, aggregate, null, context);
    }
  }
  
  public void processAggregate(final SInformationModel model, final SAggregate sAggregate, final SDomainProxy elementWithRule, final TransformationContext context) {
    SAggregate current = sAggregate;
    final ArrayList<SyntheticComplexTypeDescriptor> complexSyntheticTypes = Lists.<SyntheticComplexTypeDescriptor>newArrayList();
    SDeductionRule _deductionRule = sAggregate.getDeductionRule();
    if ((_deductionRule instanceof SGrabAggregateRule)) {
      EObject source = sAggregate.getDeductionRule().getSource();
      if ((source instanceof DEntityType)) {
        source = ((DEntityType)source).eContainer();
      }
      if ((source instanceof DAggregate)) {
        current = this._syntheticModelElementsFactory.addSyntheticAggregate(model, ((DAggregate)source), sAggregate, context);
        this._sTypeDeductionRuleProcessor.addImplicitSyntheticTypes(current, sAggregate, ((DAggregate)source), complexSyntheticTypes, context);
      }
    }
    this._sTypeDeductionRuleProcessor.addSyntheticTypes(current, complexSyntheticTypes, context);
    for (final SyntheticComplexTypeDescriptor desc : complexSyntheticTypes) {
      this._sFeatureDeductionRuleProcessor.addSyntheticFeatures(desc, context);
    }
  }
}
