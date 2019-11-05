package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DType;

public class DmxFieldImplCustom extends DmxFieldImpl {

	@Override
	public String getName() {
		if (basicGetFeature() != null && ! basicGetFeature().eIsProxy()) return getFeature().getName();
		return null;
	}
	
	@Override
	public DType getType() {
		if (basicGetFeature() != null && ! basicGetFeature().eIsProxy()) return getFeature().getType();
		return null;
	}

	@Override
	public DMultiplicity getMultiplicity() {
		if (basicGetFeature() != null && ! basicGetFeature().eIsProxy()) return getFeature().getMultiplicity();
		return null;
	}
}
