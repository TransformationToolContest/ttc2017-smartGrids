/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fossil Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getPressureCtrlPG <em>Pressure Ctrl PG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getFeedWaterPG <em>Feed Water PG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getControlTC <em>Control TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getMaxErrorRateP <em>Max Error Rate P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getControlIC <em>Control IC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getMinErrorRateP <em>Min Error Rate P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getFuelDemandLimit <em>Fuel Demand Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getPressureCtrlDG <em>Pressure Ctrl DG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getControlPC <em>Control PC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getFeedWaterTC <em>Feed Water TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getControlErrorBiasP <em>Control Error Bias P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getFeedWaterIG <em>Feed Water IG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getPressureCtrlIG <em>Pressure Ctrl IG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getFuelSupplyTC <em>Fuel Supply TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getPressureFeedback <em>Pressure Feedback</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getFuelSupplyDelay <em>Fuel Supply Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getBoilerControlMode <em>Boiler Control Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getControlPEB <em>Control PEB</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl#getControlPED <em>Control PED</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FossilSteamSupplyImpl extends SteamSupplyImpl implements FossilSteamSupply {
	/**
	 * The default value of the '{@link #getPressureCtrlPG() <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlPG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CTRL_PG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCtrlPG() <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlPG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCtrlPG = PRESSURE_CTRL_PG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperHeater1Capacity() <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater1Capacity()
	 * @generated
	 * @ordered
	 */
	protected static final float SUPER_HEATER1_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuperHeater1Capacity() <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater1Capacity()
	 * @generated
	 * @ordered
	 */
	protected float superHeater1Capacity = SUPER_HEATER1_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedWaterPG() <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterPG()
	 * @generated
	 * @ordered
	 */
	protected static final float FEED_WATER_PG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedWaterPG() <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterPG()
	 * @generated
	 * @ordered
	 */
	protected float feedWaterPG = FEED_WATER_PG_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlTC() <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTC()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlTC() <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTC()
	 * @generated
	 * @ordered
	 */
	protected float controlTC = CONTROL_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechPowerSensorLag() <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechPowerSensorLag()
	 * @generated
	 * @ordered
	 */
	protected static final float MECH_POWER_SENSOR_LAG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMechPowerSensorLag() <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechPowerSensorLag()
	 * @generated
	 * @ordered
	 */
	protected float mechPowerSensorLag = MECH_POWER_SENSOR_LAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureSP()
	 * @generated
	 * @ordered
	 */
	protected static final float THROTTLE_PRESSURE_SP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureSP()
	 * @generated
	 * @ordered
	 */
	protected float throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxErrorRateP() <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ERROR_RATE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxErrorRateP() <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected float maxErrorRateP = MAX_ERROR_RATE_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlIC() <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlIC()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_IC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlIC() <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlIC()
	 * @generated
	 * @ordered
	 */
	protected float controlIC = CONTROL_IC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinErrorRateP() <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_ERROR_RATE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinErrorRateP() <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected float minErrorRateP = MIN_ERROR_RATE_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelDemandLimit() <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDemandLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_DEMAND_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelDemandLimit() <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDemandLimit()
	 * @generated
	 * @ordered
	 */
	protected float fuelDemandLimit = FUEL_DEMAND_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperHeaterPipePD() <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeaterPipePD()
	 * @generated
	 * @ordered
	 */
	protected static final float SUPER_HEATER_PIPE_PD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuperHeaterPipePD() <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeaterPipePD()
	 * @generated
	 * @ordered
	 */
	protected float superHeaterPipePD = SUPER_HEATER_PIPE_PD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureCtrlDG() <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlDG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CTRL_DG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCtrlDG() <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlDG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCtrlDG = PRESSURE_CTRL_DG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxPowerVersusVoltage() <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_VERSUS_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerVersusVoltage() <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerVersusVoltage = AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPC() <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPC()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPC() <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPC()
	 * @generated
	 * @ordered
	 */
	protected float controlPC = CONTROL_PC_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedWaterTC() <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterTC()
	 * @generated
	 * @ordered
	 */
	protected static final float FEED_WATER_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedWaterTC() <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterTC()
	 * @generated
	 * @ordered
	 */
	protected float feedWaterTC = FEED_WATER_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlErrorBiasP() <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlErrorBiasP()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_ERROR_BIAS_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlErrorBiasP() <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlErrorBiasP()
	 * @generated
	 * @ordered
	 */
	protected float controlErrorBiasP = CONTROL_ERROR_BIAS_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedWaterIG() <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterIG()
	 * @generated
	 * @ordered
	 */
	protected static final float FEED_WATER_IG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedWaterIG() <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterIG()
	 * @generated
	 * @ordered
	 */
	protected float feedWaterIG = FEED_WATER_IG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureCtrlIG() <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlIG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CTRL_IG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCtrlIG() <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlIG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCtrlIG = PRESSURE_CTRL_IG_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelSupplyTC() <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyTC()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_SUPPLY_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelSupplyTC() <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyTC()
	 * @generated
	 * @ordered
	 */
	protected float fuelSupplyTC = FUEL_SUPPLY_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxPowerVersusFrequency() <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_VERSUS_FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerVersusFrequency() <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerVersusFrequency = AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureFeedback() <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESSURE_FEEDBACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPressureFeedback() <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureFeedback()
	 * @generated
	 * @ordered
	 */
	protected int pressureFeedback = PRESSURE_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelSupplyDelay() <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_SUPPLY_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelSupplyDelay() <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyDelay()
	 * @generated
	 * @ordered
	 */
	protected float fuelSupplyDelay = FUEL_SUPPLY_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoilerControlMode() <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilerControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final BoilerControlMode BOILER_CONTROL_MODE_EDEFAULT = BoilerControlMode.COORDINATED;

	/**
	 * The cached value of the '{@link #getBoilerControlMode() <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilerControlMode()
	 * @generated
	 * @ordered
	 */
	protected BoilerControlMode boilerControlMode = BOILER_CONTROL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperHeater2Capacity() <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater2Capacity()
	 * @generated
	 * @ordered
	 */
	protected static final float SUPER_HEATER2_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuperHeater2Capacity() <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater2Capacity()
	 * @generated
	 * @ordered
	 */
	protected float superHeater2Capacity = SUPER_HEATER2_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPEB() <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPEB()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PEB_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPEB() <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPEB()
	 * @generated
	 * @ordered
	 */
	protected float controlPEB = CONTROL_PEB_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPED() <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPED()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPED() <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPED()
	 * @generated
	 * @ordered
	 */
	protected float controlPED = CONTROL_PED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FossilSteamSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.FOSSIL_STEAM_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureCtrlPG() {
		return pressureCtrlPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureCtrlPG(float newPressureCtrlPG) {
		float oldPressureCtrlPG = pressureCtrlPG;
		pressureCtrlPG = newPressureCtrlPG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG, oldPressureCtrlPG, pressureCtrlPG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSuperHeater1Capacity() {
		return superHeater1Capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperHeater1Capacity(float newSuperHeater1Capacity) {
		float oldSuperHeater1Capacity = superHeater1Capacity;
		superHeater1Capacity = newSuperHeater1Capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY, oldSuperHeater1Capacity, superHeater1Capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFeedWaterPG() {
		return feedWaterPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedWaterPG(float newFeedWaterPG) {
		float oldFeedWaterPG = feedWaterPG;
		feedWaterPG = newFeedWaterPG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG, oldFeedWaterPG, feedWaterPG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlTC() {
		return controlTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlTC(float newControlTC) {
		float oldControlTC = controlTC;
		controlTC = newControlTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC, oldControlTC, controlTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMechPowerSensorLag() {
		return mechPowerSensorLag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechPowerSensorLag(float newMechPowerSensorLag) {
		float oldMechPowerSensorLag = mechPowerSensorLag;
		mechPowerSensorLag = newMechPowerSensorLag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG, oldMechPowerSensorLag, mechPowerSensorLag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThrottlePressureSP() {
		return throttlePressureSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrottlePressureSP(float newThrottlePressureSP) {
		float oldThrottlePressureSP = throttlePressureSP;
		throttlePressureSP = newThrottlePressureSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP, oldThrottlePressureSP, throttlePressureSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxErrorRateP() {
		return maxErrorRateP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxErrorRateP(float newMaxErrorRateP) {
		float oldMaxErrorRateP = maxErrorRateP;
		maxErrorRateP = newMaxErrorRateP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P, oldMaxErrorRateP, maxErrorRateP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlIC() {
		return controlIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlIC(float newControlIC) {
		float oldControlIC = controlIC;
		controlIC = newControlIC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC, oldControlIC, controlIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinErrorRateP() {
		return minErrorRateP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinErrorRateP(float newMinErrorRateP) {
		float oldMinErrorRateP = minErrorRateP;
		minErrorRateP = newMinErrorRateP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P, oldMinErrorRateP, minErrorRateP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelDemandLimit() {
		return fuelDemandLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelDemandLimit(float newFuelDemandLimit) {
		float oldFuelDemandLimit = fuelDemandLimit;
		fuelDemandLimit = newFuelDemandLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT, oldFuelDemandLimit, fuelDemandLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSuperHeaterPipePD() {
		return superHeaterPipePD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperHeaterPipePD(float newSuperHeaterPipePD) {
		float oldSuperHeaterPipePD = superHeaterPipePD;
		superHeaterPipePD = newSuperHeaterPipePD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD, oldSuperHeaterPipePD, superHeaterPipePD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureCtrlDG() {
		return pressureCtrlDG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureCtrlDG(float newPressureCtrlDG) {
		float oldPressureCtrlDG = pressureCtrlDG;
		pressureCtrlDG = newPressureCtrlDG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG, oldPressureCtrlDG, pressureCtrlDG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAuxPowerVersusVoltage() {
		return auxPowerVersusVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxPowerVersusVoltage(float newAuxPowerVersusVoltage) {
		float oldAuxPowerVersusVoltage = auxPowerVersusVoltage;
		auxPowerVersusVoltage = newAuxPowerVersusVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE, oldAuxPowerVersusVoltage, auxPowerVersusVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlPC() {
		return controlPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPC(float newControlPC) {
		float oldControlPC = controlPC;
		controlPC = newControlPC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC, oldControlPC, controlPC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFeedWaterTC() {
		return feedWaterTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedWaterTC(float newFeedWaterTC) {
		float oldFeedWaterTC = feedWaterTC;
		feedWaterTC = newFeedWaterTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC, oldFeedWaterTC, feedWaterTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlErrorBiasP() {
		return controlErrorBiasP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlErrorBiasP(float newControlErrorBiasP) {
		float oldControlErrorBiasP = controlErrorBiasP;
		controlErrorBiasP = newControlErrorBiasP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P, oldControlErrorBiasP, controlErrorBiasP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFeedWaterIG() {
		return feedWaterIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedWaterIG(float newFeedWaterIG) {
		float oldFeedWaterIG = feedWaterIG;
		feedWaterIG = newFeedWaterIG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG, oldFeedWaterIG, feedWaterIG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureCtrlIG() {
		return pressureCtrlIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureCtrlIG(float newPressureCtrlIG) {
		float oldPressureCtrlIG = pressureCtrlIG;
		pressureCtrlIG = newPressureCtrlIG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG, oldPressureCtrlIG, pressureCtrlIG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelSupplyTC() {
		return fuelSupplyTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelSupplyTC(float newFuelSupplyTC) {
		float oldFuelSupplyTC = fuelSupplyTC;
		fuelSupplyTC = newFuelSupplyTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC, oldFuelSupplyTC, fuelSupplyTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAuxPowerVersusFrequency() {
		return auxPowerVersusFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxPowerVersusFrequency(float newAuxPowerVersusFrequency) {
		float oldAuxPowerVersusFrequency = auxPowerVersusFrequency;
		auxPowerVersusFrequency = newAuxPowerVersusFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY, oldAuxPowerVersusFrequency, auxPowerVersusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPressureFeedback() {
		return pressureFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureFeedback(int newPressureFeedback) {
		int oldPressureFeedback = pressureFeedback;
		pressureFeedback = newPressureFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK, oldPressureFeedback, pressureFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelSupplyDelay() {
		return fuelSupplyDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelSupplyDelay(float newFuelSupplyDelay) {
		float oldFuelSupplyDelay = fuelSupplyDelay;
		fuelSupplyDelay = newFuelSupplyDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY, oldFuelSupplyDelay, fuelSupplyDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoilerControlMode getBoilerControlMode() {
		return boilerControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoilerControlMode(BoilerControlMode newBoilerControlMode) {
		BoilerControlMode oldBoilerControlMode = boilerControlMode;
		boilerControlMode = newBoilerControlMode == null ? BOILER_CONTROL_MODE_EDEFAULT : newBoilerControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE, oldBoilerControlMode, boilerControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSuperHeater2Capacity() {
		return superHeater2Capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperHeater2Capacity(float newSuperHeater2Capacity) {
		float oldSuperHeater2Capacity = superHeater2Capacity;
		superHeater2Capacity = newSuperHeater2Capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY, oldSuperHeater2Capacity, superHeater2Capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlPEB() {
		return controlPEB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPEB(float newControlPEB) {
		float oldControlPEB = controlPEB;
		controlPEB = newControlPEB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB, oldControlPEB, controlPEB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlPED() {
		return controlPED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPED(float newControlPED) {
		float oldControlPED = controlPED;
		controlPED = newControlPED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED, oldControlPED, controlPED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				return getPressureCtrlPG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				return getSuperHeater1Capacity();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				return getFeedWaterPG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				return getControlTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				return getMechPowerSensorLag();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return getThrottlePressureSP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				return getMaxErrorRateP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				return getControlIC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				return getMinErrorRateP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				return getFuelDemandLimit();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				return getSuperHeaterPipePD();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				return getPressureCtrlDG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				return getAuxPowerVersusVoltage();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				return getControlPC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				return getFeedWaterTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				return getControlErrorBiasP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				return getFeedWaterIG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				return getPressureCtrlIG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				return getFuelSupplyTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				return getAuxPowerVersusFrequency();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				return getPressureFeedback();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				return getFuelSupplyDelay();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				return getBoilerControlMode();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				return getSuperHeater2Capacity();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				return getControlPEB();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				return getControlPED();
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
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				setPressureCtrlPG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				setSuperHeater1Capacity((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				setFeedWaterPG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				setControlTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				setMechPowerSensorLag((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				setThrottlePressureSP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				setMaxErrorRateP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				setControlIC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				setMinErrorRateP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				setFuelDemandLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				setSuperHeaterPipePD((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				setPressureCtrlDG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				setAuxPowerVersusVoltage((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				setControlPC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				setFeedWaterTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				setControlErrorBiasP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				setFeedWaterIG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				setPressureCtrlIG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				setFuelSupplyTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				setAuxPowerVersusFrequency((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				setPressureFeedback((Integer)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				setFuelSupplyDelay((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				setBoilerControlMode((BoilerControlMode)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				setSuperHeater2Capacity((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				setControlPEB((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				setControlPED((Float)newValue);
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
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				setPressureCtrlPG(PRESSURE_CTRL_PG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				setSuperHeater1Capacity(SUPER_HEATER1_CAPACITY_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				setFeedWaterPG(FEED_WATER_PG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				setControlTC(CONTROL_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				setMechPowerSensorLag(MECH_POWER_SENSOR_LAG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				setThrottlePressureSP(THROTTLE_PRESSURE_SP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				setMaxErrorRateP(MAX_ERROR_RATE_P_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				setControlIC(CONTROL_IC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				setMinErrorRateP(MIN_ERROR_RATE_P_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				setFuelDemandLimit(FUEL_DEMAND_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				setSuperHeaterPipePD(SUPER_HEATER_PIPE_PD_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				setPressureCtrlDG(PRESSURE_CTRL_DG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				setAuxPowerVersusVoltage(AUX_POWER_VERSUS_VOLTAGE_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				setControlPC(CONTROL_PC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				setFeedWaterTC(FEED_WATER_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				setControlErrorBiasP(CONTROL_ERROR_BIAS_P_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				setFeedWaterIG(FEED_WATER_IG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				setPressureCtrlIG(PRESSURE_CTRL_IG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				setFuelSupplyTC(FUEL_SUPPLY_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				setAuxPowerVersusFrequency(AUX_POWER_VERSUS_FREQUENCY_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				setPressureFeedback(PRESSURE_FEEDBACK_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				setFuelSupplyDelay(FUEL_SUPPLY_DELAY_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				setBoilerControlMode(BOILER_CONTROL_MODE_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				setSuperHeater2Capacity(SUPER_HEATER2_CAPACITY_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				setControlPEB(CONTROL_PEB_EDEFAULT);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				setControlPED(CONTROL_PED_EDEFAULT);
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
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				return pressureCtrlPG != PRESSURE_CTRL_PG_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				return superHeater1Capacity != SUPER_HEATER1_CAPACITY_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				return feedWaterPG != FEED_WATER_PG_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				return controlTC != CONTROL_TC_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				return mechPowerSensorLag != MECH_POWER_SENSOR_LAG_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return throttlePressureSP != THROTTLE_PRESSURE_SP_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				return maxErrorRateP != MAX_ERROR_RATE_P_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				return controlIC != CONTROL_IC_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				return minErrorRateP != MIN_ERROR_RATE_P_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				return fuelDemandLimit != FUEL_DEMAND_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				return superHeaterPipePD != SUPER_HEATER_PIPE_PD_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				return pressureCtrlDG != PRESSURE_CTRL_DG_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				return auxPowerVersusVoltage != AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				return controlPC != CONTROL_PC_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				return feedWaterTC != FEED_WATER_TC_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				return controlErrorBiasP != CONTROL_ERROR_BIAS_P_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				return feedWaterIG != FEED_WATER_IG_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				return pressureCtrlIG != PRESSURE_CTRL_IG_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				return fuelSupplyTC != FUEL_SUPPLY_TC_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				return auxPowerVersusFrequency != AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				return pressureFeedback != PRESSURE_FEEDBACK_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				return fuelSupplyDelay != FUEL_SUPPLY_DELAY_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				return boilerControlMode != BOILER_CONTROL_MODE_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				return superHeater2Capacity != SUPER_HEATER2_CAPACITY_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				return controlPEB != CONTROL_PEB_EDEFAULT;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				return controlPED != CONTROL_PED_EDEFAULT;
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
		result.append(" (pressureCtrlPG: ");
		result.append(pressureCtrlPG);
		result.append(", superHeater1Capacity: ");
		result.append(superHeater1Capacity);
		result.append(", feedWaterPG: ");
		result.append(feedWaterPG);
		result.append(", controlTC: ");
		result.append(controlTC);
		result.append(", mechPowerSensorLag: ");
		result.append(mechPowerSensorLag);
		result.append(", throttlePressureSP: ");
		result.append(throttlePressureSP);
		result.append(", maxErrorRateP: ");
		result.append(maxErrorRateP);
		result.append(", controlIC: ");
		result.append(controlIC);
		result.append(", minErrorRateP: ");
		result.append(minErrorRateP);
		result.append(", fuelDemandLimit: ");
		result.append(fuelDemandLimit);
		result.append(", superHeaterPipePD: ");
		result.append(superHeaterPipePD);
		result.append(", pressureCtrlDG: ");
		result.append(pressureCtrlDG);
		result.append(", auxPowerVersusVoltage: ");
		result.append(auxPowerVersusVoltage);
		result.append(", controlPC: ");
		result.append(controlPC);
		result.append(", feedWaterTC: ");
		result.append(feedWaterTC);
		result.append(", controlErrorBiasP: ");
		result.append(controlErrorBiasP);
		result.append(", feedWaterIG: ");
		result.append(feedWaterIG);
		result.append(", pressureCtrlIG: ");
		result.append(pressureCtrlIG);
		result.append(", fuelSupplyTC: ");
		result.append(fuelSupplyTC);
		result.append(", auxPowerVersusFrequency: ");
		result.append(auxPowerVersusFrequency);
		result.append(", pressureFeedback: ");
		result.append(pressureFeedback);
		result.append(", fuelSupplyDelay: ");
		result.append(fuelSupplyDelay);
		result.append(", boilerControlMode: ");
		result.append(boilerControlMode);
		result.append(", superHeater2Capacity: ");
		result.append(superHeater2Capacity);
		result.append(", controlPEB: ");
		result.append(controlPEB);
		result.append(", controlPED: ");
		result.append(controlPED);
		result.append(')');
		return result.toString();
	}

} //FossilSteamSupplyImpl
