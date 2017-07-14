/**
 */
package gluemodel.CIM.IEC61968.Assets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage
 * @generated
 */
public interface AssetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssetsFactory eINSTANCE = gluemodel.CIM.IEC61968.Assets.impl.AssetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Acceptance Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceptance Test</em>'.
	 * @generated
	 */
	AcceptanceTest createAcceptanceTest();

	/**
	 * Returns a new object of class '<em>Seal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seal</em>'.
	 * @generated
	 */
	Seal createSeal();

	/**
	 * Returns a new object of class '<em>Com Media Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Media Asset</em>'.
	 * @generated
	 */
	ComMediaAsset createComMediaAsset();

	/**
	 * Returns a new object of class '<em>Asset Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Function</em>'.
	 * @generated
	 */
	AssetFunction createAssetFunction();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>Asset Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Container</em>'.
	 * @generated
	 */
	AssetContainer createAssetContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssetsPackage getAssetsPackage();

} //AssetsFactory
