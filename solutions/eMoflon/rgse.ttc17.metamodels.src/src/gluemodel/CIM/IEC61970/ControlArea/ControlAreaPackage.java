/**
 */
package gluemodel.CIM.IEC61970.ControlArea;

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
 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ControlArea package models area specifications which can be used for a variety of purposes.  The package as a whole models potentially overlapping control area specifications for the purpose of actual generation control, load forecast area load capture, or powerflow based analysis.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ControlArea package models area specifications which can be used for a variety of purposes.  The package as a whole models potentially overlapping control area specifications for the purpose of actual generation control, load forecast area load capture, or powerflow based analysis.'"
 * @generated
 */
public interface ControlAreaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ControlArea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#ControlArea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimControlArea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlAreaPackage eINSTANCE = gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaImpl <em>Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaImpl
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getControlArea()
	 * @generated
	 */
	int CONTROL_AREA = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ENERGY_AREA = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__TIE_FLOW = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>PTolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PTOLERANCE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NET_INTERCHANGE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl <em>Alt Generating Unit Meas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getAltGeneratingUnitMeas()
	 * @generated
	 */
	int ALT_GENERATING_UNIT_MEAS = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GENERATING_UNIT_MEAS__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analog Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GENERATING_UNIT_MEAS__PRIORITY = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alt Generating Unit Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GENERATING_UNIT_MEAS_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alt Generating Unit Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GENERATING_UNIT_MEAS_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl <em>Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getTieFlow()
	 * @generated
	 */
	int TIE_FLOW = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__TERMINAL = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__ALT_TIE_MEAS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__CONTROL_AREA = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__POSITIVE_FLOW_IN = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getControlAreaGeneratingUnit()
	 * @generated
	 */
	int CONTROL_AREA_GENERATING_UNIT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Generating Unit Meas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl <em>Alt Tie Meas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getAltTieMeas()
	 * @generated
	 */
	int ALT_TIE_MEAS = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_TIE_MEAS__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Analog Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_TIE_MEAS__ANALOG_VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_TIE_MEAS__TIE_FLOW = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_TIE_MEAS__PRIORITY = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alt Tie Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_TIE_MEAS_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alt Tie Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_TIE_MEAS_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaTypeKind
	 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getControlAreaTypeKind()
	 * @generated
	 */
	int CONTROL_AREA_TYPE_KIND = 5;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea
	 * @generated
	 */
	EClass getControlArea();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea#getType()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_Type();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Area</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea#getEnergyArea()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_EnergyArea();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea#getTieFlow()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_TieFlow();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PTolerance</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea#getPTolerance()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_PTolerance();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Interchange</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlArea#getNetInterchange()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_NetInterchange();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Generating Unit Meas</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas
	 * @generated
	 */
	EClass getAltGeneratingUnitMeas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit()
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 */
	EReference getAltGeneratingUnitMeas_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog Value</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue()
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 */
	EReference getAltGeneratingUnitMeas_AnalogValue();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority()
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 */
	EAttribute getAltGeneratingUnitMeas_Priority();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow
	 * @generated
	 */
	EClass getTieFlow();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow#getTerminal()
	 * @see #getTieFlow()
	 * @generated
	 */
	EReference getTieFlow_Terminal();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Tie Meas</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow#getAltTieMeas()
	 * @see #getTieFlow()
	 * @generated
	 */
	EReference getTieFlow_AltTieMeas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow#getControlArea()
	 * @see #getTieFlow()
	 * @generated
	 */
	EReference getTieFlow_ControlArea();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow#isPositiveFlowIn()
	 * @see #getTieFlow()
	 * @generated
	 */
	EAttribute getTieFlow_PositiveFlowIn();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit
	 * @generated
	 */
	EClass getControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_ControlArea();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Generating Unit Meas</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_AltGeneratingUnitMeas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_GeneratingUnit();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Tie Meas</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltTieMeas
	 * @generated
	 */
	EClass getAltTieMeas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog Value</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getAnalogValue()
	 * @see #getAltTieMeas()
	 * @generated
	 */
	EReference getAltTieMeas_AnalogValue();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tie Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getTieFlow()
	 * @see #getAltTieMeas()
	 * @generated
	 */
	EReference getAltTieMeas_TieFlow();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getPriority()
	 * @see #getAltTieMeas()
	 * @generated
	 */
	EAttribute getAltTieMeas_Priority();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaTypeKind
	 * @generated
	 */
	EEnum getControlAreaTypeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlAreaFactory getControlAreaFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaImpl <em>Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaImpl
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getControlArea()
		 * @generated
		 */
		EClass CONTROL_AREA = eINSTANCE.getControlArea();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__TYPE = eINSTANCE.getControlArea_Type();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlArea_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Energy Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__ENERGY_AREA = eINSTANCE.getControlArea_EnergyArea();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__TIE_FLOW = eINSTANCE.getControlArea_TieFlow();

		/**
		 * The meta object literal for the '<em><b>PTolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__PTOLERANCE = eINSTANCE.getControlArea_PTolerance();

		/**
		 * The meta object literal for the '<em><b>Net Interchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__NET_INTERCHANGE = eINSTANCE.getControlArea_NetInterchange();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl <em>Alt Generating Unit Meas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getAltGeneratingUnitMeas()
		 * @generated
		 */
		EClass ALT_GENERATING_UNIT_MEAS = eINSTANCE.getAltGeneratingUnitMeas();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getAltGeneratingUnitMeas_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Analog Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE = eINSTANCE.getAltGeneratingUnitMeas_AnalogValue();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALT_GENERATING_UNIT_MEAS__PRIORITY = eINSTANCE.getAltGeneratingUnitMeas_Priority();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl <em>Tie Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getTieFlow()
		 * @generated
		 */
		EClass TIE_FLOW = eINSTANCE.getTieFlow();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW__TERMINAL = eINSTANCE.getTieFlow_Terminal();

		/**
		 * The meta object literal for the '<em><b>Alt Tie Meas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW__ALT_TIE_MEAS = eINSTANCE.getTieFlow_AltTieMeas();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW__CONTROL_AREA = eINSTANCE.getTieFlow_ControlArea();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIE_FLOW__POSITIVE_FLOW_IN = eINSTANCE.getTieFlow_PositiveFlowIn();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getControlAreaGeneratingUnit()
		 * @generated
		 */
		EClass CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = eINSTANCE.getControlAreaGeneratingUnit_ControlArea();

		/**
		 * The meta object literal for the '<em><b>Alt Generating Unit Meas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS = eINSTANCE.getControlAreaGeneratingUnit_AltGeneratingUnitMeas();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl <em>Alt Tie Meas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getAltTieMeas()
		 * @generated
		 */
		EClass ALT_TIE_MEAS = eINSTANCE.getAltTieMeas();

		/**
		 * The meta object literal for the '<em><b>Analog Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_TIE_MEAS__ANALOG_VALUE = eINSTANCE.getAltTieMeas_AnalogValue();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_TIE_MEAS__TIE_FLOW = eINSTANCE.getAltTieMeas_TieFlow();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALT_TIE_MEAS__PRIORITY = eINSTANCE.getAltTieMeas_Priority();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaTypeKind
		 * @see gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl#getControlAreaTypeKind()
		 * @generated
		 */
		EEnum CONTROL_AREA_TYPE_KIND = eINSTANCE.getControlAreaTypeKind();

	}

} //ControlAreaPackage
