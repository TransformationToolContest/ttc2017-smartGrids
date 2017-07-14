/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bilateral Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMax <em>Purchase Time Max</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMin <em>Purchase Time Min</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMax <em>Curtail Time Max</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMin <em>Curtail Time Min</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTotalTranChargeMax <em>Total Tran Charge Max</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getMarketType <em>Market Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bilateral transaction'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Bilateral transaction'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bilateral transaction' Profile\040documentation='Bilateral transaction'"
 * @generated
 */
public interface BilateralTransaction extends Element {
	/**
	 * Returns the value of the '<em><b>Purchase Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Time Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Time Max</em>' attribute.
	 * @see #setPurchaseTimeMax(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_PurchaseTimeMax()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum purchase time in number of trading intervals'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum purchase time in number of trading intervals'"
	 * @generated
	 */
	int getPurchaseTimeMax();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMax <em>Purchase Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Time Max</em>' attribute.
	 * @see #getPurchaseTimeMax()
	 * @generated
	 */
	void setPurchaseTimeMax(int value);

	/**
	 * Returns the value of the '<em><b>Purchase Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Time Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Time Min</em>' attribute.
	 * @see #setPurchaseTimeMin(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_PurchaseTimeMin()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum purchase time in number of trading intervals'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum purchase time in number of trading intervals'"
	 * @generated
	 */
	int getPurchaseTimeMin();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMin <em>Purchase Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Time Min</em>' attribute.
	 * @see #getPurchaseTimeMin()
	 * @generated
	 */
	void setPurchaseTimeMin(int value);

	/**
	 * Returns the value of the '<em><b>Curtail Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtail Time Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtail Time Max</em>' attribute.
	 * @see #setCurtailTimeMax(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_CurtailTimeMax()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum curtailment time in number of trading intervals'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum curtailment time in number of trading intervals'"
	 * @generated
	 */
	int getCurtailTimeMax();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMax <em>Curtail Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curtail Time Max</em>' attribute.
	 * @see #getCurtailTimeMax()
	 * @generated
	 */
	void setCurtailTimeMax(int value);

	/**
	 * Returns the value of the '<em><b>Curtail Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtail Time Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtail Time Min</em>' attribute.
	 * @see #setCurtailTimeMin(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_CurtailTimeMin()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum curtailment time in number of trading intervals'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum curtailment time in number of trading intervals'"
	 * @generated
	 */
	int getCurtailTimeMin();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMin <em>Curtail Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curtail Time Min</em>' attribute.
	 * @see #getCurtailTimeMin()
	 * @generated
	 */
	void setCurtailTimeMin(int value);

	/**
	 * Returns the value of the '<em><b>Total Tran Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Tran Charge Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Tran Charge Max</em>' attribute.
	 * @see #setTotalTranChargeMax(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_TotalTranChargeMax()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum total transmission (congestion) charges in monetary units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum total transmission (congestion) charges in monetary units'"
	 * @generated
	 */
	float getTotalTranChargeMax();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTotalTranChargeMax <em>Total Tran Charge Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Tran Charge Max</em>' attribute.
	 * @see #getTotalTranChargeMax()
	 * @generated
	 */
	void setTotalTranChargeMax(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_TransactionType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction type (default 1)\n 1 - Fixed\n 2 - Dispatchable continuous\n 3 - Dispatchable block-loading'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction type (default 1)\n 1 - Fixed\n 2 - Dispatchable continuous\n 3 - Dispatchable block-loading'"
	 * @generated
	 */
	String getTransactionType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(String value);

	/**
	 * Returns the value of the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Type</em>' attribute.
	 * @see #setMarketType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_MarketType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market type (default=DA)\nDA - Day Ahead\nRT - Real Time\nHA - Hour Ahead'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market type (default=DA)\nDA - Day Ahead\nRT - Real Time\nHA - Hour Ahead'"
	 * @generated
	 */
	String getMarketType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getMarketType <em>Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Type</em>' attribute.
	 * @see #getMarketType()
	 * @generated
	 */
	void setMarketType(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBilateralTransaction_Scope()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction scope:\n\'Internal\'\n\'External\''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction scope:\n\'Internal\'\n\'External\''"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

} // BilateralTransaction
