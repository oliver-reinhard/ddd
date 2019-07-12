/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getQueries <em>Queries</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getDomainProxies <em>Domain Proxies</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel()
 * @model
 * @generated
 */
public interface SInformationModel extends INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DRichText)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Description()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getDescription();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DRichText value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DImport> getImports();

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SCoreQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<SCoreQuery> getQueries();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DType> getTypes();

	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DAggregate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Aggregates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAggregate> getAggregates();

	/**
	 * Returns the value of the '<em><b>Domain Proxies</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SDomainDeduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Proxies</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_DomainProxies()
	 * @model containment="true"
	 * @generated
	 */
	EList<SDomainDeduction> getDomainProxies();

} // SInformationModel
