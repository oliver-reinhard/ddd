package com.mimacom.ddd.sm.sim.impl;

import static com.mimacom.ddd.sm.sim.SElementNature.DEDUCTION_RULE;
import static com.mimacom.ddd.sm.sim.SElementNature.GENUINE;
import static com.mimacom.ddd.sm.sim.SElementNature.SYNTHETIC;

import com.mimacom.ddd.sm.sim.SElementNature;

public class SDomainProxyImplCustom extends SDomainProxyImpl {
	
	@Override
	public SElementNature getNature() {
		if (synthetic) return SYNTHETIC;
		if (deductionRule != null) return DEDUCTION_RULE;
		return GENUINE;
	}
}
