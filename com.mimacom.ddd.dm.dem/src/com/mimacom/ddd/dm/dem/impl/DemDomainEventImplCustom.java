package com.mimacom.ddd.dm.dem.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.dem.DemTrigger;

public class DemDomainEventImplCustom extends DemDomainEventImpl {

	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicInternalEList<>(DNavigableMember.class);
		members.addAll(getContext());
		for (DemTrigger t : getTriggers()) {
			if (t.getActor() != null) {
				members.add(t.getActor());
			}
		}
		members.addAll(getNotifications());
		return members;
	}
}
