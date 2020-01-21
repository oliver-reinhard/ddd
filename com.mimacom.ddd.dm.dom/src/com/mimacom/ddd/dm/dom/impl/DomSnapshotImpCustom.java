package com.mimacom.ddd.dm.dom.impl;

import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class DomSnapshotImpCustom extends DomSnapshotImpl {

	@SuppressWarnings("unchecked")
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		return (EList<DNavigableMember>) (Object) getObjects();
	}
}
