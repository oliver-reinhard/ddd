package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.transpose.impl.TTranspositionRuleImpl;

public class TTranspositionRuleImplCustom extends TTranspositionRuleImpl {

	@Override
	public DNamedElement getNamedSource() {
		if (getSource() instanceof DNamedElement) return (DNamedElement)  getSource();
		return null;
	}
}
