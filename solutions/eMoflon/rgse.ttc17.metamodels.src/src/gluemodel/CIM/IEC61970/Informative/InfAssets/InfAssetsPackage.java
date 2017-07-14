/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

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
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The package is used to define asset-level models for objects. Assets may be comprised of other assets and may have relationships to other assets. Assets also have owners and values. Assets may also have a relationship to a PowerSystemResource in the Wires model.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"Assets are the basic units which define a physical infrastructure. PowerSystemResources are logical objects meaningful to operations which are constructed from one or more Assets, although PowerSystemResources are not required to specifiy their component Assets.\nThe Asset package is comprosed of several packages. The key concepts of an Asset are as follows:\n<ul>\n\t<li>Assets can have names, through inheritance to the Naming package</li>\n\t<li>Assets are physical entities which have a lifecycle</li>\n\t<li>One or more assets can be associated to create a PowerSystemResource</li>\n\t<li>Assets can be grouped (aggregated) with other Assets</li>\n\t<li>Assets are typically either \'point\' or \'linear\' assets, which relate to physical geometry</li>\n\t<li>Assets have a close relationship to Work as a consequence of their lifecycle</li>\n</ul>\nThe following sections describe the packages in the Assets package.\nThe AssetBasics package defines the relationship between Asset and other classes, such as Organization, PowerSystemResource and Document.\nPoint assets are those assets whose physical location can be described in terms of a single coordinate, such as a pole or a switch.\nLinear assets are those assets whose physical location is best described in terms of a line, plyline or polygon.\nAsset work triggers are used to determine when inspection and/or maintenance are required for assets.\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The package is used to define asset-level models for objects. Assets may be comprised of other assets and may have relationships to other assets. Assets also have owners and values. Assets may also have a relationship to a PowerSystemResource in the Wires model.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"Assets are the basic units which define a physical infrastructure. PowerSystemResources are logical objects meaningful to operations which are constructed from one or more Assets, although PowerSystemResources are not required to specifiy their component Assets.\nThe Asset package is comprosed of several packages. The key concepts of an Asset are as follows:\n<ul>\n\t<li>Assets can have names, through inheritance to the Naming package</li>\n\t<li>Assets are physical entities which have a lifecycle</li>\n\t<li>One or more assets can be associated to create a PowerSystemResource</li>\n\t<li>Assets can be grouped (aggregated) with other Assets</li>\n\t<li>Assets are typically either \'point\' or \'linear\' assets, which relate to physical geometry</li>\n\t<li>Assets have a close relationship to Work as a consequence of their lifecycle</li>\n</ul>\nThe following sections describe the packages in the Assets package.\nThe AssetBasics package defines the relationship between Asset and other classes, such as Organization, PowerSystemResource and Document.\nPoint assets are those assets whose physical location can be described in terms of a single coordinate, such as a pole or a switch.\nLinear assets are those assets whose physical location is best described in terms of a line, plyline or polygon.\nAsset work triggers are used to determine when inspection and/or maintenance are required for assets.\"'"
 * @generated
 */
