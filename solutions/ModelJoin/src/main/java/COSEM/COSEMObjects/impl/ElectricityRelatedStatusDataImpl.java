/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityRelatedStatusData;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electricity Related Status Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataImpl#getStatus_information_missing_voltage <em>Status information missing voltage</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataImpl#getStatus_information_missing_current <em>Status information missing current</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataImpl#getStatus_information_current_without_voltage <em>Status information current without voltage</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataImpl#getStatus_information_auxiliary_power_supply <em>Status information auxiliary power supply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricityRelatedStatusDataImpl extends DataImpl implements ElectricityRelatedStatusData {
	/**
	 * The default value of the '{@link #getStatus_information_missing_voltage() <em>Status information missing voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_missing_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_INFORMATION_MISSING_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus_information_missing_voltage() <em>Status information missing voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_missing_voltage()
	 * @generated
	 * @ordered
	 */
	protected String status_information_missing_voltage = STATUS_INFORMATION_MISSING_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus_information_missing_current() <em>Status information missing current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_missing_current()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_INFORMATION_MISSING_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus_information_missing_current() <em>Status information missing current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_missing_current()
	 * @generated
	 * @ordered
	 */
	protected String status_information_missing_current = STATUS_INFORMATION_MISSING_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus_information_current_without_voltage() <em>Status information current without voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_current_without_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus_information_current_without_voltage() <em>Status information current without voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_current_without_voltage()
	 * @generated
	 * @ordered
	 */
	protected String status_information_current_without_voltage = STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus_information_auxiliary_power_supply() <em>Status information auxiliary power supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_auxiliary_power_supply()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus_information_auxiliary_power_supply() <em>Status information auxiliary power supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_information_auxiliary_power_supply()
	 * @generated
	 * @ordered
	 */
	protected String status_information_auxiliary_power_supply = STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricityRelatedStatusDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getElectricityRelatedStatusData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus_information_missing_voltage() {
		return status_information_missing_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus_information_missing_voltage(String newStatus_information_missing_voltage) {
		String oldStatus_information_missing_voltage = status_information_missing_voltage;
		status_information_missing_voltage = newStatus_information_missing_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_VOLTAGE, oldStatus_information_missing_voltage, status_information_missing_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus_information_missing_current() {
		return status_information_missing_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus_information_missing_current(String newStatus_information_missing_current) {
		String oldStatus_information_missing_current = status_information_missing_current;
		status_information_missing_current = newStatus_information_missing_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_CURRENT, oldStatus_information_missing_current, status_information_missing_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus_information_current_without_voltage() {
		return status_information_current_without_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus_information_current_without_voltage(String newStatus_information_current_without_voltage) {
		String oldStatus_information_current_without_voltage = status_information_current_without_voltage;
		status_information_current_without_voltage = newStatus_information_current_without_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE, oldStatus_information_current_without_voltage, status_information_current_without_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus_information_auxiliary_power_supply() {
		return status_information_auxiliary_power_supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus_information_auxiliary_power_supply(String newStatus_information_auxiliary_power_supply) {
		String oldStatus_information_auxiliary_power_supply = status_information_auxiliary_power_supply;
		status_information_auxiliary_power_supply = newStatus_information_auxiliary_power_supply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY, oldStatus_information_auxiliary_power_supply, status_information_auxiliary_power_supply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_VOLTAGE:
				return getStatus_information_missing_voltage();
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_CURRENT:
				return getStatus_information_missing_current();
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE:
				return getStatus_information_current_without_voltage();
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY:
				return getStatus_information_auxiliary_power_supply();
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
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_VOLTAGE:
				setStatus_information_missing_voltage((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_CURRENT:
				setStatus_information_missing_current((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE:
				setStatus_information_current_without_voltage((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY:
				setStatus_information_auxiliary_power_supply((String)newValue);
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
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_VOLTAGE:
				setStatus_information_missing_voltage(STATUS_INFORMATION_MISSING_VOLTAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_CURRENT:
				setStatus_information_missing_current(STATUS_INFORMATION_MISSING_CURRENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE:
				setStatus_information_current_without_voltage(STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY:
				setStatus_information_auxiliary_power_supply(STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY_EDEFAULT);
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
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_VOLTAGE:
				return STATUS_INFORMATION_MISSING_VOLTAGE_EDEFAULT == null ? status_information_missing_voltage != null : !STATUS_INFORMATION_MISSING_VOLTAGE_EDEFAULT.equals(status_information_missing_voltage);
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_CURRENT:
				return STATUS_INFORMATION_MISSING_CURRENT_EDEFAULT == null ? status_information_missing_current != null : !STATUS_INFORMATION_MISSING_CURRENT_EDEFAULT.equals(status_information_missing_current);
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE:
				return STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE_EDEFAULT == null ? status_information_current_without_voltage != null : !STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE_EDEFAULT.equals(status_information_current_without_voltage);
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY:
				return STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY_EDEFAULT == null ? status_information_auxiliary_power_supply != null : !STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY_EDEFAULT.equals(status_information_auxiliary_power_supply);
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
		result.append(" (Status_information_missing_voltage: ");
		result.append(status_information_missing_voltage);
		result.append(", Status_information_missing_current: ");
		result.append(status_information_missing_current);
		result.append(", Status_information_current_without_voltage: ");
		result.append(status_information_current_without_voltage);
		result.append(", Status_information_auxiliary_power_supply: ");
		result.append(status_information_auxiliary_power_supply);
		result.append(')');
		return result.toString();
	}

} //ElectricityRelatedStatusDataImpl
