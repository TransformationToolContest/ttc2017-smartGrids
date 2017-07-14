/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Conductor#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getConductor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.' Profile\040documentation='Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.'"
 * @generated
 */
public interface Conductor extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getConductor_Length()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Segment length for calculating line section capabilities'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Segment length for calculating line section capabilities'"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Conductor#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

} // Conductor
