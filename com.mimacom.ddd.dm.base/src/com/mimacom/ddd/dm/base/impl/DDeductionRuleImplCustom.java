package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.DNamedElement;

public class DDeductionRuleImplCustom extends DDeductionRuleImpl {

	@Override
	public DNamedElement getNamedSource() {
		if (getSource() instanceof DNamedElement) return (DNamedElement)  getSource();
		return null;
	}
}
