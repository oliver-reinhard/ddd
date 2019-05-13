package com.mimacom.ddd.sm.sim.impl;

import static com.mimacom.ddd.sm.sim.SElementNature.DEDUCTION_RULE;
import static com.mimacom.ddd.sm.sim.SElementNature.GENUINE;
import static com.mimacom.ddd.sm.sim.SElementNature.SYNTHETIC;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEntityType;
import com.mimacom.ddd.sm.sim.SType;

public class SAggregateImplCustom extends SAggregateImpl {



	public static final String NO_ROOT_DERIVED_NAME = "NO ROOT";

	/**
	 * Return the Aggregat's compulsory root EnttyTypes.
	 */
	@Override
	public EList<SEntityType> getRoots() {
		EList<SEntityType> list = new BasicEList<SEntityType>();
		for (SType t : getTypes()) {
			if (t instanceof SEntityType && ((SEntityType) t).isRoot()) {
				list.add((SEntityType) t);
			}
		}
		return list;
	}

	@Override
	public String getDerivedName() {
		EList<SEntityType> roots = getRoots();
		if (roots.size() == 1)
			return roots.get(0).getName();
		for (SEntityType r : roots) {
			if (r.getSuperType() != this)
				return r.getName();
		}
		return NO_ROOT_DERIVED_NAME;
	}
	
	@Override
	public SElementNature getNature() {
		if (synthetic) return SYNTHETIC;
		if (deductionRule != null) return DEDUCTION_RULE;
		return GENUINE;
	}
}
