/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transactor#getMerchantAccounts <em>Merchant Accounts</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The entity that ultimately executes the transaction and who is in control of the process; typically this is embodied in secure software running on a server that may employ secure hardware encryption devices for secure transaction processing.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The entity that ultimately executes the transaction and who is in control of the process; typically this is embodied in secure software running on a server that may employ secure hardware encryption devices for secure transaction processing.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The entity that ultimately executes the transaction and who is in control of the process; typically this is embodied in secure software running on a server that may employ secure hardware encryption devices for secure transaction processing.' Profile\040documentation='The entity that ultimately executes the transaction and who is in control of the process; typically this is embodied in secure software running on a server that may employ secure hardware encryption devices for secure transaction processing.'"
 * @generated
 */
public interface Transactor extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Merchant Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.MerchantAccount}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getTransactors <em>Transactors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Accounts</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactor_MerchantAccounts()
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getTransactors
	 * @model opposite="Transactors"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All merchant accounts registered with this transactor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All merchant accounts registered with this transactor.'"
	 * @generated
	 */
	EList<MerchantAccount> getMerchantAccounts();

} // Transactor
