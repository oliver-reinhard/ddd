package com.mimacom.ddd.sm.sms.impl;

public class SPrimitiveImplCustom extends SPrimitiveImpl {
	
	@Override
	public boolean isArchetype() {
		return redefines == null;
	}
}
