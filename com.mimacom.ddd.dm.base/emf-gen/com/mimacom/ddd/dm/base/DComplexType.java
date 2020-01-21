/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DComplex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DComplexType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DComplexType#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDComplexType()
 * @model abstract="true"
 * @generated
 */
public interface DComplexType extends DType, IFeatureContainer, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDComplexType_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DComplexType#isAbstract <em>Abstract</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(DComplexType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDComplexType_SuperType()
	 * @model
	 * @generated
	 */
	DComplexType getSuperType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DComplexType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(DComplexType value);

<<<<<<< Upstream, based on 31adbbe530a348e8e7950d43c70d55be3ba288b1
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDComplexType_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFeature> getFeatures();

=======
>>>>>>> 0d09db5 SIM: update to enhanced BASE model and semantics
} // DComplexType
