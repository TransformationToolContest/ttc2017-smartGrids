/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

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
 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsFactory
 * @model kind="package"
 * @generated
 */
public interface InfAssetModelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfAssetModels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfAssetModels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfAssetModels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfAssetModelsPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.ElectricalAssetModelImpl <em>Electrical Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.ElectricalAssetModelImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getElectricalAssetModel()
	 * @generated
	 */
	int ELECTRICAL_ASSET_MODEL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__UUID = AssetModelsPackage.ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__MRID = AssetModelsPackage.ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__NAME = AssetModelsPackage.ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__DESCRIPTION = AssetModelsPackage.ASSET_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__PATH_NAME = AssetModelsPackage.ASSET_MODEL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__MODELING_AUTHORITY_SET = AssetModelsPackage.ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__LOCAL_NAME = AssetModelsPackage.ASSET_MODEL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__ALIAS_NAME = AssetModelsPackage.ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__MODEL_VERSION = AssetModelsPackage.ASSET_MODEL__MODEL_VERSION;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__ASSET_INFO = AssetModelsPackage.ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__MODEL_NUMBER = AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__TYPE_ASSET = AssetModelsPackage.ASSET_MODEL__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__CORPORATE_STANDARD_KIND = AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__ERP_INVENTORY_COUNTS = AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__USAGE_KIND = AssetModelsPackage.ASSET_MODEL__USAGE_KIND;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__WEIGHT_TOTAL = AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL;

	/**
	 * The feature id for the '<em><b>Electrical Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL__ELECTRICAL_INFOS = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electrical Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL_FEATURE_COUNT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Electrical Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_MODEL_OPERATION_COUNT = AssetModelsPackage.ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl <em>Meter Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getMeterAssetModel()
	 * @generated
	 */
	int METER_ASSET_MODEL = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__UUID = ELECTRICAL_ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__MRID = ELECTRICAL_ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__NAME = ELECTRICAL_ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__DESCRIPTION = ELECTRICAL_ASSET_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__PATH_NAME = ELECTRICAL_ASSET_MODEL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__MODELING_AUTHORITY_SET = ELECTRICAL_ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__LOCAL_NAME = ELECTRICAL_ASSET_MODEL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__ALIAS_NAME = ELECTRICAL_ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__MODEL_VERSION = ELECTRICAL_ASSET_MODEL__MODEL_VERSION;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__ASSET_INFO = ELECTRICAL_ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__MODEL_NUMBER = ELECTRICAL_ASSET_MODEL__MODEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = ELECTRICAL_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__TYPE_ASSET = ELECTRICAL_ASSET_MODEL__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__CORPORATE_STANDARD_KIND = ELECTRICAL_ASSET_MODEL__CORPORATE_STANDARD_KIND;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__ERP_INVENTORY_COUNTS = ELECTRICAL_ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__USAGE_KIND = ELECTRICAL_ASSET_MODEL__USAGE_KIND;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__WEIGHT_TOTAL = ELECTRICAL_ASSET_MODEL__WEIGHT_TOTAL;

	/**
	 * The feature id for the '<em><b>Electrical Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__ELECTRICAL_INFOS = ELECTRICAL_ASSET_MODEL__ELECTRICAL_INFOS;

	/**
	 * The feature id for the '<em><b>KH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__KH = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval Data Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__INTERVAL_DATA_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Register Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__MAX_REGISTER_COUNT = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meter Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__METER_ASSETS = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>KV Ah Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__KV_AH_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__WIRE_COUNT = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Of Use Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__TIME_OF_USE_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Demand Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__DEMAND_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reactive Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__REACTIVE_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__FORM = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Register Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__REGISTER_RATIO = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Kwh Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__KWH_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>QMeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__QMETER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Load Profile Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL__LOAD_PROFILE_METER = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Meter Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL_FEATURE_COUNT = ELECTRICAL_ASSET_MODEL_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Meter Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MODEL_OPERATION_COUNT = ELECTRICAL_ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl <em>Tap Changer Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTapChangerAssetModel()
	 * @generated
	 */
	int TAP_CHANGER_ASSET_MODEL = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__UUID = AssetModelsPackage.ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__MRID = AssetModelsPackage.ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__NAME = AssetModelsPackage.ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__DESCRIPTION = AssetModelsPackage.ASSET_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__PATH_NAME = AssetModelsPackage.ASSET_MODEL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__MODELING_AUTHORITY_SET = AssetModelsPackage.ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__LOCAL_NAME = AssetModelsPackage.ASSET_MODEL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__ALIAS_NAME = AssetModelsPackage.ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__MODEL_VERSION = AssetModelsPackage.ASSET_MODEL__MODEL_VERSION;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__ASSET_INFO = AssetModelsPackage.ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__MODEL_NUMBER = AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__TYPE_ASSET = AssetModelsPackage.ASSET_MODEL__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__CORPORATE_STANDARD_KIND = AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__ERP_INVENTORY_COUNTS = AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__USAGE_KIND = AssetModelsPackage.ASSET_MODEL__USAGE_KIND;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__WEIGHT_TOTAL = AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__FREQUENCY = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__HIGH_STEP = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__RATED_CURRENT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__PHASE_COUNT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tap Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__TAP_COUNT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tap Changer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__LOW_STEP = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Switching Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Step Phase Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL__BIL = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Tap Changer Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL_FEATURE_COUNT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Tap Changer Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_MODEL_OPERATION_COUNT = AssetModelsPackage.ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueImpl <em>Asset Model Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getAssetModelCatalogue()
	 * @generated
	 */
	int ASSET_MODEL_CATALOGUE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Model Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Model Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl <em>Transformer Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerAssetModel()
	 * @generated
	 */
	int TRANSFORMER_ASSET_MODEL = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__UUID = AssetModelsPackage.ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__MRID = AssetModelsPackage.ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__NAME = AssetModelsPackage.ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__DESCRIPTION = AssetModelsPackage.ASSET_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__PATH_NAME = AssetModelsPackage.ASSET_MODEL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__MODELING_AUTHORITY_SET = AssetModelsPackage.ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__LOCAL_NAME = AssetModelsPackage.ASSET_MODEL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__ALIAS_NAME = AssetModelsPackage.ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__MODEL_VERSION = AssetModelsPackage.ASSET_MODEL__MODEL_VERSION;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__ASSET_INFO = AssetModelsPackage.ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__MODEL_NUMBER = AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__TYPE_ASSET = AssetModelsPackage.ASSET_MODEL__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__CORPORATE_STANDARD_KIND = AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__ERP_INVENTORY_COUNTS = AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__USAGE_KIND = AssetModelsPackage.ASSET_MODEL__USAGE_KIND;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__WEIGHT_TOTAL = AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL;

	/**
	 * The feature id for the '<em><b>Hour Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Oil Preservation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Coils Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Winding Insulation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alt Secondary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Solid Insulation Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Neutral BIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Core Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__CORE_KIND = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Day Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__FUNCTION = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Auto Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Transformer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Alt Primary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reconfig Winding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Transformer Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL_FEATURE_COUNT = AssetModelsPackage.ASSET_MODEL_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Transformer Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_MODEL_OPERATION_COUNT = AssetModelsPackage.ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl <em>Asset Model Catalogue Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getAssetModelCatalogueItem()
	 * @generated
	 */
	int ASSET_MODEL_CATALOGUE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Asset Model Catalogue Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Asset Model Catalogue Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_CATALOGUE_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind <em>Transformer Construction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerConstructionKind()
	 * @generated
	 */
	int TRANSFORMER_CONSTRUCTION_KIND = 6;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind <em>Winding Insulation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getWindingInsulationKind()
	 * @generated
	 */
	int WINDING_INSULATION_KIND = 7;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind <em>Oil Preservation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getOilPreservationKind()
	 * @generated
	 */
	int OIL_PRESERVATION_KIND = 8;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind <em>Tap Changer Switching Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTapChangerSwitchingKind()
	 * @generated
	 */
	int TAP_CHANGER_SWITCHING_KIND = 9;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.CableShieldKind <em>Cable Shield Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.CableShieldKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getCableShieldKind()
	 * @generated
	 */
	int CABLE_SHIELD_KIND = 10;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind <em>Transformer Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerFunctionKind()
	 * @generated
	 */
	int TRANSFORMER_FUNCTION_KIND = 11;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind <em>Transformer Core Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerCoreKind()
	 * @generated
	 */
	int TRANSFORMER_CORE_KIND = 12;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel <em>Meter Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel
	 * @generated
	 */
	EClass getMeterAssetModel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getKH <em>KH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KH</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getKH()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_KH();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isIntervalDataMeter <em>Interval Data Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Data Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isIntervalDataMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_IntervalDataMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMaxRegisterCount <em>Max Register Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Register Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMaxRegisterCount()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_MaxRegisterCount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMeterAssets <em>Meter Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMeterAssets()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EReference getMeterAssetModel_MeterAssets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKVAhMeter <em>KV Ah Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KV Ah Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKVAhMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_KVAhMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getWireCount <em>Wire Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wire Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getWireCount()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_WireCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isTimeOfUseMeter <em>Time Of Use Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Of Use Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isTimeOfUseMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_TimeOfUseMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isDemandMeter <em>Demand Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demand Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isDemandMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_DemandMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isReactiveMeter <em>Reactive Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isReactiveMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_ReactiveMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getForm()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_Form();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getRegisterRatio <em>Register Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getRegisterRatio()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_RegisterRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKwhMeter <em>Kwh Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kwh Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKwhMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_KwhMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isQMeter <em>QMeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QMeter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isQMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_QMeter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isLoadProfileMeter <em>Load Profile Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Profile Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isLoadProfileMeter()
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	EAttribute getMeterAssetModel_LoadProfileMeter();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel <em>Electrical Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel
	 * @generated
	 */
	EClass getElectricalAssetModel();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel#getElectricalInfos <em>Electrical Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel#getElectricalInfos()
	 * @see #getElectricalAssetModel()
	 * @generated
	 */
	EReference getElectricalAssetModel_ElectricalInfos();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel <em>Tap Changer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel
	 * @generated
	 */
	EClass getTapChangerAssetModel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getFrequency()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedVoltage()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_RatedVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getHighStep <em>High Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getHighStep()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_HighStep();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedCurrent()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_RatedCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getPhaseCount()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_PhaseCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapCount <em>Tap Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tap Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapCount()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_TapCount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapChangerAssets <em>Tap Changer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changer Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapChangerAssets()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EReference getTapChangerAssetModel_TapChangerAssets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedApparentPower <em>Rated Apparent Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Apparent Power</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedApparentPower()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_RatedApparentPower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getNeutralStep <em>Neutral Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getNeutralStep()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_NeutralStep();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getLowStep <em>Low Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Step</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getLowStep()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_LowStep();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getInitialDelay <em>Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Delay</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getInitialDelay()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_InitialDelay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepVoltageIncrement <em>Step Voltage Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Voltage Increment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepVoltageIncrement()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_StepVoltageIncrement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSwitchingKind <em>Switching Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switching Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSwitchingKind()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_SwitchingKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSubsequentDelay <em>Subsequent Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subsequent Delay</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSubsequentDelay()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_SubsequentDelay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepPhaseIncrement <em>Step Phase Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Phase Increment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepPhaseIncrement()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_StepPhaseIncrement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getBil <em>Bil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bil</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getBil()
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	EAttribute getTapChangerAssetModel_Bil();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Model Catalogue</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue
	 * @generated
	 */
	EClass getAssetModelCatalogue();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Model Catalogue Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems()
	 * @see #getAssetModelCatalogue()
	 * @generated
	 */
	EReference getAssetModelCatalogue_AssetModelCatalogueItems();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus()
	 * @see #getAssetModelCatalogue()
	 * @generated
	 */
	EReference getAssetModelCatalogue_Status();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel
	 * @generated
	 */
	EClass getTransformerAssetModel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour Over Load Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_HourOverLoadRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Preservation Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_OilPreservationKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Coils Weight</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_CoreCoilsWeight();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Insulation Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_WindingInsulationKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Secondary Nom Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_AltSecondaryNomVoltage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EReference getTransformerAssetModel_TransformerInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solid Insulation Weight</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_SolidInsulationWeight();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral BIL</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_NeutralBIL();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_CoreKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Over Load Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_DayOverLoadRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_Function();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_ConstructionKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Transformer</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_AutoTransformer();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EReference getTransformerAssetModel_TransformerAssets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Primary Nom Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_AltPrimaryNomVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconfig Winding</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	EAttribute getTransformerAssetModel_ReconfigWinding();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Model Catalogue Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem
	 * @generated
	 */
	EClass getAssetModelCatalogueItem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Quote Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	EReference getAssetModelCatalogueItem_ErpQuoteLineItems();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	EAttribute getAssetModelCatalogueItem_UnitCost();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model Catalogue</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	EReference getAssetModelCatalogueItem_AssetModelCatalogue();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp PO Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	EReference getAssetModelCatalogueItem_ErpPOLineItems();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	EReference getAssetModelCatalogueItem_AssetModel();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind <em>Transformer Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Construction Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @generated
	 */
	EEnum getTransformerConstructionKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind <em>Winding Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Insulation Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @generated
	 */
	EEnum getWindingInsulationKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind <em>Oil Preservation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oil Preservation Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @generated
	 */
	EEnum getOilPreservationKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind <em>Tap Changer Switching Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tap Changer Switching Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind
	 * @generated
	 */
	EEnum getTapChangerSwitchingKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.CableShieldKind <em>Cable Shield Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Shield Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.CableShieldKind
	 * @generated
	 */
	EEnum getCableShieldKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind <em>Transformer Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Function Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @generated
	 */
	EEnum getTransformerFunctionKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind <em>Transformer Core Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Core Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @generated
	 */
	EEnum getTransformerCoreKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfAssetModelsFactory getInfAssetModelsFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl <em>Meter Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getMeterAssetModel()
		 * @generated
		 */
		EClass METER_ASSET_MODEL = eINSTANCE.getMeterAssetModel();

		/**
		 * The meta object literal for the '<em><b>KH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__KH = eINSTANCE.getMeterAssetModel_KH();

		/**
		 * The meta object literal for the '<em><b>Interval Data Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__INTERVAL_DATA_METER = eINSTANCE.getMeterAssetModel_IntervalDataMeter();

		/**
		 * The meta object literal for the '<em><b>Max Register Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__MAX_REGISTER_COUNT = eINSTANCE.getMeterAssetModel_MaxRegisterCount();

		/**
		 * The meta object literal for the '<em><b>Meter Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_MODEL__METER_ASSETS = eINSTANCE.getMeterAssetModel_MeterAssets();

		/**
		 * The meta object literal for the '<em><b>KV Ah Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__KV_AH_METER = eINSTANCE.getMeterAssetModel_KVAhMeter();

		/**
		 * The meta object literal for the '<em><b>Wire Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__WIRE_COUNT = eINSTANCE.getMeterAssetModel_WireCount();

		/**
		 * The meta object literal for the '<em><b>Time Of Use Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__TIME_OF_USE_METER = eINSTANCE.getMeterAssetModel_TimeOfUseMeter();

		/**
		 * The meta object literal for the '<em><b>Demand Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__DEMAND_METER = eINSTANCE.getMeterAssetModel_DemandMeter();

		/**
		 * The meta object literal for the '<em><b>Reactive Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__REACTIVE_METER = eINSTANCE.getMeterAssetModel_ReactiveMeter();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__FORM = eINSTANCE.getMeterAssetModel_Form();

		/**
		 * The meta object literal for the '<em><b>Register Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__REGISTER_RATIO = eINSTANCE.getMeterAssetModel_RegisterRatio();

		/**
		 * The meta object literal for the '<em><b>Kwh Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__KWH_METER = eINSTANCE.getMeterAssetModel_KwhMeter();

		/**
		 * The meta object literal for the '<em><b>QMeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__QMETER = eINSTANCE.getMeterAssetModel_QMeter();

		/**
		 * The meta object literal for the '<em><b>Load Profile Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MODEL__LOAD_PROFILE_METER = eINSTANCE.getMeterAssetModel_LoadProfileMeter();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.ElectricalAssetModelImpl <em>Electrical Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.ElectricalAssetModelImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getElectricalAssetModel()
		 * @generated
		 */
		EClass ELECTRICAL_ASSET_MODEL = eINSTANCE.getElectricalAssetModel();

		/**
		 * The meta object literal for the '<em><b>Electrical Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRICAL_ASSET_MODEL__ELECTRICAL_INFOS = eINSTANCE.getElectricalAssetModel_ElectricalInfos();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl <em>Tap Changer Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTapChangerAssetModel()
		 * @generated
		 */
		EClass TAP_CHANGER_ASSET_MODEL = eINSTANCE.getTapChangerAssetModel();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__FREQUENCY = eINSTANCE.getTapChangerAssetModel_Frequency();

		/**
		 * The meta object literal for the '<em><b>Rated Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE = eINSTANCE.getTapChangerAssetModel_RatedVoltage();

		/**
		 * The meta object literal for the '<em><b>High Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__HIGH_STEP = eINSTANCE.getTapChangerAssetModel_HighStep();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__RATED_CURRENT = eINSTANCE.getTapChangerAssetModel_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Phase Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__PHASE_COUNT = eINSTANCE.getTapChangerAssetModel_PhaseCount();

		/**
		 * The meta object literal for the '<em><b>Tap Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__TAP_COUNT = eINSTANCE.getTapChangerAssetModel_TapCount();

		/**
		 * The meta object literal for the '<em><b>Tap Changer Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS = eINSTANCE.getTapChangerAssetModel_TapChangerAssets();

		/**
		 * The meta object literal for the '<em><b>Rated Apparent Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER = eINSTANCE.getTapChangerAssetModel_RatedApparentPower();

		/**
		 * The meta object literal for the '<em><b>Neutral Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP = eINSTANCE.getTapChangerAssetModel_NeutralStep();

		/**
		 * The meta object literal for the '<em><b>Low Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__LOW_STEP = eINSTANCE.getTapChangerAssetModel_LowStep();

		/**
		 * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY = eINSTANCE.getTapChangerAssetModel_InitialDelay();

		/**
		 * The meta object literal for the '<em><b>Step Voltage Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT = eINSTANCE.getTapChangerAssetModel_StepVoltageIncrement();

		/**
		 * The meta object literal for the '<em><b>Switching Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND = eINSTANCE.getTapChangerAssetModel_SwitchingKind();

		/**
		 * The meta object literal for the '<em><b>Subsequent Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY = eINSTANCE.getTapChangerAssetModel_SubsequentDelay();

		/**
		 * The meta object literal for the '<em><b>Step Phase Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT = eINSTANCE.getTapChangerAssetModel_StepPhaseIncrement();

		/**
		 * The meta object literal for the '<em><b>Bil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER_ASSET_MODEL__BIL = eINSTANCE.getTapChangerAssetModel_Bil();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueImpl <em>Asset Model Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getAssetModelCatalogue()
		 * @generated
		 */
		EClass ASSET_MODEL_CATALOGUE = eINSTANCE.getAssetModelCatalogue();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS = eINSTANCE.getAssetModelCatalogue_AssetModelCatalogueItems();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL_CATALOGUE__STATUS = eINSTANCE.getAssetModelCatalogue_Status();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl <em>Transformer Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerAssetModel()
		 * @generated
		 */
		EClass TRANSFORMER_ASSET_MODEL = eINSTANCE.getTransformerAssetModel();

		/**
		 * The meta object literal for the '<em><b>Hour Over Load Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING = eINSTANCE.getTransformerAssetModel_HourOverLoadRating();

		/**
		 * The meta object literal for the '<em><b>Oil Preservation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND = eINSTANCE.getTransformerAssetModel_OilPreservationKind();

		/**
		 * The meta object literal for the '<em><b>Core Coils Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT = eINSTANCE.getTransformerAssetModel_CoreCoilsWeight();

		/**
		 * The meta object literal for the '<em><b>Winding Insulation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND = eINSTANCE.getTransformerAssetModel_WindingInsulationKind();

		/**
		 * The meta object literal for the '<em><b>Alt Secondary Nom Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE = eINSTANCE.getTransformerAssetModel_AltSecondaryNomVoltage();

		/**
		 * The meta object literal for the '<em><b>Transformer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO = eINSTANCE.getTransformerAssetModel_TransformerInfo();

		/**
		 * The meta object literal for the '<em><b>Solid Insulation Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT = eINSTANCE.getTransformerAssetModel_SolidInsulationWeight();

		/**
		 * The meta object literal for the '<em><b>Neutral BIL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL = eINSTANCE.getTransformerAssetModel_NeutralBIL();

		/**
		 * The meta object literal for the '<em><b>Core Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__CORE_KIND = eINSTANCE.getTransformerAssetModel_CoreKind();

		/**
		 * The meta object literal for the '<em><b>Day Over Load Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING = eINSTANCE.getTransformerAssetModel_DayOverLoadRating();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__FUNCTION = eINSTANCE.getTransformerAssetModel_Function();

		/**
		 * The meta object literal for the '<em><b>Construction Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND = eINSTANCE.getTransformerAssetModel_ConstructionKind();

		/**
		 * The meta object literal for the '<em><b>Auto Transformer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER = eINSTANCE.getTransformerAssetModel_AutoTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformer Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS = eINSTANCE.getTransformerAssetModel_TransformerAssets();

		/**
		 * The meta object literal for the '<em><b>Alt Primary Nom Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE = eINSTANCE.getTransformerAssetModel_AltPrimaryNomVoltage();

		/**
		 * The meta object literal for the '<em><b>Reconfig Winding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING = eINSTANCE.getTransformerAssetModel_ReconfigWinding();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl <em>Asset Model Catalogue Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getAssetModelCatalogueItem()
		 * @generated
		 */
		EClass ASSET_MODEL_CATALOGUE_ITEM = eINSTANCE.getAssetModelCatalogueItem();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS = eINSTANCE.getAssetModelCatalogueItem_ErpQuoteLineItems();

		/**
		 * The meta object literal for the '<em><b>Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST = eINSTANCE.getAssetModelCatalogueItem_UnitCost();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE = eINSTANCE.getAssetModelCatalogueItem_AssetModelCatalogue();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS = eINSTANCE.getAssetModelCatalogueItem_ErpPOLineItems();

		/**
		 * The meta object literal for the '<em><b>Asset Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL = eINSTANCE.getAssetModelCatalogueItem_AssetModel();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind <em>Transformer Construction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerConstructionKind()
		 * @generated
		 */
		EEnum TRANSFORMER_CONSTRUCTION_KIND = eINSTANCE.getTransformerConstructionKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind <em>Winding Insulation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getWindingInsulationKind()
		 * @generated
		 */
		EEnum WINDING_INSULATION_KIND = eINSTANCE.getWindingInsulationKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind <em>Oil Preservation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getOilPreservationKind()
		 * @generated
		 */
		EEnum OIL_PRESERVATION_KIND = eINSTANCE.getOilPreservationKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind <em>Tap Changer Switching Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTapChangerSwitchingKind()
		 * @generated
		 */
		EEnum TAP_CHANGER_SWITCHING_KIND = eINSTANCE.getTapChangerSwitchingKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.CableShieldKind <em>Cable Shield Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.CableShieldKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getCableShieldKind()
		 * @generated
		 */
		EEnum CABLE_SHIELD_KIND = eINSTANCE.getCableShieldKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind <em>Transformer Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerFunctionKind()
		 * @generated
		 */
		EEnum TRANSFORMER_FUNCTION_KIND = eINSTANCE.getTransformerFunctionKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind <em>Transformer Core Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl#getTransformerCoreKind()
		 * @generated
		 */
		EEnum TRANSFORMER_CORE_KIND = eINSTANCE.getTransformerCoreKind();

	}

} //InfAssetModelsPackage
