/**
 */
package gluemodel.impl;

import gluemodel.*;

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
public class GluemodelFactoryImpl extends EFactoryImpl implements GluemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GluemodelFactory init() {
		try {
			GluemodelFactory theGluemodelFactory = (GluemodelFactory)EPackage.Registry.INSTANCE.getEFactory(GluemodelPackage.eNS_URI);
			if (theGluemodelFactory != null) {
				return theGluemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GluemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluemodelFactoryImpl() {
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
			case GluemodelPackage.ROOT: return createRoot();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR: return createMeterAssetMMXUPair();
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR: return createMeterAssetPhysicalDevicePair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetMMXUPair createMeterAssetMMXUPair() {
		MeterAssetMMXUPairImpl meterAssetMMXUPair = new MeterAssetMMXUPairImpl();
		return meterAssetMMXUPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetPhysicalDevicePair createMeterAssetPhysicalDevicePair() {
		MeterAssetPhysicalDevicePairImpl meterAssetPhysicalDevicePair = new MeterAssetPhysicalDevicePairImpl();
		return meterAssetPhysicalDevicePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluemodelPackage getGluemodelPackage() {
		return (GluemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GluemodelPackage getPackage() {
		return GluemodelPackage.eINSTANCE;
	}

} //GluemodelFactoryImpl
