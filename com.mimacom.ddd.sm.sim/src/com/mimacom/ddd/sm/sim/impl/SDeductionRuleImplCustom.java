package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DNamedElement;

public class SDeductionRuleImplCustom extends SDeductionRuleImpl {
 
	@Override
	public DNamedElement getNamedSource() {
		if (getSource() instanceof DNamedElement) return (DNamedElement)  getSource();
		return null;
	}
}
