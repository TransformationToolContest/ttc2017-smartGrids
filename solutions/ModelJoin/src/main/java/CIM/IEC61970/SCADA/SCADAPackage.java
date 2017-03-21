/**
 */
package CIM.IEC61970.SCADA;

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
 * @see CIM.IEC61970.SCADA.SCADAFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains entities to model information used by Supervisory Control and Data Acquisition (SCADA) applications. Supervisory control supports operator control of equipment, such as opening or closing a breaker. Data acquisition gathers telemetered data from various sources.  The subtypes of the Telemetry entity deliberately match the UCA and IEC 61850 definitions. \nThis package also supports alarm presentation but it is not expected to be used by other applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains entities to model information used by Supervisory Control and Data Acquisition (SCADA) applications. Supervisory control supports operator control of equipment, such as opening or closing a breaker. Data acquisition gathers telemetered data from various sources.  The subtypes of the Telemetry entity deliberately match the UCA and IEC 61850 definitions. \nThis package also supports alarm presentation but it is not expected to be used by other applications.'"
 * @generated
 */
public interface SCADAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SCADA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#SCADA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimSCADA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SCADAPackage eINSTANCE = CIM.IEC61970.SCADA.impl.SCADAPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.impl.CommunicationLinkImpl
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getCommunicationLink()
	 * @generated
	 */
	int COMMUNICATION_LINK = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Remote Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__REMOTE_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.impl.RemotePointImpl <em>Remote Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.impl.RemotePointImpl
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemotePoint()
	 * @generated
	 */
	int REMOTE_POINT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Remote Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT__REMOTE_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.impl.RemoteUnitImpl <em>Remote Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.impl.RemoteUnitImpl
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteUnit()
	 * @generated
	 */
	int REMOTE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Remote Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__REMOTE_POINTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__REMOTE_UNIT_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT__COMMUNICATION_LINKS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remote Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Remote Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_UNIT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.impl.RemoteControlImpl <em>Remote Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.impl.RemoteControlImpl
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteControl()
	 * @generated
	 */
	int REMOTE_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__UUID = REMOTE_POINT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__MRID = REMOTE_POINT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__NAME = REMOTE_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__DESCRIPTION = REMOTE_POINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__PATH_NAME = REMOTE_POINT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__MODELING_AUTHORITY_SET = REMOTE_POINT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__LOCAL_NAME = REMOTE_POINT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__ALIAS_NAME = REMOTE_POINT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Remote Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__REMOTE_UNIT = REMOTE_POINT__REMOTE_UNIT;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__CONTROL = REMOTE_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actuator Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__ACTUATOR_MAXIMUM = REMOTE_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remote Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__REMOTE_CONTROLLED = REMOTE_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actuator Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL__ACTUATOR_MINIMUM = REMOTE_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Remote Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_FEATURE_COUNT = REMOTE_POINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Remote Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_OPERATION_COUNT = REMOTE_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl <em>Remote Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.impl.RemoteSourceImpl
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteSource()
	 * @generated
	 */
	int REMOTE_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__UUID = REMOTE_POINT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__MRID = REMOTE_POINT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__NAME = REMOTE_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__DESCRIPTION = REMOTE_POINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__PATH_NAME = REMOTE_POINT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__MODELING_AUTHORITY_SET = REMOTE_POINT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__LOCAL_NAME = REMOTE_POINT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__ALIAS_NAME = REMOTE_POINT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Remote Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__REMOTE_UNIT = REMOTE_POINT__REMOTE_UNIT;

	/**
	 * The feature id for the '<em><b>Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__DEADBAND = REMOTE_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__SENSOR_MINIMUM = REMOTE_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__MEASUREMENT_VALUE = REMOTE_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scan Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__SCAN_INTERVAL = REMOTE_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sensor Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE__SENSOR_MAXIMUM = REMOTE_POINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Remote Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE_FEATURE_COUNT = REMOTE_POINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Remote Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SOURCE_OPERATION_COUNT = REMOTE_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.Source <em>Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.Source
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 5;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.SCADA.RemoteUnitType <em>Remote Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.SCADA.RemoteUnitType
	 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteUnitType()
	 * @generated
	 */
	int REMOTE_UNIT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.SCADA.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link</em>'.
	 * @see CIM.IEC61970.SCADA.CommunicationLink
	 * @generated
	 */
	EClass getCommunicationLink();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.SCADA.CommunicationLink#getRemoteUnits <em>Remote Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Remote Units</em>'.
	 * @see CIM.IEC61970.SCADA.CommunicationLink#getRemoteUnits()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_RemoteUnits();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.SCADA.RemotePoint <em>Remote Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Point</em>'.
	 * @see CIM.IEC61970.SCADA.RemotePoint
	 * @generated
	 */
	EClass getRemotePoint();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote Unit</em>'.
	 * @see CIM.IEC61970.SCADA.RemotePoint#getRemoteUnit()
	 * @see #getRemotePoint()
	 * @generated
	 */
	EReference getRemotePoint_RemoteUnit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.SCADA.RemoteUnit <em>Remote Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Unit</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteUnit
	 * @generated
	 */
	EClass getRemoteUnit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.SCADA.RemoteUnit#getRemotePoints <em>Remote Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Remote Points</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteUnit#getRemotePoints()
	 * @see #getRemoteUnit()
	 * @generated
	 */
	EReference getRemoteUnit_RemotePoints();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Unit Type</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteUnit#getRemoteUnitType()
	 * @see #getRemoteUnit()
	 * @generated
	 */
	EAttribute getRemoteUnit_RemoteUnitType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.SCADA.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Links</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteUnit#getCommunicationLinks()
	 * @see #getRemoteUnit()
	 * @generated
	 */
	EReference getRemoteUnit_CommunicationLinks();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.SCADA.RemoteControl <em>Remote Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Control</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteControl
	 * @generated
	 */
	EClass getRemoteControl();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteControl#getControl()
	 * @see #getRemoteControl()
	 * @generated
	 */
	EReference getRemoteControl_Control();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Maximum</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteControl#getActuatorMaximum()
	 * @see #getRemoteControl()
	 * @generated
	 */
	EAttribute getRemoteControl_ActuatorMaximum();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Controlled</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteControl#isRemoteControlled()
	 * @see #getRemoteControl()
	 * @generated
	 */
	EAttribute getRemoteControl_RemoteControlled();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Minimum</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteControl#getActuatorMinimum()
	 * @see #getRemoteControl()
	 * @generated
	 */
	EAttribute getRemoteControl_ActuatorMinimum();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.SCADA.RemoteSource <em>Remote Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Source</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteSource
	 * @generated
	 */
	EClass getRemoteSource();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadband</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteSource#getDeadband()
	 * @see #getRemoteSource()
	 * @generated
	 */
	EAttribute getRemoteSource_Deadband();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Minimum</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteSource#getSensorMinimum()
	 * @see #getRemoteSource()
	 * @generated
	 */
	EAttribute getRemoteSource_SensorMinimum();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteSource#getMeasurementValue()
	 * @see #getRemoteSource()
	 * @generated
	 */
	EReference getRemoteSource_MeasurementValue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Interval</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteSource#getScanInterval()
	 * @see #getRemoteSource()
	 * @generated
	 */
	EAttribute getRemoteSource_ScanInterval();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Maximum</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteSource#getSensorMaximum()
	 * @see #getRemoteSource()
	 * @generated
	 */
	EAttribute getRemoteSource_SensorMaximum();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.SCADA.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source</em>'.
	 * @see CIM.IEC61970.SCADA.Source
	 * @generated
	 */
	EEnum getSource();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.SCADA.RemoteUnitType <em>Remote Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Remote Unit Type</em>'.
	 * @see CIM.IEC61970.SCADA.RemoteUnitType
	 * @generated
	 */
	EEnum getRemoteUnitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SCADAFactory getSCADAFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.impl.CommunicationLinkImpl
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getCommunicationLink()
		 * @generated
		 */
		EClass COMMUNICATION_LINK = eINSTANCE.getCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Remote Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__REMOTE_UNITS = eINSTANCE.getCommunicationLink_RemoteUnits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.impl.RemotePointImpl <em>Remote Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.impl.RemotePointImpl
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemotePoint()
		 * @generated
		 */
		EClass REMOTE_POINT = eINSTANCE.getRemotePoint();

		/**
		 * The meta object literal for the '<em><b>Remote Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_POINT__REMOTE_UNIT = eINSTANCE.getRemotePoint_RemoteUnit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.impl.RemoteUnitImpl <em>Remote Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.impl.RemoteUnitImpl
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteUnit()
		 * @generated
		 */
		EClass REMOTE_UNIT = eINSTANCE.getRemoteUnit();

		/**
		 * The meta object literal for the '<em><b>Remote Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_UNIT__REMOTE_POINTS = eINSTANCE.getRemoteUnit_RemotePoints();

		/**
		 * The meta object literal for the '<em><b>Remote Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_UNIT__REMOTE_UNIT_TYPE = eINSTANCE.getRemoteUnit_RemoteUnitType();

		/**
		 * The meta object literal for the '<em><b>Communication Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_UNIT__COMMUNICATION_LINKS = eINSTANCE.getRemoteUnit_CommunicationLinks();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.impl.RemoteControlImpl <em>Remote Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.impl.RemoteControlImpl
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteControl()
		 * @generated
		 */
		EClass REMOTE_CONTROL = eINSTANCE.getRemoteControl();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_CONTROL__CONTROL = eINSTANCE.getRemoteControl_Control();

		/**
		 * The meta object literal for the '<em><b>Actuator Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL__ACTUATOR_MAXIMUM = eINSTANCE.getRemoteControl_ActuatorMaximum();

		/**
		 * The meta object literal for the '<em><b>Remote Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL__REMOTE_CONTROLLED = eINSTANCE.getRemoteControl_RemoteControlled();

		/**
		 * The meta object literal for the '<em><b>Actuator Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL__ACTUATOR_MINIMUM = eINSTANCE.getRemoteControl_ActuatorMinimum();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl <em>Remote Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.impl.RemoteSourceImpl
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteSource()
		 * @generated
		 */
		EClass REMOTE_SOURCE = eINSTANCE.getRemoteSource();

		/**
		 * The meta object literal for the '<em><b>Deadband</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_SOURCE__DEADBAND = eINSTANCE.getRemoteSource_Deadband();

		/**
		 * The meta object literal for the '<em><b>Sensor Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_SOURCE__SENSOR_MINIMUM = eINSTANCE.getRemoteSource_SensorMinimum();

		/**
		 * The meta object literal for the '<em><b>Measurement Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_SOURCE__MEASUREMENT_VALUE = eINSTANCE.getRemoteSource_MeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Scan Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_SOURCE__SCAN_INTERVAL = eINSTANCE.getRemoteSource_ScanInterval();

		/**
		 * The meta object literal for the '<em><b>Sensor Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_SOURCE__SENSOR_MAXIMUM = eINSTANCE.getRemoteSource_SensorMaximum();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.Source <em>Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.Source
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getSource()
		 * @generated
		 */
		EEnum SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.SCADA.RemoteUnitType <em>Remote Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.SCADA.RemoteUnitType
		 * @see CIM.IEC61970.SCADA.impl.SCADAPackageImpl#getRemoteUnitType()
		 * @generated
		 */
		EEnum REMOTE_UNIT_TYPE = eINSTANCE.getRemoteUnitType();

	}

} //SCADAPackage
