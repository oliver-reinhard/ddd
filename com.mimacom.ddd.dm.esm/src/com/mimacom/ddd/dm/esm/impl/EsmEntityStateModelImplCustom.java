package com.mimacom.ddd.dm.esm.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.esm.EsmLayoutDirection;

public class EsmEntityStateModelImplCustom extends EsmEntityStateModelImpl {
	
	@Override
	public EsmLayoutDirection getDirection() {
		return EsmLayoutUtil.getDirection(this, super.getDirection());
	}
	
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		if (getForType() != null) {
			return getForType().getNavigableMembers();
		}
		return new BasicInternalEList<DNavigableMember>(DNavigableMember.class);
	}
}
