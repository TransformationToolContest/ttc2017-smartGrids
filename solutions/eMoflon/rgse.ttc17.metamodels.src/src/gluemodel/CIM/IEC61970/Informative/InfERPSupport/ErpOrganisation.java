/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.Organisation;

import gluemodel.CIM.IEC61970.Informative.Financial.IntSchedAgreement;

import gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole;

import gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole;

import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.Request;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews <em>Crews</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests <em>Requests</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRegisteredResources <em>Registered Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles <em>Asset Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles <em>Parent Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles <em>Land Property Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles <em>Child Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIntSchedAgreement <em>Int Sched Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identifies organisations that might have roles as utilities, contractors, suppliers, manufacturers, customers, etc. Organisations may also have parent-child relationships to identify departments within an organisation, or parent company relationships. The organization may be internal (e.g., departments) or external to the utility. There may be multiple organizations of a given \'category\', each with a unique \'code\'.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Identifies organisations that might have roles as utilities, contractors, suppliers, manufacturers, customers, etc. Organisations may also have parent-child relationships to identify departments within an organisation, or parent company relationships. The organization may be internal (e.g., departments) or external to the utility. There may be multiple organizations of a given \'category\', each with a unique \'code\'.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identifies organisations that might have roles as utilities, contractors, suppliers, manufacturers, customers, etc. Organisations may also have parent-child relationships to identify departments within an organisation, or parent company relationships. The organization may be internal (e.g., departments) or external to the utility. There may be multiple organizations of a given \'category\', each with a unique \'code\'.' Profile\040documentation='Identifies organisations that might have roles as utilities, contractors, suppliers, manufacturers, customers, etc. Organisations may also have parent-child relationships to identify departments within an organisation, or parent company relationships. The organization may be internal (e.g., departments) or external to the utility. There may be multiple organizations of a given \'category\', each with a unique \'code\'.'"
 * @generated
 */
