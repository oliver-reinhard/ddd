package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DType;

public class DAggregateImplCustom extends DAggregateImpl {

	/**
	 */
	@Override
	public EList<DIdentityType> getRoots() {
		EList<DIdentityType> list = new BasicEList<DIdentityType>();
		for (DType t : getTypes()) {
			if (t instanceof DIdentityType && ((DIdentityType) t).isRoot()) {
				list.add((DIdentityType) t);
			}
		}
		return list;
	}
}
