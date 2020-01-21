package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class DDomainEventImplCustom extends DDomainEventImpl {

	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicEList<>();
		members.addAll(getContext());
		members.add(getTrigger());
		members.addAll(getNotifications());
		return members;
	}
}
