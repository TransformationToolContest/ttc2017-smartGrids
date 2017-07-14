/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Org Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl#getClientID <em>Client ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl#getChildOrganisation <em>Child Organisation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl#getParentOrganisation <em>Parent Organisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgOrgRoleImpl extends RoleImpl implements OrgOrgRole {
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
	 * The cached value of the '{@link #getChildOrganisation() <em>Child Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation childOrganisation;

	/**
	 * The cached value of the '{@link #getParentOrganisation() <em>Parent Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation parentOrganisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgOrgRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ORG_ORG_ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID, oldClientID, clientID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getChildOrganisation() {
		if (childOrganisation != null && childOrganisation.eIsProxy()) {
			InternalEObject oldChildOrganisation = (InternalEObject)childOrganisation;
			childOrganisation = (ErpOrganisation)eResolveProxy(oldChildOrganisation);
			if (childOrganisation != oldChildOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION, oldChildOrganisation, childOrganisation));
			}
		}
		return childOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetChildOrganisation() {
		return childOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildOrganisation(ErpOrganisation newChildOrganisation, NotificationChain msgs) {
		ErpOrganisation oldChildOrganisation = childOrganisation;
		childOrganisation = newChildOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION, oldChildOrganisation, newChildOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildOrganisation(ErpOrganisation newChildOrganisation) {
		if (newChildOrganisation != childOrganisation) {
			NotificationChain msgs = null;
			if (childOrganisation != null)
				msgs = ((InternalEObject)childOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			if (newChildOrganisation != null)
				msgs = ((InternalEObject)newChildOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetChildOrganisation(newChildOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION, newChildOrganisation, newChildOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getParentOrganisation() {
		if (parentOrganisation != null && parentOrganisation.eIsProxy()) {
			InternalEObject oldParentOrganisation = (InternalEObject)parentOrganisation;
			parentOrganisation = (ErpOrganisation)eResolveProxy(oldParentOrganisation);
			if (parentOrganisation != oldParentOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION, oldParentOrganisation, parentOrganisation));
			}
		}
		return parentOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetParentOrganisation() {
		return parentOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentOrganisation(ErpOrganisation newParentOrganisation, NotificationChain msgs) {
		ErpOrganisation oldParentOrganisation = parentOrganisation;
		parentOrganisation = newParentOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION, oldParentOrganisation, newParentOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentOrganisation(ErpOrganisation newParentOrganisation) {
		if (newParentOrganisation != parentOrganisation) {
			NotificationChain msgs = null;
			if (parentOrganisation != null)
				msgs = ((InternalEObject)parentOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			if (newParentOrganisation != null)
				msgs = ((InternalEObject)newParentOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetParentOrganisation(newParentOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION, newParentOrganisation, newParentOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				if (childOrganisation != null)
					msgs = ((InternalEObject)childOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
				return basicSetChildOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				if (parentOrganisation != null)
					msgs = ((InternalEObject)parentOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
				return basicSetParentOrganisation((ErpOrganisation)otherEnd, msgs);
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
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				return basicSetChildOrganisation(null, msgs);
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				return basicSetParentOrganisation(null, msgs);
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
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
				return getClientID();
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				if (resolve) return getChildOrganisation();
				return basicGetChildOrganisation();
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				if (resolve) return getParentOrganisation();
				return basicGetParentOrganisation();
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
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
				setClientID((String)newValue);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				setChildOrganisation((ErpOrganisation)newValue);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				setParentOrganisation((ErpOrganisation)newValue);
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
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
				setClientID(CLIENT_ID_EDEFAULT);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				setChildOrganisation((ErpOrganisation)null);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				setParentOrganisation((ErpOrganisation)null);
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
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				return childOrganisation != null;
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				return parentOrganisation != null;
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

} //OrgOrgRoleImpl
