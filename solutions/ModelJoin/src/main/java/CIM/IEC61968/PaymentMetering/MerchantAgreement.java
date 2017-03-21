/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.IEC61968.Common.Agreement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merchant Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAgreement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A formal controlling contractual agreement between Supplier and Merchant, in terms of which Merchant is authorised to vend tokens and receipt payments on behalf of Supplier. Merchant is accountable to Supplier for revenue collected at PointOfSale.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A formal controlling contractual agreement between Supplier and Merchant, in terms of which Merchant is authorised to vend tokens and receipt payments on behalf of Supplier. Merchant is accountable to Supplier for revenue collected at PointOfSale.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A formal controlling contractual agreement between Supplier and Merchant, in terms of which Merchant is authorised to vend tokens and receipt payments on behalf of Supplier. Merchant is accountable to Supplier for revenue collected at PointOfSale.' Profile\040documentation='A formal controlling contractual agreement between Supplier and Merchant, in terms of which Merchant is authorised to vend tokens and receipt payments on behalf of Supplier. Merchant is accountable to Supplier for revenue collected at PointOfSale.'"
 * @generated
 */
public interface MerchantAgreement extends Agreement {
	/**
	 * Returns the value of the '<em><b>Merchant Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.MerchantAccount}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Accounts</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAgreement_MerchantAccounts()
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement
	 * @model opposite="MerchantAgreement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All merchant accounts instantiated as a result of this merchant agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All merchant accounts instantiated as a result of this merchant agreement.'"
	 * @generated
	 */
	EList<MerchantAccount> getMerchantAccounts();

} // MerchantAgreement
