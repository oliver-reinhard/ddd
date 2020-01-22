/**
 */
package com.mimacom.ddd.pub.pub.impl;

<<<<<<< HEAD
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.PubPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PartImpl extends DivisionImpl implements Part {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.PART;
=======
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.PublicationBody;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PartImpl extends DivisionImpl implements Part {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSequenceNumber() {
		EObject _eContainer = this.eContainer();
		if ((_eContainer instanceof PublicationBody)) {
			EObject _eContainer_1 = this.eContainer();
			return ((PublicationBody) _eContainer_1).getDivisions().indexOf(this);
		}
		return (-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NumberedElement.class) {
			switch (baseOperationID) {
				case PubPackage.NUMBERED_ELEMENT___GET_SEQUENCE_NUMBER: return PubPackage.PART___GET_SEQUENCE_NUMBER;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Division.class) {
			switch (baseOperationID) {
				case PubPackage.DIVISION___GET_SEQUENCE_NUMBER: return PubPackage.PART___GET_SEQUENCE_NUMBER;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PubPackage.PART___GET_SEQUENCE_NUMBER:
				return getSequenceNumber();
		}
		return super.eInvoke(operationID, arguments);
>>>>>>> refs/remotes/origin/master
	}

} //PartImpl
