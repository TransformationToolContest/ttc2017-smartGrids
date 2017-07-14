/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import gluemodel.CIM.IEC61970.Topology.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Short Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variable for short circuit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='State variable for short circuit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variable for short circuit.' Profile\040documentation='State variable for short circuit.'"
 * @generated
 */
public interface SvShortCircuit extends StateVariable {
	/**
	 * Returns the value of the '<em><b>R0 Per R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0 Per R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0 Per R</em>' attribute.
	 * @see #setR0PerR(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit_R0PerR()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ratio of zero sequence resistance to positive sequence resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ratio of zero sequence resistance to positive sequence resistance.'"
	 * @generated
	 */
	float getR0PerR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0 Per R</em>' attribute.
	 * @see #getR0PerR()
	 * @generated
	 */
	void setR0PerR(float value);

	/**
	 * Returns the value of the '<em><b>SShort Circuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SShort Circuit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SShort Circuit</em>' attribute.
	 * @see #setSShortCircuit(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit_SShortCircuit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The short circuit apparent power drawn at this node when faulted.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The short circuit apparent power drawn at this node when faulted.'"
	 * @generated
	 */
	float getSShortCircuit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SShort Circuit</em>' attribute.
	 * @see #getSShortCircuit()
	 * @generated
	 */
	void setSShortCircuit(float value);

	/**
	 * Returns the value of the '<em><b>XPer R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPer R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPer R</em>' attribute.
	 * @see #setXPerR(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit_XPerR()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio of positive sequence reactance per postive sequence resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio of positive sequence reactance per postive sequence resistance.'"
	 * @generated
	 */
	float getXPerR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPer R</em>' attribute.
	 * @see #getXPerR()
	 * @generated
	 */
	void setXPerR(float value);

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvShortCircuit <em>Sv Short Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit_TopologicalNode()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvShortCircuit
	 * @model opposite="SvShortCircuit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological node associated with the short circuit state.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological node associated with the short circuit state.'"
	 * @generated
	 */
	TopologicalNode getTopologicalNode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	void setTopologicalNode(TopologicalNode value);

	/**
	 * Returns the value of the '<em><b>X0 Per X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0 Per X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0 Per X</em>' attribute.
	 * @see #setX0PerX(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit_X0PerX()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ratio of zero sequence reactance per positive sequence reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ratio of zero sequence reactance per positive sequence reactance.'"
	 * @generated
	 */
	float getX0PerX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0 Per X</em>' attribute.
	 * @see #getX0PerX()
	 * @generated
	 */
	void setX0PerX(float value);

} // SvShortCircuit
