/**
 */
package CIM.IEC61968.Customers;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.PaymentMetering.TariffProfile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tariff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.Tariff#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Tariff#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Customers.CustomersPackage#getTariff()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document, approved by the responsible regulatory agency, listing the terms and conditions, including a schedule of prices, under which utility services will be provided. It has a unique number within the state or province. For Rate Schedules it is frequently allocated by the affiliated Public Utilities Commission.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Document, approved by the responsible regulatory agency, listing the terms and conditions, including a schedule of prices, under which utility services will be provided. It has a unique number within the state or province. For Rate Schedules it is frequently allocated by the affiliated Public Utilities Commission.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document, approved by the responsible regulatory agency, listing the terms and conditions, including a schedule of prices, under which utility services will be provided. It has a unique number within the state or province. For Rate Schedules it is frequently allocated by the affiliated Public Utilities Commission.' Profile\040documentation='Document, approved by the responsible regulatory agency, listing the terms and conditions, including a schedule of prices, under which utility services will be provided. It has a unique number within the state or province. For Rate Schedules it is frequently allocated by the affiliated Public Utilities Commission.'"
 * @generated
 */
public interface Tariff extends Document {
	/**
	 * Returns the value of the '<em><b>Tariff Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.TariffProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.TariffProfile#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Profiles</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getTariff_TariffProfiles()
	 * @see CIM.IEC61968.PaymentMetering.TariffProfile#getTariffs
	 * @model opposite="Tariffs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All tariff profiles using this tariff.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All tariff profiles using this tariff.'"
	 * @generated
	 */
	EList<TariffProfile> getTariffProfiles();

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.PricingStructure#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getTariff_PricingStructures()
	 * @see CIM.IEC61968.Customers.PricingStructure#getTariffs
	 * @model opposite="Tariffs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All pricing structures using this tariff.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All pricing structures using this tariff.'"
	 * @generated
	 */
	EList<PricingStructure> getPricingStructures();

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getTariff_EndDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if tariff became inactive) Date tariff was terminated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if tariff became inactive) Date tariff was terminated.'"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getTariff_StartDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date tariff was activated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date tariff was activated.'"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

} // Tariff
