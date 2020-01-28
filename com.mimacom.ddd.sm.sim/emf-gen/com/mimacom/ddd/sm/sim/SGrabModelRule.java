/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DInformationModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGrab Model Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SGrabModelRule#getDModel <em>DModel</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSGrabModelRule()
 * @model
 * @generated
 */
public interface SGrabModelRule extends DDeductionRule
{
	/**
	 * Returns the value of the '<em><b>DModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DModel</em>' reference.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSGrabModelRule_DModel()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DInformationModel getDModel();

} // SGrabModelRule
