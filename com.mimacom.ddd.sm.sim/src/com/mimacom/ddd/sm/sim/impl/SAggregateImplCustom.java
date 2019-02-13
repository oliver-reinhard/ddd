package com.mimacom.ddd.sm.sim.impl;

import static com.mimacom.ddd.sm.sim.SElementNature.DEDUCTION_RULE;
import static com.mimacom.ddd.sm.sim.SElementNature.GENUINE;
import static com.mimacom.ddd.sm.sim.SElementNature.SYNTHETIC;

import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SRootType;
import com.mimacom.ddd.sm.sim.SType;

public class SAggregateImplCustom extends SAggregateImpl {

	public static final String NO_ROOT_DEFAULT_NAME = "NONE";

	/**
	 * Return the Aggregat's compulsory RootType.
	 */
	@Override
	public SRootType basicGetRoot() {
		for (SType t : getTypes()) {
			if (t instanceof SRootType) {
				return (SRootType) t;
			}
		}
		return null;
	}
	
	@Override
	public String getRootName() {
		final SRootType root = getRoot();
		if (root != null) {
			return root.getName();
		}
		return NO_ROOT_DEFAULT_NAME;
	}
	
	@Override
	public SElementNature getNature() {
		if (isSetSynthetic() && synthetic) return SYNTHETIC;
		if (deductionRule != null) return DEDUCTION_RULE;
		return GENUINE;
	}
}
