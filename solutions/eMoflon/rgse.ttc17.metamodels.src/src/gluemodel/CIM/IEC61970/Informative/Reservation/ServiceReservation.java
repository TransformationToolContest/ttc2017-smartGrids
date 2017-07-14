/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Informative.Financial.Marketer;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getHolds <em>Holds</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_TransmissionService <em>Reserves Transmission Service</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_AncillaryServices <em>Reserves Ancillary Services</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getResells <em>Resells</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getSells <em>Sells</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServiceReservation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ServiceReservation is a reservation for either AncillaryServices or TransmissionServices. In the case of TransmissionServices, this is the right to some amount of AvailableTransmissionCapacity for a product on a path in a direction for some specific period of time'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A ServiceReservation is a reservation for either AncillaryServices or TransmissionServices. In the case of TransmissionServices, this is the right to some amount of AvailableTransmissionCapacity for a product on a path in a direction for some specific period of time'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ServiceReservation is a reservation for either AncillaryServices or TransmissionServices. In the case of TransmissionServices, this is the right to some amount of AvailableTransmissionCapacity for a product on a path in a direction for some specific period of time' Profile\040documentation='A ServiceReservation is a reservation for either AncillaryServices or TransmissionServices. In the case of TransmissionServices, this is the right to some amount of AvailableTransmissionCapacity for a product on a path in a direction for some specific period of time'"
 * @generated
 */
public interface ServiceReservation extends Element {
	/**
	 * Returns the value of the '<em><b>Holds</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getHeldBy <em>Held By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds</em>' reference.
	 * @see #setHolds(Marketer)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServiceReservation_Holds()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getHeldBy
	 * @model opposite="HeldBy"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Marketer holds title to a ServiceReservation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Marketer holds title to a ServiceReservation.'"
	 * @generated
	 */
	Marketer getHolds();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getHolds <em>Holds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holds</em>' reference.
	 * @see #getHolds()
	 * @generated
	 */
	void setHolds(Marketer value);

	/**
	 * Returns the value of the '<em><b>Reserves Transmission Service</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserves Transmission Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserves Transmission Service</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServiceReservation_Reserves_TransmissionService()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getReservedBy_ServiceReservation
	 * @model opposite="ReservedBy_ServiceReservation"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A service reservation reserves a particular transmission service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A service reservation reserves a particular transmission service.'"
	 * @generated
	 */
	EList<TransmissionService> getReserves_TransmissionService();

	/**
	 * Returns the value of the '<em><b>Reserves Ancillary Services</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserves Ancillary Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserves Ancillary Services</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServiceReservation_Reserves_AncillaryServices()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getReservedBy_ServiceReservation
	 * @model opposite="ReservedBy_ServiceReservation"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ServiceReservation guarantees a certain AncillaryService.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ServiceReservation guarantees a certain AncillaryService.'"
	 * @generated
	 */
	EList<AncillaryService> getReserves_AncillaryServices();

	/**
	 * Returns the value of the '<em><b>Resells</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getResoldBy <em>Resold By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resells</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resells</em>' reference.
	 * @see #setResells(Marketer)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServiceReservation_Resells()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getResoldBy
	 * @model opposite="ResoldBy"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ServiceReservation may be resold by a Marketer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ServiceReservation may be resold by a Marketer.'"
	 * @generated
	 */
	Marketer getResells();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getResells <em>Resells</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resells</em>' reference.
	 * @see #getResells()
	 * @generated
	 */
	void setResells(Marketer value);

	/**
	 * Returns the value of the '<em><b>Sells</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider#getSoldBy <em>Sold By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sells</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sells</em>' reference.
	 * @see #setSells(TransmissionProvider)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServiceReservation_Sells()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider#getSoldBy
	 * @model opposite="SoldBy"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider sells the right to transmit energy across the wires in a ServiceReservation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider sells the right to transmit energy across the wires in a ServiceReservation.'"
	 * @generated
	 */
	TransmissionProvider getSells();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getSells <em>Sells</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sells</em>' reference.
	 * @see #getSells()
	 * @generated
	 */
	void setSells(TransmissionProvider value);

} // ServiceReservation
