package com.mimacom.ddd.dm.dmx.linking;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.synthetic.SyntheticPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.linking.lazy.LazyLinker;

@SuppressWarnings("all")
public class DmxLazyLinker extends LazyLinker {
  protected static final BasePackage BASE = BasePackage.eINSTANCE;
  
  protected static final SyntheticPackage SYNTH = SyntheticPackage.eINSTANCE;
  
  @Override
  protected EClass globalFindInstantiableCompatible(final EClass eType) {
    EClass _xblockexpression = null;
    {
      EClass _dComplexType = DmxLazyLinker.BASE.getDComplexType();
      boolean _equals = Objects.equal(eType, _dComplexType);
      if (_equals) {
        return DmxLazyLinker.SYNTH.getTSyntheticEntityType();
      }
      EClass _dFeature = DmxLazyLinker.BASE.getDFeature();
      boolean _equals_1 = Objects.equal(eType, _dFeature);
      if (_equals_1) {
        return DmxLazyLinker.SYNTH.getTSyntheticAttribute();
      }
      final EClass result = this.findSubTypeInEPackage(DmxLazyLinker.SYNTH, eType);
      if ((result != null)) {
        return result;
      }
      _xblockexpression = super.globalFindInstantiableCompatible(eType);
    }
    return _xblockexpression;
  }
}
