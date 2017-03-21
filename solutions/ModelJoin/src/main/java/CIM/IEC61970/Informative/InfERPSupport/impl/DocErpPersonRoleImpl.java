/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole;
import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Erp Person Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.DocErpPersonRoleImpl#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.DocErpPersonRoleImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocErpPersonRoleImpl extends RoleImpl implements DocErpPersonRole {
	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocErpPersonRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.DOC_ERP_PERSON_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON, oldErpPerson, erpPerson));
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON, oldErpPerson, newErpPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON, newErpPerson, newErpPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__ERP_PERSON_ROLES, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, CommonPackage.DOCUMENT__ERP_PERSON_ROLES, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__ERP_PERSON_ROLES, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT:
				return basicSetDocument(null, msgs);
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
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT:
				setDocument((Document)newValue);
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
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT:
				setDocument((Document)null);
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
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON:
				return erpPerson != null;
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT:
				return document != null;
		}
		return super.eIsSet(featureID);
	}

} //DocErpPersonRoleImpl
