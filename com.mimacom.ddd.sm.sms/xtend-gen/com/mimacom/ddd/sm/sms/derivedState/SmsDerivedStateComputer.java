package com.mimacom.ddd.sm.sms.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sms.SComplexType;
import com.mimacom.ddd.sm.sms.SDeducibleMemberElement;
import com.mimacom.ddd.sm.sms.SDitchTransform;
import com.mimacom.ddd.sm.sms.SElementNature;
import com.mimacom.ddd.sm.sms.SFeature;
import com.mimacom.ddd.sm.sms.SMemberDeductionRule;
import com.mimacom.ddd.sm.sms.SPrimitive;
import com.mimacom.ddd.sm.sms.SSpoofTransform;
import com.mimacom.ddd.sm.sms.STransform;
import com.mimacom.ddd.sm.sms.SmsFactory;
import com.mimacom.ddd.sm.sms.SmsUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SmsDerivedStateComputer implements IDerivedStateComputer {
  public static class UnsupportedDomainTypeException extends RuntimeException {
    public UnsupportedDomainTypeException(final DPrimitive type) {
      super((("A system-model primitive type realizing the domain-model primitive type \"" + type.getName()) + "\"  the has not been declared"));
    }
  }
  
  @Inject
  @Extension
  private SmsUtil _smsUtil;
  
  private static final SmsFactory smsFactory = SmsFactory.eINSTANCE;
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      final Map<DPrimitive, SPrimitive> primitivesMap = this.buildTypeMap(resource);
      final Function1<SComplexType, Boolean> _function = (SComplexType it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      final Iterator<SComplexType> candidates = IteratorExtensions.<SComplexType>filter(Iterators.<SComplexType>filter(resource.getAllContents(), SComplexType.class), _function);
      while (candidates.hasNext()) {
        {
          SComplexType type = candidates.next();
          this.process(type, type.getDeductionRule().getTransform(), primitivesMap);
        }
      }
    }
  }
  
  public Map<DPrimitive, SPrimitive> buildTypeMap(final DerivedStateAwareResource resource) {
    final Map<DPrimitive, SPrimitive> typeMap = Maps.<DPrimitive, SPrimitive>newHashMap();
    final Iterator<SPrimitive> contibutors = Iterators.<SPrimitive>filter(resource.getAllContents(), SPrimitive.class);
    while (contibutors.hasNext()) {
      {
        final SPrimitive p = contibutors.next();
        DPrimitive _realizes = p.getRealizes();
        boolean _tripleNotEquals = (_realizes != null);
        if (_tripleNotEquals) {
          typeMap.put(p.getRealizes(), p);
        }
      }
    }
    return typeMap;
  }
  
  protected void _process(final SComplexType type, final SSpoofTransform transform, final Map<DPrimitive, SPrimitive> primitivesMap) {
    type.setName(type.getDeductionRule().getSource().getName());
    final ArrayList<DFeature> dFeatures = Lists.<DFeature>newArrayList();
    if ((type.getFeatures().isEmpty() || IterableExtensions.<SFeature>exists(type.getFeatures(), ((Function1<SFeature, Boolean>) (SFeature it) -> {
      SMemberDeductionRule _deductionRule = it.getDeductionRule();
      STransform _transform = null;
      if (_deductionRule!=null) {
        _transform=_deductionRule.getTransform();
      }
      return Boolean.valueOf((_transform instanceof SDitchTransform));
    })))) {
      DNamedElement _source = type.getDeductionRule().getSource();
      dFeatures.addAll(this._smsUtil.allFeatures(((DComplexType) _source)));
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SMemberDeductionRule _deductionRule = it.getDeductionRule();
        STransform _transform = null;
        if (_deductionRule!=null) {
          _transform=_deductionRule.getTransform();
        }
        return Boolean.valueOf((_transform instanceof SDitchTransform));
      };
      Iterable<SFeature> _filter = IterableExtensions.<SFeature>filter(type.getFeatures(), _function);
      for (final SFeature sFeature : _filter) {
        dFeatures.remove(sFeature.getDeductionRule().getSource());
      }
    } else {
      final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf(Objects.equal(_nature, SElementNature.DEDUCTION_RULE));
      };
      Iterable<SFeature> _filter_1 = IterableExtensions.<SFeature>filter(type.getFeatures(), _function_1);
      for (final SFeature sFeature_1 : _filter_1) {
        dFeatures.remove(sFeature_1.getDeductionRule().getSource());
      }
    }
    for (final DFeature dFeature : dFeatures) {
      {
        SFeature _switchResult = null;
        boolean _matched = false;
        if (dFeature instanceof DAttribute) {
          _matched=true;
          _switchResult = SmsDerivedStateComputer.smsFactory.createSAttribute();
        }
        if (!_matched) {
          if (dFeature instanceof DQuery) {
            _matched=true;
            _switchResult = SmsDerivedStateComputer.smsFactory.createSQuery();
          }
        }
        if (!_matched) {
          if (dFeature instanceof DAssociation) {
            _matched=true;
            _switchResult = SmsDerivedStateComputer.smsFactory.createSAssociation();
          }
        }
        SFeature sFeature_2 = _switchResult;
        sFeature_2.setName(dFeature.getName());
        DType _type = dFeature.getType();
        if ((_type instanceof DPrimitive)) {
          final SPrimitive sPrimitive = primitivesMap.get(dFeature.getType());
          if ((sPrimitive == null)) {
            DType _type_1 = dFeature.getType();
            throw new SmsDerivedStateComputer.UnsupportedDomainTypeException(((DPrimitive) _type_1));
          }
          sFeature_2.setType(sPrimitive);
        }
        sFeature_2.setSynthetic(Boolean.valueOf(true));
        type.getFeatures().add(sFeature_2);
      }
    }
  }
  
  protected void _process(final SComplexType type, final SDitchTransform transform, final Map<DPrimitive, SPrimitive> primitivesMap) {
  }
  
  protected void _process(final SComplexType type, final STransform transform, final Map<DPrimitive, SPrimitive> primitivesMap) {
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    final Function1<SDeducibleMemberElement, Boolean> _function = (SDeducibleMemberElement it) -> {
      return Boolean.valueOf(((it.getSynthetic() != null) && (it.getSynthetic()).booleanValue()));
    };
    final Iterator<SDeducibleMemberElement> syntheticElements = IteratorExtensions.<SDeducibleMemberElement>filter(Iterators.<SDeducibleMemberElement>filter(resource.getAllContents(), SDeducibleMemberElement.class), _function);
    while (syntheticElements.hasNext()) {
      {
        final SDeducibleMemberElement e = syntheticElements.next();
        final EObject container = e.eContainer();
        boolean _matched = false;
        if (e instanceof SFeature) {
          _matched=true;
          ((SComplexType) container).getFeatures().remove(e);
        }
      }
    }
  }
  
  public void process(final SComplexType type, final STransform transform, final Map<DPrimitive, SPrimitive> primitivesMap) {
    if (transform instanceof SDitchTransform) {
      _process(type, (SDitchTransform)transform, primitivesMap);
      return;
    } else if (transform instanceof SSpoofTransform) {
      _process(type, (SSpoofTransform)transform, primitivesMap);
      return;
    } else if (transform != null) {
      _process(type, transform, primitivesMap);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type, transform, primitivesMap).toString());
    }
  }
}
