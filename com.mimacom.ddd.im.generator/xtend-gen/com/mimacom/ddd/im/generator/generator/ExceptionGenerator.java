package com.mimacom.ddd.im.generator.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider;
import com.mimacom.ddd.im.generator.generator.ExceptionMapping;
import com.mimacom.ddd.im.generator.generator.Model;
import com.mimacom.ddd.sm.asm.SException;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generator for mapped exceptions.
 */
@SuppressWarnings("all")
public class ExceptionGenerator implements IGenerator {
  @Inject
  private DmxQualifiedNameProvider dmxQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    final EObject model = IterableExtensions.<EObject>head(resource.getContents());
    if (((model instanceof Model) && (((Model) model).getExceptionMappings() != null))) {
      final Consumer<ExceptionMapping> _function = (ExceptionMapping it) -> {
        this.generateExceptionMapping(it, fsa);
      };
      ((Model) model).getExceptionMappings().forEach(_function);
    }
  }
  
  private void generateExceptionMapping(final ExceptionMapping mapping, final IFileSystemAccess fsa) {
    SException _name = mapping.getName();
    final SException mappedException = ((SException) _name);
    if ((mappedException == null)) {
      return;
    }
    final QualifiedName qualifiedExceptionName = this.dmxQualifiedNameProvider.getFullyQualifiedName(mappedException);
    String _xifexpression = null;
    JvmType _extends = mapping.getExtends();
    boolean _tripleNotEquals = (_extends != null);
    if (_tripleNotEquals) {
      _xifexpression = mapping.getExtends().getQualifiedName();
    } else {
      _xifexpression = "Exception";
    }
    final String superClass = _xifexpression;
    final String className = qualifiedExceptionName.getLastSegment();
    final String packageName = this.getPackageName(mapping);
    String _xifexpression_1 = null;
    boolean _isEmpty = packageName.isEmpty();
    if (_isEmpty) {
      _xifexpression_1 = "";
    } else {
      String _replaceAll = packageName.replaceAll("\\.", "/");
      _xifexpression_1 = (_replaceAll + "/");
    }
    final String fileNamePrefix = _xifexpression_1;
    String _xifexpression_2 = null;
    DRichText _description = mappedException.getDescription();
    boolean _tripleNotEquals_1 = (_description != null);
    if (_tripleNotEquals_1) {
      final Function1<DTextSegment, String> _function = (DTextSegment it) -> {
        return it.getValue();
      };
      _xifexpression_2 = IterableExtensions.join(IterableExtensions.<DTextSegment, String>map(Iterables.<DTextSegment>filter(mappedException.getDescription().getSegments(), DTextSegment.class), _function));
    }
    final String description = _xifexpression_2;
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty_1 = packageName.isEmpty();
      boolean _not = (!_isEmpty_1);
      if (_not) {
        _builder.append("package ");
        _builder.append(packageName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      if ((description != null)) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* ");
        _builder.append(description, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("@SuppressWarnings(\"serial\")");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" extends ");
    _builder.append(superClass);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(");
    {
      String _message = mapping.getMessage();
      boolean _tripleNotEquals_2 = (_message != null);
      if (_tripleNotEquals_2) {
        _builder.append("\"");
        String _message_1 = mapping.getMessage();
        _builder.append(_message_1, "\t\t");
        _builder.append("\"");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(((fileNamePrefix + className) + ".java"), _builder);
  }
  
  private String getPackageName(final ExceptionMapping mapping) {
    String _package = mapping.getPackage();
    boolean _tripleNotEquals = (_package != null);
    if (_tripleNotEquals) {
      return mapping.getPackage().toLowerCase();
    }
    SException _name = mapping.getName();
    final SException mappedException = ((SException) _name);
    if ((mappedException == null)) {
      return "";
    }
    final QualifiedName qualifiedExceptionName = this.dmxQualifiedNameProvider.getFullyQualifiedName(mappedException);
    List<String> _segments = qualifiedExceptionName.getSegments();
    int _segmentCount = qualifiedExceptionName.getSegmentCount();
    int _minus = (_segmentCount - 1);
    return IterableExtensions.join(IterableExtensions.<String>take(_segments, _minus), ".").toLowerCase();
  }
}
