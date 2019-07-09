package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SEntityTypeDeduction;

public class SAssociationDeductionImplCustom extends SAssociationDeductionImpl {
	
	@Override
	public SEntityTypeDeduction getTargetType() {
		if (getType() instanceof SEntityTypeDeduction) {
			return (SEntityTypeDeduction) getType();
		}
		return null;
	}
} 
