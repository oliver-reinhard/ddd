package com.mimacom.ddd.dm.base.modelDeduction

import com.google.common.collect.Maps
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

class DeductionHelper {

	public static val DEDUCTION_PROXY_URI_FRAGMENT_PREFIX = "deductionSourceTypeQN="

	public static val KEY_DEDUCTION_TARGET_TYPE = "DEDUCTION_TARGET_TYPE"

	static def boolean isDeductionProxyURI(URI uri) {
		if (uri === null) return false
		val fragment = uri.fragment();
		return fragment !== null && fragment.startsWith(DEDUCTION_PROXY_URI_FRAGMENT_PREFIX)
	}
	
	static def String getDeductionProxyUriFragment(QualifiedName qualifiedName) {
		return DEDUCTION_PROXY_URI_FRAGMENT_PREFIX + getDeductionSourceQNForIndex(qualifiedName.toString)
	}

	static def QualifiedName getDeductionSourceQN(URI proxyUri) {
		if (proxyUri === null) return null
		val fragment = proxyUri.fragment();
		if (fragment === null || ! fragment.startsWith(DEDUCTION_PROXY_URI_FRAGMENT_PREFIX)) return null
		val sourceQNStr = fragment.substring(DEDUCTION_PROXY_URI_FRAGMENT_PREFIX.length)
		return QualifiedName.create(sourceQNStr.split("\\."))
	}

	static def QualifiedName getDeductionTargetQN(IEObjectDescription description) {
		return QualifiedName.create(description.getUserData(KEY_DEDUCTION_TARGET_TYPE).split("\\."))
	}
	
	static def QualifiedName getDeductionSourceQNForIndex(String qualifiedName) {
		return QualifiedName.create(qualifiedName.split("\\.")).append("@")
	}
	
	static def QualifiedName getDeductionSourceQNForIndex(QualifiedName qualifiedName) {
		return getDeductionSourceQNForIndex(qualifiedName.toString)
	}

	static def Map<String, String> createEObjectDescriptionUserData(QualifiedName targetQN) {
		val userData = Maps.newHashMap
		userData.put(KEY_DEDUCTION_TARGET_TYPE, targetQN.toString)
		return userData
	}
}
