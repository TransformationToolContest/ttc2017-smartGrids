/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Market;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Market</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getMarketFactors <em>Market Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getStart <em>Start</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getMarketProducts <em>Market Products</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getRTO <em>RTO</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getRampIntervalNonSpinRes <em>Ramp Interval Non Spin Res</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getEnd <em>End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getTimeIntervalLength <em>Time Interval Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getSettlements <em>Settlements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getBids <em>Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getRampIntervalReg <em>Ramp Interval Reg</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getRegisteredResources <em>Registered Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getRampIntervalSpinRes <em>Ramp Interval Spin Res</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#isDst <em>Dst</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getRampIntervalEnergy <em>Ramp Interval Energy</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl#getLocalTimeZone <em>Local Time Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketImpl extends IdentifiedObjectImpl implements Market {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketFactors() <em>Market Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketFactors> marketFactors;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketProducts() <em>Market Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketProduct> marketProducts;

	/**
	 * The cached value of the '{@link #getRTO() <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTO()
	 * @generated
	 * @ordered
	 */
	protected RTO rto;

	/**
	 * The default value of the '{@link #getRampIntervalNonSpinRes() <em>Ramp Interval Non Spin Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalNonSpinRes()
	 * @generated
	 * @ordered
	 */
	protected static final float RAMP_INTERVAL_NON_SPIN_RES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRampIntervalNonSpinRes() <em>Ramp Interval Non Spin Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalNonSpinRes()
	 * @generated
	 * @ordered
	 */
	protected float rampIntervalNonSpinRes = RAMP_INTERVAL_NON_SPIN_RES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeIntervalLength() <em>Time Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIntervalLength()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_INTERVAL_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeIntervalLength() <em>Time Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIntervalLength()
	 * @generated
	 * @ordered
	 */
	protected float timeIntervalLength = TIME_INTERVAL_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettlements() <em>Settlements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlements()
	 * @generated
	 * @ordered
	 */
	protected EList<Settlement> settlements;

	/**
	 * The cached value of the '{@link #getBids() <em>Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBids()
	 * @generated
	 * @ordered
	 */
	protected EList<Bid> bids;

	/**
	 * The default value of the '{@link #getRampIntervalReg() <em>Ramp Interval Reg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalReg()
	 * @generated
	 * @ordered
	 */
	protected static final float RAMP_INTERVAL_REG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRampIntervalReg() <em>Ramp Interval Reg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalReg()
	 * @generated
	 * @ordered
	 */
	protected float rampIntervalReg = RAMP_INTERVAL_REG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisteredResources() <em>Registered Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredResource> registeredResources;

	/**
	 * The default value of the '{@link #getRampIntervalSpinRes() <em>Ramp Interval Spin Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalSpinRes()
	 * @generated
	 * @ordered
	 */
	protected static final float RAMP_INTERVAL_SPIN_RES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRampIntervalSpinRes() <em>Ramp Interval Spin Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalSpinRes()
	 * @generated
	 * @ordered
	 */
	protected float rampIntervalSpinRes = RAMP_INTERVAL_SPIN_RES_EDEFAULT;

	/**
	 * The default value of the '{@link #isDst() <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDst() <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDst()
	 * @generated
	 * @ordered
	 */
	protected boolean dst = DST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRampIntervalEnergy() <em>Ramp Interval Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final float RAMP_INTERVAL_ENERGY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRampIntervalEnergy() <em>Ramp Interval Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampIntervalEnergy()
	 * @generated
	 * @ordered
	 */
	protected float rampIntervalEnergy = RAMP_INTERVAL_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalTimeZone() <em>Local Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalTimeZone() <em>Local Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTimeZone()
	 * @generated
	 * @ordered
	 */
	protected String localTimeZone = LOCAL_TIME_ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MARKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketFactors> getMarketFactors() {
		if (marketFactors == null) {
			marketFactors = new EObjectWithInverseResolvingEList<MarketFactors>(MarketFactors.class, this, MarketOperationsPackage.MARKET__MARKET_FACTORS, MarketOperationsPackage.MARKET_FACTORS__MARKET);
		}
		return marketFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketProduct> getMarketProducts() {
		if (marketProducts == null) {
			marketProducts = new EObjectWithInverseResolvingEList<MarketProduct>(MarketProduct.class, this, MarketOperationsPackage.MARKET__MARKET_PRODUCTS, MarketOperationsPackage.MARKET_PRODUCT__MARKET);
		}
		return marketProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO getRTO() {
		if (rto != null && rto.eIsProxy()) {
			InternalEObject oldRTO = (InternalEObject)rto;
			rto = (RTO)eResolveProxy(oldRTO);
			if (rto != oldRTO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MARKET__RTO, oldRTO, rto));
			}
		}
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO basicGetRTO() {
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRTO(RTO newRTO, NotificationChain msgs) {
		RTO oldRTO = rto;
		rto = newRTO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__RTO, oldRTO, newRTO);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRTO(RTO newRTO) {
		if (newRTO != rto) {
			NotificationChain msgs = null;
			if (rto != null)
				msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__MARKETS, RTO.class, msgs);
			if (newRTO != null)
				msgs = ((InternalEObject)newRTO).eInverseAdd(this, MarketOperationsPackage.RTO__MARKETS, RTO.class, msgs);
			msgs = basicSetRTO(newRTO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__RTO, newRTO, newRTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRampIntervalNonSpinRes() {
		return rampIntervalNonSpinRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampIntervalNonSpinRes(float newRampIntervalNonSpinRes) {
		float oldRampIntervalNonSpinRes = rampIntervalNonSpinRes;
		rampIntervalNonSpinRes = newRampIntervalNonSpinRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__RAMP_INTERVAL_NON_SPIN_RES, oldRampIntervalNonSpinRes, rampIntervalNonSpinRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeIntervalLength() {
		return timeIntervalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeIntervalLength(float newTimeIntervalLength) {
		float oldTimeIntervalLength = timeIntervalLength;
		timeIntervalLength = newTimeIntervalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__TIME_INTERVAL_LENGTH, oldTimeIntervalLength, timeIntervalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Settlement> getSettlements() {
		if (settlements == null) {
			settlements = new EObjectWithInverseResolvingEList<Settlement>(Settlement.class, this, MarketOperationsPackage.MARKET__SETTLEMENTS, MarketOperationsPackage.SETTLEMENT__MARKET);
		}
		return settlements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bid> getBids() {
		if (bids == null) {
			bids = new EObjectWithInverseResolvingEList<Bid>(Bid.class, this, MarketOperationsPackage.MARKET__BIDS, MarketOperationsPackage.BID__MARKET);
		}
		return bids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRampIntervalReg() {
		return rampIntervalReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampIntervalReg(float newRampIntervalReg) {
		float oldRampIntervalReg = rampIntervalReg;
		rampIntervalReg = newRampIntervalReg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__RAMP_INTERVAL_REG, oldRampIntervalReg, rampIntervalReg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredResource> getRegisteredResources() {
		if (registeredResources == null) {
			registeredResources = new EObjectWithInverseResolvingEList.ManyInverse<RegisteredResource>(RegisteredResource.class, this, MarketOperationsPackage.MARKET__REGISTERED_RESOURCES, MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS);
		}
		return registeredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRampIntervalSpinRes() {
		return rampIntervalSpinRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampIntervalSpinRes(float newRampIntervalSpinRes) {
		float oldRampIntervalSpinRes = rampIntervalSpinRes;
		rampIntervalSpinRes = newRampIntervalSpinRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__RAMP_INTERVAL_SPIN_RES, oldRampIntervalSpinRes, rampIntervalSpinRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDst(boolean newDst) {
		boolean oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__DST, oldDst, dst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRampIntervalEnergy() {
		return rampIntervalEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampIntervalEnergy(float newRampIntervalEnergy) {
		float oldRampIntervalEnergy = rampIntervalEnergy;
		rampIntervalEnergy = newRampIntervalEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__RAMP_INTERVAL_ENERGY, oldRampIntervalEnergy, rampIntervalEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalTimeZone() {
		return localTimeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalTimeZone(String newLocalTimeZone) {
		String oldLocalTimeZone = localTimeZone;
		localTimeZone = newLocalTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET__LOCAL_TIME_ZONE, oldLocalTimeZone, localTimeZone));
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
			case MarketOperationsPackage.MARKET__MARKET_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketFactors()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__MARKET_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketProducts()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__RTO:
				if (rto != null)
					msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__MARKETS, RTO.class, msgs);
				return basicSetRTO((RTO)otherEnd, msgs);
			case MarketOperationsPackage.MARKET__SETTLEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSettlements()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBids()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__REGISTERED_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisteredResources()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.MARKET__MARKET_FACTORS:
				return ((InternalEList<?>)getMarketFactors()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__MARKET_PRODUCTS:
				return ((InternalEList<?>)getMarketProducts()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__RTO:
				return basicSetRTO(null, msgs);
			case MarketOperationsPackage.MARKET__SETTLEMENTS:
				return ((InternalEList<?>)getSettlements()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__BIDS:
				return ((InternalEList<?>)getBids()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET__REGISTERED_RESOURCES:
				return ((InternalEList<?>)getRegisteredResources()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.MARKET__TYPE:
				return getType();
			case MarketOperationsPackage.MARKET__MARKET_FACTORS:
				return getMarketFactors();
			case MarketOperationsPackage.MARKET__START:
				return getStart();
			case MarketOperationsPackage.MARKET__MARKET_PRODUCTS:
				return getMarketProducts();
			case MarketOperationsPackage.MARKET__RTO:
				if (resolve) return getRTO();
				return basicGetRTO();
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_NON_SPIN_RES:
				return getRampIntervalNonSpinRes();
			case MarketOperationsPackage.MARKET__END:
				return getEnd();
			case MarketOperationsPackage.MARKET__TIME_INTERVAL_LENGTH:
				return getTimeIntervalLength();
			case MarketOperationsPackage.MARKET__SETTLEMENTS:
				return getSettlements();
			case MarketOperationsPackage.MARKET__BIDS:
				return getBids();
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_REG:
				return getRampIntervalReg();
			case MarketOperationsPackage.MARKET__REGISTERED_RESOURCES:
				return getRegisteredResources();
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_SPIN_RES:
				return getRampIntervalSpinRes();
			case MarketOperationsPackage.MARKET__DST:
				return isDst();
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_ENERGY:
				return getRampIntervalEnergy();
			case MarketOperationsPackage.MARKET__LOCAL_TIME_ZONE:
				return getLocalTimeZone();
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
			case MarketOperationsPackage.MARKET__TYPE:
				setType((String)newValue);
				return;
			case MarketOperationsPackage.MARKET__MARKET_FACTORS:
				getMarketFactors().clear();
				getMarketFactors().addAll((Collection<? extends MarketFactors>)newValue);
				return;
			case MarketOperationsPackage.MARKET__START:
				setStart((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET__MARKET_PRODUCTS:
				getMarketProducts().clear();
				getMarketProducts().addAll((Collection<? extends MarketProduct>)newValue);
				return;
			case MarketOperationsPackage.MARKET__RTO:
				setRTO((RTO)newValue);
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_NON_SPIN_RES:
				setRampIntervalNonSpinRes((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET__END:
				setEnd((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET__TIME_INTERVAL_LENGTH:
				setTimeIntervalLength((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET__SETTLEMENTS:
				getSettlements().clear();
				getSettlements().addAll((Collection<? extends Settlement>)newValue);
				return;
			case MarketOperationsPackage.MARKET__BIDS:
				getBids().clear();
				getBids().addAll((Collection<? extends Bid>)newValue);
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_REG:
				setRampIntervalReg((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				getRegisteredResources().addAll((Collection<? extends RegisteredResource>)newValue);
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_SPIN_RES:
				setRampIntervalSpinRes((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET__DST:
				setDst((Boolean)newValue);
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_ENERGY:
				setRampIntervalEnergy((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET__LOCAL_TIME_ZONE:
				setLocalTimeZone((String)newValue);
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
			case MarketOperationsPackage.MARKET__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__MARKET_FACTORS:
				getMarketFactors().clear();
				return;
			case MarketOperationsPackage.MARKET__START:
				setStart(START_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__MARKET_PRODUCTS:
				getMarketProducts().clear();
				return;
			case MarketOperationsPackage.MARKET__RTO:
				setRTO((RTO)null);
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_NON_SPIN_RES:
				setRampIntervalNonSpinRes(RAMP_INTERVAL_NON_SPIN_RES_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__END:
				setEnd(END_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__TIME_INTERVAL_LENGTH:
				setTimeIntervalLength(TIME_INTERVAL_LENGTH_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__SETTLEMENTS:
				getSettlements().clear();
				return;
			case MarketOperationsPackage.MARKET__BIDS:
				getBids().clear();
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_REG:
				setRampIntervalReg(RAMP_INTERVAL_REG_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_SPIN_RES:
				setRampIntervalSpinRes(RAMP_INTERVAL_SPIN_RES_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__DST:
				setDst(DST_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_ENERGY:
				setRampIntervalEnergy(RAMP_INTERVAL_ENERGY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET__LOCAL_TIME_ZONE:
				setLocalTimeZone(LOCAL_TIME_ZONE_EDEFAULT);
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
			case MarketOperationsPackage.MARKET__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MarketOperationsPackage.MARKET__MARKET_FACTORS:
				return marketFactors != null && !marketFactors.isEmpty();
			case MarketOperationsPackage.MARKET__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case MarketOperationsPackage.MARKET__MARKET_PRODUCTS:
				return marketProducts != null && !marketProducts.isEmpty();
			case MarketOperationsPackage.MARKET__RTO:
				return rto != null;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_NON_SPIN_RES:
				return rampIntervalNonSpinRes != RAMP_INTERVAL_NON_SPIN_RES_EDEFAULT;
			case MarketOperationsPackage.MARKET__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case MarketOperationsPackage.MARKET__TIME_INTERVAL_LENGTH:
				return timeIntervalLength != TIME_INTERVAL_LENGTH_EDEFAULT;
			case MarketOperationsPackage.MARKET__SETTLEMENTS:
				return settlements != null && !settlements.isEmpty();
			case MarketOperationsPackage.MARKET__BIDS:
				return bids != null && !bids.isEmpty();
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_REG:
				return rampIntervalReg != RAMP_INTERVAL_REG_EDEFAULT;
			case MarketOperationsPackage.MARKET__REGISTERED_RESOURCES:
				return registeredResources != null && !registeredResources.isEmpty();
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_SPIN_RES:
				return rampIntervalSpinRes != RAMP_INTERVAL_SPIN_RES_EDEFAULT;
			case MarketOperationsPackage.MARKET__DST:
				return dst != DST_EDEFAULT;
			case MarketOperationsPackage.MARKET__RAMP_INTERVAL_ENERGY:
				return rampIntervalEnergy != RAMP_INTERVAL_ENERGY_EDEFAULT;
			case MarketOperationsPackage.MARKET__LOCAL_TIME_ZONE:
				return LOCAL_TIME_ZONE_EDEFAULT == null ? localTimeZone != null : !LOCAL_TIME_ZONE_EDEFAULT.equals(localTimeZone);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", start: ");
		result.append(start);
		result.append(", rampIntervalNonSpinRes: ");
		result.append(rampIntervalNonSpinRes);
		result.append(", end: ");
		result.append(end);
		result.append(", timeIntervalLength: ");
		result.append(timeIntervalLength);
		result.append(", rampIntervalReg: ");
		result.append(rampIntervalReg);
		result.append(", rampIntervalSpinRes: ");
		result.append(rampIntervalSpinRes);
		result.append(", dst: ");
		result.append(dst);
		result.append(", rampIntervalEnergy: ");
		result.append(rampIntervalEnergy);
		result.append(", localTimeZone: ");
		result.append(localTimeZone);
		result.append(')');
		return result.toString();
	}

} //MarketImpl
