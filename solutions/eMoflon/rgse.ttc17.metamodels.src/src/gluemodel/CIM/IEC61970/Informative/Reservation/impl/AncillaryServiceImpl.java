/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.Financial.ControlAreaOperator;
import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService;
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
 * An implementation of the model object '<em><b>Ancillary Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl#getOpenAccessProduct <em>Open Access Product</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl#getTransmissionProviders <em>Transmission Providers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl#getControlAreaOperator <em>Control Area Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AncillaryServiceImpl extends IdentifiedObjectImpl implements AncillaryService {
	/**
	 * The cached value of the '{@link #getOpenAccessProduct() <em>Open Access Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenAccessProduct()
	 * @generated
	 * @ordered
	 */
	protected OpenAccessProduct openAccessProduct;

	/**
	 * The cached value of the '{@link #getTransmissionProviders() <em>Transmission Providers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionProvider> transmissionProviders;

	/**
	 * The cached value of the '{@link #getReservedBy_ServiceReservation() <em>Reserved By Service Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBy_ServiceReservation()
	 * @generated
	 * @ordered
	 */
	protected ServiceReservation reservedBy_ServiceReservation;

	/**
	 * The cached value of the '{@link #getControlAreaOperator() <em>Control Area Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaOperator()
	 * @generated
	 * @ordered
	 */
	protected ControlAreaOperator controlAreaOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AncillaryServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.ANCILLARY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAccessProduct getOpenAccessProduct() {
		if (openAccessProduct != null && openAccessProduct.eIsProxy()) {
			InternalEObject oldOpenAccessProduct = (InternalEObject)openAccessProduct;
			openAccessProduct = (OpenAccessProduct)eResolveProxy(oldOpenAccessProduct);
			if (openAccessProduct != oldOpenAccessProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT, oldOpenAccessProduct, openAccessProduct));
			}
		}
		return openAccessProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAccessProduct basicGetOpenAccessProduct() {
		return openAccessProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenAccessProduct(OpenAccessProduct newOpenAccessProduct, NotificationChain msgs) {
		OpenAccessProduct oldOpenAccessProduct = openAccessProduct;
		openAccessProduct = newOpenAccessProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT, oldOpenAccessProduct, newOpenAccessProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenAccessProduct(OpenAccessProduct newOpenAccessProduct) {
		if (newOpenAccessProduct != openAccessProduct) {
			NotificationChain msgs = null;
			if (openAccessProduct != null)
				msgs = ((InternalEObject)openAccessProduct).eInverseRemove(this, FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES, OpenAccessProduct.class, msgs);
			if (newOpenAccessProduct != null)
				msgs = ((InternalEObject)newOpenAccessProduct).eInverseAdd(this, FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES, OpenAccessProduct.class, msgs);
			msgs = basicSetOpenAccessProduct(newOpenAccessProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT, newOpenAccessProduct, newOpenAccessProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionProvider> getTransmissionProviders() {
		if (transmissionProviders == null) {
			transmissionProviders = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionProvider>(TransmissionProvider.class, this, ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS, FinancialPackage.TRANSMISSION_PROVIDER__ANCILLARY_SERVICES);
		}
		return transmissionProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReservation getReservedBy_ServiceReservation() {
		if (reservedBy_ServiceReservation != null && reservedBy_ServiceReservation.eIsProxy()) {
			InternalEObject oldReservedBy_ServiceReservation = (InternalEObject)reservedBy_ServiceReservation;
			reservedBy_ServiceReservation = (ServiceReservation)eResolveProxy(oldReservedBy_ServiceReservation);
			if (reservedBy_ServiceReservation != oldReservedBy_ServiceReservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION, oldReservedBy_ServiceReservation, reservedBy_ServiceReservation));
			}
		}
		return reservedBy_ServiceReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReservation basicGetReservedBy_ServiceReservation() {
		return reservedBy_ServiceReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservedBy_ServiceReservation(ServiceReservation newReservedBy_ServiceReservation, NotificationChain msgs) {
		ServiceReservation oldReservedBy_ServiceReservation = reservedBy_ServiceReservation;
		reservedBy_ServiceReservation = newReservedBy_ServiceReservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION, oldReservedBy_ServiceReservation, newReservedBy_ServiceReservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBy_ServiceReservation(ServiceReservation newReservedBy_ServiceReservation) {
		if (newReservedBy_ServiceReservation != reservedBy_ServiceReservation) {
			NotificationChain msgs = null;
			if (reservedBy_ServiceReservation != null)
				msgs = ((InternalEObject)reservedBy_ServiceReservation).eInverseRemove(this, ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES, ServiceReservation.class, msgs);
			if (newReservedBy_ServiceReservation != null)
				msgs = ((InternalEObject)newReservedBy_ServiceReservation).eInverseAdd(this, ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES, ServiceReservation.class, msgs);
			msgs = basicSetReservedBy_ServiceReservation(newReservedBy_ServiceReservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION, newReservedBy_ServiceReservation, newReservedBy_ServiceReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaOperator getControlAreaOperator() {
		if (controlAreaOperator != null && controlAreaOperator.eIsProxy()) {
			InternalEObject oldControlAreaOperator = (InternalEObject)controlAreaOperator;
			controlAreaOperator = (ControlAreaOperator)eResolveProxy(oldControlAreaOperator);
			if (controlAreaOperator != oldControlAreaOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR, oldControlAreaOperator, controlAreaOperator));
			}
		}
		return controlAreaOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaOperator basicGetControlAreaOperator() {
		return controlAreaOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlAreaOperator(ControlAreaOperator newControlAreaOperator, NotificationChain msgs) {
		ControlAreaOperator oldControlAreaOperator = controlAreaOperator;
		controlAreaOperator = newControlAreaOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR, oldControlAreaOperator, newControlAreaOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlAreaOperator(ControlAreaOperator newControlAreaOperator) {
		if (newControlAreaOperator != controlAreaOperator) {
			NotificationChain msgs = null;
			if (controlAreaOperator != null)
				msgs = ((InternalEObject)controlAreaOperator).eInverseRemove(this, FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE, ControlAreaOperator.class, msgs);
			if (newControlAreaOperator != null)
				msgs = ((InternalEObject)newControlAreaOperator).eInverseAdd(this, FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE, ControlAreaOperator.class, msgs);
			msgs = basicSetControlAreaOperator(newControlAreaOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR, newControlAreaOperator, newControlAreaOperator));
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
			case ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT:
				if (openAccessProduct != null)
					msgs = ((InternalEObject)openAccessProduct).eInverseRemove(this, FinancialPackage.OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES, OpenAccessProduct.class, msgs);
				return basicSetOpenAccessProduct((OpenAccessProduct)otherEnd, msgs);
			case ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransmissionProviders()).basicAdd(otherEnd, msgs);
			case ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				if (reservedBy_ServiceReservation != null)
					msgs = ((InternalEObject)reservedBy_ServiceReservation).eInverseRemove(this, ReservationPackage.SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES, ServiceReservation.class, msgs);
				return basicSetReservedBy_ServiceReservation((ServiceReservation)otherEnd, msgs);
			case ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR:
				if (controlAreaOperator != null)
					msgs = ((InternalEObject)controlAreaOperator).eInverseRemove(this, FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE, ControlAreaOperator.class, msgs);
				return basicSetControlAreaOperator((ControlAreaOperator)otherEnd, msgs);
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
			case ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT:
				return basicSetOpenAccessProduct(null, msgs);
			case ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS:
				return ((InternalEList<?>)getTransmissionProviders()).basicRemove(otherEnd, msgs);
			case ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				return basicSetReservedBy_ServiceReservation(null, msgs);
			case ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR:
				return basicSetControlAreaOperator(null, msgs);
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
			case ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT:
				if (resolve) return getOpenAccessProduct();
				return basicGetOpenAccessProduct();
			case ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS:
				return getTransmissionProviders();
			case ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				if (resolve) return getReservedBy_ServiceReservation();
				return basicGetReservedBy_ServiceReservation();
			case ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR:
				if (resolve) return getControlAreaOperator();
				return basicGetControlAreaOperator();
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
			case ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT:
				setOpenAccessProduct((OpenAccessProduct)newValue);
				return;
			case ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS:
				getTransmissionProviders().clear();
				getTransmissionProviders().addAll((Collection<? extends TransmissionProvider>)newValue);
				return;
			case ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				setReservedBy_ServiceReservation((ServiceReservation)newValue);
				return;
			case ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR:
				setControlAreaOperator((ControlAreaOperator)newValue);
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
			case ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT:
				setOpenAccessProduct((OpenAccessProduct)null);
				return;
			case ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS:
				getTransmissionProviders().clear();
				return;
			case ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				setReservedBy_ServiceReservation((ServiceReservation)null);
				return;
			case ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR:
				setControlAreaOperator((ControlAreaOperator)null);
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
			case ReservationPackage.ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT:
				return openAccessProduct != null;
			case ReservationPackage.ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS:
				return transmissionProviders != null && !transmissionProviders.isEmpty();
			case ReservationPackage.ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION:
				return reservedBy_ServiceReservation != null;
			case ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR:
				return controlAreaOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //AncillaryServiceImpl
