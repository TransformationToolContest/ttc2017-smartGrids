/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.ConnectivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss Penalty Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getLossFactor <em>Loss Factor</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLossPenaltyFactor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Loss penalty factor applied to a ConnectivityNode for a given time interval.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Loss penalty factor applied to a ConnectivityNode for a given time interval.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Loss penalty factor applied to a ConnectivityNode for a given time interval.' Profile\040documentation='Loss penalty factor applied to a ConnectivityNode for a given time interval.'"
 * @generated
 */
public interface LossPenaltyFactor extends MarketFactors {
	/**
	 * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.ConnectivityNode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConnectivityNode#getLossPenaltyFactors <em>Loss Penalty Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Nodes</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLossPenaltyFactor_ConnectivityNodes()
	 * @see CIM.IEC61970.Core.ConnectivityNode#getLossPenaltyFactors
	 * @model opposite="LossPenaltyFactors"
	 * @generated
	 */
	EList<ConnectivityNode> getConnectivityNodes();

	/**
	 * Returns the value of the '<em><b>Loss Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Factor</em>' attribute.
	 * @see #setLossFactor(Object)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLossPenaltyFactor_LossFactor()
	 * @model dataType="CIM.PenaltyFactor" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Loss penalty factor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Loss penalty factor.'"
	 * @generated
	 */
	Object getLossFactor();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getLossFactor <em>Loss Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Factor</em>' attribute.
	 * @see #getLossFactor()
	 * @generated
	 */
	void setLossFactor(Object value);

} // LossPenaltyFactor
