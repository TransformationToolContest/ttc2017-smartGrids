/**
 */
package gluemodel.CIM.IEC61968.WiresExt;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Wires.WiresPackage;

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
 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package contains the information classes that extend IEC61970::Wires package with power system resources required for distribution network modelling, including unbalanced networks.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package contains the information classes that extend IEC61970::Wires package with power system resources required for distribution network modelling, including unbalanced networks.'"
 * @generated
 */
public interface WiresExtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WiresExt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#WiresExt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimWiresExt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresExtPackage eINSTANCE = gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl <em>Distribution Transformer Winding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionTransformerWinding()
	 * @generated
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__LOCAL_NAME = CorePackage.CONDUCTING_EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__CIRCUIT_SECTIONS = CorePackage.CONDUCTING_EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__NORMA_ILY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PHASES = CorePackage.CONDUCTING_EQUIPMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__ELECTRICAL_ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>From Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__XGROUND = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pi Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__RGROUND = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Winding Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Distribution Transformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Distribution Transformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_WINDING_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl <em>Per Length Phase Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getPerLengthPhaseImpedance()
	 * @generated
	 */
	int PER_LENGTH_PHASE_IMPEDANCE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Impedance Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Per Length Phase Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Per Length Phase Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_PHASE_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl <em>Distribution Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionTapChanger()
	 * @generated
	 */
	int DISTRIBUTION_TAP_CHANGER = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__UUID = WiresPackage.RATIO_TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__MRID = WiresPackage.RATIO_TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__NAME = WiresPackage.RATIO_TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__DESCRIPTION = WiresPackage.RATIO_TAP_CHANGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__PATH_NAME = WiresPackage.RATIO_TAP_CHANGER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__MODELING_AUTHORITY_SET = WiresPackage.RATIO_TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LOCAL_NAME = WiresPackage.RATIO_TAP_CHANGER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__ALIAS_NAME = WiresPackage.RATIO_TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__REPORTING_GROUP = WiresPackage.RATIO_TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__NETWORK_DATA_SETS = WiresPackage.RATIO_TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LOCATION = WiresPackage.RATIO_TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__OUTAGE_SCHEDULE = WiresPackage.RATIO_TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__PSR_EVENT = WiresPackage.RATIO_TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__SAFETY_DOCUMENTS = WiresPackage.RATIO_TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__ERP_ORGANISATION_ROLES = WiresPackage.RATIO_TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__CIRCUIT_SECTIONS = WiresPackage.RATIO_TAP_CHANGER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__MEASUREMENTS = WiresPackage.RATIO_TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__ASSETS = WiresPackage.RATIO_TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__SCHEDULE_STEPS = WiresPackage.RATIO_TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__PSR_TYPE = WiresPackage.RATIO_TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__PSR_LISTS = WiresPackage.RATIO_TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__OPERATING_SHARE = WiresPackage.RATIO_TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__CHANGE_ITEMS = WiresPackage.RATIO_TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__DOCUMENT_ROLES = WiresPackage.RATIO_TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__INITIAL_DELAY = WiresPackage.RATIO_TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__SUBSEQUENT_DELAY = WiresPackage.RATIO_TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__TAP_SCHEDULES = WiresPackage.RATIO_TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LTC_FLAG = WiresPackage.RATIO_TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__REGULATION_STATUS = WiresPackage.RATIO_TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__REGULATING_CONTROL = WiresPackage.RATIO_TAP_CHANGER__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__NEUTRAL_STEP = WiresPackage.RATIO_TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__NEUTRAL_U = WiresPackage.RATIO_TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LOW_STEP = WiresPackage.RATIO_TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__HIGH_STEP = WiresPackage.RATIO_TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__STEP_VOLTAGE_INCREMENT = WiresPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT;

	/**
	 * The feature id for the '<em><b>Impedance Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__IMPEDANCE_VARIATION_CURVE = WiresPackage.RATIO_TAP_CHANGER__IMPEDANCE_VARIATION_CURVE;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__SV_TAP_STEP = WiresPackage.RATIO_TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__NORMAL_STEP = WiresPackage.RATIO_TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ratio Variation Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__RATIO_VARIATION_CURVE = WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE;

	/**
	 * The feature id for the '<em><b>Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__TRANSFORMER_WINDING = WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING;

	/**
	 * The feature id for the '<em><b>Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__WINDING = WiresPackage.RATIO_TAP_CHANGER__WINDING;

	/**
	 * The feature id for the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__TCUL_CONTROL_MODE = WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Pt Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__PT_RATIO = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reverse Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reverse Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ct Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__CT_RATING = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LINE_DROP_R = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Band Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LINE_DROP_X = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ct Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__CT_RATIO = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Line Drop Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Monitored Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Distribution Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER_FEATURE_COUNT = WiresPackage.RATIO_TAP_CHANGER_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Distribution Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TAP_CHANGER_OPERATION_COUNT = WiresPackage.RATIO_TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthSequenceImpedanceImpl <em>Per Length Sequence Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthSequenceImpedanceImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getPerLengthSequenceImpedance()
	 * @generated
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__BCH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__CONDUCTOR_SEGMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__R = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__GCH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Per Length Sequence Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Per Length Sequence Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_LENGTH_SEQUENCE_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.TransformerBankImpl <em>Transformer Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.TransformerBankImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getTransformerBank()
	 * @generated
	 */
	int TRANSFORMER_BANK = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Vector Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__VECTOR_GROUP = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK__TRANSFORMERS = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformer Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transformer Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_BANK_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl <em>Distribution Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionLineSegment()
	 * @generated
	 */
	int DISTRIBUTION_LINE_SEGMENT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__UUID = WiresPackage.AC_LINE_SEGMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__MRID = WiresPackage.AC_LINE_SEGMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__NAME = WiresPackage.AC_LINE_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__DESCRIPTION = WiresPackage.AC_LINE_SEGMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PATH_NAME = WiresPackage.AC_LINE_SEGMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__MODELING_AUTHORITY_SET = WiresPackage.AC_LINE_SEGMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__LOCAL_NAME = WiresPackage.AC_LINE_SEGMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__ALIAS_NAME = WiresPackage.AC_LINE_SEGMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__REPORTING_GROUP = WiresPackage.AC_LINE_SEGMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__NETWORK_DATA_SETS = WiresPackage.AC_LINE_SEGMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__LOCATION = WiresPackage.AC_LINE_SEGMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__OUTAGE_SCHEDULE = WiresPackage.AC_LINE_SEGMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PSR_EVENT = WiresPackage.AC_LINE_SEGMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__SAFETY_DOCUMENTS = WiresPackage.AC_LINE_SEGMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__ERP_ORGANISATION_ROLES = WiresPackage.AC_LINE_SEGMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CIRCUIT_SECTIONS = WiresPackage.AC_LINE_SEGMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__MEASUREMENTS = WiresPackage.AC_LINE_SEGMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__ASSETS = WiresPackage.AC_LINE_SEGMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__SCHEDULE_STEPS = WiresPackage.AC_LINE_SEGMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PSR_TYPE = WiresPackage.AC_LINE_SEGMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PSR_LISTS = WiresPackage.AC_LINE_SEGMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__OPERATING_SHARE = WiresPackage.AC_LINE_SEGMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CHANGE_ITEMS = WiresPackage.AC_LINE_SEGMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__DOCUMENT_ROLES = WiresPackage.AC_LINE_SEGMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__OPERATIONAL_LIMIT_SET = WiresPackage.AC_LINE_SEGMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CONTINGENCY_EQUIPMENT = WiresPackage.AC_LINE_SEGMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__NORMA_ILY_IN_SERVICE = WiresPackage.AC_LINE_SEGMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CUSTOMER_AGREEMENTS = WiresPackage.AC_LINE_SEGMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__AGGREGATE = WiresPackage.AC_LINE_SEGMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__EQUIPMENT_CONTAINER = WiresPackage.AC_LINE_SEGMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PROTECTION_EQUIPMENTS = WiresPackage.AC_LINE_SEGMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__OUTAGE_STEP_ROLES = WiresPackage.AC_LINE_SEGMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__BASE_VOLTAGE = WiresPackage.AC_LINE_SEGMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CLEARANCE_TAGS = WiresPackage.AC_LINE_SEGMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__SV_STATUS = WiresPackage.AC_LINE_SEGMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PHASES = WiresPackage.AC_LINE_SEGMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__ELECTRICAL_ASSETS = WiresPackage.AC_LINE_SEGMENT__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__TERMINALS = WiresPackage.AC_LINE_SEGMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__LENGTH = WiresPackage.AC_LINE_SEGMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__G0CH = WiresPackage.AC_LINE_SEGMENT__G0CH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__X = WiresPackage.AC_LINE_SEGMENT__X;

	/**
	 * The feature id for the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__GCH = WiresPackage.AC_LINE_SEGMENT__GCH;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__R = WiresPackage.AC_LINE_SEGMENT__R;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__X0 = WiresPackage.AC_LINE_SEGMENT__X0;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__BCH = WiresPackage.AC_LINE_SEGMENT__BCH;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__R0 = WiresPackage.AC_LINE_SEGMENT__R0;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__B0CH = WiresPackage.AC_LINE_SEGMENT__B0CH;

	/**
	 * The feature id for the '<em><b>Phase Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE = WiresPackage.AC_LINE_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conductor Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS = WiresPackage.AC_LINE_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE = WiresPackage.AC_LINE_SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conductor Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO = WiresPackage.AC_LINE_SEGMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Distribution Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT_FEATURE_COUNT = WiresPackage.AC_LINE_SEGMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Distribution Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_LINE_SEGMENT_OPERATION_COUNT = WiresPackage.AC_LINE_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl <em>Phase Impedance Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getPhaseImpedanceData()
	 * @generated
	 */
	int PHASE_IMPEDANCE_DATA = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA__B = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA__X = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA__R = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Phase Impedance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Phase Impedance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_IMPEDANCE_DATA_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl <em>Winding Pi Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getWindingPiImpedance()
	 * @generated
	 */
	int WINDING_PI_IMPEDANCE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__R = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__G = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__B = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Windings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__WINDINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__G0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE__B0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Winding Pi Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Winding Pi Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_PI_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl <em>Distribution Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl
	 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionTransformer()
	 * @generated
	 */
	int DISTRIBUTION_TRANSFORMER = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Transformer Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Windings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER__WINDINGS = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Distribution Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Distribution Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TRANSFORMER_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding <em>Distribution Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Transformer Winding</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding
	 * @generated
	 */
	EClass getDistributionTransformerWinding();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getFromWindingInsulations <em>From Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Winding Insulations</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getFromWindingInsulations()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_FromWindingInsulations();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Tap Changer</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRatioTapChanger()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_RatioTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#isGrounded <em>Grounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounded</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#isGrounded()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EAttribute getDistributionTransformerWinding_Grounded();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Tap Changer</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPhaseTapChanger()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_PhaseTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getXground <em>Xground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xground</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getXground()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EAttribute getDistributionTransformerWinding_Xground();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPiImpedance <em>Pi Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pi Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPiImpedance()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_PiImpedance();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRground <em>Rground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rground</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRground()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EAttribute getDistributionTransformerWinding_Rground();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getToWindingInsulations <em>To Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Winding Insulations</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getToWindingInsulations()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_ToWindingInsulations();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getTransformer()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_Transformer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getWindingInfo <em>Winding Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winding Info</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getWindingInfo()
	 * @see #getDistributionTransformerWinding()
	 * @generated
	 */
	EReference getDistributionTransformerWinding_WindingInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance <em>Per Length Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Length Phase Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance
	 * @generated
	 */
	EClass getPerLengthPhaseImpedance();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conductor Count</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorCount()
	 * @see #getPerLengthPhaseImpedance()
	 * @generated
	 */
	EAttribute getPerLengthPhaseImpedance_ConductorCount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorSegments <em>Conductor Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Segments</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorSegments()
	 * @see #getPerLengthPhaseImpedance()
	 * @generated
	 */
	EReference getPerLengthPhaseImpedance_ConductorSegments();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phase Impedance Data</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getPhaseImpedanceData()
	 * @see #getPerLengthPhaseImpedance()
	 * @generated
	 */
	EReference getPerLengthPhaseImpedance_PhaseImpedanceData();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger <em>Distribution Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Tap Changer</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger
	 * @generated
	 */
	EClass getDistributionTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getPtRatio <em>Pt Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Ratio</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getPtRatio()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_PtRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLimitVoltage <em>Limit Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Voltage</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLimitVoltage()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_LimitVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropR <em>Reverse Line Drop R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Line Drop R</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropR()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_ReverseLineDropR();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropX <em>Reverse Line Drop X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Line Drop X</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropX()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_ReverseLineDropX();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRating <em>Ct Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Rating</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRating()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_CtRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropR <em>Line Drop R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop R</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropR()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_LineDropR();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getBandVoltage <em>Band Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Band Voltage</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getBandVoltage()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_BandVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropX <em>Line Drop X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop X</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropX()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_LineDropX();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRatio <em>Ct Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Ratio</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRatio()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_CtRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#isLineDropCompensation <em>Line Drop Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop Compensation</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#isLineDropCompensation()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_LineDropCompensation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getMonitoredPhase <em>Monitored Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitored Phase</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getMonitoredPhase()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_MonitoredPhase();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getTargetVoltage <em>Target Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Voltage</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getTargetVoltage()
	 * @see #getDistributionTapChanger()
	 * @generated
	 */
	EAttribute getDistributionTapChanger_TargetVoltage();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance <em>Per Length Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Length Sequence Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance
	 * @generated
	 */
	EClass getPerLengthSequenceImpedance();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX0()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_X0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getBch <em>Bch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bch</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getBch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_Bch();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR0()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_R0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getG0ch <em>G0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0ch</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getG0ch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_G0ch();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getConductorSegments <em>Conductor Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Segments</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getConductorSegments()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EReference getPerLengthSequenceImpedance_ConductorSegments();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_R();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_X();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getGch <em>Gch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gch</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getGch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_Gch();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getB0ch <em>B0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0ch</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getB0ch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	EAttribute getPerLengthSequenceImpedance_B0ch();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.TransformerBank <em>Transformer Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Bank</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.TransformerBank
	 * @generated
	 */
	EClass getTransformerBank();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.TransformerBank#getVectorGroup <em>Vector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Group</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.TransformerBank#getVectorGroup()
	 * @see #getTransformerBank()
	 * @generated
	 */
	EAttribute getTransformerBank_VectorGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.TransformerBank#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformers</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.TransformerBank#getTransformers()
	 * @see #getTransformerBank()
	 * @generated
	 */
	EReference getTransformerBank_Transformers();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment <em>Distribution Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Line Segment</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment
	 * @generated
	 */
	EClass getDistributionLineSegment();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getPhaseImpedance()
	 * @see #getDistributionLineSegment()
	 * @generated
	 */
	EReference getDistributionLineSegment_PhaseImpedance();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorAssets()
	 * @see #getDistributionLineSegment()
	 * @generated
	 */
	EReference getDistributionLineSegment_ConductorAssets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getSequenceImpedance()
	 * @see #getDistributionLineSegment()
	 * @generated
	 */
	EReference getDistributionLineSegment_SequenceImpedance();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor Info</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorInfo()
	 * @see #getDistributionLineSegment()
	 * @generated
	 */
	EReference getDistributionLineSegment_ConductorInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Impedance Data</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData
	 * @generated
	 */
	EClass getPhaseImpedanceData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getSequenceNumber()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	EAttribute getPhaseImpedanceData_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getB()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	EAttribute getPhaseImpedanceData_B();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getX()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	EAttribute getPhaseImpedanceData_X();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getR()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	EAttribute getPhaseImpedanceData_R();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData#getPhaseImpedance()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	EReference getPhaseImpedanceData_PhaseImpedance();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance <em>Winding Pi Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winding Pi Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance
	 * @generated
	 */
	EClass getWindingPiImpedance();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getX()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_X();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getR()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_R();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getG()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_G();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getR0()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_R0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getB()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_B();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getX0()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_X0();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getWindings <em>Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Windings</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getWindings()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EReference getWindingPiImpedance_Windings();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getG0()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_G0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance#getB0()
	 * @see #getWindingPiImpedance()
	 * @generated
	 */
	EAttribute getWindingPiImpedance_B0();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer <em>Distribution Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Transformer</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer
	 * @generated
	 */
	EClass getDistributionTransformer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerBank <em>Transformer Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Bank</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerBank()
	 * @see #getDistributionTransformer()
	 * @generated
	 */
	EReference getDistributionTransformer_TransformerBank();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Observations</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerObservations()
	 * @see #getDistributionTransformer()
	 * @generated
	 */
	EReference getDistributionTransformer_TransformerObservations();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerInfo()
	 * @see #getDistributionTransformer()
	 * @generated
	 */
	EReference getDistributionTransformer_TransformerInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getServiceDeliveryPoints()
	 * @see #getDistributionTransformer()
	 * @generated
	 */
	EReference getDistributionTransformer_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getWindings <em>Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Windings</em>'.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getWindings()
	 * @see #getDistributionTransformer()
	 * @generated
	 */
	EReference getDistributionTransformer_Windings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiresExtFactory getWiresExtFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl <em>Distribution Transformer Winding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionTransformerWinding()
		 * @generated
		 */
		EClass DISTRIBUTION_TRANSFORMER_WINDING = eINSTANCE.getDistributionTransformerWinding();

		/**
		 * The meta object literal for the '<em><b>From Winding Insulations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS = eINSTANCE.getDistributionTransformerWinding_FromWindingInsulations();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER = eINSTANCE.getDistributionTransformerWinding_RatioTapChanger();

		/**
		 * The meta object literal for the '<em><b>Grounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED = eINSTANCE.getDistributionTransformerWinding_Grounded();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER = eINSTANCE.getDistributionTransformerWinding_PhaseTapChanger();

		/**
		 * The meta object literal for the '<em><b>Xground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TRANSFORMER_WINDING__XGROUND = eINSTANCE.getDistributionTransformerWinding_Xground();

		/**
		 * The meta object literal for the '<em><b>Pi Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE = eINSTANCE.getDistributionTransformerWinding_PiImpedance();

		/**
		 * The meta object literal for the '<em><b>Rground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TRANSFORMER_WINDING__RGROUND = eINSTANCE.getDistributionTransformerWinding_Rground();

		/**
		 * The meta object literal for the '<em><b>To Winding Insulations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS = eINSTANCE.getDistributionTransformerWinding_ToWindingInsulations();

		/**
		 * The meta object literal for the '<em><b>Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER = eINSTANCE.getDistributionTransformerWinding_Transformer();

		/**
		 * The meta object literal for the '<em><b>Winding Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO = eINSTANCE.getDistributionTransformerWinding_WindingInfo();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl <em>Per Length Phase Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getPerLengthPhaseImpedance()
		 * @generated
		 */
		EClass PER_LENGTH_PHASE_IMPEDANCE = eINSTANCE.getPerLengthPhaseImpedance();

		/**
		 * The meta object literal for the '<em><b>Conductor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT = eINSTANCE.getPerLengthPhaseImpedance_ConductorCount();

		/**
		 * The meta object literal for the '<em><b>Conductor Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS = eINSTANCE.getPerLengthPhaseImpedance_ConductorSegments();

		/**
		 * The meta object literal for the '<em><b>Phase Impedance Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA = eINSTANCE.getPerLengthPhaseImpedance_PhaseImpedanceData();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl <em>Distribution Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionTapChanger()
		 * @generated
		 */
		EClass DISTRIBUTION_TAP_CHANGER = eINSTANCE.getDistributionTapChanger();

		/**
		 * The meta object literal for the '<em><b>Pt Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__PT_RATIO = eINSTANCE.getDistributionTapChanger_PtRatio();

		/**
		 * The meta object literal for the '<em><b>Limit Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE = eINSTANCE.getDistributionTapChanger_LimitVoltage();

		/**
		 * The meta object literal for the '<em><b>Reverse Line Drop R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R = eINSTANCE.getDistributionTapChanger_ReverseLineDropR();

		/**
		 * The meta object literal for the '<em><b>Reverse Line Drop X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X = eINSTANCE.getDistributionTapChanger_ReverseLineDropX();

		/**
		 * The meta object literal for the '<em><b>Ct Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__CT_RATING = eINSTANCE.getDistributionTapChanger_CtRating();

		/**
		 * The meta object literal for the '<em><b>Line Drop R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__LINE_DROP_R = eINSTANCE.getDistributionTapChanger_LineDropR();

		/**
		 * The meta object literal for the '<em><b>Band Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE = eINSTANCE.getDistributionTapChanger_BandVoltage();

		/**
		 * The meta object literal for the '<em><b>Line Drop X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__LINE_DROP_X = eINSTANCE.getDistributionTapChanger_LineDropX();

		/**
		 * The meta object literal for the '<em><b>Ct Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__CT_RATIO = eINSTANCE.getDistributionTapChanger_CtRatio();

		/**
		 * The meta object literal for the '<em><b>Line Drop Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION = eINSTANCE.getDistributionTapChanger_LineDropCompensation();

		/**
		 * The meta object literal for the '<em><b>Monitored Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE = eINSTANCE.getDistributionTapChanger_MonitoredPhase();

		/**
		 * The meta object literal for the '<em><b>Target Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE = eINSTANCE.getDistributionTapChanger_TargetVoltage();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthSequenceImpedanceImpl <em>Per Length Sequence Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthSequenceImpedanceImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getPerLengthSequenceImpedance()
		 * @generated
		 */
		EClass PER_LENGTH_SEQUENCE_IMPEDANCE = eINSTANCE.getPerLengthSequenceImpedance();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__X0 = eINSTANCE.getPerLengthSequenceImpedance_X0();

		/**
		 * The meta object literal for the '<em><b>Bch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__BCH = eINSTANCE.getPerLengthSequenceImpedance_Bch();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__R0 = eINSTANCE.getPerLengthSequenceImpedance_R0();

		/**
		 * The meta object literal for the '<em><b>G0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH = eINSTANCE.getPerLengthSequenceImpedance_G0ch();

		/**
		 * The meta object literal for the '<em><b>Conductor Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_LENGTH_SEQUENCE_IMPEDANCE__CONDUCTOR_SEGMENTS = eINSTANCE.getPerLengthSequenceImpedance_ConductorSegments();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__R = eINSTANCE.getPerLengthSequenceImpedance_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__X = eINSTANCE.getPerLengthSequenceImpedance_X();

		/**
		 * The meta object literal for the '<em><b>Gch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__GCH = eINSTANCE.getPerLengthSequenceImpedance_Gch();

		/**
		 * The meta object literal for the '<em><b>B0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH = eINSTANCE.getPerLengthSequenceImpedance_B0ch();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.TransformerBankImpl <em>Transformer Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.TransformerBankImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getTransformerBank()
		 * @generated
		 */
		EClass TRANSFORMER_BANK = eINSTANCE.getTransformerBank();

		/**
		 * The meta object literal for the '<em><b>Vector Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_BANK__VECTOR_GROUP = eINSTANCE.getTransformerBank_VectorGroup();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_BANK__TRANSFORMERS = eINSTANCE.getTransformerBank_Transformers();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl <em>Distribution Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionLineSegment()
		 * @generated
		 */
		EClass DISTRIBUTION_LINE_SEGMENT = eINSTANCE.getDistributionLineSegment();

		/**
		 * The meta object literal for the '<em><b>Phase Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE = eINSTANCE.getDistributionLineSegment_PhaseImpedance();

		/**
		 * The meta object literal for the '<em><b>Conductor Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS = eINSTANCE.getDistributionLineSegment_ConductorAssets();

		/**
		 * The meta object literal for the '<em><b>Sequence Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE = eINSTANCE.getDistributionLineSegment_SequenceImpedance();

		/**
		 * The meta object literal for the '<em><b>Conductor Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO = eINSTANCE.getDistributionLineSegment_ConductorInfo();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl <em>Phase Impedance Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getPhaseImpedanceData()
		 * @generated
		 */
		EClass PHASE_IMPEDANCE_DATA = eINSTANCE.getPhaseImpedanceData();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER = eINSTANCE.getPhaseImpedanceData_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_IMPEDANCE_DATA__B = eINSTANCE.getPhaseImpedanceData_B();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_IMPEDANCE_DATA__X = eINSTANCE.getPhaseImpedanceData_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_IMPEDANCE_DATA__R = eINSTANCE.getPhaseImpedanceData_R();

		/**
		 * The meta object literal for the '<em><b>Phase Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE = eINSTANCE.getPhaseImpedanceData_PhaseImpedance();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl <em>Winding Pi Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getWindingPiImpedance()
		 * @generated
		 */
		EClass WINDING_PI_IMPEDANCE = eINSTANCE.getWindingPiImpedance();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__X = eINSTANCE.getWindingPiImpedance_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__R = eINSTANCE.getWindingPiImpedance_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__G = eINSTANCE.getWindingPiImpedance_G();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__R0 = eINSTANCE.getWindingPiImpedance_R0();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__B = eINSTANCE.getWindingPiImpedance_B();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__X0 = eINSTANCE.getWindingPiImpedance_X0();

		/**
		 * The meta object literal for the '<em><b>Windings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_PI_IMPEDANCE__WINDINGS = eINSTANCE.getWindingPiImpedance_Windings();

		/**
		 * The meta object literal for the '<em><b>G0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__G0 = eINSTANCE.getWindingPiImpedance_G0();

		/**
		 * The meta object literal for the '<em><b>B0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_PI_IMPEDANCE__B0 = eINSTANCE.getWindingPiImpedance_B0();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl <em>Distribution Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl
		 * @see gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl#getDistributionTransformer()
		 * @generated
		 */
		EClass DISTRIBUTION_TRANSFORMER = eINSTANCE.getDistributionTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformer Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK = eINSTANCE.getDistributionTransformer_TransformerBank();

		/**
		 * The meta object literal for the '<em><b>Transformer Observations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS = eINSTANCE.getDistributionTransformer_TransformerObservations();

		/**
		 * The meta object literal for the '<em><b>Transformer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO = eINSTANCE.getDistributionTransformer_TransformerInfo();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS = eINSTANCE.getDistributionTransformer_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Windings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TRANSFORMER__WINDINGS = eINSTANCE.getDistributionTransformer_Windings();

	}

} //WiresExtPackage
