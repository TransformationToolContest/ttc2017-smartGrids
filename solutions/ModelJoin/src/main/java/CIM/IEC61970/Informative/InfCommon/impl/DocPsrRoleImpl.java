/**
 */
package CIM.IEC61970.Informative.InfCommon.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.InfCommon.DocPsrRole;
import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Psr Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.DocPsrRoleImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.DocPsrRoleImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocPsrRoleImpl extends RoleImpl implements DocPsrRole {
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
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocPsrRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.DOC_PSR_ROLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.DOC_PSR_ROLE__DOCUMENT, oldDocument, document));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_PSR_ROLE__DOCUMENT, oldDocument, newDocument);
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
				msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_PSR_ROLE__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, powerSystemResource));
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE, newPowerSystemResource, newPowerSystemResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCommonPackage.DOC_PSR_ROLE__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
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
			case InfCommonPackage.DOC_PSR_ROLE__DOCUMENT:
				return basicSetDocument(null, msgs);
			case InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
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
			case InfCommonPackage.DOC_PSR_ROLE__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
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
			case InfCommonPackage.DOC_PSR_ROLE__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
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
			case InfCommonPackage.DOC_PSR_ROLE__DOCUMENT:
				setDocument((Document)null);
				return;
			case InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
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
			case InfCommonPackage.DOC_PSR_ROLE__DOCUMENT:
				return document != null;
			case InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
		}
		return super.eIsSet(featureID);
	}

} //DocPsrRoleImpl
