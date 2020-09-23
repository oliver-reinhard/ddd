/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SInformation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#isGenerate <em>Generate</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getIndexingHelper <em>Indexing Helper</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel()
 * @model
 * @generated
 */
public interface SInformationModel extends DModel, IDiagramRoot, IAggregateContainer, ITypeContainer, IStaticReferenceTarget
{
	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #setGenerate(boolean)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Generate()
	 * @model
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate</em>' attribute.
	 * @see #isGenerate()
	 * @generated
	 */
	void setGenerate(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.SInformationModelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @see #setKind(SInformationModelKind)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Kind()
	 * @model
	 * @generated
	 */
	SInformationModelKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SInformationModelKind value);

	/**
	 * Returns the value of the '<em><b>Indexing Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexing Helper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexing Helper</em>' containment reference.
	 * @see #setIndexingHelper(STypeMapping)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_IndexingHelper()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	STypeMapping getIndexingHelper();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#getIndexingHelper <em>Indexing Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexing Helper</em>' containment reference.
	 * @see #getIndexingHelper()
	 * @generated
	 */
	void setIndexingHelper(STypeMapping value);

} // SInformationModel
