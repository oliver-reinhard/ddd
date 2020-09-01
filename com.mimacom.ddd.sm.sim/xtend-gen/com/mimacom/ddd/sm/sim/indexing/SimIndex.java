package com.mimacom.ddd.sm.sim.indexing;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.dmx.indexing.AbstractXtextIndex;
import com.mimacom.ddd.sm.sim.SimPackage;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class SimIndex extends AbstractXtextIndex {
  private static final BasePackage BASE = BasePackage.eINSTANCE;
  
  private static final SimPackage SIM = SimPackage.eINSTANCE;
  
  public Iterable<IEObjectDescription> getExportedDTypeDescriptions(final EObject context) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      final IResourceDescription rd = this.getEResourceDescription(context);
      if ((rd == null)) {
        return Collections.EMPTY_LIST;
      }
      _xblockexpression = rd.getExportedObjectsByType(SimIndex.BASE.getDType());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getVisibleDTypeDescriptions(final EObject context) {
    return this.getVisibleEObjectDescriptions(context, SimIndex.BASE.getDType());
  }
  
  public Iterable<IEObjectDescription> getVisibleDTypeDescriptions(final EObject context, final QualifiedName name) {
    return this.getVisibleEObjectDescriptions(context, SimIndex.BASE.getDType(), name);
  }
  
  public Map<QualifiedName, IEObjectDescription> getVisibleDTypeDescriptionsMap(final EObject context) {
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    return IterableExtensions.<QualifiedName, IEObjectDescription>toMap(this.getVisibleEObjectDescriptions(context, SimIndex.BASE.getDType()), _function);
  }
  
  public Iterable<IEObjectDescription> getVisibleSTypeMappingDescriptions(final EObject context, final QualifiedName name) {
    return this.getVisibleEObjectDescriptions(context, SimIndex.SIM.getSTypeMapping(), name);
  }
}
