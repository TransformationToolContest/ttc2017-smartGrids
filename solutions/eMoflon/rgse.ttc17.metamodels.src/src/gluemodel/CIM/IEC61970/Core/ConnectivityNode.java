/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;

import gluemodel.CIM.IEC61970.Topology.BusNameMarker;
import gluemodel.CIM.IEC61970.Topology.TopologicalNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getLossPenaltyFactors <em>Loss Penalty Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getNodeConstraintTerms <em>Node Constraint Terms</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getPnode <em>Pnode</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance.' Profile\040documentation='Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance.'"
 * @generated
 */
public interface ConnectivityNode extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node Container</em>' reference.
	 * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_ConnectivityNodeContainer()
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes
	 * @model opposite="ConnectivityNodes"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Container of this connectivity node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Container of this connectivity node.'"
	 * @generated
	 */
	ConnectivityNodeContainer getConnectivityNodeContainer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node Container</em>' reference.
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	void setConnectivityNodeContainer(ConnectivityNodeContainer value);

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_TopologicalNode()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodes
	 * @model opposite="ConnectivityNodes"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Several ConnectivityNode(s) may combine together to form a single TopologicalNode, depending on the current state of the network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Several ConnectivityNode(s) may combine together to form a single TopologicalNode, depending on the current state of the network.'"
	 * @generated
	 */
	TopologicalNode getTopologicalNode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	void setTopologicalNode(TopologicalNode value);

	/**
	 * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Name Marker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Name Marker</em>' reference.
	 * @see #setBusNameMarker(BusNameMarker)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_BusNameMarker()
	 * @see gluemodel.CIM.IEC61970.Topology.BusNameMarker#getConnectivityNode
	 * @model opposite="ConnectivityNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The associated name of the bus (TopologicalNode) containing the ConnectivityNode is derived by an algorithm that uses the bus name marker.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The associated name of the bus (TopologicalNode) containing the ConnectivityNode is derived by an algorithm that uses the bus name marker.'"
	 * @generated
	 */
	BusNameMarker getBusNameMarker();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getBusNameMarker <em>Bus Name Marker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Name Marker</em>' reference.
	 * @see #getBusNameMarker()
	 * @generated
	 */
	void setBusNameMarker(BusNameMarker value);

	/**
	 * Returns the value of the '<em><b>Loss Penalty Factors</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss Penalty Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Penalty Factors</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_LossPenaltyFactors()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getConnectivityNodes
	 * @model opposite="ConnectivityNodes"
	 * @generated
	 */
	EList<LossPenaltyFactor> getLossPenaltyFactors();

	/**
	 * Returns the value of the '<em><b>Node Constraint Terms</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Constraint Terms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Constraint Terms</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_NodeConstraintTerms()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm#getConnectivityNode
	 * @model opposite="ConnectivityNode"
	 * @generated
	 */
	EList<NodeConstraintTerm> getNodeConstraintTerms();

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_Terminals()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getConnectivityNode
	 * @model opposite="ConnectivityNode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 * @generated
	 */
	EList<Terminal> getTerminals();

	/**
	 * Returns the value of the '<em><b>Pnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnode</em>' reference.
	 * @see #setPnode(Pnode)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNode_Pnode()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getConnectivityNode
	 * @model opposite="ConnectivityNode"
	 * @generated
	 */
	Pnode getPnode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getPnode <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnode</em>' reference.
	 * @see #getPnode()
	 * @generated
	 */
	void setPnode(Pnode value);

} // ConnectivityNode
