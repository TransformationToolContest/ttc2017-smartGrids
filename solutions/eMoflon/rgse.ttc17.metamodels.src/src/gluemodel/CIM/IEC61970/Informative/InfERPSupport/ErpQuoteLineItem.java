/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;

import gluemodel.CIM.IEC61970.Informative.InfWork.Design;
import gluemodel.CIM.IEC61970.Informative.InfWork.Request;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Quote Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Of an ErpQuote, the item or product quoted along with quantity, price and other descriptive information.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Of an ErpQuote, the item or product quoted along with quantity, price and other descriptive information.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Of an ErpQuote, the item or product quoted along with quantity, price and other descriptive information.' Profile\040documentation='Of an ErpQuote, the item or product quoted along with quantity, price and other descriptive information.'"
 * @generated
 */
public interface ErpQuoteLineItem extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Request)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_Request()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem
	 * @model opposite="ErpQuoteLineItem"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_Design()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem
	 * @model opposite="ErpQuoteLineItem"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_ErpInvoiceLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem
	 * @model opposite="ErpQuoteLineItem"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Some utilities provide quotes to customer for services, where the customer accepts the quote by making a payment. An invoice is required for this to occur.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Some utilities provide quotes to customer for services, where the customer accepts the quote by making a payment. An invoice is required for this to occur.'"
	 * @generated
	 */
	ErpInvoiceLineItem getErpInvoiceLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	void setErpInvoiceLineItem(ErpInvoiceLineItem value);

	/**
	 * Returns the value of the '<em><b>Erp Req Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Item</em>' reference.
	 * @see #setErpReqLineItem(ErpReqLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_ErpReqLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem
	 * @model opposite="ErpQuoteLineItem"
	 * @generated
	 */
	ErpReqLineItem getErpReqLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Req Line Item</em>' reference.
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	void setErpReqLineItem(ErpReqLineItem value);

	/**
	 * Returns the value of the '<em><b>Erp Quote</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote</em>' reference.
	 * @see #setErpQuote(ErpQuote)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_ErpQuote()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems
	 * @model opposite="ErpQuoteLineItems"
	 * @generated
	 */
	ErpQuote getErpQuote();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote</em>' reference.
	 * @see #getErpQuote()
	 * @generated
	 */
	void setErpQuote(ErpQuote value);

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Item</em>' reference.
	 * @see #setAssetModelCatalogueItem(AssetModelCatalogueItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem_AssetModelCatalogueItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems
	 * @model opposite="ErpQuoteLineItems"
	 * @generated
	 */
	AssetModelCatalogueItem getAssetModelCatalogueItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model Catalogue Item</em>' reference.
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	void setAssetModelCatalogueItem(AssetModelCatalogueItem value);

} // ErpQuoteLineItem
