package com.mimacom.ddd.dm.base.base.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DType;

public class DAggregateImplCustom extends DAggregateImpl {

	/**
	 */
	@Override
	public EList<DEntityType> getRoots() {
		EList<DEntityType> list = new BasicInternalEList<DEntityType>(DEntityType.class);
		for (DType t : getTypes()) {
			if (t instanceof DEntityType && ((DEntityType) t).isRoot()) {
				list.add((DEntityType) t);
			}
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public EList<DNavigableMember> getNavigableMembers() {
		return (EList<DNavigableMember>) (Object) getFeatures();
	}
}
