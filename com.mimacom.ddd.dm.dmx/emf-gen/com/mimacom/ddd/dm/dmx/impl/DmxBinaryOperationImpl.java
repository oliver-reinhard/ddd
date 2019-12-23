/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxBinaryOperationImpl extends DExpressionImpl implements DmxBinaryOperation
{
	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected DExpression leftOperand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final DmxBinaryOperator OPERATOR_EDEFAULT = DmxBinaryOperator.ADD;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected DmxBinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected DExpression rightOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxBinaryOperationImpl()
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
		return DmxPackage.Literals.DMX_BINARY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getLeftOperand()
	{
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperand(DExpression newLeftOperand, NotificationChain msgs)
	{
		DExpression oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftOperand(DExpression newLeftOperand)
	{
		if (newLeftOperand != leftOperand)
		{
			NotificationChain msgs = null;
			if (leftOperand != null)
				msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND, null, msgs);
			if (newLeftOperand != null)
				msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND, null, msgs);
			msgs = basicSetLeftOperand(newLeftOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND, newLeftOperand, newLeftOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxBinaryOperator getOperator()
	{
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(DmxBinaryOperator newOperator)
	{
		DmxBinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_BINARY_OPERATION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getRightOperand()
	{
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOperand(DExpression newRightOperand, NotificationChain msgs)
	{
		DExpression oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightOperand(DExpression newRightOperand)
	{
		if (newRightOperand != rightOperand)
		{
			NotificationChain msgs = null;
			if (rightOperand != null)
				msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND, null, msgs);
			if (newRightOperand != null)
				msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND, null, msgs);
			msgs = basicSetRightOperand(newRightOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND, newRightOperand, newRightOperand));
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
			case DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND:
				return basicSetLeftOperand(null, msgs);
			case DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND:
				return basicSetRightOperand(null, msgs);
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
			case DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND:
				return getLeftOperand();
			case DmxPackage.DMX_BINARY_OPERATION__OPERATOR:
				return getOperator();
			case DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND:
				return getRightOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND:
				setLeftOperand((DExpression)newValue);
				return;
			case DmxPackage.DMX_BINARY_OPERATION__OPERATOR:
				setOperator((DmxBinaryOperator)newValue);
				return;
			case DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND:
				setRightOperand((DExpression)newValue);
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
			case DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND:
				setLeftOperand((DExpression)null);
				return;
			case DmxPackage.DMX_BINARY_OPERATION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND:
				setRightOperand((DExpression)null);
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
			case DmxPackage.DMX_BINARY_OPERATION__LEFT_OPERAND:
				return leftOperand != null;
			case DmxPackage.DMX_BINARY_OPERATION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case DmxPackage.DMX_BINARY_OPERATION__RIGHT_OPERAND:
				return rightOperand != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //DmxBinaryOperationImpl
