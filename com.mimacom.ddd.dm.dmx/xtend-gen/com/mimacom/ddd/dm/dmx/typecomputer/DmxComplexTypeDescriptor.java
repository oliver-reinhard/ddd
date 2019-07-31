package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class DmxComplexTypeDescriptor extends AbstractDmxTypeDescriptor<DComplexType> {
  private DmxUtil util;
  
  public DmxComplexTypeDescriptor(final DComplexType type, final boolean collection, final DmxUtil util) {
    super(DmxBaseType.COMPLEX, type, Boolean.valueOf(collection));
    this.util = util;
  }
  
  /**
   * Returns its own as well as all inherited features
   */
  @Override
  public List<DNavigableMember> getNavigableMembers() {
    List<DNavigableMember> _xblockexpression = null;
    {
      final List<DFeature> allFeatures = this.util.allFeatures(this.type);
      _xblockexpression = ((List<DNavigableMember>) ((Object) allFeatures));
    }
    return _xblockexpression;
  }
  
  @Override
  public List<DmxFilter> getSupportedIterators(final EObject context, final DmxIndex index) {
    return index.supportedFilters(context, this.baseType, this.collection);
  }
  
  @Override
  public boolean canAssignTo(final AbstractDmxTypeDescriptor<?> other) {
    return (super.canAssignTo(other) || ((this.type != null) && this.util.typeHierarchy(this.type).contains(other.type)));
  }
}
