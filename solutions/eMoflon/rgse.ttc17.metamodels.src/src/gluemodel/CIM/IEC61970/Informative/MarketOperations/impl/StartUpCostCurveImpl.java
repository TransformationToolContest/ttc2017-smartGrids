/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Up Cost Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpCostCurveImpl#getGeneratingBids <em>Generating Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpCostCurveImpl#getRegisteredGenerators <em>Registered Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartUpCostCurveImpl extends CurveImpl implements StartUpCostCurve {
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
	 * The cached value of the '{@link #getRegisteredGenerators() <em>Registered Generators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredGenerator> registeredGenerators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartUpCostCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.START_UP_COST_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratingBid> getGeneratingBids() {
		if (generatingBids == null) {
			generatingBids = new EObjectWithInverseResolvingEList<GeneratingBid>(GeneratingBid.class, this, MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS, MarketOperationsPackage.GENERATING_BID__START_UP_COST_CURVE);
		}
		return generatingBids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredGenerator> getRegisteredGenerators() {
		if (registeredGenerators == null) {
			registeredGenerators = new EObjectWithInverseResolvingEList.ManyInverse<RegisteredGenerator>(RegisteredGenerator.class, this, MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS, MarketOperationsPackage.REGISTERED_GENERATOR__START_UP_COST_CURVES);
		}
		return registeredGenerators;
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
			case MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratingBids()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisteredGenerators()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS:
				return ((InternalEList<?>)getGeneratingBids()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS:
				return ((InternalEList<?>)getRegisteredGenerators()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS:
				return getGeneratingBids();
			case MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS:
				return getRegisteredGenerators();
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
			case MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS:
				getGeneratingBids().clear();
				getGeneratingBids().addAll((Collection<? extends GeneratingBid>)newValue);
				return;
			case MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS:
				getRegisteredGenerators().clear();
				getRegisteredGenerators().addAll((Collection<? extends RegisteredGenerator>)newValue);
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
			case MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS:
				getGeneratingBids().clear();
				return;
			case MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS:
				getRegisteredGenerators().clear();
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
			case MarketOperationsPackage.START_UP_COST_CURVE__GENERATING_BIDS:
				return generatingBids != null && !generatingBids.isEmpty();
			case MarketOperationsPackage.START_UP_COST_CURVE__REGISTERED_GENERATORS:
				return registeredGenerators != null && !registeredGenerators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StartUpCostCurveImpl
