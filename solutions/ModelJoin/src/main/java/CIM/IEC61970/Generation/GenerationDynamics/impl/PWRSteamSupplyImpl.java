/**
 */
package CIM.IEC61970.Generation.GenerationDynamics.impl;

import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getPressureCG <em>Pressure CG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getHotLegLagTC <em>Hot Leg Lag TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getColdLegLagTC <em>Cold Leg Lag TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getSteamFlowFG <em>Steam Flow FG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getSteamPressureFG <em>Steam Pressure FG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getFeedbackFactor <em>Feedback Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getCoreNeutronicsHT <em>Core Neutronics HT</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getColdLegFG1 <em>Cold Leg FG1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getColdLegFG2 <em>Cold Leg FG2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PWRSteamSupplyImpl extends SteamSupplyImpl implements PWRSteamSupply {
	/**
	 * The default value of the '{@link #getHotLegToColdLegGain() <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegToColdLegGain()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotLegToColdLegGain() <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegToColdLegGain()
	 * @generated
	 * @ordered
	 */
	protected float hotLegToColdLegGain = HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureCG() <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCG() <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCG = PRESSURE_CG_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotLegLagTC() <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_LEG_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotLegLagTC() <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected float hotLegLagTC = HOT_LEG_LAG_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteamPressureDropLagTC() <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureDropLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamPressureDropLagTC() <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureDropLagTC()
	 * @generated
	 * @ordered
	 */
	protected float steamPressureDropLagTC = STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT;

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
	 * The default value of the '{@link #getColdLegFBLeadTC2() <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC2()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FB_LEAD_TC2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFBLeadTC2() <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC2()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFBLeadTC2 = COLD_LEG_FB_LEAD_TC2_EDEFAULT;

	/**
	 * The default value of the '{@link #getColdLegFBLeadTC1() <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC1()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FB_LEAD_TC1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFBLeadTC1() <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC1()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFBLeadTC1 = COLD_LEG_FB_LEAD_TC1_EDEFAULT;

	/**
	 * The default value of the '{@link #getColdLegLagTC() <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegLagTC() <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected float coldLegLagTC = COLD_LEG_LAG_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteamFlowFG() <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamFlowFG()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_FLOW_FG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamFlowFG() <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamFlowFG()
	 * @generated
	 * @ordered
	 */
	protected float steamFlowFG = STEAM_FLOW_FG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreHTLagTC2() <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC2()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_HT_LAG_TC2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreHTLagTC2() <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC2()
	 * @generated
	 * @ordered
	 */
	protected float coreHTLagTC2 = CORE_HT_LAG_TC2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreHTLagTC1() <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC1()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_HT_LAG_TC1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreHTLagTC1() <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC1()
	 * @generated
	 * @ordered
	 */
	protected float coreHTLagTC1 = CORE_HT_LAG_TC1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreNeutronicsEffTC() <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsEffTC()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_NEUTRONICS_EFF_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreNeutronicsEffTC() <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsEffTC()
	 * @generated
	 * @ordered
	 */
	protected float coreNeutronicsEffTC = CORE_NEUTRONICS_EFF_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteamPressureFG() <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureFG()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_PRESSURE_FG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamPressureFG() <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureFG()
	 * @generated
	 * @ordered
	 */
	protected float steamPressureFG = STEAM_PRESSURE_FG_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedbackFactor() <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float FEEDBACK_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedbackFactor() <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackFactor()
	 * @generated
	 * @ordered
	 */
	protected float feedbackFactor = FEEDBACK_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotLegSteamGain() <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegSteamGain()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_LEG_STEAM_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotLegSteamGain() <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegSteamGain()
	 * @generated
	 * @ordered
	 */
	protected float hotLegSteamGain = HOT_LEG_STEAM_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreNeutronicsHT() <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsHT()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_NEUTRONICS_HT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreNeutronicsHT() <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsHT()
	 * @generated
	 * @ordered
	 */
	protected float coreNeutronicsHT = CORE_NEUTRONICS_HT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColdLegFG1() <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG1()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FG1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFG1() <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG1()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFG1 = COLD_LEG_FG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getColdLegFG2() <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG2()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FG2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFG2() <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG2()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFG2 = COLD_LEG_FG2_EDEFAULT;

	/**
	 * The default value of the '{@link #getThrottlePressureFactor() <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float THROTTLE_PRESSURE_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThrottlePressureFactor() <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureFactor()
	 * @generated
	 * @ordered
	 */
	protected float throttlePressureFactor = THROTTLE_PRESSURE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColdLegFBLagTC() <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FB_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFBLagTC() <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLagTC()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFBLagTC = COLD_LEG_FB_LAG_TC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PWRSteamSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.PWR_STEAM_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHotLegToColdLegGain() {
		return hotLegToColdLegGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotLegToColdLegGain(float newHotLegToColdLegGain) {
		float oldHotLegToColdLegGain = hotLegToColdLegGain;
		hotLegToColdLegGain = newHotLegToColdLegGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN, oldHotLegToColdLegGain, hotLegToColdLegGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressureCG() {
		return pressureCG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureCG(float newPressureCG) {
		float oldPressureCG = pressureCG;
		pressureCG = newPressureCG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG, oldPressureCG, pressureCG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHotLegLagTC() {
		return hotLegLagTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotLegLagTC(float newHotLegLagTC) {
		float oldHotLegLagTC = hotLegLagTC;
		hotLegLagTC = newHotLegLagTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC, oldHotLegLagTC, hotLegLagTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteamPressureDropLagTC() {
		return steamPressureDropLagTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamPressureDropLagTC(float newSteamPressureDropLagTC) {
		float oldSteamPressureDropLagTC = steamPressureDropLagTC;
		steamPressureDropLagTC = newSteamPressureDropLagTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC, oldSteamPressureDropLagTC, steamPressureDropLagTC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP, oldThrottlePressureSP, throttlePressureSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getColdLegFBLeadTC2() {
		return coldLegFBLeadTC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColdLegFBLeadTC2(float newColdLegFBLeadTC2) {
		float oldColdLegFBLeadTC2 = coldLegFBLeadTC2;
		coldLegFBLeadTC2 = newColdLegFBLeadTC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2, oldColdLegFBLeadTC2, coldLegFBLeadTC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getColdLegFBLeadTC1() {
		return coldLegFBLeadTC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColdLegFBLeadTC1(float newColdLegFBLeadTC1) {
		float oldColdLegFBLeadTC1 = coldLegFBLeadTC1;
		coldLegFBLeadTC1 = newColdLegFBLeadTC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1, oldColdLegFBLeadTC1, coldLegFBLeadTC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getColdLegLagTC() {
		return coldLegLagTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColdLegLagTC(float newColdLegLagTC) {
		float oldColdLegLagTC = coldLegLagTC;
		coldLegLagTC = newColdLegLagTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC, oldColdLegLagTC, coldLegLagTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteamFlowFG() {
		return steamFlowFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamFlowFG(float newSteamFlowFG) {
		float oldSteamFlowFG = steamFlowFG;
		steamFlowFG = newSteamFlowFG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG, oldSteamFlowFG, steamFlowFG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreHTLagTC2() {
		return coreHTLagTC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreHTLagTC2(float newCoreHTLagTC2) {
		float oldCoreHTLagTC2 = coreHTLagTC2;
		coreHTLagTC2 = newCoreHTLagTC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2, oldCoreHTLagTC2, coreHTLagTC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreHTLagTC1() {
		return coreHTLagTC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreHTLagTC1(float newCoreHTLagTC1) {
		float oldCoreHTLagTC1 = coreHTLagTC1;
		coreHTLagTC1 = newCoreHTLagTC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1, oldCoreHTLagTC1, coreHTLagTC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreNeutronicsEffTC() {
		return coreNeutronicsEffTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreNeutronicsEffTC(float newCoreNeutronicsEffTC) {
		float oldCoreNeutronicsEffTC = coreNeutronicsEffTC;
		coreNeutronicsEffTC = newCoreNeutronicsEffTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC, oldCoreNeutronicsEffTC, coreNeutronicsEffTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteamPressureFG() {
		return steamPressureFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamPressureFG(float newSteamPressureFG) {
		float oldSteamPressureFG = steamPressureFG;
		steamPressureFG = newSteamPressureFG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG, oldSteamPressureFG, steamPressureFG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFeedbackFactor() {
		return feedbackFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackFactor(float newFeedbackFactor) {
		float oldFeedbackFactor = feedbackFactor;
		feedbackFactor = newFeedbackFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR, oldFeedbackFactor, feedbackFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHotLegSteamGain() {
		return hotLegSteamGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotLegSteamGain(float newHotLegSteamGain) {
		float oldHotLegSteamGain = hotLegSteamGain;
		hotLegSteamGain = newHotLegSteamGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN, oldHotLegSteamGain, hotLegSteamGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreNeutronicsHT() {
		return coreNeutronicsHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreNeutronicsHT(float newCoreNeutronicsHT) {
		float oldCoreNeutronicsHT = coreNeutronicsHT;
		coreNeutronicsHT = newCoreNeutronicsHT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT, oldCoreNeutronicsHT, coreNeutronicsHT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getColdLegFG1() {
		return coldLegFG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColdLegFG1(float newColdLegFG1) {
		float oldColdLegFG1 = coldLegFG1;
		coldLegFG1 = newColdLegFG1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1, oldColdLegFG1, coldLegFG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getColdLegFG2() {
		return coldLegFG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColdLegFG2(float newColdLegFG2) {
		float oldColdLegFG2 = coldLegFG2;
		coldLegFG2 = newColdLegFG2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2, oldColdLegFG2, coldLegFG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThrottlePressureFactor() {
		return throttlePressureFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrottlePressureFactor(float newThrottlePressureFactor) {
		float oldThrottlePressureFactor = throttlePressureFactor;
		throttlePressureFactor = newThrottlePressureFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR, oldThrottlePressureFactor, throttlePressureFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getColdLegFBLagTC() {
		return coldLegFBLagTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColdLegFBLagTC(float newColdLegFBLagTC) {
		float oldColdLegFBLagTC = coldLegFBLagTC;
		coldLegFBLagTC = newColdLegFBLagTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC, oldColdLegFBLagTC, coldLegFBLagTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				return getHotLegToColdLegGain();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				return getPressureCG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				return getHotLegLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				return getSteamPressureDropLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return getThrottlePressureSP();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				return getColdLegFBLeadTC2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				return getColdLegFBLeadTC1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				return getColdLegLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				return getSteamFlowFG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				return getCoreHTLagTC2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				return getCoreHTLagTC1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				return getCoreNeutronicsEffTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				return getSteamPressureFG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				return getFeedbackFactor();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				return getHotLegSteamGain();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				return getCoreNeutronicsHT();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				return getColdLegFG1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				return getColdLegFG2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				return getThrottlePressureFactor();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				return getColdLegFBLagTC();
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
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				setHotLegToColdLegGain((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				setPressureCG((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				setHotLegLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				setSteamPressureDropLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				setThrottlePressureSP((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				setColdLegFBLeadTC2((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				setColdLegFBLeadTC1((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				setColdLegLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				setSteamFlowFG((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				setCoreHTLagTC2((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				setCoreHTLagTC1((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				setCoreNeutronicsEffTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				setSteamPressureFG((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				setFeedbackFactor((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				setHotLegSteamGain((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				setCoreNeutronicsHT((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				setColdLegFG1((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				setColdLegFG2((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				setThrottlePressureFactor((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				setColdLegFBLagTC((Float)newValue);
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
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				setHotLegToColdLegGain(HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				setPressureCG(PRESSURE_CG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				setHotLegLagTC(HOT_LEG_LAG_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				setSteamPressureDropLagTC(STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				setThrottlePressureSP(THROTTLE_PRESSURE_SP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				setColdLegFBLeadTC2(COLD_LEG_FB_LEAD_TC2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				setColdLegFBLeadTC1(COLD_LEG_FB_LEAD_TC1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				setColdLegLagTC(COLD_LEG_LAG_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				setSteamFlowFG(STEAM_FLOW_FG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				setCoreHTLagTC2(CORE_HT_LAG_TC2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				setCoreHTLagTC1(CORE_HT_LAG_TC1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				setCoreNeutronicsEffTC(CORE_NEUTRONICS_EFF_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				setSteamPressureFG(STEAM_PRESSURE_FG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				setFeedbackFactor(FEEDBACK_FACTOR_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				setHotLegSteamGain(HOT_LEG_STEAM_GAIN_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				setCoreNeutronicsHT(CORE_NEUTRONICS_HT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				setColdLegFG1(COLD_LEG_FG1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				setColdLegFG2(COLD_LEG_FG2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				setThrottlePressureFactor(THROTTLE_PRESSURE_FACTOR_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				setColdLegFBLagTC(COLD_LEG_FB_LAG_TC_EDEFAULT);
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
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				return hotLegToColdLegGain != HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				return pressureCG != PRESSURE_CG_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				return hotLegLagTC != HOT_LEG_LAG_TC_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				return steamPressureDropLagTC != STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return throttlePressureSP != THROTTLE_PRESSURE_SP_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				return coldLegFBLeadTC2 != COLD_LEG_FB_LEAD_TC2_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				return coldLegFBLeadTC1 != COLD_LEG_FB_LEAD_TC1_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				return coldLegLagTC != COLD_LEG_LAG_TC_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				return steamFlowFG != STEAM_FLOW_FG_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				return coreHTLagTC2 != CORE_HT_LAG_TC2_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				return coreHTLagTC1 != CORE_HT_LAG_TC1_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				return coreNeutronicsEffTC != CORE_NEUTRONICS_EFF_TC_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				return steamPressureFG != STEAM_PRESSURE_FG_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				return feedbackFactor != FEEDBACK_FACTOR_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				return hotLegSteamGain != HOT_LEG_STEAM_GAIN_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				return coreNeutronicsHT != CORE_NEUTRONICS_HT_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				return coldLegFG1 != COLD_LEG_FG1_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				return coldLegFG2 != COLD_LEG_FG2_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				return throttlePressureFactor != THROTTLE_PRESSURE_FACTOR_EDEFAULT;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				return coldLegFBLagTC != COLD_LEG_FB_LAG_TC_EDEFAULT;
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
		result.append(" (hotLegToColdLegGain: ");
		result.append(hotLegToColdLegGain);
		result.append(", pressureCG: ");
		result.append(pressureCG);
		result.append(", hotLegLagTC: ");
		result.append(hotLegLagTC);
		result.append(", steamPressureDropLagTC: ");
		result.append(steamPressureDropLagTC);
		result.append(", throttlePressureSP: ");
		result.append(throttlePressureSP);
		result.append(", coldLegFBLeadTC2: ");
		result.append(coldLegFBLeadTC2);
		result.append(", coldLegFBLeadTC1: ");
		result.append(coldLegFBLeadTC1);
		result.append(", coldLegLagTC: ");
		result.append(coldLegLagTC);
		result.append(", steamFlowFG: ");
		result.append(steamFlowFG);
		result.append(", coreHTLagTC2: ");
		result.append(coreHTLagTC2);
		result.append(", coreHTLagTC1: ");
		result.append(coreHTLagTC1);
		result.append(", coreNeutronicsEffTC: ");
		result.append(coreNeutronicsEffTC);
		result.append(", steamPressureFG: ");
		result.append(steamPressureFG);
		result.append(", feedbackFactor: ");
		result.append(feedbackFactor);
		result.append(", hotLegSteamGain: ");
		result.append(hotLegSteamGain);
		result.append(", coreNeutronicsHT: ");
		result.append(coreNeutronicsHT);
		result.append(", coldLegFG1: ");
		result.append(coldLegFG1);
		result.append(", coldLegFG2: ");
		result.append(coldLegFG2);
		result.append(", throttlePressureFactor: ");
		result.append(throttlePressureFactor);
		result.append(", coldLegFBLagTC: ");
		result.append(coldLegFBLagTC);
		result.append(')');
		return result.toString();
	}

} //PWRSteamSupplyImpl
