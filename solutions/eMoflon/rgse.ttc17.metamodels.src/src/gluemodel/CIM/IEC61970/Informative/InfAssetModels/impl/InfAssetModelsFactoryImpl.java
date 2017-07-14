/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.*;

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
public class InfAssetModelsFactoryImpl extends EFactoryImpl implements InfAssetModelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfAssetModelsFactory init() {
		try {
			InfAssetModelsFactory theInfAssetModelsFactory = (InfAssetModelsFactory)EPackage.Registry.INSTANCE.getEFactory(InfAssetModelsPackage.eNS_URI);
			if (theInfAssetModelsFactory != null) {
				return theInfAssetModelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfAssetModelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetModelsFactoryImpl() {
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
			case InfAssetModelsPackage.METER_ASSET_MODEL: return createMeterAssetModel();
			case InfAssetModelsPackage.ELECTRICAL_ASSET_MODEL: return createElectricalAssetModel();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL: return createTapChangerAssetModel();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE: return createAssetModelCatalogue();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL: return createTransformerAssetModel();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM: return createAssetModelCatalogueItem();
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
			case InfAssetModelsPackage.TRANSFORMER_CONSTRUCTION_KIND:
				return createTransformerConstructionKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.WINDING_INSULATION_KIND:
				return createWindingInsulationKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.OIL_PRESERVATION_KIND:
				return createOilPreservationKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.TAP_CHANGER_SWITCHING_KIND:
				return createTapChangerSwitchingKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.CABLE_SHIELD_KIND:
				return createCableShieldKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.TRANSFORMER_FUNCTION_KIND:
				return createTransformerFunctionKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.TRANSFORMER_CORE_KIND:
				return createTransformerCoreKindFromString(eDataType, initialValue);
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
			case InfAssetModelsPackage.TRANSFORMER_CONSTRUCTION_KIND:
				return convertTransformerConstructionKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.WINDING_INSULATION_KIND:
				return convertWindingInsulationKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.OIL_PRESERVATION_KIND:
				return convertOilPreservationKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.TAP_CHANGER_SWITCHING_KIND:
				return convertTapChangerSwitchingKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.CABLE_SHIELD_KIND:
				return convertCableShieldKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.TRANSFORMER_FUNCTION_KIND:
				return convertTransformerFunctionKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.TRANSFORMER_CORE_KIND:
				return convertTransformerCoreKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetModel createMeterAssetModel() {
		MeterAssetModelImpl meterAssetModel = new MeterAssetModelImpl();
		return meterAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalAssetModel createElectricalAssetModel() {
		ElectricalAssetModelImpl electricalAssetModel = new ElectricalAssetModelImpl();
		return electricalAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerAssetModel createTapChangerAssetModel() {
		TapChangerAssetModelImpl tapChangerAssetModel = new TapChangerAssetModelImpl();
		return tapChangerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogue createAssetModelCatalogue() {
		AssetModelCatalogueImpl assetModelCatalogue = new AssetModelCatalogueImpl();
		return assetModelCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAssetModel createTransformerAssetModel() {
		TransformerAssetModelImpl transformerAssetModel = new TransformerAssetModelImpl();
		return transformerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogueItem createAssetModelCatalogueItem() {
		AssetModelCatalogueItemImpl assetModelCatalogueItem = new AssetModelCatalogueItemImpl();
		return assetModelCatalogueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerConstructionKind createTransformerConstructionKindFromString(EDataType eDataType, String initialValue) {
		TransformerConstructionKind result = TransformerConstructionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerConstructionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInsulationKind createWindingInsulationKindFromString(EDataType eDataType, String initialValue) {
		WindingInsulationKind result = WindingInsulationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingInsulationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OilPreservationKind createOilPreservationKindFromString(EDataType eDataType, String initialValue) {
		OilPreservationKind result = OilPreservationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOilPreservationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerSwitchingKind createTapChangerSwitchingKindFromString(EDataType eDataType, String initialValue) {
		TapChangerSwitchingKind result = TapChangerSwitchingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTapChangerSwitchingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableShieldKind createCableShieldKindFromString(EDataType eDataType, String initialValue) {
		CableShieldKind result = CableShieldKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableShieldKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerFunctionKind createTransformerFunctionKindFromString(EDataType eDataType, String initialValue) {
		TransformerFunctionKind result = TransformerFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerCoreKind createTransformerCoreKindFromString(EDataType eDataType, String initialValue) {
		TransformerCoreKind result = TransformerCoreKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerCoreKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetModelsPackage getInfAssetModelsPackage() {
		return (InfAssetModelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfAssetModelsPackage getPackage() {
		return InfAssetModelsPackage.eINSTANCE;
	}

} //InfAssetModelsFactoryImpl
