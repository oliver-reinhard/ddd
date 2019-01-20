package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DType;

public class DAggregateImplCustom extends DAggregateImpl {
	
	public static final String NO_ROOT_DEFAULT_NAME = "NONE";

	/**
	 * Return the Aggregat's compulsory RootType.
	 */
	@Override
	public DIdentityType getRoot() {
		for (DType t : getTypes()) {
			if (t instanceof DIdentityType) {
				return (DIdentityType) t;
			}
		}
		return null;
	}
	
	@Override
	public String getRootName() {
		final DIdentityType root = getRoot();
		if (root != null) {
			return root.getName();
		}
		return NO_ROOT_DEFAULT_NAME;
	}

} 
