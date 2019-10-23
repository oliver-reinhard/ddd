package com.mimacom.ddd.dm.dom.impl;

import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DType;

public class DomFieldImplCustom extends DomFieldImpl {

	@Override
	public String getName() {
		if (basicGetRef() != null && ! basicGetRef().eIsProxy()) return getRef().getName();
		return null;
	}
	
	@Override
	public DType getType() {
		if (basicGetRef() != null && ! basicGetRef().eIsProxy()) return getRef().getType();
		return null;
	}

	@Override
	public DMultiplicity getMultiplicity() {
		if (basicGetRef() != null && ! basicGetRef().eIsProxy()) return getRef().getMultiplicity();
		return null;
	}
}
