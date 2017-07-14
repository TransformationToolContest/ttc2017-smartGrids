/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
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
 * An implementation of the model object '<em><b>Available Transmission Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.AvailableTransmissionCapacityImpl#getScheduleFor <em>Schedule For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailableTransmissionCapacityImpl extends CurveImpl implements AvailableTransmissionCapacity {
	/**
	 * The cached value of the '{@link #getScheduleFor() <em>Schedule For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleFor()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionService> scheduleFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableTransmissionCapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.AVAILABLE_TRANSMISSION_CAPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionService> getScheduleFor() {
		if (scheduleFor == null) {
			scheduleFor = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionService>(TransmissionService.class, this, EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR, ReservationPackage.TRANSMISSION_SERVICE__SCHEDULED_BY);
		}
		return scheduleFor;
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
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleFor()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR:
				return ((InternalEList<?>)getScheduleFor()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR:
				return getScheduleFor();
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
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR:
				getScheduleFor().clear();
				getScheduleFor().addAll((Collection<? extends TransmissionService>)newValue);
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
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR:
				getScheduleFor().clear();
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
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR:
				return scheduleFor != null && !scheduleFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AvailableTransmissionCapacityImpl
