/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGrab Domain Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SGrabDomainRule#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSGrabDomainRule()
 * @model
 * @generated
 */
public interface SGrabDomainRule extends SDeductionRule
{
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSGrabDomainRule_Domain()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DDomain getDomain();

} // SGrabDomainRule