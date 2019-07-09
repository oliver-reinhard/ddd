package com.mimacom.ddd.sm.sim.impl;

public class SPrimitiveDeductionImplCustom extends SPrimitiveDeductionImpl {
	
	@Override
	public boolean isArchetype() {
		return redefines == null;
	}
}