public interface InfAssetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfAssets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfAssets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfAssets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfAssetsPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.OrgAssetRoleImpl <em>Org Asset Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.OrgAssetRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getOrgAssetRole()
	 * @generated
	 */
	int ORG_ASSET_ROLE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percent Ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE__PERCENT_OWNERSHIP = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ASSET_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetInfoImpl <em>Asset Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getAssetInfo()
	 * @generated
	 */
	int ASSET_INFO = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__ASSET_MODEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO__DIMENSIONS_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Asset Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Asset Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl <em>Electrical Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getElectricalInfo()
	 * @generated
	 */
	int ELECTRICAL_INFO = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__WIRE_COUNT = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__IS_CONNECTED = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__FREQUENCY = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__B0 = ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS = ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__R0 = ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__BIL = ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__PHASE_COUNT = ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__X0 = ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__G0 = ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__PHASE_CODE = ASSET_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__RATED_CURRENT = ASSET_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__ELECTRICAL_ASSETS = ASSET_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__X = ASSET_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__R = ASSET_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__RATED_APPARENT_POWER = ASSET_INFO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__G = ASSET_INFO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__B = ASSET_INFO_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__RATED_VOLTAGE = ASSET_INFO_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS = ASSET_INFO_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Electrical Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Electrical Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ShuntCompensatorInfoImpl <em>Shunt Compensator Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ShuntCompensatorInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getShuntCompensatorInfo()
	 * @generated
	 */
	int SHUNT_COMPENSATOR_INFO = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Shunt Impedance Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Power Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shunt Compensator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shunt Compensator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl <em>Potential Transformer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getPotentialTransformerInfo()
	 * @generated
	 */
	int POTENTIAL_TRANSFORMER_INFO = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Secondary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominal Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__PT_CLASS = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tertiary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Potential Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Potential Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_TRANSFORMER_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DuctInfoImpl <em>Duct Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DuctInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getDuctInfo()
	 * @generated
	 */
	int DUCT_INFO = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__YCOORD = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__XCOORD = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cable Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__CABLE_INFOS = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO__DUCT_BANK_INFO = ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Duct Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Duct Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DocAssetRoleImpl <em>Doc Asset Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DocAssetRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getDocAssetRole()
	 * @generated
	 */
	int DOC_ASSET_ROLE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE__DOCUMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ASSET_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl <em>Mounting Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getMountingPoint()
	 * @generated
	 */
	int MOUNTING_POINT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__XCOORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overhead Conductors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__OVERHEAD_CONDUCTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__CONNECTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__PHASE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT__YCOORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mounting Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mounting Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FACTSDeviceInfoImpl <em>FACTS Device Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FACTSDeviceInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFACTSDeviceInfo()
	 * @generated
	 */
	int FACTS_DEVICE_INFO = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO__KIND = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FACTS Device Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FACTS Device Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTS_DEVICE_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SVCInfoImpl <em>SVC Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SVCInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getSVCInfo()
	 * @generated
	 */
	int SVC_INFO = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__UUID = FACTS_DEVICE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__MRID = FACTS_DEVICE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__NAME = FACTS_DEVICE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__DESCRIPTION = FACTS_DEVICE_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__PATH_NAME = FACTS_DEVICE_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__MODELING_AUTHORITY_SET = FACTS_DEVICE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__LOCAL_NAME = FACTS_DEVICE_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__ALIAS_NAME = FACTS_DEVICE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__ASSET = FACTS_DEVICE_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__TYPE_ASSET = FACTS_DEVICE_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__ASSET_MODEL = FACTS_DEVICE_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__DIMENSIONS_INFO = FACTS_DEVICE_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__WIRE_COUNT = FACTS_DEVICE_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__IS_CONNECTED = FACTS_DEVICE_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__FREQUENCY = FACTS_DEVICE_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__B0 = FACTS_DEVICE_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__ELECTRICAL_ASSET_MODELS = FACTS_DEVICE_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__R0 = FACTS_DEVICE_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__BIL = FACTS_DEVICE_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__PHASE_COUNT = FACTS_DEVICE_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__X0 = FACTS_DEVICE_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__G0 = FACTS_DEVICE_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__PHASE_CODE = FACTS_DEVICE_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__RATED_CURRENT = FACTS_DEVICE_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__ELECTRICAL_ASSETS = FACTS_DEVICE_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__X = FACTS_DEVICE_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__R = FACTS_DEVICE_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__RATED_APPARENT_POWER = FACTS_DEVICE_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__G = FACTS_DEVICE_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__B = FACTS_DEVICE_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__RATED_VOLTAGE = FACTS_DEVICE_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__ELECTRICAL_TYPE_ASSETS = FACTS_DEVICE_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__KIND = FACTS_DEVICE_INFO__KIND;

	/**
	 * The feature id for the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__CAPACITIVE_RATING = FACTS_DEVICE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO__INDUCTIVE_RATING = FACTS_DEVICE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SVC Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO_FEATURE_COUNT = FACTS_DEVICE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SVC Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_INFO_OPERATION_COUNT = FACTS_DEVICE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl <em>Financial Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFinancialInfo()
	 * @generated
	 */
	int FINANCIAL_INFO = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__COST_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plant Transfer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Warranty End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__WARRANTY_END_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__ACTUAL_PURCHASE_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Purchase Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__PURCHASE_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Purchase Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__PURCHASE_ORDER_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__FINANCIAL_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__VALUE_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Financial Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Financial Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl <em>Shunt Impedance Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getShuntImpedanceInfo()
	 * @generated
	 */
	int SHUNT_IMPEDANCE_INFO = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Low Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cell Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__CELL_SIZE = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reg Branch Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__NORMAL_OPEN = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shunt Compensator Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS = ELECTRICAL_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reg Branch End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__REG_BRANCH_END = ELECTRICAL_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>VReg Line Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE = ELECTRICAL_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Switch Operation Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE = ELECTRICAL_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Local Off Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL = ELECTRICAL_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sensing Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE = ELECTRICAL_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Local Control Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Branch Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT = ELECTRICAL_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Switch Operation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Local Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE = ELECTRICAL_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Local On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL = ELECTRICAL_INFO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reg Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__REG_BRANCH = ELECTRICAL_INFO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Control Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO__CONTROL_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Shunt Impedance Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Shunt Impedance Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_IMPEDANCE_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CabinetImpl <em>Cabinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CabinetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getCabinet()
	 * @generated
	 */
	int CABINET = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__DESCRIPTION = AssetsPackage.ASSET_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__PATH_NAME = AssetsPackage.ASSET_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__LOCAL_NAME = AssetsPackage.ASSET_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The number of structural features of the '<em>Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABINET_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ComEquipmentInfoImpl <em>Com Equipment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ComEquipmentInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getComEquipmentInfo()
	 * @generated
	 */
	int COM_EQUIPMENT_INFO = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_EQUIPMENT_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl <em>Switch Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getSwitchInfo()
	 * @generated
	 */
	int SWITCH_INFO = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__GANG = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__POLE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__INTERRUPTING_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__DIELECTRIC_STRENGTH = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__LOAD_BREAK = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__MINIMUM_CURRENT = ELECTRICAL_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__WITHSTAND_CURRENT = ELECTRICAL_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__MAKING_CAPACITY = ELECTRICAL_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO__REMOTE = ELECTRICAL_INFO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.BreakerInfoImpl <em>Breaker Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.BreakerInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getBreakerInfo()
	 * @generated
	 */
	int BREAKER_INFO = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__UUID = SWITCH_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__MRID = SWITCH_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__NAME = SWITCH_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__DESCRIPTION = SWITCH_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__PATH_NAME = SWITCH_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__MODELING_AUTHORITY_SET = SWITCH_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__LOCAL_NAME = SWITCH_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__ALIAS_NAME = SWITCH_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__ASSET = SWITCH_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__TYPE_ASSET = SWITCH_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__ASSET_MODEL = SWITCH_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__DIMENSIONS_INFO = SWITCH_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__WIRE_COUNT = SWITCH_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__IS_CONNECTED = SWITCH_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__FREQUENCY = SWITCH_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__B0 = SWITCH_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__ELECTRICAL_ASSET_MODELS = SWITCH_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__R0 = SWITCH_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__BIL = SWITCH_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__PHASE_COUNT = SWITCH_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__X0 = SWITCH_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__G0 = SWITCH_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__PHASE_CODE = SWITCH_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__RATED_CURRENT = SWITCH_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__ELECTRICAL_ASSETS = SWITCH_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__X = SWITCH_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__R = SWITCH_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__RATED_APPARENT_POWER = SWITCH_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__G = SWITCH_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__B = SWITCH_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__RATED_VOLTAGE = SWITCH_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__ELECTRICAL_TYPE_ASSETS = SWITCH_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__GANG = SWITCH_INFO__GANG;

	/**
	 * The feature id for the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__POLE_COUNT = SWITCH_INFO__POLE_COUNT;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__INTERRUPTING_RATING = SWITCH_INFO__INTERRUPTING_RATING;

	/**
	 * The feature id for the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__DIELECTRIC_STRENGTH = SWITCH_INFO__DIELECTRIC_STRENGTH;

	/**
	 * The feature id for the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__LOAD_BREAK = SWITCH_INFO__LOAD_BREAK;

	/**
	 * The feature id for the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__MINIMUM_CURRENT = SWITCH_INFO__MINIMUM_CURRENT;

	/**
	 * The feature id for the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__WITHSTAND_CURRENT = SWITCH_INFO__WITHSTAND_CURRENT;

	/**
	 * The feature id for the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__MAKING_CAPACITY = SWITCH_INFO__MAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__REMOTE = SWITCH_INFO__REMOTE;

	/**
	 * The feature id for the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO__PHASE_TRIP = SWITCH_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Breaker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO_FEATURE_COUNT = SWITCH_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Breaker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_INFO_OPERATION_COUNT = SWITCH_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalAssetImpl <em>Electrical Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getElectricalAsset()
	 * @generated
	 */
	int ELECTRICAL_ASSET = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__DESCRIPTION = AssetsPackage.ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__PATH_NAME = AssetsPackage.ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__LOCAL_NAME = AssetsPackage.ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__PHASE_CODE = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__IS_CONNECTED = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Electrical Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET__ELECTRICAL_INFOS = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Electrical Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Electrical Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.GeneratorAssetImpl <em>Generator Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.GeneratorAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getGeneratorAsset()
	 * @generated
	 */
	int GENERATOR_ASSET = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__UUID = ELECTRICAL_ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__MRID = ELECTRICAL_ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__NAME = ELECTRICAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__DESCRIPTION = ELECTRICAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__PATH_NAME = ELECTRICAL_ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__MODELING_AUTHORITY_SET = ELECTRICAL_ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__LOCAL_NAME = ELECTRICAL_ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ALIAS_NAME = ELECTRICAL_ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ASSET_PROPERTY_CURVES = ELECTRICAL_ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__SERIAL_NUMBER = ELECTRICAL_ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__MEASUREMENTS = ELECTRICAL_ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__FINANCIAL_INFO = ELECTRICAL_ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__FROM_ASSET_ROLES = ELECTRICAL_ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ACTIVITY_RECORDS = ELECTRICAL_ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__DOCUMENT_ROLES = ELECTRICAL_ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ASSET_CONTAINER = ELECTRICAL_ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__CRITICAL = ELECTRICAL_ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ERP_INVENTORY = ELECTRICAL_ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__RELIABILITY_INFOS = ELECTRICAL_ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__MANUFACTURED_DATE = ELECTRICAL_ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__WORK_TASK = ELECTRICAL_ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__LOT_NUMBER = ELECTRICAL_ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ELECTRONIC_ADDRESS = ELECTRICAL_ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__SCHEDULED_EVENTS = ELECTRICAL_ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__CHANGE_ITEMS = ELECTRICAL_ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__INITIAL_LOSS_OF_LIFE = ELECTRICAL_ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ASSET_FUNCTIONS = ELECTRICAL_ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__STATUS = ELECTRICAL_ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__INITIAL_CONDITION = ELECTRICAL_ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__UTC_NUMBER = ELECTRICAL_ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__INSTALLATION_DATE = ELECTRICAL_ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ERP_ORGANISATION_ROLES = ELECTRICAL_ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__RATINGS = ELECTRICAL_ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__MEDIUMS = ELECTRICAL_ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__PROPERTIES = ELECTRICAL_ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ASSET_INFO = ELECTRICAL_ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__CORPORATE_CODE = ELECTRICAL_ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__PURCHASE_PRICE = ELECTRICAL_ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__TO_ASSET_ROLES = ELECTRICAL_ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__LOCATION = ELECTRICAL_ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__APPLICATION = ELECTRICAL_ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__POWER_SYSTEM_RESOURCES = ELECTRICAL_ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__CATEGORY = ELECTRICAL_ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ERP_ITEM_MASTER = ELECTRICAL_ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ACCEPTANCE_TEST = ELECTRICAL_ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ERP_REC_DELIVERY_ITEMS = ELECTRICAL_ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__PHASE_CODE = ELECTRICAL_ASSET__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__IS_CONNECTED = ELECTRICAL_ASSET__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__CONDUCTING_EQUIPMENT = ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Electrical Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET__ELECTRICAL_INFOS = ELECTRICAL_ASSET__ELECTRICAL_INFOS;

	/**
	 * The number of structural features of the '<em>Generator Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET_FEATURE_COUNT = ELECTRICAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generator Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ASSET_OPERATION_COUNT = ELECTRICAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl <em>Winding Insulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getWindingInsulation()
	 * @generated
	 */
	int WINDING_INSULATION = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Insulation Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__INSULATION_RESISTANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__TO_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__GROUND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__TRANSFORMER_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leakage Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__LEAKAGE_REACTANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__FROM_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insulation PF Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION__INSULATION_PF_STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Winding Insulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Winding Insulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INSULATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl <em>Conductor Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getConductorAsset()
	 * @generated
	 */
	int CONDUCTOR_ASSET = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__DESCRIPTION = AssetsPackage.ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__PATH_NAME = AssetsPackage.ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__LOCAL_NAME = AssetsPackage.ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Grounding Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__GROUNDING_METHOD = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Circuit Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__CIRCUIT_SECTION = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conductor Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__CONDUCTOR_SEGMENT = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__INSULATED = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET__IS_HORIZONTAL = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Conductor Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Conductor Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl <em>Transformer Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getTransformerAsset()
	 * @generated
	 */
	int TRANSFORMER_ASSET = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__DESCRIPTION = AssetsPackage.ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__PATH_NAME = AssetsPackage.ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__LOCAL_NAME = AssetsPackage.ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Power Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__POWER_RATINGS = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconditioned Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET__TRANSFORMER_INFO = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformer Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformer Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetPropertyCurveImpl <em>Asset Property Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetPropertyCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getAssetPropertyCurve()
	 * @generated
	 */
	int ASSET_PROPERTY_CURVE = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__SPECIFICATION = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE__ASSETS = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Property Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Property Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROPERTY_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PowerRatingImpl <em>Power Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PowerRatingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getPowerRating()
	 * @generated
	 */
	int POWER_RATING = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Cooling Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__COOLING_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__POWER_RATING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__TRANSFORMER_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING__STAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Power Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Power Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RATING_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.JointInfoImpl <em>Joint Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.JointInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getJointInfo()
	 * @generated
	 */
	int JOINT_INFO = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Fill Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__FILL_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__CONFIGURATION_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO__INSULATION = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Joint Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Joint Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingConnectionImpl <em>Mounting Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingConnectionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getMountingConnection()
	 * @generated
	 */
	int MOUNTING_CONNECTION = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Structure Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__STRUCTURE_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mounting Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION__MOUNTING_POINTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mounting Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mounting Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUNTING_CONNECTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SubstationInfoImpl <em>Substation Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SubstationInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getSubstationInfo()
	 * @generated
	 */
	int SUBSTATION_INFO = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO__FUNCTION = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Substation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProtectionEquipmentInfoImpl <em>Protection Equipment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProtectionEquipmentInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getProtectionEquipmentInfo()
	 * @generated
	 */
	int PROTECTION_EQUIPMENT_INFO = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__PHASE_TRIP = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO__GROUND_TRIP = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protection Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Protection Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_EQUIPMENT_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SurgeProtectorInfoImpl <em>Surge Protector Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SurgeProtectorInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getSurgeProtectorInfo()
	 * @generated
	 */
	int SURGE_PROTECTOR_INFO = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Nominal Design Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Current Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Continous Operating Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Energy Absorption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Surge Protector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Surge Protector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGE_PROTECTOR_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl <em>Structure Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getStructureInfo()
	 * @generated
	 */
	int STRUCTURE_INFO = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__WEED_REMOVED_DATE = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__FUMIGANT_NAME = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__FUMIGANT_APPLIED_DATE = ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__REMOVE_WEED = ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__HEIGHT = ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__MATERIAL_KIND = ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__RATED_VOLTAGE = ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO__MOUNTING_CONNECTIONS = ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Structure Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Structure Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.UndergroundStructureInfoImpl <em>Underground Structure Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.UndergroundStructureInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getUndergroundStructureInfo()
	 * @generated
	 */
	int UNDERGROUND_STRUCTURE_INFO = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__UUID = STRUCTURE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__MRID = STRUCTURE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__NAME = STRUCTURE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__DESCRIPTION = STRUCTURE_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__PATH_NAME = STRUCTURE_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__MODELING_AUTHORITY_SET = STRUCTURE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__LOCAL_NAME = STRUCTURE_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__ALIAS_NAME = STRUCTURE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__ASSET = STRUCTURE_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__TYPE_ASSET = STRUCTURE_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__ASSET_MODEL = STRUCTURE_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__DIMENSIONS_INFO = STRUCTURE_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS = STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__WEED_REMOVED_DATE = STRUCTURE_INFO__WEED_REMOVED_DATE;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__FUMIGANT_NAME = STRUCTURE_INFO__FUMIGANT_NAME;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__FUMIGANT_APPLIED_DATE = STRUCTURE_INFO__FUMIGANT_APPLIED_DATE;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__REMOVE_WEED = STRUCTURE_INFO__REMOVE_WEED;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__HEIGHT = STRUCTURE_INFO__HEIGHT;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__MATERIAL_KIND = STRUCTURE_INFO__MATERIAL_KIND;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__RATED_VOLTAGE = STRUCTURE_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__MOUNTING_CONNECTIONS = STRUCTURE_INFO__MOUNTING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__MATERIAL = STRUCTURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Ventilation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__HAS_VENTILATION = STRUCTURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sealing Warranty Expires Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__SEALING_WARRANTY_EXPIRES_DATE = STRUCTURE_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO__KIND = STRUCTURE_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Underground Structure Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO_FEATURE_COUNT = STRUCTURE_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Underground Structure Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGROUND_STRUCTURE_INFO_OPERATION_COUNT = STRUCTURE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SEQUENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LIMITS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__COMPATIBLE_UNITS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PROCEDURE_DATA_SETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Procedure Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PROCEDURE_VALUES = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CORPORATE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__INSTRUCTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MediumImpl <em>Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MediumImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getMedium()
	 * @generated
	 */
	int MEDIUM = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Volume Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__VOLUME_SPEC = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__SPECIFICATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl <em>Procedure Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getProcedureDataSet()
	 * @generated
	 */
	int PROCEDURE_DATA_SET = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__COMPLETED_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__MEASUREMENT_VALUES = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__PROPERTIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET__PROCEDURE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Procedure Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Procedure Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DATA_SET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StreetlightInfoImpl <em>Streetlight Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StreetlightInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getStreetlightInfo()
	 * @generated
	 */
	int STREETLIGHT_INFO = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Light Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__LIGHT_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arm Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__ARM_LENGTH = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__POLE = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lamp Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO__LAMP_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Streetlight Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Streetlight Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREETLIGHT_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl <em>Dimensions Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getDimensionsInfo()
	 * @generated
	 */
	int DIMENSIONS_INFO = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__ORIENTATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__SIZE_WIDTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__SPECIFICATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__SIZE_DEPTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__SIZE_DIAMETER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Asset Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__ASSET_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO__SIZE_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dimensions Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dimensions Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WorkEquipmentInfoImpl <em>Work Equipment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WorkEquipmentInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getWorkEquipmentInfo()
	 * @generated
	 */
	int WORK_EQUIPMENT_INFO = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__CREW = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO__USAGES = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Work Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EQUIPMENT_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl <em>Current Transformer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getCurrentTransformerInfo()
	 * @generated
	 */
	int CURRENT_TRANSFORMER_INFO = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__CT_CLASS = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__MAX_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core Burden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__CORE_BURDEN = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Primary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT = ELECTRICAL_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Knee Point Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT = ELECTRICAL_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tertiary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nominal Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__USAGE = ELECTRICAL_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Secondary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tertiary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__CORE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Knee Point Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE = ELECTRICAL_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Secondary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO = ELECTRICAL_INFO_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Current Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Current Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TRANSFORMER_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl <em>Structure Support Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getStructureSupportInfo()
	 * @generated
	 */
	int STRUCTURE_SUPPORT_INFO = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Anchor Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__ANCHOR_KIND = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__KIND = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__SIZE = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Secured Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE = ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anchor Rod Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_COUNT = ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__LENGTH = ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anchor Rod Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_LENGTH = ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO__DIRECTION = ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Structure Support Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Structure Support Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SUPPORT_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FailureEventImpl <em>Failure Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FailureEventImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFailureEvent()
	 * @generated
	 */
	int FAILURE_EVENT = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__DESCRIPTION = CommonPackage.ACTIVITY_RECORD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__PATH_NAME = CommonPackage.ACTIVITY_RECORD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__LOCAL_NAME = CommonPackage.ACTIVITY_RECORD__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__MARKET_FACTORS = CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Failure Isolation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__FAILURE_ISOLATION_METHOD = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__CORPORATE_CODE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Locating Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__FAULT_LOCATING_METHOD = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT__LOCATION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Failure Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Failure Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl <em>Recloser Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getRecloserInfo()
	 * @generated
	 */
	int RECLOSER_INFO = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__UUID = SWITCH_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__MRID = SWITCH_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__NAME = SWITCH_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__DESCRIPTION = SWITCH_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__PATH_NAME = SWITCH_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__MODELING_AUTHORITY_SET = SWITCH_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__LOCAL_NAME = SWITCH_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__ALIAS_NAME = SWITCH_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__ASSET = SWITCH_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__TYPE_ASSET = SWITCH_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__ASSET_MODEL = SWITCH_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__DIMENSIONS_INFO = SWITCH_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__WIRE_COUNT = SWITCH_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__IS_CONNECTED = SWITCH_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__FREQUENCY = SWITCH_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__B0 = SWITCH_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__ELECTRICAL_ASSET_MODELS = SWITCH_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__R0 = SWITCH_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__BIL = SWITCH_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__PHASE_COUNT = SWITCH_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__X0 = SWITCH_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__G0 = SWITCH_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__PHASE_CODE = SWITCH_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__RATED_CURRENT = SWITCH_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__ELECTRICAL_ASSETS = SWITCH_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__X = SWITCH_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__R = SWITCH_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__RATED_APPARENT_POWER = SWITCH_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__G = SWITCH_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__B = SWITCH_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__RATED_VOLTAGE = SWITCH_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__ELECTRICAL_TYPE_ASSETS = SWITCH_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__GANG = SWITCH_INFO__GANG;

	/**
	 * The feature id for the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__POLE_COUNT = SWITCH_INFO__POLE_COUNT;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__INTERRUPTING_RATING = SWITCH_INFO__INTERRUPTING_RATING;

	/**
	 * The feature id for the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__DIELECTRIC_STRENGTH = SWITCH_INFO__DIELECTRIC_STRENGTH;

	/**
	 * The feature id for the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__LOAD_BREAK = SWITCH_INFO__LOAD_BREAK;

	/**
	 * The feature id for the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__MINIMUM_CURRENT = SWITCH_INFO__MINIMUM_CURRENT;

	/**
	 * The feature id for the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__WITHSTAND_CURRENT = SWITCH_INFO__WITHSTAND_CURRENT;

	/**
	 * The feature id for the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__MAKING_CAPACITY = SWITCH_INFO__MAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__REMOTE = SWITCH_INFO__REMOTE;

	/**
	 * The feature id for the '<em><b>Phase Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__PHASE_TRIP_RATING = SWITCH_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Trip Normal Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED = SWITCH_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ground Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__GROUND_TRIP_RATING = SWITCH_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reclose Lockout Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT = SWITCH_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ground Trip Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO__GROUND_TRIP_CAPABLE = SWITCH_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Recloser Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO_FEATURE_COUNT = SWITCH_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Recloser Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLOSER_INFO_OPERATION_COUNT = SWITCH_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TowerInfoImpl <em>Tower Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TowerInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getTowerInfo()
	 * @generated
	 */
	int TOWER_INFO = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__UUID = STRUCTURE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__MRID = STRUCTURE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__NAME = STRUCTURE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__DESCRIPTION = STRUCTURE_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__PATH_NAME = STRUCTURE_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__MODELING_AUTHORITY_SET = STRUCTURE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__LOCAL_NAME = STRUCTURE_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__ALIAS_NAME = STRUCTURE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__ASSET = STRUCTURE_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__TYPE_ASSET = STRUCTURE_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__ASSET_MODEL = STRUCTURE_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__DIMENSIONS_INFO = STRUCTURE_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__STRUCTURE_SUPPORT_INFOS = STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__WEED_REMOVED_DATE = STRUCTURE_INFO__WEED_REMOVED_DATE;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__FUMIGANT_NAME = STRUCTURE_INFO__FUMIGANT_NAME;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__FUMIGANT_APPLIED_DATE = STRUCTURE_INFO__FUMIGANT_APPLIED_DATE;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__REMOVE_WEED = STRUCTURE_INFO__REMOVE_WEED;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__HEIGHT = STRUCTURE_INFO__HEIGHT;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__MATERIAL_KIND = STRUCTURE_INFO__MATERIAL_KIND;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__RATED_VOLTAGE = STRUCTURE_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__MOUNTING_CONNECTIONS = STRUCTURE_INFO__MOUNTING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO__CONSTRUCTION_KIND = STRUCTURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tower Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO_FEATURE_COUNT = STRUCTURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tower Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_INFO_OPERATION_COUNT = STRUCTURE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TestDataSetImpl <em>Test Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TestDataSetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getTestDataSet()
	 * @generated
	 */
	int TEST_DATA_SET = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__UUID = PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__MRID = PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__NAME = PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__DESCRIPTION = PROCEDURE_DATA_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__PATH_NAME = PROCEDURE_DATA_SET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__MODELING_AUTHORITY_SET = PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__LOCAL_NAME = PROCEDURE_DATA_SET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__ALIAS_NAME = PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__SUBJECT = PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__SCHEDULED_EVENTS = PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__ERP_ORGANISATION_ROLES = PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__CREATED_DATE_TIME = PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__TO_DOCUMENT_ROLES = PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__ASSET_ROLES = PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__ERP_PERSON_ROLES = PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__REVISION_NUMBER = PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__ELECTRONIC_ADDRESS = PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__STATUS = PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__NETWORK_DATA_SETS = PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__CATEGORY = PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__ACTIVITY_RECORDS = PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__MEASUREMENTS = PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__FROM_DOCUMENT_ROLES = PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__LAST_MODIFIED_DATE_TIME = PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__CHANGE_SETS = PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__DOC_STATUS = PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__CHANGE_ITEMS = PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__SCHEDULE_PARAMETER_INFOS = PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__TITLE = PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__COMPLETED_DATE_TIME = PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__MEASUREMENT_VALUES = PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__TRANSFORMER_OBSERVATIONS = PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__PROPERTIES = PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__PROCEDURE = PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Specimen To Lab Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME = PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specimen ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__SPECIMEN_ID = PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET__CONCLUSION = PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET_FEATURE_COUNT = PROCEDURE_DATA_SET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Test Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_SET_OPERATION_COUNT = PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Asset Properites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ASSET_PROPERITES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__RELIABILITY_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__RATINGS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualification Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__QUALIFICATION_REQUIREMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ASSET_PROPERTY_CURVES = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dimensions Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DIMENSIONS_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MEDIUMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl <em>Composite Switch Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getCompositeSwitchInfo()
	 * @generated
	 */
	int COMPOSITE_SWITCH_INFO = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__KIND = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__INIT_OP_MODE = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__GANG = ELECTRICAL_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Switch State Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING = ELECTRICAL_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO__REMOTE = ELECTRICAL_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Composite Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Composite Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SWITCH_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FacilityImpl <em>Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FacilityImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFacility()
	 * @generated
	 */
	int FACILITY = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DESCRIPTION = AssetsPackage.ASSET_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__PATH_NAME = AssetsPackage.ASSET_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__LOCAL_NAME = AssetsPackage.ASSET_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__KIND = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FaultIndicatorInfoImpl <em>Fault Indicator Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FaultIndicatorInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFaultIndicatorInfo()
	 * @generated
	 */
	int FAULT_INDICATOR_INFO = 45;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__UUID = ELECTRICAL_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__MRID = ELECTRICAL_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__NAME = ELECTRICAL_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__DESCRIPTION = ELECTRICAL_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__PATH_NAME = ELECTRICAL_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__MODELING_AUTHORITY_SET = ELECTRICAL_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__LOCAL_NAME = ELECTRICAL_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__ALIAS_NAME = ELECTRICAL_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__ASSET = ELECTRICAL_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__TYPE_ASSET = ELECTRICAL_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__ASSET_MODEL = ELECTRICAL_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__DIMENSIONS_INFO = ELECTRICAL_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__WIRE_COUNT = ELECTRICAL_INFO__WIRE_COUNT;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__IS_CONNECTED = ELECTRICAL_INFO__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__FREQUENCY = ELECTRICAL_INFO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__B0 = ELECTRICAL_INFO__B0;

	/**
	 * The feature id for the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__ELECTRICAL_ASSET_MODELS = ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__R0 = ELECTRICAL_INFO__R0;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__BIL = ELECTRICAL_INFO__BIL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__PHASE_COUNT = ELECTRICAL_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__X0 = ELECTRICAL_INFO__X0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__G0 = ELECTRICAL_INFO__G0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__PHASE_CODE = ELECTRICAL_INFO__PHASE_CODE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__RATED_CURRENT = ELECTRICAL_INFO__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Electrical Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__ELECTRICAL_ASSETS = ELECTRICAL_INFO__ELECTRICAL_ASSETS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__X = ELECTRICAL_INFO__X;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__R = ELECTRICAL_INFO__R;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__RATED_APPARENT_POWER = ELECTRICAL_INFO__RATED_APPARENT_POWER;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__G = ELECTRICAL_INFO__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__B = ELECTRICAL_INFO__B;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__RATED_VOLTAGE = ELECTRICAL_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__ELECTRICAL_TYPE_ASSETS = ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS;

	/**
	 * The feature id for the '<em><b>Reset Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO__RESET_KIND = ELECTRICAL_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fault Indicator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO_FEATURE_COUNT = ELECTRICAL_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fault Indicator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_INDICATOR_INFO_OPERATION_COUNT = ELECTRICAL_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ReliabilityInfoImpl <em>Reliability Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ReliabilityInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getReliabilityInfo()
	 * @generated
	 */
	int RELIABILITY_INFO = 46;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Mom Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__MOM_FAILURE_RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__MTTR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO__SPECIFICATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reliability Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reliability Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl <em>Transformer Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getTransformerObservation()
	 * @generated
	 */
	int TRANSFORMER_OBSERVATION = 47;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Oil IFT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__OIL_IFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hot Spot Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Oil Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Top Oil Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__TOP_OIL_TEMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pump Vibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__PUMP_VIBRATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bushing Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__BUSHING_TEMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Water Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__WATER_CONTENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__TRANSFORMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Freq Resp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__FREQ_RESP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Furfural DP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__FURFURAL_DP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Bushing Insultation PFs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Oil Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__OIL_LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Oil Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__OIL_COLOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Winding Insulation PFs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Dga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__DGA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Oil Neutralization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Transformer Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Transformer Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OBSERVATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ToolInfoImpl <em>Tool Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ToolInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getToolInfo()
	 * @generated
	 */
	int TOOL_INFO = 48;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__CREW = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Calibration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__LAST_CALIBRATION_DATE = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tool Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tool Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DuctBankInfoImpl <em>Duct Bank Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DuctBankInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getDuctBankInfo()
	 * @generated
	 */
	int DUCT_BANK_INFO = 49;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Duct Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__DUCT_INFOS = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Circuit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO__CIRCUIT_COUNT = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Duct Bank Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Duct Bank Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_BANK_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.VehicleInfoImpl <em>Vehicle Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.VehicleInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getVehicleInfo()
	 * @generated
	 */
	int VEHICLE_INFO = 50;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__USAGE_KIND = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Odometer Read Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__ODOMETER_READ_DATE_TIME = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__CREW = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Odometer Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__ODOMETER_READING = ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vehicle Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Vehicle Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.BushingInsulationPFImpl <em>Bushing Insulation PF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.BushingInsulationPFImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getBushingInsulationPF()
	 * @generated
	 */
	int BUSHING_INSULATION_PF = 51;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Bushing Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__BUSHING_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__TEST_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bushing Insulation PF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bushing Insulation PF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INSULATION_PF_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl <em>Bushing Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getBushingInfo()
	 * @generated
	 */
	int BUSHING_INFO = 52;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__UUID = ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__MRID = ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__NAME = ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__DESCRIPTION = ASSET_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__PATH_NAME = ASSET_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__MODELING_AUTHORITY_SET = ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__LOCAL_NAME = ASSET_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__ALIAS_NAME = ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__ASSET = ASSET_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__TYPE_ASSET = ASSET_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__ASSET_MODEL = ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__DIMENSIONS_INFO = ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>C2 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__C2_POWER_FACTOR = ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bushing Insulation PFs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__BUSHING_INSULATION_PFS = ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C2 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__C2_CAPACITANCE = ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>C1 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__C1_CAPACITANCE = ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__TERMINAL = ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>C1 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__C1_POWER_FACTOR = ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Insulation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO__INSULATION_KIND = ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bushing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO_FEATURE_COUNT = ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bushing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSHING_INFO_OPERATION_COUNT = ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetAssetRoleImpl <em>Asset Asset Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetAssetRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getAssetAssetRole()
	 * @generated
	 */
	int ASSET_ASSET_ROLE = 53;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>To Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__TO_ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE__FROM_ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ASSET_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl <em>Pole Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getPoleInfo()
	 * @generated
	 */
	int POLE_INFO = 54;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__UUID = STRUCTURE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__MRID = STRUCTURE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__NAME = STRUCTURE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__DESCRIPTION = STRUCTURE_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__PATH_NAME = STRUCTURE_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__MODELING_AUTHORITY_SET = STRUCTURE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__LOCAL_NAME = STRUCTURE_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__ALIAS_NAME = STRUCTURE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__ASSET = STRUCTURE_INFO__ASSET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__TYPE_ASSET = STRUCTURE_INFO__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__ASSET_MODEL = STRUCTURE_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__DIMENSIONS_INFO = STRUCTURE_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__STRUCTURE_SUPPORT_INFOS = STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__WEED_REMOVED_DATE = STRUCTURE_INFO__WEED_REMOVED_DATE;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__FUMIGANT_NAME = STRUCTURE_INFO__FUMIGANT_NAME;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__FUMIGANT_APPLIED_DATE = STRUCTURE_INFO__FUMIGANT_APPLIED_DATE;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__REMOVE_WEED = STRUCTURE_INFO__REMOVE_WEED;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__HEIGHT = STRUCTURE_INFO__HEIGHT;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__MATERIAL_KIND = STRUCTURE_INFO__MATERIAL_KIND;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__RATED_VOLTAGE = STRUCTURE_INFO__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__MOUNTING_CONNECTIONS = STRUCTURE_INFO__MOUNTING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Treated Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__TREATED_DATE_TIME = STRUCTURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breast Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__BREAST_BLOCK = STRUCTURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__CLASSIFICATION = STRUCTURE_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preservative Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__PRESERVATIVE_KIND = STRUCTURE_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jpa Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__JPA_REFERENCE = STRUCTURE_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__BASE_KIND = STRUCTURE_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__DIAMETER = STRUCTURE_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Streetlights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__STREETLIGHTS = STRUCTURE_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Treatment Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__TREATMENT_KIND = STRUCTURE_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__CONSTRUCTION = STRUCTURE_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__LENGTH = STRUCTURE_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Species Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO__SPECIES_TYPE = STRUCTURE_INFO_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Pole Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO_FEATURE_COUNT = STRUCTURE_INFO_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Pole Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLE_INFO_OPERATION_COUNT = STRUCTURE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TapChangerAssetImpl <em>Tap Changer Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TapChangerAssetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getTapChangerAsset()
	 * @generated
	 */
	int TAP_CHANGER_ASSET = 55;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__DESCRIPTION = AssetsPackage.ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__PATH_NAME = AssetsPackage.ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__LOCAL_NAME = AssetsPackage.ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Tap Changer Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tap Changer Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tap Changer Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind <em>Pole Base Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getPoleBaseKind()
	 * @generated
	 */
	int POLE_BASE_KIND = 56;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind <em>Shunt Impedance Local Control Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getShuntImpedanceLocalControlKind()
	 * @generated
	 */
	int SHUNT_IMPEDANCE_LOCAL_CONTROL_KIND = 57;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointFillKind <em>Joint Fill Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointFillKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getJointFillKind()
	 * @generated
	 */
	int JOINT_FILL_KIND = 58;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureKind <em>Procedure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getProcedureKind()
	 * @generated
	 */
	int PROCEDURE_KIND = 59;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightLampKind <em>Streetlight Lamp Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getStreetlightLampKind()
	 * @generated
	 */
	int STREETLIGHT_LAMP_KIND = 60;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind <em>Shunt Impedance Control Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getShuntImpedanceControlKind()
	 * @generated
	 */
	int SHUNT_IMPEDANCE_CONTROL_KIND = 61;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind <em>Failure Isolation Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFailureIsolationMethodKind()
	 * @generated
	 */
	int FAILURE_ISOLATION_METHOD_KIND = 62;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind <em>Underground Structure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getUndergroundStructureKind()
	 * @generated
	 */
	int UNDERGROUND_STRUCTURE_KIND = 63;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind <em>Substation Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getSubstationFunctionKind()
	 * @generated
	 */
	int SUBSTATION_FUNCTION_KIND = 64;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CoolingKind <em>Cooling Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CoolingKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getCoolingKind()
	 * @generated
	 */
	int COOLING_KIND = 65;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind <em>Pole Preservative Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getPolePreservativeKind()
	 * @generated
	 */
	int POLE_PRESERVATIVE_KIND = 66;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind <em>Pole Treatment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getPoleTreatmentKind()
	 * @generated
	 */
	int POLE_TREATMENT_KIND = 67;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind <em>Fault Indicator Reset Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFaultIndicatorResetKind()
	 * @generated
	 */
	int FAULT_INDICATOR_RESET_KIND = 68;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind <em>FACTS Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFACTSDeviceKind()
	 * @generated
	 */
	int FACTS_DEVICE_KIND = 69;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind <em>Structure Support Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getStructureSupportKind()
	 * @generated
	 */
	int STRUCTURE_SUPPORT_KIND = 70;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind <em>Vehicle Usage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getVehicleUsageKind()
	 * @generated
	 */
	int VEHICLE_USAGE_KIND = 71;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind <em>Regulation Branch Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getRegulationBranchKind()
	 * @generated
	 */
	int REGULATION_BRANCH_KIND = 72;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind <em>Tower Construction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getTowerConstructionKind()
	 * @generated
	 */
	int TOWER_CONSTRUCTION_KIND = 73;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind <em>Bushing Insulation Pf Test Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getBushingInsulationPfTestKind()
	 * @generated
	 */
	int BUSHING_INSULATION_PF_TEST_KIND = 74;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationKind <em>Bushing Insulation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getBushingInsulationKind()
	 * @generated
	 */
	int BUSHING_INSULATION_KIND = 75;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind <em>Composite Switch Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getCompositeSwitchKind()
	 * @generated
	 */
	int COMPOSITE_SWITCH_KIND = 76;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind <em>Structure Material Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getStructureMaterialKind()
	 * @generated
	 */
	int STRUCTURE_MATERIAL_KIND = 77;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MediumKind <em>Medium Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MediumKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getMediumKind()
	 * @generated
	 */
	int MEDIUM_KIND = 78;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind <em>Anchor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getAnchorKind()
	 * @generated
	 */
	int ANCHOR_KIND = 79;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointConfigurationKind <em>Joint Configuration Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getJointConfigurationKind()
	 * @generated
	 */
	int JOINT_CONFIGURATION_KIND = 80;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FacilityKind <em>Facility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FacilityKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl#getFacilityKind()
	 * @generated
	 */
	int FACILITY_KIND = 81;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole <em>Org Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Asset Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole
	 * @generated
	 */
	EClass getOrgAssetRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation()
	 * @see #getOrgAssetRole()
	 * @generated
	 */
	EReference getOrgAssetRole_ErpOrganisation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset()
	 * @see #getOrgAssetRole()
	 * @generated
	 */
	EReference getOrgAssetRole_Asset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getPercentOwnership <em>Percent Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Ownership</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getPercentOwnership()
	 * @see #getOrgAssetRole()
	 * @generated
	 */
	EAttribute getOrgAssetRole_PercentOwnership();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo <em>Shunt Compensator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Compensator Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo
	 * @generated
	 */
	EClass getShuntCompensatorInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shunt Impedance Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo()
	 * @see #getShuntCompensatorInfo()
	 * @generated
	 */
	EReference getShuntCompensatorInfo_ShuntImpedanceInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Power Loss</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss()
	 * @see #getShuntCompensatorInfo()
	 * @generated
	 */
	EAttribute getShuntCompensatorInfo_MaxPowerLoss();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo <em>Potential Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo
	 * @generated
	 */
	EClass getPotentialTransformerInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	EReference getPotentialTransformerInfo_SecondaryRatio();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nominal Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	EReference getPotentialTransformerInfo_NominalRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	EAttribute getPotentialTransformerInfo_AccuracyClass();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	EReference getPotentialTransformerInfo_PrimaryRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Class</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	EAttribute getPotentialTransformerInfo_PtClass();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tertiary Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	EReference getPotentialTransformerInfo_TertiaryRatio();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo <em>Duct Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo
	 * @generated
	 */
	EClass getDuctInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getYCoord <em>YCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoord</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getYCoord()
	 * @see #getDuctInfo()
	 * @generated
	 */
	EAttribute getDuctInfo_YCoord();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getXCoord <em>XCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoord</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getXCoord()
	 * @see #getDuctInfo()
	 * @generated
	 */
	EAttribute getDuctInfo_XCoord();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getCableInfos <em>Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cable Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getCableInfos()
	 * @see #getDuctInfo()
	 * @generated
	 */
	EReference getDuctInfo_CableInfos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct Bank Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getDuctBankInfo()
	 * @see #getDuctInfo()
	 * @generated
	 */
	EReference getDuctInfo_DuctBankInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole <em>Doc Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Asset Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole
	 * @generated
	 */
	EClass getDocAssetRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole#getAsset()
	 * @see #getDocAssetRole()
	 * @generated
	 */
	EReference getDocAssetRole_Asset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole#getDocument()
	 * @see #getDocAssetRole()
	 * @generated
	 */
	EReference getDocAssetRole_Document();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mounting Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint
	 * @generated
	 */
	EClass getMountingPoint();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoord</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getXCoord()
	 * @see #getMountingPoint()
	 * @generated
	 */
	EAttribute getMountingPoint_XCoord();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors <em>Overhead Conductors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overhead Conductors</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors()
	 * @see #getMountingPoint()
	 * @generated
	 */
	EReference getMountingPoint_OverheadConductors();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getConnections()
	 * @see #getMountingPoint()
	 * @generated
	 */
	EReference getMountingPoint_Connections();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode()
	 * @see #getMountingPoint()
	 * @generated
	 */
	EAttribute getMountingPoint_PhaseCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoord</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getYCoord()
	 * @see #getMountingPoint()
	 * @generated
	 */
	EAttribute getMountingPoint_YCoord();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo <em>SVC Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVC Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo
	 * @generated
	 */
	EClass getSVCInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo#getCapacitiveRating <em>Capacitive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacitive Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo#getCapacitiveRating()
	 * @see #getSVCInfo()
	 * @generated
	 */
	EAttribute getSVCInfo_CapacitiveRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo#getInductiveRating <em>Inductive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inductive Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo#getInductiveRating()
	 * @see #getSVCInfo()
	 * @generated
	 */
	EAttribute getSVCInfo_InductiveRating();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo
	 * @generated
	 */
	EClass getFinancialInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostType()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_CostType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Description</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_CostDescription();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAccount()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_Account();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Transfer Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_PlantTransferDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warranty End Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_WarrantyEndDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Purchase Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_ActualPurchaseCost();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_PurchaseDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Order Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_PurchaseOrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financial Value</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_FinancialValue();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EAttribute getFinancialInfo_ValueDateTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAsset()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	EReference getFinancialInfo_Asset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Impedance Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo
	 * @generated
	 */
	EClass getShuntImpedanceInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Voltage Override</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_LowVoltageOverride();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Size</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_CellSize();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Voltage Override</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_HighVoltageOverride();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Branch Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_RegBranchKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Open</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_NormalOpen();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shunt Compensator Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EReference getShuntImpedanceInfo_ShuntCompensatorInfos();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Branch End</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_RegBranchEnd();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VReg Line Line</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_VRegLineLine();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch Operation Cycle</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_SwitchOperationCycle();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Off Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_LocalOffLevel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Phase Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_SensingPhaseCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Control Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_LocalControlKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Direct</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_BranchDirect();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Switch Operation Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_MaxSwitchOperationCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Override</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_LocalOverride();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local On Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_LocalOnLevel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Branch</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_RegBranch();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	EAttribute getShuntImpedanceInfo_ControlKind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Cabinet <em>Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cabinet</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Cabinet
	 * @generated
	 */
	EClass getCabinet();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo <em>Com Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Equipment Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo
	 * @generated
	 */
	EClass getComEquipmentInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo#getDeviceFunctions <em>Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device Functions</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo#getDeviceFunctions()
	 * @see #getComEquipmentInfo()
	 * @generated
	 */
	EReference getComEquipmentInfo_DeviceFunctions();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo <em>Breaker Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo
	 * @generated
	 */
	EClass getBreakerInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Trip</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip()
	 * @see #getBreakerInfo()
	 * @generated
	 */
	EAttribute getBreakerInfo_PhaseTrip();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.GeneratorAsset <em>Generator Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.GeneratorAsset
	 * @generated
	 */
	EClass getGeneratorAsset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo <em>Electrical Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo
	 * @generated
	 */
	EClass getElectricalInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wire Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_WireCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_IsConnected();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_B0();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssetModels <em>Electrical Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Asset Models</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssetModels()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EReference getElectricalInfo_ElectricalAssetModels();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_R0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bil</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getBil()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_Bil();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_PhaseCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_X0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_G0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_PhaseCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_RatedCurrent();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssets <em>Electrical Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssets()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EReference getElectricalInfo_ElectricalAssets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_X();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_R();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Apparent Power</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_RatedApparentPower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_G();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_B();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EAttribute getElectricalInfo_RatedVoltage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalTypeAssets <em>Electrical Type Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Type Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalTypeAssets()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	EReference getElectricalInfo_ElectricalTypeAssets();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation <em>Winding Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winding Insulation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation
	 * @generated
	 */
	EClass getWindingInsulation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Resistance</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EAttribute getWindingInsulation_InsulationResistance();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Winding</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EReference getWindingInsulation_ToWinding();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ground</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getGround()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EReference getWindingInsulation_Ground();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Observation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EReference getWindingInsulation_TransformerObservation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getStatus()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EReference getWindingInsulation_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Reactance</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EAttribute getWindingInsulation_LeakageReactance();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Winding</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EReference getWindingInsulation_FromWinding();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation PF Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	EAttribute getWindingInsulation_InsulationPFStatus();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset <em>Conductor Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset
	 * @generated
	 */
	EClass getConductorAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounding Method</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod()
	 * @see #getConductorAsset()
	 * @generated
	 */
	EAttribute getConductorAsset_GroundingMethod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuit Section</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection()
	 * @see #getConductorAsset()
	 * @generated
	 */
	EReference getConductorAsset_CircuitSection();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor Segment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment()
	 * @see #getConductorAsset()
	 * @generated
	 */
	EReference getConductorAsset_ConductorSegment();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulated</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated()
	 * @see #getConductorAsset()
	 * @generated
	 */
	EAttribute getConductorAsset_Insulated();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Horizontal</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal()
	 * @see #getConductorAsset()
	 * @generated
	 */
	EAttribute getConductorAsset_IsHorizontal();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset
	 * @generated
	 */
	EClass getTransformerAsset();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings <em>Power Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Ratings</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	EReference getTransformerAsset_PowerRatings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Observations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	EReference getTransformerAsset_TransformerObservations();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconditioned Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	EAttribute getTransformerAsset_ReconditionedDateTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	EReference getTransformerAsset_TransformerAssetModel();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	EReference getTransformerAsset_TransformerInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve <em>Asset Property Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Property Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve
	 * @generated
	 */
	EClass getAssetPropertyCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification()
	 * @see #getAssetPropertyCurve()
	 * @generated
	 */
	EReference getAssetPropertyCurve_Specification();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets()
	 * @see #getAssetPropertyCurve()
	 * @generated
	 */
	EReference getAssetPropertyCurve_Assets();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating <em>Power Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating
	 * @generated
	 */
	EClass getPowerRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooling Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind()
	 * @see #getPowerRating()
	 * @generated
	 */
	EAttribute getPowerRating_CoolingKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getPowerRating()
	 * @see #getPowerRating()
	 * @generated
	 */
	EAttribute getPowerRating_PowerRating();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets()
	 * @see #getPowerRating()
	 * @generated
	 */
	EReference getPowerRating_TransformerAssets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating#getStage()
	 * @see #getPowerRating()
	 * @generated
	 */
	EAttribute getPowerRating_Stage();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo
	 * @generated
	 */
	EClass getAssetInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getAsset()
	 * @see #getAssetInfo()
	 * @generated
	 */
	EReference getAssetInfo_Asset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getTypeAsset()
	 * @see #getAssetInfo()
	 * @generated
	 */
	EReference getAssetInfo_TypeAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getAssetModel()
	 * @see #getAssetInfo()
	 * @generated
	 */
	EReference getAssetInfo_AssetModel();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getDimensionsInfo()
	 * @see #getAssetInfo()
	 * @generated
	 */
	EReference getAssetInfo_DimensionsInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo <em>Joint Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo
	 * @generated
	 */
	EClass getJointInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo#getFillKind <em>Fill Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo#getFillKind()
	 * @see #getJointInfo()
	 * @generated
	 */
	EAttribute getJointInfo_FillKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo#getConfigurationKind <em>Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo#getConfigurationKind()
	 * @see #getJointInfo()
	 * @generated
	 */
	EAttribute getJointInfo_ConfigurationKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo#getInsulation <em>Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo#getInsulation()
	 * @see #getJointInfo()
	 * @generated
	 */
	EAttribute getJointInfo_Insulation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection <em>Mounting Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mounting Connection</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection
	 * @generated
	 */
	EClass getMountingConnection();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos <em>Structure Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structure Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos()
	 * @see #getMountingConnection()
	 * @generated
	 */
	EReference getMountingConnection_StructureInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints <em>Mounting Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mounting Points</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints()
	 * @see #getMountingConnection()
	 * @generated
	 */
	EReference getMountingConnection_MountingPoints();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationInfo <em>Substation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationInfo
	 * @generated
	 */
	EClass getSubstationInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationInfo#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationInfo#getFunction()
	 * @see #getSubstationInfo()
	 * @generated
	 */
	EAttribute getSubstationInfo_Function();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo <em>Protection Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Equipment Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo
	 * @generated
	 */
	EClass getProtectionEquipmentInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Trip</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip()
	 * @see #getProtectionEquipmentInfo()
	 * @generated
	 */
	EAttribute getProtectionEquipmentInfo_PhaseTrip();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip()
	 * @see #getProtectionEquipmentInfo()
	 * @generated
	 */
	EAttribute getProtectionEquipmentInfo_GroundTrip();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo <em>Surge Protector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surge Protector Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo
	 * @generated
	 */
	EClass getSurgeProtectorInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Design Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	EAttribute getSurgeProtectorInfo_NominalDesignVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Current Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	EAttribute getSurgeProtectorInfo_MaxCurrentRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Continous Operating Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	EAttribute getSurgeProtectorInfo_MaxContinousOperatingVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Energy Absorption</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	EAttribute getSurgeProtectorInfo_MaxEnergyAbsorption();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo <em>Underground Structure Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underground Structure Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo
	 * @generated
	 */
	EClass getUndergroundStructureInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getMaterial()
	 * @see #getUndergroundStructureInfo()
	 * @generated
	 */
	EAttribute getUndergroundStructureInfo_Material();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#isHasVentilation <em>Has Ventilation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Ventilation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#isHasVentilation()
	 * @see #getUndergroundStructureInfo()
	 * @generated
	 */
	EAttribute getUndergroundStructureInfo_HasVentilation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sealing Warranty Expires Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getSealingWarrantyExpiresDate()
	 * @see #getUndergroundStructureInfo()
	 * @generated
	 */
	EAttribute getUndergroundStructureInfo_SealingWarrantyExpiresDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getKind()
	 * @see #getUndergroundStructureInfo()
	 * @generated
	 */
	EAttribute getUndergroundStructureInfo_Kind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getKind()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getSequenceNumber()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getLimits()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Limits();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_CompatibleUnits();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ProcedureDataSets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureValues <em>Procedure Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Values</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureValues()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ProcedureValues();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getCorporateCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_CorporateCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getInstruction()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Instruction();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium
	 * @generated
	 */
	EClass getMedium();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getVolumeSpec <em>Volume Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Spec</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getVolumeSpec()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_VolumeSpec();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getKind()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_Kind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getAssets()
	 * @see #getMedium()
	 * @generated
	 */
	EReference getMedium_Assets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getSpecification()
	 * @see #getMedium()
	 * @generated
	 */
	EReference getMedium_Specification();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo <em>Structure Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo
	 * @generated
	 */
	EClass getStructureInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getStructureSupportInfos <em>Structure Support Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structure Support Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getStructureSupportInfos()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EReference getStructureInfo_StructureSupportInfos();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getWeedRemovedDate <em>Weed Removed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weed Removed Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getWeedRemovedDate()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_WeedRemovedDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantName <em>Fumigant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fumigant Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantName()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_FumigantName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantAppliedDate <em>Fumigant Applied Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fumigant Applied Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantAppliedDate()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_FumigantAppliedDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#isRemoveWeed <em>Remove Weed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Weed</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#isRemoveWeed()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_RemoveWeed();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getHeight()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_Height();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMaterialKind <em>Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMaterialKind()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_MaterialKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getRatedVoltage()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EAttribute getStructureInfo_RatedVoltage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMountingConnections <em>Mounting Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mounting Connections</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMountingConnections()
	 * @see #getStructureInfo()
	 * @generated
	 */
	EReference getStructureInfo_MountingConnections();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo <em>FACTS Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FACTS Device Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo
	 * @generated
	 */
	EClass getFACTSDeviceInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo#getKind()
	 * @see #getFACTSDeviceInfo()
	 * @generated
	 */
	EAttribute getFACTSDeviceInfo_Kind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo <em>Switch Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo
	 * @generated
	 */
	EClass getSwitchInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gang</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isGang()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_Gang();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_PoleCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupting Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_InterruptingRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dielectric Strength</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_DielectricStrength();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Break</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_LoadBreak();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Current</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_MinimumCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Withstand Current</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_WithstandCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Making Capacity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_MakingCapacity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isRemote()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	EAttribute getSwitchInfo_Remote();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet <em>Procedure Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Data Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet
	 * @generated
	 */
	EClass getProcedureDataSet();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	EAttribute getProcedureDataSet_CompletedDateTime();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	EReference getProcedureDataSet_MeasurementValues();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Observations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	EReference getProcedureDataSet_TransformerObservations();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	EReference getProcedureDataSet_Properties();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	EReference getProcedureDataSet_Procedure();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo <em>Streetlight Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streetlight Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo
	 * @generated
	 */
	EClass getStreetlightInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLightRating <em>Light Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLightRating()
	 * @see #getStreetlightInfo()
	 * @generated
	 */
	EAttribute getStreetlightInfo_LightRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getArmLength <em>Arm Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arm Length</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getArmLength()
	 * @see #getStreetlightInfo()
	 * @generated
	 */
	EAttribute getStreetlightInfo_ArmLength();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getPole <em>Pole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pole</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getPole()
	 * @see #getStreetlightInfo()
	 * @generated
	 */
	EReference getStreetlightInfo_Pole();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLampKind <em>Lamp Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lamp Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLampKind()
	 * @see #getStreetlightInfo()
	 * @generated
	 */
	EAttribute getStreetlightInfo_LampKind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensions Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo
	 * @generated
	 */
	EClass getDimensionsInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EAttribute getDimensionsInfo_Orientation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EReference getDimensionsInfo_Locations();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Width</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EAttribute getDimensionsInfo_SizeWidth();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EReference getDimensionsInfo_Specifications();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Depth</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EAttribute getDimensionsInfo_SizeDepth();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Diameter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EAttribute getDimensionsInfo_SizeDiameter();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos <em>Asset Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EReference getDimensionsInfo_AssetInfos();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Length</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	EAttribute getDimensionsInfo_SizeLength();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo <em>Work Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Equipment Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo
	 * @generated
	 */
	EClass getWorkEquipmentInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getCrew()
	 * @see #getWorkEquipmentInfo()
	 * @generated
	 */
	EReference getWorkEquipmentInfo_Crew();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getUsages()
	 * @see #getWorkEquipmentInfo()
	 * @generated
	 */
	EReference getWorkEquipmentInfo_Usages();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo <em>Current Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo
	 * @generated
	 */
	EClass getCurrentTransformerInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_AccuracyClass();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Class</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_CtClass();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio <em>Max Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EReference getCurrentTransformerInfo_MaxRatio();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EReference getCurrentTransformerInfo_PrimaryRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Burden</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_CoreBurden();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Fls Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_PrimaryFlsRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_AccuracyLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knee Point Current</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_KneePointCurrent();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tertiary Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EReference getCurrentTransformerInfo_TertiaryRatio();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nominal Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EReference getCurrentTransformerInfo_NominalRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_Usage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Fls Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_SecondaryFlsRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tertiary Fls Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_TertiaryFlsRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_CoreCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knee Point Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EAttribute getCurrentTransformerInfo_KneePointVoltage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Ratio</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	EReference getCurrentTransformerInfo_SecondaryRatio();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo <em>Structure Support Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Support Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo
	 * @generated
	 */
	EClass getStructureSupportInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorKind <em>Anchor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorKind()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_AnchorKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getKind()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSize()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_Size();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSecuredStructure <em>Secured Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secured Structure</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSecuredStructure()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EReference getStructureSupportInfo_SecuredStructure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodCount <em>Anchor Rod Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Rod Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodCount()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_AnchorRodCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getLength()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_Length();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodLength <em>Anchor Rod Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Rod Length</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodLength()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_AnchorRodLength();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getDirection()
	 * @see #getStructureSupportInfo()
	 * @generated
	 */
	EAttribute getStructureSupportInfo_Direction();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset <em>Electrical Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset
	 * @generated
	 */
	EClass getElectricalAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getPhaseCode()
	 * @see #getElectricalAsset()
	 * @generated
	 */
	EAttribute getElectricalAsset_PhaseCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#isIsConnected()
	 * @see #getElectricalAsset()
	 * @generated
	 */
	EAttribute getElectricalAsset_IsConnected();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getConductingEquipment()
	 * @see #getElectricalAsset()
	 * @generated
	 */
	EReference getElectricalAsset_ConductingEquipment();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getElectricalInfos <em>Electrical Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getElectricalInfos()
	 * @see #getElectricalAsset()
	 * @generated
	 */
	EReference getElectricalAsset_ElectricalInfos();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent <em>Failure Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Event</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent
	 * @generated
	 */
	EClass getFailureEvent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Isolation Method</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod()
	 * @see #getFailureEvent()
	 * @generated
	 */
	EAttribute getFailureEvent_FailureIsolationMethod();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode()
	 * @see #getFailureEvent()
	 * @generated
	 */
	EAttribute getFailureEvent_CorporateCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Locating Method</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod()
	 * @see #getFailureEvent()
	 * @generated
	 */
	EAttribute getFailureEvent_FaultLocatingMethod();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent#getLocation()
	 * @see #getFailureEvent()
	 * @generated
	 */
	EAttribute getFailureEvent_Location();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo <em>Recloser Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recloser Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo
	 * @generated
	 */
	EClass getRecloserInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Trip Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	EAttribute getRecloserInfo_PhaseTripRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip Normal Enabled</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	EAttribute getRecloserInfo_GroundTripNormalEnabled();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	EAttribute getRecloserInfo_GroundTripRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reclose Lockout Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	EAttribute getRecloserInfo_RecloseLockoutCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip Capable</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	EAttribute getRecloserInfo_GroundTripCapable();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo <em>Tower Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tower Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo
	 * @generated
	 */
	EClass getTowerInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo#getConstructionKind <em>Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo#getConstructionKind()
	 * @see #getTowerInfo()
	 * @generated
	 */
	EAttribute getTowerInfo_ConstructionKind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet <em>Test Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Data Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet
	 * @generated
	 */
	EClass getTestDataSet();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specimen To Lab Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime()
	 * @see #getTestDataSet()
	 * @generated
	 */
	EAttribute getTestDataSet_SpecimenToLabDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specimen ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID()
	 * @see #getTestDataSet()
	 * @generated
	 */
	EAttribute getTestDataSet_SpecimenID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet#getConclusion()
	 * @see #getTestDataSet()
	 * @generated
	 */
	EAttribute getTestDataSet_Conclusion();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetProperites <em>Asset Properites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Properites</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetProperites()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_AssetProperites();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reliability Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ReliabilityInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ratings</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getRatings()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Ratings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification Requirements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_QualificationRequirements();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves <em>Asset Property Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Property Curves</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_AssetPropertyCurves();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos <em>Dimensions Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_DimensionsInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getMediums <em>Mediums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mediums</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getMediums()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Mediums();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo <em>Composite Switch Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Switch Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo
	 * @generated
	 */
	EClass getCompositeSwitchInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	EAttribute getCompositeSwitchInfo_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Op Mode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	EAttribute getCompositeSwitchInfo_InitOpMode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGang <em>Gang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gang</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGang()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	EAttribute getCompositeSwitchInfo_Gang();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch State Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	EAttribute getCompositeSwitchInfo_SwitchStateCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupting Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	EAttribute getCompositeSwitchInfo_InterruptingRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	EAttribute getCompositeSwitchInfo_Remote();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Facility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Facility
	 * @generated
	 */
	EClass getFacility();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Facility#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Facility#getKind()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_Kind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo <em>Fault Indicator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Indicator Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo
	 * @generated
	 */
	EClass getFaultIndicatorInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind()
	 * @see #getFaultIndicatorInfo()
	 * @generated
	 */
	EAttribute getFaultIndicatorInfo_ResetKind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo <em>Reliability Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo
	 * @generated
	 */
	EClass getReliabilityInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mom Failure Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	EAttribute getReliabilityInfo_MomFailureRate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	EReference getReliabilityInfo_Assets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTTR</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	EAttribute getReliabilityInfo_MTTR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	EReference getReliabilityInfo_Specification();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Observation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation
	 * @generated
	 */
	EClass getTransformerObservation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil IFT</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_OilIFT();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Spot Temp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_HotSpotTemp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Dielectric Strength</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_OilDielectricStrength();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EReference getTransformerObservation_TransformerAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Oil Temp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_TopOilTemp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Vibration</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_PumpVibration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bushing Temp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_BushingTemp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Content</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_WaterContent();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EReference getTransformerObservation_Transformer();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EReference getTransformerObservation_ProcedureDataSets();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq Resp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_FreqResp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Furfural DP</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_FurfuralDP();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bushing Insultation PFs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EReference getTransformerObservation_BushingInsultationPFs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_OilLevel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Color</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_OilColor();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs <em>Winding Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winding Insulation PFs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EReference getTransformerObservation_WindingInsulationPFs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getStatus()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EReference getTransformerObservation_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dga</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getDga()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_Dga();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Neutralization Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	EAttribute getTransformerObservation_OilNeutralizationNumber();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo
	 * @generated
	 */
	EClass getToolInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo#getCrew()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_Crew();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo#getLastCalibrationDate <em>Last Calibration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Calibration Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo#getLastCalibrationDate()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_LastCalibrationDate();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct Bank Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo
	 * @generated
	 */
	EClass getDuctBankInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getDuctInfos <em>Duct Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Duct Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getDuctInfos()
	 * @see #getDuctBankInfo()
	 * @generated
	 */
	EReference getDuctBankInfo_DuctInfos();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getCircuitCount <em>Circuit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getCircuitCount()
	 * @see #getDuctBankInfo()
	 * @generated
	 */
	EAttribute getDuctBankInfo_CircuitCount();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo <em>Vehicle Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo
	 * @generated
	 */
	EClass getVehicleInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getUsageKind <em>Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getUsageKind()
	 * @see #getVehicleInfo()
	 * @generated
	 */
	EAttribute getVehicleInfo_UsageKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReadDateTime <em>Odometer Read Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odometer Read Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReadDateTime()
	 * @see #getVehicleInfo()
	 * @generated
	 */
	EAttribute getVehicleInfo_OdometerReadDateTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getCrew()
	 * @see #getVehicleInfo()
	 * @generated
	 */
	EReference getVehicleInfo_Crew();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReading <em>Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odometer Reading</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReading()
	 * @see #getVehicleInfo()
	 * @generated
	 */
	EAttribute getVehicleInfo_OdometerReading();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF <em>Bushing Insulation PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bushing Insulation PF</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF
	 * @generated
	 */
	EClass getBushingInsulationPF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bushing Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	EReference getBushingInsulationPF_BushingInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	EReference getBushingInsulationPF_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	EAttribute getBushingInsulationPF_TestKind();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Observation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	EReference getBushingInsulationPF_TransformerObservation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bushing Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo
	 * @generated
	 */
	EClass getBushingInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2 Power Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2PowerFactor()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EAttribute getBushingInfo_C2PowerFactor();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bushing Insulation PFs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getBushingInsulationPFs()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EReference getBushingInfo_BushingInsulationPFs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2 Capacitance</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2Capacitance()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EAttribute getBushingInfo_C2Capacitance();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1 Capacitance</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1Capacitance()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EAttribute getBushingInfo_C1Capacitance();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getTerminal()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EReference getBushingInfo_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1 Power Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1PowerFactor()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EAttribute getBushingInfo_C1PowerFactor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getInsulationKind <em>Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getInsulationKind()
	 * @see #getBushingInfo()
	 * @generated
	 */
	EAttribute getBushingInfo_InsulationKind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole <em>Asset Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Asset Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole
	 * @generated
	 */
	EClass getAssetAssetRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset()
	 * @see #getAssetAssetRole()
	 * @generated
	 */
	EReference getAssetAssetRole_ToAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset()
	 * @see #getAssetAssetRole()
	 * @generated
	 */
	EReference getAssetAssetRole_FromAsset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo <em>Pole Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pole Info</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo
	 * @generated
	 */
	EClass getPoleInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatedDateTime <em>Treated Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treated Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatedDateTime()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_TreatedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#isBreastBlock <em>Breast Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breast Block</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#isBreastBlock()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_BreastBlock();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getClassification()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_Classification();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getPreservativeKind <em>Preservative Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preservative Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getPreservativeKind()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_PreservativeKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getJpaReference <em>Jpa Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jpa Reference</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getJpaReference()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_JpaReference();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getBaseKind <em>Base Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getBaseKind()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_BaseKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getDiameter()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_Diameter();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getStreetlights <em>Streetlights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Streetlights</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getStreetlights()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EReference getPoleInfo_Streetlights();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatmentKind <em>Treatment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatment Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatmentKind()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_TreatmentKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getConstruction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getConstruction()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_Construction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getLength()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_Length();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getSpeciesType <em>Species Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getSpeciesType()
	 * @see #getPoleInfo()
	 * @generated
	 */
	EAttribute getPoleInfo_SpeciesType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset <em>Tap Changer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset
	 * @generated
	 */
	EClass getTapChangerAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset#getTapChangerAssetModel <em>Tap Changer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset#getTapChangerAssetModel()
	 * @see #getTapChangerAsset()
	 * @generated
	 */
	EReference getTapChangerAsset_TapChangerAssetModel();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind <em>Pole Base Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pole Base Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @generated
	 */
	EEnum getPoleBaseKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind <em>Shunt Impedance Local Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shunt Impedance Local Control Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @generated
	 */
	EEnum getShuntImpedanceLocalControlKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointFillKind <em>Joint Fill Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Joint Fill Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointFillKind
	 * @generated
	 */
	EEnum getJointFillKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureKind <em>Procedure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureKind
	 * @generated
	 */
	EEnum getProcedureKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightLampKind <em>Streetlight Lamp Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Streetlight Lamp Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @generated
	 */
	EEnum getStreetlightLampKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind <em>Shunt Impedance Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shunt Impedance Control Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @generated
	 */
	EEnum getShuntImpedanceControlKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind <em>Failure Isolation Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Isolation Method Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @generated
	 */
	EEnum getFailureIsolationMethodKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind <em>Underground Structure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Underground Structure Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @generated
	 */
	EEnum getUndergroundStructureKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind <em>Substation Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substation Function Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @generated
	 */
	EEnum getSubstationFunctionKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CoolingKind <em>Cooling Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cooling Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CoolingKind
	 * @generated
	 */
	EEnum getCoolingKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind <em>Pole Preservative Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pole Preservative Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @generated
	 */
	EEnum getPolePreservativeKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind <em>Pole Treatment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pole Treatment Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @generated
	 */
	EEnum getPoleTreatmentKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind <em>Fault Indicator Reset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Indicator Reset Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @generated
	 */
	EEnum getFaultIndicatorResetKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind <em>FACTS Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FACTS Device Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind
	 * @generated
	 */
	EEnum getFACTSDeviceKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind <em>Structure Support Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Support Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @generated
	 */
	EEnum getStructureSupportKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind <em>Vehicle Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Usage Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @generated
	 */
	EEnum getVehicleUsageKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind <em>Regulation Branch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regulation Branch Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @generated
	 */
	EEnum getRegulationBranchKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind <em>Tower Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tower Construction Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @generated
	 */
	EEnum getTowerConstructionKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind <em>Bushing Insulation Pf Test Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bushing Insulation Pf Test Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @generated
	 */
	EEnum getBushingInsulationPfTestKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationKind <em>Bushing Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bushing Insulation Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @generated
	 */
	EEnum getBushingInsulationKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind <em>Composite Switch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Switch Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @generated
	 */
	EEnum getCompositeSwitchKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind <em>Structure Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Material Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @generated
	 */
	EEnum getStructureMaterialKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MediumKind <em>Medium Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medium Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MediumKind
	 * @generated
	 */
	EEnum getMediumKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind <em>Anchor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anchor Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind
	 * @generated
	 */
	EEnum getAnchorKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointConfigurationKind <em>Joint Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Joint Configuration Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @generated
	 */
	EEnum getJointConfigurationKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FacilityKind <em>Facility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facility Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FacilityKind
	 * @generated
	 */
	EEnum getFacilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfAssetsFactory getInfAssetsFactory();

} //InfAssetsPackage
