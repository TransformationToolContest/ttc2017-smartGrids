/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor;

import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getDeliveryPointFor <em>Delivery Point For</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getOfferedOn <em>Offered On</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getPointOfReceiptFor <em>Point Of Receipt For</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getFor <em>For</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getAvailTransferCapability <em>Avail Transfer Capability</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#isParallelPathFlag <em>Parallel Path Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getLocatedOn <em>Located On</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getTotalTransferCapability <em>Total Transfer Capability</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An electrical connection, link, or line consisting of one or more parallel transmission elements between two areas of the interconnected electric systems, or portions thereof. TransmissionCorridor and TransmissionRightOfWay refer to legal aspects. The TransmissionPath refers to the segments between a TransmissionProvider\'s ServicePoints.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An electrical connection, link, or line consisting of one or more parallel transmission elements between two areas of the interconnected electric systems, or portions thereof. TransmissionCorridor and TransmissionRightOfWay refer to legal aspects. The TransmissionPath refers to the segments between a TransmissionProvider\'s ServicePoints.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrical connection, link, or line consisting of one or more parallel transmission elements between two areas of the interconnected electric systems, or portions thereof. TransmissionCorridor and TransmissionRightOfWay refer to legal aspects. The TransmissionPath refers to the segments between a TransmissionProvider\'s ServicePoints.' Profile\040documentation='An electrical connection, link, or line consisting of one or more parallel transmission elements between two areas of the interconnected electric systems, or portions thereof. TransmissionCorridor and TransmissionRightOfWay refer to legal aspects. The TransmissionPath refers to the segments between a TransmissionProvider\'s ServicePoints.'"
 * @generated
 */
public interface TransmissionPath extends Element {
	/**
	 * Returns the value of the '<em><b>Delivery Point For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOD_ <em>Has APOD </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Point For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Point For</em>' reference.
	 * @see #setDeliveryPointFor(ServicePoint)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_DeliveryPointFor()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOD_
	 * @model opposite="HasAPOD_"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission path has a \"point-of-delivery\" service point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission path has a \"point-of-delivery\" service point'"
	 * @generated
	 */
	ServicePoint getDeliveryPointFor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getDeliveryPointFor <em>Delivery Point For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Point For</em>' reference.
	 * @see #getDeliveryPointFor()
	 * @generated
	 */
	void setDeliveryPointFor(ServicePoint value);

	/**
	 * Returns the value of the '<em><b>Offered On</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered On</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_OfferedOn()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffering
	 * @model opposite="Offering"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission service is offered on a transmission path.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission service is offered on a transmission path.'"
	 * @generated
	 */
	EList<TransmissionService> getOfferedOn();

	/**
	 * Returns the value of the '<em><b>Point Of Receipt For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOR_ <em>Has APOR </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Receipt For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Receipt For</em>' reference.
	 * @see #setPointOfReceiptFor(ServicePoint)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_PointOfReceiptFor()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOR_
	 * @model opposite="HasAPOR_"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission path has a \"point-of-receipt\" service point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission path has a \"point-of-receipt\" service point'"
	 * @generated
	 */
	ServicePoint getPointOfReceiptFor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getPointOfReceiptFor <em>Point Of Receipt For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Receipt For</em>' reference.
	 * @see #getPointOfReceiptFor()
	 * @generated
	 */
	void setPointOfReceiptFor(ServicePoint value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(TransmissionCorridor)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_For()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getContainedIn
	 * @model opposite="ContainedIn"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionPath is contained in a TransmissionCorridor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionPath is contained in a TransmissionCorridor.'"
	 * @generated
	 */
	TransmissionCorridor getFor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(TransmissionCorridor value);

	/**
	 * Returns the value of the '<em><b>Avail Transfer Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avail Transfer Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avail Transfer Capability</em>' attribute.
	 * @see #setAvailTransferCapability(float)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_AvailTransferCapability()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The available transmission capability of a transmission path for the reference direction'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The available transmission capability of a transmission path for the reference direction'"
	 * @generated
	 */
	float getAvailTransferCapability();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getAvailTransferCapability <em>Avail Transfer Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avail Transfer Capability</em>' attribute.
	 * @see #getAvailTransferCapability()
	 * @generated
	 */
	void setAvailTransferCapability(float value);

	/**
	 * Returns the value of the '<em><b>Parallel Path Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Path Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Path Flag</em>' attribute.
	 * @see #setParallelPathFlag(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_ParallelPathFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag which indicates if the transmission path is also a designated interconnection \"parallel path\"'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag which indicates if the transmission path is also a designated interconnection \"parallel path\"'"
	 * @generated
	 */
	boolean isParallelPathFlag();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#isParallelPathFlag <em>Parallel Path Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Path Flag</em>' attribute.
	 * @see #isParallelPathFlag()
	 * @generated
	 */
	void setParallelPathFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Located On</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct#getLocationFor <em>Location For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located On</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_LocatedOn()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProduct#getLocationFor
	 * @model opposite="LocationFor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission product is located on a transmission path.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission product is located on a transmission path.'"
	 * @generated
	 */
	EList<TransmissionProduct> getLocatedOn();

	/**
	 * Returns the value of the '<em><b>Total Transfer Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Transfer Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Transfer Capability</em>' attribute.
	 * @see #setTotalTransferCapability(float)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTransmissionPath_TotalTransferCapability()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The total transmission capability of a transmission path in the reference direction'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The total transmission capability of a transmission path in the reference direction'"
	 * @generated
	 */
	float getTotalTransferCapability();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getTotalTransferCapability <em>Total Transfer Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Transfer Capability</em>' attribute.
	 * @see #getTotalTransferCapability()
	 * @generated
	 */
	void setTotalTransferCapability(float value);

} // TransmissionPath
