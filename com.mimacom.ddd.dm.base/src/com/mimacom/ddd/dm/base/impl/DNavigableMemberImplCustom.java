package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.DMultiplicity;

public class DNavigableMemberImplCustom extends DNavigableMemberImpl {

	@Override
	public boolean isOptional() {
		final DMultiplicity multi = getMultiplicity();
		return  multi != null && multi.getMinOccurs() > 0;
	}
	
	@Override
	public boolean isCollection() {
		final DMultiplicity multi = getMultiplicity();
		return  multi != null && (multi.getMaxOccurs() > 1 || multi.getMaxOccurs() == -1);
	}
}
