/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

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
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='TODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"The Documentation package is used for the modeling of business documents. Some of these may be electronic realizations of legacy paper document, and some may be electronic information exchanges or collections. Documents will typically reference or describe one or more CIM objects.\nThe DataSets package is used to describe documents tyically used for exchange of collections of object descriptions (e.g., NetworkDataSet).\nThe operational package is used to define documents related to distribution operations business processes (e.g., OperationalRestriction, SwitchingSchedule).\nTroubleTickets are used by Customers to report problems related to the elctrical distribution network. TroubleTickets may be grouped and be related to a PlannedOutage, OutageNotification and/or PowerSystemResource.\nThe Outage package defines classes related to outage management (OutageStep, OutageRecord, OutageReport).\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='TODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"The Documentation package is used for the modeling of business documents. Some of these may be electronic realizations of legacy paper document, and some may be electronic information exchanges or collections. Documents will typically reference or describe one or more CIM objects.\nThe DataSets package is used to describe documents tyically used for exchange of collections of object descriptions (e.g., NetworkDataSet).\nThe operational package is used to define documents related to distribution operations business processes (e.g., OperationalRestriction, SwitchingSchedule).\nTroubleTickets are used by Customers to report problems related to the elctrical distribution network. TroubleTickets may be grouped and be related to a PlannedOutage, OutageNotification and/or PowerSystemResource.\nThe Outage package defines classes related to outage management (OutageStep, OutageRecord, OutageReport).\"'"
 * @generated
 */
