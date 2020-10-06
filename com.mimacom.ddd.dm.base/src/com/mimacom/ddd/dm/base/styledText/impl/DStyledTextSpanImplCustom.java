package com.mimacom.ddd.dm.base.styledText.impl;

import com.mimacom.ddd.dm.base.styledText.impl.DStyledTextSpanImpl;

public class DStyledTextSpanImplCustom extends DStyledTextSpanImpl {
	
	@Override
	public boolean isLeaf() {
		return getSubspans().isEmpty();
	}

}
