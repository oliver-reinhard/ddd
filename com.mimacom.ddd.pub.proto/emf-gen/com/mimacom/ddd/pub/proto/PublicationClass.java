/**
 */
package com.mimacom.ddd.pub.proto;

import com.mimacom.ddd.dm.base.DRichText;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXClass <em>La Te XClass</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXPreamble <em>La Te XPreamble</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getHtmlPreamble <em>Html Preamble</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getSegments <em>Segments</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getDivisions <em>Divisions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass()
 * @model
 * @generated
 */
public interface PublicationClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.proto.PublicationNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.PublicationNature
	 * @see #setNature(PublicationNature)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Nature()
	 * @model unique="false"
	 * @generated
	 */
	PublicationNature getNature();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.PublicationNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(PublicationNature value);

	/**
	 * Returns the value of the '<em><b>La Te XClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>La Te XClass</em>' attribute.
	 * @see #setLaTeXClass(String)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_LaTeXClass()
	 * @model unique="false"
	 * @generated
	 */
	String getLaTeXClass();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXClass <em>La Te XClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>La Te XClass</em>' attribute.
	 * @see #getLaTeXClass()
	 * @generated
	 */
	void setLaTeXClass(String value);

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.proto.ProtoSymbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Symbols()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtoSymbol> getSymbols();

	/**
	 * Returns the value of the '<em><b>La Te XPreamble</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>La Te XPreamble</em>' containment reference.
	 * @see #setLaTeXPreamble(DRichText)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_LaTeXPreamble()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getLaTeXPreamble();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXPreamble <em>La Te XPreamble</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>La Te XPreamble</em>' containment reference.
	 * @see #getLaTeXPreamble()
	 * @generated
	 */
	void setLaTeXPreamble(DRichText value);

	/**
	 * Returns the value of the '<em><b>Html Preamble</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Preamble</em>' containment reference.
	 * @see #setHtmlPreamble(DRichText)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_HtmlPreamble()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getHtmlPreamble();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getHtmlPreamble <em>Html Preamble</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Preamble</em>' containment reference.
	 * @see #getHtmlPreamble()
	 * @generated
	 */
	void setHtmlPreamble(DRichText value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Segments()
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ProtoDocumentSegment> getSegments();

	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.proto.ProtoDivision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtoDivision> getDivisions();

} // PublicationClass
