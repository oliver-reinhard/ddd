/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import java.util.List;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DmxInjectorProvider.class)
@SuppressWarnings("all")
public class DmxTypeCheckingTest {
  @Inject
  @Extension
  private ParseHelper<DmxNamespace> dmxParseHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private DmxTypeComputer _dmxTypeComputer;
  
  @Test
  public void testLiterals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace A");
    _builder.newLine();
    _builder.append("test T00 { true }");
    _builder.newLine();
    _builder.append("test T01 { false }");
    _builder.newLine();
    _builder.append("test T02 { 0 }");
    _builder.newLine();
    _builder.append("test T03 { 22 }");
    _builder.newLine();
    _builder.append("test T04 { -1 }");
    _builder.newLine();
    _builder.append("test T05 { 3.1415 }");
    _builder.newLine();
    _builder.append("test T06 { 3141.526E-3 }");
    _builder.newLine();
    _builder.append("test T07 { \"String\" }");
    _builder.newLine();
    _builder.append("test T08 { undefined }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests));
    final DExpression e00 = tests.get(0).getExpr();
    this.assertType(e00, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertType(e01, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertType(e02, DmxTypeDescriptorProvider.NUMBER);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertType(e03, DmxTypeDescriptorProvider.NUMBER);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertType(e04, DmxTypeDescriptorProvider.NUMBER);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertType(e05, DmxTypeDescriptorProvider.NUMBER);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertType(e06, DmxTypeDescriptorProvider.NUMBER);
    final DExpression e07 = tests.get(6).getExpr();
    this.assertType(e07, DmxTypeDescriptorProvider.TEXT);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertType(e08, DmxTypeDescriptorProvider.UNDEFINED_TYPE);
  }
  
  @Test
  public void testEquality() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace A");
    _builder.newLine();
    _builder.append("test T00 context a : Natural, b : Natural { a = b }");
    _builder.newLine();
    _builder.append("test T01 context a : Natural, b : Natural { a != b }");
    _builder.newLine();
    _builder.append("test T02 context a : Natural, b : Natural { a <> b }");
    _builder.newLine();
    _builder.append("test T03 context a : Natural, b : Text { a = b }  // ERROR: NATURAL vs. TEXT");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertType(e00, DmxTypeDescriptorProvider.BOOLEAN);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertType(e01, DmxTypeDescriptorProvider.BOOLEAN);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertType(e02, DmxTypeDescriptorProvider.BOOLEAN);
    this.assertNoValidationErrors(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertType(e03, DmxTypeDescriptorProvider.BOOLEAN);
    this.assertValidationError(e03);
  }
  
  @Test
  public void testBooleanOperators() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace A");
    _builder.newLine();
    _builder.append("test T00 context a : Boolean, b : Boolean { a AND b }");
    _builder.newLine();
    _builder.append("test T01 context a : Boolean, b : Boolean { a OR b }");
    _builder.newLine();
    _builder.append("test T02 context a : Boolean, b : Boolean { a XOR b }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests));
    final DExpression e00 = tests.get(0).getExpr();
    this.assertType(e00, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertType(e01, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertType(e02, DmxTypeDescriptorProvider.BOOLEAN);
  }
  
  @Test
  public void testRelationalOperators() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace A");
    _builder.newLine();
    _builder.append("test T00 context a : Natural, b : Natural { a > b }");
    _builder.newLine();
    _builder.append("test T01 context a : Natural, b : Natural { a > b }");
    _builder.newLine();
    _builder.append("test T02 context a : Natural, b : Natural { a >= b }");
    _builder.newLine();
    _builder.append("test T03 context a : Natural, b : Natural { a ≥ b }");
    _builder.newLine();
    _builder.append("test T04 context a : Natural, b : Natural { a < b }");
    _builder.newLine();
    _builder.append("test T05 context a : Natural, b : Natural { a <= b }");
    _builder.newLine();
    _builder.append("test T06 context a : Natural, b : Natural { a ≤ b }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests));
    final DExpression e00 = tests.get(0).getExpr();
    this.assertType(e00, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertType(e01, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertType(e02, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertType(e03, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertType(e04, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertType(e05, DmxTypeDescriptorProvider.BOOLEAN);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertType(e06, DmxTypeDescriptorProvider.BOOLEAN);
  }
  
  public boolean assertTestWithContextType(final int id, final CharSequence input, final AbstractDmxTypeDescriptor<?> expectedType) {
    return this.assertType(((("test T" + Integer.valueOf(id)) + " ") + input), expectedType);
  }
  
  public boolean assertType(final CharSequence input, final AbstractDmxTypeDescriptor<?> expectedType) {
    return this.assertType(IterableExtensions.<DmxTest>last(this.parse(input)).getExpr(), expectedType);
  }
  
  public boolean assertType(final DExpression expr, final AbstractDmxTypeDescriptor<?> expectedType) {
    return expectedType.isCompatibleWith(this._dmxTypeComputer.typeFor(expr));
  }
  
  public EList<DmxTest> parse(final CharSequence input) {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace dm.types");
      _builder.newLine();
      _builder.append("archetype Boolean \tis BOOLEAN");
      _builder.newLine();
      _builder.append("archetype Natural \tis NUMBER\t");
      _builder.newLine();
      _builder.append("archetype Text\t\tis TEXT");
      _builder.newLine();
      final DmxNamespace systemTypes = this.dmxParseHelper.parse(_builder, resourceSet);
      Assertions.assertNotNull(systemTypes);
      final EList<Resource.Diagnostic> stErrors = systemTypes.eResource().getErrors();
      boolean _isEmpty = stErrors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Parse errors in systemTypes: ");
      String _join = IterableExtensions.join(stErrors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final DmxNamespace result = this.dmxParseHelper.parse(input, resourceSet);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty_1 = errors.isEmpty();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Parse errors: ");
      String _join_1 = IterableExtensions.join(errors, "; ");
      _builder_2.append(_join_1);
      Assertions.assertTrue(_isEmpty_1, _builder_2.toString());
      return result.getTests();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertNoValidationErrors(final EObject obj) {
    final List<Diagnostic> result = Diagnostician.INSTANCE.validate(obj).getChildren();
    boolean _isEmpty = result.isEmpty();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Validation errors: ");
    String _join = IterableExtensions.join(result, "; ");
    _builder.append(_join);
    Assertions.assertTrue(_isEmpty, _builder.toString());
  }
  
  public void assertValidationError(final EObject obj) {
    final List<Diagnostic> result = Diagnostician.INSTANCE.validate(obj).getChildren();
    Assert.assertEquals(1, result.size());
  }
}
