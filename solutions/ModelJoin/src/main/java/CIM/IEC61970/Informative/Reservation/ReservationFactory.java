/**
 */
package CIM.IEC61970.Informative.Reservation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.Reservation.ReservationPackage
 * @generated
 */
public interface ReservationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReservationFactory eINSTANCE = CIM.IEC61970.Informative.Reservation.impl.ReservationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transmission Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Path</em>'.
	 * @generated
	 */
	TransmissionPath createTransmissionPath();

	/**
	 * Returns a new object of class '<em>Tie Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tie Point</em>'.
	 * @generated
	 */
	TiePoint createTiePoint();

	/**
	 * Returns a new object of class '<em>Service Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Reservation</em>'.
	 * @generated
	 */
	ServiceReservation createServiceReservation();

	/**
	 * Returns a new object of class '<em>Service Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Point</em>'.
	 * @generated
	 */
	ServicePoint createServicePoint();

	/**
	 * Returns a new object of class '<em>Ancillary Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ancillary Service</em>'.
	 * @generated
	 */
	AncillaryService createAncillaryService();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	ReservationVersion createReservationVersion();

	/**
	 * Returns a new object of class '<em>Transmission Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Service</em>'.
	 * @generated
	 */
	TransmissionService createTransmissionService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReservationPackage getReservationPackage();

} //ReservationFactory
