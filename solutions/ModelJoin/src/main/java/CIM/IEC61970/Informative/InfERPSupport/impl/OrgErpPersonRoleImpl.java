/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;
import CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Erp Person Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl#getClientID <em>Client ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgErpPersonRoleImpl extends RoleImpl implements OrgErpPersonRole {
	/**
	 * The cached value of the '{@link #getErpOrganisation() <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation erpOrganisation;

	/**
	 * The default value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected String clientID = CLIENT_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgErpPersonRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ORG_ERP_PERSON_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getErpOrganisation() {
		if (erpOrganisation != null && erpOrganisation.eIsProxy()) {
			InternalEObject oldErpOrganisation = (InternalEObject)erpOrganisation;
			erpOrganisation = (ErpOrganisation)eResolveProxy(oldErpOrganisation);
			if (erpOrganisation != oldErpOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION, oldErpOrganisation, erpOrganisation));
			}
		}
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetErpOrganisation() {
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpOrganisation(ErpOrganisation newErpOrganisation, NotificationChain msgs) {
		ErpOrganisation oldErpOrganisation = erpOrganisation;
		erpOrganisation = newErpOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION, oldErpOrganisation, newErpOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpOrganisation(ErpOrganisation newErpOrganisation) {
		if (newErpOrganisation != erpOrganisation) {
			NotificationChain msgs = null;
			if (erpOrganisation != null)
				msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, ErpOrganisation.class, msgs);
			if (newErpOrganisation != null)
				msgs = ((InternalEObject)newErpOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetErpOrganisation(newErpOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION, newErpOrganisation, newErpOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientID(String newClientID) {
		String oldClientID = clientID;
		clientID = newClientID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID, oldClientID, clientID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON, oldErpPerson, erpPerson));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON, oldErpPerson, newErpPerson);
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
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON, newErpPerson, newErpPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				if (erpOrganisation != null)
					msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, ErpOrganisation.class, msgs);
				return basicSetErpOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				return basicSetErpOrganisation(null, msgs);
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				if (resolve) return getErpOrganisation();
				return basicGetErpOrganisation();
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				return getClientID();
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)newValue);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				setClientID((String)newValue);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)null);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				setClientID(CLIENT_ID_EDEFAULT);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				return erpOrganisation != null;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				return erpPerson != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clientID: ");
		result.append(clientID);
		result.append(')');
		return result.toString();
	}

} //OrgErpPersonRoleImpl
