/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import CIM.IEC61970.Informative.InfWork.TypeMaterial;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Issue Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpIssueInventory()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Can be used to request an application to process an issue or request information about an issue.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Can be used to request an application to process an issue or request information about an issue.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Can be used to request an application to process an issue or request information about an issue.' Profile\040documentation='Can be used to request an application to process an issue or request information about an issue.'"
 * @generated
 */
public interface ErpIssueInventory extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpIssueInventory_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories <em>Erp Issue Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpIssueInventory_TypeMaterial()
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories
	 * @model opposite="ErpIssueInventories"
	 * @generated
	 */
	TypeMaterial getTypeMaterial();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Material</em>' reference.
	 * @see #getTypeMaterial()
	 * @generated
	 */
	void setTypeMaterial(TypeMaterial value);

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpInventoryIssues <em>Erp Inventory Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpIssueInventory_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpInventoryIssues
	 * @model opposite="ErpInventoryIssues"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

} // ErpIssueInventory
