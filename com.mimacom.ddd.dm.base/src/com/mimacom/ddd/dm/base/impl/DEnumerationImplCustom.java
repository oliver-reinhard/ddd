package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class DEnumerationImplCustom extends DEnumerationImpl {

	
	@SuppressWarnings("unchecked")
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		return (EList<DNavigableMember>) (Object) getLiterals();
	}
}
