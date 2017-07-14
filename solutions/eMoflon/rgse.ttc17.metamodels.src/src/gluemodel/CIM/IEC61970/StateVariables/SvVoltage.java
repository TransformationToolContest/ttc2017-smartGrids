/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import gluemodel.CIM.IEC61970.Topology.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvVoltage()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variable for voltage.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='State variable for voltage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variable for voltage.' Profile\040documentation='State variable for voltage.'"
 * @generated
 */
public interface SvVoltage extends StateVariable {
	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvVoltage_V()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The voltage magnitude of the topological node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The voltage magnitude of the topological node.'"
	 * @generated
	 */
	float getV();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(float value);

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvVoltage_TopologicalNode()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvVoltage
	 * @model opposite="SvVoltage"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological node associated with the voltage state.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological node associated with the voltage state.'"
	 * @generated
	 */
	TopologicalNode getTopologicalNode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	void setTopologicalNode(TopologicalNode value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvVoltage_Angle()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AngleRadians" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The voltage angle in radians of the topological node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The voltage angle in radians of the topological node.'"
	 * @generated
	 */
	float getAngle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(float value);

} // SvVoltage
