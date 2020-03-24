package com.mimacom.ddd.dm.dmx;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class DmxUtil extends TypesUtil {
  public static final String ENTITY_TYPE_STATE_FILTER_NAME = "state";
  
  public static final String TIMEPOINT_SYNTAX = "yyyy-MM-dd [HH:mm]";
  
  public static final SimpleDateFormat TIMEPOINT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
  
  public static final SimpleDateFormat TIMEPOINT_DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
  
  public List<DExpression> nullSafeCallArguments(final DmxMemberNavigation nav) {
    DmxCallArguments _callArguments = nav.getCallArguments();
    boolean _tripleEquals = (_callArguments == null);
    if (_tripleEquals) {
      return Collections.EMPTY_LIST;
    }
    return nav.getCallArguments().getArguments();
  }
  
  public List<DExpression> nullSafeCallArguments(final DmxFunctionCall call) {
    DmxCallArguments _callArguments = call.getCallArguments();
    boolean _tripleEquals = (_callArguments == null);
    if (_tripleEquals) {
      return Collections.EMPTY_LIST;
    }
    return call.getCallArguments().getArguments();
  }
  
  public Date parseTimepoint(final String value) {
    if ((value == null)) {
      return null;
    }
    final String trimmed = value.trim();
    final Date date = this.parseTimepoint(trimmed, DmxUtil.TIMEPOINT_DATE_TIME_FORMAT);
    if ((date != null)) {
      return date;
    }
    return this.parseTimepoint(trimmed, DmxUtil.TIMEPOINT_DATE_FORMAT);
  }
  
  public DmxField field(final DmxComplexObject obj, final DFeature feature) {
    EList<DmxField> _fields = obj.getFields();
    for (final DmxField f : _fields) {
      DFeature _feature = f.getFeature();
      boolean _equals = Objects.equal(_feature, feature);
      if (_equals) {
        return f;
      }
    }
    return null;
  }
  
  private Date parseTimepoint(final String value, final SimpleDateFormat format) {
    try {
      int _length = value.length();
      int _length_1 = format.toPattern().length();
      boolean _lessEqualsThan = (_length <= _length_1);
      if (_lessEqualsThan) {
        return format.parse(value);
      }
    } catch (final Throwable _t) {
      if (_t instanceof ParseException) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
}
