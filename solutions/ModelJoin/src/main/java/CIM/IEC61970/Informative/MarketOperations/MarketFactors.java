/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Factors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketFactors#getErpInvoices <em>Erp Invoices</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketFactors#getMarket <em>Market</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketFactors#getIntervalStartTime <em>Interval Start Time</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketFactors()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Aggregation of market information relative for a specific time interval.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Aggregation of market information relative for a specific time interval.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Aggregation of market information relative for a specific time interval.' Profile\040documentation='Aggregation of market information relative for a specific time interval.'"
 * @generated
 */
public interface MarketFactors extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Invoices</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getMarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoices</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketFactors_ErpInvoices()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getMarketFactors
	 * @model opposite="MarketFactors"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpInvoices();

	/**
	 * Returns the value of the '<em><b>Market</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Market#getMarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market</em>' reference.
	 * @see #setMarket(Market)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketFactors_Market()
	 * @see CIM.IEC61970.Informative.MarketOperations.Market#getMarketFactors
	 * @model opposite="MarketFactors"
	 * @generated
	 */
	Market getMarket();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketFactors#getMarket <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market</em>' reference.
	 * @see #getMarket()
	 * @generated
	 */
	void setMarket(Market value);

	/**
	 * Returns the value of the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Start Time</em>' attribute.
	 * @see #setIntervalStartTime(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketFactors_IntervalStartTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The start of the time interval for which requirement is defined.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The start of the time interval for which requirement is defined.'"
	 * @generated
	 */
	Date getIntervalStartTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketFactors#getIntervalStartTime <em>Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Start Time</em>' attribute.
	 * @see #getIntervalStartTime()
	 * @generated
	 */
	void setIntervalStartTime(Date value);

} // MarketFactors
