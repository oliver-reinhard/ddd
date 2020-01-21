package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DNavigableMember;

public class DComplexTypeImplCustom extends DComplexTypeImpl {

	public DComplexTypeImplCustom() {
		primitive = false;
	}
	
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicEList<>();
		DComplexType st = this;
		while(st != null) {
			members.addAll(st.getFeatures());
			st = st.getSuperType();
		}
		return members;
	}
	
}
