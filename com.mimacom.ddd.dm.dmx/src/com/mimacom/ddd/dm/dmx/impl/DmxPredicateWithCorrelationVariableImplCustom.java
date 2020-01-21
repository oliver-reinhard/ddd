package com.mimacom.ddd.dm.dmx.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class DmxPredicateWithCorrelationVariableImplCustom extends DmxPredicateWithCorrelationVariableImpl {

	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicEList<>();
		members.add(getCorrelationVariable());
		return members;
	}
}
