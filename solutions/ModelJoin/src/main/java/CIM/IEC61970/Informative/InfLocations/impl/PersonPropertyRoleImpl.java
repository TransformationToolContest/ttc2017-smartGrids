/**
 */
package CIM.IEC61970.Informative.InfLocations.impl;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM.IEC61970.Informative.InfLocations.LandProperty;
import CIM.IEC61970.Informative.InfLocations.PersonPropertyRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Property Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.impl.PersonPropertyRoleImpl#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.impl.PersonPropertyRoleImpl#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonPropertyRoleImpl extends RoleImpl implements PersonPropertyRole {
	/**
	 * The cached value of the '{@link #getLandProperty() <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperty()
	 * @generated
	 * @ordered
	 */
	protected LandProperty landProperty;

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
	protected PersonPropertyRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.PERSON_PROPERTY_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty getLandProperty() {
		if (landProperty != null && landProperty.eIsProxy()) {
			InternalEObject oldLandProperty = (InternalEObject)landProperty;
			landProperty = (LandProperty)eResolveProxy(oldLandProperty);
			if (landProperty != oldLandProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY, oldLandProperty, landProperty));
			}
		}
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty basicGetLandProperty() {
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandProperty(LandProperty newLandProperty, NotificationChain msgs) {
		LandProperty oldLandProperty = landProperty;
		landProperty = newLandProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY, oldLandProperty, newLandProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandProperty(LandProperty newLandProperty) {
		if (newLandProperty != landProperty) {
			NotificationChain msgs = null;
			if (landProperty != null)
				msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES, LandProperty.class, msgs);
			if (newLandProperty != null)
				msgs = ((InternalEObject)newLandProperty).eInverseAdd(this, InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES, LandProperty.class, msgs);
			msgs = basicSetLandProperty(newLandProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY, newLandProperty, newLandProperty));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON, oldErpPerson, erpPerson));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON, oldErpPerson, newErpPerson);
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
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON, newErpPerson, newErpPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY:
				if (landProperty != null)
					msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES, LandProperty.class, msgs);
				return basicSetLandProperty((LandProperty)otherEnd, msgs);
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES, ErpPerson.class, msgs);
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
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY:
				return basicSetLandProperty(null, msgs);
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON:
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
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY:
				if (resolve) return getLandProperty();
				return basicGetLandProperty();
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON:
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
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY:
				setLandProperty((LandProperty)newValue);
				return;
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON:
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
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY:
				setLandProperty((LandProperty)null);
				return;
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON:
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
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY:
				return landProperty != null;
			case InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON:
				return erpPerson != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonPropertyRoleImpl
