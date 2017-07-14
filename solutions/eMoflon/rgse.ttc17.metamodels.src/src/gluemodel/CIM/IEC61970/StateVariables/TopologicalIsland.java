/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Topology.TopologicalNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topological Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getTopologicalIsland()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An electrically connected subset of the network. Topological islands can change as the current network state changes (i.e. switch or Terminal.connected status changes).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An electrically connected subset of the network. Topological islands can change as the current network state changes (i.e. switch or Terminal.connected status changes).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrically connected subset of the network. Topological islands can change as the current network state changes (i.e. switch or Terminal.connected status changes).' Profile\040documentation='An electrically connected subset of the network. Topological islands can change as the current network state changes (i.e. switch or Terminal.connected status changes).'"
 * @generated
 */
public interface TopologicalIsland extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Angle Ref Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland <em>Angle Ref Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Ref Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Ref Topological Node</em>' reference.
	 * @see #setAngleRef_TopologicalNode(TopologicalNode)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getTopologicalIsland_AngleRef_TopologicalNode()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland
	 * @model opposite="AngleRef_TopologicalIsland"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The angle reference for the island.   Normally there is one TopologicalNode that is selected as the angle reference for each island.   Other reference schemes exist, so the association is optional.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The angle reference for the island.   Normally there is one TopologicalNode that is selected as the angle reference for each island.   Other reference schemes exist, so the association is optional.'"
	 * @generated
	 */
	TopologicalNode getAngleRef_TopologicalNode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Ref Topological Node</em>' reference.
	 * @see #getAngleRef_TopologicalNode()
	 * @generated
	 */
	void setAngleRef_TopologicalNode(TopologicalNode value);

	/**
	 * Returns the value of the '<em><b>Topological Nodes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Nodes</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getTopologicalIsland_TopologicalNodes()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTopologicalIsland
	 * @model opposite="TopologicalIsland"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A topological node belongs to a topological island'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A topological node belongs to a topological island'"
	 * @generated
	 */
	EList<TopologicalNode> getTopologicalNodes();

} // TopologicalIsland
