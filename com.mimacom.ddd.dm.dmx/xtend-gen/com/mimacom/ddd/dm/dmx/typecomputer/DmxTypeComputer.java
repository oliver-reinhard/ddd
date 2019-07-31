package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DCastExpression;
import com.mimacom.ddd.dm.dmx.DConstructorCall;
import com.mimacom.ddd.dm.dmx.DDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DFunctionCall;
import com.mimacom.ddd.dm.dmx.DNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DSelfExpression;
import com.mimacom.ddd.dm.dmx.DStringLiteral;
import com.mimacom.ddd.dm.dmx.DUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxIterator;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxActorDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxBaseTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxEnumerationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxPrimitiveDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxServiceDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxUndefinedDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxVoidDescriptor;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

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
        return this.createDescriptor(((DContext)target).getType(), this.isCollection(((DContext)target).getMultiplicity()));
      } else {
        EObject prev = target;
        EObject container = prev.eContainer();
        while ((!((container == null) || ((container instanceof DmxMemberNavigation) && ((DmxMemberNavigation) container).getMemberCallArguments().contains(prev))))) {
          {
            prev = container;
            container = prev.eContainer();
          }
        }
        if ((container instanceof DmxMemberNavigation)) {
          return this.typeFor(((DmxMemberNavigation)container).getPrecedingNavigationSegment());
        }
      }
    } else {
      if ((target instanceof DNavigableMember)) {
        return this.createDescriptor(((DNavigableMember)target).getType(), expr.isAll());
      } else {
        return this.createDescriptor(target, expr.isAll());
      }
    }
    return DmxTypeComputer.UNDEFINED;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DSelfExpression expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DCastExpression expr) {
    return this.createDescriptor(expr.getType(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DFunctionCall expr) {
    throw new UnsupportedOperationException();
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DConstructorCall expr) {
    return this.createDescriptor(expr.getConstructor(), false);
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DBooleanLiteral expr) {
    return DmxTypeComputer.BOOLEAN;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DStringLiteral expr) {
    return DmxTypeComputer.TEXT;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DNaturalLiteral expr) {
    return DmxTypeComputer.NUMBER;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DDecimalLiteral expr) {
    return DmxTypeComputer.NUMBER;
  }
  
  protected AbstractDmxTypeDescriptor<?> _typeFor(final DUndefinedLiteral expr) {
    return DmxTypeComputer.UNDEFINED;
  }
  
  private AbstractDmxTypeDescriptor<?> createDescriptor(final DNamedElement e, final boolean collection) {
    AbstractDmxTypeDescriptor<? extends DType> _switchResult = null;
    boolean _matched = false;
    if (e instanceof DPrimitive) {
      _matched=true;
      _switchResult = new DmxPrimitiveDescriptor(((DPrimitive)e), collection);
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
      if (e instanceof DService) {
        _matched=true;
        _switchResult = new DmxServiceDescriptor(((DService)e));
      }
    }
    if (!_matched) {
      if (e instanceof DActor) {
        _matched=true;
        _switchResult = new DmxActorDescriptor(((DActor)e));
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
  
  private boolean isCollection(final DMultiplicity m) {
    boolean _xifexpression = false;
    if ((m == null)) {
      _xifexpression = false;
    } else {
      int _maxOccurs = m.getMaxOccurs();
      _xifexpression = (_maxOccurs > 1);
    }
    return _xifexpression;
  }
  
  public AbstractDmxTypeDescriptor<?> typeFor(final DExpression expr) {
    if (expr instanceof DBooleanLiteral) {
      return _typeFor((DBooleanLiteral)expr);
    } else if (expr instanceof DCastExpression) {
      return _typeFor((DCastExpression)expr);
    } else if (expr instanceof DConstructorCall) {
      return _typeFor((DConstructorCall)expr);
    } else if (expr instanceof DDecimalLiteral) {
      return _typeFor((DDecimalLiteral)expr);
    } else if (expr instanceof DFunctionCall) {
      return _typeFor((DFunctionCall)expr);
    } else if (expr instanceof DNaturalLiteral) {
      return _typeFor((DNaturalLiteral)expr);
    } else if (expr instanceof DSelfExpression) {
      return _typeFor((DSelfExpression)expr);
    } else if (expr instanceof DStringLiteral) {
      return _typeFor((DStringLiteral)expr);
    } else if (expr instanceof DUndefinedLiteral) {
      return _typeFor((DUndefinedLiteral)expr);
    } else if (expr instanceof DmxContextReference) {
      return _typeFor((DmxContextReference)expr);
    } else if (expr instanceof DmxMemberNavigation) {
      return _typeFor((DmxMemberNavigation)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}