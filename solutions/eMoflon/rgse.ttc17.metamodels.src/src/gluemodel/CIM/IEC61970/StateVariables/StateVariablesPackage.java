/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

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
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variables for analysis solutions such as powerflow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variables for analysis solutions such as powerflow.'"
 * @generated
 */
public interface StateVariablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StateVariables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#StateVariables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimStateVariables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateVariablesPackage eINSTANCE = gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariableImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvInjectionImpl <em>Sv Injection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvInjectionImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvInjection()
	 * @generated
	 */
	int SV_INJECTION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_INJECTION__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>QNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_INJECTION__QNET_INJECTION = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_INJECTION__PNET_INJECTION = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_INJECTION__TOPOLOGICAL_NODE = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_INJECTION_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_INJECTION_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl <em>Sv Power Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvPowerFlow()
	 * @generated
	 */
	int SV_POWER_FLOW = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_POWER_FLOW__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_POWER_FLOW__TERMINAL = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_POWER_FLOW__P = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_POWER_FLOW__Q = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Power Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_POWER_FLOW_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Power Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_POWER_FLOW_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.TopologicalIslandImpl <em>Topological Island</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.TopologicalIslandImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getTopologicalIsland()
	 * @generated
	 */
	int TOPOLOGICAL_ISLAND = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Angle Ref Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Topological Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Topological Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_ISLAND_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvStatusImpl <em>Sv Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvStatusImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvStatus()
	 * @generated
	 */
	int SV_STATUS = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_STATUS__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_STATUS__IN_SERVICE = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_STATUS__CONDUCTING_EQUIPMENT = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sv Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_STATUS_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sv Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_STATUS_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl <em>Sv Short Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvShortCircuit()
	 * @generated
	 */
	int SV_SHORT_CIRCUIT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>R0 Per R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT__R0_PER_R = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SShort Circuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT__SSHORT_CIRCUIT = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPer R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT__XPER_R = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X0 Per X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT__X0_PER_X = STATE_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sv Short Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sv Short Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHORT_CIRCUIT_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvTapStepImpl <em>Sv Tap Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvTapStepImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvTapStep()
	 * @generated
	 */
	int SV_TAP_STEP = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_TAP_STEP__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_TAP_STEP__TAP_CHANGER = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Continuous Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_TAP_STEP__CONTINUOUS_POSITION = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_TAP_STEP__POSITION = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Tap Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_TAP_STEP_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Tap Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_TAP_STEP_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvVoltageImpl <em>Sv Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvVoltageImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvVoltage()
	 * @generated
	 */
	int SV_VOLTAGE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_VOLTAGE__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_VOLTAGE__V = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_VOLTAGE__TOPOLOGICAL_NODE = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_VOLTAGE__ANGLE = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_VOLTAGE_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_VOLTAGE_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl <em>Sv Shunt Compensator Sections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl
	 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvShuntCompensatorSections()
	 * @generated
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Continuous Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shunt Compensator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Shunt Compensator Sections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Shunt Compensator Sections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_SHUNT_COMPENSATOR_SECTIONS_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvInjection <em>Sv Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Injection</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvInjection
	 * @generated
	 */
	EClass getSvInjection();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QNet Injection</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvInjection#getQNetInjection()
	 * @see #getSvInjection()
	 * @generated
	 */
	EAttribute getSvInjection_QNetInjection();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PNet Injection</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvInjection#getPNetInjection()
	 * @see #getSvInjection()
	 * @generated
	 */
	EAttribute getSvInjection_PNetInjection();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvInjection#getTopologicalNode()
	 * @see #getSvInjection()
	 * @generated
	 */
	EReference getSvInjection_TopologicalNode();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow <em>Sv Power Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Power Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow
	 * @generated
	 */
	EClass getSvPowerFlow();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getTerminal()
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	EReference getSvPowerFlow_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getP()
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	EAttribute getSvPowerFlow_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getQ()
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	EAttribute getSvPowerFlow_Q();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland <em>Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topological Island</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland
	 * @generated
	 */
	EClass getTopologicalIsland();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle Ref Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode()
	 * @see #getTopologicalIsland()
	 * @generated
	 */
	EReference getTopologicalIsland_AngleRef_TopologicalNode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Nodes</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes()
	 * @see #getTopologicalIsland()
	 * @generated
	 */
	EReference getTopologicalIsland_TopologicalNodes();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvStatus <em>Sv Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Status</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvStatus
	 * @generated
	 */
	EClass getSvStatus();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvStatus#isInService <em>In Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Service</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvStatus#isInService()
	 * @see #getSvStatus()
	 * @generated
	 */
	EAttribute getSvStatus_InService();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvStatus#getConductingEquipment()
	 * @see #getSvStatus()
	 * @generated
	 */
	EReference getSvStatus_ConductingEquipment();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit <em>Sv Short Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Short Circuit</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit
	 * @generated
	 */
	EClass getSvShortCircuit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0 Per R</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getR0PerR()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	EAttribute getSvShortCircuit_R0PerR();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SShort Circuit</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	EAttribute getSvShortCircuit_SShortCircuit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPer R</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getXPerR()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	EAttribute getSvShortCircuit_XPerR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	EReference getSvShortCircuit_TopologicalNode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0 Per X</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit#getX0PerX()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	EAttribute getSvShortCircuit_X0PerX();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep <em>Sv Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Tap Step</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvTapStep
	 * @generated
	 */
	EClass getSvTapStep();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getTapChanger()
	 * @see #getSvTapStep()
	 * @generated
	 */
	EReference getSvTapStep_TapChanger();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getContinuousPosition <em>Continuous Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuous Position</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getContinuousPosition()
	 * @see #getSvTapStep()
	 * @generated
	 */
	EAttribute getSvTapStep_ContinuousPosition();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getPosition()
	 * @see #getSvTapStep()
	 * @generated
	 */
	EAttribute getSvTapStep_Position();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage <em>Sv Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvVoltage
	 * @generated
	 */
	EClass getSvVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getV()
	 * @see #getSvVoltage()
	 * @generated
	 */
	EAttribute getSvVoltage_V();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getTopologicalNode()
	 * @see #getSvVoltage()
	 * @generated
	 */
	EReference getSvVoltage_TopologicalNode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvVoltage#getAngle()
	 * @see #getSvVoltage()
	 * @generated
	 */
	EAttribute getSvVoltage_Angle();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Shunt Compensator Sections</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections
	 * @generated
	 */
	EClass getSvShuntCompensatorSections();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getContinuousSections <em>Continuous Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuous Sections</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getContinuousSections()
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	EAttribute getSvShuntCompensatorSections_ContinuousSections();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sections</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getSections()
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	EAttribute getSvShuntCompensatorSections_Sections();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shunt Compensator</em>'.
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator()
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	EReference getSvShuntCompensatorSections_ShuntCompensator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateVariablesFactory getStateVariablesFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvInjectionImpl <em>Sv Injection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvInjectionImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvInjection()
		 * @generated
		 */
		EClass SV_INJECTION = eINSTANCE.getSvInjection();

		/**
		 * The meta object literal for the '<em><b>QNet Injection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_INJECTION__QNET_INJECTION = eINSTANCE.getSvInjection_QNetInjection();

		/**
		 * The meta object literal for the '<em><b>PNet Injection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_INJECTION__PNET_INJECTION = eINSTANCE.getSvInjection_PNetInjection();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_INJECTION__TOPOLOGICAL_NODE = eINSTANCE.getSvInjection_TopologicalNode();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl <em>Sv Power Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvPowerFlow()
		 * @generated
		 */
		EClass SV_POWER_FLOW = eINSTANCE.getSvPowerFlow();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_POWER_FLOW__TERMINAL = eINSTANCE.getSvPowerFlow_Terminal();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_POWER_FLOW__P = eINSTANCE.getSvPowerFlow_P();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_POWER_FLOW__Q = eINSTANCE.getSvPowerFlow_Q();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.TopologicalIslandImpl <em>Topological Island</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.TopologicalIslandImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getTopologicalIsland()
		 * @generated
		 */
		EClass TOPOLOGICAL_ISLAND = eINSTANCE.getTopologicalIsland();

		/**
		 * The meta object literal for the '<em><b>Angle Ref Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE = eINSTANCE.getTopologicalIsland_AngleRef_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Topological Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES = eINSTANCE.getTopologicalIsland_TopologicalNodes();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvStatusImpl <em>Sv Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvStatusImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvStatus()
		 * @generated
		 */
		EClass SV_STATUS = eINSTANCE.getSvStatus();

		/**
		 * The meta object literal for the '<em><b>In Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_STATUS__IN_SERVICE = eINSTANCE.getSvStatus_InService();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_STATUS__CONDUCTING_EQUIPMENT = eINSTANCE.getSvStatus_ConductingEquipment();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariableImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl <em>Sv Short Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvShortCircuit()
		 * @generated
		 */
		EClass SV_SHORT_CIRCUIT = eINSTANCE.getSvShortCircuit();

		/**
		 * The meta object literal for the '<em><b>R0 Per R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_SHORT_CIRCUIT__R0_PER_R = eINSTANCE.getSvShortCircuit_R0PerR();

		/**
		 * The meta object literal for the '<em><b>SShort Circuit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_SHORT_CIRCUIT__SSHORT_CIRCUIT = eINSTANCE.getSvShortCircuit_SShortCircuit();

		/**
		 * The meta object literal for the '<em><b>XPer R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_SHORT_CIRCUIT__XPER_R = eINSTANCE.getSvShortCircuit_XPerR();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE = eINSTANCE.getSvShortCircuit_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>X0 Per X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_SHORT_CIRCUIT__X0_PER_X = eINSTANCE.getSvShortCircuit_X0PerX();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvTapStepImpl <em>Sv Tap Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvTapStepImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvTapStep()
		 * @generated
		 */
		EClass SV_TAP_STEP = eINSTANCE.getSvTapStep();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_TAP_STEP__TAP_CHANGER = eINSTANCE.getSvTapStep_TapChanger();

		/**
		 * The meta object literal for the '<em><b>Continuous Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_TAP_STEP__CONTINUOUS_POSITION = eINSTANCE.getSvTapStep_ContinuousPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_TAP_STEP__POSITION = eINSTANCE.getSvTapStep_Position();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvVoltageImpl <em>Sv Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvVoltageImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvVoltage()
		 * @generated
		 */
		EClass SV_VOLTAGE = eINSTANCE.getSvVoltage();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_VOLTAGE__V = eINSTANCE.getSvVoltage_V();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_VOLTAGE__TOPOLOGICAL_NODE = eINSTANCE.getSvVoltage_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_VOLTAGE__ANGLE = eINSTANCE.getSvVoltage_Angle();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl <em>Sv Shunt Compensator Sections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl
		 * @see gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl#getSvShuntCompensatorSections()
		 * @generated
		 */
		EClass SV_SHUNT_COMPENSATOR_SECTIONS = eINSTANCE.getSvShuntCompensatorSections();

		/**
		 * The meta object literal for the '<em><b>Continuous Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS = eINSTANCE.getSvShuntCompensatorSections_ContinuousSections();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS = eINSTANCE.getSvShuntCompensatorSections_Sections();

		/**
		 * The meta object literal for the '<em><b>Shunt Compensator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR = eINSTANCE.getSvShuntCompensatorSections_ShuntCompensator();

	}

} //StateVariablesPackage
