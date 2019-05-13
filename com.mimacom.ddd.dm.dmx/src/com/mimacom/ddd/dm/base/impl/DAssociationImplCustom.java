package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEntityType;

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
