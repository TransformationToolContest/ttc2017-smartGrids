/**
 */
package CIM.IEC61970.StateVariables;

import CIM.IEC61970.Topology.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvInjection()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Injection state variable.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Injection state variable.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Injection state variable.' Profile\040documentation='Injection state variable.'"
 * @generated
 */
public interface SvInjection extends StateVariable {
	/**
	 * Returns the value of the '<em><b>QNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QNet Injection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QNet Injection</em>' attribute.
	 * @see #setQNetInjection(float)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvInjection_QNetInjection()
	 * @model dataType="CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reactive power injected into the bus at this location. Positive sign means injection into the bus.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reactive power injected into the bus at this location. Positive sign means injection into the bus.'"
	 * @generated
	 */
	float getQNetInjection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QNet Injection</em>' attribute.
	 * @see #getQNetInjection()
	 * @generated
	 */
	void setQNetInjection(float value);

	/**
	 * Returns the value of the '<em><b>PNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PNet Injection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PNet Injection</em>' attribute.
	 * @see #setPNetInjection(float)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvInjection_PNetInjection()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The active power injected into the bus at this location.  Positive sign means injection into the bus.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The active power injected into the bus at this location.  Positive sign means injection into the bus.'"
	 * @generated
	 */
	float getPNetInjection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PNet Injection</em>' attribute.
	 * @see #getPNetInjection()
	 * @generated
	 */
	void setPNetInjection(float value);

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Topology.TopologicalNode#getSvInjection <em>Sv Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvInjection_TopologicalNode()
	 * @see CIM.IEC61970.Topology.TopologicalNode#getSvInjection
	 * @model opposite="SvInjection"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological node associated with the state injection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological node associated with the state injection.'"
	 * @generated
	 */
	TopologicalNode getTopologicalNode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	void setTopologicalNode(TopologicalNode value);

} // SvInjection
