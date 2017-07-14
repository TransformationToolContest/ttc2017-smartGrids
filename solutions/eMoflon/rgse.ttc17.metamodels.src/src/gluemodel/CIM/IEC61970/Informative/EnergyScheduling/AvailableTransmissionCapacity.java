/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61970.Core.Curve;

import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Transmission Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity#getScheduleFor <em>Schedule For</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAvailableTransmissionCapacity()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount of possible flow by direction.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Amount of possible flow by direction.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount of possible flow by direction.' Profile\040documentation='Amount of possible flow by direction.'"
 * @generated
 */
public interface AvailableTransmissionCapacity extends Curve {
	/**
	 * Returns the value of the '<em><b>Schedule For</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getScheduledBy <em>Scheduled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule For</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAvailableTransmissionCapacity_ScheduleFor()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getScheduledBy
	 * @model opposite="ScheduledBy"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission schedule posts the available transmission capacity for a transmission line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission schedule posts the available transmission capacity for a transmission line.'"
	 * @generated
	 */
	EList<TransmissionService> getScheduleFor();

} // AvailableTransmissionCapacity
