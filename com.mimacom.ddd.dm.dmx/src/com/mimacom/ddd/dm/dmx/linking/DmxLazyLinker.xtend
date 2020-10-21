package com.mimacom.ddd.dm.dmx.linking

import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.synthetic.SyntheticPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.linking.lazy.LazyLinker

class DmxLazyLinker extends LazyLinker {

	protected static val BASE = BasePackage.eINSTANCE
	protected static val SYNTH = SyntheticPackage.eINSTANCE

	override protected globalFindInstantiableCompatible(EClass eType) {
		// Prevent searching of the package registry for the BASE abstract classes (used to create proxies):
		if (eType == BASE.DComplexType) return SYNTH.TSyntheticEntityType
		if (eType == BASE.DFeature) return SYNTH.TSyntheticAttribute
		val result = findSubTypeInEPackage(SYNTH, eType);
		if (result !== null)
			return result;

		super.globalFindInstantiableCompatible(eType)
	}

}
