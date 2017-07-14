/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.LossProfile;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService;
import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation;
import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getServicePoint <em>Service Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getAncillaryServices <em>Ancillary Services</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getFor <em>For</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getOfferedBy <em>Offered By</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getSoldBy <em>Sold By</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl#getTransmissionProducts <em>Transmission Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionProviderImpl extends ErpOrganisationImpl implements TransmissionProvider {
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
	 * The cached value of the '{@link #getAncillaryServices() <em>Ancillary Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncillaryServices()
	 * @generated
	 * @ordered
	 */
	protected EList<AncillaryService> ancillaryServices;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected EList<LossProfile> for_;

	/**
	 * The cached value of the '{@link #getOfferedBy() <em>Offered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionService> offeredBy;

	/**
	 * The cached value of the '{@link #getFlowgate() <em>Flowgate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgate()
	 * @generated
	 * @ordered
	 */
	protected EList<Flowgate> flowgate;

	/**
	 * The cached value of the '{@link #getSoldBy() <em>Sold By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceReservation> soldBy;

	/**
	 * The cached value of the '{@link #getTransmissionProducts() <em>Transmission Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionProduct> transmissionProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.TRANSMISSION_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServicePoint> getServicePoint() {
		if (servicePoint == null) {
			servicePoint = new EObjectWithInverseResolvingEList<ServicePoint>(ServicePoint.class, this, FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT, ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER);
		}
		return servicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AncillaryService> getAncillaryServices() {
		if (ancillaryServices == null) {
			ancillaryServices = new EObjectWithInverseResolvingEList.ManyInverse<AncillaryService>(AncillaryService.class, this, FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES, ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS);
		}
		return ancillaryServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LossProfile> getFor() {
		if (for_ == null) {
			for_ = new EObjectWithInverseResolvingEList<LossProfile>(LossProfile.class, this, FinancialPackage.TRANSMISSION_PROVIDER__FOR, EnergySchedulingPackage.LOSS_PROFILE__HAS_LOSS_);
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionService> getOfferedBy() {
		if (offeredBy == null) {
			offeredBy = new EObjectWithInverseResolvingEList<TransmissionService>(TransmissionService.class, this, FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY, ReservationPackage.TRANSMISSION_SERVICE__OFFERS);
		}
		return offeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flowgate> getFlowgate() {
		if (flowgate == null) {
			flowgate = new EObjectWithInverseResolvingEList.ManyInverse<Flowgate>(Flowgate.class, this, FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE, MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER);
		}
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceReservation> getSoldBy() {
		if (soldBy == null) {
			soldBy = new EObjectWithInverseResolvingEList<ServiceReservation>(ServiceReservation.class, this, FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY, ReservationPackage.SERVICE_RESERVATION__SELLS);
		}
		return soldBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionProduct> getTransmissionProducts() {
		if (transmissionProducts == null) {
			transmissionProducts = new EObjectWithInverseResolvingEList<TransmissionProduct>(TransmissionProduct.class, this, FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS, FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER);
		}
		return transmissionProducts;
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
			case FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicePoint()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAncillaryServices()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFor()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfferedBy()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowgate()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSoldBy()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransmissionProducts()).basicAdd(otherEnd, msgs);
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
			case FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT:
				return ((InternalEList<?>)getServicePoint()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES:
				return ((InternalEList<?>)getAncillaryServices()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__FOR:
				return ((InternalEList<?>)getFor()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY:
				return ((InternalEList<?>)getOfferedBy()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE:
				return ((InternalEList<?>)getFlowgate()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY:
				return ((InternalEList<?>)getSoldBy()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS:
				return ((InternalEList<?>)getTransmissionProducts()).basicRemove(otherEnd, msgs);
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
			case FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT:
				return getServicePoint();
			case FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES:
				return getAncillaryServices();
			case FinancialPackage.TRANSMISSION_PROVIDER__FOR:
				return getFor();
			case FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY:
				return getOfferedBy();
			case FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE:
				return getFlowgate();
			case FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY:
				return getSoldBy();
			case FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS:
				return getTransmissionProducts();
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
			case FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT:
				getServicePoint().clear();
				getServicePoint().addAll((Collection<? extends ServicePoint>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES:
				getAncillaryServices().clear();
				getAncillaryServices().addAll((Collection<? extends AncillaryService>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__FOR:
				getFor().clear();
				getFor().addAll((Collection<? extends LossProfile>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY:
				getOfferedBy().clear();
				getOfferedBy().addAll((Collection<? extends TransmissionService>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE:
				getFlowgate().clear();
				getFlowgate().addAll((Collection<? extends Flowgate>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY:
				getSoldBy().clear();
				getSoldBy().addAll((Collection<? extends ServiceReservation>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS:
				getTransmissionProducts().clear();
				getTransmissionProducts().addAll((Collection<? extends TransmissionProduct>)newValue);
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
			case FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT:
				getServicePoint().clear();
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES:
				getAncillaryServices().clear();
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__FOR:
				getFor().clear();
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY:
				getOfferedBy().clear();
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE:
				getFlowgate().clear();
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY:
				getSoldBy().clear();
				return;
			case FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS:
				getTransmissionProducts().clear();
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
			case FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT:
				return servicePoint != null && !servicePoint.isEmpty();
			case FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES:
				return ancillaryServices != null && !ancillaryServices.isEmpty();
			case FinancialPackage.TRANSMISSION_PROVIDER__FOR:
				return for_ != null && !for_.isEmpty();
			case FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY:
				return offeredBy != null && !offeredBy.isEmpty();
			case FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE:
				return flowgate != null && !flowgate.isEmpty();
			case FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY:
				return soldBy != null && !soldBy.isEmpty();
			case FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS:
				return transmissionProducts != null && !transmissionProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransmissionProviderImpl
