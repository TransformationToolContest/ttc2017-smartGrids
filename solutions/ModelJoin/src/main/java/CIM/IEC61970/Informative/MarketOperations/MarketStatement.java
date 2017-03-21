/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.Document;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTradeDate <em>Trade Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getEnd <em>End</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getMarketStatementLineItem <em>Market Statement Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A statement is a roll up of statement line items. Each statement along with its line items provide the details of specific charges at any given time.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A statement is a roll up of statement line items. Each statement along with its line items provide the details of specific charges at any given time.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A statement is a roll up of statement line items. Each statement along with its line items provide the details of specific charges at any given time.' Profile\040documentation='A statement is a roll up of statement line items. Each statement along with its line items provide the details of specific charges at any given time.'"
 * @generated
 */
public interface MarketStatement extends Document {
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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement_TradeDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date of which Settlement is run.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date of which Settlement is run.'"
	 * @generated
	 */
	Date getTradeDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTradeDate <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Date</em>' attribute.
	 * @see #getTradeDate()
	 * @generated
	 */
	void setTradeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement_TransactionDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date of which this statement is issued.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date of which this statement is issued.'"
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement_ReferenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The version number of previous statement (in the case of true up).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The version number of previous statement (in the case of true up).'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement_End()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The end of a bill period.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The end of a bill period.'"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Market Statement Line Item</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getMarketStatement <em>Market Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Statement Line Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Statement Line Item</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement_MarketStatementLineItem()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getMarketStatement
	 * @model opposite="MarketStatement"
	 * @generated
	 */
	EList<MarketStatementLineItem> getMarketStatementLineItem();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatement_Start()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The start of a bill period.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The start of a bill period.'"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

} // MarketStatement
