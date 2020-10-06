package com.mimacom.ddd.dm.dmx.evaluator;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DState;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDateLiteral;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxTestContext;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperator;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.evaluator.DmxUndefinedValue;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class DmxExpressionEvaluator {
  @Inject
  @Extension
  private DmxTypeDescriptorProvider _dmxTypeDescriptorProvider;
  
  @Inject
  @Extension
  private DmxTypeComputer _dmxTypeComputer;
  
  @Inject
  @Extension
  private DmxUtil util;
  
  public static final DmxUndefinedValue UNDEFINED_VALUE = new DmxUndefinedValue();
  
  protected Object _valueFor(final DmxMemberNavigation expr) {
    final DExpression preceding = expr.getPrecedingNavigationSegment();
    final Object precedingValue = this.valueFor(preceding);
    final DNavigableMember member = expr.getMember();
    if ((member instanceof DmxFilter)) {
    } else {
      if (((member instanceof DAttribute) && (precedingValue instanceof DmxComplexObject))) {
        final DmxField f = this.util.field(((DmxComplexObject) precedingValue), ((DAttribute) member));
        DExpression _value = null;
        if (f!=null) {
          _value=f.getValue();
        }
        boolean _tripleNotEquals = (_value != null);
        if (_tripleNotEquals) {
          return this.valueFor(f.getValue());
        }
      } else {
        if (((member instanceof DAssociation) && (precedingValue instanceof DmxComplexObject))) {
          final DmxField f_1 = this.util.field(((DmxComplexObject) precedingValue), ((DAssociation) member));
          DExpression _value_1 = null;
          if (f_1!=null) {
            _value_1=f_1.getValue();
          }
          boolean _tripleNotEquals_1 = (_value_1 != null);
          if (_tripleNotEquals_1) {
            return this.valueFor(f_1.getValue());
          }
        } else {
          if (((member instanceof DQuery) && (precedingValue instanceof DmxComplexObject))) {
            return member;
          } else {
            if ((member instanceof DLiteral)) {
              return member;
            } else {
              if ((member instanceof DState)) {
                return member;
              }
            }
          }
        }
      }
    }
    return DmxExpressionEvaluator.UNDEFINED_VALUE;
  }
  
  protected Object _valueFor(final DmxContextReference expr) {
    return this.valueForContextReferenceSwitch(expr);
  }
  
  /**
   * Non-dispatching; use to override
   */
  public Object valueForContextReferenceSwitch(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DmxCorrelationVariable)) {
      return DmxExpressionEvaluator.UNDEFINED_VALUE;
    } else {
      if ((target instanceof DmxTestContext)) {
        DExpression _value = ((DmxTestContext)target).getValue();
        boolean _tripleNotEquals = (_value != null);
        if (_tripleNotEquals) {
          return this.valueFor(((DmxTestContext)target).getValue());
        }
      }
    }
    return DmxExpressionEvaluator.UNDEFINED_VALUE;
  }
  
  protected Object _valueFor(final DExpression e) {
    Object _switchResult = null;
    boolean _matched = false;
    if (e instanceof DmxBooleanLiteral) {
      _matched=true;
      _switchResult = Boolean.valueOf(((DmxBooleanLiteral)e).isValue());
    }
    if (!_matched) {
      if (e instanceof DmxStringLiteral) {
        _matched=true;
        _switchResult = ((DmxStringLiteral)e).getValue();
      }
    }
    if (!_matched) {
      if (e instanceof DmxNaturalLiteral) {
        _matched=true;
        int _value = ((DmxNaturalLiteral)e).getValue();
        _switchResult = new BigDecimal(_value);
      }
    }
    if (!_matched) {
      if (e instanceof DmxDecimalLiteral) {
        _matched=true;
        String _value = ((DmxDecimalLiteral)e).getValue();
        _switchResult = new BigDecimal(_value);
      }
    }
    if (!_matched) {
      if (e instanceof DmxDateLiteral) {
        _matched=true;
        _switchResult = ((DmxDateLiteral)e).getValue();
      }
    }
    if (!_matched) {
      if (e instanceof DmxUndefinedLiteral) {
        _matched=true;
        _switchResult = DmxExpressionEvaluator.UNDEFINED_VALUE;
      }
    }
    if (!_matched) {
      if (e instanceof DmxComplexObject) {
        _matched=true;
        _switchResult = e;
      }
    }
    if (!_matched) {
      _switchResult = DmxExpressionEvaluator.UNDEFINED_VALUE;
    }
    return _switchResult;
  }
  
  protected Object _valueFor(final DmxListExpression e) {
    final ArrayList<Object> list = Lists.<Object>newArrayList();
    EList<DExpression> _elements = e.getElements();
    for (final DExpression elem : _elements) {
      {
        final Object value = this.valueFor(elem);
        list.add(value);
      }
    }
    return list;
  }
  
  protected Object _valueFor(final DmxBinaryOperation expr) {
    final Object leftValue = this.valueForAndCheckNotNull(expr.getLeftOperand());
    final Object rightValue = this.valueForAndCheckNotNull(expr.getRightOperand());
    if (((leftValue instanceof Boolean) && (rightValue instanceof Boolean))) {
      final Boolean left = ((Boolean) leftValue);
      final Boolean right = ((Boolean) rightValue);
      Object _switchResult = null;
      DmxBinaryOperator _operator = expr.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case OR:
            _switchResult = Boolean.valueOf(((left).booleanValue() || (right).booleanValue()));
            break;
          case XOR:
            _switchResult = Boolean.valueOf((((left).booleanValue() && (!(right).booleanValue())) || ((!(left).booleanValue()) && (right).booleanValue())));
            break;
          case AND:
            _switchResult = Boolean.valueOf(((left).booleanValue() && (right).booleanValue()));
            break;
          case EQUAL:
            _switchResult = Boolean.valueOf(Objects.equal(left, right));
            break;
          case NOT_EQUAL:
            _switchResult = Boolean.valueOf((!Objects.equal(left, right)));
            break;
          case LESS:
            _switchResult = Boolean.valueOf((left.compareTo(right) < 0));
            break;
          case LESS_OR_EQUAL:
            _switchResult = Boolean.valueOf((left.compareTo(right) <= 0));
            break;
          case GREATER_OR_EQUAL:
            _switchResult = Boolean.valueOf((left.compareTo(right) >= 0));
            break;
          case GREATER:
            _switchResult = Boolean.valueOf((left.compareTo(right) > 0));
            break;
          case DOUBLE_ARROW:
            _switchResult = Boolean.valueOf(((!(left).booleanValue()) || (right).booleanValue()));
            break;
          case IN:
            _switchResult = DmxExpressionEvaluator.UNDEFINED_VALUE;
            break;
          default:
            String _literal = expr.getOperator().getLiteral();
            throw new IllegalArgumentException(_literal);
        }
      } else {
        String _literal = expr.getOperator().getLiteral();
        throw new IllegalArgumentException(_literal);
      }
      final Object value = _switchResult;
      return value;
    } else {
      if (((leftValue instanceof BigDecimal) && (rightValue instanceof BigDecimal))) {
        final BigDecimal left_1 = ((BigDecimal) leftValue);
        final BigDecimal right_1 = ((BigDecimal) rightValue);
        Object _switchResult_1 = null;
        DmxBinaryOperator _operator_1 = expr.getOperator();
        if (_operator_1 != null) {
          switch (_operator_1) {
            case ADD:
              _switchResult_1 = left_1.add(right_1);
              break;
            case SUBTRACT:
              _switchResult_1 = left_1.subtract(right_1);
              break;
            case MULTIPLY:
              _switchResult_1 = left_1.multiply(right_1);
              break;
            case DIVIDE:
              _switchResult_1 = left_1.divide(right_1, MathContext.DECIMAL128);
              break;
            case POWER:
              _switchResult_1 = left_1.pow(right_1.intValue());
              break;
            case MODULO:
              _switchResult_1 = left_1.remainder(right_1);
              break;
            case EQUAL:
              _switchResult_1 = Boolean.valueOf(Objects.equal(left_1, right_1));
              break;
            case NOT_EQUAL:
              _switchResult_1 = Boolean.valueOf((!Objects.equal(left_1, right_1)));
              break;
            case LESS:
              _switchResult_1 = Boolean.valueOf((left_1.compareTo(right_1) < 0));
              break;
            case LESS_OR_EQUAL:
              _switchResult_1 = Boolean.valueOf((left_1.compareTo(right_1) <= 0));
              break;
            case GREATER_OR_EQUAL:
              _switchResult_1 = Boolean.valueOf((left_1.compareTo(right_1) >= 0));
              break;
            case GREATER:
              _switchResult_1 = Boolean.valueOf((left_1.compareTo(right_1) > 0));
              break;
            case UNTIL:
              _switchResult_1 = DmxExpressionEvaluator.UNDEFINED_VALUE;
              break;
            case SINGLE_ARROW:
              _switchResult_1 = DmxExpressionEvaluator.UNDEFINED_VALUE;
              break;
            default:
              String _literal_1 = expr.getOperator().getLiteral();
              throw new IllegalArgumentException(_literal_1);
          }
        } else {
          String _literal_1 = expr.getOperator().getLiteral();
          throw new IllegalArgumentException(_literal_1);
        }
        final Object value_1 = _switchResult_1;
        return value_1;
      } else {
        if (((leftValue instanceof String) && (rightValue instanceof String))) {
          final String left_2 = ((String) leftValue);
          final String right_2 = ((String) rightValue);
          Object _switchResult_2 = null;
          DmxBinaryOperator _operator_2 = expr.getOperator();
          if (_operator_2 != null) {
            switch (_operator_2) {
              case ADD:
                _switchResult_2 = (left_2 + right_2);
                break;
              case EQUAL:
                _switchResult_2 = Boolean.valueOf(Objects.equal(left_2, right_2));
                break;
              case NOT_EQUAL:
                _switchResult_2 = Boolean.valueOf((!Objects.equal(left_2, right_2)));
                break;
              case LESS:
                _switchResult_2 = Boolean.valueOf((left_2.compareTo(right_2) < 0));
                break;
              case LESS_OR_EQUAL:
                _switchResult_2 = Boolean.valueOf((left_2.compareTo(right_2) <= 0));
                break;
              case GREATER_OR_EQUAL:
                _switchResult_2 = Boolean.valueOf((left_2.compareTo(right_2) >= 0));
                break;
              case GREATER:
                _switchResult_2 = Boolean.valueOf((left_2.compareTo(right_2) > 0));
                break;
              default:
                String _literal_2 = expr.getOperator().getLiteral();
                throw new IllegalArgumentException(_literal_2);
            }
          } else {
            String _literal_2 = expr.getOperator().getLiteral();
            throw new IllegalArgumentException(_literal_2);
          }
          final Object value_2 = ((Object)_switchResult_2);
          return value_2;
        } else {
          if (((leftValue instanceof Date) && (rightValue instanceof Date))) {
            final Date left_3 = ((Date) leftValue);
            final Date right_3 = ((Date) rightValue);
            boolean _switchResult_3 = false;
            DmxBinaryOperator _operator_3 = expr.getOperator();
            if (_operator_3 != null) {
              switch (_operator_3) {
                case EQUAL:
                  _switchResult_3 = Objects.equal(left_3, right_3);
                  break;
                case NOT_EQUAL:
                  _switchResult_3 = (!Objects.equal(left_3, right_3));
                  break;
                case LESS:
                  _switchResult_3 = (left_3.compareTo(right_3) < 0);
                  break;
                case LESS_OR_EQUAL:
                  _switchResult_3 = (left_3.compareTo(right_3) <= 0);
                  break;
                case GREATER_OR_EQUAL:
                  _switchResult_3 = (left_3.compareTo(right_3) >= 0);
                  break;
                case GREATER:
                  _switchResult_3 = (left_3.compareTo(right_3) > 0);
                  break;
                default:
                  String _literal_3 = expr.getOperator().getLiteral();
                  throw new IllegalArgumentException(_literal_3);
              }
            } else {
              String _literal_3 = expr.getOperator().getLiteral();
              throw new IllegalArgumentException(_literal_3);
            }
            final boolean value_3 = _switchResult_3;
            return Boolean.valueOf(value_3);
          } else {
            if (((leftValue instanceof Date) && (rightValue instanceof BigDecimal))) {
              final Date left_4 = ((Date) leftValue);
              final BigDecimal right_4 = ((BigDecimal) rightValue);
              Date _switchResult_4 = null;
              DmxBinaryOperator _operator_4 = expr.getOperator();
              if (_operator_4 != null) {
                switch (_operator_4) {
                  case ADD:
                    long _time = left_4.getTime();
                    int _intValue = right_4.intValue();
                    long _plus = (_time + _intValue);
                    _switchResult_4 = new Date(_plus);
                    break;
                  case SUBTRACT:
                    long _time_1 = left_4.getTime();
                    int _intValue_1 = right_4.intValue();
                    long _plus_1 = (_time_1 + _intValue_1);
                    _switchResult_4 = new Date(_plus_1);
                    break;
                  default:
                    String _literal_4 = expr.getOperator().getLiteral();
                    throw new IllegalArgumentException(_literal_4);
                }
              } else {
                String _literal_4 = expr.getOperator().getLiteral();
                throw new IllegalArgumentException(_literal_4);
              }
              final Date value_4 = _switchResult_4;
              return value_4;
            } else {
              if (((leftValue instanceof DState) && (rightValue instanceof DState))) {
                final DState left_5 = ((DState) leftValue);
                final DState right_5 = ((DState) rightValue);
                boolean _switchResult_5 = false;
                DmxBinaryOperator _operator_5 = expr.getOperator();
                if (_operator_5 != null) {
                  switch (_operator_5) {
                    case EQUAL:
                      _switchResult_5 = Objects.equal(left_5, right_5);
                      break;
                    case NOT_EQUAL:
                      _switchResult_5 = (!Objects.equal(left_5, right_5));
                      break;
                    default:
                      String _literal_5 = expr.getOperator().getLiteral();
                      throw new IllegalArgumentException(_literal_5);
                  }
                } else {
                  String _literal_5 = expr.getOperator().getLiteral();
                  throw new IllegalArgumentException(_literal_5);
                }
                final boolean value_5 = _switchResult_5;
                return Boolean.valueOf(value_5);
              } else {
                if (((leftValue instanceof DLiteral) && (rightValue instanceof DLiteral))) {
                  final DLiteral left_6 = ((DLiteral) leftValue);
                  final DLiteral right_6 = ((DLiteral) rightValue);
                  boolean _switchResult_6 = false;
                  DmxBinaryOperator _operator_6 = expr.getOperator();
                  if (_operator_6 != null) {
                    switch (_operator_6) {
                      case EQUAL:
                        _switchResult_6 = Objects.equal(left_6, right_6);
                        break;
                      case NOT_EQUAL:
                        _switchResult_6 = (!Objects.equal(left_6, right_6));
                        break;
                      default:
                        String _literal_6 = expr.getOperator().getLiteral();
                        throw new IllegalArgumentException(_literal_6);
                    }
                  } else {
                    String _literal_6 = expr.getOperator().getLiteral();
                    throw new IllegalArgumentException(_literal_6);
                  }
                  final boolean value_6 = _switchResult_6;
                  return Boolean.valueOf(value_6);
                } else {
                  if (((leftValue instanceof List<?>) && (rightValue instanceof List<?>))) {
                    final List<?> left_7 = ((List<?>) leftValue);
                    final List<?> right_7 = ((List<?>) rightValue);
                    boolean _switchResult_7 = false;
                    DmxBinaryOperator _operator_7 = expr.getOperator();
                    if (_operator_7 != null) {
                      switch (_operator_7) {
                        case EQUAL:
                          _switchResult_7 = Objects.equal(left_7, right_7);
                          break;
                        case NOT_EQUAL:
                          _switchResult_7 = (!Objects.equal(left_7, right_7));
                          break;
                        default:
                          String _literal_7 = expr.getOperator().getLiteral();
                          throw new IllegalArgumentException(_literal_7);
                      }
                    } else {
                      String _literal_7 = expr.getOperator().getLiteral();
                      throw new IllegalArgumentException(_literal_7);
                    }
                    final boolean value_7 = _switchResult_7;
                    return Boolean.valueOf(value_7);
                  } else {
                    if (((!(leftValue instanceof List<?>)) && (rightValue instanceof List<?>))) {
                      final List<?> right_8 = ((List<?>) rightValue);
                      DmxBinaryOperator _operator_8 = expr.getOperator();
                      if (_operator_8 != null) {
                        switch (_operator_8) {
                          case IN:
                            for (final Object i : right_8) {
                              boolean _equals = Objects.equal(i, leftValue);
                              if (_equals) {
                                return Boolean.valueOf(true);
                              }
                            }
                            return Boolean.valueOf(false);
                          default:
                            String _literal_8 = expr.getOperator().getLiteral();
                            throw new IllegalArgumentException(_literal_8);
                        }
                      } else {
                        String _literal_8 = expr.getOperator().getLiteral();
                        throw new IllegalArgumentException(_literal_8);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return DmxExpressionEvaluator.UNDEFINED_VALUE;
  }
  
  protected Object _valueFor(final DmxUnaryOperation expr) {
    Object _xblockexpression = null;
    {
      final Object operandValue = this.valueForAndCheckNotNull(expr.getOperand());
      Object _switchResult = null;
      DmxUnaryOperator _operator = expr.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case PLUS:
            _switchResult = operandValue;
            break;
          case MINUS:
            Object _xifexpression = null;
            if ((operandValue instanceof BigDecimal)) {
              _xifexpression = ((BigDecimal) operandValue).negate();
            } else {
              _xifexpression = DmxExpressionEvaluator.UNDEFINED_VALUE;
            }
            _switchResult = _xifexpression;
            break;
          case NOT:
            Object _xifexpression_1 = null;
            if ((operandValue instanceof Boolean)) {
              _xifexpression_1 = Boolean.valueOf((!(((Boolean) operandValue)).booleanValue()));
            } else {
              _xifexpression_1 = DmxExpressionEvaluator.UNDEFINED_VALUE;
            }
            _switchResult = _xifexpression_1;
            break;
          default:
            String _literal = expr.getOperator().getLiteral();
            throw new IllegalArgumentException(_literal);
        }
      } else {
        String _literal = expr.getOperator().getLiteral();
        throw new IllegalArgumentException(_literal);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected Object _valueFor(final DmxCastExpression expr) {
    final AbstractDmxTypeDescriptor<?> exprTypeDesc = this._dmxTypeComputer.typeForAndCheckNotNull(expr.getTarget());
    final AbstractDmxTypeDescriptor<?> castToTypeDesc = this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getType(), false);
    boolean _isCompatibleWith = exprTypeDesc.isCompatibleWith(castToTypeDesc);
    if (_isCompatibleWith) {
      return this.valueForAndCheckNotNull(expr.getTarget());
    }
    return DmxExpressionEvaluator.UNDEFINED_VALUE;
  }
  
  protected Object _valueFor(final DmxInstanceOfExpression expr) {
    final AbstractDmxTypeDescriptor<?> exprTypeDesc = this._dmxTypeComputer.typeForAndCheckNotNull(expr.getExpression());
    final AbstractDmxTypeDescriptor<?> otherTypeDesc = this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getType(), false);
    return Boolean.valueOf(exprTypeDesc.isCompatibleWith(otherTypeDesc));
  }
  
  protected Object valueForAndCheckNotNull(final DExpression expr) {
    Object _valueFor = null;
    if (expr!=null) {
      _valueFor=this.valueFor(expr);
    }
    final Object value = _valueFor;
    if ((value == null)) {
      return DmxExpressionEvaluator.UNDEFINED_VALUE;
    }
    return value;
  }
  
  public Object valueFor(final DExpression expr) {
    if (expr instanceof DmxBinaryOperation) {
      return _valueFor((DmxBinaryOperation)expr);
    } else if (expr instanceof DmxCastExpression) {
      return _valueFor((DmxCastExpression)expr);
    } else if (expr instanceof DmxContextReference) {
      return _valueFor((DmxContextReference)expr);
    } else if (expr instanceof DmxInstanceOfExpression) {
      return _valueFor((DmxInstanceOfExpression)expr);
    } else if (expr instanceof DmxListExpression) {
      return _valueFor((DmxListExpression)expr);
    } else if (expr instanceof DmxMemberNavigation) {
      return _valueFor((DmxMemberNavigation)expr);
    } else if (expr instanceof DmxUnaryOperation) {
      return _valueFor((DmxUnaryOperation)expr);
    } else if (expr != null) {
      return _valueFor(expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
