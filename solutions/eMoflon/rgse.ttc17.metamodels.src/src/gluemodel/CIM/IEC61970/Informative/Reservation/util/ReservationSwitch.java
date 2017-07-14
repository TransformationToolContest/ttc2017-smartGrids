/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.Reservation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage
 * @generated
 */
public class ReservationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReservationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationSwitch() {
		if (modelPackage == null) {
			modelPackage = ReservationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReservationPackage.TRANSMISSION_PATH: {
				TransmissionPath transmissionPath = (TransmissionPath)theEObject;
				T result = caseTransmissionPath(transmissionPath);
				if (result == null) result = caseElement(transmissionPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReservationPackage.TIE_POINT: {
				TiePoint tiePoint = (TiePoint)theEObject;
				T result = caseTiePoint(tiePoint);
				if (result == null) result = caseIdentifiedObject(tiePoint);
				if (result == null) result = caseElement(tiePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReservationPackage.SERVICE_RESERVATION: {
				ServiceReservation serviceReservation = (ServiceReservation)theEObject;
				T result = caseServiceReservation(serviceReservation);
				if (result == null) result = caseElement(serviceReservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReservationPackage.SERVICE_POINT: {
				ServicePoint servicePoint = (ServicePoint)theEObject;
				T result = caseServicePoint(servicePoint);
				if (result == null) result = caseIdentifiedObject(servicePoint);
				if (result == null) result = caseElement(servicePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReservationPackage.ANCILLARY_SERVICE: {
				AncillaryService ancillaryService = (AncillaryService)theEObject;
				T result = caseAncillaryService(ancillaryService);
				if (result == null) result = caseIdentifiedObject(ancillaryService);
				if (result == null) result = caseElement(ancillaryService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReservationPackage.RESERVATION_VERSION: {
				ReservationVersion reservationVersion = (ReservationVersion)theEObject;
				T result = caseReservationVersion(reservationVersion);
				if (result == null) result = caseElement(reservationVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReservationPackage.TRANSMISSION_SERVICE: {
				TransmissionService transmissionService = (TransmissionService)theEObject;
				T result = caseTransmissionService(transmissionService);
				if (result == null) result = caseIdentifiedObject(transmissionService);
				if (result == null) result = caseElement(transmissionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionPath(TransmissionPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tie Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiePoint(TiePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Reservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceReservation(ServiceReservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicePoint(ServicePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ancillary Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ancillary Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAncillaryService(AncillaryService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationVersion(ReservationVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionService(TransmissionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReservationSwitch
