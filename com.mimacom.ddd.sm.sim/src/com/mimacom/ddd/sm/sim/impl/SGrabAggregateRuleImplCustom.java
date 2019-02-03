package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DAggregate;

public class SGrabAggregateRuleImplCustom extends SGrabAggregateRuleImpl {

	@Override
	public DAggregate getAggregate() {
		if (getSource() instanceof DAggregate) return (DAggregate) getSource();
		return null;
	}
}
