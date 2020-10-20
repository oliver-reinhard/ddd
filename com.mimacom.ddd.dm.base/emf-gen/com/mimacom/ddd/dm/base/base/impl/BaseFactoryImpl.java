/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.*;

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
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseFactory init()
	{
		try
		{
			BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE.getEFactory(BasePackage.eNS_URI);
			if (theBaseFactory != null)
			{
				return theBaseFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl()
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
			case BasePackage.DIMPORT: return createDImport();
			case BasePackage.DNAMESPACE: return createDNamespace();
			case BasePackage.DTEXT_SEGMENT: return createDTextSegment();
			case BasePackage.DRICH_TEXT: return createDRichText();
			case BasePackage.DINFORMATION_MODEL: return createDInformationModel();
			case BasePackage.DCONTEXT: return createDContext();
			case BasePackage.DMULTIPLICITY: return createDMultiplicity();
			case BasePackage.DNAMED_PREDICATE: return createDNamedPredicate();
			case BasePackage.DSTATE: return createDState();
			case BasePackage.DSTATE_EVENT: return createDStateEvent();
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
			case BasePackage.DMULTIPLICITY_SHORTHAND:
				return createDMultiplicityShorthandFromString(eDataType, initialValue);
			case BasePackage.DENTITY_NATURE:
				return createDEntityNatureFromString(eDataType, initialValue);
			case BasePackage.DASSOCIATION_KIND:
				return createDAssociationKindFromString(eDataType, initialValue);
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
			case BasePackage.DMULTIPLICITY_SHORTHAND:
				return convertDMultiplicityShorthandToString(eDataType, instanceValue);
			case BasePackage.DENTITY_NATURE:
				return convertDEntityNatureToString(eDataType, instanceValue);
			case BasePackage.DASSOCIATION_KIND:
				return convertDAssociationKindToString(eDataType, instanceValue);
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
	public DImport createDImport()
	{
		DImportImpl dImport = new DImportImpl();
		return dImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamespace createDNamespace()
	{
		DNamespaceImpl dNamespace = new DNamespaceImpl();
		return dNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTextSegment createDTextSegment()
	{
		DTextSegmentImpl dTextSegment = new DTextSegmentImpl();
		return dTextSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRichText createDRichText()
	{
		DRichTextImpl dRichText = new DRichTextImpl();
		return dRichText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DInformationModel createDInformationModel()
	{
		DInformationModelImpl dInformationModel = new DInformationModelImpl();
		return dInformationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DContext createDContext()
	{
		DContextImpl dContext = new DContextImpl();
		return dContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMultiplicity createDMultiplicity()
	{
		DMultiplicityImplCustom dMultiplicity = new DMultiplicityImplCustom();
		return dMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamedPredicate createDNamedPredicate()
	{
		DNamedPredicateImpl dNamedPredicate = new DNamedPredicateImpl();
		return dNamedPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DState createDState()
	{
		DStateImpl dState = new DStateImpl();
		return dState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DStateEvent createDStateEvent()
	{
		DStateEventImpl dStateEvent = new DStateEventImpl();
		return dStateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMultiplicityShorthand createDMultiplicityShorthandFromString(EDataType eDataType, String initialValue)
	{
		DMultiplicityShorthand result = DMultiplicityShorthand.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDMultiplicityShorthandToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEntityNature createDEntityNatureFromString(EDataType eDataType, String initialValue)
	{
		DEntityNature result = DEntityNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDEntityNatureToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAssociationKind createDAssociationKindFromString(EDataType eDataType, String initialValue)
	{
		DAssociationKind result = DAssociationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAssociationKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePackage getBasePackage()
	{
		return (BasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackage getPackage()
	{
		return BasePackage.eINSTANCE;
	}

} //BaseFactoryImpl
