package com.mimacom.ddd.dm.base.base.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;

import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.transpose.TransposeAwareResource;
import com.mimacom.ddd.dm.base.transpose.TransposeUtil;

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
		final QualifiedName sourceQN = TransposeUtil.getDeductionSourceQN(proxy.eProxyURI());
		if (sourceQN != null && !sourceQN.isEmpty()) {
			final Resource resource = eResource();
			if (resource instanceof TransposeAwareResource) {
				return ((TransposeAwareResource) resource).deduceTargetObject(sourceQN, this);
			}
		}
		return super.eResolveProxy(proxy);
	}
}
