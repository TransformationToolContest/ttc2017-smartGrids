/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Generation.Production.GeneratingUnit;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import CIM.IEC61970.Informative.MarketOperations.GeneratingBid;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.RampRateCurve;
import CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;
import CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve;
import CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions;

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
 * An implementation of the model object '<em><b>Registered Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getLowControlLImit <em>Low Control LImit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getLowerControlRate <em>Lower Control Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getRampRateCurves <em>Ramp Rate Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getUnitInitialConditions <em>Unit Initial Conditions</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getStartUpCostCurves <em>Start Up Cost Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getRaiseControlRate <em>Raise Control Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getMaximumOperatingMW <em>Maximum Operating MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getMinimumOperatingMW <em>Minimum Operating MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getGeneratingBids <em>Generating Bids</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl#getSpinReserveRamp <em>Spin Reserve Ramp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredGeneratorImpl extends RegisteredResourceImpl implements RegisteredGenerator {
	/**
	 * The default value of the '{@link #getLowControlLImit() <em>Low Control LImit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowControlLImit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_CONTROL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowControlLImit() <em>Low Control LImit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowControlLImit()
	 * @generated
	 * @ordered
	 */
	protected float lowControlLImit = LOW_CONTROL_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerControlRate() <em>Lower Control Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerControlRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOWER_CONTROL_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerControlRate() <em>Lower Control Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerControlRate()
	 * @generated
	 * @ordered
	 */
	protected Object lowerControlRate = LOWER_CONTROL_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRampRateCurves() <em>Ramp Rate Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampRateCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<RampRateCurve> rampRateCurves;

	/**
	 * The cached value of the '{@link #getUnitInitialConditions() <em>Unit Initial Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitInitialConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitInitialConditions> unitInitialConditions;

	/**
	 * The cached value of the '{@link #getStartUpCostCurves() <em>Start Up Cost Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpCostCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<StartUpCostCurve> startUpCostCurves;

	/**
	 * The default value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object RAISE_RAMP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRampRate()
	 * @generated
	 * @ordered
	 */
	protected Object raiseRampRate = RAISE_RAMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRaiseControlRate() <em>Raise Control Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseControlRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object RAISE_CONTROL_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaiseControlRate() <em>Raise Control Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseControlRate()
	 * @generated
	 * @ordered
	 */
	protected Object raiseControlRate = RAISE_CONTROL_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 * @ordered
	 */
	protected float maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * The default value of the '{@link #getMaximumOperatingMW() <em>Maximum Operating MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOperatingMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_OPERATING_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumOperatingMW() <em>Maximum Operating MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOperatingMW()
	 * @generated
	 * @ordered
	 */
	protected float maximumOperatingMW = MAXIMUM_OPERATING_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighControlLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_CONTROL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighControlLimit()
	 * @generated
	 * @ordered
	 */
	protected float highControlLimit = HIGH_CONTROL_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumOperatingMW() <em>Minimum Operating MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOperatingMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_OPERATING_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumOperatingMW() <em>Minimum Operating MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOperatingMW()
	 * @generated
	 * @ordered
	 */
	protected float minimumOperatingMW = MINIMUM_OPERATING_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOWER_RAMP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRampRate()
	 * @generated
	 * @ordered
	 */
	protected Object lowerRampRate = LOWER_RAMP_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratingBids() <em>Generating Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingBids()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratingBid> generatingBids;

	/**
	 * The default value of the '{@link #getSpinReserveRamp() <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinReserveRamp()
	 * @generated
	 * @ordered
	 */
	protected static final Object SPIN_RESERVE_RAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpinReserveRamp() <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinReserveRamp()
	 * @generated
	 * @ordered
	 */
	protected Object spinReserveRamp = SPIN_RESERVE_RAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.REGISTERED_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowControlLImit() {
		return lowControlLImit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowControlLImit(float newLowControlLImit) {
		float oldLowControlLImit = lowControlLImit;
		lowControlLImit = newLowControlLImit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__LOW_CONTROL_LIMIT, oldLowControlLImit, lowControlLImit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLowerControlRate() {
		return lowerControlRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerControlRate(Object newLowerControlRate) {
		Object oldLowerControlRate = lowerControlRate;
		lowerControlRate = newLowerControlRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_CONTROL_RATE, oldLowerControlRate, lowerControlRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RampRateCurve> getRampRateCurves() {
		if (rampRateCurves == null) {
			rampRateCurves = new EObjectWithInverseResolvingEList.ManyInverse<RampRateCurve>(RampRateCurve.class, this, MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES, MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT);
		}
		return rampRateCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitInitialConditions> getUnitInitialConditions() {
		if (unitInitialConditions == null) {
			unitInitialConditions = new EObjectWithInverseResolvingEList<UnitInitialConditions>(UnitInitialConditions.class, this, MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT);
		}
		return unitInitialConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartUpCostCurve> getStartUpCostCurves() {
		if (startUpCostCurves == null) {
			startUpCostCurves = new EObjectWithInverseResolvingEList.ManyInverse<StartUpCostCurve>(StartUpCostCurve.class, this, MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES, MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS);
		}
		return startUpCostCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRaiseRampRate() {
		return raiseRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaiseRampRate(Object newRaiseRampRate) {
		Object oldRaiseRampRate = raiseRampRate;
		raiseRampRate = newRaiseRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_RAMP_RATE, oldRaiseRampRate, raiseRampRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRaiseControlRate() {
		return raiseControlRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaiseControlRate(Object newRaiseControlRate) {
		Object oldRaiseControlRate = raiseControlRate;
		raiseControlRate = newRaiseControlRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_CONTROL_RATE, oldRaiseControlRate, raiseControlRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumAllowableSpinningReserve() {
		return maximumAllowableSpinningReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAllowableSpinningReserve(float newMaximumAllowableSpinningReserve) {
		float oldMaximumAllowableSpinningReserve = maximumAllowableSpinningReserve;
		maximumAllowableSpinningReserve = newMaximumAllowableSpinningReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE, oldMaximumAllowableSpinningReserve, maximumAllowableSpinningReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT, oldGeneratingUnit, generatingUnit));
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumOperatingMW() {
		return maximumOperatingMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumOperatingMW(float newMaximumOperatingMW) {
		float oldMaximumOperatingMW = maximumOperatingMW;
		maximumOperatingMW = newMaximumOperatingMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW, oldMaximumOperatingMW, maximumOperatingMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighControlLimit() {
		return highControlLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighControlLimit(float newHighControlLimit) {
		float oldHighControlLimit = highControlLimit;
		highControlLimit = newHighControlLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT, oldHighControlLimit, highControlLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumOperatingMW() {
		return minimumOperatingMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumOperatingMW(float newMinimumOperatingMW) {
		float oldMinimumOperatingMW = minimumOperatingMW;
		minimumOperatingMW = newMinimumOperatingMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__MINIMUM_OPERATING_MW, oldMinimumOperatingMW, minimumOperatingMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLowerRampRate() {
		return lowerRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerRampRate(Object newLowerRampRate) {
		Object oldLowerRampRate = lowerRampRate;
		lowerRampRate = newLowerRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_RAMP_RATE, oldLowerRampRate, lowerRampRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratingBid> getGeneratingBids() {
		if (generatingBids == null) {
			generatingBids = new EObjectWithInverseResolvingEList<GeneratingBid>(GeneratingBid.class, this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS, MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR);
		}
		return generatingBids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSpinReserveRamp() {
		return spinReserveRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpinReserveRamp(Object newSpinReserveRamp) {
		Object oldSpinReserveRamp = spinReserveRamp;
		spinReserveRamp = newSpinReserveRamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_GENERATOR__SPIN_RESERVE_RAMP, oldSpinReserveRamp, spinReserveRamp));
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
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRampRateCurves()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnitInitialConditions()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartUpCostCurves()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratingBids()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES:
				return ((InternalEList<?>)getRampRateCurves()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS:
				return ((InternalEList<?>)getUnitInitialConditions()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES:
				return ((InternalEList<?>)getStartUpCostCurves()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS:
				return ((InternalEList<?>)getGeneratingBids()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOW_CONTROL_LIMIT:
				return getLowControlLImit();
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_CONTROL_RATE:
				return getLowerControlRate();
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES:
				return getRampRateCurves();
			case MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS:
				return getUnitInitialConditions();
			case MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES:
				return getStartUpCostCurves();
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_RAMP_RATE:
				return getRaiseRampRate();
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_CONTROL_RATE:
				return getRaiseControlRate();
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				return getMaximumAllowableSpinningReserve();
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW:
				return getMaximumOperatingMW();
			case MarketOperationsPackage.REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT:
				return getHighControlLimit();
			case MarketOperationsPackage.REGISTERED_GENERATOR__MINIMUM_OPERATING_MW:
				return getMinimumOperatingMW();
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_RAMP_RATE:
				return getLowerRampRate();
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS:
				return getGeneratingBids();
			case MarketOperationsPackage.REGISTERED_GENERATOR__SPIN_RESERVE_RAMP:
				return getSpinReserveRamp();
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
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOW_CONTROL_LIMIT:
				setLowControlLImit((Float)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_CONTROL_RATE:
				setLowerControlRate(newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES:
				getRampRateCurves().clear();
				getRampRateCurves().addAll((Collection<? extends RampRateCurve>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS:
				getUnitInitialConditions().clear();
				getUnitInitialConditions().addAll((Collection<? extends UnitInitialConditions>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES:
				getStartUpCostCurves().clear();
				getStartUpCostCurves().addAll((Collection<? extends StartUpCostCurve>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_RAMP_RATE:
				setRaiseRampRate(newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_CONTROL_RATE:
				setRaiseControlRate(newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				setMaximumAllowableSpinningReserve((Float)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW:
				setMaximumOperatingMW((Float)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT:
				setHighControlLimit((Float)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MINIMUM_OPERATING_MW:
				setMinimumOperatingMW((Float)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_RAMP_RATE:
				setLowerRampRate(newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS:
				getGeneratingBids().clear();
				getGeneratingBids().addAll((Collection<? extends GeneratingBid>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__SPIN_RESERVE_RAMP:
				setSpinReserveRamp(newValue);
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
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOW_CONTROL_LIMIT:
				setLowControlLImit(LOW_CONTROL_LIMIT_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_CONTROL_RATE:
				setLowerControlRate(LOWER_CONTROL_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES:
				getRampRateCurves().clear();
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS:
				getUnitInitialConditions().clear();
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES:
				getStartUpCostCurves().clear();
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_RAMP_RATE:
				setRaiseRampRate(RAISE_RAMP_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_CONTROL_RATE:
				setRaiseControlRate(RAISE_CONTROL_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				setMaximumAllowableSpinningReserve(MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW:
				setMaximumOperatingMW(MAXIMUM_OPERATING_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT:
				setHighControlLimit(HIGH_CONTROL_LIMIT_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MINIMUM_OPERATING_MW:
				setMinimumOperatingMW(MINIMUM_OPERATING_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_RAMP_RATE:
				setLowerRampRate(LOWER_RAMP_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS:
				getGeneratingBids().clear();
				return;
			case MarketOperationsPackage.REGISTERED_GENERATOR__SPIN_RESERVE_RAMP:
				setSpinReserveRamp(SPIN_RESERVE_RAMP_EDEFAULT);
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
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOW_CONTROL_LIMIT:
				return lowControlLImit != LOW_CONTROL_LIMIT_EDEFAULT;
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_CONTROL_RATE:
				return LOWER_CONTROL_RATE_EDEFAULT == null ? lowerControlRate != null : !LOWER_CONTROL_RATE_EDEFAULT.equals(lowerControlRate);
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES:
				return rampRateCurves != null && !rampRateCurves.isEmpty();
			case MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS:
				return unitInitialConditions != null && !unitInitialConditions.isEmpty();
			case MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES:
				return startUpCostCurves != null && !startUpCostCurves.isEmpty();
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_RAMP_RATE:
				return RAISE_RAMP_RATE_EDEFAULT == null ? raiseRampRate != null : !RAISE_RAMP_RATE_EDEFAULT.equals(raiseRampRate);
			case MarketOperationsPackage.REGISTERED_GENERATOR__RAISE_CONTROL_RATE:
				return RAISE_CONTROL_RATE_EDEFAULT == null ? raiseControlRate != null : !RAISE_CONTROL_RATE_EDEFAULT.equals(raiseControlRate);
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				return maximumAllowableSpinningReserve != MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT:
				return generatingUnit != null;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW:
				return maximumOperatingMW != MAXIMUM_OPERATING_MW_EDEFAULT;
			case MarketOperationsPackage.REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT:
				return highControlLimit != HIGH_CONTROL_LIMIT_EDEFAULT;
			case MarketOperationsPackage.REGISTERED_GENERATOR__MINIMUM_OPERATING_MW:
				return minimumOperatingMW != MINIMUM_OPERATING_MW_EDEFAULT;
			case MarketOperationsPackage.REGISTERED_GENERATOR__LOWER_RAMP_RATE:
				return LOWER_RAMP_RATE_EDEFAULT == null ? lowerRampRate != null : !LOWER_RAMP_RATE_EDEFAULT.equals(lowerRampRate);
			case MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS:
				return generatingBids != null && !generatingBids.isEmpty();
			case MarketOperationsPackage.REGISTERED_GENERATOR__SPIN_RESERVE_RAMP:
				return SPIN_RESERVE_RAMP_EDEFAULT == null ? spinReserveRamp != null : !SPIN_RESERVE_RAMP_EDEFAULT.equals(spinReserveRamp);
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
		result.append(" (lowControlLImit: ");
		result.append(lowControlLImit);
		result.append(", lowerControlRate: ");
		result.append(lowerControlRate);
		result.append(", raiseRampRate: ");
		result.append(raiseRampRate);
		result.append(", raiseControlRate: ");
		result.append(raiseControlRate);
		result.append(", maximumAllowableSpinningReserve: ");
		result.append(maximumAllowableSpinningReserve);
		result.append(", maximumOperatingMW: ");
		result.append(maximumOperatingMW);
		result.append(", highControlLimit: ");
		result.append(highControlLimit);
		result.append(", minimumOperatingMW: ");
		result.append(minimumOperatingMW);
		result.append(", lowerRampRate: ");
		result.append(lowerRampRate);
		result.append(", spinReserveRamp: ");
		result.append(spinReserveRamp);
		result.append(')');
		return result.toString();
	}

} //RegisteredGeneratorImpl
