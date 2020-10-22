package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.dim.DimUtil;

@SuppressWarnings("all")
public class SimUtil extends DimUtil {
  @Override
  public String label(final DAggregate a) {
    String _name = a.getName();
    return ("Aggregate " + _name);
  }
}
