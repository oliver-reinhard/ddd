package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIterator;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxSelfExpression;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxAggregateDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxBaseTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxEnumerationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxNotificationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxPrimitiveDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxServiceDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxUndefinedDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxVoidDescriptor;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@Singleton
@SuppressWarnings("all")
public class DmxTypeComputer {
  @Inject
  private DmxUtil util;
  
  private static final DmxVoidDescriptor VOID = new DmxVoidDescriptor();
  
  private static final DmxUndefinedDescriptor UNDEFINED = new DmxUndefinedDescriptor();
  
  private static final DmxBaseTypeDescriptor BOOLEAN = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN);
  
  private static final DmxBaseTypeDescriptor NUMBER = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER);
  
  private static final DmxBaseTypeDescriptor TEXT = new DmxBaseTypeDescriptor(DmxBaseType.TEXT);
  
  private static final DmxBaseTypeDescriptor IDENTIFIER = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER);
  
  private static final DmxBaseTypeDescriptor TIMEPOINT = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT);
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxMemberNavigation expr) {
    final DNavigableMember member = expr.getMember();
    final DExpression preceding = expr.getPrecedingNavigationSegment();
    if ((member instanceof DmxIterator)) {
      DmxBaseType _baseType = ((DmxIterator)member).getBaseType();
      boolean _equals = Objects.equal(_baseType, DmxBaseType.COMPLEX);
      if (_equals) {
        final AbstractDmxTypeDescriptor<?> precedingType = this.typeFor(preceding);
        return this.createDescriptor(precedingType.type, ((DmxIterator)member).isBaseTypeCollection());
      } else {
        return this.getBaseTypeDescriptor(((DmxIterator)member).getBaseType());
      }
    }
    return this.createDescriptor(member.getType(), member.isCollection());
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DContext)) {
      DType _type = ((DContext)target).getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        return this.createDescriptor(((DContext)target).getType(), ((DContext)target).isCollection());
      } else {
        EObject prev = target;
        EObject container = prev.eContainer();
        boolean isCorrelationVariable = this.isCorrelationVariable(((DContext)target), container);
        while ((!((container == null) || ((container instanceof DmxMemberNavigation) && ((DmxMemberNavigation) container).getMemberCallArguments().contains(prev))))) {
          {
            prev = container;
            container = prev.eContainer();
            isCorrelationVariable = (isCorrelationVariable || this.isCorrelationVariable(((DContext)target), container));
          }
        }
        if ((container instanceof DmxMemberNavigation)) {
          final AbstractDmxTypeDescriptor<?> desc = this.typeFor(((DmxMemberNavigation)container).getPrecedingNavigationSegment());
          if (isCorrelationVariable) {
            desc.collection = false;
          }
          return desc;
        }
        return DmxTypeComputer.UNDEFINED;
      }
    } else {
      if ((target instanceof DAggregate)) {
        return this.createDescriptor(target, false);
      } else {
        if ((target instanceof DNotification)) {
          return this.createDescriptor(target, false);
        } else {
          if ((target instanceof DService)) {
            return this.createDescriptor(target, false);
          } else {
            if ((target instanceof DNavigableMember)) {
              return this.createDescriptor(((DNavigableMember)target).getType(), expr.isAll());
            } else {
              return this.createDescriptor(target, expr.isAll());
            }
          }
        }
      }
    }
  }
  
  private boolean isCorrelationVariable(final DContext target, final EObject container) {
    return ((container instanceof DmxPredicateWithCorrelationVariable) && Objects.equal(((DmxPredicateWithCorrelationVariable) container).getCorrelationVariable(), target));
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxSelfExpression expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxCastExpression expr) {
    return this.createDescriptor(expr.getType(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxFunctionCall expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DmxConstructorCall expr) {
    return this.createDescriptor(expr.getConstructor(), false);
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
  
  private AbstractDmxTypeDescriptor<?> createDescriptor(final DNamedElement e, final boolean collection) {
    AbstractDmxTypeDescriptor<? extends DType> _switchResult = null;
    boolean _matched = false;
    if (e instanceof DmxArchetype) {
      _matched=true;
      _switchResult = new DmxPrimitiveDescriptor(((DmxArchetype)e), collection);
    }
    if (!_matched) {
      if (e instanceof DPrimitive) {
        _matched=true;
        _switchResult = new DmxPrimitiveDescriptor(((DPrimitive)e), collection);
      }
    }
    if (!_matched) {
      if (e instanceof DEnumeration) {
        _matched=true;
        _switchResult = new DmxEnumerationDescriptor(((DEnumeration)e));
      }
    }
    if (!_matched) {
      if (e instanceof DComplexType) {
        _matched=true;
        _switchResult = new DmxComplexTypeDescriptor(((DComplexType)e), collection, this.util);
      }
    }
    if (!_matched) {
      if (e instanceof DAggregate) {
        _matched=true;
        _switchResult = new DmxAggregateDescriptor(((DAggregate)e));
      }
    }
    if (!_matched) {
      if (e instanceof DService) {
        _matched=true;
        _switchResult = new DmxServiceDescriptor(((DService)e));
      }
    }
    if (!_matched) {
      if (e instanceof DNotification) {
        _matched=true;
        _switchResult = new DmxNotificationDescriptor(((DNotification)e));
      }
    }
    if (!_matched) {
      _switchResult = DmxTypeComputer.UNDEFINED;
    }
    return _switchResult;
  }
  
  private AbstractDmxTypeDescriptor<?> getBaseTypeDescriptor(final DmxBaseType t) {
    AbstractDmxTypeDescriptor<? extends DType> _switchResult = null;
    if (t != null) {
      switch (t) {
        case VOID:
          _switchResult = DmxTypeComputer.VOID;
          break;
        case BOOLEAN:
          _switchResult = DmxTypeComputer.BOOLEAN;
          break;
        case NUMBER:
          _switchResult = DmxTypeComputer.NUMBER;
          break;
        case TEXT:
          _switchResult = DmxTypeComputer.TEXT;
          break;
        case IDENTIFIER:
          _switchResult = DmxTypeComputer.IDENTIFIER;
          break;
        case TIMEPOINT:
          _switchResult = DmxTypeComputer.TIMEPOINT;
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
  
  public AbstractDmxTypeDescriptor<?> typeFor(final DExpression expr) {
    if (expr instanceof DmxBooleanLiteral) {
      return _typeFor((DmxBooleanLiteral)expr);
    } else if (expr instanceof DmxCastExpression) {
      return _typeFor((DmxCastExpression)expr);
    } else if (expr instanceof DmxConstructorCall) {
      return _typeFor((DmxConstructorCall)expr);
    } else if (expr instanceof DmxContextReference) {
      return _typeFor((DmxContextReference)expr);
    } else if (expr instanceof DmxDecimalLiteral) {
      return _typeFor((DmxDecimalLiteral)expr);
    } else if (expr instanceof DmxFunctionCall) {
      return _typeFor((DmxFunctionCall)expr);
    } else if (expr instanceof DmxMemberNavigation) {
      return _typeFor((DmxMemberNavigation)expr);
    } else if (expr instanceof DmxNaturalLiteral) {
      return _typeFor((DmxNaturalLiteral)expr);
    } else if (expr instanceof DmxSelfExpression) {
      return _typeFor((DmxSelfExpression)expr);
    } else if (expr instanceof DmxStringLiteral) {
      return _typeFor((DmxStringLiteral)expr);
    } else if (expr instanceof DmxUndefinedLiteral) {
      return _typeFor((DmxUndefinedLiteral)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
