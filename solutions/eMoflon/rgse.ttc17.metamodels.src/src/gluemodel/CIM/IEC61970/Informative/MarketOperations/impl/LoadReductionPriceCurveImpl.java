/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Reduction Price Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadReductionPriceCurveImpl#getLoadBids <em>Load Bids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadReductionPriceCurveImpl extends CurveImpl implements LoadReductionPriceCurve {
	/**
	 * The cached value of the '{@link #getLoadBids() <em>Load Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBids()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadBid> loadBids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadReductionPriceCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.LOAD_REDUCTION_PRICE_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBid> getLoadBids() {
		if (loadBids == null) {
			loadBids = new EObjectWithInverseResolvingEList<LoadBid>(LoadBid.class, this, MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS, MarketOperationsPackage.LOAD_BID__LOAD_REDUCTION_PRICE_CURVE);
		}
		return loadBids;
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
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadBids()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS:
				return ((InternalEList<?>)getLoadBids()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS:
				return getLoadBids();
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
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS:
				getLoadBids().clear();
				getLoadBids().addAll((Collection<? extends LoadBid>)newValue);
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
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS:
				getLoadBids().clear();
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
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS:
				return loadBids != null && !loadBids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadReductionPriceCurveImpl
