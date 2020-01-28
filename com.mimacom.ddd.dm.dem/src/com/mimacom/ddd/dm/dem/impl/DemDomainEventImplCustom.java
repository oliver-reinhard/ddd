package com.mimacom.ddd.dm.dem.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class DemDomainEventImplCustom extends DemDomainEventImpl {

	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicEList<>();
		members.addAll(getContext());
		members.addAll(getTriggers());
		members.addAll(getNotifications());
		return members;
	}
}
