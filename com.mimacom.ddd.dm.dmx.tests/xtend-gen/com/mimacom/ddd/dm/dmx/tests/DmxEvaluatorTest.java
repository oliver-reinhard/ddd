/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.dim.DimPackage;
import com.mimacom.ddd.dm.dim.DimStandaloneSetup;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.evaluator.DmxExpressionEvaluator;
import com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl;
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import java.math.BigDecimal;
import java.util.Date;
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
public class DmxEvaluatorTest {
  protected static final DimPackage DIM = DimPackage.eINSTANCE;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private ParseHelper<DNamespace> dmxParseHelper;
  
  private final ParseHelper<DNamespace> dimParseHelper;
  
  @Inject
  @Extension
  private DmxExpressionEvaluator _dmxExpressionEvaluator;
  
  @Inject
  @Extension
  private DmxTypeComputer _dmxTypeComputer;
  
  public DmxEvaluatorTest() {
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
      final DNamespace systemTypes = this.dmxParseHelper.parse(_builder, resourceSet);
      Assertions.assertNotNull(systemTypes);
      final EList<Resource.Diagnostic> stErrors = systemTypes.eResource().getErrors();
      boolean _isEmpty = stErrors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Parse errors in system types: ");
      String _join = IterableExtensions.join(stErrors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      DModel _model = systemTypes.getModel();
      final DmxModel systemTypesModel = ((DmxModel) _model);
      Assertions.assertNotNull(systemTypesModel);
      Assertions.assertEquals(DmxArchetypeImpl.class, systemTypesModel.getTypes().get(0).getClass());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("domain D");
      _builder_2.newLine();
      _builder_2.append("information model CustomTypes {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("primitive P1 redefines Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("enumeration E1 { L1, L2 }");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("detail A {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a0 : Text");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a1 : Natural?");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a2 : Natural");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a3 : E1");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a4 : Natural*");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a5 : Timepoint");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a6 : Boolean");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("a7 : A");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("detail b1 : B");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("detail b2 : B+");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("q0(): Natural");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("q1(p:P1) : Natural");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("q2(left:P1, right:P1) : Natural");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("q3() : B");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("detail B {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("b1 : Natural");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("q5(p:P1) : Natural");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      final DNamespace customTypes = this.dimParseHelper.parse(_builder_2, resourceSet);
      Assertions.assertNotNull(customTypes);
      final EList<Resource.Diagnostic> ctErrors = customTypes.eResource().getErrors();
      boolean _isEmpty_1 = ctErrors.isEmpty();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Parse errors in custom types: ");
      String _join_1 = IterableExtensions.join(ctErrors, ", ");
      _builder_3.append(_join_1);
      Assertions.assertTrue(_isEmpty_1, _builder_3.toString());
      DModel _model_1 = customTypes.getModel();
      final DomainInformationModel dimModel = ((DomainInformationModel) _model_1);
      Assertions.assertNotNull(dimModel);
      Assertions.assertEquals(DmxEvaluatorTest.DIM.getDimPrimitive(), dimModel.getTypes().get(0).eClass());
      Assertions.assertEquals(DmxEvaluatorTest.DIM.getDimEnumeration(), dimModel.getTypes().get(1).eClass());
      Assertions.assertEquals(DmxEvaluatorTest.DIM.getDimDetailType(), dimModel.getTypes().get(2).eClass());
      final DNamespace result = this.dmxParseHelper.parse(input, resourceSet);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty_2 = errors.isEmpty();
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("Parse errors: ");
      String _join_2 = IterableExtensions.join(errors, "; ");
      _builder_4.append(_join_2);
      Assertions.assertTrue(_isEmpty_2, _builder_4.toString());
      DModel _model_2 = result.getModel();
      return ((DmxModel) _model_2).getTests();
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
    this.assertBoolean(e00, true);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01, false);
    final DExpression e02 = tests.get(2).getExpr();
    BigDecimal _bigDecimal = new BigDecimal(0);
    this.assertNumber(e02, _bigDecimal);
    final DExpression e03 = tests.get(3).getExpr();
    BigDecimal _bigDecimal_1 = new BigDecimal(22);
    this.assertNumber(e03, _bigDecimal_1);
    final DExpression e04 = tests.get(4).getExpr();
    BigDecimal _bigDecimal_2 = new BigDecimal((-1));
    this.assertNumber(e04, _bigDecimal_2);
    final DExpression e05 = tests.get(5).getExpr();
    BigDecimal _bigDecimal_3 = new BigDecimal("3.1415");
    this.assertNumber(e05, _bigDecimal_3);
    final DExpression e06 = tests.get(6).getExpr();
    BigDecimal _bigDecimal_4 = new BigDecimal("3141.526E-3");
    this.assertNumber(e06, _bigDecimal_4);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertText(e07, "String");
    final DExpression e08 = tests.get(8).getExpr();
    this.assertValue(e08, DmxTypeDescriptorProvider.UNDEFINED_TYPE);
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
    _builder.append("test T08 context t : Timepoint { t + 155 } \t\t\t\t\t\t// add a number value");
    _builder.newLine();
    _builder.append("test T09 { \"2019-05-15\" + 155 } \t\t\t\t\t\t\t\t// add a number value");
    _builder.newLine();
    _builder.append("test T11 context t : Timepoint { t - 155 } \t\t\t\t\t\t// subtract a number value");
    _builder.newLine();
    _builder.append("test T12  { \"2019-05-15\" - 155 } \t\t\t\t\t\t\t\t// subtract a number value");
    _builder.newLine();
    _builder.append("test T13 context t1 : Timepoint, t2 : Timepoint { t1 - t2 } \t// Subtract two timepoints => number");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests).eContainer());
    final DExpression e00 = tests.get(0).getExpr();
    BigDecimal _bigDecimal = new BigDecimal(3);
    this.assertNumber(e00, _bigDecimal);
    final DExpression e01 = tests.get(1).getExpr();
    BigDecimal _bigDecimal_1 = new BigDecimal((-1));
    this.assertNumber(e01, _bigDecimal_1);
    final DExpression e02 = tests.get(2).getExpr();
    BigDecimal _bigDecimal_2 = new BigDecimal(2);
    this.assertNumber(e02, _bigDecimal_2);
    final DExpression e03 = tests.get(3).getExpr();
    BigDecimal _bigDecimal_3 = new BigDecimal(0.5);
    this.assertNumber(e03, _bigDecimal_3);
    final DExpression e04 = tests.get(4).getExpr();
    BigDecimal _bigDecimal_4 = new BigDecimal(2);
    this.assertNumber(e04, _bigDecimal_4);
    final DExpression e05 = tests.get(5).getExpr();
    BigDecimal _bigDecimal_5 = new BigDecimal(16);
    this.assertNumber(e05, _bigDecimal_5);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertText(e06, "AB");
  }
  
  /**
   * @Test
   * def void testTimepoints() {
   * val tests = parse('''
   * namespace N
   * import D.
   * test T00 context a : Timepoint, b : Timepoint { a = b }
   * test T01 context a : A, b : Timepoint { a.a5 := b }
   * test T02 context a : A { a.a5 := "2019-05-15" }			// right-hand side parsed as date
   * test T03 context a : A { a.a5 := "2019-05-15 10:48" }	// right-hand side parsed as date + time
   * test T05 context t : Timepoint { t <= "2019-05-15" }
   * ''')
   * assertNoValidationErrors(tests.head.eContainer)
   * 
   * val e00 = tests.get(0).expr
   * assertBoolean(e00)
   * 
   * val e01 = tests.get(1).expr
   * assertVoid(e01)
   * 
   * val e02 = tests.get(2).expr
   * assertVoid(e02)
   * 
   * val e03 = tests.get(3).expr
   * assertVoid(e03)
   * 
   * val e05 = tests.get(5).expr
   * assertBoolean(e05)
   * 
   * }
   * 
   * 
   * @Test
   * def void testLists() {
   * val tests = parse('''
   * namespace N
   * import D.
   * test T00 {  {}  }  // empty collection
   * test T01 { {1} }
   * test T02 { {1,2} }
   * test T05 { {1,2} = {} }
   * test T06 { {1,2} = {1,2} }
   * ''')
   * assertNoValidationErrors(tests.head.eContainer)
   * 
   * val e00 = tests.get(0).expr
   * assertValue(e00, DmxTypeDescriptorProvider::UNDEFINED_TYPE, DmxExpressionEvaluator::UNDEFINED_VALUE)
   * 
   * val e01 = tests.get(1).expr
   * assertValue(e01, DmxTypeDescriptorProvider::NUMBER_COLLECTION, new ArrayList())
   * 
   * val e02 = tests.get(2).expr
   * assertValue(e02, DmxTypeDescriptorProvider::NUMBER_COLLECTION)
   * 
   * val e05 = tests.get(5).expr
   * assertBoolean(e05)
   * 
   * val e06 = tests.get(6).expr
   * assertBoolean(e06)
   * }
   * 
   * @Test
   * def void testIn() {
   * val tests = parse('''
   * import D.
   * namespace N
   * test T00 context a : A { 3 in {3,4} }
   * ''')
   * assertNoValidationErrors(tests.head.eContainer)
   * 
   * val e00 = tests.get(0).expr
   * assertBoolean(e00)
   * }
   */
  @Test
  public void testEquality() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("test T00  { 3 = 3 }");
    _builder.newLine();
    _builder.append("test T01  { 3 != 3 }");
    _builder.newLine();
    _builder.append("test T02  { 3 <> 3 }");
    _builder.newLine();
    _builder.append("test T03 { E1.L1 = E1.L1 }  \t\t\t\t\t// Enumerations");
    _builder.newLine();
    _builder.append("test T04 { E1.L1 <> E1.L2 }  \t\t\t\t\t// Enumerations");
    _builder.newLine();
    _builder.append("test T05 context a : A := detail A { a2 = 3} { a.a2 = 3 }");
    _builder.newLine();
    _builder.append("test T06 context a : A := detail A { a4 = {} } { a.a4 = {} }");
    _builder.newLine();
    _builder.append("test T07 context a : A := detail A { a4 = {1} } { a.a4 = {1} }");
    _builder.newLine();
    _builder.append("test T08 context a : A := detail A { a4 = {1, 2, 3} } { a.a4 = {1, 2, 3} }");
    _builder.newLine();
    _builder.append("test T09 context a : A := detail A { a4 = {1, 2, 3} } { a.a4 <> {1, 2} }");
    _builder.newLine();
    _builder.append("// test T07  context a : A { a.q1(2) = 3 }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests).eContainer());
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00, true);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01, false);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertBoolean(e02, false);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertBoolean(e03, true);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertBoolean(e04, true);
    final DExpression e05 = tests.get(5).getExpr();
    this.assertBoolean(e05, true);
    final DExpression e06 = tests.get(6).getExpr();
    this.assertBoolean(e06, true);
    final DExpression e07 = tests.get(7).getExpr();
    this.assertBoolean(e07, true);
    final DExpression e08 = tests.get(8).getExpr();
    this.assertBoolean(e08, true);
  }
  
  @Test
  public void testTest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("import D.*");
    _builder.newLine();
    _builder.append("test T00 context a : A := detail A { a4 = {1, 2, 3} } { a.a4 <> {1, 2} }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests).eContainer());
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00, true);
  }
  
  /**
   * @Test
   * def void testRelationalOperators() {
   * val tests = parse('''
   * import D.
   * namespace N
   * // "comparable" types:
   * test T00 context a : Natural, b : Natural { a > b }
   * test T01 context a : Text, b : Text { a > b }
   * test T02 context a : Timepoint, b : Timepoint { a > b }
   * 
   * test T03 context a : Natural, b : Natural { a >= b }
   * test T04 context a : Natural, b : Natural { a ≥ b }
   * test T05 context a : Natural, b : Natural { a < b }
   * test T06 context a : Natural, b : Natural { a <= b }
   * test T07 context a : Natural, b : Natural { a ≤ b }
   * ''')
   * assertNoValidationErrors(tests.head.eContainer)
   * 
   * val e00 = tests.get(0).expr
   * assertBoolean(e00)
   * 
   * val e01 = tests.get(1).expr
   * assertBoolean(e01)
   * 
   * val e02 = tests.get(2).expr
   * assertBoolean(e02)
   * 
   * val e03 = tests.get(3).expr
   * assertBoolean(e03)
   * 
   * val e04 = tests.get(4).expr
   * assertBoolean(e04)
   * 
   * val e05 = tests.get(5).expr
   * assertBoolean(e05)
   * 
   * val e06 = tests.get(6).expr
   * assertBoolean(e06)
   * 
   * val e07 = tests.get(7).expr
   * assertBoolean(e07)
   * }
   */
  @Test
  public void testBooleanOperators() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace N");
    _builder.newLine();
    _builder.append("test T00 { true AND false }");
    _builder.newLine();
    _builder.append("test T01 { true OR false }");
    _builder.newLine();
    _builder.append("test T02 { true XOR true }");
    _builder.newLine();
    _builder.append("test T03 { true => true }");
    _builder.newLine();
    _builder.append("test T04 { NOT true }");
    _builder.newLine();
    final EList<DmxTest> tests = this.parse(_builder);
    this.assertNoValidationErrors(IterableExtensions.<DmxTest>head(tests).eContainer());
    final DExpression e00 = tests.get(0).getExpr();
    this.assertBoolean(e00, false);
    final DExpression e01 = tests.get(1).getExpr();
    this.assertBoolean(e01, true);
    final DExpression e02 = tests.get(2).getExpr();
    this.assertBoolean(e02, false);
    final DExpression e03 = tests.get(3).getExpr();
    this.assertBoolean(e03, true);
    final DExpression e04 = tests.get(4).getExpr();
    this.assertBoolean(e04, false);
  }
  
  /**
   * /
   * @Test
   * def void testAssignments() {
   * val tests = parse('''
   * import D.
   * namespace N
   * test T01 context a : A { a.a1 := 1 }
   * test T04 context a : A { a.b1.b1 := 3 }
   * test T05 context a : A { a.a1 := a.q0() }
   * test T06 context a : A { a.a4 := {} }
   * test T07 context a : A { a.a4 := {3} }
   * test T08 context a : A { a.a4 := {3,4} }
   * ''')
   * assertNoValidationErrors(tests.head.eContainer)
   * 
   * val e01 = tests.get(1).expr
   * assertVoid(e01)
   * 
   * val e04 = tests.get(4).expr
   * assertVoid(e04)
   * 
   * val e05 = tests.get(5).expr
   * assertVoid(e05)
   * 
   * val e06 = tests.get(6).expr
   * assertVoid(e06)
   * 
   * val e07 = tests.get(7).expr
   * assertVoid(e07)
   * 
   * val e08 = tests.get(8).expr
   * assertVoid(e08)
   * }
   * 
   * 
   * @Test
   * def void testFunctionCalls() {
   * val tests = parse('''
   * import D.
   * namespace N
   * test T00 context a : A { a.q0 }
   * test T01 context a : A { a.q0() }
   * test T04 context a : A { a.q1(1) }
   * test T07 context a : A { a.q2(1,2) }
   * test T09 context a : A { a.q2(1,2) }
   * ''')
   * assertNoValidationErrors(tests.head.eContainer)
   * 
   * val e00 = tests.get(0).expr
   * assertNumber(e00)
   * 
   * val e01 = tests.get(1).expr
   * assertNumber(e01)
   * 
   * val e04 = tests.get(4).expr
   * assertNumber(e04)
   * 
   * val e07 = tests.get(7).expr
   * assertNumber(e07)
   * 
   * val e09 = tests.get(9).expr
   * assertNumber(e09)
   * }
   */
  public void assertValue(final DExpression expr, final AbstractDmxTypeDescriptor<?> expectedType) {
    final AbstractDmxTypeDescriptor<?> type = this._dmxTypeComputer.typeFor(expr);
    boolean _isCompatibleWith = type.isCompatibleWith(expectedType);
    String _string = type.toString();
    String _plus = ("Was: " + _string);
    String _plus_1 = (_plus + ", expected: ");
    String _plus_2 = (_plus_1 + expectedType);
    Assertions.assertTrue(_isCompatibleWith, _plus_2);
  }
  
  public void assertNumber(final DExpression expr, final BigDecimal expected) {
    this.assertValue(expr, DmxTypeDescriptorProvider.NUMBER);
    Assertions.assertEquals(expected, this._dmxExpressionEvaluator.valueFor(expr));
  }
  
  public void assertBoolean(final DExpression expr, final boolean expected) {
    this.assertValue(expr, DmxTypeDescriptorProvider.BOOLEAN);
    Assertions.assertEquals(Boolean.valueOf(expected), this._dmxExpressionEvaluator.valueFor(expr));
  }
  
  public void assertText(final DExpression expr, final String expected) {
    this.assertValue(expr, DmxTypeDescriptorProvider.TEXT);
    Assertions.assertEquals(expected, this._dmxExpressionEvaluator.valueFor(expr));
  }
  
  public void assertTimepoint(final DExpression expr, final Date expected) {
    this.assertValue(expr, DmxTypeDescriptorProvider.TIMEPOINT);
    Assertions.assertEquals(expected, this._dmxExpressionEvaluator.valueFor(expr));
  }
  
  public void assertVoid(final DExpression expr) {
    this.assertValue(expr, DmxTypeDescriptorProvider.VOID);
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
