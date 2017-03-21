/**
 */
package CIM.IEC61970.Meas;

import CIM.CIMPackage;

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
 * @see CIM.IEC61970.Meas.MeasFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains entities that describe dynamic measurement data exchanged between applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains entities that describe dynamic measurement data exchanged between applications.'"
 * @generated
 */
public interface MeasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Meas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Meas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimMeas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasPackage eINSTANCE = CIM.IEC61970.Meas.impl.MeasPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.MeasurementImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>By Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__BY_TIE_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DYNAMIC_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__VIOLATION_LIMITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__PNODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__POWER_SYSTEM_RESOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>For Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__FOR_TIE_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AccumulatorImpl <em>Accumulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AccumulatorImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulator()
	 * @generated
	 */
	int ACCUMULATOR = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__PATH_NAME = MEASUREMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__LOCAL_NAME = MEASUREMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>By Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__BY_TIE_POINT = MEASUREMENT__BY_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__DYNAMIC_SCHEDULES = MEASUREMENT__DYNAMIC_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__VIOLATION_LIMITS = MEASUREMENT__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__PNODE = MEASUREMENT__PNODE;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__UNIT = MEASUREMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>For Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__FOR_TIE_POINT = MEASUREMENT__FOR_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Accumulator Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__ACCUMULATOR_VALUES = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__MAX_VALUE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Limit Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR__LIMIT_SETS = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.Quality61850Impl <em>Quality61850</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.Quality61850Impl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getQuality61850()
	 * @generated
	 */
	int QUALITY61850 = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Suspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__SUSPECT = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estimator Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__ESTIMATOR_REPLACED = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__VALIDITY = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__BAD_REFERENCE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__OLD_DATA = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__FAILURE = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__OVER_FLOW = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__SOURCE = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__OPERATOR_BLOCKED = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__TEST = CIMPackage.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__OSCILLATORY = CIMPackage.ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850__OUT_OF_RANGE = CIMPackage.ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Quality61850</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Quality61850</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY61850_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.MeasurementValueQualityImpl <em>Measurement Value Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.MeasurementValueQualityImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurementValueQuality()
	 * @generated
	 */
	int MEASUREMENT_VALUE_QUALITY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__UUID = QUALITY61850__UUID;

	/**
	 * The feature id for the '<em><b>Suspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__SUSPECT = QUALITY61850__SUSPECT;

	/**
	 * The feature id for the '<em><b>Estimator Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__ESTIMATOR_REPLACED = QUALITY61850__ESTIMATOR_REPLACED;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__VALIDITY = QUALITY61850__VALIDITY;

	/**
	 * The feature id for the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__BAD_REFERENCE = QUALITY61850__BAD_REFERENCE;

	/**
	 * The feature id for the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__OLD_DATA = QUALITY61850__OLD_DATA;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__FAILURE = QUALITY61850__FAILURE;

	/**
	 * The feature id for the '<em><b>Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__OVER_FLOW = QUALITY61850__OVER_FLOW;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__SOURCE = QUALITY61850__SOURCE;

	/**
	 * The feature id for the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__OPERATOR_BLOCKED = QUALITY61850__OPERATOR_BLOCKED;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__TEST = QUALITY61850__TEST;

	/**
	 * The feature id for the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__OSCILLATORY = QUALITY61850__OSCILLATORY;

	/**
	 * The feature id for the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__OUT_OF_RANGE = QUALITY61850__OUT_OF_RANGE;

	/**
	 * The feature id for the '<em><b>Measurement Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE = QUALITY61850_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY_FEATURE_COUNT = QUALITY61850_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement Value Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_QUALITY_OPERATION_COUNT = QUALITY61850_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.LimitImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__PROCEDURES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AccumulatorLimitImpl <em>Accumulator Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AccumulatorLimitImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulatorLimit()
	 * @generated
	 */
	int ACCUMULATOR_LIMIT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__UUID = LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__MRID = LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__DESCRIPTION = LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__PATH_NAME = LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__MODELING_AUTHORITY_SET = LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__LOCAL_NAME = LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__ALIAS_NAME = LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__PROCEDURES = LIMIT__PROCEDURES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__VALUE = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT__LIMIT_SET = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accumulator Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accumulator Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.PotentialTransformerImpl <em>Potential Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.PotentialTransformerImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getPotentialTransformer()
	 * @generated
	 */
	int POTENTIAL_TRANSFORMER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Nominal Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__NOMINAL_RATIO = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__PT_CLASS = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER__ACCURACY_CLASS = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Potential Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Potential Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.MeasurementValueImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurementValue()
	 * @generated
	 */
	int MEASUREMENT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__GML_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__PROCEDURE_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__SENSOR_ACCURACY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__ERP_PERSON = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__TIME_STAMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__REMOTE_SOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AnalogImpl <em>Analog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AnalogImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalog()
	 * @generated
	 */
	int ANALOG = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__PATH_NAME = MEASUREMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__LOCAL_NAME = MEASUREMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>By Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__BY_TIE_POINT = MEASUREMENT__BY_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__DYNAMIC_SCHEDULES = MEASUREMENT__DYNAMIC_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__VIOLATION_LIMITS = MEASUREMENT__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__PNODE = MEASUREMENT__PNODE;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__UNIT = MEASUREMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>For Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__FOR_TIE_POINT = MEASUREMENT__FOR_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MIN_VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__NORMAL_VALUE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__POSITIVE_FLOW_IN = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MAX_VALUE = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Limit Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__LIMIT_SETS = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Set Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__SET_POINT = MEASUREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Analog Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__ANALOG_VALUES = MEASUREMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.StringMeasurementValueImpl <em>String Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.StringMeasurementValueImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getStringMeasurementValue()
	 * @generated
	 */
	int STRING_MEASUREMENT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__DESCRIPTION = MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__PATH_NAME = MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__LOCAL_NAME = MEASUREMENT_VALUE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.ValueToAliasImpl <em>Value To Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.ValueToAliasImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getValueToAlias()
	 * @generated
	 */
	int VALUE_TO_ALIAS = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Alias Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS__VALUE_ALIAS_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value To Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value To Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_ALIAS_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.CurrentTransformerImpl <em>Current Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.CurrentTransformerImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getCurrentTransformer()
	 * @generated
	 */
	int CURRENT_TRANSFORMER = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__LOCAL_NAME = CorePackage.EQUIPMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__NORMA_ILY_IN_SERVICE = CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Max Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__MAX_RATIO = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__CORE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__CT_CLASS = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__USAGE = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__ACCURACY_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER__ACCURACY_CLASS = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Current Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Current Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.LimitSetImpl <em>Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.LimitSetImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getLimitSet()
	 * @generated
	 */
	int LIMIT_SET = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__IS_PERCENTAGE_LIMITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AnalogLimitSetImpl <em>Analog Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AnalogLimitSetImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalogLimitSet()
	 * @generated
	 */
	int ANALOG_LIMIT_SET = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__UUID = LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__MRID = LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__NAME = LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__DESCRIPTION = LIMIT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__PATH_NAME = LIMIT_SET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__MODELING_AUTHORITY_SET = LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__LOCAL_NAME = LIMIT_SET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__ALIAS_NAME = LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__IS_PERCENTAGE_LIMITS = LIMIT_SET__IS_PERCENTAGE_LIMITS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__MEASUREMENTS = LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET__LIMITS = LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analog Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET_FEATURE_COUNT = LIMIT_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analog Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_SET_OPERATION_COUNT = LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AccumulatorValueImpl <em>Accumulator Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AccumulatorValueImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulatorValue()
	 * @generated
	 */
	int ACCUMULATOR_VALUE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__DESCRIPTION = MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__PATH_NAME = MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__LOCAL_NAME = MEASUREMENT_VALUE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__ACCUMULATOR = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accumulator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accumulator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.ControlImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OPERATION_IN_PROGRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__REGULATING_COND_EQ = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROL_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TIME_STAMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Remote Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__REMOTE_CONTROL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.SetPointImpl <em>Set Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.SetPointImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getSetPoint()
	 * @generated
	 */
	int SET_POINT = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__UUID = CONTROL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__MRID = CONTROL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__PATH_NAME = CONTROL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__MODELING_AUTHORITY_SET = CONTROL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__LOCAL_NAME = CONTROL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__ALIAS_NAME = CONTROL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__OPERATION_IN_PROGRESS = CONTROL__OPERATION_IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__REGULATING_COND_EQ = CONTROL__REGULATING_COND_EQ;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__CONTROL_TYPE = CONTROL__CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__UNIT = CONTROL__UNIT;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__TIME_STAMP = CONTROL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Remote Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__REMOTE_CONTROL = CONTROL__REMOTE_CONTROL;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__NORMAL_VALUE = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__VALUE = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__ANALOG = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__MAX_VALUE = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT__MIN_VALUE = CONTROL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Set Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Set Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.DiscreteValueImpl <em>Discrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.DiscreteValueImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getDiscreteValue()
	 * @generated
	 */
	int DISCRETE_VALUE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__DESCRIPTION = MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__PATH_NAME = MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__LOCAL_NAME = MEASUREMENT_VALUE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__DISCRETE = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Discrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AnalogValueImpl <em>Analog Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AnalogValueImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalogValue()
	 * @generated
	 */
	int ANALOG_VALUE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__DESCRIPTION = MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__PATH_NAME = MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__LOCAL_NAME = MEASUREMENT_VALUE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Alt Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__ALT_GENERATING_UNIT = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__ALT_TIE_MEAS = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__ANALOG = MEASUREMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Analog Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Analog Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.ControlTypeImpl <em>Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.ControlTypeImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.MeasurementValueSourceImpl <em>Measurement Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.MeasurementValueSourceImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurementValueSource()
	 * @generated
	 */
	int MEASUREMENT_VALUE_SOURCE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AnalogLimitImpl <em>Analog Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AnalogLimitImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalogLimit()
	 * @generated
	 */
	int ANALOG_LIMIT = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__UUID = LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__MRID = LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__DESCRIPTION = LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__PATH_NAME = LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__MODELING_AUTHORITY_SET = LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__LOCAL_NAME = LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__ALIAS_NAME = LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__PROCEDURES = LIMIT__PROCEDURES;

	/**
	 * The feature id for the '<em><b>Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__LIMIT_SET = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT__VALUE = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analog Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analog Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.CommandImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__UUID = CONTROL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__MRID = CONTROL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PATH_NAME = CONTROL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__MODELING_AUTHORITY_SET = CONTROL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__LOCAL_NAME = CONTROL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ALIAS_NAME = CONTROL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OPERATION_IN_PROGRESS = CONTROL__OPERATION_IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__REGULATING_COND_EQ = CONTROL__REGULATING_COND_EQ;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CONTROL_TYPE = CONTROL__CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__UNIT = CONTROL__UNIT;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TIME_STAMP = CONTROL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Remote Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__REMOTE_CONTROL = CONTROL__REMOTE_CONTROL;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NORMAL_VALUE = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Alias Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__VALUE_ALIAS_SET = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__VALUE = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DISCRETE = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.ValueAliasSetImpl <em>Value Alias Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.ValueAliasSetImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getValueAliasSet()
	 * @generated
	 */
	int VALUE_ALIAS_SET = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__COMMANDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discretes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET__DISCRETES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Alias Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value Alias Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ALIAS_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.AccumulatorLimitSetImpl <em>Accumulator Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.AccumulatorLimitSetImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulatorLimitSet()
	 * @generated
	 */
	int ACCUMULATOR_LIMIT_SET = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__UUID = LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__MRID = LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__NAME = LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__DESCRIPTION = LIMIT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__PATH_NAME = LIMIT_SET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__MODELING_AUTHORITY_SET = LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__LOCAL_NAME = LIMIT_SET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__ALIAS_NAME = LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__IS_PERCENTAGE_LIMITS = LIMIT_SET__IS_PERCENTAGE_LIMITS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__MEASUREMENTS = LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET__LIMITS = LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accumulator Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET_FEATURE_COUNT = LIMIT_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accumulator Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCUMULATOR_LIMIT_SET_OPERATION_COUNT = LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.DiscreteImpl <em>Discrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.DiscreteImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getDiscrete()
	 * @generated
	 */
	int DISCRETE = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__PATH_NAME = MEASUREMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__LOCAL_NAME = MEASUREMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>By Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__BY_TIE_POINT = MEASUREMENT__BY_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__DYNAMIC_SCHEDULES = MEASUREMENT__DYNAMIC_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__VIOLATION_LIMITS = MEASUREMENT__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__PNODE = MEASUREMENT__PNODE;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__UNIT = MEASUREMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>For Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__FOR_TIE_POINT = MEASUREMENT__FOR_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MIN_VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Alias Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__VALUE_ALIAS_SET = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MAX_VALUE = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__NORMAL_VALUE = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__COMMAND = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Discrete Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__DISCRETE_VALUES = MEASUREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.impl.StringMeasurementImpl <em>String Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.impl.StringMeasurementImpl
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getStringMeasurement()
	 * @generated
	 */
	int STRING_MEASUREMENT = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__PATH_NAME = MEASUREMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__LOCAL_NAME = MEASUREMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>By Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__BY_TIE_POINT = MEASUREMENT__BY_TIE_POINT;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__DYNAMIC_SCHEDULES = MEASUREMENT__DYNAMIC_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__VIOLATION_LIMITS = MEASUREMENT__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__PNODE = MEASUREMENT__PNODE;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__UNIT = MEASUREMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>For Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__FOR_TIE_POINT = MEASUREMENT__FOR_TIE_POINT;

	/**
	 * The feature id for the '<em><b>String Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Meas.Validity <em>Validity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Meas.Validity
	 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getValidity()
	 * @generated
	 */
	int VALIDITY = 27;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Accumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator</em>'.
	 * @see CIM.IEC61970.Meas.Accumulator
	 * @generated
	 */
	EClass getAccumulator();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accumulator Values</em>'.
	 * @see CIM.IEC61970.Meas.Accumulator#getAccumulatorValues()
	 * @see #getAccumulator()
	 * @generated
	 */
	EReference getAccumulator_AccumulatorValues();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM.IEC61970.Meas.Accumulator#getMaxValue()
	 * @see #getAccumulator()
	 * @generated
	 */
	EAttribute getAccumulator_MaxValue();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Accumulator#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limit Sets</em>'.
	 * @see CIM.IEC61970.Meas.Accumulator#getLimitSets()
	 * @see #getAccumulator()
	 * @generated
	 */
	EReference getAccumulator_LimitSets();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.MeasurementValueQuality <em>Measurement Value Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value Quality</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValueQuality
	 * @generated
	 */
	EClass getMeasurementValueQuality();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue()
	 * @see #getMeasurementValueQuality()
	 * @generated
	 */
	EReference getMeasurementValueQuality_MeasurementValue();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.AccumulatorLimit <em>Accumulator Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator Limit</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorLimit
	 * @generated
	 */
	EClass getAccumulatorLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.AccumulatorLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorLimit#getValue()
	 * @see #getAccumulatorLimit()
	 * @generated
	 */
	EAttribute getAccumulatorLimit_Value();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.AccumulatorLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Limit Set</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorLimit#getLimitSet()
	 * @see #getAccumulatorLimit()
	 * @generated
	 */
	EReference getAccumulatorLimit_LimitSet();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.PotentialTransformer <em>Potential Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Transformer</em>'.
	 * @see CIM.IEC61970.Meas.PotentialTransformer
	 * @generated
	 */
	EClass getPotentialTransformer();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Ratio</em>'.
	 * @see CIM.IEC61970.Meas.PotentialTransformer#getNominalRatio()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	EAttribute getPotentialTransformer_NominalRatio();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.PotentialTransformer#getPtClass <em>Pt Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Class</em>'.
	 * @see CIM.IEC61970.Meas.PotentialTransformer#getPtClass()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	EAttribute getPotentialTransformer_PtClass();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see CIM.IEC61970.Meas.PotentialTransformer#getAccuracyClass()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	EAttribute getPotentialTransformer_AccuracyClass();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue
	 * @generated
	 */
	EClass getMeasurementValue();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.MeasurementValue#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Values</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getGmlValues()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_GmlValues();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getProcedureDataSets()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_ProcedureDataSets();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Accuracy</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getSensorAccuracy()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EAttribute getMeasurementValue_SensorAccuracy();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value Quality</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_MeasurementValueQuality();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getErpPerson()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_ErpPerson();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getTimeStamp()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EAttribute getMeasurementValue_TimeStamp();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value Source</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueSource()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_MeasurementValueSource();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote Source</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValue#getRemoteSource()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_RemoteSource();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Analog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog</em>'.
	 * @see CIM.IEC61970.Meas.Analog
	 * @generated
	 */
	EClass getAnalog();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see CIM.IEC61970.Meas.Analog#getMinValue()
	 * @see #getAnalog()
	 * @generated
	 */
	EAttribute getAnalog_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM.IEC61970.Meas.Analog#getNormalValue()
	 * @see #getAnalog()
	 * @generated
	 */
	EAttribute getAnalog_NormalValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CIM.IEC61970.Meas.Analog#isPositiveFlowIn()
	 * @see #getAnalog()
	 * @generated
	 */
	EAttribute getAnalog_PositiveFlowIn();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM.IEC61970.Meas.Analog#getMaxValue()
	 * @see #getAnalog()
	 * @generated
	 */
	EAttribute getAnalog_MaxValue();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Analog#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limit Sets</em>'.
	 * @see CIM.IEC61970.Meas.Analog#getLimitSets()
	 * @see #getAnalog()
	 * @generated
	 */
	EReference getAnalog_LimitSets();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Point</em>'.
	 * @see CIM.IEC61970.Meas.Analog#getSetPoint()
	 * @see #getAnalog()
	 * @generated
	 */
	EReference getAnalog_SetPoint();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Analog#getAnalogValues <em>Analog Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Analog Values</em>'.
	 * @see CIM.IEC61970.Meas.Analog#getAnalogValues()
	 * @see #getAnalog()
	 * @generated
	 */
	EReference getAnalog_AnalogValues();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.StringMeasurementValue <em>String Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Measurement Value</em>'.
	 * @see CIM.IEC61970.Meas.StringMeasurementValue
	 * @generated
	 */
	EClass getStringMeasurementValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.StringMeasurementValue#getValue()
	 * @see #getStringMeasurementValue()
	 * @generated
	 */
	EAttribute getStringMeasurementValue_Value();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>String Measurement</em>'.
	 * @see CIM.IEC61970.Meas.StringMeasurementValue#getStringMeasurement()
	 * @see #getStringMeasurementValue()
	 * @generated
	 */
	EReference getStringMeasurementValue_StringMeasurement();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.ValueToAlias <em>Value To Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value To Alias</em>'.
	 * @see CIM.IEC61970.Meas.ValueToAlias
	 * @generated
	 */
	EClass getValueToAlias();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.ValueToAlias#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.ValueToAlias#getValue()
	 * @see #getValueToAlias()
	 * @generated
	 */
	EAttribute getValueToAlias_Value();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Alias Set</em>'.
	 * @see CIM.IEC61970.Meas.ValueToAlias#getValueAliasSet()
	 * @see #getValueToAlias()
	 * @generated
	 */
	EReference getValueToAlias_ValueAliasSet();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see CIM.IEC61970.Meas.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Limit#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedures</em>'.
	 * @see CIM.IEC61970.Meas.Limit#getProcedures()
	 * @see #getLimit()
	 * @generated
	 */
	EReference getLimit_Procedures();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.CurrentTransformer <em>Current Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Transformer</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer
	 * @generated
	 */
	EClass getCurrentTransformer();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ratio</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer#getMaxRatio()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	EAttribute getCurrentTransformer_MaxRatio();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.CurrentTransformer#getCoreCount <em>Core Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Count</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer#getCoreCount()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	EAttribute getCurrentTransformer_CoreCount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.CurrentTransformer#getCtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Class</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer#getCtClass()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	EAttribute getCurrentTransformer_CtClass();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.CurrentTransformer#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer#getUsage()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	EAttribute getCurrentTransformer_Usage();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Limit</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer#getAccuracyLimit()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	EAttribute getCurrentTransformer_AccuracyLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see CIM.IEC61970.Meas.CurrentTransformer#getAccuracyClass()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	EAttribute getCurrentTransformer_AccuracyClass();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.AnalogLimitSet <em>Analog Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Limit Set</em>'.
	 * @see CIM.IEC61970.Meas.AnalogLimitSet
	 * @generated
	 */
	EClass getAnalogLimitSet();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.AnalogLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM.IEC61970.Meas.AnalogLimitSet#getMeasurements()
	 * @see #getAnalogLimitSet()
	 * @generated
	 */
	EReference getAnalogLimitSet_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.AnalogLimitSet#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits</em>'.
	 * @see CIM.IEC61970.Meas.AnalogLimitSet#getLimits()
	 * @see #getAnalogLimitSet()
	 * @generated
	 */
	EReference getAnalogLimitSet_Limits();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.AccumulatorValue <em>Accumulator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator Value</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorValue
	 * @generated
	 */
	EClass getAccumulatorValue();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.AccumulatorValue#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accumulator</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorValue#getAccumulator()
	 * @see #getAccumulatorValue()
	 * @generated
	 */
	EReference getAccumulatorValue_Accumulator();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.AccumulatorValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorValue#getValue()
	 * @see #getAccumulatorValue()
	 * @generated
	 */
	EAttribute getAccumulatorValue_Value();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.SetPoint <em>Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Point</em>'.
	 * @see CIM.IEC61970.Meas.SetPoint
	 * @generated
	 */
	EClass getSetPoint();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM.IEC61970.Meas.SetPoint#getNormalValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	EAttribute getSetPoint_NormalValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.SetPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.SetPoint#getValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	EAttribute getSetPoint_Value();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog</em>'.
	 * @see CIM.IEC61970.Meas.SetPoint#getAnalog()
	 * @see #getSetPoint()
	 * @generated
	 */
	EReference getSetPoint_Analog();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM.IEC61970.Meas.SetPoint#getMaxValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	EAttribute getSetPoint_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see CIM.IEC61970.Meas.SetPoint#getMinValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	EAttribute getSetPoint_MinValue();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.DiscreteValue <em>Discrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Value</em>'.
	 * @see CIM.IEC61970.Meas.DiscreteValue
	 * @generated
	 */
	EClass getDiscreteValue();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discrete</em>'.
	 * @see CIM.IEC61970.Meas.DiscreteValue#getDiscrete()
	 * @see #getDiscreteValue()
	 * @generated
	 */
	EReference getDiscreteValue_Discrete();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.DiscreteValue#getValue()
	 * @see #getDiscreteValue()
	 * @generated
	 */
	EAttribute getDiscreteValue_Value();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.AnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Value</em>'.
	 * @see CIM.IEC61970.Meas.AnalogValue
	 * @generated
	 */
	EClass getAnalogValue();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Generating Unit</em>'.
	 * @see CIM.IEC61970.Meas.AnalogValue#getAltGeneratingUnit()
	 * @see #getAnalogValue()
	 * @generated
	 */
	EReference getAnalogValue_AltGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.AnalogValue#getValue()
	 * @see #getAnalogValue()
	 * @generated
	 */
	EAttribute getAnalogValue_Value();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Tie Meas</em>'.
	 * @see CIM.IEC61970.Meas.AnalogValue#getAltTieMeas()
	 * @see #getAnalogValue()
	 * @generated
	 */
	EReference getAnalogValue_AltTieMeas();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog</em>'.
	 * @see CIM.IEC61970.Meas.AnalogValue#getAnalog()
	 * @see #getAnalogValue()
	 * @generated
	 */
	EReference getAnalogValue_Analog();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Type</em>'.
	 * @see CIM.IEC61970.Meas.ControlType
	 * @generated
	 */
	EClass getControlType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.ControlType#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see CIM.IEC61970.Meas.ControlType#getControls()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Controls();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.MeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value Source</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValueSource
	 * @generated
	 */
	EClass getMeasurementValueSource();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see CIM.IEC61970.Meas.MeasurementValueSource#getMeasurementValues()
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	EReference getMeasurementValueSource_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.AnalogLimit <em>Analog Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Limit</em>'.
	 * @see CIM.IEC61970.Meas.AnalogLimit
	 * @generated
	 */
	EClass getAnalogLimit();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Limit Set</em>'.
	 * @see CIM.IEC61970.Meas.AnalogLimit#getLimitSet()
	 * @see #getAnalogLimit()
	 * @generated
	 */
	EReference getAnalogLimit_LimitSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.AnalogLimit#getValue()
	 * @see #getAnalogLimit()
	 * @generated
	 */
	EAttribute getAnalogLimit_Value();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see CIM.IEC61970.Meas.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM.IEC61970.Meas.Command#getNormalValue()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_NormalValue();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Alias Set</em>'.
	 * @see CIM.IEC61970.Meas.Command#getValueAliasSet()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_ValueAliasSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Command#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Meas.Command#getValue()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Value();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discrete</em>'.
	 * @see CIM.IEC61970.Meas.Command#getDiscrete()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Discrete();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see CIM.IEC61970.Meas.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getBy_TiePoint <em>By Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>By Tie Point</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getBy_TiePoint()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_By_TiePoint();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getTerminal()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Terminal();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Measurement#getDynamicSchedules <em>Dynamic Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dynamic Schedules</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getDynamicSchedules()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_DynamicSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Measurement#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getLocations()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Locations();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getAsset()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Asset();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Measurement#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violation Limits</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getViolationLimits()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_ViolationLimits();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Measurement#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getDocuments()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Documents();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pnode</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getPnode()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Pnode();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getPowerSystemResource()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_PowerSystemResource();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getUnit()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Unit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Type</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getMeasurementType()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_MeasurementType();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Measurement#getFor_TiePoint <em>For Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Tie Point</em>'.
	 * @see CIM.IEC61970.Meas.Measurement#getFor_TiePoint()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_For_TiePoint();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.ValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Alias Set</em>'.
	 * @see CIM.IEC61970.Meas.ValueAliasSet
	 * @generated
	 */
	EClass getValueAliasSet();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.ValueAliasSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see CIM.IEC61970.Meas.ValueAliasSet#getValues()
	 * @see #getValueAliasSet()
	 * @generated
	 */
	EReference getValueAliasSet_Values();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.ValueAliasSet#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see CIM.IEC61970.Meas.ValueAliasSet#getCommands()
	 * @see #getValueAliasSet()
	 * @generated
	 */
	EReference getValueAliasSet_Commands();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.ValueAliasSet#getDiscretes <em>Discretes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discretes</em>'.
	 * @see CIM.IEC61970.Meas.ValueAliasSet#getDiscretes()
	 * @see #getValueAliasSet()
	 * @generated
	 */
	EReference getValueAliasSet_Discretes();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see CIM.IEC61970.Meas.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation In Progress</em>'.
	 * @see CIM.IEC61970.Meas.Control#isOperationInProgress()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_OperationInProgress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Cond Eq</em>'.
	 * @see CIM.IEC61970.Meas.Control#getRegulatingCondEq()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_RegulatingCondEq();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Control#getControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Type</em>'.
	 * @see CIM.IEC61970.Meas.Control#getControlType()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_ControlType();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Control#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CIM.IEC61970.Meas.Control#getUnit()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Unit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see CIM.IEC61970.Meas.Control#getTimeStamp()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_TimeStamp();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote Control</em>'.
	 * @see CIM.IEC61970.Meas.Control#getRemoteControl()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_RemoteControl();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.AccumulatorLimitSet <em>Accumulator Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator Limit Set</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorLimitSet
	 * @generated
	 */
	EClass getAccumulatorLimitSet();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorLimitSet#getMeasurements()
	 * @see #getAccumulatorLimitSet()
	 * @generated
	 */
	EReference getAccumulatorLimitSet_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.AccumulatorLimitSet#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits</em>'.
	 * @see CIM.IEC61970.Meas.AccumulatorLimitSet#getLimits()
	 * @see #getAccumulatorLimitSet()
	 * @generated
	 */
	EReference getAccumulatorLimitSet_Limits();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Quality61850 <em>Quality61850</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality61850</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850
	 * @generated
	 */
	EClass getQuality61850();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspect</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isSuspect()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_Suspect();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimator Replaced</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isEstimatorReplaced()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_EstimatorReplaced();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#getValidity()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_Validity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bad Reference</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isBadReference()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_BadReference();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Data</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isOldData()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_OldData();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isFailure()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_Failure();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Flow</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isOverFlow()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_OverFlow();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#getSource()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_Source();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Blocked</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isOperatorBlocked()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_OperatorBlocked();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isTest()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_Test();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscillatory</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isOscillatory()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_Oscillatory();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Of Range</em>'.
	 * @see CIM.IEC61970.Meas.Quality61850#isOutOfRange()
	 * @see #getQuality61850()
	 * @generated
	 */
	EAttribute getQuality61850_OutOfRange();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.Discrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete</em>'.
	 * @see CIM.IEC61970.Meas.Discrete
	 * @generated
	 */
	EClass getDiscrete();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see CIM.IEC61970.Meas.Discrete#getMinValue()
	 * @see #getDiscrete()
	 * @generated
	 */
	EAttribute getDiscrete_MinValue();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Alias Set</em>'.
	 * @see CIM.IEC61970.Meas.Discrete#getValueAliasSet()
	 * @see #getDiscrete()
	 * @generated
	 */
	EReference getDiscrete_ValueAliasSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM.IEC61970.Meas.Discrete#getMaxValue()
	 * @see #getDiscrete()
	 * @generated
	 */
	EAttribute getDiscrete_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM.IEC61970.Meas.Discrete#getNormalValue()
	 * @see #getDiscrete()
	 * @generated
	 */
	EAttribute getDiscrete_NormalValue();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Meas.Discrete#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see CIM.IEC61970.Meas.Discrete#getCommand()
	 * @see #getDiscrete()
	 * @generated
	 */
	EReference getDiscrete_Command();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.Discrete#getDiscreteValues <em>Discrete Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discrete Values</em>'.
	 * @see CIM.IEC61970.Meas.Discrete#getDiscreteValues()
	 * @see #getDiscrete()
	 * @generated
	 */
	EReference getDiscrete_DiscreteValues();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.StringMeasurement <em>String Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Measurement</em>'.
	 * @see CIM.IEC61970.Meas.StringMeasurement
	 * @generated
	 */
	EClass getStringMeasurement();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Meas.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Measurement Values</em>'.
	 * @see CIM.IEC61970.Meas.StringMeasurement#getStringMeasurementValues()
	 * @see #getStringMeasurement()
	 * @generated
	 */
	EReference getStringMeasurement_StringMeasurementValues();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Meas.LimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Set</em>'.
	 * @see CIM.IEC61970.Meas.LimitSet
	 * @generated
	 */
	EClass getLimitSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage Limits</em>'.
	 * @see CIM.IEC61970.Meas.LimitSet#isIsPercentageLimits()
	 * @see #getLimitSet()
	 * @generated
	 */
	EAttribute getLimitSet_IsPercentageLimits();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Meas.Validity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validity</em>'.
	 * @see CIM.IEC61970.Meas.Validity
	 * @generated
	 */
	EEnum getValidity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasFactory getMeasFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AccumulatorImpl <em>Accumulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AccumulatorImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulator()
		 * @generated
		 */
		EClass ACCUMULATOR = eINSTANCE.getAccumulator();

		/**
		 * The meta object literal for the '<em><b>Accumulator Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCUMULATOR__ACCUMULATOR_VALUES = eINSTANCE.getAccumulator_AccumulatorValues();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCUMULATOR__MAX_VALUE = eINSTANCE.getAccumulator_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Limit Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCUMULATOR__LIMIT_SETS = eINSTANCE.getAccumulator_LimitSets();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.MeasurementValueQualityImpl <em>Measurement Value Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.MeasurementValueQualityImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurementValueQuality()
		 * @generated
		 */
		EClass MEASUREMENT_VALUE_QUALITY = eINSTANCE.getMeasurementValueQuality();

		/**
		 * The meta object literal for the '<em><b>Measurement Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE = eINSTANCE.getMeasurementValueQuality_MeasurementValue();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AccumulatorLimitImpl <em>Accumulator Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AccumulatorLimitImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulatorLimit()
		 * @generated
		 */
		EClass ACCUMULATOR_LIMIT = eINSTANCE.getAccumulatorLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCUMULATOR_LIMIT__VALUE = eINSTANCE.getAccumulatorLimit_Value();

		/**
		 * The meta object literal for the '<em><b>Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCUMULATOR_LIMIT__LIMIT_SET = eINSTANCE.getAccumulatorLimit_LimitSet();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.PotentialTransformerImpl <em>Potential Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.PotentialTransformerImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getPotentialTransformer()
		 * @generated
		 */
		EClass POTENTIAL_TRANSFORMER = eINSTANCE.getPotentialTransformer();

		/**
		 * The meta object literal for the '<em><b>Nominal Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTENTIAL_TRANSFORMER__NOMINAL_RATIO = eINSTANCE.getPotentialTransformer_NominalRatio();

		/**
		 * The meta object literal for the '<em><b>Pt Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTENTIAL_TRANSFORMER__PT_CLASS = eINSTANCE.getPotentialTransformer_PtClass();

		/**
		 * The meta object literal for the '<em><b>Accuracy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTENTIAL_TRANSFORMER__ACCURACY_CLASS = eINSTANCE.getPotentialTransformer_AccuracyClass();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.MeasurementValueImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurementValue()
		 * @generated
		 */
		EClass MEASUREMENT_VALUE = eINSTANCE.getMeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Gml Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__GML_VALUES = eINSTANCE.getMeasurementValue_GmlValues();

		/**
		 * The meta object literal for the '<em><b>Procedure Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__PROCEDURE_DATA_SETS = eINSTANCE.getMeasurementValue_ProcedureDataSets();

		/**
		 * The meta object literal for the '<em><b>Sensor Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_VALUE__SENSOR_ACCURACY = eINSTANCE.getMeasurementValue_SensorAccuracy();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Quality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY = eINSTANCE.getMeasurementValue_MeasurementValueQuality();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__ERP_PERSON = eINSTANCE.getMeasurementValue_ErpPerson();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_VALUE__TIME_STAMP = eINSTANCE.getMeasurementValue_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = eINSTANCE.getMeasurementValue_MeasurementValueSource();

		/**
		 * The meta object literal for the '<em><b>Remote Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__REMOTE_SOURCE = eINSTANCE.getMeasurementValue_RemoteSource();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AnalogImpl <em>Analog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AnalogImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalog()
		 * @generated
		 */
		EClass ANALOG = eINSTANCE.getAnalog();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG__MIN_VALUE = eINSTANCE.getAnalog_MinValue();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG__NORMAL_VALUE = eINSTANCE.getAnalog_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG__POSITIVE_FLOW_IN = eINSTANCE.getAnalog_PositiveFlowIn();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG__MAX_VALUE = eINSTANCE.getAnalog_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Limit Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG__LIMIT_SETS = eINSTANCE.getAnalog_LimitSets();

		/**
		 * The meta object literal for the '<em><b>Set Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG__SET_POINT = eINSTANCE.getAnalog_SetPoint();

		/**
		 * The meta object literal for the '<em><b>Analog Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG__ANALOG_VALUES = eINSTANCE.getAnalog_AnalogValues();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.StringMeasurementValueImpl <em>String Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.StringMeasurementValueImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getStringMeasurementValue()
		 * @generated
		 */
		EClass STRING_MEASUREMENT_VALUE = eINSTANCE.getStringMeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_MEASUREMENT_VALUE__VALUE = eINSTANCE.getStringMeasurementValue_Value();

		/**
		 * The meta object literal for the '<em><b>String Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT = eINSTANCE.getStringMeasurementValue_StringMeasurement();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.ValueToAliasImpl <em>Value To Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.ValueToAliasImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getValueToAlias()
		 * @generated
		 */
		EClass VALUE_TO_ALIAS = eINSTANCE.getValueToAlias();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TO_ALIAS__VALUE = eINSTANCE.getValueToAlias_Value();

		/**
		 * The meta object literal for the '<em><b>Value Alias Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TO_ALIAS__VALUE_ALIAS_SET = eINSTANCE.getValueToAlias_ValueAliasSet();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.LimitImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIMIT__PROCEDURES = eINSTANCE.getLimit_Procedures();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.CurrentTransformerImpl <em>Current Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.CurrentTransformerImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getCurrentTransformer()
		 * @generated
		 */
		EClass CURRENT_TRANSFORMER = eINSTANCE.getCurrentTransformer();

		/**
		 * The meta object literal for the '<em><b>Max Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TRANSFORMER__MAX_RATIO = eINSTANCE.getCurrentTransformer_MaxRatio();

		/**
		 * The meta object literal for the '<em><b>Core Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TRANSFORMER__CORE_COUNT = eINSTANCE.getCurrentTransformer_CoreCount();

		/**
		 * The meta object literal for the '<em><b>Ct Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TRANSFORMER__CT_CLASS = eINSTANCE.getCurrentTransformer_CtClass();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TRANSFORMER__USAGE = eINSTANCE.getCurrentTransformer_Usage();

		/**
		 * The meta object literal for the '<em><b>Accuracy Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TRANSFORMER__ACCURACY_LIMIT = eINSTANCE.getCurrentTransformer_AccuracyLimit();

		/**
		 * The meta object literal for the '<em><b>Accuracy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TRANSFORMER__ACCURACY_CLASS = eINSTANCE.getCurrentTransformer_AccuracyClass();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AnalogLimitSetImpl <em>Analog Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AnalogLimitSetImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalogLimitSet()
		 * @generated
		 */
		EClass ANALOG_LIMIT_SET = eINSTANCE.getAnalogLimitSet();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_LIMIT_SET__MEASUREMENTS = eINSTANCE.getAnalogLimitSet_Measurements();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_LIMIT_SET__LIMITS = eINSTANCE.getAnalogLimitSet_Limits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AccumulatorValueImpl <em>Accumulator Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AccumulatorValueImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulatorValue()
		 * @generated
		 */
		EClass ACCUMULATOR_VALUE = eINSTANCE.getAccumulatorValue();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCUMULATOR_VALUE__ACCUMULATOR = eINSTANCE.getAccumulatorValue_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCUMULATOR_VALUE__VALUE = eINSTANCE.getAccumulatorValue_Value();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.SetPointImpl <em>Set Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.SetPointImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getSetPoint()
		 * @generated
		 */
		EClass SET_POINT = eINSTANCE.getSetPoint();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_POINT__NORMAL_VALUE = eINSTANCE.getSetPoint_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_POINT__VALUE = eINSTANCE.getSetPoint_Value();

		/**
		 * The meta object literal for the '<em><b>Analog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_POINT__ANALOG = eINSTANCE.getSetPoint_Analog();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_POINT__MAX_VALUE = eINSTANCE.getSetPoint_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_POINT__MIN_VALUE = eINSTANCE.getSetPoint_MinValue();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.DiscreteValueImpl <em>Discrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.DiscreteValueImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getDiscreteValue()
		 * @generated
		 */
		EClass DISCRETE_VALUE = eINSTANCE.getDiscreteValue();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_VALUE__DISCRETE = eINSTANCE.getDiscreteValue_Discrete();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_VALUE__VALUE = eINSTANCE.getDiscreteValue_Value();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AnalogValueImpl <em>Analog Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AnalogValueImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalogValue()
		 * @generated
		 */
		EClass ANALOG_VALUE = eINSTANCE.getAnalogValue();

		/**
		 * The meta object literal for the '<em><b>Alt Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_VALUE__ALT_GENERATING_UNIT = eINSTANCE.getAnalogValue_AltGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_VALUE__VALUE = eINSTANCE.getAnalogValue_Value();

		/**
		 * The meta object literal for the '<em><b>Alt Tie Meas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_VALUE__ALT_TIE_MEAS = eINSTANCE.getAnalogValue_AltTieMeas();

		/**
		 * The meta object literal for the '<em><b>Analog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_VALUE__ANALOG = eINSTANCE.getAnalogValue_Analog();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.ControlTypeImpl <em>Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.ControlTypeImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getControlType()
		 * @generated
		 */
		EClass CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__CONTROLS = eINSTANCE.getControlType_Controls();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.MeasurementValueSourceImpl <em>Measurement Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.MeasurementValueSourceImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurementValueSource()
		 * @generated
		 */
		EClass MEASUREMENT_VALUE_SOURCE = eINSTANCE.getMeasurementValueSource();

		/**
		 * The meta object literal for the '<em><b>Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = eINSTANCE.getMeasurementValueSource_MeasurementValues();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AnalogLimitImpl <em>Analog Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AnalogLimitImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAnalogLimit()
		 * @generated
		 */
		EClass ANALOG_LIMIT = eINSTANCE.getAnalogLimit();

		/**
		 * The meta object literal for the '<em><b>Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_LIMIT__LIMIT_SET = eINSTANCE.getAnalogLimit_LimitSet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_LIMIT__VALUE = eINSTANCE.getAnalogLimit_Value();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.CommandImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NORMAL_VALUE = eINSTANCE.getCommand_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Value Alias Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__VALUE_ALIAS_SET = eINSTANCE.getCommand_ValueAliasSet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__VALUE = eINSTANCE.getCommand_Value();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__DISCRETE = eINSTANCE.getCommand_Discrete();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.MeasurementImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>By Tie Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__BY_TIE_POINT = eINSTANCE.getMeasurement_By_TiePoint();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__TERMINAL = eINSTANCE.getMeasurement_Terminal();

		/**
		 * The meta object literal for the '<em><b>Dynamic Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__DYNAMIC_SCHEDULES = eINSTANCE.getMeasurement_DynamicSchedules();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__LOCATIONS = eINSTANCE.getMeasurement_Locations();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__ASSET = eINSTANCE.getMeasurement_Asset();

		/**
		 * The meta object literal for the '<em><b>Violation Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__VIOLATION_LIMITS = eINSTANCE.getMeasurement_ViolationLimits();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__DOCUMENTS = eINSTANCE.getMeasurement_Documents();

		/**
		 * The meta object literal for the '<em><b>Pnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__PNODE = eINSTANCE.getMeasurement_Pnode();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__POWER_SYSTEM_RESOURCE = eINSTANCE.getMeasurement_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__UNIT = eINSTANCE.getMeasurement_Unit();

		/**
		 * The meta object literal for the '<em><b>Measurement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__MEASUREMENT_TYPE = eINSTANCE.getMeasurement_MeasurementType();

		/**
		 * The meta object literal for the '<em><b>For Tie Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__FOR_TIE_POINT = eINSTANCE.getMeasurement_For_TiePoint();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.ValueAliasSetImpl <em>Value Alias Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.ValueAliasSetImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getValueAliasSet()
		 * @generated
		 */
		EClass VALUE_ALIAS_SET = eINSTANCE.getValueAliasSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ALIAS_SET__VALUES = eINSTANCE.getValueAliasSet_Values();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ALIAS_SET__COMMANDS = eINSTANCE.getValueAliasSet_Commands();

		/**
		 * The meta object literal for the '<em><b>Discretes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ALIAS_SET__DISCRETES = eINSTANCE.getValueAliasSet_Discretes();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.ControlImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Operation In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__OPERATION_IN_PROGRESS = eINSTANCE.getControl_OperationInProgress();

		/**
		 * The meta object literal for the '<em><b>Regulating Cond Eq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__REGULATING_COND_EQ = eINSTANCE.getControl_RegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Control Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROL_TYPE = eINSTANCE.getControl_ControlType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__UNIT = eINSTANCE.getControl_Unit();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TIME_STAMP = eINSTANCE.getControl_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Remote Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__REMOTE_CONTROL = eINSTANCE.getControl_RemoteControl();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.AccumulatorLimitSetImpl <em>Accumulator Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.AccumulatorLimitSetImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getAccumulatorLimitSet()
		 * @generated
		 */
		EClass ACCUMULATOR_LIMIT_SET = eINSTANCE.getAccumulatorLimitSet();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCUMULATOR_LIMIT_SET__MEASUREMENTS = eINSTANCE.getAccumulatorLimitSet_Measurements();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCUMULATOR_LIMIT_SET__LIMITS = eINSTANCE.getAccumulatorLimitSet_Limits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.Quality61850Impl <em>Quality61850</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.Quality61850Impl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getQuality61850()
		 * @generated
		 */
		EClass QUALITY61850 = eINSTANCE.getQuality61850();

		/**
		 * The meta object literal for the '<em><b>Suspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__SUSPECT = eINSTANCE.getQuality61850_Suspect();

		/**
		 * The meta object literal for the '<em><b>Estimator Replaced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__ESTIMATOR_REPLACED = eINSTANCE.getQuality61850_EstimatorReplaced();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__VALIDITY = eINSTANCE.getQuality61850_Validity();

		/**
		 * The meta object literal for the '<em><b>Bad Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__BAD_REFERENCE = eINSTANCE.getQuality61850_BadReference();

		/**
		 * The meta object literal for the '<em><b>Old Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__OLD_DATA = eINSTANCE.getQuality61850_OldData();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__FAILURE = eINSTANCE.getQuality61850_Failure();

		/**
		 * The meta object literal for the '<em><b>Over Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__OVER_FLOW = eINSTANCE.getQuality61850_OverFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__SOURCE = eINSTANCE.getQuality61850_Source();

		/**
		 * The meta object literal for the '<em><b>Operator Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__OPERATOR_BLOCKED = eINSTANCE.getQuality61850_OperatorBlocked();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__TEST = eINSTANCE.getQuality61850_Test();

		/**
		 * The meta object literal for the '<em><b>Oscillatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__OSCILLATORY = eINSTANCE.getQuality61850_Oscillatory();

		/**
		 * The meta object literal for the '<em><b>Out Of Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY61850__OUT_OF_RANGE = eINSTANCE.getQuality61850_OutOfRange();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.DiscreteImpl <em>Discrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.DiscreteImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getDiscrete()
		 * @generated
		 */
		EClass DISCRETE = eINSTANCE.getDiscrete();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE__MIN_VALUE = eINSTANCE.getDiscrete_MinValue();

		/**
		 * The meta object literal for the '<em><b>Value Alias Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE__VALUE_ALIAS_SET = eINSTANCE.getDiscrete_ValueAliasSet();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE__MAX_VALUE = eINSTANCE.getDiscrete_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE__NORMAL_VALUE = eINSTANCE.getDiscrete_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE__COMMAND = eINSTANCE.getDiscrete_Command();

		/**
		 * The meta object literal for the '<em><b>Discrete Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE__DISCRETE_VALUES = eINSTANCE.getDiscrete_DiscreteValues();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.StringMeasurementImpl <em>String Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.StringMeasurementImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getStringMeasurement()
		 * @generated
		 */
		EClass STRING_MEASUREMENT = eINSTANCE.getStringMeasurement();

		/**
		 * The meta object literal for the '<em><b>String Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES = eINSTANCE.getStringMeasurement_StringMeasurementValues();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.impl.LimitSetImpl <em>Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.impl.LimitSetImpl
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getLimitSet()
		 * @generated
		 */
		EClass LIMIT_SET = eINSTANCE.getLimitSet();

		/**
		 * The meta object literal for the '<em><b>Is Percentage Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT_SET__IS_PERCENTAGE_LIMITS = eINSTANCE.getLimitSet_IsPercentageLimits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Meas.Validity <em>Validity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Meas.Validity
		 * @see CIM.IEC61970.Meas.impl.MeasPackageImpl#getValidity()
		 * @generated
		 */
		EEnum VALIDITY = eINSTANCE.getValidity();

	}

} //MeasPackage
