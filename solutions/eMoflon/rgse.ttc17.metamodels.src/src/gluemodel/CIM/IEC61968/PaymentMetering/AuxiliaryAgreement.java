/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61968.Common.Agreement;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An ad-hoc auxiliary account agreement associated with a customer agreement, not part of the customer\'s account, but typically subject to formal agreement between customer and supplier (utility). Typically this is used to collect revenue owing by the customer for other services or arrears accrued with the utility for other services. It is typically linked to a prepaid token purchase transaction, thus forcing the customer to make a payment towards settlement of the auxiliary account balance whenever he needs to purchase a prepaid token for electricity.\nThe present status of AuxiliaryAgreement can be defined in the context of the utility\'s business rules, for example: enabled, disabled, pending, over recovered, under recovered, written off, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An ad-hoc auxiliary account agreement associated with a customer agreement, not part of the customer\'s account, but typically subject to formal agreement between customer and supplier (utility). Typically this is used to collect revenue owing by the customer for other services or arrears accrued with the utility for other services. It is typically linked to a prepaid token purchase transaction, thus forcing the customer to make a payment towards settlement of the auxiliary account balance whenever he needs to purchase a prepaid token for electricity.\nThe present status of AuxiliaryAgreement can be defined in the context of the utility\'s business rules, for example: enabled, disabled, pending, over recovered, under recovered, written off, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An ad-hoc auxiliary account agreement associated with a customer agreement, not part of the customer\'s account, but typically subject to formal agreement between customer and supplier (utility). Typically this is used to collect revenue owing by the customer for other services or arrears accrued with the utility for other services. It is typically linked to a prepaid token purchase transaction, thus forcing the customer to make a payment towards settlement of the auxiliary account balance whenever he needs to purchase a prepaid token for electricity.\nThe present status of AuxiliaryAgreement can be defined in the context of the utility\'s business rules, for example: enabled, disabled, pending, over recovered, under recovered, written off, etc.' Profile\040documentation='An ad-hoc auxiliary account agreement associated with a customer agreement, not part of the customer\'s account, but typically subject to formal agreement between customer and supplier (utility). Typically this is used to collect revenue owing by the customer for other services or arrears accrued with the utility for other services. It is typically linked to a prepaid token purchase transaction, thus forcing the customer to make a payment towards settlement of the auxiliary account balance whenever he needs to purchase a prepaid token for electricity.\nThe present status of AuxiliaryAgreement can be defined in the context of the utility\'s business rules, for example: enabled, disabled, pending, over recovered, under recovered, written off, etc.'"
 * @generated
 */
public interface AuxiliaryAgreement extends Agreement {
	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_CustomerAgreement()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements
	 * @model opposite="AuxiliaryAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer agreement this (non-service related) auxiliary agreement refers to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer agreement this (non-service related) auxiliary agreement refers to.'"
	 * @generated
	 */
	CustomerAgreement getCustomerAgreement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	void setCustomerAgreement(CustomerAgreement value);

	/**
	 * Returns the value of the '<em><b>Aux Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Cycle</em>' attribute.
	 * @see #setAuxCycle(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_AuxCycle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The frequency for automatically recurring auxiliary charges, where AuxiliaryAccount.initialCharge is recursively added to AuxiliaryAccount.dueCurrent at the start of each auxCycle. For example: on a specified date and time; hourly; daily; weekly; monthly; 3-monthly; 6-monthly; 12-monthly; etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The frequency for automatically recurring auxiliary charges, where AuxiliaryAccount.initialCharge is recursively added to AuxiliaryAccount.dueCurrent at the start of each auxCycle. For example: on a specified date and time; hourly; daily; weekly; monthly; 3-monthly; 6-monthly; 12-monthly; etc.'"
	 * @generated
	 */
	String getAuxCycle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Cycle</em>' attribute.
	 * @see #getAuxCycle()
	 * @generated
	 */
	void setAuxCycle(String value);

	/**
	 * Returns the value of the '<em><b>Aux Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Ref</em>' attribute.
	 * @see #setAuxRef(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_AuxRef()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A local reference to this AuxiliaryAgreement defined in the context of the implementation and not related to IdentifiedObject.mRID.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A local reference to this AuxiliaryAgreement defined in the context of the implementation and not related to IdentifiedObject.mRID.'"
	 * @generated
	 */
	String getAuxRef();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Ref</em>' attribute.
	 * @see #getAuxRef()
	 * @generated
	 */
	void setAuxRef(String value);

	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' attribute.
	 * @see #setSubCategory(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_SubCategory()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sub-category of this AuxiliaryAgreement as sub-classification of the inherited \'category\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sub-category of this AuxiliaryAgreement as sub-classification of the inherited \'category\'.'"
	 * @generated
	 */
	String getSubCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Category</em>' attribute.
	 * @see #getSubCategory()
	 * @generated
	 */
	void setSubCategory(String value);

