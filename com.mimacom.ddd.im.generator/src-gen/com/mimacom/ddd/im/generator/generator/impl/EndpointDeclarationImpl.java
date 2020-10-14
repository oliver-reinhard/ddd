/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator.impl;

import com.mimacom.ddd.im.generator.generator.EndpointDeclaration;
import com.mimacom.ddd.im.generator.generator.GeneratorPackage;
import com.mimacom.ddd.im.generator.generator.HttpVerb;
import com.mimacom.ddd.im.generator.generator.Path;

import com.mimacom.ddd.sm.asm.AsmServiceOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.EndpointDeclarationImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.EndpointDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.EndpointDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.EndpointDeclarationImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointDeclarationImpl extends MinimalEObjectImpl.Container implements EndpointDeclaration
{
  /**
   * The default value of the '{@link #getVerb() <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected static final HttpVerb VERB_EDEFAULT = HttpVerb.PUT;

  /**
   * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected HttpVerb verb = VERB_EDEFAULT;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AsmServiceOperation type;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected Path path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndpointDeclarationImpl()
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
    return GeneratorPackage.Literals.ENDPOINT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpVerb getVerb()
  {
    return verb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerb(HttpVerb newVerb)
  {
    HttpVerb oldVerb = verb;
    verb = newVerb == null ? VERB_EDEFAULT : newVerb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENDPOINT_DECLARATION__VERB, oldVerb, verb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENDPOINT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsmServiceOperation getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (AsmServiceOperation)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ENDPOINT_DECLARATION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsmServiceOperation basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AsmServiceOperation newType)
  {
    AsmServiceOperation oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENDPOINT_DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(Path newPath, NotificationChain msgs)
  {
    Path oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENDPOINT_DECLARATION__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(Path newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.ENDPOINT_DECLARATION__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.ENDPOINT_DECLARATION__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENDPOINT_DECLARATION__PATH, newPath, newPath));
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
      case GeneratorPackage.ENDPOINT_DECLARATION__PATH:
        return basicSetPath(null, msgs);
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
      case GeneratorPackage.ENDPOINT_DECLARATION__VERB:
        return getVerb();
      case GeneratorPackage.ENDPOINT_DECLARATION__NAME:
        return getName();
      case GeneratorPackage.ENDPOINT_DECLARATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case GeneratorPackage.ENDPOINT_DECLARATION__PATH:
        return getPath();
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
      case GeneratorPackage.ENDPOINT_DECLARATION__VERB:
        setVerb((HttpVerb)newValue);
        return;
      case GeneratorPackage.ENDPOINT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case GeneratorPackage.ENDPOINT_DECLARATION__TYPE:
        setType((AsmServiceOperation)newValue);
        return;
      case GeneratorPackage.ENDPOINT_DECLARATION__PATH:
        setPath((Path)newValue);
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
      case GeneratorPackage.ENDPOINT_DECLARATION__VERB:
        setVerb(VERB_EDEFAULT);
        return;
      case GeneratorPackage.ENDPOINT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GeneratorPackage.ENDPOINT_DECLARATION__TYPE:
        setType((AsmServiceOperation)null);
        return;
      case GeneratorPackage.ENDPOINT_DECLARATION__PATH:
        setPath((Path)null);
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
      case GeneratorPackage.ENDPOINT_DECLARATION__VERB:
        return verb != VERB_EDEFAULT;
      case GeneratorPackage.ENDPOINT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GeneratorPackage.ENDPOINT_DECLARATION__TYPE:
        return type != null;
      case GeneratorPackage.ENDPOINT_DECLARATION__PATH:
        return path != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (verb: ");
    result.append(verb);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EndpointDeclarationImpl
