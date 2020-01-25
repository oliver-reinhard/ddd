package com.mimacom.ddd.dm.dem.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DNavigableMember;

public class DNotificationImplCustom extends DNotificationImpl {

	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicEList<>();
		members.add(getMessage());
		members.add(getNotified());
		return members;
	}
}
