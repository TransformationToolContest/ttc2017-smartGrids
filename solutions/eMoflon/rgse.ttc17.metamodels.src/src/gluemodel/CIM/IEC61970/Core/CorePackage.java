/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.CIMPackage;

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
 * @see gluemodel.CIM.IEC61970.Core.CoreFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains the core PowerSystemResource and ConductingEquipment entities shared by all applications plus common collections of those entities. Not all applications require all the Core entities.  This package does not depend on any other package except the Domain package, but most of the other packages have associations and generalizations that depend on it.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains the core PowerSystemResource and ConductingEquipment entities shared by all applications plus common collections of those entities. Not all applications require all the Core entities.  This package does not depend on any other package except the Domain package, but most of the other packages have associations and generalizations that depend on it.'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimCore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl <em>Identified Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getIdentifiedObject()
	 * @generated
	 */
	int IDENTIFIED_OBJECT = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__MRID = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__DESCRIPTION = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__PATH_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__LOCAL_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__ALIAS_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Identified Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Identified Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPowerSystemResource()
	 * @generated
	 */
	int POWER_SYSTEM_RESOURCE = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__REPORTING_GROUP = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__LOCATION = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__PSR_EVENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__ASSETS = IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS = IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__PSR_TYPE = IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__PSR_LISTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__OPERATING_SHARE = IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__CHANGE_ITEMS = IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES = IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl <em>Connectivity Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getConnectivityNodeContainer()
	 * @generated
	 */
	int CONNECTIVITY_NODE_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__UUID = POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__MRID = POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__MODELING_AUTHORITY_SET = POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__LOCAL_NAME = POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__REPORTING_GROUP = POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__NETWORK_DATA_SETS = POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__LOCATION = POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__OUTAGE_SCHEDULE = POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__PSR_EVENT = POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__SAFETY_DOCUMENTS = POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__ERP_ORGANISATION_ROLES = POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__CIRCUIT_SECTIONS = POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__MEASUREMENTS = POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__ASSETS = POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__SCHEDULE_STEPS = POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__PSR_TYPE = POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__PSR_LISTS = POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__OPERATING_SHARE = POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__CHANGE_ITEMS = POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__DOCUMENT_ROLES = POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connectivity Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connectivity Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.EquipmentContainerImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getEquipmentContainer()
	 * @generated
	 */
	int EQUIPMENT_CONTAINER = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__UUID = CONNECTIVITY_NODE_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__MRID = CONNECTIVITY_NODE_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__NAME = CONNECTIVITY_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__DESCRIPTION = CONNECTIVITY_NODE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__PATH_NAME = CONNECTIVITY_NODE_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET = CONNECTIVITY_NODE_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__LOCAL_NAME = CONNECTIVITY_NODE_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__ALIAS_NAME = CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__REPORTING_GROUP = CONNECTIVITY_NODE_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__NETWORK_DATA_SETS = CONNECTIVITY_NODE_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__LOCATION = CONNECTIVITY_NODE_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE = CONNECTIVITY_NODE_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__PSR_EVENT = CONNECTIVITY_NODE_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS = CONNECTIVITY_NODE_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES = CONNECTIVITY_NODE_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS = CONNECTIVITY_NODE_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__MEASUREMENTS = CONNECTIVITY_NODE_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__ASSETS = CONNECTIVITY_NODE_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__SCHEDULE_STEPS = CONNECTIVITY_NODE_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__PSR_TYPE = CONNECTIVITY_NODE_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__PSR_LISTS = CONNECTIVITY_NODE_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__OPERATING_SHARE = CONNECTIVITY_NODE_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__CHANGE_ITEMS = CONNECTIVITY_NODE_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__DOCUMENT_ROLES = CONNECTIVITY_NODE_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__CONNECTIVITY_NODES = CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE = CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__EQUIPMENTS = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equipment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER_FEATURE_COUNT = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equipment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER_OPERATION_COUNT = CONNECTIVITY_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl <em>Bay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.BayImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBay()
	 * @generated
	 */
	int BAY = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__UUID = EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__MRID = EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__MODELING_AUTHORITY_SET = EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__LOCAL_NAME = EQUIPMENT_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__REPORTING_GROUP = EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__NETWORK_DATA_SETS = EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__LOCATION = EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__OUTAGE_SCHEDULE = EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__PSR_EVENT = EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__SAFETY_DOCUMENTS = EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__ERP_ORGANISATION_ROLES = EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__CIRCUIT_SECTIONS = EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__MEASUREMENTS = EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__ASSETS = EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__SCHEDULE_STEPS = EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__PSR_TYPE = EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__PSR_LISTS = EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__OPERATING_SHARE = EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__CHANGE_ITEMS = EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__DOCUMENT_ROLES = EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__TOPOLOGICAL_NODE = EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__EQUIPMENTS = EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Bay Energy Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__BAY_ENERGY_MEAS_FLAG = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Bar Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__BUS_BAR_CONFIGURATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bay Power Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__BAY_POWER_MEAS_FLAG = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__VOLTAGE_LEVEL = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Breaker Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__BREAKER_CONFIGURATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__SUBSTATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.TerminalImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONNECTIVITY_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sv Power Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__SV_POWER_FLOW = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has First Mutual Coupling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__HAS_FIRST_MUTUAL_COUPLING = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminal Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TERMINAL_CONSTRAINTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REGULATING_CONTROL = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONNECTED = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__SEQUENCE_NUMBER = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TIE_FLOW = IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__BRANCH_GROUP_TERMINAL = IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bushing Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__BUSHING_INFO = IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONDUCTING_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Has Second Mutual Coupling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__HAS_SECOND_MUTUAL_COUPLING = IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__OPERATIONAL_LIMIT_SET = IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl <em>Reporting Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getReportingGroup()
	 * @generated
	 */
	int REPORTING_GROUP = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__POWER_SYSTEM_RESOURCE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Name Marker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__BUS_NAME_MARKER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reporting Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP__REPORTING_SUPER_GROUP = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reporting Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reporting Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_GROUP_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.BasePowerImpl <em>Base Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.BasePowerImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBasePower()
	 * @generated
	 */
	int BASE_POWER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER__BASE_POWER = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_POWER_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl <em>Basic Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBasicIntervalSchedule()
	 * @generated
	 */
	int BASIC_INTERVAL_SCHEDULE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__START_TIME = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Basic Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Basic Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl <em>Regular Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getRegularIntervalSchedule()
	 * @generated
	 */
	int REGULAR_INTERVAL_SCHEDULE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__UUID = BASIC_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__MRID = BASIC_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__NAME = BASIC_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__DESCRIPTION = BASIC_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__PATH_NAME = BASIC_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET = BASIC_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME = BASIC_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME = BASIC_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__START_TIME = BASIC_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__END_TIME = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__TIME_POINTS = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__TIME_STEP = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Regular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Regular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT = BASIC_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.CurveImpl <em>Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.CurveImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCurve()
	 * @generated
	 */
	int CURVE = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y2_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__XMULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y3_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y1_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__CURVE_STYLE = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y3_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__XUNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__CURVE_DATAS = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y2_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y1_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.BaseVoltageImpl <em>Base Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.BaseVoltageImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBaseVoltage()
	 * @generated
	 */
	int BASE_VOLTAGE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__NOMINAL_VOLTAGE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__VOLTAGE_LEVEL = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is DC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__IS_DC = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__CONDUCTING_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Base Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Base Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl <em>Operating Share</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getOperatingShare()
	 * @generated
	 */
	int OPERATING_SHARE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SHARE__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SHARE__PERCENTAGE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SHARE__POWER_SYSTEM_RESOURCE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operating Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SHARE__OPERATING_PARTICIPANT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operating Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SHARE_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operating Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SHARE_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl <em>Irregular Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getIrregularTimePoint()
	 * @generated
	 */
	int IRREGULAR_TIME_POINT = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT__VALUE1 = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT__VALUE2 = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT__TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Irregular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Irregular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_TIME_POINT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__UUID = POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MRID = POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MODELING_AUTHORITY_SET = POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__LOCAL_NAME = POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__REPORTING_GROUP = POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NETWORK_DATA_SETS = POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__LOCATION = POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__OUTAGE_SCHEDULE = POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PSR_EVENT = POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__SAFETY_DOCUMENTS = POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ERP_ORGANISATION_ROLES = POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__CIRCUIT_SECTIONS = POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MEASUREMENTS = POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ASSETS = POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__SCHEDULE_STEPS = POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PSR_TYPE = POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PSR_LISTS = POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__OPERATING_SHARE = POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__CHANGE_ITEMS = POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__DOCUMENT_ROLES = POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__OPERATIONAL_LIMIT_SET = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__CONTINGENCY_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NORMA_ILY_IN_SERVICE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__CUSTOMER_AGREEMENTS = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__AGGREGATE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__EQUIPMENT_CONTAINER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.SubGeographicalRegionImpl <em>Sub Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.SubGeographicalRegionImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getSubGeographicalRegion()
	 * @generated
	 */
	int SUB_GEOGRAPHICAL_REGION = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__LINES = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__REGION = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__SUBSTATIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sub Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.UnitImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__CONTROLS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PROTECTION_EQUIPMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.ReportingSuperGroupImpl <em>Reporting Super Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.ReportingSuperGroupImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getReportingSuperGroup()
	 * @generated
	 */
	int REPORTING_SUPER_GROUP = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP__REPORTING_GROUP = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reporting Super Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reporting Super Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_SUPER_GROUP_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl <em>Regular Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getRegularTimePoint()
	 * @generated
	 */
	int REGULAR_TIME_POINT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Interval Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__INTERVAL_SCHEDULE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__VALUE1 = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__VALUE2 = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Regular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.PsrListImpl <em>Psr List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.PsrListImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPsrList()
	 * @generated
	 */
	int PSR_LIST = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type PSR List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__TYPE_PSR_LIST = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST__POWER_SYSTEM_RESOURCES = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Psr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Psr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_LIST_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.IrregularIntervalScheduleImpl <em>Irregular Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.IrregularIntervalScheduleImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getIrregularIntervalSchedule()
	 * @generated
	 */
	int IRREGULAR_INTERVAL_SCHEDULE = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__UUID = BASIC_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__MRID = BASIC_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__NAME = BASIC_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__DESCRIPTION = BASIC_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__PATH_NAME = BASIC_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET = BASIC_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__LOCAL_NAME = BASIC_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__ALIAS_NAME = BASIC_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__START_TIME = BASIC_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Irregular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Irregular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT = BASIC_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.PSRTypeImpl <em>PSR Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.PSRTypeImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPSRType()
	 * @generated
	 */
	int PSR_TYPE = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE__POWER_SYSTEM_RESOURCES = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_TYPE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.OperatingParticipantImpl <em>Operating Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.OperatingParticipantImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getOperatingParticipant()
	 * @generated
	 */
	int OPERATING_PARTICIPANT = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT__OPERATING_SHARE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operating Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operating Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_PARTICIPANT_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.CurveDataImpl <em>Curve Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.CurveDataImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCurveData()
	 * @generated
	 */
	int CURVE_DATA = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__XVALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__CURVE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y2VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y3value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y3VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y1VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Curve Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Curve Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.SubstationImpl <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.SubstationImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getSubstation()
	 * @generated
	 */
	int SUBSTATION = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__UUID = EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__MRID = EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__MODELING_AUTHORITY_SET = EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__LOCAL_NAME = EQUIPMENT_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__REPORTING_GROUP = EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__NETWORK_DATA_SETS = EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__LOCATION = EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__OUTAGE_SCHEDULE = EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__PSR_EVENT = EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__SAFETY_DOCUMENTS = EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__ERP_ORGANISATION_ROLES = EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CIRCUIT_SECTIONS = EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__MEASUREMENTS = EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__ASSETS = EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__SCHEDULE_STEPS = EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__PSR_TYPE = EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__PSR_LISTS = EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__OPERATING_SHARE = EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CHANGE_ITEMS = EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__DOCUMENT_ROLES = EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__TOPOLOGICAL_NODE = EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__EQUIPMENTS = EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Bays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__BAYS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__REGION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__VOLTAGE_LEVELS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.GeographicalRegionImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getGeographicalRegion()
	 * @generated
	 */
	int GEOGRAPHICAL_REGION = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__REGIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getVoltageLevel()
	 * @generated
	 */
	int VOLTAGE_LEVEL = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__UUID = EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__MRID = EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__MODELING_AUTHORITY_SET = EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__LOCAL_NAME = EQUIPMENT_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__REPORTING_GROUP = EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__NETWORK_DATA_SETS = EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__LOCATION = EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__OUTAGE_SCHEDULE = EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__PSR_EVENT = EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__SAFETY_DOCUMENTS = EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__ERP_ORGANISATION_ROLES = EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CIRCUIT_SECTIONS = EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__MEASUREMENTS = EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__ASSETS = EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__SCHEDULE_STEPS = EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__PSR_TYPE = EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__PSR_LISTS = EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__OPERATING_SHARE = EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CHANGE_ITEMS = EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__DOCUMENT_ROLES = EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__TOPOLOGICAL_NODE = EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__EQUIPMENTS = EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Bays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__BAYS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Low Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__BASE_VOLTAGE = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__SUBSTATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Voltage Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Voltage Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeImpl <em>Connectivity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getConnectivityNode()
	 * @generated
	 */
	int CONNECTIVITY_NODE = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__LOCAL_NAME = IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Connectivity Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Name Marker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__BUS_NAME_MARKER = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loss Penalty Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node Constraint Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__TERMINALS = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__PNODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Connectivity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Connectivity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getConductingEquipment()
	 * @generated
	 */
	int CONDUCTING_EQUIPMENT = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__UUID = EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__MRID = EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__DESCRIPTION = EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PATH_NAME = EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET = EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__LOCAL_NAME = EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__ALIAS_NAME = EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__REPORTING_GROUP = EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS = EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__LOCATION = EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE = EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PSR_EVENT = EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS = EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES = EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS = EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__MEASUREMENTS = EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__ASSETS = EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__SCHEDULE_STEPS = EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PSR_TYPE = EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PSR_LISTS = EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__OPERATING_SHARE = EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__CHANGE_ITEMS = EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__DOCUMENT_ROLES = EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET = EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT = EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE = EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS = EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__AGGREGATE = EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER = EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__BASE_VOLTAGE = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__CLEARANCE_TAGS = EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__SV_STATUS = EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PHASES = EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS = EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__TERMINALS = EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.BreakerConfiguration <em>Breaker Configuration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.BreakerConfiguration
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBreakerConfiguration()
	 * @generated
	 */
	int BREAKER_CONFIGURATION = 29;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.BusbarConfiguration <em>Busbar Configuration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.BusbarConfiguration
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBusbarConfiguration()
	 * @generated
	 */
	int BUSBAR_CONFIGURATION = 30;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.CompanyType <em>Company Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.CompanyType
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCompanyType()
	 * @generated
	 */
	int COMPANY_TYPE = 31;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.CurveStyle <em>Curve Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.CurveStyle
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCurveStyle()
	 * @generated
	 */
	int CURVE_STYLE = 32;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Core.PhaseCode <em>Phase Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPhaseCode()
	 * @generated
	 */
	int PHASE_CODE = 33;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.Bay <em>Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bay</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay
	 * @generated
	 */
	EClass getBay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bay Energy Meas Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay#isBayEnergyMeasFlag()
	 * @see #getBay()
	 * @generated
	 */
	EAttribute getBay_BayEnergyMeasFlag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Bar Configuration</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay#getBusBarConfiguration()
	 * @see #getBay()
	 * @generated
	 */
	EAttribute getBay_BusBarConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bay Power Meas Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay#isBayPowerMeasFlag()
	 * @see #getBay()
	 * @generated
	 */
	EAttribute getBay_BayPowerMeasFlag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voltage Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay#getVoltageLevel()
	 * @see #getBay()
	 * @generated
	 */
	EReference getBay_VoltageLevel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breaker Configuration</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay#getBreakerConfiguration()
	 * @see #getBay()
	 * @generated
	 */
	EAttribute getBay_BreakerConfiguration();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Bay#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substation</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Bay#getSubstation()
	 * @see #getBay()
	 * @generated
	 */
	EReference getBay_Substation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getConnectivityNode()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ConnectivityNode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Power Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getSvPowerFlow()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_SvPowerFlow();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has First Mutual Coupling</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getHasFirst_MutualCoupling()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_HasFirst_MutualCoupling();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getTerminalConstraints <em>Terminal Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminal Constraints</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getTerminalConstraints()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_TerminalConstraints();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Control</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getRegulatingControl()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_RegulatingControl();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Terminal#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#isConnected()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Connected();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getMeasurements()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Measurements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getSequenceNumber()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getTieFlow()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_TieFlow();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getTopologicalNode()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_TopologicalNode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branch Group Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getBranchGroupTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_BranchGroupTerminal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bushing Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getBushingInfo()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_BushingInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getConductingEquipment()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ConductingEquipment();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Second Mutual Coupling</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getHasSecond_MutualCoupling()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_HasSecond_MutualCoupling();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Terminal#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getOperationalLimitSet()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_OperationalLimitSet();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup
	 * @generated
	 */
	EClass getReportingGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getPowerSystemResource()
	 * @see #getReportingGroup()
	 * @generated
	 */
	EReference getReportingGroup_PowerSystemResource();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bus Name Marker</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getBusNameMarker()
	 * @see #getReportingGroup()
	 * @generated
	 */
	EReference getReportingGroup_BusNameMarker();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getTopologicalNode()
	 * @see #getReportingGroup()
	 * @generated
	 */
	EReference getReportingGroup_TopologicalNode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporting Super Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getReportingSuperGroup()
	 * @see #getReportingGroup()
	 * @generated
	 */
	EReference getReportingGroup_ReportingSuperGroup();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.BasePower <em>Base Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Power</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasePower
	 * @generated
	 */
	EClass getBasePower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BasePower#getBasePower <em>Base Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Power</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasePower#getBasePower()
	 * @see #getBasePower()
	 * @generated
	 */
	EAttribute getBasePower_BasePower();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Interval Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule
	 * @generated
	 */
	EClass getRegularIntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getEndTime()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EAttribute getRegularIntervalSchedule_EndTime();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimePoints()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EReference getRegularIntervalSchedule_TimePoints();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimeStep()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EAttribute getRegularIntervalSchedule_TimeStep();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve
	 * @generated
	 */
	EClass getCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getY2Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y2Unit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMultiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getXMultiplier()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_XMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3 Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getY3Multiplier()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y3Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getY1Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y1Unit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Style</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getCurveStyle()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_CurveStyle();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3 Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getY3Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y3Unit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XUnit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getXUnit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_XUnit();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Curve#getCurveDatas <em>Curve Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Curve Datas</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getCurveDatas()
	 * @see #getCurve()
	 * @generated
	 */
	EReference getCurve_CurveDatas();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getY2Multiplier()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y2Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getY1Multiplier()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y1Multiplier();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage
	 * @generated
	 */
	EClass getBaseVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#getNominalVoltage()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EAttribute getBaseVoltage_NominalVoltage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#getTopologicalNode()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_TopologicalNode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#getVoltageLevel()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_VoltageLevel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is DC</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#isIsDC()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EAttribute getBaseVoltage_IsDC();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#getConductingEquipment()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_ConductingEquipment();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.OperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Share</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.OperatingShare
	 * @generated
	 */
	EClass getOperatingShare();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.OperatingShare#getPercentage()
	 * @see #getOperatingShare()
	 * @generated
	 */
	EAttribute getOperatingShare_Percentage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.OperatingShare#getPowerSystemResource()
	 * @see #getOperatingShare()
	 * @generated
	 */
	EReference getOperatingShare_PowerSystemResource();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operating Participant</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.OperatingShare#getOperatingParticipant()
	 * @see #getOperatingShare()
	 * @generated
	 */
	EReference getOperatingShare_OperatingParticipant();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node Container</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer
	 * @generated
	 */
	EClass getConnectivityNodeContainer();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Nodes</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes()
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	EReference getConnectivityNodeContainer_ConnectivityNodes();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode()
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	EReference getConnectivityNodeContainer_TopologicalNode();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint <em>Irregular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irregular Time Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularTimePoint
	 * @generated
	 */
	EClass getIrregularTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getValue1()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	EAttribute getIrregularTimePoint_Value1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getValue2()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	EAttribute getIrregularTimePoint_Value2();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getIntervalSchedule()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	EReference getIrregularTimePoint_IntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getTime()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	EAttribute getIrregularTimePoint_Time();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getOperationalLimitSet()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_OperationalLimitSet();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contingency Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getContingencyEquipment()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_ContingencyEquipment();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Equipment#isNormaIlyInService <em>Norma Ily In Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Norma Ily In Service</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#isNormaIlyInService()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_NormaIlyInService();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Equipment#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getCustomerAgreements()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_CustomerAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#isAggregate()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Aggregate();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment Container</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getEquipmentContainer()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_EquipmentContainer();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion <em>Sub Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Geographical Region</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.SubGeographicalRegion
	 * @generated
	 */
	EClass getSubGeographicalRegion();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getLines()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Lines();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getRegion()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Region();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substations</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getSubstations()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Substations();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Unit#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Unit#getControls()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Controls();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Unit#getProtectionEquipments <em>Protection Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protection Equipments</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Unit#getProtectionEquipments()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_ProtectionEquipments();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Unit#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Unit#getMeasurements()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Measurements();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.ReportingSuperGroup <em>Reporting Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting Super Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingSuperGroup
	 * @generated
	 */
	EClass getReportingSuperGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reporting Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ReportingSuperGroup#getReportingGroup()
	 * @see #getReportingSuperGroup()
	 * @generated
	 */
	EReference getReportingSuperGroup_ReportingGroup();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint <em>Regular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Time Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularTimePoint
	 * @generated
	 */
	EClass getRegularTimePoint();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularTimePoint#getIntervalSchedule()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EReference getRegularTimePoint_IntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue1()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_Value1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue2()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_Value2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.RegularTimePoint#getSequenceNumber()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_SequenceNumber();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.PsrList <em>Psr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Psr List</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PsrList
	 * @generated
	 */
	EClass getPsrList();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type PSR List</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PsrList#getTypePSRList()
	 * @see #getPsrList()
	 * @generated
	 */
	EAttribute getPsrList_TypePSRList();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PsrList#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PsrList#getPowerSystemResources()
	 * @see #getPsrList()
	 * @generated
	 */
	EReference getPsrList_PowerSystemResources();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Interval Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule
	 * @generated
	 */
	EClass getBasicIntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2 Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value2Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1 Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value1Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getStartTime()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2 Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value2Unit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1 Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value1Unit();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule <em>Irregular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irregular Interval Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule
	 * @generated
	 */
	EClass getIrregularIntervalSchedule();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule#getTimePoints()
	 * @see #getIrregularIntervalSchedule()
	 * @generated
	 */
	EReference getIrregularIntervalSchedule_TimePoints();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.PSRType <em>PSR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSR Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PSRType
	 * @generated
	 */
	EClass getPSRType();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PSRType#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PSRType#getPowerSystemResources()
	 * @see #getPSRType()
	 * @generated
	 */
	EReference getPSRType_PowerSystemResources();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.OperatingParticipant <em>Operating Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Participant</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.OperatingParticipant
	 * @generated
	 */
	EClass getOperatingParticipant();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.OperatingParticipant#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operating Share</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.OperatingParticipant#getOperatingShare()
	 * @see #getOperatingParticipant()
	 * @generated
	 */
	EReference getOperatingParticipant_OperatingShare();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.CurveData <em>Curve Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveData
	 * @generated
	 */
	EClass getCurveData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvalue</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveData#getXvalue()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Xvalue();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.CurveData#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveData#getCurve()
	 * @see #getCurveData()
	 * @generated
	 */
	EReference getCurveData_Curve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2value</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveData#getY2value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y2value();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3value</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveData#getY3value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y3value();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1value</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveData#getY1value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y1value();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Container</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.EquipmentContainer
	 * @generated
	 */
	EClass getEquipmentContainer();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.EquipmentContainer#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipments</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.EquipmentContainer#getEquipments()
	 * @see #getEquipmentContainer()
	 * @generated
	 */
	EReference getEquipmentContainer_Equipments();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource
	 * @generated
	 */
	EClass getPowerSystemResource();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reporting Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getReportingGroup()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_ReportingGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getNetworkDataSets()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_NetworkDataSets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getLocation()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_Location();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getOutageSchedule()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_OutageSchedule();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSREvent <em>PSR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PSR Event</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSREvent()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_PSREvent();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getSafetyDocuments <em>Safety Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Safety Documents</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getSafetyDocuments()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_SafetyDocuments();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_ErpOrganisationRoles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getCircuitSections <em>Circuit Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circuit Sections</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getCircuitSections()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_CircuitSections();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getMeasurements()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getAssets()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_Assets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Steps</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getScheduleSteps()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_ScheduleSteps();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PSR Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSRType()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_PSRType();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPsrLists <em>Psr Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Psr Lists</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPsrLists()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_PsrLists();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operating Share</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getOperatingShare()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_OperatingShare();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getChangeItems()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_ChangeItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getDocumentRoles()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_DocumentRoles();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Substation
	 * @generated
	 */
	EClass getSubstation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Substation#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bays</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Substation#getBays()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Bays();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Substation#getRegion()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Region();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.Substation#getVoltageLevels <em>Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Levels</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.Substation#getVoltageLevels()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_VoltageLevels();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.GeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Region</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.GeographicalRegion
	 * @generated
	 */
	EClass getGeographicalRegion();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regions</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.GeographicalRegion#getRegions()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	EReference getGeographicalRegion_Regions();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Object</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	EClass getIdentifiedObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MRID</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getMRID()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_MRID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getDescription()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getPathName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_PathName();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modeling Authority Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EReference getIdentifiedObject_ModelingAuthoritySet();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getLocalName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_LocalName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getAliasName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_AliasName();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel
	 * @generated
	 */
	EClass getVoltageLevel();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bays</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel#getBays()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_Bays();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Voltage Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel#getLowVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EAttribute getVoltageLevel_LowVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Voltage Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel#getHighVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EAttribute getVoltageLevel_HighVoltageLimit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel#getBaseVoltage()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_BaseVoltage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substation</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel#getSubstation()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_Substation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode
	 * @generated
	 */
	EClass getConnectivityNode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node Container</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_ConnectivityNodeContainer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTopologicalNode()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_TopologicalNode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Name Marker</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getBusNameMarker()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_BusNameMarker();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getLossPenaltyFactors <em>Loss Penalty Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loss Penalty Factors</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getLossPenaltyFactors()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_LossPenaltyFactors();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getNodeConstraintTerms <em>Node Constraint Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Constraint Terms</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getNodeConstraintTerms()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_NodeConstraintTerms();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTerminals()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_Terminals();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pnode</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getPnode()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_Pnode();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conducting Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment
	 * @generated
	 */
	EClass getConductingEquipment();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protection Equipments</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getProtectionEquipments()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_ProtectionEquipments();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getOutageStepRoles <em>Outage Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Step Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getOutageStepRoles()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_OutageStepRoles();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getBaseVoltage()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_BaseVoltage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clearance Tags</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getClearanceTags()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_ClearanceTags();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getSvStatus()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_SvStatus();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getPhases()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EAttribute getConductingEquipment_Phases();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getElectricalAssets <em>Electrical Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getElectricalAssets()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_ElectricalAssets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getTerminals()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_Terminals();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Core.BreakerConfiguration <em>Breaker Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Breaker Configuration</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BreakerConfiguration
	 * @generated
	 */
	EEnum getBreakerConfiguration();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Core.BusbarConfiguration <em>Busbar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Busbar Configuration</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.BusbarConfiguration
	 * @generated
	 */
	EEnum getBusbarConfiguration();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Core.CompanyType <em>Company Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Company Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CompanyType
	 * @generated
	 */
	EEnum getCompanyType();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Core.CurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Curve Style</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.CurveStyle
	 * @generated
	 */
	EEnum getCurveStyle();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Core.PhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phase Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @generated
	 */
	EEnum getPhaseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl <em>Bay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.BayImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBay()
		 * @generated
		 */
		EClass BAY = eINSTANCE.getBay();

		/**
		 * The meta object literal for the '<em><b>Bay Energy Meas Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAY__BAY_ENERGY_MEAS_FLAG = eINSTANCE.getBay_BayEnergyMeasFlag();

		/**
		 * The meta object literal for the '<em><b>Bus Bar Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAY__BUS_BAR_CONFIGURATION = eINSTANCE.getBay_BusBarConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bay Power Meas Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAY__BAY_POWER_MEAS_FLAG = eINSTANCE.getBay_BayPowerMeasFlag();

		/**
		 * The meta object literal for the '<em><b>Voltage Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY__VOLTAGE_LEVEL = eINSTANCE.getBay_VoltageLevel();

		/**
		 * The meta object literal for the '<em><b>Breaker Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAY__BREAKER_CONFIGURATION = eINSTANCE.getBay_BreakerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY__SUBSTATION = eINSTANCE.getBay_Substation();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.TerminalImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__CONNECTIVITY_NODE = eINSTANCE.getTerminal_ConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>Sv Power Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__SV_POWER_FLOW = eINSTANCE.getTerminal_SvPowerFlow();

		/**
		 * The meta object literal for the '<em><b>Has First Mutual Coupling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__HAS_FIRST_MUTUAL_COUPLING = eINSTANCE.getTerminal_HasFirst_MutualCoupling();

		/**
		 * The meta object literal for the '<em><b>Terminal Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__TERMINAL_CONSTRAINTS = eINSTANCE.getTerminal_TerminalConstraints();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__REGULATING_CONTROL = eINSTANCE.getTerminal_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__CONNECTED = eINSTANCE.getTerminal_Connected();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__MEASUREMENTS = eINSTANCE.getTerminal_Measurements();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__SEQUENCE_NUMBER = eINSTANCE.getTerminal_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__TIE_FLOW = eINSTANCE.getTerminal_TieFlow();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__TOPOLOGICAL_NODE = eINSTANCE.getTerminal_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Branch Group Terminal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__BRANCH_GROUP_TERMINAL = eINSTANCE.getTerminal_BranchGroupTerminal();

		/**
		 * The meta object literal for the '<em><b>Bushing Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__BUSHING_INFO = eINSTANCE.getTerminal_BushingInfo();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__CONDUCTING_EQUIPMENT = eINSTANCE.getTerminal_ConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Has Second Mutual Coupling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__HAS_SECOND_MUTUAL_COUPLING = eINSTANCE.getTerminal_HasSecond_MutualCoupling();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__OPERATIONAL_LIMIT_SET = eINSTANCE.getTerminal_OperationalLimitSet();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl <em>Reporting Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getReportingGroup()
		 * @generated
		 */
		EClass REPORTING_GROUP = eINSTANCE.getReportingGroup();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING_GROUP__POWER_SYSTEM_RESOURCE = eINSTANCE.getReportingGroup_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Bus Name Marker</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING_GROUP__BUS_NAME_MARKER = eINSTANCE.getReportingGroup_BusNameMarker();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING_GROUP__TOPOLOGICAL_NODE = eINSTANCE.getReportingGroup_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Reporting Super Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING_GROUP__REPORTING_SUPER_GROUP = eINSTANCE.getReportingGroup_ReportingSuperGroup();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.BasePowerImpl <em>Base Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.BasePowerImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBasePower()
		 * @generated
		 */
		EClass BASE_POWER = eINSTANCE.getBasePower();

		/**
		 * The meta object literal for the '<em><b>Base Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_POWER__BASE_POWER = eINSTANCE.getBasePower_BasePower();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl <em>Regular Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getRegularIntervalSchedule()
		 * @generated
		 */
		EClass REGULAR_INTERVAL_SCHEDULE = eINSTANCE.getRegularIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_INTERVAL_SCHEDULE__END_TIME = eINSTANCE.getRegularIntervalSchedule_EndTime();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_INTERVAL_SCHEDULE__TIME_POINTS = eINSTANCE.getRegularIntervalSchedule_TimePoints();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_INTERVAL_SCHEDULE__TIME_STEP = eINSTANCE.getRegularIntervalSchedule_TimeStep();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.CurveImpl <em>Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.CurveImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCurve()
		 * @generated
		 */
		EClass CURVE = eINSTANCE.getCurve();

		/**
		 * The meta object literal for the '<em><b>Y2 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y2_UNIT = eINSTANCE.getCurve_Y2Unit();

		/**
		 * The meta object literal for the '<em><b>XMultiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__XMULTIPLIER = eINSTANCE.getCurve_XMultiplier();

		/**
		 * The meta object literal for the '<em><b>Y3 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y3_MULTIPLIER = eINSTANCE.getCurve_Y3Multiplier();

		/**
		 * The meta object literal for the '<em><b>Y1 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y1_UNIT = eINSTANCE.getCurve_Y1Unit();

		/**
		 * The meta object literal for the '<em><b>Curve Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__CURVE_STYLE = eINSTANCE.getCurve_CurveStyle();

		/**
		 * The meta object literal for the '<em><b>Y3 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y3_UNIT = eINSTANCE.getCurve_Y3Unit();

		/**
		 * The meta object literal for the '<em><b>XUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__XUNIT = eINSTANCE.getCurve_XUnit();

		/**
		 * The meta object literal for the '<em><b>Curve Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURVE__CURVE_DATAS = eINSTANCE.getCurve_CurveDatas();

		/**
		 * The meta object literal for the '<em><b>Y2 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y2_MULTIPLIER = eINSTANCE.getCurve_Y2Multiplier();

		/**
		 * The meta object literal for the '<em><b>Y1 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y1_MULTIPLIER = eINSTANCE.getCurve_Y1Multiplier();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.BaseVoltageImpl <em>Base Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.BaseVoltageImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBaseVoltage()
		 * @generated
		 */
		EClass BASE_VOLTAGE = eINSTANCE.getBaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_VOLTAGE__NOMINAL_VOLTAGE = eINSTANCE.getBaseVoltage_NominalVoltage();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_VOLTAGE__TOPOLOGICAL_NODE = eINSTANCE.getBaseVoltage_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Voltage Level</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_VOLTAGE__VOLTAGE_LEVEL = eINSTANCE.getBaseVoltage_VoltageLevel();

		/**
		 * The meta object literal for the '<em><b>Is DC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_VOLTAGE__IS_DC = eINSTANCE.getBaseVoltage_IsDC();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_VOLTAGE__CONDUCTING_EQUIPMENT = eINSTANCE.getBaseVoltage_ConductingEquipment();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl <em>Operating Share</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getOperatingShare()
		 * @generated
		 */
		EClass OPERATING_SHARE = eINSTANCE.getOperatingShare();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SHARE__PERCENTAGE = eINSTANCE.getOperatingShare_Percentage();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SHARE__POWER_SYSTEM_RESOURCE = eINSTANCE.getOperatingShare_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Operating Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SHARE__OPERATING_PARTICIPANT = eINSTANCE.getOperatingShare_OperatingParticipant();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl <em>Connectivity Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getConnectivityNodeContainer()
		 * @generated
		 */
		EClass CONNECTIVITY_NODE_CONTAINER = eINSTANCE.getConnectivityNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Connectivity Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES = eINSTANCE.getConnectivityNodeContainer_ConnectivityNodes();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE = eINSTANCE.getConnectivityNodeContainer_TopologicalNode();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl <em>Irregular Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getIrregularTimePoint()
		 * @generated
		 */
		EClass IRREGULAR_TIME_POINT = eINSTANCE.getIrregularTimePoint();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRREGULAR_TIME_POINT__VALUE1 = eINSTANCE.getIrregularTimePoint_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRREGULAR_TIME_POINT__VALUE2 = eINSTANCE.getIrregularTimePoint_Value2();

		/**
		 * The meta object literal for the '<em><b>Interval Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE = eINSTANCE.getIrregularTimePoint_IntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRREGULAR_TIME_POINT__TIME = eINSTANCE.getIrregularTimePoint_Time();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__OPERATIONAL_LIMIT_SET = eINSTANCE.getEquipment_OperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Contingency Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__CONTINGENCY_EQUIPMENT = eINSTANCE.getEquipment_ContingencyEquipment();

		/**
		 * The meta object literal for the '<em><b>Norma Ily In Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__NORMA_ILY_IN_SERVICE = eINSTANCE.getEquipment_NormaIlyInService();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__CUSTOMER_AGREEMENTS = eINSTANCE.getEquipment_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__AGGREGATE = eINSTANCE.getEquipment_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Equipment Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__EQUIPMENT_CONTAINER = eINSTANCE.getEquipment_EquipmentContainer();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.SubGeographicalRegionImpl <em>Sub Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.SubGeographicalRegionImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getSubGeographicalRegion()
		 * @generated
		 */
		EClass SUB_GEOGRAPHICAL_REGION = eINSTANCE.getSubGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GEOGRAPHICAL_REGION__LINES = eINSTANCE.getSubGeographicalRegion_Lines();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GEOGRAPHICAL_REGION__REGION = eINSTANCE.getSubGeographicalRegion_Region();

		/**
		 * The meta object literal for the '<em><b>Substations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GEOGRAPHICAL_REGION__SUBSTATIONS = eINSTANCE.getSubGeographicalRegion_Substations();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.UnitImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__CONTROLS = eINSTANCE.getUnit_Controls();

		/**
		 * The meta object literal for the '<em><b>Protection Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__PROTECTION_EQUIPMENTS = eINSTANCE.getUnit_ProtectionEquipments();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__MEASUREMENTS = eINSTANCE.getUnit_Measurements();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.ReportingSuperGroupImpl <em>Reporting Super Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.ReportingSuperGroupImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getReportingSuperGroup()
		 * @generated
		 */
		EClass REPORTING_SUPER_GROUP = eINSTANCE.getReportingSuperGroup();

		/**
		 * The meta object literal for the '<em><b>Reporting Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING_SUPER_GROUP__REPORTING_GROUP = eINSTANCE.getReportingSuperGroup_ReportingGroup();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl <em>Regular Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getRegularTimePoint()
		 * @generated
		 */
		EClass REGULAR_TIME_POINT = eINSTANCE.getRegularTimePoint();

		/**
		 * The meta object literal for the '<em><b>Interval Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TIME_POINT__INTERVAL_SCHEDULE = eINSTANCE.getRegularTimePoint_IntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TIME_POINT__VALUE1 = eINSTANCE.getRegularTimePoint_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TIME_POINT__VALUE2 = eINSTANCE.getRegularTimePoint_Value2();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TIME_POINT__SEQUENCE_NUMBER = eINSTANCE.getRegularTimePoint_SequenceNumber();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.PsrListImpl <em>Psr List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.PsrListImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPsrList()
		 * @generated
		 */
		EClass PSR_LIST = eINSTANCE.getPsrList();

		/**
		 * The meta object literal for the '<em><b>Type PSR List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSR_LIST__TYPE_PSR_LIST = eINSTANCE.getPsrList_TypePSRList();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSR_LIST__POWER_SYSTEM_RESOURCES = eINSTANCE.getPsrList_PowerSystemResources();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl <em>Basic Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBasicIntervalSchedule()
		 * @generated
		 */
		EClass BASIC_INTERVAL_SCHEDULE = eINSTANCE.getBasicIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Value2 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = eINSTANCE.getBasicIntervalSchedule_Value2Multiplier();

		/**
		 * The meta object literal for the '<em><b>Value1 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = eINSTANCE.getBasicIntervalSchedule_Value1Multiplier();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__START_TIME = eINSTANCE.getBasicIntervalSchedule_StartTime();

		/**
		 * The meta object literal for the '<em><b>Value2 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT = eINSTANCE.getBasicIntervalSchedule_Value2Unit();

		/**
		 * The meta object literal for the '<em><b>Value1 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT = eINSTANCE.getBasicIntervalSchedule_Value1Unit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.IrregularIntervalScheduleImpl <em>Irregular Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.IrregularIntervalScheduleImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getIrregularIntervalSchedule()
		 * @generated
		 */
		EClass IRREGULAR_INTERVAL_SCHEDULE = eINSTANCE.getIrregularIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS = eINSTANCE.getIrregularIntervalSchedule_TimePoints();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.PSRTypeImpl <em>PSR Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.PSRTypeImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPSRType()
		 * @generated
		 */
		EClass PSR_TYPE = eINSTANCE.getPSRType();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSR_TYPE__POWER_SYSTEM_RESOURCES = eINSTANCE.getPSRType_PowerSystemResources();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.OperatingParticipantImpl <em>Operating Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.OperatingParticipantImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getOperatingParticipant()
		 * @generated
		 */
		EClass OPERATING_PARTICIPANT = eINSTANCE.getOperatingParticipant();

		/**
		 * The meta object literal for the '<em><b>Operating Share</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_PARTICIPANT__OPERATING_SHARE = eINSTANCE.getOperatingParticipant_OperatingShare();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.CurveDataImpl <em>Curve Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.CurveDataImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCurveData()
		 * @generated
		 */
		EClass CURVE_DATA = eINSTANCE.getCurveData();

		/**
		 * The meta object literal for the '<em><b>Xvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__XVALUE = eINSTANCE.getCurveData_Xvalue();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURVE_DATA__CURVE = eINSTANCE.getCurveData_Curve();

		/**
		 * The meta object literal for the '<em><b>Y2value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__Y2VALUE = eINSTANCE.getCurveData_Y2value();

		/**
		 * The meta object literal for the '<em><b>Y3value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__Y3VALUE = eINSTANCE.getCurveData_Y3value();

		/**
		 * The meta object literal for the '<em><b>Y1value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__Y1VALUE = eINSTANCE.getCurveData_Y1value();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.EquipmentContainerImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getEquipmentContainer()
		 * @generated
		 */
		EClass EQUIPMENT_CONTAINER = eINSTANCE.getEquipmentContainer();

		/**
		 * The meta object literal for the '<em><b>Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_CONTAINER__EQUIPMENTS = eINSTANCE.getEquipmentContainer_Equipments();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPowerSystemResource()
		 * @generated
		 */
		EClass POWER_SYSTEM_RESOURCE = eINSTANCE.getPowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Reporting Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__REPORTING_GROUP = eINSTANCE.getPowerSystemResource_ReportingGroup();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS = eINSTANCE.getPowerSystemResource_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__LOCATION = eINSTANCE.getPowerSystemResource_Location();

		/**
		 * The meta object literal for the '<em><b>Outage Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE = eINSTANCE.getPowerSystemResource_OutageSchedule();

		/**
		 * The meta object literal for the '<em><b>PSR Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__PSR_EVENT = eINSTANCE.getPowerSystemResource_PSREvent();

		/**
		 * The meta object literal for the '<em><b>Safety Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS = eINSTANCE.getPowerSystemResource_SafetyDocuments();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES = eINSTANCE.getPowerSystemResource_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Circuit Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS = eINSTANCE.getPowerSystemResource_CircuitSections();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__MEASUREMENTS = eINSTANCE.getPowerSystemResource_Measurements();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__ASSETS = eINSTANCE.getPowerSystemResource_Assets();

		/**
		 * The meta object literal for the '<em><b>Schedule Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS = eINSTANCE.getPowerSystemResource_ScheduleSteps();

		/**
		 * The meta object literal for the '<em><b>PSR Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__PSR_TYPE = eINSTANCE.getPowerSystemResource_PSRType();

		/**
		 * The meta object literal for the '<em><b>Psr Lists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__PSR_LISTS = eINSTANCE.getPowerSystemResource_PsrLists();

		/**
		 * The meta object literal for the '<em><b>Operating Share</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__OPERATING_SHARE = eINSTANCE.getPowerSystemResource_OperatingShare();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__CHANGE_ITEMS = eINSTANCE.getPowerSystemResource_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES = eINSTANCE.getPowerSystemResource_DocumentRoles();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.SubstationImpl <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.SubstationImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getSubstation()
		 * @generated
		 */
		EClass SUBSTATION = eINSTANCE.getSubstation();

		/**
		 * The meta object literal for the '<em><b>Bays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__BAYS = eINSTANCE.getSubstation_Bays();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__REGION = eINSTANCE.getSubstation_Region();

		/**
		 * The meta object literal for the '<em><b>Voltage Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__VOLTAGE_LEVELS = eINSTANCE.getSubstation_VoltageLevels();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.GeographicalRegionImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getGeographicalRegion()
		 * @generated
		 */
		EClass GEOGRAPHICAL_REGION = eINSTANCE.getGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHICAL_REGION__REGIONS = eINSTANCE.getGeographicalRegion_Regions();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl <em>Identified Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getIdentifiedObject()
		 * @generated
		 */
		EClass IDENTIFIED_OBJECT = eINSTANCE.getIdentifiedObject();

		/**
		 * The meta object literal for the '<em><b>MRID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__MRID = eINSTANCE.getIdentifiedObject_MRID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__NAME = eINSTANCE.getIdentifiedObject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__DESCRIPTION = eINSTANCE.getIdentifiedObject_Description();

		/**
		 * The meta object literal for the '<em><b>Path Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__PATH_NAME = eINSTANCE.getIdentifiedObject_PathName();

		/**
		 * The meta object literal for the '<em><b>Modeling Authority Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET = eINSTANCE.getIdentifiedObject_ModelingAuthoritySet();

		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__LOCAL_NAME = eINSTANCE.getIdentifiedObject_LocalName();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__ALIAS_NAME = eINSTANCE.getIdentifiedObject_AliasName();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getVoltageLevel()
		 * @generated
		 */
		EClass VOLTAGE_LEVEL = eINSTANCE.getVoltageLevel();

		/**
		 * The meta object literal for the '<em><b>Bays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_LEVEL__BAYS = eINSTANCE.getVoltageLevel_Bays();

		/**
		 * The meta object literal for the '<em><b>Low Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT = eINSTANCE.getVoltageLevel_LowVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>High Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT = eINSTANCE.getVoltageLevel_HighVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_LEVEL__BASE_VOLTAGE = eINSTANCE.getVoltageLevel_BaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_LEVEL__SUBSTATION = eINSTANCE.getVoltageLevel_Substation();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeImpl <em>Connectivity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getConnectivityNode()
		 * @generated
		 */
		EClass CONNECTIVITY_NODE = eINSTANCE.getConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER = eINSTANCE.getConnectivityNode_ConnectivityNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__TOPOLOGICAL_NODE = eINSTANCE.getConnectivityNode_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Bus Name Marker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__BUS_NAME_MARKER = eINSTANCE.getConnectivityNode_BusNameMarker();

		/**
		 * The meta object literal for the '<em><b>Loss Penalty Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS = eINSTANCE.getConnectivityNode_LossPenaltyFactors();

		/**
		 * The meta object literal for the '<em><b>Node Constraint Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS = eINSTANCE.getConnectivityNode_NodeConstraintTerms();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__TERMINALS = eINSTANCE.getConnectivityNode_Terminals();

		/**
		 * The meta object literal for the '<em><b>Pnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__PNODE = eINSTANCE.getConnectivityNode_Pnode();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getConductingEquipment()
		 * @generated
		 */
		EClass CONDUCTING_EQUIPMENT = eINSTANCE.getConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Protection Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS = eINSTANCE.getConductingEquipment_ProtectionEquipments();

		/**
		 * The meta object literal for the '<em><b>Outage Step Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES = eINSTANCE.getConductingEquipment_OutageStepRoles();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__BASE_VOLTAGE = eINSTANCE.getConductingEquipment_BaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Clearance Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__CLEARANCE_TAGS = eINSTANCE.getConductingEquipment_ClearanceTags();

		/**
		 * The meta object literal for the '<em><b>Sv Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__SV_STATUS = eINSTANCE.getConductingEquipment_SvStatus();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTING_EQUIPMENT__PHASES = eINSTANCE.getConductingEquipment_Phases();

		/**
		 * The meta object literal for the '<em><b>Electrical Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS = eINSTANCE.getConductingEquipment_ElectricalAssets();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__TERMINALS = eINSTANCE.getConductingEquipment_Terminals();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.BreakerConfiguration <em>Breaker Configuration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.BreakerConfiguration
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBreakerConfiguration()
		 * @generated
		 */
		EEnum BREAKER_CONFIGURATION = eINSTANCE.getBreakerConfiguration();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.BusbarConfiguration <em>Busbar Configuration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.BusbarConfiguration
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getBusbarConfiguration()
		 * @generated
		 */
		EEnum BUSBAR_CONFIGURATION = eINSTANCE.getBusbarConfiguration();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.CompanyType <em>Company Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.CompanyType
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCompanyType()
		 * @generated
		 */
		EEnum COMPANY_TYPE = eINSTANCE.getCompanyType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.CurveStyle <em>Curve Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.CurveStyle
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getCurveStyle()
		 * @generated
		 */
		EEnum CURVE_STYLE = eINSTANCE.getCurveStyle();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Core.PhaseCode <em>Phase Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
		 * @see gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl#getPhaseCode()
		 * @generated
		 */
		EEnum PHASE_CODE = eINSTANCE.getPhaseCode();

	}

} //CorePackage
