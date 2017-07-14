/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation;
import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath;
import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService;

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
 * An implementation of the model object '<em><b>Transmission Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl#getOffering <em>Offering</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl#getOfferedAs <em>Offered As</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl#getScheduledBy <em>Scheduled By</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl#getTransContractFor <em>Trans Contract For</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionServiceImpl extends IdentifiedObjectImpl implements TransmissionService {
	/**
	 * The cached value of the '{@link #getOffering() <em>Offering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffering()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionPath> offering;

	/**
	 * The cached value of the '{@link #getOfferedAs() <em>Offered As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedAs()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionProduct> offeredAs;

	/**
	 * The cached value of the '{@link #getScheduledBy() <em>Scheduled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailableTransmissionCapacity> scheduledBy;

	/**
	 * The cached value of the '{@link #getReservedBy_ServiceReservation() <em>Reserved By Service Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBy_ServiceReservation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceReservation> reservedBy_ServiceReservation;

	/**
	 * The cached value of the '{@link #getTransContractFor() <em>Trans Contract For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransContractFor()
	 * @generated
	 * @ordered
	 */
	protected OpenAccessProduct transContractFor;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected TransmissionProvider offers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.TRANSMISSION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionPath> getOffering() {
		if (offering == null) {
			offering = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionPath>(TransmissionPath.class, this, ReservationPackage.TRANSMISSION_SERVICE__OFFERING, ReservationPackage.TRANSMISSION_PATH__OFFERED_ON);
		}
		return offering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionProduct> getOfferedAs() {
		if (offeredAs == null) {
			offeredAs = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionProduct>(TransmissionProduct.class, this, ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS, FinancialPackage.TRANSMISSION_PRODUCT__OFFERS);
		}
		return offeredAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvailableTransmissionCapacity> getScheduledBy() {
		if (scheduledBy == null) {
			scheduledBy = new EObjectWithInverseResolvingEList.ManyInverse<AvailableTransmissionCapacity>(AvailableTransmissionCapacity.class, this, ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY, EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR);
		}
		return scheduledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceReservation> getReservedBy_ServiceReservation() {
		if (reservedBy_ServiceReservation == null) {
			reservedBy_ServiceReservation = new EObjectWithInverseResolvingEList.ManyInverse<ServiceReservation>(ServiceReservation.class, this, ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION, ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE);
		}
		return reservedBy_ServiceReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAccessProduct getTransContractFor() {
		if (transContractFor != null && transContractFor.eIsProxy()) {
			InternalEObject oldTransContractFor = (InternalEObject)transContractFor;
			transContractFor = (OpenAccessProduct)eResolveProxy(oldTransContractFor);
			if (transContractFor != oldTransContractFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR, oldTransContractFor, transContractFor));
			}
		}
		return transContractFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAccessProduct basicGetTransContractFor() {
		return transContractFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransContractFor(OpenAccessProduct newTransContractFor, NotificationChain msgs) {
		OpenAccessProduct oldTransContractFor = transContractFor;
		transContractFor = newTransContractFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR, oldTransContractFor, newTransContractFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransContractFor(OpenAccessProduct newTransContractFor) {
		if (newTransContractFor != transContractFor) {
			NotificationChain msgs = null;
			if (transContractFor != null)
				msgs = ((InternalEObject)transContractFor).eInverseRemove(this, FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE, OpenAccessProduct.class, msgs);
			if (newTransContractFor != null)
				msgs = ((InternalEObject)newTransContractFor).eInverseAdd(this, FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE, OpenAccessProduct.class, msgs);
			msgs = basicSetTransContractFor(newTransContractFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR, newTransContractFor, newTransContractFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider getOffers() {
		if (offers != null && offers.eIsProxy()) {
			InternalEObject oldOffers = (InternalEObject)offers;
			offers = (TransmissionProvider)eResolveProxy(oldOffers);
			if (offers != oldOffers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.TRANSMISSION_SERVICE__OFFERS, oldOffers, offers));
			}
		}
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider basicGetOffers() {
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffers(TransmissionProvider newOffers, NotificationChain msgs) {
		TransmissionProvider oldOffers = offers;
		offers = newOffers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_SERVICE__OFFERS, oldOffers, newOffers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffers(TransmissionProvider newOffers) {
		if (newOffers != offers) {
			NotificationChain msgs = null;
			if (offers != null)
				msgs = ((InternalEObject)offers).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY, TransmissionProvider.class, msgs);
			if (newOffers != null)
				msgs = ((InternalEObject)newOffers).eInverseAdd(this, FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY, TransmissionProvider.class, msgs);
			msgs = basicSetOffers(newOffers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_SERVICE__OFFERS, newOffers, newOffers));
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
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffering()).basicAdd(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfferedAs()).basicAdd(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledBy()).basicAdd(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReservedBy_ServiceReservation()).basicAdd(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR:
				if (transContractFor != null)
					msgs = ((InternalEObject)transContractFor).eInverseRemove(this, FinancialPackage.OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE, OpenAccessProduct.class, msgs);
				return basicSetTransContractFor((OpenAccessProduct)otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERS:
				if (offers != null)
					msgs = ((InternalEObject)offers).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__OFFERED_BY, TransmissionProvider.class, msgs);
				return basicSetOffers((TransmissionProvider)otherEnd, msgs);
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
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERING:
				return ((InternalEList<?>)getOffering()).basicRemove(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS:
				return ((InternalEList<?>)getOfferedAs()).basicRemove(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY:
				return ((InternalEList<?>)getScheduledBy()).basicRemove(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				return ((InternalEList<?>)getReservedBy_ServiceReservation()).basicRemove(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR:
				return basicSetTransContractFor(null, msgs);
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERS:
				return basicSetOffers(null, msgs);
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
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERING:
				return getOffering();
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS:
				return getOfferedAs();
			case ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY:
				return getScheduledBy();
			case ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				return getReservedBy_ServiceReservation();
			case ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR:
				if (resolve) return getTransContractFor();
				return basicGetTransContractFor();
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERS:
				if (resolve) return getOffers();
				return basicGetOffers();
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
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERING:
				getOffering().clear();
				getOffering().addAll((Collection<? extends TransmissionPath>)newValue);
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS:
				getOfferedAs().clear();
				getOfferedAs().addAll((Collection<? extends TransmissionProduct>)newValue);
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY:
				getScheduledBy().clear();
				getScheduledBy().addAll((Collection<? extends AvailableTransmissionCapacity>)newValue);
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				getReservedBy_ServiceReservation().clear();
				getReservedBy_ServiceReservation().addAll((Collection<? extends ServiceReservation>)newValue);
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR:
				setTransContractFor((OpenAccessProduct)newValue);
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERS:
				setOffers((TransmissionProvider)newValue);
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
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERING:
				getOffering().clear();
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS:
				getOfferedAs().clear();
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY:
				getScheduledBy().clear();
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				getReservedBy_ServiceReservation().clear();
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR:
				setTransContractFor((OpenAccessProduct)null);
				return;
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERS:
				setOffers((TransmissionProvider)null);
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
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERING:
				return offering != null && !offering.isEmpty();
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS:
				return offeredAs != null && !offeredAs.isEmpty();
			case ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY:
				return scheduledBy != null && !scheduledBy.isEmpty();
			case ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				return reservedBy_ServiceReservation != null && !reservedBy_ServiceReservation.isEmpty();
			case ReservationPackage.TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR:
				return transContractFor != null;
			case ReservationPackage.TRANSMISSION_SERVICE__OFFERS:
				return offers != null;
		}
		return super.eIsSet(featureID);
	}

} //TransmissionServiceImpl
