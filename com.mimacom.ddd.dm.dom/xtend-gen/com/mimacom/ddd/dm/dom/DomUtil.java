package com.mimacom.ddd.dm.dom;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dom.DomComplexObject;
import com.mimacom.ddd.dm.dom.DomField;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;

@SuppressWarnings("all")
public class DomUtil extends DmxUtil {
  public String label(final DomNamedComplexObject o) {
    if (((o.getObject() != null) && (o.getObject().getRef() != null))) {
      String _name = o.getName();
      String _plus = (_name + ":");
      String _name_1 = o.getObject().getRef().getName();
      return (_plus + _name_1);
    }
    return o.getName();
  }
  
  public boolean root(final DomComplexObject o) {
    final DComplexType type = o.getRef();
    if ((type instanceof DEntityType)) {
      return ((DEntityType)type).isRoot();
    }
    return false;
  }
  
  public String label(final DomField f) {
    DFeature _ref = f.getRef();
    boolean _tripleNotEquals = (_ref != null);
    if (_tripleNotEquals) {
      String _name = f.getRef().getName();
      String _plus = (_name + ":");
      DType _type = f.getRef().getType();
      String _name_1 = null;
      if (_type!=null) {
        _name_1=_type.getName();
      }
      return (_plus + _name_1);
    }
    return "field";
  }
}
