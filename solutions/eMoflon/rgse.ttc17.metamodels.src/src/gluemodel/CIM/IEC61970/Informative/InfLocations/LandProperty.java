/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations;

import gluemodel.CIM.IEC61968.Assets.AssetContainer;

import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Land Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas <em>Erp Site Level Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants <em>Location Grants</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays <em>Right Of Ways</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers <em>Asset Containers</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information about a particular piece of (land) property such as its use. Ownership of the property may be determined through associations to Organisations and/or ErpPersons.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information about a particular piece of (land) property such as its use. Ownership of the property may be determined through associations to Organisations and/or ErpPersons.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information about a particular piece of (land) property such as its use. Ownership of the property may be determined through associations to Organisations and/or ErpPersons.' Profile\040documentation='Information about a particular piece of (land) property such as its use. Ownership of the property may be determined through associations to Organisations and/or ErpPersons.'"
 * @generated
 */
public interface LandProperty extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Demographic Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demographic Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demographic Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind
	 * @see #setDemographicKind(DemographicKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_DemographicKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demographics around the site.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demographics around the site.'"
	 * @generated
	 */
	DemographicKind getDemographicKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demographic Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind
	 * @see #getDemographicKind()
	 * @generated
	 */
	void setDemographicKind(DemographicKind value);

	/**
	 * Returns the value of the '<em><b>External Record Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Record Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Record Reference</em>' attribute.
	 * @see #setExternalRecordReference(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_ExternalRecordReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reference allocated by the governing organisation (such as municipality) to this piece of land that has a formal reference to Surveyor General\'s records. The governing organisation is specified in associated Organisation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reference allocated by the governing organisation (such as municipality) to this piece of land that has a formal reference to Surveyor General\'s records. The governing organisation is specified in associated Organisation.'"
	 * @generated
	 */
	String getExternalRecordReference();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Record Reference</em>' attribute.
	 * @see #getExternalRecordReference()
	 * @generated
	 */
	void setExternalRecordReference(String value);

	/**
	 * Returns the value of the '<em><b>Erp Site Level Datas</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Site Level Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Site Level Datas</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_ErpSiteLevelDatas()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty
	 * @model opposite="LandProperty"
	 * @generated
	 */
	EList<ErpSiteLevelData> getErpSiteLevelDatas();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_ErpOrganisationRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty
	 * @model opposite="LandProperty"
	 * @generated
	 */
	EList<OrgPropertyRole> getErpOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_Locations()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getLandProperties
	 * @model opposite="LandProperties"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The spatail description of a piece of property.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The spatail description of a piece of property.'"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Location Grants</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Grants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Grants</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_LocationGrants()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty
	 * @model opposite="LandProperty"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All location grants this land property has.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All location grants this land property has.'"
	 * @generated
	 */
	EList<LocationGrant> getLocationGrants();

	/**
	 * Returns the value of the '<em><b>Erp Person Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_ErpPersonRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty
	 * @model opposite="LandProperty"
	 * @generated
	 */
	EList<PersonPropertyRole> getErpPersonRoles();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind
	 * @see #setKind(LandPropertyKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of (land) property, categorised according to its main functional use from the utility\'s perspective.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of (land) property, categorised according to its main functional use from the utility\'s perspective.'"
	 * @generated
	 */
	LandPropertyKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(LandPropertyKind value);

	/**
	 * Returns the value of the '<em><b>Right Of Ways</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Of Ways</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Of Ways</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_RightOfWays()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties
	 * @model opposite="LandProperties"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All rights of way this land property has.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All rights of way this land property has.'"
	 * @generated
	 */
	EList<RightOfWay> getRightOfWays();

	/**
	 * Returns the value of the '<em><b>Asset Containers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.AssetContainer}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.AssetContainer#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Containers</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandProperty_AssetContainers()
	 * @see gluemodel.CIM.IEC61968.Assets.AssetContainer#getLandProperties
	 * @model opposite="LandProperties"
	 * @generated
	 */
	EList<AssetContainer> getAssetContainers();

} // LandProperty
