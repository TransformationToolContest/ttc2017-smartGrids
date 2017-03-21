/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getResourceGroupReqs <em>Resource Group Reqs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getRegisteredResources <em>Registered Resources</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A logical grouping of resources that are used to model location of types of requirements for ancillary services such as spinning reserve zones, regulation zones, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A logical grouping of resources that are used to model location of types of requirements for ancillary services such as spinning reserve zones, regulation zones, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A logical grouping of resources that are used to model location of types of requirements for ancillary services such as spinning reserve zones, regulation zones, etc.' Profile\040documentation='A logical grouping of resources that are used to model location of types of requirements for ancillary services such as spinning reserve zones, regulation zones, etc.'"
 * @generated
 */
public interface ResourceGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Resource Group Reqs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group Reqs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group Reqs</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceGroup_ResourceGroupReqs()
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getResourceGroup
	 * @model opposite="ResourceGroup"
	 * @generated
	 */
	EList<ResourceGroupReq> getResourceGroupReqs();

	/**
	 * Returns the value of the '<em><b>Registered Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getResourceGroups <em>Resource Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Resources</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceGroup_RegisteredResources()
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getResourceGroups
	 * @model opposite="ResourceGroups"
	 * @generated
	 */
	EList<RegisteredResource> getRegisteredResources();

} // ResourceGroup
