/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RTO#getMarkets <em>Markets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraints <em>Security Constraints</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RTO#getResourceGroupReqs <em>Resource Group Reqs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraintsLinear <em>Security Constraints Linear</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RTO#getPnodes <em>Pnodes</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRTO()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Regional transmission operator.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Regional transmission operator.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Regional transmission operator.' Profile\040documentation='Regional transmission operator.'"
 * @generated
 */
public interface RTO extends ErpOrganisation {
	/**
	 * Returns the value of the '<em><b>Markets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Market}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Market#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markets</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRTO_Markets()
	 * @see CIM.IEC61970.Informative.MarketOperations.Market#getRTO
	 * @model opposite="RTO"
	 * @generated
	 */
	EList<Market> getMarkets();

	/**
	 * Returns the value of the '<em><b>Security Constraints</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraints}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraints</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRTO_SecurityConstraints()
	 * @see CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getRTO
	 * @model opposite="RTO"
	 * @generated
	 */
	EList<SecurityConstraints> getSecurityConstraints();

	/**
	 * Returns the value of the '<em><b>Resource Group Reqs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getRTOs <em>RT Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group Reqs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group Reqs</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRTO_ResourceGroupReqs()
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getRTOs
	 * @model opposite="RTOs"
	 * @generated
	 */
	EList<ResourceGroupReq> getResourceGroupReqs();

	/**
	 * Returns the value of the '<em><b>Security Constraints Linear</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraints Linear</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraints Linear</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRTO_SecurityConstraintsLinear()
	 * @see CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getRTO
	 * @model opposite="RTO"
	 * @generated
	 */
	EList<SecurityConstraintSum> getSecurityConstraintsLinear();

	/**
	 * Returns the value of the '<em><b>Pnodes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Pnode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnodes</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRTO_Pnodes()
	 * @see CIM.IEC61970.Informative.MarketOperations.Pnode#getRTO
	 * @model opposite="RTO"
	 * @generated
	 */
	EList<Pnode> getPnodes();

} // RTO
