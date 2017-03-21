/**
 */
package CIM.IEC61970.Informative.InfAssetModels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage
 * @generated
 */
public interface InfAssetModelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfAssetModelsFactory eINSTANCE = CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Meter Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Asset Model</em>'.
	 * @generated
	 */
	MeterAssetModel createMeterAssetModel();

	/**
	 * Returns a new object of class '<em>Electrical Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Asset Model</em>'.
	 * @generated
	 */
	ElectricalAssetModel createElectricalAssetModel();

	/**
	 * Returns a new object of class '<em>Tap Changer Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tap Changer Asset Model</em>'.
	 * @generated
	 */
	TapChangerAssetModel createTapChangerAssetModel();

	/**
	 * Returns a new object of class '<em>Asset Model Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Model Catalogue</em>'.
	 * @generated
	 */
	AssetModelCatalogue createAssetModelCatalogue();

	/**
	 * Returns a new object of class '<em>Transformer Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer Asset Model</em>'.
	 * @generated
	 */
	TransformerAssetModel createTransformerAssetModel();

	/**
	 * Returns a new object of class '<em>Asset Model Catalogue Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Model Catalogue Item</em>'.
	 * @generated
	 */
	AssetModelCatalogueItem createAssetModelCatalogueItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfAssetModelsPackage getInfAssetModelsPackage();

} //InfAssetModelsFactory
