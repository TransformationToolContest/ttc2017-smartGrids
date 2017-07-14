/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.BankStatement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getPointOfSales <em>Point Of Sales</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getCashiers <em>Cashiers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getBankStatements <em>Bank Statements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The entity that owns PointOfSale and contracts with Cashier to receipt payments and vend tokens using the payment system. Vendor has a private contract with and is managed by Merchant who is a type of Organisation. Vendor is accountable to Merchant for revenue collected, who is in turn accountable to Supplier.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The entity that owns PointOfSale and contracts with Cashier to receipt payments and vend tokens using the payment system. Vendor has a private contract with and is managed by Merchant who is a type of Organisation. Vendor is accountable to Merchant for revenue collected, who is in turn accountable to Supplier.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The entity that owns PointOfSale and contracts with Cashier to receipt payments and vend tokens using the payment system. Vendor has a private contract with and is managed by Merchant who is a type of Organisation. Vendor is accountable to Merchant for revenue collected, who is in turn accountable to Supplier.' Profile\040documentation='The entity that owns PointOfSale and contracts with Cashier to receipt payments and vend tokens using the payment system. Vendor has a private contract with and is managed by Merchant who is a type of Organisation. Vendor is accountable to Merchant for revenue collected, who is in turn accountable to Supplier.'"
 * @generated
 */
public interface Vendor extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Point Of Sales</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Sales</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor_PointOfSales()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getVendor
	 * @model opposite="Vendor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All points of sale this Vendor controls.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All points of sale this Vendor controls.'"
	 * @generated
	 */
	EList<PointOfSale> getPointOfSales();

	/**
	 * Returns the value of the '<em><b>Cashiers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Cashier}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Cashier#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashiers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashiers</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor_Cashiers()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Cashier#getVendor
	 * @model opposite="Vendor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Cachiers managed by this Vendor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Cachiers managed by this Vendor.'"
	 * @generated
	 */
	EList<Cashier> getCashiers();

	/**
	 * Returns the value of the '<em><b>Merchant Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.MerchantAccount#getVendors <em>Vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Account</em>' reference.
	 * @see #setMerchantAccount(MerchantAccount)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor_MerchantAccount()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.MerchantAccount#getVendors
	 * @model opposite="Vendors"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Merchant account against which this vendor sells tokens or recept payments.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Merchant account against which this vendor sells tokens or recept payments.'"
	 * @generated
	 */
	MerchantAccount getMerchantAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getMerchantAccount <em>Merchant Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Account</em>' reference.
	 * @see #getMerchantAccount()
	 * @generated
	 */
	void setMerchantAccount(MerchantAccount value);

	/**
	 * Returns the value of the '<em><b>Bank Statements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.BankStatement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Statements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor_BankStatements()
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getVendor
	 * @model opposite="Vendor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All BankStatements reflecting deposits made by this Vendor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All BankStatements reflecting deposits made by this Vendor.'"
	 * @generated
	 */
	EList<BankStatement> getBankStatements();

	/**
	 * Returns the value of the '<em><b>Vendor Shifts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.VendorShift}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shifts</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor_VendorShifts()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.VendorShift#getVendor
	 * @model opposite="Vendor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All vendor shifts opened and owned by this vendor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All vendor shifts opened and owned by this vendor.'"
	 * @generated
	 */
	EList<VendorShift> getVendorShifts();

} // Vendor
