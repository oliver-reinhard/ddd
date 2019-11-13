/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.impl.DRichTextImpl;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxContextReferenceImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxDecimalLiteralImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxNaturalLiteralImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxStaticReferenceImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxStringLiteralImpl;
import com.mimacom.ddd.dm.dmx.impl.DmxUndefinedLiteralImpl;
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
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
public class DmxParsingTest {
  @Inject
  @Extension
  private ParseHelper<DmxNamespace> parseHelper;
  
  @Inject
  @Extension
  private DmxUtil _dmxUtil;
  
  @Test
  public void testLiterals() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace N");
      _builder.newLine();
      _builder.append("test e0 { true }");
      _builder.newLine();
      _builder.append("test e1 { \"Domain Model\" }");
      _builder.newLine();
      _builder.append("test e2 { 42 }");
      _builder.newLine();
      _builder.append("test e3 { 3.14159 }");
      _builder.newLine();
      _builder.append("test e4 { 314.159E-2 }");
      _builder.newLine();
      _builder.append("test e5 { undefined }");
      _builder.newLine();
      _builder.append("test e6 { UNDEFINED }");
      _builder.newLine();
      final DmxNamespace result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Literal errors: ");
      String _join = IterableExtensions.join(errors, "; ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final EList<DmxTest> tests = result.getTests();
      final DExpression e0 = tests.get(0).getExpr();
      Assertions.assertEquals(DmxBooleanLiteralImpl.class, e0.getClass());
      Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((DmxBooleanLiteralImpl) e0).isValue()));
      final DExpression e1 = tests.get(1).getExpr();
      Assertions.assertEquals(DmxStringLiteralImpl.class, e1.getClass());
      Assertions.assertEquals("Domain Model", ((DmxStringLiteralImpl) e1).getValue());
      final DExpression e2 = tests.get(2).getExpr();
      Assertions.assertEquals(DmxNaturalLiteralImpl.class, e2.getClass());
      Assertions.assertEquals(42, ((DmxNaturalLiteralImpl) e2).getValue());
      final DExpression e3 = tests.get(3).getExpr();
      Assertions.assertEquals(DmxDecimalLiteralImpl.class, e3.getClass());
      Assertions.assertEquals("3.14159", ((DmxDecimalLiteralImpl) e3).getValue());
      final DExpression e4 = tests.get(4).getExpr();
      Assertions.assertEquals(DmxDecimalLiteralImpl.class, e4.getClass());
      Assertions.assertEquals("314.159E-2", ((DmxDecimalLiteralImpl) e4).getValue());
      final DExpression e5 = tests.get(5).getExpr();
      Assertions.assertEquals(DmxUndefinedLiteralImpl.class, e5.getClass());
      final DExpression e6 = tests.get(5).getExpr();
      Assertions.assertEquals(DmxUndefinedLiteralImpl.class, e6.getClass());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPrimaries() {
    try {
      final String XX = "«";
      final String YY = "»";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace N");
      _builder.newLine();
      _builder.append("test e0 { (4) }");
      _builder.newLine();
      _builder.append("test e1 { f() }");
      _builder.newLine();
      _builder.append("test e2 { f(6) }");
      _builder.newLine();
      _builder.append("test e3 { f(6, \"A\") }");
      _builder.newLine();
      _builder.append("test e4 { new X }");
      _builder.newLine();
      _builder.append("test e5 { new X(9) }");
      _builder.newLine();
      _builder.append("test e6 { new X(9, \"A\") }");
      _builder.newLine();
      _builder.append("test e7 {");
      _builder.append(XX);
      _builder.append("[[A]]");
      _builder.append(YY);
      _builder.append(" }");
      _builder.newLineIfNotEmpty();
      _builder.append("test e8 {");
      _builder.append(XX);
      _builder.append("[[A#a]]");
      _builder.append(YY);
      _builder.append(" }");
      _builder.newLineIfNotEmpty();
      _builder.append("test e9 {");
      _builder.append(XX);
      _builder.append("[A]");
      _builder.append(YY);
      _builder.append(" }");
      _builder.newLineIfNotEmpty();
      final DmxNamespace result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Primaries errors: ");
      String _join = IterableExtensions.join(errors, "; ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final EList<DmxTest> tests = result.getTests();
      {
        final DExpression e = tests.get(0).getExpr();
        Assertions.assertEquals(DmxNaturalLiteralImpl.class, e.getClass());
        Assertions.assertEquals(4, ((DmxNaturalLiteralImpl) e).getValue());
      }
      {
        final DExpression e = tests.get(1).getExpr();
        Assertions.assertEquals(DmxFunctionCallImpl.class, e.getClass());
        Assertions.assertTrue(((DmxFunctionCallImpl) e).basicGetFunction().eIsProxy());
        Assertions.assertEquals(DmxFilterImpl.class, ((DmxFunctionCallImpl) e).basicGetFunction().getClass());
        Assertions.assertEquals(0, this._dmxUtil.nullSafeCallArguments(((DmxFunctionCallImpl) e)).size());
      }
      {
        final DExpression e = tests.get(2).getExpr();
        Assertions.assertEquals(DmxFilterImpl.class, ((DmxFunctionCallImpl) e).basicGetFunction().getClass());
        final List<DExpression> args = this._dmxUtil.nullSafeCallArguments(((DmxFunctionCallImpl) e));
        Assertions.assertEquals(1, args.size());
        Assertions.assertEquals(DmxNaturalLiteralImpl.class, args.get(0).getClass());
      }
      {
        final DExpression e = tests.get(3).getExpr();
        Assertions.assertEquals(DmxFilterImpl.class, ((DmxFunctionCallImpl) e).basicGetFunction().getClass());
        final List<DExpression> args = this._dmxUtil.nullSafeCallArguments(((DmxFunctionCallImpl) e));
        Assertions.assertEquals(2, args.size());
        Assertions.assertEquals(DmxNaturalLiteralImpl.class, args.get(0).getClass());
        Assertions.assertEquals(DmxStringLiteralImpl.class, args.get(1).getClass());
      }
      {
        final DExpression e = tests.get(4).getExpr();
        Assertions.assertEquals(DmxConstructorCallImpl.class, e.getClass());
        Assertions.assertFalse(((DmxConstructorCallImpl) e).isExplicitConstructorCall());
      }
      {
        final DExpression e = tests.get(5).getExpr();
        Assertions.assertEquals(DmxConstructorCallImpl.class, e.getClass());
        Assertions.assertTrue(((DmxConstructorCallImpl) e).isExplicitConstructorCall());
        final List<DExpression> args = this._dmxUtil.nullSafeCallArguments(((DmxConstructorCallImpl) e));
        Assertions.assertEquals(1, args.size());
        Assertions.assertEquals(DmxNaturalLiteralImpl.class, args.get(0).getClass());
      }
      {
        final DExpression e = tests.get(6).getExpr();
        Assertions.assertEquals(DmxConstructorCallImpl.class, e.getClass());
        Assertions.assertTrue(((DmxConstructorCallImpl) e).isExplicitConstructorCall());
        final List<DExpression> args = this._dmxUtil.nullSafeCallArguments(((DmxConstructorCallImpl) e));
        Assertions.assertEquals(2, args.size());
        Assertions.assertEquals(DmxNaturalLiteralImpl.class, args.get(0).getClass());
        Assertions.assertEquals(DmxStringLiteralImpl.class, args.get(1).getClass());
      }
      {
        final DExpression e = tests.get(7).getExpr();
        Assertions.assertEquals(DRichTextImpl.class, e.getClass());
        Assertions.assertEquals(((DRichText) e).getSegments().size(), 3);
        final IRichTextSegment seg1 = ((DRichText) e).getSegments().get(1);
        Assertions.assertEquals(DmxStaticReferenceImpl.class, seg1.getClass());
        Assertions.assertTrue(((DmxStaticReferenceImpl) seg1).basicGetTarget().eIsProxy());
        IStaticReferenceTarget _basicGetTarget = ((DmxStaticReferenceImpl) seg1).basicGetTarget();
        Assertions.assertTrue((_basicGetTarget instanceof DNamedElement));
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMemberFeatureCalls() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace N");
      _builder.newLine();
      _builder.append("test T0 { self.a }");
      _builder.newLine();
      _builder.append("test T1 { self.a.b }");
      _builder.newLine();
      _builder.append("test T2 { A.b }");
      _builder.newLine();
      _builder.append("test T3 { A.b.c }");
      _builder.newLine();
      final DmxNamespace result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("MemberFeatureCalls errors: ");
      String _join = IterableExtensions.join(errors, " } ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final EList<DmxTest> tests = result.getTests();
      final DExpression e0 = tests.get(0).getExpr();
      Assertions.assertEquals(DmxMemberNavigationImpl.class, e0.getClass());
      Assertions.assertTrue(((DmxMemberNavigationImpl) e0).basicGetMember().eIsProxy());
      final DExpression e1 = tests.get(1).getExpr();
      Assertions.assertEquals(DmxMemberNavigationImpl.class, e1.getClass());
      final DmxMemberNavigationImpl e1_1 = ((DmxMemberNavigationImpl) e1);
      Assertions.assertTrue(e1_1.basicGetMember().eIsProxy());
      Assertions.assertEquals(DmxMemberNavigationImpl.class, e1_1.getPrecedingNavigationSegment().getClass());
      DExpression _precedingNavigationSegment = e1_1.getPrecedingNavigationSegment();
      final DmxMemberNavigationImpl e1_2 = ((DmxMemberNavigationImpl) _precedingNavigationSegment);
      Assertions.assertTrue(e1_2.basicGetMember().eIsProxy());
      final DExpression e2 = tests.get(2).getExpr();
      Assertions.assertEquals(DmxMemberNavigationImpl.class, e2.getClass());
      final DmxMemberNavigationImpl e2_1 = ((DmxMemberNavigationImpl) e2);
      Assertions.assertTrue(((DmxMemberNavigationImpl) e2_1).basicGetMember().eIsProxy());
      Assertions.assertEquals(DmxContextReferenceImpl.class, e2_1.getPrecedingNavigationSegment().getClass());
      DExpression _precedingNavigationSegment_1 = e2_1.getPrecedingNavigationSegment();
      final DmxContextReferenceImpl e2_2 = ((DmxContextReferenceImpl) _precedingNavigationSegment_1);
      Assertions.assertTrue(e2_2.basicGetTarget().eIsProxy());
      DNamedElement _basicGetTarget = e2_2.basicGetTarget();
      Assertions.assertTrue((_basicGetTarget instanceof DNamedElement));
      final DExpression e3 = tests.get(3).getExpr();
      Assertions.assertEquals(DmxMemberNavigationImpl.class, e3.getClass());
      final DmxMemberNavigationImpl e3_1 = ((DmxMemberNavigationImpl) e3);
      Assertions.assertTrue(e3_1.basicGetMember().eIsProxy());
      Assertions.assertEquals(DmxMemberNavigationImpl.class, e3_1.getPrecedingNavigationSegment().getClass());
      DExpression _precedingNavigationSegment_2 = e3_1.getPrecedingNavigationSegment();
      final DmxMemberNavigationImpl e3_2 = ((DmxMemberNavigationImpl) _precedingNavigationSegment_2);
      Assertions.assertTrue(e3_2.basicGetMember().eIsProxy());
      Assertions.assertEquals(DmxContextReferenceImpl.class, e3_2.getPrecedingNavigationSegment().getClass());
      DExpression _precedingNavigationSegment_3 = e3_2.getPrecedingNavigationSegment();
      final DmxContextReferenceImpl e3_3 = ((DmxContextReferenceImpl) _precedingNavigationSegment_3);
      Assertions.assertTrue(e3_3.basicGetTarget().eIsProxy());
      DNamedElement _basicGetTarget_1 = e3_3.basicGetTarget();
      Assertions.assertTrue((_basicGetTarget_1 instanceof DNamedElement));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssignment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace N");
      _builder.newLine();
      _builder.append("test T0 { a := 0 }");
      _builder.newLine();
      _builder.append("test T1 { self.a := 1 }");
      _builder.newLine();
      _builder.append("test T2 { A.b := 2 }");
      _builder.newLine();
      _builder.append("test T3 { A.b.c := 3 }");
      _builder.newLine();
      final DmxNamespace result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Assignment errors: ");
      String _join = IterableExtensions.join(errors, "; ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final EList<DmxTest> tests = result.getTests();
      final DExpression e0 = tests.get(0).getExpr();
      Assertions.assertEquals(DmxAssignmentImpl.class, e0.getClass());
      Assertions.assertTrue(((DmxAssignmentImpl) e0).basicGetAssignToMember().eIsProxy());
      Assertions.assertNull(((DmxAssignmentImpl) e0).getPrecedingNavigationSegment());
      Assertions.assertEquals(DmxNaturalLiteralImpl.class, ((DmxAssignmentImpl) e0).getValue().getClass());
      final DExpression e1 = tests.get(1).getExpr();
      Assertions.assertEquals(DmxAssignmentImpl.class, e1.getClass());
      Assertions.assertTrue(((DmxAssignmentImpl) e1).basicGetAssignToMember().eIsProxy());
      Assertions.assertEquals(DmxNaturalLiteralImpl.class, ((DmxAssignmentImpl) e1).getValue().getClass());
      final DExpression e2 = tests.get(2).getExpr();
      Assertions.assertEquals(DmxAssignmentImpl.class, e2.getClass());
      Assertions.assertTrue(((DmxAssignmentImpl) e2).basicGetAssignToMember().eIsProxy());
      Assertions.assertEquals(DmxContextReferenceImpl.class, ((DmxAssignmentImpl) e2).getPrecedingNavigationSegment().getClass());
      Assertions.assertEquals(DmxNaturalLiteralImpl.class, ((DmxAssignmentImpl) e2).getValue().getClass());
      final DExpression e3 = tests.get(3).getExpr();
      Assertions.assertEquals(DmxAssignmentImpl.class, e3.getClass());
      Assertions.assertTrue(((DmxAssignmentImpl) e3).basicGetAssignToMember().eIsProxy());
      Assertions.assertEquals(DmxMemberNavigationImpl.class, ((DmxAssignmentImpl) e3).getPrecedingNavigationSegment().getClass());
      DExpression _precedingNavigationSegment = ((DmxAssignmentImpl) e3).getPrecedingNavigationSegment();
      final DmxMemberNavigationImpl e3_1 = ((DmxMemberNavigationImpl) _precedingNavigationSegment);
      Assertions.assertTrue(e3_1.basicGetMember().eIsProxy());
      Assertions.assertEquals(DmxContextReferenceImpl.class, e3_1.getPrecedingNavigationSegment().getClass());
      Assertions.assertEquals(DmxNaturalLiteralImpl.class, ((DmxAssignmentImpl) e3).getValue().getClass());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
