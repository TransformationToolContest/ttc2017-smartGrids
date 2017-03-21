/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor;
import CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay;

import CIM.IEC61970.Informative.Reservation.ReservationPackage;
import CIM.IEC61970.Informative.Reservation.TransmissionPath;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Corridor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionCorridorImpl#getTransmissionRightOfWays <em>Transmission Right Of Ways</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionCorridorImpl#getContainedIn <em>Contained In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionCorridorImpl extends PowerSystemResourceImpl implements TransmissionCorridor {
	/**
	 * The cached value of the '{@link #getTransmissionRightOfWays() <em>Transmission Right Of Ways</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRightOfWays()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionRightOfWay> transmissionRightOfWays;

	/**
	 * The cached value of the '{@link #getContainedIn() <em>Contained In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionPath> containedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionCorridorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.TRANSMISSION_CORRIDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionRightOfWay> getTransmissionRightOfWays() {
		if (transmissionRightOfWays == null) {
			transmissionRightOfWays = new EObjectWithInverseResolvingEList<TransmissionRightOfWay>(TransmissionRightOfWay.class, this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR);
		}
		return transmissionRightOfWays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionPath> getContainedIn() {
		if (containedIn == null) {
			containedIn = new EObjectWithInverseResolvingEList<TransmissionPath>(TransmissionPath.class, this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN, ReservationPackage.TRANSMISSION_PATH__FOR);
		}
		return containedIn;
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
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransmissionRightOfWays()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedIn()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS:
				return ((InternalEList<?>)getTransmissionRightOfWays()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN:
				return ((InternalEList<?>)getContainedIn()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS:
				return getTransmissionRightOfWays();
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN:
				return getContainedIn();
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
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS:
				getTransmissionRightOfWays().clear();
				getTransmissionRightOfWays().addAll((Collection<? extends TransmissionRightOfWay>)newValue);
				return;
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN:
				getContainedIn().clear();
				getContainedIn().addAll((Collection<? extends TransmissionPath>)newValue);
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
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS:
				getTransmissionRightOfWays().clear();
				return;
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN:
				getContainedIn().clear();
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
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS:
				return transmissionRightOfWays != null && !transmissionRightOfWays.isEmpty();
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR__CONTAINED_IN:
				return containedIn != null && !containedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransmissionCorridorImpl
