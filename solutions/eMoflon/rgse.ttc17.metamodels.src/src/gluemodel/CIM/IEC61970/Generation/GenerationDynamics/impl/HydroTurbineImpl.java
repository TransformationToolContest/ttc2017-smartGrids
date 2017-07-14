/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Turbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getMaxHeadMaxP <em>Max Head Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getTransientDroopTime <em>Transient Droop Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getGateUpperLimit <em>Gate Upper Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getMinHeadMaxP <em>Min Head Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getTurbineRating <em>Turbine Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getSpeedRating <em>Speed Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getGateRateLimit <em>Gate Rate Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getWaterStartingTime <em>Water Starting Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getTransientRegulation <em>Transient Regulation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl#getSpeedRegulation <em>Speed Regulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroTurbineImpl extends PrimeMoverImpl implements HydroTurbine {
	/**
	 * The default value of the '{@link #getMaxHeadMaxP() <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_HEAD_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxHeadMaxP() <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxHeadMaxP = MAX_HEAD_MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransientDroopTime() <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientDroopTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSIENT_DROOP_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransientDroopTime() <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientDroopTime()
	 * @generated
	 * @ordered
	 */
	protected float transientDroopTime = TRANSIENT_DROOP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateUpperLimit() <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float GATE_UPPER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGateUpperLimit() <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected float gateUpperLimit = GATE_UPPER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinHeadMaxP() <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_HEAD_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinHeadMaxP() <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected float minHeadMaxP = MIN_HEAD_MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getTurbineRating() <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineRating()
	 * @generated
	 * @ordered
	 */
	protected static final float TURBINE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTurbineRating() <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineRating()
	 * @generated
	 * @ordered
	 */
	protected float turbineRating = TURBINE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineType()
	 * @generated
	 * @ordered
	 */
	protected static final TurbineType TURBINE_TYPE_EDEFAULT = TurbineType.PELTON;

	/**
	 * The cached value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineType()
	 * @generated
	 * @ordered
	 */
	protected TurbineType turbineType = TURBINE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedRating() <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRating()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedRating() <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRating()
	 * @generated
	 * @ordered
	 */
	protected float speedRating = SPEED_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateRateLimit() <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateRateLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float GATE_RATE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGateRateLimit() <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateRateLimit()
	 * @generated
	 * @ordered
	 */
	protected float gateRateLimit = GATE_RATE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaterStartingTime() <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterStartingTime()
	 * @generated
	 * @ordered
	 */
	protected static final float WATER_STARTING_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWaterStartingTime() <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterStartingTime()
	 * @generated
	 * @ordered
	 */
	protected float waterStartingTime = WATER_STARTING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransientRegulation() <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientRegulation()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSIENT_REGULATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransientRegulation() <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientRegulation()
	 * @generated
	 * @ordered
	 */
	protected float transientRegulation = TRANSIENT_REGULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedRegulation() <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRegulation()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_REGULATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedRegulation() <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRegulation()
	 * @generated
	 * @ordered
	 */
	protected float speedRegulation = SPEED_REGULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroTurbineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.HYDRO_TURBINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxHeadMaxP() {
		return maxHeadMaxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeadMaxP(float newMaxHeadMaxP) {
		float oldMaxHeadMaxP = maxHeadMaxP;
		maxHeadMaxP = newMaxHeadMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P, oldMaxHeadMaxP, maxHeadMaxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransientDroopTime() {
		return transientDroopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientDroopTime(float newTransientDroopTime) {
		float oldTransientDroopTime = transientDroopTime;
		transientDroopTime = newTransientDroopTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME, oldTransientDroopTime, transientDroopTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGateUpperLimit() {
		return gateUpperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateUpperLimit(float newGateUpperLimit) {
		float oldGateUpperLimit = gateUpperLimit;
		gateUpperLimit = newGateUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT, oldGateUpperLimit, gateUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinHeadMaxP() {
		return minHeadMaxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeadMaxP(float newMinHeadMaxP) {
		float oldMinHeadMaxP = minHeadMaxP;
		minHeadMaxP = newMinHeadMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P, oldMinHeadMaxP, minHeadMaxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTurbineRating() {
		return turbineRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurbineRating(float newTurbineRating) {
		float oldTurbineRating = turbineRating;
		turbineRating = newTurbineRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING, oldTurbineRating, turbineRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineType getTurbineType() {
		return turbineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurbineType(TurbineType newTurbineType) {
		TurbineType oldTurbineType = turbineType;
		turbineType = newTurbineType == null ? TURBINE_TYPE_EDEFAULT : newTurbineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE, oldTurbineType, turbineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedRating() {
		return speedRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedRating(float newSpeedRating) {
		float oldSpeedRating = speedRating;
		speedRating = newSpeedRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING, oldSpeedRating, speedRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGateRateLimit() {
		return gateRateLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateRateLimit(float newGateRateLimit) {
		float oldGateRateLimit = gateRateLimit;
		gateRateLimit = newGateRateLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT, oldGateRateLimit, gateRateLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWaterStartingTime() {
		return waterStartingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterStartingTime(float newWaterStartingTime) {
		float oldWaterStartingTime = waterStartingTime;
		waterStartingTime = newWaterStartingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME, oldWaterStartingTime, waterStartingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransientRegulation() {
		return transientRegulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientRegulation(float newTransientRegulation) {
		float oldTransientRegulation = transientRegulation;
		transientRegulation = newTransientRegulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION, oldTransientRegulation, transientRegulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedRegulation() {
		return speedRegulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedRegulation(float newSpeedRegulation) {
		float oldSpeedRegulation = speedRegulation;
		speedRegulation = newSpeedRegulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION, oldSpeedRegulation, speedRegulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				return getMaxHeadMaxP();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				return getTransientDroopTime();
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				return getGateUpperLimit();
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				return getMinHeadMaxP();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				return getTurbineRating();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				return getTurbineType();
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				return getSpeedRating();
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				return getGateRateLimit();
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				return getWaterStartingTime();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				return getTransientRegulation();
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				return getSpeedRegulation();
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
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				setMaxHeadMaxP((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				setTransientDroopTime((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				setGateUpperLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				setMinHeadMaxP((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				setTurbineRating((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				setTurbineType((TurbineType)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				setSpeedRating((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				setGateRateLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				setWaterStartingTime((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				setTransientRegulation((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				setSpeedRegulation((Float)newValue);
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
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				setMaxHeadMaxP(MAX_HEAD_MAX_P_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				setTransientDroopTime(TRANSIENT_DROOP_TIME_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				setGateUpperLimit(GATE_UPPER_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				setMinHeadMaxP(MIN_HEAD_MAX_P_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				setTurbineRating(TURBINE_RATING_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				setTurbineType(TURBINE_TYPE_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				setSpeedRating(SPEED_RATING_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				setGateRateLimit(GATE_RATE_LIMIT_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				setWaterStartingTime(WATER_STARTING_TIME_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				setTransientRegulation(TRANSIENT_REGULATION_EDEFAULT);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				setSpeedRegulation(SPEED_REGULATION_EDEFAULT);
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
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				return maxHeadMaxP != MAX_HEAD_MAX_P_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				return transientDroopTime != TRANSIENT_DROOP_TIME_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				return gateUpperLimit != GATE_UPPER_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				return minHeadMaxP != MIN_HEAD_MAX_P_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				return turbineRating != TURBINE_RATING_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				return turbineType != TURBINE_TYPE_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				return speedRating != SPEED_RATING_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				return gateRateLimit != GATE_RATE_LIMIT_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				return waterStartingTime != WATER_STARTING_TIME_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				return transientRegulation != TRANSIENT_REGULATION_EDEFAULT;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				return speedRegulation != SPEED_REGULATION_EDEFAULT;
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
		result.append(" (maxHeadMaxP: ");
		result.append(maxHeadMaxP);
		result.append(", transientDroopTime: ");
		result.append(transientDroopTime);
		result.append(", gateUpperLimit: ");
		result.append(gateUpperLimit);
		result.append(", minHeadMaxP: ");
		result.append(minHeadMaxP);
		result.append(", turbineRating: ");
		result.append(turbineRating);
		result.append(", turbineType: ");
		result.append(turbineType);
		result.append(", speedRating: ");
		result.append(speedRating);
		result.append(", gateRateLimit: ");
		result.append(gateRateLimit);
		result.append(", waterStartingTime: ");
		result.append(waterStartingTime);
		result.append(", transientRegulation: ");
		result.append(transientRegulation);
		result.append(", speedRegulation: ");
		result.append(speedRegulation);
		result.append(')');
		return result.toString();
	}

} //HydroTurbineImpl
