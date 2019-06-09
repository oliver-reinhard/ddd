package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DType;

public class DAggregateImplCustom extends DAggregateImpl {

	public static final String NO_ROOT_DERIVED_NAME = "WITHOUT_ROOT";

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

	@Override
	public String getDerivedName() {
		EList<DIdentityType> roots = getRoots();
		if (roots.size() == 1)
			return roots.get(0).getName();
		for (DIdentityType r : roots) {
			DComplexType superType = r.getSuperType();
			if (superType == null || superType.eContainer() != this)
				return r.getName();
		}
		return NO_ROOT_DERIVED_NAME;
	}

}
