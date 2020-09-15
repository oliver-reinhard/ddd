package com.mimacom.ddd.dm.base.modelDeduction;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

@SuppressWarnings("all")
public class DeductionUtil {
  public static final String DEDUCTION_PROXY_URI_FRAGMENT_PREFIX = "deductionSourceTypeQN=";
  
  public static final String KEY_DEDUCTION_TARGET_TYPE = "DEDUCTION_TARGET_TYPE";
  
  public static boolean isDeductionProxyURI(final URI uri) {
    if ((uri == null)) {
      return false;
    }
    final String fragment = uri.fragment();
    return ((fragment != null) && fragment.startsWith(DeductionUtil.DEDUCTION_PROXY_URI_FRAGMENT_PREFIX));
  }
  
  public static String getDeductionProxyUriFragment(final QualifiedName qualifiedName) {
    QualifiedName _deductionSourceQNForIndex = DeductionUtil.getDeductionSourceQNForIndex(qualifiedName.toString());
    return (DeductionUtil.DEDUCTION_PROXY_URI_FRAGMENT_PREFIX + _deductionSourceQNForIndex);
  }
  
  public static QualifiedName getDeductionSourceQN(final URI proxyUri) {
    if ((proxyUri == null)) {
      return null;
    }
    final String fragment = proxyUri.fragment();
    if (((fragment == null) || (!fragment.startsWith(DeductionUtil.DEDUCTION_PROXY_URI_FRAGMENT_PREFIX)))) {
      return null;
    }
    final String sourceQNStr = fragment.substring(DeductionUtil.DEDUCTION_PROXY_URI_FRAGMENT_PREFIX.length());
    return QualifiedName.create(sourceQNStr.split("\\."));
  }
  
  public static QualifiedName getDeductionTargetQN(final IEObjectDescription description) {
    return QualifiedName.create(description.getUserData(DeductionUtil.KEY_DEDUCTION_TARGET_TYPE).split("\\."));
  }
  
  public static QualifiedName getDeductionSourceQNForIndex(final String qualifiedName) {
    return QualifiedName.create(qualifiedName.split("\\.")).append("@");
  }
  
  public static QualifiedName getDeductionSourceQNForIndex(final QualifiedName qualifiedName) {
    return DeductionUtil.getDeductionSourceQNForIndex(qualifiedName.toString());
  }
  
  public static Map<String, String> createEObjectDescriptionUserData(final QualifiedName targetQN) {
    final HashMap<String, String> userData = Maps.<String, String>newHashMap();
    userData.put(DeductionUtil.KEY_DEDUCTION_TARGET_TYPE, targetQN.toString());
    return userData;
  }
}
