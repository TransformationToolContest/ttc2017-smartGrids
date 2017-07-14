/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial.impl;

import gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl#getServicePoint <em>Service Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl#getGeneratingUnits <em>Generating Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl#getEnergyProducts <em>Energy Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationProviderImpl extends ErpOrganisationImpl implements GenerationProvider {
	/**
	 * The cached value of the '{@link #getServicePoint() <em>Service Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicePoint> servicePoint;

	/**
	 * The cached value of the '{@link #getGeneratingUnits() <em>Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratingUnit> generatingUnits;

	/**
	 * The cached value of the '{@link #getEnergyProducts() <em>Energy Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProduct> energyProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.GENERATION_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServicePoint> getServicePoint() {
		if (servicePoint == null) {
			servicePoint = new EObjectWithInverseResolvingEList<ServicePoint>(ServicePoint.class, this, FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT, ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER);
		}
		return servicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratingUnit> getGeneratingUnits() {
		if (generatingUnits == null) {
			generatingUnits = new EObjectWithInverseResolvingEList<GeneratingUnit>(GeneratingUnit.class, this, FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS, ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER);
		}
		return generatingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyProduct> getEnergyProducts() {
		if (energyProducts == null) {
			energyProducts = new EObjectWithInverseResolvingEList<EnergyProduct>(EnergyProduct.class, this, FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS, EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER);
		}
		return energyProducts;
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
			case FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicePoint()).basicAdd(otherEnd, msgs);
			case FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratingUnits()).basicAdd(otherEnd, msgs);
			case FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyProducts()).basicAdd(otherEnd, msgs);
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
			case FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT:
				return ((InternalEList<?>)getServicePoint()).basicRemove(otherEnd, msgs);
			case FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS:
				return ((InternalEList<?>)getGeneratingUnits()).basicRemove(otherEnd, msgs);
			case FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS:
				return ((InternalEList<?>)getEnergyProducts()).basicRemove(otherEnd, msgs);
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
			case FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT:
				return getServicePoint();
			case FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS:
				return getGeneratingUnits();
			case FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS:
				return getEnergyProducts();
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
			case FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT:
				getServicePoint().clear();
				getServicePoint().addAll((Collection<? extends ServicePoint>)newValue);
				return;
			case FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS:
				getGeneratingUnits().clear();
				getGeneratingUnits().addAll((Collection<? extends GeneratingUnit>)newValue);
				return;
			case FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS:
				getEnergyProducts().clear();
				getEnergyProducts().addAll((Collection<? extends EnergyProduct>)newValue);
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
			case FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT:
				getServicePoint().clear();
				return;
			case FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS:
				getGeneratingUnits().clear();
				return;
			case FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS:
				getEnergyProducts().clear();
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
			case FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT:
				return servicePoint != null && !servicePoint.isEmpty();
			case FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS:
				return generatingUnits != null && !generatingUnits.isEmpty();
			case FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS:
				return energyProducts != null && !energyProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenerationProviderImpl
