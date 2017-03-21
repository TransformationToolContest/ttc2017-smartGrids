/**
 */
package CIM.IEC61970.Protection;

import CIM.IEC61970.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see CIM.IEC61970.Protection.ProtectionFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An extension to the Core and Wires packages that models information for protection equipment such as relays. These entities are used within training simulators and distribution network fault location applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An extension to the Core and Wires packages that models information for protection equipment such as relays. These entities are used within training simulators and distribution network fault location applications.'"
 * @generated
 */
public interface ProtectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Protection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Protection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimProtection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtectionPackage eINSTANCE = CIM.IEC61970.Protection.impl.ProtectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl
	 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getProtectionEquipment()
	 * @generated
	 */
	int PROTECTION_EQUIPMENT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Conducting Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__HIGH_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__UNIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relay Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__RELAY_DELAY_TIME = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protected Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__PROTECTED_SWITCHES = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Power Direction Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT__LOW_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl <em>Current Relay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Protection.impl.CurrentRelayImpl
	 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getCurrentRelay()
	 * @generated
	 */
	int CURRENT_RELAY = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__UUID = PROTECTION_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__MRID = PROTECTION_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__NAME = PROTECTION_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__DESCRIPTION = PROTECTION_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__PATH_NAME = PROTECTION_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__MODELING_AUTHORITY_SET = PROTECTION_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__LOCAL_NAME = PROTECTION_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__ALIAS_NAME = PROTECTION_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__REPORTING_GROUP = PROTECTION_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__NETWORK_DATA_SETS = PROTECTION_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__LOCATION = PROTECTION_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__OUTAGE_SCHEDULE = PROTECTION_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__PSR_EVENT = PROTECTION_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__SAFETY_DOCUMENTS = PROTECTION_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__ERP_ORGANISATION_ROLES = PROTECTION_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CIRCUIT_SECTIONS = PROTECTION_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__MEASUREMENTS = PROTECTION_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__ASSETS = PROTECTION_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__SCHEDULE_STEPS = PROTECTION_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__PSR_TYPE = PROTECTION_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__PSR_LISTS = PROTECTION_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__OPERATING_SHARE = PROTECTION_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CHANGE_ITEMS = PROTECTION_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__DOCUMENT_ROLES = PROTECTION_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__OPERATIONAL_LIMIT_SET = PROTECTION_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CONTINGENCY_EQUIPMENT = PROTECTION_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__NORMA_ILY_IN_SERVICE = PROTECTION_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CUSTOMER_AGREEMENTS = PROTECTION_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__AGGREGATE = PROTECTION_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__EQUIPMENT_CONTAINER = PROTECTION_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Conducting Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CONDUCTING_EQUIPMENTS = PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__HIGH_LIMIT = PROTECTION_EQUIPMENT__HIGH_LIMIT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__UNIT = PROTECTION_EQUIPMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Relay Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__RELAY_DELAY_TIME = PROTECTION_EQUIPMENT__RELAY_DELAY_TIME;

	/**
	 * The feature id for the '<em><b>Protected Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__PROTECTED_SWITCHES = PROTECTION_EQUIPMENT__PROTECTED_SWITCHES;

	/**
	 * The feature id for the '<em><b>Power Direction Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__POWER_DIRECTION_FLAG = PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__LOW_LIMIT = PROTECTION_EQUIPMENT__LOW_LIMIT;

	/**
	 * The feature id for the '<em><b>Time Delay1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__TIME_DELAY1 = PROTECTION_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Delay2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__TIME_DELAY2 = PROTECTION_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Delay3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__TIME_DELAY3 = PROTECTION_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inverse Time Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__INVERSE_TIME_FLAG = PROTECTION_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Limit3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CURRENT_LIMIT3 = PROTECTION_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Limit2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CURRENT_LIMIT2 = PROTECTION_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Current Limit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY__CURRENT_LIMIT1 = PROTECTION_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Current Relay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY_FEATURE_COUNT = PROTECTION_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Current Relay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RELAY_OPERATION_COUNT = PROTECTION_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl <em>Synchrocheck Relay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl
	 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getSynchrocheckRelay()
	 * @generated
	 */
	int SYNCHROCHECK_RELAY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__UUID = PROTECTION_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__MRID = PROTECTION_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__NAME = PROTECTION_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__DESCRIPTION = PROTECTION_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__PATH_NAME = PROTECTION_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__MODELING_AUTHORITY_SET = PROTECTION_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__LOCAL_NAME = PROTECTION_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__ALIAS_NAME = PROTECTION_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__REPORTING_GROUP = PROTECTION_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__NETWORK_DATA_SETS = PROTECTION_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__LOCATION = PROTECTION_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__OUTAGE_SCHEDULE = PROTECTION_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__PSR_EVENT = PROTECTION_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__SAFETY_DOCUMENTS = PROTECTION_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__ERP_ORGANISATION_ROLES = PROTECTION_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__CIRCUIT_SECTIONS = PROTECTION_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__MEASUREMENTS = PROTECTION_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__ASSETS = PROTECTION_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__SCHEDULE_STEPS = PROTECTION_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__PSR_TYPE = PROTECTION_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__PSR_LISTS = PROTECTION_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__OPERATING_SHARE = PROTECTION_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__CHANGE_ITEMS = PROTECTION_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__DOCUMENT_ROLES = PROTECTION_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__OPERATIONAL_LIMIT_SET = PROTECTION_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__CONTINGENCY_EQUIPMENT = PROTECTION_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__NORMA_ILY_IN_SERVICE = PROTECTION_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__CUSTOMER_AGREEMENTS = PROTECTION_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__AGGREGATE = PROTECTION_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__EQUIPMENT_CONTAINER = PROTECTION_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Conducting Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__CONDUCTING_EQUIPMENTS = PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__HIGH_LIMIT = PROTECTION_EQUIPMENT__HIGH_LIMIT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__UNIT = PROTECTION_EQUIPMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Relay Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__RELAY_DELAY_TIME = PROTECTION_EQUIPMENT__RELAY_DELAY_TIME;

	/**
	 * The feature id for the '<em><b>Protected Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__PROTECTED_SWITCHES = PROTECTION_EQUIPMENT__PROTECTED_SWITCHES;

	/**
	 * The feature id for the '<em><b>Power Direction Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__POWER_DIRECTION_FLAG = PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__LOW_LIMIT = PROTECTION_EQUIPMENT__LOW_LIMIT;

	/**
	 * The feature id for the '<em><b>Max Volt Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__MAX_VOLT_DIFF = PROTECTION_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Freq Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__MAX_FREQ_DIFF = PROTECTION_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Angle Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF = PROTECTION_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchrocheck Relay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY_FEATURE_COUNT = PROTECTION_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Synchrocheck Relay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHROCHECK_RELAY_OPERATION_COUNT = PROTECTION_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Protection.impl.RecloseSequenceImpl <em>Reclose Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Protection.impl.RecloseSequenceImpl
	 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getRecloseSequence()
	 * @generated
	 */
	int RECLOSE_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Protected Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__PROTECTED_SWITCH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reclose Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__RECLOSE_DELAY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reclose Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE__RECLOSE_STEP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reclose Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reclose Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSE_SEQUENCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Protection.impl.SurgeProtectorImpl <em>Surge Protector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Protection.impl.SurgeProtectorImpl
	 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getSurgeProtector()
	 * @generated
	 */
	int SURGE_PROTECTOR = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Surge Protector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Surge Protector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Protection.impl.FaultIndicatorImpl <em>Fault Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Protection.impl.FaultIndicatorImpl
	 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getFaultIndicator()
	 * @generated
	 */
	int FAULT_INDICATOR = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Fault Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fault Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Protection.CurrentRelay <em>Current Relay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Relay</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay
	 * @generated
	 */
	EClass getCurrentRelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Delay1</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#getTimeDelay1()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_TimeDelay1();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Delay2</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#getTimeDelay2()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_TimeDelay2();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Delay3</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#getTimeDelay3()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_TimeDelay3();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#isInverseTimeFlag <em>Inverse Time Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Time Flag</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#isInverseTimeFlag()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_InverseTimeFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Limit3</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit3()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_CurrentLimit3();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Limit2</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit2()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_CurrentLimit2();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Limit1</em>'.
	 * @see CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit1()
	 * @see #getCurrentRelay()
	 * @generated
	 */
	EAttribute getCurrentRelay_CurrentLimit1();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Protection.SynchrocheckRelay <em>Synchrocheck Relay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchrocheck Relay</em>'.
	 * @see CIM.IEC61970.Protection.SynchrocheckRelay
	 * @generated
	 */
	EClass getSynchrocheckRelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Volt Diff</em>'.
	 * @see CIM.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff()
	 * @see #getSynchrocheckRelay()
	 * @generated
	 */
	EAttribute getSynchrocheckRelay_MaxVoltDiff();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Freq Diff</em>'.
	 * @see CIM.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff()
	 * @see #getSynchrocheckRelay()
	 * @generated
	 */
	EAttribute getSynchrocheckRelay_MaxFreqDiff();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Angle Diff</em>'.
	 * @see CIM.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff()
	 * @see #getSynchrocheckRelay()
	 * @generated
	 */
	EAttribute getSynchrocheckRelay_MaxAngleDiff();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Protection.RecloseSequence <em>Reclose Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reclose Sequence</em>'.
	 * @see CIM.IEC61970.Protection.RecloseSequence
	 * @generated
	 */
	EClass getRecloseSequence();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protected Switch</em>'.
	 * @see CIM.IEC61970.Protection.RecloseSequence#getProtectedSwitch()
	 * @see #getRecloseSequence()
	 * @generated
	 */
	EReference getRecloseSequence_ProtectedSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reclose Delay</em>'.
	 * @see CIM.IEC61970.Protection.RecloseSequence#getRecloseDelay()
	 * @see #getRecloseSequence()
	 * @generated
	 */
	EAttribute getRecloseSequence_RecloseDelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reclose Step</em>'.
	 * @see CIM.IEC61970.Protection.RecloseSequence#getRecloseStep()
	 * @see #getRecloseSequence()
	 * @generated
	 */
	EAttribute getRecloseSequence_RecloseStep();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Protection.SurgeProtector <em>Surge Protector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surge Protector</em>'.
	 * @see CIM.IEC61970.Protection.SurgeProtector
	 * @generated
	 */
	EClass getSurgeProtector();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Protection.ProtectionEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment
	 * @generated
	 */
	EClass getProtectionEquipment();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Protection.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipments</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getConductingEquipments()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EReference getProtectionEquipment_ConductingEquipments();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Limit</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getHighLimit()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EAttribute getProtectionEquipment_HighLimit();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Protection.ProtectionEquipment#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getUnit()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EReference getProtectionEquipment_Unit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relay Delay Time</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EAttribute getProtectionEquipment_RelayDelayTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Protection.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protected Switches</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getProtectedSwitches()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EReference getProtectionEquipment_ProtectedSwitches();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Direction Flag</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EAttribute getProtectionEquipment_PowerDirectionFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Limit</em>'.
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getLowLimit()
	 * @see #getProtectionEquipment()
	 * @generated
	 */
	EAttribute getProtectionEquipment_LowLimit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Protection.FaultIndicator <em>Fault Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Indicator</em>'.
	 * @see CIM.IEC61970.Protection.FaultIndicator
	 * @generated
	 */
	EClass getFaultIndicator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProtectionFactory getProtectionFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl <em>Current Relay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Protection.impl.CurrentRelayImpl
		 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getCurrentRelay()
		 * @generated
		 */
		EClass CURRENT_RELAY = eINSTANCE.getCurrentRelay();

		/**
		 * The meta object literal for the '<em><b>Time Delay1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__TIME_DELAY1 = eINSTANCE.getCurrentRelay_TimeDelay1();

		/**
		 * The meta object literal for the '<em><b>Time Delay2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__TIME_DELAY2 = eINSTANCE.getCurrentRelay_TimeDelay2();

		/**
		 * The meta object literal for the '<em><b>Time Delay3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__TIME_DELAY3 = eINSTANCE.getCurrentRelay_TimeDelay3();

		/**
		 * The meta object literal for the '<em><b>Inverse Time Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__INVERSE_TIME_FLAG = eINSTANCE.getCurrentRelay_InverseTimeFlag();

		/**
		 * The meta object literal for the '<em><b>Current Limit3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__CURRENT_LIMIT3 = eINSTANCE.getCurrentRelay_CurrentLimit3();

		/**
		 * The meta object literal for the '<em><b>Current Limit2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__CURRENT_LIMIT2 = eINSTANCE.getCurrentRelay_CurrentLimit2();

		/**
		 * The meta object literal for the '<em><b>Current Limit1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_RELAY__CURRENT_LIMIT1 = eINSTANCE.getCurrentRelay_CurrentLimit1();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl <em>Synchrocheck Relay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl
		 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getSynchrocheckRelay()
		 * @generated
		 */
		EClass SYNCHROCHECK_RELAY = eINSTANCE.getSynchrocheckRelay();

		/**
		 * The meta object literal for the '<em><b>Max Volt Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHROCHECK_RELAY__MAX_VOLT_DIFF = eINSTANCE.getSynchrocheckRelay_MaxVoltDiff();

		/**
		 * The meta object literal for the '<em><b>Max Freq Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHROCHECK_RELAY__MAX_FREQ_DIFF = eINSTANCE.getSynchrocheckRelay_MaxFreqDiff();

		/**
		 * The meta object literal for the '<em><b>Max Angle Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF = eINSTANCE.getSynchrocheckRelay_MaxAngleDiff();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Protection.impl.RecloseSequenceImpl <em>Reclose Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Protection.impl.RecloseSequenceImpl
		 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getRecloseSequence()
		 * @generated
		 */
		EClass RECLOSE_SEQUENCE = eINSTANCE.getRecloseSequence();

		/**
		 * The meta object literal for the '<em><b>Protected Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLOSE_SEQUENCE__PROTECTED_SWITCH = eINSTANCE.getRecloseSequence_ProtectedSwitch();

		/**
		 * The meta object literal for the '<em><b>Reclose Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECLOSE_SEQUENCE__RECLOSE_DELAY = eINSTANCE.getRecloseSequence_RecloseDelay();

		/**
		 * The meta object literal for the '<em><b>Reclose Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECLOSE_SEQUENCE__RECLOSE_STEP = eINSTANCE.getRecloseSequence_RecloseStep();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Protection.impl.SurgeProtectorImpl <em>Surge Protector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Protection.impl.SurgeProtectorImpl
		 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getSurgeProtector()
		 * @generated
		 */
		EClass SURGE_PROTECTOR = eINSTANCE.getSurgeProtector();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl
		 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getProtectionEquipment()
		 * @generated
		 */
		EClass PROTECTION_EQUIPMENT = eINSTANCE.getProtectionEquipment();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS = eINSTANCE.getProtectionEquipment_ConductingEquipments();

		/**
		 * The meta object literal for the '<em><b>High Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_EQUIPMENT__HIGH_LIMIT = eINSTANCE.getProtectionEquipment_HighLimit();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_EQUIPMENT__UNIT = eINSTANCE.getProtectionEquipment_Unit();

		/**
		 * The meta object literal for the '<em><b>Relay Delay Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_EQUIPMENT__RELAY_DELAY_TIME = eINSTANCE.getProtectionEquipment_RelayDelayTime();

		/**
		 * The meta object literal for the '<em><b>Protected Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_EQUIPMENT__PROTECTED_SWITCHES = eINSTANCE.getProtectionEquipment_ProtectedSwitches();

		/**
		 * The meta object literal for the '<em><b>Power Direction Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG = eINSTANCE.getProtectionEquipment_PowerDirectionFlag();

		/**
		 * The meta object literal for the '<em><b>Low Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_EQUIPMENT__LOW_LIMIT = eINSTANCE.getProtectionEquipment_LowLimit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Protection.impl.FaultIndicatorImpl <em>Fault Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Protection.impl.FaultIndicatorImpl
		 * @see CIM.IEC61970.Protection.impl.ProtectionPackageImpl#getFaultIndicator()
		 * @generated
		 */
		EClass FAULT_INDICATOR = eINSTANCE.getFaultIndicator();

	}

} //ProtectionPackage
