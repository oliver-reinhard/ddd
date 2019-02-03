package com.mimacom.ddd.sm.sim.impl;

public class SPrimitiveImplCustom extends SPrimitiveImpl {
	
	@Override
	public boolean isArchetype() {
		return redefines == null;
	}
}
