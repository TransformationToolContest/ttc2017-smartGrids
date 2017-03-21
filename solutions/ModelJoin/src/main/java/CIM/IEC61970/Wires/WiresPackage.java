/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.LoadModel.LoadModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see CIM.IEC61970.Wires.WiresFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An extension to the Core and Topology package that models information on the electrical characteristics of Transmission and Distribution networks. This package is used by network applications such as State Estimation, Load Flow and Optimal Power Flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An extension to the Core and Topology package that models information on the electrical characteristics of Transmission and Distribution networks. This package is used by network applications such as State Estimation, Load Flow and Optimal Power Flow.'"
 * @generated
 */
public interface WiresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Wires";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Wires";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimWires";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresPackage eINSTANCE = CIM.IEC61970.Wires.impl.WiresPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.SeriesCompensatorImpl <em>Series Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.SeriesCompensatorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSeriesCompensator()
	 * @generated
	 */
	int SERIES_COMPENSATOR = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Series Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Series Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.PowerTransformerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPowerTransformer()
	 * @generated
	 */
	int POWER_TRANSFORMER = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Flowgates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__FLOWGATES = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heat Exchanger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__HEAT_EXCHANGER = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Windings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__TRANSFORMER_WINDINGS = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mag Base U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MAG_BASE_U = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mag Sat Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MAG_SAT_FLUX = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bmag Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__BMAG_SAT = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Power Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Power Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.SwitchImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__RETAINED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SWITCH_ON_DATE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LOAD_MGMT_FUNCTIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONNECT_DISCONNECT_FUNCTIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NORMAL_OPEN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SWITCHING_OPERATIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SWITCH_SCHEDULES = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SWITCH_ON_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COMPOSITE_SWITCH = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.JumperImpl <em>Jumper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.JumperImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getJumper()
	 * @generated
	 */
	int JUMPER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__LOCAL_NAME = SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__CIRCUIT_SECTIONS = SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__NORMA_ILY_IN_SERVICE = SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__PHASES = SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__ELECTRICAL_ASSETS = SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Jumper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jumper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPER_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.PlantImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__UUID = CorePackage.EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MRID = CorePackage.EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DESCRIPTION = CorePackage.EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PATH_NAME = CorePackage.EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LOCAL_NAME = CorePackage.EQUIPMENT_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__REPORTING_GROUP = CorePackage.EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LOCATION = CorePackage.EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PSR_EVENT = CorePackage.EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ASSETS = CorePackage.EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SCHEDULE_STEPS = CorePackage.EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PSR_TYPE = CorePackage.EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PSR_LISTS = CorePackage.EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__OPERATING_SHARE = CorePackage.EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__CHANGE_ITEMS = CorePackage.EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DOCUMENT_ROLES = CorePackage.EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__TOPOLOGICAL_NODE = CorePackage.EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = CorePackage.EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.LineImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__UUID = CorePackage.EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MRID = CorePackage.EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DESCRIPTION = CorePackage.EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PATH_NAME = CorePackage.EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LOCAL_NAME = CorePackage.EQUIPMENT_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__REPORTING_GROUP = CorePackage.EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NETWORK_DATA_SETS = CorePackage.EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LOCATION = CorePackage.EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PSR_EVENT = CorePackage.EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ASSETS = CorePackage.EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SCHEDULE_STEPS = CorePackage.EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PSR_TYPE = CorePackage.EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PSR_LISTS = CorePackage.EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__OPERATING_SHARE = CorePackage.EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CHANGE_ITEMS = CorePackage.EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DOCUMENT_ROLES = CorePackage.EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TOPOLOGICAL_NODE = CorePackage.EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Transmission Right Of Way</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TRANSMISSION_RIGHT_OF_WAY = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flowgates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FLOWGATES = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__REGION = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = CorePackage.EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.EnergySourceImpl <em>Energy Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.EnergySourceImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getEnergySource()
	 * @generated
	 */
	int ENERGY_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__ACTIVE_POWER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__RN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Voltage Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__VOLTAGE_MAGNITUDE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__R0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Voltage Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__VOLTAGE_ANGLE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__XN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__NOMINAL_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE__X0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Energy Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Energy Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.RegulatingCondEqImpl <em>Regulating Cond Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.RegulatingCondEqImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulatingCondEq()
	 * @generated
	 */
	int REGULATING_COND_EQ = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CONTROLS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__REGULATING_CONTROL = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regulating Cond Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Regulating Cond Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.FrequencyConverterImpl <em>Frequency Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.FrequencyConverterImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getFrequencyConverter()
	 * @generated
	 */
	int FREQUENCY_CONVERTER = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__LOCAL_NAME = REGULATING_COND_EQ__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__CIRCUIT_SECTIONS = REGULATING_COND_EQ__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__NORMA_ILY_IN_SERVICE = REGULATING_COND_EQ__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__PHASES = REGULATING_COND_EQ__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__ELECTRICAL_ASSETS = REGULATING_COND_EQ__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__OPERATING_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__FREQUENCY = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MAX_P = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MAX_U = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MIN_U = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER__MIN_P = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Frequency Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Frequency Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONVERTER_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ConnectorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.GroundImpl <em>Ground</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.GroundImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getGround()
	 * @generated
	 */
	int GROUND = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__WINDING_INSULATIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ProtectedSwitchImpl <em>Protected Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ProtectedSwitchImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getProtectedSwitch()
	 * @generated
	 */
	int PROTECTED_SWITCH = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__LOCAL_NAME = SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__CIRCUIT_SECTIONS = SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__NORMA_ILY_IN_SERVICE = SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__PHASES = SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__ELECTRICAL_ASSETS = SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH__RECLOSE_SEQUENCES = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protected Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Protected Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.LoadBreakSwitchImpl <em>Load Break Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.LoadBreakSwitchImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getLoadBreakSwitch()
	 * @generated
	 */
	int LOAD_BREAK_SWITCH = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__UUID = PROTECTED_SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__MRID = PROTECTED_SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__NAME = PROTECTED_SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__DESCRIPTION = PROTECTED_SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PATH_NAME = PROTECTED_SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__MODELING_AUTHORITY_SET = PROTECTED_SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__LOCAL_NAME = PROTECTED_SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__ALIAS_NAME = PROTECTED_SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__REPORTING_GROUP = PROTECTED_SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__NETWORK_DATA_SETS = PROTECTED_SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__LOCATION = PROTECTED_SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__OUTAGE_SCHEDULE = PROTECTED_SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PSR_EVENT = PROTECTED_SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SAFETY_DOCUMENTS = PROTECTED_SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__ERP_ORGANISATION_ROLES = PROTECTED_SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CIRCUIT_SECTIONS = PROTECTED_SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__MEASUREMENTS = PROTECTED_SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__ASSETS = PROTECTED_SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SCHEDULE_STEPS = PROTECTED_SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PSR_TYPE = PROTECTED_SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PSR_LISTS = PROTECTED_SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__OPERATING_SHARE = PROTECTED_SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CHANGE_ITEMS = PROTECTED_SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__DOCUMENT_ROLES = PROTECTED_SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__OPERATIONAL_LIMIT_SET = PROTECTED_SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CONTINGENCY_EQUIPMENT = PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__NORMA_ILY_IN_SERVICE = PROTECTED_SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CUSTOMER_AGREEMENTS = PROTECTED_SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__AGGREGATE = PROTECTED_SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__EQUIPMENT_CONTAINER = PROTECTED_SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PROTECTION_EQUIPMENTS = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__OUTAGE_STEP_ROLES = PROTECTED_SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__BASE_VOLTAGE = PROTECTED_SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CLEARANCE_TAGS = PROTECTED_SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SV_STATUS = PROTECTED_SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PHASES = PROTECTED_SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__ELECTRICAL_ASSETS = PROTECTED_SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__TERMINALS = PROTECTED_SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__RETAINED = PROTECTED_SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SWITCH_ON_DATE = PROTECTED_SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__LOAD_MGMT_FUNCTIONS = PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CONNECT_DISCONNECT_FUNCTIONS = PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__NORMAL_OPEN = PROTECTED_SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SWITCHING_OPERATIONS = PROTECTED_SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SWITCH_SCHEDULES = PROTECTED_SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__SWITCH_ON_COUNT = PROTECTED_SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__COMPOSITE_SWITCH = PROTECTED_SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__RECLOSE_SEQUENCES = PROTECTED_SWITCH__RECLOSE_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__RATED_CURRENT = PROTECTED_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Break Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH_FEATURE_COUNT = PROTECTED_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Break Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH_OPERATION_COUNT = PROTECTED_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ImpedanceVariationCurveImpl <em>Impedance Variation Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ImpedanceVariationCurveImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getImpedanceVariationCurve()
	 * @generated
	 */
	int IMPEDANCE_VARIATION_CURVE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE__TAP_CHANGER = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Impedance Variation Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Impedance Variation Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_VARIATION_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.TapScheduleImpl <em>Tap Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.TapScheduleImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTapSchedule()
	 * @generated
	 */
	int TAP_SCHEDULE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__UUID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__MRID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__DESCRIPTION = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__PATH_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__MODELING_AUTHORITY_SET = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__LOCAL_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__ALIAS_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__VALUE2_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__VALUE1_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__START_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__VALUE2_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__VALUE1_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__END_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__TIME_POINTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__TIME_STEP = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__DAY_TYPE = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__SEASON = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Line Drop Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__LINE_DROP_COMPENSATION = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__TAP_CHANGER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__LINE_DROP_X = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE__LINE_DROP_R = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tap Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE_FEATURE_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tap Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_SCHEDULE_OPERATION_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.MutualCouplingImpl <em>Mutual Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.MutualCouplingImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getMutualCoupling()
	 * @generated
	 */
	int MUTUAL_COUPLING = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Distance11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__DISTANCE11 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__DISTANCE12 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__B0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__G0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Second Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__SECOND_TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>First Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__FIRST_TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Distance22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__DISTANCE22 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Distance21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING__DISTANCE21 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Mutual Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Mutual Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_COUPLING_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ConductorImpl <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ConductorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getConductor()
	 * @generated
	 */
	int CONDUCTOR = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LENGTH = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.DCLineSegmentImpl <em>DC Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.DCLineSegmentImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getDCLineSegment()
	 * @generated
	 */
	int DC_LINE_SEGMENT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__UUID = CONDUCTOR__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__MRID = CONDUCTOR__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__NAME = CONDUCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__DESCRIPTION = CONDUCTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__PATH_NAME = CONDUCTOR__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__MODELING_AUTHORITY_SET = CONDUCTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__LOCAL_NAME = CONDUCTOR__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__ALIAS_NAME = CONDUCTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__REPORTING_GROUP = CONDUCTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__NETWORK_DATA_SETS = CONDUCTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__LOCATION = CONDUCTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__OUTAGE_SCHEDULE = CONDUCTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__PSR_EVENT = CONDUCTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__SAFETY_DOCUMENTS = CONDUCTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__ERP_ORGANISATION_ROLES = CONDUCTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__CIRCUIT_SECTIONS = CONDUCTOR__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__MEASUREMENTS = CONDUCTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__ASSETS = CONDUCTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__SCHEDULE_STEPS = CONDUCTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__PSR_TYPE = CONDUCTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__PSR_LISTS = CONDUCTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__OPERATING_SHARE = CONDUCTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__CHANGE_ITEMS = CONDUCTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__DOCUMENT_ROLES = CONDUCTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__OPERATIONAL_LIMIT_SET = CONDUCTOR__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__CONTINGENCY_EQUIPMENT = CONDUCTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__NORMA_ILY_IN_SERVICE = CONDUCTOR__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__CUSTOMER_AGREEMENTS = CONDUCTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__AGGREGATE = CONDUCTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__EQUIPMENT_CONTAINER = CONDUCTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__PROTECTION_EQUIPMENTS = CONDUCTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__OUTAGE_STEP_ROLES = CONDUCTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__BASE_VOLTAGE = CONDUCTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__CLEARANCE_TAGS = CONDUCTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__SV_STATUS = CONDUCTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__PHASES = CONDUCTOR__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__ELECTRICAL_ASSETS = CONDUCTOR__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__TERMINALS = CONDUCTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__LENGTH = CONDUCTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>Dc Segment Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dc Segment Inductance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE = CONDUCTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_LINE_SEGMENT_OPERATION_COUNT = CONDUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.SwitchScheduleImpl <em>Switch Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.SwitchScheduleImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSwitchSchedule()
	 * @generated
	 */
	int SWITCH_SCHEDULE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__UUID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__MRID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__DESCRIPTION = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__PATH_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__MODELING_AUTHORITY_SET = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__LOCAL_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__ALIAS_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__VALUE2_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__VALUE1_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__START_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__VALUE2_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__VALUE1_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__END_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__TIME_POINTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__TIME_STEP = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__DAY_TYPE = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__SEASON = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE__SWITCH = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE_FEATURE_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SCHEDULE_OPERATION_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.CompositeSwitchImpl <em>Composite Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.CompositeSwitchImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getCompositeSwitch()
	 * @generated
	 */
	int COMPOSITE_SWITCH = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Composite Switch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH__SWITCHES = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ACLineSegmentImpl <em>AC Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ACLineSegmentImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getACLineSegment()
	 * @generated
	 */
	int AC_LINE_SEGMENT = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__UUID = CONDUCTOR__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__MRID = CONDUCTOR__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__NAME = CONDUCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__DESCRIPTION = CONDUCTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PATH_NAME = CONDUCTOR__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__MODELING_AUTHORITY_SET = CONDUCTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__LOCAL_NAME = CONDUCTOR__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__ALIAS_NAME = CONDUCTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__REPORTING_GROUP = CONDUCTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__NETWORK_DATA_SETS = CONDUCTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__LOCATION = CONDUCTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__OUTAGE_SCHEDULE = CONDUCTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PSR_EVENT = CONDUCTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__SAFETY_DOCUMENTS = CONDUCTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__ERP_ORGANISATION_ROLES = CONDUCTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__CIRCUIT_SECTIONS = CONDUCTOR__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__MEASUREMENTS = CONDUCTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__ASSETS = CONDUCTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__SCHEDULE_STEPS = CONDUCTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PSR_TYPE = CONDUCTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PSR_LISTS = CONDUCTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__OPERATING_SHARE = CONDUCTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__CHANGE_ITEMS = CONDUCTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__DOCUMENT_ROLES = CONDUCTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__OPERATIONAL_LIMIT_SET = CONDUCTOR__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__CONTINGENCY_EQUIPMENT = CONDUCTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__NORMA_ILY_IN_SERVICE = CONDUCTOR__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__CUSTOMER_AGREEMENTS = CONDUCTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__AGGREGATE = CONDUCTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__EQUIPMENT_CONTAINER = CONDUCTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PROTECTION_EQUIPMENTS = CONDUCTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__OUTAGE_STEP_ROLES = CONDUCTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__BASE_VOLTAGE = CONDUCTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__CLEARANCE_TAGS = CONDUCTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__SV_STATUS = CONDUCTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PHASES = CONDUCTOR__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__ELECTRICAL_ASSETS = CONDUCTOR__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__TERMINALS = CONDUCTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__LENGTH = CONDUCTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__G0CH = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__X = CONDUCTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__GCH = CONDUCTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__R = CONDUCTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__X0 = CONDUCTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__BCH = CONDUCTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__R0 = CONDUCTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__B0CH = CONDUCTOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>AC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>AC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT_OPERATION_COUNT = CONDUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.TapChangerImpl <em>Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.TapChangerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTapChanger()
	 * @generated
	 */
	int TAP_CHANGER = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__INITIAL_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__SUBSEQUENT_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TAP_SCHEDULES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__LTC_FLAG = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__REGULATION_STATUS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__REGULATING_CONTROL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NEUTRAL_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NEUTRAL_U = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__LOW_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__HIGH_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__STEP_VOLTAGE_INCREMENT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Impedance Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__IMPEDANCE_VARIATION_CURVE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__SV_TAP_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NORMAL_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl <em>Phase Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.PhaseTapChangerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPhaseTapChanger()
	 * @generated
	 */
	int PHASE_TAP_CHANGER = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__UUID = TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__MRID = TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__NAME = TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__DESCRIPTION = TAP_CHANGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__PATH_NAME = TAP_CHANGER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__MODELING_AUTHORITY_SET = TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__LOCAL_NAME = TAP_CHANGER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__ALIAS_NAME = TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__REPORTING_GROUP = TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__NETWORK_DATA_SETS = TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__LOCATION = TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__OUTAGE_SCHEDULE = TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__PSR_EVENT = TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__SAFETY_DOCUMENTS = TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__ERP_ORGANISATION_ROLES = TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__CIRCUIT_SECTIONS = TAP_CHANGER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__MEASUREMENTS = TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__ASSETS = TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__SCHEDULE_STEPS = TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__PSR_TYPE = TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__PSR_LISTS = TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__OPERATING_SHARE = TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__CHANGE_ITEMS = TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__DOCUMENT_ROLES = TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__INITIAL_DELAY = TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__SUBSEQUENT_DELAY = TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__TAP_SCHEDULES = TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__LTC_FLAG = TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__REGULATION_STATUS = TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__REGULATING_CONTROL = TAP_CHANGER__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__NEUTRAL_STEP = TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__NEUTRAL_U = TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__LOW_STEP = TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__HIGH_STEP = TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__STEP_VOLTAGE_INCREMENT = TAP_CHANGER__STEP_VOLTAGE_INCREMENT;

	/**
	 * The feature id for the '<em><b>Impedance Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__IMPEDANCE_VARIATION_CURVE = TAP_CHANGER__IMPEDANCE_VARIATION_CURVE;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__SV_TAP_STEP = TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__NORMAL_STEP = TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__TRANSFORMER_WINDING = TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Winding Connection Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE = TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__WINDING = TAP_CHANGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE = TAP_CHANGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT = TAP_CHANGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Phase Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE = TAP_CHANGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Voltage Step Increment Out Of Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE = TAP_CHANGER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nominal Voltage Out Of Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE = TAP_CHANGER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>XStep Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__XSTEP_MAX = TAP_CHANGER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>XStep Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER__XSTEP_MIN = TAP_CHANGER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER_FEATURE_COUNT = TAP_CHANGER_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Phase Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TAP_CHANGER_OPERATION_COUNT = TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.EnergyConsumerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__POWER_CUT_ZONE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PFIXED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__QFIXED_PCT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CUSTOMER_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__LOAD_RESPONSE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PFIXED_PCT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__QFIXED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.HeatExchangerImpl <em>Heat Exchanger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.HeatExchangerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getHeatExchanger()
	 * @generated
	 */
	int HEAT_EXCHANGER = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER__POWER_TRANSFORMER = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heat Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heat Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_EXCHANGER_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl <em>Static Var Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getStaticVarCompensator()
	 * @generated
	 */
	int STATIC_VAR_COMPENSATOR = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__LOCAL_NAME = REGULATING_COND_EQ__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CIRCUIT_SECTIONS = REGULATING_COND_EQ__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__NORMA_ILY_IN_SERVICE = REGULATING_COND_EQ__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PHASES = REGULATING_COND_EQ__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__ELECTRICAL_ASSETS = REGULATING_COND_EQ__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>SVC Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SLOPE = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Static Var Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Static Var Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.PhaseVariationCurveImpl <em>Phase Variation Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.PhaseVariationCurveImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPhaseVariationCurve()
	 * @generated
	 */
	int PHASE_VARIATION_CURVE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phase Variation Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phase Variation Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIATION_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.WindingTestImpl <em>Winding Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.WindingTestImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getWindingTest()
	 * @generated
	 */
	int WINDING_TEST = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>From Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__FROM_TAP_STEP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__FROM_TRANSFORMER_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leakage Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__LEAKAGE_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__NO_LOAD_LOSS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__PHASE_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__TO_TRANSFORMER_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__LOAD_LOSS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__TO_TAP_STEP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__VOLTAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exciting Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST__EXCITING_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Winding Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Winding Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_TEST_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.FuseImpl <em>Fuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.FuseImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getFuse()
	 * @generated
	 */
	int FUSE = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__LOCAL_NAME = SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__CIRCUIT_SECTIONS = SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__NORMA_ILY_IN_SERVICE = SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__PHASES = SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__ELECTRICAL_ASSETS = SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Rating Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE__RATING_CURRENT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSE_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl <em>Regulating Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.RegulatingControlImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulatingControl()
	 * @generated
	 */
	int REGULATING_CONTROL = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__MODE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TAP_CHANGER = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TERMINAL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REGULATING_COND_EQ = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TARGET_RANGE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TARGET_VALUE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REGULATION_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__DISCRETE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Regulating Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Regulating Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.BusbarSectionImpl <em>Busbar Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.BusbarSectionImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getBusbarSection()
	 * @generated
	 */
	int BUSBAR_SECTION = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__UUID = CONNECTOR__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MRID = CONNECTOR__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__DESCRIPTION = CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PATH_NAME = CONNECTOR__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MODELING_AUTHORITY_SET = CONNECTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__LOCAL_NAME = CONNECTOR__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__ALIAS_NAME = CONNECTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__REPORTING_GROUP = CONNECTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__NETWORK_DATA_SETS = CONNECTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__LOCATION = CONNECTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__OUTAGE_SCHEDULE = CONNECTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PSR_EVENT = CONNECTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__SAFETY_DOCUMENTS = CONNECTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__ERP_ORGANISATION_ROLES = CONNECTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CIRCUIT_SECTIONS = CONNECTOR__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MEASUREMENTS = CONNECTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__ASSETS = CONNECTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__SCHEDULE_STEPS = CONNECTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PSR_TYPE = CONNECTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PSR_LISTS = CONNECTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__OPERATING_SHARE = CONNECTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CHANGE_ITEMS = CONNECTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__DOCUMENT_ROLES = CONNECTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__OPERATIONAL_LIMIT_SET = CONNECTOR__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CONTINGENCY_EQUIPMENT = CONNECTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__NORMA_ILY_IN_SERVICE = CONNECTOR__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CUSTOMER_AGREEMENTS = CONNECTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__AGGREGATE = CONNECTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__EQUIPMENT_CONTAINER = CONNECTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PROTECTION_EQUIPMENTS = CONNECTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__OUTAGE_STEP_ROLES = CONNECTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__BASE_VOLTAGE = CONNECTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CLEARANCE_TAGS = CONNECTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__SV_STATUS = CONNECTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PHASES = CONNECTOR__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__ELECTRICAL_ASSETS = CONNECTOR__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__TERMINALS = CONNECTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Voltage Control Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Busbar Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Busbar Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ResistorImpl <em>Resistor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ResistorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getResistor()
	 * @generated
	 */
	int RESISTOR = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The number of structural features of the '<em>Resistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.RatioVariationCurveImpl <em>Ratio Variation Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.RatioVariationCurveImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRatioVariationCurve()
	 * @generated
	 */
	int RATIO_VARIATION_CURVE = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ratio Variation Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ratio Variation Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_VARIATION_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl <em>Rectifier Inverter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.RectifierInverterImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRectifierInverter()
	 * @generated
	 */
	int RECTIFIER_INVERTER = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Min Compound Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MIN_P = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MAX_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__OPERATING_MODE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__FREQUENCY = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MAX_P = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Commutating Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__COMMUTATING_REACTANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Commutating Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__COMMUTATING_RESISTANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__RATED_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__MIN_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Bridges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__BRIDGES = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Compound Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER__COMPOUND_RESISTANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Rectifier Inverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Rectifier Inverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIER_INVERTER_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.BreakerImpl <em>Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.BreakerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getBreaker()
	 * @generated
	 */
	int BREAKER = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__UUID = PROTECTED_SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__MRID = PROTECTED_SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__NAME = PROTECTED_SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__DESCRIPTION = PROTECTED_SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PATH_NAME = PROTECTED_SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__MODELING_AUTHORITY_SET = PROTECTED_SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__LOCAL_NAME = PROTECTED_SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ALIAS_NAME = PROTECTED_SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__REPORTING_GROUP = PROTECTED_SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__NETWORK_DATA_SETS = PROTECTED_SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__LOCATION = PROTECTED_SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__OUTAGE_SCHEDULE = PROTECTED_SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PSR_EVENT = PROTECTED_SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SAFETY_DOCUMENTS = PROTECTED_SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ERP_ORGANISATION_ROLES = PROTECTED_SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CIRCUIT_SECTIONS = PROTECTED_SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__MEASUREMENTS = PROTECTED_SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ASSETS = PROTECTED_SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SCHEDULE_STEPS = PROTECTED_SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PSR_TYPE = PROTECTED_SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PSR_LISTS = PROTECTED_SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__OPERATING_SHARE = PROTECTED_SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CHANGE_ITEMS = PROTECTED_SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__DOCUMENT_ROLES = PROTECTED_SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__OPERATIONAL_LIMIT_SET = PROTECTED_SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CONTINGENCY_EQUIPMENT = PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__NORMA_ILY_IN_SERVICE = PROTECTED_SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CUSTOMER_AGREEMENTS = PROTECTED_SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__AGGREGATE = PROTECTED_SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__EQUIPMENT_CONTAINER = PROTECTED_SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PROTECTION_EQUIPMENTS = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__OUTAGE_STEP_ROLES = PROTECTED_SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__BASE_VOLTAGE = PROTECTED_SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CLEARANCE_TAGS = PROTECTED_SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SV_STATUS = PROTECTED_SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PHASES = PROTECTED_SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ELECTRICAL_ASSETS = PROTECTED_SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__TERMINALS = PROTECTED_SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__RETAINED = PROTECTED_SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SWITCH_ON_DATE = PROTECTED_SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__LOAD_MGMT_FUNCTIONS = PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CONNECT_DISCONNECT_FUNCTIONS = PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__NORMAL_OPEN = PROTECTED_SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SWITCHING_OPERATIONS = PROTECTED_SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SWITCH_SCHEDULES = PROTECTED_SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__SWITCH_ON_COUNT = PROTECTED_SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__COMPOSITE_SWITCH = PROTECTED_SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__RECLOSE_SEQUENCES = PROTECTED_SWITCH__RECLOSE_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__RATED_CURRENT = PROTECTED_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Transit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__IN_TRANSIT_TIME = PROTECTED_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_FEATURE_COUNT = PROTECTED_SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_OPERATION_COUNT = PROTECTED_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.TransformerWindingImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTransformerWinding()
	 * @generated
	 */
	int TRANSFORMER_WINDING = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__G0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Winding Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__TO_WINDING_TEST = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RGROUND = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__GROUNDED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Short Term S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__SHORT_TERM_S = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__G = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__B = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PHASE_TAP_CHANGER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__R0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__B0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__POWER_TRANSFORMER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Winding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__WINDING_TYPE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__X0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATED_S = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATED_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>From Winding Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__FROM_WINDING_TEST = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATIO_TAP_CHANGER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Insulation U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__INSULATION_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Emergency S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__EMERGENCY_S = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CONNECTION_TYPE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__XGROUND = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Transformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Transformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.GroundDisconnectorImpl <em>Ground Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.GroundDisconnectorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getGroundDisconnector()
	 * @generated
	 */
	int GROUND_DISCONNECTOR = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__LOCAL_NAME = SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__CIRCUIT_SECTIONS = SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__NORMA_ILY_IN_SERVICE = SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__PHASES = SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__ELECTRICAL_ASSETS = SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Ground Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ground Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_DISCONNECTOR_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.VoltageControlZoneImpl <em>Voltage Control Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.VoltageControlZoneImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getVoltageControlZone()
	 * @generated
	 */
	int VOLTAGE_CONTROL_ZONE = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Busbar Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Voltage Control Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Voltage Control Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_CONTROL_ZONE_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl <em>Shunt Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ShuntCompensatorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getShuntCompensator()
	 * @generated
	 */
	int SHUNT_COMPENSATOR = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__LOCAL_NAME = REGULATING_COND_EQ__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CIRCUIT_SECTIONS = REGULATING_COND_EQ__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NORMA_ILY_IN_SERVICE = REGULATING_COND_EQ__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PHASES = REGULATING_COND_EQ__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__ELECTRICAL_ASSETS = REGULATING_COND_EQ__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Normal Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NORMAL_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MIN_U = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__B0_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nom Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NOM_Q = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NOM_U = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MAXIMUM_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__SWITCH_ON_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MAX_U = REGULATING_COND_EQ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>BPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__BPER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>GPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__GPER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sv Shunt Compensator Sections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__SWITCH_ON_DATE = REGULATING_COND_EQ_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>AVR Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__AVR_DELAY = REGULATING_COND_EQ_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Voltage Sensitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY = REGULATING_COND_EQ_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>G0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__G0_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reactive Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__REACTIVE_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Shunt Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Shunt Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.DisconnectorImpl <em>Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.DisconnectorImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getDisconnector()
	 * @generated
	 */
	int DISCONNECTOR = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__LOCAL_NAME = SWITCH__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CIRCUIT_SECTIONS = SWITCH__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NORMA_ILY_IN_SERVICE = SWITCH__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PHASES = SWITCH__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ELECTRICAL_ASSETS = SWITCH__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl <em>Synchronous Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.SynchronousMachineImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSynchronousMachine()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__LOCAL_NAME = REGULATING_COND_EQ__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CIRCUIT_SECTIONS = REGULATING_COND_EQ__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__NORMA_ILY_IN_SERVICE = REGULATING_COND_EQ__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PHASES = REGULATING_COND_EQ__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__ELECTRICAL_ASSETS = REGULATING_COND_EQ__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__XDIRECT_SYNC = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__XQUAD_TRANS = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coolant Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__COOLANT_CONDITION = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reactive Capability Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Coolant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__COOLANT_TYPE = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Condenser P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CONDENSER_P = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>AVR To Manual Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG = REGULATING_COND_EQ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MIN_Q = REGULATING_COND_EQ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>AVR To Manual Lead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD = REGULATING_COND_EQ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MAX_U = REGULATING_COND_EQ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__DAMPING = REGULATING_COND_EQ_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__GENERATING_UNIT = REGULATING_COND_EQ_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MAX_Q = REGULATING_COND_EQ_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__R0 = REGULATING_COND_EQ_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__TYPE = REGULATING_COND_EQ_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__R2 = REGULATING_COND_EQ_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reference Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY = REGULATING_COND_EQ_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__X0 = REGULATING_COND_EQ_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__X2 = REGULATING_COND_EQ_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__R = REGULATING_COND_EQ_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE = REGULATING_COND_EQ_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS = REGULATING_COND_EQ_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__X = REGULATING_COND_EQ_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>QPercent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__QPERCENT = REGULATING_COND_EQ_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__XQUAD_SYNC = REGULATING_COND_EQ_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__RATED_S = REGULATING_COND_EQ_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Manual To AVR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MANUAL_TO_AVR = REGULATING_COND_EQ_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Inertia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__INERTIA = REGULATING_COND_EQ_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Hydro Pump</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__HYDRO_PUMP = REGULATING_COND_EQ_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MIN_U = REGULATING_COND_EQ_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__XDIRECT_TRANS = REGULATING_COND_EQ_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Base Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__BASE_Q = REGULATING_COND_EQ_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OPERATING_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Prime Movers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PRIME_MOVERS = REGULATING_COND_EQ_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Synchronous Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 35;

	/**
	 * The number of operations of the '<em>Synchronous Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.JunctionImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__UUID = CONNECTOR__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__MRID = CONNECTOR__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__DESCRIPTION = CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PATH_NAME = CONNECTOR__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__MODELING_AUTHORITY_SET = CONNECTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__LOCAL_NAME = CONNECTOR__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ALIAS_NAME = CONNECTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__REPORTING_GROUP = CONNECTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NETWORK_DATA_SETS = CONNECTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__LOCATION = CONNECTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OUTAGE_SCHEDULE = CONNECTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PSR_EVENT = CONNECTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__SAFETY_DOCUMENTS = CONNECTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ERP_ORGANISATION_ROLES = CONNECTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__CIRCUIT_SECTIONS = CONNECTOR__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__MEASUREMENTS = CONNECTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ASSETS = CONNECTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__SCHEDULE_STEPS = CONNECTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PSR_TYPE = CONNECTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PSR_LISTS = CONNECTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OPERATING_SHARE = CONNECTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__CHANGE_ITEMS = CONNECTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__DOCUMENT_ROLES = CONNECTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OPERATIONAL_LIMIT_SET = CONNECTOR__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__CONTINGENCY_EQUIPMENT = CONNECTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NORMA_ILY_IN_SERVICE = CONNECTOR__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__CUSTOMER_AGREEMENTS = CONNECTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__AGGREGATE = CONNECTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__EQUIPMENT_CONTAINER = CONNECTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PROTECTION_EQUIPMENTS = CONNECTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OUTAGE_STEP_ROLES = CONNECTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__BASE_VOLTAGE = CONNECTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__CLEARANCE_TAGS = CONNECTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__SV_STATUS = CONNECTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PHASES = CONNECTOR__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ELECTRICAL_ASSETS = CONNECTOR__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__TERMINALS = CONNECTOR__TERMINALS;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.RegulationScheduleImpl <em>Regulation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.RegulationScheduleImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulationSchedule()
	 * @generated
	 */
	int REGULATION_SCHEDULE = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__UUID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__MRID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__DESCRIPTION = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__PATH_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__MODELING_AUTHORITY_SET = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__LOCAL_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__ALIAS_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE2_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE1_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__START_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE2_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE1_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__END_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__TIME_POINTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__TIME_STEP = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__DAY_TYPE = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__SEASON = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__LINE_DROP_R = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__LINE_DROP_X = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Drop Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__LINE_DROP_COMPENSATION = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__REGULATING_CONTROL = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Voltage Control Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Regulation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE_FEATURE_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Regulation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE_OPERATION_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl <em>Reactive Capability Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getReactiveCapabilityCurve()
	 * @generated
	 */
	int REACTIVE_CAPABILITY_CURVE = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hydrogen Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coolant Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reactive Capability Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reactive Capability Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.impl.RatioTapChangerImpl <em>Ratio Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.impl.RatioTapChangerImpl
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRatioTapChanger()
	 * @generated
	 */
	int RATIO_TAP_CHANGER = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__UUID = TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__MRID = TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__NAME = TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__DESCRIPTION = TAP_CHANGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__PATH_NAME = TAP_CHANGER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__MODELING_AUTHORITY_SET = TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__LOCAL_NAME = TAP_CHANGER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__ALIAS_NAME = TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__REPORTING_GROUP = TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__NETWORK_DATA_SETS = TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__LOCATION = TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__OUTAGE_SCHEDULE = TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__PSR_EVENT = TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__SAFETY_DOCUMENTS = TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__ERP_ORGANISATION_ROLES = TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__CIRCUIT_SECTIONS = TAP_CHANGER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__MEASUREMENTS = TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__ASSETS = TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__SCHEDULE_STEPS = TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__PSR_TYPE = TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__PSR_LISTS = TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__OPERATING_SHARE = TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__CHANGE_ITEMS = TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__DOCUMENT_ROLES = TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__INITIAL_DELAY = TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__SUBSEQUENT_DELAY = TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__TAP_SCHEDULES = TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__LTC_FLAG = TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__REGULATION_STATUS = TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__REGULATING_CONTROL = TAP_CHANGER__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__NEUTRAL_STEP = TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__NEUTRAL_U = TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__LOW_STEP = TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__HIGH_STEP = TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT = TAP_CHANGER__STEP_VOLTAGE_INCREMENT;

	/**
	 * The feature id for the '<em><b>Impedance Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__IMPEDANCE_VARIATION_CURVE = TAP_CHANGER__IMPEDANCE_VARIATION_CURVE;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__SV_TAP_STEP = TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__NORMAL_STEP = TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ratio Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE = TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__TRANSFORMER_WINDING = TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__WINDING = TAP_CHANGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER__TCUL_CONTROL_MODE = TAP_CHANGER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ratio Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER_FEATURE_COUNT = TAP_CHANGER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ratio Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_TAP_CHANGER_OPERATION_COUNT = TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.SVCControlMode <em>SVC Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.SVCControlMode
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSVCControlMode()
	 * @generated
	 */
	int SVC_CONTROL_MODE = 45;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.PhaseTapChangerKind <em>Phase Tap Changer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.PhaseTapChangerKind
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPhaseTapChangerKind()
	 * @generated
	 */
	int PHASE_TAP_CHANGER_KIND = 46;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.WindingType <em>Winding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.WindingType
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getWindingType()
	 * @generated
	 */
	int WINDING_TYPE = 47;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.SynchronousMachineType
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSynchronousMachineType()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE_TYPE = 48;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.CoolantType <em>Coolant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.CoolantType
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getCoolantType()
	 * @generated
	 */
	int COOLANT_TYPE = 49;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.TransformerControlMode
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTransformerControlMode()
	 * @generated
	 */
	int TRANSFORMER_CONTROL_MODE = 50;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSynchronousMachineOperatingMode()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE_OPERATING_MODE = 51;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.WindingConnection <em>Winding Connection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.WindingConnection
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getWindingConnection()
	 * @generated
	 */
	int WINDING_CONNECTION = 52;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.TapChangerKind <em>Tap Changer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.TapChangerKind
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTapChangerKind()
	 * @generated
	 */
	int TAP_CHANGER_KIND = 53;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Wires.RegulatingControlModeKind <em>Regulating Control Mode Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Wires.RegulatingControlModeKind
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulatingControlModeKind()
	 * @generated
	 */
	int REGULATING_CONTROL_MODE_KIND = 54;

	/**
	 * The meta object id for the '<em>Operating Mode</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getOperatingMode()
	 * @generated
	 */
	int OPERATING_MODE = 55;

	/**
	 * The meta object id for the '<em>Composite Switch Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getCompositeSwitchType()
	 * @generated
	 */
	int COMPOSITE_SWITCH_TYPE = 56;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.SeriesCompensator <em>Series Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series Compensator</em>'.
	 * @see CIM.IEC61970.Wires.SeriesCompensator
	 * @generated
	 */
	EClass getSeriesCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SeriesCompensator#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM.IEC61970.Wires.SeriesCompensator#getR()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	EAttribute getSeriesCompensator_R();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SeriesCompensator#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM.IEC61970.Wires.SeriesCompensator#getX()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	EAttribute getSeriesCompensator_X();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.PowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Transformer</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer
	 * @generated
	 */
	EClass getPowerTransformer();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.PowerTransformer#getFlowgates <em>Flowgates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flowgates</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer#getFlowgates()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EReference getPowerTransformer_Flowgates();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.PowerTransformer#getHeatExchanger <em>Heat Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heat Exchanger</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer#getHeatExchanger()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EReference getPowerTransformer_HeatExchanger();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.PowerTransformer#getTransformerWindings <em>Transformer Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Windings</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer#getTransformerWindings()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EReference getPowerTransformer_TransformerWindings();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PowerTransformer#getMagBaseU <em>Mag Base U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mag Base U</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer#getMagBaseU()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EAttribute getPowerTransformer_MagBaseU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PowerTransformer#getMagSatFlux <em>Mag Sat Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mag Sat Flux</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer#getMagSatFlux()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EAttribute getPowerTransformer_MagSatFlux();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PowerTransformer#getBmagSat <em>Bmag Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bmag Sat</em>'.
	 * @see CIM.IEC61970.Wires.PowerTransformer#getBmagSat()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EAttribute getPowerTransformer_BmagSat();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see CIM.IEC61970.Wires.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Switch#isRetained <em>Retained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retained</em>'.
	 * @see CIM.IEC61970.Wires.Switch#isRetained()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Retained();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Date</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getSwitchOnDate()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_SwitchOnDate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.Switch#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Mgmt Functions</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getLoadMgmtFunctions()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_LoadMgmtFunctions();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connect Disconnect Functions</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getConnectDisconnectFunctions()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_ConnectDisconnectFunctions();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Open</em>'.
	 * @see CIM.IEC61970.Wires.Switch#isNormalOpen()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_NormalOpen();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.Switch#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Operations</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getSwitchingOperations()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_SwitchingOperations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.Switch#getSwitchSchedules <em>Switch Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Schedules</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getSwitchSchedules()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_SwitchSchedules();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Count</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getSwitchOnCount()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_SwitchOnCount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite Switch</em>'.
	 * @see CIM.IEC61970.Wires.Switch#getCompositeSwitch()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_CompositeSwitch();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Jumper <em>Jumper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jumper</em>'.
	 * @see CIM.IEC61970.Wires.Jumper
	 * @generated
	 */
	EClass getJumper();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see CIM.IEC61970.Wires.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see CIM.IEC61970.Wires.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.Line#getTransmissionRightOfWay <em>Transmission Right Of Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Right Of Way</em>'.
	 * @see CIM.IEC61970.Wires.Line#getTransmissionRightOfWay()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_TransmissionRightOfWay();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.Line#getFlowgates <em>Flowgates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flowgates</em>'.
	 * @see CIM.IEC61970.Wires.Line#getFlowgates()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Flowgates();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CIM.IEC61970.Wires.Line#getRegion()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Region();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.EnergySource <em>Energy Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Source</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource
	 * @generated
	 */
	EClass getEnergySource();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getActivePower()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_ActivePower();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getR()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_R();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getX()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_X();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rn</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getRn()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_Rn();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Magnitude</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getVoltageMagnitude()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_VoltageMagnitude();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getR0()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_R0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Angle</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getVoltageAngle()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_VoltageAngle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xn</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getXn()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_Xn();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getNominalVoltage()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_NominalVoltage();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM.IEC61970.Wires.EnergySource#getX0()
	 * @see #getEnergySource()
	 * @generated
	 */
	EAttribute getEnergySource_X0();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.FrequencyConverter <em>Frequency Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Converter</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter
	 * @generated
	 */
	EClass getFrequencyConverter();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter#getOperatingMode()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	EAttribute getFrequencyConverter_OperatingMode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter#getFrequency()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	EAttribute getFrequencyConverter_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter#getMaxP()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	EAttribute getFrequencyConverter_MaxP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter#getMaxU()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	EAttribute getFrequencyConverter_MaxU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter#getMinU()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	EAttribute getFrequencyConverter_MinU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see CIM.IEC61970.Wires.FrequencyConverter#getMinP()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	EAttribute getFrequencyConverter_MinP();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see CIM.IEC61970.Wires.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Ground <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground</em>'.
	 * @see CIM.IEC61970.Wires.Ground
	 * @generated
	 */
	EClass getGround();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.Ground#getWindingInsulations <em>Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winding Insulations</em>'.
	 * @see CIM.IEC61970.Wires.Ground#getWindingInsulations()
	 * @see #getGround()
	 * @generated
	 */
	EReference getGround_WindingInsulations();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.LoadBreakSwitch <em>Load Break Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Break Switch</em>'.
	 * @see CIM.IEC61970.Wires.LoadBreakSwitch
	 * @generated
	 */
	EClass getLoadBreakSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM.IEC61970.Wires.LoadBreakSwitch#getRatedCurrent()
	 * @see #getLoadBreakSwitch()
	 * @generated
	 */
	EAttribute getLoadBreakSwitch_RatedCurrent();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.ImpedanceVariationCurve <em>Impedance Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impedance Variation Curve</em>'.
	 * @see CIM.IEC61970.Wires.ImpedanceVariationCurve
	 * @generated
	 */
	EClass getImpedanceVariationCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.ImpedanceVariationCurve#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.ImpedanceVariationCurve#getTapChanger()
	 * @see #getImpedanceVariationCurve()
	 * @generated
	 */
	EReference getImpedanceVariationCurve_TapChanger();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.TapSchedule <em>Tap Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Schedule</em>'.
	 * @see CIM.IEC61970.Wires.TapSchedule
	 * @generated
	 */
	EClass getTapSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapSchedule#isLineDropCompensation <em>Line Drop Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop Compensation</em>'.
	 * @see CIM.IEC61970.Wires.TapSchedule#isLineDropCompensation()
	 * @see #getTapSchedule()
	 * @generated
	 */
	EAttribute getTapSchedule_LineDropCompensation();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TapSchedule#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.TapSchedule#getTapChanger()
	 * @see #getTapSchedule()
	 * @generated
	 */
	EReference getTapSchedule_TapChanger();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapSchedule#getLineDropX <em>Line Drop X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop X</em>'.
	 * @see CIM.IEC61970.Wires.TapSchedule#getLineDropX()
	 * @see #getTapSchedule()
	 * @generated
	 */
	EAttribute getTapSchedule_LineDropX();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapSchedule#getLineDropR <em>Line Drop R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop R</em>'.
	 * @see CIM.IEC61970.Wires.TapSchedule#getLineDropR()
	 * @see #getTapSchedule()
	 * @generated
	 */
	EAttribute getTapSchedule_LineDropR();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.MutualCoupling <em>Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Coupling</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling
	 * @generated
	 */
	EClass getMutualCoupling();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance11</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getDistance11()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_Distance11();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance12</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getDistance12()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_Distance12();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0ch</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getB0ch()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_B0ch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0ch</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getG0ch()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_G0ch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getX0()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_X0();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Terminal</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getSecond_Terminal()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EReference getMutualCoupling_Second_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getR0()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_R0();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Terminal</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getFirst_Terminal()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EReference getMutualCoupling_First_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance22</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getDistance22()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_Distance22();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance21</em>'.
	 * @see CIM.IEC61970.Wires.MutualCoupling#getDistance21()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	EAttribute getMutualCoupling_Distance21();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.DCLineSegment <em>DC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DC Line Segment</em>'.
	 * @see CIM.IEC61970.Wires.DCLineSegment
	 * @generated
	 */
	EClass getDCLineSegment();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc Segment Resistance</em>'.
	 * @see CIM.IEC61970.Wires.DCLineSegment#getDcSegmentResistance()
	 * @see #getDCLineSegment()
	 * @generated
	 */
	EAttribute getDCLineSegment_DcSegmentResistance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc Segment Inductance</em>'.
	 * @see CIM.IEC61970.Wires.DCLineSegment#getDcSegmentInductance()
	 * @see #getDCLineSegment()
	 * @generated
	 */
	EAttribute getDCLineSegment_DcSegmentInductance();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.SwitchSchedule <em>Switch Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Schedule</em>'.
	 * @see CIM.IEC61970.Wires.SwitchSchedule
	 * @generated
	 */
	EClass getSwitchSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.SwitchSchedule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch</em>'.
	 * @see CIM.IEC61970.Wires.SwitchSchedule#getSwitch()
	 * @see #getSwitchSchedule()
	 * @generated
	 */
	EReference getSwitchSchedule_Switch();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.CompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Switch</em>'.
	 * @see CIM.IEC61970.Wires.CompositeSwitch
	 * @generated
	 */
	EClass getCompositeSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Switch Type</em>'.
	 * @see CIM.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType()
	 * @see #getCompositeSwitch()
	 * @generated
	 */
	EAttribute getCompositeSwitch_CompositeSwitchType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.CompositeSwitch#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see CIM.IEC61970.Wires.CompositeSwitch#getSwitches()
	 * @see #getCompositeSwitch()
	 * @generated
	 */
	EReference getCompositeSwitch_Switches();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AC Line Segment</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment
	 * @generated
	 */
	EClass getACLineSegment();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0ch</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getG0ch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_G0ch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getX()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_X();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gch</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getGch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_Gch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getR()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_R();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getX0()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_X0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bch</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getBch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_Bch();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getR0()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_R0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0ch</em>'.
	 * @see CIM.IEC61970.Wires.ACLineSegment#getB0ch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	EAttribute getACLineSegment_B0ch();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.PhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger
	 * @generated
	 */
	EClass getPhaseTapChanger();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.PhaseTapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Winding</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getTransformerWinding()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EReference getPhaseTapChanger_TransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getWindingConnectionAngle <em>Winding Connection Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Connection Angle</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getWindingConnectionAngle()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_WindingConnectionAngle();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.PhaseTapChanger#getWinding <em>Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winding</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getWinding()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EReference getPhaseTapChanger_Winding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerType <em>Phase Tap Changer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Tap Changer Type</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerType()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_PhaseTapChangerType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Phase Shift Increment</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getStepPhaseShiftIncrement()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_StepPhaseShiftIncrement();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.PhaseTapChanger#getPhaseVariationCurve <em>Phase Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Variation Curve</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getPhaseVariationCurve()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EReference getPhaseTapChanger_PhaseVariationCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getVoltageStepIncrementOutOfPhase <em>Voltage Step Increment Out Of Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Step Increment Out Of Phase</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getVoltageStepIncrementOutOfPhase()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_VoltageStepIncrementOutOfPhase();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getNominalVoltageOutOfPhase <em>Nominal Voltage Out Of Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage Out Of Phase</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getNominalVoltageOutOfPhase()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_NominalVoltageOutOfPhase();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getXStepMax <em>XStep Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XStep Max</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getXStepMax()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_XStepMax();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.PhaseTapChanger#getXStepMin <em>XStep Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XStep Min</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getXStepMin()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	EAttribute getPhaseTapChanger_XStepMin();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumer_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Cut Zone</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getPowerCutZone()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumer_PowerCutZone();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getPfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Pfixed();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed Pct</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getQfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_QfixedPct();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Count</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getCustomerCount()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_CustomerCount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Response</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getLoadResponse()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumer_LoadResponse();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed Pct</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getPfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_PfixedPct();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed</em>'.
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getQfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Qfixed();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Cond Eq</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingCondEq
	 * @generated
	 */
	EClass getRegulatingCondEq();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.RegulatingCondEq#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingCondEq#getControls()
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	EReference getRegulatingCondEq_Controls();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingCondEq#getRegulatingControl()
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	EReference getRegulatingCondEq_RegulatingControl();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.HeatExchanger <em>Heat Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heat Exchanger</em>'.
	 * @see CIM.IEC61970.Wires.HeatExchanger
	 * @generated
	 */
	EClass getHeatExchanger();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.HeatExchanger#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Transformer</em>'.
	 * @see CIM.IEC61970.Wires.HeatExchanger#getPowerTransformer()
	 * @see #getHeatExchanger()
	 * @generated
	 */
	EReference getHeatExchanger_PowerTransformer();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.StaticVarCompensator <em>Static Var Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Var Compensator</em>'.
	 * @see CIM.IEC61970.Wires.StaticVarCompensator
	 * @generated
	 */
	EClass getStaticVarCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SVC Control Mode</em>'.
	 * @see CIM.IEC61970.Wires.StaticVarCompensator#getSVCControlMode()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_SVCControlMode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inductive Rating</em>'.
	 * @see CIM.IEC61970.Wires.StaticVarCompensator#getInductiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_InductiveRating();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacitive Rating</em>'.
	 * @see CIM.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_CapacitiveRating();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Set Point</em>'.
	 * @see CIM.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_VoltageSetPoint();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see CIM.IEC61970.Wires.StaticVarCompensator#getSlope()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_Slope();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.PhaseVariationCurve <em>Phase Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Variation Curve</em>'.
	 * @see CIM.IEC61970.Wires.PhaseVariationCurve
	 * @generated
	 */
	EClass getPhaseVariationCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.PhaseVariationCurve#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.PhaseVariationCurve#getPhaseTapChanger()
	 * @see #getPhaseVariationCurve()
	 * @generated
	 */
	EReference getPhaseVariationCurve_PhaseTapChanger();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger
	 * @generated
	 */
	EClass getTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Delay</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getInitialDelay()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_InitialDelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subsequent Delay</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getSubsequentDelay()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_SubsequentDelay();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.TapChanger#getTapSchedules <em>Tap Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Schedules</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getTapSchedules()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_TapSchedules();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltc Flag</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#isLtcFlag()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_LtcFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Status</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#isRegulationStatus()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_RegulationStatus();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getRegulatingControl()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_RegulatingControl();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Step</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getNeutralStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NeutralStep();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral U</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getNeutralU()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NeutralU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Step</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getLowStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_LowStep();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Step</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getHighStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_HighStep();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Voltage Increment</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getStepVoltageIncrement()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_StepVoltageIncrement();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TapChanger#getImpedanceVariationCurve <em>Impedance Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impedance Variation Curve</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getImpedanceVariationCurve()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_ImpedanceVariationCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Tap Step</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getSvTapStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_SvTapStep();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Step</em>'.
	 * @see CIM.IEC61970.Wires.TapChanger#getNormalStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NormalStep();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.WindingTest <em>Winding Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winding Test</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest
	 * @generated
	 */
	EClass getWindingTest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getFromTapStep <em>From Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Tap Step</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getFromTapStep()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_FromTapStep();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.WindingTest#getFrom_TransformerWinding <em>From Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Transformer Winding</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getFrom_TransformerWinding()
	 * @see #getWindingTest()
	 * @generated
	 */
	EReference getWindingTest_From_TransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getLeakageImpedance <em>Leakage Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Impedance</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getLeakageImpedance()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_LeakageImpedance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getNoLoadLoss <em>No Load Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Load Loss</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getNoLoadLoss()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_NoLoadLoss();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getPhaseShift <em>Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Shift</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getPhaseShift()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_PhaseShift();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.WindingTest#getTo_TransformerWinding <em>To Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Transformer Winding</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getTo_TransformerWinding()
	 * @see #getWindingTest()
	 * @generated
	 */
	EReference getWindingTest_To_TransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getLoadLoss <em>Load Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Loss</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getLoadLoss()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_LoadLoss();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getToTapStep <em>To Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Tap Step</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getToTapStep()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_ToTapStep();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getVoltage()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.WindingTest#getExcitingCurrent <em>Exciting Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exciting Current</em>'.
	 * @see CIM.IEC61970.Wires.WindingTest#getExcitingCurrent()
	 * @see #getWindingTest()
	 * @generated
	 */
	EAttribute getWindingTest_ExcitingCurrent();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Fuse <em>Fuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuse</em>'.
	 * @see CIM.IEC61970.Wires.Fuse
	 * @generated
	 */
	EClass getFuse();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Fuse#getRatingCurrent <em>Rating Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating Current</em>'.
	 * @see CIM.IEC61970.Wires.Fuse#getRatingCurrent()
	 * @see #getFuse()
	 * @generated
	 */
	EAttribute getFuse_RatingCurrent();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.RegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Control</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl
	 * @generated
	 */
	EClass getRegulatingControl();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getMode()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EAttribute getRegulatingControl_Mode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.RegulatingControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getTapChanger()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_TapChanger();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getTerminal()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_Terminal();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Cond Eq</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getRegulatingCondEq()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_RegulatingCondEq();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getTargetRange()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EAttribute getRegulatingControl_TargetRange();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Value</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getTargetValue()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EAttribute getRegulatingControl_TargetValue();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulation Schedule</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#getRegulationSchedule()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_RegulationSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discrete</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControl#isDiscrete()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EAttribute getRegulatingControl_Discrete();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.BusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busbar Section</em>'.
	 * @see CIM.IEC61970.Wires.BusbarSection
	 * @generated
	 */
	EClass getBusbarSection();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voltage Control Zone</em>'.
	 * @see CIM.IEC61970.Wires.BusbarSection#getVoltageControlZone()
	 * @see #getBusbarSection()
	 * @generated
	 */
	EReference getBusbarSection_VoltageControlZone();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Resistor <em>Resistor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resistor</em>'.
	 * @see CIM.IEC61970.Wires.Resistor
	 * @generated
	 */
	EClass getResistor();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.RatioVariationCurve <em>Ratio Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Variation Curve</em>'.
	 * @see CIM.IEC61970.Wires.RatioVariationCurve
	 * @generated
	 */
	EClass getRatioVariationCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RatioVariationCurve#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.RatioVariationCurve#getRatioTapChanger()
	 * @see #getRatioVariationCurve()
	 * @generated
	 */
	EReference getRatioVariationCurve_RatioTapChanger();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.RectifierInverter <em>Rectifier Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectifier Inverter</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter
	 * @generated
	 */
	EClass getRectifierInverter();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Compound Voltage</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_MinCompoundVoltage();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getMinP()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_MinP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getMaxU()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_MaxU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getOperatingMode()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_OperatingMode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getFrequency()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getMaxP()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_MaxP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commutating Reactance</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getCommutatingReactance()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_CommutatingReactance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commutating Resistance</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getCommutatingResistance()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_CommutatingResistance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getRatedU()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_RatedU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getMinU()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_MinU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bridges</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getBridges()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_Bridges();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compound Resistance</em>'.
	 * @see CIM.IEC61970.Wires.RectifierInverter#getCompoundResistance()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	EAttribute getRectifierInverter_CompoundResistance();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker</em>'.
	 * @see CIM.IEC61970.Wires.Breaker
	 * @generated
	 */
	EClass getBreaker();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Breaker#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM.IEC61970.Wires.Breaker#getRatedCurrent()
	 * @see #getBreaker()
	 * @generated
	 */
	EAttribute getBreaker_RatedCurrent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Breaker#getInTransitTime <em>In Transit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Transit Time</em>'.
	 * @see CIM.IEC61970.Wires.Breaker#getInTransitTime()
	 * @see #getBreaker()
	 * @generated
	 */
	EAttribute getBreaker_InTransitTime();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.TransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Winding</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding
	 * @generated
	 */
	EClass getTransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getG0()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_G0();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.TransformerWinding#getTo_WindingTest <em>To Winding Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Winding Test</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getTo_WindingTest()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_To_WindingTest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getRground <em>Rground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rground</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getRground()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_Rground();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#isGrounded <em>Grounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounded</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#isGrounded()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_Grounded();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getShortTermS <em>Short Term S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Term S</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getShortTermS()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_ShortTermS();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getG()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_G();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getB()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_B();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getX()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_X();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getPhaseTapChanger()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_PhaseTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getR()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_R();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getR0()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_R0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getB0()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_B0();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TransformerWinding#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Transformer</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getPowerTransformer()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_PowerTransformer();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getWindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Type</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getWindingType()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_WindingType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getX0()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_X0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getRatedS()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_RatedS();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getRatedU()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_RatedU();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.TransformerWinding#getFrom_WindingTest <em>From Winding Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Winding Test</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getFrom_WindingTest()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_From_WindingTest();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.TransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getRatioTapChanger()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_RatioTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getInsulationU <em>Insulation U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation U</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getInsulationU()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_InsulationU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getEmergencyS <em>Emergency S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency S</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getEmergencyS()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_EmergencyS();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getConnectionType()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.TransformerWinding#getXground <em>Xground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xground</em>'.
	 * @see CIM.IEC61970.Wires.TransformerWinding#getXground()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_Xground();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.GroundDisconnector <em>Ground Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Disconnector</em>'.
	 * @see CIM.IEC61970.Wires.GroundDisconnector
	 * @generated
	 */
	EClass getGroundDisconnector();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.VoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Control Zone</em>'.
	 * @see CIM.IEC61970.Wires.VoltageControlZone
	 * @generated
	 */
	EClass getVoltageControlZone();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulation Schedule</em>'.
	 * @see CIM.IEC61970.Wires.VoltageControlZone#getRegulationSchedule()
	 * @see #getVoltageControlZone()
	 * @generated
	 */
	EReference getVoltageControlZone_RegulationSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Busbar Section</em>'.
	 * @see CIM.IEC61970.Wires.VoltageControlZone#getBusbarSection()
	 * @see #getVoltageControlZone()
	 * @generated
	 */
	EReference getVoltageControlZone_BusbarSection();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.ProtectedSwitch <em>Protected Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protected Switch</em>'.
	 * @see CIM.IEC61970.Wires.ProtectedSwitch
	 * @generated
	 */
	EClass getProtectedSwitch();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reclose Sequences</em>'.
	 * @see CIM.IEC61970.Wires.ProtectedSwitch#getRecloseSequences()
	 * @see #getProtectedSwitch()
	 * @generated
	 */
	EReference getProtectedSwitch_RecloseSequences();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.ShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Compensator</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator
	 * @generated
	 */
	EClass getShuntCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Sections</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getNormalSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NormalSections();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getMinU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_MinU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0 Per Section</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getB0PerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_B0PerSection();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Q</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getNomQ()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NomQ();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom U</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getNomU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NomU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Sections</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getMaximumSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_MaximumSections();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Count</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnCount()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_SwitchOnCount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getMaxU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_MaxU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BPer Section</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getBPerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_BPerSection();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GPer Section</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getGPerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_GPerSection();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Shunt Compensator Sections</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EReference getShuntCompensator_SvShuntCompensatorSections();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Date</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnDate()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_SwitchOnDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVR Delay</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getAVRDelay()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_AVRDelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Sensitivity</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_VoltageSensitivity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0 Per Section</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getG0PerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_G0PerSection();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Per Section</em>'.
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getReactivePerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_ReactivePerSection();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see CIM.IEC61970.Wires.Conductor
	 * @generated
	 */
	EClass getConductor();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.Conductor#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CIM.IEC61970.Wires.Conductor#getLength()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Length();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnector</em>'.
	 * @see CIM.IEC61970.Wires.Disconnector
	 * @generated
	 */
	EClass getDisconnector();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.SynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Machine</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine
	 * @generated
	 */
	EClass getSynchronousMachine();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Sync</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getXDirectSync()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_XDirectSync();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Trans</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getXQuadTrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_XQuadTrans();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coolant Condition</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getCoolantCondition()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_CoolantCondition();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reactive Capability Curves</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_ReactiveCapabilityCurves();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Subtrans</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_XQuadSubtrans();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coolant Type</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getCoolantType()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_CoolantType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condenser P</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getCondenserP()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_CondenserP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVR To Manual Lag</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLag()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_AVRToManualLag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Q</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getMinQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MinQ();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVR To Manual Lead</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLead()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_AVRToManualLead();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getMaxU()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MaxU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damping</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getDamping()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_Damping();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getGeneratingUnit()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_GeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Q</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getMaxQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MaxQ();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getR0()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_R0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getType()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_Type();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R2</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getR2()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_R2();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Priority</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getReferencePriority()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_ReferencePriority();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getX0()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_X0();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getX2()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_X2();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getR()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_R();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Reactive Capability Curve</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_InitialReactiveCapabilityCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Subtrans</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_XDirectSubtrans();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getX()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_X();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QPercent</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getQPercent()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_QPercent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Sync</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getXQuadSync()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_XQuadSync();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getRatedS()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_RatedS();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual To AVR</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getManualToAVR()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_ManualToAVR();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inertia</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getInertia()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_Inertia();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Pump</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getHydroPump()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_HydroPump();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getMinU()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MinU();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Trans</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getXDirectTrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_XDirectTrans();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Q</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getBaseQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_BaseQ();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getOperatingMode()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_OperatingMode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prime Movers</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getPrimeMovers()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_PrimeMovers();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see CIM.IEC61970.Wires.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.RegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation Schedule</em>'.
	 * @see CIM.IEC61970.Wires.RegulationSchedule
	 * @generated
	 */
	EClass getRegulationSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulationSchedule#getLineDropR <em>Line Drop R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop R</em>'.
	 * @see CIM.IEC61970.Wires.RegulationSchedule#getLineDropR()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EAttribute getRegulationSchedule_LineDropR();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulationSchedule#getLineDropX <em>Line Drop X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop X</em>'.
	 * @see CIM.IEC61970.Wires.RegulationSchedule#getLineDropX()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EAttribute getRegulationSchedule_LineDropX();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RegulationSchedule#isLineDropCompensation <em>Line Drop Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop Compensation</em>'.
	 * @see CIM.IEC61970.Wires.RegulationSchedule#isLineDropCompensation()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EAttribute getRegulationSchedule_LineDropCompensation();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CIM.IEC61970.Wires.RegulationSchedule#getRegulatingControl()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EReference getRegulationSchedule_RegulatingControl();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Control Zones</em>'.
	 * @see CIM.IEC61970.Wires.RegulationSchedule#getVoltageControlZones()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EReference getRegulationSchedule_VoltageControlZones();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Capability Curve</em>'.
	 * @see CIM.IEC61970.Wires.ReactiveCapabilityCurve
	 * @generated
	 */
	EClass getReactiveCapabilityCurve();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initially Used By Synchronous Machines</em>'.
	 * @see CIM.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	EReference getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hydrogen Pressure</em>'.
	 * @see CIM.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	EAttribute getReactiveCapabilityCurve_HydrogenPressure();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronous Machines</em>'.
	 * @see CIM.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	EReference getReactiveCapabilityCurve_SynchronousMachines();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coolant Temperature</em>'.
	 * @see CIM.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	EAttribute getReactiveCapabilityCurve_CoolantTemperature();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Wires.RatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Tap Changer</em>'.
	 * @see CIM.IEC61970.Wires.RatioTapChanger
	 * @generated
	 */
	EClass getRatioTapChanger();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RatioTapChanger#getRatioVariationCurve <em>Ratio Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Variation Curve</em>'.
	 * @see CIM.IEC61970.Wires.RatioTapChanger#getRatioVariationCurve()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	EReference getRatioTapChanger_RatioVariationCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RatioTapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Winding</em>'.
	 * @see CIM.IEC61970.Wires.RatioTapChanger#getTransformerWinding()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	EReference getRatioTapChanger_TransformerWinding();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Wires.RatioTapChanger#getWinding <em>Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winding</em>'.
	 * @see CIM.IEC61970.Wires.RatioTapChanger#getWinding()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	EReference getRatioTapChanger_Winding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcul Control Mode</em>'.
	 * @see CIM.IEC61970.Wires.RatioTapChanger#getTculControlMode()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	EAttribute getRatioTapChanger_TculControlMode();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.SVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SVC Control Mode</em>'.
	 * @see CIM.IEC61970.Wires.SVCControlMode
	 * @generated
	 */
	EEnum getSVCControlMode();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.PhaseTapChangerKind <em>Phase Tap Changer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phase Tap Changer Kind</em>'.
	 * @see CIM.IEC61970.Wires.PhaseTapChangerKind
	 * @generated
	 */
	EEnum getPhaseTapChangerKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.WindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Type</em>'.
	 * @see CIM.IEC61970.Wires.WindingType
	 * @generated
	 */
	EEnum getWindingType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Type</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachineType
	 * @generated
	 */
	EEnum getSynchronousMachineType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.CoolantType <em>Coolant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coolant Type</em>'.
	 * @see CIM.IEC61970.Wires.CoolantType
	 * @generated
	 */
	EEnum getCoolantType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.TransformerControlMode <em>Transformer Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Control Mode</em>'.
	 * @see CIM.IEC61970.Wires.TransformerControlMode
	 * @generated
	 */
	EEnum getTransformerControlMode();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Operating Mode</em>'.
	 * @see CIM.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @generated
	 */
	EEnum getSynchronousMachineOperatingMode();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.WindingConnection <em>Winding Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Connection</em>'.
	 * @see CIM.IEC61970.Wires.WindingConnection
	 * @generated
	 */
	EEnum getWindingConnection();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.TapChangerKind <em>Tap Changer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tap Changer Kind</em>'.
	 * @see CIM.IEC61970.Wires.TapChangerKind
	 * @generated
	 */
	EEnum getTapChangerKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Wires.RegulatingControlModeKind <em>Regulating Control Mode Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regulating Control Mode Kind</em>'.
	 * @see CIM.IEC61970.Wires.RegulatingControlModeKind
	 * @generated
	 */
	EEnum getRegulatingControlModeKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operating Mode</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Textual name for an operating mode'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Textual name for an operating mode'"
	 * @generated
	 */
	EDataType getOperatingMode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Composite Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Composite Switch Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An alphanumeric code that can be used as a reference to extar information such as the description of the interlocking scheme if any'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An alphanumeric code that can be used as a reference to extar information such as the description of the interlocking scheme if any'"
	 * @generated
	 */
	EDataType getCompositeSwitchType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiresFactory getWiresFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.SeriesCompensatorImpl <em>Series Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.SeriesCompensatorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSeriesCompensator()
		 * @generated
		 */
		EClass SERIES_COMPENSATOR = eINSTANCE.getSeriesCompensator();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_COMPENSATOR__R = eINSTANCE.getSeriesCompensator_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_COMPENSATOR__X = eINSTANCE.getSeriesCompensator_X();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.PowerTransformerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPowerTransformer()
		 * @generated
		 */
		EClass POWER_TRANSFORMER = eINSTANCE.getPowerTransformer();

		/**
		 * The meta object literal for the '<em><b>Flowgates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_TRANSFORMER__FLOWGATES = eINSTANCE.getPowerTransformer_Flowgates();

		/**
		 * The meta object literal for the '<em><b>Heat Exchanger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_TRANSFORMER__HEAT_EXCHANGER = eINSTANCE.getPowerTransformer_HeatExchanger();

		/**
		 * The meta object literal for the '<em><b>Transformer Windings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_TRANSFORMER__TRANSFORMER_WINDINGS = eINSTANCE.getPowerTransformer_TransformerWindings();

		/**
		 * The meta object literal for the '<em><b>Mag Base U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_TRANSFORMER__MAG_BASE_U = eINSTANCE.getPowerTransformer_MagBaseU();

		/**
		 * The meta object literal for the '<em><b>Mag Sat Flux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_TRANSFORMER__MAG_SAT_FLUX = eINSTANCE.getPowerTransformer_MagSatFlux();

		/**
		 * The meta object literal for the '<em><b>Bmag Sat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_TRANSFORMER__BMAG_SAT = eINSTANCE.getPowerTransformer_BmagSat();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.SwitchImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Retained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__RETAINED = eINSTANCE.getSwitch_Retained();

		/**
		 * The meta object literal for the '<em><b>Switch On Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__SWITCH_ON_DATE = eINSTANCE.getSwitch_SwitchOnDate();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__LOAD_MGMT_FUNCTIONS = eINSTANCE.getSwitch_LoadMgmtFunctions();

		/**
		 * The meta object literal for the '<em><b>Connect Disconnect Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__CONNECT_DISCONNECT_FUNCTIONS = eINSTANCE.getSwitch_ConnectDisconnectFunctions();

		/**
		 * The meta object literal for the '<em><b>Normal Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__NORMAL_OPEN = eINSTANCE.getSwitch_NormalOpen();

		/**
		 * The meta object literal for the '<em><b>Switching Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__SWITCHING_OPERATIONS = eINSTANCE.getSwitch_SwitchingOperations();

		/**
		 * The meta object literal for the '<em><b>Switch Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__SWITCH_SCHEDULES = eINSTANCE.getSwitch_SwitchSchedules();

		/**
		 * The meta object literal for the '<em><b>Switch On Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__SWITCH_ON_COUNT = eINSTANCE.getSwitch_SwitchOnCount();

		/**
		 * The meta object literal for the '<em><b>Composite Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__COMPOSITE_SWITCH = eINSTANCE.getSwitch_CompositeSwitch();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.JumperImpl <em>Jumper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.JumperImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getJumper()
		 * @generated
		 */
		EClass JUMPER = eINSTANCE.getJumper();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.PlantImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.LineImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Transmission Right Of Way</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TRANSMISSION_RIGHT_OF_WAY = eINSTANCE.getLine_TransmissionRightOfWay();

		/**
		 * The meta object literal for the '<em><b>Flowgates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__FLOWGATES = eINSTANCE.getLine_Flowgates();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__REGION = eINSTANCE.getLine_Region();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.EnergySourceImpl <em>Energy Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.EnergySourceImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getEnergySource()
		 * @generated
		 */
		EClass ENERGY_SOURCE = eINSTANCE.getEnergySource();

		/**
		 * The meta object literal for the '<em><b>Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__ACTIVE_POWER = eINSTANCE.getEnergySource_ActivePower();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__R = eINSTANCE.getEnergySource_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__X = eINSTANCE.getEnergySource_X();

		/**
		 * The meta object literal for the '<em><b>Rn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__RN = eINSTANCE.getEnergySource_Rn();

		/**
		 * The meta object literal for the '<em><b>Voltage Magnitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__VOLTAGE_MAGNITUDE = eINSTANCE.getEnergySource_VoltageMagnitude();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__R0 = eINSTANCE.getEnergySource_R0();

		/**
		 * The meta object literal for the '<em><b>Voltage Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__VOLTAGE_ANGLE = eINSTANCE.getEnergySource_VoltageAngle();

		/**
		 * The meta object literal for the '<em><b>Xn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__XN = eINSTANCE.getEnergySource_Xn();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__NOMINAL_VOLTAGE = eINSTANCE.getEnergySource_NominalVoltage();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SOURCE__X0 = eINSTANCE.getEnergySource_X0();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.FrequencyConverterImpl <em>Frequency Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.FrequencyConverterImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getFrequencyConverter()
		 * @generated
		 */
		EClass FREQUENCY_CONVERTER = eINSTANCE.getFrequencyConverter();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_CONVERTER__OPERATING_MODE = eINSTANCE.getFrequencyConverter_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_CONVERTER__FREQUENCY = eINSTANCE.getFrequencyConverter_Frequency();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_CONVERTER__MAX_P = eINSTANCE.getFrequencyConverter_MaxP();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_CONVERTER__MAX_U = eINSTANCE.getFrequencyConverter_MaxU();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_CONVERTER__MIN_U = eINSTANCE.getFrequencyConverter_MinU();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_CONVERTER__MIN_P = eINSTANCE.getFrequencyConverter_MinP();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ConnectorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.GroundImpl <em>Ground</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.GroundImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getGround()
		 * @generated
		 */
		EClass GROUND = eINSTANCE.getGround();

		/**
		 * The meta object literal for the '<em><b>Winding Insulations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND__WINDING_INSULATIONS = eINSTANCE.getGround_WindingInsulations();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.LoadBreakSwitchImpl <em>Load Break Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.LoadBreakSwitchImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getLoadBreakSwitch()
		 * @generated
		 */
		EClass LOAD_BREAK_SWITCH = eINSTANCE.getLoadBreakSwitch();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BREAK_SWITCH__RATED_CURRENT = eINSTANCE.getLoadBreakSwitch_RatedCurrent();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ImpedanceVariationCurveImpl <em>Impedance Variation Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ImpedanceVariationCurveImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getImpedanceVariationCurve()
		 * @generated
		 */
		EClass IMPEDANCE_VARIATION_CURVE = eINSTANCE.getImpedanceVariationCurve();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPEDANCE_VARIATION_CURVE__TAP_CHANGER = eINSTANCE.getImpedanceVariationCurve_TapChanger();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.TapScheduleImpl <em>Tap Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.TapScheduleImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTapSchedule()
		 * @generated
		 */
		EClass TAP_SCHEDULE = eINSTANCE.getTapSchedule();

		/**
		 * The meta object literal for the '<em><b>Line Drop Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_SCHEDULE__LINE_DROP_COMPENSATION = eINSTANCE.getTapSchedule_LineDropCompensation();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_SCHEDULE__TAP_CHANGER = eINSTANCE.getTapSchedule_TapChanger();

		/**
		 * The meta object literal for the '<em><b>Line Drop X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_SCHEDULE__LINE_DROP_X = eINSTANCE.getTapSchedule_LineDropX();

		/**
		 * The meta object literal for the '<em><b>Line Drop R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_SCHEDULE__LINE_DROP_R = eINSTANCE.getTapSchedule_LineDropR();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.MutualCouplingImpl <em>Mutual Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.MutualCouplingImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getMutualCoupling()
		 * @generated
		 */
		EClass MUTUAL_COUPLING = eINSTANCE.getMutualCoupling();

		/**
		 * The meta object literal for the '<em><b>Distance11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__DISTANCE11 = eINSTANCE.getMutualCoupling_Distance11();

		/**
		 * The meta object literal for the '<em><b>Distance12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__DISTANCE12 = eINSTANCE.getMutualCoupling_Distance12();

		/**
		 * The meta object literal for the '<em><b>B0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__B0CH = eINSTANCE.getMutualCoupling_B0ch();

		/**
		 * The meta object literal for the '<em><b>G0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__G0CH = eINSTANCE.getMutualCoupling_G0ch();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__X0 = eINSTANCE.getMutualCoupling_X0();

		/**
		 * The meta object literal for the '<em><b>Second Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_COUPLING__SECOND_TERMINAL = eINSTANCE.getMutualCoupling_Second_Terminal();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__R0 = eINSTANCE.getMutualCoupling_R0();

		/**
		 * The meta object literal for the '<em><b>First Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_COUPLING__FIRST_TERMINAL = eINSTANCE.getMutualCoupling_First_Terminal();

		/**
		 * The meta object literal for the '<em><b>Distance22</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__DISTANCE22 = eINSTANCE.getMutualCoupling_Distance22();

		/**
		 * The meta object literal for the '<em><b>Distance21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_COUPLING__DISTANCE21 = eINSTANCE.getMutualCoupling_Distance21();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.DCLineSegmentImpl <em>DC Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.DCLineSegmentImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getDCLineSegment()
		 * @generated
		 */
		EClass DC_LINE_SEGMENT = eINSTANCE.getDCLineSegment();

		/**
		 * The meta object literal for the '<em><b>Dc Segment Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE = eINSTANCE.getDCLineSegment_DcSegmentResistance();

		/**
		 * The meta object literal for the '<em><b>Dc Segment Inductance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE = eINSTANCE.getDCLineSegment_DcSegmentInductance();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.SwitchScheduleImpl <em>Switch Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.SwitchScheduleImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSwitchSchedule()
		 * @generated
		 */
		EClass SWITCH_SCHEDULE = eINSTANCE.getSwitchSchedule();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_SCHEDULE__SWITCH = eINSTANCE.getSwitchSchedule_Switch();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.CompositeSwitchImpl <em>Composite Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.CompositeSwitchImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getCompositeSwitch()
		 * @generated
		 */
		EClass COMPOSITE_SWITCH = eINSTANCE.getCompositeSwitch();

		/**
		 * The meta object literal for the '<em><b>Composite Switch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE = eINSTANCE.getCompositeSwitch_CompositeSwitchType();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SWITCH__SWITCHES = eINSTANCE.getCompositeSwitch_Switches();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ACLineSegmentImpl <em>AC Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ACLineSegmentImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getACLineSegment()
		 * @generated
		 */
		EClass AC_LINE_SEGMENT = eINSTANCE.getACLineSegment();

		/**
		 * The meta object literal for the '<em><b>G0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__G0CH = eINSTANCE.getACLineSegment_G0ch();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__X = eINSTANCE.getACLineSegment_X();

		/**
		 * The meta object literal for the '<em><b>Gch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__GCH = eINSTANCE.getACLineSegment_Gch();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__R = eINSTANCE.getACLineSegment_R();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__X0 = eINSTANCE.getACLineSegment_X0();

		/**
		 * The meta object literal for the '<em><b>Bch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__BCH = eINSTANCE.getACLineSegment_Bch();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__R0 = eINSTANCE.getACLineSegment_R0();

		/**
		 * The meta object literal for the '<em><b>B0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AC_LINE_SEGMENT__B0CH = eINSTANCE.getACLineSegment_B0ch();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl <em>Phase Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.PhaseTapChangerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPhaseTapChanger()
		 * @generated
		 */
		EClass PHASE_TAP_CHANGER = eINSTANCE.getPhaseTapChanger();

		/**
		 * The meta object literal for the '<em><b>Transformer Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TAP_CHANGER__TRANSFORMER_WINDING = eINSTANCE.getPhaseTapChanger_TransformerWinding();

		/**
		 * The meta object literal for the '<em><b>Winding Connection Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE = eINSTANCE.getPhaseTapChanger_WindingConnectionAngle();

		/**
		 * The meta object literal for the '<em><b>Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TAP_CHANGER__WINDING = eINSTANCE.getPhaseTapChanger_Winding();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE = eINSTANCE.getPhaseTapChanger_PhaseTapChangerType();

		/**
		 * The meta object literal for the '<em><b>Step Phase Shift Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT = eINSTANCE.getPhaseTapChanger_StepPhaseShiftIncrement();

		/**
		 * The meta object literal for the '<em><b>Phase Variation Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE = eINSTANCE.getPhaseTapChanger_PhaseVariationCurve();

		/**
		 * The meta object literal for the '<em><b>Voltage Step Increment Out Of Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE = eINSTANCE.getPhaseTapChanger_VoltageStepIncrementOutOfPhase();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage Out Of Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE = eINSTANCE.getPhaseTapChanger_NominalVoltageOutOfPhase();

		/**
		 * The meta object literal for the '<em><b>XStep Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__XSTEP_MAX = eINSTANCE.getPhaseTapChanger_XStepMax();

		/**
		 * The meta object literal for the '<em><b>XStep Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TAP_CHANGER__XSTEP_MIN = eINSTANCE.getPhaseTapChanger_XStepMin();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.EnergyConsumerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getEnergyConsumer()
		 * @generated
		 */
		EClass ENERGY_CONSUMER = eINSTANCE.getEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS = eINSTANCE.getEnergyConsumer_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Power Cut Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER__POWER_CUT_ZONE = eINSTANCE.getEnergyConsumer_PowerCutZone();

		/**
		 * The meta object literal for the '<em><b>Pfixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__PFIXED = eINSTANCE.getEnergyConsumer_Pfixed();

		/**
		 * The meta object literal for the '<em><b>Qfixed Pct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__QFIXED_PCT = eINSTANCE.getEnergyConsumer_QfixedPct();

		/**
		 * The meta object literal for the '<em><b>Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__CUSTOMER_COUNT = eINSTANCE.getEnergyConsumer_CustomerCount();

		/**
		 * The meta object literal for the '<em><b>Load Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER__LOAD_RESPONSE = eINSTANCE.getEnergyConsumer_LoadResponse();

		/**
		 * The meta object literal for the '<em><b>Pfixed Pct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__PFIXED_PCT = eINSTANCE.getEnergyConsumer_PfixedPct();

		/**
		 * The meta object literal for the '<em><b>Qfixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__QFIXED = eINSTANCE.getEnergyConsumer_Qfixed();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.RegulatingCondEqImpl <em>Regulating Cond Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.RegulatingCondEqImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulatingCondEq()
		 * @generated
		 */
		EClass REGULATING_COND_EQ = eINSTANCE.getRegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_COND_EQ__CONTROLS = eINSTANCE.getRegulatingCondEq_Controls();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_COND_EQ__REGULATING_CONTROL = eINSTANCE.getRegulatingCondEq_RegulatingControl();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.HeatExchangerImpl <em>Heat Exchanger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.HeatExchangerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getHeatExchanger()
		 * @generated
		 */
		EClass HEAT_EXCHANGER = eINSTANCE.getHeatExchanger();

		/**
		 * The meta object literal for the '<em><b>Power Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAT_EXCHANGER__POWER_TRANSFORMER = eINSTANCE.getHeatExchanger_PowerTransformer();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl <em>Static Var Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getStaticVarCompensator()
		 * @generated
		 */
		EClass STATIC_VAR_COMPENSATOR = eINSTANCE.getStaticVarCompensator();

		/**
		 * The meta object literal for the '<em><b>SVC Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE = eINSTANCE.getStaticVarCompensator_SVCControlMode();

		/**
		 * The meta object literal for the '<em><b>Inductive Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING = eINSTANCE.getStaticVarCompensator_InductiveRating();

		/**
		 * The meta object literal for the '<em><b>Capacitive Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING = eINSTANCE.getStaticVarCompensator_CapacitiveRating();

		/**
		 * The meta object literal for the '<em><b>Voltage Set Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT = eINSTANCE.getStaticVarCompensator_VoltageSetPoint();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__SLOPE = eINSTANCE.getStaticVarCompensator_Slope();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.PhaseVariationCurveImpl <em>Phase Variation Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.PhaseVariationCurveImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPhaseVariationCurve()
		 * @generated
		 */
		EClass PHASE_VARIATION_CURVE = eINSTANCE.getPhaseVariationCurve();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER = eINSTANCE.getPhaseVariationCurve_PhaseTapChanger();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.TapChangerImpl <em>Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.TapChangerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTapChanger()
		 * @generated
		 */
		EClass TAP_CHANGER = eINSTANCE.getTapChanger();

		/**
		 * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__INITIAL_DELAY = eINSTANCE.getTapChanger_InitialDelay();

		/**
		 * The meta object literal for the '<em><b>Subsequent Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__SUBSEQUENT_DELAY = eINSTANCE.getTapChanger_SubsequentDelay();

		/**
		 * The meta object literal for the '<em><b>Tap Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER__TAP_SCHEDULES = eINSTANCE.getTapChanger_TapSchedules();

		/**
		 * The meta object literal for the '<em><b>Ltc Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__LTC_FLAG = eINSTANCE.getTapChanger_LtcFlag();

		/**
		 * The meta object literal for the '<em><b>Regulation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__REGULATION_STATUS = eINSTANCE.getTapChanger_RegulationStatus();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER__REGULATING_CONTROL = eINSTANCE.getTapChanger_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Neutral Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__NEUTRAL_STEP = eINSTANCE.getTapChanger_NeutralStep();

		/**
		 * The meta object literal for the '<em><b>Neutral U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__NEUTRAL_U = eINSTANCE.getTapChanger_NeutralU();

		/**
		 * The meta object literal for the '<em><b>Low Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__LOW_STEP = eINSTANCE.getTapChanger_LowStep();

		/**
		 * The meta object literal for the '<em><b>High Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__HIGH_STEP = eINSTANCE.getTapChanger_HighStep();

		/**
		 * The meta object literal for the '<em><b>Step Voltage Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__STEP_VOLTAGE_INCREMENT = eINSTANCE.getTapChanger_StepVoltageIncrement();

		/**
		 * The meta object literal for the '<em><b>Impedance Variation Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER__IMPEDANCE_VARIATION_CURVE = eINSTANCE.getTapChanger_ImpedanceVariationCurve();

		/**
		 * The meta object literal for the '<em><b>Sv Tap Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER__SV_TAP_STEP = eINSTANCE.getTapChanger_SvTapStep();

		/**
		 * The meta object literal for the '<em><b>Normal Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__NORMAL_STEP = eINSTANCE.getTapChanger_NormalStep();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.WindingTestImpl <em>Winding Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.WindingTestImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getWindingTest()
		 * @generated
		 */
		EClass WINDING_TEST = eINSTANCE.getWindingTest();

		/**
		 * The meta object literal for the '<em><b>From Tap Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__FROM_TAP_STEP = eINSTANCE.getWindingTest_FromTapStep();

		/**
		 * The meta object literal for the '<em><b>From Transformer Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_TEST__FROM_TRANSFORMER_WINDING = eINSTANCE.getWindingTest_From_TransformerWinding();

		/**
		 * The meta object literal for the '<em><b>Leakage Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__LEAKAGE_IMPEDANCE = eINSTANCE.getWindingTest_LeakageImpedance();

		/**
		 * The meta object literal for the '<em><b>No Load Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__NO_LOAD_LOSS = eINSTANCE.getWindingTest_NoLoadLoss();

		/**
		 * The meta object literal for the '<em><b>Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__PHASE_SHIFT = eINSTANCE.getWindingTest_PhaseShift();

		/**
		 * The meta object literal for the '<em><b>To Transformer Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_TEST__TO_TRANSFORMER_WINDING = eINSTANCE.getWindingTest_To_TransformerWinding();

		/**
		 * The meta object literal for the '<em><b>Load Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__LOAD_LOSS = eINSTANCE.getWindingTest_LoadLoss();

		/**
		 * The meta object literal for the '<em><b>To Tap Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__TO_TAP_STEP = eINSTANCE.getWindingTest_ToTapStep();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__VOLTAGE = eINSTANCE.getWindingTest_Voltage();

		/**
		 * The meta object literal for the '<em><b>Exciting Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_TEST__EXCITING_CURRENT = eINSTANCE.getWindingTest_ExcitingCurrent();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.FuseImpl <em>Fuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.FuseImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getFuse()
		 * @generated
		 */
		EClass FUSE = eINSTANCE.getFuse();

		/**
		 * The meta object literal for the '<em><b>Rating Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUSE__RATING_CURRENT = eINSTANCE.getFuse_RatingCurrent();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl <em>Regulating Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.RegulatingControlImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulatingControl()
		 * @generated
		 */
		EClass REGULATING_CONTROL = eINSTANCE.getRegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATING_CONTROL__MODE = eINSTANCE.getRegulatingControl_Mode();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__TAP_CHANGER = eINSTANCE.getRegulatingControl_TapChanger();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__TERMINAL = eINSTANCE.getRegulatingControl_Terminal();

		/**
		 * The meta object literal for the '<em><b>Regulating Cond Eq</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__REGULATING_COND_EQ = eINSTANCE.getRegulatingControl_RegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Target Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATING_CONTROL__TARGET_RANGE = eINSTANCE.getRegulatingControl_TargetRange();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATING_CONTROL__TARGET_VALUE = eINSTANCE.getRegulatingControl_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Regulation Schedule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__REGULATION_SCHEDULE = eINSTANCE.getRegulatingControl_RegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATING_CONTROL__DISCRETE = eINSTANCE.getRegulatingControl_Discrete();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.BusbarSectionImpl <em>Busbar Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.BusbarSectionImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getBusbarSection()
		 * @generated
		 */
		EClass BUSBAR_SECTION = eINSTANCE.getBusbarSection();

		/**
		 * The meta object literal for the '<em><b>Voltage Control Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE = eINSTANCE.getBusbarSection_VoltageControlZone();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ResistorImpl <em>Resistor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ResistorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getResistor()
		 * @generated
		 */
		EClass RESISTOR = eINSTANCE.getResistor();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.RatioVariationCurveImpl <em>Ratio Variation Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.RatioVariationCurveImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRatioVariationCurve()
		 * @generated
		 */
		EClass RATIO_VARIATION_CURVE = eINSTANCE.getRatioVariationCurve();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER = eINSTANCE.getRatioVariationCurve_RatioTapChanger();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.RectifierInverterImpl <em>Rectifier Inverter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.RectifierInverterImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRectifierInverter()
		 * @generated
		 */
		EClass RECTIFIER_INVERTER = eINSTANCE.getRectifierInverter();

		/**
		 * The meta object literal for the '<em><b>Min Compound Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE = eINSTANCE.getRectifierInverter_MinCompoundVoltage();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__MIN_P = eINSTANCE.getRectifierInverter_MinP();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__MAX_U = eINSTANCE.getRectifierInverter_MaxU();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__OPERATING_MODE = eINSTANCE.getRectifierInverter_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__FREQUENCY = eINSTANCE.getRectifierInverter_Frequency();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__MAX_P = eINSTANCE.getRectifierInverter_MaxP();

		/**
		 * The meta object literal for the '<em><b>Commutating Reactance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__COMMUTATING_REACTANCE = eINSTANCE.getRectifierInverter_CommutatingReactance();

		/**
		 * The meta object literal for the '<em><b>Commutating Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__COMMUTATING_RESISTANCE = eINSTANCE.getRectifierInverter_CommutatingResistance();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__RATED_U = eINSTANCE.getRectifierInverter_RatedU();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__MIN_U = eINSTANCE.getRectifierInverter_MinU();

		/**
		 * The meta object literal for the '<em><b>Bridges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__BRIDGES = eINSTANCE.getRectifierInverter_Bridges();

		/**
		 * The meta object literal for the '<em><b>Compound Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTIFIER_INVERTER__COMPOUND_RESISTANCE = eINSTANCE.getRectifierInverter_CompoundResistance();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.BreakerImpl <em>Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.BreakerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getBreaker()
		 * @generated
		 */
		EClass BREAKER = eINSTANCE.getBreaker();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKER__RATED_CURRENT = eINSTANCE.getBreaker_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>In Transit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKER__IN_TRANSIT_TIME = eINSTANCE.getBreaker_InTransitTime();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.TransformerWindingImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTransformerWinding()
		 * @generated
		 */
		EClass TRANSFORMER_WINDING = eINSTANCE.getTransformerWinding();

		/**
		 * The meta object literal for the '<em><b>G0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__G0 = eINSTANCE.getTransformerWinding_G0();

		/**
		 * The meta object literal for the '<em><b>To Winding Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__TO_WINDING_TEST = eINSTANCE.getTransformerWinding_To_WindingTest();

		/**
		 * The meta object literal for the '<em><b>Rground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__RGROUND = eINSTANCE.getTransformerWinding_Rground();

		/**
		 * The meta object literal for the '<em><b>Grounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__GROUNDED = eINSTANCE.getTransformerWinding_Grounded();

		/**
		 * The meta object literal for the '<em><b>Short Term S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__SHORT_TERM_S = eINSTANCE.getTransformerWinding_ShortTermS();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__G = eINSTANCE.getTransformerWinding_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__B = eINSTANCE.getTransformerWinding_B();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__X = eINSTANCE.getTransformerWinding_X();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__PHASE_TAP_CHANGER = eINSTANCE.getTransformerWinding_PhaseTapChanger();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__R = eINSTANCE.getTransformerWinding_R();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__R0 = eINSTANCE.getTransformerWinding_R0();

		/**
		 * The meta object literal for the '<em><b>B0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__B0 = eINSTANCE.getTransformerWinding_B0();

		/**
		 * The meta object literal for the '<em><b>Power Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__POWER_TRANSFORMER = eINSTANCE.getTransformerWinding_PowerTransformer();

		/**
		 * The meta object literal for the '<em><b>Winding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__WINDING_TYPE = eINSTANCE.getTransformerWinding_WindingType();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__X0 = eINSTANCE.getTransformerWinding_X0();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__RATED_S = eINSTANCE.getTransformerWinding_RatedS();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__RATED_U = eINSTANCE.getTransformerWinding_RatedU();

		/**
		 * The meta object literal for the '<em><b>From Winding Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__FROM_WINDING_TEST = eINSTANCE.getTransformerWinding_From_WindingTest();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__RATIO_TAP_CHANGER = eINSTANCE.getTransformerWinding_RatioTapChanger();

		/**
		 * The meta object literal for the '<em><b>Insulation U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__INSULATION_U = eINSTANCE.getTransformerWinding_InsulationU();

		/**
		 * The meta object literal for the '<em><b>Emergency S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__EMERGENCY_S = eINSTANCE.getTransformerWinding_EmergencyS();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__CONNECTION_TYPE = eINSTANCE.getTransformerWinding_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Xground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__XGROUND = eINSTANCE.getTransformerWinding_Xground();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.GroundDisconnectorImpl <em>Ground Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.GroundDisconnectorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getGroundDisconnector()
		 * @generated
		 */
		EClass GROUND_DISCONNECTOR = eINSTANCE.getGroundDisconnector();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.VoltageControlZoneImpl <em>Voltage Control Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.VoltageControlZoneImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getVoltageControlZone()
		 * @generated
		 */
		EClass VOLTAGE_CONTROL_ZONE = eINSTANCE.getVoltageControlZone();

		/**
		 * The meta object literal for the '<em><b>Regulation Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE = eINSTANCE.getVoltageControlZone_RegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Busbar Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION = eINSTANCE.getVoltageControlZone_BusbarSection();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ProtectedSwitchImpl <em>Protected Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ProtectedSwitchImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getProtectedSwitch()
		 * @generated
		 */
		EClass PROTECTED_SWITCH = eINSTANCE.getProtectedSwitch();

		/**
		 * The meta object literal for the '<em><b>Reclose Sequences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTED_SWITCH__RECLOSE_SEQUENCES = eINSTANCE.getProtectedSwitch_RecloseSequences();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl <em>Shunt Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ShuntCompensatorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getShuntCompensator()
		 * @generated
		 */
		EClass SHUNT_COMPENSATOR = eINSTANCE.getShuntCompensator();

		/**
		 * The meta object literal for the '<em><b>Normal Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__NORMAL_SECTIONS = eINSTANCE.getShuntCompensator_NormalSections();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__MIN_U = eINSTANCE.getShuntCompensator_MinU();

		/**
		 * The meta object literal for the '<em><b>B0 Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__B0_PER_SECTION = eINSTANCE.getShuntCompensator_B0PerSection();

		/**
		 * The meta object literal for the '<em><b>Nom Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__NOM_Q = eINSTANCE.getShuntCompensator_NomQ();

		/**
		 * The meta object literal for the '<em><b>Nom U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__NOM_U = eINSTANCE.getShuntCompensator_NomU();

		/**
		 * The meta object literal for the '<em><b>Maximum Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__MAXIMUM_SECTIONS = eINSTANCE.getShuntCompensator_MaximumSections();

		/**
		 * The meta object literal for the '<em><b>Switch On Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__SWITCH_ON_COUNT = eINSTANCE.getShuntCompensator_SwitchOnCount();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__MAX_U = eINSTANCE.getShuntCompensator_MaxU();

		/**
		 * The meta object literal for the '<em><b>BPer Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__BPER_SECTION = eINSTANCE.getShuntCompensator_BPerSection();

		/**
		 * The meta object literal for the '<em><b>GPer Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__GPER_SECTION = eINSTANCE.getShuntCompensator_GPerSection();

		/**
		 * The meta object literal for the '<em><b>Sv Shunt Compensator Sections</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS = eINSTANCE.getShuntCompensator_SvShuntCompensatorSections();

		/**
		 * The meta object literal for the '<em><b>Switch On Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__SWITCH_ON_DATE = eINSTANCE.getShuntCompensator_SwitchOnDate();

		/**
		 * The meta object literal for the '<em><b>AVR Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__AVR_DELAY = eINSTANCE.getShuntCompensator_AVRDelay();

		/**
		 * The meta object literal for the '<em><b>Voltage Sensitivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY = eINSTANCE.getShuntCompensator_VoltageSensitivity();

		/**
		 * The meta object literal for the '<em><b>G0 Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__G0_PER_SECTION = eINSTANCE.getShuntCompensator_G0PerSection();

		/**
		 * The meta object literal for the '<em><b>Reactive Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__REACTIVE_PER_SECTION = eINSTANCE.getShuntCompensator_ReactivePerSection();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ConductorImpl <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ConductorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getConductor()
		 * @generated
		 */
		EClass CONDUCTOR = eINSTANCE.getConductor();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__LENGTH = eINSTANCE.getConductor_Length();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.DisconnectorImpl <em>Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.DisconnectorImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getDisconnector()
		 * @generated
		 */
		EClass DISCONNECTOR = eINSTANCE.getDisconnector();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl <em>Synchronous Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.SynchronousMachineImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSynchronousMachine()
		 * @generated
		 */
		EClass SYNCHRONOUS_MACHINE = eINSTANCE.getSynchronousMachine();

		/**
		 * The meta object literal for the '<em><b>XDirect Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__XDIRECT_SYNC = eINSTANCE.getSynchronousMachine_XDirectSync();

		/**
		 * The meta object literal for the '<em><b>XQuad Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__XQUAD_TRANS = eINSTANCE.getSynchronousMachine_XQuadTrans();

		/**
		 * The meta object literal for the '<em><b>Coolant Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__COOLANT_CONDITION = eINSTANCE.getSynchronousMachine_CoolantCondition();

		/**
		 * The meta object literal for the '<em><b>Reactive Capability Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES = eINSTANCE.getSynchronousMachine_ReactiveCapabilityCurves();

		/**
		 * The meta object literal for the '<em><b>XQuad Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS = eINSTANCE.getSynchronousMachine_XQuadSubtrans();

		/**
		 * The meta object literal for the '<em><b>Coolant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__COOLANT_TYPE = eINSTANCE.getSynchronousMachine_CoolantType();

		/**
		 * The meta object literal for the '<em><b>Condenser P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__CONDENSER_P = eINSTANCE.getSynchronousMachine_CondenserP();

		/**
		 * The meta object literal for the '<em><b>AVR To Manual Lag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG = eINSTANCE.getSynchronousMachine_AVRToManualLag();

		/**
		 * The meta object literal for the '<em><b>Min Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MIN_Q = eINSTANCE.getSynchronousMachine_MinQ();

		/**
		 * The meta object literal for the '<em><b>AVR To Manual Lead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD = eINSTANCE.getSynchronousMachine_AVRToManualLead();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MAX_U = eINSTANCE.getSynchronousMachine_MaxU();

		/**
		 * The meta object literal for the '<em><b>Damping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__DAMPING = eINSTANCE.getSynchronousMachine_Damping();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__GENERATING_UNIT = eINSTANCE.getSynchronousMachine_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Max Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MAX_Q = eINSTANCE.getSynchronousMachine_MaxQ();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__R0 = eINSTANCE.getSynchronousMachine_R0();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__TYPE = eINSTANCE.getSynchronousMachine_Type();

		/**
		 * The meta object literal for the '<em><b>R2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__R2 = eINSTANCE.getSynchronousMachine_R2();

		/**
		 * The meta object literal for the '<em><b>Reference Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY = eINSTANCE.getSynchronousMachine_ReferencePriority();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__X0 = eINSTANCE.getSynchronousMachine_X0();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__X2 = eINSTANCE.getSynchronousMachine_X2();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__R = eINSTANCE.getSynchronousMachine_R();

		/**
		 * The meta object literal for the '<em><b>Initial Reactive Capability Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE = eINSTANCE.getSynchronousMachine_InitialReactiveCapabilityCurve();

		/**
		 * The meta object literal for the '<em><b>XDirect Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS = eINSTANCE.getSynchronousMachine_XDirectSubtrans();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__X = eINSTANCE.getSynchronousMachine_X();

		/**
		 * The meta object literal for the '<em><b>QPercent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__QPERCENT = eINSTANCE.getSynchronousMachine_QPercent();

		/**
		 * The meta object literal for the '<em><b>XQuad Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__XQUAD_SYNC = eINSTANCE.getSynchronousMachine_XQuadSync();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__RATED_S = eINSTANCE.getSynchronousMachine_RatedS();

		/**
		 * The meta object literal for the '<em><b>Manual To AVR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MANUAL_TO_AVR = eINSTANCE.getSynchronousMachine_ManualToAVR();

		/**
		 * The meta object literal for the '<em><b>Inertia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__INERTIA = eINSTANCE.getSynchronousMachine_Inertia();

		/**
		 * The meta object literal for the '<em><b>Hydro Pump</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__HYDRO_PUMP = eINSTANCE.getSynchronousMachine_HydroPump();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MIN_U = eINSTANCE.getSynchronousMachine_MinU();

		/**
		 * The meta object literal for the '<em><b>XDirect Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__XDIRECT_TRANS = eINSTANCE.getSynchronousMachine_XDirectTrans();

		/**
		 * The meta object literal for the '<em><b>Base Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__BASE_Q = eINSTANCE.getSynchronousMachine_BaseQ();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__OPERATING_MODE = eINSTANCE.getSynchronousMachine_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>Prime Movers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__PRIME_MOVERS = eINSTANCE.getSynchronousMachine_PrimeMovers();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.JunctionImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.RegulationScheduleImpl <em>Regulation Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.RegulationScheduleImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulationSchedule()
		 * @generated
		 */
		EClass REGULATION_SCHEDULE = eINSTANCE.getRegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Line Drop R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION_SCHEDULE__LINE_DROP_R = eINSTANCE.getRegulationSchedule_LineDropR();

		/**
		 * The meta object literal for the '<em><b>Line Drop X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION_SCHEDULE__LINE_DROP_X = eINSTANCE.getRegulationSchedule_LineDropX();

		/**
		 * The meta object literal for the '<em><b>Line Drop Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION_SCHEDULE__LINE_DROP_COMPENSATION = eINSTANCE.getRegulationSchedule_LineDropCompensation();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATION_SCHEDULE__REGULATING_CONTROL = eINSTANCE.getRegulationSchedule_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Voltage Control Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES = eINSTANCE.getRegulationSchedule_VoltageControlZones();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl <em>Reactive Capability Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getReactiveCapabilityCurve()
		 * @generated
		 */
		EClass REACTIVE_CAPABILITY_CURVE = eINSTANCE.getReactiveCapabilityCurve();

		/**
		 * The meta object literal for the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES = eINSTANCE.getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Hydrogen Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE = eINSTANCE.getReactiveCapabilityCurve_HydrogenPressure();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES = eINSTANCE.getReactiveCapabilityCurve_SynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Coolant Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE = eINSTANCE.getReactiveCapabilityCurve_CoolantTemperature();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.impl.RatioTapChangerImpl <em>Ratio Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.impl.RatioTapChangerImpl
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRatioTapChanger()
		 * @generated
		 */
		EClass RATIO_TAP_CHANGER = eINSTANCE.getRatioTapChanger();

		/**
		 * The meta object literal for the '<em><b>Ratio Variation Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE = eINSTANCE.getRatioTapChanger_RatioVariationCurve();

		/**
		 * The meta object literal for the '<em><b>Transformer Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_TAP_CHANGER__TRANSFORMER_WINDING = eINSTANCE.getRatioTapChanger_TransformerWinding();

		/**
		 * The meta object literal for the '<em><b>Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_TAP_CHANGER__WINDING = eINSTANCE.getRatioTapChanger_Winding();

		/**
		 * The meta object literal for the '<em><b>Tcul Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIO_TAP_CHANGER__TCUL_CONTROL_MODE = eINSTANCE.getRatioTapChanger_TculControlMode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.SVCControlMode <em>SVC Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.SVCControlMode
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSVCControlMode()
		 * @generated
		 */
		EEnum SVC_CONTROL_MODE = eINSTANCE.getSVCControlMode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.PhaseTapChangerKind <em>Phase Tap Changer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.PhaseTapChangerKind
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getPhaseTapChangerKind()
		 * @generated
		 */
		EEnum PHASE_TAP_CHANGER_KIND = eINSTANCE.getPhaseTapChangerKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.WindingType <em>Winding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.WindingType
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getWindingType()
		 * @generated
		 */
		EEnum WINDING_TYPE = eINSTANCE.getWindingType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.SynchronousMachineType
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSynchronousMachineType()
		 * @generated
		 */
		EEnum SYNCHRONOUS_MACHINE_TYPE = eINSTANCE.getSynchronousMachineType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.CoolantType <em>Coolant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.CoolantType
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getCoolantType()
		 * @generated
		 */
		EEnum COOLANT_TYPE = eINSTANCE.getCoolantType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.TransformerControlMode
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTransformerControlMode()
		 * @generated
		 */
		EEnum TRANSFORMER_CONTROL_MODE = eINSTANCE.getTransformerControlMode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.SynchronousMachineOperatingMode
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getSynchronousMachineOperatingMode()
		 * @generated
		 */
		EEnum SYNCHRONOUS_MACHINE_OPERATING_MODE = eINSTANCE.getSynchronousMachineOperatingMode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.WindingConnection <em>Winding Connection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.WindingConnection
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getWindingConnection()
		 * @generated
		 */
		EEnum WINDING_CONNECTION = eINSTANCE.getWindingConnection();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.TapChangerKind <em>Tap Changer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.TapChangerKind
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getTapChangerKind()
		 * @generated
		 */
		EEnum TAP_CHANGER_KIND = eINSTANCE.getTapChangerKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Wires.RegulatingControlModeKind <em>Regulating Control Mode Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Wires.RegulatingControlModeKind
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getRegulatingControlModeKind()
		 * @generated
		 */
		EEnum REGULATING_CONTROL_MODE_KIND = eINSTANCE.getRegulatingControlModeKind();

		/**
		 * The meta object literal for the '<em>Operating Mode</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getOperatingMode()
		 * @generated
		 */
		EDataType OPERATING_MODE = eINSTANCE.getOperatingMode();

		/**
		 * The meta object literal for the '<em>Composite Switch Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CIM.IEC61970.Wires.impl.WiresPackageImpl#getCompositeSwitchType()
		 * @generated
		 */
		EDataType COMPOSITE_SWITCH_TYPE = eINSTANCE.getCompositeSwitchType();

	}

} //WiresPackage
