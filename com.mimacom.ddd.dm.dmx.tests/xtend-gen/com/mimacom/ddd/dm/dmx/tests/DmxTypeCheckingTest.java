/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.dim.DimStandaloneSetup;
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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DmxInjectorProvider.class)
@SuppressWarnings("all")
public class DmxTypeCheckingTest {
  @Inject
  private ParseHelper<DmxNamespace> dmxParseHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private DmxTypeComputer _dmxTypeComputer;
  
  private final ParseHelper<DDomain> dimParseHelper;
  
  public DmxTypeCheckingTest() {
    final Injector dimInjector = new DimStandaloneSetup().createInjectorAndDoEMFRegistration();
    this.dimParseHelper = dimInjector.<ParseHelper>getInstance(ParseHelper.class);
  }
  
  public EList<DmxTest> parse(final CharSequence input) {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace dm.types");
      _builder.newLine();
      _builder.append("archetype Boolean\t\tis BOOLEAN");
      _builder.newLine();
      _builder.append("archetype Natural \t\tis NUMBER\t");
      _builder.newLine();
      _builder.append("archetype Text\t\t\t\tis TEXT");
      _builder.newLine();
      _builder.append("archetype Timepoint\tis TIMEPOINT");
      _builder.newLine();
      final DmxNamespace systemTypes = this.dmxParseHelper.parse(_builder, resourceSet);
      Assertions.assertNotNull(systemTypes);
      final EList<Resource.Diagnostic> stErrors = systemTypes.eResource().getErrors();
      boolean _isEmpty = stErrors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Parse errors in system types: ");
      String _join = IterableExtensions.join(stErrors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("domain D");
      _builder_2.newLine();
      _builder_2.append("primitive P1 redefines Natural");
      _builder_2.newLine();
      _builder_2.append("enumeration E1 { L1, L2 }");
      _builder_2.newLine();
      _builder_2.append("detail A {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a0 : Text");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a1 : Natural?");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a2 : Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a3 : E1");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a4 : Natural*");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a5 : Timepoint");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a6 : Boolean");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("a7 : A");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("detail b1 : B");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("detail b2 : B+");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("q0(): Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("q1(p:P1) : Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("q2(left:P1, right:P1) : Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("q3() : B");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("detail B {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("b1 : Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("q5(p:P1) : Natural");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      final DDomain customTypes = this.dimParseHelper.parse(_builder_2, resourceSet);
      Assertions.assertNotNull(customTypes);
      final EList<Resource.Diagnostic> ctErrors = systemTypes.eResource().getErrors();
      boolean _isEmpty_1 = ctErrors.isEmpty();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Parse errors in custom types: ");
      String _join_1 = IterableExtensions.join(ctErrors, ", ");
      _builder_3.append(_join_1);
      Assertions.assertTrue(_isEmpty_1, _builder_3.toString());
      final DmxNamespace result = this.dmxParseHelper.parse(input, resourceSet);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty_2 = errors.isEmpty();
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("Parse errors: ");
      String _join_2 = IterableExtensions.join(errors, "; ");
      _builder_4.append(_join_2);
      Assertions.assertTrue(_isEmpty_2, _builder_4.toString());
      return result.getTests();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLiterals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace N");
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
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests).eContainer());
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertNumber(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertNumber(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertNumber(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertNumber(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertNumber(e06);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertType(e07, DmxTypeDescriptorProvider.TEXT);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertType(e08, DmxTypeDescriptorProvider.UNDEFINED_TYPE);
  }
  
  @Test
  public void testArithmetics() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 { 1 + 2 }");
    _builder.newLine();
    _builder.append("test T01 { 1 - 2 }");
    _builder.newLine();
    _builder.append("test T02 { 1 * 2 }");
    _builder.newLine();
    _builder.append("test T03 { 1 / 2 }");
    _builder.newLine();
    _builder.append("test T04 { 8 % 3 }");
    _builder.newLine();
    _builder.append("test T05 { 2**4 }");
    _builder.newLine();
    _builder.append("test T06 { \"A\" + \"B\" }");
    _builder.newLine();
    _builder.append("test T07 { 1 + \"A\" }\t\t\t\t\t\t\t\t\t\t\t\t// ERROR: Type mismatch");
    _builder.newLine();
    _builder.append("test T08 context t : Timepoint { t + 155 } \t\t\t\t// add a number value");
    _builder.newLine();
    _builder.append("test T09 context t : Timepoint { t - 155 } \t\t\t\t// subtract a number value");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertNumber(e00);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertNumber(e01);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertNumber(e02);
    this.assertNoValidationErrors(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertNumber(e03);
    this.assertNoValidationErrors(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertNumber(e04);
    this.assertNoValidationErrors(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertNumber(e05);
    this.assertNoValidationErrors(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertType(e06, DmxTypeDescriptorProvider.TEXT);
    this.assertNoValidationErrors(e06);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertNumber(e07);
    this.assertHasValidationERRORS(e07);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertType(e08, DmxTypeDescriptorProvider.TIMEPOINT);
    this.assertNoValidationErrors(e08);
    final DExpression e09 = tests.get(9).getExpr();
    this.assertType(e09, DmxTypeDescriptorProvider.TIMEPOINT);
    this.assertNoValidationErrors(e09);
  }
  
  @Test
  public void testTestContextValueType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : Natural := 1 { a }");
    _builder.newLine();
    _builder.append("test T01 context a : Natural := \"a\"  { a } \t\t\t\t\t\t// ERROR");
    _builder.newLine();
    _builder.append("test T02 context a : A := detail A { a2 = 1 }  { a.a2 = 1 }");
    _builder.newLine();
    _builder.append("test T03 context a : A := detail A { a2 = \"a\" }  { a.a2 = 1 } // ERROR");
    _builder.newLine();
    _builder.append("test T04 context a : A+ := { detail A { a2 = 1 }}  { true }  // List");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertNumber(e00);
    this.assertNoValidationErrors(e00.eContainer());
    final DExpression e01 = tests.get(1).getExpr();
    this.assertNumber(e01);
    this.assertHasValidationERRORS(e01.eContainer());
    final DExpression e02 = tests.get(2).getExpr();
    this.assertBoolean(e02);
    this.assertNoValidationErrors(e02.eContainer());
    final DExpression e03 = tests.get(3).getExpr();
    this.assertBoolean(e03);
    this.assertHasValidationERRORS(e03.eContainer());
    final DExpression e04 = tests.get(4).getExpr();
    this.assertBoolean(e04);
    this.assertNoValidationErrors(e04.eContainer());
  }
  
  @Test
  public void testTimepoints() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : Timepoint, b : Timepoint { a = b }");
    _builder.newLine();
    _builder.append("test T01 context a : A, b : Timepoint { a.a5 := b }  ");
    _builder.newLine();
    _builder.append("test T02 context a : A { a.a5 := \"2019-05-15\" }\t\t\t// right-hand side parsed as date");
    _builder.newLine();
    _builder.append("test T03 context a : A { a.a5 := \"2019-05-15 10:48\" }\t// right-hand side parsed as date + time");
    _builder.newLine();
    _builder.append("test T04 context a : A { a.a5 := \"20190515\" }\t\t\t\t// ERROR: format");
    _builder.newLine();
    _builder.append("test T05 context t : Timepoint { t <= \"2019-05-15\" }\t");
    _builder.newLine();
    _builder.append("test T06 context t : Timepoint { \"20190515\" < t }\t\t\t// ERROR: timepoint on right-hand side not supported");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertVoid(e01);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertVoid(e02);
    this.assertNoValidationErrors(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertVoid(e03);
    this.assertNoValidationErrors(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertVoid(e04);
    this.assertHasValidationERRORS(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertBoolean(e05);
    this.assertNoValidationErrors(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertBoolean(e06);
    this.assertHasValidationERRORS(e06);
  }
  
  @Test
  public void testLists() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 {  {}  }  // empty collection");
    _builder.newLine();
    _builder.append("test T01 { {1} }");
    _builder.newLine();
    _builder.append("test T02 { {1,2} }");
    _builder.newLine();
    _builder.append("test T03 { {1, \"A\"} } \t\t\t\t\t\t\t\t// ERROR: inconsistent types in collection");
    _builder.newLine();
    _builder.append("test T04 context a : A { a.b2.b1 } \t \t\t// ERROR: navigation of collection (Validation error)");
    _builder.newLine();
    _builder.append("test T05 { {1,2} = {} }");
    _builder.newLine();
    _builder.append("test T06 { {1,2} = {1,2} }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertType(e00, DmxTypeDescriptorProvider.UNDEFINED_TYPE_COLLECTION);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertType(e01, DmxTypeDescriptorProvider.NUMBER_COLLECTION);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertType(e02, DmxTypeDescriptorProvider.NUMBER_COLLECTION);
    this.assertNoValidationErrors(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertType(e03, DmxTypeDescriptorProvider.AMBIGUOUS_TYPE);
    this.assertHasValidationERRORS(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertType(e04, DmxTypeDescriptorProvider.NUMBER);
    this.assertHasValidationERRORS(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertBoolean(e05);
    this.assertNoValidationErrors(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertBoolean(e06);
    this.assertNoValidationErrors(e06);
  }
  
  @Test
  public void testIn() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : A { a.a2 in {3,4} }");
    _builder.newLine();
    _builder.append("test T01 context a : A { {3, \"a\"} }  \t\t\t\t// ERROR: first element determines type");
    _builder.newLine();
    _builder.append("test T02 context a : A { a.a4 = 3 }   \t\t\t// ERROR: not a collection");
    _builder.newLine();
    _builder.append("test T03 context a : A { a.a4 in {3,4} }  \t// ERROR: cannot be a collection");
    _builder.newLine();
    _builder.append("test T04 context a : A { a.a4 = {3, \"A\"} }\t// ERROR: first element determines type");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertHasValidationERRORS(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertHasValidationERRORS(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertHasValidationERRORS(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertHasValidationERRORS(e04);
  }
  
  @Test
  public void testEquality() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : Natural, b : Natural { a = b }");
    _builder.newLine();
    _builder.append("test T01 context a : Natural, b : Natural { a != b }");
    _builder.newLine();
    _builder.append("test T02 context a : Natural, b : Natural { a <> b }");
    _builder.newLine();
    _builder.append("test T03 context a : Natural, b : Text { a = b }  \t\t// ERROR: Natural vs. Text");
    _builder.newLine();
    _builder.append("test T04 context a : A, b : Natural { a.a2 = b }");
    _builder.newLine();
    _builder.append("test T05 context a : A { a.a3 = E1.L2 }  \t\t\t\t\t// Enumerations");
    _builder.newLine();
    _builder.append("test T06 context a : A { a.q1(2) = 3 }");
    _builder.newLine();
    _builder.append("test T07 context a : A { a.a4 = {} }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertBoolean(e02);
    this.assertNoValidationErrors(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertBoolean(e03);
    this.assertHasValidationERRORS(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertBoolean(e04);
    this.assertNoValidationErrors(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertBoolean(e05);
    this.assertNoValidationErrors(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertBoolean(e06);
    this.assertNoValidationErrors(e06);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertBoolean(e07);
    this.assertNoValidationErrors(e07);
  }
  
  @Test
  public void testRelationalOperators() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("// \"comparable\" types:");
    _builder.newLine();
    _builder.append("test T00 context a : Natural, b : Natural { a > b }");
    _builder.newLine();
    _builder.append("test T01 context a : Text, b : Text { a > b }");
    _builder.newLine();
    _builder.append("test T02 context a : Timepoint, b : Timepoint { a > b }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("test T03 context a : Natural, b : Natural { a >= b }");
    _builder.newLine();
    _builder.append("test T04 context a : Natural, b : Natural { a ≥ b }");
    _builder.newLine();
    _builder.append("test T05 context a : Natural, b : Natural { a < b }");
    _builder.newLine();
    _builder.append("test T06 context a : Natural, b : Natural { a <= b }");
    _builder.newLine();
    _builder.append("test T07 context a : Natural, b : Natural { a ≤ b }");
    _builder.newLine();
    _builder.append("test T08 context a : A { a.a3 < E1.L2 }  \t\t// ERROR: cannot compare enumerations with relational operators");
    _builder.newLine();
    _builder.append("test T09 context a : A { a.a2 < a.a4 }   \t\t// ERROR: cannot compare scalar with collection");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertBoolean(e02);
    this.assertNoValidationErrors(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertBoolean(e03);
    this.assertNoValidationErrors(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertBoolean(e04);
    this.assertNoValidationErrors(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertBoolean(e05);
    this.assertNoValidationErrors(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertBoolean(e06);
    this.assertNoValidationErrors(e06);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertBoolean(e07);
    this.assertNoValidationErrors(e07);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertBoolean(e08);
    this.assertHasValidationERRORS(e08);
    final DExpression e09 = tests.get(9).getExpr();
    this.assertBoolean(e09);
    this.assertHasValidationERRORS(e09);
  }
  
  @Test
  public void testBooleanOperators() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : Boolean, b : Boolean { a AND b }");
    _builder.newLine();
    _builder.append("test T01 context a : Boolean, b : Boolean { a OR b }");
    _builder.newLine();
    _builder.append("test T02 context a : Boolean, b : Boolean { a XOR b }");
    _builder.newLine();
    _builder.append("test T03 context a : Boolean, b : Boolean { a => b }");
    _builder.newLine();
    _builder.append("test T04 context a : Boolean { NOT a }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests).eContainer());
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertBoolean(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertBoolean(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertBoolean(e04);
  }
  
  @Test
  public void testAssignments() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : Natural { a := 1 }\t\t// ERROR: can only assign to attributes");
    _builder.newLine();
    _builder.append("test T01 context a : A { a.a1 := 1 }  ");
    _builder.newLine();
    _builder.append("test T02 context a : A { a.a1 := \"A\" }\t\t// ERROR: wrong type");
    _builder.newLine();
    _builder.append("test T03 context a : A { a.q0 := 3 } \t\t\t// ERROR: cannot assign to query");
    _builder.newLine();
    _builder.append("test T04 context a : A { a.b1.b1 := 3 }");
    _builder.newLine();
    _builder.append("test T05 context a : A { a.a1 := a.q0() } ");
    _builder.newLine();
    _builder.append("test T06 context a : A { a.a4 := {} }");
    _builder.newLine();
    _builder.append("test T07 context a : A { a.a4 := {3} }");
    _builder.newLine();
    _builder.append("test T08 context a : A { a.a4 := {3,4} }");
    _builder.newLine();
    _builder.append("test T09 context a : A { a.a4 := 3 }\t\t\t// ERROR: cannot assign a scalar to a collection");
    _builder.newLine();
    _builder.append("test T10 context a : A { a.a2 := {3,4} }\t\t// ERROR: cannot assign a collection to a scalar");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertVoid(e00);
    this.assertHasValidationERRORS(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertVoid(e01);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertVoid(e02);
    this.assertHasValidationERRORS(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertVoid(e03);
    this.assertHasValidationERRORS(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertVoid(e04);
    this.assertNoValidationErrors(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertVoid(e05);
    this.assertNoValidationErrors(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertVoid(e06);
    this.assertNoValidationErrors(e06);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertVoid(e07);
    this.assertNoValidationErrors(e07);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertVoid(e08);
    this.assertNoValidationErrors(e08);
    final DExpression e09 = tests.get(9).getExpr();
    this.assertVoid(e09);
    this.assertHasValidationERRORS(e09);
    final DExpression e10 = tests.get(10).getExpr();
    this.assertVoid(e10);
    this.assertHasValidationERRORS(e10);
  }
  
  @Test
  public void testFunctionCalls() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 context a : A { a.q0 } ");
    _builder.newLine();
    _builder.append("test T01 context a : A { a.q0() } ");
    _builder.newLine();
    _builder.append("test T02 context a : A { a.q0(1) } \t\t\t\t// ERROR: too many parameter values");
    _builder.newLine();
    _builder.append("test T03 context a : A { a.q1() }  \t\t\t\t// ERROR: missing parameter value");
    _builder.newLine();
    _builder.append("test T04 context a : A { a.q1(1) } ");
    _builder.newLine();
    _builder.append("test T05 context a : A { a.q1(1,2) } \t\t\t// ERROR: too many parameter values");
    _builder.newLine();
    _builder.append("test T06 context a : A { a.q2(1) }  \t\t\t// ERROR: missing parameter value");
    _builder.newLine();
    _builder.append("test T07 context a : A { a.q2(1,2) } ");
    _builder.newLine();
    _builder.append("test T08 context a : A { a.q2(1,2,3) }  \t\t// ERROR: too many parameter values");
    _builder.newLine();
    _builder.append("test T09 context a : A { a.q2(1,2) }");
    _builder.newLine();
    _builder.append("test T10 context a : A { a.q2(1,\"A\") }\t\t// ERROR: wrong type");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    final DExpression e00 = tests.get(0).getExpr();
    this.assertNumber(e00);
    this.assertNoValidationErrors(e00);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertNumber(e01);
    this.assertNoValidationErrors(e01);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertNumber(e02);
    this.assertHasValidationERRORS(e02);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertNumber(e03);
    this.assertHasValidationERRORS(e03);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertNumber(e04);
    this.assertNoValidationErrors(e04);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertNumber(e05);
    this.assertHasValidationERRORS(e05);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertNumber(e06);
    this.assertHasValidationERRORS(e06);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertNumber(e07);
    this.assertNoValidationErrors(e07);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertNumber(e08);
    this.assertHasValidationERRORS(e08);
    final DExpression e09 = tests.get(9).getExpr();
    this.assertNumber(e09);
    this.assertNoValidationErrors(e09);
    final DExpression e10 = tests.get(10).getExpr();
    this.assertNumber(e10);
    this.assertHasValidationERRORS(e10);
  }
  
  public void assertType(final DExpression expr, final AbstractDmxTypeDescriptor<?> expectedType) {
    final AbstractDmxTypeDescriptor<?> type = this._dmxTypeComputer.typeFor(expr);
    boolean _isCompatibleWith = type.isCompatibleWith(expectedType);
    String _string = type.toString();
    String _plus = ("Was: " + _string);
    String _plus_1 = (_plus + ", expected: ");
    String _plus_2 = (_plus_1 + expectedType);
    Assertions.assertTrue(_isCompatibleWith, _plus_2);
  }
  
  public void assertNumber(final DExpression expr) {
    this.assertType(expr, DmxTypeDescriptorProvider.NUMBER);
  }
  
  public void assertBoolean(final DExpression expr) {
    this.assertType(expr, DmxTypeDescriptorProvider.BOOLEAN);
  }
  
  public void assertVoid(final DExpression expr) {
    this.assertType(expr, DmxTypeDescriptorProvider.VOID);
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
  
  public void assertHasValidationERRORS(final EObject obj) {
    final List<Diagnostic> result = Diagnostician.INSTANCE.validate(obj).getChildren();
    int _size = result.size();
    boolean _greaterEqualsThan = (_size >= 1);
    Assertions.assertTrue(_greaterEqualsThan, "No validation errors");
  }
}