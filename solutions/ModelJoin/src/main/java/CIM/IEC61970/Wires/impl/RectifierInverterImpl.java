/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import CIM.IEC61970.Wires.RectifierInverter;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectifier Inverter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getMinCompoundVoltage <em>Min Compound Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getCommutatingReactance <em>Commutating Reactance</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getCommutatingResistance <em>Commutating Resistance</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getBridges <em>Bridges</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl#getCompoundResistance <em>Compound Resistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectifierInverterImpl extends ConductingEquipmentImpl implements RectifierInverter {
	/**
	 * The default value of the '{@link #getMinCompoundVoltage() <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCompoundVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_COMPOUND_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinCompoundVoltage() <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCompoundVoltage()
	 * @generated
	 * @ordered
	 */
	protected float minCompoundVoltage = MIN_COMPOUND_VOLTAGE_EDEFAULT;

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
	 * The default value of the '{@link #getCommutatingReactance() <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingReactance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMMUTATING_REACTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCommutatingReactance() <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingReactance()
	 * @generated
	 * @ordered
	 */
	protected float commutatingReactance = COMMUTATING_REACTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommutatingResistance() <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMMUTATING_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCommutatingResistance() <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingResistance()
	 * @generated
	 * @ordered
	 */
	protected float commutatingResistance = COMMUTATING_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected float ratedU = RATED_U_EDEFAULT;

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
	 * The default value of the '{@link #getBridges() <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridges()
	 * @generated
	 * @ordered
	 */
	protected static final int BRIDGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBridges() <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridges()
	 * @generated
	 * @ordered
	 */
	protected int bridges = BRIDGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompoundResistance() <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMPOUND_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCompoundResistance() <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundResistance()
	 * @generated
	 * @ordered
	 */
	protected float compoundResistance = COMPOUND_RESISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectifierInverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RECTIFIER_INVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinCompoundVoltage() {
		return minCompoundVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCompoundVoltage(float newMinCompoundVoltage) {
		float oldMinCompoundVoltage = minCompoundVoltage;
		minCompoundVoltage = newMinCompoundVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE, oldMinCompoundVoltage, minCompoundVoltage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__MIN_P, oldMinP, minP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__MAX_U, oldMaxU, maxU));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE, oldOperatingMode, operatingMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__FREQUENCY, oldFrequency, frequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__MAX_P, oldMaxP, maxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCommutatingReactance() {
		return commutatingReactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommutatingReactance(float newCommutatingReactance) {
		float oldCommutatingReactance = commutatingReactance;
		commutatingReactance = newCommutatingReactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE, oldCommutatingReactance, commutatingReactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCommutatingResistance() {
		return commutatingResistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommutatingResistance(float newCommutatingResistance) {
		float oldCommutatingResistance = commutatingResistance;
		commutatingResistance = newCommutatingResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE, oldCommutatingResistance, commutatingResistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedU() {
		return ratedU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedU(float newRatedU) {
		float oldRatedU = ratedU;
		ratedU = newRatedU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__RATED_U, oldRatedU, ratedU));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__MIN_U, oldMinU, minU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBridges() {
		return bridges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBridges(int newBridges) {
		int oldBridges = bridges;
		bridges = newBridges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__BRIDGES, oldBridges, bridges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCompoundResistance() {
		return compoundResistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundResistance(float newCompoundResistance) {
		float oldCompoundResistance = compoundResistance;
		compoundResistance = newCompoundResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE, oldCompoundResistance, compoundResistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				return getMinCompoundVoltage();
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				return getMinP();
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				return getMaxU();
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				return getOperatingMode();
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				return getFrequency();
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				return getMaxP();
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				return getCommutatingReactance();
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				return getCommutatingResistance();
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				return getRatedU();
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				return getMinU();
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				return getBridges();
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				return getCompoundResistance();
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
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				setMinCompoundVoltage((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				setMinP((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				setOperatingMode((String)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				setMaxP((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				setCommutatingReactance((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				setCommutatingResistance((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				setRatedU((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				setBridges((Integer)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				setCompoundResistance((Float)newValue);
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
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				setMinCompoundVoltage(MIN_COMPOUND_VOLTAGE_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				setMinP(MIN_P_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				setMaxU(MAX_U_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				setOperatingMode(OPERATING_MODE_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				setMaxP(MAX_P_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				setCommutatingReactance(COMMUTATING_REACTANCE_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				setCommutatingResistance(COMMUTATING_RESISTANCE_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				setRatedU(RATED_U_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				setMinU(MIN_U_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				setBridges(BRIDGES_EDEFAULT);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				setCompoundResistance(COMPOUND_RESISTANCE_EDEFAULT);
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
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				return minCompoundVoltage != MIN_COMPOUND_VOLTAGE_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				return minP != MIN_P_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				return maxU != MAX_U_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				return OPERATING_MODE_EDEFAULT == null ? operatingMode != null : !OPERATING_MODE_EDEFAULT.equals(operatingMode);
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				return maxP != MAX_P_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				return commutatingReactance != COMMUTATING_REACTANCE_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				return commutatingResistance != COMMUTATING_RESISTANCE_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				return ratedU != RATED_U_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				return minU != MIN_U_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				return bridges != BRIDGES_EDEFAULT;
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				return compoundResistance != COMPOUND_RESISTANCE_EDEFAULT;
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
		result.append(" (minCompoundVoltage: ");
		result.append(minCompoundVoltage);
		result.append(", minP: ");
		result.append(minP);
		result.append(", maxU: ");
		result.append(maxU);
		result.append(", operatingMode: ");
		result.append(operatingMode);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", maxP: ");
		result.append(maxP);
		result.append(", commutatingReactance: ");
		result.append(commutatingReactance);
		result.append(", commutatingResistance: ");
		result.append(commutatingResistance);
		result.append(", ratedU: ");
		result.append(ratedU);
		result.append(", minU: ");
		result.append(minU);
		result.append(", bridges: ");
		result.append(bridges);
		result.append(", compoundResistance: ");
		result.append(compoundResistance);
		result.append(')');
		return result.toString();
	}

} //RectifierInverterImpl
