/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics;

import gluemodel.CIM.IEC61970.Core.CorePackage;

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
 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Generation Dynamics package contains prime movers, such as turbines and boilers, which are needed for simulation and educational purposes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Generation Dynamics package contains prime movers, such as turbines and boilers, which are needed for simulation and educational purposes.'"
 * @generated
 */
public interface GenerationDynamicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GenerationDynamics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#GenerationDynamics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimGenerationDynamics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenerationDynamicsPackage eINSTANCE = gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamSupplyImpl <em>Steam Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamSupplyImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSteamSupply()
	 * @generated
	 */
	int STEAM_SUPPLY = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__STEAM_TURBINES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY__STEAM_SUPPLY_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_SUPPLY_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl <em>Fossil Steam Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getFossilSteamSupply()
	 * @generated
	 */
	int FOSSIL_STEAM_SUPPLY = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__UUID = STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__MRID = STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__NAME = STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__DESCRIPTION = STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PATH_NAME = STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__MODELING_AUTHORITY_SET = STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__LOCAL_NAME = STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__ALIAS_NAME = STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__REPORTING_GROUP = STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__NETWORK_DATA_SETS = STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__LOCATION = STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__OUTAGE_SCHEDULE = STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PSR_EVENT = STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__SAFETY_DOCUMENTS = STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__ERP_ORGANISATION_ROLES = STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CIRCUIT_SECTIONS = STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__MEASUREMENTS = STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__ASSETS = STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__SCHEDULE_STEPS = STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PSR_TYPE = STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PSR_LISTS = STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__OPERATING_SHARE = STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CHANGE_ITEMS = STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__DOCUMENT_ROLES = STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__STEAM_TURBINES = STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__STEAM_SUPPLY_RATING = STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG = STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY = STEAM_SUPPLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__FEED_WATER_PG = STEAM_SUPPLY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CONTROL_TC = STEAM_SUPPLY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG = STEAM_SUPPLY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP = STEAM_SUPPLY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P = STEAM_SUPPLY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CONTROL_IC = STEAM_SUPPLY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P = STEAM_SUPPLY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT = STEAM_SUPPLY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD = STEAM_SUPPLY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG = STEAM_SUPPLY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE = STEAM_SUPPLY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CONTROL_PC = STEAM_SUPPLY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__FEED_WATER_TC = STEAM_SUPPLY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P = STEAM_SUPPLY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__FEED_WATER_IG = STEAM_SUPPLY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG = STEAM_SUPPLY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC = STEAM_SUPPLY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY = STEAM_SUPPLY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK = STEAM_SUPPLY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY = STEAM_SUPPLY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE = STEAM_SUPPLY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY = STEAM_SUPPLY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CONTROL_PEB = STEAM_SUPPLY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY__CONTROL_PED = STEAM_SUPPLY_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Fossil Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY_FEATURE_COUNT = STEAM_SUPPLY_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Fossil Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOSSIL_STEAM_SUPPLY_OPERATION_COUNT = STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SupercriticalImpl <em>Supercritical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SupercriticalImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSupercritical()
	 * @generated
	 */
	int SUPERCRITICAL = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__UUID = FOSSIL_STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__MRID = FOSSIL_STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__NAME = FOSSIL_STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__DESCRIPTION = FOSSIL_STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PATH_NAME = FOSSIL_STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__MODELING_AUTHORITY_SET = FOSSIL_STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__LOCAL_NAME = FOSSIL_STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__ALIAS_NAME = FOSSIL_STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__REPORTING_GROUP = FOSSIL_STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__NETWORK_DATA_SETS = FOSSIL_STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__LOCATION = FOSSIL_STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__OUTAGE_SCHEDULE = FOSSIL_STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PSR_EVENT = FOSSIL_STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__SAFETY_DOCUMENTS = FOSSIL_STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__ERP_ORGANISATION_ROLES = FOSSIL_STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CIRCUIT_SECTIONS = FOSSIL_STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__MEASUREMENTS = FOSSIL_STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__ASSETS = FOSSIL_STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__SCHEDULE_STEPS = FOSSIL_STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PSR_TYPE = FOSSIL_STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PSR_LISTS = FOSSIL_STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__OPERATING_SHARE = FOSSIL_STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CHANGE_ITEMS = FOSSIL_STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__DOCUMENT_ROLES = FOSSIL_STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__STEAM_TURBINES = FOSSIL_STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__STEAM_SUPPLY_RATING = FOSSIL_STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PRESSURE_CTRL_PG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG;

	/**
	 * The feature id for the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__SUPER_HEATER1_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY;

	/**
	 * The feature id for the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__FEED_WATER_PG = FOSSIL_STEAM_SUPPLY__FEED_WATER_PG;

	/**
	 * The feature id for the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CONTROL_TC = FOSSIL_STEAM_SUPPLY__CONTROL_TC;

	/**
	 * The feature id for the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__MECH_POWER_SENSOR_LAG = FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG;

	/**
	 * The feature id for the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__THROTTLE_PRESSURE_SP = FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP;

	/**
	 * The feature id for the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__MAX_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CONTROL_IC = FOSSIL_STEAM_SUPPLY__CONTROL_IC;

	/**
	 * The feature id for the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__MIN_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__FUEL_DEMAND_LIMIT = FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT;

	/**
	 * The feature id for the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__SUPER_HEATER_PIPE_PD = FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PRESSURE_CTRL_DG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__AUX_POWER_VERSUS_VOLTAGE = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CONTROL_PC = FOSSIL_STEAM_SUPPLY__CONTROL_PC;

	/**
	 * The feature id for the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__FEED_WATER_TC = FOSSIL_STEAM_SUPPLY__FEED_WATER_TC;

	/**
	 * The feature id for the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CONTROL_ERROR_BIAS_P = FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P;

	/**
	 * The feature id for the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__FEED_WATER_IG = FOSSIL_STEAM_SUPPLY__FEED_WATER_IG;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PRESSURE_CTRL_IG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG;

	/**
	 * The feature id for the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__FUEL_SUPPLY_TC = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__AUX_POWER_VERSUS_FREQUENCY = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__PRESSURE_FEEDBACK = FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__FUEL_SUPPLY_DELAY = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY;

	/**
	 * The feature id for the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__BOILER_CONTROL_MODE = FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__SUPER_HEATER2_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY;

	/**
	 * The feature id for the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CONTROL_PEB = FOSSIL_STEAM_SUPPLY__CONTROL_PEB;

	/**
	 * The feature id for the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL__CONTROL_PED = FOSSIL_STEAM_SUPPLY__CONTROL_PED;

	/**
	 * The number of structural features of the '<em>Supercritical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL_FEATURE_COUNT = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supercritical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCRITICAL_OPERATION_COUNT = FOSSIL_STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PrimeMoverImpl <em>Prime Mover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PrimeMoverImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getPrimeMover()
	 * @generated
	 */
	int PRIME_MOVER = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Prime Mover Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__PRIME_MOVER_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER__SYNCHRONOUS_MACHINES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prime Mover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Prime Mover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_MOVER_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl <em>Combustion Turbine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getCombustionTurbine()
	 * @generated
	 */
	int COMBUSTION_TURBINE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__UUID = PRIME_MOVER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__MRID = PRIME_MOVER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__NAME = PRIME_MOVER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__DESCRIPTION = PRIME_MOVER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__PATH_NAME = PRIME_MOVER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__MODELING_AUTHORITY_SET = PRIME_MOVER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__LOCAL_NAME = PRIME_MOVER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__ALIAS_NAME = PRIME_MOVER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__REPORTING_GROUP = PRIME_MOVER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__NETWORK_DATA_SETS = PRIME_MOVER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__LOCATION = PRIME_MOVER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__OUTAGE_SCHEDULE = PRIME_MOVER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__PSR_EVENT = PRIME_MOVER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__SAFETY_DOCUMENTS = PRIME_MOVER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__ERP_ORGANISATION_ROLES = PRIME_MOVER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__CIRCUIT_SECTIONS = PRIME_MOVER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__MEASUREMENTS = PRIME_MOVER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__ASSETS = PRIME_MOVER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__SCHEDULE_STEPS = PRIME_MOVER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__PSR_TYPE = PRIME_MOVER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__PSR_LISTS = PRIME_MOVER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__OPERATING_SHARE = PRIME_MOVER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__CHANGE_ITEMS = PRIME_MOVER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__DOCUMENT_ROLES = PRIME_MOVER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Prime Mover Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__PRIME_MOVER_RATING = PRIME_MOVER__PRIME_MOVER_RATING;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__SYNCHRONOUS_MACHINES = PRIME_MOVER__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY = PRIME_MOVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Variation By Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP = PRIME_MOVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ambient Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__AMBIENT_TEMP = PRIME_MOVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__REFERENCE_TEMP = PRIME_MOVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Heat Recovery Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG = PRIME_MOVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capability Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY = PRIME_MOVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Heat Recovery Boiler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER = PRIME_MOVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CT Temp Active Power Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE = PRIME_MOVER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE = PRIME_MOVER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Air Compressor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__AIR_COMPRESSOR = PRIME_MOVER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Time Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE__TIME_CONSTANT = PRIME_MOVER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Combustion Turbine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE_FEATURE_COUNT = PRIME_MOVER_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Combustion Turbine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBUSTION_TURBINE_OPERATION_COUNT = PRIME_MOVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CTTempActivePowerCurveImpl <em>CT Temp Active Power Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CTTempActivePowerCurveImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getCTTempActivePowerCurve()
	 * @generated
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Combustion Turbine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CT Temp Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CT Temp Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TEMP_ACTIVE_POWER_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SubcriticalImpl <em>Subcritical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SubcriticalImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSubcritical()
	 * @generated
	 */
	int SUBCRITICAL = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__UUID = FOSSIL_STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__MRID = FOSSIL_STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__NAME = FOSSIL_STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__DESCRIPTION = FOSSIL_STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PATH_NAME = FOSSIL_STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__MODELING_AUTHORITY_SET = FOSSIL_STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__LOCAL_NAME = FOSSIL_STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__ALIAS_NAME = FOSSIL_STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__REPORTING_GROUP = FOSSIL_STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__NETWORK_DATA_SETS = FOSSIL_STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__LOCATION = FOSSIL_STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__OUTAGE_SCHEDULE = FOSSIL_STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PSR_EVENT = FOSSIL_STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__SAFETY_DOCUMENTS = FOSSIL_STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__ERP_ORGANISATION_ROLES = FOSSIL_STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CIRCUIT_SECTIONS = FOSSIL_STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__MEASUREMENTS = FOSSIL_STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__ASSETS = FOSSIL_STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__SCHEDULE_STEPS = FOSSIL_STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PSR_TYPE = FOSSIL_STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PSR_LISTS = FOSSIL_STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__OPERATING_SHARE = FOSSIL_STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CHANGE_ITEMS = FOSSIL_STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__DOCUMENT_ROLES = FOSSIL_STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__STEAM_TURBINES = FOSSIL_STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__STEAM_SUPPLY_RATING = FOSSIL_STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PRESSURE_CTRL_PG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG;

	/**
	 * The feature id for the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__SUPER_HEATER1_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY;

	/**
	 * The feature id for the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__FEED_WATER_PG = FOSSIL_STEAM_SUPPLY__FEED_WATER_PG;

	/**
	 * The feature id for the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CONTROL_TC = FOSSIL_STEAM_SUPPLY__CONTROL_TC;

	/**
	 * The feature id for the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__MECH_POWER_SENSOR_LAG = FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG;

	/**
	 * The feature id for the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__THROTTLE_PRESSURE_SP = FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP;

	/**
	 * The feature id for the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__MAX_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CONTROL_IC = FOSSIL_STEAM_SUPPLY__CONTROL_IC;

	/**
	 * The feature id for the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__MIN_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__FUEL_DEMAND_LIMIT = FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT;

	/**
	 * The feature id for the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__SUPER_HEATER_PIPE_PD = FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PRESSURE_CTRL_DG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__AUX_POWER_VERSUS_VOLTAGE = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CONTROL_PC = FOSSIL_STEAM_SUPPLY__CONTROL_PC;

	/**
	 * The feature id for the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__FEED_WATER_TC = FOSSIL_STEAM_SUPPLY__FEED_WATER_TC;

	/**
	 * The feature id for the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CONTROL_ERROR_BIAS_P = FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P;

	/**
	 * The feature id for the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__FEED_WATER_IG = FOSSIL_STEAM_SUPPLY__FEED_WATER_IG;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PRESSURE_CTRL_IG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG;

	/**
	 * The feature id for the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__FUEL_SUPPLY_TC = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__AUX_POWER_VERSUS_FREQUENCY = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__PRESSURE_FEEDBACK = FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__FUEL_SUPPLY_DELAY = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY;

	/**
	 * The feature id for the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__BOILER_CONTROL_MODE = FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__SUPER_HEATER2_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY;

	/**
	 * The feature id for the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CONTROL_PEB = FOSSIL_STEAM_SUPPLY__CONTROL_PEB;

	/**
	 * The feature id for the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL__CONTROL_PED = FOSSIL_STEAM_SUPPLY__CONTROL_PED;

	/**
	 * The number of structural features of the '<em>Subcritical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL_FEATURE_COUNT = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subcritical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCRITICAL_OPERATION_COUNT = FOSSIL_STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HeatRecoveryBoilerImpl <em>Heat Recovery Boiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HeatRecoveryBoilerImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getHeatRecoveryBoiler()
	 * @generated
	 */
	int HEAT_RECOVERY_BOILER = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__UUID = FOSSIL_STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__MRID = FOSSIL_STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__NAME = FOSSIL_STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__DESCRIPTION = FOSSIL_STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PATH_NAME = FOSSIL_STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__MODELING_AUTHORITY_SET = FOSSIL_STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__LOCAL_NAME = FOSSIL_STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__ALIAS_NAME = FOSSIL_STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__REPORTING_GROUP = FOSSIL_STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__NETWORK_DATA_SETS = FOSSIL_STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__LOCATION = FOSSIL_STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__OUTAGE_SCHEDULE = FOSSIL_STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PSR_EVENT = FOSSIL_STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__SAFETY_DOCUMENTS = FOSSIL_STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__ERP_ORGANISATION_ROLES = FOSSIL_STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CIRCUIT_SECTIONS = FOSSIL_STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__MEASUREMENTS = FOSSIL_STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__ASSETS = FOSSIL_STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__SCHEDULE_STEPS = FOSSIL_STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PSR_TYPE = FOSSIL_STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PSR_LISTS = FOSSIL_STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__OPERATING_SHARE = FOSSIL_STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CHANGE_ITEMS = FOSSIL_STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__DOCUMENT_ROLES = FOSSIL_STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__STEAM_TURBINES = FOSSIL_STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING = FOSSIL_STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PRESSURE_CTRL_PG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG;

	/**
	 * The feature id for the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__SUPER_HEATER1_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY;

	/**
	 * The feature id for the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__FEED_WATER_PG = FOSSIL_STEAM_SUPPLY__FEED_WATER_PG;

	/**
	 * The feature id for the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CONTROL_TC = FOSSIL_STEAM_SUPPLY__CONTROL_TC;

	/**
	 * The feature id for the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__MECH_POWER_SENSOR_LAG = FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG;

	/**
	 * The feature id for the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__THROTTLE_PRESSURE_SP = FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP;

	/**
	 * The feature id for the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__MAX_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CONTROL_IC = FOSSIL_STEAM_SUPPLY__CONTROL_IC;

	/**
	 * The feature id for the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__MIN_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__FUEL_DEMAND_LIMIT = FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT;

	/**
	 * The feature id for the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__SUPER_HEATER_PIPE_PD = FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PRESSURE_CTRL_DG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__AUX_POWER_VERSUS_VOLTAGE = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CONTROL_PC = FOSSIL_STEAM_SUPPLY__CONTROL_PC;

	/**
	 * The feature id for the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__FEED_WATER_TC = FOSSIL_STEAM_SUPPLY__FEED_WATER_TC;

	/**
	 * The feature id for the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CONTROL_ERROR_BIAS_P = FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P;

	/**
	 * The feature id for the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__FEED_WATER_IG = FOSSIL_STEAM_SUPPLY__FEED_WATER_IG;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PRESSURE_CTRL_IG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG;

	/**
	 * The feature id for the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__FUEL_SUPPLY_TC = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__AUX_POWER_VERSUS_FREQUENCY = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__PRESSURE_FEEDBACK = FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__FUEL_SUPPLY_DELAY = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY;

	/**
	 * The feature id for the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__BOILER_CONTROL_MODE = FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__SUPER_HEATER2_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY;

	/**
	 * The feature id for the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CONTROL_PEB = FOSSIL_STEAM_SUPPLY__CONTROL_PEB;

	/**
	 * The feature id for the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__CONTROL_PED = FOSSIL_STEAM_SUPPLY__CONTROL_PED;

	/**
	 * The feature id for the '<em><b>Combustion Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2 = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heat Recovery Boiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER_FEATURE_COUNT = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heat Recovery Boiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAT_RECOVERY_BOILER_OPERATION_COUNT = FOSSIL_STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl <em>BWR Steam Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getBWRSteamSupply()
	 * @generated
	 */
	int BWR_STEAM_SUPPLY = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__UUID = STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__MRID = STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__NAME = STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__DESCRIPTION = STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PATH_NAME = STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__MODELING_AUTHORITY_SET = STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__LOCAL_NAME = STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__ALIAS_NAME = STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__REPORTING_GROUP = STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__NETWORK_DATA_SETS = STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__LOCATION = STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__OUTAGE_SCHEDULE = STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PSR_EVENT = STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__SAFETY_DOCUMENTS = STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__ERP_ORGANISATION_ROLES = STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__CIRCUIT_SECTIONS = STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__MEASUREMENTS = STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__ASSETS = STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__SCHEDULE_STEPS = STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PSR_TYPE = STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PSR_LISTS = STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__OPERATING_SHARE = STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__CHANGE_ITEMS = STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__DOCUMENT_ROLES = STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__STEAM_TURBINES = STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__STEAM_SUPPLY_RATING = STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Low Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__LOW_POWER_LIMIT = STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Core Thermal TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC = STEAM_SUPPLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Integral Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__INTEGRAL_GAIN = STEAM_SUPPLY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pressure Setpoint GA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA = STEAM_SUPPLY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rf Aux1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX1 = STEAM_SUPPLY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rf Aux2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX2 = STEAM_SUPPLY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__LOWER_LIMIT = STEAM_SUPPLY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rod Pattern Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT = STEAM_SUPPLY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rf Aux8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX8 = STEAM_SUPPLY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rf Aux7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX7 = STEAM_SUPPLY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rod Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__ROD_PATTERN = STEAM_SUPPLY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rf Aux4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX4 = STEAM_SUPPLY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rf Aux3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX3 = STEAM_SUPPLY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rf Aux6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX6 = STEAM_SUPPLY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rf Aux5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__RF_AUX5 = STEAM_SUPPLY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Proportional Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN = STEAM_SUPPLY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__UPPER_LIMIT = STEAM_SUPPLY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>High Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT = STEAM_SUPPLY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pressure Setpoint TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2 = STEAM_SUPPLY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pressure Setpoint TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1 = STEAM_SUPPLY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pressure Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY__PRESSURE_LIMIT = STEAM_SUPPLY_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>BWR Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY_FEATURE_COUNT = STEAM_SUPPLY_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>BWR Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_STEAM_SUPPLY_OPERATION_COUNT = STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.DrumBoilerImpl <em>Drum Boiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.DrumBoilerImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getDrumBoiler()
	 * @generated
	 */
	int DRUM_BOILER = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__UUID = FOSSIL_STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__MRID = FOSSIL_STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__NAME = FOSSIL_STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__DESCRIPTION = FOSSIL_STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PATH_NAME = FOSSIL_STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__MODELING_AUTHORITY_SET = FOSSIL_STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__LOCAL_NAME = FOSSIL_STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__ALIAS_NAME = FOSSIL_STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__REPORTING_GROUP = FOSSIL_STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__NETWORK_DATA_SETS = FOSSIL_STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__LOCATION = FOSSIL_STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__OUTAGE_SCHEDULE = FOSSIL_STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PSR_EVENT = FOSSIL_STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__SAFETY_DOCUMENTS = FOSSIL_STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__ERP_ORGANISATION_ROLES = FOSSIL_STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CIRCUIT_SECTIONS = FOSSIL_STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__MEASUREMENTS = FOSSIL_STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__ASSETS = FOSSIL_STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__SCHEDULE_STEPS = FOSSIL_STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PSR_TYPE = FOSSIL_STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PSR_LISTS = FOSSIL_STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__OPERATING_SHARE = FOSSIL_STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CHANGE_ITEMS = FOSSIL_STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__DOCUMENT_ROLES = FOSSIL_STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__STEAM_TURBINES = FOSSIL_STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__STEAM_SUPPLY_RATING = FOSSIL_STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PRESSURE_CTRL_PG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG;

	/**
	 * The feature id for the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__SUPER_HEATER1_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY;

	/**
	 * The feature id for the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__FEED_WATER_PG = FOSSIL_STEAM_SUPPLY__FEED_WATER_PG;

	/**
	 * The feature id for the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CONTROL_TC = FOSSIL_STEAM_SUPPLY__CONTROL_TC;

	/**
	 * The feature id for the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__MECH_POWER_SENSOR_LAG = FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG;

	/**
	 * The feature id for the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__THROTTLE_PRESSURE_SP = FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP;

	/**
	 * The feature id for the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__MAX_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CONTROL_IC = FOSSIL_STEAM_SUPPLY__CONTROL_IC;

	/**
	 * The feature id for the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__MIN_ERROR_RATE_P = FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P;

	/**
	 * The feature id for the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__FUEL_DEMAND_LIMIT = FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT;

	/**
	 * The feature id for the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__SUPER_HEATER_PIPE_PD = FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PRESSURE_CTRL_DG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__AUX_POWER_VERSUS_VOLTAGE = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CONTROL_PC = FOSSIL_STEAM_SUPPLY__CONTROL_PC;

	/**
	 * The feature id for the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__FEED_WATER_TC = FOSSIL_STEAM_SUPPLY__FEED_WATER_TC;

	/**
	 * The feature id for the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CONTROL_ERROR_BIAS_P = FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P;

	/**
	 * The feature id for the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__FEED_WATER_IG = FOSSIL_STEAM_SUPPLY__FEED_WATER_IG;

	/**
	 * The feature id for the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PRESSURE_CTRL_IG = FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG;

	/**
	 * The feature id for the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__FUEL_SUPPLY_TC = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC;

	/**
	 * The feature id for the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__AUX_POWER_VERSUS_FREQUENCY = FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__PRESSURE_FEEDBACK = FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__FUEL_SUPPLY_DELAY = FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY;

	/**
	 * The feature id for the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__BOILER_CONTROL_MODE = FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__SUPER_HEATER2_CAPACITY = FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY;

	/**
	 * The feature id for the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CONTROL_PEB = FOSSIL_STEAM_SUPPLY__CONTROL_PEB;

	/**
	 * The feature id for the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__CONTROL_PED = FOSSIL_STEAM_SUPPLY__CONTROL_PED;

	/**
	 * The feature id for the '<em><b>Drum Boiler Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER__DRUM_BOILER_RATING = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drum Boiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER_FEATURE_COUNT = FOSSIL_STEAM_SUPPLY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drum Boiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUM_BOILER_OPERATION_COUNT = FOSSIL_STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl <em>Steam Turbine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSteamTurbine()
	 * @generated
	 */
	int STEAM_TURBINE = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__UUID = PRIME_MOVER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__MRID = PRIME_MOVER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__NAME = PRIME_MOVER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__DESCRIPTION = PRIME_MOVER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__PATH_NAME = PRIME_MOVER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__MODELING_AUTHORITY_SET = PRIME_MOVER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__LOCAL_NAME = PRIME_MOVER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__ALIAS_NAME = PRIME_MOVER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__REPORTING_GROUP = PRIME_MOVER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__NETWORK_DATA_SETS = PRIME_MOVER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__LOCATION = PRIME_MOVER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__OUTAGE_SCHEDULE = PRIME_MOVER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__PSR_EVENT = PRIME_MOVER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SAFETY_DOCUMENTS = PRIME_MOVER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__ERP_ORGANISATION_ROLES = PRIME_MOVER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__CIRCUIT_SECTIONS = PRIME_MOVER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__MEASUREMENTS = PRIME_MOVER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__ASSETS = PRIME_MOVER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SCHEDULE_STEPS = PRIME_MOVER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__PSR_TYPE = PRIME_MOVER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__PSR_LISTS = PRIME_MOVER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__OPERATING_SHARE = PRIME_MOVER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__CHANGE_ITEMS = PRIME_MOVER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__DOCUMENT_ROLES = PRIME_MOVER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Prime Mover Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__PRIME_MOVER_RATING = PRIME_MOVER__PRIME_MOVER_RATING;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SYNCHRONOUS_MACHINES = PRIME_MOVER__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Shaft2 Power LP1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT2_POWER_LP1 = PRIME_MOVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shaft2 Power LP2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT2_POWER_LP2 = PRIME_MOVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steam Supplys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__STEAM_SUPPLYS = PRIME_MOVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shaft2 Power HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT2_POWER_HP = PRIME_MOVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shaft1 Power IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT1_POWER_IP = PRIME_MOVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reheater1 TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__REHEATER1_TC = PRIME_MOVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shaft1 Power LP2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT1_POWER_LP2 = PRIME_MOVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Shaft1 Power LP1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT1_POWER_LP1 = PRIME_MOVER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Crossover TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__CROSSOVER_TC = PRIME_MOVER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Steam Chest TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__STEAM_CHEST_TC = PRIME_MOVER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Shaft1 Power HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT1_POWER_HP = PRIME_MOVER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Shaft2 Power IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__SHAFT2_POWER_IP = PRIME_MOVER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reheater2 TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE__REHEATER2_TC = PRIME_MOVER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Steam Turbine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE_FEATURE_COUNT = PRIME_MOVER_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Steam Turbine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEAM_TURBINE_OPERATION_COUNT = PRIME_MOVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl <em>PWR Steam Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getPWRSteamSupply()
	 * @generated
	 */
	int PWR_STEAM_SUPPLY = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__UUID = STEAM_SUPPLY__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__MRID = STEAM_SUPPLY__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__NAME = STEAM_SUPPLY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__DESCRIPTION = STEAM_SUPPLY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__PATH_NAME = STEAM_SUPPLY__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__MODELING_AUTHORITY_SET = STEAM_SUPPLY__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__LOCAL_NAME = STEAM_SUPPLY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__ALIAS_NAME = STEAM_SUPPLY__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__REPORTING_GROUP = STEAM_SUPPLY__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__NETWORK_DATA_SETS = STEAM_SUPPLY__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__LOCATION = STEAM_SUPPLY__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__OUTAGE_SCHEDULE = STEAM_SUPPLY__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__PSR_EVENT = STEAM_SUPPLY__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__SAFETY_DOCUMENTS = STEAM_SUPPLY__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__ERP_ORGANISATION_ROLES = STEAM_SUPPLY__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__CIRCUIT_SECTIONS = STEAM_SUPPLY__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__MEASUREMENTS = STEAM_SUPPLY__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__ASSETS = STEAM_SUPPLY__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__SCHEDULE_STEPS = STEAM_SUPPLY__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__PSR_TYPE = STEAM_SUPPLY__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__PSR_LISTS = STEAM_SUPPLY__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__OPERATING_SHARE = STEAM_SUPPLY__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__CHANGE_ITEMS = STEAM_SUPPLY__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__DOCUMENT_ROLES = STEAM_SUPPLY__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Steam Turbines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__STEAM_TURBINES = STEAM_SUPPLY__STEAM_TURBINES;

	/**
	 * The feature id for the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__STEAM_SUPPLY_RATING = STEAM_SUPPLY__STEAM_SUPPLY_RATING;

	/**
	 * The feature id for the '<em><b>Hot Leg To Cold Leg Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN = STEAM_SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pressure CG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__PRESSURE_CG = STEAM_SUPPLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hot Leg Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC = STEAM_SUPPLY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Steam Pressure Drop Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC = STEAM_SUPPLY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP = STEAM_SUPPLY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cold Leg FB Lead TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2 = STEAM_SUPPLY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cold Leg FB Lead TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1 = STEAM_SUPPLY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cold Leg Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC = STEAM_SUPPLY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Steam Flow FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__STEAM_FLOW_FG = STEAM_SUPPLY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Core HT Lag TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2 = STEAM_SUPPLY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Core HT Lag TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1 = STEAM_SUPPLY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Core Neutronics Eff TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC = STEAM_SUPPLY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Steam Pressure FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG = STEAM_SUPPLY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Feedback Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__FEEDBACK_FACTOR = STEAM_SUPPLY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Hot Leg Steam Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN = STEAM_SUPPLY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Core Neutronics HT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT = STEAM_SUPPLY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cold Leg FG1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__COLD_LEG_FG1 = STEAM_SUPPLY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Cold Leg FG2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__COLD_LEG_FG2 = STEAM_SUPPLY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Throttle Pressure Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR = STEAM_SUPPLY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Cold Leg FB Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC = STEAM_SUPPLY_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>PWR Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY_FEATURE_COUNT = STEAM_SUPPLY_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>PWR Steam Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWR_STEAM_SUPPLY_OPERATION_COUNT = STEAM_SUPPLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl <em>Hydro Turbine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getHydroTurbine()
	 * @generated
	 */
	int HYDRO_TURBINE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__UUID = PRIME_MOVER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__MRID = PRIME_MOVER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__NAME = PRIME_MOVER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__DESCRIPTION = PRIME_MOVER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__PATH_NAME = PRIME_MOVER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__MODELING_AUTHORITY_SET = PRIME_MOVER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__LOCAL_NAME = PRIME_MOVER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__ALIAS_NAME = PRIME_MOVER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__REPORTING_GROUP = PRIME_MOVER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__NETWORK_DATA_SETS = PRIME_MOVER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__LOCATION = PRIME_MOVER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__OUTAGE_SCHEDULE = PRIME_MOVER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__PSR_EVENT = PRIME_MOVER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__SAFETY_DOCUMENTS = PRIME_MOVER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__ERP_ORGANISATION_ROLES = PRIME_MOVER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__CIRCUIT_SECTIONS = PRIME_MOVER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__MEASUREMENTS = PRIME_MOVER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__ASSETS = PRIME_MOVER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__SCHEDULE_STEPS = PRIME_MOVER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__PSR_TYPE = PRIME_MOVER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__PSR_LISTS = PRIME_MOVER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__OPERATING_SHARE = PRIME_MOVER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__CHANGE_ITEMS = PRIME_MOVER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__DOCUMENT_ROLES = PRIME_MOVER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Prime Mover Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__PRIME_MOVER_RATING = PRIME_MOVER__PRIME_MOVER_RATING;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__SYNCHRONOUS_MACHINES = PRIME_MOVER__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Max Head Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__MAX_HEAD_MAX_P = PRIME_MOVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transient Droop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__TRANSIENT_DROOP_TIME = PRIME_MOVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gate Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__GATE_UPPER_LIMIT = PRIME_MOVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Head Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__MIN_HEAD_MAX_P = PRIME_MOVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Turbine Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__TURBINE_RATING = PRIME_MOVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Turbine Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__TURBINE_TYPE = PRIME_MOVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Speed Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__SPEED_RATING = PRIME_MOVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gate Rate Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__GATE_RATE_LIMIT = PRIME_MOVER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Water Starting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__WATER_STARTING_TIME = PRIME_MOVER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transient Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__TRANSIENT_REGULATION = PRIME_MOVER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Speed Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE__SPEED_REGULATION = PRIME_MOVER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Hydro Turbine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE_FEATURE_COUNT = PRIME_MOVER_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Hydro Turbine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_TURBINE_OPERATION_COUNT = PRIME_MOVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType <em>Turbine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getTurbineType()
	 * @generated
	 */
	int TURBINE_TYPE = 13;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode <em>Boiler Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getBoilerControlMode()
	 * @generated
	 */
	int BOILER_CONTROL_MODE = 14;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.Supercritical <em>Supercritical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supercritical</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.Supercritical
	 * @generated
	 */
	EClass getSupercritical();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combustion Turbine</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine
	 * @generated
	 */
	EClass getCombustionTurbine();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Versus Frequency</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_AuxPowerVersusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Variation By Temp</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_PowerVariationByTemp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Temp</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_AmbientTemp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Temp</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_ReferenceTemp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heat Recovery Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_HeatRecoveryFlag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Versus Frequency</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_CapabilityVersusFrequency();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heat Recovery Boiler</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EReference getCombustionTurbine_HeatRecoveryBoiler();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CT Temp Active Power Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EReference getCombustionTurbine_CTTempActivePowerCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Versus Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_AuxPowerVersusVoltage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Air Compressor</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EReference getCombustionTurbine_AirCompressor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Constant</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant()
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	EAttribute getCombustionTurbine_TimeConstant();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply <em>Fossil Steam Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fossil Steam Supply</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply
	 * @generated
	 */
	EClass getFossilSteamSupply();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Ctrl PG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_PressureCtrlPG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Heater1 Capacity</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_SuperHeater1Capacity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Water PG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_FeedWaterPG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ControlTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mech Power Sensor Lag</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_MechPowerSensorLag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Pressure SP</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ThrottlePressureSP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Error Rate P</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_MaxErrorRateP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control IC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ControlIC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Error Rate P</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_MinErrorRateP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Demand Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_FuelDemandLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Heater Pipe PD</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_SuperHeaterPipePD();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Ctrl DG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_PressureCtrlDG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Versus Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_AuxPowerVersusVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control PC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ControlPC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Water TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_FeedWaterTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Error Bias P</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ControlErrorBiasP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Water IG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_FeedWaterIG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Ctrl IG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_PressureCtrlIG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Supply TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_FuelSupplyTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Versus Frequency</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_AuxPowerVersusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Feedback</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_PressureFeedback();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Supply Delay</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_FuelSupplyDelay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boiler Control Mode</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_BoilerControlMode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Heater2 Capacity</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_SuperHeater2Capacity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control PEB</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ControlPEB();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control PED</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED()
	 * @see #getFossilSteamSupply()
	 * @generated
	 */
	EAttribute getFossilSteamSupply_ControlPED();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CT Temp Active Power Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve
	 * @generated
	 */
	EClass getCTTempActivePowerCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combustion Turbine</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine()
	 * @see #getCTTempActivePowerCurve()
	 * @generated
	 */
	EReference getCTTempActivePowerCurve_CombustionTurbine();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.Subcritical <em>Subcritical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcritical</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.Subcritical
	 * @generated
	 */
	EClass getSubcritical();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply <em>Steam Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steam Supply</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply
	 * @generated
	 */
	EClass getSteamSupply();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Steam Turbines</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines()
	 * @see #getSteamSupply()
	 * @generated
	 */
	EReference getSteamSupply_SteamTurbines();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steam Supply Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating()
	 * @see #getSteamSupply()
	 * @generated
	 */
	EAttribute getSteamSupply_SteamSupplyRating();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover <em>Prime Mover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prime Mover</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover
	 * @generated
	 */
	EClass getPrimeMover();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prime Mover Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating()
	 * @see #getPrimeMover()
	 * @generated
	 */
	EAttribute getPrimeMover_PrimeMoverRating();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronous Machines</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines()
	 * @see #getPrimeMover()
	 * @generated
	 */
	EReference getPrimeMover_SynchronousMachines();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler <em>Heat Recovery Boiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heat Recovery Boiler</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler
	 * @generated
	 */
	EClass getHeatRecoveryBoiler();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combustion Turbines</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines()
	 * @see #getHeatRecoveryBoiler()
	 * @generated
	 */
	EReference getHeatRecoveryBoiler_CombustionTurbines();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steam Supply Rating2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2()
	 * @see #getHeatRecoveryBoiler()
	 * @generated
	 */
	EAttribute getHeatRecoveryBoiler_SteamSupplyRating2();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply <em>BWR Steam Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWR Steam Supply</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply
	 * @generated
	 */
	EClass getBWRSteamSupply();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowPowerLimit <em>Low Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Power Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowPowerLimit()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_LowPowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getInCoreThermalTC <em>In Core Thermal TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Core Thermal TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getInCoreThermalTC()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_InCoreThermalTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getIntegralGain <em>Integral Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integral Gain</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getIntegralGain()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_IntegralGain();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointGA <em>Pressure Setpoint GA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Setpoint GA</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointGA()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_PressureSetpointGA();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux1 <em>Rf Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux1()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux2 <em>Rf Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux2()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowerLimit()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPatternConstant <em>Rod Pattern Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rod Pattern Constant</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPatternConstant()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RodPatternConstant();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux8 <em>Rf Aux8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux8</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux8()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux8();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux7 <em>Rf Aux7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux7</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux7()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux7();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPattern <em>Rod Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rod Pattern</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPattern()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RodPattern();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux4 <em>Rf Aux4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux4</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux4()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux4();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux3 <em>Rf Aux3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux3</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux3()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux6 <em>Rf Aux6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux6</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux6()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux6();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux5 <em>Rf Aux5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rf Aux5</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux5()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_RfAux5();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getProportionalGain <em>Proportional Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proportional Gain</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getProportionalGain()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_ProportionalGain();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getUpperLimit()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_UpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getHighPowerLimit <em>High Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Power Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getHighPowerLimit()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_HighPowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC2 <em>Pressure Setpoint TC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Setpoint TC2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC2()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_PressureSetpointTC2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC1 <em>Pressure Setpoint TC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Setpoint TC1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC1()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_PressureSetpointTC1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureLimit <em>Pressure Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureLimit()
	 * @see #getBWRSteamSupply()
	 * @generated
	 */
	EAttribute getBWRSteamSupply_PressureLimit();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler <em>Drum Boiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drum Boiler</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler
	 * @generated
	 */
	EClass getDrumBoiler();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drum Boiler Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating()
	 * @see #getDrumBoiler()
	 * @generated
	 */
	EAttribute getDrumBoiler_DrumBoilerRating();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine <em>Steam Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steam Turbine</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine
	 * @generated
	 */
	EClass getSteamTurbine();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft2 Power LP1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft2PowerLP1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft2 Power LP2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft2PowerLP2();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Steam Supplys</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EReference getSteamTurbine_SteamSupplys();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft2 Power HP</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft2PowerHP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft1 Power IP</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft1PowerIP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reheater1 TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Reheater1TC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft1 Power LP2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft1PowerLP2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft1 Power LP1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft1PowerLP1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossover TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_CrossoverTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steam Chest TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_SteamChestTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft1 Power HP</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft1PowerHP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaft2 Power IP</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Shaft2PowerIP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reheater2 TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC()
	 * @see #getSteamTurbine()
	 * @generated
	 */
	EAttribute getSteamTurbine_Reheater2TC();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply <em>PWR Steam Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PWR Steam Supply</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply
	 * @generated
	 */
	EClass getPWRSteamSupply();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Leg To Cold Leg Gain</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_HotLegToColdLegGain();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure CG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_PressureCG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Leg Lag TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_HotLegLagTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steam Pressure Drop Lag TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_SteamPressureDropLagTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Pressure SP</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ThrottlePressureSP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cold Leg FB Lead TC2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ColdLegFBLeadTC2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cold Leg FB Lead TC1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ColdLegFBLeadTC1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cold Leg Lag TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ColdLegLagTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steam Flow FG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_SteamFlowFG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core HT Lag TC2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_CoreHTLagTC2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core HT Lag TC1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_CoreHTLagTC1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Neutronics Eff TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_CoreNeutronicsEffTC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steam Pressure FG</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_SteamPressureFG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_FeedbackFactor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Leg Steam Gain</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_HotLegSteamGain();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Neutronics HT</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_CoreNeutronicsHT();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cold Leg FG1</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ColdLegFG1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cold Leg FG2</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ColdLegFG2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Pressure Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ThrottlePressureFactor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cold Leg FB Lag TC</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC()
	 * @see #getPWRSteamSupply()
	 * @generated
	 */
	EAttribute getPWRSteamSupply_ColdLegFBLagTC();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine <em>Hydro Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Turbine</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine
	 * @generated
	 */
	EClass getHydroTurbine();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Head Max P</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_MaxHeadMaxP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Droop Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_TransientDroopTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate Upper Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_GateUpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Head Max P</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_MinHeadMaxP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turbine Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_TurbineRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turbine Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_TurbineType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_SpeedRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate Rate Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_GateRateLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Starting Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_WaterStartingTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Regulation</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_TransientRegulation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Regulation</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation()
	 * @see #getHydroTurbine()
	 * @generated
	 */
	EAttribute getHydroTurbine_SpeedRegulation();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType <em>Turbine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Turbine Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType
	 * @generated
	 */
	EEnum getTurbineType();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode <em>Boiler Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boiler Control Mode</em>'.
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode
	 * @generated
	 */
	EEnum getBoilerControlMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenerationDynamicsFactory getGenerationDynamicsFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SupercriticalImpl <em>Supercritical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SupercriticalImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSupercritical()
		 * @generated
		 */
		EClass SUPERCRITICAL = eINSTANCE.getSupercritical();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl <em>Combustion Turbine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CombustionTurbineImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getCombustionTurbine()
		 * @generated
		 */
		EClass COMBUSTION_TURBINE = eINSTANCE.getCombustionTurbine();

		/**
		 * The meta object literal for the '<em><b>Aux Power Versus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY = eINSTANCE.getCombustionTurbine_AuxPowerVersusFrequency();

		/**
		 * The meta object literal for the '<em><b>Power Variation By Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP = eINSTANCE.getCombustionTurbine_PowerVariationByTemp();

		/**
		 * The meta object literal for the '<em><b>Ambient Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__AMBIENT_TEMP = eINSTANCE.getCombustionTurbine_AmbientTemp();

		/**
		 * The meta object literal for the '<em><b>Reference Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__REFERENCE_TEMP = eINSTANCE.getCombustionTurbine_ReferenceTemp();

		/**
		 * The meta object literal for the '<em><b>Heat Recovery Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG = eINSTANCE.getCombustionTurbine_HeatRecoveryFlag();

		/**
		 * The meta object literal for the '<em><b>Capability Versus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY = eINSTANCE.getCombustionTurbine_CapabilityVersusFrequency();

		/**
		 * The meta object literal for the '<em><b>Heat Recovery Boiler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER = eINSTANCE.getCombustionTurbine_HeatRecoveryBoiler();

		/**
		 * The meta object literal for the '<em><b>CT Temp Active Power Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE = eINSTANCE.getCombustionTurbine_CTTempActivePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Aux Power Versus Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE = eINSTANCE.getCombustionTurbine_AuxPowerVersusVoltage();

		/**
		 * The meta object literal for the '<em><b>Air Compressor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBUSTION_TURBINE__AIR_COMPRESSOR = eINSTANCE.getCombustionTurbine_AirCompressor();

		/**
		 * The meta object literal for the '<em><b>Time Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBUSTION_TURBINE__TIME_CONSTANT = eINSTANCE.getCombustionTurbine_TimeConstant();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl <em>Fossil Steam Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.FossilSteamSupplyImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getFossilSteamSupply()
		 * @generated
		 */
		EClass FOSSIL_STEAM_SUPPLY = eINSTANCE.getFossilSteamSupply();

		/**
		 * The meta object literal for the '<em><b>Pressure Ctrl PG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG = eINSTANCE.getFossilSteamSupply_PressureCtrlPG();

		/**
		 * The meta object literal for the '<em><b>Super Heater1 Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY = eINSTANCE.getFossilSteamSupply_SuperHeater1Capacity();

		/**
		 * The meta object literal for the '<em><b>Feed Water PG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__FEED_WATER_PG = eINSTANCE.getFossilSteamSupply_FeedWaterPG();

		/**
		 * The meta object literal for the '<em><b>Control TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__CONTROL_TC = eINSTANCE.getFossilSteamSupply_ControlTC();

		/**
		 * The meta object literal for the '<em><b>Mech Power Sensor Lag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG = eINSTANCE.getFossilSteamSupply_MechPowerSensorLag();

		/**
		 * The meta object literal for the '<em><b>Throttle Pressure SP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP = eINSTANCE.getFossilSteamSupply_ThrottlePressureSP();

		/**
		 * The meta object literal for the '<em><b>Max Error Rate P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P = eINSTANCE.getFossilSteamSupply_MaxErrorRateP();

		/**
		 * The meta object literal for the '<em><b>Control IC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__CONTROL_IC = eINSTANCE.getFossilSteamSupply_ControlIC();

		/**
		 * The meta object literal for the '<em><b>Min Error Rate P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P = eINSTANCE.getFossilSteamSupply_MinErrorRateP();

		/**
		 * The meta object literal for the '<em><b>Fuel Demand Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT = eINSTANCE.getFossilSteamSupply_FuelDemandLimit();

		/**
		 * The meta object literal for the '<em><b>Super Heater Pipe PD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD = eINSTANCE.getFossilSteamSupply_SuperHeaterPipePD();

		/**
		 * The meta object literal for the '<em><b>Pressure Ctrl DG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG = eINSTANCE.getFossilSteamSupply_PressureCtrlDG();

		/**
		 * The meta object literal for the '<em><b>Aux Power Versus Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE = eINSTANCE.getFossilSteamSupply_AuxPowerVersusVoltage();

		/**
		 * The meta object literal for the '<em><b>Control PC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__CONTROL_PC = eINSTANCE.getFossilSteamSupply_ControlPC();

		/**
		 * The meta object literal for the '<em><b>Feed Water TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__FEED_WATER_TC = eINSTANCE.getFossilSteamSupply_FeedWaterTC();

		/**
		 * The meta object literal for the '<em><b>Control Error Bias P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P = eINSTANCE.getFossilSteamSupply_ControlErrorBiasP();

		/**
		 * The meta object literal for the '<em><b>Feed Water IG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__FEED_WATER_IG = eINSTANCE.getFossilSteamSupply_FeedWaterIG();

		/**
		 * The meta object literal for the '<em><b>Pressure Ctrl IG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG = eINSTANCE.getFossilSteamSupply_PressureCtrlIG();

		/**
		 * The meta object literal for the '<em><b>Fuel Supply TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC = eINSTANCE.getFossilSteamSupply_FuelSupplyTC();

		/**
		 * The meta object literal for the '<em><b>Aux Power Versus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY = eINSTANCE.getFossilSteamSupply_AuxPowerVersusFrequency();

		/**
		 * The meta object literal for the '<em><b>Pressure Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK = eINSTANCE.getFossilSteamSupply_PressureFeedback();

		/**
		 * The meta object literal for the '<em><b>Fuel Supply Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY = eINSTANCE.getFossilSteamSupply_FuelSupplyDelay();

		/**
		 * The meta object literal for the '<em><b>Boiler Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE = eINSTANCE.getFossilSteamSupply_BoilerControlMode();

		/**
		 * The meta object literal for the '<em><b>Super Heater2 Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY = eINSTANCE.getFossilSteamSupply_SuperHeater2Capacity();

		/**
		 * The meta object literal for the '<em><b>Control PEB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__CONTROL_PEB = eINSTANCE.getFossilSteamSupply_ControlPEB();

		/**
		 * The meta object literal for the '<em><b>Control PED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOSSIL_STEAM_SUPPLY__CONTROL_PED = eINSTANCE.getFossilSteamSupply_ControlPED();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CTTempActivePowerCurveImpl <em>CT Temp Active Power Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.CTTempActivePowerCurveImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getCTTempActivePowerCurve()
		 * @generated
		 */
		EClass CT_TEMP_ACTIVE_POWER_CURVE = eINSTANCE.getCTTempActivePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Combustion Turbine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE = eINSTANCE.getCTTempActivePowerCurve_CombustionTurbine();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SubcriticalImpl <em>Subcritical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SubcriticalImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSubcritical()
		 * @generated
		 */
		EClass SUBCRITICAL = eINSTANCE.getSubcritical();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamSupplyImpl <em>Steam Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamSupplyImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSteamSupply()
		 * @generated
		 */
		EClass STEAM_SUPPLY = eINSTANCE.getSteamSupply();

		/**
		 * The meta object literal for the '<em><b>Steam Turbines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEAM_SUPPLY__STEAM_TURBINES = eINSTANCE.getSteamSupply_SteamTurbines();

		/**
		 * The meta object literal for the '<em><b>Steam Supply Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_SUPPLY__STEAM_SUPPLY_RATING = eINSTANCE.getSteamSupply_SteamSupplyRating();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PrimeMoverImpl <em>Prime Mover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PrimeMoverImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getPrimeMover()
		 * @generated
		 */
		EClass PRIME_MOVER = eINSTANCE.getPrimeMover();

		/**
		 * The meta object literal for the '<em><b>Prime Mover Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIME_MOVER__PRIME_MOVER_RATING = eINSTANCE.getPrimeMover_PrimeMoverRating();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIME_MOVER__SYNCHRONOUS_MACHINES = eINSTANCE.getPrimeMover_SynchronousMachines();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HeatRecoveryBoilerImpl <em>Heat Recovery Boiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HeatRecoveryBoilerImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getHeatRecoveryBoiler()
		 * @generated
		 */
		EClass HEAT_RECOVERY_BOILER = eINSTANCE.getHeatRecoveryBoiler();

		/**
		 * The meta object literal for the '<em><b>Combustion Turbines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES = eINSTANCE.getHeatRecoveryBoiler_CombustionTurbines();

		/**
		 * The meta object literal for the '<em><b>Steam Supply Rating2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2 = eINSTANCE.getHeatRecoveryBoiler_SteamSupplyRating2();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl <em>BWR Steam Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.BWRSteamSupplyImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getBWRSteamSupply()
		 * @generated
		 */
		EClass BWR_STEAM_SUPPLY = eINSTANCE.getBWRSteamSupply();

		/**
		 * The meta object literal for the '<em><b>Low Power Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__LOW_POWER_LIMIT = eINSTANCE.getBWRSteamSupply_LowPowerLimit();

		/**
		 * The meta object literal for the '<em><b>In Core Thermal TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC = eINSTANCE.getBWRSteamSupply_InCoreThermalTC();

		/**
		 * The meta object literal for the '<em><b>Integral Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__INTEGRAL_GAIN = eINSTANCE.getBWRSteamSupply_IntegralGain();

		/**
		 * The meta object literal for the '<em><b>Pressure Setpoint GA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA = eINSTANCE.getBWRSteamSupply_PressureSetpointGA();

		/**
		 * The meta object literal for the '<em><b>Rf Aux1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX1 = eINSTANCE.getBWRSteamSupply_RfAux1();

		/**
		 * The meta object literal for the '<em><b>Rf Aux2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX2 = eINSTANCE.getBWRSteamSupply_RfAux2();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__LOWER_LIMIT = eINSTANCE.getBWRSteamSupply_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Rod Pattern Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT = eINSTANCE.getBWRSteamSupply_RodPatternConstant();

		/**
		 * The meta object literal for the '<em><b>Rf Aux8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX8 = eINSTANCE.getBWRSteamSupply_RfAux8();

		/**
		 * The meta object literal for the '<em><b>Rf Aux7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX7 = eINSTANCE.getBWRSteamSupply_RfAux7();

		/**
		 * The meta object literal for the '<em><b>Rod Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__ROD_PATTERN = eINSTANCE.getBWRSteamSupply_RodPattern();

		/**
		 * The meta object literal for the '<em><b>Rf Aux4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX4 = eINSTANCE.getBWRSteamSupply_RfAux4();

		/**
		 * The meta object literal for the '<em><b>Rf Aux3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX3 = eINSTANCE.getBWRSteamSupply_RfAux3();

		/**
		 * The meta object literal for the '<em><b>Rf Aux6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX6 = eINSTANCE.getBWRSteamSupply_RfAux6();

		/**
		 * The meta object literal for the '<em><b>Rf Aux5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__RF_AUX5 = eINSTANCE.getBWRSteamSupply_RfAux5();

		/**
		 * The meta object literal for the '<em><b>Proportional Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN = eINSTANCE.getBWRSteamSupply_ProportionalGain();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__UPPER_LIMIT = eINSTANCE.getBWRSteamSupply_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>High Power Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT = eINSTANCE.getBWRSteamSupply_HighPowerLimit();

		/**
		 * The meta object literal for the '<em><b>Pressure Setpoint TC2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2 = eINSTANCE.getBWRSteamSupply_PressureSetpointTC2();

		/**
		 * The meta object literal for the '<em><b>Pressure Setpoint TC1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1 = eINSTANCE.getBWRSteamSupply_PressureSetpointTC1();

		/**
		 * The meta object literal for the '<em><b>Pressure Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWR_STEAM_SUPPLY__PRESSURE_LIMIT = eINSTANCE.getBWRSteamSupply_PressureLimit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.DrumBoilerImpl <em>Drum Boiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.DrumBoilerImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getDrumBoiler()
		 * @generated
		 */
		EClass DRUM_BOILER = eINSTANCE.getDrumBoiler();

		/**
		 * The meta object literal for the '<em><b>Drum Boiler Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRUM_BOILER__DRUM_BOILER_RATING = eINSTANCE.getDrumBoiler_DrumBoilerRating();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl <em>Steam Turbine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getSteamTurbine()
		 * @generated
		 */
		EClass STEAM_TURBINE = eINSTANCE.getSteamTurbine();

		/**
		 * The meta object literal for the '<em><b>Shaft2 Power LP1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT2_POWER_LP1 = eINSTANCE.getSteamTurbine_Shaft2PowerLP1();

		/**
		 * The meta object literal for the '<em><b>Shaft2 Power LP2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT2_POWER_LP2 = eINSTANCE.getSteamTurbine_Shaft2PowerLP2();

		/**
		 * The meta object literal for the '<em><b>Steam Supplys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEAM_TURBINE__STEAM_SUPPLYS = eINSTANCE.getSteamTurbine_SteamSupplys();

		/**
		 * The meta object literal for the '<em><b>Shaft2 Power HP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT2_POWER_HP = eINSTANCE.getSteamTurbine_Shaft2PowerHP();

		/**
		 * The meta object literal for the '<em><b>Shaft1 Power IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT1_POWER_IP = eINSTANCE.getSteamTurbine_Shaft1PowerIP();

		/**
		 * The meta object literal for the '<em><b>Reheater1 TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__REHEATER1_TC = eINSTANCE.getSteamTurbine_Reheater1TC();

		/**
		 * The meta object literal for the '<em><b>Shaft1 Power LP2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT1_POWER_LP2 = eINSTANCE.getSteamTurbine_Shaft1PowerLP2();

		/**
		 * The meta object literal for the '<em><b>Shaft1 Power LP1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT1_POWER_LP1 = eINSTANCE.getSteamTurbine_Shaft1PowerLP1();

		/**
		 * The meta object literal for the '<em><b>Crossover TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__CROSSOVER_TC = eINSTANCE.getSteamTurbine_CrossoverTC();

		/**
		 * The meta object literal for the '<em><b>Steam Chest TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__STEAM_CHEST_TC = eINSTANCE.getSteamTurbine_SteamChestTC();

		/**
		 * The meta object literal for the '<em><b>Shaft1 Power HP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT1_POWER_HP = eINSTANCE.getSteamTurbine_Shaft1PowerHP();

		/**
		 * The meta object literal for the '<em><b>Shaft2 Power IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__SHAFT2_POWER_IP = eINSTANCE.getSteamTurbine_Shaft2PowerIP();

		/**
		 * The meta object literal for the '<em><b>Reheater2 TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEAM_TURBINE__REHEATER2_TC = eINSTANCE.getSteamTurbine_Reheater2TC();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl <em>PWR Steam Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.PWRSteamSupplyImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getPWRSteamSupply()
		 * @generated
		 */
		EClass PWR_STEAM_SUPPLY = eINSTANCE.getPWRSteamSupply();

		/**
		 * The meta object literal for the '<em><b>Hot Leg To Cold Leg Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN = eINSTANCE.getPWRSteamSupply_HotLegToColdLegGain();

		/**
		 * The meta object literal for the '<em><b>Pressure CG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__PRESSURE_CG = eINSTANCE.getPWRSteamSupply_PressureCG();

		/**
		 * The meta object literal for the '<em><b>Hot Leg Lag TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC = eINSTANCE.getPWRSteamSupply_HotLegLagTC();

		/**
		 * The meta object literal for the '<em><b>Steam Pressure Drop Lag TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC = eINSTANCE.getPWRSteamSupply_SteamPressureDropLagTC();

		/**
		 * The meta object literal for the '<em><b>Throttle Pressure SP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP = eINSTANCE.getPWRSteamSupply_ThrottlePressureSP();

		/**
		 * The meta object literal for the '<em><b>Cold Leg FB Lead TC2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2 = eINSTANCE.getPWRSteamSupply_ColdLegFBLeadTC2();

		/**
		 * The meta object literal for the '<em><b>Cold Leg FB Lead TC1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1 = eINSTANCE.getPWRSteamSupply_ColdLegFBLeadTC1();

		/**
		 * The meta object literal for the '<em><b>Cold Leg Lag TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC = eINSTANCE.getPWRSteamSupply_ColdLegLagTC();

		/**
		 * The meta object literal for the '<em><b>Steam Flow FG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__STEAM_FLOW_FG = eINSTANCE.getPWRSteamSupply_SteamFlowFG();

		/**
		 * The meta object literal for the '<em><b>Core HT Lag TC2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2 = eINSTANCE.getPWRSteamSupply_CoreHTLagTC2();

		/**
		 * The meta object literal for the '<em><b>Core HT Lag TC1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1 = eINSTANCE.getPWRSteamSupply_CoreHTLagTC1();

		/**
		 * The meta object literal for the '<em><b>Core Neutronics Eff TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC = eINSTANCE.getPWRSteamSupply_CoreNeutronicsEffTC();

		/**
		 * The meta object literal for the '<em><b>Steam Pressure FG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG = eINSTANCE.getPWRSteamSupply_SteamPressureFG();

		/**
		 * The meta object literal for the '<em><b>Feedback Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__FEEDBACK_FACTOR = eINSTANCE.getPWRSteamSupply_FeedbackFactor();

		/**
		 * The meta object literal for the '<em><b>Hot Leg Steam Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN = eINSTANCE.getPWRSteamSupply_HotLegSteamGain();

		/**
		 * The meta object literal for the '<em><b>Core Neutronics HT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT = eINSTANCE.getPWRSteamSupply_CoreNeutronicsHT();

		/**
		 * The meta object literal for the '<em><b>Cold Leg FG1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__COLD_LEG_FG1 = eINSTANCE.getPWRSteamSupply_ColdLegFG1();

		/**
		 * The meta object literal for the '<em><b>Cold Leg FG2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__COLD_LEG_FG2 = eINSTANCE.getPWRSteamSupply_ColdLegFG2();

		/**
		 * The meta object literal for the '<em><b>Throttle Pressure Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR = eINSTANCE.getPWRSteamSupply_ThrottlePressureFactor();

		/**
		 * The meta object literal for the '<em><b>Cold Leg FB Lag TC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC = eINSTANCE.getPWRSteamSupply_ColdLegFBLagTC();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl <em>Hydro Turbine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HydroTurbineImpl
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getHydroTurbine()
		 * @generated
		 */
		EClass HYDRO_TURBINE = eINSTANCE.getHydroTurbine();

		/**
		 * The meta object literal for the '<em><b>Max Head Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__MAX_HEAD_MAX_P = eINSTANCE.getHydroTurbine_MaxHeadMaxP();

		/**
		 * The meta object literal for the '<em><b>Transient Droop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__TRANSIENT_DROOP_TIME = eINSTANCE.getHydroTurbine_TransientDroopTime();

		/**
		 * The meta object literal for the '<em><b>Gate Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__GATE_UPPER_LIMIT = eINSTANCE.getHydroTurbine_GateUpperLimit();

		/**
		 * The meta object literal for the '<em><b>Min Head Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__MIN_HEAD_MAX_P = eINSTANCE.getHydroTurbine_MinHeadMaxP();

		/**
		 * The meta object literal for the '<em><b>Turbine Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__TURBINE_RATING = eINSTANCE.getHydroTurbine_TurbineRating();

		/**
		 * The meta object literal for the '<em><b>Turbine Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__TURBINE_TYPE = eINSTANCE.getHydroTurbine_TurbineType();

		/**
		 * The meta object literal for the '<em><b>Speed Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__SPEED_RATING = eINSTANCE.getHydroTurbine_SpeedRating();

		/**
		 * The meta object literal for the '<em><b>Gate Rate Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__GATE_RATE_LIMIT = eINSTANCE.getHydroTurbine_GateRateLimit();

		/**
		 * The meta object literal for the '<em><b>Water Starting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__WATER_STARTING_TIME = eINSTANCE.getHydroTurbine_WaterStartingTime();

		/**
		 * The meta object literal for the '<em><b>Transient Regulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__TRANSIENT_REGULATION = eINSTANCE.getHydroTurbine_TransientRegulation();

		/**
		 * The meta object literal for the '<em><b>Speed Regulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRO_TURBINE__SPEED_REGULATION = eINSTANCE.getHydroTurbine_SpeedRegulation();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType <em>Turbine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.TurbineType
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getTurbineType()
		 * @generated
		 */
		EEnum TURBINE_TYPE = eINSTANCE.getTurbineType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode <em>Boiler Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode
		 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl#getBoilerControlMode()
		 * @generated
		 */
		EEnum BOILER_CONTROL_MODE = eINSTANCE.getBoilerControlMode();

	}

} //GenerationDynamicsPackage
