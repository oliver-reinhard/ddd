package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SImplicitElementDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.derivedState.TransformationContext;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class SyntheticModelElementsFactory {
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  private static final SimFactory simFactory = SimFactory.eINSTANCE;
  
  public DAggregate addSyntheticAggregate(final SInformationModel container, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    final DAggregate syntheticAggregate = SyntheticModelElementsFactory.BASE.createDAggregate();
    syntheticAggregate.setDeducedFrom(deductionDefinition);
    container.getAggregates().add(syntheticAggregate);
    return syntheticAggregate;
  }
  
  protected DPrimitive _addSyntheticType(final EObject container, final String name, final DPrimitive source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    final DPrimitive syntheticPrimitive = SyntheticModelElementsFactory.BASE.createDPrimitive();
    this.initSyntheticType(syntheticPrimitive, container, name, source, deductionDefinition, context);
    syntheticPrimitive.setRedefines(source.getRedefines());
    return syntheticPrimitive;
  }
  
  protected DEnumeration _addSyntheticType(final EObject container, final String name, final DEnumeration source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    final DEnumeration syntheticEnumeration = SyntheticModelElementsFactory.BASE.createDEnumeration();
    this.initSyntheticType(syntheticEnumeration, container, name, source, deductionDefinition, context);
    return syntheticEnumeration;
  }
  
  protected DComplexType _addSyntheticType(final EObject container, final String name, final DComplexType source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    DComplexType _xifexpression = null;
    boolean _makeEntity = this.makeEntity(deductionDefinition.getDeductionRule(), source);
    if (_makeEntity) {
      _xifexpression = SyntheticModelElementsFactory.BASE.createDEntityType();
    } else {
      _xifexpression = SyntheticModelElementsFactory.BASE.createDDetailType();
    }
    final DComplexType syntheticComplexType = _xifexpression;
    this.initSyntheticType(syntheticComplexType, container, name, source, deductionDefinition, context);
    syntheticComplexType.setAbstract(this.makeAbstract(deductionDefinition.getDeductionRule(), source));
    if ((syntheticComplexType instanceof DEntityType)) {
      ((DEntityType)syntheticComplexType).setRoot(this.makeRoot(deductionDefinition.getDeductionRule(), ((DIdentityType) source)));
    }
    boolean _matched = false;
    if (container instanceof DAggregate) {
      _matched=true;
      ((DAggregate)container).getTypes().add(syntheticComplexType);
    }
    if (!_matched) {
      if (container instanceof SInformationModel) {
        _matched=true;
        ((SInformationModel)container).getTypes().add(syntheticComplexType);
      }
    }
    return syntheticComplexType;
  }
  
  protected void initSyntheticType(final DType syntheticType, final EObject container, final String name, final DType source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    syntheticType.setName(name);
    syntheticType.setSynthetic(true);
    syntheticType.setDeducedFrom(deductionDefinition);
    boolean _matched = false;
    if (container instanceof DAggregate) {
      _matched=true;
      ((DAggregate)container).getTypes().add(syntheticType);
    }
    if (!_matched) {
      if (container instanceof SInformationModel) {
        _matched=true;
        ((SInformationModel)container).getTypes().add(syntheticType);
      }
    }
    context.putSystemType(source, syntheticType);
  }
  
  public DFeature addSyntheticFeature(final DComplexType container, final String name, final DFeature source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    final DType sourceFeatureType = source.getType();
    if ((sourceFeatureType == null)) {
      return null;
    }
    final DType featureType = context.getSystemType(sourceFeatureType);
    DFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute || source instanceof DAssociation) {
      _matched=true;
      DFeature _xifexpression = null;
      if ((featureType instanceof IIdentityType)) {
        _xifexpression = SyntheticModelElementsFactory.BASE.createDAssociation();
      } else {
        _xifexpression = SyntheticModelElementsFactory.BASE.createDAttribute();
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.BASE.createDQuery();
      }
    }
    final DFeature syntheticFeature = _switchResult;
    syntheticFeature.setName(name);
    syntheticFeature.setType(featureType);
    syntheticFeature.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticFeature.setSynthetic(true);
    syntheticFeature.setDeducedFrom(deductionDefinition);
    container.getFeatures().add(syntheticFeature);
    return syntheticFeature;
  }
  
  public DFeature addSyntheticFeatureAsCopy(final DComplexType container, final DFeature source, final TransformationContext context) {
    DFeature _switchResult = null;
    boolean _matched = false;
    if (source instanceof DAttribute) {
      _matched=true;
      _switchResult = SyntheticModelElementsFactory.BASE.createDAttribute();
    }
    if (!_matched) {
      if (source instanceof DQuery) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.BASE.createDQuery();
      }
    }
    if (!_matched) {
      if (source instanceof DAssociation) {
        _matched=true;
        _switchResult = SyntheticModelElementsFactory.BASE.createDAssociation();
      }
    }
    final DFeature syntheticFeature = _switchResult;
    syntheticFeature.setName(source.getName());
    syntheticFeature.setType(source.getType());
    syntheticFeature.setMultiplicity(source.getMultiplicity());
    syntheticFeature.setSynthetic(true);
    syntheticFeature.setDeducedFrom(null);
    container.getFeatures().add(syntheticFeature);
    if ((source instanceof DQuery)) {
      EList<DQueryParameter> _parameters = ((DQuery)source).getParameters();
      for (final DQueryParameter p : _parameters) {
        this.addSyntheticQueryParameterAsCopy(((DQuery) syntheticFeature), p, context);
      }
    }
    return syntheticFeature;
  }
  
  public DQueryParameter addSyntheticQueryParameter(final DQuery container, final String name, final DQueryParameter source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    final DType sourceParameterType = source.getType();
    if ((sourceParameterType == null)) {
      return null;
    }
    final DQueryParameter syntheticParameter = SyntheticModelElementsFactory.BASE.createDQueryParameter();
    syntheticParameter.setName(name);
    syntheticParameter.setType(context.getSystemType(sourceParameterType));
    syntheticParameter.setMultiplicity(this.grabMultiplicity(source.getMultiplicity()));
    syntheticParameter.setSynthetic(true);
    syntheticParameter.setDeducedFrom(deductionDefinition);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public DQueryParameter addSyntheticQueryParameterAsCopy(final DQuery container, final DQueryParameter source, final TransformationContext context) {
    final DQueryParameter syntheticParameter = SyntheticModelElementsFactory.BASE.createDQueryParameter();
    syntheticParameter.setName(source.getName());
    syntheticParameter.setType(source.getType());
    syntheticParameter.setMultiplicity(source.getMultiplicity());
    syntheticParameter.setSynthetic(true);
    syntheticParameter.setDeducedFrom(null);
    container.getParameters().add(syntheticParameter);
    return syntheticParameter;
  }
  
  public void addSyntheticLiteral(final DEnumeration container, final String name) {
    final DLiteral syntheticLiteral = SyntheticModelElementsFactory.BASE.createDLiteral();
    syntheticLiteral.setName(name);
    syntheticLiteral.setSynthetic(true);
    container.getLiterals().add(syntheticLiteral);
  }
  
  protected DMultiplicity grabMultiplicity(final DMultiplicity source) {
    DMultiplicity result = null;
    if ((source != null)) {
      result = SyntheticModelElementsFactory.BASE.createDMultiplicity();
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
  
  protected boolean _makeAbstract(final DDeductionRule r, final DComplexType source) {
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
  
  protected boolean _makeRoot(final DDeductionRule r, final DIdentityType source) {
    return source.isRoot();
  }
  
  protected boolean _makeEntity(final SMorphRule r, final DComplexType source) {
    STristate _entity = r.getEntity();
    boolean _equals = Objects.equal(_entity, STristate.DONT_CARE);
    if (_equals) {
      return (source instanceof DEntityType);
    }
    STristate _entity_1 = r.getEntity();
    return Objects.equal(_entity_1, STristate.TRUE);
  }
  
  protected boolean _makeEntity(final DDeductionRule r, final DComplexType source) {
    return (source instanceof DEntityType);
  }
  
  public SImplicitElementDeduction createImplicitElementCopyDeduction(final IDeductionDefinition originalDeductionDefinition, final IDeducibleElement source) {
    final SGrabRule grabRule = SyntheticModelElementsFactory.simFactory.createSGrabRule();
    grabRule.setSource(source);
    final SImplicitElementDeduction implicitDeduction = SyntheticModelElementsFactory.simFactory.createSImplicitElementDeduction();
    implicitDeduction.setOriginalDeductionDefinition(originalDeductionDefinition);
    implicitDeduction.setDeductionRule(grabRule);
    return implicitDeduction;
  }
  
  public DType addSyntheticType(final EObject container, final String name, final DType source, final IDeductionDefinition deductionDefinition, final TransformationContext context) {
    if (source instanceof DEnumeration) {
      return _addSyntheticType(container, name, (DEnumeration)source, deductionDefinition, context);
    } else if (source instanceof DPrimitive) {
      return _addSyntheticType(container, name, (DPrimitive)source, deductionDefinition, context);
    } else if (source instanceof DComplexType) {
      return _addSyntheticType(container, name, (DComplexType)source, deductionDefinition, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(container, name, source, deductionDefinition, context).toString());
    }
  }
  
  protected boolean makeAbstract(final DDeductionRule r, final DComplexType source) {
    if (r instanceof SStructureChangingRule) {
      return _makeAbstract((SStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeAbstract(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeRoot(final DDeductionRule r, final DIdentityType source) {
    if (r instanceof SStructureChangingRule) {
      return _makeRoot((SStructureChangingRule)r, source);
    } else if (r != null) {
      return _makeRoot(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
  
  protected boolean makeEntity(final DDeductionRule r, final DComplexType source) {
    if (r instanceof SMorphRule) {
      return _makeEntity((SMorphRule)r, source);
    } else if (r != null) {
      return _makeEntity(r, source);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, source).toString());
    }
  }
}
