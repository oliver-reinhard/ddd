package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.impl.TAssociationTranspositionImpl;

public class TAssociationTranspositionImplCustom extends TAssociationTranspositionImpl {
	
	@Override
	public TEntityTypeTransposition getTargetType() {
		if (getType() instanceof TEntityTypeTransposition) {
			return (TEntityTypeTransposition) getType();
		}
		return null;
	}
} 
