/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.CIMPackage;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61970.ControlArea.ControlAreaPackage;

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
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package provides the capability to schedule and account for transactions for the exchange of electric power between companies. It includes transations for megawatts which are generated, consumed, lost, passed through, sold and purchased. These classes are used by Accounting and Billing for Energy, Generation Capacity, Transmission, and Ancillary Services.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package provides the capability to schedule and account for transactions for the exchange of electric power between companies. It includes transations for megawatts which are generated, consumed, lost, passed through, sold and purchased. These classes are used by Accounting and Billing for Energy, Generation Capacity, Transmission, and Ancillary Services.'"
 * @generated
 */
public interface EnergySchedulingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EnergyScheduling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#EnergyScheduling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimEnergyScheduling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnergySchedulingPackage eINSTANCE = CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Profile Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PROFILE_DATAS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.LossProfileImpl <em>Loss Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.LossProfileImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getLossProfile()
	 * @generated
	 */
	int LOSS_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__UUID = PROFILE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__MRID = PROFILE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__NAME = PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__DESCRIPTION = PROFILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__PATH_NAME = PROFILE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__MODELING_AUTHORITY_SET = PROFILE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__LOCAL_NAME = PROFILE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__ALIAS_NAME = PROFILE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Profile Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__PROFILE_DATAS = PROFILE__PROFILE_DATAS;

	/**
	 * The feature id for the '<em><b>Has Loss </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__HAS_LOSS_ = PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE__ENERGY_TRANSACTION = PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loss Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE_FEATURE_COUNT = PROFILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loss Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PROFILE_OPERATION_COUNT = PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl <em>Sub Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getSubControlArea()
	 * @generated
	 */
	int SUB_CONTROL_AREA = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__UUID = ControlAreaPackage.CONTROL_AREA__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__MRID = ControlAreaPackage.CONTROL_AREA__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__NAME = ControlAreaPackage.CONTROL_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__DESCRIPTION = ControlAreaPackage.CONTROL_AREA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__PATH_NAME = ControlAreaPackage.CONTROL_AREA__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__MODELING_AUTHORITY_SET = ControlAreaPackage.CONTROL_AREA__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__LOCAL_NAME = ControlAreaPackage.CONTROL_AREA__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__ALIAS_NAME = ControlAreaPackage.CONTROL_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__REPORTING_GROUP = ControlAreaPackage.CONTROL_AREA__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__NETWORK_DATA_SETS = ControlAreaPackage.CONTROL_AREA__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__LOCATION = ControlAreaPackage.CONTROL_AREA__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__OUTAGE_SCHEDULE = ControlAreaPackage.CONTROL_AREA__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__PSR_EVENT = ControlAreaPackage.CONTROL_AREA__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__SAFETY_DOCUMENTS = ControlAreaPackage.CONTROL_AREA__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__ERP_ORGANISATION_ROLES = ControlAreaPackage.CONTROL_AREA__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__CIRCUIT_SECTIONS = ControlAreaPackage.CONTROL_AREA__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__MEASUREMENTS = ControlAreaPackage.CONTROL_AREA__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__ASSETS = ControlAreaPackage.CONTROL_AREA__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__SCHEDULE_STEPS = ControlAreaPackage.CONTROL_AREA__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__PSR_TYPE = ControlAreaPackage.CONTROL_AREA__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__PSR_LISTS = ControlAreaPackage.CONTROL_AREA__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__OPERATING_SHARE = ControlAreaPackage.CONTROL_AREA__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__CHANGE_ITEMS = ControlAreaPackage.CONTROL_AREA__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__DOCUMENT_ROLES = ControlAreaPackage.CONTROL_AREA__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__TYPE = ControlAreaPackage.CONTROL_AREA__TYPE;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Energy Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__ENERGY_AREA = ControlAreaPackage.CONTROL_AREA__ENERGY_AREA;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__TIE_FLOW = ControlAreaPackage.CONTROL_AREA__TIE_FLOW;

	/**
	 * The feature id for the '<em><b>PTolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__PTOLERANCE = ControlAreaPackage.CONTROL_AREA__PTOLERANCE;

	/**
	 * The feature id for the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__NET_INTERCHANGE = ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE;

	/**
	 * The feature id for the '<em><b>Side ATie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__SIDE_ATIE_LINES = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__GENERATING_UNITS = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export Energy Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import Energy Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__HOST_CONTROL_AREA = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__PART_OF = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flowgate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__FLOWGATE = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Side BTie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA__SIDE_BTIE_LINES = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Sub Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA_FEATURE_COUNT = ControlAreaPackage.CONTROL_AREA_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Sub Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONTROL_AREA_OPERATION_COUNT = ControlAreaPackage.CONTROL_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl <em>Energy Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergyTransaction()
	 * @generated
	 */
	int ENERGY_TRANSACTION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Energy Price Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ENERGY_PRICE_CURVES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Trans Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ENERGY_TRANS_ID = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__STATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Firm Interchange Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ENERGY_PRODUCT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delivery Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__DELIVERY_POINT_P = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Export Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Import Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Receipt Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__RECEIPT_POINT_P = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Congest Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__CONGEST_CHARGE_MAX = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Energy Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ENERGY_PROFILES = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Curtailment Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__CURTAILMENT_PROFILES = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Loss Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__LOSS_PROFILES = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Energy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__ENERGY_MIN = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION__REASON = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Energy Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Energy Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSACTION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ReserveImpl <em>Reserve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.ReserveImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getReserve()
	 * @generated
	 */
	int RESERVE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__UUID = ENERGY_TRANSACTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__MRID = ENERGY_TRANSACTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__NAME = ENERGY_TRANSACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__DESCRIPTION = ENERGY_TRANSACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__PATH_NAME = ENERGY_TRANSACTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__MODELING_AUTHORITY_SET = ENERGY_TRANSACTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__LOCAL_NAME = ENERGY_TRANSACTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ALIAS_NAME = ENERGY_TRANSACTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__SUBJECT = ENERGY_TRANSACTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__SCHEDULED_EVENTS = ENERGY_TRANSACTION__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ERP_ORGANISATION_ROLES = ENERGY_TRANSACTION__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CREATED_DATE_TIME = ENERGY_TRANSACTION__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__TO_DOCUMENT_ROLES = ENERGY_TRANSACTION__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ASSET_ROLES = ENERGY_TRANSACTION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ERP_PERSON_ROLES = ENERGY_TRANSACTION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__REVISION_NUMBER = ENERGY_TRANSACTION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ELECTRONIC_ADDRESS = ENERGY_TRANSACTION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__STATUS = ENERGY_TRANSACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__NETWORK_DATA_SETS = ENERGY_TRANSACTION__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__POWER_SYSTEM_RESOURCE_ROLES = ENERGY_TRANSACTION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CATEGORY = ENERGY_TRANSACTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ACTIVITY_RECORDS = ENERGY_TRANSACTION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__MEASUREMENTS = ENERGY_TRANSACTION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__FROM_DOCUMENT_ROLES = ENERGY_TRANSACTION__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__LAST_MODIFIED_DATE_TIME = ENERGY_TRANSACTION__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CHANGE_SETS = ENERGY_TRANSACTION__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__DOC_STATUS = ENERGY_TRANSACTION__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CHANGE_ITEMS = ENERGY_TRANSACTION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__SCHEDULE_PARAMETER_INFOS = ENERGY_TRANSACTION__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__TITLE = ENERGY_TRANSACTION__TITLE;

	/**
	 * The feature id for the '<em><b>Energy Price Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ENERGY_PRICE_CURVES = ENERGY_TRANSACTION__ENERGY_PRICE_CURVES;

	/**
	 * The feature id for the '<em><b>Energy Trans Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ENERGY_TRANS_ID = ENERGY_TRANSACTION__ENERGY_TRANS_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__STATE = ENERGY_TRANSACTION__STATE;

	/**
	 * The feature id for the '<em><b>Firm Interchange Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__FIRM_INTERCHANGE_FLAG = ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG;

	/**
	 * The feature id for the '<em><b>Energy Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ENERGY_PRODUCT = ENERGY_TRANSACTION__ENERGY_PRODUCT;

	/**
	 * The feature id for the '<em><b>Delivery Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__DELIVERY_POINT_P = ENERGY_TRANSACTION__DELIVERY_POINT_P;

	/**
	 * The feature id for the '<em><b>Export Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__EXPORT_SUB_CONTROL_AREA = ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Import Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__IMPORT_SUB_CONTROL_AREA = ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Receipt Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__RECEIPT_POINT_P = ENERGY_TRANSACTION__RECEIPT_POINT_P;

	/**
	 * The feature id for the '<em><b>Congest Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CONGEST_CHARGE_MAX = ENERGY_TRANSACTION__CONGEST_CHARGE_MAX;

	/**
	 * The feature id for the '<em><b>Energy Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ENERGY_PROFILES = ENERGY_TRANSACTION__ENERGY_PROFILES;

	/**
	 * The feature id for the '<em><b>Curtailment Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CURTAILMENT_PROFILES = ENERGY_TRANSACTION__CURTAILMENT_PROFILES;

	/**
	 * The feature id for the '<em><b>Loss Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__LOSS_PROFILES = ENERGY_TRANSACTION__LOSS_PROFILES;

	/**
	 * The feature id for the '<em><b>Energy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ENERGY_MIN = ENERGY_TRANSACTION__ENERGY_MIN;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__REASON = ENERGY_TRANSACTION__REASON;

	/**
	 * The feature id for the '<em><b>Area Reserve Spec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__AREA_RESERVE_SPEC = ENERGY_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reserve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_FEATURE_COUNT = ENERGY_TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reserve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_OPERATION_COUNT = ENERGY_TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionRightOfWayImpl <em>Transmission Right Of Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionRightOfWayImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getTransmissionRightOfWay()
	 * @generated
	 */
	int TRANSMISSION_RIGHT_OF_WAY = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Transmission Corridor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY__LINES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transmission Right Of Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transmission Right Of Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RIGHT_OF_WAY_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicImpl <em>Dynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getDynamic()
	 * @generated
	 */
	int DYNAMIC = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__UUID = ENERGY_TRANSACTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__MRID = ENERGY_TRANSACTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__NAME = ENERGY_TRANSACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__DESCRIPTION = ENERGY_TRANSACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__PATH_NAME = ENERGY_TRANSACTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__MODELING_AUTHORITY_SET = ENERGY_TRANSACTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LOCAL_NAME = ENERGY_TRANSACTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ALIAS_NAME = ENERGY_TRANSACTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__SUBJECT = ENERGY_TRANSACTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__SCHEDULED_EVENTS = ENERGY_TRANSACTION__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ERP_ORGANISATION_ROLES = ENERGY_TRANSACTION__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__CREATED_DATE_TIME = ENERGY_TRANSACTION__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__TO_DOCUMENT_ROLES = ENERGY_TRANSACTION__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ASSET_ROLES = ENERGY_TRANSACTION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ERP_PERSON_ROLES = ENERGY_TRANSACTION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__REVISION_NUMBER = ENERGY_TRANSACTION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ELECTRONIC_ADDRESS = ENERGY_TRANSACTION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__STATUS = ENERGY_TRANSACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__NETWORK_DATA_SETS = ENERGY_TRANSACTION__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__POWER_SYSTEM_RESOURCE_ROLES = ENERGY_TRANSACTION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__CATEGORY = ENERGY_TRANSACTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ACTIVITY_RECORDS = ENERGY_TRANSACTION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__MEASUREMENTS = ENERGY_TRANSACTION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__FROM_DOCUMENT_ROLES = ENERGY_TRANSACTION__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LAST_MODIFIED_DATE_TIME = ENERGY_TRANSACTION__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__CHANGE_SETS = ENERGY_TRANSACTION__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__DOC_STATUS = ENERGY_TRANSACTION__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__CHANGE_ITEMS = ENERGY_TRANSACTION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__SCHEDULE_PARAMETER_INFOS = ENERGY_TRANSACTION__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__TITLE = ENERGY_TRANSACTION__TITLE;

	/**
	 * The feature id for the '<em><b>Energy Price Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ENERGY_PRICE_CURVES = ENERGY_TRANSACTION__ENERGY_PRICE_CURVES;

	/**
	 * The feature id for the '<em><b>Energy Trans Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ENERGY_TRANS_ID = ENERGY_TRANSACTION__ENERGY_TRANS_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__STATE = ENERGY_TRANSACTION__STATE;

	/**
	 * The feature id for the '<em><b>Firm Interchange Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__FIRM_INTERCHANGE_FLAG = ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG;

	/**
	 * The feature id for the '<em><b>Energy Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ENERGY_PRODUCT = ENERGY_TRANSACTION__ENERGY_PRODUCT;

	/**
	 * The feature id for the '<em><b>Delivery Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__DELIVERY_POINT_P = ENERGY_TRANSACTION__DELIVERY_POINT_P;

	/**
	 * The feature id for the '<em><b>Export Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__EXPORT_SUB_CONTROL_AREA = ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Import Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__IMPORT_SUB_CONTROL_AREA = ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Receipt Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__RECEIPT_POINT_P = ENERGY_TRANSACTION__RECEIPT_POINT_P;

	/**
	 * The feature id for the '<em><b>Congest Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__CONGEST_CHARGE_MAX = ENERGY_TRANSACTION__CONGEST_CHARGE_MAX;

	/**
	 * The feature id for the '<em><b>Energy Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ENERGY_PROFILES = ENERGY_TRANSACTION__ENERGY_PROFILES;

	/**
	 * The feature id for the '<em><b>Curtailment Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__CURTAILMENT_PROFILES = ENERGY_TRANSACTION__CURTAILMENT_PROFILES;

	/**
	 * The feature id for the '<em><b>Loss Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LOSS_PROFILES = ENERGY_TRANSACTION__LOSS_PROFILES;

	/**
	 * The feature id for the '<em><b>Energy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ENERGY_MIN = ENERGY_TRANSACTION__ENERGY_MIN;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__REASON = ENERGY_TRANSACTION__REASON;

	/**
	 * The feature id for the '<em><b>Tie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__TIE_LINES = ENERGY_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FEATURE_COUNT = ENERGY_TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OPERATION_COUNT = ENERGY_TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingVersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingVersionImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergySchedulingVersion()
	 * @generated
	 */
	int ENERGY_SCHEDULING_VERSION = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SCHEDULING_VERSION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SCHEDULING_VERSION__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SCHEDULING_VERSION__VERSION = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SCHEDULING_VERSION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SCHEDULING_VERSION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl <em>Dynamic Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getDynamicSchedule()
	 * @generated
	 */
	int DYNAMIC_SCHEDULE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Dyn Sched Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__DYN_SCHED_STATUS = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Host Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__MEASUREMENT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Send Host Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dyn Sched Sign Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dynamic Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dynamic Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl <em>Area Reserve Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getAreaReserveSpec()
	 * @generated
	 */
	int AREA_RESERVE_SPEC = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Raise Reg Margin Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reserve Energy Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Control Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__HOST_CONTROL_AREAS = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Area Reserve Spec Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Op Reserve Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__OP_RESERVE_REQT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Reg Margin Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Primary Reserve Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Spinning Reserve Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Area Reserve Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Area Reserve Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESERVE_SPEC_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl <em>Profile Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getProfileData()
	 * @generated
	 */
	int PROFILE_DATA = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Capacity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__CAPACITY_LEVEL = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__START_DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__PROFILE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stop Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__STOP_DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Energy Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA__ENERGY_LEVEL = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Profile Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Profile Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_DATA_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl <em>Energy Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergyProduct()
	 * @generated
	 */
	int ENERGY_PRODUCT = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__GENERATION_PROVIDER = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title Held By Marketer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__ENERGY_TRANSACTIONS = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resold By Marketers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__RESOLD_BY_MARKETERS = CommonPackage.AGREEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT__SERVICE_POINT = CommonPackage.AGREEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Energy Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Energy Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRODUCT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionCorridorImpl <em>Transmission Corridor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionCorridorImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getTransmissionCorridor()
	 * @generated
	 */
	int TRANSMISSION_CORRIDOR = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Transmission Right Of Ways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR__CONTAINED_IN = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transmission Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transmission Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CORRIDOR_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.InadvertentAccountImpl <em>Inadvertent Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.InadvertentAccountImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getInadvertentAccount()
	 * @generated
	 */
	int INADVERTENT_ACCOUNT = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Host Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT__HOST_CONTROL_AREA = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inadvertent Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inadvertent Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADVERTENT_ACCOUNT_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AvailableTransmissionCapacityImpl <em>Available Transmission Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.AvailableTransmissionCapacityImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getAvailableTransmissionCapacity()
	 * @generated
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Schedule For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Available Transmission Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Available Transmission Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSMISSION_CAPACITY_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl <em>Tie Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getTieLine()
	 * @generated
	 */
	int TIE_LINE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Dynamic Energy Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__DYNAMIC_ENERGY_TRANSACTION = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__CUSTOMER_CONSUMER = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Side ASub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__SIDE_ASUB_CONTROL_AREA = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Side BHost Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__SIDE_BHOST_CONTROL_AREA = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Side BSub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__SIDE_BSUB_CONTROL_AREA = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Side AHost Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__SIDE_AHOST_CONTROL_AREA = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Control Area Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE__CONTROL_AREA_OPERATORS = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tie Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tie Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_LINE_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProfileImpl <em>Energy Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProfileImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergyProfile()
	 * @generated
	 */
	int ENERGY_PROFILE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__UUID = PROFILE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__MRID = PROFILE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__NAME = PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__DESCRIPTION = PROFILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__PATH_NAME = PROFILE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__MODELING_AUTHORITY_SET = PROFILE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__LOCAL_NAME = PROFILE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__ALIAS_NAME = PROFILE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Profile Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__PROFILE_DATAS = PROFILE__PROFILE_DATAS;

	/**
	 * The feature id for the '<em><b>Transaction Bid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__TRANSACTION_BID = PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE__ENERGY_TRANSACTION = PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Energy Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE_FEATURE_COUNT = PROFILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Energy Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROFILE_OPERATION_COUNT = PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.BlockImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__UUID = ENERGY_TRANSACTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MRID = ENERGY_TRANSACTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = ENERGY_TRANSACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DESCRIPTION = ENERGY_TRANSACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PATH_NAME = ENERGY_TRANSACTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MODELING_AUTHORITY_SET = ENERGY_TRANSACTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LOCAL_NAME = ENERGY_TRANSACTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ALIAS_NAME = ENERGY_TRANSACTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SUBJECT = ENERGY_TRANSACTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SCHEDULED_EVENTS = ENERGY_TRANSACTION__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ERP_ORGANISATION_ROLES = ENERGY_TRANSACTION__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CREATED_DATE_TIME = ENERGY_TRANSACTION__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TO_DOCUMENT_ROLES = ENERGY_TRANSACTION__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ASSET_ROLES = ENERGY_TRANSACTION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ERP_PERSON_ROLES = ENERGY_TRANSACTION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REVISION_NUMBER = ENERGY_TRANSACTION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ELECTRONIC_ADDRESS = ENERGY_TRANSACTION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATUS = ENERGY_TRANSACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NETWORK_DATA_SETS = ENERGY_TRANSACTION__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__POWER_SYSTEM_RESOURCE_ROLES = ENERGY_TRANSACTION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CATEGORY = ENERGY_TRANSACTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ACTIVITY_RECORDS = ENERGY_TRANSACTION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MEASUREMENTS = ENERGY_TRANSACTION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__FROM_DOCUMENT_ROLES = ENERGY_TRANSACTION__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LAST_MODIFIED_DATE_TIME = ENERGY_TRANSACTION__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHANGE_SETS = ENERGY_TRANSACTION__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DOC_STATUS = ENERGY_TRANSACTION__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHANGE_ITEMS = ENERGY_TRANSACTION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SCHEDULE_PARAMETER_INFOS = ENERGY_TRANSACTION__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TITLE = ENERGY_TRANSACTION__TITLE;

	/**
	 * The feature id for the '<em><b>Energy Price Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENERGY_PRICE_CURVES = ENERGY_TRANSACTION__ENERGY_PRICE_CURVES;

	/**
	 * The feature id for the '<em><b>Energy Trans Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENERGY_TRANS_ID = ENERGY_TRANSACTION__ENERGY_TRANS_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATE = ENERGY_TRANSACTION__STATE;

	/**
	 * The feature id for the '<em><b>Firm Interchange Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__FIRM_INTERCHANGE_FLAG = ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG;

	/**
	 * The feature id for the '<em><b>Energy Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENERGY_PRODUCT = ENERGY_TRANSACTION__ENERGY_PRODUCT;

	/**
	 * The feature id for the '<em><b>Delivery Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DELIVERY_POINT_P = ENERGY_TRANSACTION__DELIVERY_POINT_P;

	/**
	 * The feature id for the '<em><b>Export Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXPORT_SUB_CONTROL_AREA = ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Import Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IMPORT_SUB_CONTROL_AREA = ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Receipt Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__RECEIPT_POINT_P = ENERGY_TRANSACTION__RECEIPT_POINT_P;

	/**
	 * The feature id for the '<em><b>Congest Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONGEST_CHARGE_MAX = ENERGY_TRANSACTION__CONGEST_CHARGE_MAX;

	/**
	 * The feature id for the '<em><b>Energy Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENERGY_PROFILES = ENERGY_TRANSACTION__ENERGY_PROFILES;

	/**
	 * The feature id for the '<em><b>Curtailment Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CURTAILMENT_PROFILES = ENERGY_TRANSACTION__CURTAILMENT_PROFILES;

	/**
	 * The feature id for the '<em><b>Loss Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LOSS_PROFILES = ENERGY_TRANSACTION__LOSS_PROFILES;

	/**
	 * The feature id for the '<em><b>Energy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENERGY_MIN = ENERGY_TRANSACTION__ENERGY_MIN;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REASON = ENERGY_TRANSACTION__REASON;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = ENERGY_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = ENERGY_TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.CurtailmentProfileImpl <em>Curtailment Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.CurtailmentProfileImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getCurtailmentProfile()
	 * @generated
	 */
	int CURTAILMENT_PROFILE = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__UUID = PROFILE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__MRID = PROFILE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__NAME = PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__DESCRIPTION = PROFILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__PATH_NAME = PROFILE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__MODELING_AUTHORITY_SET = PROFILE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__LOCAL_NAME = PROFILE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__ALIAS_NAME = PROFILE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Profile Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__PROFILE_DATAS = PROFILE__PROFILE_DATAS;

	/**
	 * The feature id for the '<em><b>Energy Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE__ENERGY_TRANSACTION = PROFILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Curtailment Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE_FEATURE_COUNT = PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Curtailment Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAILMENT_PROFILE_OPERATION_COUNT = PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl <em>Host Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getHostControlArea()
	 * @generated
	 */
	int HOST_CONTROL_AREA = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Sub Control Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__SUB_CONTROL_AREAS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency Bias Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Side ATie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__SIDE_ATIE_LINES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Freq Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__FREQ_SET_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inadvertent Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Side BTie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__SIDE_BTIE_LINES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Receive Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Area Reserve Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__AREA_RESERVE_SPEC = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Area Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__AREA_CONTROL_MODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Send Dynamic Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Host Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Host Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONTROL_AREA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode <em>Area Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode
	 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getAreaControlMode()
	 * @generated
	 */
	int AREA_CONTROL_MODE = 20;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile <em>Loss Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Profile</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.LossProfile
	 * @generated
	 */
	EClass getLossProfile();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getHasLoss_ <em>Has Loss </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Loss </em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getHasLoss_()
	 * @see #getLossProfile()
	 * @generated
	 */
	EReference getLossProfile_HasLoss_();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getEnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Transaction</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getEnergyTransaction()
	 * @see #getLossProfile()
	 * @generated
	 */
	EReference getLossProfile_EnergyTransaction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea <em>Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea
	 * @generated
	 */
	EClass getSubControlArea();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideA_TieLines <em>Side ATie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Side ATie Lines</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideA_TieLines()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_SideA_TieLines();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getGeneratingUnits <em>Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Units</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getGeneratingUnits()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_GeneratingUnits();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getExport_EnergyTransactions <em>Export Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Export Energy Transactions</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getExport_EnergyTransactions()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_Export_EnergyTransactions();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getImport_EnergyTransactions <em>Import Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import Energy Transactions</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getImport_EnergyTransactions()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_Import_EnergyTransactions();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getHostControlArea <em>Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getHostControlArea()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_HostControlArea();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getPartOf()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_PartOf();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flowgate</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getFlowgate()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_Flowgate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideB_TieLines <em>Side BTie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Side BTie Lines</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideB_TieLines()
	 * @see #getSubControlArea()
	 * @generated
	 */
	EReference getSubControlArea_SideB_TieLines();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.Reserve <em>Reserve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserve</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Reserve
	 * @generated
	 */
	EClass getReserve();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.Reserve#getAreaReserveSpec <em>Area Reserve Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Area Reserve Spec</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Reserve#getAreaReserveSpec()
	 * @see #getReserve()
	 * @generated
	 */
	EReference getReserve_AreaReserveSpec();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Transaction</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction
	 * @generated
	 */
	EClass getEnergyTransaction();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyPriceCurves <em>Energy Price Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Price Curves</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyPriceCurves()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_EnergyPriceCurves();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyTransId <em>Energy Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Trans Id</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyTransId()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_EnergyTransId();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getState()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_State();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#isFirmInterchangeFlag <em>Firm Interchange Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firm Interchange Flag</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#isFirmInterchangeFlag()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_FirmInterchangeFlag();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProduct <em>Energy Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Product</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProduct()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_EnergyProduct();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getDeliveryPointP <em>Delivery Point P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Point P</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getDeliveryPointP()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_DeliveryPointP();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getExport_SubControlArea <em>Export Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export Sub Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getExport_SubControlArea()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_Export_SubControlArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getImport_SubControlArea <em>Import Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import Sub Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getImport_SubControlArea()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_Import_SubControlArea();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReceiptPointP <em>Receipt Point P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipt Point P</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReceiptPointP()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_ReceiptPointP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCongestChargeMax <em>Congest Charge Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Congest Charge Max</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCongestChargeMax()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_CongestChargeMax();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProfiles <em>Energy Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Profiles</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProfiles()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_EnergyProfiles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCurtailmentProfiles <em>Curtailment Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Curtailment Profiles</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCurtailmentProfiles()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_CurtailmentProfiles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getLossProfiles <em>Loss Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loss Profiles</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getLossProfiles()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EReference getEnergyTransaction_LossProfiles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyMin <em>Energy Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Min</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyMin()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_EnergyMin();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReason()
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	EAttribute getEnergyTransaction_Reason();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.Profile#getProfileDatas <em>Profile Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile Datas</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Profile#getProfileDatas()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_ProfileDatas();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay <em>Transmission Right Of Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Right Of Way</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay
	 * @generated
	 */
	EClass getTransmissionRightOfWay();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getTransmissionCorridor <em>Transmission Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Corridor</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getTransmissionCorridor()
	 * @see #getTransmissionRightOfWay()
	 * @generated
	 */
	EReference getTransmissionRightOfWay_TransmissionCorridor();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay#getLines()
	 * @see #getTransmissionRightOfWay()
	 * @generated
	 */
	EReference getTransmissionRightOfWay_Lines();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.Dynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Dynamic
	 * @generated
	 */
	EClass getDynamic();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.Dynamic#getTieLines <em>Tie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Lines</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Dynamic#getTieLines()
	 * @see #getDynamic()
	 * @generated
	 */
	EReference getDynamic_TieLines();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion
	 * @generated
	 */
	EClass getEnergySchedulingVersion();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getDate()
	 * @see #getEnergySchedulingVersion()
	 * @generated
	 */
	EAttribute getEnergySchedulingVersion_Date();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getVersion()
	 * @see #getEnergySchedulingVersion()
	 * @generated
	 */
	EAttribute getEnergySchedulingVersion_Version();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule <em>Dynamic Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Schedule</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule
	 * @generated
	 */
	EClass getDynamicSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getDynSchedStatus <em>Dyn Sched Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dyn Sched Status</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getDynSchedStatus()
	 * @see #getDynamicSchedule()
	 * @generated
	 */
	EAttribute getDynamicSchedule_DynSchedStatus();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getReceive_HostControlArea <em>Receive Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Host Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getReceive_HostControlArea()
	 * @see #getDynamicSchedule()
	 * @generated
	 */
	EReference getDynamicSchedule_Receive_HostControlArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getMeasurement()
	 * @see #getDynamicSchedule()
	 * @generated
	 */
	EReference getDynamicSchedule_Measurement();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getSend_HostControlArea <em>Send Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Host Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getSend_HostControlArea()
	 * @see #getDynamicSchedule()
	 * @generated
	 */
	EReference getDynamicSchedule_Send_HostControlArea();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#isDynSchedSignRev <em>Dyn Sched Sign Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dyn Sched Sign Rev</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#isDynSchedSignRev()
	 * @see #getDynamicSchedule()
	 * @generated
	 */
	EAttribute getDynamicSchedule_DynSchedSignRev();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec <em>Area Reserve Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Reserve Spec</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec
	 * @generated
	 */
	EClass getAreaReserveSpec();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getRaiseRegMarginReqt <em>Raise Reg Margin Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raise Reg Margin Reqt</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getRaiseRegMarginReqt()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EAttribute getAreaReserveSpec_RaiseRegMarginReqt();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getReserveEnergyTransaction <em>Reserve Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserve Energy Transaction</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getReserveEnergyTransaction()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EReference getAreaReserveSpec_ReserveEnergyTransaction();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getHostControlAreas <em>Host Control Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Host Control Areas</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getHostControlAreas()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EReference getAreaReserveSpec_HostControlAreas();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getAreaReserveSpecName <em>Area Reserve Spec Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Reserve Spec Name</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getAreaReserveSpecName()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EAttribute getAreaReserveSpec_AreaReserveSpecName();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getOpReserveReqt <em>Op Reserve Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Reserve Reqt</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getOpReserveReqt()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EAttribute getAreaReserveSpec_OpReserveReqt();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getLowerRegMarginReqt <em>Lower Reg Margin Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Reg Margin Reqt</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getLowerRegMarginReqt()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EAttribute getAreaReserveSpec_LowerRegMarginReqt();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getPrimaryReserveReqt <em>Primary Reserve Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Reserve Reqt</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getPrimaryReserveReqt()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EAttribute getAreaReserveSpec_PrimaryReserveReqt();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getSpinningReserveReqt <em>Spinning Reserve Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spinning Reserve Reqt</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getSpinningReserveReqt()
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	EAttribute getAreaReserveSpec_SpinningReserveReqt();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData <em>Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Data</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData
	 * @generated
	 */
	EClass getProfileData();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getCapacityLevel <em>Capacity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Level</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getCapacityLevel()
	 * @see #getProfileData()
	 * @generated
	 */
	EAttribute getProfileData_CapacityLevel();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStartDateTime <em>Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date Time</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStartDateTime()
	 * @see #getProfileData()
	 * @generated
	 */
	EAttribute getProfileData_StartDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getSequenceNumber()
	 * @see #getProfileData()
	 * @generated
	 */
	EAttribute getProfileData_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getProfile()
	 * @see #getProfileData()
	 * @generated
	 */
	EReference getProfileData_Profile();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStopDateTime <em>Stop Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Date Time</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStopDateTime()
	 * @see #getProfileData()
	 * @generated
	 */
	EAttribute getProfileData_StopDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getEnergyLevel <em>Energy Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Level</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getEnergyLevel()
	 * @see #getProfileData()
	 * @generated
	 */
	EAttribute getProfileData_EnergyLevel();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct <em>Energy Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Product</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct
	 * @generated
	 */
	EClass getEnergyProduct();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getGenerationProvider <em>Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generation Provider</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getGenerationProvider()
	 * @see #getEnergyProduct()
	 * @generated
	 */
	EReference getEnergyProduct_GenerationProvider();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getTitleHeldBy_Marketer <em>Title Held By Marketer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title Held By Marketer</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getTitleHeldBy_Marketer()
	 * @see #getEnergyProduct()
	 * @generated
	 */
	EReference getEnergyProduct_TitleHeldBy_Marketer();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getEnergyTransactions <em>Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Transactions</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getEnergyTransactions()
	 * @see #getEnergyProduct()
	 * @generated
	 */
	EReference getEnergyProduct_EnergyTransactions();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getResoldBy_Marketers <em>Resold By Marketers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resold By Marketers</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getResoldBy_Marketers()
	 * @see #getEnergyProduct()
	 * @generated
	 */
	EReference getEnergyProduct_ResoldBy_Marketers();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Point</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getServicePoint()
	 * @see #getEnergyProduct()
	 * @generated
	 */
	EReference getEnergyProduct_ServicePoint();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor <em>Transmission Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Corridor</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor
	 * @generated
	 */
	EClass getTransmissionCorridor();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getTransmissionRightOfWays <em>Transmission Right Of Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transmission Right Of Ways</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getTransmissionRightOfWays()
	 * @see #getTransmissionCorridor()
	 * @generated
	 */
	EReference getTransmissionCorridor_TransmissionRightOfWays();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained In</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor#getContainedIn()
	 * @see #getTransmissionCorridor()
	 * @generated
	 */
	EReference getTransmissionCorridor_ContainedIn();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount <em>Inadvertent Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inadvertent Account</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount
	 * @generated
	 */
	EClass getInadvertentAccount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount#getHostControlArea <em>Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount#getHostControlArea()
	 * @see #getInadvertentAccount()
	 * @generated
	 */
	EReference getInadvertentAccount_HostControlArea();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity <em>Available Transmission Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Available Transmission Capacity</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity
	 * @generated
	 */
	EClass getAvailableTransmissionCapacity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity#getScheduleFor <em>Schedule For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule For</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AvailableTransmissionCapacity#getScheduleFor()
	 * @see #getAvailableTransmissionCapacity()
	 * @generated
	 */
	EReference getAvailableTransmissionCapacity_ScheduleFor();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine <em>Tie Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Line</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine
	 * @generated
	 */
	EClass getTieLine();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getDynamicEnergyTransaction <em>Dynamic Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Energy Transaction</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getDynamicEnergyTransaction()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_DynamicEnergyTransaction();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getCustomerConsumer <em>Customer Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Consumer</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getCustomerConsumer()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_CustomerConsumer();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_SubControlArea <em>Side ASub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side ASub Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_SubControlArea()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_SideA_SubControlArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_HostControlArea <em>Side BHost Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side BHost Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_HostControlArea()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_SideB_HostControlArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_SubControlArea <em>Side BSub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side BSub Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_SubControlArea()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_SideB_SubControlArea();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_HostControlArea <em>Side AHost Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side AHost Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_HostControlArea()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_SideA_HostControlArea();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getControlAreaOperators <em>Control Area Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Operators</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getControlAreaOperators()
	 * @see #getTieLine()
	 * @generated
	 */
	EReference getTieLine_ControlAreaOperators();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile <em>Energy Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Profile</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile
	 * @generated
	 */
	EClass getEnergyProfile();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getTransactionBid <em>Transaction Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction Bid</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getTransactionBid()
	 * @see #getEnergyProfile()
	 * @generated
	 */
	EReference getEnergyProfile_TransactionBid();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getEnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Transaction</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getEnergyTransaction()
	 * @see #getEnergyProfile()
	 * @generated
	 */
	EReference getEnergyProfile_EnergyTransaction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile <em>Curtailment Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curtailment Profile</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile
	 * @generated
	 */
	EClass getCurtailmentProfile();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile#getEnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Transaction</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile#getEnergyTransaction()
	 * @see #getCurtailmentProfile()
	 * @generated
	 */
	EReference getCurtailmentProfile_EnergyTransaction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea <em>Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Control Area</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea
	 * @generated
	 */
	EClass getHostControlArea();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSubControlAreas <em>Sub Control Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Control Areas</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSubControlAreas()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_SubControlAreas();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFrequencyBiasFactor <em>Frequency Bias Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Bias Factor</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFrequencyBiasFactor()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EAttribute getHostControlArea_FrequencyBiasFactor();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideA_TieLines <em>Side ATie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Side ATie Lines</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideA_TieLines()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_SideA_TieLines();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFreqSetPoint <em>Freq Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq Set Point</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFreqSetPoint()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EAttribute getHostControlArea_FreqSetPoint();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controls</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getControls()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_Controls();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getInadvertentAccounts <em>Inadvertent Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inadvertent Accounts</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getInadvertentAccounts()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_InadvertentAccounts();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideB_TieLines <em>Side BTie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Side BTie Lines</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideB_TieLines()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_SideB_TieLines();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getReceive_DynamicSchedules <em>Receive Dynamic Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive Dynamic Schedules</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getReceive_DynamicSchedules()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_Receive_DynamicSchedules();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaReserveSpec <em>Area Reserve Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area Reserve Spec</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaReserveSpec()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_AreaReserveSpec();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaControlMode <em>Area Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Control Mode</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaControlMode()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EAttribute getHostControlArea_AreaControlMode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSend_DynamicSchedules <em>Send Dynamic Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Dynamic Schedules</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSend_DynamicSchedules()
	 * @see #getHostControlArea()
	 * @generated
	 */
	EReference getHostControlArea_Send_DynamicSchedules();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode <em>Area Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Area Control Mode</em>'.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode
	 * @generated
	 */
	EEnum getAreaControlMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnergySchedulingFactory getEnergySchedulingFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.LossProfileImpl <em>Loss Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.LossProfileImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getLossProfile()
		 * @generated
		 */
		EClass LOSS_PROFILE = eINSTANCE.getLossProfile();

		/**
		 * The meta object literal for the '<em><b>Has Loss </b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOSS_PROFILE__HAS_LOSS_ = eINSTANCE.getLossProfile_HasLoss_();

		/**
		 * The meta object literal for the '<em><b>Energy Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOSS_PROFILE__ENERGY_TRANSACTION = eINSTANCE.getLossProfile_EnergyTransaction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl <em>Sub Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getSubControlArea()
		 * @generated
		 */
		EClass SUB_CONTROL_AREA = eINSTANCE.getSubControlArea();

		/**
		 * The meta object literal for the '<em><b>Side ATie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__SIDE_ATIE_LINES = eINSTANCE.getSubControlArea_SideA_TieLines();

		/**
		 * The meta object literal for the '<em><b>Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__GENERATING_UNITS = eINSTANCE.getSubControlArea_GeneratingUnits();

		/**
		 * The meta object literal for the '<em><b>Export Energy Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS = eINSTANCE.getSubControlArea_Export_EnergyTransactions();

		/**
		 * The meta object literal for the '<em><b>Import Energy Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS = eINSTANCE.getSubControlArea_Import_EnergyTransactions();

		/**
		 * The meta object literal for the '<em><b>Host Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__HOST_CONTROL_AREA = eINSTANCE.getSubControlArea_HostControlArea();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__PART_OF = eINSTANCE.getSubControlArea_PartOf();

		/**
		 * The meta object literal for the '<em><b>Flowgate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__FLOWGATE = eINSTANCE.getSubControlArea_Flowgate();

		/**
		 * The meta object literal for the '<em><b>Side BTie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONTROL_AREA__SIDE_BTIE_LINES = eINSTANCE.getSubControlArea_SideB_TieLines();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ReserveImpl <em>Reserve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.ReserveImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getReserve()
		 * @generated
		 */
		EClass RESERVE = eINSTANCE.getReserve();

		/**
		 * The meta object literal for the '<em><b>Area Reserve Spec</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE__AREA_RESERVE_SPEC = eINSTANCE.getReserve_AreaReserveSpec();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl <em>Energy Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergyTransaction()
		 * @generated
		 */
		EClass ENERGY_TRANSACTION = eINSTANCE.getEnergyTransaction();

		/**
		 * The meta object literal for the '<em><b>Energy Price Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__ENERGY_PRICE_CURVES = eINSTANCE.getEnergyTransaction_EnergyPriceCurves();

		/**
		 * The meta object literal for the '<em><b>Energy Trans Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__ENERGY_TRANS_ID = eINSTANCE.getEnergyTransaction_EnergyTransId();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__STATE = eINSTANCE.getEnergyTransaction_State();

		/**
		 * The meta object literal for the '<em><b>Firm Interchange Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG = eINSTANCE.getEnergyTransaction_FirmInterchangeFlag();

		/**
		 * The meta object literal for the '<em><b>Energy Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__ENERGY_PRODUCT = eINSTANCE.getEnergyTransaction_EnergyProduct();

		/**
		 * The meta object literal for the '<em><b>Delivery Point P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__DELIVERY_POINT_P = eINSTANCE.getEnergyTransaction_DeliveryPointP();

		/**
		 * The meta object literal for the '<em><b>Export Sub Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA = eINSTANCE.getEnergyTransaction_Export_SubControlArea();

		/**
		 * The meta object literal for the '<em><b>Import Sub Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA = eINSTANCE.getEnergyTransaction_Import_SubControlArea();

		/**
		 * The meta object literal for the '<em><b>Receipt Point P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__RECEIPT_POINT_P = eINSTANCE.getEnergyTransaction_ReceiptPointP();

		/**
		 * The meta object literal for the '<em><b>Congest Charge Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__CONGEST_CHARGE_MAX = eINSTANCE.getEnergyTransaction_CongestChargeMax();

		/**
		 * The meta object literal for the '<em><b>Energy Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__ENERGY_PROFILES = eINSTANCE.getEnergyTransaction_EnergyProfiles();

		/**
		 * The meta object literal for the '<em><b>Curtailment Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__CURTAILMENT_PROFILES = eINSTANCE.getEnergyTransaction_CurtailmentProfiles();

		/**
		 * The meta object literal for the '<em><b>Loss Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_TRANSACTION__LOSS_PROFILES = eINSTANCE.getEnergyTransaction_LossProfiles();

		/**
		 * The meta object literal for the '<em><b>Energy Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__ENERGY_MIN = eINSTANCE.getEnergyTransaction_EnergyMin();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_TRANSACTION__REASON = eINSTANCE.getEnergyTransaction_Reason();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Profile Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__PROFILE_DATAS = eINSTANCE.getProfile_ProfileDatas();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionRightOfWayImpl <em>Transmission Right Of Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionRightOfWayImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getTransmissionRightOfWay()
		 * @generated
		 */
		EClass TRANSMISSION_RIGHT_OF_WAY = eINSTANCE.getTransmissionRightOfWay();

		/**
		 * The meta object literal for the '<em><b>Transmission Corridor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR = eINSTANCE.getTransmissionRightOfWay_TransmissionCorridor();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_RIGHT_OF_WAY__LINES = eINSTANCE.getTransmissionRightOfWay_Lines();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicImpl <em>Dynamic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getDynamic()
		 * @generated
		 */
		EClass DYNAMIC = eINSTANCE.getDynamic();

		/**
		 * The meta object literal for the '<em><b>Tie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC__TIE_LINES = eINSTANCE.getDynamic_TieLines();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingVersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingVersionImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergySchedulingVersion()
		 * @generated
		 */
		EClass ENERGY_SCHEDULING_VERSION = eINSTANCE.getEnergySchedulingVersion();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SCHEDULING_VERSION__DATE = eINSTANCE.getEnergySchedulingVersion_Date();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_SCHEDULING_VERSION__VERSION = eINSTANCE.getEnergySchedulingVersion_Version();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl <em>Dynamic Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getDynamicSchedule()
		 * @generated
		 */
		EClass DYNAMIC_SCHEDULE = eINSTANCE.getDynamicSchedule();

		/**
		 * The meta object literal for the '<em><b>Dyn Sched Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_SCHEDULE__DYN_SCHED_STATUS = eINSTANCE.getDynamicSchedule_DynSchedStatus();

		/**
		 * The meta object literal for the '<em><b>Receive Host Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA = eINSTANCE.getDynamicSchedule_Receive_HostControlArea();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SCHEDULE__MEASUREMENT = eINSTANCE.getDynamicSchedule_Measurement();

		/**
		 * The meta object literal for the '<em><b>Send Host Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA = eINSTANCE.getDynamicSchedule_Send_HostControlArea();

		/**
		 * The meta object literal for the '<em><b>Dyn Sched Sign Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV = eINSTANCE.getDynamicSchedule_DynSchedSignRev();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl <em>Area Reserve Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getAreaReserveSpec()
		 * @generated
		 */
		EClass AREA_RESERVE_SPEC = eINSTANCE.getAreaReserveSpec();

		/**
		 * The meta object literal for the '<em><b>Raise Reg Margin Reqt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT = eINSTANCE.getAreaReserveSpec_RaiseRegMarginReqt();

		/**
		 * The meta object literal for the '<em><b>Reserve Energy Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION = eINSTANCE.getAreaReserveSpec_ReserveEnergyTransaction();

		/**
		 * The meta object literal for the '<em><b>Host Control Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_RESERVE_SPEC__HOST_CONTROL_AREAS = eINSTANCE.getAreaReserveSpec_HostControlAreas();

		/**
		 * The meta object literal for the '<em><b>Area Reserve Spec Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME = eINSTANCE.getAreaReserveSpec_AreaReserveSpecName();

		/**
		 * The meta object literal for the '<em><b>Op Reserve Reqt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESERVE_SPEC__OP_RESERVE_REQT = eINSTANCE.getAreaReserveSpec_OpReserveReqt();

		/**
		 * The meta object literal for the '<em><b>Lower Reg Margin Reqt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT = eINSTANCE.getAreaReserveSpec_LowerRegMarginReqt();

		/**
		 * The meta object literal for the '<em><b>Primary Reserve Reqt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT = eINSTANCE.getAreaReserveSpec_PrimaryReserveReqt();

		/**
		 * The meta object literal for the '<em><b>Spinning Reserve Reqt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT = eINSTANCE.getAreaReserveSpec_SpinningReserveReqt();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl <em>Profile Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getProfileData()
		 * @generated
		 */
		EClass PROFILE_DATA = eINSTANCE.getProfileData();

		/**
		 * The meta object literal for the '<em><b>Capacity Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_DATA__CAPACITY_LEVEL = eINSTANCE.getProfileData_CapacityLevel();

		/**
		 * The meta object literal for the '<em><b>Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_DATA__START_DATE_TIME = eINSTANCE.getProfileData_StartDateTime();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_DATA__SEQUENCE_NUMBER = eINSTANCE.getProfileData_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_DATA__PROFILE = eINSTANCE.getProfileData_Profile();

		/**
		 * The meta object literal for the '<em><b>Stop Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_DATA__STOP_DATE_TIME = eINSTANCE.getProfileData_StopDateTime();

		/**
		 * The meta object literal for the '<em><b>Energy Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_DATA__ENERGY_LEVEL = eINSTANCE.getProfileData_EnergyLevel();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl <em>Energy Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergyProduct()
		 * @generated
		 */
		EClass ENERGY_PRODUCT = eINSTANCE.getEnergyProduct();

		/**
		 * The meta object literal for the '<em><b>Generation Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRODUCT__GENERATION_PROVIDER = eINSTANCE.getEnergyProduct_GenerationProvider();

		/**
		 * The meta object literal for the '<em><b>Title Held By Marketer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER = eINSTANCE.getEnergyProduct_TitleHeldBy_Marketer();

		/**
		 * The meta object literal for the '<em><b>Energy Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRODUCT__ENERGY_TRANSACTIONS = eINSTANCE.getEnergyProduct_EnergyTransactions();

		/**
		 * The meta object literal for the '<em><b>Resold By Marketers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRODUCT__RESOLD_BY_MARKETERS = eINSTANCE.getEnergyProduct_ResoldBy_Marketers();

		/**
		 * The meta object literal for the '<em><b>Service Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRODUCT__SERVICE_POINT = eINSTANCE.getEnergyProduct_ServicePoint();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionCorridorImpl <em>Transmission Corridor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionCorridorImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getTransmissionCorridor()
		 * @generated
		 */
		EClass TRANSMISSION_CORRIDOR = eINSTANCE.getTransmissionCorridor();

		/**
		 * The meta object literal for the '<em><b>Transmission Right Of Ways</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS = eINSTANCE.getTransmissionCorridor_TransmissionRightOfWays();

		/**
		 * The meta object literal for the '<em><b>Contained In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_CORRIDOR__CONTAINED_IN = eINSTANCE.getTransmissionCorridor_ContainedIn();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.InadvertentAccountImpl <em>Inadvertent Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.InadvertentAccountImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getInadvertentAccount()
		 * @generated
		 */
		EClass INADVERTENT_ACCOUNT = eINSTANCE.getInadvertentAccount();

		/**
		 * The meta object literal for the '<em><b>Host Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INADVERTENT_ACCOUNT__HOST_CONTROL_AREA = eINSTANCE.getInadvertentAccount_HostControlArea();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AvailableTransmissionCapacityImpl <em>Available Transmission Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.AvailableTransmissionCapacityImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getAvailableTransmissionCapacity()
		 * @generated
		 */
		EClass AVAILABLE_TRANSMISSION_CAPACITY = eINSTANCE.getAvailableTransmissionCapacity();

		/**
		 * The meta object literal for the '<em><b>Schedule For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABLE_TRANSMISSION_CAPACITY__SCHEDULE_FOR = eINSTANCE.getAvailableTransmissionCapacity_ScheduleFor();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl <em>Tie Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getTieLine()
		 * @generated
		 */
		EClass TIE_LINE = eINSTANCE.getTieLine();

		/**
		 * The meta object literal for the '<em><b>Dynamic Energy Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__DYNAMIC_ENERGY_TRANSACTION = eINSTANCE.getTieLine_DynamicEnergyTransaction();

		/**
		 * The meta object literal for the '<em><b>Customer Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__CUSTOMER_CONSUMER = eINSTANCE.getTieLine_CustomerConsumer();

		/**
		 * The meta object literal for the '<em><b>Side ASub Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__SIDE_ASUB_CONTROL_AREA = eINSTANCE.getTieLine_SideA_SubControlArea();

		/**
		 * The meta object literal for the '<em><b>Side BHost Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__SIDE_BHOST_CONTROL_AREA = eINSTANCE.getTieLine_SideB_HostControlArea();

		/**
		 * The meta object literal for the '<em><b>Side BSub Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__SIDE_BSUB_CONTROL_AREA = eINSTANCE.getTieLine_SideB_SubControlArea();

		/**
		 * The meta object literal for the '<em><b>Side AHost Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__SIDE_AHOST_CONTROL_AREA = eINSTANCE.getTieLine_SideA_HostControlArea();

		/**
		 * The meta object literal for the '<em><b>Control Area Operators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_LINE__CONTROL_AREA_OPERATORS = eINSTANCE.getTieLine_ControlAreaOperators();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProfileImpl <em>Energy Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProfileImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getEnergyProfile()
		 * @generated
		 */
		EClass ENERGY_PROFILE = eINSTANCE.getEnergyProfile();

		/**
		 * The meta object literal for the '<em><b>Transaction Bid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PROFILE__TRANSACTION_BID = eINSTANCE.getEnergyProfile_TransactionBid();

		/**
		 * The meta object literal for the '<em><b>Energy Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PROFILE__ENERGY_TRANSACTION = eINSTANCE.getEnergyProfile_EnergyTransaction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.BlockImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.CurtailmentProfileImpl <em>Curtailment Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.CurtailmentProfileImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getCurtailmentProfile()
		 * @generated
		 */
		EClass CURTAILMENT_PROFILE = eINSTANCE.getCurtailmentProfile();

		/**
		 * The meta object literal for the '<em><b>Energy Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURTAILMENT_PROFILE__ENERGY_TRANSACTION = eINSTANCE.getCurtailmentProfile_EnergyTransaction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl <em>Host Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getHostControlArea()
		 * @generated
		 */
		EClass HOST_CONTROL_AREA = eINSTANCE.getHostControlArea();

		/**
		 * The meta object literal for the '<em><b>Sub Control Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__SUB_CONTROL_AREAS = eINSTANCE.getHostControlArea_SubControlAreas();

		/**
		 * The meta object literal for the '<em><b>Frequency Bias Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR = eINSTANCE.getHostControlArea_FrequencyBiasFactor();

		/**
		 * The meta object literal for the '<em><b>Side ATie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__SIDE_ATIE_LINES = eINSTANCE.getHostControlArea_SideA_TieLines();

		/**
		 * The meta object literal for the '<em><b>Freq Set Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_CONTROL_AREA__FREQ_SET_POINT = eINSTANCE.getHostControlArea_FreqSetPoint();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__CONTROLS = eINSTANCE.getHostControlArea_Controls();

		/**
		 * The meta object literal for the '<em><b>Inadvertent Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS = eINSTANCE.getHostControlArea_InadvertentAccounts();

		/**
		 * The meta object literal for the '<em><b>Side BTie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__SIDE_BTIE_LINES = eINSTANCE.getHostControlArea_SideB_TieLines();

		/**
		 * The meta object literal for the '<em><b>Receive Dynamic Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES = eINSTANCE.getHostControlArea_Receive_DynamicSchedules();

		/**
		 * The meta object literal for the '<em><b>Area Reserve Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__AREA_RESERVE_SPEC = eINSTANCE.getHostControlArea_AreaReserveSpec();

		/**
		 * The meta object literal for the '<em><b>Area Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_CONTROL_AREA__AREA_CONTROL_MODE = eINSTANCE.getHostControlArea_AreaControlMode();

		/**
		 * The meta object literal for the '<em><b>Send Dynamic Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES = eINSTANCE.getHostControlArea_Send_DynamicSchedules();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode <em>Area Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode
		 * @see CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl#getAreaControlMode()
		 * @generated
		 */
		EEnum AREA_CONTROL_MODE = eINSTANCE.getAreaControlMode();

	}

} //EnergySchedulingPackage