public interface InfOperationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfOperations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfOperations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfOperations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfOperationsPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl <em>Switching Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSwitchingStep()
	 * @generated
	 */
	int SWITCHING_STEP = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__STATUS_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Person Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__ERP_PERSON_ROLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Switching Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__SWITCHING_SCHEDULE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Safety Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__SAFETY_DOCUMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Control Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__REQUIRED_CONTROL_ACTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__TEXT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required Control Action Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Desired End State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP__DESIRED_END_STATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Switching Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Switching Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_STEP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ErpPersonScheduleStepRoleImpl <em>Erp Person Schedule Step Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ErpPersonScheduleStepRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getErpPersonScheduleStepRole()
	 * @generated
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Switching Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Person Schedule Step Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Person Schedule Step Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_SCHEDULE_STEP_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeItemImpl <em>Change Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getChangeItem()
	 * @generated
	 */
	int CHANGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Change Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__CHANGE_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Network Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__NETWORK_DATA_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__GML_SELECTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__ORGANISATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__GML_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__POWER_SYSTEM_RESOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__DOCUMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__ERP_PERSON = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Change Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Change Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitImpl <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCircuit()
	 * @generated
	 */
	int CIRCUIT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__UUID = CorePackage.EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__MRID = CorePackage.EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__DESCRIPTION = CorePackage.EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__PATH_NAME = CorePackage.EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__LOCAL_NAME = CorePackage.EQUIPMENT_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__REPORTING_GROUP = CorePackage.EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__LOCATION = CorePackage.EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__PSR_EVENT = CorePackage.EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT_CONTAINER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ASSETS = CorePackage.EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__SCHEDULE_STEPS = CorePackage.EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__PSR_TYPE = CorePackage.EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__PSR_LISTS = CorePackage.EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__OPERATING_SHARE = CorePackage.EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CHANGE_ITEMS = CorePackage.EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__DOCUMENT_ROLES = CorePackage.EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__TOPOLOGICAL_NODE = CorePackage.EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_OPERATION_COUNT = CorePackage.EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ComplianceEventImpl <em>Compliance Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ComplianceEventImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getComplianceEvent()
	 * @generated
	 */
	int COMPLIANCE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__DESCRIPTION = CommonPackage.ACTIVITY_RECORD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__PATH_NAME = CommonPackage.ACTIVITY_RECORD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__LOCAL_NAME = CommonPackage.ACTIVITY_RECORD__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__MARKET_FACTORS = CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Compliance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__COMPLIANCE_TYPE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT__DEADLINE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compliance Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compliance Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl <em>Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getChangeSet()
	 * @generated
	 */
	int CHANGE_SET = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Land Bases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__LAND_BASES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__NETWORK_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl <em>Call Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCallBack()
	 * @generated
	 */
	int CALL_BACK = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__ADVICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Problem Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__PROBLEM_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__CONTACT_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__APPOINTMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trouble Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__TROUBLE_TICKETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK__COMMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Call Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Call Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BACK_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl <em>Switching Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSwitchingSchedule()
	 * @generated
	 */
	int SWITCHING_SCHEDULE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__WORK_TASK = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__SCHEDULE_STEPS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__INTERVAL = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__CREWS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE__REASON = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Switching Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Switching Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_SCHEDULE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl <em>Planned Outage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getPlannedOutage()
	 * @generated
	 */
	int PLANNED_OUTAGE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__CUSTOMER_DATAS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE__OUTAGE_SCHEDULES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Planned Outage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Planned Outage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_OUTAGE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl <em>Trouble Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getTroubleTicket()
	 * @generated
	 */
	int TROUBLE_TICKET = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>First Call Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__FIRST_CALL_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Backs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CALL_BACKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CALL_BACK = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incident Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__INCIDENT_RECORD = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reporting Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__REPORTING_KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__PRIORITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Customer Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__CUSTOMER_DATA = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inform Before Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__INFORM_BEFORE_RESTORED = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__ADVICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inform After Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__INFORM_AFTER_RESTORED = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hazard Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__HAZARD_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Trouble Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET__TROUBLE_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Trouble Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Trouble Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROUBLE_TICKET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl <em>Safety Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSafetyDocument()
	 * @generated
	 */
	int SAFETY_DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__CLEARANCE_TAGS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT__SCHEDULE_STEPS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Safety Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Safety Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DOCUMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl <em>Incident Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getIncidentRecord()
	 * @generated
	 */
	int INCIDENT_RECORD = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Incident Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__INCIDENT_CODES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trouble Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__TROUBLE_TICKETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD__PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Incident Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Incident Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_RECORD_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.LandBaseImpl <em>Land Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.LandBaseImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getLandBase()
	 * @generated
	 */
	int LAND_BASE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The number of structural features of the '<em>Land Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Land Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_BASE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl <em>Outage Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageCode()
	 * @generated
	 */
	int OUTAGE_CODE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__SUB_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outage Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__OUTAGE_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE__OUTAGE_STEPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Outage Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Outage Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_CODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PSREventImpl <em>PSR Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PSREventImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getPSREvent()
	 * @generated
	 */
	int PSR_EVENT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__DESCRIPTION = CommonPackage.ACTIVITY_RECORD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__PATH_NAME = CommonPackage.ACTIVITY_RECORD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__LOCAL_NAME = CommonPackage.ACTIVITY_RECORD__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__MARKET_FACTORS = CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__POWER_SYSTEM_RESOURCE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT__KIND = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PSR Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PSR Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSR_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OrgPsrRoleImpl <em>Org Psr Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OrgPsrRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOrgPsrRole()
	 * @generated
	 */
	int ORG_PSR_ROLE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Org Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Org Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_PSR_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl <em>Outage Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageNotification()
	 * @generated
	 */
	int OUTAGE_NOTIFICATION = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Expected Interruption Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__DURATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__CUSTOMER_DATAS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION__REASON = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outage Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Outage Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_NOTIFICATION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepPsrRoleImpl <em>Outage Step Psr Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepPsrRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageStepPsrRole()
	 * @generated
	 */
	int OUTAGE_STEP_PSR_ROLE = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outage Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Outage Step Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Outage Step Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_PSR_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl <em>Outage Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageStep()
	 * @generated
	 */
	int OUTAGE_STEP = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Injury</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__INJURY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outage Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__OUTAGE_CODES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Special Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fatality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__FATALITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Caller Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__CALLER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__DAMAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Job Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__JOB_PRIORITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Shock Reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__SHOCK_REPORTED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__AVERAGE_CML = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__TOTAL_CML = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Total Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__TOTAL_CUSTOMER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Critical Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>No Power Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__NO_POWER_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Conducting Equipment Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Outage Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP__OUTAGE_RECORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Outage Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Outage Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_STEP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl <em>Outage Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageReport()
	 * @generated
	 */
	int OUTAGE_REPORT = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Outage Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__OUTAGE_RECORD = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__CUSTOMER_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage History</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__OUTAGE_HISTORY = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outage Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__OUTAGE_DURATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__AVERAGE_CML = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT__TOTAL_CML = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Outage Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Outage Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_REPORT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl <em>Outage Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageRecord()
	 * @generated
	 */
	int OUTAGE_RECORD = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__MODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outage Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__OUTAGE_REPORT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__ACTION_TAKEN = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__END_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outage Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__OUTAGE_STEPS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outage Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__OUTAGE_CODES = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Damage Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__DAMAGE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD__IS_PLANNED = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Outage Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Outage Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_RECORD_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OperationalRestrictionImpl <em>Operational Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OperationalRestrictionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOperationalRestriction()
	 * @generated
	 */
	int OPERATIONAL_RESTRICTION = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Active Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION__ACTIVE_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operational Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_RESTRICTION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl <em>Network Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getNetworkDataSet()
	 * @generated
	 */
	int NETWORK_DATA_SET = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__CIRCUIT_SECTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__CHANGE_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Land Bases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__LAND_BASES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Network Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Network Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentCodeImpl <em>Incident Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentCodeImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getIncidentCode()
	 * @generated
	 */
	int INCIDENT_CODE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__SUB_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incident Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE__INCIDENT_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incident Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incident Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_CODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl <em>Circuit Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCircuitSection()
	 * @generated
	 */
	int CIRCUIT_SECTION = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Circuits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__CIRCUITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__NETWORK_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__CONNECTION_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conductor Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION__CONDUCTOR_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Circuit Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Circuit Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_SECTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind <em>Outage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageKind()
	 * @generated
	 */
	int OUTAGE_KIND = 25;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItemKind <em>Change Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getChangeItemKind()
	 * @generated
	 */
	int CHANGE_ITEM_KIND = 26;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind <em>Trouble Reporting Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getTroubleReportingKind()
	 * @generated
	 */
	int TROUBLE_REPORTING_KIND = 27;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind <em>Switching Step Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSwitchingStepStatusKind()
	 * @generated
	 */
	int SWITCHING_STEP_STATUS_KIND = 28;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind <em>PSR Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getPSREventKind()
	 * @generated
	 */
	int PSR_EVENT_KIND = 29;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind <em>Circuit Connection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCircuitConnectionKind()
	 * @generated
	 */
	int CIRCUIT_CONNECTION_KIND = 30;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switching Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep
	 * @generated
	 */
	EClass getSwitchingStep();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EAttribute getSwitchingStep_StatusKind();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EReference getSwitchingStep_ErpPersonRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switching Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EReference getSwitchingStep_SwitchingSchedule();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Safety Document</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EReference getSwitchingStep_SafetyDocument();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Control Action</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EAttribute getSwitchingStep_RequiredControlAction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getText()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EAttribute getSwitchingStep_Text();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EReference getSwitchingStep_PowerSystemResources();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval <em>Required Control Action Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Control Action Interval</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EReference getSwitchingStep_RequiredControlActionInterval();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired End State</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	EAttribute getSwitchingStep_DesiredEndState();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole <em>Erp Person Schedule Step Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Person Schedule Step Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole
	 * @generated
	 */
	EClass getErpPersonScheduleStepRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switching Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep()
	 * @see #getErpPersonScheduleStepRole()
	 * @generated
	 */
	EReference getErpPersonScheduleStepRole_SwitchingStep();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson()
	 * @see #getErpPersonScheduleStepRole()
	 * @generated
	 */
	EReference getErpPersonScheduleStepRole_ErpPerson();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem <em>Change Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem
	 * @generated
	 */
	EClass getChangeItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_ChangeSet();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getAsset()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_Asset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getStatus()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Data Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_NetworkDataSet();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Selector</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_GmlSelector();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_Organisation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Observation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_GmlObservation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getLocation()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_Location();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_PowerSystemResource();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getDocument()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_Document();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getKind()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_SequenceNumber();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson()
	 * @see #getChangeItem()
	 * @generated
	 */
	EReference getChangeItem_ErpPerson();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.Circuit
	 * @generated
	 */
	EClass getCircuit();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent <em>Compliance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Event</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent
	 * @generated
	 */
	EClass getComplianceEvent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getComplianceType <em>Compliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getComplianceType()
	 * @see #getComplianceEvent()
	 * @generated
	 */
	EAttribute getComplianceEvent_ComplianceType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getDeadline()
	 * @see #getComplianceEvent()
	 * @generated
	 */
	EAttribute getComplianceEvent_Deadline();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet
	 * @generated
	 */
	EClass getChangeSet();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems()
	 * @see #getChangeSet()
	 * @generated
	 */
	EReference getChangeSet_ChangeItems();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getStatus()
	 * @see #getChangeSet()
	 * @generated
	 */
	EReference getChangeSet_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getLandBases <em>Land Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Bases</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getLandBases()
	 * @see #getChangeSet()
	 * @generated
	 */
	EReference getChangeSet_LandBases();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets()
	 * @see #getChangeSet()
	 * @generated
	 */
	EReference getChangeSet_NetworkDataSets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getDocuments()
	 * @see #getChangeSet()
	 * @generated
	 */
	EReference getChangeSet_Documents();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Back</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack
	 * @generated
	 */
	EClass getCallBack();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advice</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getAdvice()
	 * @see #getCallBack()
	 * @generated
	 */
	EAttribute getCallBack_Advice();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getStatus()
	 * @see #getCallBack()
	 * @generated
	 */
	EReference getCallBack_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getErpPersons()
	 * @see #getCallBack()
	 * @generated
	 */
	EReference getCallBack_ErpPersons();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getProblemInfo()
	 * @see #getCallBack()
	 * @generated
	 */
	EAttribute getCallBack_ProblemInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Detail</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getContactDetail()
	 * @see #getCallBack()
	 * @generated
	 */
	EAttribute getCallBack_ContactDetail();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getAppointments()
	 * @see #getCallBack()
	 * @generated
	 */
	EReference getCallBack_Appointments();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trouble Tickets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets()
	 * @see #getCallBack()
	 * @generated
	 */
	EReference getCallBack_TroubleTickets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getDateTime()
	 * @see #getCallBack()
	 * @generated
	 */
	EAttribute getCallBack_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getComment()
	 * @see #getCallBack()
	 * @generated
	 */
	EAttribute getCallBack_Comment();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switching Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule
	 * @generated
	 */
	EClass getSwitchingSchedule();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	EReference getSwitchingSchedule_WorkTask();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Steps</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	EReference getSwitchingSchedule_ScheduleSteps();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	EReference getSwitchingSchedule_Interval();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	EReference getSwitchingSchedule_Crews();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	EAttribute getSwitchingSchedule_Reason();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Outage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage
	 * @generated
	 */
	EClass getPlannedOutage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage#getKind()
	 * @see #getPlannedOutage()
	 * @generated
	 */
	EAttribute getPlannedOutage_Kind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Datas</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas()
	 * @see #getPlannedOutage()
	 * @generated
	 */
	EReference getPlannedOutage_CustomerDatas();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules <em>Outage Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Schedules</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules()
	 * @see #getPlannedOutage()
	 * @generated
	 */
	EReference getPlannedOutage_OutageSchedules();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket <em>Trouble Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trouble Ticket</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket
	 * @generated
	 */
	EClass getTroubleTicket();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Call Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_FirstCallDateTime();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Backs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EReference getTroubleTicket_CallBacks();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Back</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_CallBack();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incident Record</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EReference getTroubleTicket_IncidentRecord();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Restore Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_EstimatedRestoreDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reporting Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_ReportingKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getPriority()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_Priority();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EReference getTroubleTicket_CustomerData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inform Before Restored</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_InformBeforeRestored();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advice</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_Advice();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inform After Restored</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_InformAfterRestored();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EAttribute getTroubleTicket_HazardCode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod <em>Trouble Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trouble Period</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	EReference getTroubleTicket_TroublePeriod();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Document</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument
	 * @generated
	 */
	EClass getSafetyDocument();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource()
	 * @see #getSafetyDocument()
	 * @generated
	 */
	EReference getSafetyDocument_PowerSystemResource();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clearance Tags</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags()
	 * @see #getSafetyDocument()
	 * @generated
	 */
	EReference getSafetyDocument_ClearanceTags();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Steps</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps()
	 * @see #getSafetyDocument()
	 * @generated
	 */
	EReference getSafetyDocument_ScheduleSteps();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incident Record</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord
	 * @generated
	 */
	EClass getIncidentRecord();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes <em>Incident Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incident Codes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes()
	 * @see #getIncidentRecord()
	 * @generated
	 */
	EReference getIncidentRecord_IncidentCodes();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trouble Tickets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets()
	 * @see #getIncidentRecord()
	 * @generated
	 */
	EReference getIncidentRecord_TroubleTickets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod()
	 * @see #getIncidentRecord()
	 * @generated
	 */
	EReference getIncidentRecord_Period();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.LandBase <em>Land Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Land Base</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.LandBase
	 * @generated
	 */
	EClass getLandBase();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode <em>Outage Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode
	 * @generated
	 */
	EClass getOutageCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getSubCode()
	 * @see #getOutageCode()
	 * @generated
	 */
	EAttribute getOutageCode_SubCode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords <em>Outage Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Records</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords()
	 * @see #getOutageCode()
	 * @generated
	 */
	EReference getOutageCode_OutageRecords();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Steps</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps()
	 * @see #getOutageCode()
	 * @generated
	 */
	EReference getOutageCode_OutageSteps();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent <em>PSR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSR Event</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent
	 * @generated
	 */
	EClass getPSREvent();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource()
	 * @see #getPSREvent()
	 * @generated
	 */
	EReference getPSREvent_PowerSystemResource();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getKind()
	 * @see #getPSREvent()
	 * @generated
	 */
	EAttribute getPSREvent_Kind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole <em>Org Psr Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Psr Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole
	 * @generated
	 */
	EClass getOrgPsrRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource()
	 * @see #getOrgPsrRole()
	 * @generated
	 */
	EReference getOrgPsrRole_PowerSystemResource();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation()
	 * @see #getOrgPsrRole()
	 * @generated
	 */
	EReference getOrgPsrRole_ErpOrganisation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification <em>Outage Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Notification</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification
	 * @generated
	 */
	EClass getOutageNotification();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Interruption Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount()
	 * @see #getOutageNotification()
	 * @generated
	 */
	EAttribute getOutageNotification_ExpectedInterruptionCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getDuration()
	 * @see #getOutageNotification()
	 * @generated
	 */
	EAttribute getOutageNotification_Duration();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Datas</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas()
	 * @see #getOutageNotification()
	 * @generated
	 */
	EReference getOutageNotification_CustomerDatas();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getReason()
	 * @see #getOutageNotification()
	 * @generated
	 */
	EAttribute getOutageNotification_Reason();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole <em>Outage Step Psr Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Step Psr Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole
	 * @generated
	 */
	EClass getOutageStepPsrRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment()
	 * @see #getOutageStepPsrRole()
	 * @generated
	 */
	EReference getOutageStepPsrRole_ConductingEquipment();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep()
	 * @see #getOutageStepPsrRole()
	 * @generated
	 */
	EReference getOutageStepPsrRole_OutageStep();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep
	 * @generated
	 */
	EClass getOutageStep();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injury</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isInjury()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_Injury();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Codes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes()
	 * @see #getOutageStep()
	 * @generated
	 */
	EReference getOutageStep_OutageCodes();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCrews()
	 * @see #getOutageStep()
	 * @generated
	 */
	EReference getOutageStep_Crews();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Customer Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_SpecialCustomerCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Restore Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_EstimatedRestoreDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fatality</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isFatality()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_Fatality();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caller Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCallerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_CallerCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isDamage()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_Damage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Priority</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getJobPriority()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_JobPriority();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shock Reported</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#isShockReported()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_ShockReported();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Cml</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getAverageCml()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_AverageCml();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cml</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCml()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_TotalCml();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Customer Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_TotalCustomerCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Customer Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	EAttribute getOutageStep_CriticalCustomerCount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval <em>No Power Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>No Power Interval</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval()
	 * @see #getOutageStep()
	 * @generated
	 */
	EReference getOutageStep_NoPowerInterval();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipment Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles()
	 * @see #getOutageStep()
	 * @generated
	 */
	EReference getOutageStep_ConductingEquipmentRoles();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getStatus()
	 * @see #getOutageStep()
	 * @generated
	 */
	EReference getOutageStep_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Record</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord()
	 * @see #getOutageStep()
	 * @generated
	 */
	EReference getOutageStep_OutageRecord();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Report</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport
	 * @generated
	 */
	EClass getOutageReport();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Record</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord()
	 * @see #getOutageReport()
	 * @generated
	 */
	EReference getOutageReport_OutageRecord();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount()
	 * @see #getOutageReport()
	 * @generated
	 */
	EAttribute getOutageReport_CustomerCount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage History</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory()
	 * @see #getOutageReport()
	 * @generated
	 */
	EReference getOutageReport_OutageHistory();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outage Duration</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration()
	 * @see #getOutageReport()
	 * @generated
	 */
	EAttribute getOutageReport_OutageDuration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Cml</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getAverageCml()
	 * @see #getOutageReport()
	 * @generated
	 */
	EAttribute getOutageReport_AverageCml();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cml</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getTotalCml()
	 * @see #getOutageReport()
	 * @generated
	 */
	EAttribute getOutageReport_TotalCml();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Record</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord
	 * @generated
	 */
	EClass getOutageRecord();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getMode()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EAttribute getOutageRecord_Mode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Report</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EReference getOutageRecord_OutageReport();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Taken</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EAttribute getOutageRecord_ActionTaken();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EAttribute getOutageRecord_EndDateTime();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Steps</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EReference getOutageRecord_OutageSteps();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Codes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EReference getOutageRecord_OutageCodes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EAttribute getOutageRecord_DamageCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Planned</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned()
	 * @see #getOutageRecord()
	 * @generated
	 */
	EAttribute getOutageRecord_IsPlanned();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OperationalRestriction <em>Operational Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Restriction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OperationalRestriction
	 * @generated
	 */
	EClass getOperationalRestriction();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod <em>Active Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Period</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod()
	 * @see #getOperationalRestriction()
	 * @generated
	 */
	EReference getOperationalRestriction_ActivePeriod();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Data Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet
	 * @generated
	 */
	EClass getNetworkDataSet();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCircuitSections <em>Circuit Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circuit Sections</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCircuitSections()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_CircuitSections();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_ChangeItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Sets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_ChangeSets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_PowerSystemResources();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getLandBases <em>Land Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Bases</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getLandBases()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_LandBases();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EReference getNetworkDataSet_Documents();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	EAttribute getNetworkDataSet_Category();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode <em>Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incident Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode
	 * @generated
	 */
	EClass getIncidentCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode#getSubCode <em>Sub Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode#getSubCode()
	 * @see #getIncidentCode()
	 * @generated
	 */
	EAttribute getIncidentCode_SubCode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords <em>Incident Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incident Records</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords()
	 * @see #getIncidentCode()
	 * @generated
	 */
	EReference getIncidentCode_IncidentRecords();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Section</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection
	 * @generated
	 */
	EClass getCircuitSection();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getCircuits <em>Circuits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circuits</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getCircuits()
	 * @see #getCircuitSection()
	 * @generated
	 */
	EReference getCircuitSection_Circuits();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getNetworkDataSets()
	 * @see #getCircuitSection()
	 * @generated
	 */
	EReference getCircuitSection_NetworkDataSets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getPowerSystemResources()
	 * @see #getCircuitSection()
	 * @generated
	 */
	EReference getCircuitSection_PowerSystemResources();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind()
	 * @see #getCircuitSection()
	 * @generated
	 */
	EAttribute getCircuitSection_ConnectionKind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets()
	 * @see #getCircuitSection()
	 * @generated
	 */
	EReference getCircuitSection_ConductorAssets();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind <em>Outage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Outage Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind
	 * @generated
	 */
	EEnum getOutageKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItemKind <em>Change Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Item Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @generated
	 */
	EEnum getChangeItemKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind <em>Trouble Reporting Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trouble Reporting Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @generated
	 */
	EEnum getTroubleReportingKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind <em>Switching Step Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Switching Step Status Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @generated
	 */
	EEnum getSwitchingStepStatusKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind <em>PSR Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PSR Event Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind
	 * @generated
	 */
	EEnum getPSREventKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind <em>Circuit Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Circuit Connection Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @generated
	 */
	EEnum getCircuitConnectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfOperationsFactory getInfOperationsFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl <em>Switching Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSwitchingStep()
		 * @generated
		 */
		EClass SWITCHING_STEP = eINSTANCE.getSwitchingStep();

		/**
		 * The meta object literal for the '<em><b>Status Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_STEP__STATUS_KIND = eINSTANCE.getSwitchingStep_StatusKind();

		/**
		 * The meta object literal for the '<em><b>Erp Person Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_STEP__ERP_PERSON_ROLE = eINSTANCE.getSwitchingStep_ErpPersonRole();

		/**
		 * The meta object literal for the '<em><b>Switching Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_STEP__SWITCHING_SCHEDULE = eINSTANCE.getSwitchingStep_SwitchingSchedule();

		/**
		 * The meta object literal for the '<em><b>Safety Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_STEP__SAFETY_DOCUMENT = eINSTANCE.getSwitchingStep_SafetyDocument();

		/**
		 * The meta object literal for the '<em><b>Required Control Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_STEP__REQUIRED_CONTROL_ACTION = eINSTANCE.getSwitchingStep_RequiredControlAction();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_STEP__TEXT = eINSTANCE.getSwitchingStep_Text();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_STEP__POWER_SYSTEM_RESOURCES = eINSTANCE.getSwitchingStep_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Required Control Action Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL = eINSTANCE.getSwitchingStep_RequiredControlActionInterval();

		/**
		 * The meta object literal for the '<em><b>Desired End State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_STEP__DESIRED_END_STATE = eINSTANCE.getSwitchingStep_DesiredEndState();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ErpPersonScheduleStepRoleImpl <em>Erp Person Schedule Step Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ErpPersonScheduleStepRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getErpPersonScheduleStepRole()
		 * @generated
		 */
		EClass ERP_PERSON_SCHEDULE_STEP_ROLE = eINSTANCE.getErpPersonScheduleStepRole();

		/**
		 * The meta object literal for the '<em><b>Switching Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP = eINSTANCE.getErpPersonScheduleStepRole_SwitchingStep();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON = eINSTANCE.getErpPersonScheduleStepRole_ErpPerson();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeItemImpl <em>Change Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getChangeItem()
		 * @generated
		 */
		EClass CHANGE_ITEM = eINSTANCE.getChangeItem();

		/**
		 * The meta object literal for the '<em><b>Change Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__CHANGE_SET = eINSTANCE.getChangeItem_ChangeSet();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__ASSET = eINSTANCE.getChangeItem_Asset();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__STATUS = eINSTANCE.getChangeItem_Status();

		/**
		 * The meta object literal for the '<em><b>Network Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__NETWORK_DATA_SET = eINSTANCE.getChangeItem_NetworkDataSet();

		/**
		 * The meta object literal for the '<em><b>Gml Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__GML_SELECTOR = eINSTANCE.getChangeItem_GmlSelector();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__ORGANISATION = eINSTANCE.getChangeItem_Organisation();

		/**
		 * The meta object literal for the '<em><b>Gml Observation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__GML_OBSERVATION = eINSTANCE.getChangeItem_GmlObservation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__LOCATION = eINSTANCE.getChangeItem_Location();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__POWER_SYSTEM_RESOURCE = eINSTANCE.getChangeItem_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__DOCUMENT = eINSTANCE.getChangeItem_Document();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ITEM__KIND = eINSTANCE.getChangeItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ITEM__SEQUENCE_NUMBER = eINSTANCE.getChangeItem_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ITEM__ERP_PERSON = eINSTANCE.getChangeItem_ErpPerson();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitImpl <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCircuit()
		 * @generated
		 */
		EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ComplianceEventImpl <em>Compliance Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ComplianceEventImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getComplianceEvent()
		 * @generated
		 */
		EClass COMPLIANCE_EVENT = eINSTANCE.getComplianceEvent();

		/**
		 * The meta object literal for the '<em><b>Compliance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_EVENT__COMPLIANCE_TYPE = eINSTANCE.getComplianceEvent_ComplianceType();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_EVENT__DEADLINE = eINSTANCE.getComplianceEvent_Deadline();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl <em>Change Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getChangeSet()
		 * @generated
		 */
		EClass CHANGE_SET = eINSTANCE.getChangeSet();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SET__CHANGE_ITEMS = eINSTANCE.getChangeSet_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SET__STATUS = eINSTANCE.getChangeSet_Status();

		/**
		 * The meta object literal for the '<em><b>Land Bases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SET__LAND_BASES = eINSTANCE.getChangeSet_LandBases();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SET__NETWORK_DATA_SETS = eINSTANCE.getChangeSet_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SET__DOCUMENTS = eINSTANCE.getChangeSet_Documents();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl <em>Call Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCallBack()
		 * @generated
		 */
		EClass CALL_BACK = eINSTANCE.getCallBack();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_BACK__ADVICE = eINSTANCE.getCallBack_Advice();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_BACK__STATUS = eINSTANCE.getCallBack_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_BACK__ERP_PERSONS = eINSTANCE.getCallBack_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Problem Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_BACK__PROBLEM_INFO = eINSTANCE.getCallBack_ProblemInfo();

		/**
		 * The meta object literal for the '<em><b>Contact Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_BACK__CONTACT_DETAIL = eINSTANCE.getCallBack_ContactDetail();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_BACK__APPOINTMENTS = eINSTANCE.getCallBack_Appointments();

		/**
		 * The meta object literal for the '<em><b>Trouble Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_BACK__TROUBLE_TICKETS = eINSTANCE.getCallBack_TroubleTickets();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_BACK__DATE_TIME = eINSTANCE.getCallBack_DateTime();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_BACK__COMMENT = eINSTANCE.getCallBack_Comment();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl <em>Switching Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSwitchingSchedule()
		 * @generated
		 */
		EClass SWITCHING_SCHEDULE = eINSTANCE.getSwitchingSchedule();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_SCHEDULE__WORK_TASK = eINSTANCE.getSwitchingSchedule_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Schedule Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_SCHEDULE__SCHEDULE_STEPS = eINSTANCE.getSwitchingSchedule_ScheduleSteps();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_SCHEDULE__INTERVAL = eINSTANCE.getSwitchingSchedule_Interval();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_SCHEDULE__CREWS = eINSTANCE.getSwitchingSchedule_Crews();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_SCHEDULE__REASON = eINSTANCE.getSwitchingSchedule_Reason();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl <em>Planned Outage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getPlannedOutage()
		 * @generated
		 */
		EClass PLANNED_OUTAGE = eINSTANCE.getPlannedOutage();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_OUTAGE__KIND = eINSTANCE.getPlannedOutage_Kind();

		/**
		 * The meta object literal for the '<em><b>Customer Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_OUTAGE__CUSTOMER_DATAS = eINSTANCE.getPlannedOutage_CustomerDatas();

		/**
		 * The meta object literal for the '<em><b>Outage Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_OUTAGE__OUTAGE_SCHEDULES = eINSTANCE.getPlannedOutage_OutageSchedules();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl <em>Trouble Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getTroubleTicket()
		 * @generated
		 */
		EClass TROUBLE_TICKET = eINSTANCE.getTroubleTicket();

		/**
		 * The meta object literal for the '<em><b>First Call Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__FIRST_CALL_DATE_TIME = eINSTANCE.getTroubleTicket_FirstCallDateTime();

		/**
		 * The meta object literal for the '<em><b>Call Backs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROUBLE_TICKET__CALL_BACKS = eINSTANCE.getTroubleTicket_CallBacks();

		/**
		 * The meta object literal for the '<em><b>Call Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__CALL_BACK = eINSTANCE.getTroubleTicket_CallBack();

		/**
		 * The meta object literal for the '<em><b>Incident Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROUBLE_TICKET__INCIDENT_RECORD = eINSTANCE.getTroubleTicket_IncidentRecord();

		/**
		 * The meta object literal for the '<em><b>Estimated Restore Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME = eINSTANCE.getTroubleTicket_EstimatedRestoreDateTime();

		/**
		 * The meta object literal for the '<em><b>Reporting Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__REPORTING_KIND = eINSTANCE.getTroubleTicket_ReportingKind();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__PRIORITY = eINSTANCE.getTroubleTicket_Priority();

		/**
		 * The meta object literal for the '<em><b>Customer Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROUBLE_TICKET__CUSTOMER_DATA = eINSTANCE.getTroubleTicket_CustomerData();

		/**
		 * The meta object literal for the '<em><b>Inform Before Restored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__INFORM_BEFORE_RESTORED = eINSTANCE.getTroubleTicket_InformBeforeRestored();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__ADVICE = eINSTANCE.getTroubleTicket_Advice();

		/**
		 * The meta object literal for the '<em><b>Inform After Restored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__INFORM_AFTER_RESTORED = eINSTANCE.getTroubleTicket_InformAfterRestored();

		/**
		 * The meta object literal for the '<em><b>Hazard Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROUBLE_TICKET__HAZARD_CODE = eINSTANCE.getTroubleTicket_HazardCode();

		/**
		 * The meta object literal for the '<em><b>Trouble Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROUBLE_TICKET__TROUBLE_PERIOD = eINSTANCE.getTroubleTicket_TroublePeriod();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl <em>Safety Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSafetyDocument()
		 * @generated
		 */
		EClass SAFETY_DOCUMENT = eINSTANCE.getSafetyDocument();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE = eINSTANCE.getSafetyDocument_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Clearance Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_DOCUMENT__CLEARANCE_TAGS = eINSTANCE.getSafetyDocument_ClearanceTags();

		/**
		 * The meta object literal for the '<em><b>Schedule Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_DOCUMENT__SCHEDULE_STEPS = eINSTANCE.getSafetyDocument_ScheduleSteps();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl <em>Incident Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getIncidentRecord()
		 * @generated
		 */
		EClass INCIDENT_RECORD = eINSTANCE.getIncidentRecord();

		/**
		 * The meta object literal for the '<em><b>Incident Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_RECORD__INCIDENT_CODES = eINSTANCE.getIncidentRecord_IncidentCodes();

		/**
		 * The meta object literal for the '<em><b>Trouble Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_RECORD__TROUBLE_TICKETS = eINSTANCE.getIncidentRecord_TroubleTickets();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_RECORD__PERIOD = eINSTANCE.getIncidentRecord_Period();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.LandBaseImpl <em>Land Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.LandBaseImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getLandBase()
		 * @generated
		 */
		EClass LAND_BASE = eINSTANCE.getLandBase();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl <em>Outage Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageCode()
		 * @generated
		 */
		EClass OUTAGE_CODE = eINSTANCE.getOutageCode();

		/**
		 * The meta object literal for the '<em><b>Sub Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_CODE__SUB_CODE = eINSTANCE.getOutageCode_SubCode();

		/**
		 * The meta object literal for the '<em><b>Outage Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_CODE__OUTAGE_RECORDS = eINSTANCE.getOutageCode_OutageRecords();

		/**
		 * The meta object literal for the '<em><b>Outage Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_CODE__OUTAGE_STEPS = eINSTANCE.getOutageCode_OutageSteps();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PSREventImpl <em>PSR Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PSREventImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getPSREvent()
		 * @generated
		 */
		EClass PSR_EVENT = eINSTANCE.getPSREvent();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSR_EVENT__POWER_SYSTEM_RESOURCE = eINSTANCE.getPSREvent_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSR_EVENT__KIND = eINSTANCE.getPSREvent_Kind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OrgPsrRoleImpl <em>Org Psr Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OrgPsrRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOrgPsrRole()
		 * @generated
		 */
		EClass ORG_PSR_ROLE = eINSTANCE.getOrgPsrRole();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE = eINSTANCE.getOrgPsrRole_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_PSR_ROLE__ERP_ORGANISATION = eINSTANCE.getOrgPsrRole_ErpOrganisation();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl <em>Outage Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageNotification()
		 * @generated
		 */
		EClass OUTAGE_NOTIFICATION = eINSTANCE.getOutageNotification();

		/**
		 * The meta object literal for the '<em><b>Expected Interruption Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT = eINSTANCE.getOutageNotification_ExpectedInterruptionCount();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_NOTIFICATION__DURATION = eINSTANCE.getOutageNotification_Duration();

		/**
		 * The meta object literal for the '<em><b>Customer Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_NOTIFICATION__CUSTOMER_DATAS = eINSTANCE.getOutageNotification_CustomerDatas();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_NOTIFICATION__REASON = eINSTANCE.getOutageNotification_Reason();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepPsrRoleImpl <em>Outage Step Psr Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepPsrRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageStepPsrRole()
		 * @generated
		 */
		EClass OUTAGE_STEP_PSR_ROLE = eINSTANCE.getOutageStepPsrRole();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT = eINSTANCE.getOutageStepPsrRole_ConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Outage Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP = eINSTANCE.getOutageStepPsrRole_OutageStep();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl <em>Outage Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageStep()
		 * @generated
		 */
		EClass OUTAGE_STEP = eINSTANCE.getOutageStep();

		/**
		 * The meta object literal for the '<em><b>Injury</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__INJURY = eINSTANCE.getOutageStep_Injury();

		/**
		 * The meta object literal for the '<em><b>Outage Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP__OUTAGE_CODES = eINSTANCE.getOutageStep_OutageCodes();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP__CREWS = eINSTANCE.getOutageStep_Crews();

		/**
		 * The meta object literal for the '<em><b>Special Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT = eINSTANCE.getOutageStep_SpecialCustomerCount();

		/**
		 * The meta object literal for the '<em><b>Estimated Restore Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME = eINSTANCE.getOutageStep_EstimatedRestoreDateTime();

		/**
		 * The meta object literal for the '<em><b>Fatality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__FATALITY = eINSTANCE.getOutageStep_Fatality();

		/**
		 * The meta object literal for the '<em><b>Caller Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__CALLER_COUNT = eINSTANCE.getOutageStep_CallerCount();

		/**
		 * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__DAMAGE = eINSTANCE.getOutageStep_Damage();

		/**
		 * The meta object literal for the '<em><b>Job Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__JOB_PRIORITY = eINSTANCE.getOutageStep_JobPriority();

		/**
		 * The meta object literal for the '<em><b>Shock Reported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__SHOCK_REPORTED = eINSTANCE.getOutageStep_ShockReported();

		/**
		 * The meta object literal for the '<em><b>Average Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__AVERAGE_CML = eINSTANCE.getOutageStep_AverageCml();

		/**
		 * The meta object literal for the '<em><b>Total Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__TOTAL_CML = eINSTANCE.getOutageStep_TotalCml();

		/**
		 * The meta object literal for the '<em><b>Total Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__TOTAL_CUSTOMER_COUNT = eINSTANCE.getOutageStep_TotalCustomerCount();

		/**
		 * The meta object literal for the '<em><b>Critical Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT = eINSTANCE.getOutageStep_CriticalCustomerCount();

		/**
		 * The meta object literal for the '<em><b>No Power Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP__NO_POWER_INTERVAL = eINSTANCE.getOutageStep_NoPowerInterval();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES = eINSTANCE.getOutageStep_ConductingEquipmentRoles();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP__STATUS = eINSTANCE.getOutageStep_Status();

		/**
		 * The meta object literal for the '<em><b>Outage Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_STEP__OUTAGE_RECORD = eINSTANCE.getOutageStep_OutageRecord();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl <em>Outage Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageReport()
		 * @generated
		 */
		EClass OUTAGE_REPORT = eINSTANCE.getOutageReport();

		/**
		 * The meta object literal for the '<em><b>Outage Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_REPORT__OUTAGE_RECORD = eINSTANCE.getOutageReport_OutageRecord();

		/**
		 * The meta object literal for the '<em><b>Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_REPORT__CUSTOMER_COUNT = eINSTANCE.getOutageReport_CustomerCount();

		/**
		 * The meta object literal for the '<em><b>Outage History</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_REPORT__OUTAGE_HISTORY = eINSTANCE.getOutageReport_OutageHistory();

		/**
		 * The meta object literal for the '<em><b>Outage Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_REPORT__OUTAGE_DURATION = eINSTANCE.getOutageReport_OutageDuration();

		/**
		 * The meta object literal for the '<em><b>Average Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_REPORT__AVERAGE_CML = eINSTANCE.getOutageReport_AverageCml();

		/**
		 * The meta object literal for the '<em><b>Total Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_REPORT__TOTAL_CML = eINSTANCE.getOutageReport_TotalCml();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl <em>Outage Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageRecord()
		 * @generated
		 */
		EClass OUTAGE_RECORD = eINSTANCE.getOutageRecord();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_RECORD__MODE = eINSTANCE.getOutageRecord_Mode();

		/**
		 * The meta object literal for the '<em><b>Outage Report</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_RECORD__OUTAGE_REPORT = eINSTANCE.getOutageRecord_OutageReport();

		/**
		 * The meta object literal for the '<em><b>Action Taken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_RECORD__ACTION_TAKEN = eINSTANCE.getOutageRecord_ActionTaken();

		/**
		 * The meta object literal for the '<em><b>End Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_RECORD__END_DATE_TIME = eINSTANCE.getOutageRecord_EndDateTime();

		/**
		 * The meta object literal for the '<em><b>Outage Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_RECORD__OUTAGE_STEPS = eINSTANCE.getOutageRecord_OutageSteps();

		/**
		 * The meta object literal for the '<em><b>Outage Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_RECORD__OUTAGE_CODES = eINSTANCE.getOutageRecord_OutageCodes();

		/**
		 * The meta object literal for the '<em><b>Damage Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_RECORD__DAMAGE_CODE = eINSTANCE.getOutageRecord_DamageCode();

		/**
		 * The meta object literal for the '<em><b>Is Planned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTAGE_RECORD__IS_PLANNED = eINSTANCE.getOutageRecord_IsPlanned();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OperationalRestrictionImpl <em>Operational Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OperationalRestrictionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOperationalRestriction()
		 * @generated
		 */
		EClass OPERATIONAL_RESTRICTION = eINSTANCE.getOperationalRestriction();

		/**
		 * The meta object literal for the '<em><b>Active Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_RESTRICTION__ACTIVE_PERIOD = eINSTANCE.getOperationalRestriction_ActivePeriod();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl <em>Network Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getNetworkDataSet()
		 * @generated
		 */
		EClass NETWORK_DATA_SET = eINSTANCE.getNetworkDataSet();

		/**
		 * The meta object literal for the '<em><b>Circuit Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__CIRCUIT_SECTIONS = eINSTANCE.getNetworkDataSet_CircuitSections();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__CHANGE_ITEMS = eINSTANCE.getNetworkDataSet_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Change Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__CHANGE_SETS = eINSTANCE.getNetworkDataSet_ChangeSets();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES = eINSTANCE.getNetworkDataSet_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__STATUS = eINSTANCE.getNetworkDataSet_Status();

		/**
		 * The meta object literal for the '<em><b>Land Bases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__LAND_BASES = eINSTANCE.getNetworkDataSet_LandBases();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA_SET__DOCUMENTS = eINSTANCE.getNetworkDataSet_Documents();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DATA_SET__CATEGORY = eINSTANCE.getNetworkDataSet_Category();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentCodeImpl <em>Incident Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentCodeImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getIncidentCode()
		 * @generated
		 */
		EClass INCIDENT_CODE = eINSTANCE.getIncidentCode();

		/**
		 * The meta object literal for the '<em><b>Sub Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCIDENT_CODE__SUB_CODE = eINSTANCE.getIncidentCode_SubCode();

		/**
		 * The meta object literal for the '<em><b>Incident Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_CODE__INCIDENT_RECORDS = eINSTANCE.getIncidentCode_IncidentRecords();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl <em>Circuit Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCircuitSection()
		 * @generated
		 */
		EClass CIRCUIT_SECTION = eINSTANCE.getCircuitSection();

		/**
		 * The meta object literal for the '<em><b>Circuits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_SECTION__CIRCUITS = eINSTANCE.getCircuitSection_Circuits();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_SECTION__NETWORK_DATA_SETS = eINSTANCE.getCircuitSection_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES = eINSTANCE.getCircuitSection_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Connection Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_SECTION__CONNECTION_KIND = eINSTANCE.getCircuitSection_ConnectionKind();

		/**
		 * The meta object literal for the '<em><b>Conductor Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_SECTION__CONDUCTOR_ASSETS = eINSTANCE.getCircuitSection_ConductorAssets();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind <em>Outage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getOutageKind()
		 * @generated
		 */
		EEnum OUTAGE_KIND = eINSTANCE.getOutageKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItemKind <em>Change Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItemKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getChangeItemKind()
		 * @generated
		 */
		EEnum CHANGE_ITEM_KIND = eINSTANCE.getChangeItemKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind <em>Trouble Reporting Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getTroubleReportingKind()
		 * @generated
		 */
		EEnum TROUBLE_REPORTING_KIND = eINSTANCE.getTroubleReportingKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind <em>Switching Step Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getSwitchingStepStatusKind()
		 * @generated
		 */
		EEnum SWITCHING_STEP_STATUS_KIND = eINSTANCE.getSwitchingStepStatusKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind <em>PSR Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getPSREventKind()
		 * @generated
		 */
		EEnum PSR_EVENT_KIND = eINSTANCE.getPSREventKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind <em>Circuit Connection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl#getCircuitConnectionKind()
		 * @generated
		 */
		EEnum CIRCUIT_CONNECTION_KIND = eINSTANCE.getCircuitConnectionKind();

	}

} //InfOperationsPackage
