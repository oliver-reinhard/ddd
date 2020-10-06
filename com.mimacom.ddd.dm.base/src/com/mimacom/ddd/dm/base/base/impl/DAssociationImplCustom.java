package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.impl.DAssociationImpl;

public class DAssociationImplCustom extends DAssociationImpl {

	@Override
	public DComplexType getSourceType() {
		if (eContainer() != null) {
			return (DComplexType) eContainer();
		}
		return null;
	}
	
	@Override
	public DEntityType getTargetType() {
		if (getType() instanceof DEntityType) {
			return (DEntityType) getType();
		}
		return null;
	}
} 
