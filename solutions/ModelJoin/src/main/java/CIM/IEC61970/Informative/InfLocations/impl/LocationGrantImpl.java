/**
 */
package CIM.IEC61970.Informative.InfLocations.impl;

import CIM.IEC61968.Common.impl.AgreementImpl;

import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM.IEC61970.Informative.InfLocations.LandProperty;
import CIM.IEC61970.Informative.InfLocations.LocationGrant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Grant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.impl.LocationGrantImpl#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.impl.LocationGrantImpl#getPropertyData <em>Property Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationGrantImpl extends AgreementImpl implements LocationGrant {
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
	 * The default value of the '{@link #getPropertyData() <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyData()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyData() <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyData()
	 * @generated
	 * @ordered
	 */
	protected String propertyData = PROPERTY_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationGrantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.LOCATION_GRANT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY, oldLandProperty, landProperty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY, oldLandProperty, newLandProperty);
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
				msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, LandProperty.class, msgs);
			if (newLandProperty != null)
				msgs = ((InternalEObject)newLandProperty).eInverseAdd(this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, LandProperty.class, msgs);
			msgs = basicSetLandProperty(newLandProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY, newLandProperty, newLandProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyData() {
		return propertyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyData(String newPropertyData) {
		String oldPropertyData = propertyData;
		propertyData = newPropertyData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA, oldPropertyData, propertyData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				if (landProperty != null)
					msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, LandProperty.class, msgs);
				return basicSetLandProperty((LandProperty)otherEnd, msgs);
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				return basicSetLandProperty(null, msgs);
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				if (resolve) return getLandProperty();
				return basicGetLandProperty();
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				return getPropertyData();
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				setLandProperty((LandProperty)newValue);
				return;
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				setPropertyData((String)newValue);
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				setLandProperty((LandProperty)null);
				return;
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				setPropertyData(PROPERTY_DATA_EDEFAULT);
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				return landProperty != null;
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				return PROPERTY_DATA_EDEFAULT == null ? propertyData != null : !PROPERTY_DATA_EDEFAULT.equals(propertyData);
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
		result.append(" (propertyData: ");
		result.append(propertyData);
		result.append(')');
		return result.toString();
	}

} //LocationGrantImpl