public interface ErpOrganisation extends Organisation {
	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_Crews()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getOrganisations
	 * @model opposite="Organisations"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Request}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_Requests()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Request#getOrganisation
	 * @model opposite="Organisation"
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_Mode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operational mode of the organisation, often required for outage reporting purposes. Some utilities use text to describe various modes (like nominal, emergency, storm, other), while others use severity ratings (for example, 0 is a nominal condition and 5 is the most severe condition).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operational mode of the organisation, often required for outage reporting purposes. Some utilities use text to describe various modes (like nominal, emergency, storm, other), while others use severity ratings (for example, 0 is a nominal condition and 5 is the most severe condition).'"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Out</em>' attribute.
	 * @see #setOptOut(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_OptOut()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if organisation \"opted out\", i.e., has requested that their contact information not be shared with other organisations for purposes of solicitation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if organisation \"opted out\", i.e., has requested that their contact information not be shared with other organisations for purposes of solicitation.'"
	 * @generated
	 */
	boolean isOptOut();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Out</em>' attribute.
	 * @see #isOptOut()
	 * @generated
	 */
	void setOptOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Registered Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_RegisteredResources()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getOrganisation
	 * @model opposite="Organisation"
	 * @generated
	 */
	EList<RegisteredResource> getRegisteredResources();

	/**
	 * Returns the value of the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_PowerSystemResourceRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation
	 * @model opposite="ErpOrganisation"
	 * @generated
	 */
	EList<OrgPsrRole> getPowerSystemResourceRoles();

	/**
	 * Returns the value of the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Profit Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Profit Center</em>' attribute.
	 * @see #setIsProfitCenter(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_IsProfitCenter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if organisation is profit center.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if organisation is profit center.'"
	 * @generated
	 */
	boolean isIsProfitCenter();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Profit Center</em>' attribute.
	 * @see #isIsProfitCenter()
	 * @generated
	 */
	void setIsProfitCenter(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cost Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cost Center</em>' attribute.
	 * @see #setIsCostCenter(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_IsCostCenter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if organisation is cost center.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if organisation is cost center.'"
	 * @generated
	 */
	boolean isIsCostCenter();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cost Center</em>' attribute.
	 * @see #isIsCostCenter()
	 * @generated
	 */
	void setIsCostCenter(boolean value);

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_DocumentRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation
	 * @model opposite="ErpOrganisation"
	 * @generated
	 */
	EList<DocOrgRole> getDocumentRoles();

	/**
	 * Returns the value of the '<em><b>Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_AssetRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation
	 * @model opposite="ErpOrganisation"
	 * @generated
	 */
	EList<OrgAssetRole> getAssetRoles();

	/**
	 * Returns the value of the '<em><b>Violation Limits</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Violation Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Limits</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_ViolationLimits()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getOrganisations
	 * @model opposite="Organisations"
	 * @generated
	 */
	EList<ViolationLimit> getViolationLimits();

	/**
	 * Returns the value of the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Organisation Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_ParentOrganisationRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation
	 * @model opposite="ChildOrganisation"
	 * @generated
	 */
	EList<OrgOrgRole> getParentOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Land Property Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_LandPropertyRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation
	 * @model opposite="ErpOrganisation"
	 * @generated
	 */
	EList<OrgPropertyRole> getLandPropertyRoles();

	/**
	 * Returns the value of the '<em><b>Erp Person Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_ErpPersonRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation
	 * @model opposite="ErpOrganisation"
	 * @generated
	 */
	EList<OrgErpPersonRole> getErpPersonRoles();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Designated code for organisation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Designated code for organisation.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Organisation Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_ChildOrganisationRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation
	 * @model opposite="ParentOrganisation"
	 * @generated
	 */
	EList<OrgOrgRole> getChildOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Industry ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry ID</em>' attribute.
	 * @see #setIndustryID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_IndustryID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unique identifier for a given organisation (business). In the USA, this is a \'Dunns\" or D&amp;B number. This identifier is typically in addition to the identifiers that organizations assign (on an internal basis) to each of their locations. Note that a unique identifier can be set up for each location of an organisation. This requirement is supported through the recursive Organisation-Organisation relationship, where each child Organisation can have a specified physical location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unique identifier for a given organisation (business). In the USA, this is a \'Dunns\" or D&amp;B number. This identifier is typically in addition to the identifiers that organizations assign (on an internal basis) to each of their locations. Note that a unique identifier can be set up for each location of an organisation. This requirement is supported through the recursive Organisation-Organisation relationship, where each child Organisation can have a specified physical location.'"
	 * @generated
	 */
	String getIndustryID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Industry ID</em>' attribute.
	 * @see #getIndustryID()
	 * @generated
	 */
	void setIndustryID(String value);

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_ChangeItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation
	 * @model opposite="Organisation"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s corporate standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s corporate standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getErpOrganisations <em>Erp Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_Locations()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getErpOrganisations
	 * @model opposite="ErpOrganisations"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Financial.IntSchedAgreement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.IntSchedAgreement#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Sched Agreement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Sched Agreement</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_IntSchedAgreement()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.IntSchedAgreement#getOrganisations
	 * @model opposite="Organisations"
	 * @generated
	 */
	EList<IntSchedAgreement> getIntSchedAgreement();

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_ActivityRecords()
	 * @see gluemodel.CIM.IEC61968.Common.ActivityRecord#getOrganisations
	 * @model opposite="Organisations"
	 * @generated
	 */
	EList<ActivityRecord> getActivityRecords();

	/**
	 * Returns the value of the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Government ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Government ID</em>' attribute.
	 * @see #setGovernmentID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation_GovernmentID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unique identifier for organisation relative to its governing authority, for example a federal tax identifier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unique identifier for organisation relative to its governing authority, for example a federal tax identifier.'"
	 * @generated
	 */
	String getGovernmentID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Government ID</em>' attribute.
	 * @see #getGovernmentID()
	 * @generated
	 */
	void setGovernmentID(String value);

} // ErpOrganisation
