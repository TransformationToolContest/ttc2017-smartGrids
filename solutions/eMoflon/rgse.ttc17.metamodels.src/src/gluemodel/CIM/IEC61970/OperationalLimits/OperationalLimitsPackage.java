/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;

import gluemodel.CIM.CIMPackage;

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
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The OperationalLimits package models a specification of limits associated with equipment and other operational entities.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The OperationalLimits package models a specification of limits associated with equipment and other operational entities.'"
 * @generated
 */
public interface OperationalLimitsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OperationalLimits";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#OperationalLimits";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimOperationalLimits";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationalLimitsPackage eINSTANCE = gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl <em>Branch Group Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getBranchGroupTerminal()
	 * @generated
	 */
	int BRANCH_GROUP_TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_TERMINAL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_TERMINAL__TERMINAL = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_TERMINAL__BRANCH_GROUP = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Branch Group Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_TERMINAL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Branch Group Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_TERMINAL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl <em>Operational Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimit()
	 * @generated
	 */
	int OPERATIONAL_LIMIT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operational Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operational Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl <em>Branch Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getBranchGroup()
	 * @generated
	 */
	int BRANCH_GROUP = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Monitor Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MONITOR_REACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MINIMUM_REACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__BRANCH_GROUP_TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitor Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MONITOR_ACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maximum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MAXIMUM_REACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MAXIMUM_ACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP__MINIMUM_ACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Branch Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Branch Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.VoltageLimitImpl <em>Voltage Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.VoltageLimitImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getVoltageLimit()
	 * @generated
	 */
	int VOLTAGE_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__LOCAL_NAME = OPERATIONAL_LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Voltage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Voltage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.ApparentPowerLimitImpl <em>Apparent Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.ApparentPowerLimitImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getApparentPowerLimit()
	 * @generated
	 */
	int APPARENT_POWER_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__LOCAL_NAME = OPERATIONAL_LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apparent Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apparent Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.CurrentLimitImpl <em>Current Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.CurrentLimitImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getCurrentLimit()
	 * @generated
	 */
	int CURRENT_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__LOCAL_NAME = OPERATIONAL_LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl <em>Operational Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitSet()
	 * @generated
	 */
	int OPERATIONAL_LIMIT_SET = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__EQUIPMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operational Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operational Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.ActivePowerLimitImpl <em>Active Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.ActivePowerLimitImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getActivePowerLimit()
	 * @generated
	 */
	int ACTIVE_POWER_LIMIT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__LOCAL_NAME = OPERATIONAL_LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl <em>Operational Limit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitType()
	 * @generated
	 */
	int OPERATIONAL_LIMIT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Acceptable Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__DIRECTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operational Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operational Limit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operational Limit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind <em>Operational Limit Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitDirectionKind()
	 * @generated
	 */
	int OPERATIONAL_LIMIT_DIRECTION_KIND = 9;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Group Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal
	 * @generated
	 */
	EClass getBranchGroupTerminal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal()
	 * @see #getBranchGroupTerminal()
	 * @generated
	 */
	EReference getBranchGroupTerminal_Terminal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branch Group</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup()
	 * @see #getBranchGroupTerminal()
	 * @generated
	 */
	EReference getBranchGroupTerminal_BranchGroup();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn()
	 * @see #getBranchGroupTerminal()
	 * @generated
	 */
	EAttribute getBranchGroupTerminal_PositiveFlowIn();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit
	 * @generated
	 */
	EClass getOperationalLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getType()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EAttribute getOperationalLimit_Type();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational Limit Set</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EReference getOperationalLimit_OperationalLimitSet();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational Limit Type</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EReference getOperationalLimit_OperationalLimitType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Group</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup
	 * @generated
	 */
	EClass getBranchGroup();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Reactive Power</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EAttribute getBranchGroup_MonitorReactivePower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Reactive Power</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EAttribute getBranchGroup_MinimumReactivePower();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branch Group Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EReference getBranchGroup_BranchGroupTerminal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Active Power</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EAttribute getBranchGroup_MonitorActivePower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Reactive Power</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EAttribute getBranchGroup_MaximumReactivePower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Active Power</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EAttribute getBranchGroup_MaximumActivePower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Active Power</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	EAttribute getBranchGroup_MinimumActivePower();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.VoltageLimit <em>Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.VoltageLimit
	 * @generated
	 */
	EClass getVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.VoltageLimit#getValue()
	 * @see #getVoltageLimit()
	 * @generated
	 */
	EAttribute getVoltageLimit_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apparent Power Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.ApparentPowerLimit
	 * @generated
	 */
	EClass getApparentPowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.ApparentPowerLimit#getValue()
	 * @see #getApparentPowerLimit()
	 * @generated
	 */
	EAttribute getApparentPowerLimit_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.CurrentLimit <em>Current Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.CurrentLimit
	 * @generated
	 */
	EClass getCurrentLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.CurrentLimit#getValue()
	 * @see #getCurrentLimit()
	 * @generated
	 */
	EAttribute getCurrentLimit_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit Set</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet
	 * @generated
	 */
	EClass getOperationalLimitSet();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Value</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_OperationalLimitValue();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_Terminal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getEquipment()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_Equipment();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.ActivePowerLimit <em>Active Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Power Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.ActivePowerLimit
	 * @generated
	 */
	EClass getActivePowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.ActivePowerLimit#getValue()
	 * @see #getActivePowerLimit()
	 * @generated
	 */
	EAttribute getActivePowerLimit_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType <em>Operational Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit Type</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType
	 * @generated
	 */
	EClass getOperationalLimitType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptable Duration</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration()
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	EAttribute getOperationalLimitType_AcceptableDuration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getDirection()
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	EAttribute getOperationalLimitType_Direction();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit()
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	EReference getOperationalLimitType_OperationalLimit();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind <em>Operational Limit Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational Limit Direction Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @generated
	 */
	EEnum getOperationalLimitDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationalLimitsFactory getOperationalLimitsFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl <em>Branch Group Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getBranchGroupTerminal()
		 * @generated
		 */
		EClass BRANCH_GROUP_TERMINAL = eINSTANCE.getBranchGroupTerminal();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_GROUP_TERMINAL__TERMINAL = eINSTANCE.getBranchGroupTerminal_Terminal();

		/**
		 * The meta object literal for the '<em><b>Branch Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_GROUP_TERMINAL__BRANCH_GROUP = eINSTANCE.getBranchGroupTerminal_BranchGroup();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN = eINSTANCE.getBranchGroupTerminal_PositiveFlowIn();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl <em>Operational Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimit()
		 * @generated
		 */
		EClass OPERATIONAL_LIMIT = eINSTANCE.getOperationalLimit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_LIMIT__TYPE = eINSTANCE.getOperationalLimit_Type();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = eINSTANCE.getOperationalLimit_OperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE = eINSTANCE.getOperationalLimit_OperationalLimitType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl <em>Branch Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getBranchGroup()
		 * @generated
		 */
		EClass BRANCH_GROUP = eINSTANCE.getBranchGroup();

		/**
		 * The meta object literal for the '<em><b>Monitor Reactive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP__MONITOR_REACTIVE_POWER = eINSTANCE.getBranchGroup_MonitorReactivePower();

		/**
		 * The meta object literal for the '<em><b>Minimum Reactive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP__MINIMUM_REACTIVE_POWER = eINSTANCE.getBranchGroup_MinimumReactivePower();

		/**
		 * The meta object literal for the '<em><b>Branch Group Terminal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_GROUP__BRANCH_GROUP_TERMINAL = eINSTANCE.getBranchGroup_BranchGroupTerminal();

		/**
		 * The meta object literal for the '<em><b>Monitor Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP__MONITOR_ACTIVE_POWER = eINSTANCE.getBranchGroup_MonitorActivePower();

		/**
		 * The meta object literal for the '<em><b>Maximum Reactive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP__MAXIMUM_REACTIVE_POWER = eINSTANCE.getBranchGroup_MaximumReactivePower();

		/**
		 * The meta object literal for the '<em><b>Maximum Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP__MAXIMUM_ACTIVE_POWER = eINSTANCE.getBranchGroup_MaximumActivePower();

		/**
		 * The meta object literal for the '<em><b>Minimum Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_GROUP__MINIMUM_ACTIVE_POWER = eINSTANCE.getBranchGroup_MinimumActivePower();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.VoltageLimitImpl <em>Voltage Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.VoltageLimitImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getVoltageLimit()
		 * @generated
		 */
		EClass VOLTAGE_LIMIT = eINSTANCE.getVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_LIMIT__VALUE = eINSTANCE.getVoltageLimit_Value();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.ApparentPowerLimitImpl <em>Apparent Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.ApparentPowerLimitImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getApparentPowerLimit()
		 * @generated
		 */
		EClass APPARENT_POWER_LIMIT = eINSTANCE.getApparentPowerLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPARENT_POWER_LIMIT__VALUE = eINSTANCE.getApparentPowerLimit_Value();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.CurrentLimitImpl <em>Current Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.CurrentLimitImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getCurrentLimit()
		 * @generated
		 */
		EClass CURRENT_LIMIT = eINSTANCE.getCurrentLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_LIMIT__VALUE = eINSTANCE.getCurrentLimit_Value();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl <em>Operational Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitSet()
		 * @generated
		 */
		EClass OPERATIONAL_LIMIT_SET = eINSTANCE.getOperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = eINSTANCE.getOperationalLimitSet_OperationalLimitValue();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT_SET__TERMINAL = eINSTANCE.getOperationalLimitSet_Terminal();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT_SET__EQUIPMENT = eINSTANCE.getOperationalLimitSet_Equipment();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.ActivePowerLimitImpl <em>Active Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.ActivePowerLimitImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getActivePowerLimit()
		 * @generated
		 */
		EClass ACTIVE_POWER_LIMIT = eINSTANCE.getActivePowerLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_POWER_LIMIT__VALUE = eINSTANCE.getActivePowerLimit_Value();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl <em>Operational Limit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitType()
		 * @generated
		 */
		EClass OPERATIONAL_LIMIT_TYPE = eINSTANCE.getOperationalLimitType();

		/**
		 * The meta object literal for the '<em><b>Acceptable Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION = eINSTANCE.getOperationalLimitType_AcceptableDuration();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_LIMIT_TYPE__DIRECTION = eINSTANCE.getOperationalLimitType_Direction();

		/**
		 * The meta object literal for the '<em><b>Operational Limit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT = eINSTANCE.getOperationalLimitType_OperationalLimit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind <em>Operational Limit Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind
		 * @see gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitDirectionKind()
		 * @generated
		 */
		EEnum OPERATIONAL_LIMIT_DIRECTION_KIND = eINSTANCE.getOperationalLimitDirectionKind();

	}

} //OperationalLimitsPackage
