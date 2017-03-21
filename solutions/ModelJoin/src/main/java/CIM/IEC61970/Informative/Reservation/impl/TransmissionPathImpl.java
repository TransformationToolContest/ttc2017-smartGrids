/**
 */
package CIM.IEC61970.Informative.Reservation.impl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.TransmissionProduct;

import CIM.IEC61970.Informative.Reservation.ReservationPackage;
import CIM.IEC61970.Informative.Reservation.ServicePoint;
import CIM.IEC61970.Informative.Reservation.TransmissionPath;
import CIM.IEC61970.Informative.Reservation.TransmissionService;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Transmission Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getDeliveryPointFor <em>Delivery Point For</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getOfferedOn <em>Offered On</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getPointOfReceiptFor <em>Point Of Receipt For</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getFor <em>For</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getAvailTransferCapability <em>Avail Transfer Capability</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#isParallelPathFlag <em>Parallel Path Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getLocatedOn <em>Located On</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl#getTotalTransferCapability <em>Total Transfer Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionPathImpl extends ElementImpl implements TransmissionPath {
	/**
	 * The cached value of the '{@link #getDeliveryPointFor() <em>Delivery Point For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPointFor()
	 * @generated
	 * @ordered
	 */
	protected ServicePoint deliveryPointFor;

	/**
	 * The cached value of the '{@link #getOfferedOn() <em>Offered On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionService> offeredOn;

	/**
	 * The cached value of the '{@link #getPointOfReceiptFor() <em>Point Of Receipt For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfReceiptFor()
	 * @generated
	 * @ordered
	 */
	protected ServicePoint pointOfReceiptFor;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected TransmissionCorridor for_;

	/**
	 * The default value of the '{@link #getAvailTransferCapability() <em>Avail Transfer Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailTransferCapability()
	 * @generated
	 * @ordered
	 */
	protected static final float AVAIL_TRANSFER_CAPABILITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvailTransferCapability() <em>Avail Transfer Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailTransferCapability()
	 * @generated
	 * @ordered
	 */
	protected float availTransferCapability = AVAIL_TRANSFER_CAPABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isParallelPathFlag() <em>Parallel Path Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelPathFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_PATH_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallelPathFlag() <em>Parallel Path Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelPathFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean parallelPathFlag = PARALLEL_PATH_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocatedOn() <em>Located On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionProduct> locatedOn;

	/**
	 * The default value of the '{@link #getTotalTransferCapability() <em>Total Transfer Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTransferCapability()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_TRANSFER_CAPABILITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalTransferCapability() <em>Total Transfer Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTransferCapability()
	 * @generated
	 * @ordered
	 */
	protected float totalTransferCapability = TOTAL_TRANSFER_CAPABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.TRANSMISSION_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint getDeliveryPointFor() {
		if (deliveryPointFor != null && deliveryPointFor.eIsProxy()) {
			InternalEObject oldDeliveryPointFor = (InternalEObject)deliveryPointFor;
			deliveryPointFor = (ServicePoint)eResolveProxy(oldDeliveryPointFor);
			if (deliveryPointFor != oldDeliveryPointFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR, oldDeliveryPointFor, deliveryPointFor));
			}
		}
		return deliveryPointFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint basicGetDeliveryPointFor() {
		return deliveryPointFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliveryPointFor(ServicePoint newDeliveryPointFor, NotificationChain msgs) {
		ServicePoint oldDeliveryPointFor = deliveryPointFor;
		deliveryPointFor = newDeliveryPointFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR, oldDeliveryPointFor, newDeliveryPointFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryPointFor(ServicePoint newDeliveryPointFor) {
		if (newDeliveryPointFor != deliveryPointFor) {
			NotificationChain msgs = null;
			if (deliveryPointFor != null)
				msgs = ((InternalEObject)deliveryPointFor).eInverseRemove(this, ReservationPackage.SERVICE_POINT__HAS_APOD_, ServicePoint.class, msgs);
			if (newDeliveryPointFor != null)
				msgs = ((InternalEObject)newDeliveryPointFor).eInverseAdd(this, ReservationPackage.SERVICE_POINT__HAS_APOD_, ServicePoint.class, msgs);
			msgs = basicSetDeliveryPointFor(newDeliveryPointFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR, newDeliveryPointFor, newDeliveryPointFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionService> getOfferedOn() {
		if (offeredOn == null) {
			offeredOn = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionService>(TransmissionService.class, this, ReservationPackage.TRANSMISSION_PATH__OFFERED_ON, ReservationPackage.TRANSMISSION_SERVICE__OFFERING);
		}
		return offeredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint getPointOfReceiptFor() {
		if (pointOfReceiptFor != null && pointOfReceiptFor.eIsProxy()) {
			InternalEObject oldPointOfReceiptFor = (InternalEObject)pointOfReceiptFor;
			pointOfReceiptFor = (ServicePoint)eResolveProxy(oldPointOfReceiptFor);
			if (pointOfReceiptFor != oldPointOfReceiptFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR, oldPointOfReceiptFor, pointOfReceiptFor));
			}
		}
		return pointOfReceiptFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint basicGetPointOfReceiptFor() {
		return pointOfReceiptFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfReceiptFor(ServicePoint newPointOfReceiptFor, NotificationChain msgs) {
		ServicePoint oldPointOfReceiptFor = pointOfReceiptFor;
		pointOfReceiptFor = newPointOfReceiptFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR, oldPointOfReceiptFor, newPointOfReceiptFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfReceiptFor(ServicePoint newPointOfReceiptFor) {
		if (newPointOfReceiptFor != pointOfReceiptFor) {
			NotificationChain msgs = null;
			if (pointOfReceiptFor != null)
				msgs = ((InternalEObject)pointOfReceiptFor).eInverseRemove(this, ReservationPackage.SERVICE_POINT__HAS_APOR_, ServicePoint.class, msgs);
			if (newPointOfReceiptFor != null)
				msgs = ((InternalEObject)newPointOfReceiptFor).eInverseAdd(this, ReservationPackage.SERVICE_POINT__HAS_APOR_, ServicePoint.class, msgs);
			msgs = basicSetPointOfReceiptFor(newPointOfReceiptFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR, newPointOfReceiptFor, newPointOfReceiptFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionCorridor getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (TransmissionCorridor)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.TRANSMISSION_PATH__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionCorridor basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(TransmissionCorridor newFor, NotificationChain msgs) {
		TransmissionCorridor oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__FOR, oldFor, newFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(TransmissionCorridor newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN, TransmissionCorridor.class, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN, TransmissionCorridor.class, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__FOR, newFor, newFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvailTransferCapability() {
		return availTransferCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailTransferCapability(float newAvailTransferCapability) {
		float oldAvailTransferCapability = availTransferCapability;
		availTransferCapability = newAvailTransferCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY, oldAvailTransferCapability, availTransferCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallelPathFlag() {
		return parallelPathFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelPathFlag(boolean newParallelPathFlag) {
		boolean oldParallelPathFlag = parallelPathFlag;
		parallelPathFlag = newParallelPathFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__PARALLEL_PATH_FLAG, oldParallelPathFlag, parallelPathFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionProduct> getLocatedOn() {
		if (locatedOn == null) {
			locatedOn = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionProduct>(TransmissionProduct.class, this, ReservationPackage.TRANSMISSION_PATH__LOCATED_ON, FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR);
		}
		return locatedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalTransferCapability() {
		return totalTransferCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalTransferCapability(float newTotalTransferCapability) {
		float oldTotalTransferCapability = totalTransferCapability;
		totalTransferCapability = newTotalTransferCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY, oldTotalTransferCapability, totalTransferCapability));
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
			case ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR:
				if (deliveryPointFor != null)
					msgs = ((InternalEObject)deliveryPointFor).eInverseRemove(this, ReservationPackage.SERVICE_POINT__HAS_APOD_, ServicePoint.class, msgs);
				return basicSetDeliveryPointFor((ServicePoint)otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_PATH__OFFERED_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfferedOn()).basicAdd(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR:
				if (pointOfReceiptFor != null)
					msgs = ((InternalEObject)pointOfReceiptFor).eInverseRemove(this, ReservationPackage.SERVICE_POINT__HAS_APOR_, ServicePoint.class, msgs);
				return basicSetPointOfReceiptFor((ServicePoint)otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_PATH__FOR:
				if (for_ != null)
					msgs = ((InternalEObject)for_).eInverseRemove(this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN, TransmissionCorridor.class, msgs);
				return basicSetFor((TransmissionCorridor)otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_PATH__LOCATED_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocatedOn()).basicAdd(otherEnd, msgs);
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
			case ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR:
				return basicSetDeliveryPointFor(null, msgs);
			case ReservationPackage.TRANSMISSION_PATH__OFFERED_ON:
				return ((InternalEList<?>)getOfferedOn()).basicRemove(otherEnd, msgs);
			case ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR:
				return basicSetPointOfReceiptFor(null, msgs);
			case ReservationPackage.TRANSMISSION_PATH__FOR:
				return basicSetFor(null, msgs);
			case ReservationPackage.TRANSMISSION_PATH__LOCATED_ON:
				return ((InternalEList<?>)getLocatedOn()).basicRemove(otherEnd, msgs);
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
			case ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR:
				if (resolve) return getDeliveryPointFor();
				return basicGetDeliveryPointFor();
			case ReservationPackage.TRANSMISSION_PATH__OFFERED_ON:
				return getOfferedOn();
			case ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR:
				if (resolve) return getPointOfReceiptFor();
				return basicGetPointOfReceiptFor();
			case ReservationPackage.TRANSMISSION_PATH__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case ReservationPackage.TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY:
				return getAvailTransferCapability();
			case ReservationPackage.TRANSMISSION_PATH__PARALLEL_PATH_FLAG:
				return isParallelPathFlag();
			case ReservationPackage.TRANSMISSION_PATH__LOCATED_ON:
				return getLocatedOn();
			case ReservationPackage.TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY:
				return getTotalTransferCapability();
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
			case ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR:
				setDeliveryPointFor((ServicePoint)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__OFFERED_ON:
				getOfferedOn().clear();
				getOfferedOn().addAll((Collection<? extends TransmissionService>)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR:
				setPointOfReceiptFor((ServicePoint)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__FOR:
				setFor((TransmissionCorridor)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY:
				setAvailTransferCapability((Float)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__PARALLEL_PATH_FLAG:
				setParallelPathFlag((Boolean)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__LOCATED_ON:
				getLocatedOn().clear();
				getLocatedOn().addAll((Collection<? extends TransmissionProduct>)newValue);
				return;
			case ReservationPackage.TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY:
				setTotalTransferCapability((Float)newValue);
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
			case ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR:
				setDeliveryPointFor((ServicePoint)null);
				return;
			case ReservationPackage.TRANSMISSION_PATH__OFFERED_ON:
				getOfferedOn().clear();
				return;
			case ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR:
				setPointOfReceiptFor((ServicePoint)null);
				return;
			case ReservationPackage.TRANSMISSION_PATH__FOR:
				setFor((TransmissionCorridor)null);
				return;
			case ReservationPackage.TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY:
				setAvailTransferCapability(AVAIL_TRANSFER_CAPABILITY_EDEFAULT);
				return;
			case ReservationPackage.TRANSMISSION_PATH__PARALLEL_PATH_FLAG:
				setParallelPathFlag(PARALLEL_PATH_FLAG_EDEFAULT);
				return;
			case ReservationPackage.TRANSMISSION_PATH__LOCATED_ON:
				getLocatedOn().clear();
				return;
			case ReservationPackage.TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY:
				setTotalTransferCapability(TOTAL_TRANSFER_CAPABILITY_EDEFAULT);
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
			case ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR:
				return deliveryPointFor != null;
			case ReservationPackage.TRANSMISSION_PATH__OFFERED_ON:
				return offeredOn != null && !offeredOn.isEmpty();
			case ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR:
				return pointOfReceiptFor != null;
			case ReservationPackage.TRANSMISSION_PATH__FOR:
				return for_ != null;
			case ReservationPackage.TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY:
				return availTransferCapability != AVAIL_TRANSFER_CAPABILITY_EDEFAULT;
			case ReservationPackage.TRANSMISSION_PATH__PARALLEL_PATH_FLAG:
				return parallelPathFlag != PARALLEL_PATH_FLAG_EDEFAULT;
			case ReservationPackage.TRANSMISSION_PATH__LOCATED_ON:
				return locatedOn != null && !locatedOn.isEmpty();
			case ReservationPackage.TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY:
				return totalTransferCapability != TOTAL_TRANSFER_CAPABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (availTransferCapability: ");
		result.append(availTransferCapability);
		result.append(", parallelPathFlag: ");
		result.append(parallelPathFlag);
		result.append(", totalTransferCapability: ");
		result.append(totalTransferCapability);
		result.append(')');
		return result.toString();
	}

} //TransmissionPathImpl
