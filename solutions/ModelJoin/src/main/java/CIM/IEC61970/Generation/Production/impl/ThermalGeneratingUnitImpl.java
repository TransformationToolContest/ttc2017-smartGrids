/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Generation.Production.CAESPlant;
import CIM.IEC61970.Generation.Production.CogenerationPlant;
import CIM.IEC61970.Generation.Production.CombinedCyclePlant;
import CIM.IEC61970.Generation.Production.EmissionAccount;
import CIM.IEC61970.Generation.Production.EmissionCurve;
import CIM.IEC61970.Generation.Production.FossilFuel;
import CIM.IEC61970.Generation.Production.FuelAllocationSchedule;
import CIM.IEC61970.Generation.Production.HeatInputCurve;
import CIM.IEC61970.Generation.Production.HeatRateCurve;
import CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.ShutdownCurve;
import CIM.IEC61970.Generation.Production.StartupModel;
import CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getEmissionCurves <em>Emission Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getHeatInputCurve <em>Heat Input Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getShutdownCurve <em>Shutdown Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getHeatRateCurve <em>Heat Rate Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getOMCost <em>OM Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl#getEmmissionAccounts <em>Emmission Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThermalGeneratingUnitImpl extends GeneratingUnitImpl implements ThermalGeneratingUnit {
	/**
	 * The cached value of the '{@link #getCombinedCyclePlant() <em>Combined Cycle Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedCyclePlant()
	 * @generated
	 * @ordered
	 */
	protected CombinedCyclePlant combinedCyclePlant;

	/**
	 * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAESPlant()
	 * @generated
	 * @ordered
	 */
	protected CAESPlant caesPlant;

	/**
	 * The cached value of the '{@link #getEmissionCurves() <em>Emission Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<EmissionCurve> emissionCurves;

	/**
	 * The cached value of the '{@link #getHeatInputCurve() <em>Heat Input Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputCurve()
	 * @generated
	 * @ordered
	 */
	protected HeatInputCurve heatInputCurve;

	/**
	 * The cached value of the '{@link #getShutdownCurve() <em>Shutdown Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownCurve()
	 * @generated
	 * @ordered
	 */
	protected ShutdownCurve shutdownCurve;

	/**
	 * The cached value of the '{@link #getHeatRateCurve() <em>Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatRateCurve()
	 * @generated
	 * @ordered
	 */
	protected HeatRateCurve heatRateCurve;

	/**
	 * The cached value of the '{@link #getIncrementalHeatRateCurve() <em>Incremental Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 * @ordered
	 */
	protected IncrementalHeatRateCurve incrementalHeatRateCurve;

	/**
	 * The default value of the '{@link #getOMCost() <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOMCost()
	 * @generated
	 * @ordered
	 */
	protected static final float OM_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOMCost() <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOMCost()
	 * @generated
	 * @ordered
	 */
	protected float oMCost = OM_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenerationPlant()
	 * @generated
	 * @ordered
	 */
	protected CogenerationPlant cogenerationPlant;

	/**
	 * The cached value of the '{@link #getFossilFuels() <em>Fossil Fuels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuels()
	 * @generated
	 * @ordered
	 */
	protected EList<FossilFuel> fossilFuels;

	/**
	 * The cached value of the '{@link #getStartupModel() <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupModel()
	 * @generated
	 * @ordered
	 */
	protected StartupModel startupModel;

	/**
	 * The cached value of the '{@link #getFuelAllocationSchedules() <em>Fuel Allocation Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<FuelAllocationSchedule> fuelAllocationSchedules;

	/**
	 * The cached value of the '{@link #getEmmissionAccounts() <em>Emmission Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmmissionAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<EmissionAccount> emmissionAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThermalGeneratingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.THERMAL_GENERATING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedCyclePlant getCombinedCyclePlant() {
		if (combinedCyclePlant != null && combinedCyclePlant.eIsProxy()) {
			InternalEObject oldCombinedCyclePlant = (InternalEObject)combinedCyclePlant;
			combinedCyclePlant = (CombinedCyclePlant)eResolveProxy(oldCombinedCyclePlant);
			if (combinedCyclePlant != oldCombinedCyclePlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, oldCombinedCyclePlant, combinedCyclePlant));
			}
		}
		return combinedCyclePlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedCyclePlant basicGetCombinedCyclePlant() {
		return combinedCyclePlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedCyclePlant(CombinedCyclePlant newCombinedCyclePlant, NotificationChain msgs) {
		CombinedCyclePlant oldCombinedCyclePlant = combinedCyclePlant;
		combinedCyclePlant = newCombinedCyclePlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, oldCombinedCyclePlant, newCombinedCyclePlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedCyclePlant(CombinedCyclePlant newCombinedCyclePlant) {
		if (newCombinedCyclePlant != combinedCyclePlant) {
			NotificationChain msgs = null;
			if (combinedCyclePlant != null)
				msgs = ((InternalEObject)combinedCyclePlant).eInverseRemove(this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs);
			if (newCombinedCyclePlant != null)
				msgs = ((InternalEObject)newCombinedCyclePlant).eInverseAdd(this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs);
			msgs = basicSetCombinedCyclePlant(newCombinedCyclePlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, newCombinedCyclePlant, newCombinedCyclePlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant getCAESPlant() {
		if (caesPlant != null && caesPlant.eIsProxy()) {
			InternalEObject oldCAESPlant = (InternalEObject)caesPlant;
			caesPlant = (CAESPlant)eResolveProxy(oldCAESPlant);
			if (caesPlant != oldCAESPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, caesPlant));
			}
		}
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant basicGetCAESPlant() {
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAESPlant(CAESPlant newCAESPlant, NotificationChain msgs) {
		CAESPlant oldCAESPlant = caesPlant;
		caesPlant = newCAESPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, newCAESPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCAESPlant(CAESPlant newCAESPlant) {
		if (newCAESPlant != caesPlant) {
			NotificationChain msgs = null;
			if (caesPlant != null)
				msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs);
			if (newCAESPlant != null)
				msgs = ((InternalEObject)newCAESPlant).eInverseAdd(this, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs);
			msgs = basicSetCAESPlant(newCAESPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, newCAESPlant, newCAESPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmissionCurve> getEmissionCurves() {
		if (emissionCurves == null) {
			emissionCurves = new EObjectWithInverseResolvingEList<EmissionCurve>(EmissionCurve.class, this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT);
		}
		return emissionCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatInputCurve getHeatInputCurve() {
		if (heatInputCurve != null && heatInputCurve.eIsProxy()) {
			InternalEObject oldHeatInputCurve = (InternalEObject)heatInputCurve;
			heatInputCurve = (HeatInputCurve)eResolveProxy(oldHeatInputCurve);
			if (heatInputCurve != oldHeatInputCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, oldHeatInputCurve, heatInputCurve));
			}
		}
		return heatInputCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatInputCurve basicGetHeatInputCurve() {
		return heatInputCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatInputCurve(HeatInputCurve newHeatInputCurve, NotificationChain msgs) {
		HeatInputCurve oldHeatInputCurve = heatInputCurve;
		heatInputCurve = newHeatInputCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, oldHeatInputCurve, newHeatInputCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatInputCurve(HeatInputCurve newHeatInputCurve) {
		if (newHeatInputCurve != heatInputCurve) {
			NotificationChain msgs = null;
			if (heatInputCurve != null)
				msgs = ((InternalEObject)heatInputCurve).eInverseRemove(this, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs);
			if (newHeatInputCurve != null)
				msgs = ((InternalEObject)newHeatInputCurve).eInverseAdd(this, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs);
			msgs = basicSetHeatInputCurve(newHeatInputCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, newHeatInputCurve, newHeatInputCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownCurve getShutdownCurve() {
		if (shutdownCurve != null && shutdownCurve.eIsProxy()) {
			InternalEObject oldShutdownCurve = (InternalEObject)shutdownCurve;
			shutdownCurve = (ShutdownCurve)eResolveProxy(oldShutdownCurve);
			if (shutdownCurve != oldShutdownCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, oldShutdownCurve, shutdownCurve));
			}
		}
		return shutdownCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownCurve basicGetShutdownCurve() {
		return shutdownCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShutdownCurve(ShutdownCurve newShutdownCurve, NotificationChain msgs) {
		ShutdownCurve oldShutdownCurve = shutdownCurve;
		shutdownCurve = newShutdownCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, oldShutdownCurve, newShutdownCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShutdownCurve(ShutdownCurve newShutdownCurve) {
		if (newShutdownCurve != shutdownCurve) {
			NotificationChain msgs = null;
			if (shutdownCurve != null)
				msgs = ((InternalEObject)shutdownCurve).eInverseRemove(this, ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs);
			if (newShutdownCurve != null)
				msgs = ((InternalEObject)newShutdownCurve).eInverseAdd(this, ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs);
			msgs = basicSetShutdownCurve(newShutdownCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, newShutdownCurve, newShutdownCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRateCurve getHeatRateCurve() {
		if (heatRateCurve != null && heatRateCurve.eIsProxy()) {
			InternalEObject oldHeatRateCurve = (InternalEObject)heatRateCurve;
			heatRateCurve = (HeatRateCurve)eResolveProxy(oldHeatRateCurve);
			if (heatRateCurve != oldHeatRateCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE, oldHeatRateCurve, heatRateCurve));
			}
		}
		return heatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRateCurve basicGetHeatRateCurve() {
		return heatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatRateCurve(HeatRateCurve newHeatRateCurve, NotificationChain msgs) {
		HeatRateCurve oldHeatRateCurve = heatRateCurve;
		heatRateCurve = newHeatRateCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE, oldHeatRateCurve, newHeatRateCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatRateCurve(HeatRateCurve newHeatRateCurve) {
		if (newHeatRateCurve != heatRateCurve) {
			NotificationChain msgs = null;
			if (heatRateCurve != null)
				msgs = ((InternalEObject)heatRateCurve).eInverseRemove(this, ProductionPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs);
			if (newHeatRateCurve != null)
				msgs = ((InternalEObject)newHeatRateCurve).eInverseAdd(this, ProductionPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs);
			msgs = basicSetHeatRateCurve(newHeatRateCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE, newHeatRateCurve, newHeatRateCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalHeatRateCurve getIncrementalHeatRateCurve() {
		if (incrementalHeatRateCurve != null && incrementalHeatRateCurve.eIsProxy()) {
			InternalEObject oldIncrementalHeatRateCurve = (InternalEObject)incrementalHeatRateCurve;
			incrementalHeatRateCurve = (IncrementalHeatRateCurve)eResolveProxy(oldIncrementalHeatRateCurve);
			if (incrementalHeatRateCurve != oldIncrementalHeatRateCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, oldIncrementalHeatRateCurve, incrementalHeatRateCurve));
			}
		}
		return incrementalHeatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalHeatRateCurve basicGetIncrementalHeatRateCurve() {
		return incrementalHeatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementalHeatRateCurve(IncrementalHeatRateCurve newIncrementalHeatRateCurve, NotificationChain msgs) {
		IncrementalHeatRateCurve oldIncrementalHeatRateCurve = incrementalHeatRateCurve;
		incrementalHeatRateCurve = newIncrementalHeatRateCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, oldIncrementalHeatRateCurve, newIncrementalHeatRateCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementalHeatRateCurve(IncrementalHeatRateCurve newIncrementalHeatRateCurve) {
		if (newIncrementalHeatRateCurve != incrementalHeatRateCurve) {
			NotificationChain msgs = null;
			if (incrementalHeatRateCurve != null)
				msgs = ((InternalEObject)incrementalHeatRateCurve).eInverseRemove(this, ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class, msgs);
			if (newIncrementalHeatRateCurve != null)
				msgs = ((InternalEObject)newIncrementalHeatRateCurve).eInverseAdd(this, ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class, msgs);
			msgs = basicSetIncrementalHeatRateCurve(newIncrementalHeatRateCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, newIncrementalHeatRateCurve, newIncrementalHeatRateCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOMCost() {
		return oMCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOMCost(float newOMCost) {
		float oldOMCost = oMCost;
		oMCost = newOMCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST, oldOMCost, oMCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant getCogenerationPlant() {
		if (cogenerationPlant != null && cogenerationPlant.eIsProxy()) {
			InternalEObject oldCogenerationPlant = (InternalEObject)cogenerationPlant;
			cogenerationPlant = (CogenerationPlant)eResolveProxy(oldCogenerationPlant);
			if (cogenerationPlant != oldCogenerationPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, oldCogenerationPlant, cogenerationPlant));
			}
		}
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant basicGetCogenerationPlant() {
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCogenerationPlant(CogenerationPlant newCogenerationPlant, NotificationChain msgs) {
		CogenerationPlant oldCogenerationPlant = cogenerationPlant;
		cogenerationPlant = newCogenerationPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, oldCogenerationPlant, newCogenerationPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCogenerationPlant(CogenerationPlant newCogenerationPlant) {
		if (newCogenerationPlant != cogenerationPlant) {
			NotificationChain msgs = null;
			if (cogenerationPlant != null)
				msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs);
			if (newCogenerationPlant != null)
				msgs = ((InternalEObject)newCogenerationPlant).eInverseAdd(this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs);
			msgs = basicSetCogenerationPlant(newCogenerationPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, newCogenerationPlant, newCogenerationPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FossilFuel> getFossilFuels() {
		if (fossilFuels == null) {
			fossilFuels = new EObjectWithInverseResolvingEList<FossilFuel>(FossilFuel.class, this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT);
		}
		return fossilFuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel getStartupModel() {
		if (startupModel != null && startupModel.eIsProxy()) {
			InternalEObject oldStartupModel = (InternalEObject)startupModel;
			startupModel = (StartupModel)eResolveProxy(oldStartupModel);
			if (startupModel != oldStartupModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, oldStartupModel, startupModel));
			}
		}
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel basicGetStartupModel() {
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartupModel(StartupModel newStartupModel, NotificationChain msgs) {
		StartupModel oldStartupModel = startupModel;
		startupModel = newStartupModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, oldStartupModel, newStartupModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupModel(StartupModel newStartupModel) {
		if (newStartupModel != startupModel) {
			NotificationChain msgs = null;
			if (startupModel != null)
				msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs);
			if (newStartupModel != null)
				msgs = ((InternalEObject)newStartupModel).eInverseAdd(this, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs);
			msgs = basicSetStartupModel(newStartupModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, newStartupModel, newStartupModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuelAllocationSchedule> getFuelAllocationSchedules() {
		if (fuelAllocationSchedules == null) {
			fuelAllocationSchedules = new EObjectWithInverseResolvingEList<FuelAllocationSchedule>(FuelAllocationSchedule.class, this, ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT);
		}
		return fuelAllocationSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmissionAccount> getEmmissionAccounts() {
		if (emmissionAccounts == null) {
			emmissionAccounts = new EObjectWithInverseResolvingEList<EmissionAccount>(EmissionAccount.class, this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT);
		}
		return emmissionAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				if (combinedCyclePlant != null)
					msgs = ((InternalEObject)combinedCyclePlant).eInverseRemove(this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs);
				return basicSetCombinedCyclePlant((CombinedCyclePlant)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				if (caesPlant != null)
					msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs);
				return basicSetCAESPlant((CAESPlant)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmissionCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				if (heatInputCurve != null)
					msgs = ((InternalEObject)heatInputCurve).eInverseRemove(this, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs);
				return basicSetHeatInputCurve((HeatInputCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				if (shutdownCurve != null)
					msgs = ((InternalEObject)shutdownCurve).eInverseRemove(this, ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs);
				return basicSetShutdownCurve((ShutdownCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				if (heatRateCurve != null)
					msgs = ((InternalEObject)heatRateCurve).eInverseRemove(this, ProductionPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs);
				return basicSetHeatRateCurve((HeatRateCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				if (incrementalHeatRateCurve != null)
					msgs = ((InternalEObject)incrementalHeatRateCurve).eInverseRemove(this, ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class, msgs);
				return basicSetIncrementalHeatRateCurve((IncrementalHeatRateCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				if (cogenerationPlant != null)
					msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs);
				return basicSetCogenerationPlant((CogenerationPlant)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFossilFuels()).basicAdd(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				if (startupModel != null)
					msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs);
				return basicSetStartupModel((StartupModel)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFuelAllocationSchedules()).basicAdd(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmmissionAccounts()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				return basicSetCombinedCyclePlant(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				return basicSetCAESPlant(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return ((InternalEList<?>)getEmissionCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				return basicSetHeatInputCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				return basicSetShutdownCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				return basicSetHeatRateCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				return basicSetIncrementalHeatRateCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				return basicSetCogenerationPlant(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return ((InternalEList<?>)getFossilFuels()).basicRemove(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				return basicSetStartupModel(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<?>)getFuelAllocationSchedules()).basicRemove(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return ((InternalEList<?>)getEmmissionAccounts()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				if (resolve) return getCombinedCyclePlant();
				return basicGetCombinedCyclePlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				if (resolve) return getCAESPlant();
				return basicGetCAESPlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return getEmissionCurves();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				if (resolve) return getHeatInputCurve();
				return basicGetHeatInputCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				if (resolve) return getShutdownCurve();
				return basicGetShutdownCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				if (resolve) return getHeatRateCurve();
				return basicGetHeatRateCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				if (resolve) return getIncrementalHeatRateCurve();
				return basicGetIncrementalHeatRateCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				return getOMCost();
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				if (resolve) return getCogenerationPlant();
				return basicGetCogenerationPlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return getFossilFuels();
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				if (resolve) return getStartupModel();
				return basicGetStartupModel();
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return getFuelAllocationSchedules();
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return getEmmissionAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				setCombinedCyclePlant((CombinedCyclePlant)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				setCAESPlant((CAESPlant)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				getEmissionCurves().clear();
				getEmissionCurves().addAll((Collection<? extends EmissionCurve>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				setHeatInputCurve((HeatInputCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				setShutdownCurve((ShutdownCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				setHeatRateCurve((HeatRateCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				setIncrementalHeatRateCurve((IncrementalHeatRateCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				setOMCost((Float)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				getFossilFuels().clear();
				getFossilFuels().addAll((Collection<? extends FossilFuel>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				setStartupModel((StartupModel)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				getFuelAllocationSchedules().addAll((Collection<? extends FuelAllocationSchedule>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				getEmmissionAccounts().clear();
				getEmmissionAccounts().addAll((Collection<? extends EmissionAccount>)newValue);
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				setCombinedCyclePlant((CombinedCyclePlant)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				setCAESPlant((CAESPlant)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				getEmissionCurves().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				setHeatInputCurve((HeatInputCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				setShutdownCurve((ShutdownCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				setHeatRateCurve((HeatRateCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				setIncrementalHeatRateCurve((IncrementalHeatRateCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				setOMCost(OM_COST_EDEFAULT);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				getFossilFuels().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				setStartupModel((StartupModel)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				getEmmissionAccounts().clear();
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				return combinedCyclePlant != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				return caesPlant != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return emissionCurves != null && !emissionCurves.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				return heatInputCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				return shutdownCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				return heatRateCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				return incrementalHeatRateCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				return oMCost != OM_COST_EDEFAULT;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				return cogenerationPlant != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return fossilFuels != null && !fossilFuels.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				return startupModel != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return fuelAllocationSchedules != null && !fuelAllocationSchedules.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return emmissionAccounts != null && !emmissionAccounts.isEmpty();
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
		result.append(" (oMCost: ");
		result.append(oMCost);
		result.append(')');
		return result.toString();
	}

} //ThermalGeneratingUnitImpl
