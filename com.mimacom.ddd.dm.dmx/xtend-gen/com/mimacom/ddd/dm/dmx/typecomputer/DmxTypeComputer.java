package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
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
import com.mimacom.ddd.dm.dmx.DmxUnaryOperator;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxBaseTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxUndefinedDescriptor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class DmxTypeComputer {
  @Inject
  @Extension
  private DmxUtil util;
  
  @Inject
  @Extension
  private DmxTypeDescriptorProvider _dmxTypeDescriptorProvider;
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxMemberNavigation expr) {
    final DNavigableMember member = expr.getMember();
    if ((member instanceof DmxFilter)) {
      final DmxFilterTypeDescriptor returnType = ((DmxFilter)member).getTypeDesc();
      if ((returnType.isCompatible(DmxBaseType.COMPLEX) || ((DmxFilter)member).getTypeDesc().isMultiTyped())) {
        final List<DExpression> actualParameters = this.util.nullSafeCallArguments(expr);
        for (int i = 0; (i < ((DmxFilter)member).getParameters().size()); i++) {
          {
            final DmxFilterTypeDescriptor paramDeclaredType = ((DmxFilter)member).getParameters().get(i).getTypeDesc();
            if (((returnType.isCompatible(DmxBaseType.COMPLEX) && paramDeclaredType.isCompatible(DmxBaseType.COMPLEX)) || paramDeclaredType.isMultiTyped())) {
              AbstractDmxTypeDescriptor<?> paramActualType = null;
              if ((i == 0)) {
                final DExpression preceding = expr.getPrecedingNavigationSegment();
                paramActualType = this.typeForAndCheckNotNull(preceding);
              } else {
                int _size = actualParameters.size();
                boolean _lessThan = ((i - 1) < _size);
                if (_lessThan) {
                  paramActualType = this.typeForAndCheckNotNull(actualParameters.get((i - 1)));
                } else {
                  return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
                }
              }
              boolean _isCompatible = paramDeclaredType.isCompatible(paramActualType.baseType, paramActualType.collection);
              if (_isCompatible) {
                return this._dmxTypeDescriptorProvider.getTypeDescriptor(paramActualType.type, returnType.isCollection());
              }
              return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
            }
          }
        }
      } else {
        boolean _isCompatible = ((DmxFilter)member).getTypeDesc().isCompatible(DmxBaseType.STATE);
        if (_isCompatible) {
          final DExpression preceding = expr.getPrecedingNavigationSegment();
          final AbstractDmxTypeDescriptor<?> precedingTypeDesc = this.typeForAndCheckNotNull(preceding);
          final DType precedingType = precedingTypeDesc.type;
          if ((precedingType instanceof DEntityType)) {
            boolean _isEmpty = ((DEntityType)precedingType).getStates().isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              return this._dmxTypeDescriptorProvider.getTypeDescriptor(((DEntityType)precedingType).getStates().get(0), false);
            }
          }
          return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
        } else {
          return this._dmxTypeDescriptorProvider.getTypeDescriptor(((DmxFilter)member).getTypeDesc().getSingle(), ((DmxFilter)member).getTypeDesc().isCollection());
        }
      }
    } else {
      if ((member instanceof DLiteral)) {
        return this._dmxTypeDescriptorProvider.getTypeDescriptor(((DLiteral)member).eContainer(), ((DLiteral)member).isCollection());
      } else {
        if ((member instanceof DState)) {
          return this._dmxTypeDescriptorProvider.getTypeDescriptor(member, false);
        }
      }
    }
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(member.getType(), member.isCollection());
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxContextReference expr) {
    return this.typeForContextReferenceSwitch(expr);
  }
  
  /**
   * Non-dispatching; use to override
   */
  public AbstractDmxTypeDescriptor<?> typeForContextReferenceSwitch(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DContext)) {
      return this._dmxTypeDescriptorProvider.getTypeDescriptor(((DContext)target).getType(), ((DContext)target).isCollection());
    } else {
      if ((target instanceof DmxCorrelationVariable)) {
        final AbstractDmxTypeDescriptor<?> desc = this.typeFor(target);
        return desc;
      } else {
        if ((target instanceof DAggregate)) {
          return this._dmxTypeDescriptorProvider.getTypeDescriptor(target, false);
        } else {
          if ((target instanceof DNotification)) {
            return this._dmxTypeDescriptorProvider.getTypeDescriptor(target, false);
          } else {
            if ((target instanceof DNavigableMember)) {
              return this._dmxTypeDescriptorProvider.getTypeDescriptor(((DNavigableMember)target).getType(), expr.isAll());
            }
          }
        }
      }
    }
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(target, expr.isAll());
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxCorrelationVariable target) {
    EObject container = target.eContainer();
    while ((container != null)) {
      {
        if ((container instanceof DmxMemberNavigation)) {
          DNavigableMember _member = ((DmxMemberNavigation)container).getMember();
          if ((_member instanceof DmxFilter)) {
            final DExpression preceding = ((DmxMemberNavigation)container).getPrecedingNavigationSegment();
            final AbstractDmxTypeDescriptor<?> desc = this.typeForAndCheckNotNull(preceding);
            return this._dmxTypeDescriptorProvider.toFromCollection(desc, false);
          }
        } else {
          if ((container instanceof DType)) {
            return this._dmxTypeDescriptorProvider.getTypeDescriptor(container, false);
          }
        }
        container = container.eContainer();
      }
    }
    return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxStaticReference expr) {
    return DmxTypeDescriptorProvider.VOID;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxPredicateWithCorrelationVariable expr) {
    return DmxTypeDescriptorProvider.BOOLEAN;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxBinaryOperation expr) {
    AbstractDmxTypeDescriptor<? extends DType> _switchResult = null;
    DmxBinaryOperator _operator = expr.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case OR:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case XOR:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case AND:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case EQUAL:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case NOT_EQUAL:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case LESS:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case LESS_OR_EQUAL:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case GREATER_OR_EQUAL:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case GREATER:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case ADD:
        case SUBTRACT:
          final AbstractDmxTypeDescriptor<?> leftType = this.typeForAndCheckNotNull(expr.getLeftOperand());
          DmxBaseTypeDescriptor _switchResult_1 = null;
          final DmxBaseType _switchValue = leftType.baseType;
          if (_switchValue != null) {
            switch (_switchValue) {
              case TIMEPOINT:
                _switchResult_1 = DmxTypeDescriptorProvider.TIMEPOINT;
                break;
              case TEXT:
                _switchResult_1 = DmxTypeDescriptorProvider.TEXT;
                break;
              default:
                _switchResult_1 = DmxTypeDescriptorProvider.NUMBER;
                break;
            }
          } else {
            _switchResult_1 = DmxTypeDescriptorProvider.NUMBER;
          }
          return _switchResult_1;
        case MULTIPLY:
          _switchResult = DmxTypeDescriptorProvider.NUMBER;
          break;
        case DIVIDE:
          _switchResult = DmxTypeDescriptorProvider.NUMBER;
          break;
        case POWER:
          _switchResult = DmxTypeDescriptorProvider.NUMBER;
          break;
        case MODULO:
          _switchResult = DmxTypeDescriptorProvider.NUMBER;
          break;
        case IN:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
          break;
        case UNTIL:
          _switchResult = DmxTypeDescriptorProvider.VOID;
          break;
        case SINGLE_ARROW:
          _switchResult = DmxTypeDescriptorProvider.VOID;
          break;
        case DOUBLE_ARROW:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
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
          _switchResult = DmxTypeDescriptorProvider.NUMBER;
          break;
        case MINUS:
          _switchResult = DmxTypeDescriptorProvider.NUMBER;
          break;
        case NOT:
          _switchResult = DmxTypeDescriptorProvider.BOOLEAN;
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
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getType(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxInstanceOfExpression expr) {
    return DmxTypeDescriptorProvider.BOOLEAN;
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
          return this._dmxTypeDescriptorProvider.getTypeDescriptor(returnType.getSingle(), returnType.isCollection());
        }
        final List<DExpression> actualParameters = this.util.nullSafeCallArguments(expr);
        if ((returnType.isCompatible(DmxBaseType.COMPLEX) || returnType.isMultiTyped())) {
          for (int i = 0; (i < filter.getParameters().size()); i++) {
            {
              final DmxFilterTypeDescriptor paramDeclaredType = filter.getParameters().get(i).getTypeDesc();
              if (((returnType.isCompatible(DmxBaseType.COMPLEX) && paramDeclaredType.isCompatible(DmxBaseType.COMPLEX)) || paramDeclaredType.isMultiTyped())) {
                int _size_1 = actualParameters.size();
                boolean _lessThan = (i < _size_1);
                if (_lessThan) {
                  final AbstractDmxTypeDescriptor<?> paramActualType = this.typeForAndCheckNotNull(actualParameters.get(i));
                  boolean _isCompatible = paramDeclaredType.isCompatible(paramActualType.baseType, paramActualType.collection);
                  if (_isCompatible) {
                    return this._dmxTypeDescriptorProvider.getTypeDescriptor(paramActualType.type, returnType.isCollection());
                  }
                }
                return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
              }
            }
          }
        } else {
          return this._dmxTypeDescriptorProvider.getTypeDescriptor(returnType.getSingle(), returnType.isCollection());
        }
      }
      _xblockexpression = DmxTypeDescriptorProvider.UNDEFINED_TYPE;
    }
    return _xblockexpression;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxAssignment expr) {
    return DmxTypeDescriptorProvider.VOID;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxListExpression expr) {
    boolean _isEmpty = expr.getElements().isEmpty();
    if (_isEmpty) {
      return DmxTypeDescriptorProvider.UNDEFINED_TYPE_COLLECTION;
    }
    final HashSet<AbstractDmxTypeDescriptor<?>> typeDescs = Sets.<AbstractDmxTypeDescriptor<?>>newHashSet();
    EList<DExpression> _elements = expr.getElements();
    for (final DExpression e : _elements) {
      typeDescs.add(this.typeForAndCheckNotNull(e));
    }
    int _size = typeDescs.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      final AbstractDmxTypeDescriptor<?> result = this._dmxTypeDescriptorProvider.toFromCollection(IterableExtensions.<AbstractDmxTypeDescriptor<?>>head(typeDescs), true);
      return result;
    }
    return DmxTypeDescriptorProvider.AMBIGUOUS_TYPE;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxIfExpression expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxBooleanLiteral expr) {
    return DmxTypeDescriptorProvider.BOOLEAN;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxStringLiteral expr) {
    return DmxTypeDescriptorProvider.TEXT;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxNaturalLiteral expr) {
    return DmxTypeDescriptorProvider.NUMBER;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxDecimalLiteral expr) {
    return DmxTypeDescriptorProvider.NUMBER;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxUndefinedLiteral expr) {
    return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxComplexObject expr) {
    DComplexType _type = expr.getType();
    boolean _tripleEquals = (_type == null);
    if (_tripleEquals) {
      return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
    }
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getType(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxField expr) {
    if (((expr.getFeature() == null) || (expr.getFeature().getType() == null))) {
      return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
    }
    return this._dmxTypeDescriptorProvider.getTypeDescriptor(expr.getFeature().getType(), expr.getFeature().isCollection());
  }
  
  public AbstractDmxTypeDescriptor<?> typeForAndCheckNotNull(final DExpression expr) {
    AbstractDmxTypeDescriptor<?> _typeFor = null;
    if (expr!=null) {
      _typeFor=this.typeFor(expr);
    }
    final AbstractDmxTypeDescriptor<?> type = _typeFor;
    if ((type == null)) {
      return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
    }
    return type;
  }
  
  public AbstractDmxTypeDescriptor<?> typeFor(final EObject expr) {
    if (expr instanceof DmxAssignment) {
      return _typeFor((DmxAssignment)expr);
    } else if (expr instanceof DmxBinaryOperation) {
      return _typeFor((DmxBinaryOperation)expr);
    } else if (expr instanceof DmxBooleanLiteral) {
      return _typeFor((DmxBooleanLiteral)expr);
    } else if (expr instanceof DmxCastExpression) {
      return _typeFor((DmxCastExpression)expr);
    } else if (expr instanceof DmxComplexObject) {
      return _typeFor((DmxComplexObject)expr);
    } else if (expr instanceof DmxContextReference) {
      return _typeFor((DmxContextReference)expr);
    } else if (expr instanceof DmxCorrelationVariable) {
      return _typeFor((DmxCorrelationVariable)expr);
    } else if (expr instanceof DmxDecimalLiteral) {
      return _typeFor((DmxDecimalLiteral)expr);
    } else if (expr instanceof DmxField) {
      return _typeFor((DmxField)expr);
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
