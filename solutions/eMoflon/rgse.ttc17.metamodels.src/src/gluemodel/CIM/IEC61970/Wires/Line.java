/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.EquipmentContainer;
import gluemodel.CIM.IEC61970.Core.SubGeographicalRegion;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Line#getTransmissionRightOfWay <em>Transmission Right Of Way</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Line#getFlowgates <em>Flowgates</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Line#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getLine()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains equipment beyond a substation belonging to a power transmission line.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Contains equipment beyond a substation belonging to a power transmission line.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains equipment beyond a substation belonging to a power transmission line.' Profile\040documentation='Contains equipment beyond a substation belonging to a power transmission line.'"
 * @generated
 */
public interface Line extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Transmission Right Of Way</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Right Of Way</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Right Of Way</em>' reference.
	 * @see #setTransmissionRightOfWay(TransmissionRightOfWay)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getLine_TransmissionRightOfWay()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getLines
	 * @model opposite="Lines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission line can be part of a transmission corridor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission line can be part of a transmission corridor'"
	 * @generated
	 */
	TransmissionRightOfWay getTransmissionRightOfWay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Line#getTransmissionRightOfWay <em>Transmission Right Of Way</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Right Of Way</em>' reference.
	 * @see #getTransmissionRightOfWay()
	 * @generated
	 */
	void setTransmissionRightOfWay(TransmissionRightOfWay value);

	/**
	 * Returns the value of the '<em><b>Flowgates</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgates</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getLine_Flowgates()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getLines
	 * @model opposite="Lines"
	 * @generated
	 */
	EList<Flowgate> getFlowgates();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(SubGeographicalRegion)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getLine_Region()
	 * @see gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getLines
	 * @model opposite="Lines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Line can be contained by a SubGeographical Region.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Line can be contained by a SubGeographical Region.'"
	 * @generated
	 */
	SubGeographicalRegion getRegion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Line#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(SubGeographicalRegion value);

} // Line
