/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Org Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgOrgRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Organisations and other Organisations. This includes role ups for ogranisations, cost centers, profit centers, regulatory reporting, etc.\nNote that the parent and child relationship is indicated by the name on each end of the association.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Organisations and other Organisations. This includes role ups for ogranisations, cost centers, profit centers, regulatory reporting, etc.\nNote that the parent and child relationship is indicated by the name on each end of the association.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Organisations and other Organisations. This includes role ups for ogranisations, cost centers, profit centers, regulatory reporting, etc.\nNote that the parent and child relationship is indicated by the name on each end of the association.' Profile\040documentation='Roles played between Organisations and other Organisations. This includes role ups for ogranisations, cost centers, profit centers, regulatory reporting, etc.\nNote that the parent and child relationship is indicated by the name on each end of the association.'"
 * @generated
 */
public interface OrgOrgRole extends Role {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgOrgRole_ClientID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identifiers of the organisation held by another organisation, such as a government agency (federal, state, province, city, county), financial institution (Dun and Bradstreet), etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identifiers of the organisation held by another organisation, such as a government agency (federal, state, province, city, county), financial institution (Dun and Bradstreet), etc.'"
	 * @generated
	 */
	String getClientID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client ID</em>' attribute.
	 * @see #getClientID()
	 * @generated
	 */
	void setClientID(String value);

	/**
	 * Returns the value of the '<em><b>Child Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles <em>Parent Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Organisation</em>' reference.
	 * @see #setChildOrganisation(ErpOrganisation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgOrgRole_ChildOrganisation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles
	 * @model opposite="ParentOrganisationRoles"
	 * @generated
	 */
	ErpOrganisation getChildOrganisation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Organisation</em>' reference.
	 * @see #getChildOrganisation()
	 * @generated
	 */
	void setChildOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Parent Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles <em>Child Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Organisation</em>' reference.
	 * @see #setParentOrganisation(ErpOrganisation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgOrgRole_ParentOrganisation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles
	 * @model opposite="ChildOrganisationRoles"
	 * @generated
	 */
	ErpOrganisation getParentOrganisation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Organisation</em>' reference.
	 * @see #getParentOrganisation()
	 * @generated
	 */
	void setParentOrganisation(ErpOrganisation value);

} // OrgOrgRole
