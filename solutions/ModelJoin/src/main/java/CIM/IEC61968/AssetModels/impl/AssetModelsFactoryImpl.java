/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetModelsFactoryImpl extends EFactoryImpl implements AssetModelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssetModelsFactory init() {
		try {
			AssetModelsFactory theAssetModelsFactory = (AssetModelsFactory)EPackage.Registry.INSTANCE.getEFactory(AssetModelsPackage.eNS_URI);
			if (theAssetModelsFactory != null) {
				return theAssetModelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssetModelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssetModelsPackage.CONDUCTOR_INFO: return createConductorInfo();
			case AssetModelsPackage.WIRE_TYPE: return createWireType();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO: return createConcentricNeutralCableInfo();
			case AssetModelsPackage.WINDING_INFO: return createWindingInfo();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO: return createOverheadConductorInfo();
			case AssetModelsPackage.TO_WINDING_SPEC: return createToWindingSpec();
			case AssetModelsPackage.ASSET_MODEL: return createAssetModel();
			case AssetModelsPackage.CABLE_INFO: return createCableInfo();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST: return createOpenCircuitTest();
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST: return createDistributionWindingTest();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST: return createShortCircuitTest();
			case AssetModelsPackage.END_DEVICE_MODEL: return createEndDeviceModel();
			case AssetModelsPackage.TRANSFORMER_INFO: return createTransformerInfo();
			case AssetModelsPackage.WIRE_ARRANGEMENT: return createWireArrangement();
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO: return createTapeShieldCableInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AssetModelsPackage.CONDUCTOR_MATERIAL_KIND:
				return createConductorMaterialKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CORPORATE_STANDARD_KIND:
				return createCorporateStandardKindFromString(eDataType, initialValue);
			case AssetModelsPackage.ASSET_MODEL_USAGE_KIND:
				return createAssetModelUsageKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CABLE_OUTER_JACKET_KIND:
				return createCableOuterJacketKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CONDUCTOR_USAGE_KIND:
				return createConductorUsageKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CABLE_CONSTRUCTION_KIND:
				return createCableConstructionKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CONDUCTOR_INSULATION_KIND:
				return createConductorInsulationKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CABLE_SHIELD_MATERIAL_KIND:
				return createCableShieldMaterialKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AssetModelsPackage.CONDUCTOR_MATERIAL_KIND:
				return convertConductorMaterialKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CORPORATE_STANDARD_KIND:
				return convertCorporateStandardKindToString(eDataType, instanceValue);
			case AssetModelsPackage.ASSET_MODEL_USAGE_KIND:
				return convertAssetModelUsageKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CABLE_OUTER_JACKET_KIND:
				return convertCableOuterJacketKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CONDUCTOR_USAGE_KIND:
				return convertConductorUsageKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CABLE_CONSTRUCTION_KIND:
				return convertCableConstructionKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CONDUCTOR_INSULATION_KIND:
				return convertConductorInsulationKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CABLE_SHIELD_MATERIAL_KIND:
				return convertCableShieldMaterialKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo createConductorInfo() {
		ConductorInfoImpl conductorInfo = new ConductorInfoImpl();
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType createWireType() {
		WireTypeImpl wireType = new WireTypeImpl();
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcentricNeutralCableInfo createConcentricNeutralCableInfo() {
		ConcentricNeutralCableInfoImpl concentricNeutralCableInfo = new ConcentricNeutralCableInfoImpl();
		return concentricNeutralCableInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo createWindingInfo() {
		WindingInfoImpl windingInfo = new WindingInfoImpl();
		return windingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadConductorInfo createOverheadConductorInfo() {
		OverheadConductorInfoImpl overheadConductorInfo = new OverheadConductorInfoImpl();
		return overheadConductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToWindingSpec createToWindingSpec() {
		ToWindingSpecImpl toWindingSpec = new ToWindingSpecImpl();
		return toWindingSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModel createAssetModel() {
		AssetModelImpl assetModel = new AssetModelImpl();
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableInfo createCableInfo() {
		CableInfoImpl cableInfo = new CableInfoImpl();
		return cableInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenCircuitTest createOpenCircuitTest() {
		OpenCircuitTestImpl openCircuitTest = new OpenCircuitTestImpl();
		return openCircuitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionWindingTest createDistributionWindingTest() {
		DistributionWindingTestImpl distributionWindingTest = new DistributionWindingTestImpl();
		return distributionWindingTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortCircuitTest createShortCircuitTest() {
		ShortCircuitTestImpl shortCircuitTest = new ShortCircuitTestImpl();
		return shortCircuitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceModel createEndDeviceModel() {
		EndDeviceModelImpl endDeviceModel = new EndDeviceModelImpl();
		return endDeviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo createTransformerInfo() {
		TransformerInfoImpl transformerInfo = new TransformerInfoImpl();
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireArrangement createWireArrangement() {
		WireArrangementImpl wireArrangement = new WireArrangementImpl();
		return wireArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapeShieldCableInfo createTapeShieldCableInfo() {
		TapeShieldCableInfoImpl tapeShieldCableInfo = new TapeShieldCableInfoImpl();
		return tapeShieldCableInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorMaterialKind createConductorMaterialKindFromString(EDataType eDataType, String initialValue) {
		ConductorMaterialKind result = ConductorMaterialKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductorMaterialKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorporateStandardKind createCorporateStandardKindFromString(EDataType eDataType, String initialValue) {
		CorporateStandardKind result = CorporateStandardKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorporateStandardKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelUsageKind createAssetModelUsageKindFromString(EDataType eDataType, String initialValue) {
		AssetModelUsageKind result = AssetModelUsageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetModelUsageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableOuterJacketKind createCableOuterJacketKindFromString(EDataType eDataType, String initialValue) {
		CableOuterJacketKind result = CableOuterJacketKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableOuterJacketKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorUsageKind createConductorUsageKindFromString(EDataType eDataType, String initialValue) {
		ConductorUsageKind result = ConductorUsageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductorUsageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableConstructionKind createCableConstructionKindFromString(EDataType eDataType, String initialValue) {
		CableConstructionKind result = CableConstructionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableConstructionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInsulationKind createConductorInsulationKindFromString(EDataType eDataType, String initialValue) {
		ConductorInsulationKind result = ConductorInsulationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductorInsulationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableShieldMaterialKind createCableShieldMaterialKindFromString(EDataType eDataType, String initialValue) {
		CableShieldMaterialKind result = CableShieldMaterialKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableShieldMaterialKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsPackage getAssetModelsPackage() {
		return (AssetModelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssetModelsPackage getPackage() {
		return AssetModelsPackage.eINSTANCE;
	}

} //AssetModelsFactoryImpl
