package com.mimacom.ddd.dm.dim;

import com.mimacom.ddd.dm.dmx.DmxUtil;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class DimUtil extends DmxUtil {
  public String outermostSemanticContainerName(final EObject obj) {
    return this.domainName(obj);
  }
}
