/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer;
import gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getCustomerConsumer <em>Customer Consumer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getTransmissionProvider <em>Transmission Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOR_ <em>Has APOR </em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getGenerationProvider <em>Generation Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getDeclare_TiePoint <em>Declare Tie Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOD_ <em>Has APOD </em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getEnergyProducts <em>Energy Products</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getMemberOf <em>Member Of</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Each ServicePoint is contained within (or on the boundary of) an ElectronicIinterchangeArea. ServicePoints are defined termination points of a transmission path (down to distribution level or to a customer - generation or consumption or both).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Each ServicePoint is contained within (or on the boundary of) an ElectronicIinterchangeArea. ServicePoints are defined termination points of a transmission path (down to distribution level or to a customer - generation or consumption or both).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Each ServicePoint is contained within (or on the boundary of) an ElectronicIinterchangeArea. ServicePoints are defined termination points of a transmission path (down to distribution level or to a customer - generation or consumption or both).' Profile\040documentation='Each ServicePoint is contained within (or on the boundary of) an ElectronicIinterchangeArea. ServicePoints are defined termination points of a transmission path (down to distribution level or to a customer - generation or consumption or both).'"
 * @generated
 */
public interface ServicePoint extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Customer Consumer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Consumer</em>' reference.
	 * @see #setCustomerConsumer(CustomerConsumer)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_CustomerConsumer()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer#getServicePoint
	 * @model opposite="ServicePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A CustomerConsumer may have one or more ServicePoints.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A CustomerConsumer may have one or more ServicePoints.'"
	 * @generated
	 */
	CustomerConsumer getCustomerConsumer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getCustomerConsumer <em>Customer Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Consumer</em>' reference.
	 * @see #getCustomerConsumer()
	 * @generated
	 */
	void setCustomerConsumer(CustomerConsumer value);

	/**
	 * Returns the value of the '<em><b>Transmission Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Provider</em>' reference.
	 * @see #setTransmissionProvider(TransmissionProvider)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_TransmissionProvider()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider#getServicePoint
	 * @model opposite="ServicePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider registers one or more ServicePoints.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider registers one or more ServicePoints.'"
	 * @generated
	 */
	TransmissionProvider getTransmissionProvider();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getTransmissionProvider <em>Transmission Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Provider</em>' reference.
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	void setTransmissionProvider(TransmissionProvider value);

	/**
	 * Returns the value of the '<em><b>Has APOR </b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getPointOfReceiptFor <em>Point Of Receipt For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has APOR </em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has APOR </em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_HasAPOR_()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getPointOfReceiptFor
	 * @model opposite="PointOfReceiptFor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission path has a \"point-of-receipt\" service point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission path has a \"point-of-receipt\" service point'"
	 * @generated
	 */
	EList<TransmissionPath> getHasAPOR_();

	/**
	 * Returns the value of the '<em><b>Generation Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Provider</em>' reference.
	 * @see #setGenerationProvider(GenerationProvider)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_GenerationProvider()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider#getServicePoint
	 * @model opposite="ServicePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GenerationProvider has one or more ServicePoints where energy is injected into the network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GenerationProvider has one or more ServicePoints where energy is injected into the network.'"
	 * @generated
	 */
	GenerationProvider getGenerationProvider();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getGenerationProvider <em>Generation Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Provider</em>' reference.
	 * @see #getGenerationProvider()
	 * @generated
	 */
	void setGenerationProvider(GenerationProvider value);

	/**
	 * Returns the value of the '<em><b>Declare Tie Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getDeclared_ServicePoint <em>Declared Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declare Tie Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare Tie Point</em>' reference.
	 * @see #setDeclare_TiePoint(TiePoint)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_Declare_TiePoint()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getDeclared_ServicePoint
	 * @model opposite="Declared_ServicePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A tiepoint may be declared as a service point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A tiepoint may be declared as a service point.'"
	 * @generated
	 */
	TiePoint getDeclare_TiePoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getDeclare_TiePoint <em>Declare Tie Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare Tie Point</em>' reference.
	 * @see #getDeclare_TiePoint()
	 * @generated
	 */
	void setDeclare_TiePoint(TiePoint value);

	/**
	 * Returns the value of the '<em><b>Has APOD </b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getDeliveryPointFor <em>Delivery Point For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has APOD </em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has APOD </em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_HasAPOD_()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getDeliveryPointFor
	 * @model opposite="DeliveryPointFor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission path has a \"point-of-delivery\" service point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission path has a \"point-of-delivery\" service point'"
	 * @generated
	 */
	EList<TransmissionPath> getHasAPOD_();

	/**
	 * Returns the value of the '<em><b>Energy Products</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Products</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_EnergyProducts()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getServicePoint
	 * @model opposite="ServicePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyProduct injects energy into a service point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyProduct injects energy into a service point.'"
	 * @generated
	 */
	EList<EnergyProduct> getEnergyProducts();

	/**
	 * Returns the value of the '<em><b>Member Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of</em>' reference.
	 * @see #setMemberOf(SubControlArea)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getServicePoint_MemberOf()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getPartOf
	 * @model opposite="PartOf"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission path\'s service point is part of an interchange area'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission path\'s service point is part of an interchange area'"
	 * @generated
	 */
	SubControlArea getMemberOf();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getMemberOf <em>Member Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of</em>' reference.
	 * @see #getMemberOf()
	 * @generated
	 */
	void setMemberOf(SubControlArea value);

} // ServicePoint
