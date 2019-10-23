package com.mimacom.ddd.dm.dom.typecomputer;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import com.mimacom.ddd.dm.dom.DomDetail;
import com.mimacom.ddd.dm.dom.DomField;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class DomTypeComputer extends DmxTypeComputer {
  @Inject
  @Extension
  private DmxTypeDescriptorProvider _dmxTypeDescriptorProvider;
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DomDetail expr) {
    DComplexType _ref = expr.getRef();
    boolean _tripleEquals = (_ref == null);
    if (_tripleEquals) {
      return DmxTypeDescriptorProvider.UNDEFINED;
    }
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getRef(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DomField expr) {
    if (((expr.getRef() == null) || (expr.getRef().getType() == null))) {
      return DmxTypeDescriptorProvider.UNDEFINED;
    }
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getRef().getType(), expr.getRef().isCollection());
  }
  
  @Override
  public AbstractDmxTypeDescriptor<?> typeForSwitch(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DomNamedComplexObject)) {
      return this.typeFor(((DomNamedComplexObject)target).getObject());
    }
    return super.typeForSwitch(expr);
  }
  
  public AbstractDmxTypeDescriptor<?> typeFor(final EObject expr) {
    if (expr instanceof DomDetail) {
      return _typeFor((DomDetail)expr);
    } else if (expr instanceof DmxAssignment) {
      return _typeFor((DmxAssignment)expr);
    } else if (expr instanceof DmxBinaryOperation) {
      return _typeFor((DmxBinaryOperation)expr);
    } else if (expr instanceof DmxBooleanLiteral) {
      return _typeFor((DmxBooleanLiteral)expr);
    } else if (expr instanceof DmxCastExpression) {
      return _typeFor((DmxCastExpression)expr);
    } else if (expr instanceof DmxConstructorCall) {
      return _typeFor((DmxConstructorCall)expr);
    } else if (expr instanceof DmxContextReference) {
      return _typeFor((DmxContextReference)expr);
    } else if (expr instanceof DmxCorrelationVariable) {
      return _typeFor((DmxCorrelationVariable)expr);
    } else if (expr instanceof DmxDecimalLiteral) {
      return _typeFor((DmxDecimalLiteral)expr);
    } else if (expr instanceof DmxFunctionCall) {
      return _typeFor((DmxFunctionCall)expr);
    } else if (expr instanceof DmxIfExpression) {
      return _typeFor((DmxIfExpression)expr);
    } else if (expr instanceof DmxInstanceOfExpression) {
      return _typeFor((DmxInstanceOfExpression)expr);
    } else if (expr instanceof DmxListExpression) {
      return _typeFor((DmxListExpression)expr);
    } else if (expr instanceof DmxMemberNavigation) {
      return _typeFor((DmxMemberNavigation)expr);
    } else if (expr instanceof DmxNaturalLiteral) {
      return _typeFor((DmxNaturalLiteral)expr);
    } else if (expr instanceof DmxPredicateWithCorrelationVariable) {
      return _typeFor((DmxPredicateWithCorrelationVariable)expr);
    } else if (expr instanceof DmxStaticReference) {
      return _typeFor((DmxStaticReference)expr);
    } else if (expr instanceof DmxStringLiteral) {
      return _typeFor((DmxStringLiteral)expr);
    } else if (expr instanceof DmxUnaryOperation) {
      return _typeFor((DmxUnaryOperation)expr);
    } else if (expr instanceof DmxUndefinedLiteral) {
      return _typeFor((DmxUndefinedLiteral)expr);
    } else if (expr instanceof DomField) {
      return _typeFor((DomField)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
