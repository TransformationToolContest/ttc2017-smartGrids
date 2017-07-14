/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Corridor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getTransmissionRightOfWays <em>Transmission Right Of Ways</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getContainedIn <em>Contained In</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTransmissionCorridor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A corridor containing one or more rights of way'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A corridor containing one or more rights of way'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A corridor containing one or more rights of way' Profile\040documentation='A corridor containing one or more rights of way'"
 * @generated
 */
public interface TransmissionCorridor extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Transmission Right Of Ways</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getTransmissionCorridor <em>Transmission Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Right Of Ways</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Right Of Ways</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTransmissionCorridor_TransmissionRightOfWays()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getTransmissionCorridor
	 * @model opposite="TransmissionCorridor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission right-of-way is a member of a transmission corridor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission right-of-way is a member of a transmission corridor'"
	 * @generated
	 */
	EList<TransmissionRightOfWay> getTransmissionRightOfWays();

	/**
	 * Returns the value of the '<em><b>Contained In</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTransmissionCorridor_ContainedIn()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getFor
	 * @model opposite="For"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionPath is contained in a TransmissionCorridor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionPath is contained in a TransmissionCorridor.'"
	 * @generated
	 */
	EList<TransmissionPath> getContainedIn();

} // TransmissionCorridor
