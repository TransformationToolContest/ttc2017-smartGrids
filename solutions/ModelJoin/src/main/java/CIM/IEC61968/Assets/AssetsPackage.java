/**
 */
package CIM.IEC61968.Assets;

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
 * @see CIM.IEC61968.Assets.AssetsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package contains the core information classes that support asset management applications with specialized classes for asset-level models for objects (as opposed to power system resource models, mainly defined in IEC61970::Wires package).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package contains the core information classes that support asset management applications with specialized classes for asset-level models for objects (as opposed to power system resource models, mainly defined in IEC61970::Wires package).'"
 * @generated
 */
public interface AssetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Assets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Assets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimAssets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssetsPackage eINSTANCE = CIM.IEC61968.Assets.impl.AssetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.impl.AcceptanceTestImpl <em>Acceptance Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.impl.AcceptanceTestImpl
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAcceptanceTest()
	 * @generated
	 */
	int ACCEPTANCE_TEST = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__SUCCESS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__TYPE = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.impl.SealImpl <em>Seal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.impl.SealImpl
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getSeal()
	 * @generated
	 */
	int SEAL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__CONDITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__SEAL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applied Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__APPLIED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL__ASSET_CONTAINER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Seal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Seal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.impl.AssetImpl
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_PROPERTY_CURVES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__SERIAL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__FINANCIAL_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__FROM_ASSET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ACTIVITY_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_CONTAINER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CRITICAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ERP_INVENTORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__RELIABILITY_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MANUFACTURED_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LOT_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__SCHEDULED_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__INITIAL_LOSS_OF_LIFE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_FUNCTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__INITIAL_CONDITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__UTC_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__INSTALLATION_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__RATINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MEDIUMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROPERTIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CORPORATE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PURCHASE_PRICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__TO_ASSET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__APPLICATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ERP_ITEM_MASTER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ACCEPTANCE_TEST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ERP_REC_DELIVERY_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 37;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 38;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.impl.ComMediaAssetImpl <em>Com Media Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.impl.ComMediaAssetImpl
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getComMediaAsset()
	 * @generated
	 */
	int COM_MEDIA_ASSET = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__UUID = ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__MRID = ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__PATH_NAME = ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__MODELING_AUTHORITY_SET = ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__LOCAL_NAME = ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ALIAS_NAME = ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ASSET_PROPERTY_CURVES = ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__SERIAL_NUMBER = ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__MEASUREMENTS = ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__FINANCIAL_INFO = ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__FROM_ASSET_ROLES = ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ACTIVITY_RECORDS = ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__DOCUMENT_ROLES = ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ASSET_CONTAINER = ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__CRITICAL = ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ERP_INVENTORY = ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__RELIABILITY_INFOS = ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__MANUFACTURED_DATE = ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__WORK_TASK = ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__LOT_NUMBER = ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ELECTRONIC_ADDRESS = ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__SCHEDULED_EVENTS = ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__CHANGE_ITEMS = ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__INITIAL_LOSS_OF_LIFE = ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ASSET_FUNCTIONS = ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__INITIAL_CONDITION = ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__UTC_NUMBER = ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__INSTALLATION_DATE = ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ERP_ORGANISATION_ROLES = ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__RATINGS = ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__MEDIUMS = ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ASSET_INFO = ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__CORPORATE_CODE = ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__PURCHASE_PRICE = ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__TO_ASSET_ROLES = ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__LOCATION = ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__APPLICATION = ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__POWER_SYSTEM_RESOURCES = ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__CATEGORY = ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ERP_ITEM_MASTER = ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ACCEPTANCE_TEST = ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET__ERP_REC_DELIVERY_ITEMS = ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The number of structural features of the '<em>Com Media Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Media Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_MEDIA_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl <em>Asset Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.impl.AssetFunctionImpl
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAssetFunction()
	 * @generated
	 */
	int ASSET_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__HARDWARE_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__PROGRAM_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__FIRMWARE_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__PASSWORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION__CONFIG_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Asset Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Asset Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FUNCTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.impl.AssetContainerImpl <em>Asset Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.impl.AssetContainerImpl
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAssetContainer()
	 * @generated
	 */
	int ASSET_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__UUID = ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__MRID = ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__PATH_NAME = ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__MODELING_AUTHORITY_SET = ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__LOCAL_NAME = ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ALIAS_NAME = ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ASSET_PROPERTY_CURVES = ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__SERIAL_NUMBER = ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__MEASUREMENTS = ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__FINANCIAL_INFO = ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__FROM_ASSET_ROLES = ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ACTIVITY_RECORDS = ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__DOCUMENT_ROLES = ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ASSET_CONTAINER = ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__CRITICAL = ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ERP_INVENTORY = ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__RELIABILITY_INFOS = ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__MANUFACTURED_DATE = ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__WORK_TASK = ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__LOT_NUMBER = ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ELECTRONIC_ADDRESS = ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__SCHEDULED_EVENTS = ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__CHANGE_ITEMS = ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE = ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ASSET_FUNCTIONS = ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__INITIAL_CONDITION = ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__UTC_NUMBER = ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__INSTALLATION_DATE = ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ERP_ORGANISATION_ROLES = ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__RATINGS = ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__MEDIUMS = ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ASSET_INFO = ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__CORPORATE_CODE = ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__PURCHASE_PRICE = ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__TO_ASSET_ROLES = ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__LOCATION = ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__APPLICATION = ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__POWER_SYSTEM_RESOURCES = ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__CATEGORY = ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ERP_ITEM_MASTER = ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ACCEPTANCE_TEST = ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS = ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__LAND_PROPERTIES = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__ASSETS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER__SEALS = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_CONTAINER_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.SealConditionKind <em>Seal Condition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.SealConditionKind
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getSealConditionKind()
	 * @generated
	 */
	int SEAL_CONDITION_KIND = 6;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Assets.SealKind <em>Seal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Assets.SealKind
	 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getSealKind()
	 * @generated
	 */
	int SEAL_KIND = 7;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Assets.AcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Test</em>'.
	 * @see CIM.IEC61968.Assets.AcceptanceTest
	 * @generated
	 */
	EClass getAcceptanceTest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AcceptanceTest#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61968.Assets.AcceptanceTest#getDateTime()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	EAttribute getAcceptanceTest_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AcceptanceTest#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see CIM.IEC61968.Assets.AcceptanceTest#isSuccess()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	EAttribute getAcceptanceTest_Success();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AcceptanceTest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM.IEC61968.Assets.AcceptanceTest#getType()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	EAttribute getAcceptanceTest_Type();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Assets.Seal <em>Seal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seal</em>'.
	 * @see CIM.IEC61968.Assets.Seal
	 * @generated
	 */
	EClass getSeal();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Seal#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see CIM.IEC61968.Assets.Seal#getCondition()
	 * @see #getSeal()
	 * @generated
	 */
	EAttribute getSeal_Condition();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seal Number</em>'.
	 * @see CIM.IEC61968.Assets.Seal#getSealNumber()
	 * @see #getSeal()
	 * @generated
	 */
	EAttribute getSeal_SealNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applied Date Time</em>'.
	 * @see CIM.IEC61968.Assets.Seal#getAppliedDateTime()
	 * @see #getSeal()
	 * @generated
	 */
	EAttribute getSeal_AppliedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Seal#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61968.Assets.Seal#getKind()
	 * @see #getSeal()
	 * @generated
	 */
	EAttribute getSeal_Kind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Container</em>'.
	 * @see CIM.IEC61968.Assets.Seal#getAssetContainer()
	 * @see #getSeal()
	 * @generated
	 */
	EReference getSeal_AssetContainer();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Assets.ComMediaAsset <em>Com Media Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Media Asset</em>'.
	 * @see CIM.IEC61968.Assets.ComMediaAsset
	 * @generated
	 */
	EClass getComMediaAsset();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Assets.AssetFunction <em>Asset Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Function</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction
	 * @generated
	 */
	EClass getAssetFunction();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware ID</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction#getHardwareID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	EAttribute getAssetFunction_HardwareID();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program ID</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction#getProgramID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	EAttribute getAssetFunction_ProgramID();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware ID</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction#getFirmwareID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	EAttribute getAssetFunction_FirmwareID();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction#getAsset()
	 * @see #getAssetFunction()
	 * @generated
	 */
	EReference getAssetFunction_Asset();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction#getPassword()
	 * @see #getAssetFunction()
	 * @generated
	 */
	EAttribute getAssetFunction_Password();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config ID</em>'.
	 * @see CIM.IEC61968.Assets.AssetFunction#getConfigID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	EAttribute getAssetFunction_ConfigID();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Assets.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see CIM.IEC61968.Assets.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getAssetPropertyCurves <em>Asset Property Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Property Curves</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getAssetPropertyCurves()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AssetPropertyCurves();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getSerialNumber()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_SerialNumber();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getMeasurements()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Measurements();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Financial Info</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getFinancialInfo()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_FinancialInfo();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getFromAssetRoles <em>From Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Asset Roles</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getFromAssetRoles()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_FromAssetRoles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getActivityRecords()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ActivityRecords();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getDocumentRoles()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_DocumentRoles();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Container</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getAssetContainer()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AssetContainer();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see CIM.IEC61968.Assets.Asset#isCritical()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Critical();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getErpInventory <em>Erp Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Inventory</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getErpInventory()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ErpInventory();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reliability Infos</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getReliabilityInfos()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ReliabilityInfos();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufactured Date</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getManufacturedDate()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_ManufacturedDate();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getWorkTask()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_WorkTask();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot Number</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getLotNumber()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_LotNumber();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Address</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getElectronicAddress()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ElectronicAddress();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Events</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getScheduledEvents()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ScheduledEvents();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getChangeItems()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ChangeItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Loss Of Life</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getInitialLossOfLife()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_InitialLossOfLife();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getAssetFunctions <em>Asset Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Functions</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getAssetFunctions()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AssetFunctions();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getStatus()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Condition</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getInitialCondition()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_InitialCondition();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utc Number</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getUtcNumber()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_UtcNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Date</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getInstallationDate()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_InstallationDate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getErpOrganisationRoles()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ErpOrganisationRoles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ratings</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getRatings()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Ratings();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getMediums <em>Mediums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mediums</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getMediums()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Mediums();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getProperties()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Properties();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Info</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getAssetInfo()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AssetInfo();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getCorporateCode()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_CorporateCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Price</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getPurchasePrice()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_PurchasePrice();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getToAssetRoles <em>To Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Asset Roles</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getToAssetRoles()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ToAssetRoles();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getLocation()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Location();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getApplication()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Application();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getPowerSystemResources()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_PowerSystemResources();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Assets.Asset#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getCategory()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Category();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getErpItemMaster <em>Erp Item Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Item Master</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getErpItemMaster()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ErpItemMaster();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Assets.Asset#getAcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acceptance Test</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getAcceptanceTest()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AcceptanceTest();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.Asset#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Delivery Items</em>'.
	 * @see CIM.IEC61968.Assets.Asset#getErpRecDeliveryItems()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ErpRecDeliveryItems();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Assets.AssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Container</em>'.
	 * @see CIM.IEC61968.Assets.AssetContainer
	 * @generated
	 */
	EClass getAssetContainer();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.AssetContainer#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Properties</em>'.
	 * @see CIM.IEC61968.Assets.AssetContainer#getLandProperties()
	 * @see #getAssetContainer()
	 * @generated
	 */
	EReference getAssetContainer_LandProperties();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.AssetContainer#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM.IEC61968.Assets.AssetContainer#getAssets()
	 * @see #getAssetContainer()
	 * @generated
	 */
	EReference getAssetContainer_Assets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Assets.AssetContainer#getSeals <em>Seals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seals</em>'.
	 * @see CIM.IEC61968.Assets.AssetContainer#getSeals()
	 * @see #getAssetContainer()
	 * @generated
	 */
	EReference getAssetContainer_Seals();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.Assets.SealConditionKind <em>Seal Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seal Condition Kind</em>'.
	 * @see CIM.IEC61968.Assets.SealConditionKind
	 * @generated
	 */
	EEnum getSealConditionKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.Assets.SealKind <em>Seal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seal Kind</em>'.
	 * @see CIM.IEC61968.Assets.SealKind
	 * @generated
	 */
	EEnum getSealKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssetsFactory getAssetsFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.impl.AcceptanceTestImpl <em>Acceptance Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.impl.AcceptanceTestImpl
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAcceptanceTest()
		 * @generated
		 */
		EClass ACCEPTANCE_TEST = eINSTANCE.getAcceptanceTest();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_TEST__DATE_TIME = eINSTANCE.getAcceptanceTest_DateTime();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_TEST__SUCCESS = eINSTANCE.getAcceptanceTest_Success();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_TEST__TYPE = eINSTANCE.getAcceptanceTest_Type();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.impl.SealImpl <em>Seal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.impl.SealImpl
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getSeal()
		 * @generated
		 */
		EClass SEAL = eINSTANCE.getSeal();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAL__CONDITION = eINSTANCE.getSeal_Condition();

		/**
		 * The meta object literal for the '<em><b>Seal Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAL__SEAL_NUMBER = eINSTANCE.getSeal_SealNumber();

		/**
		 * The meta object literal for the '<em><b>Applied Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAL__APPLIED_DATE_TIME = eINSTANCE.getSeal_AppliedDateTime();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAL__KIND = eINSTANCE.getSeal_Kind();

		/**
		 * The meta object literal for the '<em><b>Asset Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAL__ASSET_CONTAINER = eINSTANCE.getSeal_AssetContainer();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.impl.ComMediaAssetImpl <em>Com Media Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.impl.ComMediaAssetImpl
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getComMediaAsset()
		 * @generated
		 */
		EClass COM_MEDIA_ASSET = eINSTANCE.getComMediaAsset();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl <em>Asset Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.impl.AssetFunctionImpl
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAssetFunction()
		 * @generated
		 */
		EClass ASSET_FUNCTION = eINSTANCE.getAssetFunction();

		/**
		 * The meta object literal for the '<em><b>Hardware ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_FUNCTION__HARDWARE_ID = eINSTANCE.getAssetFunction_HardwareID();

		/**
		 * The meta object literal for the '<em><b>Program ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_FUNCTION__PROGRAM_ID = eINSTANCE.getAssetFunction_ProgramID();

		/**
		 * The meta object literal for the '<em><b>Firmware ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_FUNCTION__FIRMWARE_ID = eINSTANCE.getAssetFunction_FirmwareID();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_FUNCTION__ASSET = eINSTANCE.getAssetFunction_Asset();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_FUNCTION__PASSWORD = eINSTANCE.getAssetFunction_Password();

		/**
		 * The meta object literal for the '<em><b>Config ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_FUNCTION__CONFIG_ID = eINSTANCE.getAssetFunction_ConfigID();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.impl.AssetImpl
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Asset Property Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSET_PROPERTY_CURVES = eINSTANCE.getAsset_AssetPropertyCurves();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__SERIAL_NUMBER = eINSTANCE.getAsset_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__MEASUREMENTS = eINSTANCE.getAsset_Measurements();

		/**
		 * The meta object literal for the '<em><b>Financial Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__FINANCIAL_INFO = eINSTANCE.getAsset_FinancialInfo();

		/**
		 * The meta object literal for the '<em><b>From Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__FROM_ASSET_ROLES = eINSTANCE.getAsset_FromAssetRoles();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ACTIVITY_RECORDS = eINSTANCE.getAsset_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__DOCUMENT_ROLES = eINSTANCE.getAsset_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Asset Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSET_CONTAINER = eINSTANCE.getAsset_AssetContainer();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__CRITICAL = eINSTANCE.getAsset_Critical();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ERP_INVENTORY = eINSTANCE.getAsset_ErpInventory();

		/**
		 * The meta object literal for the '<em><b>Reliability Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__RELIABILITY_INFOS = eINSTANCE.getAsset_ReliabilityInfos();

		/**
		 * The meta object literal for the '<em><b>Manufactured Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__MANUFACTURED_DATE = eINSTANCE.getAsset_ManufacturedDate();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__WORK_TASK = eINSTANCE.getAsset_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Lot Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__LOT_NUMBER = eINSTANCE.getAsset_LotNumber();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ELECTRONIC_ADDRESS = eINSTANCE.getAsset_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__SCHEDULED_EVENTS = eINSTANCE.getAsset_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CHANGE_ITEMS = eINSTANCE.getAsset_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Initial Loss Of Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__INITIAL_LOSS_OF_LIFE = eINSTANCE.getAsset_InitialLossOfLife();

		/**
		 * The meta object literal for the '<em><b>Asset Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSET_FUNCTIONS = eINSTANCE.getAsset_AssetFunctions();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__STATUS = eINSTANCE.getAsset_Status();

		/**
		 * The meta object literal for the '<em><b>Initial Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__INITIAL_CONDITION = eINSTANCE.getAsset_InitialCondition();

		/**
		 * The meta object literal for the '<em><b>Utc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__UTC_NUMBER = eINSTANCE.getAsset_UtcNumber();

		/**
		 * The meta object literal for the '<em><b>Installation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__INSTALLATION_DATE = eINSTANCE.getAsset_InstallationDate();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ERP_ORGANISATION_ROLES = eINSTANCE.getAsset_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Ratings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__RATINGS = eINSTANCE.getAsset_Ratings();

		/**
		 * The meta object literal for the '<em><b>Mediums</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__MEDIUMS = eINSTANCE.getAsset_Mediums();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROPERTIES = eINSTANCE.getAsset_Properties();

		/**
		 * The meta object literal for the '<em><b>Asset Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSET_INFO = eINSTANCE.getAsset_AssetInfo();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__CORPORATE_CODE = eINSTANCE.getAsset_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Purchase Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__PURCHASE_PRICE = eINSTANCE.getAsset_PurchasePrice();

		/**
		 * The meta object literal for the '<em><b>To Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__TO_ASSET_ROLES = eINSTANCE.getAsset_ToAssetRoles();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__LOCATION = eINSTANCE.getAsset_Location();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__APPLICATION = eINSTANCE.getAsset_Application();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__POWER_SYSTEM_RESOURCES = eINSTANCE.getAsset_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__CATEGORY = eINSTANCE.getAsset_Category();

		/**
		 * The meta object literal for the '<em><b>Erp Item Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ERP_ITEM_MASTER = eINSTANCE.getAsset_ErpItemMaster();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ACCEPTANCE_TEST = eINSTANCE.getAsset_AcceptanceTest();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delivery Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ERP_REC_DELIVERY_ITEMS = eINSTANCE.getAsset_ErpRecDeliveryItems();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.impl.AssetContainerImpl <em>Asset Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.impl.AssetContainerImpl
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getAssetContainer()
		 * @generated
		 */
		EClass ASSET_CONTAINER = eINSTANCE.getAssetContainer();

		/**
		 * The meta object literal for the '<em><b>Land Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_CONTAINER__LAND_PROPERTIES = eINSTANCE.getAssetContainer_LandProperties();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_CONTAINER__ASSETS = eINSTANCE.getAssetContainer_Assets();

		/**
		 * The meta object literal for the '<em><b>Seals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_CONTAINER__SEALS = eINSTANCE.getAssetContainer_Seals();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.SealConditionKind <em>Seal Condition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.SealConditionKind
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getSealConditionKind()
		 * @generated
		 */
		EEnum SEAL_CONDITION_KIND = eINSTANCE.getSealConditionKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Assets.SealKind <em>Seal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Assets.SealKind
		 * @see CIM.IEC61968.Assets.impl.AssetsPackageImpl#getSealKind()
		 * @generated
		 */
		EEnum SEAL_KIND = eINSTANCE.getSealKind();

	}

} //AssetsPackage
