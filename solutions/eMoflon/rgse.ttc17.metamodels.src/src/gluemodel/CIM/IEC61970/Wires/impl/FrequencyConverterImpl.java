/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Wires.FrequencyConverter;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.FrequencyConverterImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.FrequencyConverterImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.FrequencyConverterImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.FrequencyConverterImpl#getMaxU <em>Max U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.FrequencyConverterImpl#getMinU <em>Min U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.FrequencyConverterImpl#getMinP <em>Min P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyConverterImpl extends RegulatingCondEqImpl implements FrequencyConverter {
	/**
	 * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected String operatingMode = OPERATING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected float frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxP = MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected float maxU = MAX_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected float minU = MIN_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected float minP = MIN_P_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.FREQUENCY_CONVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperatingMode() {
		return operatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingMode(String newOperatingMode) {
		String oldOperatingMode = operatingMode;
		operatingMode = newOperatingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE, oldOperatingMode, operatingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		float oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FREQUENCY_CONVERTER__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxP() {
		return maxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxP(float newMaxP) {
		float oldMaxP = maxP;
		maxP = newMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FREQUENCY_CONVERTER__MAX_P, oldMaxP, maxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxU() {
		return maxU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxU(float newMaxU) {
		float oldMaxU = maxU;
		maxU = newMaxU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FREQUENCY_CONVERTER__MAX_U, oldMaxU, maxU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinU() {
		return minU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinU(float newMinU) {
		float oldMinU = minU;
		minU = newMinU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FREQUENCY_CONVERTER__MIN_U, oldMinU, minU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinP() {
		return minP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinP(float newMinP) {
		float oldMinP = minP;
		minP = newMinP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FREQUENCY_CONVERTER__MIN_P, oldMinP, minP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				return getOperatingMode();
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				return getFrequency();
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				return getMaxP();
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				return getMaxU();
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				return getMinU();
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				return getMinP();
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
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				setOperatingMode((String)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				setMaxP((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				setMinP((Float)newValue);
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
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				setOperatingMode(OPERATING_MODE_EDEFAULT);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				setMaxP(MAX_P_EDEFAULT);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				setMaxU(MAX_U_EDEFAULT);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				setMinU(MIN_U_EDEFAULT);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				setMinP(MIN_P_EDEFAULT);
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
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				return OPERATING_MODE_EDEFAULT == null ? operatingMode != null : !OPERATING_MODE_EDEFAULT.equals(operatingMode);
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				return maxP != MAX_P_EDEFAULT;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				return maxU != MAX_U_EDEFAULT;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				return minU != MIN_U_EDEFAULT;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				return minP != MIN_P_EDEFAULT;
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
		result.append(" (operatingMode: ");
		result.append(operatingMode);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", maxP: ");
		result.append(maxP);
		result.append(", maxU: ");
		result.append(maxU);
		result.append(", minU: ");
		result.append(minU);
		result.append(", minP: ");
		result.append(minP);
		result.append(')');
		return result.toString();
	}

} //FrequencyConverterImpl
