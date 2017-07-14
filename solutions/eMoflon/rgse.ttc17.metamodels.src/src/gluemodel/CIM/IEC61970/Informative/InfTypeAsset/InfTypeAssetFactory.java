/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage
 * @generated
 */
public interface InfTypeAssetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfTypeAssetFactory eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Asset Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Asset Catalogue</em>'.
	 * @generated
	 */
	TypeAssetCatalogue createTypeAssetCatalogue();

	/**
	 * Returns a new object of class '<em>Electrical Type Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Type Asset</em>'.
	 * @generated
	 */
	ElectricalTypeAsset createElectricalTypeAsset();

	/**
	 * Returns a new object of class '<em>Type Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Asset</em>'.
	 * @generated
	 */
	TypeAsset createTypeAsset();

	/**
	 * Returns a new object of class '<em>Generator Type Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Type Asset</em>'.
	 * @generated
	 */
	GeneratorTypeAsset createGeneratorTypeAsset();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfTypeAssetPackage getInfTypeAssetPackage();

} //InfTypeAssetFactory
