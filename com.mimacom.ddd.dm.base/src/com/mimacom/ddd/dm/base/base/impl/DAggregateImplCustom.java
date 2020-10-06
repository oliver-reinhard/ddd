package com.mimacom.ddd.dm.base.base.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.impl.DAggregateImpl;

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
