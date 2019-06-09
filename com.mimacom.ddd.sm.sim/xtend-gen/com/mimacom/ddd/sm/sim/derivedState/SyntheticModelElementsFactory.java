package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRelationship;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SAssociation;
import com.mimacom.ddd.sm.sim.SAttribute;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SEntityType;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class SyntheticModelElementsFactory {
  private static final SimFactory simFactory = SimFactory.eINSTANCE;
  
  public SAggregate addSyntheticAggregate(final SInformationModel container, final DAggregate source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SAggregate sAggregate = SyntheticModelElementsFactory.simFactory.createSAggregate();
    sAggregate.setSynthetic(true);
    sAggregate.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    container.getAggregates().add(sAggregate);
    return sAggregate;
  }
  
  protected SPrimitive _addSyntheticType(final EObject container, final String name, final DPrimitive source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SPrimitive sType = SyntheticModelElementsFactory.simFactory.createSPrimitive();
    this.initSyntheticType(sType, container, name, source, elementWithRule, context);
    return sType;
  }
  
  protected SEnumeration _addSyntheticType(final EObject container, final String name, final DEnumeration source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final SEnumeration sType = SyntheticModelElementsFactory.simFactory.createSEnumeration();
    this.initSyntheticType(sType, container, name, source, elementWithRule, context);
    return sType;
  }
  
  protected SComplexType _addSyntheticType(final EObject container, final String name, final DComplexType source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    SComplexType _switchResult = null;
    boolean _matched = false;
    if (source instanceof DEntityType) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.simFactory.createSEntityType();
    }
    if (!_matched) {
      if (source instanceof DRelationship) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.simFactory.createSEntityType();
      }
    }
    if (!_matched) {
      if (source instanceof DDetailType) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.simFactory.createSDetailType();
      }
    }
    final SComplexType sType = _switchResult;
    this.initSyntheticType(sType, container, name, source, elementWithRule, context);
    sType.setAbstract(this.makeAbstract(elementWithRule.getDeductionRule(), source));
    if ((sType instanceof SEntityType)) {
      ((SEntityType)sType).setRoot(this.makeRoot(elementWithRule.getDeductionRule(), ((DIdentityType) source)));
    }
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
    final SSyntheticDeductionRule rule = SyntheticModelElementsFactory.simFactory.createSSyntheticDeductionRule();
    rule.setSource(source);
    rule.setElementWithRule(elementWithRule);
    return rule;
  }
  
  public SFeature addSyntheticFeature(final SComplexType container, final String name, final DFeature source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final DType dFeatureType = source.getType();
    if ((dFeatureType == null)) {
      return null;
    }
    SFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.simFactory.createSAttribute();
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.simFactory.createSQuery();
      }
    }
    if (!_matched) {
      if (source instanceof DAssociation) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.simFactory.createSAssociation();
      }
    }
    final SFeature sFeature = _switchResult;
    sFeature.setName(name);
    sFeature.setType(context.getSType(dFeatureType));
    sFeature.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    sFeature.setSynthetic(true);
    sFeature.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    container.getFeatures().add(sFeature);
    return sFeature;
  }
  
  public SFeature addSyntheticFeatureAsCopy(final SComplexType container, final SFeature source, final TransformationContext context) {
    SFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof SAttribute) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.simFactory.createSAttribute();
    }
    if (!_matched) {
      if (source instanceof SQuery) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.simFactory.createSQuery();
      }
    }
    if (!_matched) {
      if (source instanceof SAssociation) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.simFactory.createSAssociation();
      }
    }
    final SFeature sFeature = _switchResult;
    sFeature.setName(source.getName());
    sFeature.setType(source.getType());
    sFeature.setMultiplicity(source.getMultiplicity());
    sFeature.setSynthetic(true);
    sFeature.setDeductionRule(null);
    container.getFeatures().add(sFeature);
    if ((source instanceof SQuery)) {
      EList<SQueryParameter> _parameters = ((SQuery)source).getParameters();
      for (final SQueryParameter p : _parameters) {
        this.addSyntheticQueryParameterAsCopy(((SQuery) sFeature), p, context);
      }
    }
    return sFeature;
  }
  
  public SQueryParameter addSyntheticQueryParameter(final SQuery container, final String name, final DQueryParameter source, final SDeducibleElement elementWithRule, final TransformationContext context) {
    final DType dParameterType = source.getType();
    if ((dParameterType == null)) {
      return null;
    }
    final SQueryParameter sParameter = SyntheticModelElementsFactory.simFactory.createSQueryParameter();
    sParameter.setName(name);
    sParameter.setType(context.getSType(dParameterType));
    sParameter.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    sParameter.setSynthetic(true);
    sParameter.setDeductionRule(this.createSyntheticDeductionRuleOrNull(source, elementWithRule));
    container.getParameters().add(sParameter);
    return sParameter;
  }
  
  public SQueryParameter addSyntheticQueryParameterAsCopy(final SQuery container, final SQueryParameter source, final TransformationContext context) {
    final SQueryParameter sParameter = SyntheticModelElementsFactory.simFactory.createSQueryParameter();
    sParameter.setName(source.getName());
    sParameter.setType(source.getType());
    sParameter.setMultiplicity(source.getMultiplicity());
    sParameter.setSynthetic(true);
    sParameter.setDeductionRule(null);
    container.getParameters().add(sParameter);
    return sParameter;
  }
  
  public void addSyntheticLiteral(final SEnumeration container, final String name) {
    final SLiteral sLiteral = SyntheticModelElementsFactory.simFactory.createSLiteral();
    sLiteral.setName(name);
    sLiteral.setSynthetic(true);
    container.getLiterals().add(sLiteral);
  }
  
  protected SMultiplicity grabMultiplicity(final DMultiplicity source) {
    SMultiplicity result = null;
    if ((source != null)) {
      result = SyntheticModelElementsFactory.simFactory.createSMultiplicity();
      result.setMinOccurs(source.getMinOccurs());
      result.setMaxOccurs(source.getMaxOccurs());
    }
    return result;
  }
  
  protected boolean _makeAbstract(final SStructureChangingRule r, final DComplexType source) {
    STristate _abstract = r.getAbstract();
    boolean _equals = Objects.equal(_abstract, STristate.DONT_CARE);
    if (_equals) {
      return source.isAbstract();
    }
    STristate _abstract_1 = r.getAbstract();
    return Objects.equal(_abstract_1, STristate.TRUE);
  }
  
  protected boolean _makeAbstract(final SDeductionRule r, final DComplexType source) {
    return source.isAbstract();
  }
  
  protected boolean _makeRoot(final SStructureChangingRule r, final DIdentityType source) {
    STristate _rootEntity = r.getRootEntity();
    boolean _equals = Objects.equal(_rootEntity, STristate.DONT_CARE);
    if (_equals) {
      return source.isRoot();
    }
    STristate _rootEntity_1 = r.getRootEntity();
    return Objects.equal(_rootEntity_1, STristate.TRUE);
  }
  
  protected boolean _makeRoot(final SDeductionRule r, final DIdentityType source) {
    return source.isRoot();
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
  
  protected boolean makeAbstract(final SDeductionRule r, final DComplexType source) {
    if (r instanceof SStructureChangingRule) {
      return _makeAbstract((SStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeAbstract(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeRoot(final SDeductionRule r, final DIdentityType source) {
    if (r instanceof SStructureChangingRule) {
      return _makeRoot((SStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeRoot(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
}
