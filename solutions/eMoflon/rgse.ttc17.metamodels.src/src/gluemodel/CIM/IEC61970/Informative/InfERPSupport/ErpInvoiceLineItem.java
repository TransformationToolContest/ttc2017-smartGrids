/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getSettlements <em>Settlements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos <em>Work Billing Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getMarketFactors <em>Market Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments <em>Erp Payments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod <em>Bill Period</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos <em>Customer Billing Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An individual line item on an invoice.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An individual line item on an invoice.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An individual line item on an invoice.' Profile\040documentation='An individual line item on an invoice.'"
 * @generated
 */
public interface ErpInvoiceLineItem extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpQuoteLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem
	 * @model opposite="ErpInvoiceLineItem"
	 * @generated
	 */
	ErpQuoteLineItem getErpQuoteLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	void setErpQuoteLineItem(ErpQuoteLineItem value);

	/**
	 * Returns the value of the '<em><b>Net Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Amount</em>' attribute.
	 * @see #setNetAmount(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_NetAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Net line item charge amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Net line item charge amount.'"
	 * @generated
	 */
	float getNetAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Amount</em>' attribute.
	 * @see #getNetAmount()
	 * @generated
	 */
	void setNetAmount(float value);

	/**
	 * Returns the value of the '<em><b>Erp Payable Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Item</em>' reference.
	 * @see #setErpPayableLineItem(ErpPayableLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpPayableLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem
	 * @model opposite="ErpInvoiceLineItem"
	 * @generated
	 */
	ErpPayableLineItem getErpPayableLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Payable Line Item</em>' reference.
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	void setErpPayableLineItem(ErpPayableLineItem value);

	/**
	 * Returns the value of the '<em><b>Line Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Amount</em>' attribute.
	 * @see #setLineAmount(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_LineAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount due for this line item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount due for this line item.'"
	 * @generated
	 */
	float getLineAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Amount</em>' attribute.
	 * @see #getLineAmount()
	 * @generated
	 */
	void setLineAmount(float value);

	/**
	 * Returns the value of the '<em><b>Erp Rec Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Item</em>' reference.
	 * @see #setErpRecLineItem(ErpRecLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpRecLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem
	 * @model opposite="ErpInvoiceLineItem"
	 * @generated
	 */
	ErpRecLineItem getErpRecLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Rec Line Item</em>' reference.
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	void setErpRecLineItem(ErpRecLineItem value);

	/**
	 * Returns the value of the '<em><b>Settlements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_Settlements()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpInvoiceLineItems
	 * @model opposite="ErpInvoiceLineItems"
	 * @generated
	 */
	EList<Settlement> getSettlements();

	/**
	 * Returns the value of the '<em><b>Previous Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Amount</em>' attribute.
	 * @see #setPreviousAmount(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_PreviousAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Previous line item charge amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Previous line item charge amount.'"
	 * @generated
	 */
	float getPreviousAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Amount</em>' attribute.
	 * @see #getPreviousAmount()
	 * @generated
	 */
	void setPreviousAmount(float value);

	/**
	 * Returns the value of the '<em><b>Work Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems <em>Erp Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Billing Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_WorkBillingInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems
	 * @model opposite="ErpLineItems"
	 * @generated
	 */
	EList<WorkBillingInfo> getWorkBillingInfos();

	/**
	 * Returns the value of the '<em><b>Market Factors</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getErpInvoices <em>Erp Invoices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Factors</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_MarketFactors()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getErpInvoices
	 * @model opposite="ErpInvoices"
	 * @generated
	 */
	EList<MarketFactors> getMarketFactors();

	/**
	 * Returns the value of the '<em><b>Erp Payments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payments</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpPayments()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems
	 * @model opposite="ErpInvoiceLineItems"
	 * @generated
	 */
	EList<ErpPayment> getErpPayments();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @see #setKind(ErpInvoiceLineItemKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of line item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of line item.'"
	 * @generated
	 */
	ErpInvoiceLineItemKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ErpInvoiceLineItemKind value);

	/**
	 * Returns the value of the '<em><b>Gl Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Date Time</em>' attribute.
	 * @see #setGlDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_GlDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time line item will be posted to the General Ledger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time line item will be posted to the General Ledger.'"
	 * @generated
	 */
	Date getGlDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Date Time</em>' attribute.
	 * @see #getGlDateTime()
	 * @generated
	 */
	void setGlDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Container Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Erp Invoice Line Item</em>' reference.
	 * @see #setContainerErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ContainerErpInvoiceLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems
	 * @model opposite="ComponentErpInvoiceLineItems"
	 * @generated
	 */
	ErpInvoiceLineItem getContainerErpInvoiceLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Erp Invoice Line Item</em>' reference.
	 * @see #getContainerErpInvoiceLineItem()
	 * @generated
	 */
	void setContainerErpInvoiceLineItem(ErpInvoiceLineItem value);

	/**
	 * Returns the value of the '<em><b>Erp Rec Delv Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delv Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delv Line Item</em>' reference.
	 * @see #setErpRecDelvLineItem(ErpRecDelvLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpRecDelvLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem
	 * @model opposite="ErpInvoiceLineItem"
	 * @generated
	 */
	ErpRecDelvLineItem getErpRecDelvLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Rec Delv Line Item</em>' reference.
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	void setErpRecDelvLineItem(ErpRecDelvLineItem value);

	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' attribute.
	 * @see #setGlAccount(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_GlAccount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='General Ledger account code, must be a valid combination.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='General Ledger account code, must be a valid combination.'"
	 * @generated
	 */
	String getGlAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' attribute.
	 * @see #getGlAccount()
	 * @generated
	 */
	void setGlAccount(String value);

	/**
	 * Returns the value of the '<em><b>Bill Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Period</em>' reference.
	 * @see #setBillPeriod(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_BillPeriod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bill period for the line item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bill period for the line item.'"
	 * @generated
	 */
	DateTimeInterval getBillPeriod();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod <em>Bill Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Period</em>' reference.
	 * @see #getBillPeriod()
	 * @generated
	 */
	void setBillPeriod(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_LineNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line item number on invoice statement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line item number on invoice statement.'"
	 * @generated
	 */
	String getLineNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(String value);

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_UserAttributes()
	 * @see gluemodel.CIM.IEC61968.Common.UserAttribute#getErpInvoiceLineItems
	 * @model opposite="ErpInvoiceLineItems"
	 * @generated
	 */
	EList<UserAttribute> getUserAttributes();

	/**
	 * Returns the value of the '<em><b>Line Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Version</em>' attribute.
	 * @see #setLineVersion(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_LineVersion()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Version number of the bill run.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Version number of the bill run.'"
	 * @generated
	 */
	String getLineVersion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Version</em>' attribute.
	 * @see #getLineVersion()
	 * @generated
	 */
	void setLineVersion(String value);

	/**
	 * Returns the value of the '<em><b>Erp Invoice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice</em>' reference.
	 * @see #setErpInvoice(ErpInvoice)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpInvoice()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems
	 * @model opposite="ErpInvoiceLineItems"
	 * @generated
	 */
	ErpInvoice getErpInvoice();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice</em>' reference.
	 * @see #getErpInvoice()
	 * @generated
	 */
	void setErpInvoice(ErpInvoice value);

	/**
	 * Returns the value of the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Billing Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_CustomerBillingInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems
	 * @model opposite="ErpInvoiceLineItems"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer billing for services rendered.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer billing for services rendered.'"
	 * @generated
	 */
	EList<CustomerBillingInfo> getCustomerBillingInfos();

	/**
	 * Returns the value of the '<em><b>Component Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Erp Invoice Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ComponentErpInvoiceLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem
	 * @model opposite="ContainerErpInvoiceLineItem"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getComponentErpInvoiceLineItems();

	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem_ErpJournalEntries()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem
	 * @model opposite="ErpInvoiceLineItem"
	 * @generated
	 */
	EList<ErpJournalEntry> getErpJournalEntries();

} // ErpInvoiceLineItem
