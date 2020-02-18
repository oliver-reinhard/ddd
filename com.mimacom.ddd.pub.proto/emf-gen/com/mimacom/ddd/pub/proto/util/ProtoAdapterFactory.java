/**
 */
package com.mimacom.ddd.pub.proto.util;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.pub.proto.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.proto.ProtoPackage
 * @generated
 */
public class ProtoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProtoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProtoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtoSwitch<Adapter> modelSwitch =
		new ProtoSwitch<Adapter>() {
			@Override
			public Adapter casePublicationClass(PublicationClass object) {
				return createPublicationClassAdapter();
			}
			@Override
			public Adapter caseProtoSymbol(ProtoSymbol object) {
				return createProtoSymbolAdapter();
			}
			@Override
			public Adapter caseProtoSymbolReference(ProtoSymbolReference object) {
				return createProtoSymbolReferenceAdapter();
			}
			@Override
			public Adapter caseProtoDocumentSegment(ProtoDocumentSegment object) {
				return createProtoDocumentSegmentAdapter();
			}
			@Override
			public Adapter caseProtoAbstract(ProtoAbstract object) {
				return createProtoAbstractAdapter();
			}
			@Override
			public Adapter caseProtoPreface(ProtoPreface object) {
				return createProtoPrefaceAdapter();
			}
			@Override
			public Adapter caseProtoEpilogue(ProtoEpilogue object) {
				return createProtoEpilogueAdapter();
			}
			@Override
			public Adapter caseProtoPublicationBody(ProtoPublicationBody object) {
				return createProtoPublicationBodyAdapter();
			}
			@Override
			public Adapter caseProtoChangeHistory(ProtoChangeHistory object) {
				return createProtoChangeHistoryAdapter();
			}
			@Override
			public Adapter caseProtoTOC(ProtoTOC object) {
				return createProtoTOCAdapter();
			}
			@Override
			public Adapter caseProtoAbbreviations(ProtoAbbreviations object) {
				return createProtoAbbreviationsAdapter();
			}
			@Override
			public Adapter caseProtoListOfTables(ProtoListOfTables object) {
				return createProtoListOfTablesAdapter();
			}
			@Override
			public Adapter caseProtoListOfFigures(ProtoListOfFigures object) {
				return createProtoListOfFiguresAdapter();
			}
			@Override
			public Adapter caseProtoBibliography(ProtoBibliography object) {
				return createProtoBibliographyAdapter();
			}
			@Override
			public Adapter caseProtoGlossary(ProtoGlossary object) {
				return createProtoGlossaryAdapter();
			}
			@Override
			public Adapter caseProtoIndex(ProtoIndex object) {
				return createProtoIndexAdapter();
			}
			@Override
			public Adapter caseProtoDivision(ProtoDivision object) {
				return createProtoDivisionAdapter();
			}
			@Override
			public Adapter caseProtoPart(ProtoPart object) {
				return createProtoPartAdapter();
			}
			@Override
			public Adapter caseProtoAppendix(ProtoAppendix object) {
				return createProtoAppendixAdapter();
			}
			@Override
			public Adapter caseProtoChapter(ProtoChapter object) {
				return createProtoChapterAdapter();
			}
			@Override
			public Adapter caseProtoSection(ProtoSection object) {
				return createProtoSectionAdapter();
			}
			@Override
			public Adapter caseProtoSubsection(ProtoSubsection object) {
				return createProtoSubsectionAdapter();
			}
			@Override
			public Adapter caseProtoSubsubsection(ProtoSubsubsection object) {
				return createProtoSubsubsectionAdapter();
			}
			@Override
			public Adapter caseIRichTextSegment(IRichTextSegment object) {
				return createIRichTextSegmentAdapter();
			}
			@Override
			public Adapter caseDExpression(DExpression object) {
				return createDExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.PublicationClass <em>Publication Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass
	 * @generated
	 */
	public Adapter createPublicationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoSymbol
	 * @generated
	 */
	public Adapter createProtoSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoSymbolReference <em>Symbol Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoSymbolReference
	 * @generated
	 */
	public Adapter createProtoSymbolReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment <em>Document Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment
	 * @generated
	 */
	public Adapter createProtoDocumentSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoAbstract
	 * @generated
	 */
	public Adapter createProtoAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoPreface <em>Preface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoPreface
	 * @generated
	 */
	public Adapter createProtoPrefaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoEpilogue <em>Epilogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoEpilogue
	 * @generated
	 */
	public Adapter createProtoEpilogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody <em>Publication Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoPublicationBody
	 * @generated
	 */
	public Adapter createProtoPublicationBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoChangeHistory <em>Change History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoChangeHistory
	 * @generated
	 */
	public Adapter createProtoChangeHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoTOC <em>TOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoTOC
	 * @generated
	 */
	public Adapter createProtoTOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoAbbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoAbbreviations
	 * @generated
	 */
	public Adapter createProtoAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoListOfTables <em>List Of Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoListOfTables
	 * @generated
	 */
	public Adapter createProtoListOfTablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoListOfFigures <em>List Of Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoListOfFigures
	 * @generated
	 */
	public Adapter createProtoListOfFiguresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoBibliography
	 * @generated
	 */
	public Adapter createProtoBibliographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoGlossary
	 * @generated
	 */
	public Adapter createProtoGlossaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoIndex
	 * @generated
	 */
	public Adapter createProtoIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoDivision
	 * @generated
	 */
	public Adapter createProtoDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoPart
	 * @generated
	 */
	public Adapter createProtoPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoAppendix <em>Appendix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoAppendix
	 * @generated
	 */
	public Adapter createProtoAppendixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoChapter
	 * @generated
	 */
	public Adapter createProtoChapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoSection
	 * @generated
	 */
	public Adapter createProtoSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoSubsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoSubsection
	 * @generated
	 */
	public Adapter createProtoSubsectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.proto.ProtoSubsubsection <em>Subsubsection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.proto.ProtoSubsubsection
	 * @generated
	 */
	public Adapter createProtoSubsubsectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IRichTextSegment <em>IRich Text Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IRichTextSegment
	 * @generated
	 */
	public Adapter createIRichTextSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DExpression <em>DExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DExpression
	 * @generated
	 */
	public Adapter createDExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProtoAdapterFactory
