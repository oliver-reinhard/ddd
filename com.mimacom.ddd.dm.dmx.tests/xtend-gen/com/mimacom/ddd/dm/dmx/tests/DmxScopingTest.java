/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.tests;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DmxInjectorProvider.class)
@SuppressWarnings("all")
public class DmxScopingTest {
  @Inject
  @Extension
  private ParseHelper<DDomain> parseHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  private final DmxPackage epackage = DmxPackage.eINSTANCE;
  
  @Test
  public void testContextReferenceExpressionScope() {
    try {
      final String XX = "«";
      final String YY = "»";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("domain D");
      _builder.newLine();
      _builder.newLine();
      _builder.append("archetype GP {}");
      _builder.newLine();
      _builder.append("detail GD {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("x : GP");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("y : GP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("detail A ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(XX, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("c1 : [a > 0]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("c1 : [GP > 0]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("c2 : [b.x > 0]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("c2 : [GD.x > 0]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(YY, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("{ ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a : GP");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("b : GD");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("q1 (m : GP, n : GD) : GD returns m > 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("q2 (r : GD) : GD returns r.x > 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constraint c1 : a > 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constraint c2 : b.x > 0");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DDomain domain = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(domain);
      final EList<Resource.Diagnostic> errors = domain.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("ContextReference parsing errors: ");
      String _join = IterableExtensions.join(errors, "; ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      DType _get = domain.getTypes().get(2);
      final DDetailType detailA = ((DDetailType) _get);
      final String expectedScope1 = "a, b, q1, q2, GP, GD, A, D, D.GP, D.GD, D.A";
      final String expectedScope2 = "x, y";
      {
        IRichTextSegment _get_1 = detailA.getDescription().getSegments().get(1);
        final DExpression c1a = ((DExpression) _get_1);
        this.checkExpression1(c1a, expectedScope1);
        IRichTextSegment _get_2 = detailA.getDescription().getSegments().get(3);
        final DExpression c1b = ((DExpression) _get_2);
        this.checkExpression1(c1b, expectedScope1);
        IRichTextSegment _get_3 = detailA.getDescription().getSegments().get(5);
        final DExpression c2a = ((DExpression) _get_3);
        this.checkExpression2(c2a, expectedScope2, expectedScope1);
        IRichTextSegment _get_4 = detailA.getDescription().getSegments().get(7);
        final DExpression c2b = ((DExpression) _get_4);
        this.checkExpression2(c2b, expectedScope2, expectedScope1);
      }
      {
        final String expectedScope3 = ("m, n, " + expectedScope1);
        DFeature _get_1 = detailA.getFeatures().get(2);
        final DExpression q1 = ((DQuery) _get_1).getReturns();
        this.checkExpression1(q1, expectedScope3);
        final String expectedScope4 = ("r, " + expectedScope1);
        DFeature _get_2 = detailA.getFeatures().get(3);
        final DExpression q2 = ((DQuery) _get_2).getReturns();
        this.checkExpression2(q2, expectedScope2, expectedScope4);
      }
      {
        final DExpression c1 = IterableExtensions.<DNamedPredicate>head(detailA.getConstraints()).getPredicate();
        this.checkExpression1(c1, expectedScope1);
        final DExpression c2 = detailA.getConstraints().get(1).getPredicate();
        this.checkExpression2(c2, expectedScope2, expectedScope1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected DmxContextReference checkExpression1(final DExpression e, final String expectedScopeStr) {
    DmxContextReference _xblockexpression = null;
    {
      Assertions.assertTrue((e instanceof DmxBinaryOperation));
      final DExpression left = ((DmxBinaryOperation) e).getLeftOperand();
      Assertions.assertTrue((left instanceof DmxContextReference));
      final DmxContextReference ref = ((DmxContextReference) left);
      final Procedure1<DmxContextReference> _function = (DmxContextReference it) -> {
        this.assertScope(it, this.epackage.getDmxContextReference_Target(), expectedScopeStr);
      };
      _xblockexpression = ObjectExtensions.<DmxContextReference>operator_doubleArrow(ref, _function);
    }
    return _xblockexpression;
  }
  
  protected DmxContextReference checkExpression2(final DExpression e, final String expectedScopeStr1, final String expectedScopeStr2) {
    DmxContextReference _xblockexpression = null;
    {
      Assertions.assertTrue((e instanceof DmxBinaryOperation));
      final DExpression left = ((DmxBinaryOperation) e).getLeftOperand();
      Assertions.assertTrue((left instanceof DmxMemberNavigation));
      final DmxMemberNavigation member = ((DmxMemberNavigation) left);
      final Procedure1<DmxMemberNavigation> _function = (DmxMemberNavigation it) -> {
        this.assertScope(it, this.epackage.getDmxMemberNavigation_Member(), expectedScopeStr1);
      };
      ObjectExtensions.<DmxMemberNavigation>operator_doubleArrow(member, _function);
      DExpression _precedingNavigationSegment = member.getPrecedingNavigationSegment();
      Assertions.assertTrue((_precedingNavigationSegment instanceof DmxContextReference));
      DExpression _precedingNavigationSegment_1 = member.getPrecedingNavigationSegment();
      final DmxContextReference ref = ((DmxContextReference) _precedingNavigationSegment_1);
      final Procedure1<DmxContextReference> _function_1 = (DmxContextReference it) -> {
        this.assertScope(it, this.epackage.getDmxContextReference_Target(), expectedScopeStr2);
      };
      _xblockexpression = ObjectExtensions.<DmxContextReference>operator_doubleArrow(ref, _function_1);
    }
    return _xblockexpression;
  }
  
  @Test
  public void testSelfExpressionScope() {
    try {
      final String XX = "«";
      final String YY = "»";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("domain D");
      _builder.newLine();
      _builder.newLine();
      _builder.append("archetype GP {}");
      _builder.newLine();
      _builder.append("detail GD {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("x : GP");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("y : GP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("detail A ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(XX, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("c3 : [self.a > 0]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("c4 : [self.b.x > 0]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(YY, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("{ ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a : GP");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("b : GD");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("q1 (m : GP, n : GD) : GD returns self.m > 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("q2 (r : GD) : GD returns self.r.x > 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constraint c3 : self.a > 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constraint c4 : self.b.x > 0");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DDomain domain = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(domain);
      final EList<Resource.Diagnostic> errors = domain.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\"SELF\" parsing errors: ");
      String _join = IterableExtensions.join(errors, "; ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      DType _get = domain.getTypes().get(2);
      final DDetailType detailA = ((DDetailType) _get);
      final String expectedScope1 = "a, b, q1, q2";
      final String expectedScope2 = "x, y";
      {
        IRichTextSegment _get_1 = detailA.getDescription().getSegments().get(1);
        final DExpression c3 = ((DExpression) _get_1);
        this.checkExpression3(c3, expectedScope1);
        IRichTextSegment _get_2 = detailA.getDescription().getSegments().get(3);
        final DExpression c4 = ((DExpression) _get_2);
        this.checkExpression4(c4, expectedScope2, expectedScope1);
      }
      {
        final String expectedScope3 = ("m, n, " + expectedScope1);
        DFeature _get_1 = detailA.getFeatures().get(2);
        final DExpression q1 = ((DQuery) _get_1).getReturns();
        this.checkExpression3(q1, expectedScope3);
        final String expectedScope4 = ("r, " + expectedScope1);
        DFeature _get_2 = detailA.getFeatures().get(3);
        final DExpression q2 = ((DQuery) _get_2).getReturns();
        this.checkExpression4(q2, expectedScope2, expectedScope4);
      }
      {
        final DExpression c3 = IterableExtensions.<DNamedPredicate>head(detailA.getConstraints()).getPredicate();
        this.checkExpression3(c3, expectedScope1);
        final DExpression c4 = detailA.getConstraints().get(1).getPredicate();
        this.checkExpression4(c4, expectedScope2, expectedScope1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected DmxMemberNavigation checkExpression3(final DExpression e, final String expectedScopeStr) {
    DmxMemberNavigation _xblockexpression = null;
    {
      Assertions.assertTrue((e instanceof DmxBinaryOperation));
      final DExpression left = ((DmxBinaryOperation) e).getLeftOperand();
      Assertions.assertTrue((left instanceof DmxMemberNavigation));
      final DmxMemberNavigation member = ((DmxMemberNavigation) left);
      final Procedure1<DmxMemberNavigation> _function = (DmxMemberNavigation it) -> {
        this.assertScope(it, this.epackage.getDmxMemberNavigation_Member(), expectedScopeStr);
      };
      _xblockexpression = ObjectExtensions.<DmxMemberNavigation>operator_doubleArrow(member, _function);
    }
    return _xblockexpression;
  }
  
  protected DmxMemberNavigation checkExpression4(final DExpression e, final String expectedScopeStr1, final String expectedScopeStr2) {
    DmxMemberNavigation _xblockexpression = null;
    {
      Assertions.assertTrue((e instanceof DmxBinaryOperation));
      final DExpression left = ((DmxBinaryOperation) e).getLeftOperand();
      Assertions.assertTrue((left instanceof DmxMemberNavigation));
      final DmxMemberNavigation member1 = ((DmxMemberNavigation) left);
      final Procedure1<DmxMemberNavigation> _function = (DmxMemberNavigation it) -> {
        this.assertScope(it, this.epackage.getDmxMemberNavigation_Member(), expectedScopeStr1);
      };
      ObjectExtensions.<DmxMemberNavigation>operator_doubleArrow(member1, _function);
      DExpression _precedingNavigationSegment = member1.getPrecedingNavigationSegment();
      Assertions.assertTrue((_precedingNavigationSegment instanceof DmxMemberNavigation));
      DExpression _precedingNavigationSegment_1 = member1.getPrecedingNavigationSegment();
      final DmxMemberNavigation member2 = ((DmxMemberNavigation) _precedingNavigationSegment_1);
      final Procedure1<DmxMemberNavigation> _function_1 = (DmxMemberNavigation it) -> {
        this.assertScope(it, this.epackage.getDmxMemberNavigation_Member(), expectedScopeStr2);
      };
      _xblockexpression = ObjectExtensions.<DmxMemberNavigation>operator_doubleArrow(member2, _function_1);
    }
    return _xblockexpression;
  }
  
  private void assertScope(final EObject context, final EReference reference, final CharSequence expected) {
    final IScope actualScope = this._iScopeProvider.getScope(context, reference);
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getName();
    };
    final String actual = IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(actualScope.getAllElements(), _function), ", ");
    Assertions.assertEquals(expected.toString(), actual);
  }
}
