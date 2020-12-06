package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class SimUtil extends DimUtil {
  public String modelName(final EObject obj) {
    final SystemInformationModel d = EcoreUtil2.<SystemInformationModel>getContainerOfType(obj, SystemInformationModel.class);
    String _xifexpression = null;
    if ((d != null)) {
      _xifexpression = d.getName();
    } else {
      _xifexpression = "<undefined model>";
    }
    return _xifexpression;
  }
  
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
