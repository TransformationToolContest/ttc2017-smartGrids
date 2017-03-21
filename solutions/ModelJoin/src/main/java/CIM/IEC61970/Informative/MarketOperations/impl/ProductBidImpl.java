/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.MarketOperations.Bid;
import CIM.IEC61970.Informative.MarketOperations.BidPriceCurve;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.MarketProduct;
import CIM.IEC61970.Informative.MarketOperations.ProductBid;
import CIM.IEC61970.Informative.MarketOperations.ProductBidClearing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Bid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl#getBid <em>Bid</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl#getProductBidClearing <em>Product Bid Clearing</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl#getBidPriceCurve <em>Bid Price Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl#getMarketProduct <em>Market Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductBidImpl extends IdentifiedObjectImpl implements ProductBid {
	/**
	 * The cached value of the '{@link #getBid() <em>Bid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid()
	 * @generated
	 * @ordered
	 */
	protected Bid bid;

	/**
	 * The cached value of the '{@link #getProductBidClearing() <em>Product Bid Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductBidClearing()
	 * @generated
	 * @ordered
	 */
	protected ProductBidClearing productBidClearing;

	/**
	 * The cached value of the '{@link #getBidPriceCurve() <em>Bid Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidPriceCurve()
	 * @generated
	 * @ordered
	 */
	protected BidPriceCurve bidPriceCurve;

	/**
	 * The cached value of the '{@link #getMarketProduct() <em>Market Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketProduct()
	 * @generated
	 * @ordered
	 */
	protected MarketProduct marketProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductBidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.PRODUCT_BID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bid getBid() {
		if (bid != null && bid.eIsProxy()) {
			InternalEObject oldBid = (InternalEObject)bid;
			bid = (Bid)eResolveProxy(oldBid);
			if (bid != oldBid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PRODUCT_BID__BID, oldBid, bid));
			}
		}
		return bid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bid basicGetBid() {
		return bid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBid(Bid newBid, NotificationChain msgs) {
		Bid oldBid = bid;
		bid = newBid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__BID, oldBid, newBid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBid(Bid newBid) {
		if (newBid != bid) {
			NotificationChain msgs = null;
			if (bid != null)
				msgs = ((InternalEObject)bid).eInverseRemove(this, MarketOperationsPackage.BID__PRODUCT_BIDS, Bid.class, msgs);
			if (newBid != null)
				msgs = ((InternalEObject)newBid).eInverseAdd(this, MarketOperationsPackage.BID__PRODUCT_BIDS, Bid.class, msgs);
			msgs = basicSetBid(newBid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__BID, newBid, newBid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBidClearing getProductBidClearing() {
		if (productBidClearing != null && productBidClearing.eIsProxy()) {
			InternalEObject oldProductBidClearing = (InternalEObject)productBidClearing;
			productBidClearing = (ProductBidClearing)eResolveProxy(oldProductBidClearing);
			if (productBidClearing != oldProductBidClearing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING, oldProductBidClearing, productBidClearing));
			}
		}
		return productBidClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBidClearing basicGetProductBidClearing() {
		return productBidClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductBidClearing(ProductBidClearing newProductBidClearing, NotificationChain msgs) {
		ProductBidClearing oldProductBidClearing = productBidClearing;
		productBidClearing = newProductBidClearing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING, oldProductBidClearing, newProductBidClearing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductBidClearing(ProductBidClearing newProductBidClearing) {
		if (newProductBidClearing != productBidClearing) {
			NotificationChain msgs = null;
			if (productBidClearing != null)
				msgs = ((InternalEObject)productBidClearing).eInverseRemove(this, MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS, ProductBidClearing.class, msgs);
			if (newProductBidClearing != null)
				msgs = ((InternalEObject)newProductBidClearing).eInverseAdd(this, MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS, ProductBidClearing.class, msgs);
			msgs = basicSetProductBidClearing(newProductBidClearing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING, newProductBidClearing, newProductBidClearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidPriceCurve getBidPriceCurve() {
		if (bidPriceCurve != null && bidPriceCurve.eIsProxy()) {
			InternalEObject oldBidPriceCurve = (InternalEObject)bidPriceCurve;
			bidPriceCurve = (BidPriceCurve)eResolveProxy(oldBidPriceCurve);
			if (bidPriceCurve != oldBidPriceCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE, oldBidPriceCurve, bidPriceCurve));
			}
		}
		return bidPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidPriceCurve basicGetBidPriceCurve() {
		return bidPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBidPriceCurve(BidPriceCurve newBidPriceCurve, NotificationChain msgs) {
		BidPriceCurve oldBidPriceCurve = bidPriceCurve;
		bidPriceCurve = newBidPriceCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE, oldBidPriceCurve, newBidPriceCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidPriceCurve(BidPriceCurve newBidPriceCurve) {
		if (newBidPriceCurve != bidPriceCurve) {
			NotificationChain msgs = null;
			if (bidPriceCurve != null)
				msgs = ((InternalEObject)bidPriceCurve).eInverseRemove(this, MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS, BidPriceCurve.class, msgs);
			if (newBidPriceCurve != null)
				msgs = ((InternalEObject)newBidPriceCurve).eInverseAdd(this, MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS, BidPriceCurve.class, msgs);
			msgs = basicSetBidPriceCurve(newBidPriceCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE, newBidPriceCurve, newBidPriceCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketProduct getMarketProduct() {
		if (marketProduct != null && marketProduct.eIsProxy()) {
			InternalEObject oldMarketProduct = (InternalEObject)marketProduct;
			marketProduct = (MarketProduct)eResolveProxy(oldMarketProduct);
			if (marketProduct != oldMarketProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT, oldMarketProduct, marketProduct));
			}
		}
		return marketProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketProduct basicGetMarketProduct() {
		return marketProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketProduct(MarketProduct newMarketProduct, NotificationChain msgs) {
		MarketProduct oldMarketProduct = marketProduct;
		marketProduct = newMarketProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT, oldMarketProduct, newMarketProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketProduct(MarketProduct newMarketProduct) {
		if (newMarketProduct != marketProduct) {
			NotificationChain msgs = null;
			if (marketProduct != null)
				msgs = ((InternalEObject)marketProduct).eInverseRemove(this, MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS, MarketProduct.class, msgs);
			if (newMarketProduct != null)
				msgs = ((InternalEObject)newMarketProduct).eInverseAdd(this, MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS, MarketProduct.class, msgs);
			msgs = basicSetMarketProduct(newMarketProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT, newMarketProduct, newMarketProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.PRODUCT_BID__BID:
				if (bid != null)
					msgs = ((InternalEObject)bid).eInverseRemove(this, MarketOperationsPackage.BID__PRODUCT_BIDS, Bid.class, msgs);
				return basicSetBid((Bid)otherEnd, msgs);
			case MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING:
				if (productBidClearing != null)
					msgs = ((InternalEObject)productBidClearing).eInverseRemove(this, MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS, ProductBidClearing.class, msgs);
				return basicSetProductBidClearing((ProductBidClearing)otherEnd, msgs);
			case MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE:
				if (bidPriceCurve != null)
					msgs = ((InternalEObject)bidPriceCurve).eInverseRemove(this, MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS, BidPriceCurve.class, msgs);
				return basicSetBidPriceCurve((BidPriceCurve)otherEnd, msgs);
			case MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT:
				if (marketProduct != null)
					msgs = ((InternalEObject)marketProduct).eInverseRemove(this, MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS, MarketProduct.class, msgs);
				return basicSetMarketProduct((MarketProduct)otherEnd, msgs);
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
			case MarketOperationsPackage.PRODUCT_BID__BID:
				return basicSetBid(null, msgs);
			case MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING:
				return basicSetProductBidClearing(null, msgs);
			case MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE:
				return basicSetBidPriceCurve(null, msgs);
			case MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT:
				return basicSetMarketProduct(null, msgs);
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
			case MarketOperationsPackage.PRODUCT_BID__BID:
				if (resolve) return getBid();
				return basicGetBid();
			case MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING:
				if (resolve) return getProductBidClearing();
				return basicGetProductBidClearing();
			case MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE:
				if (resolve) return getBidPriceCurve();
				return basicGetBidPriceCurve();
			case MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT:
				if (resolve) return getMarketProduct();
				return basicGetMarketProduct();
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
			case MarketOperationsPackage.PRODUCT_BID__BID:
				setBid((Bid)newValue);
				return;
			case MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING:
				setProductBidClearing((ProductBidClearing)newValue);
				return;
			case MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE:
				setBidPriceCurve((BidPriceCurve)newValue);
				return;
			case MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT:
				setMarketProduct((MarketProduct)newValue);
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
			case MarketOperationsPackage.PRODUCT_BID__BID:
				setBid((Bid)null);
				return;
			case MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING:
				setProductBidClearing((ProductBidClearing)null);
				return;
			case MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE:
				setBidPriceCurve((BidPriceCurve)null);
				return;
			case MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT:
				setMarketProduct((MarketProduct)null);
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
			case MarketOperationsPackage.PRODUCT_BID__BID:
				return bid != null;
			case MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING:
				return productBidClearing != null;
			case MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE:
				return bidPriceCurve != null;
			case MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT:
				return marketProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductBidImpl
