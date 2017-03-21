/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import CIM.IEC61970.Informative.InfWork.TypeMaterial;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Req Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information that describes a requested item and its attributes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information that describes a requested item and its attributes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information that describes a requested item and its attributes.' Profile\040documentation='Information that describes a requested item and its attributes.'"
 * @generated
 */
public interface ErpReqLineItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_DeliveryDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 * @generated
	 */
	String getDeliveryDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(String value);

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_TypeMaterial()
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems
	 * @model opposite="ErpReqLineItems"
	 * @generated
	 */
	TypeMaterial getTypeMaterial();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Material</em>' reference.
	 * @see #getTypeMaterial()
	 * @generated
	 */
	void setTypeMaterial(TypeMaterial value);

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_ErpQuoteLineItem()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem
	 * @model opposite="ErpReqLineItem"
	 * @generated
	 */
	ErpQuoteLineItem getErpQuoteLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	void setErpQuoteLineItem(ErpQuoteLineItem value);

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_Quantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity of item requisitioned.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity of item requisitioned.'"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Erp Requisition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Requisition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Requisition</em>' reference.
	 * @see #setErpRequisition(ErpRequisition)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_ErpRequisition()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems
	 * @model opposite="ErpReqLineItems"
	 * @generated
	 */
	ErpRequisition getErpRequisition();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Requisition</em>' reference.
	 * @see #getErpRequisition()
	 * @generated
	 */
	void setErpRequisition(ErpRequisition value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_Cost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cost of material'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cost of material'"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpReqLineItems
	 * @model opposite="ErpReqLineItems"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

	/**
	 * Returns the value of the '<em><b>Erp PO Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #setErpPOLineItem(ErpPOLineItem)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem_ErpPOLineItem()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem
	 * @model opposite="ErpReqLineItem"
	 * @generated
	 */
	ErpPOLineItem getErpPOLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	void setErpPOLineItem(ErpPOLineItem value);

} // ErpReqLineItem
