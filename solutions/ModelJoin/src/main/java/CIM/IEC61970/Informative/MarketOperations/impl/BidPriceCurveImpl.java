/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Informative.MarketOperations.BidPriceCurve;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.ProductBid;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bid Price Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BidPriceCurveImpl#getProductBids <em>Product Bids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BidPriceCurveImpl extends CurveImpl implements BidPriceCurve {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BidPriceCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.BID_PRICE_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductBid> getProductBids() {
		if (productBids == null) {
			productBids = new EObjectWithInverseResolvingEList<ProductBid>(ProductBid.class, this, MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS, MarketOperationsPackage.PRODUCT_BID__BID_PRICE_CURVE);
		}
		return productBids;
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
			case MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductBids()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS:
				return ((InternalEList<?>)getProductBids()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS:
				return getProductBids();
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
			case MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS:
				getProductBids().clear();
				getProductBids().addAll((Collection<? extends ProductBid>)newValue);
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
			case MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS:
				getProductBids().clear();
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
			case MarketOperationsPackage.BID_PRICE_CURVE__PRODUCT_BIDS:
				return productBids != null && !productBids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BidPriceCurveImpl
