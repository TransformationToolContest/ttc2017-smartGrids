/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfCommon.BusinessRole;
import gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getMarketRoles <em>Market Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Organisation#getBusinessRoles <em>Business Roles</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Organisation that might have roles as utility, contractor, supplier, manufacturer, customer, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Organisation that might have roles as utility, contractor, supplier, manufacturer, customer, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Organisation that might have roles as utility, contractor, supplier, manufacturer, customer, etc.' Profile\040documentation='Organisation that might have roles as utility, contractor, supplier, manufacturer, customer, etc.'"
 * @generated
 */
public interface Organisation extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Address</em>' reference.
	 * @see #setStreetAddress(StreetAddress)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_StreetAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Street address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Street address.'"
	 * @generated
	 */
	StreetAddress getStreetAddress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Organisation#getStreetAddress <em>Street Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Address</em>' reference.
	 * @see #getStreetAddress()
	 * @generated
	 */
	void setStreetAddress(StreetAddress value);

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_ElectronicAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address.'"
	 * @generated
	 */
	ElectronicAddress getElectronicAddress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Organisation#getElectronicAddress <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	void setElectronicAddress(ElectronicAddress value);

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address</em>' reference.
	 * @see #setPostalAddress(PostalAddress)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_PostalAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Postal address, potentially different than \'streetAddress\' (e.g., another city).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Postal address, potentially different than \'streetAddress\' (e.g., another city).'"
	 * @generated
	 */
	PostalAddress getPostalAddress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Organisation#getPostalAddress <em>Postal Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Address</em>' reference.
	 * @see #getPostalAddress()
	 * @generated
	 */
	void setPostalAddress(PostalAddress value);

	/**
	 * Returns the value of the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone1</em>' reference.
	 * @see #setPhone1(TelephoneNumber)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_Phone1()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phone number.'"
	 * @generated
	 */
	TelephoneNumber getPhone1();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Organisation#getPhone1 <em>Phone1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone1</em>' reference.
	 * @see #getPhone1()
	 * @generated
	 */
	void setPhone1(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone2</em>' reference.
	 * @see #setPhone2(TelephoneNumber)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_Phone2()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Additional phone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Additional phone number.'"
	 * @generated
	 */
	TelephoneNumber getPhone2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Organisation#getPhone2 <em>Phone2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone2</em>' reference.
	 * @see #getPhone2()
	 * @generated
	 */
	void setPhone2(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>Market Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_MarketRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getOrganisations
	 * @model opposite="Organisations"
	 * @generated
	 */
	EList<MarketRole> getMarketRoles();

	/**
	 * Returns the value of the '<em><b>Business Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.BusinessRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.BusinessRole#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getOrganisation_BusinessRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.BusinessRole#getOrganisations
	 * @model opposite="Organisations"
	 * @generated
	 */
	EList<BusinessRole> getBusinessRoles();

} // Organisation
