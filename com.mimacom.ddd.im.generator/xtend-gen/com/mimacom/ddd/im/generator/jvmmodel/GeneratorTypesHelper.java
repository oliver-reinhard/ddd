package com.mimacom.ddd.im.generator.jvmmodel;

import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;

@SuppressWarnings("all")
public class GeneratorTypesHelper {
  /**
   * Types
   */
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DType type) {
    JvmTypeReference _xblockexpression = null;
    {
      String _name = type.getName();
      boolean _tripleEquals = (_name == null);
      if (_tripleEquals) {
        builder.typeRef(Object.class);
      }
      _xblockexpression = builder.typeRef(type.getName());
    }
    return _xblockexpression;
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DComplexType complexType) {
    JvmTypeReference _xblockexpression = null;
    {
      String _name = complexType.getName();
      boolean _tripleEquals = (_name == null);
      if (_tripleEquals) {
        builder.typeRef(Object.class);
      }
      _xblockexpression = builder.typeRef(complexType.getName());
    }
    return _xblockexpression;
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DAttribute attribute) {
    return this.toType(builder, attribute.getType());
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DPrimitive primitive) {
    DPrimitive _redefines = primitive.getRedefines();
    boolean _tripleNotEquals = (_redefines != null);
    if (_tripleNotEquals) {
      return this.toType(builder, primitive.getRedefines());
    }
    IDeductionDefinition _deducedFrom = primitive.getDeducedFrom();
    DDeductionRule _deductionRule = null;
    if (_deducedFrom!=null) {
      _deductionRule=_deducedFrom.getDeductionRule();
    }
    boolean _tripleNotEquals_1 = (_deductionRule != null);
    if (_tripleNotEquals_1) {
      return this.toType(builder, primitive.getDeducedFrom().getDeductionRule());
    }
    return builder.typeRef(Object.class);
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DDeductionRule deductionRule) {
    return this.toType(builder, deductionRule.getSource());
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DmxArchetype archetype) {
    JvmTypeReference _switchResult = null;
    String _name = archetype.getName();
    if (_name != null) {
      switch (_name) {
        case "ID":
        case "Name":
        case "ShortText":
        case "Text":
          _switchResult = builder.typeRef(String.class);
          break;
        case "Boolean":
          _switchResult = builder.typeRef(Boolean.class);
          break;
        case "Natural":
        case "Natural0":
        case "Integer":
          _switchResult = builder.typeRef(BigInteger.class);
          break;
        case "Real":
          _switchResult = builder.typeRef(BigDecimal.class);
          break;
        case "Timepoint":
          _switchResult = builder.typeRef(ZonedDateTime.class);
          break;
        case "Duration":
          _switchResult = builder.typeRef(Duration.class);
          break;
        default:
          String _name_1 = archetype.getName();
          String _plus = ("unsupported archetype: " + _name_1);
          throw new IllegalArgumentException(_plus);
      }
    } else {
      String _name_1 = archetype.getName();
      String _plus = ("unsupported archetype: " + _name_1);
      throw new IllegalArgumentException(_plus);
    }
    return _switchResult;
  }
  
  public JvmTypeReference toType(final JvmTypeReferenceBuilder builder, final EObject archetype) {
    if (archetype instanceof DmxArchetype) {
      return _toType(builder, (DmxArchetype)archetype);
    } else if (archetype instanceof DPrimitive) {
      return _toType(builder, (DPrimitive)archetype);
    } else if (archetype instanceof DAttribute) {
      return _toType(builder, (DAttribute)archetype);
    } else if (archetype instanceof DComplexType) {
      return _toType(builder, (DComplexType)archetype);
    } else if (archetype instanceof DType) {
      return _toType(builder, (DType)archetype);
    } else if (archetype instanceof DDeductionRule) {
      return _toType(builder, (DDeductionRule)archetype);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(builder, archetype).toString());
    }
  }
}
