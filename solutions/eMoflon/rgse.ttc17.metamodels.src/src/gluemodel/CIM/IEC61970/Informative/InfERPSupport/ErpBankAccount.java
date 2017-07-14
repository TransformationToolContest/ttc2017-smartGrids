/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Bank Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBankAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship under a particular name, usually evidenced by a deposit against which withdrawals can be made. Types of bank accounts include: demand, time, custodial, joint, trustee, corporate, special, and regular accounts.\nA statement of transactions during a fiscal period and the resulting balance is maintained on each account.\nFor Payment metering, the account is associated with Bank and Supplier, reflecting details of the bank account used for depositing revenue collected by TokenVendor. The name of the account holder should be specified in \'name\' attribute.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship under a particular name, usually evidenced by a deposit against which withdrawals can be made. Types of bank accounts include: demand, time, custodial, joint, trustee, corporate, special, and regular accounts.\nA statement of transactions during a fiscal period and the resulting balance is maintained on each account.\nFor Payment metering, the account is associated with Bank and Supplier, reflecting details of the bank account used for depositing revenue collected by TokenVendor. The name of the account holder should be specified in \'name\' attribute.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship under a particular name, usually evidenced by a deposit against which withdrawals can be made. Types of bank accounts include: demand, time, custodial, joint, trustee, corporate, special, and regular accounts.\nA statement of transactions during a fiscal period and the resulting balance is maintained on each account.\nFor Payment metering, the account is associated with Bank and Supplier, reflecting details of the bank account used for depositing revenue collected by TokenVendor. The name of the account holder should be specified in \'name\' attribute.' Profile\040documentation='Relationship under a particular name, usually evidenced by a deposit against which withdrawals can be made. Types of bank accounts include: demand, time, custodial, joint, trustee, corporate, special, and regular accounts.\nA statement of transactions during a fiscal period and the resulting balance is maintained on each account.\nFor Payment metering, the account is associated with Bank and Supplier, reflecting details of the bank account used for depositing revenue collected by TokenVendor. The name of the account holder should be specified in \'name\' attribute.'"
 * @generated
 */
public interface ErpBankAccount extends BankAccount {
	/**
	 * Returns the value of the '<em><b>Bank ABA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank ABA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank ABA</em>' attribute.
	 * @see #setBankABA(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBankAccount_BankABA()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bank ABA.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bank ABA.'"
	 * @generated
	 */
	String getBankABA();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank ABA</em>' attribute.
	 * @see #getBankABA()
	 * @generated
	 */
	void setBankABA(String value);

} // ErpBankAccount
