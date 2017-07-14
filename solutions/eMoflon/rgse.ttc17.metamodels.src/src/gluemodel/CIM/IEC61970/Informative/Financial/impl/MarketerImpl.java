/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.Marketer;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation;

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
 * An implementation of the model object '<em><b>Marketer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.MarketerImpl#getResells_EnergyProduct <em>Resells Energy Product</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.MarketerImpl#getHeldBy <em>Held By</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.MarketerImpl#getHoldsTitleTo_EnergyProducts <em>Holds Title To Energy Products</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.MarketerImpl#getResoldBy <em>Resold By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketerImpl extends ErpOrganisationImpl implements Marketer {
	/**
	 * The cached value of the '{@link #getResells_EnergyProduct() <em>Resells Energy Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResells_EnergyProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProduct> resells_EnergyProduct;

	/**
	 * The cached value of the '{@link #getHeldBy() <em>Held By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceReservation> heldBy;

	/**
	 * The cached value of the '{@link #getHoldsTitleTo_EnergyProducts() <em>Holds Title To Energy Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldsTitleTo_EnergyProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProduct> holdsTitleTo_EnergyProducts;

	/**
	 * The cached value of the '{@link #getResoldBy() <em>Resold By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResoldBy()
	 * @generated
	 * @ordered
	 */
	protected ServiceReservation resoldBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.MARKETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyProduct> getResells_EnergyProduct() {
		if (resells_EnergyProduct == null) {
			resells_EnergyProduct = new EObjectWithInverseResolvingEList.ManyInverse<EnergyProduct>(EnergyProduct.class, this, FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT, EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS);
		}
		return resells_EnergyProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceReservation> getHeldBy() {
		if (heldBy == null) {
			heldBy = new EObjectWithInverseResolvingEList<ServiceReservation>(ServiceReservation.class, this, FinancialPackage.MARKETER__HELD_BY, ReservationPackage.SERVICE_RESERVATION__HOLDS);
		}
		return heldBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyProduct> getHoldsTitleTo_EnergyProducts() {
		if (holdsTitleTo_EnergyProducts == null) {
			holdsTitleTo_EnergyProducts = new EObjectWithInverseResolvingEList<EnergyProduct>(EnergyProduct.class, this, FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS, EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER);
		}
		return holdsTitleTo_EnergyProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReservation getResoldBy() {
		if (resoldBy != null && resoldBy.eIsProxy()) {
			InternalEObject oldResoldBy = (InternalEObject)resoldBy;
			resoldBy = (ServiceReservation)eResolveProxy(oldResoldBy);
			if (resoldBy != oldResoldBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancialPackage.MARKETER__RESOLD_BY, oldResoldBy, resoldBy));
			}
		}
		return resoldBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReservation basicGetResoldBy() {
		return resoldBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResoldBy(ServiceReservation newResoldBy, NotificationChain msgs) {
		ServiceReservation oldResoldBy = resoldBy;
		resoldBy = newResoldBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinancialPackage.MARKETER__RESOLD_BY, oldResoldBy, newResoldBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResoldBy(ServiceReservation newResoldBy) {
		if (newResoldBy != resoldBy) {
			NotificationChain msgs = null;
			if (resoldBy != null)
				msgs = ((InternalEObject)resoldBy).eInverseRemove(this, ReservationPackage.SERVICE_RESERVATION__RESELLS, ServiceReservation.class, msgs);
			if (newResoldBy != null)
				msgs = ((InternalEObject)newResoldBy).eInverseAdd(this, ReservationPackage.SERVICE_RESERVATION__RESELLS, ServiceReservation.class, msgs);
			msgs = basicSetResoldBy(newResoldBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancialPackage.MARKETER__RESOLD_BY, newResoldBy, newResoldBy));
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
			case FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResells_EnergyProduct()).basicAdd(otherEnd, msgs);
			case FinancialPackage.MARKETER__HELD_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldBy()).basicAdd(otherEnd, msgs);
			case FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHoldsTitleTo_EnergyProducts()).basicAdd(otherEnd, msgs);
			case FinancialPackage.MARKETER__RESOLD_BY:
				if (resoldBy != null)
					msgs = ((InternalEObject)resoldBy).eInverseRemove(this, ReservationPackage.SERVICE_RESERVATION__RESELLS, ServiceReservation.class, msgs);
				return basicSetResoldBy((ServiceReservation)otherEnd, msgs);
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
			case FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT:
				return ((InternalEList<?>)getResells_EnergyProduct()).basicRemove(otherEnd, msgs);
			case FinancialPackage.MARKETER__HELD_BY:
				return ((InternalEList<?>)getHeldBy()).basicRemove(otherEnd, msgs);
			case FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS:
				return ((InternalEList<?>)getHoldsTitleTo_EnergyProducts()).basicRemove(otherEnd, msgs);
			case FinancialPackage.MARKETER__RESOLD_BY:
				return basicSetResoldBy(null, msgs);
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
			case FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT:
				return getResells_EnergyProduct();
			case FinancialPackage.MARKETER__HELD_BY:
				return getHeldBy();
			case FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS:
				return getHoldsTitleTo_EnergyProducts();
			case FinancialPackage.MARKETER__RESOLD_BY:
				if (resolve) return getResoldBy();
				return basicGetResoldBy();
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
			case FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT:
				getResells_EnergyProduct().clear();
				getResells_EnergyProduct().addAll((Collection<? extends EnergyProduct>)newValue);
				return;
			case FinancialPackage.MARKETER__HELD_BY:
				getHeldBy().clear();
				getHeldBy().addAll((Collection<? extends ServiceReservation>)newValue);
				return;
			case FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS:
				getHoldsTitleTo_EnergyProducts().clear();
				getHoldsTitleTo_EnergyProducts().addAll((Collection<? extends EnergyProduct>)newValue);
				return;
			case FinancialPackage.MARKETER__RESOLD_BY:
				setResoldBy((ServiceReservation)newValue);
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
			case FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT:
				getResells_EnergyProduct().clear();
				return;
			case FinancialPackage.MARKETER__HELD_BY:
				getHeldBy().clear();
				return;
			case FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS:
				getHoldsTitleTo_EnergyProducts().clear();
				return;
			case FinancialPackage.MARKETER__RESOLD_BY:
				setResoldBy((ServiceReservation)null);
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
			case FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT:
				return resells_EnergyProduct != null && !resells_EnergyProduct.isEmpty();
			case FinancialPackage.MARKETER__HELD_BY:
				return heldBy != null && !heldBy.isEmpty();
			case FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS:
				return holdsTitleTo_EnergyProducts != null && !holdsTitleTo_EnergyProducts.isEmpty();
			case FinancialPackage.MARKETER__RESOLD_BY:
				return resoldBy != null;
		}
		return super.eIsSet(featureID);
	}

} //MarketerImpl
