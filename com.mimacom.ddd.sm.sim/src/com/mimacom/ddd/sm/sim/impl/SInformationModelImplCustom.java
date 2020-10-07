package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SInformationModelKind;

public class SInformationModelImplCustom extends SInformationModelImpl {
	
	@Override
	public boolean allowsIdentityTypes() {
		return kind == SInformationModelKind.CORE;
	}

}
