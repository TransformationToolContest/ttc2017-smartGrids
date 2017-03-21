/**
 */
package CIM.IEC61970.LoadModel;

import CIM.CIMPackage;

import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Wires.WiresPackage;

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
 * @see CIM.IEC61970.LoadModel.LoadModelFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package is responsible for modeling the energy consumers and the system load as curves and associated curve data. Special circumstances that may affect the load, such as seasons and daytypes, are also included here.\n\nThis information is used by Load Forecasting and Load Management.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package is responsible for modeling the energy consumers and the system load as curves and associated curve data. Special circumstances that may affect the load, such as seasons and daytypes, are also included here.\n\nThis information is used by Load Forecasting and Load Management.'"
 * @generated
 */
public interface LoadModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LoadModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#LoadModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimLoadModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoadModelPackage eINSTANCE = CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl <em>Season Day Type Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSeasonDayTypeSchedule()
	 * @generated
	 */
	int SEASON_DAY_TYPE_SCHEDULE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__SEASON = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Season Day Type Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Season Day Type Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.ConformLoadScheduleImpl <em>Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.ConformLoadScheduleImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getConformLoadSchedule()
	 * @generated
	 */
	int CONFORM_LOAD_SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__UUID = SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__MRID = SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__NAME = SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__DESCRIPTION = SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__PATH_NAME = SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__MODELING_AUTHORITY_SET = SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__LOCAL_NAME = SEASON_DAY_TYPE_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__ALIAS_NAME = SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__VALUE2_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__VALUE1_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__START_TIME = SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__VALUE2_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__VALUE1_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__END_TIME = SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__TIME_POINTS = SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__TIME_STEP = SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__DAY_TYPE = SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__SEASON = SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Conform Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE_FEATURE_COUNT = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE_OPERATION_COUNT = SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.LoadGroupImpl <em>Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.LoadGroupImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getLoadGroup()
	 * @generated
	 */
	int LOAD_GROUP = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Registered Loads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__REGISTERED_LOADS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__SUB_LOAD_AREA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.NonConformLoadGroupImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadGroup()
	 * @generated
	 */
	int NON_CONFORM_LOAD_GROUP = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__UUID = LOAD_GROUP__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__MRID = LOAD_GROUP__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__NAME = LOAD_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__DESCRIPTION = LOAD_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__PATH_NAME = LOAD_GROUP__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__MODELING_AUTHORITY_SET = LOAD_GROUP__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__LOCAL_NAME = LOAD_GROUP__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__ALIAS_NAME = LOAD_GROUP__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Registered Loads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__REGISTERED_LOADS = LOAD_GROUP__REGISTERED_LOADS;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The feature id for the '<em><b>Non Conform Load Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = LOAD_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_OPERATION_COUNT = LOAD_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.NonConformLoadImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getNonConformLoad()
	 * @generated
	 */
	int NON_CONFORM_LOAD = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__UUID = WiresPackage.ENERGY_CONSUMER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MRID = WiresPackage.ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__DESCRIPTION = WiresPackage.ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PATH_NAME = WiresPackage.ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MODELING_AUTHORITY_SET = WiresPackage.ENERGY_CONSUMER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOCAL_NAME = WiresPackage.ENERGY_CONSUMER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__REPORTING_GROUP = WiresPackage.ENERGY_CONSUMER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__NETWORK_DATA_SETS = WiresPackage.ENERGY_CONSUMER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOCATION = WiresPackage.ENERGY_CONSUMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__OUTAGE_SCHEDULE = WiresPackage.ENERGY_CONSUMER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PSR_EVENT = WiresPackage.ENERGY_CONSUMER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__SAFETY_DOCUMENTS = WiresPackage.ENERGY_CONSUMER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__ERP_ORGANISATION_ROLES = WiresPackage.ENERGY_CONSUMER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CIRCUIT_SECTIONS = WiresPackage.ENERGY_CONSUMER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__ASSETS = WiresPackage.ENERGY_CONSUMER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__SCHEDULE_STEPS = WiresPackage.ENERGY_CONSUMER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PSR_TYPE = WiresPackage.ENERGY_CONSUMER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PSR_LISTS = WiresPackage.ENERGY_CONSUMER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__OPERATING_SHARE = WiresPackage.ENERGY_CONSUMER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CHANGE_ITEMS = WiresPackage.ENERGY_CONSUMER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__DOCUMENT_ROLES = WiresPackage.ENERGY_CONSUMER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__OPERATIONAL_LIMIT_SET = WiresPackage.ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CONTINGENCY_EQUIPMENT = WiresPackage.ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__NORMA_ILY_IN_SERVICE = WiresPackage.ENERGY_CONSUMER__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CUSTOMER_AGREEMENTS = WiresPackage.ENERGY_CONSUMER__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__AGGREGATE = WiresPackage.ENERGY_CONSUMER__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PROTECTION_EQUIPMENTS = WiresPackage.ENERGY_CONSUMER__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__OUTAGE_STEP_ROLES = WiresPackage.ENERGY_CONSUMER__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CLEARANCE_TAGS = WiresPackage.ENERGY_CONSUMER__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__SV_STATUS = WiresPackage.ENERGY_CONSUMER__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PHASES = WiresPackage.ENERGY_CONSUMER__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__ELECTRICAL_ASSETS = WiresPackage.ENERGY_CONSUMER__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__SERVICE_DELIVERY_POINTS = WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__POWER_CUT_ZONE = WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CUSTOMER_COUNT = WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_GROUP = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_OPERATION_COUNT = WiresPackage.ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.DayTypeImpl <em>Day Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.DayTypeImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getDayType()
	 * @generated
	 */
	int DAY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.EnergyAreaImpl <em>Energy Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.EnergyAreaImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getEnergyArea()
	 * @generated
	 */
	int ENERGY_AREA = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__CONTROL_AREA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energy Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energy Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.SubLoadAreaImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSubLoadArea()
	 * @generated
	 */
	int SUB_LOAD_AREA = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__UUID = ENERGY_AREA__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__MRID = ENERGY_AREA__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__NAME = ENERGY_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__DESCRIPTION = ENERGY_AREA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__PATH_NAME = ENERGY_AREA__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__MODELING_AUTHORITY_SET = ENERGY_AREA__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__LOCAL_NAME = ENERGY_AREA__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__ALIAS_NAME = ENERGY_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__CONTROL_AREA = ENERGY_AREA__CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__LOAD_AREA = ENERGY_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__LOAD_GROUPS = ENERGY_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_FEATURE_COUNT = ENERGY_AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_OPERATION_COUNT = ENERGY_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.ConformLoadGroupImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getConformLoadGroup()
	 * @generated
	 */
	int CONFORM_LOAD_GROUP = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__UUID = LOAD_GROUP__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__MRID = LOAD_GROUP__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__NAME = LOAD_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__DESCRIPTION = LOAD_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__PATH_NAME = LOAD_GROUP__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__MODELING_AUTHORITY_SET = LOAD_GROUP__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__LOCAL_NAME = LOAD_GROUP__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__ALIAS_NAME = LOAD_GROUP__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Registered Loads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__REGISTERED_LOADS = LOAD_GROUP__REGISTERED_LOADS;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conform Load Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES = LOAD_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_OPERATION_COUNT = LOAD_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.StationSupplyImpl <em>Station Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.StationSupplyImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getStationSupply()
	 * @generated
	 */
	int STATION_SUPPLY = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__UUID = WiresPackage.ENERGY_CONSUMER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MRID = WiresPackage.ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__DESCRIPTION = WiresPackage.ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PATH_NAME = WiresPackage.ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MODELING_AUTHORITY_SET = WiresPackage.ENERGY_CONSUMER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__LOCAL_NAME = WiresPackage.ENERGY_CONSUMER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__REPORTING_GROUP = WiresPackage.ENERGY_CONSUMER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__NETWORK_DATA_SETS = WiresPackage.ENERGY_CONSUMER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__LOCATION = WiresPackage.ENERGY_CONSUMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__OUTAGE_SCHEDULE = WiresPackage.ENERGY_CONSUMER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PSR_EVENT = WiresPackage.ENERGY_CONSUMER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__SAFETY_DOCUMENTS = WiresPackage.ENERGY_CONSUMER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__ERP_ORGANISATION_ROLES = WiresPackage.ENERGY_CONSUMER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CIRCUIT_SECTIONS = WiresPackage.ENERGY_CONSUMER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__ASSETS = WiresPackage.ENERGY_CONSUMER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__SCHEDULE_STEPS = WiresPackage.ENERGY_CONSUMER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PSR_TYPE = WiresPackage.ENERGY_CONSUMER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PSR_LISTS = WiresPackage.ENERGY_CONSUMER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__OPERATING_SHARE = WiresPackage.ENERGY_CONSUMER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CHANGE_ITEMS = WiresPackage.ENERGY_CONSUMER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__DOCUMENT_ROLES = WiresPackage.ENERGY_CONSUMER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__OPERATIONAL_LIMIT_SET = WiresPackage.ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CONTINGENCY_EQUIPMENT = WiresPackage.ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__NORMA_ILY_IN_SERVICE = WiresPackage.ENERGY_CONSUMER__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CUSTOMER_AGREEMENTS = WiresPackage.ENERGY_CONSUMER__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__AGGREGATE = WiresPackage.ENERGY_CONSUMER__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PROTECTION_EQUIPMENTS = WiresPackage.ENERGY_CONSUMER__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__OUTAGE_STEP_ROLES = WiresPackage.ENERGY_CONSUMER__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CLEARANCE_TAGS = WiresPackage.ENERGY_CONSUMER__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__SV_STATUS = WiresPackage.ENERGY_CONSUMER__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PHASES = WiresPackage.ENERGY_CONSUMER__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__ELECTRICAL_ASSETS = WiresPackage.ENERGY_CONSUMER__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__SERVICE_DELIVERY_POINTS = WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__POWER_CUT_ZONE = WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CUSTOMER_COUNT = WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The number of structural features of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY_OPERATION_COUNT = WiresPackage.ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.NonConformLoadScheduleImpl <em>Non Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.NonConformLoadScheduleImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadSchedule()
	 * @generated
	 */
	int NON_CONFORM_LOAD_SCHEDULE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__UUID = SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__MRID = SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__NAME = SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__DESCRIPTION = SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__PATH_NAME = SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__MODELING_AUTHORITY_SET = SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__LOCAL_NAME = SEASON_DAY_TYPE_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__ALIAS_NAME = SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__VALUE2_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__VALUE1_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__START_TIME = SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__VALUE2_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__VALUE1_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__END_TIME = SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__TIME_POINTS = SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__TIME_STEP = SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__DAY_TYPE = SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__SEASON = SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Non Conform Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE_FEATURE_COUNT = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE_OPERATION_COUNT = SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.LoadAreaImpl <em>Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.LoadAreaImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getLoadArea()
	 * @generated
	 */
	int LOAD_AREA = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__UUID = ENERGY_AREA__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__MRID = ENERGY_AREA__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__NAME = ENERGY_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__DESCRIPTION = ENERGY_AREA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__PATH_NAME = ENERGY_AREA__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__MODELING_AUTHORITY_SET = ENERGY_AREA__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__LOCAL_NAME = ENERGY_AREA__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__ALIAS_NAME = ENERGY_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__CONTROL_AREA = ENERGY_AREA__CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Sub Load Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__SUB_LOAD_AREAS = ENERGY_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_FEATURE_COUNT = ENERGY_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_OPERATION_COUNT = ENERGY_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl <em>Load Response Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getLoadResponseCharacteristic()
	 * @generated
	 */
	int LOAD_RESPONSE_CHARACTERISTIC = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Exponent Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>PConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>QConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>PConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>QConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Load Response Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Load Response Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.SeasonImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__VIOLATION_LIMITS = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__START_DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__SEASON_DAY_TYPE_SCHEDULES = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capacity Benefit Margin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__CAPACITY_BENEFIT_MARGIN = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__END_DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl <em>Power Cut Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getPowerCutZone()
	 * @generated
	 */
	int POWER_CUT_ZONE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__ENERGY_CONSUMERS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cut Level1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__CUT_LEVEL1 = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cut Level2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE__CUT_LEVEL2 = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Power Cut Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Power Cut Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CUT_ZONE_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.impl.ConformLoadImpl <em>Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.impl.ConformLoadImpl
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getConformLoad()
	 * @generated
	 */
	int CONFORM_LOAD = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__UUID = WiresPackage.ENERGY_CONSUMER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MRID = WiresPackage.ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__DESCRIPTION = WiresPackage.ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PATH_NAME = WiresPackage.ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MODELING_AUTHORITY_SET = WiresPackage.ENERGY_CONSUMER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOCAL_NAME = WiresPackage.ENERGY_CONSUMER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__REPORTING_GROUP = WiresPackage.ENERGY_CONSUMER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__NETWORK_DATA_SETS = WiresPackage.ENERGY_CONSUMER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOCATION = WiresPackage.ENERGY_CONSUMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__OUTAGE_SCHEDULE = WiresPackage.ENERGY_CONSUMER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PSR_EVENT = WiresPackage.ENERGY_CONSUMER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__SAFETY_DOCUMENTS = WiresPackage.ENERGY_CONSUMER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__ERP_ORGANISATION_ROLES = WiresPackage.ENERGY_CONSUMER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CIRCUIT_SECTIONS = WiresPackage.ENERGY_CONSUMER__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__ASSETS = WiresPackage.ENERGY_CONSUMER__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__SCHEDULE_STEPS = WiresPackage.ENERGY_CONSUMER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PSR_TYPE = WiresPackage.ENERGY_CONSUMER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PSR_LISTS = WiresPackage.ENERGY_CONSUMER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__OPERATING_SHARE = WiresPackage.ENERGY_CONSUMER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CHANGE_ITEMS = WiresPackage.ENERGY_CONSUMER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__DOCUMENT_ROLES = WiresPackage.ENERGY_CONSUMER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__OPERATIONAL_LIMIT_SET = WiresPackage.ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CONTINGENCY_EQUIPMENT = WiresPackage.ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__NORMA_ILY_IN_SERVICE = WiresPackage.ENERGY_CONSUMER__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CUSTOMER_AGREEMENTS = WiresPackage.ENERGY_CONSUMER__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__AGGREGATE = WiresPackage.ENERGY_CONSUMER__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PROTECTION_EQUIPMENTS = WiresPackage.ENERGY_CONSUMER__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__OUTAGE_STEP_ROLES = WiresPackage.ENERGY_CONSUMER__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CLEARANCE_TAGS = WiresPackage.ENERGY_CONSUMER__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__SV_STATUS = WiresPackage.ENERGY_CONSUMER__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PHASES = WiresPackage.ENERGY_CONSUMER__PHASES;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__ELECTRICAL_ASSETS = WiresPackage.ENERGY_CONSUMER__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__SERVICE_DELIVERY_POINTS = WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__POWER_CUT_ZONE = WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CUSTOMER_COUNT = WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_GROUP = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_OPERATION_COUNT = WiresPackage.ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.LoadModel.SeasonName <em>Season Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.LoadModel.SeasonName
	 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSeasonName()
	 * @generated
	 */
	int SEASON_NAME = 16;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.ConformLoadSchedule <em>Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Schedule</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoadSchedule
	 * @generated
	 */
	EClass getConformLoadSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conform Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup()
	 * @see #getConformLoadSchedule()
	 * @generated
	 */
	EReference getConformLoadSchedule_ConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoadGroup
	 * @generated
	 */
	EClass getNonConformLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Conform Load Schedules</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroup_NonConformLoadSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroup_EnergyConsumers();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoad
	 * @generated
	 */
	EClass getNonConformLoad();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoad#getLoadGroup()
	 * @see #getNonConformLoad()
	 * @generated
	 */
	EReference getNonConformLoad_LoadGroup();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Type</em>'.
	 * @see CIM.IEC61970.LoadModel.DayType
	 * @generated
	 */
	EClass getDayType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CIM.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules()
	 * @see #getDayType()
	 * @generated
	 */
	EReference getDayType_SeasonDayTypeSchedules();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area</em>'.
	 * @see CIM.IEC61970.LoadModel.SubLoadArea
	 * @generated
	 */
	EClass getSubLoadArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Area</em>'.
	 * @see CIM.IEC61970.LoadModel.SubLoadArea#getLoadArea()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadArea();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Groups</em>'.
	 * @see CIM.IEC61970.LoadModel.SubLoadArea#getLoadGroups()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadGroups();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoadGroup
	 * @generated
	 */
	EClass getConformLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroup_EnergyConsumers();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conform Load Schedules</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroup_ConformLoadSchedules();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Supply</em>'.
	 * @see CIM.IEC61970.LoadModel.StationSupply
	 * @generated
	 */
	EClass getStationSupply();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season Day Type Schedule</em>'.
	 * @see CIM.IEC61970.LoadModel.SeasonDayTypeSchedule
	 * @generated
	 */
	EClass getSeasonDayTypeSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Day Type</em>'.
	 * @see CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	EReference getSeasonDayTypeSchedule_DayType();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Season</em>'.
	 * @see CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	EReference getSeasonDayTypeSchedule_Season();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Schedule</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoadSchedule
	 * @generated
	 */
	EClass getNonConformLoadSchedule();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Non Conform Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup()
	 * @see #getNonConformLoadSchedule()
	 * @generated
	 */
	EReference getNonConformLoadSchedule_NonConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadArea
	 * @generated
	 */
	EClass getLoadArea();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Load Areas</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadArea#getSubLoadAreas()
	 * @see #getLoadArea()
	 * @generated
	 */
	EReference getLoadArea_SubLoadAreas();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.EnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Area</em>'.
	 * @see CIM.IEC61970.LoadModel.EnergyArea
	 * @generated
	 */
	EClass getEnergyArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CIM.IEC61970.LoadModel.EnergyArea#getControlArea()
	 * @see #getEnergyArea()
	 * @generated
	 */
	EReference getEnergyArea_ControlArea();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic <em>Load Response Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Response Characteristic</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic
	 * @generated
	 */
	EClass getLoadResponseCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent Model</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_ExponentModel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PConstant Current</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PConstantCurrent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QConstant Impedance</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QConstantImpedance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QFrequency Exponent</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QFrequencyExponent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PFrequency Exponent</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PFrequencyExponent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PConstant Impedance</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PConstantImpedance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QVoltage Exponent</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QVoltageExponent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PVoltage Exponent</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PVoltageExponent();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumer</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EReference getLoadResponseCharacteristic_EnergyConsumer();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QConstant Current</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QConstantCurrent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PConstant Power</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PConstantPower();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QConstant Power</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QConstantPower();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadGroup
	 * @generated
	 */
	EClass getLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.LoadGroup#getRegisteredLoads <em>Registered Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Loads</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadGroup#getRegisteredLoads()
	 * @see #getLoadGroup()
	 * @generated
	 */
	EReference getLoadGroup_RegisteredLoads();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Load Area</em>'.
	 * @see CIM.IEC61970.LoadModel.LoadGroup#getSubLoadArea()
	 * @see #getLoadGroup()
	 * @generated
	 */
	EReference getLoadGroup_SubLoadArea();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see CIM.IEC61970.LoadModel.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.Season#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violation Limits</em>'.
	 * @see CIM.IEC61970.LoadModel.Season#getViolationLimits()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_ViolationLimits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see CIM.IEC61970.LoadModel.Season#getStartDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_StartDate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CIM.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_SeasonDayTypeSchedules();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM.IEC61970.LoadModel.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Name();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.Season#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capacity Benefit Margin</em>'.
	 * @see CIM.IEC61970.LoadModel.Season#getCapacityBenefitMargin()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_CapacityBenefitMargin();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see CIM.IEC61970.LoadModel.Season#getEndDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_EndDate();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.PowerCutZone <em>Power Cut Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cut Zone</em>'.
	 * @see CIM.IEC61970.LoadModel.PowerCutZone
	 * @generated
	 */
	EClass getPowerCutZone();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CIM.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers()
	 * @see #getPowerCutZone()
	 * @generated
	 */
	EReference getPowerCutZone_EnergyConsumers();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Level1</em>'.
	 * @see CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel1()
	 * @see #getPowerCutZone()
	 * @generated
	 */
	EAttribute getPowerCutZone_CutLevel1();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Level2</em>'.
	 * @see CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel2()
	 * @see #getPowerCutZone()
	 * @generated
	 */
	EAttribute getPowerCutZone_CutLevel2();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.LoadModel.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoad
	 * @generated
	 */
	EClass getConformLoad();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CIM.IEC61970.LoadModel.ConformLoad#getLoadGroup()
	 * @see #getConformLoad()
	 * @generated
	 */
	EReference getConformLoad_LoadGroup();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.LoadModel.SeasonName <em>Season Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season Name</em>'.
	 * @see CIM.IEC61970.LoadModel.SeasonName
	 * @generated
	 */
	EEnum getSeasonName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoadModelFactory getLoadModelFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.ConformLoadScheduleImpl <em>Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.ConformLoadScheduleImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getConformLoadSchedule()
		 * @generated
		 */
		EClass CONFORM_LOAD_SCHEDULE = eINSTANCE.getConformLoadSchedule();

		/**
		 * The meta object literal for the '<em><b>Conform Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadSchedule_ConformLoadGroup();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.NonConformLoadGroupImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadGroup()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Non Conform Load Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES = eINSTANCE.getNonConformLoadGroup_NonConformLoadSchedules();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = eINSTANCE.getNonConformLoadGroup_EnergyConsumers();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.NonConformLoadImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getNonConformLoad()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD = eINSTANCE.getNonConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getNonConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.DayTypeImpl <em>Day Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.DayTypeImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getDayType()
		 * @generated
		 */
		EClass DAY_TYPE = eINSTANCE.getDayType();

		/**
		 * The meta object literal for the '<em><b>Season Day Type Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = eINSTANCE.getDayType_SeasonDayTypeSchedules();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.SubLoadAreaImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSubLoadArea()
		 * @generated
		 */
		EClass SUB_LOAD_AREA = eINSTANCE.getSubLoadArea();

		/**
		 * The meta object literal for the '<em><b>Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA__LOAD_AREA = eINSTANCE.getSubLoadArea_LoadArea();

		/**
		 * The meta object literal for the '<em><b>Load Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA__LOAD_GROUPS = eINSTANCE.getSubLoadArea_LoadGroups();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.ConformLoadGroupImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getConformLoadGroup()
		 * @generated
		 */
		EClass CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = eINSTANCE.getConformLoadGroup_EnergyConsumers();

		/**
		 * The meta object literal for the '<em><b>Conform Load Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES = eINSTANCE.getConformLoadGroup_ConformLoadSchedules();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.StationSupplyImpl <em>Station Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.StationSupplyImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getStationSupply()
		 * @generated
		 */
		EClass STATION_SUPPLY = eINSTANCE.getStationSupply();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl <em>Season Day Type Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSeasonDayTypeSchedule()
		 * @generated
		 */
		EClass SEASON_DAY_TYPE_SCHEDULE = eINSTANCE.getSeasonDayTypeSchedule();

		/**
		 * The meta object literal for the '<em><b>Day Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = eINSTANCE.getSeasonDayTypeSchedule_DayType();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON_DAY_TYPE_SCHEDULE__SEASON = eINSTANCE.getSeasonDayTypeSchedule_Season();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.NonConformLoadScheduleImpl <em>Non Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.NonConformLoadScheduleImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadSchedule()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD_SCHEDULE = eINSTANCE.getNonConformLoadSchedule();

		/**
		 * The meta object literal for the '<em><b>Non Conform Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadSchedule_NonConformLoadGroup();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.LoadAreaImpl <em>Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.LoadAreaImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getLoadArea()
		 * @generated
		 */
		EClass LOAD_AREA = eINSTANCE.getLoadArea();

		/**
		 * The meta object literal for the '<em><b>Sub Load Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_AREA__SUB_LOAD_AREAS = eINSTANCE.getLoadArea_SubLoadAreas();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.EnergyAreaImpl <em>Energy Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.EnergyAreaImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getEnergyArea()
		 * @generated
		 */
		EClass ENERGY_AREA = eINSTANCE.getEnergyArea();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_AREA__CONTROL_AREA = eINSTANCE.getEnergyArea_ControlArea();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl <em>Load Response Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getLoadResponseCharacteristic()
		 * @generated
		 */
		EClass LOAD_RESPONSE_CHARACTERISTIC = eINSTANCE.getLoadResponseCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Exponent Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL = eINSTANCE.getLoadResponseCharacteristic_ExponentModel();

		/**
		 * The meta object literal for the '<em><b>PConstant Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT = eINSTANCE.getLoadResponseCharacteristic_PConstantCurrent();

		/**
		 * The meta object literal for the '<em><b>QConstant Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE = eINSTANCE.getLoadResponseCharacteristic_QConstantImpedance();

		/**
		 * The meta object literal for the '<em><b>QFrequency Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_QFrequencyExponent();

		/**
		 * The meta object literal for the '<em><b>PFrequency Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_PFrequencyExponent();

		/**
		 * The meta object literal for the '<em><b>PConstant Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE = eINSTANCE.getLoadResponseCharacteristic_PConstantImpedance();

		/**
		 * The meta object literal for the '<em><b>QVoltage Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_QVoltageExponent();

		/**
		 * The meta object literal for the '<em><b>PVoltage Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_PVoltageExponent();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = eINSTANCE.getLoadResponseCharacteristic_EnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>QConstant Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT = eINSTANCE.getLoadResponseCharacteristic_QConstantCurrent();

		/**
		 * The meta object literal for the '<em><b>PConstant Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER = eINSTANCE.getLoadResponseCharacteristic_PConstantPower();

		/**
		 * The meta object literal for the '<em><b>QConstant Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER = eINSTANCE.getLoadResponseCharacteristic_QConstantPower();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.LoadGroupImpl <em>Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.LoadGroupImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getLoadGroup()
		 * @generated
		 */
		EClass LOAD_GROUP = eINSTANCE.getLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Registered Loads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GROUP__REGISTERED_LOADS = eINSTANCE.getLoadGroup_RegisteredLoads();

		/**
		 * The meta object literal for the '<em><b>Sub Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GROUP__SUB_LOAD_AREA = eINSTANCE.getLoadGroup_SubLoadArea();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.SeasonImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Violation Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__VIOLATION_LIMITS = eINSTANCE.getSeason_ViolationLimits();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__START_DATE = eINSTANCE.getSeason_StartDate();

		/**
		 * The meta object literal for the '<em><b>Season Day Type Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__SEASON_DAY_TYPE_SCHEDULES = eINSTANCE.getSeason_SeasonDayTypeSchedules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__NAME = eINSTANCE.getSeason_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity Benefit Margin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__CAPACITY_BENEFIT_MARGIN = eINSTANCE.getSeason_CapacityBenefitMargin();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__END_DATE = eINSTANCE.getSeason_EndDate();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl <em>Power Cut Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getPowerCutZone()
		 * @generated
		 */
		EClass POWER_CUT_ZONE = eINSTANCE.getPowerCutZone();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CUT_ZONE__ENERGY_CONSUMERS = eINSTANCE.getPowerCutZone_EnergyConsumers();

		/**
		 * The meta object literal for the '<em><b>Cut Level1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CUT_ZONE__CUT_LEVEL1 = eINSTANCE.getPowerCutZone_CutLevel1();

		/**
		 * The meta object literal for the '<em><b>Cut Level2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CUT_ZONE__CUT_LEVEL2 = eINSTANCE.getPowerCutZone_CutLevel2();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.impl.ConformLoadImpl <em>Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.impl.ConformLoadImpl
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getConformLoad()
		 * @generated
		 */
		EClass CONFORM_LOAD = eINSTANCE.getConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.LoadModel.SeasonName <em>Season Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.LoadModel.SeasonName
		 * @see CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl#getSeasonName()
		 * @generated
		 */
		EEnum SEASON_NAME = eINSTANCE.getSeasonName();

	}

} //LoadModelPackage
