package com.mimacom.ddd.dm.dmx.typecomputer;

import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class DmxVoidDescriptor extends AbstractDmxTypeDescriptor<DType> {
  public DmxVoidDescriptor() {
    super(DmxBaseType.VOID, null, false);
  }
  
  @Override
  public List<DmxFilter> getSupportedIterators(final EObject context, final DmxIndex index) {
    return Collections.EMPTY_LIST;
  }
}
