package com.mimacom.ddd.sm.sim.impl;

import static com.mimacom.ddd.sm.sim.SElementNature.*;

import com.mimacom.ddd.sm.sim.SElementNature;

public class SNamedDeducibleElementImplCustom extends SNamedDeducibleElementImpl {

	@Override
	public SElementNature getNature() {
		if (synthetic) return SYNTHETIC;
		if (deductionRule != null) return DEDUCTION_RULE;
		return GENUINE;
	}
}
