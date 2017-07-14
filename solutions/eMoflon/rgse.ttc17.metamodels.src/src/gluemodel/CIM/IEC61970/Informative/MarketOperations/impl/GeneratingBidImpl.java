/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.BidSet;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generating Bid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getUpTimeMin <em>Up Time Min</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getRegisteredGenerator <em>Registered Generator</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getMaximumEconomicMW <em>Maximum Economic MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getBidSet <em>Bid Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getStartUpTimeCurve <em>Start Up Time Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getUpTimeMax <em>Up Time Max</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getStartUpType <em>Start Up Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getNotificationTime <em>Notification Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getNotificationTimeCurve <em>Notification Time Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getMaxEmergencyMW <em>Max Emergency MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getStartUpCostCurve <em>Start Up Cost Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getMinimumEconomicMW <em>Minimum Economic MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getMinEmergencyMW <em>Min Emergency MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getNoLoadCost <em>No Load Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getDownTimeMax <em>Down Time Max</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getStartUpRampRate <em>Start Up Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl#getOperatingMode <em>Operating Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratingBidImpl extends ResourceBidImpl implements GeneratingBid {
	/**
	 * The default value of the '{@link #getUpTimeMin() <em>Up Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpTimeMin()
	 * @generated
	 * @ordered
	 */
	protected static final float UP_TIME_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpTimeMin() <em>Up Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpTimeMin()
	 * @generated
	 * @ordered
	 */
	protected float upTimeMin = UP_TIME_MIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisteredGenerator() <em>Registered Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredGenerator()
	 * @generated
	 * @ordered
	 */
	protected RegisteredGenerator registeredGenerator;

	/**
	 * The default value of the '{@link #getMaximumEconomicMW() <em>Maximum Economic MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEconomicMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_ECONOMIC_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumEconomicMW() <em>Maximum Economic MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEconomicMW()
	 * @generated
	 * @ordered
	 */
	protected float maximumEconomicMW = MAXIMUM_ECONOMIC_MW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBidSet() <em>Bid Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidSet()
	 * @generated
	 * @ordered
	 */
	protected BidSet bidSet;

	/**
	 * The cached value of the '{@link #getStartUpTimeCurve() <em>Start Up Time Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpTimeCurve()
	 * @generated
	 * @ordered
	 */
	protected StartUpTimeCurve startUpTimeCurve;

	/**
	 * The default value of the '{@link #getUpTimeMax() <em>Up Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final float UP_TIME_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpTimeMax() <em>Up Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpTimeMax()
	 * @generated
	 * @ordered
	 */
	protected float upTimeMax = UP_TIME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartUpType() <em>Start Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpType()
	 * @generated
	 * @ordered
	 */
	protected static final int START_UP_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartUpType() <em>Start Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpType()
	 * @generated
	 * @ordered
	 */
	protected int startUpType = START_UP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationTime() <em>Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTime()
	 * @generated
	 * @ordered
	 */
	protected static final float NOTIFICATION_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNotificationTime() <em>Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTime()
	 * @generated
	 * @ordered
	 */
	protected float notificationTime = NOTIFICATION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotificationTimeCurve() <em>Notification Time Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTimeCurve()
	 * @generated
	 * @ordered
	 */
	protected NotificationTimeCurve notificationTimeCurve;

	/**
	 * The default value of the '{@link #getMaxEmergencyMW() <em>Max Emergency MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEmergencyMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_EMERGENCY_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxEmergencyMW() <em>Max Emergency MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEmergencyMW()
	 * @generated
	 * @ordered
	 */
	protected float maxEmergencyMW = MAX_EMERGENCY_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected static final float STARTUP_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected float startupTime = STARTUP_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartUpCostCurve() <em>Start Up Cost Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpCostCurve()
	 * @generated
	 * @ordered
	 */
	protected StartUpCostCurve startUpCostCurve;

	/**
	 * The default value of the '{@link #getMinimumEconomicMW() <em>Minimum Economic MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumEconomicMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_ECONOMIC_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumEconomicMW() <em>Minimum Economic MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumEconomicMW()
	 * @generated
	 * @ordered
	 */
	protected float minimumEconomicMW = MINIMUM_ECONOMIC_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinEmergencyMW() <em>Min Emergency MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEmergencyMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_EMERGENCY_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinEmergencyMW() <em>Min Emergency MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEmergencyMW()
	 * @generated
	 * @ordered
	 */
	protected float minEmergencyMW = MIN_EMERGENCY_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoLoadCost() <em>No Load Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadCost()
	 * @generated
	 * @ordered
	 */
	protected static final float NO_LOAD_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNoLoadCost() <em>No Load Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadCost()
	 * @generated
	 * @ordered
	 */
	protected float noLoadCost = NO_LOAD_COST_EDEFAULT;

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
	 * The default value of the '{@link #getDownTimeMax() <em>Down Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final float DOWN_TIME_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDownTimeMax() <em>Down Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownTimeMax()
	 * @generated
	 * @ordered
	 */
	protected float downTimeMax = DOWN_TIME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartUpRampRate() <em>Start Up Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_UP_RAMP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartUpRampRate() <em>Start Up Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpRampRate()
	 * @generated
	 * @ordered
	 */
	protected Object startUpRampRate = START_UP_RAMP_RATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratingBidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.GENERATING_BID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpTimeMin() {
		return upTimeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpTimeMin(float newUpTimeMin) {
		float oldUpTimeMin = upTimeMin;
		upTimeMin = newUpTimeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__UP_TIME_MIN, oldUpTimeMin, upTimeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator getRegisteredGenerator() {
		if (registeredGenerator != null && registeredGenerator.eIsProxy()) {
			InternalEObject oldRegisteredGenerator = (InternalEObject)registeredGenerator;
			registeredGenerator = (RegisteredGenerator)eResolveProxy(oldRegisteredGenerator);
			if (registeredGenerator != oldRegisteredGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR, oldRegisteredGenerator, registeredGenerator));
			}
		}
		return registeredGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator basicGetRegisteredGenerator() {
		return registeredGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredGenerator(RegisteredGenerator newRegisteredGenerator, NotificationChain msgs) {
		RegisteredGenerator oldRegisteredGenerator = registeredGenerator;
		registeredGenerator = newRegisteredGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR, oldRegisteredGenerator, newRegisteredGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredGenerator(RegisteredGenerator newRegisteredGenerator) {
		if (newRegisteredGenerator != registeredGenerator) {
			NotificationChain msgs = null;
			if (registeredGenerator != null)
				msgs = ((InternalEObject)registeredGenerator).eInverseRemove(this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS, RegisteredGenerator.class, msgs);
			if (newRegisteredGenerator != null)
				msgs = ((InternalEObject)newRegisteredGenerator).eInverseAdd(this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS, RegisteredGenerator.class, msgs);
			msgs = basicSetRegisteredGenerator(newRegisteredGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR, newRegisteredGenerator, newRegisteredGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumEconomicMW() {
		return maximumEconomicMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumEconomicMW(float newMaximumEconomicMW) {
		float oldMaximumEconomicMW = maximumEconomicMW;
		maximumEconomicMW = newMaximumEconomicMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__MAXIMUM_ECONOMIC_MW, oldMaximumEconomicMW, maximumEconomicMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidSet getBidSet() {
		if (bidSet != null && bidSet.eIsProxy()) {
			InternalEObject oldBidSet = (InternalEObject)bidSet;
			bidSet = (BidSet)eResolveProxy(oldBidSet);
			if (bidSet != oldBidSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.GENERATING_BID__BID_SET, oldBidSet, bidSet));
			}
		}
		return bidSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidSet basicGetBidSet() {
		return bidSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBidSet(BidSet newBidSet, NotificationChain msgs) {
		BidSet oldBidSet = bidSet;
		bidSet = newBidSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__BID_SET, oldBidSet, newBidSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidSet(BidSet newBidSet) {
		if (newBidSet != bidSet) {
			NotificationChain msgs = null;
			if (bidSet != null)
				msgs = ((InternalEObject)bidSet).eInverseRemove(this, MarketOperationsPackage.BID_SET__GENERATING_BIDS, BidSet.class, msgs);
			if (newBidSet != null)
				msgs = ((InternalEObject)newBidSet).eInverseAdd(this, MarketOperationsPackage.BID_SET__GENERATING_BIDS, BidSet.class, msgs);
			msgs = basicSetBidSet(newBidSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__BID_SET, newBidSet, newBidSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUpTimeCurve getStartUpTimeCurve() {
		if (startUpTimeCurve != null && startUpTimeCurve.eIsProxy()) {
			InternalEObject oldStartUpTimeCurve = (InternalEObject)startUpTimeCurve;
			startUpTimeCurve = (StartUpTimeCurve)eResolveProxy(oldStartUpTimeCurve);
			if (startUpTimeCurve != oldStartUpTimeCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE, oldStartUpTimeCurve, startUpTimeCurve));
			}
		}
		return startUpTimeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUpTimeCurve basicGetStartUpTimeCurve() {
		return startUpTimeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartUpTimeCurve(StartUpTimeCurve newStartUpTimeCurve, NotificationChain msgs) {
		StartUpTimeCurve oldStartUpTimeCurve = startUpTimeCurve;
		startUpTimeCurve = newStartUpTimeCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE, oldStartUpTimeCurve, newStartUpTimeCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpTimeCurve(StartUpTimeCurve newStartUpTimeCurve) {
		if (newStartUpTimeCurve != startUpTimeCurve) {
			NotificationChain msgs = null;
			if (startUpTimeCurve != null)
				msgs = ((InternalEObject)startUpTimeCurve).eInverseRemove(this, MarketOperationsPackage.START_UP_TIME_CURVE__GENERATING_BIDS, StartUpTimeCurve.class, msgs);
			if (newStartUpTimeCurve != null)
				msgs = ((InternalEObject)newStartUpTimeCurve).eInverseAdd(this, MarketOperationsPackage.START_UP_TIME_CURVE__GENERATING_BIDS, StartUpTimeCurve.class, msgs);
			msgs = basicSetStartUpTimeCurve(newStartUpTimeCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE, newStartUpTimeCurve, newStartUpTimeCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpTimeMax() {
		return upTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpTimeMax(float newUpTimeMax) {
		float oldUpTimeMax = upTimeMax;
		upTimeMax = newUpTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__UP_TIME_MAX, oldUpTimeMax, upTimeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartUpType() {
		return startUpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpType(int newStartUpType) {
		int oldStartUpType = startUpType;
		startUpType = newStartUpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__START_UP_TYPE, oldStartUpType, startUpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNotificationTime() {
		return notificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationTime(float newNotificationTime) {
		float oldNotificationTime = notificationTime;
		notificationTime = newNotificationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME, oldNotificationTime, notificationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTimeCurve getNotificationTimeCurve() {
		if (notificationTimeCurve != null && notificationTimeCurve.eIsProxy()) {
			InternalEObject oldNotificationTimeCurve = (InternalEObject)notificationTimeCurve;
			notificationTimeCurve = (NotificationTimeCurve)eResolveProxy(oldNotificationTimeCurve);
			if (notificationTimeCurve != oldNotificationTimeCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE, oldNotificationTimeCurve, notificationTimeCurve));
			}
		}
		return notificationTimeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTimeCurve basicGetNotificationTimeCurve() {
		return notificationTimeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationTimeCurve(NotificationTimeCurve newNotificationTimeCurve, NotificationChain msgs) {
		NotificationTimeCurve oldNotificationTimeCurve = notificationTimeCurve;
		notificationTimeCurve = newNotificationTimeCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE, oldNotificationTimeCurve, newNotificationTimeCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationTimeCurve(NotificationTimeCurve newNotificationTimeCurve) {
		if (newNotificationTimeCurve != notificationTimeCurve) {
			NotificationChain msgs = null;
			if (notificationTimeCurve != null)
				msgs = ((InternalEObject)notificationTimeCurve).eInverseRemove(this, MarketOperationsPackage.NOTIFICATION_TIME_CURVE__GENERATING_BIDS, NotificationTimeCurve.class, msgs);
			if (newNotificationTimeCurve != null)
				msgs = ((InternalEObject)newNotificationTimeCurve).eInverseAdd(this, MarketOperationsPackage.NOTIFICATION_TIME_CURVE__GENERATING_BIDS, NotificationTimeCurve.class, msgs);
			msgs = basicSetNotificationTimeCurve(newNotificationTimeCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE, newNotificationTimeCurve, newNotificationTimeCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxEmergencyMW() {
		return maxEmergencyMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEmergencyMW(float newMaxEmergencyMW) {
		float oldMaxEmergencyMW = maxEmergencyMW;
		maxEmergencyMW = newMaxEmergencyMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__MAX_EMERGENCY_MW, oldMaxEmergencyMW, maxEmergencyMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartupTime() {
		return startupTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupTime(float newStartupTime) {
		float oldStartupTime = startupTime;
		startupTime = newStartupTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__STARTUP_TIME, oldStartupTime, startupTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUpCostCurve getStartUpCostCurve() {
		if (startUpCostCurve != null && startUpCostCurve.eIsProxy()) {
			InternalEObject oldStartUpCostCurve = (InternalEObject)startUpCostCurve;
			startUpCostCurve = (StartUpCostCurve)eResolveProxy(oldStartUpCostCurve);
			if (startUpCostCurve != oldStartUpCostCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE, oldStartUpCostCurve, startUpCostCurve));
			}
		}
		return startUpCostCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUpCostCurve basicGetStartUpCostCurve() {
		return startUpCostCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartUpCostCurve(StartUpCostCurve newStartUpCostCurve, NotificationChain msgs) {
		StartUpCostCurve oldStartUpCostCurve = startUpCostCurve;
		startUpCostCurve = newStartUpCostCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE, oldStartUpCostCurve, newStartUpCostCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpCostCurve(StartUpCostCurve newStartUpCostCurve) {
		if (newStartUpCostCurve != startUpCostCurve) {
			NotificationChain msgs = null;
			if (startUpCostCurve != null)
				msgs = ((InternalEObject)startUpCostCurve).eInverseRemove(this, MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS, StartUpCostCurve.class, msgs);
			if (newStartUpCostCurve != null)
				msgs = ((InternalEObject)newStartUpCostCurve).eInverseAdd(this, MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS, StartUpCostCurve.class, msgs);
			msgs = basicSetStartUpCostCurve(newStartUpCostCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE, newStartUpCostCurve, newStartUpCostCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumEconomicMW() {
		return minimumEconomicMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumEconomicMW(float newMinimumEconomicMW) {
		float oldMinimumEconomicMW = minimumEconomicMW;
		minimumEconomicMW = newMinimumEconomicMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__MINIMUM_ECONOMIC_MW, oldMinimumEconomicMW, minimumEconomicMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinEmergencyMW() {
		return minEmergencyMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinEmergencyMW(float newMinEmergencyMW) {
		float oldMinEmergencyMW = minEmergencyMW;
		minEmergencyMW = newMinEmergencyMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__MIN_EMERGENCY_MW, oldMinEmergencyMW, minEmergencyMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNoLoadCost() {
		return noLoadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLoadCost(float newNoLoadCost) {
		float oldNoLoadCost = noLoadCost;
		noLoadCost = newNoLoadCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__NO_LOAD_COST, oldNoLoadCost, noLoadCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__MINIMUM_DOWN_TIME, oldMinimumDownTime, minimumDownTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDownTimeMax() {
		return downTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownTimeMax(float newDownTimeMax) {
		float oldDownTimeMax = downTimeMax;
		downTimeMax = newDownTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__DOWN_TIME_MAX, oldDownTimeMax, downTimeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStartUpRampRate() {
		return startUpRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpRampRate(Object newStartUpRampRate) {
		Object oldStartUpRampRate = startUpRampRate;
		startUpRampRate = newStartUpRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__START_UP_RAMP_RATE, oldStartUpRampRate, startUpRampRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.GENERATING_BID__OPERATING_MODE, oldOperatingMode, operatingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR:
				if (registeredGenerator != null)
					msgs = ((InternalEObject)registeredGenerator).eInverseRemove(this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_BIDS, RegisteredGenerator.class, msgs);
				return basicSetRegisteredGenerator((RegisteredGenerator)otherEnd, msgs);
			case MarketOperationsPackage.GENERATING_BID__BID_SET:
				if (bidSet != null)
					msgs = ((InternalEObject)bidSet).eInverseRemove(this, MarketOperationsPackage.BID_SET__GENERATING_BIDS, BidSet.class, msgs);
				return basicSetBidSet((BidSet)otherEnd, msgs);
			case MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE:
				if (startUpTimeCurve != null)
					msgs = ((InternalEObject)startUpTimeCurve).eInverseRemove(this, MarketOperationsPackage.START_UP_TIME_CURVE__GENERATING_BIDS, StartUpTimeCurve.class, msgs);
				return basicSetStartUpTimeCurve((StartUpTimeCurve)otherEnd, msgs);
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE:
				if (notificationTimeCurve != null)
					msgs = ((InternalEObject)notificationTimeCurve).eInverseRemove(this, MarketOperationsPackage.NOTIFICATION_TIME_CURVE__GENERATING_BIDS, NotificationTimeCurve.class, msgs);
				return basicSetNotificationTimeCurve((NotificationTimeCurve)otherEnd, msgs);
			case MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE:
				if (startUpCostCurve != null)
					msgs = ((InternalEObject)startUpCostCurve).eInverseRemove(this, MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS, StartUpCostCurve.class, msgs);
				return basicSetStartUpCostCurve((StartUpCostCurve)otherEnd, msgs);
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
			case MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR:
				return basicSetRegisteredGenerator(null, msgs);
			case MarketOperationsPackage.GENERATING_BID__BID_SET:
				return basicSetBidSet(null, msgs);
			case MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE:
				return basicSetStartUpTimeCurve(null, msgs);
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE:
				return basicSetNotificationTimeCurve(null, msgs);
			case MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE:
				return basicSetStartUpCostCurve(null, msgs);
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
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MIN:
				return getUpTimeMin();
			case MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR:
				if (resolve) return getRegisteredGenerator();
				return basicGetRegisteredGenerator();
			case MarketOperationsPackage.GENERATING_BID__MAXIMUM_ECONOMIC_MW:
				return getMaximumEconomicMW();
			case MarketOperationsPackage.GENERATING_BID__BID_SET:
				if (resolve) return getBidSet();
				return basicGetBidSet();
			case MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE:
				if (resolve) return getStartUpTimeCurve();
				return basicGetStartUpTimeCurve();
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MAX:
				return getUpTimeMax();
			case MarketOperationsPackage.GENERATING_BID__START_UP_TYPE:
				return getStartUpType();
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME:
				return getNotificationTime();
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE:
				if (resolve) return getNotificationTimeCurve();
				return basicGetNotificationTimeCurve();
			case MarketOperationsPackage.GENERATING_BID__MAX_EMERGENCY_MW:
				return getMaxEmergencyMW();
			case MarketOperationsPackage.GENERATING_BID__STARTUP_TIME:
				return getStartupTime();
			case MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE:
				if (resolve) return getStartUpCostCurve();
				return basicGetStartUpCostCurve();
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_ECONOMIC_MW:
				return getMinimumEconomicMW();
			case MarketOperationsPackage.GENERATING_BID__MIN_EMERGENCY_MW:
				return getMinEmergencyMW();
			case MarketOperationsPackage.GENERATING_BID__NO_LOAD_COST:
				return getNoLoadCost();
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_DOWN_TIME:
				return getMinimumDownTime();
			case MarketOperationsPackage.GENERATING_BID__DOWN_TIME_MAX:
				return getDownTimeMax();
			case MarketOperationsPackage.GENERATING_BID__START_UP_RAMP_RATE:
				return getStartUpRampRate();
			case MarketOperationsPackage.GENERATING_BID__OPERATING_MODE:
				return getOperatingMode();
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
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MIN:
				setUpTimeMin((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR:
				setRegisteredGenerator((RegisteredGenerator)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__MAXIMUM_ECONOMIC_MW:
				setMaximumEconomicMW((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__BID_SET:
				setBidSet((BidSet)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE:
				setStartUpTimeCurve((StartUpTimeCurve)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MAX:
				setUpTimeMax((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_TYPE:
				setStartUpType((Integer)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME:
				setNotificationTime((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE:
				setNotificationTimeCurve((NotificationTimeCurve)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__MAX_EMERGENCY_MW:
				setMaxEmergencyMW((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__STARTUP_TIME:
				setStartupTime((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE:
				setStartUpCostCurve((StartUpCostCurve)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_ECONOMIC_MW:
				setMinimumEconomicMW((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__MIN_EMERGENCY_MW:
				setMinEmergencyMW((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__NO_LOAD_COST:
				setNoLoadCost((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_DOWN_TIME:
				setMinimumDownTime((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__DOWN_TIME_MAX:
				setDownTimeMax((Float)newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_RAMP_RATE:
				setStartUpRampRate(newValue);
				return;
			case MarketOperationsPackage.GENERATING_BID__OPERATING_MODE:
				setOperatingMode((String)newValue);
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
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MIN:
				setUpTimeMin(UP_TIME_MIN_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR:
				setRegisteredGenerator((RegisteredGenerator)null);
				return;
			case MarketOperationsPackage.GENERATING_BID__MAXIMUM_ECONOMIC_MW:
				setMaximumEconomicMW(MAXIMUM_ECONOMIC_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__BID_SET:
				setBidSet((BidSet)null);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE:
				setStartUpTimeCurve((StartUpTimeCurve)null);
				return;
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MAX:
				setUpTimeMax(UP_TIME_MAX_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_TYPE:
				setStartUpType(START_UP_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME:
				setNotificationTime(NOTIFICATION_TIME_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE:
				setNotificationTimeCurve((NotificationTimeCurve)null);
				return;
			case MarketOperationsPackage.GENERATING_BID__MAX_EMERGENCY_MW:
				setMaxEmergencyMW(MAX_EMERGENCY_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__STARTUP_TIME:
				setStartupTime(STARTUP_TIME_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE:
				setStartUpCostCurve((StartUpCostCurve)null);
				return;
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_ECONOMIC_MW:
				setMinimumEconomicMW(MINIMUM_ECONOMIC_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__MIN_EMERGENCY_MW:
				setMinEmergencyMW(MIN_EMERGENCY_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__NO_LOAD_COST:
				setNoLoadCost(NO_LOAD_COST_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_DOWN_TIME:
				setMinimumDownTime(MINIMUM_DOWN_TIME_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__DOWN_TIME_MAX:
				setDownTimeMax(DOWN_TIME_MAX_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__START_UP_RAMP_RATE:
				setStartUpRampRate(START_UP_RAMP_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.GENERATING_BID__OPERATING_MODE:
				setOperatingMode(OPERATING_MODE_EDEFAULT);
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
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MIN:
				return upTimeMin != UP_TIME_MIN_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__REGISTERED_GENERATOR:
				return registeredGenerator != null;
			case MarketOperationsPackage.GENERATING_BID__MAXIMUM_ECONOMIC_MW:
				return maximumEconomicMW != MAXIMUM_ECONOMIC_MW_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__BID_SET:
				return bidSet != null;
			case MarketOperationsPackage.GENERATING_BID__START_UP_TIME_CURVE:
				return startUpTimeCurve != null;
			case MarketOperationsPackage.GENERATING_BID__UP_TIME_MAX:
				return upTimeMax != UP_TIME_MAX_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__START_UP_TYPE:
				return startUpType != START_UP_TYPE_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME:
				return notificationTime != NOTIFICATION_TIME_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__NOTIFICATION_TIME_CURVE:
				return notificationTimeCurve != null;
			case MarketOperationsPackage.GENERATING_BID__MAX_EMERGENCY_MW:
				return maxEmergencyMW != MAX_EMERGENCY_MW_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__STARTUP_TIME:
				return startupTime != STARTUP_TIME_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE:
				return startUpCostCurve != null;
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_ECONOMIC_MW:
				return minimumEconomicMW != MINIMUM_ECONOMIC_MW_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__MIN_EMERGENCY_MW:
				return minEmergencyMW != MIN_EMERGENCY_MW_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__NO_LOAD_COST:
				return noLoadCost != NO_LOAD_COST_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__MINIMUM_DOWN_TIME:
				return minimumDownTime != MINIMUM_DOWN_TIME_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__DOWN_TIME_MAX:
				return downTimeMax != DOWN_TIME_MAX_EDEFAULT;
			case MarketOperationsPackage.GENERATING_BID__START_UP_RAMP_RATE:
				return START_UP_RAMP_RATE_EDEFAULT == null ? startUpRampRate != null : !START_UP_RAMP_RATE_EDEFAULT.equals(startUpRampRate);
			case MarketOperationsPackage.GENERATING_BID__OPERATING_MODE:
				return OPERATING_MODE_EDEFAULT == null ? operatingMode != null : !OPERATING_MODE_EDEFAULT.equals(operatingMode);
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
		result.append(" (upTimeMin: ");
		result.append(upTimeMin);
		result.append(", maximumEconomicMW: ");
		result.append(maximumEconomicMW);
		result.append(", upTimeMax: ");
		result.append(upTimeMax);
		result.append(", startUpType: ");
		result.append(startUpType);
		result.append(", notificationTime: ");
		result.append(notificationTime);
		result.append(", maxEmergencyMW: ");
		result.append(maxEmergencyMW);
		result.append(", startupTime: ");
		result.append(startupTime);
		result.append(", minimumEconomicMW: ");
		result.append(minimumEconomicMW);
		result.append(", minEmergencyMW: ");
		result.append(minEmergencyMW);
		result.append(", noLoadCost: ");
		result.append(noLoadCost);
		result.append(", minimumDownTime: ");
		result.append(minimumDownTime);
		result.append(", downTimeMax: ");
		result.append(downTimeMax);
		result.append(", startUpRampRate: ");
		result.append(startUpRampRate);
		result.append(", operatingMode: ");
		result.append(operatingMode);
		result.append(')');
		return result.toString();
	}

} //GeneratingBidImpl
