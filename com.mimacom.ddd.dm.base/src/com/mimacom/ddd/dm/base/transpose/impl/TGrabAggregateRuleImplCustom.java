package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.transpose.impl.TGrabAggregateRuleImpl;

public class TGrabAggregateRuleImplCustom extends TGrabAggregateRuleImpl {

	@Override
	public DAggregate getAggregate() {
		if (getSource() instanceof DAggregate) return (DAggregate) getSource();
		return null;
	}
}
