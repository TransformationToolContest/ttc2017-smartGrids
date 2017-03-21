/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.IEC61970.Informative.EnergyScheduling.LossProfile;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM.IEC61970.Informative.MarketOperations.Flowgate;

import CIM.IEC61970.Informative.Reservation.AncillaryService;
import CIM.IEC61970.Informative.Reservation.ServicePoint;
import CIM.IEC61970.Informative.Reservation.ServiceReservation;
import CIM.IEC61970.Informative.Reservation.TransmissionService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getServicePoint <em>Service Point</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getAncillaryServices <em>Ancillary Services</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getFor <em>For</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getOfferedBy <em>Offered By</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getSoldBy <em>Sold By</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getTransmissionProducts <em>Transmission Products</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Provider of the transmission capacity (interconnecting wires between Generation and Consumption) required to fulfill and Energy Transaction\'s energy exchange. Posts information for transmission paths and AvailableTransmissionCapacities on a reservation node. Buys and sells its products and services on the same reservation node.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Provider of the transmission capacity (interconnecting wires between Generation and Consumption) required to fulfill and Energy Transaction\'s energy exchange. Posts information for transmission paths and AvailableTransmissionCapacities on a reservation node. Buys and sells its products and services on the same reservation node.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Provider of the transmission capacity (interconnecting wires between Generation and Consumption) required to fulfill and Energy Transaction\'s energy exchange. Posts information for transmission paths and AvailableTransmissionCapacities on a reservation node. Buys and sells its products and services on the same reservation node.' Profile\040documentation='Provider of the transmission capacity (interconnecting wires between Generation and Consumption) required to fulfill and Energy Transaction\'s energy exchange. Posts information for transmission paths and AvailableTransmissionCapacities on a reservation node. Buys and sells its products and services on the same reservation node.'"
 * @generated
 */
public interface TransmissionProvider extends ErpOrganisation {
	/**
	 * Returns the value of the '<em><b>Service Point</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.ServicePoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServicePoint#getTransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Point</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_ServicePoint()
	 * @see CIM.IEC61970.Informative.Reservation.ServicePoint#getTransmissionProvider
	 * @model opposite="TransmissionProvider"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider registers one or more ServicePoints.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider registers one or more ServicePoints.'"
	 * @generated
	 */
	EList<ServicePoint> getServicePoint();

	/**
	 * Returns the value of the '<em><b>Ancillary Services</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.AncillaryService}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getTransmissionProviders <em>Transmission Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancillary Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancillary Services</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_AncillaryServices()
	 * @see CIM.IEC61970.Informative.Reservation.AncillaryService#getTransmissionProviders
	 * @model opposite="TransmissionProviders"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider offers AncillaryServices. One type of AncillaryServices is a shipping and handling fee to manage the services purchased, another is the reactive power support used to control the voltage on the \ntransmission system.  This is the amount needed to support the path or amount necessary to maintain the proper voltage at a ServicePoint.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider offers AncillaryServices. One type of AncillaryServices is a shipping and handling fee to manage the services purchased, another is the reactive power support used to control the voltage on the \ntransmission system.  This is the amount needed to support the path or amount necessary to maintain the proper voltage at a ServicePoint.'"
	 * @generated
	 */
	EList<AncillaryService> getAncillaryServices();

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getHasLoss_ <em>Has Loss </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_For()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getHasLoss_
	 * @model opposite="HasLoss_"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Part of the LossProfile for an EnergyTransaction may be a loss for a TransmissionProvider.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Part of the LossProfile for an EnergyTransaction may be a loss for a TransmissionProvider.'"
	 * @generated
	 */
	EList<LossProfile> getFor();

	/**
	 * Returns the value of the '<em><b>Offered By</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.TransmissionService}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.TransmissionService#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered By</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_OfferedBy()
	 * @see CIM.IEC61970.Informative.Reservation.TransmissionService#getOffers
	 * @model opposite="Offers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The combination of a TransmissionProduct on a TransmissionPath is a TransmissionService, for which the TransmissionProvider must post one or two ATC\'s (AvailableTransmissionCapacity - Amount of possible flow by \ndirection).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The combination of a TransmissionProduct on a TransmissionPath is a TransmissionService, for which the TransmissionProvider must post one or two ATC\'s (AvailableTransmissionCapacity - Amount of possible flow by \ndirection).'"
	 * @generated
	 */
	EList<TransmissionService> getOfferedBy();

	/**
	 * Returns the value of the '<em><b>Flowgate</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Flowgate}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgate</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_Flowgate()
	 * @see CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionProvider
	 * @model opposite="TransmissionProvider"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flowgate can be reciprocal flowgate for 0 to n transmission providers. A transmission provider may be a reciprocal entity for 0 to n flowgates.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flowgate can be reciprocal flowgate for 0 to n transmission providers. A transmission provider may be a reciprocal entity for 0 to n flowgates.'"
	 * @generated
	 */
	EList<Flowgate> getFlowgate();

	/**
	 * Returns the value of the '<em><b>Sold By</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.ServiceReservation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServiceReservation#getSells <em>Sells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sold By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold By</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_SoldBy()
	 * @see CIM.IEC61970.Informative.Reservation.ServiceReservation#getSells
	 * @model opposite="Sells"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider sells the right to transmit energy across the wires in a ServiceReservation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider sells the right to transmit energy across the wires in a ServiceReservation.'"
	 * @generated
	 */
	EList<ServiceReservation> getSoldBy();

	/**
	 * Returns the value of the '<em><b>Transmission Products</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Financial.TransmissionProduct}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Products</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProvider_TransmissionProducts()
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProvider
	 * @model opposite="TransmissionProvider"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider offers a TransmissionProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider offers a TransmissionProduct.'"
	 * @generated
	 */
	EList<TransmissionProduct> getTransmissionProducts();

} // TransmissionProvider
