package com.mimacom.ddd.dm.dmx.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import com.mimacom.ddd.dm.base.base.DNavigableMember;

public class DmxPredicateWithCorrelationVariableImplCustom extends DmxPredicateWithCorrelationVariableImpl {

	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicInternalEList<>(DNavigableMember.class);
		members.add(getCorrelationVariable());
		return members;
	}
}
