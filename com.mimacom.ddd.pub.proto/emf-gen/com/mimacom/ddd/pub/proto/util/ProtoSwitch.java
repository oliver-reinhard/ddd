/**
 */
package com.mimacom.ddd.pub.proto.util;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.pub.proto.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.proto.ProtoPackage
 * @generated
 */
public class ProtoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProtoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoSwitch() {
		if (modelPackage == null) {
			modelPackage = ProtoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProtoPackage.PUBLICATION_CLASS: {
				PublicationClass publicationClass = (PublicationClass)theEObject;
				T result = casePublicationClass(publicationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_SYMBOL: {
				ProtoSymbol protoSymbol = (ProtoSymbol)theEObject;
				T result = caseProtoSymbol(protoSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_SYMBOL_REFERENCE: {
				ProtoSymbolReference protoSymbolReference = (ProtoSymbolReference)theEObject;
				T result = caseProtoSymbolReference(protoSymbolReference);
				if (result == null) result = caseDExpression(protoSymbolReference);
				if (result == null) result = caseIRichTextSegment(protoSymbolReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT: {
				ProtoDocumentSegment protoDocumentSegment = (ProtoDocumentSegment)theEObject;
				T result = caseProtoDocumentSegment(protoDocumentSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_ABSTRACT: {
				ProtoAbstract protoAbstract = (ProtoAbstract)theEObject;
				T result = caseProtoAbstract(protoAbstract);
				if (result == null) result = caseProtoDocumentSegment(protoAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_PREFACE: {
				ProtoPreface protoPreface = (ProtoPreface)theEObject;
				T result = caseProtoPreface(protoPreface);
				if (result == null) result = caseProtoDocumentSegment(protoPreface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_EPILOGUE: {
				ProtoEpilogue protoEpilogue = (ProtoEpilogue)theEObject;
				T result = caseProtoEpilogue(protoEpilogue);
				if (result == null) result = caseProtoDocumentSegment(protoEpilogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_PUBLICATION_BODY: {
				ProtoPublicationBody protoPublicationBody = (ProtoPublicationBody)theEObject;
				T result = caseProtoPublicationBody(protoPublicationBody);
				if (result == null) result = caseProtoDocumentSegment(protoPublicationBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_CHANGE_HISTORY: {
				ProtoChangeHistory protoChangeHistory = (ProtoChangeHistory)theEObject;
				T result = caseProtoChangeHistory(protoChangeHistory);
				if (result == null) result = caseProtoDocumentSegment(protoChangeHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_TOC: {
				ProtoTOC protoTOC = (ProtoTOC)theEObject;
				T result = caseProtoTOC(protoTOC);
				if (result == null) result = caseProtoDocumentSegment(protoTOC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_ABBREVIATIONS: {
				ProtoAbbreviations protoAbbreviations = (ProtoAbbreviations)theEObject;
				T result = caseProtoAbbreviations(protoAbbreviations);
				if (result == null) result = caseProtoDocumentSegment(protoAbbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_LIST_OF_TABLES: {
				ProtoListOfTables protoListOfTables = (ProtoListOfTables)theEObject;
				T result = caseProtoListOfTables(protoListOfTables);
				if (result == null) result = caseProtoDocumentSegment(protoListOfTables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_LIST_OF_FIGURES: {
				ProtoListOfFigures protoListOfFigures = (ProtoListOfFigures)theEObject;
				T result = caseProtoListOfFigures(protoListOfFigures);
				if (result == null) result = caseProtoDocumentSegment(protoListOfFigures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_BIBLIOGRAPHY: {
				ProtoBibliography protoBibliography = (ProtoBibliography)theEObject;
				T result = caseProtoBibliography(protoBibliography);
				if (result == null) result = caseProtoDocumentSegment(protoBibliography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_GLOSSARY: {
				ProtoGlossary protoGlossary = (ProtoGlossary)theEObject;
				T result = caseProtoGlossary(protoGlossary);
				if (result == null) result = caseProtoDocumentSegment(protoGlossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_INDEX: {
				ProtoIndex protoIndex = (ProtoIndex)theEObject;
				T result = caseProtoIndex(protoIndex);
				if (result == null) result = caseProtoDocumentSegment(protoIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_DIVISION: {
				ProtoDivision protoDivision = (ProtoDivision)theEObject;
				T result = caseProtoDivision(protoDivision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_PART: {
				ProtoPart protoPart = (ProtoPart)theEObject;
				T result = caseProtoPart(protoPart);
				if (result == null) result = caseProtoDivision(protoPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_APPENDIX: {
				ProtoAppendix protoAppendix = (ProtoAppendix)theEObject;
				T result = caseProtoAppendix(protoAppendix);
				if (result == null) result = caseProtoPart(protoAppendix);
				if (result == null) result = caseProtoDivision(protoAppendix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_CHAPTER: {
				ProtoChapter protoChapter = (ProtoChapter)theEObject;
				T result = caseProtoChapter(protoChapter);
				if (result == null) result = caseProtoDivision(protoChapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_SECTION: {
				ProtoSection protoSection = (ProtoSection)theEObject;
				T result = caseProtoSection(protoSection);
				if (result == null) result = caseProtoDivision(protoSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_SUBSECTION: {
				ProtoSubsection protoSubsection = (ProtoSubsection)theEObject;
				T result = caseProtoSubsection(protoSubsection);
				if (result == null) result = caseProtoDivision(protoSubsection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtoPackage.PROTO_SUBSUBSECTION: {
				ProtoSubsubsection protoSubsubsection = (ProtoSubsubsection)theEObject;
				T result = caseProtoSubsubsection(protoSubsubsection);
				if (result == null) result = caseProtoDivision(protoSubsubsection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationClass(PublicationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoSymbol(ProtoSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoSymbolReference(ProtoSymbolReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoDocumentSegment(ProtoDocumentSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoAbstract(ProtoAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoPreface(ProtoPreface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epilogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epilogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoEpilogue(ProtoEpilogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoPublicationBody(ProtoPublicationBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoChangeHistory(ProtoChangeHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoTOC(ProtoTOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoAbbreviations(ProtoAbbreviations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Tables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Tables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoListOfTables(ProtoListOfTables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Figures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Figures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoListOfFigures(ProtoListOfFigures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoBibliography(ProtoBibliography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoGlossary(ProtoGlossary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoIndex(ProtoIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoDivision(ProtoDivision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoPart(ProtoPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appendix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appendix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoAppendix(ProtoAppendix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoChapter(ProtoChapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoSection(ProtoSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoSubsection(ProtoSubsection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsubsection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsubsection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtoSubsubsection(ProtoSubsubsection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRichTextSegment(IRichTextSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDExpression(DExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProtoSwitch
