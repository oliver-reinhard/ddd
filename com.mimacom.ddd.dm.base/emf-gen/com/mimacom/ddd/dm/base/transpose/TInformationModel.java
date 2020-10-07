/**
 */
package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.DInformationModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TInformation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TInformationModel#getIndexingHelper <em>Indexing Helper</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTInformationModel()
 * @model
 * @generated
 */
public interface TInformationModel extends DInformationModel
{
	/**
	 * Returns the value of the '<em><b>Indexing Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexing Helper</em>' containment reference.
	 * @see #setIndexingHelper(TTypeMapping)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTInformationModel_IndexingHelper()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	TTypeMapping getIndexingHelper();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TInformationModel#getIndexingHelper <em>Indexing Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexing Helper</em>' containment reference.
	 * @see #getIndexingHelper()
	 * @generated
	 */
	void setIndexingHelper(TTypeMapping value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean allowsIdentityTypes();

} // TInformationModel
