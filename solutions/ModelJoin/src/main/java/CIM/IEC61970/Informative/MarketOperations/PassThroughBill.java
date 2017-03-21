/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.UserAttribute;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pass Through Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillEnd <em>Bill End</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceEnd <em>Service End</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsProfiled <em>Is Profiled</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousEnd <em>Previous End</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBilledTo <em>Billed To</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsDisputed <em>Is Disputed</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getMarketStatementLineItem <em>Market Statement Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillStart <em>Bill Start</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousStart <em>Previous Start</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceStart <em>Service Start</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillRunType <em>Bill Run Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getChargeProfiles <em>Charge Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTradeDate <em>Trade Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPrice <em>Price</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getSoldTo <em>Sold To</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPaidTo <em>Paid To</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pass Through Bill is used for:\n1)Two sided charge transactions with or without ISO involvement (hence the ?pass thru?)\n2) Specific direct charges or payments that are calculated outside or provided directly to settlements\n3) Specific charge bill determinants that are externally supplied and used in charge calculations'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Pass Through Bill is used for:\n1)Two sided charge transactions with or without ISO involvement (hence the ?pass thru?)\n2) Specific direct charges or payments that are calculated outside or provided directly to settlements\n3) Specific charge bill determinants that are externally supplied and used in charge calculations'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pass Through Bill is used for:\n1)Two sided charge transactions with or without ISO involvement (hence the ?pass thru?)\n2) Specific direct charges or payments that are calculated outside or provided directly to settlements\n3) Specific charge bill determinants that are externally supplied and used in charge calculations' Profile\040documentation='Pass Through Bill is used for:\n1)Two sided charge transactions with or without ISO involvement (hence the ?pass thru?)\n2) Specific direct charges or payments that are calculated outside or provided directly to settlements\n3) Specific charge bill determinants that are externally supplied and used in charge calculations'"
 * @generated
 */
public interface PassThroughBill extends Document {
	/**
	 * Returns the value of the '<em><b>Bill End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill End</em>' attribute.
	 * @see #setBillEnd(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_BillEnd()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bill period end date'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bill period end date'"
	 * @generated
	 */
	Date getBillEnd();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillEnd <em>Bill End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill End</em>' attribute.
	 * @see #getBillEnd()
	 * @generated
	 */
	void setBillEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_EffectiveDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The effective date of the transaction'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The effective date of the transaction'"
	 * @generated
	 */
	Date getEffectiveDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Service End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service End</em>' attribute.
	 * @see #setServiceEnd(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_ServiceEnd()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The end date of service provided, if periodic.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The end date of service provided, if periodic.'"
	 * @generated
	 */
	Date getServiceEnd();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceEnd <em>Service End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service End</em>' attribute.
	 * @see #getServiceEnd()
	 * @generated
	 */
	void setServiceEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Is Profiled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Profiled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Profiled</em>' attribute.
	 * @see #setIsProfiled(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_IsProfiled()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flag indicating whether there is a profile data associated with the PTB.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flag indicating whether there is a profile data associated with the PTB.'"
	 * @generated
	 */
	boolean isIsProfiled();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsProfiled <em>Is Profiled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Profiled</em>' attribute.
	 * @see #isIsProfiled()
	 * @generated
	 */
	void setIsProfiled(boolean value);

	/**
	 * Returns the value of the '<em><b>Previous End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous End</em>' attribute.
	 * @see #setPreviousEnd(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_PreviousEnd()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The previous bill period end date'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The previous bill period end date'"
	 * @generated
	 */
	Date getPreviousEnd();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousEnd <em>Previous End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous End</em>' attribute.
	 * @see #getPreviousEnd()
	 * @generated
	 */
	void setPreviousEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_Amount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The charge amount of the product/service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The charge amount of the product/service.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone</em>' attribute.
	 * @see #setTimeZone(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_TimeZone()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time zone code'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time zone code'"
	 * @generated
	 */
	String getTimeZone();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTimeZone <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone</em>' attribute.
	 * @see #getTimeZone()
	 * @generated
	 */
	void setTimeZone(String value);

	/**
	 * Returns the value of the '<em><b>Billed To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billed To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billed To</em>' attribute.
	 * @see #setBilledTo(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_BilledTo()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The company to which the PTB transaction is billed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The company to which the PTB transaction is billed.'"
	 * @generated
	 */
	String getBilledTo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBilledTo <em>Billed To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billed To</em>' attribute.
	 * @see #getBilledTo()
	 * @generated
	 */
	void setBilledTo(String value);

	/**
	 * Returns the value of the '<em><b>Is Disputed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disputed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disputed</em>' attribute.
	 * @see #setIsDisputed(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_IsDisputed()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Disputed transaction indicator'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Disputed transaction indicator'"
	 * @generated
	 */
	boolean isIsDisputed();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsDisputed <em>Is Disputed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disputed</em>' attribute.
	 * @see #isIsDisputed()
	 * @generated
	 */
	void setIsDisputed(boolean value);

	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By</em>' attribute.
	 * @see #setProvidedBy(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_ProvidedBy()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The company by which the PTB transaction service is provided.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The company by which the PTB transaction service is provided.'"
	 * @generated
	 */
	String getProvidedBy();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProvidedBy <em>Provided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided By</em>' attribute.
	 * @see #getProvidedBy()
	 * @generated
	 */
	void setProvidedBy(String value);

