package com.mimacom.ddd.dm.base.impl;

public class DPrimitiveImplCustom extends DPrimitiveImpl {

	@Override
	public boolean isArchetype() {
		return redefines == null;
	}
}
