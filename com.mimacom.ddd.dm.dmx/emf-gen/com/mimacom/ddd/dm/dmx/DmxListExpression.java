/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxListExpression#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxListExpression()
 * @model
 * @generated
 */
public interface DmxListExpression extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxListExpression_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getElements();

} // DmxListExpression
