/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getLowPowerLimit <em>Low Power Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getInCoreThermalTC <em>In Core Thermal TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getIntegralGain <em>Integral Gain</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getPressureSetpointGA <em>Pressure Setpoint GA</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux1 <em>Rf Aux1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux2 <em>Rf Aux2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRodPatternConstant <em>Rod Pattern Constant</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux8 <em>Rf Aux8</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux7 <em>Rf Aux7</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRodPattern <em>Rod Pattern</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux4 <em>Rf Aux4</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux3 <em>Rf Aux3</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux6 <em>Rf Aux6</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getRfAux5 <em>Rf Aux5</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getProportionalGain <em>Proportional Gain</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getHighPowerLimit <em>High Power Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getPressureSetpointTC2 <em>Pressure Setpoint TC2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getPressureSetpointTC1 <em>Pressure Setpoint TC1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl#getPressureLimit <em>Pressure Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BWRSteamSupplyImpl extends SteamSupplyImpl implements BWRSteamSupply {
	/**
	 * The default value of the '{@link #getLowPowerLimit() <em>Low Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_POWER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowPowerLimit() <em>Low Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowPowerLimit = LOW_POWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInCoreThermalTC() <em>In Core Thermal TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCoreThermalTC()
	 * @generated
	 * @ordered
	 */
	protected static final float IN_CORE_THERMAL_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInCoreThermalTC() <em>In Core Thermal TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCoreThermalTC()
	 * @generated
	 * @ordered
	 */
	protected float inCoreThermalTC = IN_CORE_THERMAL_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegralGain() <em>Integral Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegralGain()
	 * @generated
	 * @ordered
	 */
	protected static final float INTEGRAL_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntegralGain() <em>Integral Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegralGain()
	 * @generated
	 * @ordered
	 */
	protected float integralGain = INTEGRAL_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureSetpointGA() <em>Pressure Setpoint GA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSetpointGA()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_SETPOINT_GA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureSetpointGA() <em>Pressure Setpoint GA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSetpointGA()
	 * @generated
	 * @ordered
	 */
	protected float pressureSetpointGA = PRESSURE_SETPOINT_GA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux1() <em>Rf Aux1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux1()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux1() <em>Rf Aux1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux1()
	 * @generated
	 * @ordered
	 */
	protected float rfAux1 = RF_AUX1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux2() <em>Rf Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux2()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux2() <em>Rf Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux2()
	 * @generated
	 * @ordered
	 */
	protected float rfAux2 = RF_AUX2_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowerLimit = LOWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRodPatternConstant() <em>Rod Pattern Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRodPatternConstant()
	 * @generated
	 * @ordered
	 */
	protected static final float ROD_PATTERN_CONSTANT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRodPatternConstant() <em>Rod Pattern Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRodPatternConstant()
	 * @generated
	 * @ordered
	 */
	protected float rodPatternConstant = ROD_PATTERN_CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux8() <em>Rf Aux8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux8()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX8_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux8() <em>Rf Aux8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux8()
	 * @generated
	 * @ordered
	 */
	protected float rfAux8 = RF_AUX8_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux7() <em>Rf Aux7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux7()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX7_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux7() <em>Rf Aux7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux7()
	 * @generated
	 * @ordered
	 */
	protected float rfAux7 = RF_AUX7_EDEFAULT;

	/**
	 * The default value of the '{@link #getRodPattern() <em>Rod Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRodPattern()
	 * @generated
	 * @ordered
	 */
	protected static final float ROD_PATTERN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRodPattern() <em>Rod Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRodPattern()
	 * @generated
	 * @ordered
	 */
	protected float rodPattern = ROD_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux4() <em>Rf Aux4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux4()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX4_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux4() <em>Rf Aux4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux4()
	 * @generated
	 * @ordered
	 */
	protected float rfAux4 = RF_AUX4_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux3() <em>Rf Aux3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux3()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX3_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux3() <em>Rf Aux3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux3()
	 * @generated
	 * @ordered
	 */
	protected float rfAux3 = RF_AUX3_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux6() <em>Rf Aux6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux6()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX6_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux6() <em>Rf Aux6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux6()
	 * @generated
	 * @ordered
	 */
	protected float rfAux6 = RF_AUX6_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfAux5() <em>Rf Aux5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux5()
	 * @generated
	 * @ordered
	 */
	protected static final float RF_AUX5_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRfAux5() <em>Rf Aux5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfAux5()
	 * @generated
	 * @ordered
	 */
	protected float rfAux5 = RF_AUX5_EDEFAULT;

	/**
	 * The default value of the '{@link #getProportionalGain() <em>Proportional Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalGain()
	 * @generated
	 * @ordered
	 */
	protected static final float PROPORTIONAL_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProportionalGain() <em>Proportional Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalGain()
	 * @generated
	 * @ordered
	 */
	protected float proportionalGain = PROPORTIONAL_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float UPPER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected float upperLimit = UPPER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighPowerLimit() <em>High Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_POWER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighPowerLimit() <em>High Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected float highPowerLimit = HIGH_POWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureSetpointTC2() <em>Pressure Setpoint TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSetpointTC2()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_SETPOINT_TC2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureSetpointTC2() <em>Pressure Setpoint TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSetpointTC2()
	 * @generated
	 * @ordered
	 */
	protected float pressureSetpointTC2 = PRESSURE_SETPOINT_TC2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureSetpointTC1() <em>Pressure Setpoint TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSetpointTC1()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_SETPOINT_TC1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureSetpointTC1() <em>Pressure Setpoint TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSetpointTC1()
	 * @generated
	 * @ordered
	 */
	protected float pressureSetpointTC1 = PRESSURE_SETPOINT_TC1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureLimit() <em>Pressure Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureLimit() <em>Pressure Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureLimit()
	 * @generated
	 * @ordered
	 */
	protected float pressureLimit = PRESSURE_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BWRSteamSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.BWR_STEAM_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowPowerLimit() {
		return lowPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowPowerLimit(float newLowPowerLimit) {
		float oldLowPowerLimit = lowPowerLimit;
		lowPowerLimit = newLowPowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT, oldLowPowerLimit, lowPowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInCoreThermalTC() {
		return inCoreThermalTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInCoreThermalTC(float newInCoreThermalTC) {
		float oldInCoreThermalTC = inCoreThermalTC;
		inCoreThermalTC = newInCoreThermalTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC, oldInCoreThermalTC, inCoreThermalTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntegralGain() {
		return integralGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegralGain(float newIntegralGain) {
		float oldIntegralGain = integralGain;
		integralGain = newIntegralGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN, oldIntegralGain, integralGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureSetpointGA() {
		return pressureSetpointGA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSetpointGA(float newPressureSetpointGA) {
		float oldPressureSetpointGA = pressureSetpointGA;
		pressureSetpointGA = newPressureSetpointGA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA, oldPressureSetpointGA, pressureSetpointGA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux1() {
		return rfAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux1(float newRfAux1) {
		float oldRfAux1 = rfAux1;
		rfAux1 = newRfAux1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX1, oldRfAux1, rfAux1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux2() {
		return rfAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux2(float newRfAux2) {
		float oldRfAux2 = rfAux2;
		rfAux2 = newRfAux2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX2, oldRfAux2, rfAux2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(float newLowerLimit) {
		float oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT, oldLowerLimit, lowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRodPatternConstant() {
		return rodPatternConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRodPatternConstant(float newRodPatternConstant) {
		float oldRodPatternConstant = rodPatternConstant;
		rodPatternConstant = newRodPatternConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT, oldRodPatternConstant, rodPatternConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux8() {
		return rfAux8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux8(float newRfAux8) {
		float oldRfAux8 = rfAux8;
		rfAux8 = newRfAux8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX8, oldRfAux8, rfAux8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux7() {
		return rfAux7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux7(float newRfAux7) {
		float oldRfAux7 = rfAux7;
		rfAux7 = newRfAux7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX7, oldRfAux7, rfAux7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRodPattern() {
		return rodPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRodPattern(float newRodPattern) {
		float oldRodPattern = rodPattern;
		rodPattern = newRodPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN, oldRodPattern, rodPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux4() {
		return rfAux4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux4(float newRfAux4) {
		float oldRfAux4 = rfAux4;
		rfAux4 = newRfAux4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX4, oldRfAux4, rfAux4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux3() {
		return rfAux3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux3(float newRfAux3) {
		float oldRfAux3 = rfAux3;
		rfAux3 = newRfAux3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX3, oldRfAux3, rfAux3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux6() {
		return rfAux6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux6(float newRfAux6) {
		float oldRfAux6 = rfAux6;
		rfAux6 = newRfAux6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX6, oldRfAux6, rfAux6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRfAux5() {
		return rfAux5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfAux5(float newRfAux5) {
		float oldRfAux5 = rfAux5;
		rfAux5 = newRfAux5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX5, oldRfAux5, rfAux5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProportionalGain() {
		return proportionalGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProportionalGain(float newProportionalGain) {
		float oldProportionalGain = proportionalGain;
		proportionalGain = newProportionalGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN, oldProportionalGain, proportionalGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(float newUpperLimit) {
		float oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT, oldUpperLimit, upperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighPowerLimit() {
		return highPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighPowerLimit(float newHighPowerLimit) {
		float oldHighPowerLimit = highPowerLimit;
		highPowerLimit = newHighPowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT, oldHighPowerLimit, highPowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureSetpointTC2() {
		return pressureSetpointTC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSetpointTC2(float newPressureSetpointTC2) {
		float oldPressureSetpointTC2 = pressureSetpointTC2;
		pressureSetpointTC2 = newPressureSetpointTC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2, oldPressureSetpointTC2, pressureSetpointTC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureSetpointTC1() {
		return pressureSetpointTC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSetpointTC1(float newPressureSetpointTC1) {
		float oldPressureSetpointTC1 = pressureSetpointTC1;
		pressureSetpointTC1 = newPressureSetpointTC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1, oldPressureSetpointTC1, pressureSetpointTC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureLimit() {
		return pressureLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureLimit(float newPressureLimit) {
		float oldPressureLimit = pressureLimit;
		pressureLimit = newPressureLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT, oldPressureLimit, pressureLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
				return getLowPowerLimit();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
				return getInCoreThermalTC();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
				return getIntegralGain();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
				return getPressureSetpointGA();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX1:
				return getRfAux1();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX2:
				return getRfAux2();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
				return getLowerLimit();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
				return getRodPatternConstant();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX8:
				return getRfAux8();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX7:
				return getRfAux7();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
				return getRodPattern();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX4:
				return getRfAux4();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX3:
				return getRfAux3();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX6:
				return getRfAux6();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX5:
				return getRfAux5();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
				return getProportionalGain();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
				return getUpperLimit();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
				return getHighPowerLimit();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
				return getPressureSetpointTC2();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
				return getPressureSetpointTC1();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
				return getPressureLimit();
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
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
				setLowPowerLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
				setInCoreThermalTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
				setIntegralGain((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
				setPressureSetpointGA((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX1:
				setRfAux1((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX2:
				setRfAux2((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
				setLowerLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
				setRodPatternConstant((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX8:
				setRfAux8((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX7:
				setRfAux7((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
				setRodPattern((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX4:
				setRfAux4((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX3:
				setRfAux3((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX6:
				setRfAux6((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX5:
				setRfAux5((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
				setProportionalGain((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
				setUpperLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
				setHighPowerLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
				setPressureSetpointTC2((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
				setPressureSetpointTC1((Float)newValue);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
				setPressureLimit((Float)newValue);
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
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
				setLowPowerLimit(LOW_POWER_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
				setInCoreThermalTC(IN_CORE_THERMAL_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
				setIntegralGain(INTEGRAL_GAIN_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
				setPressureSetpointGA(PRESSURE_SETPOINT_GA_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX1:
				setRfAux1(RF_AUX1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX2:
				setRfAux2(RF_AUX2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
				setLowerLimit(LOWER_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
				setRodPatternConstant(ROD_PATTERN_CONSTANT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX8:
				setRfAux8(RF_AUX8_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX7:
				setRfAux7(RF_AUX7_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
				setRodPattern(ROD_PATTERN_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX4:
				setRfAux4(RF_AUX4_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX3:
				setRfAux3(RF_AUX3_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX6:
				setRfAux6(RF_AUX6_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX5:
				setRfAux5(RF_AUX5_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
				setProportionalGain(PROPORTIONAL_GAIN_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
				setUpperLimit(UPPER_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
				setHighPowerLimit(HIGH_POWER_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
				setPressureSetpointTC2(PRESSURE_SETPOINT_TC2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
				setPressureSetpointTC1(PRESSURE_SETPOINT_TC1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
				setPressureLimit(PRESSURE_LIMIT_EDEFAULT);
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
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
				return lowPowerLimit != LOW_POWER_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
				return inCoreThermalTC != IN_CORE_THERMAL_TC_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
				return integralGain != INTEGRAL_GAIN_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
				return pressureSetpointGA != PRESSURE_SETPOINT_GA_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX1:
				return rfAux1 != RF_AUX1_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX2:
				return rfAux2 != RF_AUX2_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
				return lowerLimit != LOWER_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
				return rodPatternConstant != ROD_PATTERN_CONSTANT_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX8:
				return rfAux8 != RF_AUX8_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX7:
				return rfAux7 != RF_AUX7_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
				return rodPattern != ROD_PATTERN_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX4:
				return rfAux4 != RF_AUX4_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX3:
				return rfAux3 != RF_AUX3_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX6:
				return rfAux6 != RF_AUX6_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__RF_AUX5:
				return rfAux5 != RF_AUX5_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
				return proportionalGain != PROPORTIONAL_GAIN_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
				return upperLimit != UPPER_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
				return highPowerLimit != HIGH_POWER_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
				return pressureSetpointTC2 != PRESSURE_SETPOINT_TC2_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
				return pressureSetpointTC1 != PRESSURE_SETPOINT_TC1_EDEFAULT;
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
				return pressureLimit != PRESSURE_LIMIT_EDEFAULT;
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
		result.append(" (lowPowerLimit: ");
		result.append(lowPowerLimit);
		result.append(", inCoreThermalTC: ");
		result.append(inCoreThermalTC);
		result.append(", integralGain: ");
		result.append(integralGain);
		result.append(", pressureSetpointGA: ");
		result.append(pressureSetpointGA);
		result.append(", rfAux1: ");
		result.append(rfAux1);
		result.append(", rfAux2: ");
		result.append(rfAux2);
		result.append(", lowerLimit: ");
		result.append(lowerLimit);
		result.append(", rodPatternConstant: ");
		result.append(rodPatternConstant);
		result.append(", rfAux8: ");
		result.append(rfAux8);
		result.append(", rfAux7: ");
		result.append(rfAux7);
		result.append(", rodPattern: ");
		result.append(rodPattern);
		result.append(", rfAux4: ");
		result.append(rfAux4);
		result.append(", rfAux3: ");
		result.append(rfAux3);
		result.append(", rfAux6: ");
		result.append(rfAux6);
		result.append(", rfAux5: ");
		result.append(rfAux5);
		result.append(", proportionalGain: ");
		result.append(proportionalGain);
		result.append(", upperLimit: ");
		result.append(upperLimit);
		result.append(", highPowerLimit: ");
		result.append(highPowerLimit);
		result.append(", pressureSetpointTC2: ");
		result.append(pressureSetpointTC2);
		result.append(", pressureSetpointTC1: ");
		result.append(pressureSetpointTC1);
		result.append(", pressureLimit: ");
		result.append(pressureLimit);
		result.append(')');
		return result.toString();
	}

} //BWRSteamSupplyImpl
