/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Bid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getMinLoadReduction <em>Min Load Reduction</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getDropRampRate <em>Drop Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getMinLoadReductionInterval <em>Min Load Reduction Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getLoadReductionPriceCurve <em>Load Reduction Price Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getMinLoadReductionCost <em>Min Load Reduction Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getPickUpRampRate <em>Pick Up Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getReqNoticeTime <em>Req Notice Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getMinLoad <em>Min Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getRegisteredLoad <em>Registered Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getMinTimeBetLoadRed <em>Min Time Bet Load Red</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl#getShutdownCost <em>Shutdown Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBidImpl extends ResourceBidImpl implements LoadBid {
	/**
	 * The default value of the '{@link #getMinLoadReduction() <em>Min Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoadReduction()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LOAD_REDUCTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLoadReduction() <em>Min Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoadReduction()
	 * @generated
	 * @ordered
	 */
	protected float minLoadReduction = MIN_LOAD_REDUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropRampRate() <em>Drop Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object DROP_RAMP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropRampRate() <em>Drop Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropRampRate()
	 * @generated
	 * @ordered
	 */
	protected Object dropRampRate = DROP_RAMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLoadReductionInterval() <em>Min Load Reduction Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoadReductionInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LOAD_REDUCTION_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLoadReductionInterval() <em>Min Load Reduction Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoadReductionInterval()
	 * @generated
	 * @ordered
	 */
	protected float minLoadReductionInterval = MIN_LOAD_REDUCTION_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadReductionPriceCurve() <em>Load Reduction Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReductionPriceCurve()
	 * @generated
	 * @ordered
	 */
	protected LoadReductionPriceCurve loadReductionPriceCurve;

	/**
	 * The default value of the '{@link #getMinLoadReductionCost() <em>Min Load Reduction Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoadReductionCost()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LOAD_REDUCTION_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLoadReductionCost() <em>Min Load Reduction Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoadReductionCost()
	 * @generated
	 * @ordered
	 */
	protected float minLoadReductionCost = MIN_LOAD_REDUCTION_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPickUpRampRate() <em>Pick Up Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickUpRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object PICK_UP_RAMP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPickUpRampRate() <em>Pick Up Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickUpRampRate()
	 * @generated
	 * @ordered
	 */
	protected Object pickUpRampRate = PICK_UP_RAMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqNoticeTime() <em>Req Notice Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqNoticeTime()
	 * @generated
	 * @ordered
	 */
	protected static final float REQ_NOTICE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReqNoticeTime() <em>Req Notice Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqNoticeTime()
	 * @generated
	 * @ordered
	 */
	protected float reqNoticeTime = REQ_NOTICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLoad() <em>Min Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLoad() <em>Min Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoad()
	 * @generated
	 * @ordered
	 */
	protected float minLoad = MIN_LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisteredLoad() <em>Registered Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredLoad()
	 * @generated
	 * @ordered
	 */
	protected RegisteredLoad registeredLoad;

	/**
	 * The default value of the '{@link #getMinTimeBetLoadRed() <em>Min Time Bet Load Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeBetLoadRed()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_TIME_BET_LOAD_RED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinTimeBetLoadRed() <em>Min Time Bet Load Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeBetLoadRed()
	 * @generated
	 * @ordered
	 */
	protected float minTimeBetLoadRed = MIN_TIME_BET_LOAD_RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutdownCost() <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownCost()
	 * @generated
	 * @ordered
	 */
	protected static final float SHUTDOWN_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShutdownCost() <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownCost()
	 * @generated
	 * @ordered
	 */
	protected float shutdownCost = SHUTDOWN_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.LOAD_BID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLoadReduction() {
		return minLoadReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLoadReduction(float newMinLoadReduction) {
		float oldMinLoadReduction = minLoadReduction;
		minLoadReduction = newMinLoadReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION, oldMinLoadReduction, minLoadReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDropRampRate() {
		return dropRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropRampRate(Object newDropRampRate) {
		Object oldDropRampRate = dropRampRate;
		dropRampRate = newDropRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__DROP_RAMP_RATE, oldDropRampRate, dropRampRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLoadReductionInterval() {
		return minLoadReductionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLoadReductionInterval(float newMinLoadReductionInterval) {
		float oldMinLoadReductionInterval = minLoadReductionInterval;
		minLoadReductionInterval = newMinLoadReductionInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL, oldMinLoadReductionInterval, minLoadReductionInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadReductionPriceCurve getLoadReductionPriceCurve() {
		if (loadReductionPriceCurve != null && loadReductionPriceCurve.eIsProxy()) {
			InternalEObject oldLoadReductionPriceCurve = (InternalEObject)loadReductionPriceCurve;
			loadReductionPriceCurve = (LoadReductionPriceCurve)eResolveProxy(oldLoadReductionPriceCurve);
			if (loadReductionPriceCurve != oldLoadReductionPriceCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE, oldLoadReductionPriceCurve, loadReductionPriceCurve));
			}
		}
		return loadReductionPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadReductionPriceCurve basicGetLoadReductionPriceCurve() {
		return loadReductionPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadReductionPriceCurve(LoadReductionPriceCurve newLoadReductionPriceCurve, NotificationChain msgs) {
		LoadReductionPriceCurve oldLoadReductionPriceCurve = loadReductionPriceCurve;
		loadReductionPriceCurve = newLoadReductionPriceCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE, oldLoadReductionPriceCurve, newLoadReductionPriceCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadReductionPriceCurve(LoadReductionPriceCurve newLoadReductionPriceCurve) {
		if (newLoadReductionPriceCurve != loadReductionPriceCurve) {
			NotificationChain msgs = null;
			if (loadReductionPriceCurve != null)
				msgs = ((InternalEObject)loadReductionPriceCurve).eInverseRemove(this, MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS, LoadReductionPriceCurve.class, msgs);
			if (newLoadReductionPriceCurve != null)
				msgs = ((InternalEObject)newLoadReductionPriceCurve).eInverseAdd(this, MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS, LoadReductionPriceCurve.class, msgs);
			msgs = basicSetLoadReductionPriceCurve(newLoadReductionPriceCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE, newLoadReductionPriceCurve, newLoadReductionPriceCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLoadReductionCost() {
		return minLoadReductionCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLoadReductionCost(float newMinLoadReductionCost) {
		float oldMinLoadReductionCost = minLoadReductionCost;
		minLoadReductionCost = newMinLoadReductionCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_COST, oldMinLoadReductionCost, minLoadReductionCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPickUpRampRate() {
		return pickUpRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickUpRampRate(Object newPickUpRampRate) {
		Object oldPickUpRampRate = pickUpRampRate;
		pickUpRampRate = newPickUpRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__PICK_UP_RAMP_RATE, oldPickUpRampRate, pickUpRampRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReqNoticeTime() {
		return reqNoticeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqNoticeTime(float newReqNoticeTime) {
		float oldReqNoticeTime = reqNoticeTime;
		reqNoticeTime = newReqNoticeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__REQ_NOTICE_TIME, oldReqNoticeTime, reqNoticeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLoad() {
		return minLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLoad(float newMinLoad) {
		float oldMinLoad = minLoad;
		minLoad = newMinLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__MIN_LOAD, oldMinLoad, minLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredLoad getRegisteredLoad() {
		if (registeredLoad != null && registeredLoad.eIsProxy()) {
			InternalEObject oldRegisteredLoad = (InternalEObject)registeredLoad;
			registeredLoad = (RegisteredLoad)eResolveProxy(oldRegisteredLoad);
			if (registeredLoad != oldRegisteredLoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD, oldRegisteredLoad, registeredLoad));
			}
		}
		return registeredLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredLoad basicGetRegisteredLoad() {
		return registeredLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredLoad(RegisteredLoad newRegisteredLoad, NotificationChain msgs) {
		RegisteredLoad oldRegisteredLoad = registeredLoad;
		registeredLoad = newRegisteredLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD, oldRegisteredLoad, newRegisteredLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredLoad(RegisteredLoad newRegisteredLoad) {
		if (newRegisteredLoad != registeredLoad) {
			NotificationChain msgs = null;
			if (registeredLoad != null)
				msgs = ((InternalEObject)registeredLoad).eInverseRemove(this, MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS, RegisteredLoad.class, msgs);
			if (newRegisteredLoad != null)
				msgs = ((InternalEObject)newRegisteredLoad).eInverseAdd(this, MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS, RegisteredLoad.class, msgs);
			msgs = basicSetRegisteredLoad(newRegisteredLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD, newRegisteredLoad, newRegisteredLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinTimeBetLoadRed() {
		return minTimeBetLoadRed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTimeBetLoadRed(float newMinTimeBetLoadRed) {
		float oldMinTimeBetLoadRed = minTimeBetLoadRed;
		minTimeBetLoadRed = newMinTimeBetLoadRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__MIN_TIME_BET_LOAD_RED, oldMinTimeBetLoadRed, minTimeBetLoadRed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShutdownCost() {
		return shutdownCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShutdownCost(float newShutdownCost) {
		float oldShutdownCost = shutdownCost;
		shutdownCost = newShutdownCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOAD_BID__SHUTDOWN_COST, oldShutdownCost, shutdownCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE:
				if (loadReductionPriceCurve != null)
					msgs = ((InternalEObject)loadReductionPriceCurve).eInverseRemove(this, MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS, LoadReductionPriceCurve.class, msgs);
				return basicSetLoadReductionPriceCurve((LoadReductionPriceCurve)otherEnd, msgs);
			case MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD:
				if (registeredLoad != null)
					msgs = ((InternalEObject)registeredLoad).eInverseRemove(this, MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS, RegisteredLoad.class, msgs);
				return basicSetRegisteredLoad((RegisteredLoad)otherEnd, msgs);
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
			case MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE:
				return basicSetLoadReductionPriceCurve(null, msgs);
			case MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD:
				return basicSetRegisteredLoad(null, msgs);
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
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION:
				return getMinLoadReduction();
			case MarketOperationsPackage.LOAD_BID__DROP_RAMP_RATE:
				return getDropRampRate();
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL:
				return getMinLoadReductionInterval();
			case MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE:
				if (resolve) return getLoadReductionPriceCurve();
				return basicGetLoadReductionPriceCurve();
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_COST:
				return getMinLoadReductionCost();
			case MarketOperationsPackage.LOAD_BID__PICK_UP_RAMP_RATE:
				return getPickUpRampRate();
			case MarketOperationsPackage.LOAD_BID__REQ_NOTICE_TIME:
				return getReqNoticeTime();
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD:
				return getMinLoad();
			case MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD:
				if (resolve) return getRegisteredLoad();
				return basicGetRegisteredLoad();
			case MarketOperationsPackage.LOAD_BID__MIN_TIME_BET_LOAD_RED:
				return getMinTimeBetLoadRed();
			case MarketOperationsPackage.LOAD_BID__SHUTDOWN_COST:
				return getShutdownCost();
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
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION:
				setMinLoadReduction((Float)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__DROP_RAMP_RATE:
				setDropRampRate(newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL:
				setMinLoadReductionInterval((Float)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE:
				setLoadReductionPriceCurve((LoadReductionPriceCurve)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_COST:
				setMinLoadReductionCost((Float)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__PICK_UP_RAMP_RATE:
				setPickUpRampRate(newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__REQ_NOTICE_TIME:
				setReqNoticeTime((Float)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD:
				setMinLoad((Float)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD:
				setRegisteredLoad((RegisteredLoad)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_TIME_BET_LOAD_RED:
				setMinTimeBetLoadRed((Float)newValue);
				return;
			case MarketOperationsPackage.LOAD_BID__SHUTDOWN_COST:
				setShutdownCost((Float)newValue);
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
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION:
				setMinLoadReduction(MIN_LOAD_REDUCTION_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__DROP_RAMP_RATE:
				setDropRampRate(DROP_RAMP_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL:
				setMinLoadReductionInterval(MIN_LOAD_REDUCTION_INTERVAL_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE:
				setLoadReductionPriceCurve((LoadReductionPriceCurve)null);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_COST:
				setMinLoadReductionCost(MIN_LOAD_REDUCTION_COST_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__PICK_UP_RAMP_RATE:
				setPickUpRampRate(PICK_UP_RAMP_RATE_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__REQ_NOTICE_TIME:
				setReqNoticeTime(REQ_NOTICE_TIME_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD:
				setMinLoad(MIN_LOAD_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD:
				setRegisteredLoad((RegisteredLoad)null);
				return;
			case MarketOperationsPackage.LOAD_BID__MIN_TIME_BET_LOAD_RED:
				setMinTimeBetLoadRed(MIN_TIME_BET_LOAD_RED_EDEFAULT);
				return;
			case MarketOperationsPackage.LOAD_BID__SHUTDOWN_COST:
				setShutdownCost(SHUTDOWN_COST_EDEFAULT);
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
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION:
				return minLoadReduction != MIN_LOAD_REDUCTION_EDEFAULT;
			case MarketOperationsPackage.LOAD_BID__DROP_RAMP_RATE:
				return DROP_RAMP_RATE_EDEFAULT == null ? dropRampRate != null : !DROP_RAMP_RATE_EDEFAULT.equals(dropRampRate);
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL:
				return minLoadReductionInterval != MIN_LOAD_REDUCTION_INTERVAL_EDEFAULT;
			case MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE:
				return loadReductionPriceCurve != null;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD_REDUCTION_COST:
				return minLoadReductionCost != MIN_LOAD_REDUCTION_COST_EDEFAULT;
			case MarketOperationsPackage.LOAD_BID__PICK_UP_RAMP_RATE:
				return PICK_UP_RAMP_RATE_EDEFAULT == null ? pickUpRampRate != null : !PICK_UP_RAMP_RATE_EDEFAULT.equals(pickUpRampRate);
			case MarketOperationsPackage.LOAD_BID__REQ_NOTICE_TIME:
				return reqNoticeTime != REQ_NOTICE_TIME_EDEFAULT;
			case MarketOperationsPackage.LOAD_BID__MIN_LOAD:
				return minLoad != MIN_LOAD_EDEFAULT;
			case MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD:
				return registeredLoad != null;
			case MarketOperationsPackage.LOAD_BID__MIN_TIME_BET_LOAD_RED:
				return minTimeBetLoadRed != MIN_TIME_BET_LOAD_RED_EDEFAULT;
			case MarketOperationsPackage.LOAD_BID__SHUTDOWN_COST:
				return shutdownCost != SHUTDOWN_COST_EDEFAULT;
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
		result.append(" (minLoadReduction: ");
		result.append(minLoadReduction);
		result.append(", dropRampRate: ");
		result.append(dropRampRate);
		result.append(", minLoadReductionInterval: ");
		result.append(minLoadReductionInterval);
		result.append(", minLoadReductionCost: ");
		result.append(minLoadReductionCost);
		result.append(", pickUpRampRate: ");
		result.append(pickUpRampRate);
		result.append(", reqNoticeTime: ");
		result.append(reqNoticeTime);
		result.append(", minLoad: ");
		result.append(minLoad);
		result.append(", minTimeBetLoadRed: ");
		result.append(minTimeBetLoadRed);
		result.append(", shutdownCost: ");
		result.append(shutdownCost);
		result.append(')');
		return result.toString();
	}

} //LoadBidImpl
