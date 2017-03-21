/**
 */
package CIM.IEC61970.Informative.InfLocations.impl;

import CIM.IEC61968.Common.impl.AgreementImpl;

import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM.IEC61970.Informative.InfLocations.LandProperty;
import CIM.IEC61970.Informative.InfLocations.RightOfWay;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Of Way</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.impl.RightOfWayImpl#getPropertyData <em>Property Data</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.impl.RightOfWayImpl#getLandProperties <em>Land Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightOfWayImpl extends AgreementImpl implements RightOfWay {
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
	 * The cached value of the '{@link #getLandProperties() <em>Land Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightOfWayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.RIGHT_OF_WAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA, oldPropertyData, propertyData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LandProperty> getLandProperties() {
		if (landProperties == null) {
			landProperties = new EObjectWithInverseResolvingEList.ManyInverse<LandProperty>(LandProperty.class, this, InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES, InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS);
		}
		return landProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperties()).basicAdd(otherEnd, msgs);
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
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return ((InternalEList<?>)getLandProperties()).basicRemove(otherEnd, msgs);
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				return getPropertyData();
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return getLandProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				setPropertyData((String)newValue);
				return;
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				getLandProperties().clear();
				getLandProperties().addAll((Collection<? extends LandProperty>)newValue);
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				setPropertyData(PROPERTY_DATA_EDEFAULT);
				return;
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				getLandProperties().clear();
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				return PROPERTY_DATA_EDEFAULT == null ? propertyData != null : !PROPERTY_DATA_EDEFAULT.equals(propertyData);
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return landProperties != null && !landProperties.isEmpty();
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

} //RightOfWayImpl
