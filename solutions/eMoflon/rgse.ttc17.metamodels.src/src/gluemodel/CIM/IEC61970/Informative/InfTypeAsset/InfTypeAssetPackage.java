/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset;

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
 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetFactory
 * @model kind="package"
 * @generated
 */
public interface InfTypeAssetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfTypeAsset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfTypeAsset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfTypeAsset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfTypeAssetPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetCatalogueImpl <em>Type Asset Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetCatalogueImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getTypeAssetCatalogue()
	 * @generated
	 */
	int TYPE_ASSET_CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__TYPE_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Asset Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Asset Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_CATALOGUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl <em>Type Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getTypeAsset()
	 * @generated
	 */
	int TYPE_ASSET = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__TYPE_ASSET_CATALOGUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ERP_BOM_ITEM_DATAS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ASSET_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__STOCK_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ERP_REQ_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ERP_INVENTORY_ISSUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ESTIMATED_UNIT_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__ASSET_MODELS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CU Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__CU_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.ElectricalTypeAssetImpl <em>Electrical Type Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.ElectricalTypeAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getElectricalTypeAsset()
	 * @generated
	 */
	int ELECTRICAL_TYPE_ASSET = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__UUID = TYPE_ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__MRID = TYPE_ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__NAME = TYPE_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__DESCRIPTION = TYPE_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__PATH_NAME = TYPE_ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__MODELING_AUTHORITY_SET = TYPE_ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__LOCAL_NAME = TYPE_ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ALIAS_NAME = TYPE_ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__TYPE_ASSET_CATALOGUE = TYPE_ASSET__TYPE_ASSET_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ERP_BOM_ITEM_DATAS = TYPE_ASSET__ERP_BOM_ITEM_DATAS;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ASSET_INFO = TYPE_ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__STOCK_ITEM = TYPE_ASSET__STOCK_ITEM;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ERP_REQ_LINE_ITEMS = TYPE_ASSET__ERP_REQ_LINE_ITEMS;

	/**
	 * The feature id for the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ERP_INVENTORY_ISSUES = TYPE_ASSET__ERP_INVENTORY_ISSUES;

	/**
	 * The feature id for the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ESTIMATED_UNIT_COST = TYPE_ASSET__ESTIMATED_UNIT_COST;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET = TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ASSET_MODELS = TYPE_ASSET__ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>CU Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__CU_ASSET = TYPE_ASSET__CU_ASSET;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__QUANTITY = TYPE_ASSET__QUANTITY;

	/**
	 * The feature id for the '<em><b>Electrical Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS = TYPE_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electrical Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET_FEATURE_COUNT = TYPE_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Electrical Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_TYPE_ASSET_OPERATION_COUNT = TYPE_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl <em>Generator Type Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getGeneratorTypeAsset()
	 * @generated
	 */
	int GENERATOR_TYPE_ASSET = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__UUID = ELECTRICAL_TYPE_ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__MRID = ELECTRICAL_TYPE_ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__NAME = ELECTRICAL_TYPE_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__DESCRIPTION = ELECTRICAL_TYPE_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__PATH_NAME = ELECTRICAL_TYPE_ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__MODELING_AUTHORITY_SET = ELECTRICAL_TYPE_ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__LOCAL_NAME = ELECTRICAL_TYPE_ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ALIAS_NAME = ELECTRICAL_TYPE_ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__TYPE_ASSET_CATALOGUE = ELECTRICAL_TYPE_ASSET__TYPE_ASSET_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ERP_BOM_ITEM_DATAS = ELECTRICAL_TYPE_ASSET__ERP_BOM_ITEM_DATAS;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ASSET_INFO = ELECTRICAL_TYPE_ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__STOCK_ITEM = ELECTRICAL_TYPE_ASSET__STOCK_ITEM;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ERP_REQ_LINE_ITEMS = ELECTRICAL_TYPE_ASSET__ERP_REQ_LINE_ITEMS;

	/**
	 * The feature id for the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ERP_INVENTORY_ISSUES = ELECTRICAL_TYPE_ASSET__ERP_INVENTORY_ISSUES;

	/**
	 * The feature id for the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ESTIMATED_UNIT_COST = ELECTRICAL_TYPE_ASSET__ESTIMATED_UNIT_COST;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET = ELECTRICAL_TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ASSET_MODELS = ELECTRICAL_TYPE_ASSET__ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>CU Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__CU_ASSET = ELECTRICAL_TYPE_ASSET__CU_ASSET;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__QUANTITY = ELECTRICAL_TYPE_ASSET__QUANTITY;

	/**
	 * The feature id for the '<em><b>Electrical Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__ELECTRICAL_INFOS = ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS;

	/**
	 * The feature id for the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__XDIRECT_SYNC = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__RDIRECT_SYNC = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__RQUAD_TRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__XQUAD_SYNC = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__MIN_P = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__MIN_Q = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__MAX_Q = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__MAX_P = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__RQUAD_SYNC = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__XDIRECT_TRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>RDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__RDIRECT_TRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>RDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__XQUAD_TRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>RQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Generator Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET_FEATURE_COUNT = ELECTRICAL_TYPE_ASSET_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Generator Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPE_ASSET_OPERATION_COUNT = ELECTRICAL_TYPE_ASSET_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue <em>Type Asset Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Asset Catalogue</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue
	 * @generated
	 */
	EClass getTypeAssetCatalogue();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets <em>Type Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets()
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 */
	EReference getTypeAssetCatalogue_TypeAssets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus()
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 */
	EReference getTypeAssetCatalogue_Status();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset <em>Electrical Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset
	 * @generated
	 */
	EClass getElectricalTypeAsset();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset#getElectricalInfos <em>Electrical Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset#getElectricalInfos()
	 * @see #getElectricalTypeAsset()
	 * @generated
	 */
	EReference getElectricalTypeAsset_ElectricalInfos();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset
	 * @generated
	 */
	EClass getTypeAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset Catalogue</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getTypeAssetCatalogue()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_TypeAssetCatalogue();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Bom Item Datas</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpBomItemDatas()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_ErpBomItemDatas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetInfo()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_AssetInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#isStockItem <em>Stock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#isStockItem()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EAttribute getTypeAsset_StockItem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Req Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpReqLineItems()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_ErpReqLineItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpInventoryIssues <em>Erp Inventory Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Inventory Issues</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpInventoryIssues()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_ErpInventoryIssues();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getEstimatedUnitCost <em>Estimated Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Unit Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getEstimatedUnitCost()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EAttribute getTypeAsset_EstimatedUnitCost();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Work Equipment Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUWorkEquipmentAsset()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_CUWorkEquipmentAsset();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetModels <em>Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Models</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetModels()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_AssetModels();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUAsset <em>CU Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUAsset()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EReference getTypeAsset_CUAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getQuantity()
	 * @see #getTypeAsset()
	 * @generated
	 */
	EAttribute getTypeAsset_Quantity();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset <em>Generator Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset
	 * @generated
	 */
	EClass getGeneratorTypeAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSync <em>XDirect Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Sync</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_XDirectSync();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSync <em>RDirect Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDirect Sync</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_RDirectSync();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadTrans <em>RQuad Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RQuad Trans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_RQuadTrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSync <em>XQuad Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Sync</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_XQuadSync();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSubtrans <em>XQuad Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Subtrans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_XQuadSubtrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinP()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_MinP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinQ <em>Min Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Q</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinQ()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_MinQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxQ <em>Max Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Q</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxQ()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_MaxQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxP()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_MaxP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSync <em>RQuad Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RQuad Sync</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_RQuadSync();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSubtrans <em>XDirect Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Subtrans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_XDirectSubtrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectTrans <em>XDirect Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Trans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_XDirectTrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectTrans <em>RDirect Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDirect Trans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_RDirectTrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSubtrans <em>RDirect Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDirect Subtrans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_RDirectSubtrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadTrans <em>XQuad Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Trans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_XQuadTrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSubtrans <em>RQuad Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RQuad Subtrans</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	EAttribute getGeneratorTypeAsset_RQuadSubtrans();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfTypeAssetFactory getInfTypeAssetFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetCatalogueImpl <em>Type Asset Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetCatalogueImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getTypeAssetCatalogue()
		 * @generated
		 */
		EClass TYPE_ASSET_CATALOGUE = eINSTANCE.getTypeAssetCatalogue();

		/**
		 * The meta object literal for the '<em><b>Type Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET_CATALOGUE__TYPE_ASSETS = eINSTANCE.getTypeAssetCatalogue_TypeAssets();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET_CATALOGUE__STATUS = eINSTANCE.getTypeAssetCatalogue_Status();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.ElectricalTypeAssetImpl <em>Electrical Type Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.ElectricalTypeAssetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getElectricalTypeAsset()
		 * @generated
		 */
		EClass ELECTRICAL_TYPE_ASSET = eINSTANCE.getElectricalTypeAsset();

		/**
		 * The meta object literal for the '<em><b>Electrical Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS = eINSTANCE.getElectricalTypeAsset_ElectricalInfos();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl <em>Type Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getTypeAsset()
		 * @generated
		 */
		EClass TYPE_ASSET = eINSTANCE.getTypeAsset();

		/**
		 * The meta object literal for the '<em><b>Type Asset Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__TYPE_ASSET_CATALOGUE = eINSTANCE.getTypeAsset_TypeAssetCatalogue();

		/**
		 * The meta object literal for the '<em><b>Erp Bom Item Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__ERP_BOM_ITEM_DATAS = eINSTANCE.getTypeAsset_ErpBomItemDatas();

		/**
		 * The meta object literal for the '<em><b>Asset Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__ASSET_INFO = eINSTANCE.getTypeAsset_AssetInfo();

		/**
		 * The meta object literal for the '<em><b>Stock Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSET__STOCK_ITEM = eINSTANCE.getTypeAsset_StockItem();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__ERP_REQ_LINE_ITEMS = eINSTANCE.getTypeAsset_ErpReqLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__ERP_INVENTORY_ISSUES = eINSTANCE.getTypeAsset_ErpInventoryIssues();

		/**
		 * The meta object literal for the '<em><b>Estimated Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSET__ESTIMATED_UNIT_COST = eINSTANCE.getTypeAsset_EstimatedUnitCost();

		/**
		 * The meta object literal for the '<em><b>CU Work Equipment Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET = eINSTANCE.getTypeAsset_CUWorkEquipmentAsset();

		/**
		 * The meta object literal for the '<em><b>Asset Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__ASSET_MODELS = eINSTANCE.getTypeAsset_AssetModels();

		/**
		 * The meta object literal for the '<em><b>CU Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSET__CU_ASSET = eINSTANCE.getTypeAsset_CUAsset();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSET__QUANTITY = eINSTANCE.getTypeAsset_Quantity();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl <em>Generator Type Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl#getGeneratorTypeAsset()
		 * @generated
		 */
		EClass GENERATOR_TYPE_ASSET = eINSTANCE.getGeneratorTypeAsset();

		/**
		 * The meta object literal for the '<em><b>XDirect Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__XDIRECT_SYNC = eINSTANCE.getGeneratorTypeAsset_XDirectSync();

		/**
		 * The meta object literal for the '<em><b>RDirect Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__RDIRECT_SYNC = eINSTANCE.getGeneratorTypeAsset_RDirectSync();

		/**
		 * The meta object literal for the '<em><b>RQuad Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__RQUAD_TRANS = eINSTANCE.getGeneratorTypeAsset_RQuadTrans();

		/**
		 * The meta object literal for the '<em><b>XQuad Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__XQUAD_SYNC = eINSTANCE.getGeneratorTypeAsset_XQuadSync();

		/**
		 * The meta object literal for the '<em><b>XQuad Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_XQuadSubtrans();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__MIN_P = eINSTANCE.getGeneratorTypeAsset_MinP();

		/**
		 * The meta object literal for the '<em><b>Min Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__MIN_Q = eINSTANCE.getGeneratorTypeAsset_MinQ();

		/**
		 * The meta object literal for the '<em><b>Max Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__MAX_Q = eINSTANCE.getGeneratorTypeAsset_MaxQ();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__MAX_P = eINSTANCE.getGeneratorTypeAsset_MaxP();

		/**
		 * The meta object literal for the '<em><b>RQuad Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__RQUAD_SYNC = eINSTANCE.getGeneratorTypeAsset_RQuadSync();

		/**
		 * The meta object literal for the '<em><b>XDirect Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_XDirectSubtrans();

		/**
		 * The meta object literal for the '<em><b>XDirect Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__XDIRECT_TRANS = eINSTANCE.getGeneratorTypeAsset_XDirectTrans();

		/**
		 * The meta object literal for the '<em><b>RDirect Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__RDIRECT_TRANS = eINSTANCE.getGeneratorTypeAsset_RDirectTrans();

		/**
		 * The meta object literal for the '<em><b>RDirect Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_RDirectSubtrans();

		/**
		 * The meta object literal for the '<em><b>XQuad Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__XQUAD_TRANS = eINSTANCE.getGeneratorTypeAsset_XQuadTrans();

		/**
		 * The meta object literal for the '<em><b>RQuad Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_RQuadSubtrans();

	}

} //InfTypeAssetPackage
