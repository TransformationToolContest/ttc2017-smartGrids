/**
 */
package CIM.IEC61970.Informative.InfCustomers;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Customers.CustomerAgreement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Industry Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getStandardIndustryCode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Standard Industrial Classification (SIC) are the codes that identify the type of products/service an industry is involved in, and used for statutory reporting purposes. For example, in the USA these codes are located by the federal government, and then published in a book entitled \"The Standard Industrial Classification Manual\". The codes are arranged in a hierarchical structure.\nNote that Residential Service Agreements are not classified according to the SIC codes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The Standard Industrial Classification (SIC) are the codes that identify the type of products/service an industry is involved in, and used for statutory reporting purposes. For example, in the USA these codes are located by the federal government, and then published in a book entitled \"The Standard Industrial Classification Manual\". The codes are arranged in a hierarchical structure.\nNote that Residential Service Agreements are not classified according to the SIC codes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Standard Industrial Classification (SIC) are the codes that identify the type of products/service an industry is involved in, and used for statutory reporting purposes. For example, in the USA these codes are located by the federal government, and then published in a book entitled \"The Standard Industrial Classification Manual\". The codes are arranged in a hierarchical structure.\nNote that Residential Service Agreements are not classified according to the SIC codes.' Profile\040documentation='The Standard Industrial Classification (SIC) are the codes that identify the type of products/service an industry is involved in, and used for statutory reporting purposes. For example, in the USA these codes are located by the federal government, and then published in a book entitled \"The Standard Industrial Classification Manual\". The codes are arranged in a hierarchical structure.\nNote that Residential Service Agreements are not classified according to the SIC codes.'"
 * @generated
 */
public interface StandardIndustryCode extends Document {
	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode <em>Standard Industry Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getStandardIndustryCode_CustomerAgreements()
	 * @see CIM.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode
	 * @model opposite="StandardIndustryCode"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getStandardIndustryCode_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Standard alphanumeric code assigned to a particular product/service within an industry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Standard alphanumeric code assigned to a particular product/service within an industry.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // StandardIndustryCode
