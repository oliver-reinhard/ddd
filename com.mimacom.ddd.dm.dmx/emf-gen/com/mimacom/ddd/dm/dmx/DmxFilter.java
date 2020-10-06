/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DNavigableMember;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#getTypeDesc <em>Type Desc</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#getWithTypeSet <em>With Type Set</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter()
 * @model
 * @generated
 */
public interface DmxFilter extends DNavigableMember
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dmx.DmxFilterParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmxFilterParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Type Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Desc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Desc</em>' containment reference.
	 * @see #setTypeDesc(DmxFilterTypeDescriptor)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_TypeDesc()
	 * @model containment="true"
	 * @generated
	 */
	DmxFilterTypeDescriptor getTypeDesc();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getTypeDesc <em>Type Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Desc</em>' containment reference.
	 * @see #getTypeDesc()
	 * @generated
	 */
	void setTypeDesc(DmxFilterTypeDescriptor value);

	/**
	 * Returns the value of the '<em><b>With Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Type Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Type Set</em>' containment reference.
	 * @see #setWithTypeSet(DmxBaseTypeSet)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_WithTypeSet()
	 * @model containment="true"
	 * @generated
	 */
	DmxBaseTypeSet getWithTypeSet();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getWithTypeSet <em>With Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Type Set</em>' containment reference.
	 * @see #getWithTypeSet()
	 * @generated
	 */
	void setWithTypeSet(DmxBaseTypeSet value);

} // DmxFilter
