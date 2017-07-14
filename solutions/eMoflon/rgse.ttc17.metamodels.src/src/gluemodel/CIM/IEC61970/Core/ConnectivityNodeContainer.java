/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.IEC61970.Topology.TopologicalNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNodeContainer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A base class for all objects that may contain ConnectivityNodes or TopologicalNodes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A base class for all objects that may contain ConnectivityNodes or TopologicalNodes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A base class for all objects that may contain ConnectivityNodes or TopologicalNodes.' Profile\040documentation='A base class for all objects that may contain ConnectivityNodes or TopologicalNodes.'"
 * @generated
 */
public interface ConnectivityNodeContainer extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.ConnectivityNode}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Nodes</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNodeContainer_ConnectivityNodes()
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer
	 * @model opposite="ConnectivityNodeContainer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Connectivity nodes contained by this container.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Connectivity nodes contained by this container.'"
	 * @generated
	 */
	EList<ConnectivityNode> getConnectivityNodes();

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getConnectivityNodeContainer_TopologicalNode()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer
	 * @model opposite="ConnectivityNodeContainer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological nodes which belong to this connectivity node container.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological nodes which belong to this connectivity node container.'"
	 * @generated
	 */
	EList<TopologicalNode> getTopologicalNode();

} // ConnectivityNodeContainer
