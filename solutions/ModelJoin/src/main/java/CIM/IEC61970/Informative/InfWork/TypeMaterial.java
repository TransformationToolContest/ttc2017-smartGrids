/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory;
import CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories <em>Erp Issue Inventories</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems <em>CU Material Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for a generic material item that may be used for design, work and other purposes. Any number of MaterialItems manufactured by various vendors may be used to perform this TypeMaterial.\nNote that class analagous to \"AssetModel\" is not used for material items. This is because in some cases, for example, a utility sets up a Master material record for a 3 inch long half inch diameter steel bolt and they do not necessarily care what specific supplier is providing the material item. As different vendors are used to supply the part, the Stock Code of the material item can stay the same. In other cases, each time the vendor changes, a new stock code is set up so they can track material used by vendor. Therefore a Material Item \"Model\" is not typically needed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for a generic material item that may be used for design, work and other purposes. Any number of MaterialItems manufactured by various vendors may be used to perform this TypeMaterial.\nNote that class analagous to \"AssetModel\" is not used for material items. This is because in some cases, for example, a utility sets up a Master material record for a 3 inch long half inch diameter steel bolt and they do not necessarily care what specific supplier is providing the material item. As different vendors are used to supply the part, the Stock Code of the material item can stay the same. In other cases, each time the vendor changes, a new stock code is set up so they can track material used by vendor. Therefore a Material Item \"Model\" is not typically needed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for a generic material item that may be used for design, work and other purposes. Any number of MaterialItems manufactured by various vendors may be used to perform this TypeMaterial.\nNote that class analagous to \"AssetModel\" is not used for material items. This is because in some cases, for example, a utility sets up a Master material record for a 3 inch long half inch diameter steel bolt and they do not necessarily care what specific supplier is providing the material item. As different vendors are used to supply the part, the Stock Code of the material item can stay the same. In other cases, each time the vendor changes, a new stock code is set up so they can track material used by vendor. Therefore a Material Item \"Model\" is not typically needed.' Profile\040documentation='Documentation for a generic material item that may be used for design, work and other purposes. Any number of MaterialItems manufactured by various vendors may be used to perform this TypeMaterial.\nNote that class analagous to \"AssetModel\" is not used for material items. This is because in some cases, for example, a utility sets up a Master material record for a 3 inch long half inch diameter steel bolt and they do not necessarily care what specific supplier is providing the material item. As different vendors are used to supply the part, the Stock Code of the material item can stay the same. In other cases, each time the vendor changes, a new stock code is set up so they can track material used by vendor. Therefore a Material Item \"Model\" is not typically needed.'"
 * @generated
 */
public interface TypeMaterial extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Issue Inventories</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Issue Inventories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Issue Inventories</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_ErpIssueInventories()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial
	 * @model opposite="TypeMaterial"
	 * @generated
	 */
	EList<ErpIssueInventory> getErpIssueInventories();

	/**
	 * Returns the value of the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Item</em>' attribute.
	 * @see #setStockItem(boolean)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_StockItem()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if item is a stock item (default).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if item is a stock item (default).'"
	 * @generated
	 */
	boolean isStockItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Item</em>' attribute.
	 * @see #isStockItem()
	 * @generated
	 */
	void setStockItem(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_Quantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value, unit of measure, and multiplier for the quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value, unit of measure, and multiplier for the quantity.'"
	 * @generated
	 */
	String getQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(String value);

	/**
	 * Returns the value of the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_ErpReqLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial
	 * @model opposite="TypeMaterial"
	 * @generated
	 */
	EList<ErpReqLineItem> getErpReqLineItems();

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_MaterialItems()
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial
	 * @model opposite="TypeMaterial"
	 * @generated
	 */
	EList<MaterialItem> getMaterialItems();

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see #setCostType(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_CostType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The category of cost to which this Material Item belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The category of cost to which this Material Item belongs.'"
	 * @generated
	 */
	String getCostType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(String value);

	/**
	 * Returns the value of the '<em><b>Est Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Unit Cost</em>' attribute.
	 * @see #setEstUnitCost(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_EstUnitCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The estimated unit cost of this type of material, either for a unit cost or cost per unit length. Cost is for material or asset only and does not include labor to install/construct or configure it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The estimated unit cost of this type of material, either for a unit cost or cost per unit length. Cost is for material or asset only and does not include labor to install/construct or configure it.'"
	 * @generated
	 */
	float getEstUnitCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Unit Cost</em>' attribute.
	 * @see #getEstUnitCost()
	 * @generated
	 */
	void setEstUnitCost(float value);

	/**
	 * Returns the value of the '<em><b>CU Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CUMaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Material Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial_CUMaterialItems()
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial
	 * @model opposite="TypeMaterial"
	 * @generated
	 */
	EList<CUMaterialItem> getCUMaterialItems();

} // TypeMaterial
