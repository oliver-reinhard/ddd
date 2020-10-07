package com.mimacom.ddd.dm.base.transpose;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

@SuppressWarnings("all")
public class TranspositionUtil {
  public static final String TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX = "transpositionSourceTypeQN=";
  
  public static final String KEY_TRANSPOSITION_TARGET_TYPE = "TRANSPOSITION_TARGET_TYPE";
  
  public static boolean isTransposedTypeProxyURI(final URI uri) {
    if ((uri == null)) {
      return false;
    }
    final String fragment = uri.fragment();
    return ((fragment != null) && fragment.startsWith(TranspositionUtil.TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX));
  }
  
  public static String getTransposedTypeProxyUriFragment(final QualifiedName qualifiedName) {
    QualifiedName _transpositionSourceQNForIndex = TranspositionUtil.getTranspositionSourceQNForIndex(qualifiedName.toString());
    return (TranspositionUtil.TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX + _transpositionSourceQNForIndex);
  }
  
  public static QualifiedName getTranspositionSourceQN(final URI proxyUri) {
    if ((proxyUri == null)) {
      return null;
    }
    final String fragment = proxyUri.fragment();
    if (((fragment == null) || (!fragment.startsWith(TranspositionUtil.TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX)))) {
      return null;
    }
    final String sourceQNStr = fragment.substring(TranspositionUtil.TRANSPOSITION_PROXY_URI_FRAGMENT_PREFIX.length());
    return QualifiedName.create(sourceQNStr.split("\\."));
  }
  
  public static QualifiedName getTranspositionSourceQNForIndex(final String qualifiedName) {
    return QualifiedName.create(qualifiedName.split("\\.")).append("@");
  }
  
  public static QualifiedName getTranspositionSourceQNForIndex(final QualifiedName qualifiedName) {
    return TranspositionUtil.getTranspositionSourceQNForIndex(qualifiedName.toString());
  }
  
  public static QualifiedName getTranspositionTargetQN(final IEObjectDescription description) {
    return QualifiedName.create(description.getUserData(TranspositionUtil.KEY_TRANSPOSITION_TARGET_TYPE).split("\\."));
  }
  
  public static Map<String, String> createEObjectDescriptionUserData(final QualifiedName targetQN) {
    final HashMap<String, String> userData = Maps.<String, String>newHashMap();
    userData.put(TranspositionUtil.KEY_TRANSPOSITION_TARGET_TYPE, targetQN.toString());
    return userData;
  }
}
