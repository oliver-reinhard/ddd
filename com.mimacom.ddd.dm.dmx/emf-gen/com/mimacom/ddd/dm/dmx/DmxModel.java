/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxModel#getTexts <em>Texts</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxModel#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxModel()
 * @model
 * @generated
 */
public interface DmxModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Texts</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DRichText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texts</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxModel_Texts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DRichText> getTexts();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxModel_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getExpressions();

} // DmxModel
