package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.dim.DimUtil;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class SimUtil extends DimUtil {
  @Override
  public String outermostSemanticContainerName(final EObject obj) {
    return this.modelName(obj);
  }
  
  @Override
  public String label(final DAggregate a) {
    String _name = a.getName();
    return ("Aggregate " + _name);
  }
}
