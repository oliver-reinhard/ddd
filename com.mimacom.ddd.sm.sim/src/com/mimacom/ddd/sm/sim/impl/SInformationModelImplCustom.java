package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SystemInformationModelKind;

public class SInformationModelImplCustom extends SystemInformationModelImpl {
	
	@Override
	public boolean allowsIdentityTypes() {
		return kind == SystemInformationModelKind.CORE;
	}

}
