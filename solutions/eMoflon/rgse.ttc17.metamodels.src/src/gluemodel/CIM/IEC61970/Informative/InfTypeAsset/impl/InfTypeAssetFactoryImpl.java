/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.*;

import org.eclipse.emf.ecore.EClass;
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
public class InfTypeAssetFactoryImpl extends EFactoryImpl implements InfTypeAssetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfTypeAssetFactory init() {
		try {
			InfTypeAssetFactory theInfTypeAssetFactory = (InfTypeAssetFactory)EPackage.Registry.INSTANCE.getEFactory(InfTypeAssetPackage.eNS_URI);
			if (theInfTypeAssetFactory != null) {
				return theInfTypeAssetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfTypeAssetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfTypeAssetFactoryImpl() {
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE: return createTypeAssetCatalogue();
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET: return createElectricalTypeAsset();
			case InfTypeAssetPackage.TYPE_ASSET: return createTypeAsset();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET: return createGeneratorTypeAsset();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssetCatalogue createTypeAssetCatalogue() {
		TypeAssetCatalogueImpl typeAssetCatalogue = new TypeAssetCatalogueImpl();
		return typeAssetCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalTypeAsset createElectricalTypeAsset() {
		ElectricalTypeAssetImpl electricalTypeAsset = new ElectricalTypeAssetImpl();
		return electricalTypeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset createTypeAsset() {
		TypeAssetImpl typeAsset = new TypeAssetImpl();
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTypeAsset createGeneratorTypeAsset() {
		GeneratorTypeAssetImpl generatorTypeAsset = new GeneratorTypeAssetImpl();
		return generatorTypeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfTypeAssetPackage getInfTypeAssetPackage() {
		return (InfTypeAssetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfTypeAssetPackage getPackage() {
		return InfTypeAssetPackage.eINSTANCE;
	}

} //InfTypeAssetFactoryImpl
