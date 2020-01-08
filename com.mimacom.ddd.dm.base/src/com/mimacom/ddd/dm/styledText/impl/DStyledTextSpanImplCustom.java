package com.mimacom.ddd.dm.styledText.impl;

public class DStyledTextSpanImplCustom extends DStyledTextSpanImpl {
	
	@Override
	public boolean isLeaf() {
		return getSubspans().isEmpty();
	}

}
