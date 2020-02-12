package com.mimacom.ddd.sm.sim.generator.dto;

import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityDtoGenerator {
  private static final Set<String> JAVA_KEYWORDS = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while", "Boolean", "String"));
  
  public CharSequence generateBody(final DEntityType entity, final String fqnClassName) {
    CharSequence _xblockexpression = null;
    {
      final String[] classNameSegments = fqnClassName.split("\\.");
      String _xifexpression = null;
      boolean _isEmpty = ((List<String>)Conversions.doWrapArray(classNameSegments)).isEmpty();
      if (_isEmpty) {
        _xifexpression = "";
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("// TODO: generate Imports? E.g. BigDecimal, List");
        _builder.newLine();
        _builder.newLine();
        _builder.append("package ");
        int _length = classNameSegments.length;
        int _minus = (_length - 1);
        String _join = IterableExtensions.join(IterableExtensions.<String>take(((Iterable<String>)Conversions.doWrapArray(classNameSegments)), _minus), ".");
        _builder.append(_join);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _xifexpression = _builder.toString();
      }
      final String packageDeclaration = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(packageDeclaration);
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("public class ");
      int _length_1 = classNameSegments.length;
      int _minus_1 = (_length_1 - 1);
      String _get = classNameSegments[_minus_1];
      _builder_1.append(_get);
      _builder_1.append(" {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("// TODO: not yet implemented");
      _builder_1.newLine();
      {
        EList<DFeature> _features = entity.getFeatures();
        for(final DFeature f : _features) {
          _builder_1.append("\t");
          _builder_1.append("private ");
          CharSequence _inferJavaType = this.inferJavaType(f);
          _builder_1.append(_inferJavaType, "\t");
          _builder_1.append(" ");
          String _javaFieldName = this.toJavaFieldName(f.getName());
          _builder_1.append(_javaFieldName, "\t");
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("}");
      _builder_1.newLine();
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  /**
   * FIXME: this really doesn't belong here (define a Java type inferrer?)
   */
  private CharSequence inferJavaType(final DFeature feature) {
    CharSequence _xblockexpression = null;
    {
      if ((feature instanceof DAttribute)) {
        final DAttribute attribute = ((DAttribute) feature);
        DType _type = attribute.getType();
        if ((_type instanceof DmxArchetype)) {
          DType _type_1 = attribute.getType();
          final DmxArchetype archetype = ((DmxArchetype) _type_1);
          final DmxBaseType baseType = archetype.getBaseType();
          String _switchResult = null;
          if (baseType != null) {
            switch (baseType) {
              case IDENTIFIER:
              case TEXT:
                _switchResult = "String";
                break;
              case BOOLEAN:
                _switchResult = "Boolean";
                break;
              case NUMBER:
                _switchResult = "java.math.BigDecimal";
                break;
              case TIMEPOINT:
                _switchResult = "java.time.LocalDateTime";
                break;
              default:
                throw new IllegalArgumentException(("Unsupported base type: " + baseType));
            }
          } else {
            throw new IllegalArgumentException(("Unsupported base type: " + baseType));
          }
          return _switchResult;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Object /* ");
      DType _type_2 = feature.getType();
      _builder.append(_type_2);
      _builder.append(" */");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private String toJavaFieldName(final String toConvert) {
    final String toConvertFirstLower = StringExtensions.toFirstLower(toConvert);
    String _xifexpression = null;
    boolean _contains = EntityDtoGenerator.JAVA_KEYWORDS.contains(toConvertFirstLower);
    if (_contains) {
      _xifexpression = ("_" + toConvertFirstLower);
    } else {
      _xifexpression = toConvertFirstLower;
    }
    return _xifexpression;
  }
}
