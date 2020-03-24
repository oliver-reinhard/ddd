package com.mimacom.ddd.sm.sim.indexing;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.dmx.indexing.AbstractXtextIndex;
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class SimIndex extends AbstractXtextIndex {
  private final BasePackage BASE = BasePackage.eINSTANCE;
  
  public Iterable<IEObjectDescription> getExportedDTypeDescriptions(final EObject context) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      final IResourceDescription rd = this.getEResourceDescription(context);
      if ((rd == null)) {
        return Collections.EMPTY_LIST;
      }
      _xblockexpression = rd.getExportedObjectsByType(this.BASE.getDType());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getVisibleDTypeDescriptions(final EObject context) {
    return this.getVisibleEObjectDescriptions(context, this.BASE.getDType());
  }
  
  public Map<QualifiedName, IEObjectDescription> getVisibleDTypeDescriptionsMap(final EObject context) {
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    return IterableExtensions.<QualifiedName, IEObjectDescription>toMap(this.getVisibleEObjectDescriptions(context, this.BASE.getDType()), _function);
  }
  
  protected boolean isDeducedSystemType(final IEObjectDescription desc) {
    String _userData = desc.getUserData(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM);
    return (_userData != null);
  }
  
  public Iterable<IEObjectDescription> getVisibleExternalDeducedDTypes(final EObject context) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      return Boolean.valueOf(this.isDeducedSystemType(it));
    };
    final Iterable<IEObjectDescription> allVisibleTypes = IterableExtensions.<IEObjectDescription>filter(this.getVisibleDTypeDescriptions(context), _function);
    final Function1<IEObjectDescription, Boolean> _function_1 = (IEObjectDescription it) -> {
      return Boolean.valueOf(this.isDeducedSystemType(it));
    };
    final Iterable<IEObjectDescription> allExportedTypes = IterableExtensions.<IEObjectDescription>filter(this.getExportedDTypeDescriptions(context), _function_1);
    final Set<IEObjectDescription> difference = IterableExtensions.<IEObjectDescription>toSet(allVisibleTypes);
    difference.removeAll(IterableExtensions.<IEObjectDescription>toSet(allExportedTypes));
    return difference;
  }
}
