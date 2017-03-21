/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction;

import CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve;
import CIM.IEC61970.Informative.MarketOperations.FTR;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Price Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.EnergyPriceCurveImpl#getFTRs <em>FT Rs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.EnergyPriceCurveImpl#getEnergyTransactions <em>Energy Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyPriceCurveImpl extends CurveImpl implements EnergyPriceCurve {
	/**
	 * The cached value of the '{@link #getFTRs() <em>FT Rs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTRs()
	 * @generated
	 * @ordered
	 */
	protected EList<FTR> ftRs;

	/**
	 * The cached value of the '{@link #getEnergyTransactions() <em>Energy Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyTransaction> energyTransactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyPriceCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.ENERGY_PRICE_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTR> getFTRs() {
		if (ftRs == null) {
			ftRs = new EObjectWithInverseResolvingEList<FTR>(FTR.class, this, MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS, MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE);
		}
		return ftRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyTransaction> getEnergyTransactions() {
		if (energyTransactions == null) {
			energyTransactions = new EObjectWithInverseResolvingEList.ManyInverse<EnergyTransaction>(EnergyTransaction.class, this, MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES);
		}
		return energyTransactions;
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
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFTRs()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyTransactions()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS:
				return ((InternalEList<?>)getFTRs()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS:
				return ((InternalEList<?>)getEnergyTransactions()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS:
				return getFTRs();
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS:
				return getEnergyTransactions();
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
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS:
				getFTRs().clear();
				getFTRs().addAll((Collection<? extends FTR>)newValue);
				return;
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS:
				getEnergyTransactions().clear();
				getEnergyTransactions().addAll((Collection<? extends EnergyTransaction>)newValue);
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
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS:
				getFTRs().clear();
				return;
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS:
				getEnergyTransactions().clear();
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
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS:
				return ftRs != null && !ftRs.isEmpty();
			case MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS:
				return energyTransactions != null && !energyTransactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnergyPriceCurveImpl
