/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.tests;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.dim.tests.DimInjectorProvider;
import com.mimacom.ddd.dm.dmx.DBinaryOperation;
import com.mimacom.ddd.dm.dmx.DContextReference;
import com.mimacom.ddd.dm.dmx.DSelfExpression;
import com.mimacom.ddd.dm.dmx.DTypedMemberReference;
import com.mimacom.ddd.dm.dmx.DmxPackage;
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
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DimInjectorProvider.class)
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
      Assert.assertNotNull(domain);
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
        final DExpression c1 = IterableExtensions.<DCondition>head(detailA.getConstraints()).getCondition();
        this.checkExpression1(c1, expectedScope1);
        final DExpression c2 = detailA.getConstraints().get(1).getCondition();
        this.checkExpression2(c2, expectedScope2, expectedScope1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected DContextReference checkExpression1(final DExpression e, final String expectedScopeStr) {
    DContextReference _xblockexpression = null;
    {
      Assert.assertTrue((e instanceof DBinaryOperation));
      final DExpression left = ((DBinaryOperation) e).getLeftOperand();
      Assert.assertTrue((left instanceof DContextReference));
      final DContextReference ref = ((DContextReference) left);
      final Procedure1<DContextReference> _function = (DContextReference it) -> {
        this.assertScope(it, this.epackage.getDContextReference_Target(), expectedScopeStr);
      };
      _xblockexpression = ObjectExtensions.<DContextReference>operator_doubleArrow(ref, _function);
    }
    return _xblockexpression;
  }
  
  protected DContextReference checkExpression2(final DExpression e, final String expectedScopeStr1, final String expectedScopeStr2) {
    DContextReference _xblockexpression = null;
    {
      Assert.assertTrue((e instanceof DBinaryOperation));
      final DExpression left = ((DBinaryOperation) e).getLeftOperand();
      Assert.assertTrue((left instanceof DTypedMemberReference));
      final DTypedMemberReference member = ((DTypedMemberReference) left);
      final Procedure1<DTypedMemberReference> _function = (DTypedMemberReference it) -> {
        this.assertScope(it, this.epackage.getDTypedMemberReference_Member(), expectedScopeStr1);
      };
      ObjectExtensions.<DTypedMemberReference>operator_doubleArrow(member, _function);
      DExpression _memberContainerReference = member.getMemberContainerReference();
      Assert.assertTrue((_memberContainerReference instanceof DContextReference));
      DExpression _memberContainerReference_1 = member.getMemberContainerReference();
      final DContextReference ref = ((DContextReference) _memberContainerReference_1);
      final Procedure1<DContextReference> _function_1 = (DContextReference it) -> {
        this.assertScope(it, this.epackage.getDContextReference_Target(), expectedScopeStr2);
      };
      _xblockexpression = ObjectExtensions.<DContextReference>operator_doubleArrow(ref, _function_1);
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
      Assert.assertNotNull(domain);
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
        final DExpression c3 = IterableExtensions.<DCondition>head(detailA.getConstraints()).getCondition();
        this.checkExpression3(c3, expectedScope1);
        final DExpression c4 = detailA.getConstraints().get(1).getCondition();
        this.checkExpression4(c4, expectedScope2, expectedScope1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected void checkExpression3(final DExpression e, final String expectedScopeStr) {
    Assert.assertTrue((e instanceof DBinaryOperation));
    final DExpression left = ((DBinaryOperation) e).getLeftOperand();
    Assert.assertTrue((left instanceof DTypedMemberReference));
    final DTypedMemberReference member = ((DTypedMemberReference) left);
    final Procedure1<DTypedMemberReference> _function = (DTypedMemberReference it) -> {
      this.assertScope(it, this.epackage.getDTypedMemberReference_Member(), expectedScopeStr);
    };
    ObjectExtensions.<DTypedMemberReference>operator_doubleArrow(member, _function);
    DExpression _memberContainerReference = member.getMemberContainerReference();
    Assert.assertTrue((_memberContainerReference instanceof DSelfExpression));
  }
  
  protected void checkExpression4(final DExpression e, final String expectedScopeStr1, final String expectedScopeStr2) {
    Assert.assertTrue((e instanceof DBinaryOperation));
    final DExpression left = ((DBinaryOperation) e).getLeftOperand();
    Assert.assertTrue((left instanceof DTypedMemberReference));
    final DTypedMemberReference member1 = ((DTypedMemberReference) left);
    final Procedure1<DTypedMemberReference> _function = (DTypedMemberReference it) -> {
      this.assertScope(it, this.epackage.getDTypedMemberReference_Member(), expectedScopeStr1);
    };
    ObjectExtensions.<DTypedMemberReference>operator_doubleArrow(member1, _function);
    DExpression _memberContainerReference = member1.getMemberContainerReference();
    Assert.assertTrue((_memberContainerReference instanceof DTypedMemberReference));
    DExpression _memberContainerReference_1 = member1.getMemberContainerReference();
    final DTypedMemberReference member2 = ((DTypedMemberReference) _memberContainerReference_1);
    final Procedure1<DTypedMemberReference> _function_1 = (DTypedMemberReference it) -> {
      this.assertScope(it, this.epackage.getDTypedMemberReference_Member(), expectedScopeStr2);
    };
    ObjectExtensions.<DTypedMemberReference>operator_doubleArrow(member2, _function_1);
    DExpression _memberContainerReference_2 = member2.getMemberContainerReference();
    Assert.assertTrue((_memberContainerReference_2 instanceof DSelfExpression));
  }
  
  private void assertScope(final EObject context, final EReference reference, final CharSequence expected) {
    final IScope actualScope = this._iScopeProvider.getScope(context, reference);
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getName();
    };
    final String actual = IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(actualScope.getAllElements(), _function), ", ");
    Assert.assertEquals(expected.toString(), actual);
  }
}
