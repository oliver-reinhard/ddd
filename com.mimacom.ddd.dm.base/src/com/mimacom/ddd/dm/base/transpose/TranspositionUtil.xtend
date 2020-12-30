package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Maps
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

class TranspositionUtil {

	public static val TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX = "transpositionSourceTypeQN="
	
	public static val TRANSPOSITION_INDEX_ENTRY_MARKER = "@"

	public static val KEY_TRANSPOSITION_TARGET_TYPE = "TRANSPOSITION_TARGET_TYPE"

	static def boolean isTransposedTypeProxyURI(URI uri) {
		if (uri === null) return false
		val fragment = uri.fragment();
		return fragment !== null && fragment.startsWith(TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX)
	}
	
	static def String getTransposedTypeProxyUriFragment(QualifiedName qualifiedName) {
		return TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX + getTranspositionSourceQNForIndex(qualifiedName.toString)
	}

	static def QualifiedName getTranspositionSourceQN(URI proxyUri) {
		if (proxyUri === null) return null
		val fragment = proxyUri.fragment();
		if (fragment === null || ! fragment.startsWith(TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX)) return null
		// remove prefix:
		val sourceQNStr = fragment.substring(TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX.length)
		return QualifiedName.create(sourceQNStr.split("\\."))
	}
	
	static def QualifiedName getTranspositionSourceQNForIndex(String qualifiedName) {
		return QualifiedName.create(qualifiedName.split("\\.")).append(TRANSPOSITION_INDEX_ENTRY_MARKER)
	}
	
	static def QualifiedName getTranspositionSourceQNForIndex(QualifiedName qualifiedName) {
		return getTranspositionSourceQNForIndex(qualifiedName.toString)
	}

	static def QualifiedName getTranspositionTargetQN(IEObjectDescription description) {
		return QualifiedName.create(description.getUserData(KEY_TRANSPOSITION_TARGET_TYPE).split("\\."))
	}

	static def Map<String, String> createEObjectDescriptionUserData(QualifiedName targetQN) {
		val userData = Maps.newHashMap
		userData.put(KEY_TRANSPOSITION_TARGET_TYPE, targetQN.toString)
		return userData
	}
}
