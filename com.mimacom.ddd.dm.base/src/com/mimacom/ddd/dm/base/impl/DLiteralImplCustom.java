package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.DNavigableMember;

public class DLiteralImplCustom extends DLiteralImpl implements DNavigableMember {

	@Override
	public DMultiplicity getMultiplicity() {
		return null;
	}

	@Override
	public DType getType() {
		return null; 
	}
}
