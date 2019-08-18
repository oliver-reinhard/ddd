package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxRaiseExpression;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperator;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxAggregateDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxBaseTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxEnumerationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxNotificationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxPrimitiveDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxUndefinedDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxVoidDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class DmxTypeComputer {
  @Inject
  @Extension
  private DmxUtil util;
  
  public static final DmxVoidDescriptor VOID = new DmxVoidDescriptor();
  
  public static final DmxUndefinedDescriptor UNDEFINED = new DmxUndefinedDescriptor();
  
  public static final DmxBaseTypeDescriptor BOOLEAN = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, false);
  
  public static final DmxBaseTypeDescriptor BOOLEAN_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, true);
  
  public static final DmxBaseTypeDescriptor NUMBER = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, false);
  
  public static final DmxBaseTypeDescriptor NUMBER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, true);
  
  public static final DmxBaseTypeDescriptor TEXT = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, false);
  
  public static final DmxBaseTypeDescriptor TEXT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, true);
  
  public static final DmxBaseTypeDescriptor IDENTIFIER = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, false);
  
  public static final DmxBaseTypeDescriptor IDENTIFIER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, true);
  
  public static final DmxBaseTypeDescriptor TIMEPOINT = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, false);
  
  public static final DmxBaseTypeDescriptor TIMEPOINT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, true);
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxMemberNavigation expr) {
    final DNavigableMember member = expr.getMember();
    if ((member instanceof DmxFilter)) {
      if ((((DmxFilter)member).getTypeDesc().isCompatible(DmxBaseType.COMPLEX) || ((DmxFilter)member).getTypeDesc().isMultiTyped())) {
        final DExpression preceding = expr.getPrecedingNavigationSegment();
        final AbstractDmxTypeDescriptor<?> precedingType = this.typeFor(preceding);
        return this.getTypeDescriptor(precedingType.type, ((DmxFilter)member).getTypeDesc().isCollection());
      } else {
        return this.getTypeDescriptor(((DmxFilter)member).getTypeDesc().getSingle(), ((DmxFilter)member).getTypeDesc().isCollection());
      }
    } else {
      if ((member instanceof DLiteral)) {
        return this.getTypeDescriptor(((DLiteral)member).eContainer(), ((DLiteral)member).isCollection());
      }
    }
    return this.getTypeDescriptor(member.getType(), member.isCollection());
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DContext)) {
      return this.getTypeDescriptor(((DContext)target).getType(), ((DContext)target).isCollection());
    } else {
      if ((target instanceof DmxCorrelationVariable)) {
        final AbstractDmxTypeDescriptor<?> desc = this.typeFor(target);
        return desc;
      } else {
        if ((target instanceof DAggregate)) {
          return this.getTypeDescriptor(target, false);
        } else {
          if ((target instanceof DNotification)) {
            return this.getTypeDescriptor(target, false);
          } else {
            if ((target instanceof DNavigableMember)) {
              return this.getTypeDescriptor(((DNavigableMember)target).getType(), expr.isAll());
            } else {
              return this.getTypeDescriptor(target, expr.isAll());
            }
          }
        }
      }
    }
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxCorrelationVariable target) {
    EObject container = target.eContainer();
    while ((container != null)) {
      {
        if ((container instanceof DmxMemberNavigation)) {
          DNavigableMember _member = ((DmxMemberNavigation)container).getMember();
          if ((_member instanceof DmxFilter)) {
            final DExpression preceding = ((DmxMemberNavigation)container).getPrecedingNavigationSegment();
            final AbstractDmxTypeDescriptor<?> desc = this.typeFor(preceding);
            desc.collection = false;
            return desc;
          }
        } else {
          if ((container instanceof DType)) {
            return this.getTypeDescriptor(container, false);
          }
        }
        container = container.eContainer();
      }
    }
    return DmxTypeComputer.UNDEFINED;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxStaticReference expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxPredicateWithCorrelationVariable expr) {
    return DmxTypeComputer.BOOLEAN;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxBinaryOperation expr) {
    DmxBaseTypeDescriptor _switchResult = null;
    DmxBinaryOperator _operator = expr.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case OR:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case XOR:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case AND:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case EQUAL:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case NOT_EQUAL:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case LESS:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case LESS_OR_EQUAL:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case GREATER_OR_EQUAL:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case GREATER:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case UNTIL:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case SINGLE_ARROW:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case DOUBLE_ARROW:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case ADD:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case SUBTRACT:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case MULTIPLY:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case DIVIDE:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case POWER:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case MODULO:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        default:
          String _literal = expr.getOperator().getLiteral();
          throw new IllegalArgumentException(_literal);
      }
    } else {
      String _literal = expr.getOperator().getLiteral();
      throw new IllegalArgumentException(_literal);
    }
    return _switchResult;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxUnaryOperation expr) {
    DmxBaseTypeDescriptor _switchResult = null;
    DmxUnaryOperator _operator = expr.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case PLUS:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case MINUS:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case NOT:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        default:
          String _literal = expr.getOperator().getLiteral();
          throw new IllegalArgumentException(_literal);
      }
    } else {
      String _literal = expr.getOperator().getLiteral();
      throw new IllegalArgumentException(_literal);
    }
    return _switchResult;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxCastExpression expr) {
    return this.getTypeDescriptor(expr.getType(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxInstanceOfExpression expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxFunctionCall expr) {
    DmxUndefinedDescriptor _xblockexpression = null;
    {
      final DmxFilter filter = expr.getFunction();
      if ((filter != null)) {
        final DmxFilterTypeDescriptor returnType = filter.getTypeDesc();
        int _size = filter.getParameters().size();
        boolean _equals = (_size == 0);
        if (_equals) {
          return this.getTypeDescriptor(returnType.getSingle(), returnType.isCollection());
        }
        if ((returnType.isCompatible(DmxBaseType.COMPLEX) || returnType.isMultiTyped())) {
          int _size_1 = this.util.nullSafeCallArguments(expr).size();
          boolean _greaterThan = (_size_1 > 0);
          if (_greaterThan) {
            final AbstractDmxTypeDescriptor<?> param0ActualType = this.typeFor(this.util.nullSafeCallArguments(expr).get(0));
            final DmxFilterTypeDescriptor param0DeclaredType = filter.getParameters().get(0).getTypeDesc();
            boolean _isCompatible = param0DeclaredType.isCompatible(param0ActualType.baseType, param0ActualType.collection);
            if (_isCompatible) {
              return param0ActualType;
            }
          }
        } else {
          return this.getTypeDescriptor(returnType.getSingle(), returnType.isCollection());
        }
      }
      _xblockexpression = DmxTypeComputer.UNDEFINED;
    }
    return _xblockexpression;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxRaiseExpression expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxConstructorCall expr) {
    return this.getTypeDescriptor(expr.getConstructor(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxIfExpression expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxBooleanLiteral expr) {
    return DmxTypeComputer.BOOLEAN;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxStringLiteral expr) {
    return DmxTypeComputer.TEXT;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxNaturalLiteral expr) {
    return DmxTypeComputer.NUMBER;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxDecimalLiteral expr) {
    return DmxTypeComputer.NUMBER;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxUndefinedLiteral expr) {
    return DmxTypeComputer.UNDEFINED;
  }
  
  public List<AbstractDmxTypeDescriptor<?>> getTypeDescriptors(final DmxFilterTypeDescriptor desc) {
    final ArrayList<AbstractDmxTypeDescriptor<?>> result = Lists.<AbstractDmxTypeDescriptor<?>>newArrayList();
    boolean _isMultiTyped = desc.isMultiTyped();
    if (_isMultiTyped) {
      EList<DmxBaseType> _members = desc.getMultiple().getMembers();
      for (final DmxBaseType d : _members) {
        result.add(this.getBaseTypeDescriptor(d, desc.isCollection()));
      }
    } else {
      result.add(this.getBaseTypeDescriptor(desc.getSingle(), desc.isCollection()));
    }
    return result;
  }
  
  public AbstractDmxTypeDescriptor<?> getTypeDescriptor(final Object obj, final boolean collection) {
    AbstractDmxTypeDescriptor<?> _switchResult = null;
    boolean _matched = false;
    if (obj instanceof DmxBaseType) {
      _matched=true;
      _switchResult = this.getBaseTypeDescriptor(((DmxBaseType)obj), collection);
    }
    if (!_matched) {
      if (obj instanceof DmxArchetype) {
        _matched=true;
        _switchResult = new DmxPrimitiveDescriptor(((DmxArchetype)obj), collection);
      }
    }
    if (!_matched) {
      if (obj instanceof DPrimitive) {
        _matched=true;
        _switchResult = new DmxPrimitiveDescriptor(((DPrimitive)obj), collection);
      }
    }
    if (!_matched) {
      if (obj instanceof DEnumeration) {
        _matched=true;
        _switchResult = new DmxEnumerationDescriptor(((DEnumeration)obj));
      }
    }
    if (!_matched) {
      if (obj instanceof DComplexType) {
        _matched=true;
        _switchResult = new DmxComplexTypeDescriptor(((DComplexType)obj), collection, this.util);
      }
    }
    if (!_matched) {
      if (obj instanceof DAggregate) {
        _matched=true;
        _switchResult = new DmxAggregateDescriptor(((DAggregate)obj));
      }
    }
    if (!_matched) {
      if (obj instanceof DNotification) {
        _matched=true;
        _switchResult = new DmxNotificationDescriptor(((DNotification)obj));
      }
    }
    if (!_matched) {
      _switchResult = DmxTypeComputer.UNDEFINED;
    }
    return _switchResult;
  }
  
  private AbstractDmxTypeDescriptor<?> getBaseTypeDescriptor(final DmxBaseType t, final boolean collection) {
    AbstractDmxTypeDescriptor<? extends DType> _switchResult = null;
    if (t != null) {
      switch (t) {
        case VOID:
          _switchResult = DmxTypeComputer.VOID;
          break;
        case BOOLEAN:
          DmxBaseTypeDescriptor _xifexpression = null;
          if (collection) {
            _xifexpression = DmxTypeComputer.BOOLEAN_COLLECTION;
          } else {
            _xifexpression = DmxTypeComputer.BOOLEAN;
          }
          _switchResult = _xifexpression;
          break;
        case NUMBER:
          DmxBaseTypeDescriptor _xifexpression_1 = null;
          if (collection) {
            _xifexpression_1 = DmxTypeComputer.NUMBER_COLLECTION;
          } else {
            _xifexpression_1 = DmxTypeComputer.NUMBER;
          }
          _switchResult = _xifexpression_1;
          break;
        case TEXT:
          DmxBaseTypeDescriptor _xifexpression_2 = null;
          if (collection) {
            _xifexpression_2 = DmxTypeComputer.TEXT_COLLECTION;
          } else {
            _xifexpression_2 = DmxTypeComputer.TEXT;
          }
          _switchResult = _xifexpression_2;
          break;
        case IDENTIFIER:
          DmxBaseTypeDescriptor _xifexpression_3 = null;
          if (collection) {
            _xifexpression_3 = DmxTypeComputer.IDENTIFIER_COLLECTION;
          } else {
            _xifexpression_3 = DmxTypeComputer.IDENTIFIER;
          }
          _switchResult = _xifexpression_3;
          break;
        case TIMEPOINT:
          DmxBaseTypeDescriptor _xifexpression_4 = null;
          if (collection) {
            _xifexpression_4 = DmxTypeComputer.TIMEPOINT_COLLECTION;
          } else {
            _xifexpression_4 = DmxTypeComputer.TIMEPOINT;
          }
          _switchResult = _xifexpression_4;
          break;
        default:
          String _string = t.toString();
          throw new IllegalArgumentException(_string);
      }
    } else {
      String _string = t.toString();
      throw new IllegalArgumentException(_string);
    }
    return _switchResult;
  }
  
  public AbstractDmxTypeDescriptor<?> typeFor(final EObject expr) {
    if (expr instanceof DmxBinaryOperation) {
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
    } else if (expr instanceof DmxMemberNavigation) {
      return _typeFor((DmxMemberNavigation)expr);
    } else if (expr instanceof DmxNaturalLiteral) {
      return _typeFor((DmxNaturalLiteral)expr);
    } else if (expr instanceof DmxPredicateWithCorrelationVariable) {
      return _typeFor((DmxPredicateWithCorrelationVariable)expr);
    } else if (expr instanceof DmxRaiseExpression) {
      return _typeFor((DmxRaiseExpression)expr);
    } else if (expr instanceof DmxStaticReference) {
      return _typeFor((DmxStaticReference)expr);
    } else if (expr instanceof DmxStringLiteral) {
      return _typeFor((DmxStringLiteral)expr);
    } else if (expr instanceof DmxUnaryOperation) {
      return _typeFor((DmxUnaryOperation)expr);
    } else if (expr instanceof DmxUndefinedLiteral) {
      return _typeFor((DmxUndefinedLiteral)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
