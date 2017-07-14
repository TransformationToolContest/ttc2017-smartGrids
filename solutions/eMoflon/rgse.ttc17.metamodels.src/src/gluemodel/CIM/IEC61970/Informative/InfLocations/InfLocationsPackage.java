/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsFactory
 * @model kind="package"
 * @generated
 */
public interface InfLocationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfLocations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfLocations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfLocations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfLocationsPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.PersonPropertyRoleImpl <em>Person Property Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.PersonPropertyRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getPersonPropertyRole()
	 * @generated
	 */
	int PERSON_PROPERTY_ROLE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Land Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__LAND_PROPERTY = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person Property Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person Property Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PROPERTY_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RedLineImpl <em>Red Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RedLineImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getRedLine()
	 * @generated
	 */
	int RED_LINE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Red Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Red Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.HazardImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RouteImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LocationGrantImpl <em>Location Grant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LocationGrantImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getLocationGrant()
	 * @generated
	 */
	int LOCATION_GRANT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Land Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__LAND_PROPERTY = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT__PROPERTY_DATA = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location Grant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location Grant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GRANT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.DirectionImpl <em>Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.DirectionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__LOCATION = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__DIRECTION_INFO = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl <em>Land Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getLandProperty()
	 * @generated
	 */
	int LAND_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Demographic Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__DEMOGRAPHIC_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Record Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Site Level Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__ERP_SITE_LEVEL_DATAS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location Grants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__LOCATION_GRANTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__ERP_PERSON_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Right Of Ways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__RIGHT_OF_WAYS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Asset Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY__ASSET_CONTAINERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Land Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Land Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_PROPERTY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.OrgPropertyRoleImpl <em>Org Property Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.OrgPropertyRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getOrgPropertyRole()
	 * @generated
	 */
	int ORG_PROPERTY_ROLE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Land Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE__LAND_PROPERTY = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Org Property Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Org Property Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PROPERTY_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RightOfWayImpl <em>Right Of Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RightOfWayImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getRightOfWay()
	 * @generated
	 */
	int RIGHT_OF_WAY = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Property Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__PROPERTY_DATA = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY__LAND_PROPERTIES = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Right Of Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Right Of Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OF_WAY_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.ZoneImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__UUID = CommonPackage.LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__MRID = CommonPackage.LOCATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = CommonPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__DESCRIPTION = CommonPackage.LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PATH_NAME = CommonPackage.LOCATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__MODELING_AUTHORITY_SET = CommonPackage.LOCATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__LOCAL_NAME = CommonPackage.LOCATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ALIAS_NAME = CommonPackage.LOCATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__SECONDARY_ADDRESS = CommonPackage.LOCATION__SECONDARY_ADDRESS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__MEASUREMENTS = CommonPackage.LOCATION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__DIRECTIONS = CommonPackage.LOCATION__DIRECTIONS;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__POWER_SYSTEM_RESOURCES = CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PHONE2 = CommonPackage.LOCATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PHONE1 = CommonPackage.LOCATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__LAND_PROPERTIES = CommonPackage.LOCATION__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__GEO_INFO_REFERENCE = CommonPackage.LOCATION__GEO_INFO_REFERENCE;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__DIMENSIONS_INFO = CommonPackage.LOCATION__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CHANGE_ITEMS = CommonPackage.LOCATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ERP_ORGANISATIONS = CommonPackage.LOCATION__ERP_ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__COORDINATE_SYSTEMS = CommonPackage.LOCATION__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ASSETS = CommonPackage.LOCATION__ASSETS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ROUTES = CommonPackage.LOCATION__ROUTES;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__HAZARDS = CommonPackage.LOCATION__HAZARDS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CATEGORY = CommonPackage.LOCATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__MAIN_ADDRESS = CommonPackage.LOCATION__MAIN_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ELECTRONIC_ADDRESS = CommonPackage.LOCATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CORPORATE_CODE = CommonPackage.LOCATION__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__RED_LINES = CommonPackage.LOCATION__RED_LINES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__STATUS = CommonPackage.LOCATION__STATUS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__DIRECTION = CommonPackage.LOCATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CREWS = CommonPackage.LOCATION__CREWS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__POSITION = CommonPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__KIND = CommonPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = CommonPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = CommonPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind <em>Land Property Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getLandPropertyKind()
	 * @generated
	 */
	int LAND_PROPERTY_KIND = 10;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind <em>Zone Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getZoneKind()
	 * @generated
	 */
	int ZONE_KIND = 11;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind <em>Demographic Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getDemographicKind()
	 * @generated
	 */
	int DEMOGRAPHIC_KIND = 12;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole <em>Person Property Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Property Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole
	 * @generated
	 */
	EClass getPersonPropertyRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Land Property</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty()
	 * @see #getPersonPropertyRole()
	 * @generated
	 */
	EReference getPersonPropertyRole_LandProperty();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson()
	 * @see #getPersonPropertyRole()
	 * @generated
	 */
	EReference getPersonPropertyRole_ErpPerson();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RedLine <em>Red Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Red Line</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RedLine
	 * @generated
	 */
	EClass getRedLine();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RedLine#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RedLine#getLocations()
	 * @see #getRedLine()
	 * @generated
	 */
	EReference getRedLine_Locations();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RedLine#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RedLine#getStatus()
	 * @see #getRedLine()
	 * @generated
	 */
	EReference getRedLine_Status();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getLocations()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Locations();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getStatus()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getCategory()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Category();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getLocations()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Locations();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getCrews()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Crews();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getStatus()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getCategory()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Category();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant <em>Location Grant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Grant</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant
	 * @generated
	 */
	EClass getLocationGrant();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Land Property</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty()
	 * @see #getLocationGrant()
	 * @generated
	 */
	EReference getLocationGrant_LandProperty();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData()
	 * @see #getLocationGrant()
	 * @generated
	 */
	EAttribute getLocationGrant_PropertyData();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Direction
	 * @generated
	 */
	EClass getDirection();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Direction#getLocation()
	 * @see #getDirection()
	 * @generated
	 */
	EReference getDirection_Location();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Direction#getDirectionInfo()
	 * @see #getDirection()
	 * @generated
	 */
	EAttribute getDirection_DirectionInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Land Property</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty
	 * @generated
	 */
	EClass getLandProperty();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demographic Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind()
	 * @see #getLandProperty()
	 * @generated
	 */
	EAttribute getLandProperty_DemographicKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Record Reference</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference()
	 * @see #getLandProperty()
	 * @generated
	 */
	EAttribute getLandProperty_ExternalRecordReference();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas <em>Erp Site Level Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Site Level Datas</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_ErpSiteLevelDatas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getStatus()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_ErpOrganisationRoles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getLocations()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_Locations();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants <em>Location Grants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location Grants</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_LocationGrants();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Person Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getErpPersonRoles()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_ErpPersonRoles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getKind()
	 * @see #getLandProperty()
	 * @generated
	 */
	EAttribute getLandProperty_Kind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays <em>Right Of Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Of Ways</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_RightOfWays();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers <em>Asset Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Containers</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers()
	 * @see #getLandProperty()
	 * @generated
	 */
	EReference getLandProperty_AssetContainers();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole <em>Org Property Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Property Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole
	 * @generated
	 */
	EClass getOrgPropertyRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation()
	 * @see #getOrgPropertyRole()
	 * @generated
	 */
	EReference getOrgPropertyRole_ErpOrganisation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Property</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty()
	 * @see #getOrgPropertyRole()
	 * @generated
	 */
	EReference getOrgPropertyRole_LandProperty();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay <em>Right Of Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Of Way</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay
	 * @generated
	 */
	EClass getRightOfWay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData()
	 * @see #getRightOfWay()
	 * @generated
	 */
	EAttribute getRightOfWay_PropertyData();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Properties</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties()
	 * @see #getRightOfWay()
	 * @generated
	 */
	EReference getRightOfWay_LandProperties();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Zone#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Zone#getKind()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_Kind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind <em>Land Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Land Property Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind
	 * @generated
	 */
	EEnum getLandPropertyKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind <em>Zone Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Zone Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind
	 * @generated
	 */
	EEnum getZoneKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind <em>Demographic Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Demographic Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind
	 * @generated
	 */
	EEnum getDemographicKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfLocationsFactory getInfLocationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.PersonPropertyRoleImpl <em>Person Property Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.PersonPropertyRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getPersonPropertyRole()
		 * @generated
		 */
		EClass PERSON_PROPERTY_ROLE = eINSTANCE.getPersonPropertyRole();

		/**
		 * The meta object literal for the '<em><b>Land Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_PROPERTY_ROLE__LAND_PROPERTY = eINSTANCE.getPersonPropertyRole_LandProperty();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_PROPERTY_ROLE__ERP_PERSON = eINSTANCE.getPersonPropertyRole_ErpPerson();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RedLineImpl <em>Red Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RedLineImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getRedLine()
		 * @generated
		 */
		EClass RED_LINE = eINSTANCE.getRedLine();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_LINE__LOCATIONS = eINSTANCE.getRedLine_Locations();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_LINE__STATUS = eINSTANCE.getRedLine_Status();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.HazardImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__LOCATIONS = eINSTANCE.getHazard_Locations();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__STATUS = eINSTANCE.getHazard_Status();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__CATEGORY = eINSTANCE.getHazard_Category();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RouteImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__LOCATIONS = eINSTANCE.getRoute_Locations();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__CREWS = eINSTANCE.getRoute_Crews();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STATUS = eINSTANCE.getRoute_Status();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__CATEGORY = eINSTANCE.getRoute_Category();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LocationGrantImpl <em>Location Grant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LocationGrantImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getLocationGrant()
		 * @generated
		 */
		EClass LOCATION_GRANT = eINSTANCE.getLocationGrant();

		/**
		 * The meta object literal for the '<em><b>Land Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_GRANT__LAND_PROPERTY = eINSTANCE.getLocationGrant_LandProperty();

		/**
		 * The meta object literal for the '<em><b>Property Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_GRANT__PROPERTY_DATA = eINSTANCE.getLocationGrant_PropertyData();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.DirectionImpl <em>Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.DirectionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getDirection()
		 * @generated
		 */
		EClass DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTION__LOCATION = eINSTANCE.getDirection_Location();

		/**
		 * The meta object literal for the '<em><b>Direction Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION__DIRECTION_INFO = eINSTANCE.getDirection_DirectionInfo();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl <em>Land Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getLandProperty()
		 * @generated
		 */
		EClass LAND_PROPERTY = eINSTANCE.getLandProperty();

		/**
		 * The meta object literal for the '<em><b>Demographic Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAND_PROPERTY__DEMOGRAPHIC_KIND = eINSTANCE.getLandProperty_DemographicKind();

		/**
		 * The meta object literal for the '<em><b>External Record Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE = eINSTANCE.getLandProperty_ExternalRecordReference();

		/**
		 * The meta object literal for the '<em><b>Erp Site Level Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__ERP_SITE_LEVEL_DATAS = eINSTANCE.getLandProperty_ErpSiteLevelDatas();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__STATUS = eINSTANCE.getLandProperty_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__ERP_ORGANISATION_ROLES = eINSTANCE.getLandProperty_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__LOCATIONS = eINSTANCE.getLandProperty_Locations();

		/**
		 * The meta object literal for the '<em><b>Location Grants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__LOCATION_GRANTS = eINSTANCE.getLandProperty_LocationGrants();

		/**
		 * The meta object literal for the '<em><b>Erp Person Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__ERP_PERSON_ROLES = eINSTANCE.getLandProperty_ErpPersonRoles();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAND_PROPERTY__KIND = eINSTANCE.getLandProperty_Kind();

		/**
		 * The meta object literal for the '<em><b>Right Of Ways</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__RIGHT_OF_WAYS = eINSTANCE.getLandProperty_RightOfWays();

		/**
		 * The meta object literal for the '<em><b>Asset Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAND_PROPERTY__ASSET_CONTAINERS = eINSTANCE.getLandProperty_AssetContainers();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.OrgPropertyRoleImpl <em>Org Property Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.OrgPropertyRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getOrgPropertyRole()
		 * @generated
		 */
		EClass ORG_PROPERTY_ROLE = eINSTANCE.getOrgPropertyRole();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_PROPERTY_ROLE__ERP_ORGANISATION = eINSTANCE.getOrgPropertyRole_ErpOrganisation();

		/**
		 * The meta object literal for the '<em><b>Land Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_PROPERTY_ROLE__LAND_PROPERTY = eINSTANCE.getOrgPropertyRole_LandProperty();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RightOfWayImpl <em>Right Of Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.RightOfWayImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getRightOfWay()
		 * @generated
		 */
		EClass RIGHT_OF_WAY = eINSTANCE.getRightOfWay();

		/**
		 * The meta object literal for the '<em><b>Property Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_OF_WAY__PROPERTY_DATA = eINSTANCE.getRightOfWay_PropertyData();

		/**
		 * The meta object literal for the '<em><b>Land Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_OF_WAY__LAND_PROPERTIES = eINSTANCE.getRightOfWay_LandProperties();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.ZoneImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__KIND = eINSTANCE.getZone_Kind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind <em>Land Property Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getLandPropertyKind()
		 * @generated
		 */
		EEnum LAND_PROPERTY_KIND = eINSTANCE.getLandPropertyKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind <em>Zone Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getZoneKind()
		 * @generated
		 */
		EEnum ZONE_KIND = eINSTANCE.getZoneKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind <em>Demographic Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl#getDemographicKind()
		 * @generated
		 */
		EEnum DEMOGRAPHIC_KIND = eINSTANCE.getDemographicKind();

	}

} //InfLocationsPackage
