package com.mimacom.ddd.dm.dmx.impl;

import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.base.DNavigableMember;

public class DmxTestImplCustom extends DmxTestImpl {

	@SuppressWarnings("unchecked")
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		return (EList<DNavigableMember>) (Object) getContext();
	}

}
