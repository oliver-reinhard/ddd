package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.impl.DLiteralImpl;

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
