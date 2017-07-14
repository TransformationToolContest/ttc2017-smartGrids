/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Role;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Psr Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOrgPsrRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Organisations and Power System Resources.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Organisations and Power System Resources.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Organisations and Power System Resources.' Profile\040documentation='Roles played between Organisations and Power System Resources.'"
 * @generated
 */
public interface OrgPsrRole extends Role {
	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOrgPsrRole_PowerSystemResource()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles
	 * @model opposite="ErpOrganisationRoles"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOrgPsrRole_ErpOrganisation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles
	 * @model opposite="PowerSystemResourceRoles"
	 * @generated
	 */
	ErpOrganisation getErpOrganisation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Organisation</em>' reference.
	 * @see #getErpOrganisation()
	 * @generated
	 */
	void setErpOrganisation(ErpOrganisation value);

} // OrgPsrRole
