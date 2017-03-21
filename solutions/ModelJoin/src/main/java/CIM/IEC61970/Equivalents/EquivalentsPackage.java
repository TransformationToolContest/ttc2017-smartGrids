/**
 */
package CIM.IEC61970.Equivalents;

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
 * @see CIM.IEC61970.Equivalents.EquivalentsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equivalents package models equivalent networks.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equivalents package models equivalent networks.'"
 * @generated
 */
public interface EquivalentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Equivalents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Equivalents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimEquivalents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EquivalentsPackage eINSTANCE = CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentEquipmentImpl <em>Equivalent Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentEquipmentImpl
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentEquipment()
	 * @generated
	 */
	int EQUIVALENT_EQUIPMENT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equivalent Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl <em>Equivalent Injection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentInjection()
	 * @generated
	 */
	int EQUIVALENT_INJECTION = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__UUID = EQUIVALENT_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__MRID = EQUIVALENT_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__NAME = EQUIVALENT_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__DESCRIPTION = EQUIVALENT_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__PATH_NAME = EQUIVALENT_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__MODELING_AUTHORITY_SET = EQUIVALENT_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__LOCAL_NAME = EQUIVALENT_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__ALIAS_NAME = EQUIVALENT_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__REPORTING_GROUP = EQUIVALENT_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__NETWORK_DATA_SETS = EQUIVALENT_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__LOCATION = EQUIVALENT_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__OUTAGE_SCHEDULE = EQUIVALENT_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__PSR_EVENT = EQUIVALENT_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__SAFETY_DOCUMENTS = EQUIVALENT_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__ERP_ORGANISATION_ROLES = EQUIVALENT_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__CIRCUIT_SECTIONS = EQUIVALENT_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__MEASUREMENTS = EQUIVALENT_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__ASSETS = EQUIVALENT_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__SCHEDULE_STEPS = EQUIVALENT_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__PSR_TYPE = EQUIVALENT_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__PSR_LISTS = EQUIVALENT_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__OPERATING_SHARE = EQUIVALENT_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__CHANGE_ITEMS = EQUIVALENT_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__DOCUMENT_ROLES = EQUIVALENT_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__OPERATIONAL_LIMIT_SET = EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__CONTINGENCY_EQUIPMENT = EQUIVALENT_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__NORMA_ILY_IN_SERVICE = EQUIVALENT_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__CUSTOMER_AGREEMENTS = EQUIVALENT_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__AGGREGATE = EQUIVALENT_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__EQUIPMENT_CONTAINER = EQUIVALENT_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__PROTECTION_EQUIPMENTS = EQUIVALENT_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__OUTAGE_STEP_ROLES = EQUIVALENT_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__BASE_VOLTAGE = EQUIVALENT_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__CLEARANCE_TAGS = EQUIVALENT_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__SV_STATUS = EQUIVALENT_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__PHASES = EQUIVALENT_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__ELECTRICAL_ASSETS = EQUIVALENT_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__TERMINALS = EQUIVALENT_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__EQUIVALENT_NETWORK = EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__REGULATION_STATUS = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulation Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__REGULATION_CAPABILITY = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__MIN_P = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__MAX_P = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regulation Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION__REGULATION_TARGET = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Equivalent Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION_FEATURE_COUNT = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Equivalent Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INJECTION_OPERATION_COUNT = EQUIVALENT_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentNetworkImpl <em>Equivalent Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentNetworkImpl
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentNetwork()
	 * @generated
	 */
	int EQUIVALENT_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__UUID = CorePackage.CONNECTIVITY_NODE_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__MRID = CorePackage.CONNECTIVITY_NODE_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__DESCRIPTION = CorePackage.CONNECTIVITY_NODE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__PATH_NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__MODELING_AUTHORITY_SET = CorePackage.CONNECTIVITY_NODE_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__LOCAL_NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__ALIAS_NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__REPORTING_GROUP = CorePackage.CONNECTIVITY_NODE_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__NETWORK_DATA_SETS = CorePackage.CONNECTIVITY_NODE_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__LOCATION = CorePackage.CONNECTIVITY_NODE_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__OUTAGE_SCHEDULE = CorePackage.CONNECTIVITY_NODE_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__PSR_EVENT = CorePackage.CONNECTIVITY_NODE_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__SAFETY_DOCUMENTS = CorePackage.CONNECTIVITY_NODE_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__ERP_ORGANISATION_ROLES = CorePackage.CONNECTIVITY_NODE_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CIRCUIT_SECTIONS = CorePackage.CONNECTIVITY_NODE_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__MEASUREMENTS = CorePackage.CONNECTIVITY_NODE_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__ASSETS = CorePackage.CONNECTIVITY_NODE_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__SCHEDULE_STEPS = CorePackage.CONNECTIVITY_NODE_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__PSR_TYPE = CorePackage.CONNECTIVITY_NODE_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__PSR_LISTS = CorePackage.CONNECTIVITY_NODE_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__OPERATING_SHARE = CorePackage.CONNECTIVITY_NODE_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CHANGE_ITEMS = CorePackage.CONNECTIVITY_NODE_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__DOCUMENT_ROLES = CorePackage.CONNECTIVITY_NODE_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CONNECTIVITY_NODES = CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__TOPOLOGICAL_NODE = CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equivalent Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS = CorePackage.CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK_FEATURE_COUNT = CorePackage.CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equivalent Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK_OPERATION_COUNT = CorePackage.CONNECTIVITY_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentShuntImpl <em>Equivalent Shunt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentShuntImpl
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentShunt()
	 * @generated
	 */
	int EQUIVALENT_SHUNT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__UUID = EQUIVALENT_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__MRID = EQUIVALENT_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__NAME = EQUIVALENT_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__DESCRIPTION = EQUIVALENT_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PATH_NAME = EQUIVALENT_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__MODELING_AUTHORITY_SET = EQUIVALENT_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__LOCAL_NAME = EQUIVALENT_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__ALIAS_NAME = EQUIVALENT_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__REPORTING_GROUP = EQUIVALENT_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__NETWORK_DATA_SETS = EQUIVALENT_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__LOCATION = EQUIVALENT_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__OUTAGE_SCHEDULE = EQUIVALENT_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PSR_EVENT = EQUIVALENT_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__SAFETY_DOCUMENTS = EQUIVALENT_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__ERP_ORGANISATION_ROLES = EQUIVALENT_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__CIRCUIT_SECTIONS = EQUIVALENT_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__MEASUREMENTS = EQUIVALENT_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__ASSETS = EQUIVALENT_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__SCHEDULE_STEPS = EQUIVALENT_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PSR_TYPE = EQUIVALENT_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PSR_LISTS = EQUIVALENT_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__OPERATING_SHARE = EQUIVALENT_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__CHANGE_ITEMS = EQUIVALENT_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__DOCUMENT_ROLES = EQUIVALENT_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__OPERATIONAL_LIMIT_SET = EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__CONTINGENCY_EQUIPMENT = EQUIVALENT_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__NORMA_ILY_IN_SERVICE = EQUIVALENT_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__CUSTOMER_AGREEMENTS = EQUIVALENT_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__AGGREGATE = EQUIVALENT_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__EQUIPMENT_CONTAINER = EQUIVALENT_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PROTECTION_EQUIPMENTS = EQUIVALENT_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__OUTAGE_STEP_ROLES = EQUIVALENT_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__BASE_VOLTAGE = EQUIVALENT_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__CLEARANCE_TAGS = EQUIVALENT_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__SV_STATUS = EQUIVALENT_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PHASES = EQUIVALENT_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__ELECTRICAL_ASSETS = EQUIVALENT_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__TERMINALS = EQUIVALENT_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__EQUIVALENT_NETWORK = EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__B = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__G = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Shunt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT_FEATURE_COUNT = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equivalent Shunt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT_OPERATION_COUNT = EQUIVALENT_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentBranchImpl <em>Equivalent Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentBranchImpl
	 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentBranch()
	 * @generated
	 */
	int EQUIVALENT_BRANCH = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__UUID = EQUIVALENT_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__MRID = EQUIVALENT_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__NAME = EQUIVALENT_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__DESCRIPTION = EQUIVALENT_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PATH_NAME = EQUIVALENT_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__MODELING_AUTHORITY_SET = EQUIVALENT_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__LOCAL_NAME = EQUIVALENT_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__ALIAS_NAME = EQUIVALENT_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__REPORTING_GROUP = EQUIVALENT_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__NETWORK_DATA_SETS = EQUIVALENT_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__LOCATION = EQUIVALENT_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__OUTAGE_SCHEDULE = EQUIVALENT_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PSR_EVENT = EQUIVALENT_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__SAFETY_DOCUMENTS = EQUIVALENT_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__ERP_ORGANISATION_ROLES = EQUIVALENT_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__CIRCUIT_SECTIONS = EQUIVALENT_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__MEASUREMENTS = EQUIVALENT_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__ASSETS = EQUIVALENT_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__SCHEDULE_STEPS = EQUIVALENT_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PSR_TYPE = EQUIVALENT_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PSR_LISTS = EQUIVALENT_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__OPERATING_SHARE = EQUIVALENT_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__CHANGE_ITEMS = EQUIVALENT_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__DOCUMENT_ROLES = EQUIVALENT_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__OPERATIONAL_LIMIT_SET = EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__CONTINGENCY_EQUIPMENT = EQUIVALENT_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__NORMA_ILY_IN_SERVICE = EQUIVALENT_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__CUSTOMER_AGREEMENTS = EQUIVALENT_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__AGGREGATE = EQUIVALENT_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__EQUIPMENT_CONTAINER = EQUIVALENT_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PROTECTION_EQUIPMENTS = EQUIVALENT_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__OUTAGE_STEP_ROLES = EQUIVALENT_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__BASE_VOLTAGE = EQUIVALENT_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__CLEARANCE_TAGS = EQUIVALENT_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__SV_STATUS = EQUIVALENT_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PHASES = EQUIVALENT_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__ELECTRICAL_ASSETS = EQUIVALENT_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__TERMINALS = EQUIVALENT_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__EQUIVALENT_NETWORK = EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__R = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__X = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH_FEATURE_COUNT = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equivalent Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH_OPERATION_COUNT = EQUIVALENT_EQUIPMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Equivalents.EquivalentEquipment <em>Equivalent Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Equipment</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentEquipment
	 * @generated
	 */
	EClass getEquivalentEquipment();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equivalent Network</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork()
	 * @see #getEquivalentEquipment()
	 * @generated
	 */
	EReference getEquivalentEquipment_EquivalentNetwork();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Equivalents.EquivalentInjection <em>Equivalent Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Injection</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentInjection
	 * @generated
	 */
	EClass getEquivalentInjection();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Status</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus()
	 * @see #getEquivalentInjection()
	 * @generated
	 */
	EAttribute getEquivalentInjection_RegulationStatus();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Capability</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability()
	 * @see #getEquivalentInjection()
	 * @generated
	 */
	EAttribute getEquivalentInjection_RegulationCapability();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentInjection#getMinP()
	 * @see #getEquivalentInjection()
	 * @generated
	 */
	EAttribute getEquivalentInjection_MinP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentInjection#getMaxP()
	 * @see #getEquivalentInjection()
	 * @generated
	 */
	EAttribute getEquivalentInjection_MaxP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Target</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget()
	 * @see #getEquivalentInjection()
	 * @generated
	 */
	EAttribute getEquivalentInjection_RegulationTarget();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Equivalents.EquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Network</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentNetwork
	 * @generated
	 */
	EClass getEquivalentNetwork();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Equipments</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments()
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	EReference getEquivalentNetwork_EquivalentEquipments();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Equivalents.EquivalentShunt <em>Equivalent Shunt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Shunt</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentShunt
	 * @generated
	 */
	EClass getEquivalentShunt();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentShunt#getB()
	 * @see #getEquivalentShunt()
	 * @generated
	 */
	EAttribute getEquivalentShunt_B();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentShunt#getG()
	 * @see #getEquivalentShunt()
	 * @generated
	 */
	EAttribute getEquivalentShunt_G();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Equivalents.EquivalentBranch <em>Equivalent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Branch</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentBranch
	 * @generated
	 */
	EClass getEquivalentBranch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentBranch#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentBranch#getR()
	 * @see #getEquivalentBranch()
	 * @generated
	 */
	EAttribute getEquivalentBranch_R();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Equivalents.EquivalentBranch#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM.IEC61970.Equivalents.EquivalentBranch#getX()
	 * @see #getEquivalentBranch()
	 * @generated
	 */
	EAttribute getEquivalentBranch_X();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EquivalentsFactory getEquivalentsFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentEquipmentImpl <em>Equivalent Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentEquipmentImpl
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentEquipment()
		 * @generated
		 */
		EClass EQUIVALENT_EQUIPMENT = eINSTANCE.getEquivalentEquipment();

		/**
		 * The meta object literal for the '<em><b>Equivalent Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK = eINSTANCE.getEquivalentEquipment_EquivalentNetwork();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl <em>Equivalent Injection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentInjection()
		 * @generated
		 */
		EClass EQUIVALENT_INJECTION = eINSTANCE.getEquivalentInjection();

		/**
		 * The meta object literal for the '<em><b>Regulation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_INJECTION__REGULATION_STATUS = eINSTANCE.getEquivalentInjection_RegulationStatus();

		/**
		 * The meta object literal for the '<em><b>Regulation Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_INJECTION__REGULATION_CAPABILITY = eINSTANCE.getEquivalentInjection_RegulationCapability();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_INJECTION__MIN_P = eINSTANCE.getEquivalentInjection_MinP();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_INJECTION__MAX_P = eINSTANCE.getEquivalentInjection_MaxP();

		/**
		 * The meta object literal for the '<em><b>Regulation Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_INJECTION__REGULATION_TARGET = eINSTANCE.getEquivalentInjection_RegulationTarget();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentNetworkImpl <em>Equivalent Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentNetworkImpl
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentNetwork()
		 * @generated
		 */
		EClass EQUIVALENT_NETWORK = eINSTANCE.getEquivalentNetwork();

		/**
		 * The meta object literal for the '<em><b>Equivalent Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS = eINSTANCE.getEquivalentNetwork_EquivalentEquipments();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentShuntImpl <em>Equivalent Shunt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentShuntImpl
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentShunt()
		 * @generated
		 */
		EClass EQUIVALENT_SHUNT = eINSTANCE.getEquivalentShunt();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_SHUNT__B = eINSTANCE.getEquivalentShunt_B();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_SHUNT__G = eINSTANCE.getEquivalentShunt_G();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Equivalents.impl.EquivalentBranchImpl <em>Equivalent Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentBranchImpl
		 * @see CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl#getEquivalentBranch()
		 * @generated
		 */
		EClass EQUIVALENT_BRANCH = eINSTANCE.getEquivalentBranch();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_BRANCH__R = eINSTANCE.getEquivalentBranch_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_BRANCH__X = eINSTANCE.getEquivalentBranch_X();

	}

} //EquivalentsPackage
