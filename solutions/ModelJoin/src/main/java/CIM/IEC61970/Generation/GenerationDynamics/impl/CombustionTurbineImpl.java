/**
 */
package CIM.IEC61970.Generation.GenerationDynamics.impl;

import CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve;
import CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine;
import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler;

import CIM.IEC61970.Generation.Production.AirCompressor;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combustion Turbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getPowerVariationByTemp <em>Power Variation By Temp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getAmbientTemp <em>Ambient Temp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getReferenceTemp <em>Reference Temp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getAirCompressor <em>Air Compressor</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl#getTimeConstant <em>Time Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombustionTurbineImpl extends PrimeMoverImpl implements CombustionTurbine {
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
	 * The default value of the '{@link #getPowerVariationByTemp() <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerVariationByTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_VARIATION_BY_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerVariationByTemp() <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerVariationByTemp()
	 * @generated
	 * @ordered
	 */
	protected float powerVariationByTemp = POWER_VARIATION_BY_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float AMBIENT_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientTemp()
	 * @generated
	 * @ordered
	 */
	protected float ambientTemp = AMBIENT_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceTemp() <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float REFERENCE_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReferenceTemp() <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTemp()
	 * @generated
	 * @ordered
	 */
	protected float referenceTemp = REFERENCE_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isHeatRecoveryFlag() <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeatRecoveryFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEAT_RECOVERY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeatRecoveryFlag() <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeatRecoveryFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean heatRecoveryFlag = HEAT_RECOVERY_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapabilityVersusFrequency() <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPABILITY_VERSUS_FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapabilityVersusFrequency() <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected float capabilityVersusFrequency = CAPABILITY_VERSUS_FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeatRecoveryBoiler() <em>Heat Recovery Boiler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatRecoveryBoiler()
	 * @generated
	 * @ordered
	 */
	protected HeatRecoveryBoiler heatRecoveryBoiler;

	/**
	 * The cached value of the '{@link #getCTTempActivePowerCurve() <em>CT Temp Active Power Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTTempActivePowerCurve()
	 * @generated
	 * @ordered
	 */
	protected CTTempActivePowerCurve ctTempActivePowerCurve;

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
	 * The cached value of the '{@link #getAirCompressor() <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressor()
	 * @generated
	 * @ordered
	 */
	protected AirCompressor airCompressor;

	/**
	 * The default value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_CONSTANT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected float timeConstant = TIME_CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombustionTurbineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.COMBUSTION_TURBINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY, oldAuxPowerVersusFrequency, auxPowerVersusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPowerVariationByTemp() {
		return powerVariationByTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerVariationByTemp(float newPowerVariationByTemp) {
		float oldPowerVariationByTemp = powerVariationByTemp;
		powerVariationByTemp = newPowerVariationByTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP, oldPowerVariationByTemp, powerVariationByTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmbientTemp() {
		return ambientTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientTemp(float newAmbientTemp) {
		float oldAmbientTemp = ambientTemp;
		ambientTemp = newAmbientTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP, oldAmbientTemp, ambientTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReferenceTemp() {
		return referenceTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTemp(float newReferenceTemp) {
		float oldReferenceTemp = referenceTemp;
		referenceTemp = newReferenceTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP, oldReferenceTemp, referenceTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeatRecoveryFlag() {
		return heatRecoveryFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatRecoveryFlag(boolean newHeatRecoveryFlag) {
		boolean oldHeatRecoveryFlag = heatRecoveryFlag;
		heatRecoveryFlag = newHeatRecoveryFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG, oldHeatRecoveryFlag, heatRecoveryFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapabilityVersusFrequency() {
		return capabilityVersusFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityVersusFrequency(float newCapabilityVersusFrequency) {
		float oldCapabilityVersusFrequency = capabilityVersusFrequency;
		capabilityVersusFrequency = newCapabilityVersusFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY, oldCapabilityVersusFrequency, capabilityVersusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRecoveryBoiler getHeatRecoveryBoiler() {
		if (heatRecoveryBoiler != null && heatRecoveryBoiler.eIsProxy()) {
			InternalEObject oldHeatRecoveryBoiler = (InternalEObject)heatRecoveryBoiler;
			heatRecoveryBoiler = (HeatRecoveryBoiler)eResolveProxy(oldHeatRecoveryBoiler);
			if (heatRecoveryBoiler != oldHeatRecoveryBoiler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER, oldHeatRecoveryBoiler, heatRecoveryBoiler));
			}
		}
		return heatRecoveryBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRecoveryBoiler basicGetHeatRecoveryBoiler() {
		return heatRecoveryBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatRecoveryBoiler(HeatRecoveryBoiler newHeatRecoveryBoiler, NotificationChain msgs) {
		HeatRecoveryBoiler oldHeatRecoveryBoiler = heatRecoveryBoiler;
		heatRecoveryBoiler = newHeatRecoveryBoiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER, oldHeatRecoveryBoiler, newHeatRecoveryBoiler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatRecoveryBoiler(HeatRecoveryBoiler newHeatRecoveryBoiler) {
		if (newHeatRecoveryBoiler != heatRecoveryBoiler) {
			NotificationChain msgs = null;
			if (heatRecoveryBoiler != null)
				msgs = ((InternalEObject)heatRecoveryBoiler).eInverseRemove(this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs);
			if (newHeatRecoveryBoiler != null)
				msgs = ((InternalEObject)newHeatRecoveryBoiler).eInverseAdd(this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs);
			msgs = basicSetHeatRecoveryBoiler(newHeatRecoveryBoiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER, newHeatRecoveryBoiler, newHeatRecoveryBoiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTempActivePowerCurve getCTTempActivePowerCurve() {
		if (ctTempActivePowerCurve != null && ctTempActivePowerCurve.eIsProxy()) {
			InternalEObject oldCTTempActivePowerCurve = (InternalEObject)ctTempActivePowerCurve;
			ctTempActivePowerCurve = (CTTempActivePowerCurve)eResolveProxy(oldCTTempActivePowerCurve);
			if (ctTempActivePowerCurve != oldCTTempActivePowerCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, oldCTTempActivePowerCurve, ctTempActivePowerCurve));
			}
		}
		return ctTempActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTempActivePowerCurve basicGetCTTempActivePowerCurve() {
		return ctTempActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTTempActivePowerCurve(CTTempActivePowerCurve newCTTempActivePowerCurve, NotificationChain msgs) {
		CTTempActivePowerCurve oldCTTempActivePowerCurve = ctTempActivePowerCurve;
		ctTempActivePowerCurve = newCTTempActivePowerCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, oldCTTempActivePowerCurve, newCTTempActivePowerCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTTempActivePowerCurve(CTTempActivePowerCurve newCTTempActivePowerCurve) {
		if (newCTTempActivePowerCurve != ctTempActivePowerCurve) {
			NotificationChain msgs = null;
			if (ctTempActivePowerCurve != null)
				msgs = ((InternalEObject)ctTempActivePowerCurve).eInverseRemove(this, GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs);
			if (newCTTempActivePowerCurve != null)
				msgs = ((InternalEObject)newCTTempActivePowerCurve).eInverseAdd(this, GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs);
			msgs = basicSetCTTempActivePowerCurve(newCTTempActivePowerCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, newCTTempActivePowerCurve, newCTTempActivePowerCurve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE, oldAuxPowerVersusVoltage, auxPowerVersusVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor getAirCompressor() {
		if (airCompressor != null && airCompressor.eIsProxy()) {
			InternalEObject oldAirCompressor = (InternalEObject)airCompressor;
			airCompressor = (AirCompressor)eResolveProxy(oldAirCompressor);
			if (airCompressor != oldAirCompressor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, oldAirCompressor, airCompressor));
			}
		}
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor basicGetAirCompressor() {
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirCompressor(AirCompressor newAirCompressor, NotificationChain msgs) {
		AirCompressor oldAirCompressor = airCompressor;
		airCompressor = newAirCompressor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, oldAirCompressor, newAirCompressor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirCompressor(AirCompressor newAirCompressor) {
		if (newAirCompressor != airCompressor) {
			NotificationChain msgs = null;
			if (airCompressor != null)
				msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs);
			if (newAirCompressor != null)
				msgs = ((InternalEObject)newAirCompressor).eInverseAdd(this, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs);
			msgs = basicSetAirCompressor(newAirCompressor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, newAirCompressor, newAirCompressor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeConstant() {
		return timeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConstant(float newTimeConstant) {
		float oldTimeConstant = timeConstant;
		timeConstant = newTimeConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT, oldTimeConstant, timeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				if (heatRecoveryBoiler != null)
					msgs = ((InternalEObject)heatRecoveryBoiler).eInverseRemove(this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs);
				return basicSetHeatRecoveryBoiler((HeatRecoveryBoiler)otherEnd, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				if (ctTempActivePowerCurve != null)
					msgs = ((InternalEObject)ctTempActivePowerCurve).eInverseRemove(this, GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs);
				return basicSetCTTempActivePowerCurve((CTTempActivePowerCurve)otherEnd, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				if (airCompressor != null)
					msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs);
				return basicSetAirCompressor((AirCompressor)otherEnd, msgs);
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				return basicSetHeatRecoveryBoiler(null, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				return basicSetCTTempActivePowerCurve(null, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				return basicSetAirCompressor(null, msgs);
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				return getAuxPowerVersusFrequency();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				return getPowerVariationByTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				return getAmbientTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				return getReferenceTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				return isHeatRecoveryFlag();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				return getCapabilityVersusFrequency();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				if (resolve) return getHeatRecoveryBoiler();
				return basicGetHeatRecoveryBoiler();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				if (resolve) return getCTTempActivePowerCurve();
				return basicGetCTTempActivePowerCurve();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				return getAuxPowerVersusVoltage();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				if (resolve) return getAirCompressor();
				return basicGetAirCompressor();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				return getTimeConstant();
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				setAuxPowerVersusFrequency((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				setPowerVariationByTemp((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				setAmbientTemp((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				setReferenceTemp((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				setHeatRecoveryFlag((Boolean)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				setCapabilityVersusFrequency((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				setHeatRecoveryBoiler((HeatRecoveryBoiler)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				setCTTempActivePowerCurve((CTTempActivePowerCurve)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				setAuxPowerVersusVoltage((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				setTimeConstant((Float)newValue);
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				setAuxPowerVersusFrequency(AUX_POWER_VERSUS_FREQUENCY_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				setPowerVariationByTemp(POWER_VARIATION_BY_TEMP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				setAmbientTemp(AMBIENT_TEMP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				setReferenceTemp(REFERENCE_TEMP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				setHeatRecoveryFlag(HEAT_RECOVERY_FLAG_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				setCapabilityVersusFrequency(CAPABILITY_VERSUS_FREQUENCY_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				setHeatRecoveryBoiler((HeatRecoveryBoiler)null);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				setCTTempActivePowerCurve((CTTempActivePowerCurve)null);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				setAuxPowerVersusVoltage(AUX_POWER_VERSUS_VOLTAGE_EDEFAULT);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)null);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				setTimeConstant(TIME_CONSTANT_EDEFAULT);
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				return auxPowerVersusFrequency != AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				return powerVariationByTemp != POWER_VARIATION_BY_TEMP_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				return ambientTemp != AMBIENT_TEMP_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				return referenceTemp != REFERENCE_TEMP_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				return heatRecoveryFlag != HEAT_RECOVERY_FLAG_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				return capabilityVersusFrequency != CAPABILITY_VERSUS_FREQUENCY_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				return heatRecoveryBoiler != null;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				return ctTempActivePowerCurve != null;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				return auxPowerVersusVoltage != AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				return airCompressor != null;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				return timeConstant != TIME_CONSTANT_EDEFAULT;
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
		result.append(" (auxPowerVersusFrequency: ");
		result.append(auxPowerVersusFrequency);
		result.append(", powerVariationByTemp: ");
		result.append(powerVariationByTemp);
		result.append(", ambientTemp: ");
		result.append(ambientTemp);
		result.append(", referenceTemp: ");
		result.append(referenceTemp);
		result.append(", heatRecoveryFlag: ");
		result.append(heatRecoveryFlag);
		result.append(", capabilityVersusFrequency: ");
		result.append(capabilityVersusFrequency);
		result.append(", auxPowerVersusVoltage: ");
		result.append(auxPowerVersusVoltage);
		result.append(", timeConstant: ");
		result.append(timeConstant);
		result.append(')');
		return result.toString();
	}

} //CombustionTurbineImpl
