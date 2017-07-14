/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Market;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid;

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
 * An implementation of the model object '<em><b>Bid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl#getMarketType <em>Market Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl#getProductBids <em>Product Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl#getBidClearing <em>Bid Clearing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl#getMarket <em>Market</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BidImpl extends DocumentImpl implements Bid {
	/**
	 * The default value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STOP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected Date stopTime = STOP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarketType() <em>Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketType()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarketType() <em>Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketType()
	 * @generated
	 * @ordered
	 */
	protected String marketType = MARKET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductBids() <em>Product Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductBids()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductBid> productBids;

	/**
	 * The cached value of the '{@link #getBidClearing() <em>Bid Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidClearing()
	 * @generated
	 * @ordered
	 */
	protected BidClearing bidClearing;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarket() <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarket()
	 * @generated
	 * @ordered
	 */
	protected Market market;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.BID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStopTime() {
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopTime(Date newStopTime) {
		Date oldStopTime = stopTime;
		stopTime = newStopTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__STOP_TIME, oldStopTime, stopTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarketType() {
		return marketType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketType(String newMarketType) {
		String oldMarketType = marketType;
		marketType = newMarketType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__MARKET_TYPE, oldMarketType, marketType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductBid> getProductBids() {
		if (productBids == null) {
			productBids = new EObjectWithInverseResolvingEList<ProductBid>(ProductBid.class, this, MarketOperationsPackage.BID__PRODUCT_BIDS, MarketOperationsPackage.PRODUCT_BID__BID);
		}
		return productBids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidClearing getBidClearing() {
		if (bidClearing != null && bidClearing.eIsProxy()) {
			InternalEObject oldBidClearing = (InternalEObject)bidClearing;
			bidClearing = (BidClearing)eResolveProxy(oldBidClearing);
			if (bidClearing != oldBidClearing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.BID__BID_CLEARING, oldBidClearing, bidClearing));
			}
		}
		return bidClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidClearing basicGetBidClearing() {
		return bidClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBidClearing(BidClearing newBidClearing, NotificationChain msgs) {
		BidClearing oldBidClearing = bidClearing;
		bidClearing = newBidClearing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__BID_CLEARING, oldBidClearing, newBidClearing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidClearing(BidClearing newBidClearing) {
		if (newBidClearing != bidClearing) {
			NotificationChain msgs = null;
			if (bidClearing != null)
				msgs = ((InternalEObject)bidClearing).eInverseRemove(this, MarketOperationsPackage.BID_CLEARING__BID, BidClearing.class, msgs);
			if (newBidClearing != null)
				msgs = ((InternalEObject)newBidClearing).eInverseAdd(this, MarketOperationsPackage.BID_CLEARING__BID, BidClearing.class, msgs);
			msgs = basicSetBidClearing(newBidClearing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__BID_CLEARING, newBidClearing, newBidClearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Market getMarket() {
		if (market != null && market.eIsProxy()) {
			InternalEObject oldMarket = (InternalEObject)market;
			market = (Market)eResolveProxy(oldMarket);
			if (market != oldMarket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.BID__MARKET, oldMarket, market));
			}
		}
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Market basicGetMarket() {
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarket(Market newMarket, NotificationChain msgs) {
		Market oldMarket = market;
		market = newMarket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__MARKET, oldMarket, newMarket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarket(Market newMarket) {
		if (newMarket != market) {
			NotificationChain msgs = null;
			if (market != null)
				msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__BIDS, Market.class, msgs);
			if (newMarket != null)
				msgs = ((InternalEObject)newMarket).eInverseAdd(this, MarketOperationsPackage.MARKET__BIDS, Market.class, msgs);
			msgs = basicSetMarket(newMarket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID__MARKET, newMarket, newMarket));
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
			case MarketOperationsPackage.BID__PRODUCT_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductBids()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.BID__BID_CLEARING:
				if (bidClearing != null)
					msgs = ((InternalEObject)bidClearing).eInverseRemove(this, MarketOperationsPackage.BID_CLEARING__BID, BidClearing.class, msgs);
				return basicSetBidClearing((BidClearing)otherEnd, msgs);
			case MarketOperationsPackage.BID__MARKET:
				if (market != null)
					msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__BIDS, Market.class, msgs);
				return basicSetMarket((Market)otherEnd, msgs);
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
			case MarketOperationsPackage.BID__PRODUCT_BIDS:
				return ((InternalEList<?>)getProductBids()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.BID__BID_CLEARING:
				return basicSetBidClearing(null, msgs);
			case MarketOperationsPackage.BID__MARKET:
				return basicSetMarket(null, msgs);
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
			case MarketOperationsPackage.BID__STOP_TIME:
				return getStopTime();
			case MarketOperationsPackage.BID__MARKET_TYPE:
				return getMarketType();
			case MarketOperationsPackage.BID__PRODUCT_BIDS:
				return getProductBids();
			case MarketOperationsPackage.BID__BID_CLEARING:
				if (resolve) return getBidClearing();
				return basicGetBidClearing();
			case MarketOperationsPackage.BID__START_TIME:
				return getStartTime();
			case MarketOperationsPackage.BID__MARKET:
				if (resolve) return getMarket();
				return basicGetMarket();
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
			case MarketOperationsPackage.BID__STOP_TIME:
				setStopTime((Date)newValue);
				return;
			case MarketOperationsPackage.BID__MARKET_TYPE:
				setMarketType((String)newValue);
				return;
			case MarketOperationsPackage.BID__PRODUCT_BIDS:
				getProductBids().clear();
				getProductBids().addAll((Collection<? extends ProductBid>)newValue);
				return;
			case MarketOperationsPackage.BID__BID_CLEARING:
				setBidClearing((BidClearing)newValue);
				return;
			case MarketOperationsPackage.BID__START_TIME:
				setStartTime((Date)newValue);
				return;
			case MarketOperationsPackage.BID__MARKET:
				setMarket((Market)newValue);
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
			case MarketOperationsPackage.BID__STOP_TIME:
				setStopTime(STOP_TIME_EDEFAULT);
				return;
			case MarketOperationsPackage.BID__MARKET_TYPE:
				setMarketType(MARKET_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.BID__PRODUCT_BIDS:
				getProductBids().clear();
				return;
			case MarketOperationsPackage.BID__BID_CLEARING:
				setBidClearing((BidClearing)null);
				return;
			case MarketOperationsPackage.BID__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case MarketOperationsPackage.BID__MARKET:
				setMarket((Market)null);
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
			case MarketOperationsPackage.BID__STOP_TIME:
				return STOP_TIME_EDEFAULT == null ? stopTime != null : !STOP_TIME_EDEFAULT.equals(stopTime);
			case MarketOperationsPackage.BID__MARKET_TYPE:
				return MARKET_TYPE_EDEFAULT == null ? marketType != null : !MARKET_TYPE_EDEFAULT.equals(marketType);
			case MarketOperationsPackage.BID__PRODUCT_BIDS:
				return productBids != null && !productBids.isEmpty();
			case MarketOperationsPackage.BID__BID_CLEARING:
				return bidClearing != null;
			case MarketOperationsPackage.BID__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case MarketOperationsPackage.BID__MARKET:
				return market != null;
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
		result.append(" (stopTime: ");
		result.append(stopTime);
		result.append(", marketType: ");
		result.append(marketType);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} //BidImpl
