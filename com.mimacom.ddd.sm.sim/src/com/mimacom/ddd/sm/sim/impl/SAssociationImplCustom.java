package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SRootType;

public class SAssociationImplCustom extends SAssociationImpl {
	
	@Override
	public SRootType getTargetType() {
		if (getType() instanceof SRootType) {
			return (SRootType) getType();
		}
		return null;
	}
} 
