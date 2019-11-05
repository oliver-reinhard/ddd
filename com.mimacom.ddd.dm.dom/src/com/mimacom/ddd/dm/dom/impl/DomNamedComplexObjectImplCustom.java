package com.mimacom.ddd.dm.dom.impl;

import com.mimacom.ddd.dm.base.DType;

public class DomNamedComplexObjectImplCustom extends DomNamedComplexObjectImpl {
	@Override
	public DType getType() {
		if (getObject() != null) return getObject().getType();
		return null;
	}
}
