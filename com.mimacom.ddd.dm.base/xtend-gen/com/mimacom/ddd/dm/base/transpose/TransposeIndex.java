package com.mimacom.ddd.dm.base.transpose;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;
import com.mimacom.ddd.dm.base.transpose.TranspositionUtil;
import com.mimacom.ddd.util.indexing.AbstractXtextIndex;
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
public class TransposeIndex extends AbstractXtextIndex {
  private static final BasePackage BASE = BasePackage.eINSTANCE;
  
  private static final TransposePackage TRANSPOSE = TransposePackage.eINSTANCE;
  
  public Iterable<IEObjectDescription> getExportedDTypeDescriptions(final EObject context) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      final IResourceDescription rd = this.getEResourceDescription(context);
      if ((rd == null)) {
        return Collections.EMPTY_LIST;
      }
      _xblockexpression = rd.getExportedObjectsByType(TransposeIndex.BASE.getDType());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getVisibleDTypeDescriptions(final EObject context) {
    return this.getVisibleEObjectDescriptions(context, TransposeIndex.BASE.getDType());
  }
  
  public Iterable<IEObjectDescription> getVisibleDTypeDescriptions(final EObject context, final QualifiedName name) {
    return this.getVisibleEObjectDescriptions(context, TransposeIndex.BASE.getDType(), name);
  }
  
  public Map<QualifiedName, IEObjectDescription> getVisibleDTypeDescriptionsMap(final EObject context) {
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    return IterableExtensions.<QualifiedName, IEObjectDescription>toMap(this.getVisibleEObjectDescriptions(context, TransposeIndex.BASE.getDType()), _function);
  }
  
  /**
   * @param name must end in segment "@" (otherwise there will be no matches!)
   */
  public Iterable<IEObjectDescription> getVisibleTTypeMappingDescriptions(final EObject context, final QualifiedName name) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      String _last = IterableExtensions.<String>last(name.getSegments());
      boolean _notEquals = (!Objects.equal(_last, TranspositionUtil.TRANSPOSITION_INDEX_ENTRY_MARKER));
      if (_notEquals) {
        throw new IllegalArgumentException(((("Name must end in \'" + TranspositionUtil.TRANSPOSITION_INDEX_ENTRY_MARKER) + "\' segment: ") + name));
      }
      _xblockexpression = this.getVisibleEObjectDescriptions(context, TransposeIndex.TRANSPOSE.getTTypeMapping(), name);
    }
    return _xblockexpression;
  }
}
