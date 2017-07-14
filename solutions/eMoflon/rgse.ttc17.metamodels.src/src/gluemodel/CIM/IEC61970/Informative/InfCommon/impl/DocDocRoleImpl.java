/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfCommon.DocDocRole;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Doc Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.DocDocRoleImpl#getFromDocument <em>From Document</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.DocDocRoleImpl#getToDocument <em>To Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocDocRoleImpl extends RoleImpl implements DocDocRole {
	/**
	 * The cached value of the '{@link #getFromDocument() <em>From Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDocument()
	 * @generated
	 * @ordered
	 */
	protected Document fromDocument;

	/**
	 * The cached value of the '{@link #getToDocument() <em>To Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDocument()
	 * @generated
	 * @ordered
	 */
	protected Document toDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocDocRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.DOC_DOC_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getFromDocument() {
		if (fromDocument != null && fromDocument.eIsProxy()) {
			InternalEObject oldFromDocument = (InternalEObject)fromDocument;
			fromDocument = (Document)eResolveProxy(oldFromDocument);
			if (fromDocument != oldFromDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT, oldFromDocument, fromDocument));
			}
		}
		return fromDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetFromDocument() {
		return fromDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDocument(Document newFromDocument, NotificationChain msgs) {
		Document oldFromDocument = fromDocument;
		fromDocument = newFromDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT, oldFromDocument, newFromDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDocument(Document newFromDocument) {
		if (newFromDocument != fromDocument) {
			NotificationChain msgs = null;
			if (fromDocument != null)
				msgs = ((InternalEObject)fromDocument).eInverseRemove(this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, Document.class, msgs);
			if (newFromDocument != null)
				msgs = ((InternalEObject)newFromDocument).eInverseAdd(this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, Document.class, msgs);
			msgs = basicSetFromDocument(newFromDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT, newFromDocument, newFromDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getToDocument() {
		if (toDocument != null && toDocument.eIsProxy()) {
			InternalEObject oldToDocument = (InternalEObject)toDocument;
			toDocument = (Document)eResolveProxy(oldToDocument);
			if (toDocument != oldToDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT, oldToDocument, toDocument));
			}
		}
		return toDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetToDocument() {
		return toDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDocument(Document newToDocument, NotificationChain msgs) {
		Document oldToDocument = toDocument;
		toDocument = newToDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT, oldToDocument, newToDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDocument(Document newToDocument) {
		if (newToDocument != toDocument) {
			NotificationChain msgs = null;
			if (toDocument != null)
				msgs = ((InternalEObject)toDocument).eInverseRemove(this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, Document.class, msgs);
			if (newToDocument != null)
				msgs = ((InternalEObject)newToDocument).eInverseAdd(this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, Document.class, msgs);
			msgs = basicSetToDocument(newToDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT, newToDocument, newToDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				if (fromDocument != null)
					msgs = ((InternalEObject)fromDocument).eInverseRemove(this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, Document.class, msgs);
				return basicSetFromDocument((Document)otherEnd, msgs);
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				if (toDocument != null)
					msgs = ((InternalEObject)toDocument).eInverseRemove(this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, Document.class, msgs);
				return basicSetToDocument((Document)otherEnd, msgs);
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
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				return basicSetFromDocument(null, msgs);
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				return basicSetToDocument(null, msgs);
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
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				if (resolve) return getFromDocument();
				return basicGetFromDocument();
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				if (resolve) return getToDocument();
				return basicGetToDocument();
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
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				setFromDocument((Document)newValue);
				return;
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				setToDocument((Document)newValue);
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
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				setFromDocument((Document)null);
				return;
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				setToDocument((Document)null);
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
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				return fromDocument != null;
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				return toDocument != null;
		}
		return super.eIsSet(featureID);
	}

} //DocDocRoleImpl
