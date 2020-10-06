/**
 */
package com.mimacom.ddd.dm.base.styledText.impl;

import com.mimacom.ddd.dm.base.styledText.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyledTextFactoryImpl extends EFactoryImpl implements StyledTextFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyledTextFactory init()
	{
		try
		{
			StyledTextFactory theStyledTextFactory = (StyledTextFactory)EPackage.Registry.INSTANCE.getEFactory(StyledTextPackage.eNS_URI);
			if (theStyledTextFactory != null)
			{
				return theStyledTextFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StyledTextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyledTextFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN: return createDStyledTextSpan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case StyledTextPackage.DTEXT_STYLE:
				return createDTextStyleFromString(eDataType, initialValue);
			case StyledTextPackage.DTEXT_ATTRIBUTE:
				return createDTextAttributeFromString(eDataType, initialValue);
			case StyledTextPackage.DCOLOR:
				return createDColorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case StyledTextPackage.DTEXT_STYLE:
				return convertDTextStyleToString(eDataType, instanceValue);
			case StyledTextPackage.DTEXT_ATTRIBUTE:
				return convertDTextAttributeToString(eDataType, instanceValue);
			case StyledTextPackage.DCOLOR:
				return convertDColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DStyledTextSpan createDStyledTextSpan()
	{
		DStyledTextSpanImplCustom dStyledTextSpan = new DStyledTextSpanImplCustom();
		return dStyledTextSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTextStyle createDTextStyleFromString(EDataType eDataType, String initialValue)
	{
		DTextStyle result = DTextStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDTextStyleToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTextAttribute createDTextAttributeFromString(EDataType eDataType, String initialValue)
	{
		DTextAttribute result = DTextAttribute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDTextAttributeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DColor createDColorFromString(EDataType eDataType, String initialValue)
	{
		DColor result = DColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDColorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyledTextPackage getStyledTextPackage()
	{
		return (StyledTextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StyledTextPackage getPackage()
	{
		return StyledTextPackage.eINSTANCE;
	}

} //StyledTextFactoryImpl
