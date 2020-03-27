package com.mimacom.ddd.im.generator.jvmmodel;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.im.generator.generator.TypeMapping;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GeneratorTypesHelper {
  /**
   * Types
   */
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final DType type) {
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
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final DComplexType complexType) {
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
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final DAttribute attribute) {
    return this.toType(builder, mappings, attribute.getType());
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final DPrimitive primitive) {
    DPrimitive _redefines = primitive.getRedefines();
    boolean _tripleNotEquals = (_redefines != null);
    if (_tripleNotEquals) {
      return this.toType(builder, mappings, primitive.getRedefines());
    }
    IDeductionDefinition _deducedFrom = primitive.getDeducedFrom();
    DDeductionRule _deductionRule = null;
    if (_deducedFrom!=null) {
      _deductionRule=_deducedFrom.getDeductionRule();
    }
    boolean _tripleNotEquals_1 = (_deductionRule != null);
    if (_tripleNotEquals_1) {
      return this.toType(builder, mappings, primitive.getDeducedFrom().getDeductionRule());
    }
    return builder.typeRef(Object.class);
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final DDeductionRule deductionRule) {
    return this.toType(builder, mappings, deductionRule.getSource());
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final DmxArchetype archetype) {
    JvmTypeReference _xblockexpression = null;
    {
      final Function1<TypeMapping, Boolean> _function = (TypeMapping it) -> {
        String _name = it.getType().getName();
        String _name_1 = archetype.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      };
      final List<TypeMapping> mappingsForType = IterableExtensions.<TypeMapping>toList(IterableExtensions.<TypeMapping>filter(mappings, _function));
      boolean _isEmpty = mappingsForType.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        return builder.typeRef(IterableExtensions.<TypeMapping>head(mappingsForType).getJavaType());
      }
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
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference toType(final JvmTypeReferenceBuilder builder, final Iterable<TypeMapping> mappings, final EObject archetype) {
    if (archetype instanceof DmxArchetype) {
      return _toType(builder, mappings, (DmxArchetype)archetype);
    } else if (archetype instanceof DPrimitive) {
      return _toType(builder, mappings, (DPrimitive)archetype);
    } else if (archetype instanceof DAttribute) {
      return _toType(builder, mappings, (DAttribute)archetype);
    } else if (archetype instanceof DComplexType) {
      return _toType(builder, mappings, (DComplexType)archetype);
    } else if (archetype instanceof DType) {
      return _toType(builder, mappings, (DType)archetype);
    } else if (archetype instanceof DDeductionRule) {
      return _toType(builder, mappings, (DDeductionRule)archetype);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(builder, mappings, archetype).toString());
    }
  }
}
