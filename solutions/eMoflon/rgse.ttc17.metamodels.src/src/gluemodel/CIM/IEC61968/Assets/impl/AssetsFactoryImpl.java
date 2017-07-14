/**
 */
package gluemodel.CIM.IEC61968.Assets.impl;

import gluemodel.CIM.IEC61968.Assets.*;

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
public class AssetsFactoryImpl extends EFactoryImpl implements AssetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssetsFactory init() {
		try {
			AssetsFactory theAssetsFactory = (AssetsFactory)EPackage.Registry.INSTANCE.getEFactory(AssetsPackage.eNS_URI);
			if (theAssetsFactory != null) {
				return theAssetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsFactoryImpl() {
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
			case AssetsPackage.ACCEPTANCE_TEST: return createAcceptanceTest();
			case AssetsPackage.SEAL: return createSeal();
			case AssetsPackage.COM_MEDIA_ASSET: return createComMediaAsset();
			case AssetsPackage.ASSET_FUNCTION: return createAssetFunction();
			case AssetsPackage.ASSET: return createAsset();
			case AssetsPackage.ASSET_CONTAINER: return createAssetContainer();
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
			case AssetsPackage.SEAL_CONDITION_KIND:
				return createSealConditionKindFromString(eDataType, initialValue);
			case AssetsPackage.SEAL_KIND:
				return createSealKindFromString(eDataType, initialValue);
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
			case AssetsPackage.SEAL_CONDITION_KIND:
				return convertSealConditionKindToString(eDataType, instanceValue);
			case AssetsPackage.SEAL_KIND:
				return convertSealKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest createAcceptanceTest() {
		AcceptanceTestImpl acceptanceTest = new AcceptanceTestImpl();
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seal createSeal() {
		SealImpl seal = new SealImpl();
		return seal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComMediaAsset createComMediaAsset() {
		ComMediaAssetImpl comMediaAsset = new ComMediaAssetImpl();
		return comMediaAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetFunction createAssetFunction() {
		AssetFunctionImpl assetFunction = new AssetFunctionImpl();
		return assetFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer createAssetContainer() {
		AssetContainerImpl assetContainer = new AssetContainerImpl();
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealConditionKind createSealConditionKindFromString(EDataType eDataType, String initialValue) {
		SealConditionKind result = SealConditionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSealConditionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealKind createSealKindFromString(EDataType eDataType, String initialValue) {
		SealKind result = SealKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSealKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsPackage getAssetsPackage() {
		return (AssetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssetsPackage getPackage() {
		return AssetsPackage.eINSTANCE;
	}

} //AssetsFactoryImpl
