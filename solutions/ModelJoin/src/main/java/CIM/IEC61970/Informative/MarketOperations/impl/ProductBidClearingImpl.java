/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.ProductBid;
import CIM.IEC61970.Informative.MarketOperations.ProductBidClearing;

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
 * An implementation of the model object '<em><b>Product Bid Clearing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ProductBidClearingImpl#getClearedMW <em>Cleared MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ProductBidClearingImpl#getProductBids <em>Product Bids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductBidClearingImpl extends MarketFactorsImpl implements ProductBidClearing {
	/**
	 * The default value of the '{@link #getClearedMW() <em>Cleared MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearedMW()
	 * @generated
	 * @ordered
	 */
	protected static final float CLEARED_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClearedMW() <em>Cleared MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearedMW()
	 * @generated
	 * @ordered
	 */
	protected float clearedMW = CLEARED_MW_EDEFAULT;

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
	protected ProductBidClearingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.PRODUCT_BID_CLEARING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClearedMW() {
		return clearedMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearedMW(float newClearedMW) {
		float oldClearedMW = clearedMW;
		clearedMW = newClearedMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PRODUCT_BID_CLEARING__CLEARED_MW, oldClearedMW, clearedMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductBid> getProductBids() {
		if (productBids == null) {
			productBids = new EObjectWithInverseResolvingEList<ProductBid>(ProductBid.class, this, MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS, MarketOperationsPackage.PRODUCT_BID__PRODUCT_BID_CLEARING);
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
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS:
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
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS:
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
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__CLEARED_MW:
				return getClearedMW();
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS:
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
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__CLEARED_MW:
				setClearedMW((Float)newValue);
				return;
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS:
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
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__CLEARED_MW:
				setClearedMW(CLEARED_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS:
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
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__CLEARED_MW:
				return clearedMW != CLEARED_MW_EDEFAULT;
			case MarketOperationsPackage.PRODUCT_BID_CLEARING__PRODUCT_BIDS:
				return productBids != null && !productBids.isEmpty();
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
		result.append(" (clearedMW: ");
		result.append(clearedMW);
		result.append(')');
		return result.toString();
	}

} //ProductBidClearingImpl
