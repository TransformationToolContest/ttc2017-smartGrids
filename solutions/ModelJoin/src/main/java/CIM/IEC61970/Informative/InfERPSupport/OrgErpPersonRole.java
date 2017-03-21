/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61970.Informative.InfCommon.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Erp Person Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgErpPersonRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Persons and Organisations.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Persons and Organisations.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Persons and Organisations.' Profile\040documentation='Roles played between Persons and Organisations.'"
 * @generated
 */
public interface OrgErpPersonRole extends Role {
	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgErpPersonRole_ErpOrganisation()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles
	 * @model opposite="ErpPersonRoles"
	 * @generated
	 */
	ErpOrganisation getErpOrganisation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Organisation</em>' reference.
	 * @see #getErpOrganisation()
	 * @generated
	 */
	void setErpOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client ID</em>' attribute.
	 * @see #setClientID(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgErpPersonRole_ClientID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identifiers of the person held by an organisation, such as a government agency (federal, state, province, city, county), financial institutions, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identifiers of the person held by an organisation, such as a government agency (federal, state, province, city, county), financial institutions, etc.'"
	 * @generated
	 */
	String getClientID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client ID</em>' attribute.
	 * @see #getClientID()
	 * @generated
	 */
	void setClientID(String value);

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgErpPersonRole_ErpPerson()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles
	 * @model opposite="ErpOrganisationRoles"
	 * @generated
	 */
	ErpPerson getErpPerson();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	void setErpPerson(ErpPerson value);

} // OrgErpPersonRole
