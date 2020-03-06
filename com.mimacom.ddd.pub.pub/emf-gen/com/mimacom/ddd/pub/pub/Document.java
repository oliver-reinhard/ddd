/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.pub.proto.PublicationClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#isGenerateHtml <em>Generate Html</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#isGenerateLaTeX <em>Generate La Te X</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#isGenerateMarkdown <em>Generate Markdown</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#isGenerateAsciiDoc <em>Generate Ascii Doc</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#isPreferRasterDiagrams <em>Prefer Raster Diagrams</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#getPublicationClass <em>Publication Class</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument()
 * @model abstract="true"
 * @generated
 */
public interface Document extends ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Generate Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Html</em>' attribute.
	 * @see #setGenerateHtml(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_GenerateHtml()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGenerateHtml();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#isGenerateHtml <em>Generate Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Html</em>' attribute.
	 * @see #isGenerateHtml()
	 * @generated
	 */
	void setGenerateHtml(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate La Te X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate La Te X</em>' attribute.
	 * @see #setGenerateLaTeX(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_GenerateLaTeX()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGenerateLaTeX();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#isGenerateLaTeX <em>Generate La Te X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate La Te X</em>' attribute.
	 * @see #isGenerateLaTeX()
	 * @generated
	 */
	void setGenerateLaTeX(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Markdown</em>' attribute.
	 * @see #setGenerateMarkdown(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_GenerateMarkdown()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGenerateMarkdown();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#isGenerateMarkdown <em>Generate Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Markdown</em>' attribute.
	 * @see #isGenerateMarkdown()
	 * @generated
	 */
	void setGenerateMarkdown(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Ascii Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Ascii Doc</em>' attribute.
	 * @see #setGenerateAsciiDoc(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_GenerateAsciiDoc()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGenerateAsciiDoc();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#isGenerateAsciiDoc <em>Generate Ascii Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Ascii Doc</em>' attribute.
	 * @see #isGenerateAsciiDoc()
	 * @generated
	 */
	void setGenerateAsciiDoc(boolean value);

	/**
	 * Returns the value of the '<em><b>Prefer Raster Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefer Raster Diagrams</em>' attribute.
	 * @see #setPreferRasterDiagrams(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_PreferRasterDiagrams()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPreferRasterDiagrams();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#isPreferRasterDiagrams <em>Prefer Raster Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefer Raster Diagrams</em>' attribute.
	 * @see #isPreferRasterDiagrams()
	 * @generated
	 */
	void setPreferRasterDiagrams(boolean value);

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.Symbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_Symbols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbol> getSymbols();

	/**
	 * Returns the value of the '<em><b>Publication Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Class</em>' reference.
	 * @see #setPublicationClass(PublicationClass)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_PublicationClass()
	 * @model
	 * @generated
	 */
	PublicationClass getPublicationClass();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#getPublicationClass <em>Publication Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Class</em>' reference.
	 * @see #getPublicationClass()
	 * @generated
	 */
	void setPublicationClass(PublicationClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	Symbol getSymbol(String name);

} // Document
