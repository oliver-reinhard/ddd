package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.dmx.DmxBaseType;

public class DmxFilterTypeDescriptorImplCustom extends DmxFilterTypeDescriptorImpl {
	
	@Override
	public boolean isCompatible(DmxBaseType type, boolean collection) {
		return isCompatible(type) && this.isCollection() == collection;
	}
	
	@Override
	public boolean isCompatible(DmxBaseType type) {
		if (getMultiple() != null) {
			return getMultiple().getMembers().contains(type);
		}
		return getSingle() == type;
	}

	@Override
	public boolean  isMultiTyped() {
		return getMultiple() != null && getMultiple().getMembers().size() > 1;
	}
}
