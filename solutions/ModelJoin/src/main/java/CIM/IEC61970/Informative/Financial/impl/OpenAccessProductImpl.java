/**
 */
package CIM.IEC61970.Informative.Financial.impl;

import CIM.IEC61968.Common.impl.AgreementImpl;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.OpenAccessProduct;

import CIM.IEC61970.Informative.Reservation.AncillaryService;
import CIM.IEC61970.Informative.Reservation.ReservationPackage;
import CIM.IEC61970.Informative.Reservation.TransmissionService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Access Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.OpenAccessProductImpl#getProvidedBy_TransmissionService <em>Provided By Transmission Service</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.OpenAccessProductImpl#getAncillaryServices <em>Ancillary Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenAccessProductImpl extends AgreementImpl implements OpenAccessProduct {
	/**
	 * The cached value of the '{@link #getProvidedBy_TransmissionService() <em>Provided By Transmission Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy_TransmissionService()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionService> providedBy_TransmissionService;

	/**
	 * The cached value of the '{@link #getAncillaryServices() <em>Ancillary Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncillaryServices()
	 * @generated
	 * @ordered
	 */
	protected EList<AncillaryService> ancillaryServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenAccessProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.OPEN_ACCESS_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionService> getProvidedBy_TransmissionService() {
		if (providedBy_TransmissionService == null) {
			providedBy_TransmissionService = new EObjectWithInverseResolvingEList<TransmissionService>(TransmissionService.class, this, FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE, ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR);
		}
		return providedBy_TransmissionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AncillaryService> getAncillaryServices() {
		if (ancillaryServices == null) {
			ancillaryServices = new EObjectWithInverseResolvingEList<AncillaryService>(AncillaryService.class, this, FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES, ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT);
		}
		return ancillaryServices;
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
			case FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedBy_TransmissionService()).basicAdd(otherEnd, msgs);
			case FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAncillaryServices()).basicAdd(otherEnd, msgs);
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
			case FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE:
				return ((InternalEList<?>)getProvidedBy_TransmissionService()).basicRemove(otherEnd, msgs);
			case FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES:
				return ((InternalEList<?>)getAncillaryServices()).basicRemove(otherEnd, msgs);
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
			case FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE:
				return getProvidedBy_TransmissionService();
			case FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES:
				return getAncillaryServices();
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
			case FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE:
				getProvidedBy_TransmissionService().clear();
				getProvidedBy_TransmissionService().addAll((Collection<? extends TransmissionService>)newValue);
				return;
			case FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES:
				getAncillaryServices().clear();
				getAncillaryServices().addAll((Collection<? extends AncillaryService>)newValue);
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
			case FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE:
				getProvidedBy_TransmissionService().clear();
				return;
			case FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES:
				getAncillaryServices().clear();
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
			case FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE:
				return providedBy_TransmissionService != null && !providedBy_TransmissionService.isEmpty();
			case FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES:
				return ancillaryServices != null && !ancillaryServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpenAccessProductImpl
