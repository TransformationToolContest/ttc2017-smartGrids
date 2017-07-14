/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.impl;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.Marketer;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService;
import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation;
import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService;

import gluemodel.CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Service Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl#getHolds <em>Holds</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl#getReserves_TransmissionService <em>Reserves Transmission Service</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl#getReserves_AncillaryServices <em>Reserves Ancillary Services</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl#getResells <em>Resells</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl#getSells <em>Sells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceReservationImpl extends ElementImpl implements ServiceReservation {
	/**
	 * The cached value of the '{@link #getHolds() <em>Holds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolds()
	 * @generated
	 * @ordered
	 */
	protected Marketer holds;

	/**
	 * The cached value of the '{@link #getReserves_TransmissionService() <em>Reserves Transmission Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserves_TransmissionService()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionService> reserves_TransmissionService;

	/**
	 * The cached value of the '{@link #getReserves_AncillaryServices() <em>Reserves Ancillary Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserves_AncillaryServices()
	 * @generated
	 * @ordered
	 */
	protected EList<AncillaryService> reserves_AncillaryServices;

	/**
	 * The cached value of the '{@link #getResells() <em>Resells</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResells()
	 * @generated
	 * @ordered
	 */
	protected Marketer resells;

	/**
	 * The cached value of the '{@link #getSells() <em>Sells</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSells()
	 * @generated
	 * @ordered
	 */
	protected TransmissionProvider sells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.SERVICE_RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer getHolds() {
		if (holds != null && holds.eIsProxy()) {
			InternalEObject oldHolds = (InternalEObject)holds;
			holds = (Marketer)eResolveProxy(oldHolds);
			if (holds != oldHolds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_RESERVATION__HOLDS, oldHolds, holds));
			}
		}
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer basicGetHolds() {
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolds(Marketer newHolds, NotificationChain msgs) {
		Marketer oldHolds = holds;
		holds = newHolds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_RESERVATION__HOLDS, oldHolds, newHolds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolds(Marketer newHolds) {
		if (newHolds != holds) {
			NotificationChain msgs = null;
			if (holds != null)
				msgs = ((InternalEObject)holds).eInverseRemove(this, FinancialPackage.MARKETER__HELD_BY, Marketer.class, msgs);
			if (newHolds != null)
				msgs = ((InternalEObject)newHolds).eInverseAdd(this, FinancialPackage.MARKETER__HELD_BY, Marketer.class, msgs);
			msgs = basicSetHolds(newHolds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_RESERVATION__HOLDS, newHolds, newHolds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionService> getReserves_TransmissionService() {
		if (reserves_TransmissionService == null) {
			reserves_TransmissionService = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionService>(TransmissionService.class, this, ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE, ReservationPackage.TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION);
		}
		return reserves_TransmissionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AncillaryService> getReserves_AncillaryServices() {
		if (reserves_AncillaryServices == null) {
			reserves_AncillaryServices = new EObjectWithInverseResolvingEList<AncillaryService>(AncillaryService.class, this, ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES, ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION);
		}
		return reserves_AncillaryServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer getResells() {
		if (resells != null && resells.eIsProxy()) {
			InternalEObject oldResells = (InternalEObject)resells;
			resells = (Marketer)eResolveProxy(oldResells);
			if (resells != oldResells) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_RESERVATION__RESELLS, oldResells, resells));
			}
		}
		return resells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer basicGetResells() {
		return resells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResells(Marketer newResells, NotificationChain msgs) {
		Marketer oldResells = resells;
		resells = newResells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_RESERVATION__RESELLS, oldResells, newResells);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResells(Marketer newResells) {
		if (newResells != resells) {
			NotificationChain msgs = null;
			if (resells != null)
				msgs = ((InternalEObject)resells).eInverseRemove(this, FinancialPackage.MARKETER__RESOLD_BY, Marketer.class, msgs);
			if (newResells != null)
				msgs = ((InternalEObject)newResells).eInverseAdd(this, FinancialPackage.MARKETER__RESOLD_BY, Marketer.class, msgs);
			msgs = basicSetResells(newResells, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_RESERVATION__RESELLS, newResells, newResells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider getSells() {
		if (sells != null && sells.eIsProxy()) {
			InternalEObject oldSells = (InternalEObject)sells;
			sells = (TransmissionProvider)eResolveProxy(oldSells);
			if (sells != oldSells) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_RESERVATION__SELLS, oldSells, sells));
			}
		}
		return sells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider basicGetSells() {
		return sells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSells(TransmissionProvider newSells, NotificationChain msgs) {
		TransmissionProvider oldSells = sells;
		sells = newSells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_RESERVATION__SELLS, oldSells, newSells);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSells(TransmissionProvider newSells) {
		if (newSells != sells) {
			NotificationChain msgs = null;
			if (sells != null)
				msgs = ((InternalEObject)sells).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY, TransmissionProvider.class, msgs);
			if (newSells != null)
				msgs = ((InternalEObject)newSells).eInverseAdd(this, FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY, TransmissionProvider.class, msgs);
			msgs = basicSetSells(newSells, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_RESERVATION__SELLS, newSells, newSells));
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
			case ReservationPackage.SERVICE_RESERVATION__HOLDS:
				if (holds != null)
					msgs = ((InternalEObject)holds).eInverseRemove(this, FinancialPackage.MARKETER__HELD_BY, Marketer.class, msgs);
				return basicSetHolds((Marketer)otherEnd, msgs);
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReserves_TransmissionService()).basicAdd(otherEnd, msgs);
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReserves_AncillaryServices()).basicAdd(otherEnd, msgs);
			case ReservationPackage.SERVICE_RESERVATION__RESELLS:
				if (resells != null)
					msgs = ((InternalEObject)resells).eInverseRemove(this, FinancialPackage.MARKETER__RESOLD_BY, Marketer.class, msgs);
				return basicSetResells((Marketer)otherEnd, msgs);
			case ReservationPackage.SERVICE_RESERVATION__SELLS:
				if (sells != null)
					msgs = ((InternalEObject)sells).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__SOLD_BY, TransmissionProvider.class, msgs);
				return basicSetSells((TransmissionProvider)otherEnd, msgs);
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
			case ReservationPackage.SERVICE_RESERVATION__HOLDS:
				return basicSetHolds(null, msgs);
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE:
				return ((InternalEList<?>)getReserves_TransmissionService()).basicRemove(otherEnd, msgs);
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES:
				return ((InternalEList<?>)getReserves_AncillaryServices()).basicRemove(otherEnd, msgs);
			case ReservationPackage.SERVICE_RESERVATION__RESELLS:
				return basicSetResells(null, msgs);
			case ReservationPackage.SERVICE_RESERVATION__SELLS:
				return basicSetSells(null, msgs);
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
			case ReservationPackage.SERVICE_RESERVATION__HOLDS:
				if (resolve) return getHolds();
				return basicGetHolds();
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE:
				return getReserves_TransmissionService();
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES:
				return getReserves_AncillaryServices();
			case ReservationPackage.SERVICE_RESERVATION__RESELLS:
				if (resolve) return getResells();
				return basicGetResells();
			case ReservationPackage.SERVICE_RESERVATION__SELLS:
				if (resolve) return getSells();
				return basicGetSells();
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
			case ReservationPackage.SERVICE_RESERVATION__HOLDS:
				setHolds((Marketer)newValue);
				return;
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE:
				getReserves_TransmissionService().clear();
				getReserves_TransmissionService().addAll((Collection<? extends TransmissionService>)newValue);
				return;
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES:
				getReserves_AncillaryServices().clear();
				getReserves_AncillaryServices().addAll((Collection<? extends AncillaryService>)newValue);
				return;
			case ReservationPackage.SERVICE_RESERVATION__RESELLS:
				setResells((Marketer)newValue);
				return;
			case ReservationPackage.SERVICE_RESERVATION__SELLS:
				setSells((TransmissionProvider)newValue);
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
			case ReservationPackage.SERVICE_RESERVATION__HOLDS:
				setHolds((Marketer)null);
				return;
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE:
				getReserves_TransmissionService().clear();
				return;
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES:
				getReserves_AncillaryServices().clear();
				return;
			case ReservationPackage.SERVICE_RESERVATION__RESELLS:
				setResells((Marketer)null);
				return;
			case ReservationPackage.SERVICE_RESERVATION__SELLS:
				setSells((TransmissionProvider)null);
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
			case ReservationPackage.SERVICE_RESERVATION__HOLDS:
				return holds != null;
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE:
				return reserves_TransmissionService != null && !reserves_TransmissionService.isEmpty();
			case ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES:
				return reserves_AncillaryServices != null && !reserves_AncillaryServices.isEmpty();
			case ReservationPackage.SERVICE_RESERVATION__RESELLS:
				return resells != null;
			case ReservationPackage.SERVICE_RESERVATION__SELLS:
				return sells != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceReservationImpl
