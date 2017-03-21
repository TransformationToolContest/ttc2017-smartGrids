/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Group Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getRTOs <em>RT Os</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceGroupReq()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ancillary service requirements for a market.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Ancillary service requirements for a market.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ancillary service requirements for a market.' Profile\040documentation='Ancillary service requirements for a market.'"
 * @generated
 */
public interface ResourceGroupReq extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getResourceGroupReqs <em>Resource Group Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group</em>' reference.
	 * @see #setResourceGroup(ResourceGroup)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceGroupReq_ResourceGroup()
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getResourceGroupReqs
	 * @model opposite="ResourceGroupReqs"
	 * @generated
	 */
	ResourceGroup getResourceGroup();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getResourceGroup <em>Resource Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group</em>' reference.
	 * @see #getResourceGroup()
	 * @generated
	 */
	void setResourceGroup(ResourceGroup value);

	/**
	 * Returns the value of the '<em><b>RT Os</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.RTO}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RTO#getResourceGroupReqs <em>Resource Group Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RT Os</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RT Os</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceGroupReq_RTOs()
	 * @see CIM.IEC61970.Informative.MarketOperations.RTO#getResourceGroupReqs
	 * @model opposite="ResourceGroupReqs"
	 * @generated
	 */
	EList<RTO> getRTOs();

} // ResourceGroupReq
