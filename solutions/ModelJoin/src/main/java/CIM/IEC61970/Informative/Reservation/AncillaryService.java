/**
 */
package CIM.IEC61970.Informative.Reservation;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.Financial.ControlAreaOperator;
import CIM.IEC61970.Informative.Financial.OpenAccessProduct;
import CIM.IEC61970.Informative.Financial.TransmissionProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ancillary Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getOpenAccessProduct <em>Open Access Product</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getTransmissionProviders <em>Transmission Providers</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getControlAreaOperator <em>Control Area Operator</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Reservation.ReservationPackage#getAncillaryService()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All of these services relate \nto various aspects of insuring that the production of energy matches consumption of energy at any given time.  They are very critical to the security and reliability of the interconnected network. Some examples of AncillaryServices include Operating/Supplemental Reserve, Energy Imbalance Service, Operating/Spinning Reserve, Reactive Supply and Voltage Control, and Regulation and Frequency Response.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='All of these services relate \nto various aspects of insuring that the production of energy matches consumption of energy at any given time.  They are very critical to the security and reliability of the interconnected network. Some examples of AncillaryServices include Operating/Supplemental Reserve, Energy Imbalance Service, Operating/Spinning Reserve, Reactive Supply and Voltage Control, and Regulation and Frequency Response.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All of these services relate \nto various aspects of insuring that the production of energy matches consumption of energy at any given time.  They are very critical to the security and reliability of the interconnected network. Some examples of AncillaryServices include Operating/Supplemental Reserve, Energy Imbalance Service, Operating/Spinning Reserve, Reactive Supply and Voltage Control, and Regulation and Frequency Response.' Profile\040documentation='All of these services relate \nto various aspects of insuring that the production of energy matches consumption of energy at any given time.  They are very critical to the security and reliability of the interconnected network. Some examples of AncillaryServices include Operating/Supplemental Reserve, Energy Imbalance Service, Operating/Spinning Reserve, Reactive Supply and Voltage Control, and Regulation and Frequency Response.'"
 * @generated
 */
public interface AncillaryService extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Open Access Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.OpenAccessProduct#getAncillaryServices <em>Ancillary Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Access Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Access Product</em>' reference.
	 * @see #setOpenAccessProduct(OpenAccessProduct)
	 * @see CIM.IEC61970.Informative.Reservation.ReservationPackage#getAncillaryService_OpenAccessProduct()
	 * @see CIM.IEC61970.Informative.Financial.OpenAccessProduct#getAncillaryServices
	 * @model opposite="AncillaryServices"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AncillaryServices are sold through a contract which offers a particular OpenAccessProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AncillaryServices are sold through a contract which offers a particular OpenAccessProduct.'"
	 * @generated
	 */
	OpenAccessProduct getOpenAccessProduct();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getOpenAccessProduct <em>Open Access Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Access Product</em>' reference.
	 * @see #getOpenAccessProduct()
	 * @generated
	 */
	void setOpenAccessProduct(OpenAccessProduct value);

	/**
	 * Returns the value of the '<em><b>Transmission Providers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Financial.TransmissionProvider}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getAncillaryServices <em>Ancillary Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Providers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Providers</em>' reference list.
	 * @see CIM.IEC61970.Informative.Reservation.ReservationPackage#getAncillaryService_TransmissionProviders()
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getAncillaryServices
	 * @model opposite="AncillaryServices"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider offers AncillaryServices. One type of AncillaryServices is a shipping and handling fee to manage the services purchased, another is the reactive power support used to control the voltage on the \ntransmission system.  This is the amount needed to support the path or amount necessary to maintain the proper voltage at a ServicePoint.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider offers AncillaryServices. One type of AncillaryServices is a shipping and handling fee to manage the services purchased, another is the reactive power support used to control the voltage on the \ntransmission system.  This is the amount needed to support the path or amount necessary to maintain the proper voltage at a ServicePoint.'"
	 * @generated
	 */
	EList<TransmissionProvider> getTransmissionProviders();

	/**
	 * Returns the value of the '<em><b>Reserved By Service Reservation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_AncillaryServices <em>Reserves Ancillary Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved By Service Reservation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved By Service Reservation</em>' reference.
	 * @see #setReservedBy_ServiceReservation(ServiceReservation)
	 * @see CIM.IEC61970.Informative.Reservation.ReservationPackage#getAncillaryService_ReservedBy_ServiceReservation()
	 * @see CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_AncillaryServices
	 * @model opposite="Reserves_AncillaryServices"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ServiceReservation guarantees a certain AncillaryService.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ServiceReservation guarantees a certain AncillaryService.'"
	 * @generated
	 */
	ServiceReservation getReservedBy_ServiceReservation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved By Service Reservation</em>' reference.
	 * @see #getReservedBy_ServiceReservation()
	 * @generated
	 */
	void setReservedBy_ServiceReservation(ServiceReservation value);

	/**
	 * Returns the value of the '<em><b>Control Area Operator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getAncillaryService <em>Ancillary Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Operator</em>' reference.
	 * @see #setControlAreaOperator(ControlAreaOperator)
	 * @see CIM.IEC61970.Informative.Reservation.ReservationPackage#getAncillaryService_ControlAreaOperator()
	 * @see CIM.IEC61970.Informative.Financial.ControlAreaOperator#getAncillaryService
	 * @model opposite="AncillaryService"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sale of ancillary services provided by ControlAreaOperators.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sale of ancillary services provided by ControlAreaOperators.'"
	 * @generated
	 */
	ControlAreaOperator getControlAreaOperator();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getControlAreaOperator <em>Control Area Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area Operator</em>' reference.
	 * @see #getControlAreaOperator()
	 * @generated
	 */
	void setControlAreaOperator(ControlAreaOperator value);

} // AncillaryService
