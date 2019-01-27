package com.mimacom.ddd.sm.sms.impl;

import static com.mimacom.ddd.sm.sms.SElementNature.*;

import com.mimacom.ddd.sm.sms.SElementNature;

public class SDeducibleElementImplCustom extends SDeducibleElementImpl {

	@Override
	public SElementNature getNature() {
		if (deductionRule != null) return DEDUCTION_RULE;
		if (isSetSynthetic() && synthetic) return SYNTHETIC;
		return GENUINE;
	}
}
