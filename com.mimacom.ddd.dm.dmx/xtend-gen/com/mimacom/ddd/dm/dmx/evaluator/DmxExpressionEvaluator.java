package com.mimacom.ddd.dm.dmx.evaluator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxDateLiteral;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperator;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
  
  public static final String UNDEFINED_VALUE = "UNDEFINED";
  
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
    return _switchResult;
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
      final Object value = ((Object)_switchResult);
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
        final Object value_1 = ((Object)_switchResult_1);
        return value_1;
      } else {
        if (((leftValue instanceof String) && (rightValue instanceof String))) {
          final String left_2 = ((String) leftValue);
          final String right_2 = ((String) rightValue);
          String _switchResult_2 = null;
          DmxBinaryOperator _operator_2 = expr.getOperator();
          if (_operator_2 != null) {
            switch (_operator_2) {
              case ADD:
                _switchResult_2 = (left_2 + right_2);
                break;
              default:
                String _literal_2 = expr.getOperator().getLiteral();
                throw new IllegalArgumentException(_literal_2);
            }
          } else {
            String _literal_2 = expr.getOperator().getLiteral();
            throw new IllegalArgumentException(_literal_2);
          }
          final String value_2 = _switchResult_2;
          return value_2;
        } else {
          if (((leftValue instanceof DState) && (rightValue instanceof DState))) {
            final DState left_3 = ((DState) leftValue);
            final DState right_3 = ((DState) rightValue);
            boolean _switchResult_3 = false;
            DmxBinaryOperator _operator_3 = expr.getOperator();
            if (_operator_3 != null) {
              switch (_operator_3) {
                case EQUAL:
                  _switchResult_3 = Objects.equal(left_3, right_3);
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
              if (((!(leftValue instanceof List<?>)) && (rightValue instanceof List<?>))) {
                final List<?> right_5 = ((List<?>) rightValue);
                DmxBinaryOperator _operator_5 = expr.getOperator();
                if (_operator_5 != null) {
                  switch (_operator_5) {
                    case IN:
                      for (final Object i : right_5) {
                        boolean _equals = Objects.equal(i, leftValue);
                        if (_equals) {
                          return Boolean.valueOf(true);
                        }
                      }
                      return Boolean.valueOf(false);
                    default:
                      String _literal_5 = expr.getOperator().getLiteral();
                      throw new IllegalArgumentException(_literal_5);
                  }
                } else {
                  String _literal_5 = expr.getOperator().getLiteral();
                  throw new IllegalArgumentException(_literal_5);
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
  
  private Object valueForAndCheckNotNull(final DExpression expr) {
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
    } else if (expr instanceof DmxInstanceOfExpression) {
      return _valueFor((DmxInstanceOfExpression)expr);
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
