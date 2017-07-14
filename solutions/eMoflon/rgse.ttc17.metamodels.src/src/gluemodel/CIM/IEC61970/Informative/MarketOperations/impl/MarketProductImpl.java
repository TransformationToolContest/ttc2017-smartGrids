/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Market;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq;

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
 * An implementation of the model object '<em><b>Market Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl#getProductBids <em>Product Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl#getMarket <em>Market</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl#getReserveReqs <em>Reserve Reqs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl#getRegisteredResources <em>Registered Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketProductImpl extends IdentifiedObjectImpl implements MarketProduct {
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
	 * The cached value of the '{@link #getMarket() <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarket()
	 * @generated
	 * @ordered
	 */
	protected Market market;

	/**
	 * The cached value of the '{@link #getReserveReqs() <em>Reserve Reqs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveReqs()
	 * @generated
	 * @ordered
	 */
	protected EList<ReserveReq> reserveReqs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MARKET_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductBid> getProductBids() {
		if (productBids == null) {
			productBids = new EObjectWithInverseResolvingEList<ProductBid>(ProductBid.class, this, MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS, MarketOperationsPackage.PRODUCT_BID__MARKET_PRODUCT);
		}
		return productBids;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MARKET_PRODUCT__MARKET, oldMarket, market));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_PRODUCT__MARKET, oldMarket, newMarket);
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
				msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__MARKET_PRODUCTS, Market.class, msgs);
			if (newMarket != null)
				msgs = ((InternalEObject)newMarket).eInverseAdd(this, MarketOperationsPackage.MARKET__MARKET_PRODUCTS, Market.class, msgs);
			msgs = basicSetMarket(newMarket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_PRODUCT__MARKET, newMarket, newMarket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReserveReq> getReserveReqs() {
		if (reserveReqs == null) {
			reserveReqs = new EObjectWithInverseResolvingEList<ReserveReq>(ReserveReq.class, this, MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS, MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT);
		}
		return reserveReqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredResource> getRegisteredResources() {
		if (registeredResources == null) {
			registeredResources = new EObjectWithInverseResolvingEList.ManyInverse<RegisteredResource>(RegisteredResource.class, this, MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES, MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS);
		}
		return registeredResources;
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
			case MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductBids()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_PRODUCT__MARKET:
				if (market != null)
					msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__MARKET_PRODUCTS, Market.class, msgs);
				return basicSetMarket((Market)otherEnd, msgs);
			case MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReserveReqs()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES:
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
			case MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS:
				return ((InternalEList<?>)getProductBids()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_PRODUCT__MARKET:
				return basicSetMarket(null, msgs);
			case MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS:
				return ((InternalEList<?>)getReserveReqs()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES:
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
			case MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS:
				return getProductBids();
			case MarketOperationsPackage.MARKET_PRODUCT__MARKET:
				if (resolve) return getMarket();
				return basicGetMarket();
			case MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS:
				return getReserveReqs();
			case MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES:
				return getRegisteredResources();
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
			case MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS:
				getProductBids().clear();
				getProductBids().addAll((Collection<? extends ProductBid>)newValue);
				return;
			case MarketOperationsPackage.MARKET_PRODUCT__MARKET:
				setMarket((Market)newValue);
				return;
			case MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS:
				getReserveReqs().clear();
				getReserveReqs().addAll((Collection<? extends ReserveReq>)newValue);
				return;
			case MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				getRegisteredResources().addAll((Collection<? extends RegisteredResource>)newValue);
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
			case MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS:
				getProductBids().clear();
				return;
			case MarketOperationsPackage.MARKET_PRODUCT__MARKET:
				setMarket((Market)null);
				return;
			case MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS:
				getReserveReqs().clear();
				return;
			case MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
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
			case MarketOperationsPackage.MARKET_PRODUCT__PRODUCT_BIDS:
				return productBids != null && !productBids.isEmpty();
			case MarketOperationsPackage.MARKET_PRODUCT__MARKET:
				return market != null;
			case MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS:
				return reserveReqs != null && !reserveReqs.isEmpty();
			case MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES:
				return registeredResources != null && !registeredResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MarketProductImpl
