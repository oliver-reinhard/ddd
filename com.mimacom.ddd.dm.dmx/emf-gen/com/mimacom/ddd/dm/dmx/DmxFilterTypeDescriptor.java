/**
 */
package com.mimacom.ddd.dm.dmx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getSingle <em>Single</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCollection <em>Collection</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isMultiTyped <em>Multi Typed</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterTypeDescriptor()
 * @model
 * @generated
 */
public interface DmxFilterTypeDescriptor extends EObject
{
	/**
	 * Returns the value of the '<em><b>Single</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setSingle(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterTypeDescriptor_Single()
	 * @model
	 * @generated
	 */
	DmxBaseType getSingle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getSingle <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #getSingle()
	 * @generated
	 */
	void setSingle(DmxBaseType value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' reference.
	 * @see #setMultiple(DmxBaseTypeSet)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterTypeDescriptor_Multiple()
	 * @model
	 * @generated
	 */
	DmxBaseTypeSet getMultiple();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getMultiple <em>Multiple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' reference.
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(DmxBaseTypeSet value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see #setCollection(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterTypeDescriptor_Collection()
	 * @model
	 * @generated
	 */
	boolean isCollection();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see #isCollection()
	 * @generated
	 */
	void setCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Typed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Typed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Typed</em>' attribute.
	 * @see #setMultiTyped(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterTypeDescriptor_MultiTyped()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMultiTyped();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isMultiTyped <em>Multi Typed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Typed</em>' attribute.
	 * @see #isMultiTyped()
	 * @generated
	 */
	void setMultiTyped(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatible(DmxBaseType type, boolean collection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatible(DmxBaseType type);

} // DmxFilterTypeDescriptor
