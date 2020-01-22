/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.impl;

import com.mimacom.ddd.dm.base.DImport;

import com.mimacom.ddd.dm.base.impl.DNamedElementImpl;

import com.mimacom.ddd.dm.dom.DomModel;
import com.mimacom.ddd.dm.dom.DomPackage;
import com.mimacom.ddd.dm.dom.DomSnapshot;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dom.impl.DomModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dom.impl.DomModelImpl#getSnapshots <em>Snapshots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomModelImpl extends DNamedElementImpl implements DomModel
{
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DImport> imports;

	/**
	 * The cached value of the '{@link #getSnapshots() <em>Snapshots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshots()
	 * @generated
	 * @ordered
	 */
	protected EList<DomSnapshot> snapshots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomModelImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DomPackage.Literals.DOM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DImport> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<DImport>(DImport.class, this, DomPackage.DOM_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	@Override
=======
>>>>>>> refs/heads/master
	public EList<DomSnapshot> getSnapshots()
	{
		if (snapshots == null)
		{
			snapshots = new EObjectContainmentEList<DomSnapshot>(DomSnapshot.class, this, DomPackage.DOM_MODEL__SNAPSHOTS);
		}
		return snapshots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DomPackage.DOM_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case DomPackage.DOM_MODEL__SNAPSHOTS:
				return ((InternalEList<?>)getSnapshots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DomPackage.DOM_MODEL__IMPORTS:
				return getImports();
			case DomPackage.DOM_MODEL__SNAPSHOTS:
				return getSnapshots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DomPackage.DOM_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DImport>)newValue);
				return;
			case DomPackage.DOM_MODEL__SNAPSHOTS:
				getSnapshots().clear();
				getSnapshots().addAll((Collection<? extends DomSnapshot>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case DomPackage.DOM_MODEL__IMPORTS:
				getImports().clear();
				return;
			case DomPackage.DOM_MODEL__SNAPSHOTS:
				getSnapshots().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case DomPackage.DOM_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case DomPackage.DOM_MODEL__SNAPSHOTS:
				return snapshots != null && !snapshots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomModelImpl
