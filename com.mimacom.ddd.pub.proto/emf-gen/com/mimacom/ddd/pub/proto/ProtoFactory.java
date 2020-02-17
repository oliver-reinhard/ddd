/**
 */
package com.mimacom.ddd.pub.proto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.proto.ProtoPackage
 * @generated
 */
public interface ProtoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtoFactory eINSTANCE = com.mimacom.ddd.pub.proto.impl.ProtoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Publication Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publication Class</em>'.
	 * @generated
	 */
	PublicationClass createPublicationClass();

	/**
	 * Returns a new object of class '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol</em>'.
	 * @generated
	 */
	ProtoSymbol createProtoSymbol();

	/**
	 * Returns a new object of class '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract</em>'.
	 * @generated
	 */
	ProtoAbstract createProtoAbstract();

	/**
	 * Returns a new object of class '<em>Preface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preface</em>'.
	 * @generated
	 */
	ProtoPreface createProtoPreface();

	/**
	 * Returns a new object of class '<em>Epilogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epilogue</em>'.
	 * @generated
	 */
	ProtoEpilogue createProtoEpilogue();

	/**
	 * Returns a new object of class '<em>Publication Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publication Body</em>'.
	 * @generated
	 */
	ProtoPublicationBody createProtoPublicationBody();

	/**
	 * Returns a new object of class '<em>Change History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change History</em>'.
	 * @generated
	 */
	ProtoChangeHistory createProtoChangeHistory();

	/**
	 * Returns a new object of class '<em>TOC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOC</em>'.
	 * @generated
	 */
	ProtoTOC createProtoTOC();

	/**
	 * Returns a new object of class '<em>Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abbreviations</em>'.
	 * @generated
	 */
	ProtoAbbreviations createProtoAbbreviations();

	/**
	 * Returns a new object of class '<em>List Of Tables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Tables</em>'.
	 * @generated
	 */
	ProtoListOfTables createProtoListOfTables();

	/**
	 * Returns a new object of class '<em>List Of Figures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Figures</em>'.
	 * @generated
	 */
	ProtoListOfFigures createProtoListOfFigures();

	/**
	 * Returns a new object of class '<em>Bibliography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bibliography</em>'.
	 * @generated
	 */
	ProtoBibliography createProtoBibliography();

	/**
	 * Returns a new object of class '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary</em>'.
	 * @generated
	 */
	ProtoGlossary createProtoGlossary();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	ProtoIndex createProtoIndex();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	ProtoPart createProtoPart();

	/**
	 * Returns a new object of class '<em>Appendix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appendix</em>'.
	 * @generated
	 */
	ProtoAppendix createProtoAppendix();

	/**
	 * Returns a new object of class '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chapter</em>'.
	 * @generated
	 */
	ProtoChapter createProtoChapter();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	ProtoSection createProtoSection();

	/**
	 * Returns a new object of class '<em>Subsection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsection</em>'.
	 * @generated
	 */
	ProtoSubsection createProtoSubsection();

	/**
	 * Returns a new object of class '<em>Subsubsection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsubsection</em>'.
	 * @generated
	 */
	ProtoSubsubsection createProtoSubsubsection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProtoPackage getProtoPackage();

} //ProtoFactory
