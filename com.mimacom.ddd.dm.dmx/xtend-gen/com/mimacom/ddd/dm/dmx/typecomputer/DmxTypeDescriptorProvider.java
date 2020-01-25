package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxAggregateDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxAmbiguousDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxBaseTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxEnumerationDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxPrimitiveDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxStateDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxUndefinedDescriptor;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxVoidDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class DmxTypeDescriptorProvider {
  @Inject
  @Extension
  private DmxUtil util;
  
  public static final DmxVoidDescriptor VOID = new DmxVoidDescriptor();
  
  public static final DmxUndefinedDescriptor UNDEFINED_TYPE = new DmxUndefinedDescriptor(false);
  
  public static final DmxUndefinedDescriptor UNDEFINED_TYPE_COLLECTION = new DmxUndefinedDescriptor(true);
  
  public static final DmxAmbiguousDescriptor AMBIGUOUS_TYPE = new DmxAmbiguousDescriptor();
  
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
  
  public AbstractDmxTypeDescriptor<?> getTypeDescriptor(final Object obj, final boolean collection) {
    AbstractDmxTypeDescriptor<?> _xblockexpression = null;
    {
      if (((obj instanceof EObject) && ((EObject) obj).eIsProxy())) {
        return DmxTypeDescriptorProvider.UNDEFINED_TYPE;
      }
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
          _switchResult = new DmxEnumerationDescriptor(((DEnumeration)obj), collection);
        }
      }
      if (!_matched) {
        if (obj instanceof DComplexType) {
          _matched=true;
          _switchResult = new DmxComplexTypeDescriptor(((DComplexType)obj), collection, this.util);
        }
      }
      if (!_matched) {
        if (obj instanceof DState) {
          _matched=true;
          _switchResult = new DmxStateDescriptor(((DState)obj), collection);
        }
      }
      if (!_matched) {
        if (obj instanceof DAggregate) {
          _matched=true;
          _switchResult = new DmxAggregateDescriptor(((DAggregate)obj), collection);
        }
      }
      if (!_matched) {
        _switchResult = DmxTypeDescriptorProvider.UNDEFINED_TYPE;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public AbstractDmxTypeDescriptor<?> toFromCollection(final AbstractDmxTypeDescriptor<?> obj, final boolean collection) {
    if ((obj.collection == collection)) {
      return obj;
    } else {
      if ((obj instanceof DmxBaseTypeDescriptor)) {
        return this.getTypeDescriptor(((DmxBaseTypeDescriptor)obj).baseType, collection);
      }
    }
    final AbstractDmxTypeDescriptor<?> desc = obj.clone();
    desc.collection = collection;
    return desc;
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
  
  private AbstractDmxTypeDescriptor<?> getBaseTypeDescriptor(final DmxBaseType t, final boolean collection) {
    AbstractDmxTypeDescriptor<? extends DType> _switchResult = null;
    if (t != null) {
      switch (t) {
        case VOID:
          _switchResult = DmxTypeDescriptorProvider.VOID;
          break;
        case BOOLEAN:
          DmxBaseTypeDescriptor _xifexpression = null;
          if (collection) {
            _xifexpression = DmxTypeDescriptorProvider.BOOLEAN_COLLECTION;
          } else {
            _xifexpression = DmxTypeDescriptorProvider.BOOLEAN;
          }
          _switchResult = _xifexpression;
          break;
        case NUMBER:
          DmxBaseTypeDescriptor _xifexpression_1 = null;
          if (collection) {
            _xifexpression_1 = DmxTypeDescriptorProvider.NUMBER_COLLECTION;
          } else {
            _xifexpression_1 = DmxTypeDescriptorProvider.NUMBER;
          }
          _switchResult = _xifexpression_1;
          break;
        case TEXT:
          DmxBaseTypeDescriptor _xifexpression_2 = null;
          if (collection) {
            _xifexpression_2 = DmxTypeDescriptorProvider.TEXT_COLLECTION;
          } else {
            _xifexpression_2 = DmxTypeDescriptorProvider.TEXT;
          }
          _switchResult = _xifexpression_2;
          break;
        case IDENTIFIER:
          DmxBaseTypeDescriptor _xifexpression_3 = null;
          if (collection) {
            _xifexpression_3 = DmxTypeDescriptorProvider.IDENTIFIER_COLLECTION;
          } else {
            _xifexpression_3 = DmxTypeDescriptorProvider.IDENTIFIER;
          }
          _switchResult = _xifexpression_3;
          break;
        case TIMEPOINT:
          DmxBaseTypeDescriptor _xifexpression_4 = null;
          if (collection) {
            _xifexpression_4 = DmxTypeDescriptorProvider.TIMEPOINT_COLLECTION;
          } else {
            _xifexpression_4 = DmxTypeDescriptorProvider.TIMEPOINT;
          }
          _switchResult = _xifexpression_4;
          break;
        case STATE:
          throw new IllegalArgumentException("State type descriptors must be created based on a DState object");
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
}
