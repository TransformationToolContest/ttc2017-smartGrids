/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;
import gluemodel.CIM.IEC61970.Generation.Production.StartIgnFuelCurve;
import gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve;
import gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve;
import gluemodel.CIM.IEC61970.Generation.Production.StartupModel;
import gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Startup Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getFixedMaintCost <em>Fixed Maint Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getRiskFactorCost <em>Risk Factor Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStbyAuxP <em>Stby Aux P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStartupDate <em>Startup Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStartRampCurve <em>Start Ramp Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getMinimumRunTime <em>Minimum Run Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStartupPriority <em>Startup Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getHotStandbyHeat <em>Hot Standby Heat</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartupModelImpl#getIncrementalMaintCost <em>Incremental Maint Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartupModelImpl extends IdentifiedObjectImpl implements StartupModel {
	/**
	 * The cached value of the '{@link #getStartIgnFuelCurve() <em>Start Ign Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 * @ordered
	 */
	protected StartIgnFuelCurve startIgnFuelCurve;

	/**
	 * The default value of the '{@link #getFixedMaintCost() <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMaintCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_MAINT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedMaintCost() <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMaintCost()
	 * @generated
	 * @ordered
	 */
	protected float fixedMaintCost = FIXED_MAINT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskFactorCost() <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactorCost()
	 * @generated
	 * @ordered
	 */
	protected static final float RISK_FACTOR_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRiskFactorCost() <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactorCost()
	 * @generated
	 * @ordered
	 */
	protected float riskFactorCost = RISK_FACTOR_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStbyAuxP() <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStbyAuxP()
	 * @generated
	 * @ordered
	 */
	protected static final float STBY_AUX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStbyAuxP() <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStbyAuxP()
	 * @generated
	 * @ordered
	 */
	protected float stbyAuxP = STBY_AUX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupDate() <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTUP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupDate() <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupDate()
	 * @generated
	 * @ordered
	 */
	protected Date startupDate = STARTUP_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartRampCurve() <em>Start Ramp Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRampCurve()
	 * @generated
	 * @ordered
	 */
	protected StartRampCurve startRampCurve;

	/**
	 * The default value of the '{@link #getMinimumDownTime() <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDownTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_DOWN_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumDownTime() <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDownTime()
	 * @generated
	 * @ordered
	 */
	protected float minimumDownTime = MINIMUM_DOWN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumRunTime() <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_RUN_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumRunTime() <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRunTime()
	 * @generated
	 * @ordered
	 */
	protected float minimumRunTime = MINIMUM_RUN_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartMainFuelCurve() <em>Start Main Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMainFuelCurve()
	 * @generated
	 * @ordered
	 */
	protected StartMainFuelCurve startMainFuelCurve;

	/**
	 * The default value of the '{@link #getStartupPriority() <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTUP_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartupPriority() <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupPriority()
	 * @generated
	 * @ordered
	 */
	protected int startupPriority = STARTUP_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected static final float STARTUP_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected float startupCost = STARTUP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotStandbyHeat() <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandbyHeat()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_STANDBY_HEAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotStandbyHeat() <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandbyHeat()
	 * @generated
	 * @ordered
	 */
	protected float hotStandbyHeat = HOT_STANDBY_HEAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * The default value of the '{@link #getIncrementalMaintCost() <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalMaintCost()
	 * @generated
	 * @ordered
	 */
	protected static final float INCREMENTAL_MAINT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIncrementalMaintCost() <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalMaintCost()
	 * @generated
	 * @ordered
	 */
	protected float incrementalMaintCost = INCREMENTAL_MAINT_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartupModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.STARTUP_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartIgnFuelCurve getStartIgnFuelCurve() {
		if (startIgnFuelCurve != null && startIgnFuelCurve.eIsProxy()) {
			InternalEObject oldStartIgnFuelCurve = (InternalEObject)startIgnFuelCurve;
			startIgnFuelCurve = (StartIgnFuelCurve)eResolveProxy(oldStartIgnFuelCurve);
			if (startIgnFuelCurve != oldStartIgnFuelCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, oldStartIgnFuelCurve, startIgnFuelCurve));
			}
		}
		return startIgnFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartIgnFuelCurve basicGetStartIgnFuelCurve() {
		return startIgnFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartIgnFuelCurve(StartIgnFuelCurve newStartIgnFuelCurve, NotificationChain msgs) {
		StartIgnFuelCurve oldStartIgnFuelCurve = startIgnFuelCurve;
		startIgnFuelCurve = newStartIgnFuelCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, oldStartIgnFuelCurve, newStartIgnFuelCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIgnFuelCurve(StartIgnFuelCurve newStartIgnFuelCurve) {
		if (newStartIgnFuelCurve != startIgnFuelCurve) {
			NotificationChain msgs = null;
			if (startIgnFuelCurve != null)
				msgs = ((InternalEObject)startIgnFuelCurve).eInverseRemove(this, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs);
			if (newStartIgnFuelCurve != null)
				msgs = ((InternalEObject)newStartIgnFuelCurve).eInverseAdd(this, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs);
			msgs = basicSetStartIgnFuelCurve(newStartIgnFuelCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, newStartIgnFuelCurve, newStartIgnFuelCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFixedMaintCost() {
		return fixedMaintCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedMaintCost(float newFixedMaintCost) {
		float oldFixedMaintCost = fixedMaintCost;
		fixedMaintCost = newFixedMaintCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST, oldFixedMaintCost, fixedMaintCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRiskFactorCost() {
		return riskFactorCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskFactorCost(float newRiskFactorCost) {
		float oldRiskFactorCost = riskFactorCost;
		riskFactorCost = newRiskFactorCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST, oldRiskFactorCost, riskFactorCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStbyAuxP() {
		return stbyAuxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStbyAuxP(float newStbyAuxP) {
		float oldStbyAuxP = stbyAuxP;
		stbyAuxP = newStbyAuxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__STBY_AUX_P, oldStbyAuxP, stbyAuxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartupDate() {
		return startupDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupDate(Date newStartupDate) {
		Date oldStartupDate = startupDate;
		startupDate = newStartupDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__STARTUP_DATE, oldStartupDate, startupDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRampCurve getStartRampCurve() {
		if (startRampCurve != null && startRampCurve.eIsProxy()) {
			InternalEObject oldStartRampCurve = (InternalEObject)startRampCurve;
			startRampCurve = (StartRampCurve)eResolveProxy(oldStartRampCurve);
			if (startRampCurve != oldStartRampCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE, oldStartRampCurve, startRampCurve));
			}
		}
		return startRampCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRampCurve basicGetStartRampCurve() {
		return startRampCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartRampCurve(StartRampCurve newStartRampCurve, NotificationChain msgs) {
		StartRampCurve oldStartRampCurve = startRampCurve;
		startRampCurve = newStartRampCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE, oldStartRampCurve, newStartRampCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRampCurve(StartRampCurve newStartRampCurve) {
		if (newStartRampCurve != startRampCurve) {
			NotificationChain msgs = null;
			if (startRampCurve != null)
				msgs = ((InternalEObject)startRampCurve).eInverseRemove(this, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs);
			if (newStartRampCurve != null)
				msgs = ((InternalEObject)newStartRampCurve).eInverseAdd(this, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs);
			msgs = basicSetStartRampCurve(newStartRampCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE, newStartRampCurve, newStartRampCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumDownTime() {
		return minimumDownTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumDownTime(float newMinimumDownTime) {
		float oldMinimumDownTime = minimumDownTime;
		minimumDownTime = newMinimumDownTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME, oldMinimumDownTime, minimumDownTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumRunTime() {
		return minimumRunTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumRunTime(float newMinimumRunTime) {
		float oldMinimumRunTime = minimumRunTime;
		minimumRunTime = newMinimumRunTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME, oldMinimumRunTime, minimumRunTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartMainFuelCurve getStartMainFuelCurve() {
		if (startMainFuelCurve != null && startMainFuelCurve.eIsProxy()) {
			InternalEObject oldStartMainFuelCurve = (InternalEObject)startMainFuelCurve;
			startMainFuelCurve = (StartMainFuelCurve)eResolveProxy(oldStartMainFuelCurve);
			if (startMainFuelCurve != oldStartMainFuelCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, oldStartMainFuelCurve, startMainFuelCurve));
			}
		}
		return startMainFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartMainFuelCurve basicGetStartMainFuelCurve() {
		return startMainFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartMainFuelCurve(StartMainFuelCurve newStartMainFuelCurve, NotificationChain msgs) {
		StartMainFuelCurve oldStartMainFuelCurve = startMainFuelCurve;
		startMainFuelCurve = newStartMainFuelCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, oldStartMainFuelCurve, newStartMainFuelCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMainFuelCurve(StartMainFuelCurve newStartMainFuelCurve) {
		if (newStartMainFuelCurve != startMainFuelCurve) {
			NotificationChain msgs = null;
			if (startMainFuelCurve != null)
				msgs = ((InternalEObject)startMainFuelCurve).eInverseRemove(this, ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs);
			if (newStartMainFuelCurve != null)
				msgs = ((InternalEObject)newStartMainFuelCurve).eInverseAdd(this, ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs);
			msgs = basicSetStartMainFuelCurve(newStartMainFuelCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, newStartMainFuelCurve, newStartMainFuelCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartupPriority() {
		return startupPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupPriority(int newStartupPriority) {
		int oldStartupPriority = startupPriority;
		startupPriority = newStartupPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY, oldStartupPriority, startupPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartupCost() {
		return startupCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupCost(float newStartupCost) {
		float oldStartupCost = startupCost;
		startupCost = newStartupCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__STARTUP_COST, oldStartupCost, startupCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHotStandbyHeat() {
		return hotStandbyHeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotStandbyHeat(float newHotStandbyHeat) {
		float oldHotStandbyHeat = hotStandbyHeat;
		hotStandbyHeat = newHotStandbyHeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT, oldHotStandbyHeat, hotStandbyHeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, thermalGeneratingUnit));
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit, newThermalGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIncrementalMaintCost() {
		return incrementalMaintCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementalMaintCost(float newIncrementalMaintCost) {
		float oldIncrementalMaintCost = incrementalMaintCost;
		incrementalMaintCost = newIncrementalMaintCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST, oldIncrementalMaintCost, incrementalMaintCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				if (startIgnFuelCurve != null)
					msgs = ((InternalEObject)startIgnFuelCurve).eInverseRemove(this, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs);
				return basicSetStartIgnFuelCurve((StartIgnFuelCurve)otherEnd, msgs);
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				if (startRampCurve != null)
					msgs = ((InternalEObject)startRampCurve).eInverseRemove(this, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs);
				return basicSetStartRampCurve((StartRampCurve)otherEnd, msgs);
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				if (startMainFuelCurve != null)
					msgs = ((InternalEObject)startMainFuelCurve).eInverseRemove(this, ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs);
				return basicSetStartMainFuelCurve((StartMainFuelCurve)otherEnd, msgs);
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				return basicSetStartIgnFuelCurve(null, msgs);
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				return basicSetStartRampCurve(null, msgs);
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				return basicSetStartMainFuelCurve(null, msgs);
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				if (resolve) return getStartIgnFuelCurve();
				return basicGetStartIgnFuelCurve();
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				return getFixedMaintCost();
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				return getRiskFactorCost();
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				return getStbyAuxP();
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				return getStartupDate();
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				if (resolve) return getStartRampCurve();
				return basicGetStartRampCurve();
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				return getMinimumDownTime();
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				return getMinimumRunTime();
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				if (resolve) return getStartMainFuelCurve();
				return basicGetStartMainFuelCurve();
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				return getStartupPriority();
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				return getStartupCost();
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				return getHotStandbyHeat();
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				return getIncrementalMaintCost();
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
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				setStartIgnFuelCurve((StartIgnFuelCurve)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				setFixedMaintCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				setRiskFactorCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				setStbyAuxP((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				setStartupDate((Date)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				setStartRampCurve((StartRampCurve)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				setMinimumDownTime((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				setMinimumRunTime((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				setStartMainFuelCurve((StartMainFuelCurve)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				setStartupPriority((Integer)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				setStartupCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				setHotStandbyHeat((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				setIncrementalMaintCost((Float)newValue);
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
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				setStartIgnFuelCurve((StartIgnFuelCurve)null);
				return;
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				setFixedMaintCost(FIXED_MAINT_COST_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				setRiskFactorCost(RISK_FACTOR_COST_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				setStbyAuxP(STBY_AUX_P_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				setStartupDate(STARTUP_DATE_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				setStartRampCurve((StartRampCurve)null);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				setMinimumDownTime(MINIMUM_DOWN_TIME_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				setMinimumRunTime(MINIMUM_RUN_TIME_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				setStartMainFuelCurve((StartMainFuelCurve)null);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				setStartupPriority(STARTUP_PRIORITY_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				setStartupCost(STARTUP_COST_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				setHotStandbyHeat(HOT_STANDBY_HEAT_EDEFAULT);
				return;
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				setIncrementalMaintCost(INCREMENTAL_MAINT_COST_EDEFAULT);
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
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				return startIgnFuelCurve != null;
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				return fixedMaintCost != FIXED_MAINT_COST_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				return riskFactorCost != RISK_FACTOR_COST_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				return stbyAuxP != STBY_AUX_P_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				return STARTUP_DATE_EDEFAULT == null ? startupDate != null : !STARTUP_DATE_EDEFAULT.equals(startupDate);
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				return startRampCurve != null;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				return minimumDownTime != MINIMUM_DOWN_TIME_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				return minimumRunTime != MINIMUM_RUN_TIME_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				return startMainFuelCurve != null;
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				return startupPriority != STARTUP_PRIORITY_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				return startupCost != STARTUP_COST_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				return hotStandbyHeat != HOT_STANDBY_HEAT_EDEFAULT;
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				return incrementalMaintCost != INCREMENTAL_MAINT_COST_EDEFAULT;
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
		result.append(" (fixedMaintCost: ");
		result.append(fixedMaintCost);
		result.append(", riskFactorCost: ");
		result.append(riskFactorCost);
		result.append(", stbyAuxP: ");
		result.append(stbyAuxP);
		result.append(", startupDate: ");
		result.append(startupDate);
		result.append(", minimumDownTime: ");
		result.append(minimumDownTime);
		result.append(", minimumRunTime: ");
		result.append(minimumRunTime);
		result.append(", startupPriority: ");
		result.append(startupPriority);
		result.append(", startupCost: ");
		result.append(startupCost);
		result.append(", hotStandbyHeat: ");
		result.append(hotStandbyHeat);
		result.append(", incrementalMaintCost: ");
		result.append(incrementalMaintCost);
		result.append(')');
		return result.toString();
	}

} //StartupModelImpl