	/**
	 * Returns the value of the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Amount</em>' attribute.
	 * @see #setMinAmount(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_MinAmount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum amount that must be paid at any transaction towards settling this AuxiliryAgreement or reducing the balance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum amount that must be paid at any transaction towards settling this AuxiliryAgreement or reducing the balance.'"
	 * @generated
	 */
	float getMinAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Amount</em>' attribute.
	 * @see #getMinAmount()
	 * @generated
	 */
	void setMinAmount(float value);

	/**
	 * Returns the value of the '<em><b>Vend Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vend Portion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vend Portion</em>' attribute.
	 * @see #setVendPortion(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_VendPortion()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The percentage of the transaction amount that must be collected from each vending transaction towards settlement of this AuxiliaryAgreement when payments are not in arrears. Note that there may be multiple tokens vended per vending transaction, but this is not relevant.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The percentage of the transaction amount that must be collected from each vending transaction towards settlement of this AuxiliaryAgreement when payments are not in arrears. Note that there may be multiple tokens vended per vending transaction, but this is not relevant.'"
	 * @generated
	 */
	float getVendPortion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vend Portion</em>' attribute.
	 * @see #getVendPortion()
	 * @generated
	 */
	void setVendPortion(float value);

	/**
	 * Returns the value of the '<em><b>Aux Priority Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Priority Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Priority Code</em>' attribute.
	 * @see #setAuxPriorityCode(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_AuxPriorityCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The coded priority indicating the priority that this AuxiliaryAgreement has above other AuxiliaryAgreements (associated with the same customer agreement) when it comes to competing for settlement from a payment transaction or token purchase.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The coded priority indicating the priority that this AuxiliaryAgreement has above other AuxiliaryAgreements (associated with the same customer agreement) when it comes to competing for settlement from a payment transaction or token purchase.'"
	 * @generated
	 */
	String getAuxPriorityCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Priority Code</em>' attribute.
	 * @see #getAuxPriorityCode()
	 * @generated
	 */
	void setAuxPriorityCode(String value);

	/**
	 * Returns the value of the '<em><b>Arrears Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrears Interest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrears Interest</em>' attribute.
	 * @see #setArrearsInterest(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_ArrearsInterest()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The interest per annum to be charged prorata on AuxiliaryAccount.dueArrears at the end of each payCycle.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The interest per annum to be charged prorata on AuxiliaryAccount.dueArrears at the end of each payCycle.'"
	 * @generated
	 */
	float getArrearsInterest();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrears Interest</em>' attribute.
	 * @see #getArrearsInterest()
	 * @generated
	 */
	void setArrearsInterest(float value);

	/**
	 * Returns the value of the '<em><b>Fixed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Amount</em>' attribute.
	 * @see #setFixedAmount(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_FixedAmount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The fixed amount that must be collected from each vending transaction towards settlement of this AuxiliaryAgreement. Note that there may be multiple tokens vended per vending transaction, but this is not relevant.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The fixed amount that must be collected from each vending transaction towards settlement of this AuxiliaryAgreement. Note that there may be multiple tokens vended per vending transaction, but this is not relevant.'"
	 * @generated
	 */
	float getFixedAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Amount</em>' attribute.
	 * @see #getFixedAmount()
	 * @generated
	 */
	void setFixedAmount(float value);

	/**
	 * Returns the value of the '<em><b>Pay Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay Cycle</em>' attribute.
	 * @see #setPayCycle(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_PayCycle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The contractually expected payment frequency (by the customer). Examples are: ad-hoc; on specified date; hourly, daily, weekly, monthly. etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The contractually expected payment frequency (by the customer). Examples are: ad-hoc; on specified date; hourly, daily, weekly, monthly. etc.'"
	 * @generated
	 */
	String getPayCycle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay Cycle</em>' attribute.
	 * @see #getPayCycle()
	 * @generated
	 */
	void setPayCycle(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Accounts</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_AuxiliaryAccounts()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement
	 * @model opposite="AuxiliaryAgreement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All auxiliary accounts regulated by this agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All auxiliary accounts regulated by this agreement.'"
	 * @generated
	 */
	EList<AuxiliaryAccount> getAuxiliaryAccounts();

	/**
	 * Returns the value of the '<em><b>Vend Portion Arrear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vend Portion Arrear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vend Portion Arrear</em>' attribute.
	 * @see #setVendPortionArrear(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement_VendPortionArrear()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The percentage of the transaction amount that must be collected from each vending transaction towards settlement of this AuxiliaryAgreement when payments are in arrears. Note that there may be multiple tokens vended per vending transaction, but this is not relevant.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The percentage of the transaction amount that must be collected from each vending transaction towards settlement of this AuxiliaryAgreement when payments are in arrears. Note that there may be multiple tokens vended per vending transaction, but this is not relevant.'"
	 * @generated
	 */
	float getVendPortionArrear();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vend Portion Arrear</em>' attribute.
	 * @see #getVendPortionArrear()
	 * @generated
	 */
	void setVendPortionArrear(float value);

} // AuxiliaryAgreement
