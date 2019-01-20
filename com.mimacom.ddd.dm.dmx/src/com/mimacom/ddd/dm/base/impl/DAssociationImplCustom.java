package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DRootType;

public class DAssociationImplCustom extends DAssociationImpl {

	@Override
	public DComplexType getSourceType() {
		if (eContainer() != null) {
			return (DComplexType) eContainer();
		}
		return null;
	}
	
	@Override
	public DRootType getTargetType() {
		if (getType() instanceof DRootType) {
			return (DRootType) getType();
		}
		return null;
	}
} 
