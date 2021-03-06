package com.mimacom.ddd.dm.base.base.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DNavigableMember;

public class DComplexTypeImplCustom extends DComplexTypeImpl {

	public DComplexTypeImplCustom() {
		primitive = false;
	}
	
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		EList<DNavigableMember> members = new BasicInternalEList<>(DNavigableMember.class);
		DComplexType st = this;
		while(st != null) {
			members.addAll(st.getFeatures());
			st = st.getSuperType();
		}
		return members;
	}
	
}
