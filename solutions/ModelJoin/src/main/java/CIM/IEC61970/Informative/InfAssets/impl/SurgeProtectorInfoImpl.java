/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surge Protector Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SurgeProtectorInfoImpl#getNominalDesignVoltage <em>Nominal Design Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SurgeProtectorInfoImpl#getMaxCurrentRating <em>Max Current Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SurgeProtectorInfoImpl#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SurgeProtectorInfoImpl#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurgeProtectorInfoImpl extends ElectricalInfoImpl implements SurgeProtectorInfo {
	/**
	 * The default value of the '{@link #getNominalDesignVoltage() <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDesignVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_DESIGN_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalDesignVoltage() <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDesignVoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalDesignVoltage = NOMINAL_DESIGN_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCurrentRating() <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrentRating()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CURRENT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxCurrentRating() <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrentRating()
	 * @generated
	 * @ordered
	 */
	protected float maxCurrentRating = MAX_CURRENT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxContinousOperatingVoltage() <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContinousOperatingVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxContinousOperatingVoltage() <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContinousOperatingVoltage()
	 * @generated
	 * @ordered
	 */
	protected float maxContinousOperatingVoltage = MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEnergyAbsorption() <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEnergyAbsorption()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ENERGY_ABSORPTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxEnergyAbsorption() <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEnergyAbsorption()
	 * @generated
	 * @ordered
	 */
	protected float maxEnergyAbsorption = MAX_ENERGY_ABSORPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeProtectorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSurgeProtectorInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalDesignVoltage() {
		return nominalDesignVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDesignVoltage(float newNominalDesignVoltage) {
		float oldNominalDesignVoltage = nominalDesignVoltage;
		nominalDesignVoltage = newNominalDesignVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE, oldNominalDesignVoltage, nominalDesignVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxCurrentRating() {
		return maxCurrentRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCurrentRating(float newMaxCurrentRating) {
		float oldMaxCurrentRating = maxCurrentRating;
		maxCurrentRating = newMaxCurrentRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING, oldMaxCurrentRating, maxCurrentRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxContinousOperatingVoltage() {
		return maxContinousOperatingVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxContinousOperatingVoltage(float newMaxContinousOperatingVoltage) {
		float oldMaxContinousOperatingVoltage = maxContinousOperatingVoltage;
		maxContinousOperatingVoltage = newMaxContinousOperatingVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE, oldMaxContinousOperatingVoltage, maxContinousOperatingVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxEnergyAbsorption() {
		return maxEnergyAbsorption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEnergyAbsorption(float newMaxEnergyAbsorption) {
		float oldMaxEnergyAbsorption = maxEnergyAbsorption;
		maxEnergyAbsorption = newMaxEnergyAbsorption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION, oldMaxEnergyAbsorption, maxEnergyAbsorption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				return getNominalDesignVoltage();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				return getMaxCurrentRating();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				return getMaxContinousOperatingVoltage();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				return getMaxEnergyAbsorption();
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				setNominalDesignVoltage((Float)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				setMaxCurrentRating((Float)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				setMaxContinousOperatingVoltage((Float)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				setMaxEnergyAbsorption((Float)newValue);
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				setNominalDesignVoltage(NOMINAL_DESIGN_VOLTAGE_EDEFAULT);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				setMaxCurrentRating(MAX_CURRENT_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				setMaxContinousOperatingVoltage(MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				setMaxEnergyAbsorption(MAX_ENERGY_ABSORPTION_EDEFAULT);
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				return nominalDesignVoltage != NOMINAL_DESIGN_VOLTAGE_EDEFAULT;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				return maxCurrentRating != MAX_CURRENT_RATING_EDEFAULT;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				return maxContinousOperatingVoltage != MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				return maxEnergyAbsorption != MAX_ENERGY_ABSORPTION_EDEFAULT;
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
		result.append(" (nominalDesignVoltage: ");
		result.append(nominalDesignVoltage);
		result.append(", maxCurrentRating: ");
		result.append(maxCurrentRating);
		result.append(", maxContinousOperatingVoltage: ");
		result.append(maxContinousOperatingVoltage);
		result.append(", maxEnergyAbsorption: ");
		result.append(maxEnergyAbsorption);
		result.append(')');
		return result.toString();
	}

} //SurgeProtectorInfoImpl
