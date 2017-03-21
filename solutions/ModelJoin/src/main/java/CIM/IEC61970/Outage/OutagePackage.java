/**
 */
package CIM.IEC61970.Outage;

import CIM.IEC61970.Core.CorePackage;

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
 * @see CIM.IEC61970.Outage.OutageFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An extension to the Core and Wires packages that models information on the current and planned network configuration. These entities are optional within typical network applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An extension to the Core and Wires packages that models information on the current and planned network configuration. These entities are optional within typical network applications.'"
 * @generated
 */
public interface OutagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Outage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Outage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimOutage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutagePackage eINSTANCE = CIM.IEC61970.Outage.impl.OutagePackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Outage.impl.OutageScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Outage.impl.OutageScheduleImpl
	 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getOutageSchedule()
	 * @generated
	 */
	int OUTAGE_SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__UUID = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__MRID = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__NAME = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__DESCRIPTION = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__PATH_NAME = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__LOCAL_NAME = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__ALIAS_NAME = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__START_TIME = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__VALUE2_UNIT = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__VALUE1_UNIT = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__TIME_POINTS = CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Planned Outage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__PLANNED_OUTAGE = CorePackage.IRREGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE = CorePackage.IRREGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE__SWITCHING_OPERATIONS = CorePackage.IRREGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE_FEATURE_COUNT = CorePackage.IRREGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_SCHEDULE_OPERATION_COUNT = CorePackage.IRREGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Outage.impl.ClearanceTagTypeImpl <em>Clearance Tag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Outage.impl.ClearanceTagTypeImpl
	 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getClearanceTagType()
	 * @generated
	 */
	int CLEARANCE_TAG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE__CLEARANCE_TAGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clearance Tag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clearance Tag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl <em>Clearance Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Outage.impl.ClearanceTagImpl
	 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getClearanceTag()
	 * @generated
	 */
	int CLEARANCE_TAG = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Ground Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__GROUND_REQ_FLAG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Safety Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__SAFETY_DOCUMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tag Issue Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__TAG_ISSUE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clearance Tag Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__CLEARANCE_TAG_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__WORK_END_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__AUTHORITY_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__CONDUCTING_EQUIPMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phase Check Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Deenergize Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__DEENERGIZE_REQ_FLAG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Work Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__WORK_START_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Work Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG__WORK_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Clearance Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Clearance Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_TAG_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Outage.impl.SwitchingOperationImpl <em>Switching Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Outage.impl.SwitchingOperationImpl
	 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getSwitchingOperation()
	 * @generated
	 */
	int SWITCHING_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__SWITCHES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__OPERATION_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__OUTAGE_SCHEDULE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION__NEW_STATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Switching Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Switching Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_OPERATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Outage.SwitchState <em>Switch State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Outage.SwitchState
	 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getSwitchState()
	 * @generated
	 */
	int SWITCH_STATE = 4;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Outage.OutageSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see CIM.IEC61970.Outage.OutageSchedule
	 * @generated
	 */
	EClass getOutageSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Outage</em>'.
	 * @see CIM.IEC61970.Outage.OutageSchedule#getPlannedOutage()
	 * @see #getOutageSchedule()
	 * @generated
	 */
	EReference getOutageSchedule_PlannedOutage();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM.IEC61970.Outage.OutageSchedule#getPowerSystemResource()
	 * @see #getOutageSchedule()
	 * @generated
	 */
	EReference getOutageSchedule_PowerSystemResource();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Outage.OutageSchedule#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Operations</em>'.
	 * @see CIM.IEC61970.Outage.OutageSchedule#getSwitchingOperations()
	 * @see #getOutageSchedule()
	 * @generated
	 */
	EReference getOutageSchedule_SwitchingOperations();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Outage.ClearanceTagType <em>Clearance Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearance Tag Type</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTagType
	 * @generated
	 */
	EClass getClearanceTagType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Outage.ClearanceTagType#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clearance Tags</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTagType#getClearanceTags()
	 * @see #getClearanceTagType()
	 * @generated
	 */
	EReference getClearanceTagType_ClearanceTags();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Outage.ClearanceTag <em>Clearance Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearance Tag</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag
	 * @generated
	 */
	EClass getClearanceTag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Req Flag</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#isGroundReqFlag()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_GroundReqFlag();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Outage.ClearanceTag#getSafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Safety Document</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getSafetyDocument()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EReference getClearanceTag_SafetyDocument();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Issue Time</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getTagIssueTime()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_TagIssueTime();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clearance Tag Type</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getClearanceTagType()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EReference getClearanceTag_ClearanceTagType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work End Time</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getWorkEndTime()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_WorkEndTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority Name</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getAuthorityName()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_AuthorityName();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getConductingEquipment()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EReference getClearanceTag_ConductingEquipment();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Check Req Flag</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_PhaseCheckReqFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deenergize Req Flag</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_DeenergizeReqFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Start Time</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getWorkStartTime()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_WorkStartTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Description</em>'.
	 * @see CIM.IEC61970.Outage.ClearanceTag#getWorkDescription()
	 * @see #getClearanceTag()
	 * @generated
	 */
	EAttribute getClearanceTag_WorkDescription();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Outage.SwitchingOperation <em>Switching Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switching Operation</em>'.
	 * @see CIM.IEC61970.Outage.SwitchingOperation
	 * @generated
	 */
	EClass getSwitchingOperation();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Outage.SwitchingOperation#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see CIM.IEC61970.Outage.SwitchingOperation#getSwitches()
	 * @see #getSwitchingOperation()
	 * @generated
	 */
	EReference getSwitchingOperation_Switches();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Time</em>'.
	 * @see CIM.IEC61970.Outage.SwitchingOperation#getOperationTime()
	 * @see #getSwitchingOperation()
	 * @generated
	 */
	EAttribute getSwitchingOperation_OperationTime();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Schedule</em>'.
	 * @see CIM.IEC61970.Outage.SwitchingOperation#getOutageSchedule()
	 * @see #getSwitchingOperation()
	 * @generated
	 */
	EReference getSwitchingOperation_OutageSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New State</em>'.
	 * @see CIM.IEC61970.Outage.SwitchingOperation#getNewState()
	 * @see #getSwitchingOperation()
	 * @generated
	 */
	EAttribute getSwitchingOperation_NewState();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Outage.SwitchState <em>Switch State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Switch State</em>'.
	 * @see CIM.IEC61970.Outage.SwitchState
	 * @generated
	 */
	EEnum getSwitchState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OutageFactory getOutageFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Outage.impl.OutageScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Outage.impl.OutageScheduleImpl
		 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getOutageSchedule()
		 * @generated
		 */
		EClass OUTAGE_SCHEDULE = eINSTANCE.getOutageSchedule();

		/**
		 * The meta object literal for the '<em><b>Planned Outage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_SCHEDULE__PLANNED_OUTAGE = eINSTANCE.getOutageSchedule_PlannedOutage();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE = eINSTANCE.getOutageSchedule_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Switching Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_SCHEDULE__SWITCHING_OPERATIONS = eINSTANCE.getOutageSchedule_SwitchingOperations();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Outage.impl.ClearanceTagTypeImpl <em>Clearance Tag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Outage.impl.ClearanceTagTypeImpl
		 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getClearanceTagType()
		 * @generated
		 */
		EClass CLEARANCE_TAG_TYPE = eINSTANCE.getClearanceTagType();

		/**
		 * The meta object literal for the '<em><b>Clearance Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_TAG_TYPE__CLEARANCE_TAGS = eINSTANCE.getClearanceTagType_ClearanceTags();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl <em>Clearance Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Outage.impl.ClearanceTagImpl
		 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getClearanceTag()
		 * @generated
		 */
		EClass CLEARANCE_TAG = eINSTANCE.getClearanceTag();

		/**
		 * The meta object literal for the '<em><b>Ground Req Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__GROUND_REQ_FLAG = eINSTANCE.getClearanceTag_GroundReqFlag();

		/**
		 * The meta object literal for the '<em><b>Safety Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_TAG__SAFETY_DOCUMENT = eINSTANCE.getClearanceTag_SafetyDocument();

		/**
		 * The meta object literal for the '<em><b>Tag Issue Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__TAG_ISSUE_TIME = eINSTANCE.getClearanceTag_TagIssueTime();

		/**
		 * The meta object literal for the '<em><b>Clearance Tag Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_TAG__CLEARANCE_TAG_TYPE = eINSTANCE.getClearanceTag_ClearanceTagType();

		/**
		 * The meta object literal for the '<em><b>Work End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__WORK_END_TIME = eINSTANCE.getClearanceTag_WorkEndTime();

		/**
		 * The meta object literal for the '<em><b>Authority Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__AUTHORITY_NAME = eINSTANCE.getClearanceTag_AuthorityName();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_TAG__CONDUCTING_EQUIPMENT = eINSTANCE.getClearanceTag_ConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Phase Check Req Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG = eINSTANCE.getClearanceTag_PhaseCheckReqFlag();

		/**
		 * The meta object literal for the '<em><b>Deenergize Req Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__DEENERGIZE_REQ_FLAG = eINSTANCE.getClearanceTag_DeenergizeReqFlag();

		/**
		 * The meta object literal for the '<em><b>Work Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__WORK_START_TIME = eINSTANCE.getClearanceTag_WorkStartTime();

		/**
		 * The meta object literal for the '<em><b>Work Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE_TAG__WORK_DESCRIPTION = eINSTANCE.getClearanceTag_WorkDescription();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Outage.impl.SwitchingOperationImpl <em>Switching Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Outage.impl.SwitchingOperationImpl
		 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getSwitchingOperation()
		 * @generated
		 */
		EClass SWITCHING_OPERATION = eINSTANCE.getSwitchingOperation();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_OPERATION__SWITCHES = eINSTANCE.getSwitchingOperation_Switches();

		/**
		 * The meta object literal for the '<em><b>Operation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_OPERATION__OPERATION_TIME = eINSTANCE.getSwitchingOperation_OperationTime();

		/**
		 * The meta object literal for the '<em><b>Outage Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCHING_OPERATION__OUTAGE_SCHEDULE = eINSTANCE.getSwitchingOperation_OutageSchedule();

		/**
		 * The meta object literal for the '<em><b>New State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_OPERATION__NEW_STATE = eINSTANCE.getSwitchingOperation_NewState();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Outage.SwitchState <em>Switch State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Outage.SwitchState
		 * @see CIM.IEC61970.Outage.impl.OutagePackageImpl#getSwitchState()
		 * @generated
		 */
		EEnum SWITCH_STATE = eINSTANCE.getSwitchState();

	}

} //OutagePackage
