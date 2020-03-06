/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.google.common.base.Objects;

import com.mimacom.ddd.pub.proto.PublicationClass;

import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Symbol;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#isGenerateHtml <em>Generate Html</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#isGenerateLaTeX <em>Generate La Te X</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#isGenerateMarkdown <em>Generate Markdown</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#isGenerateAsciiDoc <em>Generate Ascii Doc</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#isPreferRasterDiagrams <em>Prefer Raster Diagrams</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl#getPublicationClass <em>Publication Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateHtml() <em>Generate Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateHtml()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_HTML_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateHtml() <em>Generate Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateHtml()
	 * @generated
	 * @ordered
	 */
	protected boolean generateHtml = GENERATE_HTML_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateLaTeX() <em>Generate La Te X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateLaTeX()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_LA_TE_X_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateLaTeX() <em>Generate La Te X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateLaTeX()
	 * @generated
	 * @ordered
	 */
	protected boolean generateLaTeX = GENERATE_LA_TE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateMarkdown() <em>Generate Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateMarkdown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_MARKDOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateMarkdown() <em>Generate Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateMarkdown()
	 * @generated
	 * @ordered
	 */
	protected boolean generateMarkdown = GENERATE_MARKDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateAsciiDoc() <em>Generate Ascii Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateAsciiDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_ASCII_DOC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateAsciiDoc() <em>Generate Ascii Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateAsciiDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean generateAsciiDoc = GENERATE_ASCII_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreferRasterDiagrams() <em>Prefer Raster Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferRasterDiagrams()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFER_RASTER_DIAGRAMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreferRasterDiagrams() <em>Prefer Raster Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferRasterDiagrams()
	 * @generated
	 * @ordered
	 */
	protected boolean preferRasterDiagrams = PREFER_RASTER_DIAGRAMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> symbols;

	/**
	 * The cached value of the '{@link #getPublicationClass() <em>Publication Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationClass()
	 * @generated
	 * @ordered
	 */
	protected PublicationClass publicationClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateHtml() {
		return generateHtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateHtml(boolean newGenerateHtml) {
		boolean oldGenerateHtml = generateHtml;
		generateHtml = newGenerateHtml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__GENERATE_HTML, oldGenerateHtml, generateHtml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateLaTeX() {
		return generateLaTeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateLaTeX(boolean newGenerateLaTeX) {
		boolean oldGenerateLaTeX = generateLaTeX;
		generateLaTeX = newGenerateLaTeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__GENERATE_LA_TE_X, oldGenerateLaTeX, generateLaTeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateMarkdown() {
		return generateMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateMarkdown(boolean newGenerateMarkdown) {
		boolean oldGenerateMarkdown = generateMarkdown;
		generateMarkdown = newGenerateMarkdown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__GENERATE_MARKDOWN, oldGenerateMarkdown, generateMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateAsciiDoc() {
		return generateAsciiDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateAsciiDoc(boolean newGenerateAsciiDoc) {
		boolean oldGenerateAsciiDoc = generateAsciiDoc;
		generateAsciiDoc = newGenerateAsciiDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__GENERATE_ASCII_DOC, oldGenerateAsciiDoc, generateAsciiDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreferRasterDiagrams() {
		return preferRasterDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferRasterDiagrams(boolean newPreferRasterDiagrams) {
		boolean oldPreferRasterDiagrams = preferRasterDiagrams;
		preferRasterDiagrams = newPreferRasterDiagrams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__PREFER_RASTER_DIAGRAMS, oldPreferRasterDiagrams, preferRasterDiagrams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Symbol> getSymbols() {
		if (symbols == null) {
			symbols = new EObjectContainmentEList<Symbol>(Symbol.class, this, PubPackage.DOCUMENT__SYMBOLS);
		}
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationClass getPublicationClass() {
		if (publicationClass != null && publicationClass.eIsProxy()) {
			InternalEObject oldPublicationClass = (InternalEObject)publicationClass;
			publicationClass = (PublicationClass)eResolveProxy(oldPublicationClass);
			if (publicationClass != oldPublicationClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.DOCUMENT__PUBLICATION_CLASS, oldPublicationClass, publicationClass));
			}
		}
		return publicationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationClass basicGetPublicationClass() {
		return publicationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationClass(PublicationClass newPublicationClass) {
		PublicationClass oldPublicationClass = publicationClass;
		publicationClass = newPublicationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DOCUMENT__PUBLICATION_CLASS, oldPublicationClass, publicationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symbol getSymbol(final String name) {
		EList<Symbol> _symbols = this.getSymbols();
		for (final Symbol sym : _symbols) {
			String _name = sym.getName();
			boolean _equals = Objects.equal(_name, name);
			if (_equals) {
				return sym;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubPackage.DOCUMENT__SYMBOLS:
				return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.DOCUMENT__NAME:
				return getName();
			case PubPackage.DOCUMENT__ID:
				return getId();
			case PubPackage.DOCUMENT__TITLE:
				return getTitle();
			case PubPackage.DOCUMENT__GENERATE_HTML:
				return isGenerateHtml();
			case PubPackage.DOCUMENT__GENERATE_LA_TE_X:
				return isGenerateLaTeX();
			case PubPackage.DOCUMENT__GENERATE_MARKDOWN:
				return isGenerateMarkdown();
			case PubPackage.DOCUMENT__GENERATE_ASCII_DOC:
				return isGenerateAsciiDoc();
			case PubPackage.DOCUMENT__PREFER_RASTER_DIAGRAMS:
				return isPreferRasterDiagrams();
			case PubPackage.DOCUMENT__SYMBOLS:
				return getSymbols();
			case PubPackage.DOCUMENT__PUBLICATION_CLASS:
				if (resolve) return getPublicationClass();
				return basicGetPublicationClass();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PubPackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case PubPackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
				return;
			case PubPackage.DOCUMENT__GENERATE_HTML:
				setGenerateHtml((Boolean)newValue);
				return;
			case PubPackage.DOCUMENT__GENERATE_LA_TE_X:
				setGenerateLaTeX((Boolean)newValue);
				return;
			case PubPackage.DOCUMENT__GENERATE_MARKDOWN:
				setGenerateMarkdown((Boolean)newValue);
				return;
			case PubPackage.DOCUMENT__GENERATE_ASCII_DOC:
				setGenerateAsciiDoc((Boolean)newValue);
				return;
			case PubPackage.DOCUMENT__PREFER_RASTER_DIAGRAMS:
				setPreferRasterDiagrams((Boolean)newValue);
				return;
			case PubPackage.DOCUMENT__SYMBOLS:
				getSymbols().clear();
				getSymbols().addAll((Collection<? extends Symbol>)newValue);
				return;
			case PubPackage.DOCUMENT__PUBLICATION_CLASS:
				setPublicationClass((PublicationClass)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PubPackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__GENERATE_HTML:
				setGenerateHtml(GENERATE_HTML_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__GENERATE_LA_TE_X:
				setGenerateLaTeX(GENERATE_LA_TE_X_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__GENERATE_MARKDOWN:
				setGenerateMarkdown(GENERATE_MARKDOWN_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__GENERATE_ASCII_DOC:
				setGenerateAsciiDoc(GENERATE_ASCII_DOC_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__PREFER_RASTER_DIAGRAMS:
				setPreferRasterDiagrams(PREFER_RASTER_DIAGRAMS_EDEFAULT);
				return;
			case PubPackage.DOCUMENT__SYMBOLS:
				getSymbols().clear();
				return;
			case PubPackage.DOCUMENT__PUBLICATION_CLASS:
				setPublicationClass((PublicationClass)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PubPackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.DOCUMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case PubPackage.DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PubPackage.DOCUMENT__GENERATE_HTML:
				return generateHtml != GENERATE_HTML_EDEFAULT;
			case PubPackage.DOCUMENT__GENERATE_LA_TE_X:
				return generateLaTeX != GENERATE_LA_TE_X_EDEFAULT;
			case PubPackage.DOCUMENT__GENERATE_MARKDOWN:
				return generateMarkdown != GENERATE_MARKDOWN_EDEFAULT;
			case PubPackage.DOCUMENT__GENERATE_ASCII_DOC:
				return generateAsciiDoc != GENERATE_ASCII_DOC_EDEFAULT;
			case PubPackage.DOCUMENT__PREFER_RASTER_DIAGRAMS:
				return preferRasterDiagrams != PREFER_RASTER_DIAGRAMS_EDEFAULT;
			case PubPackage.DOCUMENT__SYMBOLS:
				return symbols != null && !symbols.isEmpty();
			case PubPackage.DOCUMENT__PUBLICATION_CLASS:
				return publicationClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PubPackage.DOCUMENT___GET_SYMBOL__STRING:
				return getSymbol((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", generateHtml: ");
		result.append(generateHtml);
		result.append(", generateLaTeX: ");
		result.append(generateLaTeX);
		result.append(", generateMarkdown: ");
		result.append(generateMarkdown);
		result.append(", generateAsciiDoc: ");
		result.append(generateAsciiDoc);
		result.append(", preferRasterDiagrams: ");
		result.append(preferRasterDiagrams);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
