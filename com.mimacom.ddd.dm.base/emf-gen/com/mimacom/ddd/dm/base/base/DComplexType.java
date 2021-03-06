/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DComplex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DComplexType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DComplexType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DComplexType#isReadOnlyView <em>Read Only View</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDComplexType()
 * @model abstract="true"
 * @generated
 */
public interface DComplexType extends DType, IFeatureContainer, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDComplexType_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DComplexType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(DComplexType)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDComplexType_SuperType()
	 * @model
	 * @generated
	 */
	DComplexType getSuperType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DComplexType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(DComplexType value);

	/**
	 * Returns the value of the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only View</em>' attribute.
	 * @see #setReadOnlyView(boolean)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDComplexType_ReadOnlyView()
	 * @model
	 * @generated
	 */
	boolean isReadOnlyView();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DComplexType#isReadOnlyView <em>Read Only View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only View</em>' attribute.
	 * @see #isReadOnlyView()
	 * @generated
	 */
	void setReadOnlyView(boolean value);

} // DComplexType
