/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.ConnectivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm#getConnectivityNode <em>Connectivity Node</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getNodeConstraintTerm()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='To be used only to constrain a quantity that cannot be associated with a terminal. For example, a registered generating unit that is not electrically connected to the network.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='To be used only to constrain a quantity that cannot be associated with a terminal. For example, a registered generating unit that is not electrically connected to the network.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='To be used only to constrain a quantity that cannot be associated with a terminal. For example, a registered generating unit that is not electrically connected to the network.' Profile\040documentation='To be used only to constrain a quantity that cannot be associated with a terminal. For example, a registered generating unit that is not electrically connected to the network.'"
 * @generated
 */
public interface NodeConstraintTerm extends ConstraintTerm {
	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConnectivityNode#getNodeConstraintTerms <em>Node Constraint Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' reference.
	 * @see #setConnectivityNode(ConnectivityNode)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getNodeConstraintTerm_ConnectivityNode()
	 * @see CIM.IEC61970.Core.ConnectivityNode#getNodeConstraintTerms
	 * @model opposite="NodeConstraintTerms"
	 * @generated
	 */
	ConnectivityNode getConnectivityNode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm#getConnectivityNode <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node</em>' reference.
	 * @see #getConnectivityNode()
	 * @generated
	 */
	void setConnectivityNode(ConnectivityNode value);

} // NodeConstraintTerm
