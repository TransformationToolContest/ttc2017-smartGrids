/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity;

import gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffering <em>Offering</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOfferedAs <em>Offered As</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getScheduledBy <em>Scheduled By</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getTransContractFor <em>Trans Contract For</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transmission products along posted transmission path.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Transmission products along posted transmission path.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transmission products along posted transmission path.' Profile\040documentation='Transmission products along posted transmission path.'"
 * @generated
 */
public interface TransmissionService extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Offering</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getOfferedOn <em>Offered On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offering</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offering</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService_Offering()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getOfferedOn
	 * @model opposite="OfferedOn"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission service is offered on a transmission path.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission service is offered on a transmission path.'"
	 * @generated
	 */
	EList<TransmissionPath> getOffering();

	/**
	 * Returns the value of the '<em><b>Offered As</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered As</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered As</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService_OfferedAs()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct#getOffers
	 * @model opposite="Offers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission product is offered as a transmission service along a transmission path.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission product is offered as a transmission service along a transmission path.'"
	 * @generated
	 */
	EList<TransmissionProduct> getOfferedAs();

	/**
	 * Returns the value of the '<em><b>Scheduled By</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity#getScheduleFor <em>Schedule For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled By</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService_ScheduledBy()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity#getScheduleFor
	 * @model opposite="ScheduleFor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission schedule posts the available transmission capacity for a transmission line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission schedule posts the available transmission capacity for a transmission line.'"
	 * @generated
	 */
	EList<AvailableTransmissionCapacity> getScheduledBy();

	/**
	 * Returns the value of the '<em><b>Reserved By Service Reservation</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_TransmissionService <em>Reserves Transmission Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved By Service Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved By Service Reservation</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService_ReservedBy_ServiceReservation()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_TransmissionService
	 * @model opposite="Reserves_TransmissionService"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A service reservation reserves a particular transmission service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A service reservation reserves a particular transmission service.'"
	 * @generated
	 */
	EList<ServiceReservation> getReservedBy_ServiceReservation();

	/**
	 * Returns the value of the '<em><b>Trans Contract For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct#getProvidedBy_TransmissionService <em>Provided By Transmission Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Contract For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Contract For</em>' reference.
	 * @see #setTransContractFor(OpenAccessProduct)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService_TransContractFor()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct#getProvidedBy_TransmissionService
	 * @model opposite="ProvidedBy_TransmissionService"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionService is sold according to the terms of a particular OpenAccessProduct agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionService is sold according to the terms of a particular OpenAccessProduct agreement.'"
	 * @generated
	 */
	OpenAccessProduct getTransContractFor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getTransContractFor <em>Trans Contract For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Contract For</em>' reference.
	 * @see #getTransContractFor()
	 * @generated
	 */
	void setTransContractFor(OpenAccessProduct value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider#getOfferedBy <em>Offered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference.
	 * @see #setOffers(TransmissionProvider)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionService_Offers()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider#getOfferedBy
	 * @model opposite="OfferedBy"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The combination of a TransmissionProduct on a TransmissionPath is a TransmissionService, for which the TransmissionProvider must post one or two ATC\'s (AvailableTransmissionCapacity - Amount of possible flow by \ndirection).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The combination of a TransmissionProduct on a TransmissionPath is a TransmissionService, for which the TransmissionProvider must post one or two ATC\'s (AvailableTransmissionCapacity - Amount of possible flow by \ndirection).'"
	 * @generated
	 */
	TransmissionProvider getOffers();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffers <em>Offers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offers</em>' reference.
	 * @see #getOffers()
	 * @generated
	 */
	void setOffers(TransmissionProvider value);

} // TransmissionService
