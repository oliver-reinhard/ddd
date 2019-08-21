package com.mimacom.ddd.dm.dmx.typecomputer;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DmxComplexTypeDescriptor extends AbstractDmxTypeDescriptor<DComplexType> {
  private DmxUtil util;
  
  public DmxComplexTypeDescriptor(final DComplexType type, final boolean collection, final DmxUtil util) {
    super(DmxBaseType.COMPLEX, type, Boolean.valueOf(collection));
    if ((type == null)) {
      throw new NullPointerException("type");
    }
    this.util = util;
  }
  
  /**
   * Returns its own as well as all inherited features
   */
  @Override
  public List<DNavigableMember> getNavigableMembers() {
    List<DFeature> allFeatures = this.util.allFeatures(this.type);
    if ((this.type instanceof DEntityType)) {
      boolean _isEmpty = ((DEntityType)this.type).getStates().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final ArrayList<DNavigableMember> allMembers = Lists.<DNavigableMember>newArrayList(((List<DNavigableMember>) ((Object) allFeatures)));
        allMembers.addAll(((DEntityType)this.type).getStates());
        return allMembers;
      }
    }
    return ((List<DNavigableMember>) ((Object) allFeatures));
  }
  
  @Override
  public List<DmxFilter> getSupportedIterators(final EObject context, final DmxIndex index) {
    final List<DmxFilter> iterators = super.getSupportedIterators(context, index);
    if ((!(this.type instanceof DEntityType))) {
      final Function1<DmxFilter, Boolean> _function = (DmxFilter it) -> {
        String _name = it.getName();
        return Boolean.valueOf((!Objects.equal(_name, this.util.ENTITY_TYPE_STATE_FILTER_NAME)));
      };
      return IterableExtensions.<DmxFilter>toList(IterableExtensions.<DmxFilter>filter(iterators, _function));
    }
    return iterators;
  }
  
  @Override
  public boolean canAssignTo(final AbstractDmxTypeDescriptor<?> other) {
    return (super.canAssignTo(other) || ((other != null) && this.util.typeHierarchy(this.type).contains(other.type)));
  }
}
