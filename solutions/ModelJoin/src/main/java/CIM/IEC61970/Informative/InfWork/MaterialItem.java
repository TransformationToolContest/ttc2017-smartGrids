/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount;
import CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts <em>Erp Inventory Counts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getUsages <em>Usages</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The physical consumable supply used for work and other purposes. It includes items such as nuts, bolts, brackets, glue, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The physical consumable supply used for work and other purposes. It includes items such as nuts, bolts, brackets, glue, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The physical consumable supply used for work and other purposes. It includes items such as nuts, bolts, brackets, glue, etc.' Profile\040documentation='The physical consumable supply used for work and other purposes. It includes items such as nuts, bolts, brackets, glue, etc.'"
 * @generated
 */
public interface MaterialItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_ErpPOLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem
	 * @model opposite="MaterialItem"
	 * @generated
	 */
	EList<ErpPOLineItem> getErpPOLineItems();

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_TypeMaterial()
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems
	 * @model opposite="MaterialItems"
	 * @generated
	 */
	TypeMaterial getTypeMaterial();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Material</em>' reference.
	 * @see #getTypeMaterial()
	 * @generated
	 */
	void setTypeMaterial(TypeMaterial value);

	/**
	 * Returns the value of the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory Counts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory Counts</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_ErpInventoryCounts()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem
	 * @model opposite="MaterialItem"
	 * @generated
	 */
	EList<ErpInventoryCount> getErpInventoryCounts();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Usage}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_Usages()
	 * @see CIM.IEC61970.Informative.InfWork.Usage#getMaterialItem
	 * @model opposite="MaterialItem"
	 * @generated
	 */
	EList<Usage> getUsages();

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_WorkCostDetail()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems
	 * @model opposite="MaterialItems"
	 * @generated
	 */
	WorkCostDetail getWorkCostDetail();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	void setWorkCostDetail(WorkCostDetail value);

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_WorkTask()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getMaterialItems
	 * @model opposite="MaterialItems"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #setAccount(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_Account()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The account to which this actual material item is charged.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The account to which this actual material item is charged.'"
	 * @generated
	 */
	String getAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(String value);

	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' attribute.
	 * @see #setCostDescription(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_CostDescription()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of the cost.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of the cost.'"
	 * @generated
	 */
	String getCostDescription();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' attribute.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_Quantity()
	 * @model dataType="CIM.IEC61970.Domain.IntegerQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity of material used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity of material used.'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_CostType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The category of cost to which this Material Item belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The category of cost to which this Material Item belongs.'"
	 * @generated
	 */
	String getCostType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(String value);

	/**
	 * Returns the value of the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref ID</em>' attribute.
	 * @see #setExternalRefID(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_ExternalRefID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='External reference identifier for this actual material item such as a purchase order number, a serial number, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='External reference identifier for this actual material item such as a purchase order number, a serial number, etc.'"
	 * @generated
	 */
	String getExternalRefID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ref ID</em>' attribute.
	 * @see #getExternalRefID()
	 * @generated
	 */
	void setExternalRefID(String value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delv Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delv Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_ErpRecDelvLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems
	 * @model opposite="MaterialItems"
	 * @generated
	 */
	EList<ErpRecDelvLineItem> getErpRecDelvLineItems();

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_DesignLocation()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems
	 * @model opposite="MaterialItems"
	 * @generated
	 */
	DesignLocation getDesignLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	void setDesignLocation(DesignLocation value);

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_ActualCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The actual cost of this particular material in this particular quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The actual cost of this particular material in this particular quantity.'"
	 * @generated
	 */
	float getActualCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #getActualCost()
	 * @generated
	 */
	void setActualCost(float value);

	/**
	 * Returns the value of the '<em><b>Material Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Code</em>' attribute.
	 * @see #setMaterialCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem_MaterialCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for material.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for material.'"
	 * @generated
	 */
	String getMaterialCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Code</em>' attribute.
	 * @see #getMaterialCode()
	 * @generated
	 */
	void setMaterialCode(String value);

} // MaterialItem
