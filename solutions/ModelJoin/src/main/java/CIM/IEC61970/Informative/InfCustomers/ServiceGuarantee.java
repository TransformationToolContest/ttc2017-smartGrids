/**
 */
package CIM.IEC61970.Informative.InfCustomers;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Guarantee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getApplicationPeriod <em>Application Period</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getServiceGuarantee()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A service guarantee, often imposed by a regulator, defines conditions that, if not satisfied, will result in the utility making a monetary payment to the customer. Note that guarantee\'s identifier is in the \'name\' attribute and the status of the guarantee is in the \'Status.status\' attribute.\nExample service requirements include:\n1) If power is not restored within 24 hours, customers can claim $50 for residential customers or $100 for commercial and industrial customers. In addition for each extra period of 12 hours the customer\'s supply has not been activated, the customer can claim $25.\n2) If a customer has a question about their electricity bill, the utility will investigate and respond to the inquiry within 15 working days. If utility fails to meet its guarantee, utility will automatically pay the customer $50.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A service guarantee, often imposed by a regulator, defines conditions that, if not satisfied, will result in the utility making a monetary payment to the customer. Note that guarantee\'s identifier is in the \'name\' attribute and the status of the guarantee is in the \'Status.status\' attribute.\nExample service requirements include:\n1) If power is not restored within 24 hours, customers can claim $50 for residential customers or $100 for commercial and industrial customers. In addition for each extra period of 12 hours the customer\'s supply has not been activated, the customer can claim $25.\n2) If a customer has a question about their electricity bill, the utility will investigate and respond to the inquiry within 15 working days. If utility fails to meet its guarantee, utility will automatically pay the customer $50.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A service guarantee, often imposed by a regulator, defines conditions that, if not satisfied, will result in the utility making a monetary payment to the customer. Note that guarantee\'s identifier is in the \'name\' attribute and the status of the guarantee is in the \'Status.status\' attribute.\nExample service requirements include:\n1) If power is not restored within 24 hours, customers can claim $50 for residential customers or $100 for commercial and industrial customers. In addition for each extra period of 12 hours the customer\'s supply has not been activated, the customer can claim $25.\n2) If a customer has a question about their electricity bill, the utility will investigate and respond to the inquiry within 15 working days. If utility fails to meet its guarantee, utility will automatically pay the customer $50.' Profile\040documentation='A service guarantee, often imposed by a regulator, defines conditions that, if not satisfied, will result in the utility making a monetary payment to the customer. Note that guarantee\'s identifier is in the \'name\' attribute and the status of the guarantee is in the \'Status.status\' attribute.\nExample service requirements include:\n1) If power is not restored within 24 hours, customers can claim $50 for residential customers or $100 for commercial and industrial customers. In addition for each extra period of 12 hours the customer\'s supply has not been activated, the customer can claim $25.\n2) If a customer has a question about their electricity bill, the utility will investigate and respond to the inquiry within 15 working days. If utility fails to meet its guarantee, utility will automatically pay the customer $50.'"
 * @generated
 */
public interface ServiceGuarantee extends Document {
	/**
	 * Returns the value of the '<em><b>Pay Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay Amount</em>' attribute.
	 * @see #setPayAmount(float)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getServiceGuarantee_PayAmount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount to be paid by the service provider to the customer for each violation of the \'serviceRequirement\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount to be paid by the service provider to the customer for each violation of the \'serviceRequirement\'.'"
	 * @generated
	 */
	float getPayAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay Amount</em>' attribute.
	 * @see #getPayAmount()
	 * @generated
	 */
	void setPayAmount(float value);

	/**
	 * Returns the value of the '<em><b>Application Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Period</em>' reference.
	 * @see #setApplicationPeriod(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getServiceGuarantee_ApplicationPeriod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Period in which this service guantee applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Period in which this service guantee applies.'"
	 * @generated
	 */
	DateTimeInterval getApplicationPeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getApplicationPeriod <em>Application Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Period</em>' reference.
	 * @see #getApplicationPeriod()
	 * @generated
	 */
	void setApplicationPeriod(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Automatic Pay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Pay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Pay</em>' attribute.
	 * @see #setAutomaticPay(boolean)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getServiceGuarantee_AutomaticPay()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if utility must autmatically pay the specified amount whenever the condition is not satisified, otherwise customer must make a claim to receive payment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if utility must autmatically pay the specified amount whenever the condition is not satisified, otherwise customer must make a claim to receive payment.'"
	 * @generated
	 */
	boolean isAutomaticPay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Pay</em>' attribute.
	 * @see #isAutomaticPay()
	 * @generated
	 */
	void setAutomaticPay(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Requirement</em>' attribute.
	 * @see #setServiceRequirement(String)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getServiceGuarantee_ServiceRequirement()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Explanation of the requirement and conditions for satisfying it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Explanation of the requirement and conditions for satisfying it.'"
	 * @generated
	 */
	String getServiceRequirement();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Requirement</em>' attribute.
	 * @see #getServiceRequirement()
	 * @generated
	 */
	void setServiceRequirement(String value);

} // ServiceGuarantee
