package com.mimacom.ddd.sm.asm.impl;

import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class SServiceOperationImplCustom extends SServiceOperationImpl {

	@SuppressWarnings("unchecked")
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		return (EList<DNavigableMember>) (Object) getParameters();
	}
}
