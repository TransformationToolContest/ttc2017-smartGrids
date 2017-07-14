/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settlement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getMarket <em>Market</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getTradeDate <em>Trade Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpLedgerEntries <em>Erp Ledger Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSettlement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies a settlement run.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies a settlement run.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies a settlement run.' Profile\040documentation='Specifies a settlement run.'"
 * @generated
 */
public interface Settlement extends Document {
	/**
	 * Returns the value of the '<em><b>Market</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getSettlements <em>Settlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market</em>' reference.
	 * @see #setMarket(Market)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSettlement_Market()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getSettlements
	 * @model opposite="Settlements"
	 * @generated
	 */
	Market getMarket();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getMarket <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market</em>' reference.
	 * @see #getMarket()
	 * @generated
	 */
	void setMarket(Market value);

	/**
	 * Returns the value of the '<em><b>Trade Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trade Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trade Date</em>' attribute.
	 * @see #setTradeDate(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSettlement_TradeDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The trade date on which the settlement is run.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The trade date on which the settlement is run.'"
	 * @generated
	 */
	Date getTradeDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getTradeDate <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Date</em>' attribute.
	 * @see #getTradeDate()
	 * @generated
	 */
	void setTradeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getSettlements <em>Settlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entries</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSettlement_ErpLedgerEntries()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getSettlements
	 * @model opposite="Settlements"
	 * @generated
	 */
	EList<ErpLedgerEntry> getErpLedgerEntries();

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getSettlements <em>Settlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSettlement_ErpInvoiceLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getSettlements
	 * @model opposite="Settlements"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpInvoiceLineItems();

} // Settlement
