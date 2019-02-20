package com.mimacom.ddd.sm.sim.derivedState;

import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRelationship;
import com.mimacom.ddd.dm.base.DRootType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class SimSyntheticModelElementsUtil {
  private static final SimFactory simFactory = SimFactory.eINSTANCE;
  
  public SAggregate addSyntheticAggregate(final SInformationModel container, final DAggregate source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SAggregate sAggregate = SimSyntheticModelElementsUtil.simFactory.createSAggregate();
    sAggregate.setSynthetic(true);
    sAggregate.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    container.getAggregates().add(sAggregate);
    return sAggregate;
  }
  
  protected SPrimitive _addSyntheticType(final EObject container, final String name, final DPrimitive source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SPrimitive sType = SimSyntheticModelElementsUtil.simFactory.createSPrimitive();
    this.initSyntheticType(sType, container, name, source, elementWithRule, context);
    return sType;
  }
  
  protected SEnumeration _addSyntheticType(final EObject container, final String name, final DEnumeration source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SEnumeration sType = SimSyntheticModelElementsUtil.simFactory.createSEnumeration();
    this.initSyntheticType(sType, container, name, source, elementWithRule, context);
    return sType;
  }
  
  protected SComplexType _addSyntheticType(final EObject container, final String name, final DComplexType source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    SComplexType _switchResult = null;
    boolean _matched = false;
    if (source instanceof DRootType) {
      _matched=true;
      _switchResult = SimSyntheticModelElementsUtil.simFactory.createSRootType();
    }
    if (!_matched) {
      if (source instanceof DRelationship) {
        _matched=true;
        _switchResult = SimSyntheticModelElementsUtil.simFactory.createSRootType();
      }
    }
    if (!_matched) {
      if (source instanceof DDetailType) {
        _matched=true;
        _switchResult = SimSyntheticModelElementsUtil.simFactory.createSDetailType();
      }
    }
    final SComplexType sType = _switchResult;
    this.initSyntheticType(sType, container, name, source, elementWithRule, context);
    sType.setAbstract(source.isAbstract());
    boolean _matched_1 = false;
    if (container instanceof SAggregate) {
      _matched_1=true;
      ((SAggregate)container).getTypes().add(sType);
    }
    if (!_matched_1) {
      if (container instanceof SInformationModel) {
        _matched_1=true;
        ((SInformationModel)container).getTypes().add(sType);
      }
    }
    return sType;
  }
  
  protected void initSyntheticType(final SType t, final EObject container, final String name, final DType source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    t.setName(name);
    t.setSynthetic(true);
    t.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    boolean _matched = false;
    if (container instanceof SAggregate) {
      _matched=true;
      ((SAggregate)container).getTypes().add(t);
    }
    if (!_matched) {
      if (container instanceof SInformationModel) {
        _matched=true;
        ((SInformationModel)container).getTypes().add(t);
      }
    }
    context.putSType(source, t);
  }
  
  protected SSyntheticDeductionRule createSyntheticDeductionRuleOrNull(final EObject source, final SDeducibleElement elementWithRule) {
    if (((source == null) || (elementWithRule == null))) {
      return null;
    }
    final SSyntheticDeductionRule rule = SimSyntheticModelElementsUtil.simFactory.createSSyntheticDeductionRule();
    rule.setSource(source);
    rule.setElementWithRule(elementWithRule);
    return rule;
  }
  
  public SFeature addSyntheticFeature(final SComplexType container, final String name, final DFeature source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    SFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute) {
      _matched=true;
      _switchResult = SimSyntheticModelElementsUtil.simFactory.createSAttribute();
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SimSyntheticModelElementsUtil.simFactory.createSQuery();
      }
    }
    if (!_matched) {
      if (source instanceof DAssociation) {
        _matched=true;
        _switchResult = SimSyntheticModelElementsUtil.simFactory.createSAssociation();
      }
    }
    final SFeature sFeature = _switchResult;
    sFeature.setName(name);
    final DType dFeatureType = source.getType();
    if ((dFeatureType == null)) {
      return null;
    }
    sFeature.setType(context.getSType(dFeatureType));
    sFeature.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    sFeature.setSynthetic(true);
    sFeature.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    container.getFeatures().add(sFeature);
    return sFeature;
  }
  
  public SQueryParameter addSyntheticQueryParameter(final SQuery container, final String name, final DQueryParameter source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SQueryParameter sParameter = SimSyntheticModelElementsUtil.simFactory.createSQueryParameter();
    sParameter.setName(name);
    final DType dParameterType = source.getType();
    if ((dParameterType == null)) {
      return null;
    }
    sParameter.setType(context.getSType(dParameterType));
    sParameter.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    sParameter.setSynthetic(true);
    sParameter.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    container.getParameters().add(sParameter);
    return sParameter;
  }
  
  public void addSyntheticLiteral(final SEnumeration container, final String name) {
    final SLiteral sLiteral = SimSyntheticModelElementsUtil.simFactory.createSLiteral();
    sLiteral.setName(name);
    sLiteral.setSynthetic(true);
    container.getLiterals().add(sLiteral);
  }
  
  public SMultiplicity grabMultiplicity(final DMultiplicity source) {
    SMultiplicity result = null;
    if ((source != null)) {
      result = SimSyntheticModelElementsUtil.simFactory.createSMultiplicity();
      result.setMinOccurs(source.getMinOccurs());
      result.setMaxOccurs(source.getMaxOccurs());
    }
    return result;
  }
  
  public SType addSyntheticType(final EObject container, final String name, final DType source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    if (source instanceof DEnumeration) {
      return _addSyntheticType(container, name, (DEnumeration)source, elementWithRule, context);
    } else if (source instanceof DPrimitive) {
      return _addSyntheticType(container, name, (DPrimitive)source, elementWithRule, context);
    } else if (source instanceof DComplexType) {
      return _addSyntheticType(container, name, (DComplexType)source, elementWithRule, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, name, source, elementWithRule, context).toString());
    }
  }
}
