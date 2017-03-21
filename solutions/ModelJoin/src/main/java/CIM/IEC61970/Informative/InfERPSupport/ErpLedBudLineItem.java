/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Led Bud Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedBudLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Individual entry of a given Ledger Budget, typically containing information such as amount, accounting date, accounting period, and is associated with the applicable general ledger account.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Individual entry of a given Ledger Budget, typically containing information such as amount, accounting date, accounting period, and is associated with the applicable general ledger account.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Individual entry of a given Ledger Budget, typically containing information such as amount, accounting date, accounting period, and is associated with the applicable general ledger account.' Profile\040documentation='Individual entry of a given Ledger Budget, typically containing information such as amount, accounting date, accounting period, and is associated with the applicable general ledger account.'"
 * @generated
 */
public interface ErpLedBudLineItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Erp Ledger Budget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Budget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Budget</em>' reference.
	 * @see #setErpLedgerBudget(ErpLedgerBudget)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedBudLineItem_ErpLedgerBudget()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems
	 * @model opposite="ErpLedBudLineItems"
	 * @generated
	 */
	ErpLedgerBudget getErpLedgerBudget();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger Budget</em>' reference.
	 * @see #getErpLedgerBudget()
	 * @generated
	 */
	void setErpLedgerBudget(ErpLedgerBudget value);

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedBudLineItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Led Bud Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Led Bud Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Led Bud Line Item</em>' reference.
	 * @see #setErpLedBudLineItem(ErpLedgerEntry)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedBudLineItem_ErpLedBudLineItem()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry
	 * @model opposite="ErpLedgerEntry"
	 * @generated
	 */
	ErpLedgerEntry getErpLedBudLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Led Bud Line Item</em>' reference.
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	void setErpLedBudLineItem(ErpLedgerEntry value);

} // ErpLedBudLineItem
