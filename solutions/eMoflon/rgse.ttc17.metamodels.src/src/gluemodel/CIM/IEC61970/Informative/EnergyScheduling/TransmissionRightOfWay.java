/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Wires.Line;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Right Of Way</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getTransmissionCorridor <em>Transmission Corridor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTransmissionRightOfWay()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collection of transmission lines that are close proximity to each other.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collection of transmission lines that are close proximity to each other.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of transmission lines that are close proximity to each other.' Profile\040documentation='A collection of transmission lines that are close proximity to each other.'"
 * @generated
 */
public interface TransmissionRightOfWay extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Transmission Corridor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getTransmissionRightOfWays <em>Transmission Right Of Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Corridor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Corridor</em>' reference.
	 * @see #setTransmissionCorridor(TransmissionCorridor)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTransmissionRightOfWay_TransmissionCorridor()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getTransmissionRightOfWays
	 * @model opposite="TransmissionRightOfWays"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission right-of-way is a member of a transmission corridor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission right-of-way is a member of a transmission corridor'"
	 * @generated
	 */
	TransmissionCorridor getTransmissionCorridor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getTransmissionCorridor <em>Transmission Corridor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Corridor</em>' reference.
	 * @see #getTransmissionCorridor()
	 * @generated
	 */
	void setTransmissionCorridor(TransmissionCorridor value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.Line}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.Line#getTransmissionRightOfWay <em>Transmission Right Of Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTransmissionRightOfWay_Lines()
	 * @see gluemodel.CIM.IEC61970.Wires.Line#getTransmissionRightOfWay
	 * @model opposite="TransmissionRightOfWay"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission line can be part of a transmission corridor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission line can be part of a transmission corridor'"
	 * @generated
	 */
	EList<Line> getLines();

} // TransmissionRightOfWay
