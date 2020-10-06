package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.impl.DMultiplicityImpl;

public class DMultiplicityImplCustom extends DMultiplicityImpl {

	@Override
	public int getMinOccurs() {
		switch (getShorthand()) {
		case ZERO_OR_ONE:
		case ZERO_OR_MORE:
			return 0;
		case ONE_OR_MORE:
			return 1;
		default:
			return super.getMinOccurs();
		}
	}
	
	@Override
	public int getMaxOccurs() {
		switch (getShorthand()) {
		case ZERO_OR_ONE:
			return 1;
		case ONE_OR_MORE:
		case ZERO_OR_MORE:
			return -1;
		default:
			return super.getMaxOccurs();
		}
	}
}
