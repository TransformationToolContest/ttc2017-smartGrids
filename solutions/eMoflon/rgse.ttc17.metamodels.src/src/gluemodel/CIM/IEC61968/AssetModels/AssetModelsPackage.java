/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

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
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package is an extension of Assets package and contains the core information classes that support asset management and different network and work planning applications with specialized documentation classes describing assets of a particular product model made by a manufacturer. There are typically many instances of an asset associated with a single asset model. It also contains \"lightweight\" *Info classes, which hold model attributes that can be referenced by not only Assets but also by ConductingEquipments.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package is an extension of Assets package and contains the core information classes that support asset management and different network and work planning applications with specialized documentation classes describing assets of a particular product model made by a manufacturer. There are typically many instances of an asset associated with a single asset model. It also contains \"lightweight\" *Info classes, which hold model attributes that can be referenced by not only Assets but also by ConductingEquipments.'"
 * @generated
 */
public interface AssetModelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AssetModels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#AssetModels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimAssetModels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssetModelsPackage eINSTANCE = gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl <em>Conductor Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorInfo()
	 * @generated
	 */
	int CONDUCTOR_INFO = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__CONDUCTOR_SEGMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__PHASE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__INSULATED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__INSULATION_THICKNESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__USAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__WIRE_ARRANGEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO__INSULATION_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.WireTypeImpl <em>Wire Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.WireTypeImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getWireType()
	 * @generated
	 */
	int WIRE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>RAC75</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__RAC75 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RAC50</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__RAC50 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__RADIUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concentric Neutral Cable Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__STRAND_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Core Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__CORE_RADIUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>RAC25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__RAC25 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>RDC20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__RDC20 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__SIZE_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Core Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__CORE_STRAND_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__WIRE_ARRANGEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__RATED_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gmr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__GMR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.CableInfoImpl <em>Cable Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.CableInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableInfo()
	 * @generated
	 */
	int CABLE_INFO = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__UUID = CONDUCTOR_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__MRID = CONDUCTOR_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__NAME = CONDUCTOR_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__DESCRIPTION = CONDUCTOR_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__PATH_NAME = CONDUCTOR_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__MODELING_AUTHORITY_SET = CONDUCTOR_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__LOCAL_NAME = CONDUCTOR_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__ALIAS_NAME = CONDUCTOR_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__CONDUCTOR_SEGMENTS = CONDUCTOR_INFO__CONDUCTOR_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__PHASE_COUNT = CONDUCTOR_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__INSULATED = CONDUCTOR_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__INSULATION_THICKNESS = CONDUCTOR_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__USAGE = CONDUCTOR_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__WIRE_ARRANGEMENTS = CONDUCTOR_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__INSULATION_MATERIAL = CONDUCTOR_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__SHEATH_AS_NEUTRAL = CONDUCTOR_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__IS_STRAND_FILL = CONDUCTOR_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__OUTER_JACKET_KIND = CONDUCTOR_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__CONSTRUCTION_KIND = CONDUCTOR_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__DIAMETER_OVER_SCREEN = CONDUCTOR_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__NOMINAL_TEMPERATURE = CONDUCTOR_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__DIAMETER_OVER_JACKET = CONDUCTOR_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__DIAMETER_OVER_CORE = CONDUCTOR_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__DIAMETER_OVER_INSULATION = CONDUCTOR_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Shield Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__SHIELD_MATERIAL = CONDUCTOR_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO__DUCT_BANK_INFO = CONDUCTOR_INFO_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO_FEATURE_COUNT = CONDUCTOR_INFO_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_INFO_OPERATION_COUNT = CONDUCTOR_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl <em>Concentric Neutral Cable Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConcentricNeutralCableInfo()
	 * @generated
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__UUID = CABLE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__MRID = CABLE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__NAME = CABLE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DESCRIPTION = CABLE_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__PATH_NAME = CABLE_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__MODELING_AUTHORITY_SET = CABLE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__LOCAL_NAME = CABLE_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__ALIAS_NAME = CABLE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__CONDUCTOR_SEGMENTS = CABLE_INFO__CONDUCTOR_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__PHASE_COUNT = CABLE_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__INSULATED = CABLE_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__INSULATION_THICKNESS = CABLE_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__USAGE = CABLE_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_ARRANGEMENTS = CABLE_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__INSULATION_MATERIAL = CABLE_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__SHEATH_AS_NEUTRAL = CABLE_INFO__SHEATH_AS_NEUTRAL;

	/**
	 * The feature id for the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__IS_STRAND_FILL = CABLE_INFO__IS_STRAND_FILL;

	/**
	 * The feature id for the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__OUTER_JACKET_KIND = CABLE_INFO__OUTER_JACKET_KIND;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__CONSTRUCTION_KIND = CABLE_INFO__CONSTRUCTION_KIND;

	/**
	 * The feature id for the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_SCREEN = CABLE_INFO__DIAMETER_OVER_SCREEN;

	/**
	 * The feature id for the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__NOMINAL_TEMPERATURE = CABLE_INFO__NOMINAL_TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_JACKET = CABLE_INFO__DIAMETER_OVER_JACKET;

	/**
	 * The feature id for the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_CORE = CABLE_INFO__DIAMETER_OVER_CORE;

	/**
	 * The feature id for the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_INSULATION = CABLE_INFO__DIAMETER_OVER_INSULATION;

	/**
	 * The feature id for the '<em><b>Shield Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__SHIELD_MATERIAL = CABLE_INFO__SHIELD_MATERIAL;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DUCT_BANK_INFO = CABLE_INFO__DUCT_BANK_INFO;

	/**
	 * The feature id for the '<em><b>Diameter Over Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL = CABLE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neutral Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT = CABLE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wire Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE = CABLE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concentric Neutral Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO_FEATURE_COUNT = CABLE_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concentric Neutral Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRIC_NEUTRAL_CABLE_INFO_OPERATION_COUNT = CABLE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl <em>Winding Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getWindingInfo()
	 * @generated
	 */
	int WINDING_INFO = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Emergency S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__EMERGENCY_S = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__PHASE_ANGLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Winding Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__WINDING_TESTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Windings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__WINDINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__RATED_S = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__RATED_U = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__R = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Short Term S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__SHORT_TERM_S = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>To Winding Specs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__TO_WINDING_SPECS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connection Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__CONNECTION_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Insulation U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__INSULATION_U = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO__TRANSFORMER_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Winding Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Winding Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDING_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl <em>Overhead Conductor Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getOverheadConductorInfo()
	 * @generated
	 */
	int OVERHEAD_CONDUCTOR_INFO = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__UUID = CONDUCTOR_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__MRID = CONDUCTOR_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__NAME = CONDUCTOR_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__DESCRIPTION = CONDUCTOR_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__PATH_NAME = CONDUCTOR_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__MODELING_AUTHORITY_SET = CONDUCTOR_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__LOCAL_NAME = CONDUCTOR_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__ALIAS_NAME = CONDUCTOR_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__CONDUCTOR_SEGMENTS = CONDUCTOR_INFO__CONDUCTOR_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__PHASE_COUNT = CONDUCTOR_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__INSULATED = CONDUCTOR_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__INSULATION_THICKNESS = CONDUCTOR_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__USAGE = CONDUCTOR_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__WIRE_ARRANGEMENTS = CONDUCTOR_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__INSULATION_MATERIAL = CONDUCTOR_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Neutral Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS = CONDUCTOR_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase Conductor Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING = CONDUCTOR_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT = CONDUCTOR_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mounting Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT = CONDUCTOR_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Overhead Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO_FEATURE_COUNT = CONDUCTOR_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Overhead Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONDUCTOR_INFO_OPERATION_COUNT = CONDUCTOR_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl <em>To Winding Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getToWindingSpec()
	 * @generated
	 */
	int TO_WINDING_SPEC = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__VOLTAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open Circuit Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__TO_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__TO_TAP_STEP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__PHASE_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Short Circuit Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>To Winding Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>To Winding Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_WINDING_SPEC_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelImpl <em>Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getAssetModel()
	 * @generated
	 */
	int ASSET_MODEL = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__MODEL_VERSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__ASSET_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__MODEL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__CORPORATE_STANDARD_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__ERP_INVENTORY_COUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__USAGE_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL__WEIGHT_TOTAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_MODEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.DistributionWindingTestImpl <em>Distribution Winding Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.DistributionWindingTestImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getDistributionWindingTest()
	 * @generated
	 */
	int DISTRIBUTION_WINDING_TEST = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>From Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__FROM_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distribution Winding Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Distribution Winding Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_WINDING_TEST_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl <em>Open Circuit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getOpenCircuitTest()
	 * @generated
	 */
	int OPEN_CIRCUIT_TEST = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__UUID = DISTRIBUTION_WINDING_TEST__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__MRID = DISTRIBUTION_WINDING_TEST__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__NAME = DISTRIBUTION_WINDING_TEST__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__DESCRIPTION = DISTRIBUTION_WINDING_TEST__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__PATH_NAME = DISTRIBUTION_WINDING_TEST__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__MODELING_AUTHORITY_SET = DISTRIBUTION_WINDING_TEST__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__LOCAL_NAME = DISTRIBUTION_WINDING_TEST__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__ALIAS_NAME = DISTRIBUTION_WINDING_TEST__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>From Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__FROM_WINDING = DISTRIBUTION_WINDING_TEST__FROM_WINDING;

	/**
	 * The feature id for the '<em><b>From Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__FROM_TAP_STEP = DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP;

	/**
	 * The feature id for the '<em><b>No Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__NO_LOAD_LOSS = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exciting Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__EXCITING_CURRENT = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exciting Current Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measured Winding Specs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Load Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Open Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST_FEATURE_COUNT = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Open Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CIRCUIT_TEST_OPERATION_COUNT = DISTRIBUTION_WINDING_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl <em>Short Circuit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getShortCircuitTest()
	 * @generated
	 */
	int SHORT_CIRCUIT_TEST = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__UUID = DISTRIBUTION_WINDING_TEST__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__MRID = DISTRIBUTION_WINDING_TEST__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__NAME = DISTRIBUTION_WINDING_TEST__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__DESCRIPTION = DISTRIBUTION_WINDING_TEST__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__PATH_NAME = DISTRIBUTION_WINDING_TEST__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__MODELING_AUTHORITY_SET = DISTRIBUTION_WINDING_TEST__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__LOCAL_NAME = DISTRIBUTION_WINDING_TEST__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__ALIAS_NAME = DISTRIBUTION_WINDING_TEST__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>From Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__FROM_WINDING = DISTRIBUTION_WINDING_TEST__FROM_WINDING;

	/**
	 * The feature id for the '<em><b>From Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__FROM_TAP_STEP = DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__LOAD_LOSS = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leakage Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shorted Winding Specs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Leakage Impedance Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Short Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST_FEATURE_COUNT = DISTRIBUTION_WINDING_TEST_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Short Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_CIRCUIT_TEST_OPERATION_COUNT = DISTRIBUTION_WINDING_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.EndDeviceModelImpl <em>End Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.EndDeviceModelImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getEndDeviceModel()
	 * @generated
	 */
	int END_DEVICE_MODEL = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__UUID = ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__MRID = ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__NAME = ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__DESCRIPTION = ASSET_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__PATH_NAME = ASSET_MODEL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__MODELING_AUTHORITY_SET = ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__LOCAL_NAME = ASSET_MODEL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__ALIAS_NAME = ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__MODEL_VERSION = ASSET_MODEL__MODEL_VERSION;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__ASSET_INFO = ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__MODEL_NUMBER = ASSET_MODEL__MODEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__TYPE_ASSET = ASSET_MODEL__TYPE_ASSET;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__CORPORATE_STANDARD_KIND = ASSET_MODEL__CORPORATE_STANDARD_KIND;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__ERP_INVENTORY_COUNTS = ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__USAGE_KIND = ASSET_MODEL__USAGE_KIND;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__WEIGHT_TOTAL = ASSET_MODEL__WEIGHT_TOTAL;

	/**
	 * The feature id for the '<em><b>End Device Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL__END_DEVICE_ASSETS = ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL_FEATURE_COUNT = ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_MODEL_OPERATION_COUNT = ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl <em>Transformer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getTransformerInfo()
	 * @generated
	 */
	int TRANSFORMER_INFO = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__TRANSFORMERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Winding Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__WINDING_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO__TRANSFORMER_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.WireArrangementImpl <em>Wire Arrangement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.WireArrangementImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getWireArrangement()
	 * @generated
	 */
	int WIRE_ARRANGEMENT = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Wire Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__WIRE_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conductor Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__CONDUCTOR_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mounting Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__MOUNTING_POINT_X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mounting Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__MOUNTING_POINT_Y = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT__POSITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Wire Arrangement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Wire Arrangement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_ARRANGEMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.TapeShieldCableInfoImpl <em>Tape Shield Cable Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.TapeShieldCableInfoImpl
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getTapeShieldCableInfo()
	 * @generated
	 */
	int TAPE_SHIELD_CABLE_INFO = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__UUID = CABLE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__MRID = CABLE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__NAME = CABLE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__DESCRIPTION = CABLE_INFO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__PATH_NAME = CABLE_INFO__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__MODELING_AUTHORITY_SET = CABLE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__LOCAL_NAME = CABLE_INFO__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__ALIAS_NAME = CABLE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Conductor Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__CONDUCTOR_SEGMENTS = CABLE_INFO__CONDUCTOR_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__PHASE_COUNT = CABLE_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__INSULATED = CABLE_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__INSULATION_THICKNESS = CABLE_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__USAGE = CABLE_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__WIRE_ARRANGEMENTS = CABLE_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__INSULATION_MATERIAL = CABLE_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__SHEATH_AS_NEUTRAL = CABLE_INFO__SHEATH_AS_NEUTRAL;

	/**
	 * The feature id for the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__IS_STRAND_FILL = CABLE_INFO__IS_STRAND_FILL;

	/**
	 * The feature id for the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__OUTER_JACKET_KIND = CABLE_INFO__OUTER_JACKET_KIND;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__CONSTRUCTION_KIND = CABLE_INFO__CONSTRUCTION_KIND;

	/**
	 * The feature id for the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_SCREEN = CABLE_INFO__DIAMETER_OVER_SCREEN;

	/**
	 * The feature id for the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__NOMINAL_TEMPERATURE = CABLE_INFO__NOMINAL_TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_JACKET = CABLE_INFO__DIAMETER_OVER_JACKET;

	/**
	 * The feature id for the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_CORE = CABLE_INFO__DIAMETER_OVER_CORE;

	/**
	 * The feature id for the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_INSULATION = CABLE_INFO__DIAMETER_OVER_INSULATION;

	/**
	 * The feature id for the '<em><b>Shield Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__SHIELD_MATERIAL = CABLE_INFO__SHIELD_MATERIAL;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__DUCT_BANK_INFO = CABLE_INFO__DUCT_BANK_INFO;

	/**
	 * The feature id for the '<em><b>Tape Lap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__TAPE_LAP = CABLE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tape Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS = CABLE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tape Shield Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO_FEATURE_COUNT = CABLE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tape Shield Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPE_SHIELD_CABLE_INFO_OPERATION_COUNT = CABLE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind <em>Conductor Material Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorMaterialKind()
	 * @generated
	 */
	int CONDUCTOR_MATERIAL_KIND = 15;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.CorporateStandardKind <em>Corporate Standard Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.CorporateStandardKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCorporateStandardKind()
	 * @generated
	 */
	int CORPORATE_STANDARD_KIND = 16;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModelUsageKind <em>Asset Model Usage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelUsageKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getAssetModelUsageKind()
	 * @generated
	 */
	int ASSET_MODEL_USAGE_KIND = 17;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind <em>Cable Outer Jacket Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableOuterJacketKind()
	 * @generated
	 */
	int CABLE_OUTER_JACKET_KIND = 18;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind <em>Conductor Usage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorUsageKind()
	 * @generated
	 */
	int CONDUCTOR_USAGE_KIND = 19;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind <em>Cable Construction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableConstructionKind()
	 * @generated
	 */
	int CABLE_CONSTRUCTION_KIND = 20;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind <em>Conductor Insulation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorInsulationKind()
	 * @generated
	 */
	int CONDUCTOR_INSULATION_KIND = 21;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind <em>Cable Shield Material Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind
	 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableShieldMaterialKind()
	 * @generated
	 */
	int CABLE_SHIELD_MATERIAL_KIND = 22;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo
	 * @generated
	 */
	EClass getConductorInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getConductorSegments <em>Conductor Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Segments</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getConductorSegments()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EReference getConductorInfo_ConductorSegments();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getPhaseCount()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EAttribute getConductorInfo_PhaseCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulated</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#isInsulated()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EAttribute getConductorInfo_Insulated();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Thickness</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getInsulationThickness()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EAttribute getConductorInfo_InsulationThickness();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getUsage()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EAttribute getConductorInfo_Usage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire Arrangements</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getWireArrangements()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EReference getConductorInfo_WireArrangements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Material</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial()
	 * @see #getConductorInfo()
	 * @generated
	 */
	EAttribute getConductorInfo_InsulationMaterial();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Type</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType
	 * @generated
	 */
	EClass getWireType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAC75</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC75()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_RAC75();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAC50</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC50()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_RAC50();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getRadius()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_Radius();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concentric Neutral Cable Infos</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos()
	 * @see #getWireType()
	 * @generated
	 */
	EReference getWireType_ConcentricNeutralCableInfos();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strand Count</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getStrandCount()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_StrandCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Radius</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreRadius()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_CoreRadius();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAC25</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC25()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_RAC25();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDC20</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getRDC20()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_RDC20();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Description</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getSizeDescription()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_SizeDescription();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Strand Count</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreStrandCount()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_CoreStrandCount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire Arrangements</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getWireArrangements()
	 * @see #getWireType()
	 * @generated
	 */
	EReference getWireType_WireArrangements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getRatedCurrent()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_RatedCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gmr</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getGmr()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_Gmr();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getMaterial()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_Material();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo <em>Concentric Neutral Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concentric Neutral Cable Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo
	 * @generated
	 */
	EClass getConcentricNeutralCableInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Neutral</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral()
	 * @see #getConcentricNeutralCableInfo()
	 * @generated
	 */
	EAttribute getConcentricNeutralCableInfo_DiameterOverNeutral();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Strand Count</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount()
	 * @see #getConcentricNeutralCableInfo()
	 * @generated
	 */
	EAttribute getConcentricNeutralCableInfo_NeutralStrandCount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wire Type</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType()
	 * @see #getConcentricNeutralCableInfo()
	 * @generated
	 */
	EReference getConcentricNeutralCableInfo_WireType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo <em>Winding Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winding Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo
	 * @generated
	 */
	EClass getWindingInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getEmergencyS <em>Emergency S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency S</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getEmergencyS()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_EmergencyS();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getPhaseAngle <em>Phase Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Angle</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getPhaseAngle()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_PhaseAngle();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getWindingTests <em>Winding Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winding Tests</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getWindingTests()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EReference getWindingInfo_WindingTests();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getWindings <em>Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Windings</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getWindings()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EReference getWindingInfo_Windings();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedS()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_RatedS();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedU()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_RatedU();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getR()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_R();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getSequenceNumber()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getShortTermS <em>Short Term S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Term S</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getShortTermS()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_ShortTermS();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getToWindingSpecs <em>To Winding Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Winding Specs</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getToWindingSpecs()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EReference getWindingInfo_ToWindingSpecs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getConnectionKind()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_ConnectionKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getInsulationU <em>Insulation U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation U</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getInsulationU()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EAttribute getWindingInfo_InsulationU();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getTransformerInfo()
	 * @see #getWindingInfo()
	 * @generated
	 */
	EReference getWindingInfo_TransformerInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo <em>Overhead Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Conductor Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo
	 * @generated
	 */
	EClass getOverheadConductorInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Insulation Thickness</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	EAttribute getOverheadConductorInfo_NeutralInsulationThickness();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Conductor Spacing</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	EAttribute getOverheadConductorInfo_PhaseConductorSpacing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Conductor Count</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	EAttribute getOverheadConductorInfo_PhaseConductorCount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounting Point</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	EReference getOverheadConductorInfo_MountingPoint();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec <em>To Winding Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Winding Spec</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec
	 * @generated
	 */
	EClass getToWindingSpec();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getVoltage()
	 * @see #getToWindingSpec()
	 * @generated
	 */
	EAttribute getToWindingSpec_Voltage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getOpenCircuitTests <em>Open Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Open Circuit Tests</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getOpenCircuitTests()
	 * @see #getToWindingSpec()
	 * @generated
	 */
	EReference getToWindingSpec_OpenCircuitTests();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToWinding <em>To Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Winding</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToWinding()
	 * @see #getToWindingSpec()
	 * @generated
	 */
	EReference getToWindingSpec_ToWinding();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToTapStep <em>To Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Tap Step</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToTapStep()
	 * @see #getToWindingSpec()
	 * @generated
	 */
	EAttribute getToWindingSpec_ToTapStep();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getPhaseShift <em>Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Shift</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getPhaseShift()
	 * @see #getToWindingSpec()
	 * @generated
	 */
	EAttribute getToWindingSpec_PhaseShift();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getShortCircuitTests <em>Short Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Short Circuit Tests</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getShortCircuitTests()
	 * @see #getToWindingSpec()
	 * @generated
	 */
	EReference getToWindingSpec_ShortCircuitTests();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel
	 * @generated
	 */
	EClass getAssetModel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Version</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getModelVersion()
	 * @see #getAssetModel()
	 * @generated
	 */
	EAttribute getAssetModel_ModelVersion();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getAssetInfo()
	 * @see #getAssetModel()
	 * @generated
	 */
	EReference getAssetModel_AssetInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getModelNumber <em>Model Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Number</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getModelNumber()
	 * @see #getAssetModel()
	 * @generated
	 */
	EAttribute getAssetModel_ModelNumber();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Model Catalogue Items</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getAssetModelCatalogueItems()
	 * @see #getAssetModel()
	 * @generated
	 */
	EReference getAssetModel_AssetModelCatalogueItems();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getTypeAsset()
	 * @see #getAssetModel()
	 * @generated
	 */
	EReference getAssetModel_TypeAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Standard Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getCorporateStandardKind()
	 * @see #getAssetModel()
	 * @generated
	 */
	EAttribute getAssetModel_CorporateStandardKind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Inventory Counts</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getErpInventoryCounts()
	 * @see #getAssetModel()
	 * @generated
	 */
	EReference getAssetModel_ErpInventoryCounts();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getUsageKind <em>Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getUsageKind()
	 * @see #getAssetModel()
	 * @generated
	 */
	EAttribute getAssetModel_UsageKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getWeightTotal <em>Weight Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Total</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getWeightTotal()
	 * @see #getAssetModel()
	 * @generated
	 */
	EAttribute getAssetModel_WeightTotal();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo <em>Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo
	 * @generated
	 */
	EClass getCableInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheath As Neutral</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#isSheathAsNeutral()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_SheathAsNeutral();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strand Fill</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#isIsStrandFill()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_IsStrandFill();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Jacket Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getOuterJacketKind()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_OuterJacketKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getConstructionKind()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_ConstructionKind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Screen</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverScreen()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_DiameterOverScreen();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Temperature</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getNominalTemperature()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_NominalTemperature();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Jacket</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverJacket()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_DiameterOverJacket();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Core</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverCore()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_DiameterOverCore();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Insulation</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_DiameterOverInsulation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shield Material</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getShieldMaterial()
	 * @see #getCableInfo()
	 * @generated
	 */
	EAttribute getCableInfo_ShieldMaterial();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct Bank Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDuctBankInfo()
	 * @see #getCableInfo()
	 * @generated
	 */
	EReference getCableInfo_DuctBankInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest <em>Open Circuit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Circuit Test</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest
	 * @generated
	 */
	EClass getOpenCircuitTest();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLoss <em>No Load Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Load Loss</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLoss()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	EAttribute getOpenCircuitTest_NoLoadLoss();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrent <em>Exciting Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exciting Current</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrent()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	EAttribute getOpenCircuitTest_ExcitingCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exciting Current Zero</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrentZero()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	EAttribute getOpenCircuitTest_ExcitingCurrentZero();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getMeasuredWindingSpecs <em>Measured Winding Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measured Winding Specs</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getMeasuredWindingSpecs()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	EReference getOpenCircuitTest_MeasuredWindingSpecs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLossZero <em>No Load Loss Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Load Loss Zero</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLossZero()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	EAttribute getOpenCircuitTest_NoLoadLossZero();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest <em>Distribution Winding Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Winding Test</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest
	 * @generated
	 */
	EClass getDistributionWindingTest();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest#getFromWinding <em>From Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Winding</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest#getFromWinding()
	 * @see #getDistributionWindingTest()
	 * @generated
	 */
	EReference getDistributionWindingTest_FromWinding();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest#getFromTapStep <em>From Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Tap Step</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest#getFromTapStep()
	 * @see #getDistributionWindingTest()
	 * @generated
	 */
	EAttribute getDistributionWindingTest_FromTapStep();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest <em>Short Circuit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Circuit Test</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest
	 * @generated
	 */
	EClass getShortCircuitTest();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLoss <em>Load Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Loss</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLoss()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	EAttribute getShortCircuitTest_LoadLoss();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLossZero <em>Load Loss Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Loss Zero</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLossZero()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	EAttribute getShortCircuitTest_LoadLossZero();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Impedance</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	EAttribute getShortCircuitTest_LeakageImpedance();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getShortedWindingSpecs <em>Shorted Winding Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shorted Winding Specs</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getShortedWindingSpecs()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	EReference getShortCircuitTest_ShortedWindingSpecs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Impedance Zero</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	EAttribute getShortCircuitTest_LeakageImpedanceZero();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel <em>End Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Model</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel
	 * @generated
	 */
	EClass getEndDeviceModel();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel#getEndDeviceAssets()
	 * @see #getEndDeviceModel()
	 * @generated
	 */
	EReference getEndDeviceModel_EndDeviceAssets();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TransformerInfo
	 * @generated
	 */
	EClass getTransformerInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformers</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformers()
	 * @see #getTransformerInfo()
	 * @generated
	 */
	EReference getTransformerInfo_Transformers();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getWindingInfos <em>Winding Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winding Infos</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getWindingInfos()
	 * @see #getTransformerInfo()
	 * @generated
	 */
	EReference getTransformerInfo_WindingInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssetModels <em>Transformer Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Asset Models</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssetModels()
	 * @see #getTransformerInfo()
	 * @generated
	 */
	EReference getTransformerInfo_TransformerAssetModels();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssets()
	 * @see #getTransformerInfo()
	 * @generated
	 */
	EReference getTransformerInfo_TransformerAssets();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement <em>Wire Arrangement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Arrangement</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement
	 * @generated
	 */
	EClass getWireArrangement();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wire Type</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getWireType()
	 * @see #getWireArrangement()
	 * @generated
	 */
	EReference getWireArrangement_WireType();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getConductorInfo()
	 * @see #getWireArrangement()
	 * @generated
	 */
	EReference getWireArrangement_ConductorInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mounting Point X</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getMountingPointX()
	 * @see #getWireArrangement()
	 * @generated
	 */
	EAttribute getWireArrangement_MountingPointX();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mounting Point Y</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getMountingPointY()
	 * @see #getWireArrangement()
	 * @generated
	 */
	EAttribute getWireArrangement_MountingPointY();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getPosition()
	 * @see #getWireArrangement()
	 * @generated
	 */
	EAttribute getWireArrangement_Position();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo <em>Tape Shield Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tape Shield Cable Info</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo
	 * @generated
	 */
	EClass getTapeShieldCableInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tape Lap</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap()
	 * @see #getTapeShieldCableInfo()
	 * @generated
	 */
	EAttribute getTapeShieldCableInfo_TapeLap();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tape Thickness</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness()
	 * @see #getTapeShieldCableInfo()
	 * @generated
	 */
	EAttribute getTapeShieldCableInfo_TapeThickness();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind <em>Conductor Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conductor Material Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind
	 * @generated
	 */
	EEnum getConductorMaterialKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.CorporateStandardKind <em>Corporate Standard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Corporate Standard Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CorporateStandardKind
	 * @generated
	 */
	EEnum getCorporateStandardKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModelUsageKind <em>Asset Model Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Model Usage Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelUsageKind
	 * @generated
	 */
	EEnum getAssetModelUsageKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind <em>Cable Outer Jacket Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Outer Jacket Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind
	 * @generated
	 */
	EEnum getCableOuterJacketKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind <em>Conductor Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conductor Usage Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind
	 * @generated
	 */
	EEnum getConductorUsageKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind <em>Cable Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Construction Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind
	 * @generated
	 */
	EEnum getCableConstructionKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind <em>Conductor Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conductor Insulation Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind
	 * @generated
	 */
	EEnum getConductorInsulationKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind <em>Cable Shield Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Shield Material Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind
	 * @generated
	 */
	EEnum getCableShieldMaterialKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssetModelsFactory getAssetModelsFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl <em>Conductor Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorInfo()
		 * @generated
		 */
		EClass CONDUCTOR_INFO = eINSTANCE.getConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Conductor Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR_INFO__CONDUCTOR_SEGMENTS = eINSTANCE.getConductorInfo_ConductorSegments();

		/**
		 * The meta object literal for the '<em><b>Phase Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR_INFO__PHASE_COUNT = eINSTANCE.getConductorInfo_PhaseCount();

		/**
		 * The meta object literal for the '<em><b>Insulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR_INFO__INSULATED = eINSTANCE.getConductorInfo_Insulated();

		/**
		 * The meta object literal for the '<em><b>Insulation Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR_INFO__INSULATION_THICKNESS = eINSTANCE.getConductorInfo_InsulationThickness();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR_INFO__USAGE = eINSTANCE.getConductorInfo_Usage();

		/**
		 * The meta object literal for the '<em><b>Wire Arrangements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR_INFO__WIRE_ARRANGEMENTS = eINSTANCE.getConductorInfo_WireArrangements();

		/**
		 * The meta object literal for the '<em><b>Insulation Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR_INFO__INSULATION_MATERIAL = eINSTANCE.getConductorInfo_InsulationMaterial();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.WireTypeImpl <em>Wire Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.WireTypeImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getWireType()
		 * @generated
		 */
		EClass WIRE_TYPE = eINSTANCE.getWireType();

		/**
		 * The meta object literal for the '<em><b>RAC75</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__RAC75 = eINSTANCE.getWireType_RAC75();

		/**
		 * The meta object literal for the '<em><b>RAC50</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__RAC50 = eINSTANCE.getWireType_RAC50();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__RADIUS = eINSTANCE.getWireType_Radius();

		/**
		 * The meta object literal for the '<em><b>Concentric Neutral Cable Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS = eINSTANCE.getWireType_ConcentricNeutralCableInfos();

		/**
		 * The meta object literal for the '<em><b>Strand Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__STRAND_COUNT = eINSTANCE.getWireType_StrandCount();

		/**
		 * The meta object literal for the '<em><b>Core Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__CORE_RADIUS = eINSTANCE.getWireType_CoreRadius();

		/**
		 * The meta object literal for the '<em><b>RAC25</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__RAC25 = eINSTANCE.getWireType_RAC25();

		/**
		 * The meta object literal for the '<em><b>RDC20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__RDC20 = eINSTANCE.getWireType_RDC20();

		/**
		 * The meta object literal for the '<em><b>Size Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__SIZE_DESCRIPTION = eINSTANCE.getWireType_SizeDescription();

		/**
		 * The meta object literal for the '<em><b>Core Strand Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__CORE_STRAND_COUNT = eINSTANCE.getWireType_CoreStrandCount();

		/**
		 * The meta object literal for the '<em><b>Wire Arrangements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE_TYPE__WIRE_ARRANGEMENTS = eINSTANCE.getWireType_WireArrangements();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__RATED_CURRENT = eINSTANCE.getWireType_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Gmr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__GMR = eINSTANCE.getWireType_Gmr();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__MATERIAL = eINSTANCE.getWireType_Material();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl <em>Concentric Neutral Cable Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConcentricNeutralCableInfo()
		 * @generated
		 */
		EClass CONCENTRIC_NEUTRAL_CABLE_INFO = eINSTANCE.getConcentricNeutralCableInfo();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Neutral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL = eINSTANCE.getConcentricNeutralCableInfo_DiameterOverNeutral();

		/**
		 * The meta object literal for the '<em><b>Neutral Strand Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT = eINSTANCE.getConcentricNeutralCableInfo_NeutralStrandCount();

		/**
		 * The meta object literal for the '<em><b>Wire Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE = eINSTANCE.getConcentricNeutralCableInfo_WireType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl <em>Winding Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getWindingInfo()
		 * @generated
		 */
		EClass WINDING_INFO = eINSTANCE.getWindingInfo();

		/**
		 * The meta object literal for the '<em><b>Emergency S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__EMERGENCY_S = eINSTANCE.getWindingInfo_EmergencyS();

		/**
		 * The meta object literal for the '<em><b>Phase Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__PHASE_ANGLE = eINSTANCE.getWindingInfo_PhaseAngle();

		/**
		 * The meta object literal for the '<em><b>Winding Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_INFO__WINDING_TESTS = eINSTANCE.getWindingInfo_WindingTests();

		/**
		 * The meta object literal for the '<em><b>Windings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_INFO__WINDINGS = eINSTANCE.getWindingInfo_Windings();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__RATED_S = eINSTANCE.getWindingInfo_RatedS();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__RATED_U = eINSTANCE.getWindingInfo_RatedU();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__R = eINSTANCE.getWindingInfo_R();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__SEQUENCE_NUMBER = eINSTANCE.getWindingInfo_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Short Term S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__SHORT_TERM_S = eINSTANCE.getWindingInfo_ShortTermS();

		/**
		 * The meta object literal for the '<em><b>To Winding Specs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_INFO__TO_WINDING_SPECS = eINSTANCE.getWindingInfo_ToWindingSpecs();

		/**
		 * The meta object literal for the '<em><b>Connection Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__CONNECTION_KIND = eINSTANCE.getWindingInfo_ConnectionKind();

		/**
		 * The meta object literal for the '<em><b>Insulation U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDING_INFO__INSULATION_U = eINSTANCE.getWindingInfo_InsulationU();

		/**
		 * The meta object literal for the '<em><b>Transformer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDING_INFO__TRANSFORMER_INFO = eINSTANCE.getWindingInfo_TransformerInfo();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl <em>Overhead Conductor Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getOverheadConductorInfo()
		 * @generated
		 */
		EClass OVERHEAD_CONDUCTOR_INFO = eINSTANCE.getOverheadConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Neutral Insulation Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS = eINSTANCE.getOverheadConductorInfo_NeutralInsulationThickness();

		/**
		 * The meta object literal for the '<em><b>Phase Conductor Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING = eINSTANCE.getOverheadConductorInfo_PhaseConductorSpacing();

		/**
		 * The meta object literal for the '<em><b>Phase Conductor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT = eINSTANCE.getOverheadConductorInfo_PhaseConductorCount();

		/**
		 * The meta object literal for the '<em><b>Mounting Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT = eINSTANCE.getOverheadConductorInfo_MountingPoint();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl <em>To Winding Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getToWindingSpec()
		 * @generated
		 */
		EClass TO_WINDING_SPEC = eINSTANCE.getToWindingSpec();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_WINDING_SPEC__VOLTAGE = eINSTANCE.getToWindingSpec_Voltage();

		/**
		 * The meta object literal for the '<em><b>Open Circuit Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS = eINSTANCE.getToWindingSpec_OpenCircuitTests();

		/**
		 * The meta object literal for the '<em><b>To Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_WINDING_SPEC__TO_WINDING = eINSTANCE.getToWindingSpec_ToWinding();

		/**
		 * The meta object literal for the '<em><b>To Tap Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_WINDING_SPEC__TO_TAP_STEP = eINSTANCE.getToWindingSpec_ToTapStep();

		/**
		 * The meta object literal for the '<em><b>Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_WINDING_SPEC__PHASE_SHIFT = eINSTANCE.getToWindingSpec_PhaseShift();

		/**
		 * The meta object literal for the '<em><b>Short Circuit Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS = eINSTANCE.getToWindingSpec_ShortCircuitTests();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelImpl <em>Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getAssetModel()
		 * @generated
		 */
		EClass ASSET_MODEL = eINSTANCE.getAssetModel();

		/**
		 * The meta object literal for the '<em><b>Model Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_MODEL__MODEL_VERSION = eINSTANCE.getAssetModel_ModelVersion();

		/**
		 * The meta object literal for the '<em><b>Asset Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL__ASSET_INFO = eINSTANCE.getAssetModel_AssetInfo();

		/**
		 * The meta object literal for the '<em><b>Model Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_MODEL__MODEL_NUMBER = eINSTANCE.getAssetModel_ModelNumber();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = eINSTANCE.getAssetModel_AssetModelCatalogueItems();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL__TYPE_ASSET = eINSTANCE.getAssetModel_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Corporate Standard Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_MODEL__CORPORATE_STANDARD_KIND = eINSTANCE.getAssetModel_CorporateStandardKind();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory Counts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_MODEL__ERP_INVENTORY_COUNTS = eINSTANCE.getAssetModel_ErpInventoryCounts();

		/**
		 * The meta object literal for the '<em><b>Usage Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_MODEL__USAGE_KIND = eINSTANCE.getAssetModel_UsageKind();

		/**
		 * The meta object literal for the '<em><b>Weight Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_MODEL__WEIGHT_TOTAL = eINSTANCE.getAssetModel_WeightTotal();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.CableInfoImpl <em>Cable Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.CableInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableInfo()
		 * @generated
		 */
		EClass CABLE_INFO = eINSTANCE.getCableInfo();

		/**
		 * The meta object literal for the '<em><b>Sheath As Neutral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__SHEATH_AS_NEUTRAL = eINSTANCE.getCableInfo_SheathAsNeutral();

		/**
		 * The meta object literal for the '<em><b>Is Strand Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__IS_STRAND_FILL = eINSTANCE.getCableInfo_IsStrandFill();

		/**
		 * The meta object literal for the '<em><b>Outer Jacket Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__OUTER_JACKET_KIND = eINSTANCE.getCableInfo_OuterJacketKind();

		/**
		 * The meta object literal for the '<em><b>Construction Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__CONSTRUCTION_KIND = eINSTANCE.getCableInfo_ConstructionKind();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__DIAMETER_OVER_SCREEN = eINSTANCE.getCableInfo_DiameterOverScreen();

		/**
		 * The meta object literal for the '<em><b>Nominal Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__NOMINAL_TEMPERATURE = eINSTANCE.getCableInfo_NominalTemperature();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Jacket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__DIAMETER_OVER_JACKET = eINSTANCE.getCableInfo_DiameterOverJacket();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Core</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__DIAMETER_OVER_CORE = eINSTANCE.getCableInfo_DiameterOverCore();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Insulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__DIAMETER_OVER_INSULATION = eINSTANCE.getCableInfo_DiameterOverInsulation();

		/**
		 * The meta object literal for the '<em><b>Shield Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_INFO__SHIELD_MATERIAL = eINSTANCE.getCableInfo_ShieldMaterial();

		/**
		 * The meta object literal for the '<em><b>Duct Bank Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE_INFO__DUCT_BANK_INFO = eINSTANCE.getCableInfo_DuctBankInfo();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl <em>Open Circuit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getOpenCircuitTest()
		 * @generated
		 */
		EClass OPEN_CIRCUIT_TEST = eINSTANCE.getOpenCircuitTest();

		/**
		 * The meta object literal for the '<em><b>No Load Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_CIRCUIT_TEST__NO_LOAD_LOSS = eINSTANCE.getOpenCircuitTest_NoLoadLoss();

		/**
		 * The meta object literal for the '<em><b>Exciting Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_CIRCUIT_TEST__EXCITING_CURRENT = eINSTANCE.getOpenCircuitTest_ExcitingCurrent();

		/**
		 * The meta object literal for the '<em><b>Exciting Current Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO = eINSTANCE.getOpenCircuitTest_ExcitingCurrentZero();

		/**
		 * The meta object literal for the '<em><b>Measured Winding Specs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS = eINSTANCE.getOpenCircuitTest_MeasuredWindingSpecs();

		/**
		 * The meta object literal for the '<em><b>No Load Loss Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO = eINSTANCE.getOpenCircuitTest_NoLoadLossZero();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.DistributionWindingTestImpl <em>Distribution Winding Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.DistributionWindingTestImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getDistributionWindingTest()
		 * @generated
		 */
		EClass DISTRIBUTION_WINDING_TEST = eINSTANCE.getDistributionWindingTest();

		/**
		 * The meta object literal for the '<em><b>From Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_WINDING_TEST__FROM_WINDING = eINSTANCE.getDistributionWindingTest_FromWinding();

		/**
		 * The meta object literal for the '<em><b>From Tap Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP = eINSTANCE.getDistributionWindingTest_FromTapStep();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl <em>Short Circuit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getShortCircuitTest()
		 * @generated
		 */
		EClass SHORT_CIRCUIT_TEST = eINSTANCE.getShortCircuitTest();

		/**
		 * The meta object literal for the '<em><b>Load Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_CIRCUIT_TEST__LOAD_LOSS = eINSTANCE.getShortCircuitTest_LoadLoss();

		/**
		 * The meta object literal for the '<em><b>Load Loss Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO = eINSTANCE.getShortCircuitTest_LoadLossZero();

		/**
		 * The meta object literal for the '<em><b>Leakage Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE = eINSTANCE.getShortCircuitTest_LeakageImpedance();

		/**
		 * The meta object literal for the '<em><b>Shorted Winding Specs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS = eINSTANCE.getShortCircuitTest_ShortedWindingSpecs();

		/**
		 * The meta object literal for the '<em><b>Leakage Impedance Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO = eINSTANCE.getShortCircuitTest_LeakageImpedanceZero();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.EndDeviceModelImpl <em>End Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.EndDeviceModelImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getEndDeviceModel()
		 * @generated
		 */
		EClass END_DEVICE_MODEL = eINSTANCE.getEndDeviceModel();

		/**
		 * The meta object literal for the '<em><b>End Device Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_MODEL__END_DEVICE_ASSETS = eINSTANCE.getEndDeviceModel_EndDeviceAssets();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl <em>Transformer Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getTransformerInfo()
		 * @generated
		 */
		EClass TRANSFORMER_INFO = eINSTANCE.getTransformerInfo();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_INFO__TRANSFORMERS = eINSTANCE.getTransformerInfo_Transformers();

		/**
		 * The meta object literal for the '<em><b>Winding Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_INFO__WINDING_INFOS = eINSTANCE.getTransformerInfo_WindingInfos();

		/**
		 * The meta object literal for the '<em><b>Transformer Asset Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS = eINSTANCE.getTransformerInfo_TransformerAssetModels();

		/**
		 * The meta object literal for the '<em><b>Transformer Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_INFO__TRANSFORMER_ASSETS = eINSTANCE.getTransformerInfo_TransformerAssets();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.WireArrangementImpl <em>Wire Arrangement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.WireArrangementImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getWireArrangement()
		 * @generated
		 */
		EClass WIRE_ARRANGEMENT = eINSTANCE.getWireArrangement();

		/**
		 * The meta object literal for the '<em><b>Wire Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE_ARRANGEMENT__WIRE_TYPE = eINSTANCE.getWireArrangement_WireType();

		/**
		 * The meta object literal for the '<em><b>Conductor Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE_ARRANGEMENT__CONDUCTOR_INFO = eINSTANCE.getWireArrangement_ConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Mounting Point X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_ARRANGEMENT__MOUNTING_POINT_X = eINSTANCE.getWireArrangement_MountingPointX();

		/**
		 * The meta object literal for the '<em><b>Mounting Point Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_ARRANGEMENT__MOUNTING_POINT_Y = eINSTANCE.getWireArrangement_MountingPointY();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_ARRANGEMENT__POSITION = eINSTANCE.getWireArrangement_Position();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.impl.TapeShieldCableInfoImpl <em>Tape Shield Cable Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.TapeShieldCableInfoImpl
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getTapeShieldCableInfo()
		 * @generated
		 */
		EClass TAPE_SHIELD_CABLE_INFO = eINSTANCE.getTapeShieldCableInfo();

		/**
		 * The meta object literal for the '<em><b>Tape Lap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAPE_SHIELD_CABLE_INFO__TAPE_LAP = eINSTANCE.getTapeShieldCableInfo_TapeLap();

		/**
		 * The meta object literal for the '<em><b>Tape Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS = eINSTANCE.getTapeShieldCableInfo_TapeThickness();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind <em>Conductor Material Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorMaterialKind()
		 * @generated
		 */
		EEnum CONDUCTOR_MATERIAL_KIND = eINSTANCE.getConductorMaterialKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.CorporateStandardKind <em>Corporate Standard Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.CorporateStandardKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCorporateStandardKind()
		 * @generated
		 */
		EEnum CORPORATE_STANDARD_KIND = eINSTANCE.getCorporateStandardKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModelUsageKind <em>Asset Model Usage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelUsageKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getAssetModelUsageKind()
		 * @generated
		 */
		EEnum ASSET_MODEL_USAGE_KIND = eINSTANCE.getAssetModelUsageKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind <em>Cable Outer Jacket Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableOuterJacketKind()
		 * @generated
		 */
		EEnum CABLE_OUTER_JACKET_KIND = eINSTANCE.getCableOuterJacketKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind <em>Conductor Usage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorUsageKind()
		 * @generated
		 */
		EEnum CONDUCTOR_USAGE_KIND = eINSTANCE.getConductorUsageKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind <em>Cable Construction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableConstructionKind()
		 * @generated
		 */
		EEnum CABLE_CONSTRUCTION_KIND = eINSTANCE.getCableConstructionKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind <em>Conductor Insulation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getConductorInsulationKind()
		 * @generated
		 */
		EEnum CONDUCTOR_INSULATION_KIND = eINSTANCE.getConductorInsulationKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind <em>Cable Shield Material Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind
		 * @see gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl#getCableShieldMaterialKind()
		 * @generated
		 */
		EEnum CABLE_SHIELD_MATERIAL_KIND = eINSTANCE.getCableShieldMaterialKind();

	}

} //AssetModelsPackage