	/**
	 * Returns the value of the '<em><b>Market Statement Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPassThroughBill <em>Pass Through Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Statement Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Statement Line Item</em>' reference.
	 * @see #setMarketStatementLineItem(MarketStatementLineItem)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_MarketStatementLineItem()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPassThroughBill
	 * @model opposite="PassThroughBill"
	 * @generated
	 */
	MarketStatementLineItem getMarketStatementLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getMarketStatementLineItem <em>Market Statement Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Statement Line Item</em>' reference.
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	void setMarketStatementLineItem(MarketStatementLineItem value);

	/**
	 * Returns the value of the '<em><b>Bill Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Start</em>' attribute.
	 * @see #setBillStart(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_BillStart()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bill period start date'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bill period start date'"
	 * @generated
	 */
	Date getBillStart();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillStart <em>Bill Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Start</em>' attribute.
	 * @see #getBillStart()
	 * @generated
	 */
	void setBillStart(Date value);

	/**
	 * Returns the value of the '<em><b>Previous Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Start</em>' attribute.
	 * @see #setPreviousStart(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_PreviousStart()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The previous bill period start date'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The previous bill period start date'"
	 * @generated
	 */
	Date getPreviousStart();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousStart <em>Previous Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Start</em>' attribute.
	 * @see #getPreviousStart()
	 * @generated
	 */
	void setPreviousStart(Date value);

	/**
	 * Returns the value of the '<em><b>Service Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Start</em>' attribute.
	 * @see #setServiceStart(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_ServiceStart()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The start date of service provided, if periodic.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The start date of service provided, if periodic.'"
	 * @generated
	 */
	Date getServiceStart();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceStart <em>Service Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Start</em>' attribute.
	 * @see #getServiceStart()
	 * @generated
	 */
	void setServiceStart(Date value);

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Code</em>' attribute.
	 * @see #setProductCode(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_ProductCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The product identifier for determining the charge type of the transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The product identifier for determining the charge type of the transaction.'"
	 * @generated
	 */
	String getProductCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProductCode <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' attribute.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(String value);

	/**
	 * Returns the value of the '<em><b>Bill Run Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Run Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Run Type</em>' attribute.
	 * @see #setBillRunType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_BillRunType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The settlement run type, for example: prelim, final, and rerun.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The settlement run type, for example: prelim, final, and rerun.'"
	 * @generated
	 */
	String getBillRunType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillRunType <em>Bill Run Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Run Type</em>' attribute.
	 * @see #getBillRunType()
	 * @generated
	 */
	void setBillRunType(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see #setTransactionType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_TransactionType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of transaction. For example, charge customer, bill customer, matching AR/AP, or bill determinant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of transaction. For example, charge customer, bill customer, matching AR/AP, or bill determinant'"
	 * @generated
	 */
	String getTransactionType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(String value);

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.UserAttribute#getPassThroughBills <em>Pass Through Bills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_UserAttributes()
	 * @see CIM.IEC61968.Common.UserAttribute#getPassThroughBills
	 * @model opposite="PassThroughBills"
	 * @generated
	 */
	EList<UserAttribute> getUserAttributes();

	/**
	 * Returns the value of the '<em><b>Charge Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ChargeProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getPassTroughBill <em>Pass Trough Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Profiles</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_ChargeProfiles()
	 * @see CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getPassTroughBill
	 * @model opposite="PassTroughBill"
	 * @generated
	 */
	EList<ChargeProfile> getChargeProfiles();

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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_TradeDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The trade date'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The trade date'"
	 * @generated
	 */
	Date getTradeDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTradeDate <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Date</em>' attribute.
	 * @see #getTradeDate()
	 * @generated
	 */
	void setTradeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_Price()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The price of product/service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The price of product/service.'"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Amount</em>' attribute.
	 * @see #setTaxAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_TaxAmount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tax on services taken.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tax on services taken.'"
	 * @generated
	 */
	float getTaxAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(float value);

	/**
	 * Returns the value of the '<em><b>Sold To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sold To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold To</em>' attribute.
	 * @see #setSoldTo(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_SoldTo()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The company to which the PTB transaction is sold.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The company to which the PTB transaction is sold.'"
	 * @generated
	 */
	String getSoldTo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getSoldTo <em>Sold To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sold To</em>' attribute.
	 * @see #getSoldTo()
	 * @generated
	 */
	void setSoldTo(String value);

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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_TransactionDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date the transaction occurs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date the transaction occurs.'"
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Paid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid To</em>' attribute.
	 * @see #setPaidTo(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_PaidTo()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The company to which the PTB transaction is paid.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The company to which the PTB transaction is paid.'"
	 * @generated
	 */
	String getPaidTo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPaidTo <em>Paid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid To</em>' attribute.
	 * @see #getPaidTo()
	 * @generated
	 */
	void setPaidTo(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(Object)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPassThroughBill_Quantity()
	 * @model dataType="CIM.Quantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The product quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The product quantity.'"
	 * @generated
	 */
	Object getQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Object value);

} // PassThroughBill
