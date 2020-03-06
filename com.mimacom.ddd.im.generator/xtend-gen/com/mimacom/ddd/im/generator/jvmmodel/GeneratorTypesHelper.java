package com.mimacom.ddd.im.generator.jvmmodel;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Arrays;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GeneratorTypesHelper {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  /**
   * Types
   */
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DType type) {
    return builder.typeRef(type.getName());
  }
  
  protected JvmTypeReference _toType(final JvmTypeReferenceBuilder builder, final DComplexType complexType) {
    return builder.typeRef(complexType.getName());
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
          String _plus = ("archetype " + _name_1);
          String _plus_1 = (_plus + " not supported");
          throw new IllegalArgumentException(_plus_1);
      }
    } else {
      String _name_1 = archetype.getName();
      String _plus = ("archetype " + _name_1);
      String _plus_1 = (_plus + " not supported");
      throw new IllegalArgumentException(_plus_1);
    }
    return _switchResult;
  }
  
  /**
   * Parameters
   */
  protected JvmFormalParameter _toParameter(final JvmTypeReferenceBuilder builder, final DType type) {
    return this._jvmTypesBuilder.toParameter(type, type.getName(), builder.typeRef(Object.class));
  }
  
  protected JvmFormalParameter _toParameter(final JvmTypeReferenceBuilder builder, final DEntityType entityType) {
    return this._jvmTypesBuilder.toParameter(entityType, entityType.getName(), this.toType(builder, entityType));
  }
  
  protected JvmFormalParameter _toParameter(final JvmTypeReferenceBuilder builder, final DmxArchetype archetype) {
    JvmFormalParameter _xblockexpression = null;
    {
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
          default:
            _switchResult = builder.typeRef(Object.class);
            break;
        }
      } else {
        _switchResult = builder.typeRef(Object.class);
      }
      final JvmTypeReference ref = _switchResult;
      _xblockexpression = this._jvmTypesBuilder.toParameter(archetype, archetype.getName(), ref);
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference toType(final JvmTypeReferenceBuilder builder, final DType archetype) {
    if (archetype instanceof DmxArchetype) {
      return _toType(builder, (DmxArchetype)archetype);
    } else if (archetype instanceof DComplexType) {
      return _toType(builder, (DComplexType)archetype);
    } else if (archetype != null) {
      return _toType(builder, archetype);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(builder, archetype).toString());
    }
  }
  
  public JvmFormalParameter toParameter(final JvmTypeReferenceBuilder builder, final DType archetype) {
    if (archetype instanceof DmxArchetype) {
      return _toParameter(builder, (DmxArchetype)archetype);
    } else if (archetype instanceof DEntityType) {
      return _toParameter(builder, (DEntityType)archetype);
    } else if (archetype != null) {
      return _toParameter(builder, archetype);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(builder, archetype).toString());
    }
  }
}
