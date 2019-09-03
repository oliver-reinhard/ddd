package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.esm.EsmLayoutDirection;

public class EsmCompositeStateImplCustom extends EsmCompositeStateImpl {
	@Override
	public EsmLayoutDirection getDirection() {
		return EsmLayoutUtil.getDirection(this, super.getDirection());
	}
}
