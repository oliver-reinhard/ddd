package com.mimacom.ddd.dm.dmx.indexing;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.util.indexing.AbstractXtextIndex;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;

@Singleton
@SuppressWarnings("all")
public class DmxIndex extends AbstractXtextIndex {
  private static final DmxPackage DMX = DmxPackage.eINSTANCE;
  
  public List<DmxFilter> allVisibleFilters(final EObject context) {
    final Iterable<IEObjectDescription> functionDescriptions = this.getVisibleEObjectDescriptions(context, DmxIndex.DMX.getDmxFilter());
    final ArrayList<DmxFilter> result = Lists.<DmxFilter>newArrayList();
    for (final IEObjectDescription desc : functionDescriptions) {
      {
        DmxFilter filter = this.<DmxFilter>resolveEObjectDescription(context, desc, DmxFilter.class);
        if ((filter != null)) {
          result.add(filter);
        }
      }
    }
    return result;
  }
  
  public List<DmxFilter> supportedFilters(final EObject context, final DmxBaseType baseType, final boolean collection) {
    final Iterable<IEObjectDescription> functionDescriptions = this.getVisibleEObjectDescriptions(context, DmxIndex.DMX.getDmxFilter());
    final ArrayList<DmxFilter> result = Lists.<DmxFilter>newArrayList();
    for (final IEObjectDescription desc : functionDescriptions) {
      {
        DmxFilter func = this.<DmxFilter>resolveEObjectDescription(context, desc, DmxFilter.class);
        if ((func != null)) {
          int _size = func.getParameters().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            final DmxFilterParameter param = func.getParameters().get(0);
            boolean _isCompatible = param.getTypeDesc().isCompatible(baseType, collection);
            if (_isCompatible) {
              result.add(func);
            }
          }
        }
      }
    }
    return result;
  }
}
