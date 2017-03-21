/**
 */
package CIM.IEC61970.Informative.InfLocations;

import CIM.IEC61970.Informative.InfCommon.Role;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Property Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getPersonPropertyRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The role of a person relative to a given piece of property. Examples of roles include: owner, renter, contractor, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The role of a person relative to a given piece of property. Examples of roles include: owner, renter, contractor, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The role of a person relative to a given piece of property. Examples of roles include: owner, renter, contractor, etc.' Profile\040documentation='The role of a person relative to a given piece of property. Examples of roles include: owner, renter, contractor, etc.'"
 * @generated
 */
public interface PersonPropertyRole extends Role {
	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.LandProperty#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference.
	 * @see #setLandProperty(LandProperty)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getPersonPropertyRole_LandProperty()
	 * @see CIM.IEC61970.Informative.InfLocations.LandProperty#getErpPersonRoles
	 * @model opposite="ErpPersonRoles"
	 * @generated
	 */
	LandProperty getLandProperty();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Property</em>' reference.
	 * @see #getLandProperty()
	 * @generated
	 */
	void setLandProperty(LandProperty value);

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getPersonPropertyRole_ErpPerson()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles
	 * @model opposite="LandPropertyRoles"
	 * @generated
	 */
	ErpPerson getErpPerson();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	void setErpPerson(ErpPerson value);

} // PersonPropertyRole
