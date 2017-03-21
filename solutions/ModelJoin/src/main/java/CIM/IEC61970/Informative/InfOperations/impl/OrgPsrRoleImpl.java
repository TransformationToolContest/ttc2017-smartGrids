/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.OrgPsrRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Psr Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OrgPsrRoleImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OrgPsrRoleImpl#getErpOrganisation <em>Erp Organisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgPsrRoleImpl extends RoleImpl implements OrgPsrRole {
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
	 * The cached value of the '{@link #getErpOrganisation() <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation erpOrganisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgPsrRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.ORG_PSR_ROLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, powerSystemResource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource);
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
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE, newPowerSystemResource, newPowerSystemResource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION, oldErpOrganisation, erpOrganisation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION, oldErpOrganisation, newErpOrganisation);
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
				msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES, ErpOrganisation.class, msgs);
			if (newErpOrganisation != null)
				msgs = ((InternalEObject)newErpOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetErpOrganisation(newErpOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION, newErpOrganisation, newErpOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION:
				if (erpOrganisation != null)
					msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES, ErpOrganisation.class, msgs);
				return basicSetErpOrganisation((ErpOrganisation)otherEnd, msgs);
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
			case InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION:
				return basicSetErpOrganisation(null, msgs);
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
			case InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION:
				if (resolve) return getErpOrganisation();
				return basicGetErpOrganisation();
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
			case InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)newValue);
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
			case InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)null);
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
			case InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION:
				return erpOrganisation != null;
		}
		return super.eIsSet(featureID);
	}

} //OrgPsrRoleImpl
