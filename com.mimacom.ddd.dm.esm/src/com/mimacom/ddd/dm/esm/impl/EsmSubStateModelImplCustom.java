package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.esm.EsmLayoutDirection;

public class EsmSubStateModelImplCustom extends EsmSubStateModelImpl {
	@Override
	public EsmLayoutDirection getDirection() {
//		return EsmLayoutUtil.getDirection(this, super.getDirection());
		return EsmLayoutDirection.RIGHT;
	}
}
