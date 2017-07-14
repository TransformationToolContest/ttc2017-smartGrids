/**
 */
package gluemodel.CIM.IEC61970.Topology;

import gluemodel.CIM.IEC61970.Core.BaseVoltage;
import gluemodel.CIM.IEC61970.Core.ConnectivityNode;
import gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.ReportingGroup;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.CIM.IEC61970.StateVariables.SvInjection;
import gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit;
import gluemodel.CIM.IEC61970.StateVariables.SvVoltage;
import gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvShortCircuit <em>Sv Short Circuit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For a detailed substation model a TopologicalNode is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes changes as the current network state changes (i.e., switches, breakers, etc. change state).\nFor a planning model switch statuses are not used to form TopologicalNodes. Instead they are manually created or deleted in a model builder tool. TopologialNodes maintained this way are also called \"busses\".'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='For a detailed substation model a TopologicalNode is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes changes as the current network state changes (i.e., switches, breakers, etc. change state).\nFor a planning model switch statuses are not used to form TopologicalNodes. Instead they are manually created or deleted in a model builder tool. TopologialNodes maintained this way are also called \"busses\".'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a detailed substation model a TopologicalNode is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes changes as the current network state changes (i.e., switches, breakers, etc. change state).\nFor a planning model switch statuses are not used to form TopologicalNodes. Instead they are manually created or deleted in a model builder tool. TopologialNodes maintained this way are also called \"busses\".' Profile\040documentation='For a detailed substation model a TopologicalNode is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes changes as the current network state changes (i.e., switches, breakers, etc. change state).\nFor a planning model switch statuses are not used to form TopologicalNodes. Instead they are manually created or deleted in a model builder tool. TopologialNodes maintained this way are also called \"busses\".'"
 * @generated
 */
public interface TopologicalNode extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference.
	 * @see #setReportingGroup(ReportingGroup)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_ReportingGroup()
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reporting group to which the topological node belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reporting group to which the topological node belongs.'"
	 * @generated
	 */
	ReportingGroup getReportingGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Group</em>' reference.
	 * @see #getReportingGroup()
	 * @generated
	 */
	void setReportingGroup(ReportingGroup value);

	/**
	 * Returns the value of the '<em><b>Topological Island</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Island</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Island</em>' reference.
	 * @see #setTopologicalIsland(TopologicalIsland)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_TopologicalIsland()
	 * @see gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes
	 * @model opposite="TopologicalNodes"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A topological node belongs to a topological island'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A topological node belongs to a topological island'"
	 * @generated
	 */
	TopologicalIsland getTopologicalIsland();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Island</em>' reference.
	 * @see #getTopologicalIsland()
	 * @generated
	 */
	void setTopologicalIsland(TopologicalIsland value);

	/**
	 * Returns the value of the '<em><b>Sv Injection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Injection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Injection</em>' reference.
	 * @see #setSvInjection(SvInjection)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_SvInjection()
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvInjection#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The injection state associated with the topological node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The injection state associated with the topological node.'"
	 * @generated
	 */
	SvInjection getSvInjection();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Injection</em>' reference.
	 * @see #getSvInjection()
	 * @generated
	 */
	void setSvInjection(SvInjection value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminals associated with the topological node.   This can be used as an alternative to the connectivity node path to terminal, thus making it unneccesary to model connedtivity nodes in some cases.   Note that the if connectivity nodes are in the model, this association would proably not be used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminals associated with the topological node.   This can be used as an alternative to the connectivity node path to terminal, thus making it unneccesary to model connedtivity nodes in some cases.   Note that the if connectivity nodes are in the model, this association would proably not be used.'"
	 * @generated
	 */
	EList<Terminal> getTerminal();

	/**
	 * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node Container</em>' reference.
	 * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_ConnectivityNodeContainer()
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The connectivity node container to which the toplogical node belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The connectivity node container to which the toplogical node belongs.'"
	 * @generated
	 */
	ConnectivityNodeContainer getConnectivityNodeContainer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node Container</em>' reference.
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	void setConnectivityNodeContainer(ConnectivityNodeContainer value);

	/**
	 * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.ConnectivityNode}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Nodes</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_ConnectivityNodes()
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Several ConnectivityNode(s) may combine together to form a single TopologicalNode, depending on the current state of the network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Several ConnectivityNode(s) may combine together to form a single TopologicalNode, depending on the current state of the network.'"
	 * @generated
	 */
	EList<ConnectivityNode> getConnectivityNodes();

	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_BaseVoltage()
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The base voltage of the topologocial node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The base voltage of the topologocial node.'"
	 * @generated
	 */
	BaseVoltage getBaseVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	void setBaseVoltage(BaseVoltage value);

	/**
	 * Returns the value of the '<em><b>Sv Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Voltage</em>' reference.
	 * @see #setSvVoltage(SvVoltage)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_SvVoltage()
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The state voltage associated with the topological node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The state voltage associated with the topological node.'"
	 * @generated
	 */
	SvVoltage getSvVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Voltage</em>' reference.
	 * @see #getSvVoltage()
	 * @generated
	 */
	void setSvVoltage(SvVoltage value);

	/**
	 * Returns the value of the '<em><b>Sv Short Circuit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Short Circuit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Short Circuit</em>' reference.
	 * @see #setSvShortCircuit(SvShortCircuit)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_SvShortCircuit()
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode
	 * @model opposite="TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The short circuit state associated with the topological node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The short circuit state associated with the topological node.'"
	 * @generated
	 */
	SvShortCircuit getSvShortCircuit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvShortCircuit <em>Sv Short Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Short Circuit</em>' reference.
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	void setSvShortCircuit(SvShortCircuit value);

	/**
	 * Returns the value of the '<em><b>Angle Ref Topological Island</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Ref Topological Island</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Ref Topological Island</em>' reference.
	 * @see #setAngleRef_TopologicalIsland(TopologicalIsland)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getTopologicalNode_AngleRef_TopologicalIsland()
	 * @see gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode
	 * @model opposite="AngleRef_TopologicalNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The island for which the node is an angle reference.   Normally there is one angle reference node for each island.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The island for which the node is an angle reference.   Normally there is one angle reference node for each island.'"
	 * @generated
	 */
	TopologicalIsland getAngleRef_TopologicalIsland();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Ref Topological Island</em>' reference.
	 * @see #getAngleRef_TopologicalIsland()
	 * @generated
	 */
	void setAngleRef_TopologicalIsland(TopologicalIsland value);

} // TopologicalNode
