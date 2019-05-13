package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SEntityType;

public class SAssociationImplCustom extends SAssociationImpl {
	
	@Override
	public SEntityType getTargetType() {
		if (getType() instanceof SEntityType) {
			return (SEntityType) getType();
		}
		return null;
	}
} 
