package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DType;

public class DAggregateImplCustom extends DAggregateImpl {

	/**
	 */
	@Override
	public EList<DEntityType> getRoots() {
		EList<DEntityType> list = new BasicEList<DEntityType>();
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
