/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.CorePackage;

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
 * @see CIM.IEC61970.Generation.Production.ProductionFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The production package is responsible for classes which describe various kinds of generators. These classes also provide production costing information which is used to economically allocate demand among committed units and calculate reserve quantities.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The production package is responsible for classes which describe various kinds of generators. These classes also provide production costing information which is used to economically allocate demand among committed units and calculate reserve quantities.'"
 * @generated
 */
public interface ProductionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Production";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Production";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimProduction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductionPackage eINSTANCE = CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratingUnit()
	 * @generated
	 */
	int GENERATING_UNIT = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__HIGH_CONTROL_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operated By Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RAISE_RAMP_RATE = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_OPERATING_MODE = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_PULSE_LOW = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GOVERNOR_MPL = CorePackage.EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_GROSS_MAX_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ALLOC_SPIN_RES_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = CorePackage.EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__STEP_CHANGE = CorePackage.EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__STARTUP_COST = CorePackage.EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SPIN_RESERVE_RAMP = CorePackage.EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NOMINAL_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GOVERNOR_SCD = CorePackage.EQUIPMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PENALTY_FACTOR = CorePackage.EQUIPMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_PULSE_HIGH = CorePackage.EQUIPMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ENERGY_MIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__STARTUP_TIME = CorePackage.EQUIPMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__TIE_LINE_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LOWER_RAMP_RATE = CorePackage.EQUIPMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__INITIAL_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_RESPONSE_RATE = CorePackage.EQUIPMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MIN_ECONOMIC_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MODEL_DETAIL = CorePackage.EQUIPMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__FUEL_PRIORITY = CorePackage.EQUIPMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = CorePackage.EQUIPMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = CorePackage.EQUIPMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MAX_ECONOMIC_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_CONTROL_SOURCE = CorePackage.EQUIPMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_GROSS_MIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__VARIABLE_COST = CorePackage.EQUIPMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MIN_OPERATING_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__BASE_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SHORT_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SYNCHRONOUS_MACHINES = CorePackage.EQUIPMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LOW_CONTROL_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LONG_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Registered Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__REGISTERED_GENERATOR = CorePackage.EQUIPMENT_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SUB_CONTROL_AREA = CorePackage.EQUIPMENT_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MAX_OPERATING_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__FAST_START_FLAG = CorePackage.EQUIPMENT_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_CONTROL_MODE = CorePackage.EQUIPMENT_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_NET_MAX_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__EFFICIENCY = CorePackage.EQUIPMENT_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MINIMUM_OFF_TIME = CorePackage.EQUIPMENT_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__DISP_RESERVE_FLAG = CorePackage.EQUIPMENT_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = CorePackage.EQUIPMENT_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_DEADBAND = CorePackage.EQUIPMENT_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NORMAL_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 50;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 51;

	/**
	 * The number of operations of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl <em>Hydro Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroGeneratingUnit()
	 * @generated
	 */
	int HYDRO_GENERATING_UNIT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__DESCRIPTION = GENERATING_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PATH_NAME = GENERATING_UNIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__LOCAL_NAME = GENERATING_UNIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CIRCUIT_SECTIONS = GENERATING_UNIT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__OPERATIONAL_LIMIT_SET = GENERATING_UNIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NORMA_ILY_IN_SERVICE = GENERATING_UNIT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Operated By Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER = GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Registered Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__REGISTERED_GENERATOR = GENERATING_UNIT__REGISTERED_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SUB_CONTROL_AREA = GENERATING_UNIT__SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Energy Conversion Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tailbay Loss Curve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE = GENERATING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hydro Power Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT = GENERATING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES = GENERATING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hydro Unit Water Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST = GENERATING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Penstock Loss Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE = GENERATING_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hydro Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hydro Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HeatRateCurveImpl <em>Heat Rate Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HeatRateCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHeatRateCurve()
	 * @generated
	 */
	int HEAT_RATE_CURVE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RATE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.StartIgnFuelCurveImpl <em>Start Ign Fuel Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.StartIgnFuelCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartIgnFuelCurve()
	 * @generated
	 */
	int START_IGN_FUEL_CURVE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Ignition Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE__STARTUP_MODEL = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Ign Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Ign Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_IGN_FUEL_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl <em>Cogeneration Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCogenerationPlant()
	 * @generated
	 */
	int COGENERATION_PLANT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Cogen LP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__COGEN_LP_STEAM_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cogen HP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__COGEN_HP_STEAM_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steam Sendout Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cogen HP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__THERMAL_GENERATING_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cogen LP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT__RATED_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cogeneration Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cogeneration Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGENERATION_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.CAESPlantImpl <em>CAES Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.CAESPlantImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCAESPlant()
	 * @generated
	 */
	int CAES_PLANT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Energy Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__ENERGY_STORAGE_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rated Capacity P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__RATED_CAPACITY_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__THERMAL_GENERATING_UNIT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Air Compressor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT__AIR_COMPRESSOR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CAES Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CAES Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAES_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl <em>Thermal Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getThermalGeneratingUnit()
	 * @generated
	 */
	int THERMAL_GENERATING_UNIT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__DESCRIPTION = GENERATING_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__PATH_NAME = GENERATING_UNIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__LOCAL_NAME = GENERATING_UNIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CIRCUIT_SECTIONS = GENERATING_UNIT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__OPERATIONAL_LIMIT_SET = GENERATING_UNIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NORMA_ILY_IN_SERVICE = GENERATING_UNIT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Operated By Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER = GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Registered Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__REGISTERED_GENERATOR = GENERATING_UNIT__REGISTERED_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SUB_CONTROL_AREA = GENERATING_UNIT__SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Combined Cycle Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CAES Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CAES_PLANT = GENERATING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emission Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__EMISSION_CURVES = GENERATING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heat Input Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE = GENERATING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shutdown Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE = GENERATING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Heat Rate Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE = GENERATING_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Incremental Heat Rate Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE = GENERATING_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>OM Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__OM_COST = GENERATING_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cogeneration Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__COGENERATION_PLANT = GENERATING_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fossil Fuels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__FOSSIL_FUELS = GENERATING_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__STARTUP_MODEL = GENERATING_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES = GENERATING_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Emmission Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS = GENERATING_UNIT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Thermal Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Thermal Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.WindGeneratingUnitImpl <em>Wind Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.WindGeneratingUnitImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getWindGeneratingUnit()
	 * @generated
	 */
	int WIND_GENERATING_UNIT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__DESCRIPTION = GENERATING_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__PATH_NAME = GENERATING_UNIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__LOCAL_NAME = GENERATING_UNIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CIRCUIT_SECTIONS = GENERATING_UNIT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__OPERATIONAL_LIMIT_SET = GENERATING_UNIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__NORMA_ILY_IN_SERVICE = GENERATING_UNIT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Operated By Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER = GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Registered Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__REGISTERED_GENERATOR = GENERATING_UNIT__REGISTERED_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__SUB_CONTROL_AREA = GENERATING_UNIT__SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The number of structural features of the '<em>Wind Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wind Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.TailbayLossCurveImpl <em>Tailbay Loss Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.TailbayLossCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getTailbayLossCurve()
	 * @generated
	 */
	int TAILBAY_LOSS_CURVE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tailbay Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tailbay Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILBAY_LOSS_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.StartRampCurveImpl <em>Start Ramp Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.StartRampCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartRampCurve()
	 * @generated
	 */
	int START_RAMP_CURVE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__STARTUP_MODEL = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hot Standby Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE__HOT_STANDBY_RAMP = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Ramp Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Ramp Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_RAMP_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.StartupModelImpl <em>Startup Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.StartupModelImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartupModel()
	 * @generated
	 */
	int STARTUP_MODEL = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Start Ign Fuel Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__START_IGN_FUEL_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__FIXED_MAINT_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Risk Factor Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__RISK_FACTOR_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stby Aux P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__STBY_AUX_P = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Startup Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__STARTUP_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Ramp Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__START_RAMP_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum Down Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__MINIMUM_DOWN_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Minimum Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__MINIMUM_RUN_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Start Main Fuel Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__START_MAIN_FUEL_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Startup Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__STARTUP_PRIORITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__STARTUP_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hot Standby Heat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__HOT_STANDBY_HEAT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__THERMAL_GENERATING_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Incremental Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL__INCREMENTAL_MAINT_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Startup Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Startup Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_MODEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.CombinedCyclePlantImpl <em>Combined Cycle Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.CombinedCyclePlantImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCombinedCyclePlant()
	 * @generated
	 */
	int COMBINED_CYCLE_PLANT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Comb Cycle Plant Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combined Cycle Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combined Cycle Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CYCLE_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl <em>Hydro Pump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HydroPumpImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPump()
	 * @generated
	 */
	int HYDRO_PUMP = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Hydro Power Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__HYDRO_POWER_PLANT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronous Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__SYNCHRONOUS_MACHINE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pump Disch At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pump Power At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pump Power At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hydro Pump Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pump Disch At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hydro Pump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hydro Pump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.PenstockLossCurveImpl <em>Penstock Loss Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.PenstockLossCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getPenstockLossCurve()
	 * @generated
	 */
	int PENSTOCK_LOSS_CURVE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Penstock Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Penstock Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSTOCK_LOSS_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.ShutdownCurveImpl <em>Shutdown Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.ShutdownCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getShutdownCurve()
	 * @generated
	 */
	int SHUTDOWN_CURVE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Shutdown Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__SHUTDOWN_COST = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shutdown Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE__SHUTDOWN_DATE = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shutdown Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shutdown Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUTDOWN_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.IncrementalHeatRateCurveImpl <em>Incremental Heat Rate Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.IncrementalHeatRateCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getIncrementalHeatRateCurve()
	 * @generated
	 */
	int INCREMENTAL_HEAT_RATE_CURVE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incremental Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incremental Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTAL_HEAT_RATE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.GenUnitOpScheduleImpl <em>Gen Unit Op Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.GenUnitOpScheduleImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGenUnitOpSchedule()
	 * @generated
	 */
	int GEN_UNIT_OP_SCHEDULE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Unit Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gen Unit Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl <em>Target Level Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getTargetLevelSchedule()
	 * @generated
	 */
	int TARGET_LEVEL_SCHEDULE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__RESERVOIR = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Low Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Level Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Target Level Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LEVEL_SCHEDULE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl <em>Emission Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionCurve()
	 * @generated
	 */
	int EMISSION_CURVE = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Emission Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__EMISSION_CONTENT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Emission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE__EMISSION_TYPE = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Emission Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Emission Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.GenUnitOpCostCurveImpl <em>Gen Unit Op Cost Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.GenUnitOpCostCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGenUnitOpCostCurve()
	 * @generated
	 */
	int GEN_UNIT_OP_COST_CURVE = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Unit Op Cost Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gen Unit Op Cost Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_OP_COST_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.FossilFuelImpl <em>Fossil Fuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.FossilFuelImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getFossilFuel()
	 * @generated
	 */
	int FOSSIL_FUEL = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Fuel Eff Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_EFF_FACTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fossil Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FOSSIL_FUEL_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fuel Mixture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_MIXTURE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fuel Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Low Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__LOW_BREAKPOINT_P = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fuel Handling Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_HANDLING_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fuel Sulfur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_SULFUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__THERMAL_GENERATING_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fuel Heat Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_HEAT_CONTENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>High Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__HIGH_BREAKPOINT_P = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fuel Dispatch Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL__FUEL_DISPATCH_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Fossil Fuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Fossil Fuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_FUEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.InflowForecastImpl <em>Inflow Forecast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.InflowForecastImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getInflowForecast()
	 * @generated
	 */
	int INFLOW_FORECAST = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST__RESERVOIR = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inflow Forecast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inflow Forecast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLOW_FORECAST_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl <em>Hydro Power Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPowerPlant()
	 * @generated
	 */
	int HYDRO_POWER_PLANT = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Gen Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__GEN_RATED_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hydro Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Surge Tank Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Discharge Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pump Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PUMP_RATED_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Penstock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PENSTOCK_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hydro Plant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Hydro Pumps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__HYDRO_PUMPS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Plant Rated Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PLANT_RATED_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__RESERVOIR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Surge Tank Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__SURGE_TANK_CODE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Plant Discharge Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Hydro Power Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Hydro Power Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_POWER_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.StartMainFuelCurveImpl <em>Start Main Fuel Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.StartMainFuelCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartMainFuelCurve()
	 * @generated
	 */
	int START_MAIN_FUEL_CURVE = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Main Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE__STARTUP_MODEL = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Main Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Main Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_MAIN_FUEL_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.LevelVsVolumeCurveImpl <em>Level Vs Volume Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.LevelVsVolumeCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getLevelVsVolumeCurve()
	 * @generated
	 */
	int LEVEL_VS_VOLUME_CURVE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE__RESERVOIR = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level Vs Volume Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Level Vs Volume Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_VS_VOLUME_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl <em>Heat Input Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHeatInputCurve()
	 * @generated
	 */
	int HEAT_INPUT_CURVE = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Heat Input Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Heat Input Eff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__HEAT_INPUT_EFF = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aux Power Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__AUX_POWER_MULT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aux Power Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__AUX_POWER_OFFSET = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Heat Input Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Heat Input Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_INPUT_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HydroPumpOpScheduleImpl <em>Hydro Pump Op Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HydroPumpOpScheduleImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPumpOpSchedule()
	 * @generated
	 */
	int HYDRO_PUMP_OP_SCHEDULE = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Hydro Pump</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hydro Pump Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hydro Pump Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_PUMP_OP_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.SteamSendoutScheduleImpl <em>Steam Sendout Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.SteamSendoutScheduleImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getSteamSendoutSchedule()
	 * @generated
	 */
	int STEAM_SENDOUT_SCHEDULE = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Cogeneration Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Steam Sendout Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Steam Sendout Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SENDOUT_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.FuelAllocationScheduleImpl <em>Fuel Allocation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.FuelAllocationScheduleImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getFuelAllocationSchedule()
	 * @generated
	 */
	int FUEL_ALLOCATION_SCHEDULE = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fuel Allocation Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fossil Fuel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION = CorePackage.CURVE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fuel Allocation End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE = CorePackage.CURVE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fuel Allocation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Fuel Allocation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_ALLOCATION_SCHEDULE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.ReservoirImpl <em>Reservoir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.ReservoirImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getReservoir()
	 * @generated
	 */
	int RESERVOIR = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Active Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__ACTIVE_STORAGE_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Spills Into Reservoirs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILLS_INTO_RESERVOIRS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spills From Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILLS_FROM_RESERVOIR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level Vs Volume Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__LEVEL_VS_VOLUME_CURVES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inflow Forecasts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__INFLOW_FORECASTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Spill Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILL_TRAVEL_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>River Outlet Works</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__RIVER_OUTLET_WORKS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Normal Min Operate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__NORMAL_MIN_OPERATE_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Spillway Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILLWAY_CREST_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Full Supply Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__FULL_SUPPLY_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Spillway Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILLWAY_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Level Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__TARGET_LEVEL_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Spill Way Gate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILL_WAY_GATE_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Spillway Crest Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__SPILLWAY_CREST_LENGTH = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Energy Storage Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__ENERGY_STORAGE_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Gross Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__GROSS_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Hydro Power Plants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__HYDRO_POWER_PLANTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Reservoir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Reservoir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingEfficiencyCurveImpl <em>Hydro Generating Efficiency Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.HydroGeneratingEfficiencyCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroGeneratingEfficiencyCurve()
	 * @generated
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hydro Generating Efficiency Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hydro Generating Efficiency Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_EFFICIENCY_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.NuclearGeneratingUnitImpl <em>Nuclear Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.NuclearGeneratingUnitImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getNuclearGeneratingUnit()
	 * @generated
	 */
	int NUCLEAR_GENERATING_UNIT = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__DESCRIPTION = GENERATING_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__PATH_NAME = GENERATING_UNIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__LOCAL_NAME = GENERATING_UNIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CIRCUIT_SECTIONS = GENERATING_UNIT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__OPERATIONAL_LIMIT_SET = GENERATING_UNIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__NORMA_ILY_IN_SERVICE = GENERATING_UNIT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Operated By Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER = GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Registered Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__REGISTERED_GENERATOR = GENERATING_UNIT__REGISTERED_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__SUB_CONTROL_AREA = GENERATING_UNIT__SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The number of structural features of the '<em>Nuclear Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nuclear Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUCLEAR_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.AirCompressorImpl <em>Air Compressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.AirCompressorImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getAirCompressor()
	 * @generated
	 */
	int AIR_COMPRESSOR = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Combustion Turbine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__COMBUSTION_TURBINE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CAES Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__CAES_PLANT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Air Compressor Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR__AIR_COMPRESSOR_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Air Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Air Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_COMPRESSOR_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl <em>Emission Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionAccount()
	 * @generated
	 */
	int EMISSION_ACCOUNT = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Emission Value Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT__EMISSION_TYPE = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emission Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Emission Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMISSION_ACCOUNT_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.impl.GrossToNetActivePowerCurveImpl <em>Gross To Net Active Power Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.GrossToNetActivePowerCurveImpl
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGrossToNetActivePowerCurve()
	 * @generated
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gross To Net Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gross To Net Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.FuelType <em>Fuel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.FuelType
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getFuelType()
	 * @generated
	 */
	int FUEL_TYPE = 35;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.PenstockType <em>Penstock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.PenstockType
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getPenstockType()
	 * @generated
	 */
	int PENSTOCK_TYPE = 36;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.GeneratorControlSource
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratorControlSource()
	 * @generated
	 */
	int GENERATOR_CONTROL_SOURCE = 37;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.EmissionValueSource <em>Emission Value Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.EmissionValueSource
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionValueSource()
	 * @generated
	 */
	int EMISSION_VALUE_SOURCE = 38;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.GeneratorOperatingMode <em>Generator Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratorOperatingMode()
	 * @generated
	 */
	int GENERATOR_OPERATING_MODE = 39;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.SpillwayGateType <em>Spillway Gate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.SpillwayGateType
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getSpillwayGateType()
	 * @generated
	 */
	int SPILLWAY_GATE_TYPE = 40;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.GeneratorControlMode <em>Generator Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.GeneratorControlMode
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratorControlMode()
	 * @generated
	 */
	int GENERATOR_CONTROL_MODE = 41;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.HydroPlantType <em>Hydro Plant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.HydroPlantType
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPlantType()
	 * @generated
	 */
	int HYDRO_PLANT_TYPE = 42;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.EmissionType <em>Emission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.EmissionType
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionType()
	 * @generated
	 */
	int EMISSION_TYPE = 43;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.HydroEnergyConversionKind <em>Hydro Energy Conversion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroEnergyConversionKind()
	 * @generated
	 */
	int HYDRO_ENERGY_CONVERSION_KIND = 44;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Generation.Production.SurgeTankCode <em>Surge Tank Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.SurgeTankCode
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getSurgeTankCode()
	 * @generated
	 */
	int SURGE_TANK_CODE = 45;

	/**
	 * The meta object id for the '<em>Heat Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHeatRate()
	 * @generated
	 */
	int HEAT_RATE = 46;

	/**
	 * The meta object id for the '<em>Classification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 47;

	/**
	 * The meta object id for the '<em>Emission</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmission()
	 * @generated
	 */
	int EMISSION = 48;

	/**
	 * The meta object id for the '<em>Cost Per Heat Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCostPerHeatUnit()
	 * @generated
	 */
	int COST_PER_HEAT_UNIT = 49;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit
	 * @generated
	 */
	EClass getHydroGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Conversion Capability</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	EAttribute getHydroGeneratingUnit_EnergyConversionCapability();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tailbay Loss Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	EReference getHydroGeneratingUnit_TailbayLossCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Power Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	EReference getHydroGeneratingUnit_HydroPowerPlant();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Generating Efficiency Curves</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	EReference getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hydro Unit Water Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	EAttribute getHydroGeneratingUnit_HydroUnitWaterCost();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Penstock Loss Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	EReference getHydroGeneratingUnit_PenstockLossCurve();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HeatRateCurve <em>Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heat Rate Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatRateCurve
	 * @generated
	 */
	EClass getHeatRateCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit()
	 * @see #getHeatRateCurve()
	 * @generated
	 */
	EReference getHeatRateCurve_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatRateCurve#isIsNetGrossP()
	 * @see #getHeatRateCurve()
	 * @generated
	 */
	EAttribute getHeatRateCurve_IsNetGrossP();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Ign Fuel Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartIgnFuelCurve
	 * @generated
	 */
	EClass getStartIgnFuelCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignition Fuel Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType()
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 */
	EAttribute getStartIgnFuelCurve_IgnitionFuelType();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel()
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 */
	EReference getStartIgnFuelCurve_StartupModel();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.CogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cogeneration Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant
	 * @generated
	 */
	EClass getCogenerationPlant();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen LP Steam Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EAttribute getCogenerationPlant_CogenLPSteamRating();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen HP Steam Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EAttribute getCogenerationPlant_CogenHPSteamRating();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Steam Sendout Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EReference getCogenerationPlant_SteamSendoutSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen HP Sendout Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EAttribute getCogenerationPlant_CogenHPSendoutRating();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thermal Generating Units</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EReference getCogenerationPlant_ThermalGeneratingUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen LP Sendout Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EAttribute getCogenerationPlant_CogenLPSendoutRating();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated P</em>'.
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getRatedP()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	EAttribute getCogenerationPlant_RatedP();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.CAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAES Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.CAESPlant
	 * @generated
	 */
	EClass getCAESPlant();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Storage Capacity</em>'.
	 * @see CIM.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity()
	 * @see #getCAESPlant()
	 * @generated
	 */
	EAttribute getCAESPlant_EnergyStorageCapacity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Capacity P</em>'.
	 * @see CIM.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP()
	 * @see #getCAESPlant()
	 * @generated
	 */
	EAttribute getCAESPlant_RatedCapacityP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit()
	 * @see #getCAESPlant()
	 * @generated
	 */
	EReference getCAESPlant_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Air Compressor</em>'.
	 * @see CIM.IEC61970.Generation.Production.CAESPlant#getAirCompressor()
	 * @see #getCAESPlant()
	 * @generated
	 */
	EReference getCAESPlant_AirCompressor();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit
	 * @generated
	 */
	EClass getThermalGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combined Cycle Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_CombinedCyclePlant();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CAES Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_CAESPlant();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emission Curves</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_EmissionCurves();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heat Input Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_HeatInputCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shutdown Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_ShutdownCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heat Rate Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_HeatRateCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incremental Heat Rate Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_IncrementalHeatRateCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OM Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EAttribute getThermalGeneratingUnit_OMCost();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cogeneration Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_CogenerationPlant();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fossil Fuels</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_FossilFuels();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_StartupModel();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuel Allocation Schedules</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_FuelAllocationSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emmission Accounts</em>'.
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	EReference getThermalGeneratingUnit_EmmissionAccounts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.WindGeneratingUnit <em>Wind Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wind Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.WindGeneratingUnit
	 * @generated
	 */
	EClass getWindGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.TailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tailbay Loss Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.TailbayLossCurve
	 * @generated
	 */
	EClass getTailbayLossCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit()
	 * @see #getTailbayLossCurve()
	 * @generated
	 */
	EReference getTailbayLossCurve_HydroGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.StartRampCurve <em>Start Ramp Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Ramp Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartRampCurve
	 * @generated
	 */
	EClass getStartRampCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartRampCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartRampCurve#getStartupModel()
	 * @see #getStartRampCurve()
	 * @generated
	 */
	EReference getStartRampCurve_StartupModel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Standby Ramp</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartRampCurve#getHotStandbyRamp()
	 * @see #getStartRampCurve()
	 * @generated
	 */
	EAttribute getStartRampCurve_HotStandbyRamp();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.StartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startup Model</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel
	 * @generated
	 */
	EClass getStartupModel();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Ign Fuel Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve()
	 * @see #getStartupModel()
	 * @generated
	 */
	EReference getStartupModel_StartIgnFuelCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Maint Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getFixedMaintCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_FixedMaintCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Factor Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getRiskFactorCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_RiskFactorCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stby Aux P</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStbyAuxP()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_StbyAuxP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Date</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartupDate()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_StartupDate();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Ramp Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartRampCurve()
	 * @see #getStartupModel()
	 * @generated
	 */
	EReference getStartupModel_StartRampCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Down Time</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getMinimumDownTime()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_MinimumDownTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Run Time</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getMinimumRunTime()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_MinimumRunTime();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Main Fuel Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve()
	 * @see #getStartupModel()
	 * @generated
	 */
	EReference getStartupModel_StartMainFuelCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Priority</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartupPriority()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_StartupPriority();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartupCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_StartupCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Standby Heat</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_HotStandbyHeat();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit()
	 * @see #getStartupModel()
	 * @generated
	 */
	EReference getStartupModel_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incremental Maint Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	EAttribute getStartupModel_IncrementalMaintCost();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Cycle Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.CombinedCyclePlant
	 * @generated
	 */
	EClass getCombinedCyclePlant();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comb Cycle Plant Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating()
	 * @see #getCombinedCyclePlant()
	 * @generated
	 */
	EAttribute getCombinedCyclePlant_CombCyclePlantRating();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thermal Generating Units</em>'.
	 * @see CIM.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits()
	 * @see #getCombinedCyclePlant()
	 * @generated
	 */
	EReference getCombinedCyclePlant_ThermalGeneratingUnits();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Pump</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump
	 * @generated
	 */
	EClass getHydroPump();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Power Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant()
	 * @see #getHydroPump()
	 * @generated
	 */
	EReference getHydroPump_HydroPowerPlant();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronous Machine</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getSynchronousMachine()
	 * @see #getHydroPump()
	 * @generated
	 */
	EReference getHydroPump_SynchronousMachine();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Disch At Min Head</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	EAttribute getHydroPump_PumpDischAtMinHead();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Power At Min Head</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	EAttribute getHydroPump_PumpPowerAtMinHead();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Power At Max Head</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	EAttribute getHydroPump_PumpPowerAtMaxHead();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Pump Op Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule()
	 * @see #getHydroPump()
	 * @generated
	 */
	EReference getHydroPump_HydroPumpOpSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Disch At Max Head</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	EAttribute getHydroPump_PumpDischAtMaxHead();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.PenstockLossCurve <em>Penstock Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Penstock Loss Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.PenstockLossCurve
	 * @generated
	 */
	EClass getPenstockLossCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit()
	 * @see #getPenstockLossCurve()
	 * @generated
	 */
	EReference getPenstockLossCurve_HydroGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.ShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shutdown Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.ShutdownCurve
	 * @generated
	 */
	EClass getShutdownCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shutdown Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost()
	 * @see #getShutdownCurve()
	 * @generated
	 */
	EAttribute getShutdownCurve_ShutdownCost();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit()
	 * @see #getShutdownCurve()
	 * @generated
	 */
	EReference getShutdownCurve_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shutdown Date</em>'.
	 * @see CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate()
	 * @see #getShutdownCurve()
	 * @generated
	 */
	EAttribute getShutdownCurve_ShutdownDate();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incremental Heat Rate Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve
	 * @generated
	 */
	EClass getIncrementalHeatRateCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#isIsNetGrossP()
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 */
	EAttribute getIncrementalHeatRateCurve_IsNetGrossP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit()
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 */
	EReference getIncrementalHeatRateCurve_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.GenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Op Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.GenUnitOpSchedule
	 * @generated
	 */
	EClass getGenUnitOpSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit()
	 * @see #getGenUnitOpSchedule()
	 * @generated
	 */
	EReference getGenUnitOpSchedule_GeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Level Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.TargetLevelSchedule
	 * @generated
	 */
	EClass getTargetLevelSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir()
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	EReference getTargetLevelSchedule_Reservoir();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Level Limit</em>'.
	 * @see CIM.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit()
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	EAttribute getTargetLevelSchedule_HighLevelLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Level Limit</em>'.
	 * @see CIM.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit()
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	EAttribute getTargetLevelSchedule_LowLevelLimit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.EmissionCurve <em>Emission Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emission Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionCurve
	 * @generated
	 */
	EClass getEmissionCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Content</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionContent()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	EAttribute getEmissionCurve_EmissionContent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	EAttribute getEmissionCurve_IsNetGrossP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	EReference getEmissionCurve_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionType()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	EAttribute getEmissionCurve_EmissionType();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.GenUnitOpCostCurve <em>Gen Unit Op Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Op Cost Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.GenUnitOpCostCurve
	 * @generated
	 */
	EClass getGenUnitOpCostCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#isIsNetGrossP()
	 * @see #getGenUnitOpCostCurve()
	 * @generated
	 */
	EAttribute getGenUnitOpCostCurve_IsNetGrossP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit()
	 * @see #getGenUnitOpCostCurve()
	 * @generated
	 */
	EReference getGenUnitOpCostCurve_GeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.FossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fossil Fuel</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel
	 * @generated
	 */
	EClass getFossilFuel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Eff Factor</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelEffFactor();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fossil Fuel Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFossilFuelType()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FossilFuelType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Mixture</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelMixture()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelMixture();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelCost()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Breakpoint P</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_LowBreakpointP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Handling Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelHandlingCost();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuel Allocation Schedules</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EReference getFossilFuel_FuelAllocationSchedules();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Sulfur</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelSulfur()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelSulfur();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EReference getFossilFuel_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Heat Content</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelHeatContent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Breakpoint P</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_HighBreakpointP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Dispatch Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost()
	 * @see #getFossilFuel()
	 * @generated
	 */
	EAttribute getFossilFuel_FuelDispatchCost();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.InflowForecast <em>Inflow Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inflow Forecast</em>'.
	 * @see CIM.IEC61970.Generation.Production.InflowForecast
	 * @generated
	 */
	EClass getInflowForecast();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.InflowForecast#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.InflowForecast#getReservoir()
	 * @see #getInflowForecast()
	 * @generated
	 */
	EReference getInflowForecast_Reservoir();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Power Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant
	 * @generated
	 */
	EClass getHydroPowerPlant();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Rated P</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_GenRatedP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Source Pump Discharge Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EReference getHydroPowerPlant_GenSourcePumpDischargeReservoir();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Generating Units</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EReference getHydroPowerPlant_HydroGeneratingUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surge Tank Crest Level</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_SurgeTankCrestLevel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discharge Travel Delay</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_DischargeTravelDelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Rated P</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_PumpRatedP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penstock Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_PenstockType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hydro Plant Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_HydroPlantType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Pumps</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EReference getHydroPowerPlant_HydroPumps();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Rated Head</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_PlantRatedHead();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getReservoir()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EReference getHydroPowerPlant_Reservoir();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surge Tank Code</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_SurgeTankCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Discharge Capacity</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	EAttribute getHydroPowerPlant_PlantDischargeCapacity();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.StartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Main Fuel Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartMainFuelCurve
	 * @generated
	 */
	EClass getStartMainFuelCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Fuel Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType()
	 * @see #getStartMainFuelCurve()
	 * @generated
	 */
	EAttribute getStartMainFuelCurve_MainFuelType();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel()
	 * @see #getStartMainFuelCurve()
	 * @generated
	 */
	EReference getStartMainFuelCurve_StartupModel();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.LevelVsVolumeCurve <em>Level Vs Volume Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Vs Volume Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.LevelVsVolumeCurve
	 * @generated
	 */
	EClass getLevelVsVolumeCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir()
	 * @see #getLevelVsVolumeCurve()
	 * @generated
	 */
	EReference getLevelVsVolumeCurve_Reservoir();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heat Input Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve
	 * @generated
	 */
	EClass getHeatInputCurve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heat Input Offset</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	EAttribute getHeatInputCurve_HeatInputOffset();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	EAttribute getHeatInputCurve_IsNetGrossP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heat Input Eff</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	EAttribute getHeatInputCurve_HeatInputEff();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Mult</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	EAttribute getHeatInputCurve_AuxPowerMult();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Offset</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	EAttribute getHeatInputCurve_AuxPowerOffset();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	EReference getHeatInputCurve_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Pump Op Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPumpOpSchedule
	 * @generated
	 */
	EClass getHydroPumpOpSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Pump</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump()
	 * @see #getHydroPumpOpSchedule()
	 * @generated
	 */
	EReference getHydroPumpOpSchedule_HydroPump();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.SteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steam Sendout Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.SteamSendoutSchedule
	 * @generated
	 */
	EClass getSteamSendoutSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cogeneration Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant()
	 * @see #getSteamSendoutSchedule()
	 * @generated
	 */
	EReference getSteamSendoutSchedule_CogenerationPlant();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.GeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit
	 * @generated
	 */
	EClass getGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Control Limit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_HighControlLimit();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getOperatedBy_GenerationProvider <em>Operated By Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operated By Generation Provider</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getOperatedBy_GenerationProvider()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_OperatedBy_GenerationProvider();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raise Ramp Rate</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RaiseRampRate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Operating Mode</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GenOperatingMode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Cntrl Margin P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_AutoCntrlMarginP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Pulse Low</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ControlPulseLow();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Governor MPL</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GovernorMPL();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Max P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedGrossMaxP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alloc Spin Res P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_AllocSpinResP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Unit Op Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_GenUnitOpSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Change</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getStepChange()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_StepChange();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupCost()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_StartupCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spin Reserve Ramp</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_SpinReserveRamp();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getNominalP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_NominalP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Governor SCD</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GovernorSCD();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Factor</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_PenaltyFactor();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Pulse High</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ControlPulseHigh();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Min P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_EnergyMinP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Time</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupTime()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_StartupTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tie Line PF</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_TieLinePF();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Ramp Rate</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_LowerRampRate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getInitialP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_InitialP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Response Rate</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ControlResponseRate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Economic P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MinEconomicP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Detail</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getModelDetail()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ModelDetail();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Priority</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_FuelPriority();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gross To Net Active Power Curves</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_GrossToNetActivePowerCurves();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Unit Op Cost Curves</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_GenUnitOpCostCurves();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Economic P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MaxEconomicP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Control Source</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GenControlSource();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Min P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedGrossMinP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Cost</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getVariableCost()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_VariableCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Operating P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MinOperatingP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getBaseP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_BaseP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short PF</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getShortPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ShortPF();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronous Machines</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_SynchronousMachines();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Control Limit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_LowControlLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long PF</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getLongPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_LongPF();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getRegisteredGenerator <em>Registered Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registered Generator</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getRegisteredGenerator()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_RegisteredGenerator();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getSubControlArea <em>Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Control Area</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getSubControlArea()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_SubControlArea();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Operating P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MaxOperatingP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fast Start Flag</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_FastStartFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Control Mode</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GenControlMode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Net Max P</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedNetMaxP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Efficiency</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getEfficiency()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_Efficiency();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Off Time</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MinimumOffTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disp Reserve Flag</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_DispReserveFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Allowable Spinning Reserve</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MaximumAllowableSpinningReserve();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Deadband</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ControlDeadband();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal PF</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getNormalPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_NormalPF();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule <em>Fuel Allocation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuel Allocation Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule
	 * @generated
	 */
	EClass getFuelAllocationSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EAttribute getFuelAllocationSchedule_FuelType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fuel Allocation</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EAttribute getFuelAllocationSchedule_MaxFuelAllocation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Allocation Start Date</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EAttribute getFuelAllocationSchedule_FuelAllocationStartDate();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fossil Fuel</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EReference getFuelAllocationSchedule_FossilFuel();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EReference getFuelAllocationSchedule_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Fuel Allocation</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EAttribute getFuelAllocationSchedule_MinFuelAllocation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Allocation End Date</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	EAttribute getFuelAllocationSchedule_FuelAllocationEndDate();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.Reservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir
	 * @generated
	 */
	EClass getReservoir();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Storage Capacity</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_ActiveStorageCapacity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upstream From Hydro Power Plants</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_UpstreamFromHydroPowerPlants();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spills Into Reservoirs</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_SpillsIntoReservoirs();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spills From Reservoir</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_SpillsFromReservoir();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Level Vs Volume Curves</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_LevelVsVolumeCurves();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inflow Forecasts</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getInflowForecasts()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_InflowForecasts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spill Travel Delay</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_SpillTravelDelay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>River Outlet Works</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_RiverOutletWorks();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Min Operate Level</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_NormalMinOperateLevel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spillway Crest Level</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_SpillwayCrestLevel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Supply Level</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_FullSupplyLevel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spillway Capacity</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_SpillwayCapacity();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Level Schedule</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_TargetLevelSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spill Way Gate Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillWayGateType()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_SpillWayGateType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spillway Crest Length</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_SpillwayCrestLength();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Storage Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_EnergyStorageRating();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Capacity</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getGrossCapacity()
	 * @see #getReservoir()
	 * @generated
	 */
	EAttribute getReservoir_GrossCapacity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Power Plants</em>'.
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants()
	 * @see #getReservoir()
	 * @generated
	 */
	EReference getReservoir_HydroPowerPlants();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve <em>Hydro Generating Efficiency Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Generating Efficiency Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve
	 * @generated
	 */
	EClass getHydroGeneratingEfficiencyCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit()
	 * @see #getHydroGeneratingEfficiencyCurve()
	 * @generated
	 */
	EReference getHydroGeneratingEfficiencyCurve_HydroGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.NuclearGeneratingUnit <em>Nuclear Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nuclear Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.NuclearGeneratingUnit
	 * @generated
	 */
	EClass getNuclearGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.AirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Air Compressor</em>'.
	 * @see CIM.IEC61970.Generation.Production.AirCompressor
	 * @generated
	 */
	EClass getAirCompressor();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combustion Turbine</em>'.
	 * @see CIM.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine()
	 * @see #getAirCompressor()
	 * @generated
	 */
	EReference getAirCompressor_CombustionTurbine();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CAES Plant</em>'.
	 * @see CIM.IEC61970.Generation.Production.AirCompressor#getCAESPlant()
	 * @see #getAirCompressor()
	 * @generated
	 */
	EReference getAirCompressor_CAESPlant();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Compressor Rating</em>'.
	 * @see CIM.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating()
	 * @see #getAirCompressor()
	 * @generated
	 */
	EAttribute getAirCompressor_AirCompressorRating();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.EmissionAccount <em>Emission Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emission Account</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionAccount
	 * @generated
	 */
	EClass getEmissionAccount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Value Source</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource()
	 * @see #getEmissionAccount()
	 * @generated
	 */
	EAttribute getEmissionAccount_EmissionValueSource();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit()
	 * @see #getEmissionAccount()
	 * @generated
	 */
	EReference getEmissionAccount_ThermalGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionType()
	 * @see #getEmissionAccount()
	 * @generated
	 */
	EAttribute getEmissionAccount_EmissionType();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gross To Net Active Power Curve</em>'.
	 * @see CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve
	 * @generated
	 */
	EClass getGrossToNetActivePowerCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit()
	 * @see #getGrossToNetActivePowerCurve()
	 * @generated
	 */
	EReference getGrossToNetActivePowerCurve_GeneratingUnit();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuel Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.FuelType
	 * @generated
	 */
	EEnum getFuelType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.PenstockType <em>Penstock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Penstock Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.PenstockType
	 * @generated
	 */
	EEnum getPenstockType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Control Source</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratorControlSource
	 * @generated
	 */
	EEnum getGeneratorControlSource();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.EmissionValueSource <em>Emission Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emission Value Source</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionValueSource
	 * @generated
	 */
	EEnum getEmissionValueSource();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.GeneratorOperatingMode <em>Generator Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Operating Mode</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @generated
	 */
	EEnum getGeneratorOperatingMode();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.SpillwayGateType <em>Spillway Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spillway Gate Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.SpillwayGateType
	 * @generated
	 */
	EEnum getSpillwayGateType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.GeneratorControlMode <em>Generator Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Control Mode</em>'.
	 * @see CIM.IEC61970.Generation.Production.GeneratorControlMode
	 * @generated
	 */
	EEnum getGeneratorControlMode();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.HydroPlantType <em>Hydro Plant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hydro Plant Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroPlantType
	 * @generated
	 */
	EEnum getHydroPlantType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.EmissionType <em>Emission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emission Type</em>'.
	 * @see CIM.IEC61970.Generation.Production.EmissionType
	 * @generated
	 */
	EEnum getEmissionType();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.HydroEnergyConversionKind <em>Hydro Energy Conversion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hydro Energy Conversion Kind</em>'.
	 * @see CIM.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @generated
	 */
	EEnum getHydroEnergyConversionKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Generation.Production.SurgeTankCode <em>Surge Tank Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surge Tank Code</em>'.
	 * @see CIM.IEC61970.Generation.Production.SurgeTankCode
	 * @generated
	 */
	EEnum getSurgeTankCode();

	/**
	 * Returns the meta object for data type '<em>Heat Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Heat Rate</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Heat generated, in energy pertime unit of elapsed time'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Heat generated, in energy pertime unit of elapsed time'"
	 * @generated
	 */
	EDataType getHeatRate();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Classification</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#integer'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='1..n, with 1 the most detailed, highest priority, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='1..n, with 1 the most detailed, highest priority, etc.'"
	 * @generated
	 */
	EDataType getClassification();

	/**
	 * Returns the meta object for data type '<em>Emission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Emission</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity of emission per fuel heat content'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity of emission per fuel heat content'"
	 * @generated
	 */
	EDataType getEmission();

	/**
	 * Returns the meta object for data type '<em>Cost Per Heat Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Per Heat Unit</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cost, in units of currency, per quantity of heat generated'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cost, in units of currency, per quantity of heat generated'"
	 * @generated
	 */
	EDataType getCostPerHeatUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductionFactory getProductionFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl <em>Hydro Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroGeneratingUnit()
		 * @generated
		 */
		EClass HYDRO_GENERATING_UNIT = eINSTANCE.getHydroGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Energy Conversion Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY = eINSTANCE.getHydroGeneratingUnit_EnergyConversionCapability();

		/**
		 * The meta object literal for the '<em><b>Tailbay Loss Curve</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE = eINSTANCE.getHydroGeneratingUnit_TailbayLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Power Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT = eINSTANCE.getHydroGeneratingUnit_HydroPowerPlant();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES = eINSTANCE.getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves();

		/**
		 * The meta object literal for the '<em><b>Hydro Unit Water Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST = eINSTANCE.getHydroGeneratingUnit_HydroUnitWaterCost();

		/**
		 * The meta object literal for the '<em><b>Penstock Loss Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE = eINSTANCE.getHydroGeneratingUnit_PenstockLossCurve();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HeatRateCurveImpl <em>Heat Rate Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HeatRateCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHeatRateCurve()
		 * @generated
		 */
		EClass HEAT_RATE_CURVE = eINSTANCE.getHeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getHeatRateCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_RATE_CURVE__IS_NET_GROSS_P = eINSTANCE.getHeatRateCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.StartIgnFuelCurveImpl <em>Start Ign Fuel Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.StartIgnFuelCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartIgnFuelCurve()
		 * @generated
		 */
		EClass START_IGN_FUEL_CURVE = eINSTANCE.getStartIgnFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Ignition Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE = eINSTANCE.getStartIgnFuelCurve_IgnitionFuelType();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_IGN_FUEL_CURVE__STARTUP_MODEL = eINSTANCE.getStartIgnFuelCurve_StartupModel();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl <em>Cogeneration Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCogenerationPlant()
		 * @generated
		 */
		EClass COGENERATION_PLANT = eINSTANCE.getCogenerationPlant();

		/**
		 * The meta object literal for the '<em><b>Cogen LP Steam Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COGENERATION_PLANT__COGEN_LP_STEAM_RATING = eINSTANCE.getCogenerationPlant_CogenLPSteamRating();

		/**
		 * The meta object literal for the '<em><b>Cogen HP Steam Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COGENERATION_PLANT__COGEN_HP_STEAM_RATING = eINSTANCE.getCogenerationPlant_CogenHPSteamRating();

		/**
		 * The meta object literal for the '<em><b>Steam Sendout Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE = eINSTANCE.getCogenerationPlant_SteamSendoutSchedule();

		/**
		 * The meta object literal for the '<em><b>Cogen HP Sendout Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING = eINSTANCE.getCogenerationPlant_CogenHPSendoutRating();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGENERATION_PLANT__THERMAL_GENERATING_UNITS = eINSTANCE.getCogenerationPlant_ThermalGeneratingUnits();

		/**
		 * The meta object literal for the '<em><b>Cogen LP Sendout Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING = eINSTANCE.getCogenerationPlant_CogenLPSendoutRating();

		/**
		 * The meta object literal for the '<em><b>Rated P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COGENERATION_PLANT__RATED_P = eINSTANCE.getCogenerationPlant_RatedP();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.CAESPlantImpl <em>CAES Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.CAESPlantImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCAESPlant()
		 * @generated
		 */
		EClass CAES_PLANT = eINSTANCE.getCAESPlant();

		/**
		 * The meta object literal for the '<em><b>Energy Storage Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAES_PLANT__ENERGY_STORAGE_CAPACITY = eINSTANCE.getCAESPlant_EnergyStorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Rated Capacity P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAES_PLANT__RATED_CAPACITY_P = eINSTANCE.getCAESPlant_RatedCapacityP();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAES_PLANT__THERMAL_GENERATING_UNIT = eINSTANCE.getCAESPlant_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Air Compressor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAES_PLANT__AIR_COMPRESSOR = eINSTANCE.getCAESPlant_AirCompressor();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl <em>Thermal Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.ThermalGeneratingUnitImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getThermalGeneratingUnit()
		 * @generated
		 */
		EClass THERMAL_GENERATING_UNIT = eINSTANCE.getThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Combined Cycle Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT = eINSTANCE.getThermalGeneratingUnit_CombinedCyclePlant();

		/**
		 * The meta object literal for the '<em><b>CAES Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__CAES_PLANT = eINSTANCE.getThermalGeneratingUnit_CAESPlant();

		/**
		 * The meta object literal for the '<em><b>Emission Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__EMISSION_CURVES = eINSTANCE.getThermalGeneratingUnit_EmissionCurves();

		/**
		 * The meta object literal for the '<em><b>Heat Input Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE = eINSTANCE.getThermalGeneratingUnit_HeatInputCurve();

		/**
		 * The meta object literal for the '<em><b>Shutdown Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE = eINSTANCE.getThermalGeneratingUnit_ShutdownCurve();

		/**
		 * The meta object literal for the '<em><b>Heat Rate Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE = eINSTANCE.getThermalGeneratingUnit_HeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Incremental Heat Rate Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE = eINSTANCE.getThermalGeneratingUnit_IncrementalHeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>OM Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THERMAL_GENERATING_UNIT__OM_COST = eINSTANCE.getThermalGeneratingUnit_OMCost();

		/**
		 * The meta object literal for the '<em><b>Cogeneration Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__COGENERATION_PLANT = eINSTANCE.getThermalGeneratingUnit_CogenerationPlant();

		/**
		 * The meta object literal for the '<em><b>Fossil Fuels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__FOSSIL_FUELS = eINSTANCE.getThermalGeneratingUnit_FossilFuels();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__STARTUP_MODEL = eINSTANCE.getThermalGeneratingUnit_StartupModel();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES = eINSTANCE.getThermalGeneratingUnit_FuelAllocationSchedules();

		/**
		 * The meta object literal for the '<em><b>Emmission Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS = eINSTANCE.getThermalGeneratingUnit_EmmissionAccounts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.WindGeneratingUnitImpl <em>Wind Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.WindGeneratingUnitImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getWindGeneratingUnit()
		 * @generated
		 */
		EClass WIND_GENERATING_UNIT = eINSTANCE.getWindGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.TailbayLossCurveImpl <em>Tailbay Loss Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.TailbayLossCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getTailbayLossCurve()
		 * @generated
		 */
		EClass TAILBAY_LOSS_CURVE = eINSTANCE.getTailbayLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT = eINSTANCE.getTailbayLossCurve_HydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.StartRampCurveImpl <em>Start Ramp Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.StartRampCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartRampCurve()
		 * @generated
		 */
		EClass START_RAMP_CURVE = eINSTANCE.getStartRampCurve();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_RAMP_CURVE__STARTUP_MODEL = eINSTANCE.getStartRampCurve_StartupModel();

		/**
		 * The meta object literal for the '<em><b>Hot Standby Ramp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_RAMP_CURVE__HOT_STANDBY_RAMP = eINSTANCE.getStartRampCurve_HotStandbyRamp();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.StartupModelImpl <em>Startup Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.StartupModelImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartupModel()
		 * @generated
		 */
		EClass STARTUP_MODEL = eINSTANCE.getStartupModel();

		/**
		 * The meta object literal for the '<em><b>Start Ign Fuel Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTUP_MODEL__START_IGN_FUEL_CURVE = eINSTANCE.getStartupModel_StartIgnFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Fixed Maint Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__FIXED_MAINT_COST = eINSTANCE.getStartupModel_FixedMaintCost();

		/**
		 * The meta object literal for the '<em><b>Risk Factor Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__RISK_FACTOR_COST = eINSTANCE.getStartupModel_RiskFactorCost();

		/**
		 * The meta object literal for the '<em><b>Stby Aux P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__STBY_AUX_P = eINSTANCE.getStartupModel_StbyAuxP();

		/**
		 * The meta object literal for the '<em><b>Startup Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__STARTUP_DATE = eINSTANCE.getStartupModel_StartupDate();

		/**
		 * The meta object literal for the '<em><b>Start Ramp Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTUP_MODEL__START_RAMP_CURVE = eINSTANCE.getStartupModel_StartRampCurve();

		/**
		 * The meta object literal for the '<em><b>Minimum Down Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__MINIMUM_DOWN_TIME = eINSTANCE.getStartupModel_MinimumDownTime();

		/**
		 * The meta object literal for the '<em><b>Minimum Run Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__MINIMUM_RUN_TIME = eINSTANCE.getStartupModel_MinimumRunTime();

		/**
		 * The meta object literal for the '<em><b>Start Main Fuel Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTUP_MODEL__START_MAIN_FUEL_CURVE = eINSTANCE.getStartupModel_StartMainFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Startup Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__STARTUP_PRIORITY = eINSTANCE.getStartupModel_StartupPriority();

		/**
		 * The meta object literal for the '<em><b>Startup Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__STARTUP_COST = eINSTANCE.getStartupModel_StartupCost();

		/**
		 * The meta object literal for the '<em><b>Hot Standby Heat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__HOT_STANDBY_HEAT = eINSTANCE.getStartupModel_HotStandbyHeat();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTUP_MODEL__THERMAL_GENERATING_UNIT = eINSTANCE.getStartupModel_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Incremental Maint Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP_MODEL__INCREMENTAL_MAINT_COST = eINSTANCE.getStartupModel_IncrementalMaintCost();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.CombinedCyclePlantImpl <em>Combined Cycle Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.CombinedCyclePlantImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCombinedCyclePlant()
		 * @generated
		 */
		EClass COMBINED_CYCLE_PLANT = eINSTANCE.getCombinedCyclePlant();

		/**
		 * The meta object literal for the '<em><b>Comb Cycle Plant Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING = eINSTANCE.getCombinedCyclePlant_CombCyclePlantRating();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS = eINSTANCE.getCombinedCyclePlant_ThermalGeneratingUnits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl <em>Hydro Pump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HydroPumpImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPump()
		 * @generated
		 */
		EClass HYDRO_PUMP = eINSTANCE.getHydroPump();

		/**
		 * The meta object literal for the '<em><b>Hydro Power Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_PUMP__HYDRO_POWER_PLANT = eINSTANCE.getHydroPump_HydroPowerPlant();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_PUMP__SYNCHRONOUS_MACHINE = eINSTANCE.getHydroPump_SynchronousMachine();

		/**
		 * The meta object literal for the '<em><b>Pump Disch At Min Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD = eINSTANCE.getHydroPump_PumpDischAtMinHead();

		/**
		 * The meta object literal for the '<em><b>Pump Power At Min Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD = eINSTANCE.getHydroPump_PumpPowerAtMinHead();

		/**
		 * The meta object literal for the '<em><b>Pump Power At Max Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD = eINSTANCE.getHydroPump_PumpPowerAtMaxHead();

		/**
		 * The meta object literal for the '<em><b>Hydro Pump Op Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE = eINSTANCE.getHydroPump_HydroPumpOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Pump Disch At Max Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD = eINSTANCE.getHydroPump_PumpDischAtMaxHead();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.PenstockLossCurveImpl <em>Penstock Loss Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.PenstockLossCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getPenstockLossCurve()
		 * @generated
		 */
		EClass PENSTOCK_LOSS_CURVE = eINSTANCE.getPenstockLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT = eINSTANCE.getPenstockLossCurve_HydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.ShutdownCurveImpl <em>Shutdown Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.ShutdownCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getShutdownCurve()
		 * @generated
		 */
		EClass SHUTDOWN_CURVE = eINSTANCE.getShutdownCurve();

		/**
		 * The meta object literal for the '<em><b>Shutdown Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUTDOWN_CURVE__SHUTDOWN_COST = eINSTANCE.getShutdownCurve_ShutdownCost();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getShutdownCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Shutdown Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUTDOWN_CURVE__SHUTDOWN_DATE = eINSTANCE.getShutdownCurve_ShutdownDate();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.IncrementalHeatRateCurveImpl <em>Incremental Heat Rate Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.IncrementalHeatRateCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getIncrementalHeatRateCurve()
		 * @generated
		 */
		EClass INCREMENTAL_HEAT_RATE_CURVE = eINSTANCE.getIncrementalHeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P = eINSTANCE.getIncrementalHeatRateCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getIncrementalHeatRateCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.GenUnitOpScheduleImpl <em>Gen Unit Op Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.GenUnitOpScheduleImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGenUnitOpSchedule()
		 * @generated
		 */
		EClass GEN_UNIT_OP_SCHEDULE = eINSTANCE.getGenUnitOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT = eINSTANCE.getGenUnitOpSchedule_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl <em>Target Level Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getTargetLevelSchedule()
		 * @generated
		 */
		EClass TARGET_LEVEL_SCHEDULE = eINSTANCE.getTargetLevelSchedule();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_LEVEL_SCHEDULE__RESERVOIR = eINSTANCE.getTargetLevelSchedule_Reservoir();

		/**
		 * The meta object literal for the '<em><b>High Level Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT = eINSTANCE.getTargetLevelSchedule_HighLevelLimit();

		/**
		 * The meta object literal for the '<em><b>Low Level Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT = eINSTANCE.getTargetLevelSchedule_LowLevelLimit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl <em>Emission Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionCurve()
		 * @generated
		 */
		EClass EMISSION_CURVE = eINSTANCE.getEmissionCurve();

		/**
		 * The meta object literal for the '<em><b>Emission Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMISSION_CURVE__EMISSION_CONTENT = eINSTANCE.getEmissionCurve_EmissionContent();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMISSION_CURVE__IS_NET_GROSS_P = eINSTANCE.getEmissionCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMISSION_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getEmissionCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Emission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMISSION_CURVE__EMISSION_TYPE = eINSTANCE.getEmissionCurve_EmissionType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.GenUnitOpCostCurveImpl <em>Gen Unit Op Cost Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.GenUnitOpCostCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGenUnitOpCostCurve()
		 * @generated
		 */
		EClass GEN_UNIT_OP_COST_CURVE = eINSTANCE.getGenUnitOpCostCurve();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P = eINSTANCE.getGenUnitOpCostCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT = eINSTANCE.getGenUnitOpCostCurve_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.FossilFuelImpl <em>Fossil Fuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.FossilFuelImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getFossilFuel()
		 * @generated
		 */
		EClass FOSSIL_FUEL = eINSTANCE.getFossilFuel();

		/**
		 * The meta object literal for the '<em><b>Fuel Eff Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_EFF_FACTOR = eINSTANCE.getFossilFuel_FuelEffFactor();

		/**
		 * The meta object literal for the '<em><b>Fossil Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FOSSIL_FUEL_TYPE = eINSTANCE.getFossilFuel_FossilFuelType();

		/**
		 * The meta object literal for the '<em><b>Fuel Mixture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_MIXTURE = eINSTANCE.getFossilFuel_FuelMixture();

		/**
		 * The meta object literal for the '<em><b>Fuel Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_COST = eINSTANCE.getFossilFuel_FuelCost();

		/**
		 * The meta object literal for the '<em><b>Low Breakpoint P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__LOW_BREAKPOINT_P = eINSTANCE.getFossilFuel_LowBreakpointP();

		/**
		 * The meta object literal for the '<em><b>Fuel Handling Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_HANDLING_COST = eINSTANCE.getFossilFuel_FuelHandlingCost();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES = eINSTANCE.getFossilFuel_FuelAllocationSchedules();

		/**
		 * The meta object literal for the '<em><b>Fuel Sulfur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_SULFUR = eINSTANCE.getFossilFuel_FuelSulfur();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOSSIL_FUEL__THERMAL_GENERATING_UNIT = eINSTANCE.getFossilFuel_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Fuel Heat Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_HEAT_CONTENT = eINSTANCE.getFossilFuel_FuelHeatContent();

		/**
		 * The meta object literal for the '<em><b>High Breakpoint P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__HIGH_BREAKPOINT_P = eINSTANCE.getFossilFuel_HighBreakpointP();

		/**
		 * The meta object literal for the '<em><b>Fuel Dispatch Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_FUEL__FUEL_DISPATCH_COST = eINSTANCE.getFossilFuel_FuelDispatchCost();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.InflowForecastImpl <em>Inflow Forecast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.InflowForecastImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getInflowForecast()
		 * @generated
		 */
		EClass INFLOW_FORECAST = eINSTANCE.getInflowForecast();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLOW_FORECAST__RESERVOIR = eINSTANCE.getInflowForecast_Reservoir();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl <em>Hydro Power Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPowerPlant()
		 * @generated
		 */
		EClass HYDRO_POWER_PLANT = eINSTANCE.getHydroPowerPlant();

		/**
		 * The meta object literal for the '<em><b>Gen Rated P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__GEN_RATED_P = eINSTANCE.getHydroPowerPlant_GenRatedP();

		/**
		 * The meta object literal for the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR = eINSTANCE.getHydroPowerPlant_GenSourcePumpDischargeReservoir();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS = eINSTANCE.getHydroPowerPlant_HydroGeneratingUnits();

		/**
		 * The meta object literal for the '<em><b>Surge Tank Crest Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL = eINSTANCE.getHydroPowerPlant_SurgeTankCrestLevel();

		/**
		 * The meta object literal for the '<em><b>Discharge Travel Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY = eINSTANCE.getHydroPowerPlant_DischargeTravelDelay();

		/**
		 * The meta object literal for the '<em><b>Pump Rated P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__PUMP_RATED_P = eINSTANCE.getHydroPowerPlant_PumpRatedP();

		/**
		 * The meta object literal for the '<em><b>Penstock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__PENSTOCK_TYPE = eINSTANCE.getHydroPowerPlant_PenstockType();

		/**
		 * The meta object literal for the '<em><b>Hydro Plant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE = eINSTANCE.getHydroPowerPlant_HydroPlantType();

		/**
		 * The meta object literal for the '<em><b>Hydro Pumps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_POWER_PLANT__HYDRO_PUMPS = eINSTANCE.getHydroPowerPlant_HydroPumps();

		/**
		 * The meta object literal for the '<em><b>Plant Rated Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__PLANT_RATED_HEAD = eINSTANCE.getHydroPowerPlant_PlantRatedHead();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_POWER_PLANT__RESERVOIR = eINSTANCE.getHydroPowerPlant_Reservoir();

		/**
		 * The meta object literal for the '<em><b>Surge Tank Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__SURGE_TANK_CODE = eINSTANCE.getHydroPowerPlant_SurgeTankCode();

		/**
		 * The meta object literal for the '<em><b>Plant Discharge Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY = eINSTANCE.getHydroPowerPlant_PlantDischargeCapacity();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.StartMainFuelCurveImpl <em>Start Main Fuel Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.StartMainFuelCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getStartMainFuelCurve()
		 * @generated
		 */
		EClass START_MAIN_FUEL_CURVE = eINSTANCE.getStartMainFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Main Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE = eINSTANCE.getStartMainFuelCurve_MainFuelType();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_MAIN_FUEL_CURVE__STARTUP_MODEL = eINSTANCE.getStartMainFuelCurve_StartupModel();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.LevelVsVolumeCurveImpl <em>Level Vs Volume Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.LevelVsVolumeCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getLevelVsVolumeCurve()
		 * @generated
		 */
		EClass LEVEL_VS_VOLUME_CURVE = eINSTANCE.getLevelVsVolumeCurve();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_VS_VOLUME_CURVE__RESERVOIR = eINSTANCE.getLevelVsVolumeCurve_Reservoir();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl <em>Heat Input Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHeatInputCurve()
		 * @generated
		 */
		EClass HEAT_INPUT_CURVE = eINSTANCE.getHeatInputCurve();

		/**
		 * The meta object literal for the '<em><b>Heat Input Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET = eINSTANCE.getHeatInputCurve_HeatInputOffset();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_INPUT_CURVE__IS_NET_GROSS_P = eINSTANCE.getHeatInputCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Heat Input Eff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_INPUT_CURVE__HEAT_INPUT_EFF = eINSTANCE.getHeatInputCurve_HeatInputEff();

		/**
		 * The meta object literal for the '<em><b>Aux Power Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_INPUT_CURVE__AUX_POWER_MULT = eINSTANCE.getHeatInputCurve_AuxPowerMult();

		/**
		 * The meta object literal for the '<em><b>Aux Power Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_INPUT_CURVE__AUX_POWER_OFFSET = eINSTANCE.getHeatInputCurve_AuxPowerOffset();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getHeatInputCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HydroPumpOpScheduleImpl <em>Hydro Pump Op Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HydroPumpOpScheduleImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPumpOpSchedule()
		 * @generated
		 */
		EClass HYDRO_PUMP_OP_SCHEDULE = eINSTANCE.getHydroPumpOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Hydro Pump</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP = eINSTANCE.getHydroPumpOpSchedule_HydroPump();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.SteamSendoutScheduleImpl <em>Steam Sendout Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.SteamSendoutScheduleImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getSteamSendoutSchedule()
		 * @generated
		 */
		EClass STEAM_SENDOUT_SCHEDULE = eINSTANCE.getSteamSendoutSchedule();

		/**
		 * The meta object literal for the '<em><b>Cogeneration Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT = eINSTANCE.getSteamSendoutSchedule_CogenerationPlant();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratingUnit()
		 * @generated
		 */
		EClass GENERATING_UNIT = eINSTANCE.getGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>High Control Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__HIGH_CONTROL_LIMIT = eINSTANCE.getGeneratingUnit_HighControlLimit();

		/**
		 * The meta object literal for the '<em><b>Operated By Generation Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER = eINSTANCE.getGeneratingUnit_OperatedBy_GenerationProvider();

		/**
		 * The meta object literal for the '<em><b>Raise Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RAISE_RAMP_RATE = eINSTANCE.getGeneratingUnit_RaiseRampRate();

		/**
		 * The meta object literal for the '<em><b>Gen Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__GEN_OPERATING_MODE = eINSTANCE.getGeneratingUnit_GenOperatingMode();

		/**
		 * The meta object literal for the '<em><b>Auto Cntrl Margin P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = eINSTANCE.getGeneratingUnit_AutoCntrlMarginP();

		/**
		 * The meta object literal for the '<em><b>Control Pulse Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__CONTROL_PULSE_LOW = eINSTANCE.getGeneratingUnit_ControlPulseLow();

		/**
		 * The meta object literal for the '<em><b>Governor MPL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__GOVERNOR_MPL = eINSTANCE.getGeneratingUnit_GovernorMPL();

		/**
		 * The meta object literal for the '<em><b>Rated Gross Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RATED_GROSS_MAX_P = eINSTANCE.getGeneratingUnit_RatedGrossMaxP();

		/**
		 * The meta object literal for the '<em><b>Alloc Spin Res P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__ALLOC_SPIN_RES_P = eINSTANCE.getGeneratingUnit_AllocSpinResP();

		/**
		 * The meta object literal for the '<em><b>Gen Unit Op Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = eINSTANCE.getGeneratingUnit_GenUnitOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Step Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__STEP_CHANGE = eINSTANCE.getGeneratingUnit_StepChange();

		/**
		 * The meta object literal for the '<em><b>Startup Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__STARTUP_COST = eINSTANCE.getGeneratingUnit_StartupCost();

		/**
		 * The meta object literal for the '<em><b>Spin Reserve Ramp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__SPIN_RESERVE_RAMP = eINSTANCE.getGeneratingUnit_SpinReserveRamp();

		/**
		 * The meta object literal for the '<em><b>Nominal P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__NOMINAL_P = eINSTANCE.getGeneratingUnit_NominalP();

		/**
		 * The meta object literal for the '<em><b>Governor SCD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__GOVERNOR_SCD = eINSTANCE.getGeneratingUnit_GovernorSCD();

		/**
		 * The meta object literal for the '<em><b>Penalty Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__PENALTY_FACTOR = eINSTANCE.getGeneratingUnit_PenaltyFactor();

		/**
		 * The meta object literal for the '<em><b>Control Pulse High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__CONTROL_PULSE_HIGH = eINSTANCE.getGeneratingUnit_ControlPulseHigh();

		/**
		 * The meta object literal for the '<em><b>Energy Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__ENERGY_MIN_P = eINSTANCE.getGeneratingUnit_EnergyMinP();

		/**
		 * The meta object literal for the '<em><b>Startup Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__STARTUP_TIME = eINSTANCE.getGeneratingUnit_StartupTime();

		/**
		 * The meta object literal for the '<em><b>Tie Line PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__TIE_LINE_PF = eINSTANCE.getGeneratingUnit_TieLinePF();

		/**
		 * The meta object literal for the '<em><b>Lower Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__LOWER_RAMP_RATE = eINSTANCE.getGeneratingUnit_LowerRampRate();

		/**
		 * The meta object literal for the '<em><b>Initial P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__INITIAL_P = eINSTANCE.getGeneratingUnit_InitialP();

		/**
		 * The meta object literal for the '<em><b>Control Response Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__CONTROL_RESPONSE_RATE = eINSTANCE.getGeneratingUnit_ControlResponseRate();

		/**
		 * The meta object literal for the '<em><b>Min Economic P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MIN_ECONOMIC_P = eINSTANCE.getGeneratingUnit_MinEconomicP();

		/**
		 * The meta object literal for the '<em><b>Model Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MODEL_DETAIL = eINSTANCE.getGeneratingUnit_ModelDetail();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getGeneratingUnit_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Fuel Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__FUEL_PRIORITY = eINSTANCE.getGeneratingUnit_FuelPriority();

		/**
		 * The meta object literal for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = eINSTANCE.getGeneratingUnit_GrossToNetActivePowerCurves();

		/**
		 * The meta object literal for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = eINSTANCE.getGeneratingUnit_GenUnitOpCostCurves();

		/**
		 * The meta object literal for the '<em><b>Max Economic P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MAX_ECONOMIC_P = eINSTANCE.getGeneratingUnit_MaxEconomicP();

		/**
		 * The meta object literal for the '<em><b>Gen Control Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__GEN_CONTROL_SOURCE = eINSTANCE.getGeneratingUnit_GenControlSource();

		/**
		 * The meta object literal for the '<em><b>Rated Gross Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RATED_GROSS_MIN_P = eINSTANCE.getGeneratingUnit_RatedGrossMinP();

		/**
		 * The meta object literal for the '<em><b>Variable Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__VARIABLE_COST = eINSTANCE.getGeneratingUnit_VariableCost();

		/**
		 * The meta object literal for the '<em><b>Min Operating P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MIN_OPERATING_P = eINSTANCE.getGeneratingUnit_MinOperatingP();

		/**
		 * The meta object literal for the '<em><b>Base P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__BASE_P = eINSTANCE.getGeneratingUnit_BaseP();

		/**
		 * The meta object literal for the '<em><b>Short PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__SHORT_PF = eINSTANCE.getGeneratingUnit_ShortPF();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__SYNCHRONOUS_MACHINES = eINSTANCE.getGeneratingUnit_SynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Low Control Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__LOW_CONTROL_LIMIT = eINSTANCE.getGeneratingUnit_LowControlLimit();

		/**
		 * The meta object literal for the '<em><b>Long PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__LONG_PF = eINSTANCE.getGeneratingUnit_LongPF();

		/**
		 * The meta object literal for the '<em><b>Registered Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__REGISTERED_GENERATOR = eINSTANCE.getGeneratingUnit_RegisteredGenerator();

		/**
		 * The meta object literal for the '<em><b>Sub Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__SUB_CONTROL_AREA = eINSTANCE.getGeneratingUnit_SubControlArea();

		/**
		 * The meta object literal for the '<em><b>Max Operating P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MAX_OPERATING_P = eINSTANCE.getGeneratingUnit_MaxOperatingP();

		/**
		 * The meta object literal for the '<em><b>Fast Start Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__FAST_START_FLAG = eINSTANCE.getGeneratingUnit_FastStartFlag();

		/**
		 * The meta object literal for the '<em><b>Gen Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__GEN_CONTROL_MODE = eINSTANCE.getGeneratingUnit_GenControlMode();

		/**
		 * The meta object literal for the '<em><b>Rated Net Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RATED_NET_MAX_P = eINSTANCE.getGeneratingUnit_RatedNetMaxP();

		/**
		 * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__EFFICIENCY = eINSTANCE.getGeneratingUnit_Efficiency();

		/**
		 * The meta object literal for the '<em><b>Minimum Off Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MINIMUM_OFF_TIME = eINSTANCE.getGeneratingUnit_MinimumOffTime();

		/**
		 * The meta object literal for the '<em><b>Disp Reserve Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__DISP_RESERVE_FLAG = eINSTANCE.getGeneratingUnit_DispReserveFlag();

		/**
		 * The meta object literal for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = eINSTANCE.getGeneratingUnit_MaximumAllowableSpinningReserve();

		/**
		 * The meta object literal for the '<em><b>Control Deadband</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__CONTROL_DEADBAND = eINSTANCE.getGeneratingUnit_ControlDeadband();

		/**
		 * The meta object literal for the '<em><b>Normal PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__NORMAL_PF = eINSTANCE.getGeneratingUnit_NormalPF();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.FuelAllocationScheduleImpl <em>Fuel Allocation Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.FuelAllocationScheduleImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getFuelAllocationSchedule()
		 * @generated
		 */
		EClass FUEL_ALLOCATION_SCHEDULE = eINSTANCE.getFuelAllocationSchedule();

		/**
		 * The meta object literal for the '<em><b>Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE = eINSTANCE.getFuelAllocationSchedule_FuelType();

		/**
		 * The meta object literal for the '<em><b>Max Fuel Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION = eINSTANCE.getFuelAllocationSchedule_MaxFuelAllocation();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE = eINSTANCE.getFuelAllocationSchedule_FuelAllocationStartDate();

		/**
		 * The meta object literal for the '<em><b>Fossil Fuel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL = eINSTANCE.getFuelAllocationSchedule_FossilFuel();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT = eINSTANCE.getFuelAllocationSchedule_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Min Fuel Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION = eINSTANCE.getFuelAllocationSchedule_MinFuelAllocation();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE = eINSTANCE.getFuelAllocationSchedule_FuelAllocationEndDate();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.ReservoirImpl <em>Reservoir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.ReservoirImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getReservoir()
		 * @generated
		 */
		EClass RESERVOIR = eINSTANCE.getReservoir();

		/**
		 * The meta object literal for the '<em><b>Active Storage Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__ACTIVE_STORAGE_CAPACITY = eINSTANCE.getReservoir_ActiveStorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS = eINSTANCE.getReservoir_UpstreamFromHydroPowerPlants();

		/**
		 * The meta object literal for the '<em><b>Spills Into Reservoirs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__SPILLS_INTO_RESERVOIRS = eINSTANCE.getReservoir_SpillsIntoReservoirs();

		/**
		 * The meta object literal for the '<em><b>Spills From Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__SPILLS_FROM_RESERVOIR = eINSTANCE.getReservoir_SpillsFromReservoir();

		/**
		 * The meta object literal for the '<em><b>Level Vs Volume Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__LEVEL_VS_VOLUME_CURVES = eINSTANCE.getReservoir_LevelVsVolumeCurves();

		/**
		 * The meta object literal for the '<em><b>Inflow Forecasts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__INFLOW_FORECASTS = eINSTANCE.getReservoir_InflowForecasts();

		/**
		 * The meta object literal for the '<em><b>Spill Travel Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__SPILL_TRAVEL_DELAY = eINSTANCE.getReservoir_SpillTravelDelay();

		/**
		 * The meta object literal for the '<em><b>River Outlet Works</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__RIVER_OUTLET_WORKS = eINSTANCE.getReservoir_RiverOutletWorks();

		/**
		 * The meta object literal for the '<em><b>Normal Min Operate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__NORMAL_MIN_OPERATE_LEVEL = eINSTANCE.getReservoir_NormalMinOperateLevel();

		/**
		 * The meta object literal for the '<em><b>Spillway Crest Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__SPILLWAY_CREST_LEVEL = eINSTANCE.getReservoir_SpillwayCrestLevel();

		/**
		 * The meta object literal for the '<em><b>Full Supply Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__FULL_SUPPLY_LEVEL = eINSTANCE.getReservoir_FullSupplyLevel();

		/**
		 * The meta object literal for the '<em><b>Spillway Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__SPILLWAY_CAPACITY = eINSTANCE.getReservoir_SpillwayCapacity();

		/**
		 * The meta object literal for the '<em><b>Target Level Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__TARGET_LEVEL_SCHEDULE = eINSTANCE.getReservoir_TargetLevelSchedule();

		/**
		 * The meta object literal for the '<em><b>Spill Way Gate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__SPILL_WAY_GATE_TYPE = eINSTANCE.getReservoir_SpillWayGateType();

		/**
		 * The meta object literal for the '<em><b>Spillway Crest Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__SPILLWAY_CREST_LENGTH = eINSTANCE.getReservoir_SpillwayCrestLength();

		/**
		 * The meta object literal for the '<em><b>Energy Storage Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__ENERGY_STORAGE_RATING = eINSTANCE.getReservoir_EnergyStorageRating();

		/**
		 * The meta object literal for the '<em><b>Gross Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVOIR__GROSS_CAPACITY = eINSTANCE.getReservoir_GrossCapacity();

		/**
		 * The meta object literal for the '<em><b>Hydro Power Plants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVOIR__HYDRO_POWER_PLANTS = eINSTANCE.getReservoir_HydroPowerPlants();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingEfficiencyCurveImpl <em>Hydro Generating Efficiency Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.HydroGeneratingEfficiencyCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroGeneratingEfficiencyCurve()
		 * @generated
		 */
		EClass HYDRO_GENERATING_EFFICIENCY_CURVE = eINSTANCE.getHydroGeneratingEfficiencyCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT = eINSTANCE.getHydroGeneratingEfficiencyCurve_HydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.NuclearGeneratingUnitImpl <em>Nuclear Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.NuclearGeneratingUnitImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getNuclearGeneratingUnit()
		 * @generated
		 */
		EClass NUCLEAR_GENERATING_UNIT = eINSTANCE.getNuclearGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.AirCompressorImpl <em>Air Compressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.AirCompressorImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getAirCompressor()
		 * @generated
		 */
		EClass AIR_COMPRESSOR = eINSTANCE.getAirCompressor();

		/**
		 * The meta object literal for the '<em><b>Combustion Turbine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIR_COMPRESSOR__COMBUSTION_TURBINE = eINSTANCE.getAirCompressor_CombustionTurbine();

		/**
		 * The meta object literal for the '<em><b>CAES Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIR_COMPRESSOR__CAES_PLANT = eINSTANCE.getAirCompressor_CAESPlant();

		/**
		 * The meta object literal for the '<em><b>Air Compressor Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR_COMPRESSOR__AIR_COMPRESSOR_RATING = eINSTANCE.getAirCompressor_AirCompressorRating();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl <em>Emission Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionAccount()
		 * @generated
		 */
		EClass EMISSION_ACCOUNT = eINSTANCE.getEmissionAccount();

		/**
		 * The meta object literal for the '<em><b>Emission Value Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE = eINSTANCE.getEmissionAccount_EmissionValueSource();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT = eINSTANCE.getEmissionAccount_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Emission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMISSION_ACCOUNT__EMISSION_TYPE = eINSTANCE.getEmissionAccount_EmissionType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.impl.GrossToNetActivePowerCurveImpl <em>Gross To Net Active Power Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.GrossToNetActivePowerCurveImpl
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGrossToNetActivePowerCurve()
		 * @generated
		 */
		EClass GROSS_TO_NET_ACTIVE_POWER_CURVE = eINSTANCE.getGrossToNetActivePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = eINSTANCE.getGrossToNetActivePowerCurve_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.FuelType <em>Fuel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.FuelType
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getFuelType()
		 * @generated
		 */
		EEnum FUEL_TYPE = eINSTANCE.getFuelType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.PenstockType <em>Penstock Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.PenstockType
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getPenstockType()
		 * @generated
		 */
		EEnum PENSTOCK_TYPE = eINSTANCE.getPenstockType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.GeneratorControlSource
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratorControlSource()
		 * @generated
		 */
		EEnum GENERATOR_CONTROL_SOURCE = eINSTANCE.getGeneratorControlSource();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.EmissionValueSource <em>Emission Value Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.EmissionValueSource
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionValueSource()
		 * @generated
		 */
		EEnum EMISSION_VALUE_SOURCE = eINSTANCE.getEmissionValueSource();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.GeneratorOperatingMode <em>Generator Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.GeneratorOperatingMode
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratorOperatingMode()
		 * @generated
		 */
		EEnum GENERATOR_OPERATING_MODE = eINSTANCE.getGeneratorOperatingMode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.SpillwayGateType <em>Spillway Gate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.SpillwayGateType
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getSpillwayGateType()
		 * @generated
		 */
		EEnum SPILLWAY_GATE_TYPE = eINSTANCE.getSpillwayGateType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.GeneratorControlMode <em>Generator Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.GeneratorControlMode
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getGeneratorControlMode()
		 * @generated
		 */
		EEnum GENERATOR_CONTROL_MODE = eINSTANCE.getGeneratorControlMode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.HydroPlantType <em>Hydro Plant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.HydroPlantType
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroPlantType()
		 * @generated
		 */
		EEnum HYDRO_PLANT_TYPE = eINSTANCE.getHydroPlantType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.EmissionType <em>Emission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.EmissionType
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmissionType()
		 * @generated
		 */
		EEnum EMISSION_TYPE = eINSTANCE.getEmissionType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.HydroEnergyConversionKind <em>Hydro Energy Conversion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.HydroEnergyConversionKind
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHydroEnergyConversionKind()
		 * @generated
		 */
		EEnum HYDRO_ENERGY_CONVERSION_KIND = eINSTANCE.getHydroEnergyConversionKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Generation.Production.SurgeTankCode <em>Surge Tank Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.SurgeTankCode
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getSurgeTankCode()
		 * @generated
		 */
		EEnum SURGE_TANK_CODE = eINSTANCE.getSurgeTankCode();

		/**
		 * The meta object literal for the '<em>Heat Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getHeatRate()
		 * @generated
		 */
		EDataType HEAT_RATE = eINSTANCE.getHeatRate();

		/**
		 * The meta object literal for the '<em>Classification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getClassification()
		 * @generated
		 */
		EDataType CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em>Emission</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getEmission()
		 * @generated
		 */
		EDataType EMISSION = eINSTANCE.getEmission();

		/**
		 * The meta object literal for the '<em>Cost Per Heat Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl#getCostPerHeatUnit()
		 * @generated
		 */
		EDataType COST_PER_HEAT_UNIT = eINSTANCE.getCostPerHeatUnit();

	}

} //ProductionPackage
