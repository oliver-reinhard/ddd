package com.mimacom.ddd.dm.base.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;

import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.modelDeduction.DeductionUtil;
import com.mimacom.ddd.dm.base.modelDeduction.IDeductionAwareResource;

public class DNavigableMemberImplCustom extends DNavigableMemberImpl {

	@Override
	public boolean isOptional() {
		final DMultiplicity multi = getMultiplicity();
		return multi != null && multi.getMinOccurs() == 0;
	}

	@Override
	public boolean isCollection() {
		final DMultiplicity multi = getMultiplicity();
		return multi != null && (multi.getMaxOccurs() > 1 || multi.getMaxOccurs() == -1);
	}

	public EObject eResolveProxy(InternalEObject proxy) {
		final QualifiedName sourceQN = DeductionUtil.getDeductionSourceQN(proxy.eProxyURI());
		if (sourceQN != null && !sourceQN.isEmpty()) {
			final Resource resource = eResource();
			if (resource instanceof IDeductionAwareResource) {
				return ((IDeductionAwareResource) resource).deduceTargetObject(sourceQN, this);
			}
		}
		return super.eResolveProxy(proxy);
	}
}
