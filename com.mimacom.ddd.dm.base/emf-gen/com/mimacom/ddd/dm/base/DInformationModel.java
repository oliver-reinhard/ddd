/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DInformation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DInformationModel#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDInformationModel()
 * @model
 * @generated
 */
public interface DInformationModel extends DNamespace, IAggregateContainer, ITypeContainer, IStaticReferenceTarget, IDeducibleElement, IDiagramRoot
{
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDInformationModel_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DInformationModel#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

} // DInformationModel
