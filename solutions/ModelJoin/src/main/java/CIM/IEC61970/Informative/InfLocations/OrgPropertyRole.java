/**
 */
package CIM.IEC61970.Informative.InfLocations;

import CIM.IEC61970.Informative.InfCommon.Role;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Property Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty <em>Land Property</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getOrgPropertyRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Organisations and a given piece of property. For example, the Organisation may be the owner, renter, occupier, taxiing authority, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Organisations and a given piece of property. For example, the Organisation may be the owner, renter, occupier, taxiing authority, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Organisations and a given piece of property. For example, the Organisation may be the owner, renter, occupier, taxiing authority, etc.' Profile\040documentation='Roles played between Organisations and a given piece of property. For example, the Organisation may be the owner, renter, occupier, taxiing authority, etc.'"
 * @generated
 */
public interface OrgPropertyRole extends Role {
	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getOrgPropertyRole_ErpOrganisation()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles
	 * @model opposite="LandPropertyRoles"
	 * @generated
	 */
	ErpOrganisation getErpOrganisation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Organisation</em>' reference.
	 * @see #getErpOrganisation()
	 * @generated
	 */
	void setErpOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getOrgPropertyRole_LandProperty()
	 * @see CIM.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles
	 * @model opposite="ErpOrganisationRoles"
	 * @generated
	 */
	EList<LandProperty> getLandProperty();

} // OrgPropertyRole
