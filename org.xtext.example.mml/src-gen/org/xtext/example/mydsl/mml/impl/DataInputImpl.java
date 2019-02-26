/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.mml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.mml.CSVParsingConfiguration;
import org.xtext.example.mydsl.mml.DataInput;
import org.xtext.example.mydsl.mml.MmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.DataInputImpl#getFilelocation <em>Filelocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.DataInputImpl#getParsingInstruction <em>Parsing Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataInputImpl extends MinimalEObjectImpl.Container implements DataInput
{
  /**
   * The default value of the '{@link #getFilelocation() <em>Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilelocation()
   * @generated
   * @ordered
   */
  protected static final String FILELOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilelocation() <em>Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilelocation()
   * @generated
   * @ordered
   */
  protected String filelocation = FILELOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getParsingInstruction() <em>Parsing Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParsingInstruction()
   * @generated
   * @ordered
   */
  protected CSVParsingConfiguration parsingInstruction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataInputImpl()
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
    return MmlPackage.Literals.DATA_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilelocation()
  {
    return filelocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilelocation(String newFilelocation)
  {
    String oldFilelocation = filelocation;
    filelocation = newFilelocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.DATA_INPUT__FILELOCATION, oldFilelocation, filelocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVParsingConfiguration getParsingInstruction()
  {
    return parsingInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParsingInstruction(CSVParsingConfiguration newParsingInstruction, NotificationChain msgs)
  {
    CSVParsingConfiguration oldParsingInstruction = parsingInstruction;
    parsingInstruction = newParsingInstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmlPackage.DATA_INPUT__PARSING_INSTRUCTION, oldParsingInstruction, newParsingInstruction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParsingInstruction(CSVParsingConfiguration newParsingInstruction)
  {
    if (newParsingInstruction != parsingInstruction)
    {
      NotificationChain msgs = null;
      if (parsingInstruction != null)
        msgs = ((InternalEObject)parsingInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmlPackage.DATA_INPUT__PARSING_INSTRUCTION, null, msgs);
      if (newParsingInstruction != null)
        msgs = ((InternalEObject)newParsingInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmlPackage.DATA_INPUT__PARSING_INSTRUCTION, null, msgs);
      msgs = basicSetParsingInstruction(newParsingInstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.DATA_INPUT__PARSING_INSTRUCTION, newParsingInstruction, newParsingInstruction));
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
      case MmlPackage.DATA_INPUT__PARSING_INSTRUCTION:
        return basicSetParsingInstruction(null, msgs);
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
      case MmlPackage.DATA_INPUT__FILELOCATION:
        return getFilelocation();
      case MmlPackage.DATA_INPUT__PARSING_INSTRUCTION:
        return getParsingInstruction();
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
      case MmlPackage.DATA_INPUT__FILELOCATION:
        setFilelocation((String)newValue);
        return;
      case MmlPackage.DATA_INPUT__PARSING_INSTRUCTION:
        setParsingInstruction((CSVParsingConfiguration)newValue);
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
      case MmlPackage.DATA_INPUT__FILELOCATION:
        setFilelocation(FILELOCATION_EDEFAULT);
        return;
      case MmlPackage.DATA_INPUT__PARSING_INSTRUCTION:
        setParsingInstruction((CSVParsingConfiguration)null);
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
      case MmlPackage.DATA_INPUT__FILELOCATION:
        return FILELOCATION_EDEFAULT == null ? filelocation != null : !FILELOCATION_EDEFAULT.equals(filelocation);
      case MmlPackage.DATA_INPUT__PARSING_INSTRUCTION:
        return parsingInstruction != null;
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
    result.append(" (filelocation: ");
    result.append(filelocation);
    result.append(')');
    return result.toString();
  }

} //DataInputImpl
